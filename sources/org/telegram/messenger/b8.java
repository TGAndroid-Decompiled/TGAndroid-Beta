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
public final class b8 extends f1 {
    public static Pattern I;
    public static volatile r5 J = new r5("fileUploadQueue");
    public static SparseArray K = null;
    public static final b8[] L = new b8[4];
    public static final v7 M = new Object();
    public final HashMap D;
    public rb E;
    public int F;
    public final ConcurrentHashMap G;
    public final w7 H;
    public int f14739a;
    public final bg.h[] f14740b;
    public final bg.h[] f14741c;
    public final k8 d;
    public final LinkedList e;
    public final LinkedList f14742f;
    public final ConcurrentHashMap h;
    public final ConcurrentHashMap f14743n;
    public int f14744r;
    public int f14745s;
    public final ConcurrentHashMap f14746w;
    public final ConcurrentHashMap f14747x;
    public final HashMap f14748y;

    public b8(int i10) {
        super(i10);
        this.f14740b = new bg.h[5];
        this.f14741c = new bg.h[5];
        this.e = new LinkedList();
        this.f14742f = new LinkedList();
        this.h = new ConcurrentHashMap();
        this.f14743n = new ConcurrentHashMap();
        this.f14744r = 0;
        this.f14745s = 0;
        this.f14746w = new ConcurrentHashMap();
        this.f14747x = new ConcurrentHashMap(10, 1.0f, 2);
        this.f14748y = new HashMap();
        this.D = new HashMap();
        this.E = null;
        this.G = new ConcurrentHashMap();
        this.H = new w7(this, 0);
        this.d = new k8(i10);
        int i11 = 0;
        while (true) {
            bg.h[] hVarArr = this.f14740b;
            if (i11 >= hVarArr.length) {
                break;
            }
            hVarArr[i11] = new bg.h(i10, 0, J);
            this.f14741c[i11] = new bg.h(i10, 1, J);
            i11++;
        }
        if (!v2.f18448a) {
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
            for (int i10 = 0; i10 < document.attributes.size(); i10++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i10);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeFilename) {
                    str = documentAttribute.file_name;
                }
            }
            str3 = str;
        }
        String q6 = q(str3);
        if (q6 != null) {
            return q6;
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

    public static j8 E(Object obj) {
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
                        obj2.f16228b = Integer.parseInt(matcher.group(1));
                        obj2.f16227a = Long.parseLong(matcher.group(2));
                        obj2.f16229c = Integer.parseInt(matcher.group(3));
                        obj2.d = Long.parseLong(matcher.group(4));
                        return obj2;
                    }
                    return null;
                } catch (Exception e) {
                    f8.g(e, true);
                    return null;
                }
            }
            return null;
        } else if (obj instanceof jj) {
            jj jjVar = (jj) obj;
            ?? obj3 = new Object();
            obj3.f16228b = jjVar.f1();
            obj3.f16227a = jj.B0(jjVar.f16337k);
            obj3.f16229c = jjVar.D;
            obj3.d = jjVar.T1();
            return obj3;
        } else if (obj instanceof TL_stories.StoryItem) {
            ?? obj4 = new Object();
            obj4.f16227a = ((TL_stories.StoryItem) obj).dialogId;
            obj4.f16229c = 23;
            return obj4;
        } else {
            return null;
        }
    }

    public static b8 G(int i10) {
        b8 b8Var;
        b8[] b8VarArr = L;
        b8 b8Var2 = b8VarArr[i10];
        if (b8Var2 == null) {
            synchronized (b8.class) {
                try {
                    b8Var = b8VarArr[i10];
                    if (b8Var == null) {
                        b8Var = new b8(i10);
                        b8VarArr[i10] = b8Var;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return b8Var;
        }
        return b8Var2;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.b8.K(org.telegram.tgnet.TLObject, java.lang.String, boolean, boolean):java.io.File");
    }

    public static File L(TLObject tLObject, boolean z10) {
        return K(tLObject, null, z10, true);
    }

    public static File M(TLRPC.Message message) {
        return N(message, false, true);
    }

    public static File N(TLRPC.Message message, boolean z10, boolean z11) {
        TLRPC.PhotoSize w9;
        TLRPC.PhotoSize w10;
        TLRPC.PhotoSize w11;
        if (message == null) {
            return new File("");
        }
        boolean z12 = false;
        if (message instanceof TLRPC.TL_messageService) {
            TLRPC.Photo photo = message.action.photo;
            if (photo != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
                if (arrayList.size() > 0 && (w11 = w(arrayList, i0.Z0(false), false, null, false)) != null) {
                    return K(w11, null, z10, z11);
                }
            }
        } else if (jj.o1(message) instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.Document document = jj.o1(message).document;
            if (z10 || jj.o1(message).ttl_seconds != 0) {
                z12 = true;
            }
            return K(document, null, z12, z11);
        } else if (jj.o1(message) instanceof TLRPC.TL_messageMediaPhoto) {
            ArrayList<TLRPC.PhotoSize> arrayList2 = jj.o1(message).photo.sizes;
            if (arrayList2.size() > 0 && (w10 = w(arrayList2, i0.Z0(true), false, null, true)) != null) {
                if (z10 || jj.o1(message).ttl_seconds != 0) {
                    z12 = true;
                }
                return K(w10, null, z12, z11);
            }
        } else if (jj.o1(message) instanceof TLRPC.TL_messageMediaWebPage) {
            if (jj.o1(message).webpage.document != null) {
                return K(jj.o1(message).webpage.document, null, z10, z11);
            }
            if (jj.o1(message).webpage.photo != null) {
                ArrayList<TLRPC.PhotoSize> arrayList3 = jj.o1(message).webpage.photo.sizes;
                if (arrayList3.size() > 0 && (w9 = w(arrayList3, i0.Z0(false), false, null, false)) != null) {
                    return K(w9, null, z10, z11);
                }
            }
        } else if (jj.o1(message) instanceof TLRPC.TL_messageMediaInvoice) {
            return K(((TLRPC.TL_messageMediaInvoice) jj.o1(message)).photo, null, true, z11);
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
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) arrayList.get(i10);
            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                return (TLRPC.TL_photoStrippedSize) photoSize;
            }
        }
        return null;
    }

    public static TLRPC.VideoSize S(TLRPC.Photo photo) {
        if (photo != null && photo.video_sizes != null) {
            for (int i10 = 0; i10 < photo.video_sizes.size(); i10++) {
                TLRPC.VideoSize videoSize = photo.video_sizes.get(i10);
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
            for (int i10 = 0; i10 < size; i10++) {
                TLRPC.FileLocation fileLocation = photo.sizes.get(i10).location;
                if (fileLocation != null && fileLocation.local_id == tL_fileLocationToBeDeprecated.local_id && fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                    return true;
                }
            }
            if ((-tL_fileLocationToBeDeprecated.volume_id) == photo.f19817id) {
                return true;
            }
        }
        return false;
    }

    public static void a(CountDownLatch countDownLatch, boolean z10) {
        try {
            countDownLatch.await();
        } catch (Exception e) {
            f8.g(e, false);
            if (z10) {
                a(countDownLatch, false);
            }
        }
    }

    public static File j(int i10) {
        return (File) K.get(i10);
    }

    public static boolean m(int i10, long j10) {
        boolean q6 = d20.i(c.a(i10).f14863a).q();
        if (j10 >= 2097152000) {
            if (j10 >= 4194304000L || !q6) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void o(GZIPInputStream gZIPInputStream, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bArr = new byte[4096];
        int i10 = 0;
        do {
            int read = gZIPInputStream.read(bArr);
            if (read <= 0) {
                break;
            }
            Thread.yield();
            fileOutputStream.write(bArr, 0, read);
            i10 += read;
        } while (i10 < 2097152);
        fileOutputStream.getFD().sync();
        fileOutputStream.close();
    }

    public static void p(int i10, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        J.c(new a1(arrayList, i10, 1));
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
                return a1.g.q(sb2, document.f19799id, str2);
            }
            return document.dc_id + "_" + document.f19799id;
        } else if (tLObject instanceof pw) {
            TLRPC.TL_secureFile tL_secureFile = ((pw) tLObject).f17489b;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(tL_secureFile.dc_id);
            sb3.append("_");
            return a1.g.q(sb3, tL_secureFile.f19930id, ".jpg");
        } else if (tLObject instanceof TLRPC.TL_secureFile) {
            TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) tLObject;
            StringBuilder sb4 = new StringBuilder();
            sb4.append(tL_secureFile2.dc_id);
            sb4.append("_");
            return a1.g.q(sb4, tL_secureFile2.f19930id, ".jpg");
        } else if (tLObject instanceof b30) {
            b30 b30Var = (b30) tLObject;
            return Utilities.a(b30Var.f14715a) + "." + hc.B(b30Var.f14715a, H(b30Var.e));
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

    public static TLRPC.PhotoSize u(int i10, ArrayList arrayList) {
        return w(arrayList, i10, false, null, false);
    }

    public static TLRPC.PhotoSize v(int i10, ArrayList arrayList, boolean z10) {
        return w(arrayList, i10, z10, null, false);
    }

    public static org.telegram.tgnet.TLRPC.PhotoSize w(java.util.ArrayList r8, int r9, boolean r10, org.telegram.tgnet.TLRPC.PhotoSize r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.b8.w(java.util.ArrayList, int, boolean, org.telegram.tgnet.TLRPC$PhotoSize, boolean):org.telegram.tgnet.TLRPC$PhotoSize");
    }

    public static TLRPC.VideoSize x(int i10, ArrayList arrayList) {
        TLRPC.FileLocation fileLocation;
        TLRPC.VideoSize videoSize = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i11 = 0;
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.VideoSize videoSize2 = (TLRPC.VideoSize) arrayList.get(i12);
                if (videoSize2 != null && !(videoSize2 instanceof TLRPC.TL_videoSizeEmojiMarkup) && !(videoSize2 instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                    int max = Math.max(videoSize2.f19946w, videoSize2.h);
                    if (videoSize == null || ((i10 > 100 && (fileLocation = videoSize.location) != null && fileLocation.dc_id == Integer.MIN_VALUE) || (max <= i10 && i11 < max))) {
                        videoSize = videoSize2;
                        i11 = max;
                    }
                }
            }
        }
        return videoSize;
    }

    public static File z(int i10) {
        File file = (File) K.get(i10);
        if (file == null && i10 != 4) {
            file = (File) K.get(4);
        }
        if (v2.f18449b && file != null) {
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
        int i10 = this.F;
        this.F = i10 + 1;
        this.G.put(Integer.valueOf(i10), obj);
        return i10;
    }

    public final int P(int i10) {
        int i11;
        int i12;
        if (i10 == 4) {
            return Integer.MAX_VALUE;
        }
        if (i10 == 3) {
            i11 = this.f14739a;
            this.f14739a = i11 + 1;
            i12 = 1048577;
        } else if (i10 == 2) {
            i11 = this.f14739a;
            this.f14739a = i11 + 1;
            i12 = 65537;
        } else if (i10 == 1) {
            return 65536;
        } else {
            return 0;
        }
        return i11 + i12;
    }

    public final void Q(ArrayList arrayList) {
        arrayList.clear();
        arrayList.addAll(getDownloadController().H);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((jj) arrayList.get(i10)).Q = true;
        }
    }

    public final boolean T(String str) {
        if (str != null && this.f14747x.containsKey(str)) {
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
            if (this.D.containsKey(sb2.toString())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void W(ic icVar, Object obj, String str, int i10, int i11) {
        int i12;
        if (icVar == null) {
            return;
        }
        if (i11 == 0 && (icVar.f16099c != null || (icVar.f16104k != null && icVar.r() == 0))) {
            i12 = 1;
        } else {
            i12 = i11;
        }
        Y(icVar.f16102i, icVar.h, icVar.v, icVar.f16100f, icVar, obj, str, icVar.r(), i10, i12);
    }

    public final void X(TLRPC.Document document, Object obj, int i10, int i11) {
        int i12;
        if (document == null) {
            return;
        }
        if (i11 == 0 && document.key != null) {
            i12 = 1;
        } else {
            i12 = i11;
        }
        Y(document, null, null, null, null, obj, null, 0L, i10, i12);
    }

    public final void Y(TLRPC.Document document, pw pwVar, b30 b30Var, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, ic icVar, Object obj, String str, long j10, int i10, int i11) {
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
            } else if (b30Var != null) {
                str3 = r(null, b30Var);
            }
        }
        String str4 = str3;
        u7 u7Var = new u7(this, document, pwVar, b30Var, tL_fileLocationToBeDeprecated, icVar, obj, str2, j10, i10, i11);
        if (i11 != 10 && !TextUtils.isEmpty(str4) && !str4.contains("-2147483648")) {
            ?? obj2 = new Object();
            obj2.f14589a = u7Var;
            this.f14747x.put(str4, obj2);
        }
        J.c(u7Var);
    }

    public final org.telegram.messenger.m7 Z(org.telegram.tgnet.TLRPC.Document r32, org.telegram.messenger.pw r33, org.telegram.messenger.b30 r34, org.telegram.tgnet.TLRPC.TL_fileLocationToBeDeprecated r35, org.telegram.messenger.ic r36, java.lang.Object r37, java.lang.String r38, long r39, int r41, org.telegram.messenger.n7 r42, long r43, boolean r45, int r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.b8.Z(org.telegram.tgnet.TLRPC$Document, org.telegram.messenger.pw, org.telegram.messenger.b30, org.telegram.tgnet.TLRPC$TL_fileLocationToBeDeprecated, org.telegram.messenger.ic, java.lang.Object, java.lang.String, long, int, org.telegram.messenger.n7, long, boolean, int):org.telegram.messenger.m7");
    }

    public final void a0(TLRPC.Document document, boolean z10, boolean z11) {
        if (document == null) {
            return;
        }
        if (z11) {
            i0.g3(new x7(this, document, z10, 1));
        } else {
            b0(document, z10);
        }
    }

    public final void b(String str, boolean z10) {
        if (str == null) {
            return;
        }
        J.c(new wf(this, z10, str, 4));
    }

    public final void b0(TLRPC.Document document, boolean z10) {
        String str;
        String r10 = r(null, document);
        StringBuilder t10 = a1.g.t(r10);
        if (z10) {
            str = "p";
        } else {
            str = "";
        }
        t10.append(str);
        if (this.D.remove(t10.toString()) != null) {
            getNotificationCenter().k(zs.f19621h1, r10);
        }
    }

    public final void c() {
        u7 u7Var;
        for (String str : this.f14747x.keySet()) {
            a8 a8Var = (a8) this.f14747x.get(str);
            if (a8Var != null) {
                u7Var = a8Var.f14589a;
            } else {
                u7Var = null;
            }
            if (u7Var != null) {
                J.a(u7Var);
            }
            J.c(new s7(this, str, 0));
        }
    }

    public final void c0(TLRPC.Document document, boolean z10, boolean z11) {
        if (document == null) {
            return;
        }
        if (z11) {
            i0.g3(new x7(this, document, z10, 0));
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
            String r10 = r(null, document);
            StringBuilder t10 = a1.g.t(r10);
            String str2 = "p";
            if (!z10) {
                str = "p";
            } else {
                str = "";
            }
            t10.append(str);
            String sb2 = t10.toString();
            HashMap hashMap = this.D;
            if (hashMap.containsKey(sb2)) {
                StringBuilder t11 = a1.g.t(r10);
                if (!z10) {
                    str2 = "";
                }
                t11.append(str2);
                hashMap.put(t11.toString(), Boolean.TRUE);
                getNotificationCenter().k(zs.f19621h1, r10);
            }
        }
    }

    public final void e(TLRPC.Document document, pw pwVar, b30 b30Var, TLRPC.FileLocation fileLocation, String str, String str2) {
        boolean z10;
        if (fileLocation != null || document != null || b30Var != null || pwVar != null || !TextUtils.isEmpty(str2)) {
            u7 u7Var = null;
            if (fileLocation != null) {
                str2 = r(str, fileLocation);
            } else if (document != null) {
                str2 = r(null, document);
            } else if (pwVar != null) {
                str2 = r(null, pwVar);
            } else if (b30Var != null) {
                str2 = r(null, b30Var);
            }
            a8 a8Var = (a8) this.f14747x.remove(str2);
            if (a8Var != null) {
                u7Var = a8Var.f14589a;
            }
            if (a8Var != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (u7Var != null) {
                J.a(u7Var);
            }
            J.c(new s7(this, str2, 1));
            if (z10 && document != null) {
                i0.g3(new w7(this, 1));
            }
        }
    }

    public final void e0(TLRPC.Document document, boolean z10) {
        String str;
        String r10 = r(null, document);
        StringBuilder t10 = a1.g.t(r10);
        if (z10) {
            str = "p";
        } else {
            str = "";
        }
        t10.append(str);
        this.D.put(t10.toString(), Boolean.TRUE);
        getNotificationCenter().k(zs.f19621h1, r10);
    }

    public final void f(TLRPC.Document document) {
        e(document, null, null, null, null, null);
    }

    public final void f0(String str, TLObject tLObject) {
        boolean z10 = tLObject instanceof TLRPC.Document;
        k8 k8Var = this.d;
        int i10 = 4;
        if (z10) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            if (document.key == null) {
                if (jj.Q4(document)) {
                    i10 = 1;
                } else if (jj.K4(document)) {
                    i10 = 2;
                } else {
                    i10 = 3;
                }
            }
            int i11 = i10;
            long j10 = document.f19799id;
            int i12 = document.dc_id;
            k8Var.getClass();
            k8Var.h(new i8(k8Var, j10, i12, i11, str, 1));
        } else if (tLObject instanceof TLRPC.PhotoSize) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tLObject;
            if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
                TLRPC.FileLocation fileLocation = photoSize.location;
                if (fileLocation != null && fileLocation.key == null && ((fileLocation.volume_id != -2147483648L || fileLocation.local_id >= 0) && photoSize.size >= 0)) {
                    i10 = 0;
                }
                long j11 = fileLocation.volume_id;
                int i13 = fileLocation.dc_id + (fileLocation.local_id << 16);
                k8Var.getClass();
                k8Var.h(new i8(k8Var, j11, i13, i10, str, 1));
            }
        }
    }

    public final void g(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            e(null, null, null, null, null, (String) arrayList.get(i10));
        }
    }

    public final void g0(final String str, final q20 q20Var) {
        final t6 t6Var = new t6(5, this, r0);
        us[] usVarArr = {new us() {
            @Override
            public final void didReceivedNotification(int i10, int i11, Object[] objArr) {
                int i12 = zs.U1;
                String str2 = str;
                q20 q20Var2 = q20Var;
                t6 t6Var2 = t6Var;
                if (i10 == i12) {
                    if (objArr[0] == str2) {
                        q20Var2.a((TLRPC.InputFile) objArr[1]);
                        t6Var2.run();
                    }
                } else if (i10 == zs.V1 && objArr[0] == str2) {
                    q20Var2.a(null);
                    t6Var2.run();
                }
            }
        }};
        getNotificationCenter().b(usVarArr[0], zs.U1);
        getNotificationCenter().b(usVarArr[0], zs.V1);
        i0(false, 67108864, str, false);
    }

    public final void h(int i10, TLRPC.Document document, pw pwVar, b30 b30Var, TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, String str) {
        String str2 = null;
        if (tL_fileLocationToBeDeprecated == null && document == null && b30Var == null && pwVar == null && TextUtils.isEmpty(null)) {
            return;
        }
        if (tL_fileLocationToBeDeprecated != null) {
            str2 = r(str, tL_fileLocationToBeDeprecated);
        } else if (document != null) {
            str2 = r(null, document);
        } else if (pwVar != null) {
            str2 = r(null, pwVar);
        } else if (b30Var != null) {
            str2 = r(null, b30Var);
        }
        J.c(new o7(this, str2, i10, 0));
    }

    public final void h0(final String str, final boolean z10, final boolean z11, final long j10, final int i10, final boolean z12) {
        if (str == null) {
            return;
        }
        J.c(new Runnable() {
            @Override
            public final void run() {
                long j11;
                b8 b8Var = b8.this;
                HashMap hashMap = b8Var.f14748y;
                ConcurrentHashMap concurrentHashMap = b8Var.h;
                ConcurrentHashMap concurrentHashMap2 = b8Var.f14743n;
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
                int i11 = (j12 > 0L ? 1 : (j12 == 0L ? 0 : -1));
                if (i11 != 0 && ((Long) hashMap.get(str2)) != null) {
                    hashMap.remove(str2);
                    j11 = 0;
                } else {
                    j11 = j12;
                }
                String str3 = str2;
                d9 d9Var = new d9(b8Var.currentAccount, i10, j11, str3, z13);
                rb rbVar = b8Var.E;
                if (rbVar != null && i11 != 0) {
                    rbVar.a(d9Var, str3, 0L, j12, z13);
                    d9Var = d9Var;
                    str3 = str3;
                    z13 = z13;
                }
                if (z13) {
                    concurrentHashMap2.put(str3, d9Var);
                } else {
                    concurrentHashMap.put(str3, d9Var);
                }
                if (z12) {
                    d9Var.E = true;
                }
                boolean z14 = z11;
                d9Var.f15206o = new y7(b8Var, z13, str3, z14);
                if (z14) {
                    int i12 = b8Var.f14745s;
                    if (i12 < 1) {
                        b8Var.f14745s = i12 + 1;
                        d9Var.c();
                        return;
                    }
                    b8Var.f14742f.add(d9Var);
                    return;
                }
                int i13 = b8Var.f14744r;
                if (i13 < 1) {
                    b8Var.f14744r = i13 + 1;
                    d9Var.c();
                    return;
                }
                b8Var.e.add(d9Var);
            }
        });
    }

    public final void i() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(getDownloadController().H);
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            ((jj) arrayList2.get(i10)).K(true);
            if (((jj) arrayList2.get(i10)).f16387x0) {
                arrayList.add((jj) arrayList2.get(i10));
            }
        }
        if (!arrayList.isEmpty()) {
            i0.g3(new t6(6, this, arrayList));
        }
    }

    public final void i0(boolean z10, int i10, String str, boolean z11) {
        h0(str, z10, z11, 0L, i10, false);
    }

    public final boolean k(String str) {
        m7 m7Var;
        if (str == null || (m7Var = (m7) this.f14746w.get(str)) == null || !m7Var.f16901l) {
            return false;
        }
        m7Var.f16901l = false;
        return true;
    }

    public final void l(ArrayList arrayList) {
        k8 k8Var = this.d;
        k8Var.getClass();
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            long currentTimeMillis = System.currentTimeMillis();
            long[] jArr = new long[1];
            ul ulVar = new ul(k8Var, arrayList2, jArr, countDownLatch, 6);
            k8Var.d();
            r5 r5Var = k8Var.f16544a;
            Handler handler = r5Var.f17697a;
            if (handler != null) {
                handler.postAtFrontOfQueue(ulVar);
            } else {
                synchronized (r5Var.f17698b) {
                    try {
                        ArrayList arrayList3 = r5Var.f17699c;
                        if (arrayList3 != null) {
                            arrayList3.add(new q5(1, 0L, ulVar));
                        } else {
                            r5Var.f17697a.postAtFrontOfQueue(ulVar);
                        }
                    } finally {
                    }
                }
            }
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                f8.g(e, true);
            }
            StringBuilder sb2 = new StringBuilder("checkMediaExistance size=");
            sb2.append(arrayList.size());
            sb2.append(" time=");
            sb2.append(System.currentTimeMillis() - currentTimeMillis);
            sb2.append(" thread_time=");
            i0.a.q(jArr[0], sb2);
            boolean z10 = v2.f18448a;
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                f8.g(new Exception("warning, not allowed in main thread"), true);
            }
        }
    }

    public final void n(String str, boolean z10, long j10, long j11, Float f7) {
        J.c(new q7(this, z10, str, j10, j11, f7));
    }

    public final float t(String str, float f7) {
        m7 m7Var;
        if (!TextUtils.isEmpty(str) && (m7Var = (m7) this.f14746w.get(str)) != null) {
            ArrayList arrayList = m7Var.N;
            long j10 = m7Var.f16876b0;
            if (j10 != 0 && arrayList != null) {
                return (((float) m7Var.h((int) (((float) j10) * f7), j10, arrayList)) / ((float) m7Var.f16876b0)) + f7;
            }
        }
        return 0.0f;
    }

    public final void y(ArrayList arrayList) {
        arrayList.clear();
        arrayList.addAll(getDownloadController().G);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((jj) arrayList.get(i10)).Q = true;
        }
    }
}
