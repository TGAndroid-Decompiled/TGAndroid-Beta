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
public final class uif implements tq2, s8a, y2c, m51, iy7, peb, pr3, efc, l3d, bl0, mqa, rb2, s68 {
    public static uif b;
    public static final uif c = new uif((byte) 1);
    public static final uif d = new uif((byte) 2);
    public static final uif e = new uif((byte) 4);
    public static final uif f = new uif((byte) 5);
    public static final uif h = new uif((byte) 6);
    public static final uif n = new uif((byte) 7);
    public static final uif r = new uif((byte) 8);
    public static final uif s = new uif((byte) 9);
    public static final uif w = new uif((byte) 10);
    public static final uif x = new uif((byte) 11);
    public static final uif y = new uif((byte) 12);
    public final byte a;

    public uif(byte b2) {
        this.a = b2;
    }

    public static rj0 B(byte[][] bArr, int i) {
        int i2 = i << 1;
        rj0 rj0Var = new rj0(bArr[0].length + i2, bArr.length + i2);
        int[] iArr = rj0Var.d;
        int length = iArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = 0;
        }
        int i4 = (rj0Var.b - i) - 1;
        int i5 = 0;
        while (i5 < bArr.length) {
            byte[] bArr2 = bArr[i5];
            for (int i6 = 0; i6 < bArr[0].length; i6++) {
                if (bArr2[i6] == 1) {
                    rj0Var.c(i6 + i, i4);
                }
            }
            i5++;
            i4--;
        }
        return rj0Var;
    }

    public static byte[][] O3(byte[][] bArr) {
        byte[][] bArr2 = (byte[][]) Array.newInstance(Byte.TYPE, bArr[0].length, bArr.length);
        for (int i = 0; i < bArr.length; i++) {
            int length = (bArr.length - i) - 1;
            for (int i2 = 0; i2 < bArr[0].length; i2++) {
                bArr2[i2][length] = bArr[i][i2];
            }
        }
        return bArr2;
    }

    public static void R3(String str) {
        if (str != null && str.length() != 0) {
            if (!str.startsWith("sk_")) {
                return;
            }
            throw new qdb("Invalid Publishable Key: You are using a secret key to create a token, instead of the publishable one. For more info, see https://stripe.com/docs/stripe.js", null);
        }
        throw new qdb("Invalid Publishable Key: You must use a valid publishable key to create a token.  For more info, see https://stripe.com/docs/stripe.js.", null);
    }

    public static void U3(hsd hsdVar, y76 y76Var, boolean z, TaskCompletionSource taskCompletionSource) {
        a94[] a94VarArr;
        IInterface v3dVar;
        IInterface v3dVar2;
        synchronized (hsdVar.G) {
            uqd uqdVar = (uqd) hsdVar.G.remove(y76Var);
            if (uqdVar == null) {
                taskCompletionSource.setResult(Boolean.FALSE);
                return;
            }
            a94 a94Var = null;
            uqdVar.b.j().b = null;
            if (z) {
                ore oreVar = hsdVar.B;
                if (oreVar == null) {
                    a94VarArr = null;
                } else {
                    a94VarArr = oreVar.b;
                }
                if (a94VarArr != null) {
                    int length = a94VarArr.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        a94 a94Var2 = a94VarArr[i];
                        if ("location_updates_with_callback".equals(a94Var2.a)) {
                            a94Var = a94Var2;
                            break;
                        }
                        i++;
                    }
                    if (a94Var != null && a94Var.b() >= 1) {
                        q7f q7fVar = (q7f) hsdVar.k();
                        sod sodVar = new sod(Boolean.TRUE, taskCompletionSource);
                        Parcel R = q7fVar.R();
                        int i2 = ild.a;
                        R.writeInt(1);
                        int r2 = bye.r(R, 20293);
                        bye.q(R, 1, 4);
                        R.writeInt(2);
                        bye.f(R, 3, uqdVar);
                        bye.s(R, r2);
                        ild.c(R, sodVar);
                        q7fVar.V(R, 89);
                    }
                }
                q7f q7fVar2 = (q7f) hsdVar.k();
                epd epdVar = new epd(taskCompletionSource);
                int i3 = uqd.c;
                IInterface queryLocalInterface = uqdVar.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
                if (queryLocalInterface instanceof rff) {
                    v3dVar = (rff) queryLocalInterface;
                } else {
                    v3dVar = new v3d(uqdVar, "com.google.android.gms.location.ILocationCallback", (byte) 5);
                }
                IInterface queryLocalInterface2 = epdVar.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
                if (queryLocalInterface2 instanceof xwe) {
                    v3dVar2 = (xwe) queryLocalInterface2;
                } else {
                    v3dVar2 = new v3d(epdVar, "com.google.android.gms.location.internal.IFusedLocationProviderCallback", (byte) 5);
                }
                Parcel R2 = q7fVar2.R();
                int i4 = ild.a;
                R2.writeInt(1);
                int r3 = bye.r(R2, 20293);
                bye.q(R2, 1, 4);
                R2.writeInt(2);
                bye.f(R2, 5, v3dVar.asBinder());
                bye.f(R2, 6, v3dVar2.asBinder());
                bye.s(R2, r3);
                q7fVar2.V(R2, 59);
            } else {
                taskCompletionSource.setResult(Boolean.TRUE);
            }
        }
    }

    @Override
    public final void A(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void A0(wb2 wb2Var, boolean z) {
        byte b2 = this.a;
    }

    @Override
    public final boolean A1(hm hmVar) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final float B0() {
        return -1.0f;
    }

    @Override
    public final void C0(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final float D0() {
        return -1.0f;
    }

    @Override
    public final boolean E(wb2 wb2Var, TLRPC.TodoItem todoItem) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void F(wb2 wb2Var, TLRPC.Document document, RectF rectF) {
        byte b2 = this.a;
    }

    @Override
    public final void F1(wb2 wb2Var, TLObject tLObject, boolean z) {
        byte b2 = this.a;
    }

    @Override
    public final void G(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final boolean G0(wb2 wb2Var, TLRPC.TodoItem todoItem, boolean z) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void G1(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void H(wb2 wb2Var, int i, float f2, float f3, boolean z) {
        byte b2 = this.a;
    }

    @Override
    public final Object I(Uri uri, l73 l73Var) {
        return Long.valueOf(gcc.W(new BufferedReader(new InputStreamReader(l73Var)).readLine()));
    }

    @Override
    public final void I0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        byte b2 = this.a;
    }

    @Override
    public final void I1(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final Object J(ie9 ie9Var) {
        return null;
    }

    @Override
    public final void J0(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final de8 J1() {
        byte b2 = this.a;
        return null;
    }

    @Override
    public final boolean K() {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void K0(wb2 wb2Var, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override
    public final void K1(String str, String str2) {
        byte b2 = this.a;
    }

    @Override
    public final void L(wb2 wb2Var, CharacterStyle characterStyle, boolean z) {
        byte b2 = this.a;
    }

    @Override
    public final boolean L1(long j) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final boolean M() {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final String M0(wb2 wb2Var) {
        byte b2 = this.a;
        return null;
    }

    @Override
    public final void M1(wb2 wb2Var, q38 q38Var) {
        byte b2 = this.a;
    }

    @Override
    public final int N() {
        byte b2 = this.a;
        return 0;
    }

    @Override
    public final void N0(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void N1(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void O(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final int P(wb2 wb2Var) {
        byte b2 = this.a;
        return 0;
    }

    @Override
    public final boolean P0(wb2 wb2Var, TL_iv.PageBlock pageBlock) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void Q(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void Q0() {
        byte b2 = this.a;
    }

    @Override
    public final int Q1() {
        return 0;
    }

    @Override
    public final boolean R1(r47 r47Var) {
        byte b2 = this.a;
        return true;
    }

    @Override
    public final iv1 S() {
        byte b2 = this.a;
        return null;
    }

    @Override
    public final void T(r47 r47Var) {
        byte b2 = this.a;
    }

    @Override
    public final void T1(wb2 wb2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
        byte b2 = this.a;
    }

    @Override
    public final void U(wb2 wb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        byte b2 = this.a;
    }

    @Override
    public final void U0(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void U1(wb2 wb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        byte b2 = this.a;
    }

    @Override
    public final void V0(wb2 wb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override
    public final boolean V1(wb2 wb2Var, TLRPC.User user) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void W(wb2 wb2Var, TLRPC.User user, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override
    public final boolean W1(wb2 wb2Var) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final int X() {
        return 0;
    }

    @Override
    public final void Y(int i) {
        byte b2 = this.a;
    }

    @Override
    public final void Y0(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final boolean Z() {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final CharacterStyle a0(wb2 wb2Var) {
        byte b2 = this.a;
        return null;
    }

    @Override
    public final void a1(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void a2(wb2 wb2Var, float f2, float f3) {
        byte b2 = this.a;
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
    public final Object b0(am2 am2Var) {
        switch (this.a) {
            case 1:
                Object h2 = am2Var.h(new i09(m8c.class, Executor.class));
                h2.getClass();
                return new p54((Executor) h2);
            case 4:
                return new si7(am2Var.N(ri7.class));
            default:
                return new ri7(am2Var.d(asd.class));
        }
    }

    @Override
    public final jr3 c(mr3 mr3Var, ko4 ko4Var) {
        if (ko4Var.x == null) {
            return null;
        }
        return new t44(new ir3(6001, new Exception()));
    }

    @Override
    public final boolean c0() {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void c1(wb2 wb2Var, ArrayList arrayList, int i, int i2, int i3) {
        byte b2 = this.a;
    }

    @Override
    public final void d() {
        byte b2 = this.a;
    }

    @Override
    public final void d0(r47 r47Var) {
        byte b2 = this.a;
    }

    @Override
    public final void d2() {
        byte b2 = this.a;
    }

    @Override
    public final Object e() {
        return new sj7(true);
    }

    @Override
    public final void e2(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final or3 f(mr3 mr3Var, ko4 ko4Var) {
        return or3.t;
    }

    @Override
    public final void f1(wb2 wb2Var, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override
    public final byte[] g(int i, int i2, byte[] bArr) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override
    public final void g0(String str) {
        byte b2 = this.a;
    }

    @Override
    public final boolean h() {
        byte b2 = this.a;
        return true;
    }

    @Override
    public final void h0(wb2 wb2Var, int i) {
        byte b2 = this.a;
    }

    @Override
    public final void h1(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void h2(wb2 wb2Var, boolean z, boolean z2) {
        byte b2 = this.a;
    }

    @Override
    public final void i() {
        byte b2 = this.a;
    }

    @Override
    public final boolean i1() {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final boolean i2(int i) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final boolean j(ko4 ko4Var) {
        String str = ko4Var.t;
        if (!Objects.equals(str, "text/x-ssa") && !Objects.equals(str, "text/vtt") && !Objects.equals(str, "application/x-mp4-vtt") && !Objects.equals(str, "application/x-subrip") && !Objects.equals(str, "application/x-quicktime-tx3g") && !Objects.equals(str, "application/pgs") && !Objects.equals(str, "application/vobsub") && !Objects.equals(str, "application/dvbsubs") && !Objects.equals(str, "application/ttml+xml")) {
            return false;
        }
        return true;
    }

    @Override
    public final void j0(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final boolean j1(r47 r47Var) {
        byte b2 = this.a;
        return bp1.a(r47Var);
    }

    @Override
    public final boolean j2(wb2 wb2Var, r47 r47Var) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final boolean k() {
        p40 p40Var = aob.d5;
        if (p40Var == null) {
            p40Var = new p40();
            aob.d5 = p40Var;
        }
        if (p40Var.i != null) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean k0(wb2 wb2Var, boolean z) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final boolean k1(wb2 wb2Var, int i) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void k2() {
        byte b2 = this.a;
    }

    @Override
    public final void l(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void l0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        byte b2 = this.a;
    }

    @Override
    public final void l1(wb2 wb2Var, boolean z) {
        byte b2 = this.a;
    }

    @Override
    public final bmb l2() {
        byte b2 = this.a;
        return null;
    }

    @Override
    public final void m(wb2 wb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
        byte b2 = this.a;
    }

    @Override
    public final int m0() {
        return 0;
    }

    @Override
    public final float m1() {
        return 0.0f;
    }

    @Override
    public final void m2(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final void n(Object obj, o8c o8cVar) {
        ju4 a;
        Map a2 = ((sj7) obj).a();
        ck8 n2 = ek8.n();
        for (Map.Entry entry : a2.entrySet()) {
            Object value = entry.getValue();
            String str = ((zj8) entry.getKey()).a;
            if (value instanceof Boolean) {
                hk8 v = jk8.v();
                boolean booleanValue = ((Boolean) value).booleanValue();
                v.c();
                ((jk8) v.b).w(booleanValue);
                a = v.a();
            } else if (value instanceof Float) {
                hk8 v2 = jk8.v();
                float floatValue = ((Number) value).floatValue();
                v2.c();
                ((jk8) v2.b).z(floatValue);
                a = v2.a();
            } else if (value instanceof Double) {
                hk8 v3 = jk8.v();
                double doubleValue = ((Number) value).doubleValue();
                v3.c();
                ((jk8) v3.b).y(doubleValue);
                a = v3.a();
            } else if (value instanceof Integer) {
                hk8 v4 = jk8.v();
                int intValue = ((Number) value).intValue();
                v4.c();
                ((jk8) v4.b).A(intValue);
                a = v4.a();
            } else if (value instanceof Long) {
                hk8 v5 = jk8.v();
                long longValue = ((Number) value).longValue();
                v5.c();
                ((jk8) v5.b).B(longValue);
                a = v5.a();
            } else if (value instanceof String) {
                hk8 v6 = jk8.v();
                v6.c();
                ((jk8) v6.b).C((String) value);
                a = v6.a();
            } else if (value instanceof Set) {
                hk8 v7 = jk8.v();
                fk8 o = gk8.o();
                o.c();
                ((gk8) o.b).l((Set) value);
                v7.c();
                ((jk8) v7.b).D((gk8) o.a());
                a = v7.a();
            } else if (value instanceof byte[]) {
                hk8 v8 = jk8.v();
                byte[] bArr = (byte[]) value;
                n51 j = n51.j(0, bArr.length, bArr);
                v8.c();
                ((jk8) v8.b).x(j);
                a = v8.a();
            } else {
                grb.i("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                return;
            }
            n2.getClass();
            str.getClass();
            n2.c();
            ((ek8) n2.b).m().put(str, (jk8) a);
        }
        ek8 ek8Var = (ek8) n2.a();
        int a3 = ek8Var.a(null);
        Logger logger = xk2.f;
        if (a3 > 4096) {
            a3 = 4096;
        }
        xk2 xk2Var = new xk2(o8cVar, a3);
        ek8Var.b(xk2Var);
        if (xk2Var.d > 0) {
            xk2Var.j();
        }
    }

    @Override
    public final void n0(wb2 wb2Var, int i, int i2) {
        byte b2 = this.a;
    }

    @Override
    public final void n1(o47 o47Var) {
        byte b2 = this.a;
    }

    @Override
    public final defpackage.rj0 o(java.lang.String r27, defpackage.bf0 r28, java.util.EnumMap r29) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uif.o(java.lang.String, bf0, java.util.EnumMap):rj0");
    }

    @Override
    public final boolean o0(wb2 wb2Var, TLRPC.Chat chat) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final int o1() {
        return 0;
    }

    @Override
    public final StackTraceElement[] p(StackTraceElement[] stackTraceElementArr) {
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
    public final Object q(FileInputStream fileInputStream) {
        int i;
        byte[] bArr;
        try {
            ek8 o = ek8.o(fileInputStream);
            sj7 sj7Var = new sj7(false);
            ak8[] ak8VarArr = (ak8[]) Arrays.copyOf(new ak8[0], 0);
            sj7Var.b();
            if (ak8VarArr.length <= 0) {
                Map l = o.l();
                l.getClass();
                for (Map.Entry entry : l.entrySet()) {
                    String str = (String) entry.getKey();
                    jk8 jk8Var = (jk8) entry.getValue();
                    str.getClass();
                    jk8Var.getClass();
                    int u = jk8Var.u();
                    if (u == 0) {
                        i = -1;
                    } else {
                        i = bk8.a[ik8.F(u)];
                    }
                    switch (i) {
                        case -1:
                            throw new IOException("Value case is null.", null);
                        case 0:
                        default:
                            throw new RuntimeException();
                        case 1:
                            sj7Var.d(new zj8(str), Boolean.valueOf(jk8Var.l()));
                            break;
                        case 2:
                            sj7Var.d(new zj8(str), Float.valueOf(jk8Var.p()));
                            break;
                        case 3:
                            sj7Var.d(new zj8(str), Double.valueOf(jk8Var.o()));
                            break;
                        case 4:
                            sj7Var.d(new zj8(str), Integer.valueOf(jk8Var.q()));
                            break;
                        case 5:
                            sj7Var.d(new zj8(str), Long.valueOf(jk8Var.r()));
                            break;
                        case 6:
                            zj8 zj8Var = new zj8(str);
                            String s2 = jk8Var.s();
                            s2.getClass();
                            sj7Var.d(zj8Var, s2);
                            break;
                        case 7:
                            zj8 zj8Var2 = new zj8(str);
                            or5 n2 = jk8Var.t().n();
                            n2.getClass();
                            sj7Var.d(zj8Var2, sl2.m(n2));
                            break;
                        case 8:
                            zj8 zj8Var3 = new zj8(str);
                            n51 m = jk8Var.m();
                            int size = m.size();
                            if (size == 0) {
                                bArr = pr5.b;
                            } else {
                                byte[] bArr2 = new byte[size];
                                m.k(size, bArr2);
                                bArr = bArr2;
                            }
                            bArr.getClass();
                            sj7Var.d(zj8Var3, bArr);
                            break;
                        case 9:
                            throw new IOException("Value not set.", null);
                    }
                }
                return new sj7(new LinkedHashMap(sj7Var.a()), true);
            }
            ak8 ak8Var = ak8VarArr[0];
            throw null;
        } catch (bs5 e2) {
            throw new IOException("Unable to parse preferences proto.", e2);
        }
    }

    @Override
    public final void q0(wb2 wb2Var, float f2, float f3, boolean z) {
        byte b2 = this.a;
    }

    @Override
    public final void q1(wb2 wb2Var, int i) {
        byte b2 = this.a;
    }

    @Override
    public final void r() {
        byte b2 = this.a;
    }

    @Override
    public final void r0() {
        byte b2 = this.a;
    }

    @Override
    public final void r1(wb2 wb2Var, boolean z, boolean z2) {
        byte b2 = this.a;
    }

    @Override
    public final reb s(ko4 ko4Var) {
        char c2;
        String str = ko4Var.t;
        List list = ko4Var.w;
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
                    ey7 ey7Var = new ey7((byte[]) list.get(0));
                    int H = ey7Var.H();
                    int H2 = ey7Var.H();
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
                    obj.d = new hs3(719, 575, 0, 719, 0, 575);
                    obj.e = new gs3(0, new int[]{0, -1, -16777216, -8421505}, xq2.i(), xq2.k());
                    obj.f = new ms3(H, H2);
                    return obj;
                case 1:
                    return new u8a((byte) 12);
                case 2:
                    return new kj4((byte) 19);
                case 3:
                    return new zhc((byte) 2);
                case 4:
                    return new p7c(list);
                case 5:
                    return new ypa(list);
                case 6:
                    return new fnc(list);
                case 7:
                    return new eeb();
                case '\b':
                    return new p6c();
            }
        }
        lq5.j(c00.i("Unsupported MIME type: ", str));
        return null;
    }

    @Override
    public final boolean s0(wb2 wb2Var, TLRPC.PollAnswer pollAnswer) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void t(boolean z, float[] fArr) {
        p40 p40Var = aob.d5;
        if (p40Var == null) {
            p40Var = new p40();
            aob.d5 = p40Var;
        }
        p40Var.d(z, fArr);
    }

    @Override
    public final void t1(r47 r47Var, String str, String str2, String str3, String str4, int i, int i2) {
        byte b2 = this.a;
    }

    @Override
    public final String u(long j) {
        byte b2 = this.a;
        return null;
    }

    @Override
    public final void u0(wb2 wb2Var, long j) {
        byte b2 = this.a;
    }

    @Override
    public final void u1(wb2 wb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        byte b2 = this.a;
        m01.u(wb2Var.getContext(), str);
    }

    @Override
    public final void v(wb2 wb2Var, float f2, float f3) {
        byte b2 = this.a;
    }

    @Override
    public final void v1(wb2 wb2Var) {
        byte b2 = this.a;
    }

    @Override
    public final boolean w0(wb2 wb2Var) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final boolean w1() {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final int x(ko4 ko4Var) {
        if (ko4Var.x != null) {
            return 1;
        }
        return 0;
    }

    @Override
    public final int x0() {
        return 0;
    }

    @Override
    public final int x1() {
        return 0;
    }

    @Override
    public final int y(ko4 ko4Var) {
        String str = ko4Var.t;
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
        lq5.j(c00.i("Unsupported MIME type: ", str));
        return 0;
    }

    @Override
    public final boolean y0(long j) {
        byte b2 = this.a;
        return false;
    }

    @Override
    public final void y1(wb2 wb2Var, iq0 iq0Var) {
        byte b2 = this.a;
    }

    @Override
    public final void z(wb2 wb2Var, TLRPC.User user, TLRPC.Document document, String str) {
        byte b2 = this.a;
    }

    @Override
    public final void z1() {
        byte b2 = this.a;
    }

    private final void E0() {
    }

    private final void E3() {
    }

    private final void F3() {
    }

    private final void I3() {
    }

    private final void J3() {
    }

    private final void M3() {
    }

    private final void N3() {
    }

    private final void S3() {
    }

    private final void T3() {
    }

    private final void U2() {
    }

    private final void V2() {
    }

    private final void e0() {
    }

    private final void f0() {
    }

    private final void u2() {
    }

    private final void v2() {
    }

    private final void z0() {
    }

    @Override
    public final void a() {
    }

    @Override
    public final void release() {
    }

    private final void D1(wb2 wb2Var) {
    }

    private final void E1(wb2 wb2Var) {
    }

    private final void E2(wb2 wb2Var) {
    }

    private final void F0(wb2 wb2Var) {
    }

    private final void F2(wb2 wb2Var) {
    }

    private final void H0(wb2 wb2Var) {
    }

    private final void K2(wb2 wb2Var) {
    }

    private final void K3(int i) {
    }

    private final void L2(wb2 wb2Var) {
    }

    private final void L3(int i) {
    }

    private final void M2(wb2 wb2Var) {
    }

    private final void N2(wb2 wb2Var) {
    }

    private final void O2(wb2 wb2Var) {
    }

    private final void P1(wb2 wb2Var) {
    }

    private final void P2(wb2 wb2Var) {
    }

    private final void P3(r47 r47Var) {
    }

    private final void Q3(r47 r47Var) {
    }

    private final void R0(wb2 wb2Var) {
    }

    private final void S0(wb2 wb2Var) {
    }

    private final void S1(wb2 wb2Var) {
    }

    private final void S2(wb2 wb2Var) {
    }

    private final void T2(wb2 wb2Var) {
    }

    private final void b1(wb2 wb2Var) {
    }

    private final void c3(String str) {
    }

    private final void d1(wb2 wb2Var) {
    }

    private final void d3(String str) {
    }

    private final void e1(o47 o47Var) {
    }

    private final void g1(o47 o47Var) {
    }

    private final void g2(wb2 wb2Var) {
    }

    private final void i0(wb2 wb2Var) {
    }

    private final void i3(wb2 wb2Var) {
    }

    private final void j3(wb2 wb2Var) {
    }

    private final void m3(wb2 wb2Var) {
    }

    private final void n2(wb2 wb2Var) {
    }

    private final void n3(wb2 wb2Var) {
    }

    private final void o2(wb2 wb2Var) {
    }

    private final void o3(r47 r47Var) {
    }

    private final void p0(wb2 wb2Var) {
    }

    private final void p1(wb2 wb2Var) {
    }

    private final void p2(wb2 wb2Var) {
    }

    private final void p3(r47 r47Var) {
    }

    private final void q3(wb2 wb2Var) {
    }

    private final void r3(wb2 wb2Var) {
    }

    private final void s1(wb2 wb2Var) {
    }

    private final void t0(wb2 wb2Var) {
    }

    private final void u3(wb2 wb2Var) {
    }

    private final void v0(wb2 wb2Var) {
    }

    private final void v3(wb2 wb2Var) {
    }

    private final void A3(wb2 wb2Var, boolean z) {
    }

    private final void B1(wb2 wb2Var, iq0 iq0Var) {
    }

    private final void C1(wb2 wb2Var, iq0 iq0Var) {
    }

    private final void C3(wb2 wb2Var, boolean z) {
    }

    private final void G2(String str, String str2) {
    }

    private final void H1(wb2 wb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void H2(String str, String str2) {
    }

    private final void L0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void O0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void O1(wb2 wb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void R(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void V(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void Z1(wb2 wb2Var, int i) {
    }

    private final void b2(wb2 wb2Var, int i) {
    }

    private final void c2(wb2 wb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void e3(wb2 wb2Var, long j) {
    }

    private final void f2(wb2 wb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void f3(wb2 wb2Var, long j) {
    }

    private final void s2(wb2 wb2Var, int i) {
    }

    private final void s3(wb2 wb2Var, q38 q38Var) {
    }

    private final void t2(wb2 wb2Var, int i) {
    }

    private final void t3(wb2 wb2Var, q38 q38Var) {
    }

    private final void w3(wb2 wb2Var, boolean z) {
    }

    private final void y3(wb2 wb2Var, boolean z) {
    }

    @Override
    public final void w(Looper looper, ig8 ig8Var) {
    }

    private final void B3(wb2 wb2Var, boolean z, boolean z2) {
    }

    private final void C(wb2 wb2Var, float f2, float f3) {
    }

    private final void D(wb2 wb2Var, float f2, float f3) {
    }

    private final void D3(wb2 wb2Var, boolean z, boolean z2) {
    }

    private final void I2(wb2 wb2Var, TLRPC.Document document, RectF rectF) {
    }

    private final void J2(wb2 wb2Var, TLRPC.Document document, RectF rectF) {
    }

    private final void Q2(wb2 wb2Var, float f2, float f3) {
    }

    private final void R2(wb2 wb2Var, float f2, float f3) {
    }

    private final void W2(wb2 wb2Var, CharacterStyle characterStyle, boolean z) {
    }

    private final void X0(wb2 wb2Var, TLObject tLObject, boolean z) {
    }

    private final void X1(wb2 wb2Var, int i, int i2) {
    }

    private final void X2(wb2 wb2Var, CharacterStyle characterStyle, boolean z) {
    }

    private final void Y1(wb2 wb2Var, int i, int i2) {
    }

    private final void Z0(wb2 wb2Var, TLObject tLObject, boolean z) {
    }

    private final void k3(wb2 wb2Var, float f2, float f3) {
    }

    private final void l3(wb2 wb2Var, float f2, float f3) {
    }

    private final void w2(wb2 wb2Var, float f2, float f3) {
    }

    private final void x2(wb2 wb2Var, float f2, float f3) {
    }

    private final void x3(wb2 wb2Var, boolean z, boolean z2) {
    }

    private final void z3(wb2 wb2Var, boolean z, boolean z2) {
    }

    private final void Y2(wb2 wb2Var, TLRPC.User user, float f2, float f3) {
    }

    private final void Z2(wb2 wb2Var, TLRPC.User user, float f2, float f3) {
    }

    private final void a3(wb2 wb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void b3(wb2 wb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void q2(wb2 wb2Var, float f2, float f3, boolean z) {
    }

    private final void r2(wb2 wb2Var, float f2, float f3, boolean z) {
    }

    private final void y2(wb2 wb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    private final void z2(wb2 wb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    private final void A2(wb2 wb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    private final void B2(wb2 wb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    private final void C2(wb2 wb2Var, int i, float f2, float f3, boolean z) {
    }

    private final void D2(wb2 wb2Var, int i, float f2, float f3, boolean z) {
    }

    private final void g3(wb2 wb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    private final void h3(wb2 wb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    private final void T0(wb2 wb2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    private final void W0(wb2 wb2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    private final void G3(r47 r47Var, String str, String str2, String str3, String str4, int i, int i2) {
    }

    private final void H3(r47 r47Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
