package nb;

import a7.e;
import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Looper;
import android.text.style.CharacterStyle;
import android.util.Log;
import b4.k;
import b8.ke;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import d2.v;
import j$.util.Objects;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.TreeMap;
import mb.h;
import org.telegram.messenger.g10;
import org.telegram.messenger.o2;
import org.telegram.messenger.wi;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.zh;
import org.telegram.ui.vq0;
import p2.f;
import p2.j;
import p2.l;
import p2.m;
import p2.n;
import sf.c;
import t9.d;
import tg.j1;
import v7.q;
import vi.g;
public final class a implements e, k, fg.a, zh, d, Continuation, OnFailureListener, hh.a, g51, l1, m, j1, g, x9.a {
    public static final a f20315b = new a(13);
    public static a f20316c;
    public final int f20317a;

    public a(int i3) {
        this.f20317a = i3;
    }

    public static final CharSequence D(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    @Override
    public p2.g A(j jVar, v vVar) {
        if (vVar.f8492w == null) {
            return null;
        }
        return new n(new f(6001, new Exception()));
    }

    @Override
    public void E1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        c.t(q1Var.getContext(), str);
    }

    @Override
    public int F() {
        return 0;
    }

    @Override
    public CharacterStyle G1(q1 q1Var) {
        return null;
    }

    @Override
    public void H0(ShortBuffer shortBuffer, int i3, ShortBuffer shortBuffer2, int i10) {
        fg.a aVar;
        if (i3 == 6) {
            aVar = fg.a.f11595q;
        } else if (i3 > i10) {
            aVar = fg.a.f11592m;
        } else if (i3 < i10) {
            aVar = fg.a.f11593o;
        } else {
            aVar = fg.a.f11594p;
        }
        aVar.H0(shortBuffer, i3, shortBuffer2, i10);
    }

    @Override
    public boolean I1(q1 q1Var, zi ziVar) {
        return false;
    }

    @Override
    public boolean J0(long j10) {
        return false;
    }

    @Override
    public boolean L1() {
        return false;
    }

    @Override
    public int M() {
        return 352321535;
    }

    @Override
    public float O() {
        return -1.0f;
    }

    @Override
    public boolean P0(q1 q1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean P1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean S(q1 q1Var) {
        return false;
    }

    @Override
    public vq0 S1() {
        return null;
    }

    @Override
    public boolean T() {
        return false;
    }

    @Override
    public boolean V1(long j10) {
        return false;
    }

    @Override
    public float W() {
        return -1.0f;
    }

    @Override
    public int X() {
        return 0;
    }

    @Override
    public boolean X0(zi ziVar) {
        return f1.a(ziVar);
    }

    @Override
    public void Y(ng ngVar) {
        ngVar.run();
    }

    @Override
    public boolean Y1(q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public kh.a Z() {
        return null;
    }

    @Override
    public float a0() {
        return 0.0f;
    }

    @Override
    public boolean b() {
        if (k6.A0().f31756i != null) {
            return true;
        }
        return false;
    }

    @Override
    public boolean b0(q1 q1Var) {
        return false;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public int c0() {
        return 0;
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public boolean d0(q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean e2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public l f(j jVar, v vVar) {
        return l.v;
    }

    @Override
    public boolean f0() {
        return false;
    }

    @Override
    public String g(q1 q1Var) {
        return null;
    }

    @Override
    public boolean g0() {
        return false;
    }

    @Override
    public b4.m h(v vVar) {
        throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
    }

    @Override
    public int j0(q1 q1Var) {
        return 0;
    }

    @Override
    public boolean l(v vVar) {
        return false;
    }

    @Override
    public a7.d l1(Context context, String str, a7.c cVar) {
        a7.d dVar = new a7.d();
        int e10 = cVar.e(context, str, true);
        dVar.f139b = e10;
        if (e10 != 0) {
            dVar.f140c = 1;
            return dVar;
        }
        int k10 = cVar.k(context, str);
        dVar.f138a = k10;
        if (k10 != 0) {
            dVar.f140c = -1;
        }
        return dVar;
    }

    @Override
    public boolean m0() {
        return false;
    }

    @Override
    public boolean m2(int i3) {
        return false;
    }

    @Override
    public boolean n1() {
        return false;
    }

    @Override
    public boolean o0(p5 p5Var) {
        return false;
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to request modules install request", exc);
    }

    @Override
    public boolean p1(q1 q1Var, int i3) {
        return false;
    }

    @Override
    public int q0(v vVar) {
        return 1;
    }

    @Override
    public Object q1(ke keVar) {
        switch (this.f20317a) {
            case 11:
                return new h();
            default:
                mb.g gVar = (mb.g) keVar.a(mb.g.class);
                synchronized (q.class) {
                    byte b10 = (byte) (((byte) 1) | 2);
                    if (b10 == 3) {
                        q.f(new Object());
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        if ((b10 & 1) == 0) {
                            sb2.append(" enableFirelog");
                        }
                        if ((b10 & 2) == 0) {
                            sb2.append(" firelogEventType");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
                    }
                }
                return new kb.a(0);
        }
    }

    @Override
    public i9 q2() {
        return null;
    }

    @Override
    public void r(boolean z10, float[] fArr) {
        k6.A0().e(z10, fArr);
    }

    @Override
    public void t(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override
    public Object then(Task task) {
        Intent intent = (Intent) ((Bundle) task.getResult()).getParcelable("notification_data");
        if (intent != null) {
            return new l6.a(intent);
        }
        return null;
    }

    @Override
    public int u(v vVar) {
        if (vVar.f8492w != null) {
            return 1;
        }
        return 0;
    }

    @Override
    public int u0() {
        return 0;
    }

    @Override
    public int v1(int i3, int i10, int i11) {
        fg.a aVar;
        if (i10 == 6) {
            aVar = fg.a.f11595q;
        } else if (i10 > i11) {
            aVar = fg.a.f11592m;
        } else if (i10 < i11) {
            aVar = fg.a.f11593o;
        } else {
            aVar = fg.a.f11594p;
        }
        return aVar.v1(i3, i10, i11);
    }

    @Override
    public int w0() {
        return 1711276032;
    }

    @Override
    public boolean w1(q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public int x() {
        return 872415231;
    }

    @Override
    public boolean x0(zi ziVar) {
        return true;
    }

    @Override
    public boolean y1() {
        return false;
    }

    @Override
    public String z(long j10) {
        return null;
    }

    public a() {
        this.f20317a = 16;
        new TreeMap(String.CASE_INSENSITIVE_ORDER).clear();
    }

    public a(Context context) {
        this.f20317a = 8;
    }

    @Override
    public void K1() {
    }

    @Override
    public void a() {
    }

    @Override
    public void c1() {
    }

    @Override
    public void h2() {
    }

    @Override
    public void j() {
    }

    @Override
    public void o() {
    }

    @Override
    public void o2() {
    }

    @Override
    public void q() {
    }

    @Override
    public void r0() {
    }

    @Override
    public void release() {
    }

    @Override
    public void v() {
    }

    @Override
    public void v0() {
    }

    @Override
    public void z0() {
    }

    @Override
    public void A1(q1 q1Var) {
    }

    @Override
    public void B(q1 q1Var) {
    }

    @Override
    public void C(q1 q1Var) {
    }

    @Override
    public void C1(zi ziVar) {
    }

    @Override
    public void D0(q1 q1Var) {
    }

    @Override
    public void G0(q1 q1Var) {
    }

    @Override
    public void I(q1 q1Var) {
    }

    @Override
    public void I0(Object obj) {
    }

    @Override
    public void J(wi wiVar) {
    }

    @Override
    public void K0(q1 q1Var) {
    }

    @Override
    public void N(q1 q1Var) {
    }

    @Override
    public void P(zi ziVar) {
    }

    @Override
    public void Q0(q1 q1Var) {
    }

    @Override
    public void S0(q1 q1Var) {
    }

    @Override
    public void V(q1 q1Var) {
    }

    @Override
    public void Z1(q1 q1Var) {
    }

    @Override
    public void a1(TLRPC.User user) {
    }

    @Override
    public void e0(int i3) {
    }

    @Override
    public void f2(q1 q1Var) {
    }

    @Override
    public void k0(q1 q1Var) {
    }

    @Override
    public void m(String str) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void p(q1 q1Var) {
    }

    @Override
    public void s(q1 q1Var) {
    }

    @Override
    public void t1(q1 q1Var) {
    }

    @Override
    public void w(q1 q1Var) {
    }

    @Override
    public void y(q1 q1Var) {
    }

    @Override
    public void y0(q1 q1Var) {
    }

    @Override
    public void H(q1 q1Var, o2 o2Var) {
    }

    @Override
    public void L0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void M1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void Q1(q1 q1Var, g10 g10Var) {
    }

    @Override
    public void U1(String str, String str2) {
    }

    @Override
    public void a2(q1 q1Var, long j10) {
    }

    @Override
    public void d1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void e(String str, Throwable th2) {
    }

    @Override
    public void f1(q1 q1Var, int i3) {
    }

    @Override
    public void k(Looper looper, l2.k kVar) {
    }

    @Override
    public void u1(q1 q1Var, boolean z10) {
    }

    @Override
    public void x1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void z1(q1 q1Var, int i3) {
    }

    @Override
    public void A0(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void E0(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void K(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public void N0(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void h0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void i1(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void p0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void p2(q1 q1Var, int i3, int i10) {
    }

    @Override
    public void r1(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void N1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i3) {
    }

    @Override
    public void s0(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void t0(q1 q1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void W1(q1 q1Var, int i3, float f10, float f11, boolean z10) {
    }

    @Override
    public void i(q1 q1Var, ArrayList arrayList, int i3, int i10, int i11) {
    }

    @Override
    public void i2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void o1(int i3, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
    }

    @Override
    public void U(q1 q1Var, TLRPC.Chat chat, int i3, float f10, float f11, boolean z10) {
    }

    @Override
    public void R1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i3, int i10, long j10, boolean z11, long j11) {
    }

    @Override
    public void H1(zi ziVar, String str, String str2, String str3, String str4, int i3, int i10) {
    }
}
