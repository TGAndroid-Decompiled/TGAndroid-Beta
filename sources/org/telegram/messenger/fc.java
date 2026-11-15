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
import org.telegram.ui.Components.ch0;
public final class fc {
    public static Bitmap M;
    public final ConcurrentHashMap A;
    public final LinkedList B;
    public final HashMap C;
    public final HashMap D;
    public int E;
    public String F;
    public int G;
    public File H;
    public final jb f23461b;
    public final jb f23462c;
    public final jb d;
    public final jb f23463e;
    public final com.google.android.gms.internal.cast.b0 f23473p;
    public final p5 f23474q;
    public final p5 f23475r;
    public final p5 f23476s;
    public final HashMap f23477t;
    public final ConcurrentHashMap f23478u;
    public final HashMap v;
    public final HashMap f23479w;
    public int f23480x;
    public int f23481y;
    public final boolean f23482z;
    public static final ThreadLocal I = new ThreadLocal();
    public static final ThreadLocal J = new ThreadLocal();
    public static final byte[] K = new byte[12];
    public static final byte[] L = new byte[12];
    public static volatile fc N = null;
    public final HashMap f23460a = new HashMap();
    public final ArrayList f23464f = new ArrayList();
    public final HashMap f23465g = new HashMap();
    public final HashMap h = new HashMap();
    public final ConcurrentHashMap f23466i = new ConcurrentHashMap();
    public final HashSet f23467j = new HashSet();
    public final SparseArray f23468k = new SparseArray();
    public final HashMap f23469l = new HashMap();
    public final SparseArray f23470m = new SparseArray();
    public final LinkedList f23471n = new LinkedList();
    public final LinkedList f23472o = new LinkedList();

    public fc() {
        boolean z10;
        int i7;
        com.google.android.gms.internal.cast.b0 b0Var = new com.google.android.gms.internal.cast.b0(2);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        b0Var.f6203b = new of.a(b0Var, new PriorityBlockingQueue(10, new c5.b(4)));
        this.f23473p = b0Var;
        this.f23474q = new p5("cacheThumbOutQueue");
        p5 p5Var = new p5("thumbGeneratingQueue");
        this.f23475r = p5Var;
        this.f23476s = new p5("imageLoadQueue");
        this.f23477t = new HashMap();
        this.f23478u = new ConcurrentHashMap();
        this.v = new HashMap();
        this.f23479w = new HashMap();
        this.f23480x = 0;
        this.f23481y = 0;
        this.A = new ConcurrentHashMap();
        this.B = new LinkedList();
        this.C = new HashMap();
        this.D = new HashMap();
        this.E = 0;
        this.F = null;
        this.G = 0;
        this.H = null;
        p5Var.setPriority(1);
        int memoryClass = ((ActivityManager) t0.f26600b.getSystemService("activity")).getMemoryClass();
        if (memoryClass >= 192) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f23482z = z10;
        if (z10) {
            i7 = 30;
        } else {
            i7 = 15;
        }
        int min = Math.min(i7, memoryClass / 7) * 1048576;
        float f10 = min;
        this.f23462c = new jb(this, (int) (0.8f * f10), 0);
        this.f23461b = new jb(this, (int) (f10 * 0.2f), 1);
        this.d = new jb(this, min / 4, 2);
        this.f23463e = new jb(this);
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
            w7.G(i10).F = new pb(this, i10);
        }
        w7.L = sparseArray;
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
                t0.f26600b.registerReceiver(fVar, intentFilter, 4);
            } else {
                t0.f26600b.registerReceiver(fVar, intentFilter);
            }
        } catch (Throwable unused) {
        }
        i(null);
    }

    public static File A(String str) {
        String B = B(str, "jpg");
        File z10 = w7.z(4);
        return new File(z10, Utilities.a(str) + "." + B);
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

    public static fc D() {
        fc fcVar;
        fc fcVar2 = N;
        if (fcVar2 == null) {
            synchronized (fc.class) {
                try {
                    fcVar = N;
                    if (fcVar == null) {
                        fcVar = new fc();
                        N = fcVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return fcVar;
        }
        return fcVar2;
    }

    public static File E() {
        File file = t0.f26600b.getExternalMediaDirs()[0];
        if (!TextUtils.isEmpty(gz.f23949h0)) {
            for (int i7 = 0; i7 < t0.f26600b.getExternalMediaDirs().length; i7++) {
                File file2 = t0.f26600b.getExternalMediaDirs()[i7];
                if (file2 != null && file2.getPath().startsWith(gz.f23949h0)) {
                    file = t0.f26600b.getExternalMediaDirs()[i7];
                }
            }
        }
        return file;
    }

    public static android.graphics.Bitmap F(java.lang.String r12, byte[] r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.fc.F(java.lang.String, byte[]):android.graphics.Bitmap");
    }

    public static synchronized Bitmap G() {
        Bitmap bitmap;
        synchronized (fc.class) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.fc.K(java.lang.String, android.net.Uri, float, float, boolean):android.graphics.Bitmap");
    }

    public static void W(org.telegram.tgnet.TLRPC.Message r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.fc.W(org.telegram.tgnet.TLRPC$Message):void");
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

    public static TLRPC.PhotoSize Z(Bitmap bitmap, float f10, float f11, int i7, boolean z10) {
        return b0(null, bitmap, Bitmap.CompressFormat.JPEG, f10, f11, i7, z10, 0, 0, false);
    }

    public static TLRPC.PhotoSize a0(Bitmap bitmap, Bitmap.CompressFormat compressFormat, float f10, float f11, int i7) {
        return b0(null, bitmap, compressFormat, f10, f11, i7, false, 101, 101, false);
    }

    public static TLRPC.PhotoSize b0(TLRPC.PhotoSize photoSize, Bitmap bitmap, Bitmap.CompressFormat compressFormat, float f10, float f11, int i7, boolean z10, int i10, int i11, boolean z11) {
        boolean z12;
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
                    z12 = true;
                } else {
                    z12 = false;
                }
                float f14 = max2;
                int i13 = (int) (width / f14);
                int i14 = (int) (height / f14);
                if (i14 != 0 && i13 != 0) {
                    try {
                        return c0(photoSize, bitmap, compressFormat, i13, i14, f14, i7, z10, z12, z11);
                    } catch (Throwable th2) {
                        a8.g(th2, true);
                        D().j();
                        System.gc();
                        try {
                            return c0(photoSize, bitmap, compressFormat, i13, i14, f14, i7, z10, z12, z11);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.fc.c0(org.telegram.tgnet.TLRPC$PhotoSize, android.graphics.Bitmap, android.graphics.Bitmap$CompressFormat, int, int, float, int, boolean, boolean, boolean):org.telegram.tgnet.TLRPC$PhotoSize");
    }

    public static int d(fc fcVar, BitmapDrawable bitmapDrawable) {
        if (bitmapDrawable instanceof org.telegram.ui.Components.t5) {
            org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) bitmapDrawable;
            return Math.max(t5Var.getIntrinsicHeight() * t5Var.getIntrinsicWidth(), t5Var.f39523k0 * t5Var.f39522j0) * 12;
        } else if (bitmapDrawable instanceof ch0) {
            ch0 ch0Var = (ch0) bitmapDrawable;
            int i7 = ch0Var.f33572b * ch0Var.f33574c;
            if (ch0Var.H) {
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
                InputStream openInputStream = t0.f26600b.getContentResolver().openInputStream(uri);
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

    public static boolean e0(gc gcVar, String str) {
        if (!str.endsWith("_firstframe") && !str.endsWith("_lastframe")) {
            if ((gcVar != null && (gj.K2(gcVar.f23717i, true) || gcVar.f23724p == 1 || gj.N4(gcVar.f23717i))) || I(str)) {
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
                return new BitmapDrawable(t0.f26600b.getResources(), F("b", ((TLRPC.TL_photoStrippedSize) arrayList.get(i7)).bytes));
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
        File z10;
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
            tL_fileLocationToBeDeprecated.local_id = gz.p();
            tL_fileLocationToBeDeprecated.file_reference = new byte[0];
            TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.location = tL_fileLocationToBeDeprecated;
            tL_photoSize_layer127.f28076w = i7;
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
                z10 = w7.z(0);
            } else {
                z10 = w7.z(4);
            }
            File file = new File(z10, n10);
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
                w7.G(m10.f24934t0);
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
                if (str.equals(imageReceiver.R)) {
                    return imageReceiver.T;
                }
                if (str.equals(imageReceiver.f22277i0)) {
                    return imageReceiver.f22281k0;
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

    public static bc u(TLRPC.Message message) {
        int i7;
        int i10;
        float f10;
        Bitmap F;
        byte[] bArr;
        float f11;
        TLRPC.PhotoSize t6 = t(message);
        if (t6 != null && (bArr = t6.bytes) != null && bArr.length != 0) {
            w7.G(m10.f24934t0);
            File J2 = w7.J(t6, null, true, true);
            TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.f28076w = t6.f28076w;
            tL_photoSize_layer127.h = t6.h;
            tL_photoSize_layer127.location = t6.location;
            tL_photoSize_layer127.size = t6.size;
            tL_photoSize_layer127.type = t6.type;
            if (J2.exists() && message.grouped_id == 0) {
                PointF Q1 = org.telegram.ui.Cells.q1.Q1(t6.f28076w, t6.h, 0, 0);
                Locale locale = Locale.US;
                TLRPC.FileLocation fileLocation = t6.location;
                long j3 = fileLocation.volume_id;
                int i11 = fileLocation.local_id;
                float f12 = Q1.x;
                String str = j3 + "_" + i11 + "@" + ((int) (f12 / f11)) + "_" + ((int) (Q1.y / g0.f23608p)) + "_b";
                if (!D().J(str, false)) {
                    String path = J2.getPath();
                    float f13 = Q1.x;
                    float f14 = g0.f23608p;
                    Bitmap K2 = K(path, null, (int) (f13 / f14), (int) (Q1.y / f14), false);
                    if (K2 != null) {
                        Utilities.blurBitmap(K2, 3);
                        float f15 = Q1.x;
                        float f16 = g0.f23608p;
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(K2, (int) (f15 / f16), (int) (Q1.y / f16), true);
                        if (createScaledBitmap != K2) {
                            K2.recycle();
                            K2 = createScaledBitmap;
                        }
                        return new bc(str, new BitmapDrawable(K2));
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
                            i7 = w10.f28076w;
                        } else {
                            int i13 = 0;
                            while (true) {
                                if (i13 < message.media.document.attributes.size()) {
                                    if (message.media.document.attributes.get(i13) instanceof TLRPC.TL_documentAttributeVideo) {
                                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) message.media.document.attributes.get(i13);
                                        i10 = tL_documentAttributeVideo.h;
                                        i7 = tL_documentAttributeVideo.f28058w;
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
                        PointF Q12 = org.telegram.ui.Cells.q1.Q1(i7, i10, 0, 0);
                        Locale locale2 = Locale.US;
                        String s5 = gc.s(message, message, photoSize);
                        float f17 = Q12.x;
                        String str2 = s5 + "_false@" + ((int) (f17 / f10)) + "_" + ((int) (Q12.y / g0.f23608p)) + "_b";
                        if (!D().J(str2, false) && (F = F(null, photoSize.bytes)) != null) {
                            Utilities.blurBitmap(F, 3);
                            float f18 = Q12.x;
                            float f19 = g0.f23608p;
                            Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(F, (int) (f18 / f19), (int) (Q12.y / f19), true);
                            if (createScaledBitmap2 != F) {
                                F.recycle();
                                F = createScaledBitmap2;
                            }
                            return new bc(str2, new BitmapDrawable(F));
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
            str = document.dc_id + "_" + document.f28057id;
        } else if (tLObject instanceof cw) {
            TLRPC.TL_secureFile tL_secureFile = ((cw) tLObject).f22951b;
            str = tL_secureFile.dc_id + "_" + tL_secureFile.f28188id;
        } else if (tLObject instanceof k20) {
            str = Utilities.a(((k20) tLObject).f24630a);
        }
        return z(str + "@50_50");
    }

    public final void H(String str) {
        HashMap hashMap = this.f23460a;
        Integer num = (Integer) hashMap.get(str);
        if (num == null) {
            hashMap.put(str, 1);
        } else {
            hashMap.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    public final boolean J(String str, boolean z10) {
        if (z10) {
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
                File z10 = w7.z(4);
                File file = new File(z10, Utilities.a(str) + "_temp." + B);
                file.delete();
                wb wbVar = new wb(this, str, file, B, i7);
                this.B.add(wbVar);
                hashMap.put(str, wbVar);
                U(null, 0);
            }
        }
    }

    public final void M(org.telegram.messenger.ImageReceiver r38, java.util.List r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.fc.M(org.telegram.messenger.ImageReceiver, java.util.List):void");
    }

    public final void N(String str, String str2) {
        jb jbVar = this.f23462c;
        BitmapDrawable bitmapDrawable = (BitmapDrawable) jbVar.f(str);
        if (bitmapDrawable == null) {
            jbVar = this.f23461b;
            bitmapDrawable = (BitmapDrawable) jbVar.f(str);
        }
        this.f23477t.put(str, str2);
        if (bitmapDrawable != null) {
            BitmapDrawable bitmapDrawable2 = (BitmapDrawable) jbVar.f(str2);
            if (bitmapDrawable2 != null && bitmapDrawable2.getBitmap() != null && bitmapDrawable.getBitmap() != null) {
                Bitmap bitmap = bitmapDrawable2.getBitmap();
                Bitmap bitmap2 = bitmapDrawable.getBitmap();
                if (bitmap.getWidth() > bitmap2.getWidth() || bitmap.getHeight() > bitmap2.getHeight()) {
                    jbVar.n(str);
                }
            }
            this.F = str;
            jbVar.n(str);
            jbVar.l(str2, bitmapDrawable);
            this.F = null;
        }
        HashMap hashMap = this.f23460a;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            hashMap.put(str2, num);
            hashMap.remove(str);
        }
    }

    public final void O(BitmapDrawable bitmapDrawable, String str, boolean z10) {
        if (str.endsWith("_nocache")) {
            return;
        }
        if (z10) {
            this.f23461b.l(str, bitmapDrawable);
        } else {
            this.f23462c.l(str, bitmapDrawable);
        }
    }

    public final void P(ArrayList arrayList) {
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            O(((bc) arrayList.get(i7)).f22679a, ((bc) arrayList.get(i7)).f22680b, true);
        }
    }

    public final void Q(String str) {
        this.f23460a.remove(str);
        this.f23462c.n(str);
        this.f23461b.n(str);
    }

    public final void R(String str, String str2, gc gcVar, boolean z10) {
        if (z10) {
            g0.h3(new bm(this, str, str2, gcVar, 9));
        } else {
            S(str, str2, gcVar);
        }
    }

    public final void S(String str, String str2, gc gcVar) {
        for (int i7 = 0; i7 < 2; i7++) {
            ArrayList arrayList = null;
            if (i7 == 0) {
                ArrayList arrayList2 = (ArrayList) ((LinkedHashMap) this.f23462c.d).get(str);
                if (arrayList2 != null) {
                    arrayList = new ArrayList(arrayList2);
                }
            } else {
                ArrayList arrayList3 = (ArrayList) ((LinkedHashMap) this.f23461b.d).get(str);
                if (arrayList3 != null) {
                    arrayList = new ArrayList(arrayList3);
                }
            }
            int i10 = ns.f25535m4;
            if (arrayList != null) {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    String str3 = (String) arrayList.get(i11);
                    String E = a8.p0.E(str, "@", str3);
                    String str4 = str2 + "@" + str3;
                    N(E, str4);
                    ns.e().k(i10, E, str4, gcVar);
                }
            } else {
                N(str, str2);
                ns.e().k(i10, str, str2, gcVar);
            }
        }
    }

    public final void T(boolean z10) {
        if (z10) {
            this.f23481y--;
        }
        while (this.f23481y < 4) {
            LinkedList linkedList = this.f23472o;
            if (!linkedList.isEmpty()) {
                try {
                    ((sb) linkedList.poll()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                    this.f23481y++;
                } catch (Throwable unused) {
                    T(false);
                }
            } else {
                return;
            }
        }
    }

    public final void U(wb wbVar, int i7) {
        g0.h3(new l7(this, wbVar, i7, 4));
    }

    public final void V(boolean z10) {
        if (z10) {
            this.f23480x--;
        }
        while (this.f23480x < 4) {
            LinkedList linkedList = this.f23471n;
            if (!linkedList.isEmpty()) {
                ac acVar = (ac) linkedList.poll();
                if (acVar != null) {
                    acVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                    this.f23480x++;
                }
            } else {
                return;
            }
        }
    }

    public final void e(String str, k20 k20Var) {
        if (str != null && k20Var != null) {
            this.A.put(str, k20Var);
        }
    }

    public final void g(String str) {
        HashMap hashMap = this.C;
        wb wbVar = (wb) hashMap.get(str);
        if (wbVar != null) {
            wbVar.cancel(true);
            hashMap.remove(str);
            this.B.remove(wbVar);
        }
        Runnable runnable = (Runnable) this.D.get(str);
        if (runnable != null) {
            g0.r(runnable);
        }
        U(null, 0);
    }

    public final void h(ImageReceiver imageReceiver, boolean z10) {
        ArrayList arrayList = imageReceiver.f22310x1;
        HashMap hashMap = org.telegram.ui.web.v1.f52848f;
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
                    org.telegram.ui.web.v1.f52848f.remove(str);
                    break;
                }
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        p5 p5Var = this.f23476s;
        if (!isEmpty) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                p5Var.a((Runnable) arrayList.get(i10));
            }
            arrayList.clear();
        }
        arrayList.add(null);
        p5Var.c(new xf(this, z10, imageReceiver, 5));
    }

    public final void i(Runnable runnable) {
        ((of.a) this.f23473p.f6203b).execute(new x4(15, this, runnable));
    }

    public final void j() {
        this.f23461b.r(-1, null);
        this.f23462c.r(-1, null);
        this.f23463e.r(-1, null);
    }

    public final void k(final ImageReceiver imageReceiver, final String str, final String str2, final String str3, final gc gcVar, final String str4, final long j3, final int i7, final int i10, final int i11, final int i12) {
        final boolean z10;
        long j10;
        if (str2 != null && str != null && gcVar != null) {
            int G = imageReceiver.G(i10);
            if (G == 0) {
                G = this.G;
                if (i10 == 1) {
                    imageReceiver.f22257a0 = G;
                } else if (i10 == 3) {
                    imageReceiver.f22279j0 = G;
                } else {
                    imageReceiver.S = G;
                }
                int i13 = G + 1;
                this.G = i13;
                if (i13 == Integer.MAX_VALUE) {
                    this.G = 0;
                }
            }
            final int i14 = G;
            final boolean z11 = imageReceiver.G0;
            final Object obj = imageReceiver.h;
            final TLRPC.Document document = imageReceiver.I0;
            final boolean z12 = imageReceiver.H0;
            final int i15 = imageReceiver.d;
            if (i10 == 0 && imageReceiver.J0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.ib.run():void");
                }
            };
            if (imageReceiver.f22305w == 0) {
                j10 = 0;
            } else {
                j10 = 1;
            }
            this.f23476s.d(runnable, j10);
            imageReceiver.f22310x1.add(runnable);
        }
    }

    public final android.util.SparseArray l() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.fc.l():android.util.SparseArray");
    }

    public final boolean p(String str) {
        HashMap hashMap = this.f23460a;
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

    public final void v(int i7, File file, dc dcVar) {
        if ((i7 == 0 || i7 == 2 || i7 == 3) && file != null) {
            if (((ec) this.v.get(w7.r(null, dcVar.f23054a))) == null) {
                this.f23475r.c(new ec(this, i7, file, dcVar));
            }
        }
    }

    public final Float w(String str) {
        long[] jArr;
        if (str == null || (jArr = (long[]) this.f23478u.get(str)) == null) {
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
        return (long[]) this.f23478u.get(str);
    }

    public final BitmapDrawable y(String str) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) this.f23463e.f(str);
        if (bitmapDrawable instanceof org.telegram.ui.Components.t5) {
            org.telegram.ui.Components.t5 t5Var = (org.telegram.ui.Components.t5) bitmapDrawable;
            if (!t5Var.f39514d0 && t5Var.H0 < 15) {
                return bitmapDrawable;
            }
            this.f23463e.n(str);
            return null;
        }
        return bitmapDrawable;
    }

    public final BitmapDrawable z(String str) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) this.f23462c.f(str);
        if (bitmapDrawable == null) {
            bitmapDrawable = (BitmapDrawable) this.f23461b.f(str);
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
