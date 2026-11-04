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
    public static Pattern J;
    public static volatile p5 K = new p5("fileUploadQueue");
    public static SparseArray L = null;
    public static final w7[] M = new w7[4];
    public static final q7 N = new Object();
    public final HashMap E;
    public jb F;
    public int G;
    public final ConcurrentHashMap H;
    public final r7 I;
    public int f26166a;
    public final mg.f[] f26167b;
    public final mg.f[] f26168c;
    public final f8 d;
    public final LinkedList f26169e;
    public final LinkedList f26170f;
    public final ConcurrentHashMap h;
    public final ConcurrentHashMap f26171n;
    public int f26172r;
    public int f26173s;
    public final ConcurrentHashMap f26174w;
    public final ConcurrentHashMap f26175x;
    public final HashMap f26176y;

    public w7(int i3) {
        super(i3);
        this.f26167b = new mg.f[5];
        this.f26168c = new mg.f[5];
        this.f26169e = new LinkedList();
        this.f26170f = new LinkedList();
        this.h = new ConcurrentHashMap();
        this.f26171n = new ConcurrentHashMap();
        this.f26172r = 0;
        this.f26173s = 0;
        this.f26174w = new ConcurrentHashMap();
        this.f26175x = new ConcurrentHashMap(10, 1.0f, 2);
        this.f26176y = new HashMap();
        this.E = new HashMap();
        this.F = null;
        this.H = new ConcurrentHashMap();
        this.I = new r7(this, 0);
        this.d = new f8(i3);
        int i10 = 0;
        while (true) {
            mg.f[] fVarArr = this.f26167b;
            if (i10 >= fVarArr.length) {
                break;
            }
            fVarArr[i10] = new mg.f(i3, 0, K);
            this.f26168c[i10] = new mg.f(i3, 1, K);
            i10++;
        }
        if (!r2.f25040a) {
            return;
        }
        K.a(this.I);
        K.e(this.I, 10000L);
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
            for (int i3 = 0; i3 < document.attributes.size(); i3++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i3);
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
            char c2 = 65535;
            switch (str.hashCode()) {
                case 187091926:
                    if (str.equals("audio/ogg")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 1331848029:
                    if (str.equals("video/mp4")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 2039520277:
                    if (str.equals("video/x-matroska")) {
                        c2 = 2;
                        break;
                    }
                    break;
            }
            switch (c2) {
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
                if (J == null) {
                    J = Pattern.compile("sent_.*_([0-9]+)_([0-9]+)_([0-9]+)_([0-9]+)");
                }
                try {
                    Matcher matcher = J.matcher(str);
                    if (matcher.matches()) {
                        ?? obj2 = new Object();
                        obj2.f22325b = Integer.parseInt(matcher.group(1));
                        obj2.f22324a = Long.parseLong(matcher.group(2));
                        obj2.f22326c = Integer.parseInt(matcher.group(3));
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
        } else if (obj instanceof zi) {
            zi ziVar = (zi) obj;
            ?? obj3 = new Object();
            obj3.f22325b = ziVar.f1();
            obj3.f22324a = zi.B0(ziVar.f26868k);
            obj3.f22326c = ziVar.D;
            obj3.d = ziVar.T1();
            return obj3;
        } else if (obj instanceof TL_stories.StoryItem) {
            ?? obj4 = new Object();
            obj4.f22324a = ((TL_stories.StoryItem) obj).dialogId;
            obj4.f22326c = 23;
            return obj4;
        } else {
            return null;
        }
    }

    public static w7 G(int i3) {
        w7 w7Var;
        w7[] w7VarArr = M;
        w7 w7Var2 = w7VarArr[i3];
        if (w7Var2 == null) {
            synchronized (w7.class) {
                try {
                    w7Var = w7VarArr[i3];
                    if (w7Var == null) {
                        w7Var = new w7(i3);
                        w7VarArr[i3] = w7Var;
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
        return K(tLObject, null, false, true);
    }

    public static File J(TLObject tLObject, String str, boolean z10) {
        return K(tLObject, str, false, z10);
    }

    public static java.io.File K(org.telegram.tgnet.TLObject r11, java.lang.String r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.w7.K(org.telegram.tgnet.TLObject, java.lang.String, boolean, boolean):java.io.File");
    }

    public static File L(TLObject tLObject, boolean z10) {
        return K(tLObject, null, z10, true);
    }

    public static File M(TLRPC.Message message) {
        return N(message, false, true);
    }

    public static File N(TLRPC.Message message, boolean z10, boolean z11) {
        TLRPC.PhotoSize w10;
        TLRPC.PhotoSize w11;
        TLRPC.PhotoSize w12;
        if (message == null) {
            return new File("");
        }
        boolean z12 = false;
        if (message instanceof TLRPC.TL_messageService) {
            TLRPC.Photo photo = message.action.photo;
            if (photo != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
                if (arrayList.size() > 0 && (w12 = w(arrayList, g0.Z0(false), false, null, false)) != null) {
                    return K(w12, null, z10, z11);
                }
            }
        } else if (zi.o1(message) instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.Document document = zi.o1(message).document;
            if (z10 || zi.o1(message).ttl_seconds != 0) {
                z12 = true;
            }
            return K(document, null, z12, z11);
        } else if (zi.o1(message) instanceof TLRPC.TL_messageMediaPhoto) {
            ArrayList<TLRPC.PhotoSize> arrayList2 = zi.o1(message).photo.sizes;
            if (arrayList2.size() > 0 && (w11 = w(arrayList2, g0.Z0(true), false, null, true)) != null) {
                if (z10 || zi.o1(message).ttl_seconds != 0) {
                    z12 = true;
                }
                return K(w11, null, z12, z11);
            }
        } else if (zi.o1(message) instanceof TLRPC.TL_messageMediaWebPage) {
            if (zi.o1(message).webpage.document != null) {
                return K(zi.o1(message).webpage.document, null, z10, z11);
            }
            if (zi.o1(message).webpage.photo != null) {
                ArrayList<TLRPC.PhotoSize> arrayList3 = zi.o1(message).webpage.photo.sizes;
                if (arrayList3.size() > 0 && (w10 = w(arrayList3, g0.Z0(false), false, null, false)) != null) {
                    return K(w10, null, z10, z11);
                }
            }
        } else if (zi.o1(message) instanceof TLRPC.TL_messageMediaInvoice) {
            return K(((TLRPC.TL_messageMediaInvoice) zi.o1(message)).photo, null, true, z11);
        }
        return new File("");
    }

    public static File O(TLRPC.Message message) {
        return N(message, false, true);
    }

    public static TLRPC.TL_photoStrippedSize R(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) arrayList.get(i3);
            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                return (TLRPC.TL_photoStrippedSize) photoSize;
            }
        }
        return null;
    }

    public static TLRPC.VideoSize S(TLRPC.Photo photo) {
        if (photo != null && photo.video_sizes != null) {
            for (int i3 = 0; i3 < photo.video_sizes.size(); i3++) {
                TLRPC.VideoSize videoSize = photo.video_sizes.get(i3);
                if ((videoSize instanceof TLRPC.TL_videoSizeEmojiMarkup) || (videoSize instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                    return videoSize;
                }
            }
        }
        return null;
    }

    public static boolean V(TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, TLRPC.Photo photo) {
        if (tL_fileLocationToBeDeprecated != null && (photo instanceof TLRPC.TL_photo)) {
            int size = photo.sizes.size();
            for (int i3 = 0; i3 < size; i3++) {
                TLRPC.FileLocation fileLocation = photo.sizes.get(i3).location;
                if (fileLocation != null && fileLocation.local_id == tL_fileLocationToBeDeprecated.local_id && fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                    return true;
                }
            }
            if ((-tL_fileLocationToBeDeprecated.volume_id) == photo.f27025id) {
                return true;
            }
        }
        return false;
    }

    public static void a(CountDownLatch countDownLatch, boolean z10) {
        try {
            countDownLatch.await();
        } catch (Exception e10) {
            a8.g(e10, false);
            if (z10) {
                a(countDownLatch, false);
            }
        }
    }

    public static File j(int i3) {
        return (File) L.get(i3);
    }

    public static boolean m(int i3, long j10) {
        boolean q10 = h10.i(c.a(i3).f21919a).q();
        if (j10 >= 2097152000) {
            if (j10 >= 4194304000L || !q10) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void o(GZIPInputStream gZIPInputStream, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bArr = new byte[4096];
        int i3 = 0;
        do {
            int read = gZIPInputStream.read(bArr);
            if (read <= 0) {
                break;
            }
            Thread.yield();
            fileOutputStream.write(bArr, 0, read);
            i3 += read;
        } while (i3 < 2097152);
        fileOutputStream.getFD().sync();
        fileOutputStream.close();
    }

    public static void p(int i3, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        K.c(new x0(arrayList, i3, 1));
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
                return a1.g.r(sb2, document.f27007id, str2);
            }
            return document.dc_id + "_" + document.f27007id;
        } else if (tLObject instanceof wv) {
            TLRPC.TL_secureFile tL_secureFile = ((wv) tLObject).f26263b;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(tL_secureFile.dc_id);
            sb3.append("_");
            return a1.g.r(sb3, tL_secureFile.f27138id, ".jpg");
        } else if (tLObject instanceof TLRPC.TL_secureFile) {
            TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) tLObject;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(tL_secureFile2.dc_id);
            sb4.append("_");
            return a1.g.r(sb4, tL_secureFile2.f27138id, ".jpg");
        } else if (tLObject instanceof e20) {
            e20 e20Var = (e20) tLObject;
            return Utilities.a(e20Var.f22294a) + "." + zb.B(e20Var.f22294a, H(e20Var.f22297e));
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

    public static TLRPC.PhotoSize u(int i3, ArrayList arrayList) {
        return w(arrayList, i3, false, null, false);
    }

    public static TLRPC.PhotoSize v(int i3, ArrayList arrayList, boolean z10) {
        return w(arrayList, i3, z10, null, false);
    }

    public static org.telegram.tgnet.TLRPC.PhotoSize w(java.util.ArrayList r8, int r9, boolean r10, org.telegram.tgnet.TLRPC.PhotoSize r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.w7.w(java.util.ArrayList, int, boolean, org.telegram.tgnet.TLRPC$PhotoSize, boolean):org.telegram.tgnet.TLRPC$PhotoSize");
    }

    public static TLRPC.VideoSize x(int i3, ArrayList arrayList) {
        TLRPC.FileLocation fileLocation;
        TLRPC.VideoSize videoSize = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i10 = 0;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                TLRPC.VideoSize videoSize2 = (TLRPC.VideoSize) arrayList.get(i11);
                if (videoSize2 != null && !(videoSize2 instanceof TLRPC.TL_videoSizeEmojiMarkup) && !(videoSize2 instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                    int max = Math.max(videoSize2.f27154w, videoSize2.h);
                    if (videoSize == null || ((i3 > 100 && (fileLocation = videoSize.location) != null && fileLocation.dc_id == Integer.MIN_VALUE) || (max <= i3 && i10 < max))) {
                        videoSize = videoSize2;
                        i10 = max;
                    }
                }
            }
        }
        return videoSize;
    }

    public static File z(int i3) {
        File file = (File) L.get(i3);
        if (file == null && i3 != 4) {
            file = (File) L.get(4);
        }
        if (r2.f25041b && file != null) {
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
        int i3 = this.G;
        this.G = i3 + 1;
        this.H.put(Integer.valueOf(i3), obj);
        return i3;
    }

    public final int P(int i3) {
        int i10;
        int i11;
        if (i3 == 4) {
            return Integer.MAX_VALUE;
        }
        if (i3 == 3) {
            i10 = this.f26166a;
            this.f26166a = i10 + 1;
            i11 = 1048577;
        } else if (i3 == 2) {
            i10 = this.f26166a;
            this.f26166a = i10 + 1;
            i11 = 65537;
        } else if (i3 == 1) {
            return 65536;
        } else {
            return 0;
        }
        return i10 + i11;
    }

    public final void Q(ArrayList arrayList) {
        arrayList.clear();
        arrayList.addAll(getDownloadController().I);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((zi) arrayList.get(i3)).Q = true;
        }
    }

    public final boolean T(String str) {
        if (str != null && this.f26175x.containsKey(str)) {
            return true;
        }
        return false;
    }

    public final boolean U(TLRPC.Document document, boolean z10) {
        String str;
        if (document != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(r(null, document));
            if (z10) {
                str = "p";
            } else {
                str = "";
            }
            sb2.append(str);
            if (this.E.containsKey(sb2.toString())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void W(ac acVar, Object obj, String str, int i3, int i10) {
        int i11;
        if (acVar == null) {
            return;
        }
        if (i10 == 0 && (acVar.f21486c != null || (acVar.f21492k != null && acVar.r() == 0))) {
            i11 = 1;
        } else {
            i11 = i10;
        }
        Y(acVar.f21490i, acVar.h, acVar.v, acVar.f21488f, acVar, obj, str, acVar.r(), i3, i11);
    }

    public final void X(TLRPC.Document document, Object obj, int i3, int i10) {
        int i11;
        if (document == null) {
            return;
        }
        if (i10 == 0 && document.key != null) {
            i11 = 1;
        } else {
            i11 = i10;
        }
        Y(document, null, null, null, null, obj, null, 0L, i3, i11);
    }

    public final void Y(TLRPC.Document document, wv wvVar, e20 e20Var, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ac acVar, Object obj, String str, long j10, int i3, int i10) {
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
            } else if (e20Var != null) {
                str3 = r(null, e20Var);
            }
        }
        String str4 = str3;
        p7 p7Var = new p7(this, document, wvVar, e20Var, tL_fileLocationToBeDeprecated, acVar, obj, str2, j10, i3, i10);
        if (i10 != 10 && !TextUtils.isEmpty(str4) && !str4.contains("-2147483648")) {
            ?? obj2 = new Object();
            obj2.f25833a = p7Var;
            this.f26175x.put(str4, obj2);
        }
        K.c(p7Var);
    }

    public final org.telegram.messenger.i7 Z(org.telegram.tgnet.TLRPC.Document r32, org.telegram.messenger.wv r33, org.telegram.messenger.e20 r34, org.telegram.tgnet.TLRPC.TL_fileLocationToBeDeprecated r35, org.telegram.messenger.ac r36, java.lang.Object r37, java.lang.String r38, long r39, int r41, org.telegram.messenger.j7 r42, long r43, boolean r45, int r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.w7.Z(org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.wv, org.telegram.messenger.e20, org.telegram.tgnet.TLRPC$TL_fileLocationToBeDeprecated, org.telegram.messenger.ac, java.lang.Object, java.lang.String, long, int, org.telegram.messenger.j7, long, boolean, int):org.telegram.messenger.i7");
    }

    public final void a0(TLRPC.Document document, boolean z10, boolean z11) {
        if (document == null) {
            return;
        }
        if (z11) {
            g0.h3(new s7(this, document, z10, 1));
        } else {
            b0(document, z10);
        }
    }

    public final void b(String str, boolean z10) {
        if (str == null) {
            return;
        }
        K.c(new qf(this, z10, str, 4));
    }

    public final void b0(TLRPC.Document document, boolean z10) {
        String str;
        String r5 = r(null, document);
        StringBuilder l10 = com.google.android.recaptcha.internal.a.l(r5);
        if (z10) {
            str = "p";
        } else {
            str = "";
        }
        l10.append(str);
        if (this.E.remove(l10.toString()) != null) {
            getNotificationCenter().k(hs.f23238h1, r5);
        }
    }

    public final void c() {
        p7 p7Var;
        for (String str : this.f26175x.keySet()) {
            v7 v7Var = (v7) this.f26175x.get(str);
            if (v7Var != null) {
                p7Var = v7Var.f25833a;
            } else {
                p7Var = null;
            }
            if (p7Var != null) {
                K.a(p7Var);
            }
            K.c(new n7(this, str, 0));
        }
    }

    public final void c0(TLRPC.Document document, boolean z10, boolean z11) {
        if (document == null) {
            return;
        }
        if (z11) {
            g0.h3(new s7(this, document, z10, 0));
        } else {
            e0(document, z10);
        }
    }

    public final void d(TLRPC.Document document) {
        f(document);
    }

    public final void d0(TLRPC.Document document, boolean z10) {
        String str;
        if (document != null) {
            String r5 = r(null, document);
            StringBuilder l10 = com.google.android.recaptcha.internal.a.l(r5);
            String str2 = "p";
            if (!z10) {
                str = "p";
            } else {
                str = "";
            }
            l10.append(str);
            String sb2 = l10.toString();
            HashMap hashMap = this.E;
            if (hashMap.containsKey(sb2)) {
                StringBuilder l11 = com.google.android.recaptcha.internal.a.l(r5);
                if (!z10) {
                    str2 = "";
                }
                l11.append(str2);
                hashMap.put(l11.toString(), Boolean.TRUE);
                getNotificationCenter().k(hs.f23238h1, r5);
            }
        }
    }

    public final void e(TLRPC.Document document, wv wvVar, e20 e20Var, TLRPC.FileLocation fileLocation, String str, String str2) {
        boolean z10;
        if (fileLocation != null || document != null || e20Var != null || wvVar != null || !TextUtils.isEmpty(str2)) {
            p7 p7Var = null;
            if (fileLocation != null) {
                str2 = r(str, fileLocation);
            } else if (document != null) {
                str2 = r(null, document);
            } else if (wvVar != null) {
                str2 = r(null, wvVar);
            } else if (e20Var != null) {
                str2 = r(null, e20Var);
            }
            v7 v7Var = (v7) this.f26175x.remove(str2);
            if (v7Var != null) {
                p7Var = v7Var.f25833a;
            }
            if (v7Var != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (p7Var != null) {
                K.a(p7Var);
            }
            K.c(new n7(this, str2, 1));
            if (z10 && document != null) {
                g0.h3(new r7(this, 1));
            }
        }
    }

    public final void e0(TLRPC.Document document, boolean z10) {
        String str;
        String r5 = r(null, document);
        StringBuilder l10 = com.google.android.recaptcha.internal.a.l(r5);
        if (z10) {
            str = "p";
        } else {
            str = "";
        }
        l10.append(str);
        this.E.put(l10.toString(), Boolean.TRUE);
        getNotificationCenter().k(hs.f23238h1, r5);
    }

    public final void f(TLRPC.Document document) {
        e(document, null, null, null, null, null);
    }

    public final void f0(String str, TLObject tLObject) {
        boolean z10 = tLObject instanceof TLRPC.Document;
        f8 f8Var = this.d;
        int i3 = 4;
        if (z10) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            if (document.key == null) {
                if (zi.R4(document)) {
                    i3 = 1;
                } else if (zi.L4(document)) {
                    i3 = 2;
                } else {
                    i3 = 3;
                }
            }
            int i10 = i3;
            long j10 = document.f27007id;
            int i11 = document.dc_id;
            f8Var.getClass();
            f8Var.h(new d8(f8Var, j10, i11, i10, str, 1));
        } else if (tLObject instanceof TLRPC.PhotoSize) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tLObject;
            if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
                TLRPC.FileLocation fileLocation = photoSize.location;
                if (fileLocation != null && fileLocation.key == null && ((fileLocation.volume_id != -2147483648L || fileLocation.local_id >= 0) && photoSize.size >= 0)) {
                    i3 = 0;
                }
                long j11 = fileLocation.volume_id;
                int i12 = fileLocation.dc_id + (fileLocation.local_id << 16);
                f8Var.getClass();
                f8Var.h(new d8(f8Var, j11, i12, i3, str, 1));
            }
        }
    }

    public final void g(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            e(null, null, null, null, null, (String) arrayList.get(i3));
        }
    }

    public final void g0(final String str, final u10 u10Var) {
        final y4 y4Var = new y4(7, this, r0);
        cs[] csVarArr = {new cs() {
            @Override
            public final void didReceivedNotification(int i3, int i10, Object[] objArr) {
                int i11 = hs.U1;
                String str2 = str;
                u10 u10Var2 = u10Var;
                y4 y4Var2 = y4Var;
                if (i3 == i11) {
                    if (objArr[0] == str2) {
                        u10Var2.a((TLRPC.InputFile) objArr[1]);
                        y4Var2.run();
                    }
                } else if (i3 == hs.V1 && objArr[0] == str2) {
                    u10Var2.a(null);
                    y4Var2.run();
                }
            }
        }};
        getNotificationCenter().b(csVarArr[0], hs.U1);
        getNotificationCenter().b(csVarArr[0], hs.V1);
        i0(false, 67108864, str, false);
    }

    public final void h(int i3, TLRPC.Document document, wv wvVar, e20 e20Var, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, String str) {
        String str2 = null;
        if (tL_fileLocationToBeDeprecated == null && document == null && e20Var == null && wvVar == null && TextUtils.isEmpty(null)) {
            return;
        }
        if (tL_fileLocationToBeDeprecated != null) {
            str2 = r(str, tL_fileLocationToBeDeprecated);
        } else if (document != null) {
            str2 = r(null, document);
        } else if (wvVar != null) {
            str2 = r(null, wvVar);
        } else if (e20Var != null) {
            str2 = r(null, e20Var);
        }
        K.c(new k7(this, str2, i3, 0));
    }

    public final void h0(final String str, final boolean z10, final boolean z11, final long j10, final int i3, final boolean z12) {
        if (str == null) {
            return;
        }
        K.c(new Runnable() {
            @Override
            public final void run() {
                long j11;
                w7 w7Var = w7.this;
                HashMap hashMap = w7Var.f26176y;
                ConcurrentHashMap concurrentHashMap = w7Var.h;
                ConcurrentHashMap concurrentHashMap2 = w7Var.f26171n;
                boolean z13 = z10;
                String str2 = str;
                if (z13) {
                    if (concurrentHashMap2.containsKey(str2)) {
                        return;
                    }
                } else if (concurrentHashMap.containsKey(str2)) {
                    return;
                }
                long j12 = j10;
                int i10 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
                if (i10 != 0 && ((Long) hashMap.get(str2)) != null) {
                    hashMap.remove(str2);
                    j11 = 0;
                } else {
                    j11 = j12;
                }
                String str3 = str2;
                y8 y8Var = new y8(w7Var.currentAccount, i3, j11, str3, z13);
                jb jbVar = w7Var.F;
                if (jbVar != null && i10 != 0) {
                    jbVar.a(y8Var, str3, 0L, j12, z13);
                    y8Var = y8Var;
                    str3 = str3;
                    z13 = z13;
                }
                if (z13) {
                    concurrentHashMap2.put(str3, y8Var);
                } else {
                    concurrentHashMap.put(str3, y8Var);
                }
                if (z12) {
                    y8Var.E = true;
                }
                boolean z14 = z11;
                y8Var.f26546o = new t7(w7Var, z13, str3, z14);
                if (z14) {
                    int i11 = w7Var.f26173s;
                    if (i11 < 1) {
                        w7Var.f26173s = i11 + 1;
                        y8Var.c();
                        return;
                    }
                    w7Var.f26170f.add(y8Var);
                    return;
                }
                int i12 = w7Var.f26172r;
                if (i12 < 1) {
                    w7Var.f26172r = i12 + 1;
                    y8Var.c();
                    return;
                }
                w7Var.f26169e.add(y8Var);
            }
        });
    }

    public final void i() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(getDownloadController().I);
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            ((zi) arrayList2.get(i3)).K(true);
            if (((zi) arrayList2.get(i3)).f26917x0) {
                arrayList.add((zi) arrayList2.get(i3));
            }
        }
        if (!arrayList.isEmpty()) {
            g0.h3(new y4(8, this, arrayList));
        }
    }

    public final void i0(boolean z10, int i3, String str, boolean z11) {
        h0(str, z10, z11, 0L, i3, false);
    }

    public final boolean k(String str) {
        i7 i7Var;
        if (str == null || (i7Var = (i7) this.f26174w.get(str)) == null || !i7Var.f23490l) {
            return false;
        }
        i7Var.f23490l = false;
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
            ul ulVar = new ul(f8Var, arrayList2, jArr, countDownLatch, 6);
            f8Var.d();
            p5 p5Var = f8Var.f22461a;
            Handler handler = p5Var.f24701a;
            if (handler != null) {
                handler.postAtFrontOfQueue(ulVar);
            } else {
                synchronized (p5Var.f24702b) {
                    try {
                        ArrayList arrayList3 = p5Var.f24703c;
                        if (arrayList3 != null) {
                            arrayList3.add(new o5(1, 0L, ulVar));
                        } else {
                            p5Var.f24701a.postAtFrontOfQueue(ulVar);
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
            k2.p1.r(jArr[0], sb2);
            boolean z10 = r2.f25040a;
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                a8.g(new Exception("warning, not allowed in main thread"), true);
            }
        }
    }

    public final void n(String str, boolean z10, long j10, long j11, Float f10) {
        K.c(new ei.e6(this, z10, str, j10, j11, f10));
    }

    public final float t(String str, float f10) {
        i7 i7Var;
        if (!TextUtils.isEmpty(str) && (i7Var = (i7) this.f26174w.get(str)) != null) {
            ArrayList arrayList = i7Var.N;
            long j10 = i7Var.f23464b0;
            if (j10 != 0 && arrayList != null) {
                return (((float) i7Var.h((int) (((float) j10) * f10), j10, arrayList)) / ((float) i7Var.f23464b0)) + f10;
            }
        }
        return 0.0f;
    }

    public final void y(ArrayList arrayList) {
        arrayList.clear();
        arrayList.addAll(getDownloadController().H);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((zi) arrayList.get(i3)).Q = true;
        }
    }
}
