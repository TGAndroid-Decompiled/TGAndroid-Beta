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
public final class fgf implements lr2, c7a, z0c, l61, cx7, tcb, is3, hdc, w0d, am0, qoa, mc2 {
    public static fgf b;
    public static final fgf c = new fgf((byte) 1);
    public static final fgf d = new fgf((byte) 2);
    public static final fgf e = new fgf((byte) 4);
    public static final fgf f = new fgf((byte) 5);
    public static final fgf h = new fgf((byte) 6);
    public static final fgf n = new fgf((byte) 7);
    public static final fgf r = new fgf((byte) 8);
    public static final fgf s = new fgf((byte) 9);
    public static final fgf w = new fgf((byte) 10);
    public static final fgf x = new fgf((byte) 11);
    public static final fgf y = new fgf((byte) 12);
    public final byte a;

    public fgf(byte b2) {
        this.a = b2;
    }

    public static qk0 B(byte[][] bArr, int i) {
        int i2 = i << 1;
        qk0 qk0Var = new qk0(bArr[0].length + i2, bArr.length + i2);
        int[] iArr = qk0Var.d;
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = 0;
        }
        int i4 = (qk0Var.b - i) - 1;
        int i5 = 0;
        while (i5 < bArr.length) {
            byte[] bArr2 = bArr[i5];
            for (int i6 = 0; i6 < bArr[0].length; i6++) {
                if (bArr2[i6] == 1) {
                    qk0Var.c(i6 + i, i4);
                }
            }
            i5++;
            i4--;
        }
        return qk0Var;
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
            throw new ubb("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
        throw new ubb("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
    }

    public static void T3(tpd tpdVar, u76 u76Var, boolean z, TaskCompletionSource taskCompletionSource) {
        o94[] o94VarArr;
        IInterface f1dVar;
        IInterface f1dVar2;
        synchronized (tpdVar.G) {
            god godVar = (god) tpdVar.G.remove(u76Var);
            if (godVar == null) {
                taskCompletionSource.setResult(Boolean.FALSE);
                return;
            }
            o94 o94Var = null;
            godVar.b.h().b = null;
            if (z) {
                ape apeVar = tpdVar.B;
                if (apeVar == null) {
                    o94VarArr = null;
                } else {
                    o94VarArr = apeVar.b;
                }
                if (o94VarArr != null) {
                    int length = o94VarArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        o94 o94Var2 = o94VarArr[i];
                        if ("location_updates_with_callback".equals(o94Var2.a)) {
                            o94Var = o94Var2;
                            break;
                        }
                        i++;
                    }
                    if (o94Var != null && o94Var.b() >= 1) {
                        b5f b5fVar = (b5f) tpdVar.k();
                        dmd dmdVar = new dmd(Boolean.TRUE, taskCompletionSource);
                        Parcel R = b5fVar.R();
                        int i2 = sid.a;
                        R.writeInt(1);
                        int r2 = mve.r(R, 20293);
                        mve.q(R, 1, 4);
                        R.writeInt(2);
                        mve.f(R, 3, godVar);
                        mve.s(R, r2);
                        sid.c(R, dmdVar);
                        b5fVar.V(R, 89);
                    }
                }
                b5f b5fVar2 = (b5f) tpdVar.k();
                pmd pmdVar = new pmd(taskCompletionSource);
                int i3 = god.c;
                IInterface queryLocalInterface = godVar.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
                if (queryLocalInterface instanceof cdf) {
                    f1dVar = (cdf) queryLocalInterface;
                } else {
                    f1dVar = new f1d(godVar, "com.google.android.gms.location.ILocationCallback", (byte) 5);
                }
                IInterface queryLocalInterface2 = pmdVar.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                if (queryLocalInterface2 instanceof jue) {
                    f1dVar2 = (jue) queryLocalInterface2;
                } else {
                    f1dVar2 = new f1d(pmdVar, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", (byte) 5);
                }
                Parcel R2 = b5fVar2.R();
                int i4 = sid.a;
                R2.writeInt(1);
                int r3 = mve.r(R2, 20293);
                mve.q(R2, 1, 4);
                R2.writeInt(2);
                mve.f(R2, 5, f1dVar.asBinder());
                mve.f(R2, 6, f1dVar2.asBinder());
                mve.s(R2, r3);
                b5fVar2.V(R2, 59);
            } else {
                taskCompletionSource.setResult(Boolean.TRUE);
            }
        }
    }

    @Override
    public final void A(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override
    public final boolean A0(long j) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void B1(rc2 rc2Var, ir0 ir0Var) {
        byte b2 = this.a;
    }

    @Override
    public final int C(go4 go4Var) {
        String str = go4Var.t;
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
        u36.j(b10.h("Unsupported MIME type: ", str));
        return 0;
    }

    @Override
    public final void C1() {
        byte b2 = this.a;
    }

    @Override
    public final void D0(rc2 rc2Var, boolean z) {
        byte b2 = this.a;
    }

    @Override
    public final boolean D1(gn gnVar) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final boolean E(rc2 rc2Var, TLRPC.TodoItem todoItem) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void F(rc2 rc2Var, TLRPC.Document document, RectF rectF) {
        byte b2 = this.a;
    }

    @Override
    public final void F0(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void G(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void H(rc2 rc2Var, int i, float f2, float f3, boolean z) {
        byte b2 = this.a;
    }

    @Override
    public final void I1(rc2 rc2Var, TLObject tLObject, boolean z) {
        byte b2 = this.a;
    }

    @Override
    public final boolean J0(rc2 rc2Var, TLRPC.TodoItem todoItem, boolean z) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void J1(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override
    public final boolean K() {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final int K1() {
        return 0;
    }

    @Override
    public final void L0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        byte b2 = this.a;
    }

    @Override
    public final void L1(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void M(rc2 rc2Var, CharacterStyle characterStyle, boolean z) {
        byte b2 = this.a;
    }

    @Override
    public final void M0(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override
    public final pc8 M1() {
        byte b2 = this.a;
        return null;
    }

    @Override
    public final boolean N() {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void N0(rc2 rc2Var, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override
    public final void N1(String str, String str2) {
        byte b2 = this.a;
    }

    @Override
    public final int O() {
        byte b2 = this.a;
        return 0;
    }

    @Override
    public final boolean O1(long j) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void P(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override
    public final String P0(rc2 rc2Var) {
        byte b2 = this.a;
        return null;
    }

    @Override
    public final void P1(rc2 rc2Var, n28 n28Var) {
        byte b2 = this.a;
    }

    @Override
    public final int Q(rc2 rc2Var) {
        byte b2 = this.a;
        return 0;
    }

    @Override
    public final void Q0(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void Q1(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void R(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override
    public final hw1 S() {
        byte b2 = this.a;
        return null;
    }

    @Override
    public final boolean S0(rc2 rc2Var, TL_iv.PageBlock pageBlock) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void T(k47 k47Var) {
        byte b2 = this.a;
    }

    @Override
    public final void T0() {
        byte b2 = this.a;
    }

    @Override
    public final void U(rc2 rc2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        byte b2 = this.a;
    }

    @Override
    public final void U0(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override
    public final boolean U1(k47 k47Var) {
        byte b2 = this.a;
        return true;
    }

    @Override
    public final int V() {
        return 0;
    }

    @Override
    public final void V0(rc2 rc2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override
    public final void W(rc2 rc2Var, TLRPC.User user, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override
    public final void W1(rc2 rc2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
        byte b2 = this.a;
    }

    @Override
    public final Object X(sm2 sm2Var) {
        switch (this.a) {
            case 1:
                Object i = sm2Var.i(new yy8(n6c.class, Executor.class));
                i.getClass();
                return new e64((Executor) i);
            case 4:
                return new li7(sm2Var.N(ki7.class));
            case 9:
                return new ki7(sm2Var.d(mpd.class));
            default:
                return new Object();
        }
    }

    @Override
    public final void X0(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void X1(rc2 rc2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        byte b2 = this.a;
    }

    @Override
    public final void Y(int i) {
        byte b2 = this.a;
    }

    @Override
    public final boolean Y1(rc2 rc2Var, TLRPC.User user) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final boolean Z() {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void Z0(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override
    public final boolean Z1(rc2 rc2Var) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final CharacterStyle a0(rc2 rc2Var) {
        byte b2 = this.a;
        return null;
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
    public final void b1(rc2 rc2Var, ArrayList arrayList, int i, int i2, int i3) {
        byte b2 = this.a;
    }

    @Override
    public final void c() {
        byte b2 = this.a;
    }

    @Override
    public final cs3 d(fs3 fs3Var, go4 go4Var) {
        if (go4Var.x == null) {
            return null;
        }
        return new i54(new bs3(6001, new Exception()));
    }

    @Override
    public final boolean d0() {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void d2(rc2 rc2Var, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override
    public final Object e() {
        return new lj7(true);
    }

    @Override
    public final void e0(k47 k47Var) {
        byte b2 = this.a;
    }

    @Override
    public final boolean f() {
        byte b2 = this.a;
        return true;
    }

    @Override
    public final hs3 g(fs3 fs3Var, go4 go4Var) {
        return hs3.t;
    }

    @Override
    public final int g0() {
        return 0;
    }

    @Override
    public final float g1() {
        return 0.0f;
    }

    @Override
    public final void g2() {
        byte b2 = this.a;
    }

    @Override
    public final boolean h(go4 go4Var) {
        String str = go4Var.t;
        if (!Objects.equals(str, "text/x-ssa") && !Objects.equals(str, "text/vtt") && !Objects.equals(str, "application/x-mp4-vtt") && !Objects.equals(str, "application/x-subrip") && !Objects.equals(str, "application/x-quicktime-tx3g") && !Objects.equals(str, "application/pgs") && !Objects.equals(str, "application/vobsub") && !Objects.equals(str, "application/dvbsubs") && !Objects.equals(str, "application/ttml+xml")) {
            return false;
        }
        return true;
    }

    @Override
    public final void h0(String str) {
        byte b2 = this.a;
    }

    @Override
    public final int h1() {
        return 0;
    }

    @Override
    public final void i() {
        byte b2 = this.a;
    }

    @Override
    public final void i0(rc2 rc2Var, int i) {
        byte b2 = this.a;
    }

    @Override
    public final void i1(rc2 rc2Var, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override
    public final void i2(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override
    public final byte[] j(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override
    public final void k(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void k0(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void k1(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override
    public final boolean l() {
        n50 n50Var = cmb.c5;
        if (n50Var == null) {
            n50Var = new n50();
            cmb.c5 = n50Var;
        }
        if (n50Var.i != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean l0(rc2 rc2Var, boolean z) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final boolean l1() {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void l2(rc2 rc2Var, boolean z, boolean z2) {
        byte b2 = this.a;
    }

    @Override
    public final void m(rc2 rc2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
        byte b2 = this.a;
    }

    @Override
    public final void m0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        byte b2 = this.a;
    }

    @Override
    public final boolean m1(k47 k47Var) {
        byte b2 = this.a;
        return aq1.a(k47Var);
    }

    @Override
    public final boolean m2(int i) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void n(Object obj, p6c p6cVar) {
        gu4 a;
        Map a2 = ((lj7) obj).a();
        qi8 n2 = si8.n();
        for (Map.Entry entry : a2.entrySet()) {
            Object value = entry.getValue();
            String str = ((ni8) entry.getKey()).a;
            if (value instanceof Boolean) {
                vi8 v = xi8.v();
                boolean booleanValue = ((Boolean) value).booleanValue();
                v.c();
                ((xi8) v.b).w(booleanValue);
                a = v.a();
            } else if (value instanceof Float) {
                vi8 v2 = xi8.v();
                float floatValue = ((Number) value).floatValue();
                v2.c();
                ((xi8) v2.b).z(floatValue);
                a = v2.a();
            } else if (value instanceof Double) {
                vi8 v3 = xi8.v();
                double doubleValue = ((Number) value).doubleValue();
                v3.c();
                ((xi8) v3.b).y(doubleValue);
                a = v3.a();
            } else if (value instanceof Integer) {
                vi8 v4 = xi8.v();
                int intValue = ((Number) value).intValue();
                v4.c();
                ((xi8) v4.b).A(intValue);
                a = v4.a();
            } else if (value instanceof Long) {
                vi8 v5 = xi8.v();
                long longValue = ((Number) value).longValue();
                v5.c();
                ((xi8) v5.b).B(longValue);
                a = v5.a();
            } else if (value instanceof String) {
                vi8 v6 = xi8.v();
                v6.c();
                ((xi8) v6.b).C((String) value);
                a = v6.a();
            } else if (value instanceof Set) {
                vi8 v7 = xi8.v();
                ti8 o = ui8.o();
                o.c();
                ((ui8) o.b).l((Set) value);
                v7.c();
                ((xi8) v7.b).D((ui8) o.a());
                a = v7.a();
            } else if (value instanceof byte[]) {
                vi8 v8 = xi8.v();
                byte[] bArr = (byte[]) value;
                m61 j = m61.j(0, bArr.length, bArr);
                v8.c();
                ((xi8) v8.b).x(j);
                a = v8.a();
            } else {
                dq9.m("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                return;
            }
            n2.getClass();
            str.getClass();
            n2.c();
            ((si8) n2.b).m().put(str, (xi8) a);
        }
        si8 si8Var = (si8) n2.a();
        int a3 = si8Var.a(null);
        Logger logger = pl2.f;
        if (a3 > 4096) {
            a3 = 4096;
        }
        pl2 pl2Var = new pl2(p6cVar, a3);
        si8Var.b(pl2Var);
        if (pl2Var.d > 0) {
            pl2Var.j();
        }
    }

    @Override
    public final boolean n1(rc2 rc2Var, int i) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final boolean n2(rc2 rc2Var, k47 k47Var) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final StackTraceElement[] o(StackTraceElement[] stackTraceElementArr) {
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
    public final void o0(rc2 rc2Var, int i, int i2) {
        byte b2 = this.a;
    }

    @Override
    public final void o1(rc2 rc2Var, boolean z) {
        byte b2 = this.a;
    }

    @Override
    public final void o2() {
        byte b2 = this.a;
    }

    @Override
    public final Object p(FileInputStream fileInputStream) {
        int i;
        byte[] bArr;
        try {
            si8 o = si8.o(fileInputStream);
            lj7 lj7Var = new lj7(false);
            oi8[] oi8VarArr = (oi8[]) Arrays.copyOf(new oi8[0], 0);
            lj7Var.b();
            if (oi8VarArr.length <= 0) {
                Map l = o.l();
                l.getClass();
                for (Map.Entry entry : l.entrySet()) {
                    String str = (String) entry.getKey();
                    xi8 xi8Var = (xi8) entry.getValue();
                    str.getClass();
                    xi8Var.getClass();
                    int u = xi8Var.u();
                    if (u == 0) {
                        i = -1;
                    } else {
                        i = pi8.a[wi8.F(u)];
                    }
                    switch (i) {
                        case -1:
                            throw new IOException("Value case is null.", null);
                        case 0:
                        default:
                            throw new RuntimeException();
                        case 1:
                            lj7Var.d(new ni8(str), Boolean.valueOf(xi8Var.l()));
                            break;
                        case 2:
                            lj7Var.d(new ni8(str), Float.valueOf(xi8Var.p()));
                            break;
                        case 3:
                            lj7Var.d(new ni8(str), Double.valueOf(xi8Var.o()));
                            break;
                        case 4:
                            lj7Var.d(new ni8(str), Integer.valueOf(xi8Var.q()));
                            break;
                        case 5:
                            lj7Var.d(new ni8(str), Long.valueOf(xi8Var.r()));
                            break;
                        case 6:
                            ni8 ni8Var = new ni8(str);
                            String s2 = xi8Var.s();
                            s2.getClass();
                            lj7Var.d(ni8Var, s2);
                            break;
                        case 7:
                            ni8 ni8Var2 = new ni8(str);
                            lr5 n2 = xi8Var.t().n();
                            n2.getClass();
                            lj7Var.d(ni8Var2, km2.m(n2));
                            break;
                        case 8:
                            ni8 ni8Var3 = new ni8(str);
                            m61 m = xi8Var.m();
                            int size = m.size();
                            if (size == 0) {
                                bArr = mr5.b;
                            } else {
                                byte[] bArr2 = new byte[size];
                                m.k(size, bArr2);
                                bArr = bArr2;
                            }
                            bArr.getClass();
                            lj7Var.d(ni8Var3, bArr);
                            break;
                        case 9:
                            throw new IOException("Value not set.", null);
                    }
                }
                return new lj7(new LinkedHashMap(lj7Var.a()), true);
            }
            oi8 oi8Var = oi8VarArr[0];
            throw null;
        } catch (yr5 e2) {
            throw new IOException("Unable to parse preferences proto.", e2);
        }
    }

    @Override
    public final boolean p0(rc2 rc2Var, TLRPC.Chat chat) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final hkb p2() {
        byte b2 = this.a;
        return null;
    }

    @Override
    public final void q() {
        byte b2 = this.a;
    }

    @Override
    public final void q1(h47 h47Var) {
        byte b2 = this.a;
    }

    @Override
    public final void q2(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override
    public final defpackage.qk0 r(java.lang.String r27, defpackage.zf0 r28, java.util.EnumMap r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgf.r(java.lang.String, zf0, java.util.EnumMap):qk0");
    }

    @Override
    public final void r0(rc2 rc2Var, float f2, float f3, boolean z) {
        byte b2 = this.a;
    }

    @Override
    public final int r1() {
        return 0;
    }

    @Override
    public final void s(boolean z, float[] fArr) {
        n50 n50Var = cmb.c5;
        if (n50Var == null) {
            n50Var = new n50();
            cmb.c5 = n50Var;
        }
        n50Var.d(z, fArr);
    }

    @Override
    public final void s0() {
        byte b2 = this.a;
    }

    @Override
    public final String t(long j) {
        byte b2 = this.a;
        return null;
    }

    @Override
    public final boolean t0(rc2 rc2Var, TLRPC.PollAnswer pollAnswer) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void t1(rc2 rc2Var, int i) {
        byte b2 = this.a;
    }

    @Override
    public final void u(rc2 rc2Var, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override
    public final int u0() {
        return 0;
    }

    @Override
    public final void u1(rc2 rc2Var, boolean z, boolean z2) {
        byte b2 = this.a;
    }

    @Override
    public final vcb v(go4 go4Var) {
        char c2;
        String str = go4Var.t;
        List list = go4Var.w;
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
                    yw7 yw7Var = new yw7((byte[]) list.get(0));
                    int H = yw7Var.H();
                    int H2 = yw7Var.H();
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
                    obj.d = new zs3(719, 575, 0, 719, 0, 575);
                    obj.e = new ys3(0, new int[]{0, -1, -16777216, -8421505}, pr2.j(), pr2.k());
                    obj.f = new et3(H, H2);
                    return obj;
                case 1:
                    return new e7a((byte) 12);
                case 2:
                    ?? obj2 = new Object();
                    obj2.a = new yw7();
                    return obj2;
                case 3:
                    return new rhb((byte) 4);
                case 4:
                    return new q5c(list);
                case 5:
                    return new coa(list);
                case 6:
                    return new tkc(list);
                case 7:
                    return new icb();
                case '\b':
                    return new p4c();
            }
        }
        u36.j(b10.h("Unsupported MIME type: ", str));
        return null;
    }

    @Override
    public final void v0(rc2 rc2Var, long j) {
        byte b2 = this.a;
    }

    @Override
    public final float w0() {
        return -1.0f;
    }

    @Override
    public final void w1(k47 k47Var, String str, String str2, String str3, String str4, int i, int i2) {
        byte b2 = this.a;
    }

    @Override
    public final int x(go4 go4Var) {
        if (go4Var.x != null) {
            return 1;
        }
        return 0;
    }

    @Override
    public final boolean x0(rc2 rc2Var) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void x1(rc2 rc2Var, TLRPC.WebPage webPage, String str, boolean z) {
        byte b2 = this.a;
        l11.u(rc2Var.getContext(), str);
    }

    @Override
    public final Object y(Uri uri, e83 e83Var) {
        return Long.valueOf(hac.W(new BufferedReader(new InputStreamReader(e83Var)).readLine()));
    }

    @Override
    public final float y0() {
        return -1.0f;
    }

    @Override
    public final void y1(rc2 rc2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void z(rc2 rc2Var, TLRPC.User user, TLRPC.Document document, String str) {
        byte b2 = this.a;
    }

    @Override
    public final boolean z1() {
        byte b2 = this.a;
        return false;
    }

    private final void B0() {
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

    private final void R3() {
    }

    private final void S3() {
    }

    private final void T2() {
    }

    private final void U2() {
    }

    private final void b0() {
    }

    private final void c0() {
    }

    private final void t2() {
    }

    private final void u2() {
    }

    private final void z0() {
    }

    @Override
    public final void a() {
    }

    @Override
    public final void release() {
    }

    private final void A1(rc2 rc2Var) {
    }

    private final void C0(rc2 rc2Var) {
    }

    private final void D2(rc2 rc2Var) {
    }

    private final void E0(rc2 rc2Var) {
    }

    private final void E2(rc2 rc2Var) {
    }

    private final void G1(rc2 rc2Var) {
    }

    private final void H1(rc2 rc2Var) {
    }

    private final void I0(rc2 rc2Var) {
    }

    private final void J2(rc2 rc2Var) {
    }

    private final void J3(int i) {
    }

    private final void K0(rc2 rc2Var) {
    }

    private final void K2(rc2 rc2Var) {
    }

    private final void K3(int i) {
    }

    private final void L2(rc2 rc2Var) {
    }

    private final void M2(rc2 rc2Var) {
    }

    private final void N2(rc2 rc2Var) {
    }

    private final void O2(rc2 rc2Var) {
    }

    private final void O3(k47 k47Var) {
    }

    private final void P3(k47 k47Var) {
    }

    private final void R2(rc2 rc2Var) {
    }

    private final void S2(rc2 rc2Var) {
    }

    private final void a1(rc2 rc2Var) {
    }

    private final void b3(String str) {
    }

    private final void c1(rc2 rc2Var) {
    }

    private final void c2(rc2 rc2Var) {
    }

    private final void c3(String str) {
    }

    private final void d1(h47 h47Var) {
    }

    private final void e1(h47 h47Var) {
    }

    private final void e2(rc2 rc2Var) {
    }

    private final void f0(rc2 rc2Var) {
    }

    private final void f1(rc2 rc2Var) {
    }

    private final void f2(rc2 rc2Var) {
    }

    private final void h2(rc2 rc2Var) {
    }

    private final void h3(rc2 rc2Var) {
    }

    private final void i3(rc2 rc2Var) {
    }

    private final void j0(rc2 rc2Var) {
    }

    private final void j1(rc2 rc2Var) {
    }

    private final void l3(rc2 rc2Var) {
    }

    private final void m3(rc2 rc2Var) {
    }

    private final void n0(rc2 rc2Var) {
    }

    private final void n3(k47 k47Var) {
    }

    private final void o3(k47 k47Var) {
    }

    private final void p3(rc2 rc2Var) {
    }

    private final void q0(rc2 rc2Var) {
    }

    private final void q3(rc2 rc2Var) {
    }

    private final void t3(rc2 rc2Var) {
    }

    private final void u3(rc2 rc2Var) {
    }

    private final void v1(rc2 rc2Var) {
    }

    private final void B3(rc2 rc2Var, boolean z) {
    }

    private final void E1(rc2 rc2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void F1(rc2 rc2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void F2(String str, String str2) {
    }

    private final void G0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void G2(String str, String str2) {
    }

    private final void H0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void J(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void L(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void T1(rc2 rc2Var, int i) {
    }

    private final void V1(rc2 rc2Var, int i) {
    }

    private final void a2(rc2 rc2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void b2(rc2 rc2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void d3(rc2 rc2Var, long j) {
    }

    private final void e3(rc2 rc2Var, long j) {
    }

    private final void p1(rc2 rc2Var, ir0 ir0Var) {
    }

    private final void r2(rc2 rc2Var, int i) {
    }

    private final void r3(rc2 rc2Var, n28 n28Var) {
    }

    private final void s1(rc2 rc2Var, ir0 ir0Var) {
    }

    private final void s2(rc2 rc2Var, int i) {
    }

    private final void s3(rc2 rc2Var, n28 n28Var) {
    }

    private final void v3(rc2 rc2Var, boolean z) {
    }

    private final void x3(rc2 rc2Var, boolean z) {
    }

    private final void z3(rc2 rc2Var, boolean z) {
    }

    @Override
    public final void w(Looper looper, we8 we8Var) {
    }

    private final void A3(rc2 rc2Var, boolean z, boolean z2) {
    }

    private final void C3(rc2 rc2Var, boolean z, boolean z2) {
    }

    private final void D(rc2 rc2Var, float f2, float f3) {
    }

    private final void H2(rc2 rc2Var, TLRPC.Document document, RectF rectF) {
    }

    private final void I(rc2 rc2Var, float f2, float f3) {
    }

    private final void I2(rc2 rc2Var, TLRPC.Document document, RectF rectF) {
    }

    private final void P2(rc2 rc2Var, float f2, float f3) {
    }

    private final void Q2(rc2 rc2Var, float f2, float f3) {
    }

    private final void R1(rc2 rc2Var, int i, int i2) {
    }

    private final void S1(rc2 rc2Var, int i, int i2) {
    }

    private final void V2(rc2 rc2Var, CharacterStyle characterStyle, boolean z) {
    }

    private final void W0(rc2 rc2Var, TLObject tLObject, boolean z) {
    }

    private final void W2(rc2 rc2Var, CharacterStyle characterStyle, boolean z) {
    }

    private final void Y0(rc2 rc2Var, TLObject tLObject, boolean z) {
    }

    private final void j3(rc2 rc2Var, float f2, float f3) {
    }

    private final void k3(rc2 rc2Var, float f2, float f3) {
    }

    private final void v2(rc2 rc2Var, float f2, float f3) {
    }

    private final void w2(rc2 rc2Var, float f2, float f3) {
    }

    private final void w3(rc2 rc2Var, boolean z, boolean z2) {
    }

    private final void y3(rc2 rc2Var, boolean z, boolean z2) {
    }

    private final void X2(rc2 rc2Var, TLRPC.User user, float f2, float f3) {
    }

    private final void Y2(rc2 rc2Var, TLRPC.User user, float f2, float f3) {
    }

    private final void Z2(rc2 rc2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void a3(rc2 rc2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void j2(rc2 rc2Var, float f2, float f3, boolean z) {
    }

    private final void k2(rc2 rc2Var, float f2, float f3, boolean z) {
    }

    private final void x2(rc2 rc2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    private final void y2(rc2 rc2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    private final void A2(rc2 rc2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    private final void B2(rc2 rc2Var, int i, float f2, float f3, boolean z) {
    }

    private final void C2(rc2 rc2Var, int i, float f2, float f3, boolean z) {
    }

    private final void f3(rc2 rc2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    private final void g3(rc2 rc2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    private final void z2(rc2 rc2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    private final void O0(rc2 rc2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    private final void R0(rc2 rc2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    private final void F3(k47 k47Var, String str, String str2, String str3, String str4, int i, int i2) {
    }

    private final void G3(k47 k47Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
