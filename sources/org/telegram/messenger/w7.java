package org.telegram.messenger;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.CountDownLatch;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class w7 extends c1 {
    public static Pattern I;
    public static volatile p5 J = new p5("fileUploadQueue");
    public static SparseArray K = null;
    public static final w7[] L = new w7[4];
    public static final q7 M = new Object();
    public final HashMap D;
    public qb E;
    public int F;
    public final ConcurrentHashMap G;
    public final r7 H;
    public int f26263a;
    public final lg.f[] f26264b;
    public final lg.f[] f26265c;
    public final f8 d;
    public final LinkedList f26266e;
    public final LinkedList f26267f;
    public final ConcurrentHashMap h;
    public final ConcurrentHashMap f26268n;
    public int f26269r;
    public int f26270s;
    public final ConcurrentHashMap f26271w;
    public final ConcurrentHashMap f26272x;
    public final HashMap f26273y;

    public w7(int i7) {
        super(i7);
        this.f26264b = new lg.f[5];
        this.f26265c = new lg.f[5];
        this.f26266e = new LinkedList();
        this.f26267f = new LinkedList();
        this.h = new ConcurrentHashMap();
        this.f26268n = new ConcurrentHashMap();
        this.f26269r = 0;
        this.f26270s = 0;
        this.f26271w = new ConcurrentHashMap();
        this.f26272x = new ConcurrentHashMap(10, 1.0f, 2);
        this.f26273y = new HashMap();
        this.D = new HashMap();
        this.E = null;
        this.G = new ConcurrentHashMap();
        this.H = new r7(this, 0);
        this.d = new f8(i7);
        int i10 = 0;
        while (true) {
            lg.f[] fVarArr = this.f26264b;
            if (i10 >= fVarArr.length) {
                break;
            }
            fVarArr[i10] = new lg.f(i7, 0, J);
            this.f26265c[i10] = new lg.f(i7, 1, J);
            i10++;
        }
        if (!r2.f25212a) {
            return;
        }
        J.a(this.H);
        J.d(this.H, 10000L);
    }

    public static String A(TLRPC.Document document) {
        String str;
        String B = B(document);
        int lastIndexOf = B.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str = B.substring(lastIndexOf + 1);
        } else {
            str = null;
        }
        if (str == null || str.length() == 0) {
            str = document.mime_type;
        }
        if (str == null) {
            str = "";
        }
        return str.toUpperCase();
    }

    public static String B(TLRPC.Document document) {
        String str = null;
        if (document == null) {
            return null;
        }
        String str2 = document.file_name_fixed;
        if (str2 != null) {
            return str2;
        }
        String str3 = document.file_name;
        if (str3 == null) {
            for (int i7 = 0; i7 < document.attributes.size(); i7++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i7);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeFilename) {
                    str = documentAttribute.file_name;
                }
            }
            str3 = str;
        }
        String q10 = q(str3);
        if (q10 != null) {
            return q10;
        }
        return "";
    }

    public static String C(String str) {
        if (str != null) {
            char c10 = 65535;
            switch (str.hashCode()) {
                case 187091926:
                    if (str.equals("audio/ogg")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 1331848029:
                    if (str.equals("video/mp4")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 2039520277:
                    if (str.equals("video/x-matroska")) {
                        c10 = 2;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                    return ".ogg";
                case 1:
                    return ".mp4";
                case 2:
                    return ".mkv";
                default:
                    return "";
            }
        }
        return "";
    }

    public static String D(File file) {
        String name = file.getName();
        try {
            return name.substring(name.lastIndexOf(46) + 1);
        } catch (Exception unused) {
            return "";
        }
    }

    public static e8 E(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.startsWith("sent_")) {
                if (I == null) {
                    I = Pattern.compile("sent_.*_([0-9]+)_([0-9]+)_([0-9]+)_([0-9]+)");
                }
                try {
                    Matcher matcher = I.matcher(str);
                    if (matcher.matches()) {
                        ?? obj2 = new Object();
                        obj2.f22197b = Integer.parseInt(matcher.group(1));
                        obj2.f22196a = Long.parseLong(matcher.group(2));
                        obj2.f22198c = Integer.parseInt(matcher.group(3));
                        obj2.d = Long.parseLong(matcher.group(4));
                        return obj2;
                    }
                    return null;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return null;
                }
            }
            return null;
        } else if (obj instanceof ij) {
            ij ijVar = (ij) obj;
            ?? obj3 = new Object();
            obj3.f22197b = ijVar.f1();
            obj3.f22196a = ij.B0(ijVar.f23262k);
            obj3.f22198c = ijVar.D;
            obj3.d = ijVar.T1();
            return obj3;
        } else if (obj instanceof TL_stories.StoryItem) {
            ?? obj4 = new Object();
            obj4.f22196a = ((TL_stories.StoryItem) obj).dialogId;
            obj4.f22198c = 23;
            return obj4;
        } else {
            return null;
        }
    }

    public static w7 G(int i7) {
        w7 w7Var;
        w7[] w7VarArr = L;
        w7 w7Var2 = w7VarArr[i7];
        if (w7Var2 == null) {
            synchronized (w7.class) {
                try {
                    w7Var = w7VarArr[i7];
                    if (w7Var == null) {
                        w7Var = new w7(i7);
                        w7VarArr[i7] = w7Var;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return w7Var;
        }
        return w7Var2;
    }

    public static String H(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf != -1) {
            return str.substring(lastIndexOf + 1);
        }
        return "";
    }

    public static File I(TLObject tLObject) {
        return J(tLObject, null, false, true);
    }

    public static java.io.File J(org.telegram.tgnet.TLObject r11, java.lang.String r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.w7.J(org.telegram.tgnet.TLObject, java.lang.String, boolean, boolean):java.io.File");
    }

    public static File K(TLObject tLObject, boolean z9) {
        return J(tLObject, null, z9, true);
    }

    public static File L(TLRPC.Message message) {
        return M(message, false, true);
    }

    public static File M(TLRPC.Message message, boolean z9, boolean z10) {
        TLRPC.PhotoSize w10;
        TLRPC.PhotoSize w11;
        TLRPC.PhotoSize w12;
        if (message == null) {
            return new File("");
        }
        boolean z11 = false;
        if (message instanceof TLRPC.TL_messageService) {
            TLRPC.Photo photo = message.action.photo;
            if (photo != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
                if (arrayList.size() > 0 && (w12 = w(arrayList, g0.Z0(false), false, null, false)) != null) {
                    return J(w12, null, z9, z10);
                }
            }
        } else if (ij.o1(message) instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.Document document = ij.o1(message).document;
            if (z9 || ij.o1(message).ttl_seconds != 0) {
                z11 = true;
            }
            return J(document, null, z11, z10);
        } else if (ij.o1(message) instanceof TLRPC.TL_messageMediaPhoto) {
            ArrayList<TLRPC.PhotoSize> arrayList2 = ij.o1(message).photo.sizes;
            if (arrayList2.size() > 0 && (w11 = w(arrayList2, g0.Z0(true), false, null, true)) != null) {
                if (z9 || ij.o1(message).ttl_seconds != 0) {
                    z11 = true;
                }
                return J(w11, null, z11, z10);
            }
        } else if (ij.o1(message) instanceof TLRPC.TL_messageMediaWebPage) {
            if (ij.o1(message).webpage.document != null) {
                return J(ij.o1(message).webpage.document, null, z9, z10);
            }
            if (ij.o1(message).webpage.photo != null) {
                ArrayList<TLRPC.PhotoSize> arrayList3 = ij.o1(message).webpage.photo.sizes;
                if (arrayList3.size() > 0 && (w10 = w(arrayList3, g0.Z0(false), false, null, false)) != null) {
                    return J(w10, null, z9, z10);
                }
            }
        } else if (ij.o1(message) instanceof TLRPC.TL_messageMediaInvoice) {
            return J(((TLRPC.TL_messageMediaInvoice) ij.o1(message)).photo, null, true, z10);
        }
        return new File("");
    }

    public static File N(TLRPC.Message message) {
        return M(message, false, true);
    }

    public static TLRPC.TL_photoStrippedSize Q(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) arrayList.get(i7);
            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                return (TLRPC.TL_photoStrippedSize) photoSize;
            }
        }
        return null;
    }

    public static TLRPC.VideoSize R(TLRPC.Photo photo) {
        if (photo != null && photo.video_sizes != null) {
            for (int i7 = 0; i7 < photo.video_sizes.size(); i7++) {
                TLRPC.VideoSize videoSize = photo.video_sizes.get(i7);
                if ((videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) || (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                    return videoSize;
                }
            }
        }
        return null;
    }

    public static boolean U(TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, TLRPC.Photo photo) {
        if (tL_fileLocationToBeDeprecated != null && (photo instanceof TLRPC.TL_photo)) {
            int size = photo.sizes.size();
            for (int i7 = 0; i7 < size; i7++) {
                TLRPC.FileLocation fileLocation = photo.sizes.get(i7).location;
                if (fileLocation != null && fileLocation.local_id == tL_fileLocationToBeDeprecated.local_id && fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                    return true;
                }
            }
            if ((-tL_fileLocationToBeDeprecated.volume_id) == photo.f26980id) {
                return true;
            }
        }
        return false;
    }

    public static void a(CountDownLatch countDownLatch, boolean z9) {
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            a8.g(e10, false);
            if (z9) {
                a(countDownLatch, false);
            }
        }
    }

    public static File j(int i7) {
        return (File) K.get(i7);
    }

    public static boolean m(int i7, long j3) {
        boolean q10 = p10.i(c.a(i7).f21765a).q();
        if (j3 >= 2097152000) {
            if (j3 >= 4194304000L || !q10) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void o(GZIPInputStream gZIPInputStream, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bArr = new byte[4096];
        int i7 = 0;
        do {
            int read = gZIPInputStream.read(bArr);
            if (read <= 0) {
                break;
            }
            Thread.yield();
            fileOutputStream.write(bArr, 0, read);
            i7 += read;
        } while (i7 < 2097152);
        fileOutputStream.getFD().sync();
        fileOutputStream.close();
    }

    public static void p(int i7, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        J.c(new x0(arrayList, i7, 1));
    }

    public static String q(String str) {
        if (str != null) {
            return str.replaceAll("[\u0001-\u001f<>\u202e:\"/\\\\|?*\u007f]+", "").trim();
        }
        return str;
    }

    public static String r(String str, TLObject tLObject) {
        String str2 = "";
        if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            String B = B(document);
            int lastIndexOf = B.lastIndexOf(46);
            if (lastIndexOf != -1) {
                str2 = B.substring(lastIndexOf);
            }
            if (str2.length() <= 1) {
                str2 = C(document.mime_type);
            }
            if (str2.length() > 1) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(document.dc_id);
                sb2.append("_");
                return a8.p0.r(sb2, document.f26962id, str2);
            }
            return document.dc_id + "_" + document.f26962id;
        } else if (tLObject instanceof ew) {
            TLRPC.TL_secureFile tL_secureFile = ((ew) tLObject).f22285b;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(tL_secureFile.dc_id);
            sb3.append("_");
            return a8.p0.r(sb3, tL_secureFile.f27093id, ".jpg");
        } else if (tLObject instanceof TLRPC.TL_secureFile) {
            TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) tLObject;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(tL_secureFile2.dc_id);
            sb4.append("_");
            return a8.p0.r(sb4, tL_secureFile2.f27093id, ".jpg");
        } else if (tLObject instanceof m20) {
            m20 m20Var = (m20) tLObject;
            return Utilities.a(m20Var.f23976a) + "." + gc.B(m20Var.f23976a, H(m20Var.f23979e));
        } else {
            if (tLObject instanceof TLRPC.PhotoSize) {
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tLObject;
                TLRPC.FileLocation fileLocation = photoSize.location;
                if (fileLocation != null && !(fileLocation instanceof TLRPC.TL_fileLocationUnavailable)) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(photoSize.location.volume_id);
                    sb5.append("_");
                    sb5.append(photoSize.location.local_id);
                    sb5.append(".");
                    if (str == null) {
                        str = "jpg";
                    }
                    sb5.append(str);
                    return sb5.toString();
                }
            } else if (tLObject instanceof TLRPC.TL_videoSize) {
                TLRPC.TL_videoSize tL_videoSize = (TLRPC.TL_videoSize) tLObject;
                TLRPC.FileLocation fileLocation2 = tL_videoSize.location;
                if (fileLocation2 != null && !(fileLocation2 instanceof TLRPC.TL_fileLocationUnavailable)) {
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(tL_videoSize.location.volume_id);
                    sb6.append("_");
                    sb6.append(tL_videoSize.location.local_id);
                    sb6.append(".");
                    if (str == null) {
                        str = "mp4";
                    }
                    sb6.append(str);
                    return sb6.toString();
                }
            } else if (tLObject instanceof TLRPC.FileLocation) {
                if (tLObject instanceof TLRPC.TL_fileLocationUnavailable) {
                    return "";
                }
                TLRPC.FileLocation fileLocation3 = (TLRPC.FileLocation) tLObject;
                StringBuilder sb7 = new StringBuilder();
                sb7.append(fileLocation3.volume_id);
                sb7.append("_");
                sb7.append(fileLocation3.local_id);
                sb7.append(".");
                if (str == null) {
                    str = "jpg";
                }
                sb7.append(str);
                return sb7.toString();
            } else if (tLObject instanceof TLRPC.UserProfilePhoto) {
                TLRPC.UserProfilePhoto userProfilePhoto = (TLRPC.UserProfilePhoto) tLObject;
                if (userProfilePhoto.photo_small != null) {
                    if ("s".equals("s")) {
                        return r(str, userProfilePhoto.photo_small);
                    }
                    return r(str, userProfilePhoto.photo_big);
                }
                StringBuilder sb8 = new StringBuilder();
                sb8.append(userProfilePhoto.photo_id);
                sb8.append("_");
                sb8.append("s");
                sb8.append(".");
                if (str == null) {
                    str = "jpg";
                }
                sb8.append(str);
                return sb8.toString();
            } else if (tLObject instanceof TLRPC.ChatPhoto) {
                TLRPC.ChatPhoto chatPhoto = (TLRPC.ChatPhoto) tLObject;
                if (chatPhoto.photo_small != null) {
                    if ("s".equals(null)) {
                        return r(str, chatPhoto.photo_small);
                    }
                    return r(str, chatPhoto.photo_big);
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append(chatPhoto.photo_id);
                sb9.append("_null.");
                if (str == null) {
                    str = "jpg";
                }
                sb9.append(str);
                return sb9.toString();
            }
            return "";
        }
    }

    public static String s(TLObject tLObject) {
        return r(null, tLObject);
    }

    public static TLRPC.PhotoSize u(int i7, ArrayList arrayList) {
        return w(arrayList, i7, false, null, false);
    }

    public static TLRPC.PhotoSize v(int i7, ArrayList arrayList, boolean z9) {
        return w(arrayList, i7, z9, null, false);
    }

    public static org.telegram.tgnet.TLRPC.PhotoSize w(java.util.ArrayList r8, int r9, boolean r10, org.telegram.tgnet.TLRPC.PhotoSize r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.w7.w(java.util.ArrayList, int, boolean, org.telegram.tgnet.TLRPC$PhotoSize, boolean):org.telegram.tgnet.TLRPC$PhotoSize");
    }

    public static TLRPC.VideoSize x(int i7, ArrayList arrayList) {
        TLRPC.FileLocation fileLocation;
        TLRPC.VideoSize videoSize = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.VideoSize videoSize2 = (TLRPC.VideoSize) arrayList.get(i11);
                if (videoSize2 != null && !(videoSize2 instanceof TLRPC.TL_videoSizeEmojiMarkup) && !(videoSize2 instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                    int max = Math.max(videoSize2.f27109w, videoSize2.h);
                    if (videoSize == null || ((i7 > 100 && (fileLocation = videoSize.location) != null && fileLocation.dc_id == Integer.MIN_VALUE) || (max <= i7 && i10 < max))) {
                        videoSize = videoSize2;
                        i10 = max;
                    }
                }
            }
        }
        return videoSize;
    }

    public static File z(int i7) {
        File file = (File) K.get(i7);
        if (file == null && i7 != 4) {
            file = (File) K.get(4);
        }
        if (r2.f25213b && file != null) {
            try {
                if (!file.isDirectory()) {
                    file.mkdirs();
                }
            } catch (Exception unused) {
            }
        }
        return file;
    }

    public final int F(Object obj) {
        int i7 = this.F;
        this.F = i7 + 1;
        this.G.put(Integer.valueOf(i7), obj);
        return i7;
    }

    public final int O(int i7) {
        int i10;
        int i11;
        if (i7 == 4) {
            return Integer.MAX_VALUE;
        }
        if (i7 == 3) {
            i10 = this.f26263a;
            this.f26263a = i10 + 1;
            i11 = 1048577;
        } else if (i7 == 2) {
            i10 = this.f26263a;
            this.f26263a = i10 + 1;
            i11 = 65537;
        } else if (i7 == 1) {
            return 65536;
        } else {
            return 0;
        }
        return i10 + i11;
    }

    public final void P(ArrayList arrayList) {
        arrayList.clear();
        arrayList.addAll(getDownloadController().H);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((ij) arrayList.get(i7)).Q = true;
        }
    }

    public final boolean S(String str) {
        if (str != null && this.f26272x.containsKey(str)) {
            return true;
        }
        return false;
    }

    public final boolean T(TLRPC.Document document, boolean z9) {
        String str;
        if (document != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(r(null, document));
            if (z9) {
                str = "p";
            } else {
                str = "";
            }
            sb2.append(str);
            if (this.D.containsKey(sb2.toString())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void V(hc hcVar, Object obj, String str, int i7, int i10) {
        int i11;
        if (hcVar == null) {
            return;
        }
        if (i10 == 0 && (hcVar.f22867c != null || (hcVar.f22873k != null && hcVar.r() == 0))) {
            i11 = 1;
        } else {
            i11 = i10;
        }
        X(hcVar.f22871i, hcVar.h, hcVar.v, hcVar.f22869f, hcVar, obj, str, hcVar.r(), i7, i11);
    }

    public final void W(TLRPC.Document document, Object obj, int i7, int i10) {
        int i11;
        if (document == null) {
            return;
        }
        if (i10 == 0 && document.key != null) {
            i11 = 1;
        } else {
            i11 = i10;
        }
        X(document, null, null, null, null, obj, null, 0L, i7, i11);
    }

    public final void X(TLRPC.Document document, ew ewVar, m20 m20Var, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, hc hcVar, Object obj, String str, long j3, int i7, int i10) {
        String str2;
        String str3;
        if (tL_fileLocationToBeDeprecated != null) {
            str2 = str;
            str3 = r(str2, tL_fileLocationToBeDeprecated);
        } else {
            str2 = str;
            str3 = null;
            if (document != null) {
                str3 = r(null, document);
            } else if (m20Var != null) {
                str3 = r(null, m20Var);
            }
        }
        String str4 = str3;
        p7 p7Var = new p7(this, document, ewVar, m20Var, tL_fileLocationToBeDeprecated, hcVar, obj, str2, j3, i7, i10);
        if (i10 != 10 && !TextUtils.isEmpty(str4) && !str4.contains("-2147483648")) {
            ?? obj2 = new Object();
            obj2.f25951a = p7Var;
            this.f26272x.put(str4, obj2);
        }
        J.c(p7Var);
    }

    public final org.telegram.messenger.i7 Y(org.telegram.tgnet.TLRPC.Document r32, org.telegram.messenger.ew r33, org.telegram.messenger.m20 r34, org.telegram.tgnet.TLRPC.TL_fileLocationToBeDeprecated r35, org.telegram.messenger.hc r36, java.lang.Object r37, java.lang.String r38, long r39, int r41, org.telegram.messenger.j7 r42, long r43, boolean r45, int r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.w7.Y(org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.ew, org.telegram.messenger.m20, org.telegram.tgnet.TLRPC$TL_fileLocationToBeDeprecated, org.telegram.messenger.hc, java.lang.Object, java.lang.String, long, int, org.telegram.messenger.j7, long, boolean, int):org.telegram.messenger.i7");
    }

    public final void Z(TLRPC.Document document, boolean z9, boolean z10) {
        if (document == null) {
            return;
        }
        if (z10) {
            g0.h3(new s7(this, document, z9, 1));
        } else {
            a0(document, z9);
        }
    }

    public final void a0(TLRPC.Document document, boolean z9) {
        String str;
        String r10 = r(null, document);
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m(r10);
        if (z9) {
            str = "p";
        } else {
            str = "";
        }
        m10.append(str);
        if (this.D.remove(m10.toString()) != null) {
            getNotificationCenter().k(qs.f25009h1, r10);
        }
    }

    public final void b(String str, boolean z9) {
        if (str == null) {
            return;
        }
        J.c(new yf(this, z9, str, 4));
    }

    public final void b0(TLRPC.Document document, boolean z9, boolean z10) {
        if (document == null) {
            return;
        }
        if (z10) {
            g0.h3(new s7(this, document, z9, 0));
        } else {
            d0(document, z9);
        }
    }

    public final void c() {
        p7 p7Var;
        for (String str : this.f26272x.keySet()) {
            v7 v7Var = (v7) this.f26272x.get(str);
            if (v7Var != null) {
                p7Var = v7Var.f25951a;
            } else {
                p7Var = null;
            }
            if (p7Var != null) {
                J.a(p7Var);
            }
            J.c(new o7(this, str, 0));
        }
    }

    public final void c0(TLRPC.Document document, boolean z9) {
        String str;
        if (document != null) {
            String r10 = r(null, document);
            StringBuilder m10 = com.google.android.recaptcha.internal.a.m(r10);
            String str2 = "p";
            if (!z9) {
                str = "p";
            } else {
                str = "";
            }
            m10.append(str);
            String sb2 = m10.toString();
            HashMap hashMap = this.D;
            if (hashMap.containsKey(sb2)) {
                StringBuilder m11 = com.google.android.recaptcha.internal.a.m(r10);
                if (!z9) {
                    str2 = "";
                }
                m11.append(str2);
                hashMap.put(m11.toString(), Boolean.TRUE);
                getNotificationCenter().k(qs.f25009h1, r10);
            }
        }
    }

    public final void d(TLRPC.Document document) {
        f(document);
    }

    public final void d0(TLRPC.Document document, boolean z9) {
        String str;
        String r10 = r(null, document);
        StringBuilder m10 = com.google.android.recaptcha.internal.a.m(r10);
        if (z9) {
            str = "p";
        } else {
            str = "";
        }
        m10.append(str);
        this.D.put(m10.toString(), Boolean.TRUE);
        getNotificationCenter().k(qs.f25009h1, r10);
    }

    public final void e(TLRPC.Document document, ew ewVar, m20 m20Var, TLRPC.FileLocation fileLocation, String str, String str2) {
        boolean z9;
        if (fileLocation != null || document != null || m20Var != null || ewVar != null || !TextUtils.isEmpty(str2)) {
            p7 p7Var = null;
            if (fileLocation != null) {
                str2 = r(str, fileLocation);
            } else if (document != null) {
                str2 = r(null, document);
            } else if (ewVar != null) {
                str2 = r(null, ewVar);
            } else if (m20Var != null) {
                str2 = r(null, m20Var);
            }
            v7 v7Var = (v7) this.f26272x.remove(str2);
            if (v7Var != null) {
                p7Var = v7Var.f25951a;
            }
            if (v7Var != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (p7Var != null) {
                J.a(p7Var);
            }
            J.c(new o7(this, str2, 1));
            if (z9 && document != null) {
                g0.h3(new r7(this, 1));
            }
        }
    }

    public final void e0(String str, TLObject tLObject) {
        boolean z9 = tLObject instanceof TLRPC.Document;
        f8 f8Var = this.d;
        int i7 = 4;
        if (z9) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            if (document.key == null) {
                if (ij.R4(document)) {
                    i7 = 1;
                } else if (ij.L4(document)) {
                    i7 = 2;
                } else {
                    i7 = 3;
                }
            }
            int i10 = i7;
            long j3 = document.f26962id;
            int i11 = document.dc_id;
            f8Var.getClass();
            f8Var.h(new d8(f8Var, j3, i11, i10, str, 1));
        } else if (tLObject instanceof TLRPC.PhotoSize) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tLObject;
            if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
                TLRPC.FileLocation fileLocation = photoSize.location;
                if (fileLocation != null && fileLocation.key == null && ((fileLocation.volume_id != -2147483648L || fileLocation.local_id >= 0) && photoSize.size >= 0)) {
                    i7 = 0;
                }
                long j10 = fileLocation.volume_id;
                int i12 = fileLocation.dc_id + (fileLocation.local_id << 16);
                f8Var.getClass();
                f8Var.h(new d8(f8Var, j10, i12, i7, str, 1));
            }
        }
    }

    public final void f(TLRPC.Document document) {
        e(document, null, null, null, null, null);
    }

    public final void f0(final String str, final c20 c20Var) {
        final x4 x4Var = new x4(7, this, r0);
        ls[] lsVarArr = {new ls() {
            @Override
            public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
                int i11 = qs.U1;
                String str2 = str;
                c20 c20Var2 = c20Var;
                x4 x4Var2 = x4Var;
                if (i7 == i11) {
                    if (objArr[0] == str2) {
                        c20Var2.a((TLRPC.InputFile) objArr[1]);
                        x4Var2.run();
                    }
                } else if (i7 == qs.V1 && objArr[0] == str2) {
                    c20Var2.a(null);
                    x4Var2.run();
                }
            }
        }};
        getNotificationCenter().b(lsVarArr[0], qs.U1);
        getNotificationCenter().b(lsVarArr[0], qs.V1);
        h0(false, 67108864, str, false);
    }

    public final void g(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            e(null, null, null, null, null, (String) arrayList.get(i7));
        }
    }

    public final void g0(final String str, final boolean z9, final boolean z10, final long j3, final int i7, final boolean z11) {
        if (str == null) {
            return;
        }
        J.c(new Runnable() {
            @Override
            public final void run() {
                long j10;
                w7 w7Var = w7.this;
                HashMap hashMap = w7Var.f26273y;
                ConcurrentHashMap concurrentHashMap = w7Var.h;
                ConcurrentHashMap concurrentHashMap2 = w7Var.f26268n;
                boolean z12 = z9;
                String str2 = str;
                if (z12) {
                    if (concurrentHashMap2.containsKey(str2)) {
                        return;
                    }
                } else if (concurrentHashMap.containsKey(str2)) {
                    return;
                }
                long j11 = j3;
                int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                if (i10 != 0 && ((Long) hashMap.get(str2)) != null) {
                    hashMap.remove(str2);
                    j10 = 0;
                } else {
                    j10 = j11;
                }
                String str3 = str2;
                y8 y8Var = new y8(w7Var.currentAccount, i7, j10, str3, z12);
                qb qbVar = w7Var.E;
                if (qbVar != null && i10 != 0) {
                    qbVar.a(y8Var, str3, 0L, j11, z12);
                    y8Var = y8Var;
                    str3 = str3;
                    z12 = z12;
                }
                if (z12) {
                    concurrentHashMap2.put(str3, y8Var);
                } else {
                    concurrentHashMap.put(str3, y8Var);
                }
                if (z11) {
                    y8Var.E = true;
                }
                boolean z13 = z10;
                y8Var.f26611o = new t7(w7Var, z12, str3, z13);
                if (z13) {
                    int i11 = w7Var.f26270s;
                    if (i11 < 1) {
                        w7Var.f26270s = i11 + 1;
                        y8Var.c();
                        return;
                    }
                    w7Var.f26267f.add(y8Var);
                    return;
                }
                int i12 = w7Var.f26269r;
                if (i12 < 1) {
                    w7Var.f26269r = i12 + 1;
                    y8Var.c();
                    return;
                }
                w7Var.f26266e.add(y8Var);
            }
        });
    }

    public final void h(int i7, TLRPC.Document document, ew ewVar, m20 m20Var, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, String str) {
        String str2 = null;
        if (tL_fileLocationToBeDeprecated == null && document == null && m20Var == null && ewVar == null && TextUtils.isEmpty(null)) {
            return;
        }
        if (tL_fileLocationToBeDeprecated != null) {
            str2 = r(str, tL_fileLocationToBeDeprecated);
        } else if (document != null) {
            str2 = r(null, document);
        } else if (ewVar != null) {
            str2 = r(null, ewVar);
        } else if (m20Var != null) {
            str2 = r(null, m20Var);
        }
        J.c(new l7(this, str2, i7, 0));
    }

    public final void h0(boolean z9, int i7, String str, boolean z10) {
        g0(str, z9, z10, 0L, i7, false);
    }

    public final void i() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(getDownloadController().H);
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            ((ij) arrayList2.get(i7)).K(true);
            if (((ij) arrayList2.get(i7)).f23311x0) {
                arrayList.add((ij) arrayList2.get(i7));
            }
        }
        if (!arrayList.isEmpty()) {
            g0.h3(new x4(8, this, arrayList));
        }
    }

    public final boolean k(String str) {
        i7 i7Var;
        if (str == null || (i7Var = (i7) this.f26271w.get(str)) == null || !i7Var.f23097l) {
            return false;
        }
        i7Var.f23097l = false;
        return true;
    }

    public final void l(ArrayList arrayList) {
        f8 f8Var = this.d;
        f8Var.getClass();
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            long currentTimeMillis = System.currentTimeMillis();
            long[] jArr = new long[1];
            em emVar = new em(f8Var, arrayList2, jArr, countDownLatch, 6);
            f8Var.d();
            p5 p5Var = f8Var.f22378a;
            Handler handler = p5Var.f24517a;
            if (handler != null) {
                handler.postAtFrontOfQueue(emVar);
            } else {
                synchronized (p5Var.f24518b) {
                    try {
                        ArrayList arrayList3 = p5Var.f24519c;
                        if (arrayList3 != null) {
                            arrayList3.add(new o5(1, 0L, emVar));
                        } else {
                            p5Var.f24517a.postAtFrontOfQueue(emVar);
                        }
                    } finally {
                    }
                }
            }
            try {
                countDownLatch.await();
            } catch (InterruptedException e10) {
                a8.g(e10, true);
            }
            StringBuilder sb2 = new StringBuilder("checkMediaExistance size=");
            sb2.append(arrayList.size());
            sb2.append(" time=");
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
            sb2.append(" thread_time=");
            jg.g.u(jArr[0], sb2);
            boolean z9 = r2.f25212a;
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                a8.g(new Exception("warning, not allowed in main thread"), true);
            }
        }
    }

    public final void n(String str, boolean z9, long j3, long j10, Float f10) {
        J.c(new di.d6(this, z9, str, j3, j10, f10));
    }

    public final float t(String str, float f10) {
        i7 i7Var;
        if (!TextUtils.isEmpty(str) && (i7Var = (i7) this.f26271w.get(str)) != null) {
            ArrayList arrayList = i7Var.N;
            long j3 = i7Var.f23071b0;
            if (j3 != 0 && arrayList != null) {
                return (((float) i7Var.h((int) (((float) j3) * f10), j3, arrayList)) / ((float) i7Var.f23071b0)) + f10;
            }
        }
        return 0.0f;
    }

    public final void y(ArrayList arrayList) {
        arrayList.clear();
        arrayList.addAll(getDownloadController().G);
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            ((ij) arrayList.get(i7)).Q = true;
        }
    }
}
