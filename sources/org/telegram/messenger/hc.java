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
import org.telegram.ui.Components.bi0;
public final class hc {
    public static Bitmap M;
    public final ConcurrentHashMap A;
    public final LinkedList B;
    public final HashMap C;
    public final HashMap D;
    public int E;
    public String F;
    public int G;
    public File H;
    public final kb f15854b;
    public final kb f15855c;
    public final kb d;
    public final kb e;
    public final com.google.android.gms.internal.cast.c0 f15865p;
    public final r5 f15866q;
    public final r5 f15867r;
    public final r5 f15868s;
    public final HashMap f15869t;
    public final ConcurrentHashMap f15870u;
    public final HashMap v;
    public final HashMap f15871w;
    public int f15872x;
    public int f15873y;
    public final boolean f15874z;
    public static final ThreadLocal I = new ThreadLocal();
    public static final ThreadLocal J = new ThreadLocal();
    public static final byte[] K = new byte[12];
    public static final byte[] L = new byte[12];
    public static volatile hc N = null;
    public final HashMap f15853a = new HashMap();
    public final ArrayList f15856f = new ArrayList();
    public final HashMap f15857g = new HashMap();
    public final HashMap h = new HashMap();
    public final ConcurrentHashMap f15858i = new ConcurrentHashMap();
    public final HashSet f15859j = new HashSet();
    public final SparseArray f15860k = new SparseArray();
    public final HashMap f15861l = new HashMap();
    public final SparseArray f15862m = new SparseArray();
    public final LinkedList f15863n = new LinkedList();
    public final LinkedList f15864o = new LinkedList();

    public hc() {
        boolean z10;
        int i10;
        com.google.android.gms.internal.cast.c0 c0Var = new com.google.android.gms.internal.cast.c0(2);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        c0Var.f4585b = new ze.a(c0Var, new PriorityBlockingQueue(10, new lc.s(7)));
        this.f15865p = c0Var;
        this.f15866q = new r5("cacheThumbOutQueue");
        r5 r5Var = new r5("thumbGeneratingQueue");
        this.f15867r = r5Var;
        this.f15868s = new r5("imageLoadQueue");
        this.f15869t = new HashMap();
        this.f15870u = new ConcurrentHashMap();
        this.v = new HashMap();
        this.f15871w = new HashMap();
        this.f15872x = 0;
        this.f15873y = 0;
        this.A = new ConcurrentHashMap();
        this.B = new LinkedList();
        this.C = new HashMap();
        this.D = new HashMap();
        this.E = 0;
        this.F = null;
        this.G = 0;
        this.H = null;
        r5Var.setPriority(1);
        int memoryClass = ((ActivityManager) w0.f19025b.getSystemService("activity")).getMemoryClass();
        if (memoryClass >= 192) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f15874z = z10;
        if (z10) {
            i10 = 30;
        } else {
            i10 = 15;
        }
        int min = Math.min(i10, memoryClass / 7) * 1048576;
        float f7 = min;
        this.f15855c = new kb(this, (int) (0.8f * f7), 0);
        this.f15854b = new kb(this, (int) (f7 * 0.2f), 1);
        this.d = new kb(this, min / 4, 2);
        this.e = new kb(this);
        SparseArray sparseArray = new SparseArray();
        File E0 = i0.E0();
        if (!E0.isDirectory()) {
            try {
                E0.mkdirs();
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        i0.G(new File(E0, ".nomedia"));
        sparseArray.put(4, E0);
        for (int i11 = 0; i11 < 4; i11++) {
            b8.G(i11).E = new rb(this, i11);
        }
        b8.K = sparseArray;
        androidx.mediarouter.app.f fVar = new androidx.mediarouter.app.f(this, 9);
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
                w0.f19025b.registerReceiver(fVar, intentFilter, 4);
            } else {
                w0.f19025b.registerReceiver(fVar, intentFilter);
            }
        } catch (Throwable unused) {
        }
        i(null);
    }

    public static File A(String str) {
        String B = B(str, "jpg");
        File z10 = b8.z(4);
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

    public static hc D() {
        hc hcVar;
        hc hcVar2 = N;
        if (hcVar2 == null) {
            synchronized (hc.class) {
                try {
                    hcVar = N;
                    if (hcVar == null) {
                        hcVar = new hc();
                        N = hcVar;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return hcVar;
        }
        return hcVar2;
    }

    public static File E() {
        File file = w0.f19025b.getExternalMediaDirs()[0];
        if (!TextUtils.isEmpty(tz.f18150h0)) {
            for (int i10 = 0; i10 < w0.f19025b.getExternalMediaDirs().length; i10++) {
                File file2 = w0.f19025b.getExternalMediaDirs()[i10];
                if (file2 != null && file2.getPath().startsWith(tz.f18150h0)) {
                    file = w0.f19025b.getExternalMediaDirs()[i10];
                }
            }
        }
        return file;
    }

    public static android.graphics.Bitmap F(java.lang.String r12, byte[] r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hc.F(java.lang.String, byte[]):android.graphics.Bitmap");
    }

    public static synchronized Bitmap G() {
        Bitmap bitmap;
        synchronized (hc.class) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hc.K(java.lang.String, android.net.Uri, float, float, boolean):android.graphics.Bitmap");
    }

    public static void W(org.telegram.tgnet.TLRPC.Message r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hc.W(org.telegram.tgnet.TLRPC$Message):void");
    }

    public static void X(ArrayList arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                W((TLRPC.Message) arrayList.get(i10));
            }
        }
    }

    public static TLRPC.PhotoSize Y(Bitmap bitmap, float f7, float f10, int i10, int i11, int i12) {
        return b0(null, bitmap, Bitmap.CompressFormat.JPEG, f7, f10, i10, false, i11, i12, false);
    }

    public static TLRPC.PhotoSize Z(Bitmap bitmap, float f7, float f10, int i10, boolean z10) {
        return b0(null, bitmap, Bitmap.CompressFormat.JPEG, f7, f10, i10, z10, 0, 0, false);
    }

    public static TLRPC.PhotoSize a0(Bitmap bitmap, Bitmap.CompressFormat compressFormat, float f7, float f10, int i10) {
        return b0(null, bitmap, compressFormat, f7, f10, i10, false, 101, 101, false);
    }

    public static TLRPC.PhotoSize b0(TLRPC.PhotoSize photoSize, Bitmap bitmap, Bitmap.CompressFormat compressFormat, float f7, float f10, int i10, boolean z10, int i11, int i12, boolean z11) {
        boolean z12;
        float f11;
        int i13;
        float max;
        if (bitmap != null) {
            float width = bitmap.getWidth();
            float height = bitmap.getHeight();
            if (width != 0.0f && height != 0.0f) {
                float max2 = Math.max(width / f7, height / f10);
                if (i11 != 0 && i12 != 0 && (width < i11 || height < i12)) {
                    if (i13 < 0 && height > i12) {
                        max = width / f11;
                    } else {
                        if (width > f11) {
                            float f12 = i12;
                            if (height < f12) {
                                max = height / f12;
                            }
                        }
                        max = Math.max(width / f11, height / i12);
                    }
                    max2 = max;
                    z12 = true;
                } else {
                    z12 = false;
                }
                float f13 = max2;
                int i14 = (int) (width / f13);
                int i15 = (int) (height / f13);
                if (i15 != 0 && i14 != 0) {
                    try {
                        return c0(photoSize, bitmap, compressFormat, i14, i15, f13, i10, z10, z12, z11);
                    } catch (Throwable th2) {
                        f8.g(th2, true);
                        D().j();
                        System.gc();
                        try {
                            return c0(photoSize, bitmap, compressFormat, i14, i15, f13, i10, z10, z12, z11);
                        } catch (Throwable th3) {
                            f8.g(th3, true);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static org.telegram.tgnet.TLRPC.PhotoSize c0(org.telegram.tgnet.TLRPC.PhotoSize r5, android.graphics.Bitmap r6, android.graphics.Bitmap.CompressFormat r7, int r8, int r9, float r10, int r11, boolean r12, boolean r13, boolean r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hc.c0(org.telegram.tgnet.TLRPC$PhotoSize, android.graphics.Bitmap, android.graphics.Bitmap$CompressFormat, int, int, float, int, boolean, boolean, boolean):org.telegram.tgnet.TLRPC$PhotoSize");
    }

    public static int d(hc hcVar, BitmapDrawable bitmapDrawable) {
        if (bitmapDrawable instanceof org.telegram.ui.Components.s5) {
            org.telegram.ui.Components.s5 s5Var = (org.telegram.ui.Components.s5) bitmapDrawable;
            return Math.max(s5Var.getIntrinsicHeight() * s5Var.getIntrinsicWidth(), s5Var.f30138j0 * s5Var.f30137i0) * 12;
        } else if (bitmapDrawable instanceof bi0) {
            bi0 bi0Var = (bi0) bitmapDrawable;
            int i10 = bi0Var.f24753b * bi0Var.f24755c;
            if (bi0Var.G) {
                return i10 * 2;
            }
            return i10 * 8;
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
                    str = i0.T0(uri);
                } catch (Throwable th2) {
                    f8.g(th2, true);
                }
            }
        }
        if (str != null) {
            BitmapFactory.decodeFile(str, options);
        } else if (uri != null) {
            try {
                InputStream openInputStream = w0.f19025b.getContentResolver().openInputStream(uri);
                BitmapFactory.decodeStream(openInputStream, null, options);
                openInputStream.close();
            } catch (Throwable th3) {
                f8.g(th3, true);
                return false;
            }
        }
        float f7 = options.outWidth;
        float f10 = options.outHeight;
        if (f7 / f10 > 10.0f || f10 / f7 > 10.0f) {
            return true;
        }
        return false;
    }

    public static boolean e0(ic icVar, String str) {
        if (!str.endsWith("_firstframe") && !str.endsWith("_lastframe")) {
            if ((icVar != null && (jj.K2(icVar.f16102i, true) || icVar.f16109p == 1 || jj.N4(icVar.f16102i))) || I(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean f(File file, File file2, int i10) {
        File file3;
        File file4;
        byte[] bArr;
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = null;
        try {
            try {
                if (i10 == 0) {
                    file3 = new File(file, "000000000_999999_temp.f");
                    file4 = new File(file2, "000000000_999999.f");
                } else {
                    if (i10 != 3 && i10 != 5 && i10 != 6) {
                        if (i10 == 1) {
                            file3 = new File(file, "000000000_999999_temp.f");
                            file4 = new File(file2, "000000000_999999.f");
                        } else if (i10 == 2) {
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
        } catch (Exception e) {
            e = e;
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
        } catch (Exception e7) {
            e = e7;
            randomAccessFile2 = randomAccessFile;
            f8.g(e, true);
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                    return false;
                } catch (Exception e10) {
                    f8.g(e10, true);
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
                } catch (Exception e11) {
                    f8.g(e11, true);
                }
            }
            throw th;
        }
    }

    public static BitmapDrawable m(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (arrayList.get(i10) instanceof TLRPC.TL_photoStrippedSize) {
                return new BitmapDrawable(w0.f19025b.getResources(), F("b", ((TLRPC.TL_photoStrippedSize) arrayList.get(i10)).bytes));
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
            int i10 = options.outWidth;
            int i11 = options.outHeight;
            TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = new TLRPC.TL_fileLocationToBeDeprecated();
            tL_fileLocationToBeDeprecated.volume_id = -2147483648L;
            tL_fileLocationToBeDeprecated.dc_id = Integer.MIN_VALUE;
            tL_fileLocationToBeDeprecated.local_id = tz.p();
            tL_fileLocationToBeDeprecated.file_reference = new byte[0];
            TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.location = tL_fileLocationToBeDeprecated;
            tL_photoSize_layer127.f19818w = i10;
            tL_photoSize_layer127.h = i11;
            if (i10 <= 100 && i11 <= 100) {
                tL_photoSize_layer127.type = "s";
            } else if (i10 <= 320 && i11 <= 320) {
                tL_photoSize_layer127.type = "m";
            } else if (i10 <= 800 && i11 <= 800) {
                tL_photoSize_layer127.type = "x";
            } else if (i10 <= 1280 && i11 <= 1280) {
                tL_photoSize_layer127.type = "y";
            } else {
                tL_photoSize_layer127.type = "w";
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_fileLocationToBeDeprecated.volume_id);
            sb2.append("_");
            String p5 = a1.g.p(sb2, tL_fileLocationToBeDeprecated.local_id, ".jpg");
            if (tL_fileLocationToBeDeprecated.volume_id != -2147483648L) {
                z10 = b8.z(0);
            } else {
                z10 = b8.z(4);
            }
            File file = new File(z10, p5);
            new File(str).renameTo(file);
            tL_photoSize_layer127.size = (int) file.length();
            return tL_photoSize_layer127;
        } catch (Exception e) {
            f8.g(e, true);
            return null;
        }
    }

    public static void r(TLRPC.PhotoSize photoSize) {
        if (photoSize != null) {
            byte[] bArr = photoSize.bytes;
            if (bArr == null || bArr.length == 0) {
                b8.G(d20.f15147s0);
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(b8.K(photoSize, null, true, true), "r");
                    if (((int) randomAccessFile.length()) < 20000) {
                        int length = (int) randomAccessFile.length();
                        byte[] bArr2 = new byte[length];
                        photoSize.bytes = bArr2;
                        randomAccessFile.readFully(bArr2, 0, length);
                    }
                } catch (Throwable th2) {
                    f8.g(th2, true);
                }
            }
        }
    }

    public static Drawable s(String str, List list) {
        if (list != null) {
            for (int i10 = 0; i10 < list.size(); i10++) {
                ImageReceiver imageReceiver = (ImageReceiver) list.get(i10);
                if (str.equals(imageReceiver.Q)) {
                    return imageReceiver.S;
                }
                if (str.equals(imageReceiver.f14383h0)) {
                    return imageReceiver.f14387j0;
                }
            }
            return null;
        }
        return null;
    }

    public static TLRPC.PhotoSize t(TLRPC.Message message) {
        TLRPC.MessageMedia messageMedia = message.media;
        int i10 = 0;
        if (messageMedia instanceof TLRPC.TL_messageMediaPhoto) {
            int size = messageMedia.photo.sizes.size();
            while (i10 < size) {
                TLRPC.PhotoSize photoSize = message.media.photo.sizes.get(i10);
                if (photoSize instanceof TLRPC.TL_photoCachedSize) {
                    return photoSize;
                }
                i10++;
            }
            return null;
        } else if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                int size2 = document.thumbs.size();
                while (i10 < size2) {
                    TLRPC.PhotoSize photoSize2 = message.media.document.thumbs.get(i10);
                    if (photoSize2 instanceof TLRPC.TL_photoCachedSize) {
                        return photoSize2;
                    }
                    i10++;
                }
                return null;
            }
            return null;
        } else if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
            TLRPC.Photo photo = messageMedia.webpage.photo;
            if (photo != null) {
                int size3 = photo.sizes.size();
                while (i10 < size3) {
                    TLRPC.PhotoSize photoSize3 = message.media.webpage.photo.sizes.get(i10);
                    if (photoSize3 instanceof TLRPC.TL_photoCachedSize) {
                        return photoSize3;
                    }
                    i10++;
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

    public static dc u(TLRPC.Message message) {
        int i10;
        int i11;
        float f7;
        Bitmap F;
        byte[] bArr;
        float f10;
        TLRPC.PhotoSize t10 = t(message);
        if (t10 != null && (bArr = t10.bytes) != null && bArr.length != 0) {
            b8.G(d20.f15147s0);
            File K2 = b8.K(t10, null, true, true);
            TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
            tL_photoSize_layer127.f19818w = t10.f19818w;
            tL_photoSize_layer127.h = t10.h;
            tL_photoSize_layer127.location = t10.location;
            tL_photoSize_layer127.size = t10.size;
            tL_photoSize_layer127.type = t10.type;
            if (K2.exists() && message.grouped_id == 0) {
                PointF N1 = org.telegram.ui.Cells.q1.N1(t10.f19818w, t10.h, 0, 0);
                Locale locale = Locale.US;
                TLRPC.FileLocation fileLocation = t10.location;
                long j10 = fileLocation.volume_id;
                int i12 = fileLocation.local_id;
                float f11 = N1.x;
                String str = j10 + "_" + i12 + "@" + ((int) (f11 / f10)) + "_" + ((int) (N1.y / i0.f16025p)) + "_b";
                if (!D().J(str, false)) {
                    String path = K2.getPath();
                    float f12 = N1.x;
                    float f13 = i0.f16025p;
                    Bitmap K3 = K(path, null, (int) (f12 / f13), (int) (N1.y / f13), false);
                    if (K3 != null) {
                        Utilities.blurBitmap(K3, 3);
                        float f14 = N1.x;
                        float f15 = i0.f16025p;
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(K3, (int) (f14 / f15), (int) (N1.y / f15), true);
                        if (createScaledBitmap != K3) {
                            K3.recycle();
                            K3 = createScaledBitmap;
                        }
                        return new dc(str, new BitmapDrawable(K3));
                    }
                }
            }
        } else {
            TLRPC.MessageMedia messageMedia = message.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaDocument) {
                int size = messageMedia.document.thumbs.size();
                for (int i13 = 0; i13 < size; i13++) {
                    TLRPC.PhotoSize photoSize = message.media.document.thumbs.get(i13);
                    if (photoSize instanceof TLRPC.TL_photoStrippedSize) {
                        TLRPC.PhotoSize w9 = b8.w(message.media.document.thumbs, 320, false, null, false);
                        if (w9 != null) {
                            i11 = w9.h;
                            i10 = w9.f19818w;
                        } else {
                            int i14 = 0;
                            while (true) {
                                if (i14 < message.media.document.attributes.size()) {
                                    if (message.media.document.attributes.get(i14) instanceof TLRPC.TL_documentAttributeVideo) {
                                        TLRPC.TL_documentAttributeVideo tL_documentAttributeVideo = (TLRPC.TL_documentAttributeVideo) message.media.document.attributes.get(i14);
                                        i11 = tL_documentAttributeVideo.h;
                                        i10 = tL_documentAttributeVideo.f19800w;
                                        break;
                                    }
                                    i14++;
                                } else {
                                    i10 = 0;
                                    i11 = 0;
                                    break;
                                }
                            }
                        }
                        PointF N12 = org.telegram.ui.Cells.q1.N1(i10, i11, 0, 0);
                        Locale locale2 = Locale.US;
                        String s10 = ic.s(message, message, photoSize);
                        float f16 = N12.x;
                        String str2 = s10 + "_false@" + ((int) (f16 / f7)) + "_" + ((int) (N12.y / i0.f16025p)) + "_b";
                        if (!D().J(str2, false) && (F = F(null, photoSize.bytes)) != null) {
                            Utilities.blurBitmap(F, 3);
                            float f17 = N12.x;
                            float f18 = i0.f16025p;
                            Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(F, (int) (f17 / f18), (int) (N12.y / f18), true);
                            if (createScaledBitmap2 != F) {
                                F.recycle();
                                F = createScaledBitmap2;
                            }
                            return new dc(str2, new BitmapDrawable(F));
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
            str = document.dc_id + "_" + document.f19799id;
        } else if (tLObject instanceof pw) {
            TLRPC.TL_secureFile tL_secureFile = ((pw) tLObject).f17489b;
            str = tL_secureFile.dc_id + "_" + tL_secureFile.f19930id;
        } else if (tLObject instanceof b30) {
            str = Utilities.a(((b30) tLObject).f14715a);
        }
        return z(str + "@50_50");
    }

    public final void H(String str) {
        HashMap hashMap = this.f15853a;
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

    public final void L(int i10, String str, String str2) {
        if (str != null && str.length() != 0) {
            HashMap hashMap = this.C;
            if (!hashMap.containsKey(str)) {
                String B = B(str, str2);
                File z10 = b8.z(4);
                File file = new File(z10, Utilities.a(str) + "_temp." + B);
                file.delete();
                yb ybVar = new yb(this, str, file, B, i10);
                this.B.add(ybVar);
                hashMap.put(str, ybVar);
                U(null, 0);
            }
        }
    }

    public final void M(org.telegram.messenger.ImageReceiver r38, java.util.List r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hc.M(org.telegram.messenger.ImageReceiver, java.util.List):void");
    }

    public final void N(String str, String str2) {
        kb kbVar = this.f15855c;
        BitmapDrawable bitmapDrawable = (BitmapDrawable) kbVar.f(str);
        if (bitmapDrawable == null) {
            kbVar = this.f15854b;
            bitmapDrawable = (BitmapDrawable) kbVar.f(str);
        }
        this.f15869t.put(str, str2);
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
        HashMap hashMap = this.f15853a;
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
            this.f15854b.l(str, bitmapDrawable);
        } else {
            this.f15855c.l(str, bitmapDrawable);
        }
    }

    public final void P(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            O(((dc) arrayList.get(i10)).f15218a, ((dc) arrayList.get(i10)).f15219b, true);
        }
    }

    public final void Q(String str) {
        this.f15853a.remove(str);
        this.f15855c.n(str);
        this.f15854b.n(str);
    }

    public final void R(String str, String str2, ic icVar, boolean z10) {
        if (z10) {
            i0.g3(new ul(this, str, str2, icVar, 9));
        } else {
            S(str, str2, icVar);
        }
    }

    public final void S(String str, String str2, ic icVar) {
        for (int i10 = 0; i10 < 2; i10++) {
            ArrayList arrayList = null;
            if (i10 == 0) {
                ArrayList arrayList2 = (ArrayList) ((LinkedHashMap) this.f15855c.d).get(str);
                if (arrayList2 != null) {
                    arrayList = new ArrayList(arrayList2);
                }
            } else {
                ArrayList arrayList3 = (ArrayList) ((LinkedHashMap) this.f15854b.d).get(str);
                if (arrayList3 != null) {
                    arrayList = new ArrayList(arrayList3);
                }
            }
            int i11 = zs.f19651m4;
            if (arrayList != null) {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    String str3 = (String) arrayList.get(i12);
                    String C = a1.g.C(str, "@", str3);
                    String str4 = str2 + "@" + str3;
                    N(C, str4);
                    zs.e().k(i11, C, str4, icVar);
                }
            } else {
                N(str, str2);
                zs.e().k(i11, str, str2, icVar);
            }
        }
    }

    public final void T(boolean z10) {
        if (z10) {
            this.f15873y--;
        }
        while (this.f15873y < 4) {
            LinkedList linkedList = this.f15864o;
            if (!linkedList.isEmpty()) {
                try {
                    ((ub) linkedList.poll()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                    this.f15873y++;
                } catch (Throwable unused) {
                    T(false);
                }
            } else {
                return;
            }
        }
    }

    public final void U(yb ybVar, int i10) {
        i0.g3(new o7(this, ybVar, i10, 4));
    }

    public final void V(boolean z10) {
        if (z10) {
            this.f15872x--;
        }
        while (this.f15872x < 4) {
            LinkedList linkedList = this.f15863n;
            if (!linkedList.isEmpty()) {
                cc ccVar = (cc) linkedList.poll();
                if (ccVar != null) {
                    ccVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, null, null, null);
                    this.f15872x++;
                }
            } else {
                return;
            }
        }
    }

    public final void e(String str, b30 b30Var) {
        if (str != null && b30Var != null) {
            this.A.put(str, b30Var);
        }
    }

    public final void g(String str) {
        HashMap hashMap = this.C;
        yb ybVar = (yb) hashMap.get(str);
        if (ybVar != null) {
            ybVar.cancel(true);
            hashMap.remove(str);
            this.B.remove(ybVar);
        }
        Runnable runnable = (Runnable) this.D.get(str);
        if (runnable != null) {
            i0.r(runnable);
        }
        U(null, 0);
    }

    public final void h(ImageReceiver imageReceiver, boolean z10) {
        ArrayList arrayList = imageReceiver.f14416w1;
        HashMap hashMap = org.telegram.ui.web.y1.f43250f;
        if (hashMap != null) {
            Iterator it = hashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                ArrayList arrayList2 = (ArrayList) entry.getValue();
                int i10 = 0;
                while (true) {
                    if (i10 >= arrayList2.size()) {
                        break;
                    } else if (((Pair) arrayList2.get(i10)).first == imageReceiver) {
                        arrayList2.remove(i10);
                        break;
                    } else {
                        i10++;
                    }
                }
                if (arrayList2.isEmpty()) {
                    org.telegram.ui.web.y1.f43250f.remove(str);
                    break;
                }
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        r5 r5Var = this.f15868s;
        if (!isEmpty) {
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                r5Var.a((Runnable) arrayList.get(i11));
            }
            arrayList.clear();
        }
        arrayList.add(null);
        r5Var.c(new wf(this, z10, imageReceiver, 5));
    }

    public final void i(Runnable runnable) {
        ((ze.a) this.f15865p.f4585b).execute(new t6(13, this, runnable));
    }

    public final void j() {
        this.f15854b.r(-1, null);
        this.f15855c.r(-1, null);
        this.e.r(-1, null);
    }

    public final void k(final ImageReceiver imageReceiver, final String str, final String str2, final String str3, final ic icVar, final String str4, final long j10, final int i10, final int i11, final int i12, final int i13) {
        final boolean z10;
        long j11;
        if (str2 != null && str != null && icVar != null) {
            int G = imageReceiver.G(i11);
            if (G == 0) {
                G = this.G;
                if (i11 == 1) {
                    imageReceiver.Z = G;
                } else if (i11 == 3) {
                    imageReceiver.f14385i0 = G;
                } else {
                    imageReceiver.R = G;
                }
                int i14 = G + 1;
                this.G = i14;
                if (i14 == Integer.MAX_VALUE) {
                    this.G = 0;
                }
            }
            final int i15 = G;
            final boolean z11 = imageReceiver.F0;
            final Object obj = imageReceiver.h;
            final TLRPC.Document document = imageReceiver.H0;
            final boolean z12 = imageReceiver.G0;
            final int i16 = imageReceiver.d;
            if (i11 == 0 && imageReceiver.I0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.jb.run():void");
                }
            };
            if (imageReceiver.f14414w == 0) {
                j11 = 0;
            } else {
                j11 = 1;
            }
            this.f15868s.d(runnable, j11);
            imageReceiver.f14416w1.add(runnable);
        }
    }

    public final android.util.SparseArray l() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.hc.l():android.util.SparseArray");
    }

    public final boolean p(String str) {
        HashMap hashMap = this.f15853a;
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

    public final void v(int i10, File file, fc fcVar) {
        if ((i10 == 0 || i10 == 2 || i10 == 3) && file != null) {
            if (((gc) this.v.get(b8.r(null, fcVar.f15535a))) == null) {
                this.f15867r.c(new gc(this, i10, file, fcVar));
            }
        }
    }

    public final Float w(String str) {
        long[] jArr;
        if (str == null || (jArr = (long[]) this.f15870u.get(str)) == null) {
            return null;
        }
        long j10 = jArr[1];
        if (j10 == 0) {
            return Float.valueOf(0.0f);
        }
        return Float.valueOf(Math.min(1.0f, ((float) jArr[0]) / ((float) j10)));
    }

    public final long[] x(String str) {
        if (str == null) {
            return null;
        }
        return (long[]) this.f15870u.get(str);
    }

    public final BitmapDrawable y(String str) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) this.e.f(str);
        if (bitmapDrawable instanceof org.telegram.ui.Components.s5) {
            org.telegram.ui.Components.s5 s5Var = (org.telegram.ui.Components.s5) bitmapDrawable;
            if (!s5Var.f30130c0 && s5Var.G0 < 15) {
                return bitmapDrawable;
            }
            this.e.n(str);
            return null;
        }
        return bitmapDrawable;
    }

    public final BitmapDrawable z(String str) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) this.f15855c.f(str);
        if (bitmapDrawable == null) {
            bitmapDrawable = (BitmapDrawable) this.f15854b.f(str);
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
