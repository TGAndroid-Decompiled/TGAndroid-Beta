package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.media.MediaExtractor;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PremiumPreviewFragment;
public final class mj4 implements lv8, im4, g22, rp5, qoa, iz4, nj0, cz8, mv8, wk0, t5b {
    public final byte a;
    public Object b;
    public Object c;

    public mj4(long[] jArr) {
        this.a = (byte) 24;
        this.c = jArr;
        if (jArr.length >= 30) {
            this.b = new q01[(int) (Math.pow(2.0d, Math.floor((Math.log(jArr.length) / 0.6931471805599453d) + 1.0d)) * 2.0d)];
            d(1, 0, jArr.length);
        }
    }

    public final void A(double d) {
        ti2 ti2Var = (ti2) this.b;
        ti2Var.getClass();
        try {
            roe roeVar = (roe) ti2Var.a;
            Parcel R = roeVar.R();
            R.writeDouble(d);
            roeVar.V(R, 5);
        } catch (RemoteException e) {
            i2d.h(e);
        }
    }

    @Override
    public final boolean B() {
        return false;
    }

    public final void C(int i) {
        ti2 ti2Var = (ti2) this.b;
        ti2Var.getClass();
        try {
            roe roeVar = (roe) ti2Var.a;
            Parcel R = roeVar.R();
            R.writeInt(i);
            roeVar.V(R, 9);
        } catch (RemoteException e) {
            i2d.h(e);
        }
    }

    @Override
    public final void E0(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        i22 i22Var = (i22) this.b;
        try {
            HashMap<Object, Object> selectedPhotos = i22Var.d2.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                jo6 jo6Var = (jo6) selectedPhotos.values().iterator().next();
                String str = jo6Var.h;
                if (str == null) {
                    str = jo6Var.I;
                }
                ry5 ry5Var = (ry5) this.c;
                ry5Var.a0(ry5Var.d0(str, true));
                i22Var.dismiss();
            }
        } catch (Throwable th) {
            fc4.g(th, true);
        }
    }

    @Override
    public final t76 F(jt6 jt6Var) {
        t76 F = ((de) this.b).F(jt6Var);
        if (F == null) {
            return null;
        }
        return d4.o(F, new ar4(this, (byte) 2));
    }

    @Override
    public final boolean K0() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final t76 N(byte[] bArr) {
        return d4.o(((de) this.b).N(bArr), new ar4(this, (byte) 2));
    }

    @Override
    public final void a(bz8 bz8Var, int i) {
        int[] iArr = (int[]) this.c;
        try {
            bz8Var.read((byte[]) this.b, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            bz8Var.close();
        }
    }

    @Override
    public final void a1(vr0 vr0Var) {
        vr0Var.run();
    }

    @Override
    public final mj0 b(vb3 vb3Var, long j) {
        long j2 = vb3Var.d;
        int min = (int) Math.min(20000L, vb3Var.c - j2);
        yw7 yw7Var = (yw7) this.c;
        yw7Var.K(min);
        vb3Var.d(yw7Var.a, 0, min, false);
        int i = -1;
        int i2 = -1;
        long j3 = -9223372036854775807L;
        while (yw7Var.a() >= 4) {
            if (dk4.b(yw7Var.b, yw7Var.a) != 442) {
                yw7Var.O(1);
            } else {
                yw7Var.O(4);
                long c = hw8.c(yw7Var);
                if (c != -9223372036854775807L) {
                    long b = ((vqb) this.b).b(c);
                    if (b > j) {
                        if (j3 == -9223372036854775807L) {
                            return new mj0(b, -1, j2);
                        }
                        return new mj0(-9223372036854775807L, 0, j2 + i2);
                    }
                    int i3 = ((b + 100000) > j ? 1 : ((b + 100000) == j ? 0 : -1));
                    int i4 = yw7Var.b;
                    if (i3 > 0) {
                        return new mj0(-9223372036854775807L, 0, j2 + i4);
                    }
                    i2 = i4;
                    j3 = b;
                }
                int i5 = yw7Var.c;
                if (yw7Var.a() < 10) {
                    yw7Var.N(i5);
                } else {
                    yw7Var.O(9);
                    int A = yw7Var.A() & 7;
                    if (yw7Var.a() < A) {
                        yw7Var.N(i5);
                    } else {
                        yw7Var.O(A);
                        if (yw7Var.a() < 4) {
                            yw7Var.N(i5);
                        } else {
                            if (dk4.b(yw7Var.b, yw7Var.a) == 443) {
                                yw7Var.O(4);
                                int H = yw7Var.H();
                                if (yw7Var.a() < H) {
                                    yw7Var.N(i5);
                                } else {
                                    yw7Var.O(H);
                                }
                            }
                            while (true) {
                                if (yw7Var.a() < 4) {
                                    break;
                                }
                                int b2 = dk4.b(yw7Var.b, yw7Var.a);
                                if (b2 == 442 || b2 == 441 || (b2 >>> 8) != 1) {
                                    break;
                                }
                                yw7Var.O(4);
                                if (yw7Var.a() < 2) {
                                    yw7Var.N(i5);
                                    break;
                                }
                                yw7Var.N(Math.min(yw7Var.c, yw7Var.b + yw7Var.H()));
                            }
                        }
                    }
                }
                i = yw7Var.b;
            }
        }
        if (j3 != -9223372036854775807L) {
            return new mj0(j3, -2, j2 + i);
        }
        return mj0.d;
    }

    @Override
    public final void c() {
        byte[] bArr = hac.b;
        ((yw7) this.c).L(bArr.length, bArr);
    }

    public final void d(int i, int i2, int i3) {
        q01[] q01VarArr = (q01[]) this.b;
        ?? obj = new Object();
        obj.e = null;
        q01VarArr[i] = obj;
        obj.c = i2;
        obj.d = (i2 + i3) - 1;
        if (i3 == 1) {
            long j = ((long[]) this.c)[i2];
            obj.a = j;
            obj.b = j;
            return;
        }
        int i4 = i << 1;
        int i5 = i3 / 2;
        d(i4, i2, i5);
        int i6 = i4 + 1;
        d(i6, i2 + i5, i3 - i5);
        q01 q01Var = q01VarArr[i];
        q01 q01Var2 = q01VarArr[i4];
        q01Var2.getClass();
        q01 q01Var3 = q01VarArr[i6];
        q01Var3.getClass();
        q01Var.getClass();
        q01Var.a = Math.max(q01Var2.a, q01Var3.a);
        q01VarArr[i].b = Math.min(q01VarArr[i4].b, q01VarArr[i6].b);
    }

    @Override
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        Paint paint = (Paint) this.b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.c;
        nj8 nj8Var = premiumPreviewFragment.n0;
        if (premiumPreviewFragment.i0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(cmb.Z6));
            canvas.drawRect(f, f2, f3, f4, paint);
            return;
        }
        nj8Var.d(0, (-premiumPreviewFragment.e0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.c0, 0, premiumPreviewFragment.e0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.e0.getMeasuredHeight());
        canvas.drawRect(f, f2, f3, f4, nj8Var.f);
    }

    @Override
    public final String f() {
        return "tg|" + ((Uri) this.b).getQueryParameter("id") + "|" + ((Long) this.c);
    }

    @Override
    public final qp5 f1(wm4 wm4Var) {
        int i;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) wm4Var.b;
        if (arrayList2 != null) {
            i = arrayList2.size();
        } else {
            i = 0;
        }
        if (i > 0) {
            ArrayList arrayList3 = new ArrayList(arrayList.size() + i);
            arrayList3.addAll(arrayList);
            arrayList3.addAll(arrayList2);
            arrayList = arrayList3;
        }
        return new el6(wm4Var, (ArrayList) this.b, arrayList);
    }

    @Override
    public final java.lang.Object g(defpackage.jm4 r8, defpackage.px2 r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj4.g(jm4, px2):java.lang.Object");
    }

    @Override
    public final Object mo8get() {
        switch (this.a) {
            case 0:
                Context context = (Context) ((lq5) this.b).a;
                cy2 cy2Var = (cy2) ((lq5) this.c).a;
                context.getClass();
                cy2Var.getClass();
                return jj4.a(dhf.d, new ai4(new dy2((byte) 1), (byte) 28), ibe.a(cy2Var), new ij4(context, (byte) 0));
            case 23:
                kg7 kg7Var = new kg7((byte) 29);
                k4f k4fVar = new k4f((byte) 28);
                qs9 qs9Var = (qs9) ((et8) this.b).mo8get();
                return new mq9(kg7Var, k4fVar, qa0.f, qs9Var, (mv8) this.c);
            default:
                return new l9a((kaa) ((lv8) this.b).mo8get(), (kaa) ((lv8) this.c).mo8get());
        }
    }

    public final void h(q01 q01Var, int i) {
        q01Var.e = Integer.valueOf(i);
        int i2 = q01Var.c;
        long j = i;
        q01Var.a = j;
        q01Var.b = j;
        ((long[]) this.c)[i2] = j;
    }

    public final void i() {
        this.b = null;
        this.c = null;
    }

    public final void j(String str, PrintWriter printWriter) {
        boolean z;
        oa6 oa6Var = (oa6) this.c;
        if (oa6Var.b.c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String concat = str.concat("    ");
            int i = 0;
            while (true) {
                rma rmaVar = oa6Var.b;
                if (i < rmaVar.c) {
                    na6 na6Var = (na6) rmaVar.b[i];
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(oa6Var.b.a[i]);
                    printWriter.print(": ");
                    printWriter.println(na6Var.toString());
                    printWriter.print(concat);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mArgs=");
                    Object obj = null;
                    printWriter.println((Object) null);
                    printWriter.print(concat);
                    printWriter.print("mLoader=");
                    printWriter.println(na6Var.l);
                    x5d x5dVar = na6Var.l;
                    String concat2 = concat.concat("  ");
                    x5dVar.getClass();
                    printWriter.print(concat2);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mListener=");
                    printWriter.println(x5dVar.a);
                    if (x5dVar.b || x5dVar.e) {
                        printWriter.print(concat2);
                        printWriter.print("mStarted=");
                        printWriter.print(x5dVar.b);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(x5dVar.e);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(false);
                    }
                    if (x5dVar.c || x5dVar.d) {
                        printWriter.print(concat2);
                        printWriter.print("mAbandoned=");
                        printWriter.print(x5dVar.c);
                        printWriter.print(" mReset=");
                        printWriter.println(x5dVar.d);
                    }
                    if (x5dVar.g != null) {
                        printWriter.print(concat2);
                        printWriter.print("mTask=");
                        printWriter.print(x5dVar.g);
                        printWriter.print(" waiting=");
                        x5dVar.g.getClass();
                        printWriter.println(false);
                    }
                    if (x5dVar.h != null) {
                        printWriter.print(concat2);
                        printWriter.print("mCancellingTask=");
                        printWriter.print(x5dVar.h);
                        printWriter.print(" waiting=");
                        x5dVar.h.getClass();
                        printWriter.println(false);
                    }
                    if (na6Var.n != null) {
                        printWriter.print(concat);
                        printWriter.print("mCallbacks=");
                        printWriter.println(na6Var.n);
                        m41 m41Var = na6Var.n;
                        String concat3 = concat.concat("  ");
                        m41Var.getClass();
                        printWriter.print(concat3);
                        printWriter.print("mDeliveredData=");
                        printWriter.println(m41Var.b);
                    }
                    printWriter.print(concat);
                    printWriter.print("mData=");
                    x5d x5dVar2 = na6Var.l;
                    Object obj2 = na6Var.e;
                    if (obj2 != kj7.k) {
                        obj = obj2;
                    }
                    x5dVar2.getClass();
                    StringBuilder sb = new StringBuilder(64);
                    if (obj == null) {
                        sb.append("null");
                    } else {
                        Class<?> cls = obj.getClass();
                        sb.append(cls.getSimpleName());
                        sb.append("{");
                        sb.append(Integer.toHexString(System.identityHashCode(cls)));
                        sb.append("}");
                    }
                    printWriter.println(sb.toString());
                    printWriter.print(concat);
                    printWriter.print("mStarted=");
                    if (na6Var.c > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    printWriter.println(z);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final com.google.android.datatransport.cct.CctBackendFactory k(java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj4.k(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public final File l() {
        if (((File) this.b) == null) {
            synchronized (this) {
                if (((File) this.b) == null) {
                    String str = "PersistedInstallation." + ((li4) this.c).d() + ".json";
                    li4 li4Var = (li4) this.c;
                    li4Var.a();
                    File file = new File(li4Var.a.getNoBackupFilesDir(), str);
                    this.b = file;
                    if (file.exists()) {
                        return (File) this.b;
                    }
                    li4 li4Var2 = (li4) this.c;
                    li4Var2.a();
                    File file2 = new File(li4Var2.a.getFilesDir(), str);
                    if (file2.exists() && !file2.renameTo((File) this.b)) {
                        Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                        return file2;
                    }
                }
            }
        }
        return (File) this.b;
    }

    public final String m(String str) {
        Resources resources = (Resources) this.b;
        int identifier = resources.getIdentifier(str, "string", (String) this.c);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override
    public final Closeable n(MediaExtractor mediaExtractor) {
        u5b u5bVar = new u5b(((Long) this.c).longValue(), (Uri) this.b);
        mediaExtractor.setDataSource(u5bVar);
        return u5bVar;
    }

    @Override
    public final StackTraceElement[] o(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        qoa[] qoaVarArr = (qoa[]) this.b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            qoa qoaVar = qoaVarArr[i];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = qoaVar.o(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((kg7) this.c).o(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    public final boolean p(Long l) {
        boolean z;
        synchronized (((HashMap) this.c)) {
            g79 g79Var = (g79) ((HashMap) this.c).get(l);
            if (g79Var != null && !g79Var.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void q(gb0 gb0Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", gb0Var.a);
            jSONObject.put("Status", wi8.F(gb0Var.b));
            jSONObject.put("AuthToken", gb0Var.c);
            jSONObject.put("RefreshToken", gb0Var.d);
            jSONObject.put("TokenCreationEpochInSecs", gb0Var.f);
            jSONObject.put("ExpiresInSecs", gb0Var.e);
            jSONObject.put("FisError", gb0Var.g);
            li4 li4Var = (li4) this.c;
            li4Var.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", li4Var.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(l())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    public final boolean r(py6 py6Var, String str) {
        int i = py6Var.b;
        Context context = (Context) this.b;
        if (i < 0) {
            if (context.getPackageManager().checkPermission(str, py6Var.a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i, py6Var.c) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public final void s(int i) {
        q01[] q01VarArr = (q01[]) this.b;
        q01 q01Var = q01VarArr[i];
        Integer num = (Integer) q01Var.e;
        if (num != null) {
            int i2 = i << 1;
            h(q01VarArr[i2], num.intValue());
            h(q01VarArr[i2 + 1], ((Integer) q01Var.e).intValue());
            q01Var.e = null;
        }
    }

    public final long t(int i, int i2) {
        long[] jArr = (long[]) this.c;
        if (jArr.length < 30) {
            if (i < 0) {
                i = 0;
            }
            if (i2 > jArr.length - 1) {
                i2 = jArr.length - 1;
            }
            long j = Long.MIN_VALUE;
            while (i <= i2) {
                long j2 = jArr[i];
                if (j2 > j) {
                    j = j2;
                }
                i++;
            }
            return j;
        }
        return u(1, i, i2);
    }

    public final String toString() {
        switch (this.a) {
            case 7:
                StringBuilder sb = new StringBuilder(128);
                sb.append("LoaderManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                Class<?> cls = ((e36) this.b).getClass();
                sb.append(cls.getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(cls)));
                sb.append("}}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public final long u(int i, int i2, int i3) {
        q01 q01Var = ((q01[]) this.b)[i];
        Integer num = (Integer) q01Var.e;
        if (num != null) {
            int i4 = q01Var.c;
            int i5 = q01Var.d;
            if (i2 >= i4 && i3 <= i5) {
                return num.intValue();
            }
        }
        int i6 = q01Var.c;
        int i7 = q01Var.d;
        if (i6 >= i2 && i7 <= i3) {
            return q01Var.a;
        }
        if ((i2 <= i6 && i3 >= i6) || (i2 >= i6 && i2 <= i7)) {
            s(i);
            int i8 = i << 1;
            return Math.max(u(i8, i2, i3), u(i8 + 1, i2, i3));
        }
        return 0L;
    }

    public final long v(int i, int i2) {
        long[] jArr = (long[]) this.c;
        if (jArr.length < 30) {
            if (i < 0) {
                i = 0;
            }
            if (i2 > jArr.length - 1) {
                i2 = jArr.length - 1;
            }
            long j = Long.MAX_VALUE;
            while (i <= i2) {
                long j2 = jArr[i];
                if (j2 < j) {
                    j = j2;
                }
                i++;
            }
            return j;
        }
        return w(1, i, i2);
    }

    public final long w(int i, int i2, int i3) {
        q01 q01Var = ((q01[]) this.b)[i];
        Integer num = (Integer) q01Var.e;
        if (num != null) {
            int i4 = q01Var.c;
            int i5 = q01Var.d;
            if (i2 >= i4 && i3 <= i5) {
                return num.intValue();
            }
        }
        int i6 = q01Var.c;
        int i7 = q01Var.d;
        if (i6 >= i2 && i7 <= i3) {
            return q01Var.b;
        }
        if ((i2 <= i6 && i3 >= i6) || (i2 >= i6 && i2 <= i7)) {
            s(i);
            int i8 = i << 1;
            return Math.min(w(i8, i2, i3), w(i8 + 1, i2, i3));
        }
        return 2147483647L;
    }

    public final gb0 x() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(l());
            while (true) {
                int read = fileInputStream.read(bArr, 0, 16384);
                if (read < 0) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        int i = gb0.h;
        byte b = (byte) (((byte) (0 | 2)) | 1);
        int i2 = wi8.G(5)[optInt];
        if (i2 != 0) {
            byte b2 = (byte) (((byte) (b | 2)) | 1);
            if (b2 == 3 && i2 != 0) {
                return new gb0(optString, i2, optString2, optString3, optLong2, optLong, optString4);
            }
            StringBuilder sb = new StringBuilder();
            if (i2 == 0) {
                sb.append(" registrationStatus");
            }
            if ((b2 & 1) == 0) {
                sb.append(" expiresInSecs");
            }
            if ((b2 & 2) == 0) {
                sb.append(" tokenCreationEpochInSecs");
            }
            dq9.m(ts2.n("Missing required properties:", sb));
            return null;
        }
        gxc.d("Null registrationStatus");
        return null;
    }

    public final void y() {
        ti2 ti2Var = (ti2) this.b;
        ti2Var.getClass();
        try {
            roe roeVar = (roe) ti2Var.a;
            roeVar.V(roeVar.R(), 1);
            ((s05) this.c).c.remove(ti2Var);
        } catch (RemoteException e) {
            i2d.h(e);
        }
    }

    public final void z(int i) {
        ti2 ti2Var = (ti2) this.b;
        ti2Var.getClass();
        try {
            roe roeVar = (roe) ti2Var.a;
            Parcel R = roeVar.R();
            R.writeInt(i);
            roeVar.V(R, 11);
        } catch (RemoteException e) {
            i2d.h(e);
        }
    }

    @Override
    public final void I() {
    }

    @Override
    public final void b0() {
    }

    @Override
    public final void f0(Object obj) {
    }

    @Override
    public final void z0(TLRPC.User user) {
    }

    public mj4(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public mj4(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public mj4(byte b, boolean z) {
        this.a = b;
    }

    public mj4(byte b) {
        this.a = b;
        switch (b) {
            case 21:
                this.c = new HashMap();
                return;
            default:
                this.b = new AtomicInteger();
                this.c = new AtomicInteger();
                return;
        }
    }

    public mj4(qoa[] qoaVarArr) {
        this.a = (byte) 12;
        this.b = qoaVarArr;
        this.c = new kg7((byte) 22);
    }

    public mj4(ExecutorService executorService) {
        this.a = (byte) 22;
        this.c = new cka(0);
        this.b = executorService;
    }

    public mj4(e36 e36Var, tfc tfcVar) {
        this.a = (byte) 7;
        this.b = e36Var;
        this.c = (oa6) new et8(tfcVar, oa6.d).l(oa6.class);
    }

    public mj4(byte[] bArr) {
        this.a = (byte) 9;
        this.b = bArr;
    }

    public mj4(vqb vqbVar) {
        this.a = (byte) 18;
        this.b = vqbVar;
        this.c = new yw7();
    }

    public mj4(li4 li4Var) {
        this.a = (byte) 16;
        this.c = li4Var;
    }

    public mj4(Context context, byte b) {
        this.a = b;
        switch (b) {
            case 29:
                ite.h(context);
                Resources resources = context.getResources();
                this.b = resources;
                this.c = resources.getResourcePackageName(2131689567);
                return;
            default:
                this.c = null;
                this.b = context;
                return;
        }
    }

    public mj4(int i) {
        this.a = (byte) 27;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ALPHA_8);
        this.b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    public mj4(PremiumPreviewFragment premiumPreviewFragment) {
        this.a = (byte) 17;
        this.c = premiumPreviewFragment;
        this.b = new Paint();
    }

    @Override
    public final void n0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }
}
