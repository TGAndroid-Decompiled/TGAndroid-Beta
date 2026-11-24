package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.media.MediaExtractor;
import android.net.Uri;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.Editable;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.View;
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
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.PremiumPreviewFragment;
public final class sk4 implements hk4, v02, rn5, pma, gx4, ni0, bx8, lt8, kt8, wj0, s3b, bb2 {
    public final byte a;
    public Object b;
    public Object c;

    public sk4(long[] jArr) {
        this.a = (byte) 22;
        this.c = jArr;
        if (jArr.length >= 30) {
            this.b = new jz0[(int) (Math.pow(2.0d, Math.floor((Math.log(jArr.length) / 0.6931471805599453d) + 1.0d)) * 2.0d)];
            i(1, 0, jArr.length);
        }
    }

    @Override
    public final boolean A1(gb2 gb2Var, int i) {
        return false;
    }

    public final boolean B(pw6 pw6Var, String str) {
        int i = pw6Var.b;
        Context context = (Context) this.b;
        if (i < 0) {
            if (context.getPackageManager().checkPermission(str, pw6Var.a) == 0) {
                return true;
            }
            return false;
        } else if (context.checkPermission(str, i, pw6Var.c) == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public final void B1(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        x02 x02Var = (x02) this.b;
        try {
            HashMap<Object, Object> selectedPhotos = x02Var.d2.getSelectedPhotos();
            if (!selectedPhotos.isEmpty()) {
                jm6 jm6Var = (jm6) selectedPhotos.values().iterator().next();
                String str = jm6Var.h;
                if (str == null) {
                    str = jm6Var.I;
                }
                rw5 rw5Var = (rw5) this.c;
                rw5Var.a0(rw5Var.d0(str, true));
                x02Var.dismiss();
            }
        } catch (Throwable th) {
            fa4.g(th, true);
        }
    }

    @Override
    public final boolean B2(gb2 gb2Var, k27 k27Var) {
        return false;
    }

    @Override
    public final t56 D(jr6 jr6Var) {
        t56 D = ((dd) this.b).D(jr6Var);
        if (D == null) {
            return null;
        }
        return d4.o(D, new zo4(this, (byte) 2));
    }

    @Override
    public final boolean D0(gb2 gb2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final gib E2() {
        return null;
    }

    @Override
    public final boolean F0(gb2 gb2Var) {
        return false;
    }

    @Override
    public final boolean G(gb2 gb2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    public final boolean H(View view) {
        ucc uccVar = (ucc) this.c;
        vcc vccVar = (vcc) this.b;
        int D = vccVar.D();
        int M = vccVar.M();
        int u = vccVar.u(view);
        int d0 = vccVar.d0(view);
        uccVar.b = D;
        uccVar.c = M;
        uccVar.d = u;
        uccVar.e = d0;
        uccVar.a = 24579;
        return uccVar.a();
    }

    @Override
    public final boolean J0(long j) {
        return ((wfb) this.c).w;
    }

    public final void K(int i) {
        jz0[] jz0VarArr = (jz0[]) this.b;
        jz0 jz0Var = jz0VarArr[i];
        Integer num = (Integer) jz0Var.e;
        if (num != null) {
            int i2 = i << 1;
            k(jz0VarArr[i2], num.intValue());
            k(jz0VarArr[i2 + 1], ((Integer) jz0Var.e).intValue());
            jz0Var.e = null;
        }
    }

    @Override
    public final void K1(gb2 gb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        d01.t(gb2Var.getContext(), str);
    }

    public final long L(int i, int i2) {
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
        return S(1, i, i2);
    }

    @Override
    public final t56 M(byte[] bArr) {
        return d4.o(((dd) this.b).M(bArr), new zo4(this, (byte) 2));
    }

    @Override
    public final boolean N1() {
        return false;
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final int R() {
        return 0;
    }

    public final long S(int i, int i2, int i3) {
        jz0 jz0Var = ((jz0[]) this.b)[i];
        Integer num = (Integer) jz0Var.e;
        if (num != null) {
            int i4 = jz0Var.c;
            int i5 = jz0Var.d;
            if (i2 >= i4 && i3 <= i5) {
                return num.intValue();
            }
        }
        int i6 = jz0Var.c;
        int i7 = jz0Var.d;
        if (i6 >= i2 && i7 <= i3) {
            return jz0Var.a;
        }
        if ((i2 <= i6 && i3 >= i6) || (i2 >= i6 && i2 <= i7)) {
            K(i);
            int i8 = i << 1;
            return Math.max(S(i8, i2, i3), S(i8 + 1, i2, i3));
        }
        return 0L;
    }

    @Override
    public final qn5 S0(wk4 wk4Var) {
        int i;
        ArrayList arrayList = (ArrayList) this.c;
        ArrayList arrayList2 = (ArrayList) wk4Var.b;
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
        return new bj6(wk4Var, (ArrayList) this.b, arrayList);
    }

    @Override
    public final boolean T0(gb2 gb2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override
    public final boolean T1(gm gmVar) {
        return false;
    }

    public final long U(int i, int i2) {
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
        return a0(1, i, i2);
    }

    @Override
    public final int V(gb2 gb2Var) {
        return 0;
    }

    @Override
    public final boolean V1() {
        System.currentTimeMillis();
        return true;
    }

    @Override
    public final vu1 X() {
        return null;
    }

    @Override
    public final ma8 Z1() {
        return null;
    }

    @Override
    public final void a(ax8 ax8Var, int i) {
        int[] iArr = (int[]) this.c;
        try {
            ax8Var.read((byte[]) this.b, iArr[0], i);
            iArr[0] = iArr[0] + i;
        } finally {
            ax8Var.close();
        }
    }

    public final long a0(int i, int i2, int i3) {
        jz0 jz0Var = ((jz0[]) this.b)[i];
        Integer num = (Integer) jz0Var.e;
        if (num != null) {
            int i4 = jz0Var.c;
            int i5 = jz0Var.d;
            if (i2 >= i4 && i3 <= i5) {
                return num.intValue();
            }
        }
        int i6 = jz0Var.c;
        int i7 = jz0Var.d;
        if (i6 >= i2 && i7 <= i3) {
            return jz0Var.b;
        }
        if ((i2 <= i6 && i3 >= i6) || (i2 >= i6 && i2 <= i7)) {
            K(i);
            int i8 = i << 1;
            return Math.min(a0(i8, i2, i3), a0(i8 + 1, i2, i3));
        }
        return 2147483647L;
    }

    @Override
    public final boolean b() {
        return false;
    }

    public final ga0 b0() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(v());
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
        int i = ga0.h;
        byte b = (byte) (((byte) (0 | 2)) | 1);
        int i2 = ug8.G(5)[optInt];
        if (i2 != 0) {
            byte b2 = (byte) (((byte) (b | 2)) | 1);
            if (b2 == 3 && i2 != 0) {
                return new ga0(optString, i2, optString2, optString3, optLong2, optLong, optString4);
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
            sc8.j(ir2.o("Missing required properties:", sb));
            return null;
        }
        fvc.f("Null registrationStatus");
        return null;
    }

    @Override
    public final String b1(gb2 gb2Var) {
        return null;
    }

    @Override
    public final boolean c2(long j) {
        return ((wfb) this.c).s;
    }

    @Override
    public final mi0 d(ja3 ja3Var, long j) {
        long j2 = ja3Var.d;
        int min = (int) Math.min(20000L, ja3Var.c - j2);
        xu7 xu7Var = (xu7) this.c;
        xu7Var.K(min);
        ja3Var.d(xu7Var.a, 0, min, false);
        int i = -1;
        int i2 = -1;
        long j3 = -9223372036854775807L;
        while (xu7Var.a() >= 4) {
            if (zh4.b(xu7Var.b, xu7Var.a) != 442) {
                xu7Var.O(1);
            } else {
                xu7Var.O(4);
                long c = gu8.c(xu7Var);
                if (c != -9223372036854775807L) {
                    long b = ((uob) this.b).b(c);
                    if (b > j) {
                        if (j3 == -9223372036854775807L) {
                            return new mi0(b, -1, j2);
                        }
                        return new mi0(-9223372036854775807L, 0, j2 + i2);
                    }
                    int i3 = ((b + 100000) > j ? 1 : ((b + 100000) == j ? 0 : -1));
                    int i4 = xu7Var.b;
                    if (i3 > 0) {
                        return new mi0(-9223372036854775807L, 0, j2 + i4);
                    }
                    i2 = i4;
                    j3 = b;
                }
                int i5 = xu7Var.c;
                if (xu7Var.a() < 10) {
                    xu7Var.N(i5);
                } else {
                    xu7Var.O(9);
                    int A = xu7Var.A() & 7;
                    if (xu7Var.a() < A) {
                        xu7Var.N(i5);
                    } else {
                        xu7Var.O(A);
                        if (xu7Var.a() < 4) {
                            xu7Var.N(i5);
                        } else {
                            if (zh4.b(xu7Var.b, xu7Var.a) == 443) {
                                xu7Var.O(4);
                                int H = xu7Var.H();
                                if (xu7Var.a() < H) {
                                    xu7Var.N(i5);
                                } else {
                                    xu7Var.O(H);
                                }
                            }
                            while (true) {
                                if (xu7Var.a() < 4) {
                                    break;
                                }
                                int b2 = zh4.b(xu7Var.b, xu7Var.a);
                                if (b2 == 442 || b2 == 441 || (b2 >>> 8) != 1) {
                                    break;
                                }
                                xu7Var.O(4);
                                if (xu7Var.a() < 2) {
                                    xu7Var.N(i5);
                                    break;
                                }
                                xu7Var.N(Math.min(xu7Var.c, xu7Var.b + xu7Var.H()));
                            }
                        }
                    }
                }
                i = xu7Var.b;
            }
        }
        if (j3 != -9223372036854775807L) {
            return new mi0(j3, -2, j2 + i);
        }
        return mi0.d;
    }

    @Override
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        Paint paint = (Paint) this.b;
        PremiumPreviewFragment premiumPreviewFragment = (PremiumPreviewFragment) this.c;
        mh8 mh8Var = premiumPreviewFragment.n0;
        if (premiumPreviewFragment.i0) {
            paint.setColor(premiumPreviewFragment.getThemedColor(bkb.Z6));
            canvas.drawRect(f, f2, f3, f4, paint);
            return;
        }
        mh8Var.d(0, (-premiumPreviewFragment.e0.getMeasuredWidth()) * 0.1f * premiumPreviewFragment.c0, 0, premiumPreviewFragment.e0.getMeasuredWidth(), 0.0f, premiumPreviewFragment.e0.getMeasuredHeight());
        canvas.drawRect(f, f2, f3, f4, mh8Var.f);
    }

    @Override
    public final boolean e0() {
        return false;
    }

    @Override
    public final void f() {
        byte[] bArr = g8c.b;
        ((xu7) this.c).L(bArr.length, bArr);
    }

    @Override
    public final CharacterStyle f0(gb2 gb2Var) {
        return null;
    }

    @Override
    public final String g() {
        return "tg|" + ((Uri) this.b).getQueryParameter("id") + "|" + ((Long) this.c);
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final boolean g2(k27 k27Var) {
        return true;
    }

    @Override
    public final Object mo9get() {
        switch (this.a) {
            case 21:
                ie7 ie7Var = new ie7((byte) 29);
                i2f i2fVar = new i2f((byte) 28);
                pq9 pq9Var = (pq9) ((g29) this.b).mo9get();
                return new lo9(ie7Var, i2fVar, q90.f, pq9Var, (lt8) this.c);
            default:
                return new k7a((k8a) ((kt8) this.b).mo9get(), (k8a) ((kt8) this.c).mo9get());
        }
    }

    @Override
    public final Object h(ik4 ik4Var, fw2 fw2Var) {
        Object h = ((wk4) this.b).h(new uk4(new Object(), ik4Var, (d73) this.c), fw2Var);
        if (h == bx2.a) {
            return h;
        }
        return g5c.a;
    }

    public final void h0() {
        fh2 fh2Var = (fh2) this.b;
        fh2Var.getClass();
        try {
            ome omeVar = (ome) fh2Var.a;
            omeVar.V(omeVar.R(), 1);
            ((ty4) this.c).c.remove(fh2Var);
        } catch (RemoteException e) {
            fvc.g(e);
        }
    }

    @Override
    public final boolean h1(gb2 gb2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    public final void i(int i, int i2, int i3) {
        jz0[] jz0VarArr = (jz0[]) this.b;
        ?? obj = new Object();
        obj.e = null;
        jz0VarArr[i] = obj;
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
        i(i4, i2, i5);
        int i6 = i4 + 1;
        i(i6, i2 + i5, i3 - i5);
        jz0 jz0Var = jz0VarArr[i];
        jz0 jz0Var2 = jz0VarArr[i4];
        jz0Var2.getClass();
        jz0 jz0Var3 = jz0VarArr[i6];
        jz0Var3.getClass();
        jz0Var.getClass();
        jz0Var.a = Math.max(jz0Var2.a, jz0Var3.a);
        jz0VarArr[i].b = Math.min(jz0VarArr[i4].b, jz0VarArr[i6].b);
    }

    @Override
    public final boolean i0() {
        return false;
    }

    @Override
    public final StackTraceElement[] j(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        pma[] pmaVarArr = (pma[]) this.b;
        StackTraceElement[] stackTraceElementArr2 = stackTraceElementArr;
        for (int i = 0; i < 1; i++) {
            pma pmaVar = pmaVarArr[i];
            if (stackTraceElementArr2.length <= 1024) {
                break;
            }
            stackTraceElementArr2 = pmaVar.j(stackTraceElementArr);
        }
        if (stackTraceElementArr2.length > 1024) {
            return ((ie7) this.c).j(stackTraceElementArr2);
        }
        return stackTraceElementArr2;
    }

    public final void k(jz0 jz0Var, int i) {
        jz0Var.e = Integer.valueOf(i);
        int i2 = jz0Var.c;
        long j = i;
        jz0Var.a = j;
        jz0Var.b = j;
        ((long[]) this.c)[i2] = j;
    }

    public final void k0(int i) {
        fh2 fh2Var = (fh2) this.b;
        fh2Var.getClass();
        try {
            ome omeVar = (ome) fh2Var.a;
            Parcel R = omeVar.R();
            R.writeInt(i);
            omeVar.V(R, 11);
        } catch (RemoteException e) {
            fvc.g(e);
        }
    }

    @Override
    public final boolean k2(gb2 gb2Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean l() {
        return true;
    }

    @Override
    public final boolean l2(gb2 gb2Var) {
        return false;
    }

    public final void m() {
        this.b = null;
        this.c = null;
    }

    public final void n(String str, PrintWriter printWriter) {
        boolean z;
        p86 p86Var = (p86) this.c;
        if (p86Var.b.c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String concat = str.concat("    ");
            int i = 0;
            while (true) {
                qka qkaVar = p86Var.b;
                if (i < qkaVar.c) {
                    o86 o86Var = (o86) qkaVar.b[i];
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(p86Var.b.a[i]);
                    printWriter.print(": ");
                    printWriter.println(o86Var.toString());
                    printWriter.print(concat);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mArgs=");
                    Object obj = null;
                    printWriter.println((Object) null);
                    printWriter.print(concat);
                    printWriter.print("mLoader=");
                    printWriter.println(o86Var.l);
                    v3d v3dVar = o86Var.l;
                    String concat2 = concat.concat("  ");
                    v3dVar.getClass();
                    printWriter.print(concat2);
                    printWriter.print("mId=");
                    printWriter.print(0);
                    printWriter.print(" mListener=");
                    printWriter.println(v3dVar.a);
                    if (v3dVar.b || v3dVar.e) {
                        printWriter.print(concat2);
                        printWriter.print("mStarted=");
                        printWriter.print(v3dVar.b);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(v3dVar.e);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(false);
                    }
                    if (v3dVar.c || v3dVar.d) {
                        printWriter.print(concat2);
                        printWriter.print("mAbandoned=");
                        printWriter.print(v3dVar.c);
                        printWriter.print(" mReset=");
                        printWriter.println(v3dVar.d);
                    }
                    if (v3dVar.g != null) {
                        printWriter.print(concat2);
                        printWriter.print("mTask=");
                        printWriter.print(v3dVar.g);
                        printWriter.print(" waiting=");
                        v3dVar.g.getClass();
                        printWriter.println(false);
                    }
                    if (v3dVar.h != null) {
                        printWriter.print(concat2);
                        printWriter.print("mCancellingTask=");
                        printWriter.print(v3dVar.h);
                        printWriter.print(" waiting=");
                        v3dVar.h.getClass();
                        printWriter.println(false);
                    }
                    if (o86Var.n != null) {
                        printWriter.print(concat);
                        printWriter.print("mCallbacks=");
                        printWriter.println(o86Var.n);
                        e31 e31Var = o86Var.n;
                        String concat3 = concat.concat("  ");
                        e31Var.getClass();
                        printWriter.print(concat3);
                        printWriter.print("mDeliveredData=");
                        printWriter.println(e31Var.b);
                    }
                    printWriter.print(concat);
                    printWriter.print("mData=");
                    v3d v3dVar2 = o86Var.l;
                    Object obj2 = o86Var.e;
                    if (obj2 != hh7.k) {
                        obj = obj2;
                    }
                    v3dVar2.getClass();
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
                    if (o86Var.c > 0) {
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

    public final void n0(double d) {
        fh2 fh2Var = (fh2) this.b;
        fh2Var.getClass();
        try {
            ome omeVar = (ome) fh2Var.a;
            Parcel R = omeVar.R();
            R.writeDouble(d);
            omeVar.V(R, 5);
        } catch (RemoteException e) {
            fvc.g(e);
        }
    }

    @Override
    public final Closeable o(MediaExtractor mediaExtractor) {
        t3b t3bVar = new t3b(((Long) this.c).longValue(), (Uri) this.b);
        mediaExtractor.setDataSource(t3bVar);
        return t3bVar;
    }

    public final void o0(int i) {
        fh2 fh2Var = (fh2) this.b;
        fh2Var.getClass();
        try {
            ome omeVar = (ome) fh2Var.a;
            Parcel R = omeVar.R();
            R.writeInt(i);
            omeVar.V(R, 9);
        } catch (RemoteException e) {
            fvc.g(e);
        }
    }

    public final View r(int i, int i2, int i3, int i4) {
        int i5;
        ucc uccVar = (ucc) this.c;
        vcc vccVar = (vcc) this.b;
        int D = vccVar.D();
        int M = vccVar.M();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            View Z = vccVar.Z(i);
            int u = vccVar.u(Z);
            int d0 = vccVar.d0(Z);
            uccVar.b = D;
            uccVar.c = M;
            uccVar.d = u;
            uccVar.e = d0;
            if (i3 != 0) {
                uccVar.a = i3;
                if (uccVar.a()) {
                    return Z;
                }
            }
            if (i4 != 0) {
                uccVar.a = i4;
                if (uccVar.a()) {
                    view = Z;
                }
            }
            i += i5;
        }
        return view;
    }

    @Override
    public final boolean s0(gb2 gb2Var, boolean z) {
        return false;
    }

    public final String toString() {
        switch (this.a) {
            case 5:
                StringBuilder sb = new StringBuilder(128);
                sb.append("LoaderManager{");
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" in ");
                Class<?> cls = ((e16) this.b).getClass();
                sb.append(cls.getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(cls)));
                sb.append("}}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public final com.google.android.datatransport.cct.CctBackendFactory u(java.lang.String r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sk4.u(java.lang.String):com.google.android.datatransport.cct.CctBackendFactory");
    }

    public final File v() {
        if (((File) this.b) == null) {
            synchronized (this) {
                if (((File) this.b) == null) {
                    String str = "PersistedInstallation." + ((jg4) this.c).d() + ".json";
                    jg4 jg4Var = (jg4) this.c;
                    jg4Var.a();
                    File file = new File(jg4Var.a.getNoBackupFilesDir(), str);
                    this.b = file;
                    if (file.exists()) {
                        return (File) this.b;
                    }
                    jg4 jg4Var2 = (jg4) this.c;
                    jg4Var2.a();
                    File file2 = new File(jg4Var2.a.getFilesDir(), str);
                    if (file2.exists() && !file2.renameTo((File) this.b)) {
                        Log.e("PersistedInstallation", "Unable to move the file from back up to non back up directory", new IOException("Unable to move the file from back up to non back up directory"));
                        return file2;
                    }
                }
            }
        }
        return (File) this.b;
    }

    public final String w(String str) {
        Resources resources = (Resources) this.b;
        int identifier = resources.getIdentifier(str, "string", (String) this.c);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    @Override
    public final String x(long j) {
        String trim = ((EditTextBoldCursor) this.b).getText().toString().trim();
        if (trim.length() > 16) {
            trim = trim.substring(0, 16);
        }
        if (!((wfb) this.c).s && TextUtils.isEmpty(trim)) {
            return null;
        }
        return trim;
    }

    @Override
    public final boolean x0(gb2 gb2Var, TLRPC.Chat chat) {
        return false;
    }

    public final boolean y(Long l) {
        boolean z;
        synchronized (((HashMap) this.c)) {
            e59 e59Var = (e59) ((HashMap) this.c).get(l);
            if (e59Var != null && !e59Var.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override
    public final boolean y1() {
        return false;
    }

    @Override
    public final boolean y2(int i) {
        return false;
    }

    public final void z(ga0 ga0Var) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", ga0Var.a);
            jSONObject.put("Status", ug8.F(ga0Var.b));
            jSONObject.put("AuthToken", ga0Var.c);
            jSONObject.put("RefreshToken", ga0Var.d);
            jSONObject.put("TokenCreationEpochInSecs", ga0Var.f);
            jSONObject.put("ExpiresInSecs", ga0Var.e);
            jSONObject.put("FisError", ga0Var.g);
            jg4 jg4Var = (jg4) this.c;
            jg4Var.a();
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", jg4Var.a.getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(v())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @Override
    public final boolean z1(k27 k27Var) {
        return oo1.a(k27Var);
    }

    @Override
    public final void z2(vq0 vq0Var) {
        vq0Var.run();
    }

    @Override
    public final void B0() {
    }

    @Override
    public final void C2() {
    }

    @Override
    public final void I0() {
    }

    @Override
    public final void R1() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void i1() {
    }

    @Override
    public final void p() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void u2() {
    }

    @Override
    public final void z0() {
    }

    @Override
    public final void D1(h27 h27Var) {
    }

    @Override
    public final void F(gb2 gb2Var) {
    }

    @Override
    public final void H2(gb2 gb2Var) {
    }

    @Override
    public final void J(gb2 gb2Var) {
    }

    @Override
    public final void M1(gb2 gb2Var) {
    }

    @Override
    public final void N0(gb2 gb2Var) {
    }

    @Override
    public final void P0(Object obj) {
    }

    @Override
    public final void T(gb2 gb2Var) {
    }

    @Override
    public final void W(gb2 gb2Var) {
    }

    @Override
    public final void X0(gb2 gb2Var) {
    }

    @Override
    public final void X1(gb2 gb2Var) {
    }

    @Override
    public final void Y(k27 k27Var) {
    }

    @Override
    public final void Y1(gb2 gb2Var) {
    }

    @Override
    public final void c1(gb2 gb2Var) {
    }

    @Override
    public final void d0(int i) {
    }

    @Override
    public final void e2(gb2 gb2Var) {
    }

    @Override
    public final void g1(TLRPC.User user) {
    }

    @Override
    public final void j0(k27 k27Var) {
    }

    @Override
    public final void l0(String str) {
    }

    @Override
    public final void l1(gb2 gb2Var) {
    }

    @Override
    public final void n1(gb2 gb2Var) {
    }

    @Override
    public final void q(gb2 gb2Var) {
    }

    @Override
    public final void q1(gb2 gb2Var) {
    }

    @Override
    public final void r0(gb2 gb2Var) {
    }

    @Override
    public final void v2(gb2 gb2Var) {
    }

    @Override
    public final void x1(gb2 gb2Var) {
    }

    @Override
    public final void C1(gb2 gb2Var, boolean z) {
    }

    @Override
    public final void E0(gb2 gb2Var, long j) {
    }

    @Override
    public final void F1(gb2 gb2Var, int i) {
    }

    @Override
    public final void M0(gb2 gb2Var, boolean z) {
    }

    @Override
    public final void O1(gb2 gb2Var, iq0 iq0Var) {
    }

    @Override
    public final void V0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void Z(gb2 gb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void b2(String str, String str2) {
    }

    @Override
    public final void d2(gb2 gb2Var, k08 k08Var) {
    }

    @Override
    public final void j2(gb2 gb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void m0(gb2 gb2Var, int i) {
    }

    @Override
    public final void v0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    public sk4(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public sk4(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public sk4(byte b, boolean z) {
        this.a = b;
    }

    public sk4(byte b) {
        this.a = b;
        switch (b) {
            case 19:
                this.c = new HashMap();
                return;
            default:
                this.b = new AtomicInteger();
                this.c = new AtomicInteger();
                return;
        }
    }

    public sk4(pma[] pmaVarArr) {
        this.a = (byte) 10;
        this.b = pmaVarArr;
        this.c = new ie7((byte) 22);
    }

    public sk4(ExecutorService executorService) {
        this.a = (byte) 20;
        this.c = new aia(0);
        this.b = executorService;
    }

    public sk4(e16 e16Var, sdc sdcVar) {
        this.a = (byte) 5;
        this.b = e16Var;
        this.c = (p86) new g29(sdcVar, p86.d).k(p86.class);
    }

    @Override
    public final void A(gb2 gb2Var, float f, float f2) {
    }

    @Override
    public final void G1(gb2 gb2Var, boolean z, boolean z2) {
    }

    @Override
    public final void I(gb2 gb2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void P(gb2 gb2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override
    public final void W1(gb2 gb2Var, TLObject tLObject, boolean z) {
    }

    @Override
    public final void Y0(gb2 gb2Var, float f, float f2) {
    }

    @Override
    public final void s2(gb2 gb2Var, float f, float f2) {
    }

    @Override
    public final void v1(gb2 gb2Var, float f, float f2) {
    }

    @Override
    public final void w0(gb2 gb2Var, int i, int i2) {
    }

    @Override
    public final void x2(gb2 gb2Var, boolean z, boolean z2) {
    }

    public sk4(byte[] bArr) {
        this.a = (byte) 7;
        this.b = bArr;
    }

    public sk4(uob uobVar) {
        this.a = (byte) 16;
        this.b = uobVar;
        this.c = new xu7();
    }

    public sk4(jg4 jg4Var) {
        this.a = (byte) 14;
        this.c = jg4Var;
    }

    public sk4(Context context, byte b) {
        this.a = b;
        switch (b) {
            case 27:
                fre.h(context);
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

    public sk4(vcc vccVar) {
        this.a = (byte) 29;
        this.b = vccVar;
        ?? obj = new Object();
        obj.a = 0;
        this.c = obj;
    }

    public sk4(int i) {
        this.a = (byte) 25;
        Bitmap createBitmap = Bitmap.createBitmap(i, i, Bitmap.Config.ALPHA_8);
        this.b = createBitmap;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.c = new BitmapShader(createBitmap, tileMode, tileMode);
    }

    public sk4(PremiumPreviewFragment premiumPreviewFragment) {
        this.a = (byte) 15;
        this.c = premiumPreviewFragment;
        this.b = new Paint();
    }

    @Override
    public final void A0(gb2 gb2Var, float f, float f2, boolean z) {
    }

    @Override
    public final void E(gb2 gb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void c0(gb2 gb2Var, TLRPC.User user, float f, float f2) {
    }

    @Override
    public final void s(gb2 gb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override
    public final void N(gb2 gb2Var, int i, float f, float f2, boolean z) {
    }

    @Override
    public final void m1(gb2 gb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
    }

    @Override
    public final void r1(gb2 gb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override
    public final void i2(gb2 gb2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
    }

    @Override
    public final void R0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }

    @Override
    public final void I1(k27 k27Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
