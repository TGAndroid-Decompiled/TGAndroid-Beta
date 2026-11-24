package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.net.Uri;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.text.style.CharacterStyle;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.logging.Logger;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class eef implements aq2, a5a, yyb, e51, bv7, sab, yq3, ebc, vyc, al0, pma, bb2 {
    public static eef b;
    public static final eef c = new eef((byte) 1);
    public static final eef d = new eef((byte) 2);
    public static final eef e = new eef((byte) 4);
    public static final eef f = new eef((byte) 5);
    public static final eef h = new eef((byte) 6);
    public static final eef n = new eef((byte) 7);
    public static final eef r = new eef((byte) 8);
    public static final eef s = new eef((byte) 9);
    public static final eef w = new eef((byte) 10);
    public static final eef x = new eef((byte) 11);
    public static final eef y = new eef((byte) 12);
    public final byte a;

    public eef(byte b2) {
        this.a = b2;
    }

    public static qj0 A(byte[][] bArr, int i) {
        int i2 = i << 1;
        qj0 qj0Var = new qj0(bArr[0].length + i2, bArr.length + i2);
        int[] iArr = qj0Var.d;
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = 0;
        }
        int i4 = (qj0Var.b - i) - 1;
        int i5 = 0;
        while (i5 < bArr.length) {
            byte[] bArr2 = bArr[i5];
            for (int i6 = 0; i6 < bArr[0].length; i6++) {
                if (bArr2[i6] == 1) {
                    qj0Var.c(i6 + i, i4);
                }
            }
            i5++;
            i4--;
        }
        return qj0Var;
    }

    public static byte[][] N3(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance(Byte.TYPE, bArr[0].length, bArr.length);
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    public static void Q3(String str) {
        if (str != null && str.length() != 0) {
            if (!str.startsWith("sk_")) {
                return;
            }
            throw new s9b("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
        throw new s9b("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
    }

    public static void T3(qnd qndVar, u56 u56Var, boolean z, TaskCompletionSource taskCompletionSource) {
        f84[] f84VarArr;
        IInterface ezcVar;
        IInterface ezcVar2;
        synchronized (qndVar.G) {
            dmd dmdVar = (dmd) qndVar.G.remove(u56Var);
            if (dmdVar == null) {
                taskCompletionSource.setResult(Boolean.FALSE);
                return;
            }
            f84 f84Var = null;
            dmdVar.b.h().b = null;
            if (z) {
                xme xmeVar = qndVar.B;
                if (xmeVar == null) {
                    f84VarArr = null;
                } else {
                    f84VarArr = xmeVar.b;
                }
                if (f84VarArr != null) {
                    int length = f84VarArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        f84 f84Var2 = f84VarArr[i];
                        if ("location_updates_with_callback".equals(f84Var2.a)) {
                            f84Var = f84Var2;
                            break;
                        }
                        i++;
                    }
                    if (f84Var != null && f84Var.b() >= 1) {
                        z2f z2fVar = (z2f) qndVar.k();
                        bkd bkdVar = new bkd(Boolean.TRUE, taskCompletionSource);
                        Parcel R = z2fVar.R();
                        int i2 = rgd.a;
                        R.writeInt(1);
                        int r2 = jte.r(R, 20293);
                        jte.q(R, 1, 4);
                        R.writeInt(2);
                        jte.f(R, 3, dmdVar);
                        jte.s(R, r2);
                        rgd.c(R, bkdVar);
                        z2fVar.V(R, 89);
                    }
                }
                z2f z2fVar2 = (z2f) qndVar.k();
                nkd nkdVar = new nkd(taskCompletionSource);
                int i3 = dmd.c;
                IInterface queryLocalInterface = dmdVar.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
                if (queryLocalInterface instanceof bbf) {
                    ezcVar = (bbf) queryLocalInterface;
                } else {
                    ezcVar = new ezc(dmdVar, "com.google.android.gms.location.ILocationCallback", (byte) 5);
                }
                IInterface queryLocalInterface2 = nkdVar.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                if (queryLocalInterface2 instanceof gse) {
                    ezcVar2 = (gse) queryLocalInterface2;
                } else {
                    ezcVar2 = new ezc(nkdVar, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", (byte) 5);
                }
                Parcel R2 = z2fVar2.R();
                int i4 = rgd.a;
                R2.writeInt(1);
                int r3 = jte.r(R2, 20293);
                jte.q(R2, 1, 4);
                R2.writeInt(2);
                jte.f(R2, 5, ezcVar.asBinder());
                jte.f(R2, 6, ezcVar2.asBinder());
                jte.s(R2, r3);
                z2fVar2.V(R2, 59);
            } else {
                taskCompletionSource.setResult(Boolean.TRUE);
            }
        }
    }

    @Override
    public final boolean A1(gb2 gb2Var, int i) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void B0() {
        byte b2 = this.a;
    }

    @Override
    public final boolean B2(gb2 gb2Var, k27 k27Var) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void C1(gb2 gb2Var, boolean z) {
        byte b2 = this.a;
    }

    @Override
    public final void C2() {
        byte b2 = this.a;
    }

    @Override
    public final void D(gb2 gb2Var, TLRPC.User user, TLRPC.Document document, String str) {
        byte b2 = this.a;
    }

    @Override
    public final boolean D0(gb2 gb2Var, TLRPC.PollAnswer pollAnswer) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void D1(h27 h27Var) {
        byte b2 = this.a;
    }

    @Override
    public final void E(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void E0(gb2 gb2Var, long j) {
        byte b2 = this.a;
    }

    @Override
    public final gib E2() {
        byte b2 = this.a;
        return null;
    }

    @Override
    public final boolean F(gb2 gb2Var, TLRPC.TodoItem todoItem) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final boolean F0(gb2 gb2Var) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void F1(gb2 gb2Var, int i) {
        byte b2 = this.a;
    }

    @Override
    public final void G1(gb2 gb2Var, boolean z, boolean z2) {
        byte b2 = this.a;
    }

    @Override
    public final void H(gb2 gb2Var, TLRPC.Document document, RectF rectF) {
        byte b2 = this.a;
    }

    @Override
    public final void H2(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void I(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void I1(k27 k27Var, String str, String str2, String str3, String str4, int i, int i2) {
        byte b2 = this.a;
    }

    @Override
    public final boolean J0(long j) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final Object K(gl2 gl2Var) {
        switch (this.a) {
            case 1:
                Object i = gl2Var.i(new xw8(n4c.class, Executor.class));
                i.getClass();
                return new t44((Executor) i);
            case 4:
                return new ig7(gl2Var.O(hg7.class));
            case 9:
                return new hg7(gl2Var.d(jnd.class));
            default:
                return new Object();
        }
    }

    @Override
    public final void K1(gb2 gb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        byte b2 = this.a;
        d01.t(gb2Var.getContext(), str);
    }

    @Override
    public final int L() {
        return 0;
    }

    @Override
    public final void M(gb2 gb2Var, int i, float f2, float f3, boolean z) {
        byte b2 = this.a;
    }

    @Override
    public final void M0(gb2 gb2Var, boolean z) {
        byte b2 = this.a;
    }

    @Override
    public final void M1(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final boolean N() {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void N0(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final boolean N1() {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void O(gb2 gb2Var, CharacterStyle characterStyle, boolean z) {
        byte b2 = this.a;
    }

    @Override
    public final void O1(gb2 gb2Var, iq0 iq0Var) {
        byte b2 = this.a;
    }

    @Override
    public final boolean P() {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final int Q() {
        byte b2 = this.a;
        return 0;
    }

    @Override
    public final void R1() {
        byte b2 = this.a;
    }

    @Override
    public final void S(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final boolean T0(gb2 gb2Var, TLRPC.TodoItem todoItem, boolean z) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final boolean T1(gm gmVar) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final int U(gb2 gb2Var) {
        byte b2 = this.a;
        return 0;
    }

    @Override
    public final float U0() {
        return 0.0f;
    }

    @Override
    public final void V(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void V0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        byte b2 = this.a;
    }

    @Override
    public final vu1 W() {
        byte b2 = this.a;
        return null;
    }

    @Override
    public final void W1(gb2 gb2Var, TLObject tLObject, boolean z) {
        byte b2 = this.a;
    }

    @Override
    public final void X(k27 k27Var) {
        byte b2 = this.a;
    }

    @Override
    public final void X0(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void X1(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void Y(gb2 gb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        byte b2 = this.a;
    }

    @Override
    public final void Y0(gb2 gb2Var, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override
    public final void Y1(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final ma8 Z1() {
        byte b2 = this.a;
        return null;
    }

    @Override
    public final int a1() {
        return 0;
    }

    @Override
    public final Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override
    public final boolean b() {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void b0(gb2 gb2Var, TLRPC.User user, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override
    public final String b1(gb2 gb2Var) {
        byte b2 = this.a;
        return null;
    }

    @Override
    public final void b2(String str, String str2) {
        byte b2 = this.a;
    }

    @Override
    public final void c() {
        byte b2 = this.a;
    }

    @Override
    public final void c0(int i) {
        byte b2 = this.a;
    }

    @Override
    public final void c1(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final boolean c2(long j) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final sq3 d(vq3 vq3Var, fm4 fm4Var) {
        if (fm4Var.x == null) {
            return null;
        }
        return new y34(new rq3(6001, new Exception()));
    }

    @Override
    public final boolean d0() {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final int d1() {
        return 0;
    }

    @Override
    public final void d2(gb2 gb2Var, k08 k08Var) {
        byte b2 = this.a;
    }

    @Override
    public final Object e() {
        return new ih7(true);
    }

    @Override
    public final CharacterStyle e0(gb2 gb2Var) {
        byte b2 = this.a;
        return null;
    }

    @Override
    public final void e2(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final xq3 f(vq3 vq3Var, fm4 fm4Var) {
        return xq3.t;
    }

    @Override
    public final byte[] g(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override
    public final boolean g2(k27 k27Var) {
        byte b2 = this.a;
        return true;
    }

    @Override
    public final boolean h(fm4 fm4Var) {
        String str = fm4Var.t;
        if (!Objects.equals(str, "text/x-ssa") && !Objects.equals(str, "text/vtt") && !Objects.equals(str, "application/x-mp4-vtt") && !Objects.equals(str, "application/x-subrip") && !Objects.equals(str, "application/x-quicktime-tx3g") && !Objects.equals(str, "application/pgs") && !Objects.equals(str, "application/vobsub") && !Objects.equals(str, "application/dvbsubs") && !Objects.equals(str, "application/ttml+xml")) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean h0() {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final boolean h1(gb2 gb2Var, TL_iv.PageBlock pageBlock) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void i(Object obj, p4c p4cVar) {
        fs4 a;
        Map a2 = ((ih7) obj).a();
        og8 n2 = qg8.n();
        for (Map.Entry entry : a2.entrySet()) {
            Object value = entry.getValue();
            String str = ((lg8) entry.getKey()).a;
            if (value instanceof Boolean) {
                tg8 v = vg8.v();
                boolean booleanValue = ((Boolean) value).booleanValue();
                v.c();
                ((vg8) v.b).w(booleanValue);
                a = v.a();
            } else if (value instanceof Float) {
                tg8 v2 = vg8.v();
                float floatValue = ((Number) value).floatValue();
                v2.c();
                ((vg8) v2.b).z(floatValue);
                a = v2.a();
            } else if (value instanceof Double) {
                tg8 v3 = vg8.v();
                double doubleValue = ((Number) value).doubleValue();
                v3.c();
                ((vg8) v3.b).y(doubleValue);
                a = v3.a();
            } else if (value instanceof Integer) {
                tg8 v4 = vg8.v();
                int intValue = ((Number) value).intValue();
                v4.c();
                ((vg8) v4.b).A(intValue);
                a = v4.a();
            } else if (value instanceof Long) {
                tg8 v5 = vg8.v();
                long longValue = ((Number) value).longValue();
                v5.c();
                ((vg8) v5.b).B(longValue);
                a = v5.a();
            } else if (value instanceof String) {
                tg8 v6 = vg8.v();
                v6.c();
                ((vg8) v6.b).C((String) value);
                a = v6.a();
            } else if (value instanceof Set) {
                tg8 v7 = vg8.v();
                rg8 o = sg8.o();
                o.c();
                ((sg8) o.b).l((Set) value);
                v7.c();
                ((vg8) v7.b).D((sg8) o.a());
                a = v7.a();
            } else if (value instanceof byte[]) {
                tg8 v8 = vg8.v();
                byte[] bArr = (byte[]) value;
                f51 j = f51.j(0, bArr.length, bArr);
                v8.c();
                ((vg8) v8.b).x(j);
                a = v8.a();
            } else {
                sc8.j("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                return;
            }
            n2.getClass();
            str.getClass();
            n2.c();
            ((qg8) n2.b).m().put(str, (vg8) a);
        }
        qg8 qg8Var = (qg8) n2.a();
        int a3 = qg8Var.a(null);
        Logger logger = ck2.f;
        if (a3 > 4096) {
            a3 = 4096;
        }
        ck2 ck2Var = new ck2(p4cVar, a3);
        qg8Var.b(ck2Var);
        if (ck2Var.d > 0) {
            ck2Var.j();
        }
    }

    @Override
    public final void i0(k27 k27Var) {
        byte b2 = this.a;
    }

    @Override
    public final void i1() {
        byte b2 = this.a;
    }

    @Override
    public final void i2(gb2 gb2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
        byte b2 = this.a;
    }

    @Override
    public final StackTraceElement[] j(StackTraceElement[] stackTraceElementArr) {
        int i;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i2];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i5 = i2 - intValue;
                if (i2 + i5 <= stackTraceElementArr.length) {
                    for (int i6 = 0; i6 < i5; i6++) {
                        if (stackTraceElementArr[intValue + i6].equals(stackTraceElementArr[i2 + i6])) {
                        }
                    }
                    int intValue2 = i2 - num.intValue();
                    if (i4 < 10) {
                        System.arraycopy(stackTraceElementArr, i2, stackTraceElementArr2, i3, intValue2);
                        i3 += intValue2;
                        i4++;
                    }
                    i = (intValue2 - 1) + i2;
                    hashMap.put(stackTraceElement, Integer.valueOf(i2));
                    i2 = i + 1;
                }
            }
            stackTraceElementArr2[i3] = stackTraceElementArr[i2];
            i3++;
            i4 = 1;
            i = i2;
            hashMap.put(stackTraceElement, Integer.valueOf(i2));
            i2 = i + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i3];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i3);
        if (i3 < stackTraceElementArr.length) {
            return stackTraceElementArr3;
        }
        return stackTraceElementArr;
    }

    @Override
    public final int j0() {
        return 0;
    }

    @Override
    public final void j2(gb2 gb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        byte b2 = this.a;
    }

    @Override
    public final boolean k() {
        n40 n40Var = bkb.c5;
        if (n40Var == null) {
            n40Var = new n40();
            bkb.c5 = n40Var;
        }
        if (n40Var.i != null) {
            return true;
        }
        return false;
    }

    @Override
    public final void k0(String str) {
        byte b2 = this.a;
    }

    @Override
    public final boolean k2(gb2 gb2Var, TLRPC.User user) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final boolean l() {
        byte b2 = this.a;
        return true;
    }

    @Override
    public final void l0(gb2 gb2Var, int i) {
        byte b2 = this.a;
    }

    @Override
    public final void l1(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final boolean l2(gb2 gb2Var) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final Object m(FileInputStream fileInputStream) {
        int i;
        byte[] bArr;
        try {
            qg8 o = qg8.o(fileInputStream);
            ih7 ih7Var = new ih7(false);
            mg8[] mg8VarArr = (mg8[]) Arrays.copyOf(new mg8[0], 0);
            ih7Var.b();
            if (mg8VarArr.length <= 0) {
                Map l = o.l();
                l.getClass();
                for (Map.Entry entry : l.entrySet()) {
                    String str = (String) entry.getKey();
                    vg8 vg8Var = (vg8) entry.getValue();
                    str.getClass();
                    vg8Var.getClass();
                    int u = vg8Var.u();
                    if (u == 0) {
                        i = -1;
                    } else {
                        i = ng8.a[ug8.F(u)];
                    }
                    switch (i) {
                        case -1:
                            throw new IOException("Value case is null.", null);
                        case 0:
                        default:
                            throw new RuntimeException();
                        case 1:
                            ih7Var.d(new lg8(str), Boolean.valueOf(vg8Var.l()));
                            break;
                        case 2:
                            ih7Var.d(new lg8(str), Float.valueOf(vg8Var.p()));
                            break;
                        case 3:
                            ih7Var.d(new lg8(str), Double.valueOf(vg8Var.o()));
                            break;
                        case 4:
                            ih7Var.d(new lg8(str), Integer.valueOf(vg8Var.q()));
                            break;
                        case 5:
                            ih7Var.d(new lg8(str), Long.valueOf(vg8Var.r()));
                            break;
                        case 6:
                            lg8 lg8Var = new lg8(str);
                            String s2 = vg8Var.s();
                            s2.getClass();
                            ih7Var.d(lg8Var, s2);
                            break;
                        case 7:
                            lg8 lg8Var2 = new lg8(str);
                            lp5 n2 = vg8Var.t().n();
                            n2.getClass();
                            ih7Var.d(lg8Var2, yk2.m(n2));
                            break;
                        case 8:
                            lg8 lg8Var3 = new lg8(str);
                            f51 m = vg8Var.m();
                            int size = m.size();
                            if (size == 0) {
                                bArr = mp5.b;
                            } else {
                                byte[] bArr2 = new byte[size];
                                m.k(size, bArr2);
                                bArr = bArr2;
                            }
                            bArr.getClass();
                            ih7Var.d(lg8Var3, bArr);
                            break;
                        case 9:
                            throw new IOException("Value not set.", null);
                    }
                }
                return new ih7(new LinkedHashMap(ih7Var.a()), true);
            }
            mg8 mg8Var = mg8VarArr[0];
            throw null;
        } catch (zp5 e2) {
            throw new IOException("Unable to parse preferences proto.", e2);
        }
    }

    @Override
    public final int m0() {
        return 0;
    }

    @Override
    public final void m1(gb2 gb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override
    public final defpackage.qj0 n(java.lang.String r27, defpackage.ze0 r28, java.util.EnumMap r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eef.n(java.lang.String, ze0, java.util.EnumMap):qj0");
    }

    @Override
    public final void n1(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void o(boolean z, float[] fArr) {
        n40 n40Var = bkb.c5;
        if (n40Var == null) {
            n40Var = new n40();
            bkb.c5 = n40Var;
        }
        n40Var.d(z, fArr);
    }

    @Override
    public final void p() {
        byte b2 = this.a;
    }

    @Override
    public final float p0() {
        return -1.0f;
    }

    @Override
    public final void q(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void q0(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void q1(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final uab r(fm4 fm4Var) {
        char c2;
        String str = fm4Var.t;
        List list = fm4Var.w;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c2 = 6;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c2 = 7;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c2 = '\b';
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    ?? obj = new Object();
                    xu7 xu7Var = new xu7((byte[]) list.get(0));
                    int H = xu7Var.H();
                    int H2 = xu7Var.H();
                    Paint paint = new Paint();
                    obj.a = paint;
                    paint.setStyle(Paint.Style.FILL_AND_STROKE);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
                    paint.setPathEffect(null);
                    Paint paint2 = new Paint();
                    obj.b = paint2;
                    paint2.setStyle(Paint.Style.FILL);
                    paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
                    paint2.setPathEffect(null);
                    obj.c = new Canvas();
                    obj.d = new pr3(719, 575, 0, 719, 0, 575);
                    obj.e = new or3(0, new int[]{0, -1, -16777216, -8421505}, eq2.j(), eq2.k());
                    obj.f = new ur3(H, H2);
                    return obj;
                case 1:
                    return new wtc((byte) 11);
                case 2:
                    ?? obj2 = new Object();
                    obj2.a = new xu7();
                    return obj2;
                case 3:
                    return new aec((byte) 2);
                case 4:
                    return new q3c(list);
                case 5:
                    return new bma(list);
                case 6:
                    return new tic(list);
                case 7:
                    return new gab();
                case '\b':
                    return new p2c();
            }
        }
        w26.j(b00.h("Unsupported MIME type: ", str));
        return null;
    }

    @Override
    public final boolean r0(gb2 gb2Var, boolean z) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void r1(gb2 gb2Var, ArrayList arrayList, int i, int i2, int i3) {
        byte b2 = this.a;
    }

    @Override
    public final void s(gb2 gb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
        byte b2 = this.a;
    }

    @Override
    public final float s0() {
        return -1.0f;
    }

    @Override
    public final void s2(gb2 gb2Var, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override
    public final void t() {
        byte b2 = this.a;
    }

    @Override
    public final int t1() {
        return 0;
    }

    @Override
    public final void u0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        byte b2 = this.a;
    }

    @Override
    public final void u2() {
        byte b2 = this.a;
    }

    @Override
    public final Object v(Uri uri, s63 s63Var) {
        return Long.valueOf(g8c.W(new BufferedReader(new InputStreamReader(s63Var)).readLine()));
    }

    @Override
    public final void v0(gb2 gb2Var, int i, int i2) {
        byte b2 = this.a;
    }

    @Override
    public final void v1(gb2 gb2Var, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override
    public final void v2(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final int w(fm4 fm4Var) {
        if (fm4Var.x != null) {
            return 1;
        }
        return 0;
    }

    @Override
    public final boolean w0(gb2 gb2Var, TLRPC.Chat chat) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final String x(long j) {
        byte b2 = this.a;
        return null;
    }

    @Override
    public final void x1(gb2 gb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void x2(gb2 gb2Var, boolean z, boolean z2) {
        byte b2 = this.a;
    }

    @Override
    public final int y(fm4 fm4Var) {
        String str = fm4Var.t;
        if (str != null) {
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c2 = '\b';
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                case 1:
                case 2:
                    return 2;
                case 3:
                    return 1;
                case 4:
                    return 2;
                case 5:
                    return 1;
                case 6:
                    return 2;
                case 7:
                case '\b':
                    return 1;
            }
        }
        w26.j(b00.h("Unsupported MIME type: ", str));
        return 0;
    }

    @Override
    public final boolean y1() {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final boolean y2(int i) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void z(gb2 gb2Var, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override
    public final void z0(gb2 gb2Var, float f2, float f3, boolean z) {
        byte b2 = this.a;
    }

    @Override
    public final boolean z1(k27 k27Var) {
        byte b2 = this.a;
        return oo1.a(k27Var);
    }

    private final void D3() {
    }

    private final void E3() {
    }

    private final void H3() {
    }

    private final void I3() {
    }

    private final void L3() {
    }

    private final void M3() {
    }

    private final void R() {
    }

    private final void R3() {
    }

    private final void S3() {
    }

    private final void T() {
    }

    private final void T2() {
    }

    private final void U2() {
    }

    private final void f2() {
    }

    private final void h2() {
    }

    private final void n0() {
    }

    private final void o0() {
    }

    @Override
    public final void a() {
    }

    @Override
    public final void release() {
    }

    private final void A2(gb2 gb2Var) {
    }

    private final void C0(gb2 gb2Var) {
    }

    private final void G0(gb2 gb2Var) {
    }

    private final void J1(gb2 gb2Var) {
    }

    private final void J2(gb2 gb2Var) {
    }

    private final void J3(int i) {
    }

    private final void K2(gb2 gb2Var) {
    }

    private final void K3(int i) {
    }

    private final void L1(gb2 gb2Var) {
    }

    private final void L2(gb2 gb2Var) {
    }

    private final void M2(gb2 gb2Var) {
    }

    private final void N2(gb2 gb2Var) {
    }

    private final void O0(gb2 gb2Var) {
    }

    private final void O2(gb2 gb2Var) {
    }

    private final void O3(k27 k27Var) {
    }

    private final void P0(gb2 gb2Var) {
    }

    private final void P1(gb2 gb2Var) {
    }

    private final void P3(k27 k27Var) {
    }

    private final void Q0(h27 h27Var) {
    }

    private final void Q1(gb2 gb2Var) {
    }

    private final void R0(h27 h27Var) {
    }

    private final void R2(gb2 gb2Var) {
    }

    private final void S0(gb2 gb2Var) {
    }

    private final void S2(gb2 gb2Var) {
    }

    private final void W0(gb2 gb2Var) {
    }

    private final void Z(gb2 gb2Var) {
    }

    private final void a0(gb2 gb2Var) {
    }

    private final void b3(String str) {
    }

    private final void c3(String str) {
    }

    private final void f0(gb2 gb2Var) {
    }

    private final void f1(gb2 gb2Var) {
    }

    private final void g0(gb2 gb2Var) {
    }

    private final void g1(gb2 gb2Var) {
    }

    private final void h3(gb2 gb2Var) {
    }

    private final void i3(gb2 gb2Var) {
    }

    private final void l3(gb2 gb2Var) {
    }

    private final void m3(gb2 gb2Var) {
    }

    private final void n3(k27 k27Var) {
    }

    private final void o1(gb2 gb2Var) {
    }

    private final void o3(k27 k27Var) {
    }

    private final void p1(gb2 gb2Var) {
    }

    private final void p3(gb2 gb2Var) {
    }

    private final void q3(gb2 gb2Var) {
    }

    private final void t0(gb2 gb2Var) {
    }

    private final void t3(gb2 gb2Var) {
    }

    private final void u3(gb2 gb2Var) {
    }

    private final void x0(gb2 gb2Var) {
    }

    private final void z2(gb2 gb2Var) {
    }

    private final void A0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void B1(gb2 gb2Var, int i) {
    }

    private final void B3(gb2 gb2Var, boolean z) {
    }

    private final void D2(String str, String str2) {
    }

    private final void E1(gb2 gb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void F2(String str, String str2) {
    }

    private final void G(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void H1(gb2 gb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void J(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void V1(gb2 gb2Var, int i) {
    }

    private final void Z0(gb2 gb2Var, iq0 iq0Var) {
    }

    private final void a2(gb2 gb2Var, int i) {
    }

    private final void d3(gb2 gb2Var, long j) {
    }

    private final void e1(gb2 gb2Var, iq0 iq0Var) {
    }

    private final void e3(gb2 gb2Var, long j) {
    }

    private final void j1(gb2 gb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void k1(gb2 gb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void r3(gb2 gb2Var, k08 k08Var) {
    }

    private final void s3(gb2 gb2Var, k08 k08Var) {
    }

    private final void v3(gb2 gb2Var, boolean z) {
    }

    private final void w1(gb2 gb2Var, int i) {
    }

    private final void x3(gb2 gb2Var, boolean z) {
    }

    private final void y0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void z3(gb2 gb2Var, boolean z) {
    }

    @Override
    public final void u(Looper looper, uc8 uc8Var) {
    }

    private final void A3(gb2 gb2Var, boolean z, boolean z2) {
    }

    private final void B(gb2 gb2Var, float f2, float f3) {
    }

    private final void C(gb2 gb2Var, float f2, float f3) {
    }

    private final void C3(gb2 gb2Var, boolean z, boolean z2) {
    }

    private final void G2(gb2 gb2Var, TLRPC.Document document, RectF rectF) {
    }

    private final void I2(gb2 gb2Var, TLRPC.Document document, RectF rectF) {
    }

    private final void K0(gb2 gb2Var, TLObject tLObject, boolean z) {
    }

    private final void L0(gb2 gb2Var, TLObject tLObject, boolean z) {
    }

    private final void P2(gb2 gb2Var, float f2, float f3) {
    }

    private final void Q2(gb2 gb2Var, float f2, float f3) {
    }

    private final void V2(gb2 gb2Var, CharacterStyle characterStyle, boolean z) {
    }

    private final void W2(gb2 gb2Var, CharacterStyle characterStyle, boolean z) {
    }

    private final void j3(gb2 gb2Var, float f2, float f3) {
    }

    private final void k3(gb2 gb2Var, float f2, float f3) {
    }

    private final void m2(gb2 gb2Var, float f2, float f3) {
    }

    private final void n2(gb2 gb2Var, float f2, float f3) {
    }

    private final void s1(gb2 gb2Var, int i, int i2) {
    }

    private final void u1(gb2 gb2Var, int i, int i2) {
    }

    private final void w3(gb2 gb2Var, boolean z, boolean z2) {
    }

    private final void y3(gb2 gb2Var, boolean z, boolean z2) {
    }

    private final void S1(gb2 gb2Var, float f2, float f3, boolean z) {
    }

    private final void U1(gb2 gb2Var, float f2, float f3, boolean z) {
    }

    private final void X2(gb2 gb2Var, TLRPC.User user, float f2, float f3) {
    }

    private final void Y2(gb2 gb2Var, TLRPC.User user, float f2, float f3) {
    }

    private final void Z2(gb2 gb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void a3(gb2 gb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void o2(gb2 gb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    private final void p2(gb2 gb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    private final void f3(gb2 gb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    private final void g3(gb2 gb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    private final void q2(gb2 gb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    private final void r2(gb2 gb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    private final void t2(gb2 gb2Var, int i, float f2, float f3, boolean z) {
    }

    private final void w2(gb2 gb2Var, int i, float f2, float f3, boolean z) {
    }

    private final void H0(gb2 gb2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    private final void I0(gb2 gb2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    private final void F3(k27 k27Var, String str, String str2, String str3, String str4, int i, int i2) {
    }

    private final void G3(k27 k27Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
