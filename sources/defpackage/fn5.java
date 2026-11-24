package defpackage;

import android.app.ActivityManager;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.zip.GZIPInputStream;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fn5 {
    public static Bitmap M;
    public final ConcurrentHashMap A;
    public final LinkedList B;
    public final HashMap C;
    public final HashMap D;
    public int E;
    public String F;
    public int G;
    public File H;
    public final lm5 b;
    public final lm5 c;
    public final mm5 d;
    public final lm5 e;
    public final ix2 p;
    public final mp3 q;
    public final mp3 r;
    public final mp3 s;
    public final HashMap t;
    public final ConcurrentHashMap u;
    public final HashMap v;
    public final HashMap w;
    public int x;
    public int y;
    public final boolean z;
    public static final ThreadLocal I = new ThreadLocal();
    public static final ThreadLocal J = new ThreadLocal();
    public static final byte[] K = new byte[12];
    public static final byte[] L = new byte[12];
    public static volatile fn5 N = null;
    public final HashMap a = new HashMap();
    public final ArrayList f = new ArrayList();
    public final HashMap g = new HashMap();
    public final HashMap h = new HashMap();
    public final ConcurrentHashMap i = new ConcurrentHashMap();
    public final HashSet j = new HashSet();
    public final SparseArray k = new SparseArray();
    public final HashMap l = new HashMap();
    public final SparseArray m = new SparseArray();
    public final LinkedList n = new LinkedList();
    public final LinkedList o = new LinkedList();

    public fn5() {
        boolean z;
        int i;
        ix2 ix2Var = new ix2((byte) 1);
        ix2Var.b = new pp3(ix2Var, new PriorityBlockingQueue(10, new ju6((byte) 6)));
        this.p = ix2Var;
        this.q = new mp3("cacheThumbOutQueue");
        mp3 mp3Var = new mp3("thumbGeneratingQueue");
        this.r = mp3Var;
        this.s = new mp3("imageLoadQueue");
        this.t = new HashMap();
        this.u = new ConcurrentHashMap();
        this.v = new HashMap();
        this.w = new HashMap();
        this.x = 0;
        this.y = 0;
        this.A = new ConcurrentHashMap();
        this.B = new LinkedList();
        this.C = new HashMap();
        this.D = new HashMap();
        this.E = 0;
        this.F = null;
        this.G = 0;
        this.H = null;
        mp3Var.setPriority(1);
        int memoryClass = ((ActivityManager) a.b.getSystemService("activity")).getMemoryClass();
        if (memoryClass >= 192) {
            z = true;
        } else {
            z = false;
        }
        this.z = z;
        if (z) {
            i = 30;
        } else {
            i = 15;
        }
        int min = Math.min(i, memoryClass / 7) << 20;
        float f = min;
        this.c = new lm5(this, (int) (0.8f * f), (byte) 0);
        this.b = new lm5(this, (int) (f * 0.2f), (byte) 1);
        this.d = new ir(min / 4);
        this.e = new lm5(this);
        SparseArray sparseArray = new SparseArray();
        File D0 = gm.D0();
        if (!D0.isDirectory()) {
            try {
                D0.mkdirs();
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        gm.G(new File(D0, ".nomedia"));
        sparseArray.put(4, D0);
        for (int i2 = 0; i2 < 4; i2++) {
            bc4.G(i2).F = new pm5(this, i2);
        }
        bc4.L = sparseArray;
        zk zkVar = new zk(this, (byte) 5);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.MEDIA_BAD_REMOVAL");
        intentFilter.addAction("android.intent.action.MEDIA_CHECKING");
        intentFilter.addAction("android.intent.action.MEDIA_EJECT");
        intentFilter.addAction("android.intent.action.MEDIA_MOUNTED");
        intentFilter.addAction("android.intent.action.MEDIA_NOFS");
        intentFilter.addAction("android.intent.action.MEDIA_REMOVED");
        intentFilter.addAction("android.intent.action.MEDIA_SHARED");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTABLE");
        intentFilter.addAction("android.intent.action.MEDIA_UNMOUNTED");
        intentFilter.addDataScheme("file");
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                a.b.registerReceiver(zkVar, intentFilter, 4);
            } else {
                a.b.registerReceiver(zkVar, intentFilter);
            }
        } catch (Throwable unused) {
        }
        e(null);
    }

    public static File A() {
        File file = a.b.getExternalMediaDirs()[0];
        if (!TextUtils.isEmpty(gda.e0)) {
            for (int i = 0; i < a.b.getExternalMediaDirs().length; i++) {
                File file2 = a.b.getExternalMediaDirs()[i];
                if (file2 != null && file2.getPath().startsWith(gda.e0)) {
                    file = a.b.getExternalMediaDirs()[i];
                }
            }
        }
        return file;
    }

    public static Bitmap B(String str, byte[] bArr) {
        boolean z;
        Bitmap.Config config;
        if (bArr != null && bArr.length >= 3) {
            try {
                int length = bArr.length;
                byte[] bArr2 = ld1.a;
                byte[] bArr3 = ld1.b;
                int i = length + 622;
                ThreadLocal threadLocal = I;
                byte[] bArr4 = (byte[]) threadLocal.get();
                if (bArr4 == null || bArr4.length < i) {
                    bArr4 = null;
                }
                if (bArr4 == null) {
                    bArr4 = new byte[i];
                    threadLocal.set(bArr4);
                }
                System.arraycopy(bArr2, 0, bArr4, 0, 623);
                System.arraycopy(bArr, 3, bArr4, 623, bArr.length - 3);
                System.arraycopy(bArr3, 0, bArr4, bArr.length + 620, 2);
                bArr4[164] = bArr[1];
                bArr4[166] = bArr[2];
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (!TextUtils.isEmpty(str) && str.contains("r")) {
                    z = true;
                } else {
                    z = false;
                }
                if (!gda.j() && !z) {
                    config = Bitmap.Config.RGB_565;
                } else {
                    config = Bitmap.Config.ARGB_8888;
                }
                options.inPreferredConfig = config;
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr4, 0, i, options);
                if (decodeByteArray == null) {
                    return C();
                }
                if (z) {
                    Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray.getWidth(), decodeByteArray.getHeight(), decodeByteArray.getConfig());
                    Canvas canvas = new Canvas(createBitmap);
                    canvas.save();
                    canvas.scale(1.2f, 1.2f, decodeByteArray.getWidth() / 2.0f, decodeByteArray.getHeight() / 2.0f);
                    canvas.drawBitmap(decodeByteArray, 0.0f, 0.0f, (Paint) null);
                    canvas.restore();
                    Path path = new Path();
                    path.addCircle(decodeByteArray.getWidth() / 2.0f, decodeByteArray.getHeight() / 2.0f, Math.min(decodeByteArray.getWidth(), decodeByteArray.getHeight()) / 2.0f, Path.Direction.CW);
                    canvas.clipPath(path);
                    canvas.drawBitmap(decodeByteArray, 0.0f, 0.0f, (Paint) null);
                    decodeByteArray.recycle();
                    decodeByteArray = createBitmap;
                }
                if (!TextUtils.isEmpty(str) && str.contains("b")) {
                    Utilities.blurBitmap(decodeByteArray, 3);
                }
                return decodeByteArray;
            } catch (Exception e) {
                fc4.g(e, true);
                return C();
            }
        }
        return C();
    }

    public static synchronized Bitmap C() {
        Bitmap bitmap;
        synchronized (fn5.class) {
            Bitmap bitmap2 = M;
            if (bitmap2 == null || bitmap2.isRecycled()) {
                Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                M = createBitmap;
                createBitmap.eraseColor(-16777216);
            }
            bitmap = M;
        }
        return bitmap;
    }

    public static boolean E(String str) {
        if (str != null && str.endsWith("avatar")) {
            return true;
        }
        return false;
    }

    public static android.graphics.Bitmap G(java.lang.String r18, android.net.Uri r19, float r20, float r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fn5.G(java.lang.String, android.net.Uri, float, float, boolean):android.graphics.Bitmap");
    }

    public static void R(org.telegram.tgnet.TLRPC.Message r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fn5.R(org.telegram.tgnet.TLRPC$Message):void");
    }

    public static void S(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i = 0; i < arrayList.size(); i++) {
                R((TLRPC.Message) arrayList.get(i));
            }
        }
    }

    public static TLRPC.PhotoSize T(Bitmap bitmap, float f, float f2, int i, int i2, int i3) {
        return W(null, bitmap, Bitmap.CompressFormat.JPEG, f, f2, i, false, i2, i3, false);
    }

    public static TLRPC.PhotoSize U(Bitmap bitmap, float f, float f2, int i, boolean z) {
        return W(null, bitmap, Bitmap.CompressFormat.JPEG, f, f2, i, z, 0, 0, false);
    }

    public static TLRPC.PhotoSize V(Bitmap bitmap, Bitmap.CompressFormat compressFormat, float f, float f2, int i) {
        return W(null, bitmap, compressFormat, f, f2, i, false, 101, 101, false);
    }

    public static org.telegram.tgnet.TLRPC.PhotoSize W(org.telegram.tgnet.TLRPC.PhotoSize r17, android.graphics.Bitmap r18, android.graphics.Bitmap.CompressFormat r19, float r20, float r21, int r22, boolean r23, int r24, int r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fn5.W(org.telegram.tgnet.TLRPC$PhotoSize, android.graphics.Bitmap, android.graphics.Bitmap$CompressFormat, float, float, int, boolean, int, int, boolean):org.telegram.tgnet.TLRPC$PhotoSize");
    }

    public static org.telegram.tgnet.TLRPC.PhotoSize X(org.telegram.tgnet.TLRPC.PhotoSize r5, android.graphics.Bitmap r6, android.graphics.Bitmap.CompressFormat r7, int r8, int r9, float r10, int r11, boolean r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fn5.X(org.telegram.tgnet.TLRPC$PhotoSize, android.graphics.Bitmap, android.graphics.Bitmap$CompressFormat, int, int, float, int, boolean, boolean, boolean):org.telegram.tgnet.TLRPC$PhotoSize");
    }

    public static boolean Y(Uri uri, String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (str == null && uri != null && uri.getScheme() != null) {
            if (uri.getScheme().contains("file")) {
                str = uri.getPath();
            } else {
                try {
                    str = gm.S0(uri);
                } catch (Throwable th) {
                    fc4.g(th, true);
                }
            }
        }
        if (str != null) {
            BitmapFactory.decodeFile(str, options);
        } else if (uri != null) {
            try {
                InputStream openInputStream = a.b.getContentResolver().openInputStream(uri);
                BitmapFactory.decodeStream(openInputStream, null, options);
                openInputStream.close();
            } catch (Throwable th2) {
                fc4.g(th2, true);
                return false;
            }
        }
        float f = options.outWidth;
        float f2 = options.outHeight;
        if (f / f2 > 10.0f || f2 / f > 10.0f) {
            return true;
        }
        return false;
    }

    public static int Z(BitmapDrawable bitmapDrawable) {
        if (bitmapDrawable instanceof kn) {
            kn knVar = (kn) bitmapDrawable;
            return (Math.max(knVar.getIntrinsicHeight() * knVar.getIntrinsicWidth(), knVar.k0 * knVar.j0) << 2) * 3;
        } else if (bitmapDrawable instanceof p09) {
            p09 p09Var = (p09) bitmapDrawable;
            int i = p09Var.b * p09Var.c;
            if (p09Var.H) {
                return i << 1;
            }
            return i << 3;
        } else {
            return bitmapDrawable.getBitmap().getByteCount();
        }
    }

    public static boolean a0(gn5 gn5Var, String str) {
        if (!str.endsWith("_firstframe") && !str.endsWith("_lastframe")) {
            if ((gn5Var != null && (k47.K2(gn5Var.i, true) || gn5Var.p == 1 || k47.M4(gn5Var.i))) || E(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean b(File file, File file2, int i) {
        File file3;
        File file4;
        byte[] bArr;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                if (i == 0) {
                    file3 = new File(file, "000000000_999999_temp.f");
                    file4 = new File(file2, "000000000_999999.f");
                } else if (i != 3 && i != 5 && i != 6) {
                    if (i == 1) {
                        file3 = new File(file, "000000000_999999_temp.f");
                        file4 = new File(file2, "000000000_999999.f");
                    } else if (i == 2) {
                        file3 = new File(file, "000000000_999999_temp.f");
                        file4 = new File(file2, "000000000_999999.f");
                    } else {
                        file4 = null;
                        file3 = null;
                    }
                } else {
                    file3 = new File(file, "000000000_999999_temp.f");
                    file4 = new File(file2, "000000000_999999.f");
                }
                bArr = new byte[1024];
                file3.createNewFile();
                randomAccessFile = new RandomAccessFile(file3, "rws");
            } catch (Exception e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            randomAccessFile.write(bArr);
            randomAccessFile.close();
            boolean renameTo = file3.renameTo(file4);
            file3.delete();
            file4.delete();
            if (renameTo) {
                return true;
            }
            return false;
        } catch (Exception e2) {
            e = e2;
            randomAccessFile2 = randomAccessFile;
            fc4.g(e, true);
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                    return false;
                } catch (Exception e3) {
                    fc4.g(e3, true);
                    return false;
                }
            }
            return false;
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (Exception e4) {
                    fc4.g(e4, true);
                }
            }
            throw th;
        }
    }

    public static BitmapDrawable i(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) instanceof TLRPC.TL_photoStrippedSize) {
                return new BitmapDrawable(a.b.getResources(), B("b", ((TLRPC.TL_photoStrippedSize) arrayList.get(i)).bytes));
            }
        }
        return null;
    }

    public static String j(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(64);
        if (indexOf >= 0) {
            return str.substring(0, indexOf);
        }
        return str;
    }

    public static String k(File file) {
        StringBuilder sb = new StringBuilder();
        if (file == null) {
            return "";
        }
        try {
            GZIPInputStream gZIPInputStream = new GZIPInputStream(new FileInputStream(file));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream, "UTF-8"));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                    } else {
                        String sb2 = sb.toString();
                        bufferedReader.close();
                        gZIPInputStream.close();
                        return sb2;
                    }
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
        } catch (Exception unused) {
            return "";
        }
    }

    public static TLRPC.TL_photoSize_layer127 m(String str) {
        File z;
        if (str == null) {
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
            tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
            tL_fileLocationToBeDeprecated.dc_id = Integer.MIN_VALUE;
            tL_fileLocationToBeDeprecated.local_id = gda.p();
            tL_fileLocationToBeDeprecated.file_reference = new byte[0];
            TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.location = tL_fileLocationToBeDeprecated;
            tL_photoSize_layer127.w = i;
            tL_photoSize_layer127.h = i2;
            if (i <= 100 && i2 <= 100) {
                tL_photoSize_layer127.type = "s";
            } else if (i <= 320 && i2 <= 320) {
                tL_photoSize_layer127.type = "m";
            } else if (i <= 800 && i2 <= 800) {
                tL_photoSize_layer127.type = "x";
            } else if (i <= 1280 && i2 <= 1280) {
                tL_photoSize_layer127.type = "y";
            } else {
                tL_photoSize_layer127.type = "w";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(tL_fileLocationToBeDeprecated.volume_id);
            sb.append("_");
            String k = hg9.k(sb, tL_fileLocationToBeDeprecated.local_id, ".jpg");
            if (tL_fileLocationToBeDeprecated.volume_id != -2147483648L) {
                z = bc4.z(0);
            } else {
                z = bc4.z(4);
            }
            File file = new File(z, k);
            new File(str).renameTo(file);
            tL_photoSize_layer127.size = (int) file.length();
            return tL_photoSize_layer127;
        } catch (Exception e) {
            fc4.g(e, true);
            return null;
        }
    }

    public static void n(TLRPC.PhotoSize photoSize) {
        if (photoSize != null) {
            byte[] bArr = photoSize.bytes;
            if (bArr == null || bArr.length == 0) {
                bc4.G(z8c.t0);
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(bc4.J(photoSize, null, true, true), "r");
                    if (((int) randomAccessFile.length()) < 20000) {
                        int length = (int) randomAccessFile.length();
                        byte[] bArr2 = new byte[length];
                        photoSize.bytes = bArr2;
                        randomAccessFile.readFully(bArr2, 0, length);
                    }
                } catch (Throwable th) {
                    fc4.g(th, true);
                }
            }
        }
    }

    public static Drawable o(String str, List list) {
        if (list != null) {
            for (int i = 0; i < list.size(); i++) {
                ImageReceiver imageReceiver = (ImageReceiver) list.get(i);
                if (str.equals(imageReceiver.R)) {
                    return imageReceiver.T;
                }
                if (str.equals(imageReceiver.i0)) {
                    return imageReceiver.k0;
                }
            }
            return null;
        }
        return null;
    }

    public static TLRPC.PhotoSize p(TLRPC.Message message) {
        TLRPC.MessageMedia messageMedia = message.media;
        int i = 0;
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            int size = messageMedia.photo.sizes.size();
            while (i < size) {
                TLRPC.PhotoSize photoSize = message.media.photo.sizes.get(i);
                if (photoSize instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize;
                }
                i++;
            }
            return null;
        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                int size2 = document.thumbs.size();
                while (i < size2) {
                    TLRPC.PhotoSize photoSize2 = message.media.document.thumbs.get(i);
                    if (photoSize2 instanceof TLRPC.TL_photoCachedSize) {
                        return photoSize2;
                    }
                    i++;
                }
                return null;
            }
            return null;
        } else if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
            TLRPC.Photo photo = messageMedia.webpage.photo;
            if (photo != null) {
                int size3 = photo.sizes.size();
                while (i < size3) {
                    TLRPC.PhotoSize photoSize3 = message.media.webpage.photo.sizes.get(i);
                    if (photoSize3 instanceof TLRPC.TL_photoCachedSize) {
                        return photoSize3;
                    }
                    i++;
                }
                return null;
            }
            return null;
        } else if ((messageMedia instanceof TLRPC.TL_messageMediaInvoice) && !messageMedia.extended_media.isEmpty() && (message.media.extended_media.get(0) instanceof TLRPC.TL_messageExtendedMediaPreview)) {
            return ((TLRPC.TL_messageExtendedMediaPreview) message.media.extended_media.get(0)).thumb;
        } else {
            return null;
        }
    }

    public static bn5 q(TLRPC.Message message) {
        int i;
        int i2;
        float f;
        Bitmap B;
        byte[] bArr;
        float f2;
        TLRPC.PhotoSize p = p(message);
        if (p != null && (bArr = p.bytes) != null && bArr.length != 0) {
            bc4.G(z8c.t0);
            File J2 = bc4.J(p, null, true, true);
            TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.w = p.w;
            tL_photoSize_layer127.h = p.h;
            tL_photoSize_layer127.location = p.location;
            tL_photoSize_layer127.size = p.size;
            tL_photoSize_layer127.type = p.type;
            if (J2.exists() && message.grouped_id == 0) {
                PointF S1 = rc2.S1(p.w, p.h, 0, 0);
                Locale locale = Locale.US;
                TLRPC.FileLocation fileLocation = p.location;
                long j = fileLocation.volume_id;
                int i3 = fileLocation.local_id;
                float f3 = S1.x;
                String str = j + "_" + i3 + "@" + ((int) (f3 / f2)) + "_" + ((int) (S1.y / gm.p)) + "_b";
                if (!z().F(str, false)) {
                    String path = J2.getPath();
                    float f4 = S1.x;
                    float f5 = gm.p;
                    Bitmap G = G(path, null, (int) (f4 / f5), (int) (S1.y / f5), false);
                    if (G != null) {
                        Utilities.blurBitmap(G, 3);
                        float f6 = S1.x;
                        float f7 = gm.p;
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(G, (int) (f6 / f7), (int) (S1.y / f7), true);
                        if (createScaledBitmap != G) {
                            G.recycle();
                            G = createScaledBitmap;
                        }
                        return new bn5(str, new BitmapDrawable(G));
                    }
                }
            }
        } else {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                int size = messageMedia.document.thumbs.size();
                for (int i4 = 0; i4 < size; i4++) {
                    TLRPC.PhotoSize photoSize = message.media.document.thumbs.get(i4);
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        TLRPC.PhotoSize w = bc4.w(message.media.document.thumbs, 320, false, null, false);
                        if (w != null) {
                            i2 = w.h;
                            i = w.w;
                        } else {
                            int i5 = 0;
                            while (true) {
                                if (i5 < message.media.document.attributes.size()) {
                                    if (message.media.document.attributes.get(i5) instanceof TLRPC.TL_documentAttributeVideo) {
                                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) message.media.document.attributes.get(i5);
                                        i2 = tL_documentAttributeVideo.h;
                                        i = tL_documentAttributeVideo.w;
                                        break;
                                    }
                                    i5++;
                                } else {
                                    i = 0;
                                    i2 = 0;
                                    break;
                                }
                            }
                        }
                        PointF S12 = rc2.S1(i, i2, 0, 0);
                        Locale locale2 = Locale.US;
                        String s = gn5.s(message, message, photoSize);
                        float f8 = S12.x;
                        String str2 = s + "_false@" + ((int) (f8 / f)) + "_" + ((int) (S12.y / gm.p)) + "_b";
                        if (!z().F(str2, false) && (B = B(null, photoSize.bytes)) != null) {
                            Utilities.blurBitmap(B, 3);
                            float f9 = S12.x;
                            float f10 = gm.p;
                            Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(B, (int) (f9 / f10), (int) (S12.y / f10), true);
                            if (createScaledBitmap2 != B) {
                                B.recycle();
                                B = createScaledBitmap2;
                            }
                            return new bn5(str2, new BitmapDrawable(B));
                        }
                    }
                }
            }
        }
        return null;
    }

    public static File w(String str) {
        String x = x(str, "jpg");
        File z = bc4.z(4);
        return new File(z, Utilities.a(str) + "." + x);
    }

    public static String x(String str, String str2) {
        String str3;
        String lastPathSegment = Uri.parse(str).getLastPathSegment();
        if (!TextUtils.isEmpty(lastPathSegment) && lastPathSegment.length() > 1) {
            str = lastPathSegment;
        }
        int lastIndexOf = str.lastIndexOf(46);
        if (lastIndexOf != -1) {
            str3 = str.substring(lastIndexOf + 1);
        } else {
            str3 = null;
        }
        if (str3 != null && str3.length() != 0 && str3.length() <= 4) {
            return str3;
        }
        return str2;
    }

    public static fn5 z() {
        fn5 fn5Var;
        fn5 fn5Var2 = N;
        if (fn5Var2 == null) {
            synchronized (fn5.class) {
                fn5Var = N;
                if (fn5Var == null) {
                    fn5Var = new fn5();
                    N = fn5Var;
                }
            }
            return fn5Var;
        }
        return fn5Var2;
    }

    public final void D(String str) {
        HashMap hashMap = this.a;
        Integer num = (Integer) hashMap.get(str);
        if (num == null) {
            hashMap.put(str, 1);
        } else {
            hashMap.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    public final boolean F(String str, boolean z) {
        if (z) {
            if (u(str) != null) {
                return true;
            }
            return false;
        } else if (v(str) != null) {
            return true;
        } else {
            return false;
        }
    }

    public final void H(int i, String str, String str2) {
        if (str != null && str.length() != 0) {
            HashMap hashMap = this.C;
            if (!hashMap.containsKey(str)) {
                String x = x(str, str2);
                File z = bc4.z(4);
                File file = new File(z, Utilities.a(str) + "_temp." + x);
                file.delete();
                wm5 wm5Var = new wm5(this, str, file, x, i);
                this.B.add(wm5Var);
                hashMap.put(str, wm5Var);
                gm.c3(new ob4(this, (Object) null, 0, (byte) 4));
            }
        }
    }

    public final void I(org.telegram.messenger.ImageReceiver r38, java.util.List r39) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fn5.I(org.telegram.messenger.ImageReceiver, java.util.List):void");
    }

    public final void J(String str, String str2) {
        lm5 lm5Var = this.c;
        BitmapDrawable bitmapDrawable = (BitmapDrawable) lm5Var.f(str);
        if (bitmapDrawable == null) {
            lm5Var = this.b;
            bitmapDrawable = (BitmapDrawable) lm5Var.f(str);
        }
        this.t.put(str, str2);
        if (bitmapDrawable != null) {
            BitmapDrawable bitmapDrawable2 = (BitmapDrawable) lm5Var.f(str2);
            if (bitmapDrawable2 != null && bitmapDrawable2.getBitmap() != null && bitmapDrawable.getBitmap() != null) {
                Bitmap bitmap = bitmapDrawable2.getBitmap();
                Bitmap bitmap2 = bitmapDrawable.getBitmap();
                if (bitmap.getWidth() > bitmap2.getWidth() || bitmap.getHeight() > bitmap2.getHeight()) {
                    lm5Var.n(str);
                }
            }
            this.F = str;
            lm5Var.n(str);
            lm5Var.l(str2, bitmapDrawable);
            this.F = null;
        }
        HashMap hashMap = this.a;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            hashMap.put(str2, num);
            hashMap.remove(str);
        }
    }

    public final void K(BitmapDrawable bitmapDrawable, String str, boolean z) {
        if (str.endsWith("_nocache")) {
            return;
        }
        if (z) {
            this.b.l(str, bitmapDrawable);
        } else {
            this.c.l(str, bitmapDrawable);
        }
    }

    public final void L(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            K(((bn5) arrayList.get(i)).a, ((bn5) arrayList.get(i)).b, true);
        }
    }

    public final void M(String str) {
        this.a.remove(str);
        this.c.n(str);
        this.b.n(str);
    }

    public final void N(String str, String str2, gn5 gn5Var, boolean z) {
        if (z) {
            gm.c3(new d65(this, str, str2, gn5Var, (byte) 7));
        } else {
            O(str, str2, gn5Var);
        }
    }

    public final void O(String str, String str2, gn5 gn5Var) {
        for (int i = 0; i < 2; i++) {
            ArrayList arrayList = null;
            if (i == 0) {
                ArrayList arrayList2 = (ArrayList) ((LinkedHashMap) this.c.d).get(str);
                if (arrayList2 != null) {
                    arrayList = new ArrayList(arrayList2);
                }
            } else {
                ArrayList arrayList3 = (ArrayList) ((LinkedHashMap) this.b.d).get(str);
                if (arrayList3 != null) {
                    arrayList = new ArrayList(arrayList3);
                }
            }
            int i2 = nm7.q4;
            if (arrayList != null) {
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    String str3 = (String) arrayList.get(i3);
                    String o = kt6.o(str, "@", str3);
                    String str4 = str2 + "@" + str3;
                    J(o, str4);
                    nm7.e().k(i2, o, str4, gn5Var);
                }
            } else {
                J(str, str2);
                nm7.e().k(i2, str, str2, gn5Var);
            }
        }
    }

    public final void P(boolean z) {
        if (z) {
            this.y--;
        }
        while (this.y < 4) {
            LinkedList linkedList = this.o;
            if (!linkedList.isEmpty()) {
                try {
                    ((sm5) linkedList.poll()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                    this.y++;
                } catch (Throwable unused) {
                    P(false);
                }
            } else {
                return;
            }
        }
    }

    public final void Q(boolean z) {
        if (z) {
            this.x--;
        }
        while (this.x < 4) {
            LinkedList linkedList = this.n;
            if (!linkedList.isEmpty()) {
                an5 an5Var = (an5) linkedList.poll();
                if (an5Var != null) {
                    an5Var.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                    this.x++;
                }
            } else {
                return;
            }
        }
    }

    public final void a(String str, vuc vucVar) {
        if (str != null && vucVar != null) {
            this.A.put(str, vucVar);
        }
    }

    public final void c(String str) {
        HashMap hashMap = this.C;
        wm5 wm5Var = (wm5) hashMap.get(str);
        if (wm5Var != null) {
            wm5Var.cancel(true);
            hashMap.remove(str);
            this.B.remove(wm5Var);
        }
        Runnable runnable = (Runnable) this.D.get(str);
        if (runnable != null) {
            gm.r(runnable);
        }
        gm.c3(new ob4(this, (Object) null, 0, (byte) 4));
    }

    public final void d(ImageReceiver imageReceiver, boolean z) {
        ArrayList arrayList = imageReceiver.x1;
        HashMap hashMap = dvc.f;
        if (hashMap != null) {
            Iterator it = hashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                ArrayList arrayList2 = (ArrayList) entry.getValue();
                int i = 0;
                while (true) {
                    if (i >= arrayList2.size()) {
                        break;
                    } else if (((Pair) arrayList2.get(i)).first == imageReceiver) {
                        arrayList2.remove(i);
                        break;
                    } else {
                        i++;
                    }
                }
                if (arrayList2.isEmpty()) {
                    dvc.f.remove(str);
                    break;
                }
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        mp3 mp3Var = this.s;
        if (!isEmpty) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                mp3Var.a((Runnable) arrayList.get(i2));
            }
            arrayList.clear();
        }
        arrayList.add(null);
        mp3Var.c(new np6(this, z, imageReceiver, (byte) 26));
    }

    public final void e(Runnable runnable) {
        ((pp3) this.p.b).execute(new fd5(this, runnable, (byte) 7));
    }

    public final void f() {
        this.b.r(-1, null);
        this.c.r(-1, null);
        this.e.r(-1, null);
    }

    public final void g(final ImageReceiver imageReceiver, final String str, final String str2, final String str3, final gn5 gn5Var, final String str4, final long j, final int i, final int i2, final int i3, final int i4) {
        final boolean z;
        long j2;
        if (str2 != null && str != null && gn5Var != null) {
            int A = imageReceiver.A(i2);
            if (A == 0) {
                A = this.G;
                if (i2 == 1) {
                    imageReceiver.a0 = A;
                } else if (i2 == 3) {
                    imageReceiver.j0 = A;
                } else {
                    imageReceiver.S = A;
                }
                int i5 = A + 1;
                this.G = i5;
                if (i5 == Integer.MAX_VALUE) {
                    this.G = 0;
                }
            }
            final int i6 = A;
            final boolean z2 = imageReceiver.G0;
            final Object obj = imageReceiver.h;
            final TLRPC.Document document = imageReceiver.I0;
            final boolean z3 = imageReceiver.H0;
            final int i7 = imageReceiver.d;
            if (i2 == 0 && imageReceiver.J0) {
                z = true;
            } else {
                z = false;
            }
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.km5.run():void");
                }
            };
            if (imageReceiver.w == 0) {
                j2 = 0;
            } else {
                j2 = 1;
            }
            this.s.d(runnable, j2);
            imageReceiver.x1.add(runnable);
        }
    }

    public final android.util.SparseArray h() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fn5.h():android.util.SparseArray");
    }

    public final boolean l(String str) {
        HashMap hashMap = this.a;
        Integer num = (Integer) hashMap.get(str);
        if (num == null) {
            return true;
        }
        if (num.intValue() == 1) {
            hashMap.remove(str);
            return true;
        }
        hashMap.put(str, Integer.valueOf(num.intValue() - 1));
        return false;
    }

    public final void r(int i, File file, dn5 dn5Var) {
        if ((i == 0 || i == 2 || i == 3) && file != null) {
            if (((en5) this.v.get(bc4.r(null, dn5Var.a))) == null) {
                this.r.c(new en5(this, i, file, dn5Var));
            }
        }
    }

    public final Float s(String str) {
        long[] jArr;
        if (str == null || (jArr = (long[]) this.u.get(str)) == null) {
            return null;
        }
        long j = jArr[1];
        if (j == 0) {
            return Float.valueOf(0.0f);
        }
        return Float.valueOf(Math.min(1.0f, ((float) jArr[0]) / ((float) j)));
    }

    public final long[] t(String str) {
        if (str == null) {
            return null;
        }
        return (long[]) this.u.get(str);
    }

    public final BitmapDrawable u(String str) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) this.e.f(str);
        if (bitmapDrawable instanceof kn) {
            kn knVar = (kn) bitmapDrawable;
            if (!knVar.d0 && knVar.H0 < 15) {
                return bitmapDrawable;
            }
            this.e.n(str);
            return null;
        }
        return bitmapDrawable;
    }

    public final BitmapDrawable v(String str) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) this.c.f(str);
        if (bitmapDrawable == null) {
            bitmapDrawable = (BitmapDrawable) this.b.f(str);
        }
        if (bitmapDrawable == null) {
            bitmapDrawable = (BitmapDrawable) this.d.f(str);
        }
        if (bitmapDrawable == null) {
            return u(str);
        }
        return bitmapDrawable;
    }

    public final BitmapDrawable y(TLObject tLObject) {
        String str = null;
        if (tLObject == null) {
            return null;
        }
        if (tLObject instanceof TLRPC.FileLocation) {
            TLRPC.FileLocation fileLocation = (TLRPC.FileLocation) tLObject;
            str = fileLocation.volume_id + "_" + fileLocation.local_id;
        } else if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            str = document.dc_id + "_" + document.id;
        } else if (tLObject instanceof xw9) {
            TLRPC.TL_secureFile tL_secureFile = ((xw9) tLObject).b;
            str = tL_secureFile.dc_id + "_" + tL_secureFile.id;
        } else if (tLObject instanceof vuc) {
            str = Utilities.a(((vuc) tLObject).a);
        }
        return v(str + "@50_50");
    }
}
