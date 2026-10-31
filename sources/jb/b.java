package jb;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.View;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import b2.x;
import c3.b0;
import c3.k0;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import j$.util.Objects;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.c20;
import org.telegram.messenger.gj;
import org.telegram.messenger.jj;
import org.telegram.messenger.s2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.sf;
import org.telegram.ui.kn;
import org.telegram.ui.qs0;
import p2.t;
public final class b implements c3.q, fa.a, r9.d, OnFailureListener, n2.m, sf, l1, t, r0.q, Continuation, uf.a, vf.a, s0, y6.c, y2.i {
    public final int f9776a;

    public b(int i10) {
        this.f9776a = i10;
    }

    public static String A4(uc.c cVar) {
        String str = cVar.f50211a;
        if ("br".equals(str)) {
            return "\n";
        }
        if ("img".equals(str)) {
            String str2 = (String) cVar.a().get("alt");
            if (str2 != null && str2.length() != 0) {
                return str2;
            }
            return "￼";
        } else if ("iframe".equals(str)) {
            return " ";
        } else {
            return null;
        }
    }

    public static final CharSequence F4(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    @Override
    public void A(q1 q1Var) {
        int i10 = this.f9776a;
    }

    @Override
    public void A0(q1 q1Var, float f7, float f10) {
        int i10 = this.f9776a;
    }

    @Override
    public boolean A1(q1 q1Var, jj jjVar) {
        switch (this.f9776a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public n2.g B0(n2.j jVar, x xVar) {
        if (xVar.f2426w == null) {
            return null;
        }
        return new n2.n(new n2.f(6001, new Exception()));
    }

    @Override
    public void B1() {
        int i10 = this.f9776a;
    }

    @Override
    public void C0(q1 q1Var) {
        int i10 = this.f9776a;
    }

    @Override
    public void C1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f9776a;
    }

    @Override
    public void D0(q1 q1Var, boolean z10, boolean z11) {
        int i10 = this.f9776a;
    }

    @Override
    public void D1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f9776a;
    }

    @Override
    public p0 E0(Class cls, v1.b bVar) {
        return d(cls);
    }

    @Override
    public boolean E1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f9776a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public TLRPC.TL_channels_sendAsPeers F() {
        return null;
    }

    @Override
    public void F0(q1 q1Var) {
        int i10 = this.f9776a;
    }

    @Override
    public void F1(q1 q1Var, c20 c20Var) {
        int i10 = this.f9776a;
    }

    @Override
    public void G(q1 q1Var, s2 s2Var) {
        int i10 = this.f9776a;
    }

    @Override
    public void G1(b0 b0Var) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void H(q1 q1Var) {
        int i10 = this.f9776a;
    }

    @Override
    public int H0() {
        return 0;
    }

    @Override
    public qs0 H1() {
        switch (this.f9776a) {
            case 15:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean I0(long j10) {
        switch (this.f9776a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public k0 I1(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void J(gj gjVar) {
        int i10 = this.f9776a;
    }

    @Override
    public void J0(q1 q1Var) {
        int i10 = this.f9776a;
    }

    @Override
    public void J1(String str, String str2) {
        int i10 = this.f9776a;
    }

    @Override
    public Object K(bh.d dVar) {
        return new d(dVar.c(h.class));
    }

    @Override
    public void K0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f9776a;
    }

    @Override
    public boolean K1(long j10) {
        switch (this.f9776a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void L(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            vf.a.A.L(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 > i11) {
            vf.a.f50812z.L(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 == i11) {
            shortBuffer2.put(shortBuffer);
        } else {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
    }

    @Override
    public void L0(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f9776a;
    }

    @Override
    public void L1(q1 q1Var, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f9776a;
    }

    @Override
    public void M(q1 q1Var) {
        int i10 = this.f9776a;
    }

    @Override
    public boolean M0(q1 q1Var, boolean z10) {
        switch (this.f9776a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public y2.n M1() {
        return new p2.s(p2.p.f44637n, null);
    }

    @Override
    public void N0(q1 q1Var) {
        int i10 = this.f9776a;
    }

    @Override
    public boolean N1(q1 q1Var, TLRPC.TodoItem todoItem) {
        switch (this.f9776a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void O(jj jjVar) {
        int i10 = this.f9776a;
    }

    @Override
    public void O0(q1 q1Var) {
        int i10 = this.f9776a;
    }

    @Override
    public boolean P(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f9776a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public TL_stories.StoryItem P0() {
        return null;
    }

    @Override
    public void P1(q1 q1Var) {
        int i10 = this.f9776a;
    }

    @Override
    public boolean Q() {
        switch (this.f9776a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Q0() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean R(q1 q1Var) {
        switch (this.f9776a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R0(long j10) {
        return false;
    }

    @Override
    public boolean S() {
        switch (this.f9776a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean S0(jj jjVar) {
        int i10 = this.f9776a;
        return f1.a(jjVar);
    }

    @Override
    public void S1(q1 q1Var, long j10) {
        int i10 = this.f9776a;
    }

    @Override
    public void T(q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
        int i11 = this.f9776a;
    }

    @Override
    public boolean T0() {
        return false;
    }

    @Override
    public void U(q1 q1Var) {
        int i10 = this.f9776a;
    }

    @Override
    public void U0() {
        int i10 = this.f9776a;
    }

    @Override
    public int W() {
        switch (this.f9776a) {
            case 15:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void W0(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f9776a;
    }

    @Override
    public boolean W1(q1 q1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f9776a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void X1(q1 q1Var) {
        int i10 = this.f9776a;
    }

    @Override
    public zg.a Y() {
        switch (this.f9776a) {
            case 15:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean Y0() {
        return false;
    }

    @Override
    public boolean Z(q1 q1Var) {
        switch (this.f9776a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Z0(q1 q1Var, TLRPC.Document document) {
        int i10 = this.f9776a;
    }

    @Override
    public void Z1() {
        int i10 = this.f9776a;
    }

    @Override
    public boolean a0(q1 q1Var, TLRPC.User user) {
        switch (this.f9776a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public y2.n a2(p2.p pVar, p2.m mVar) {
        return new p2.s(pVar, mVar);
    }

    @Override
    public void b() {
        synchronized (z2.b.f54545a) {
            Object obj = z2.b.f54546b;
            synchronized (obj) {
                if (z2.b.f54547c) {
                    return;
                }
                long a2 = z2.b.a();
                synchronized (obj) {
                    SystemClock.elapsedRealtime();
                    z2.b.d = a2;
                    z2.b.f54547c = true;
                }
            }
        }
    }

    @Override
    public kn b0() {
        return null;
    }

    @Override
    public void b2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
        int i10 = this.f9776a;
    }

    @Override
    public boolean c() {
        switch (this.f9776a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c0(int i10) {
        int i11 = this.f9776a;
    }

    @Override
    public void c1(q1 q1Var, int i10) {
        int i11 = this.f9776a;
    }

    @Override
    public boolean c2(int i10) {
        switch (this.f9776a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public p0 d(Class cls) {
        return new w1.b();
    }

    @Override
    public boolean d0() {
        switch (this.f9776a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void e0(q1 q1Var, float f7, float f10) {
        int i10 = this.f9776a;
    }

    @Override
    public void e2() {
        int i10 = this.f9776a;
    }

    @Override
    public boolean f() {
        switch (this.f9776a) {
            case 15:
                return true;
            default:
                return true;
        }
    }

    @Override
    public int f0(q1 q1Var) {
        switch (this.f9776a) {
            case 15:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void f1(q1 q1Var, float f7, float f10) {
        int i10 = this.f9776a;
    }

    @Override
    public void f2(q1 q1Var, int i10, int i11) {
        int i12 = this.f9776a;
    }

    @Override
    public void g0(q1 q1Var) {
        int i10 = this.f9776a;
    }

    @Override
    public l9 g2() {
        switch (this.f9776a) {
            case 15:
                return null;
            default:
                return null;
        }
    }

    @Override
    public String h(q1 q1Var) {
        switch (this.f9776a) {
            case 15:
                return null;
            default:
                return null;
        }
    }

    @Override
    public StackTraceElement[] h0(StackTraceElement[] stackTraceElementArr) {
        int i10;
        HashMap hashMap = new HashMap();
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[stackTraceElementArr.length];
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (i11 < stackTraceElementArr.length) {
            StackTraceElement stackTraceElement = stackTraceElementArr[i11];
            Integer num = (Integer) hashMap.get(stackTraceElement);
            if (num != null) {
                int intValue = num.intValue();
                int i14 = i11 - intValue;
                if (i11 + i14 <= stackTraceElementArr.length) {
                    for (int i15 = 0; i15 < i14; i15++) {
                        if (stackTraceElementArr[intValue + i15].equals(stackTraceElementArr[i11 + i15])) {
                        }
                    }
                    int intValue2 = i11 - num.intValue();
                    if (i13 < 10) {
                        System.arraycopy(stackTraceElementArr, i11, stackTraceElementArr2, i12, intValue2);
                        i12 += intValue2;
                        i13++;
                    }
                    i10 = (intValue2 - 1) + i11;
                    hashMap.put(stackTraceElement, Integer.valueOf(i11));
                    i11 = i10 + 1;
                }
            }
            stackTraceElementArr2[i12] = stackTraceElementArr[i11];
            i12++;
            i13 = 1;
            i10 = i11;
            hashMap.put(stackTraceElement, Integer.valueOf(i11));
            i11 = i10 + 1;
        }
        StackTraceElement[] stackTraceElementArr3 = new StackTraceElement[i12];
        System.arraycopy(stackTraceElementArr2, 0, stackTraceElementArr3, 0, i12);
        if (i12 < stackTraceElementArr.length) {
            return stackTraceElementArr3;
        }
        return stackTraceElementArr;
    }

    @Override
    public boolean h1() {
        return false;
    }

    @Override
    public void i(q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f9776a;
    }

    @Override
    public boolean i0() {
        switch (this.f9776a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void j() {
        int i10 = this.f9776a;
    }

    @Override
    public boolean j1() {
        switch (this.f9776a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean k0() {
        return true;
    }

    @Override
    public boolean k1(q1 q1Var, int i10) {
        switch (this.f9776a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void l(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f9776a;
    }

    @Override
    public void l0(String str) {
        int i10 = this.f9776a;
    }

    @Override
    public void l1(q1 q1Var, boolean z10, boolean z11) {
        int i10 = this.f9776a;
    }

    @Override
    public boolean m() {
        return false;
    }

    @Override
    public boolean m0(o5 o5Var) {
        switch (this.f9776a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void m1(q1 q1Var) {
        int i10 = this.f9776a;
    }

    @Override
    public void n(q1 q1Var) {
        int i10 = this.f9776a;
    }

    @Override
    public void n1(q1 q1Var, boolean z10) {
        int i10 = this.f9776a;
    }

    @Override
    public void o() {
        int i10 = this.f9776a;
    }

    @Override
    public void o0(q1 q1Var, float f7, float f10) {
        int i10 = this.f9776a;
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override
    public n2.l p(n2.j jVar, x xVar) {
        return n2.l.f13464l;
    }

    @Override
    public int p0(Context context, String str, boolean z10) {
        return y6.e.d(context, str, z10);
    }

    @Override
    public boolean p1(q1 q1Var, TLRPC.Chat chat) {
        switch (this.f9776a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void q(q1 q1Var) {
        int i10 = this.f9776a;
    }

    @Override
    public void q1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f9776a;
    }

    @Override
    public int r() {
        return 0;
    }

    @Override
    public void r0(q1 q1Var, TLRPC.User user, float f7, float f10) {
        int i10 = this.f9776a;
    }

    @Override
    public boolean r1() {
        switch (this.f9776a) {
            case 15:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void s() {
        int i10 = this.f9776a;
    }

    @Override
    public void s0(q1 q1Var, float f7, float f10, boolean z10) {
        int i10 = this.f9776a;
    }

    @Override
    public void s1(q1 q1Var, int i10) {
        int i11 = this.f9776a;
    }

    @Override
    public void t(q1 q1Var) {
        int i10 = this.f9776a;
    }

    @Override
    public int t0(x xVar) {
        if (xVar.f2426w != null) {
            return 1;
        }
        return 0;
    }

    @Override
    public Object then(Task task) {
        if (!task.isSuccessful()) {
            Log.e("FirebaseCrashlytics", "Error fetching settings.", task.getException());
            return null;
        }
        return null;
    }

    @Override
    public TLRPC.Peer u() {
        return null;
    }

    @Override
    public void u0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        shortBuffer2.put(shortBuffer);
    }

    @Override
    public void u1(q1 q1Var) {
        int i10 = this.f9776a;
    }

    @Override
    public void v(q1 q1Var) {
        int i10 = this.f9776a;
    }

    @Override
    public void v1(jj jjVar) {
        int i10 = this.f9776a;
    }

    @Override
    public boolean w0(jj jjVar) {
        switch (this.f9776a) {
            case 15:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void w1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f9776a) {
            case 15:
            default:
                gf.f.r(q1Var.getContext(), str);
                return;
        }
    }

    @Override
    public String x(long j10) {
        switch (this.f9776a) {
            case 15:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void x0(q1 q1Var) {
        int i10 = this.f9776a;
    }

    @Override
    public int x1(Context context, String str) {
        return y6.e.a(context, str);
    }

    @Override
    public void y0() {
        int i10 = this.f9776a;
    }

    @Override
    public CharacterStyle y1(q1 q1Var) {
        switch (this.f9776a) {
            case 15:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void z(q1 q1Var) {
        int i10 = this.f9776a;
    }

    @Override
    public void z0(q1 q1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f9776a;
    }

    @Override
    public void z1(jj jjVar, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f9776a;
    }

    public b(Context context, int i10) {
        this.f9776a = i10;
    }

    private final void D4() {
    }

    private final void E4() {
    }

    private final void G3() {
    }

    private final void H3() {
    }

    private final void g3() {
    }

    private final void h3() {
    }

    private final void m2() {
    }

    private final void n2() {
    }

    private final void q4() {
    }

    private final void r4() {
    }

    private final void s2() {
    }

    private final void t2() {
    }

    private final void u4() {
    }

    private final void v4() {
    }

    private final void y4() {
    }

    private final void z4() {
    }

    @Override
    public void C() {
    }

    @Override
    public void D() {
    }

    @Override
    public void N() {
    }

    @Override
    public void O1() {
    }

    @Override
    public void R1() {
    }

    @Override
    public void T1() {
    }

    @Override
    public void X() {
    }

    @Override
    public void X0() {
    }

    @Override
    public void Y1() {
    }

    @Override
    public void a() {
    }

    @Override
    public void a1() {
    }

    @Override
    public void b1() {
    }

    @Override
    public void d1() {
    }

    @Override
    public void d2() {
    }

    @Override
    public void e() {
    }

    @Override
    public void h2() {
    }

    @Override
    public void i1() {
    }

    @Override
    public void j0() {
    }

    @Override
    public void k() {
    }

    @Override
    public void n0() {
    }

    @Override
    public void o1() {
    }

    @Override
    public void q0() {
    }

    @Override
    public void release() {
    }

    @Override
    public void v0() {
    }

    @Override
    public void w() {
    }

    private final void A3(q1 q1Var) {
    }

    private final void B3(q1 q1Var) {
    }

    private final void B4(jj jjVar) {
    }

    private final void C4(jj jjVar) {
    }

    private final void E2(q1 q1Var) {
    }

    private final void E3(q1 q1Var) {
    }

    private final void F2(q1 q1Var) {
    }

    private final void F3(q1 q1Var) {
    }

    private final void G2(gj gjVar) {
    }

    private final void H2(gj gjVar) {
    }

    private final void I2(q1 q1Var) {
    }

    private final void J2(q1 q1Var) {
    }

    private final void M2(q1 q1Var) {
    }

    private final void N2(q1 q1Var) {
    }

    private final void O3(String str) {
    }

    private final void P3(String str) {
    }

    private final void Q2(q1 q1Var) {
    }

    private final void R2(q1 q1Var) {
    }

    private final void U3(q1 q1Var) {
    }

    private final void V3(q1 q1Var) {
    }

    private final void Y2(q1 q1Var) {
    }

    private final void Y3(q1 q1Var) {
    }

    private final void Z2(q1 q1Var) {
    }

    private final void Z3(q1 q1Var) {
    }

    private final void a3(q1 q1Var) {
    }

    private final void a4(jj jjVar) {
    }

    private final void b3(q1 q1Var) {
    }

    private final void b4(jj jjVar) {
    }

    private final void c4(q1 q1Var) {
    }

    private final void d4(q1 q1Var) {
    }

    private final void g4(q1 q1Var) {
    }

    private final void h4(q1 q1Var) {
    }

    private final void m4(q1 q1Var) {
    }

    private final void o2(q1 q1Var) {
    }

    private final void o4(q1 q1Var) {
    }

    private final void p2(q1 q1Var) {
    }

    private final void q2(q1 q1Var) {
    }

    private final void q3(q1 q1Var) {
    }

    private final void r2(q1 q1Var) {
    }

    private final void r3(q1 q1Var) {
    }

    private final void u2(q1 q1Var) {
    }

    private final void v2(q1 q1Var) {
    }

    private final void w3(q1 q1Var) {
    }

    private final void w4(int i10) {
    }

    private final void x3(q1 q1Var) {
    }

    private final void x4(int i10) {
    }

    private final void y2(q1 q1Var) {
    }

    private final void y3(q1 q1Var) {
    }

    private final void z2(q1 q1Var) {
    }

    private final void z3(q1 q1Var) {
    }

    @Override
    public void B(boolean z10) {
    }

    @Override
    public void G0(int i10) {
    }

    @Override
    public void Q1(int i10) {
    }

    @Override
    public void U1(boolean z10) {
    }

    @Override
    public void V(boolean z10) {
    }

    @Override
    public void g1(CharSequence charSequence) {
    }

    @Override
    public void y(float f7) {
    }

    private final void K2(q1 q1Var, s2 s2Var) {
    }

    private final void L2(q1 q1Var, s2 s2Var) {
    }

    private final void O2(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void P2(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void Q3(q1 q1Var, long j10) {
    }

    private final void R3(q1 q1Var, long j10) {
    }

    private final void U2(q1 q1Var, int i10) {
    }

    private final void V2(q1 q1Var, int i10) {
    }

    private final void W2(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void X2(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void e3(q1 q1Var, int i10) {
    }

    private final void e4(q1 q1Var, c20 c20Var) {
    }

    private final void f3(q1 q1Var, int i10) {
    }

    private final void f4(q1 q1Var, c20 c20Var) {
    }

    private final void i4(q1 q1Var, boolean z10) {
    }

    private final void k2(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void k4(q1 q1Var, boolean z10) {
    }

    private final void l2(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void s3(String str, String str2) {
    }

    private final void t3(String str, String str2) {
    }

    private final void u3(q1 q1Var, TLRPC.Document document) {
    }

    private final void v3(q1 q1Var, TLRPC.Document document) {
    }

    private final void w2(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void x2(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void I(float f7, int i10) {
    }

    @Override
    public void g(Looper looper, j2.l lVar) {
    }

    private final void C2(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    private final void C3(q1 q1Var, float f7, float f10) {
    }

    private final void D2(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    private final void D3(q1 q1Var, float f7, float f10) {
    }

    private final void I3(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void J3(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void S2(q1 q1Var, int i10, int i11) {
    }

    private final void T2(q1 q1Var, int i10, int i11) {
    }

    private final void W3(q1 q1Var, float f7, float f10) {
    }

    private final void X3(q1 q1Var, float f7, float f10) {
    }

    private final void i2(q1 q1Var, float f7, float f10) {
    }

    private final void i3(q1 q1Var, float f7, float f10) {
    }

    private final void j2(q1 q1Var, float f7, float f10) {
    }

    private final void j3(q1 q1Var, float f7, float f10) {
    }

    private final void j4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void l4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void n4(q1 q1Var, boolean z10, boolean z11) {
    }

    private final void p4(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void V0(CharSequence charSequence, boolean z10, boolean z11) {
    }

    @Override
    public void e1(View view, CharSequence charSequence, boolean z10) {
    }

    @Override
    public int t1(int i10, int i11, int i12) {
        return i10;
    }

    private final void K3(q1 q1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void L3(q1 q1Var, TLRPC.User user, float f7, float f10) {
    }

    private final void M3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void N3(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void c3(q1 q1Var, float f7, float f10, boolean z10) {
    }

    private final void d3(q1 q1Var, float f7, float f10, boolean z10) {
    }

    private final void k3(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void l3(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void onScrollLimit(int i10, int i11, int i12, boolean z10) {
    }

    @Override
    public void onScrollProgress(int i10, int i11, int i12, int i13) {
    }

    private final void S3(q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void T3(q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void m3(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void n3(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    private final void o3(q1 q1Var, int i10, float f7, float f10, boolean z10) {
    }

    private final void p3(q1 q1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void E(CharSequence charSequence, boolean z10, int i10, int i11, long j10) {
    }

    private final void A2(q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    private final void B2(q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void V1(int i10, int i11, int i12, long j10, long j11, boolean z10) {
    }

    private final void s4(jj jjVar, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void t4(jj jjVar, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
