package org.telegram.messenger;

import android.app.ActivityManager;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
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
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPInputStream;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.zg0;
public final class gc {
    public static Bitmap M;
    public final ConcurrentHashMap A;
    public final LinkedList B;
    public final HashMap C;
    public final HashMap D;
    public int E;
    public String F;
    public int G;
    public File H;
    public final kb f22636b;
    public final kb f22637c;
    public final kb d;
    public final kb f22638e;
    public final com.google.android.gms.internal.cast.b0 f22648p;
    public final p5 f22649q;
    public final p5 f22650r;
    public final p5 f22651s;
    public final HashMap f22652t;
    public final ConcurrentHashMap f22653u;
    public final HashMap v;
    public final HashMap f22654w;
    public int f22655x;
    public int f22656y;
    public final boolean f22657z;
    public static final ThreadLocal I = new ThreadLocal();
    public static final ThreadLocal J = new ThreadLocal();
    public static final byte[] K = new byte[12];
    public static final byte[] L = new byte[12];
    public static volatile gc N = null;
    public final HashMap f22635a = new HashMap();
    public final ArrayList f22639f = new ArrayList();
    public final HashMap f22640g = new HashMap();
    public final HashMap h = new HashMap();
    public final ConcurrentHashMap f22641i = new ConcurrentHashMap();
    public final HashSet f22642j = new HashSet();
    public final SparseArray f22643k = new SparseArray();
    public final HashMap f22644l = new HashMap();
    public final SparseArray f22645m = new SparseArray();
    public final LinkedList f22646n = new LinkedList();
    public final LinkedList f22647o = new LinkedList();

    public gc() {
        boolean z9;
        int i7;
        com.google.android.gms.internal.cast.b0 b0Var = new com.google.android.gms.internal.cast.b0(2);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        b0Var.f6814b = new of.a(b0Var, new PriorityBlockingQueue(10, new c5.b(4)));
        this.f22648p = b0Var;
        this.f22649q = new p5("cacheThumbOutQueue");
        p5 p5Var = new p5("thumbGeneratingQueue");
        this.f22650r = p5Var;
        this.f22651s = new p5("imageLoadQueue");
        this.f22652t = new HashMap();
        this.f22653u = new ConcurrentHashMap();
        this.v = new HashMap();
        this.f22654w = new HashMap();
        this.f22655x = 0;
        this.f22656y = 0;
        this.A = new ConcurrentHashMap();
        this.B = new LinkedList();
        this.C = new HashMap();
        this.D = new HashMap();
        this.E = 0;
        this.F = null;
        this.G = 0;
        this.H = null;
        p5Var.setPriority(1);
        int memoryClass = ((ActivityManager) t0.f25566b.getSystemService("activity")).getMemoryClass();
        if (memoryClass >= 192) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f22657z = z9;
        if (z9) {
            i7 = 30;
        } else {
            i7 = 15;
        }
        int min = Math.min(i7, memoryClass / 7) * 1048576;
        float f10 = min;
        this.f22637c = new kb(this, (int) (0.8f * f10), 0);
        this.f22636b = new kb(this, (int) (f10 * 0.2f), 1);
        this.d = new kb(this, min / 4, 2);
        this.f22638e = new kb(this);
        SparseArray sparseArray = new SparseArray();
        File E0 = g0.E0();
        if (!E0.isDirectory()) {
            try {
                E0.mkdirs();
            } catch (Exception e10) {
                a8.g(e10, true);
            }
        }
        g0.G(new File(E0, ".nomedia"));
        sparseArray.put(4, E0);
        for (int i10 = 0; i10 < 4; i10++) {
            w7.G(i10).E = new qb(this, i10);
        }
        w7.K = sparseArray;
        androidx.mediarouter.app.f fVar = new androidx.mediarouter.app.f(this, 6);
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
                t0.f25566b.registerReceiver(fVar, intentFilter, 4);
            } else {
                t0.f25566b.registerReceiver(fVar, intentFilter);
            }
        } catch (Throwable unused) {
        }
        i(null);
    }

    public static File A(String str) {
        String B = B(str, "jpg");
        File z9 = w7.z(4);
        return new File(z9, Utilities.a(str) + "." + B);
    }

    public static String B(String str, String str2) {
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

    public static gc D() {
        gc gcVar;
        gc gcVar2 = N;
        if (gcVar2 == null) {
            synchronized (gc.class) {
                try {
                    gcVar = N;
                    if (gcVar == null) {
                        gcVar = new gc();
                        N = gcVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return gcVar;
        }
        return gcVar2;
    }

    public static File E() {
        File file = t0.f25566b.getExternalMediaDirs()[0];
        if (!TextUtils.isEmpty(iz.f23405h0)) {
            for (int i7 = 0; i7 < t0.f25566b.getExternalMediaDirs().length; i7++) {
                File file2 = t0.f25566b.getExternalMediaDirs()[i7];
                if (file2 != null && file2.getPath().startsWith(iz.f23405h0)) {
                    file = t0.f25566b.getExternalMediaDirs()[i7];
                }
            }
        }
        return file;
    }

    public static android.graphics.Bitmap F(java.lang.String r12, byte[] r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gc.F(java.lang.String, byte[]):android.graphics.Bitmap");
    }

    public static synchronized Bitmap G() {
        Bitmap bitmap;
        synchronized (gc.class) {
            try {
                Bitmap bitmap2 = M;
                if (bitmap2 != null) {
                    if (bitmap2.isRecycled()) {
                    }
                    bitmap = M;
                }
                Bitmap createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                M = createBitmap;
                createBitmap.eraseColor(-16777216);
                bitmap = M;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bitmap;
    }

    public static boolean I(String str) {
        if (str != null && str.endsWith("avatar")) {
            return true;
        }
        return false;
    }

    public static android.graphics.Bitmap K(java.lang.String r18, android.net.Uri r19, float r20, float r21, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gc.K(java.lang.String, android.net.Uri, float, float, boolean):android.graphics.Bitmap");
    }

    public static void W(org.telegram.tgnet.TLRPC.Message r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gc.W(org.telegram.tgnet.TLRPC$Message):void");
    }

    public static void X(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                W((TLRPC.Message) arrayList.get(i7));
            }
        }
    }

    public static TLRPC.PhotoSize Y(Bitmap bitmap, float f10, float f11, int i7, int i10, int i11) {
        return b0(null, bitmap, Bitmap.CompressFormat.JPEG, f10, f11, i7, false, i10, i11, false);
    }

    public static TLRPC.PhotoSize Z(Bitmap bitmap, float f10, float f11, int i7, boolean z9) {
        return b0(null, bitmap, Bitmap.CompressFormat.JPEG, f10, f11, i7, z9, 0, 0, false);
    }

    public static TLRPC.PhotoSize a0(Bitmap bitmap, Bitmap.CompressFormat compressFormat, float f10, float f11, int i7) {
        return b0(null, bitmap, compressFormat, f10, f11, i7, false, 101, 101, false);
    }

    public static TLRPC.PhotoSize b0(TLRPC.PhotoSize photoSize, Bitmap bitmap, Bitmap.CompressFormat compressFormat, float f10, float f11, int i7, boolean z9, int i10, int i11, boolean z10) {
        boolean z11;
        float f12;
        int i12;
        float max;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            if (width != 0.0f && height != 0.0f) {
                float max2 = Math.max(width / f10, height / f11);
                if (i10 != 0 && i11 != 0 && (width < i10 || height < i11)) {
                    if (i12 < 0 && height > i11) {
                        max = width / f12;
                    } else {
                        if (width > f12) {
                            float f13 = i11;
                            if (height < f13) {
                                max = height / f13;
                            }
                        }
                        max = Math.max(width / f12, height / i11);
                    }
                    max2 = max;
                    z11 = true;
                } else {
                    z11 = false;
                }
                float f14 = max2;
                int i13 = (int) (width / f14);
                int i14 = (int) (height / f14);
                if (i14 != 0 && i13 != 0) {
                    try {
                        return c0(photoSize, bitmap, compressFormat, i13, i14, f14, i7, z9, z11, z10);
                    } catch (Throwable th2) {
                        a8.g(th2, true);
                        D().j();
                        System.gc();
                        try {
                            return c0(photoSize, bitmap, compressFormat, i13, i14, f14, i7, z9, z11, z10);
                        } catch (Throwable th3) {
                            a8.g(th3, true);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static org.telegram.tgnet.TLRPC.PhotoSize c0(org.telegram.tgnet.TLRPC.PhotoSize r5, android.graphics.Bitmap r6, android.graphics.Bitmap.CompressFormat r7, int r8, int r9, float r10, int r11, boolean r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gc.c0(org.telegram.tgnet.TLRPC$PhotoSize, android.graphics.Bitmap, android.graphics.Bitmap$CompressFormat, int, int, float, int, boolean, boolean, boolean):org.telegram.tgnet.TLRPC$PhotoSize");
    }

    public static int d(gc gcVar, BitmapDrawable bitmapDrawable) {
        if (bitmapDrawable instanceof org.telegram.ui.Components.v5) {
            org.telegram.ui.Components.v5 v5Var = (org.telegram.ui.Components.v5) bitmapDrawable;
            return Math.max(v5Var.getIntrinsicHeight() * v5Var.getIntrinsicWidth(), v5Var.f38871j0 * v5Var.f38870i0) * 12;
        } else if (bitmapDrawable instanceof zg0) {
            zg0 zg0Var = (zg0) bitmapDrawable;
            int i7 = zg0Var.f40990b * zg0Var.f40992c;
            if (zg0Var.G) {
                return i7 * 2;
            }
            return i7 * 8;
        } else {
            return bitmapDrawable.getBitmap().getByteCount();
        }
    }

    public static boolean d0(Uri uri, String str) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (str == null && uri != null && uri.getScheme() != null) {
            if (uri.getScheme().contains("file")) {
                str = uri.getPath();
            } else {
                try {
                    str = g0.T0(uri);
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
        }
        if (str != null) {
            BitmapFactory.decodeFile(str, options);
        } else if (uri != null) {
            try {
                InputStream openInputStream = t0.f25566b.getContentResolver().openInputStream(uri);
                BitmapFactory.decodeStream(openInputStream, null, options);
                openInputStream.close();
            } catch (Throwable th3) {
                a8.g(th3, true);
                return false;
            }
        }
        float f10 = options.outWidth;
        float f11 = options.outHeight;
        if (f10 / f11 > 10.0f || f11 / f10 > 10.0f) {
            return true;
        }
        return false;
    }

    public static boolean e0(hc hcVar, String str) {
        if (!str.endsWith("_firstframe") && !str.endsWith("_lastframe")) {
            if ((hcVar != null && (ij.L2(hcVar.f22871i, true) || hcVar.f22878p == 1 || ij.O4(hcVar.f22871i))) || I(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean f(File file, File file2, int i7) {
        File file3;
        File file4;
        byte[] bArr;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                if (i7 == 0) {
                    file3 = new File(file, "000000000_999999_temp.f");
                    file4 = new File(file2, "000000000_999999.f");
                } else {
                    if (i7 != 3 && i7 != 5 && i7 != 6) {
                        if (i7 == 1) {
                            file3 = new File(file, "000000000_999999_temp.f");
                            file4 = new File(file2, "000000000_999999.f");
                        } else if (i7 == 2) {
                            file3 = new File(file, "000000000_999999_temp.f");
                            file4 = new File(file2, "000000000_999999.f");
                        } else {
                            file4 = null;
                            file3 = null;
                        }
                    }
                    file3 = new File(file, "000000000_999999_temp.f");
                    file4 = new File(file2, "000000000_999999.f");
                }
                bArr = new byte[1024];
                file3.createNewFile();
                randomAccessFile = new RandomAccessFile(file3, "rws");
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e10) {
            e = e10;
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
        } catch (Exception e11) {
            e = e11;
            randomAccessFile2 = randomAccessFile;
            a8.g(e, true);
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                    return false;
                } catch (Exception e12) {
                    a8.g(e12, true);
                    return false;
                }
            }
            return false;
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile2 = randomAccessFile;
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (Exception e13) {
                    a8.g(e13, true);
                }
            }
            throw th;
        }
    }

    public static BitmapDrawable m(ArrayList arrayList) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            if (arrayList.get(i7) instanceof TLRPC.TL_photoStrippedSize) {
                return new BitmapDrawable(t0.f25566b.getResources(), F("b", ((TLRPC.TL_photoStrippedSize) arrayList.get(i7)).bytes));
            }
        }
        return null;
    }

    public static String n(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(64);
        if (indexOf >= 0) {
            return str.substring(0, indexOf);
        }
        return str;
    }

    public static String o(File file) {
        StringBuilder sb2 = new StringBuilder();
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
                        sb2.append(readLine);
                    } else {
                        String sb3 = sb2.toString();
                        bufferedReader.close();
                        gZIPInputStream.close();
                        return sb3;
                    }
                } catch (Throwable th2) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (Exception unused) {
            return "";
        }
    }

    public static TLRPC.TL_photoSize_layer127 q(String str) {
        File z9;
        if (str == null) {
            return null;
        }
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i7 = options.outWidth;
            int i10 = options.outHeight;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
            tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
            tL_fileLocationToBeDeprecated.dc_id = Integer.MIN_VALUE;
            tL_fileLocationToBeDeprecated.local_id = iz.p();
            tL_fileLocationToBeDeprecated.file_reference = new byte[0];
            TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.location = tL_fileLocationToBeDeprecated;
            tL_photoSize_layer127.f26981w = i7;
            tL_photoSize_layer127.h = i10;
            if (i7 <= 100 && i10 <= 100) {
                tL_photoSize_layer127.type = "s";
            } else if (i7 <= 320 && i10 <= 320) {
                tL_photoSize_layer127.type = "m";
            } else if (i7 <= 800 && i10 <= 800) {
                tL_photoSize_layer127.type = "x";
            } else if (i7 <= 1280 && i10 <= 1280) {
                tL_photoSize_layer127.type = "y";
            } else {
                tL_photoSize_layer127.type = "w";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_fileLocationToBeDeprecated.volume_id);
            sb2.append("_");
            String n10 = a8.p0.n(tL_fileLocationToBeDeprecated.local_id, ".jpg", sb2);
            if (tL_fileLocationToBeDeprecated.volume_id != -2147483648L) {
                z9 = w7.z(0);
            } else {
                z9 = w7.z(4);
            }
            File file = new File(z9, n10);
            new File(str).renameTo(file);
            tL_photoSize_layer127.size = (int) file.length();
            return tL_photoSize_layer127;
        } catch (Exception e10) {
            a8.g(e10, true);
            return null;
        }
    }

    public static void r(TLRPC.PhotoSize photoSize) {
        if (photoSize != null) {
            byte[] bArr = photoSize.bytes;
            if (bArr == null || bArr.length == 0) {
                w7.G(p10.f24470s0);
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(w7.J(photoSize, null, true, true), "r");
                    if (((int) randomAccessFile.length()) < 20000) {
                        int length = (int) randomAccessFile.length();
                        byte[] bArr2 = new byte[length];
                        photoSize.bytes = bArr2;
                        randomAccessFile.readFully(bArr2, 0, length);
                    }
                } catch (Throwable th2) {
                    a8.g(th2, true);
                }
            }
        }
    }

    public static Drawable s(String str, List list) {
        if (list != null) {
            for (int i7 = 0; i7 < list.size(); i7++) {
                ImageReceiver imageReceiver = (ImageReceiver) list.get(i7);
                if (str.equals(imageReceiver.Q)) {
                    return imageReceiver.S;
                }
                if (str.equals(imageReceiver.f21196h0)) {
                    return imageReceiver.f21200j0;
                }
            }
            return null;
        }
        return null;
    }

    public static TLRPC.PhotoSize t(TLRPC.Message message) {
        TLRPC.MessageMedia messageMedia = message.media;
        int i7 = 0;
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            int size = messageMedia.photo.sizes.size();
            while (i7 < size) {
                TLRPC.PhotoSize photoSize = message.media.photo.sizes.get(i7);
                if (photoSize instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize;
                }
                i7++;
            }
            return null;
        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                int size2 = document.thumbs.size();
                while (i7 < size2) {
                    TLRPC.PhotoSize photoSize2 = message.media.document.thumbs.get(i7);
                    if (photoSize2 instanceof TLRPC.TL_photoCachedSize) {
                        return photoSize2;
                    }
                    i7++;
                }
                return null;
            }
            return null;
        } else if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
            TLRPC.Photo photo = messageMedia.webpage.photo;
            if (photo != null) {
                int size3 = photo.sizes.size();
                while (i7 < size3) {
                    TLRPC.PhotoSize photoSize3 = message.media.webpage.photo.sizes.get(i7);
                    if (photoSize3 instanceof TLRPC.TL_photoCachedSize) {
                        return photoSize3;
                    }
                    i7++;
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

    public static cc u(TLRPC.Message message) {
        int i7;
        int i10;
        float f10;
        Bitmap F;
        byte[] bArr;
        float f11;
        TLRPC.PhotoSize t6 = t(message);
        if (t6 != null && (bArr = t6.bytes) != null && bArr.length != 0) {
            w7.G(p10.f24470s0);
            File J2 = w7.J(t6, null, true, true);
            TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.f26981w = t6.f26981w;
            tL_photoSize_layer127.h = t6.h;
            tL_photoSize_layer127.location = t6.location;
            tL_photoSize_layer127.size = t6.size;
            tL_photoSize_layer127.type = t6.type;
            if (J2.exists() && message.grouped_id == 0) {
                PointF P1 = org.telegram.ui.Cells.q1.P1(t6.f26981w, t6.h, 0, 0);
                Locale locale = Locale.US;
                TLRPC.FileLocation fileLocation = t6.location;
                long j3 = fileLocation.volume_id;
                int i11 = fileLocation.local_id;
                float f12 = P1.x;
                String str = j3 + "_" + i11 + "@" + ((int) (f12 / f11)) + "_" + ((int) (P1.y / g0.f22562p)) + "_b";
                if (!D().J(str, false)) {
                    String path = J2.getPath();
                    float f13 = P1.x;
                    float f14 = g0.f22562p;
                    Bitmap K2 = K(path, null, (int) (f13 / f14), (int) (P1.y / f14), false);
                    if (K2 != null) {
                        Utilities.blurBitmap(K2, 3);
                        float f15 = P1.x;
                        float f16 = g0.f22562p;
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(K2, (int) (f15 / f16), (int) (P1.y / f16), true);
                        if (createScaledBitmap != K2) {
                            K2.recycle();
                            K2 = createScaledBitmap;
                        }
                        return new cc(str, new BitmapDrawable(K2));
                    }
                }
            }
        } else {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                int size = messageMedia.document.thumbs.size();
                for (int i12 = 0; i12 < size; i12++) {
                    TLRPC.PhotoSize photoSize = message.media.document.thumbs.get(i12);
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        TLRPC.PhotoSize w10 = w7.w(message.media.document.thumbs, 320, false, null, false);
                        if (w10 != null) {
                            i10 = w10.h;
                            i7 = w10.f26981w;
                        } else {
                            int i13 = 0;
                            while (true) {
                                if (i13 < message.media.document.attributes.size()) {
                                    if (message.media.document.attributes.get(i13) instanceof TLRPC.TL_documentAttributeVideo) {
                                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) message.media.document.attributes.get(i13);
                                        i10 = tL_documentAttributeVideo.h;
                                        i7 = tL_documentAttributeVideo.f26963w;
                                        break;
                                    }
                                    i13++;
                                } else {
                                    i7 = 0;
                                    i10 = 0;
                                    break;
                                }
                            }
                        }
                        PointF P12 = org.telegram.ui.Cells.q1.P1(i7, i10, 0, 0);
                        Locale locale2 = Locale.US;
                        String s5 = hc.s(message, message, photoSize);
                        float f17 = P12.x;
                        String str2 = s5 + "_false@" + ((int) (f17 / f10)) + "_" + ((int) (P12.y / g0.f22562p)) + "_b";
                        if (!D().J(str2, false) && (F = F(null, photoSize.bytes)) != null) {
                            Utilities.blurBitmap(F, 3);
                            float f18 = P12.x;
                            float f19 = g0.f22562p;
                            Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(F, (int) (f18 / f19), (int) (P12.y / f19), true);
                            if (createScaledBitmap2 != F) {
                                F.recycle();
                                F = createScaledBitmap2;
                            }
                            return new cc(str2, new BitmapDrawable(F));
                        }
                    }
                }
            }
        }
        return null;
    }

    public final BitmapDrawable C(TLObject tLObject) {
        String str = null;
        if (tLObject == null) {
            return null;
        }
        if (tLObject instanceof TLRPC.FileLocation) {
            TLRPC.FileLocation fileLocation = (TLRPC.FileLocation) tLObject;
            str = fileLocation.volume_id + "_" + fileLocation.local_id;
        } else if (tLObject instanceof TLRPC.Document) {
            TLRPC.Document document = (TLRPC.Document) tLObject;
            str = document.dc_id + "_" + document.f26962id;
        } else if (tLObject instanceof ew) {
            TLRPC.TL_secureFile tL_secureFile = ((ew) tLObject).f22285b;
            str = tL_secureFile.dc_id + "_" + tL_secureFile.f27093id;
        } else if (tLObject instanceof m20) {
            str = Utilities.a(((m20) tLObject).f23976a);
        }
        return z(str + "@50_50");
    }

    public final void H(String str) {
        HashMap hashMap = this.f22635a;
        Integer num = (Integer) hashMap.get(str);
        if (num == null) {
            hashMap.put(str, 1);
        } else {
            hashMap.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    public final boolean J(String str, boolean z9) {
        if (z9) {
            if (y(str) != null) {
                return true;
            }
            return false;
        } else if (z(str) != null) {
            return true;
        } else {
            return false;
        }
    }

    public final void L(int i7, String str, String str2) {
        if (str != null && str.length() != 0) {
            HashMap hashMap = this.C;
            if (!hashMap.containsKey(str)) {
                String B = B(str, str2);
                File z9 = w7.z(4);
                File file = new File(z9, Utilities.a(str) + "_temp." + B);
                file.delete();
                xb xbVar = new xb(this, str, file, B, i7);
                this.B.add(xbVar);
                hashMap.put(str, xbVar);
                U(null, 0);
            }
        }
    }

    public final void M(org.telegram.messenger.ImageReceiver r38, java.util.List r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gc.M(org.telegram.messenger.ImageReceiver, java.util.List):void");
    }

    public final void N(String str, String str2) {
        kb kbVar = this.f22637c;
        BitmapDrawable bitmapDrawable = (BitmapDrawable) kbVar.f(str);
        if (bitmapDrawable == null) {
            kbVar = this.f22636b;
            bitmapDrawable = (BitmapDrawable) kbVar.f(str);
        }
        this.f22652t.put(str, str2);
        if (bitmapDrawable != null) {
            BitmapDrawable bitmapDrawable2 = (BitmapDrawable) kbVar.f(str2);
            if (bitmapDrawable2 != null && bitmapDrawable2.getBitmap() != null && bitmapDrawable.getBitmap() != null) {
                Bitmap bitmap = bitmapDrawable2.getBitmap();
                Bitmap bitmap2 = bitmapDrawable.getBitmap();
                if (bitmap.getWidth() > bitmap2.getWidth() || bitmap.getHeight() > bitmap2.getHeight()) {
                    kbVar.n(str);
                }
            }
            this.F = str;
            kbVar.n(str);
            kbVar.l(str2, bitmapDrawable);
            this.F = null;
        }
        HashMap hashMap = this.f22635a;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            hashMap.put(str2, num);
            hashMap.remove(str);
        }
    }

    public final void O(BitmapDrawable bitmapDrawable, String str, boolean z9) {
        if (str.endsWith("_nocache")) {
            return;
        }
        if (z9) {
            this.f22636b.l(str, bitmapDrawable);
        } else {
            this.f22637c.l(str, bitmapDrawable);
        }
    }

    public final void P(ArrayList arrayList) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            O(((cc) arrayList.get(i7)).f21835a, ((cc) arrayList.get(i7)).f21836b, true);
        }
    }

    public final void Q(String str) {
        this.f22635a.remove(str);
        this.f22637c.n(str);
        this.f22636b.n(str);
    }

    public final void R(String str, String str2, hc hcVar, boolean z9) {
        if (z9) {
            g0.h3(new em(this, str, str2, hcVar, 9));
        } else {
            S(str, str2, hcVar);
        }
    }

    public final void S(String str, String str2, hc hcVar) {
        for (int i7 = 0; i7 < 2; i7++) {
            ArrayList arrayList = null;
            if (i7 == 0) {
                ArrayList arrayList2 = (ArrayList) ((LinkedHashMap) this.f22637c.d).get(str);
                if (arrayList2 != null) {
                    arrayList = new ArrayList(arrayList2);
                }
            } else {
                ArrayList arrayList3 = (ArrayList) ((LinkedHashMap) this.f22636b.d).get(str);
                if (arrayList3 != null) {
                    arrayList = new ArrayList(arrayList3);
                }
            }
            int i10 = qs.f25039m4;
            if (arrayList != null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    String str3 = (String) arrayList.get(i11);
                    String D = a8.p0.D(str, "@", str3);
                    String str4 = str2 + "@" + str3;
                    N(D, str4);
                    qs.e().k(i10, D, str4, hcVar);
                }
            } else {
                N(str, str2);
                qs.e().k(i10, str, str2, hcVar);
            }
        }
    }

    public final void T(boolean z9) {
        if (z9) {
            this.f22656y--;
        }
        while (this.f22656y < 4) {
            LinkedList linkedList = this.f22647o;
            if (!linkedList.isEmpty()) {
                try {
                    ((tb) linkedList.poll()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                    this.f22656y++;
                } catch (Throwable unused) {
                    T(false);
                }
            } else {
                return;
            }
        }
    }

    public final void U(xb xbVar, int i7) {
        g0.h3(new l7(this, xbVar, i7, 4));
    }

    public final void V(boolean z9) {
        if (z9) {
            this.f22655x--;
        }
        while (this.f22655x < 4) {
            LinkedList linkedList = this.f22646n;
            if (!linkedList.isEmpty()) {
                bc bcVar = (bc) linkedList.poll();
                if (bcVar != null) {
                    bcVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                    this.f22655x++;
                }
            } else {
                return;
            }
        }
    }

    public final void e(String str, m20 m20Var) {
        if (str != null && m20Var != null) {
            this.A.put(str, m20Var);
        }
    }

    public final void g(String str) {
        HashMap hashMap = this.C;
        xb xbVar = (xb) hashMap.get(str);
        if (xbVar != null) {
            xbVar.cancel(true);
            hashMap.remove(str);
            this.B.remove(xbVar);
        }
        Runnable runnable = (Runnable) this.D.get(str);
        if (runnable != null) {
            g0.r(runnable);
        }
        U(null, 0);
    }

    public final void h(ImageReceiver imageReceiver, boolean z9) {
        ArrayList arrayList = imageReceiver.f21228w1;
        HashMap hashMap = org.telegram.ui.web.w1.f51351f;
        if (hashMap != null) {
            Iterator it = hashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                ArrayList arrayList2 = (ArrayList) entry.getValue();
                int i7 = 0;
                while (true) {
                    if (i7 >= arrayList2.size()) {
                        break;
                    } else if (((Pair) arrayList2.get(i7)).first == imageReceiver) {
                        arrayList2.remove(i7);
                        break;
                    } else {
                        i7++;
                    }
                }
                if (arrayList2.isEmpty()) {
                    org.telegram.ui.web.w1.f51351f.remove(str);
                    break;
                }
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        p5 p5Var = this.f22651s;
        if (!isEmpty) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                p5Var.a((Runnable) arrayList.get(i10));
            }
            arrayList.clear();
        }
        arrayList.add(null);
        p5Var.c(new yf(this, z9, imageReceiver, 5));
    }

    public final void i(Runnable runnable) {
        ((of.a) this.f22648p.f6814b).execute(new x4(15, this, runnable));
    }

    public final void j() {
        this.f22636b.r(-1, null);
        this.f22637c.r(-1, null);
        this.f22638e.r(-1, null);
    }

    public final void k(final ImageReceiver imageReceiver, final String str, final String str2, final String str3, final hc hcVar, final String str4, final long j3, final int i7, final int i10, final int i11, final int i12) {
        final boolean z9;
        long j10;
        if (str2 != null && str != null && hcVar != null) {
            int G = imageReceiver.G(i10);
            if (G == 0) {
                G = this.G;
                if (i10 == 1) {
                    imageReceiver.Z = G;
                } else if (i10 == 3) {
                    imageReceiver.f21198i0 = G;
                } else {
                    imageReceiver.R = G;
                }
                int i13 = G + 1;
                this.G = i13;
                if (i13 == Integer.MAX_VALUE) {
                    this.G = 0;
                }
            }
            final int i14 = G;
            final boolean z10 = imageReceiver.F0;
            final Object obj = imageReceiver.h;
            final TLRPC.Document document = imageReceiver.H0;
            final boolean z11 = imageReceiver.G0;
            final int i15 = imageReceiver.d;
            if (i10 == 0 && imageReceiver.I0) {
                z9 = true;
            } else {
                z9 = false;
            }
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jb.run():void");
                }
            };
            if (imageReceiver.f21226w == 0) {
                j10 = 0;
            } else {
                j10 = 1;
            }
            this.f22651s.d(runnable, j10);
            imageReceiver.f21228w1.add(runnable);
        }
    }

    public final android.util.SparseArray l() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.gc.l():android.util.SparseArray");
    }

    public final boolean p(String str) {
        HashMap hashMap = this.f22635a;
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

    public final void v(int i7, File file, ec ecVar) {
        if ((i7 == 0 || i7 == 2 || i7 == 3) && file != null) {
            if (((fc) this.v.get(w7.r(null, ecVar.f22201a))) == null) {
                this.f22650r.c(new fc(this, i7, file, ecVar));
            }
        }
    }

    public final Float w(String str) {
        long[] jArr;
        if (str == null || (jArr = (long[]) this.f22653u.get(str)) == null) {
            return null;
        }
        long j3 = jArr[1];
        if (j3 == 0) {
            return Float.valueOf(0.0f);
        }
        return Float.valueOf(Math.min(1.0f, ((float) jArr[0]) / ((float) j3)));
    }

    public final long[] x(String str) {
        if (str == null) {
            return null;
        }
        return (long[]) this.f22653u.get(str);
    }

    public final BitmapDrawable y(String str) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) this.f22638e.f(str);
        if (bitmapDrawable instanceof org.telegram.ui.Components.v5) {
            org.telegram.ui.Components.v5 v5Var = (org.telegram.ui.Components.v5) bitmapDrawable;
            if (!v5Var.f38862c0 && v5Var.G0 < 15) {
                return bitmapDrawable;
            }
            this.f22638e.n(str);
            return null;
        }
        return bitmapDrawable;
    }

    public final BitmapDrawable z(String str) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) this.f22637c.f(str);
        if (bitmapDrawable == null) {
            bitmapDrawable = (BitmapDrawable) this.f22636b.f(str);
        }
        if (bitmapDrawable == null) {
            bitmapDrawable = (BitmapDrawable) this.d.f(str);
        }
        if (bitmapDrawable == null) {
            return y(str);
        }
        return bitmapDrawable;
    }
}
