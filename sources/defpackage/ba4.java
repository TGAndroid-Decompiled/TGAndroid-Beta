package defpackage;

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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ba4 extends pf0 {
    public static Pattern J;
    public static volatile co3 K = new co3("fileUploadQueue");
    public static SparseArray L = null;
    public static final ba4[] M = new ba4[4];
    public static final v94 N = new Object();
    public final HashMap E;
    public pk5 F;
    public int G;
    public final ConcurrentHashMap H;
    public final w94 I;
    public int a;
    public final u20[] b;
    public final u20[] c;
    public final la4 d;
    public final LinkedList e;
    public final LinkedList f;
    public final ConcurrentHashMap h;
    public final ConcurrentHashMap n;
    public int r;
    public int s;
    public final ConcurrentHashMap w;
    public final ConcurrentHashMap x;
    public final HashMap y;

    public ba4(int i) {
        super(i);
        this.b = new u20[5];
        this.c = new u20[5];
        this.e = new LinkedList();
        this.f = new LinkedList();
        this.h = new ConcurrentHashMap();
        this.n = new ConcurrentHashMap();
        this.r = 0;
        this.s = 0;
        this.w = new ConcurrentHashMap();
        this.x = new ConcurrentHashMap(10, 1.0f, 2);
        this.y = new HashMap();
        this.E = new HashMap();
        this.F = null;
        this.H = new ConcurrentHashMap();
        this.I = new w94(this, (byte) 0);
        this.d = new la4(i);
        int i2 = 0;
        while (true) {
            u20[] u20VarArr = this.b;
            if (i2 >= u20VarArr.length) {
                break;
            }
            u20VarArr[i2] = new u20(i, 0, K);
            this.c[i2] = new u20(i, 1, K);
            i2++;
        }
        if (!w01.a) {
            return;
        }
        K.a(this.I);
        K.d(this.I, 10000L);
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
            for (int i = 0; i < document.attributes.size(); i++) {
                TLRPC.DocumentAttribute documentAttribute = document.attributes.get(i);
                if (documentAttribute instanceof TLRPC.TL_documentAttributeFilename) {
                    str = documentAttribute.file_name;
                }
            }
            str3 = str;
        }
        String q = q(str3);
        if (q != null) {
            return q;
        }
        return "";
    }

    public static String C(String str) {
        if (str != null) {
            char c = 65535;
            switch (str.hashCode()) {
                case 187091926:
                    if (str.equals("audio/ogg")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1331848029:
                    if (str.equals("video/mp4")) {
                        c = 1;
                        break;
                    }
                    break;
                case 2039520277:
                    if (str.equals("video/x-matroska")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
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

    public static ka4 E(Object obj) {
        if (obj instanceof String) {
            String str = (String) obj;
            if (str.startsWith("sent_")) {
                Pattern pattern = J;
                if (pattern == null) {
                    pattern = Pattern.compile("sent_.*_([0-9]+)_([0-9]+)_([0-9]+)_([0-9]+)");
                    J = pattern;
                }
                try {
                    Matcher matcher = pattern.matcher(str);
                    if (matcher.matches()) {
                        ?? obj2 = new Object();
                        obj2.b = Integer.parseInt(matcher.group(1));
                        obj2.a = Long.parseLong(matcher.group(2));
                        obj2.c = Integer.parseInt(matcher.group(3));
                        obj2.d = Long.parseLong(matcher.group(4));
                        return obj2;
                    }
                    return null;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return null;
                }
            }
            return null;
        } else if (obj instanceof k27) {
            k27 k27Var = (k27) obj;
            ?? obj3 = new Object();
            obj3.b = k27Var.e1();
            obj3.a = k27.B0(k27Var.k);
            obj3.c = k27Var.D;
            obj3.d = k27Var.S1();
            return obj3;
        } else if (obj instanceof TL_stories.StoryItem) {
            ?? obj4 = new Object();
            obj4.a = ((TL_stories.StoryItem) obj).dialogId;
            obj4.c = 23;
            return obj4;
        } else {
            return null;
        }
    }

    public static ba4 G(int i) {
        ba4 ba4Var;
        ba4[] ba4VarArr = M;
        ba4 ba4Var2 = ba4VarArr[i];
        if (ba4Var2 == null) {
            synchronized (ba4.class) {
                ba4Var = ba4VarArr[i];
                if (ba4Var == null) {
                    ba4Var = new ba4(i);
                    ba4VarArr[i] = ba4Var;
                }
            }
            return ba4Var;
        }
        return ba4Var2;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba4.J(org.telegram.tgnet.TLObject, java.lang.String, boolean, boolean):java.io.File");
    }

    public static File K(TLObject tLObject, boolean z) {
        return J(tLObject, null, z, true);
    }

    public static File L(TLRPC.Message message) {
        return M(message, false, true);
    }

    public static File M(TLRPC.Message message, boolean z, boolean z2) {
        TLRPC.PhotoSize w;
        TLRPC.PhotoSize w2;
        TLRPC.PhotoSize w3;
        if (message == null) {
            return new File("");
        }
        boolean z3 = false;
        if (message instanceof TLRPC.TL_messageService) {
            TLRPC.Photo photo = message.action.photo;
            if (photo != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
                if (arrayList.size() > 0 && (w3 = w(arrayList, gl.Y0(false), false, null, false)) != null) {
                    return J(w3, null, z, z2);
                }
            }
        } else if (k27.n1(message) instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.Document document = k27.n1(message).document;
            if (z || k27.n1(message).ttl_seconds != 0) {
                z3 = true;
            }
            return J(document, null, z3, z2);
        } else if (k27.n1(message) instanceof TLRPC.TL_messageMediaPhoto) {
            ArrayList<TLRPC.PhotoSize> arrayList2 = k27.n1(message).photo.sizes;
            if (arrayList2.size() > 0 && (w2 = w(arrayList2, gl.Y0(true), false, null, true)) != null) {
                if (z || k27.n1(message).ttl_seconds != 0) {
                    z3 = true;
                }
                return J(w2, null, z3, z2);
            }
        } else if (k27.n1(message) instanceof TLRPC.TL_messageMediaWebPage) {
            if (k27.n1(message).webpage.document != null) {
                return J(k27.n1(message).webpage.document, null, z, z2);
            }
            if (k27.n1(message).webpage.photo != null) {
                ArrayList<TLRPC.PhotoSize> arrayList3 = k27.n1(message).webpage.photo.sizes;
                if (arrayList3.size() > 0 && (w = w(arrayList3, gl.Y0(false), false, null, false)) != null) {
                    return J(w, null, z, z2);
                }
            }
        } else if (k27.n1(message) instanceof TLRPC.TL_messageMediaInvoice) {
            return J(((TLRPC.TL_messageMediaInvoice) k27.n1(message)).photo, null, true, z2);
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
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) arrayList.get(i);
            if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                return (TLRPC.TL_photoStrippedSize) photoSize;
            }
        }
        return null;
    }

    public static TLRPC.VideoSize R(TLRPC.Photo photo) {
        if (photo != null && photo.video_sizes != null) {
            for (int i = 0; i < photo.video_sizes.size(); i++) {
                TLRPC.VideoSize videoSize = photo.video_sizes.get(i);
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
            for (int i = 0; i < size; i++) {
                TLRPC.FileLocation fileLocation = photo.sizes.get(i).location;
                if (fileLocation != null && fileLocation.local_id == tL_fileLocationToBeDeprecated.local_id && fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                    return true;
                }
            }
            if ((-tL_fileLocationToBeDeprecated.volume_id) == photo.id) {
                return true;
            }
        }
        return false;
    }

    public static void a(CountDownLatch countDownLatch, boolean z) {
        try {
            countDownLatch.await();
        } catch (Exception e) {
            fa4.g(e, false);
            if (z) {
                a(countDownLatch, false);
            }
        }
    }

    public static File j(int i) {
        return (File) L.get(i);
    }

    public static boolean m(int i, long j) {
        boolean p = y6c.h(j5.a(i).a).p();
        if (j >= 2097152000) {
            if (j >= 4194304000L || !p) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static void o(GZIPInputStream gZIPInputStream, File file) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        byte[] bArr = new byte[4096];
        int i = 0;
        do {
            int read = gZIPInputStream.read(bArr);
            if (read <= 0) {
                break;
            }
            Thread.yield();
            fileOutputStream.write(bArr, 0, read);
            i += read;
        } while (i < 2097152);
        fileOutputStream.getFD().sync();
        fileOutputStream.close();
    }

    public static void p(int i, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        K.c(new s94(arrayList, i));
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
            int length = str2.length();
            int i = document.dc_id;
            if (length > 1) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append("_");
                return ls6.p(sb, document.id, str2);
            }
            return i + "_" + document.id;
        } else if (tLObject instanceof uu9) {
            TLRPC.TL_secureFile tL_secureFile = ((uu9) tLObject).b;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_secureFile.dc_id);
            sb2.append("_");
            return ls6.p(sb2, tL_secureFile.id, ".jpg");
        } else if (tLObject instanceof TLRPC.TL_secureFile) {
            TLRPC.TL_secureFile tL_secureFile2 = (TLRPC.TL_secureFile) tLObject;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(tL_secureFile2.dc_id);
            sb3.append("_");
            return ls6.p(sb3, tL_secureFile2.id, ".jpg");
        } else if (tLObject instanceof usc) {
            usc uscVar = (usc) tLObject;
            return Utilities.a(uscVar.a) + "." + fl5.x(uscVar.a, H(uscVar.e));
        } else {
            if (tLObject instanceof TLRPC.PhotoSize) {
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tLObject;
                TLRPC.FileLocation fileLocation = photoSize.location;
                if (fileLocation != null && !(fileLocation instanceof TLRPC.TL_fileLocationUnavailable)) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(photoSize.location.volume_id);
                    sb4.append("_");
                    sb4.append(photoSize.location.local_id);
                    sb4.append(".");
                    if (str == null) {
                        str = "jpg";
                    }
                    sb4.append(str);
                    return sb4.toString();
                }
            } else if (tLObject instanceof TLRPC.TL_videoSize) {
                TLRPC.TL_videoSize tL_videoSize = (TLRPC.TL_videoSize) tLObject;
                TLRPC.FileLocation fileLocation2 = tL_videoSize.location;
                if (fileLocation2 != null && !(fileLocation2 instanceof TLRPC.TL_fileLocationUnavailable)) {
                    StringBuilder sb5 = new StringBuilder();
                    sb5.append(tL_videoSize.location.volume_id);
                    sb5.append("_");
                    sb5.append(tL_videoSize.location.local_id);
                    sb5.append(".");
                    if (str == null) {
                        str = "mp4";
                    }
                    sb5.append(str);
                    return sb5.toString();
                }
            } else if (tLObject instanceof TLRPC.FileLocation) {
                if (!(tLObject instanceof TLRPC.TL_fileLocationUnavailable)) {
                    TLRPC.FileLocation fileLocation3 = (TLRPC.FileLocation) tLObject;
                    StringBuilder sb6 = new StringBuilder();
                    sb6.append(fileLocation3.volume_id);
                    sb6.append("_");
                    sb6.append(fileLocation3.local_id);
                    sb6.append(".");
                    if (str == null) {
                        str = "jpg";
                    }
                    sb6.append(str);
                    return sb6.toString();
                }
            } else if (tLObject instanceof TLRPC.UserProfilePhoto) {
                TLRPC.UserProfilePhoto userProfilePhoto = (TLRPC.UserProfilePhoto) tLObject;
                if (userProfilePhoto.photo_small != null) {
                    if ("s".equals("s")) {
                        return r(str, userProfilePhoto.photo_small);
                    }
                    return r(str, userProfilePhoto.photo_big);
                }
                StringBuilder sb7 = new StringBuilder();
                sb7.append(userProfilePhoto.photo_id);
                sb7.append("_s.");
                if (str == null) {
                    str = "jpg";
                }
                sb7.append(str);
                return sb7.toString();
            } else if (tLObject instanceof TLRPC.ChatPhoto) {
                TLRPC.ChatPhoto chatPhoto = (TLRPC.ChatPhoto) tLObject;
                if (chatPhoto.photo_small != null) {
                    if ("s".equals(null)) {
                        return r(str, chatPhoto.photo_small);
                    }
                    return r(str, chatPhoto.photo_big);
                }
                StringBuilder sb8 = new StringBuilder();
                sb8.append(chatPhoto.photo_id);
                sb8.append("_null.");
                if (str == null) {
                    str = "jpg";
                }
                sb8.append(str);
                return sb8.toString();
            }
            return "";
        }
    }

    public static String s(TLObject tLObject) {
        return r(null, tLObject);
    }

    public static TLRPC.PhotoSize u(int i, ArrayList arrayList) {
        return w(arrayList, i, false, null, false);
    }

    public static TLRPC.PhotoSize v(int i, ArrayList arrayList, boolean z) {
        return w(arrayList, i, z, null, false);
    }

    public static org.telegram.tgnet.TLRPC.PhotoSize w(java.util.ArrayList r8, int r9, boolean r10, org.telegram.tgnet.TLRPC.PhotoSize r11, boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba4.w(java.util.ArrayList, int, boolean, org.telegram.tgnet.TLRPC$PhotoSize, boolean):org.telegram.tgnet.TLRPC$PhotoSize");
    }

    public static TLRPC.VideoSize x(int i, ArrayList arrayList) {
        TLRPC.FileLocation fileLocation;
        TLRPC.VideoSize videoSize = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i2 = 0;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                TLRPC.VideoSize videoSize2 = (TLRPC.VideoSize) arrayList.get(i3);
                if (videoSize2 != null && !(videoSize2 instanceof TLRPC.TL_videoSizeEmojiMarkup) && !(videoSize2 instanceof TLRPC.TL_videoSizeStickerMarkup)) {
                    int max = Math.max(videoSize2.w, videoSize2.h);
                    if (videoSize == null || ((i > 100 && (fileLocation = videoSize.location) != null && fileLocation.dc_id == Integer.MIN_VALUE) || (max <= i && i2 < max))) {
                        videoSize = videoSize2;
                        i2 = max;
                    }
                }
            }
        }
        return videoSize;
    }

    public static File z(int i) {
        File file = (File) L.get(i);
        if (file == null && i != 4) {
            file = (File) L.get(4);
        }
        if (w01.b && file != null) {
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
        int i = this.G;
        this.G = i + 1;
        this.H.put(Integer.valueOf(i), obj);
        return i;
    }

    public final int O(int i) {
        int i2;
        int i3;
        if (i == 4) {
            return Integer.MAX_VALUE;
        }
        if (i == 3) {
            i2 = this.a;
            this.a = i2 + 1;
            i3 = 1048577;
        } else if (i == 2) {
            i2 = this.a;
            this.a = i2 + 1;
            i3 = 65537;
        } else if (i == 1) {
            return 65536;
        } else {
            return 0;
        }
        return i2 + i3;
    }

    public final void P(ArrayList arrayList) {
        arrayList.clear();
        arrayList.addAll(getDownloadController().I);
        for (int i = 0; i < arrayList.size(); i++) {
            ((k27) arrayList.get(i)).Q = true;
        }
    }

    public final boolean S(String str) {
        if (str != null && this.x.containsKey(str)) {
            return true;
        }
        return false;
    }

    public final boolean T(TLRPC.Document document, boolean z) {
        String str;
        if (document != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(r(null, document));
            if (z) {
                str = "p";
            } else {
                str = "";
            }
            sb.append(str);
            if (this.E.containsKey(sb.toString())) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void V(gl5 gl5Var, Object obj, String str, int i, int i2) {
        int i3;
        if (gl5Var == null) {
            return;
        }
        if (i2 == 0 && (gl5Var.c != null || (gl5Var.k != null && gl5Var.r() == 0))) {
            i3 = 1;
        } else {
            i3 = i2;
        }
        W(gl5Var.i, gl5Var.h, gl5Var.v, gl5Var.f, gl5Var, obj, str, gl5Var.r(), i, i3);
    }

    public final void W(final TLRPC.Document document, final uu9 uu9Var, final usc uscVar, final TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated, final gl5 gl5Var, final Object obj, final String str, final long j, final int i, final int i2) {
        String str2;
        if (tL_fileLocationToBeDeprecated != null) {
            str2 = r(str, tL_fileLocationToBeDeprecated);
        } else {
            str2 = null;
            if (document != null) {
                str2 = r(null, document);
            } else if (uscVar != null) {
                str2 = r(null, uscVar);
            }
        }
        String str3 = str2;
        ?? r0 = new Runnable() {
            @Override
            public final void run() {
                ba4.this.Y(document, uu9Var, uscVar, tL_fileLocationToBeDeprecated, gl5Var, obj, str, j, i, null, 0L, false, i2);
            }
        };
        if (i2 != 10 && !TextUtils.isEmpty(str3) && !str3.contains("-2147483648")) {
            ?? obj2 = new Object();
            obj2.a = r0;
            this.x.put(str3, obj2);
        }
        K.c(r0);
    }

    public final void X(TLRPC.Document document, Object obj, int i, int i2) {
        int i3;
        if (document == null) {
            return;
        }
        if (i2 == 0 && document.key != null) {
            i3 = 1;
        } else {
            i3 = i2;
        }
        W(document, null, null, null, null, obj, null, 0L, i, i3);
    }

    public final defpackage.l94 Y(org.telegram.tgnet.TLRPC.Document r32, defpackage.uu9 r33, defpackage.usc r34, org.telegram.tgnet.TLRPC.TL_fileLocationToBeDeprecated r35, defpackage.gl5 r36, java.lang.Object r37, java.lang.String r38, long r39, int r41, defpackage.m94 r42, long r43, boolean r45, int r46) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba4.Y(org.telegram.tgnet.TLRPC$Document, uu9, usc, org.telegram.tgnet.TLRPC$TL_fileLocationToBeDeprecated, gl5, java.lang.Object, java.lang.String, long, int, m94, long, boolean, int):l94");
    }

    public final void Z(TLRPC.Document document, boolean z, boolean z2) {
        if (document == null) {
            return;
        }
        if (z2) {
            gl.d3(new x94(this, document, z, (byte) 1));
        } else {
            a0(document, z);
        }
    }

    public final void a0(TLRPC.Document document, boolean z) {
        String str;
        String r = r(null, document);
        StringBuilder r2 = tb4.r(r);
        if (z) {
            str = "p";
        } else {
            str = "";
        }
        r2.append(str);
        if (this.E.remove(r2.toString()) != null) {
            getNotificationCenter().k(kk7.g1, r);
        }
    }

    public final void b(String str, boolean z) {
        if (str == null) {
            return;
        }
        K.c(new mn6(this, z, str, (byte) 20));
    }

    public final void b0(TLRPC.Document document, boolean z, boolean z2) {
        if (document == null) {
            return;
        }
        if (z2) {
            gl.d3(new x94(this, document, z, (byte) 0));
        } else {
            d0(document, z);
        }
    }

    public final void c() {
        u94 u94Var;
        for (String str : this.x.keySet()) {
            aa4 aa4Var = (aa4) this.x.get(str);
            if (aa4Var != null) {
                u94Var = aa4Var.a;
            } else {
                u94Var = null;
            }
            if (u94Var != null) {
                K.a(u94Var);
            }
            K.c(new t94(this, str, (byte) 0));
        }
    }

    public final void c0(TLRPC.Document document, boolean z) {
        String str;
        if (document != null) {
            String r = r(null, document);
            StringBuilder r2 = tb4.r(r);
            String str2 = "p";
            if (!z) {
                str = "p";
            } else {
                str = "";
            }
            r2.append(str);
            String sb = r2.toString();
            HashMap hashMap = this.E;
            if (hashMap.containsKey(sb)) {
                StringBuilder r3 = tb4.r(r);
                if (!z) {
                    str2 = "";
                }
                r3.append(str2);
                hashMap.put(r3.toString(), Boolean.TRUE);
                getNotificationCenter().k(kk7.g1, r);
            }
        }
    }

    public final void d(TLRPC.Document document) {
        f(document);
    }

    public final void d0(TLRPC.Document document, boolean z) {
        String str;
        String r = r(null, document);
        StringBuilder r2 = tb4.r(r);
        if (z) {
            str = "p";
        } else {
            str = "";
        }
        r2.append(str);
        this.E.put(r2.toString(), Boolean.TRUE);
        getNotificationCenter().k(kk7.g1, r);
    }

    public final void e(TLRPC.Document document, uu9 uu9Var, usc uscVar, TLRPC.FileLocation fileLocation, String str, String str2) {
        boolean z;
        if (fileLocation != null || document != null || uscVar != null || uu9Var != null || !TextUtils.isEmpty(str2)) {
            u94 u94Var = null;
            if (fileLocation != null) {
                str2 = r(str, fileLocation);
            } else if (document != null) {
                str2 = r(null, document);
            } else if (uu9Var != null) {
                str2 = r(null, uu9Var);
            } else if (uscVar != null) {
                str2 = r(null, uscVar);
            }
            aa4 aa4Var = (aa4) this.x.remove(str2);
            if (aa4Var != null) {
                u94Var = aa4Var.a;
                z = true;
            } else {
                z = false;
            }
            if (u94Var != null) {
                K.a(u94Var);
            }
            K.c(new t94(this, str2, (byte) 1));
            if (z && document != null) {
                gl.d3(new w94(this, (byte) 1));
            }
        }
    }

    public final void e0(String str, TLObject tLObject) {
        boolean z = tLObject instanceof TLRPC.Document;
        la4 la4Var = this.d;
        int i = 4;
        if (z) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            if (document.key == null) {
                if (k27.P4(document)) {
                    i = 1;
                } else if (k27.J4(document)) {
                    i = 2;
                } else {
                    i = 3;
                }
            }
            int i2 = i;
            long j = document.id;
            int i3 = document.dc_id;
            la4Var.getClass();
            la4Var.h(new ja4(la4Var, j, i3, i2, str, 1));
        } else if (tLObject instanceof TLRPC.PhotoSize) {
            TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) tLObject;
            if (!(photoSize instanceof TLRPC.TL_photoStrippedSize) && !(photoSize instanceof TLRPC.TL_photoPathSize)) {
                TLRPC.FileLocation fileLocation = photoSize.location;
                if (fileLocation != null && fileLocation.key == null && ((fileLocation.volume_id != -2147483648L || fileLocation.local_id >= 0) && photoSize.size >= 0)) {
                    i = 0;
                }
                la4Var.getClass();
                la4Var.h(new ja4(la4Var, fileLocation.volume_id, fileLocation.dc_id + (fileLocation.local_id << 16), i, str, 1));
            }
        }
    }

    public final void f(TLRPC.Document document) {
        e(document, null, null, null, null, null);
    }

    public final void f0(final p8c p8cVar, final String str) {
        final eu3 eu3Var = new eu3(this, r0, (byte) 20);
        gk7[] gk7VarArr = {new gk7() {
            @Override
            public final void didReceivedNotification(int i, int i2, Object[] objArr) {
                int i3 = kk7.T1;
                String str2 = str;
                p8c p8cVar2 = p8cVar;
                eu3 eu3Var2 = eu3Var;
                if (i == i3) {
                    if (objArr[0] == str2) {
                        p8cVar2.a((TLRPC.InputFile) objArr[1]);
                        eu3Var2.run();
                    }
                } else if (i == kk7.U1 && objArr[0] == str2) {
                    p8cVar2.a(null);
                    eu3Var2.run();
                }
            }
        }};
        getNotificationCenter().a(gk7VarArr[0], kk7.T1);
        getNotificationCenter().a(gk7VarArr[0], kk7.U1);
        h0(false, 67108864, str, false);
    }

    public final void g(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            e(null, null, null, null, null, (String) arrayList.get(i));
        }
    }

    public final void g0(final String str, final boolean z, final boolean z2, final long j, final int i, final boolean z3) {
        if (str == null) {
            return;
        }
        K.c(new Runnable() {
            @Override
            public final void run() {
                long j2;
                ba4 ba4Var = ba4.this;
                HashMap hashMap = ba4Var.y;
                ConcurrentHashMap concurrentHashMap = ba4Var.h;
                ConcurrentHashMap concurrentHashMap2 = ba4Var.n;
                boolean z4 = z;
                String str2 = str;
                if (z4) {
                    if (concurrentHashMap2.containsKey(str2)) {
                        return;
                    }
                } else if (concurrentHashMap.containsKey(str2)) {
                    return;
                }
                long j3 = j;
                int i2 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
                if (i2 != 0 && ((Long) hashMap.get(str2)) != null) {
                    hashMap.remove(str2);
                    j2 = 0;
                } else {
                    j2 = j3;
                }
                String str3 = str2;
                qb4 qb4Var = new qb4(ba4Var.currentAccount, i, j2, str3, z4);
                pk5 pk5Var = ba4Var.F;
                if (pk5Var != null && i2 != 0) {
                    pk5Var.a(qb4Var, str3, 0L, j3, z4);
                    qb4Var = qb4Var;
                    str3 = str3;
                    z4 = z4;
                }
                if (z4) {
                    concurrentHashMap2.put(str3, qb4Var);
                } else {
                    concurrentHashMap.put(str3, qb4Var);
                }
                if (z3) {
                    qb4Var.E = true;
                }
                boolean z5 = z2;
                qb4Var.o = new y94(ba4Var, z4, str3, z5);
                if (z5) {
                    int i3 = ba4Var.s;
                    if (i3 < 1) {
                        ba4Var.s = i3 + 1;
                        qb4Var.c();
                        return;
                    }
                    ba4Var.f.add(qb4Var);
                    return;
                }
                int i4 = ba4Var.r;
                if (i4 < 1) {
                    ba4Var.r = i4 + 1;
                    qb4Var.c();
                    return;
                }
                ba4Var.e.add(qb4Var);
            }
        });
    }

    public final void h(int i, TLRPC.Document document, uu9 uu9Var, usc uscVar, TLRPC.FileLocation fileLocation, String str) {
        String str2;
        if (fileLocation == null && document == null && uscVar == null && uu9Var == null) {
            return;
        }
        if (fileLocation != null) {
            str2 = r(str, fileLocation);
        } else if (document != null) {
            str2 = r(null, document);
        } else if (uu9Var != null) {
            str2 = r(null, uu9Var);
        } else if (uscVar != null) {
            str2 = r(null, uscVar);
        } else {
            str2 = null;
        }
        K.c(new o94(this, str2, i, (byte) 0));
    }

    public final void h0(boolean z, int i, String str, boolean z2) {
        g0(str, z, z2, 0L, i, false);
    }

    public final void i() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList(getDownloadController().I);
        for (int i = 0; i < arrayList2.size(); i++) {
            ((k27) arrayList2.get(i)).K(true);
            if (((k27) arrayList2.get(i)).z0) {
                arrayList.add((k27) arrayList2.get(i));
            }
        }
        if (!arrayList.isEmpty()) {
            gl.d3(new eu3(this, arrayList, (byte) 21));
        }
    }

    public final boolean k(String str) {
        l94 l94Var;
        if (str == null || (l94Var = (l94) this.w.get(str)) == null || !l94Var.l) {
            return false;
        }
        l94Var.l = false;
        return true;
    }

    public final void l(ArrayList arrayList) {
        la4 la4Var = this.d;
        la4Var.getClass();
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            long currentTimeMillis = System.currentTimeMillis();
            long[] jArr = new long[1];
            hn1 hn1Var = new hn1(la4Var, arrayList2, jArr, countDownLatch, (byte) 17);
            la4Var.d();
            co3 co3Var = la4Var.a;
            Handler handler = co3Var.a;
            if (handler != null) {
                handler.postAtFrontOfQueue(hn1Var);
            } else {
                synchronized (co3Var.b) {
                    ArrayList arrayList3 = co3Var.c;
                    if (arrayList3 != null) {
                        arrayList3.add(new bo3(1, 0L, hn1Var));
                    } else {
                        co3Var.a.postAtFrontOfQueue(hn1Var);
                    }
                }
            }
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                fa4.g(e, true);
            }
            StringBuilder sb = new StringBuilder("checkMediaExistance size=");
            sb.append(arrayList.size());
            sb.append(" time=");
            sb.append(System.currentTimeMillis() - currentTimeMillis);
            sb.append(" thread_time=");
            ug8.q(jArr[0], sb);
            boolean z = w01.a;
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                fa4.g(new Exception("warning, not allowed in main thread"), true);
            }
        }
    }

    public final void n(String str, boolean z, long j, long j2, Float f) {
        K.c(new q94(this, z, str, j, j2, f));
    }

    public final float t(String str, float f) {
        l94 l94Var;
        if (!TextUtils.isEmpty(str) && (l94Var = (l94) this.w.get(str)) != null) {
            ArrayList arrayList = l94Var.N;
            long j = l94Var.b0;
            if (j != 0 && arrayList != null) {
                return (((float) l94Var.f((int) (((float) j) * f), j, arrayList)) / ((float) l94Var.b0)) + f;
            }
        }
        return 0.0f;
    }

    public final void y(ArrayList arrayList) {
        arrayList.clear();
        arrayList.addAll(getDownloadController().H);
        for (int i = 0; i < arrayList.size(); i++) {
            ((k27) arrayList.get(i)).Q = true;
        }
    }
}
