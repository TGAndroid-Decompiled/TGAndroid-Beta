package ab;

import ag.j2;
import android.content.Context;
import android.os.Looper;
import android.text.style.CharacterStyle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import f5.d0;
import j$.util.concurrent.ConcurrentHashMap;
import j3.t0;
import j7.l1;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.TreeSet;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.hl;
import org.telegram.ui.Components.ig;
import org.telegram.ui.Components.li;
import org.telegram.ui.Components.ob;
import org.telegram.ui.Components.pb;
import org.telegram.ui.Components.qb;
import org.telegram.ui.Components.rb;
import org.telegram.ui.Components.y5;
import org.telegram.ui.Components.za;
import org.telegram.ui.Components.zg;
import org.telegram.ui.lu0;
public final class b implements a4.m, a9.e, Continuation, hf.a, mf.a, n3.i, nf.a, o3.m, qb, j1, pa.m, li, x3.g, z5.k {
    public static b f302b;
    public final int f303a;

    public b(int i10) {
        this.f303a = i10;
    }

    public static Calendar A3() {
        if (f302b == null) {
            f302b = new b(8);
        }
        f302b.getClass();
        return Calendar.getInstance();
    }

    @Override
    public void A(s1 s1Var) {
        int i10 = this.f303a;
    }

    @Override
    public void A0(s1 s1Var, TLObject tLObject, boolean z10) {
        int i10 = this.f303a;
    }

    @Override
    public boolean A1() {
        switch (this.f303a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void B0(s1 s1Var, float f9, float f10) {
        int i10 = this.f303a;
    }

    @Override
    public void C(s1 s1Var) {
        int i10 = this.f303a;
    }

    @Override
    public void C1(s1 s1Var) {
        int i10 = this.f303a;
    }

    @Override
    public void D0(s1 s1Var) {
        int i10 = this.f303a;
    }

    @Override
    public void D1(o3.t tVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void E(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f303a;
    }

    @Override
    public void F(s1 s1Var) {
        int i10 = this.f303a;
    }

    @Override
    public void F0(s1 s1Var) {
        int i10 = this.f303a;
    }

    @Override
    public void F1(s1 s1Var, boolean z10) {
        int i10 = this.f303a;
    }

    @Override
    public void H(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f303a;
    }

    @Override
    public boolean H0(Context context) {
        return false;
    }

    @Override
    public boolean H1(s1 s1Var, TLRPC.Chat chat) {
        switch (this.f303a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public Object I0(a5.j jVar) {
        switch (this.f303a) {
            case 2:
                return new l((Context) jVar.a(Context.class));
            case 25:
                return new i();
            default:
                h hVar = (h) jVar.a(h.class);
                synchronized (f7.t.class) {
                    byte b10 = (byte) (((byte) 1) | 2);
                    if (b10 == 3) {
                        f7.t.a(new Object());
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
                return new ya.a(0);
        }
    }

    @Override
    public void I1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f303a;
    }

    @Override
    public void J0(s1 s1Var) {
        int i10 = this.f303a;
    }

    @Override
    public boolean J1() {
        switch (this.f303a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void K(s1 s1Var) {
        int i10 = this.f303a;
    }

    @Override
    public void L(int i10, s1 s1Var) {
        int i11 = this.f303a;
    }

    @Override
    public void L1(s1 s1Var) {
        int i10 = this.f303a;
    }

    @Override
    public boolean M0(long j10) {
        switch (this.f303a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int M1(int i10, int i11, int i12) {
        mf.a aVar;
        if (i11 == 6) {
            aVar = mf.a.f17016m;
        } else if (i11 > i12) {
            aVar = mf.a.f17013j;
        } else if (i11 < i12) {
            aVar = mf.a.f17014k;
        } else {
            aVar = mf.a.f17015l;
        }
        return aVar.M1(i10, i11, i12);
    }

    @Override
    public void N(MessageObject messageObject) {
        int i10 = this.f303a;
    }

    @Override
    public void N0(s1 s1Var) {
        int i10 = this.f303a;
    }

    @Override
    public void N1(MessageObject messageObject) {
        int i10 = this.f303a;
    }

    @Override
    public boolean O(s1 s1Var, TLRPC.TodoItem todoItem, boolean z10) {
        switch (this.f303a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void O1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        switch (this.f303a) {
            case 18:
            default:
                ye.d.s(s1Var.getContext(), str);
                return;
        }
    }

    @Override
    public boolean P() {
        switch (this.f303a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void P0(int i10, s1 s1Var) {
        int i11 = this.f303a;
    }

    @Override
    public CharacterStyle P1(s1 s1Var) {
        switch (this.f303a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean Q(s1 s1Var) {
        switch (this.f303a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Q1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f303a;
    }

    @Override
    public boolean R() {
        switch (this.f303a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void R0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f303a;
    }

    @Override
    public boolean R1(s1 s1Var, MessageObject messageObject) {
        switch (this.f303a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void S(s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
        int i11 = this.f303a;
    }

    @Override
    public void S0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        mf.a aVar;
        if (i10 == 6) {
            aVar = mf.a.f17016m;
        } else if (i10 > i11) {
            aVar = mf.a.f17013j;
        } else if (i10 < i11) {
            aVar = mf.a.f17014k;
        } else {
            aVar = mf.a.f17015l;
        }
        aVar.S0(shortBuffer, i10, shortBuffer2, i11);
    }

    @Override
    public void S1() {
        int i10 = this.f303a;
    }

    @Override
    public void T(s1 s1Var) {
        int i10 = this.f303a;
    }

    @Override
    public boolean T1() {
        return false;
    }

    @Override
    public void U1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f303a;
    }

    @Override
    public int V() {
        switch (this.f303a) {
            case 18:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void V0(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
        int i10 = this.f303a;
    }

    @Override
    public void V1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f303a;
    }

    @Override
    public boolean W0(s1 s1Var, boolean z10) {
        switch (this.f303a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean W1(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f303a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public sg.a X() {
        switch (this.f303a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void X0(s1 s1Var) {
        int i10 = this.f303a;
    }

    @Override
    public boolean Y(s1 s1Var) {
        switch (this.f303a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Y0(s1 s1Var) {
        int i10 = this.f303a;
    }

    @Override
    public lu0 Y1() {
        switch (this.f303a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean Z(s1 s1Var, TLRPC.User user) {
        switch (this.f303a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public o3.w Z1(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean a0() {
        return false;
    }

    @Override
    public boolean a2(long j10) {
        switch (this.f303a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int b(t0 t0Var) {
        if (t0Var.E != null) {
            return 1;
        }
        return 0;
    }

    @Override
    public void b2(s1 s1Var, int i10, float f9, float f10, boolean z10) {
        int i11 = this.f303a;
    }

    @Override
    public boolean c() {
        switch (this.f303a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void c0(int i10) {
        int i11 = this.f303a;
    }

    @Override
    public boolean c1(int i10, s1 s1Var) {
        switch (this.f303a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c2(s1 s1Var, TLRPC.TodoItem todoItem) {
        switch (this.f303a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean d(Context context) {
        return false;
    }

    @Override
    public boolean d0() {
        switch (this.f303a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void e(rb rbVar, bb bbVar, za zaVar, cb cbVar) {
        o1.k kVar = new o1.k(rbVar, rb.IN_OUT_OFFSET_Y, rbVar.getHeight());
        kVar.f19045u.a(0.8f);
        kVar.f19045u.b(400.0f);
        kVar.a(new db(zaVar, 1));
        kVar.b(new ob(cbVar, rbVar, 0));
        kVar.f();
        bbVar.run();
    }

    @Override
    public void e0(s1 s1Var, float f9, float f10) {
        int i10 = this.f303a;
    }

    @Override
    public void e1() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void e2(s1 s1Var) {
        int i10 = this.f303a;
    }

    @Override
    public boolean f() {
        switch (this.f303a) {
            case 18:
                return true;
            default:
                return true;
        }
    }

    @Override
    public int f0(s1 s1Var) {
        switch (this.f303a) {
            case 18:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public String g(s1 s1Var) {
        switch (this.f303a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void g0(s1 s1Var) {
        int i10 = this.f303a;
    }

    @Override
    public void g2(s1 s1Var, long j10) {
        int i10 = this.f303a;
    }

    @Override
    public n3.e h(j2 j2Var, t0 t0Var) {
        if (t0Var.E == null) {
            return null;
        }
        return new m5.i(new n3.d(new Exception(), 6001), 25);
    }

    @Override
    public boolean h1(MessageObject messageObject) {
        int i10 = this.f303a;
        return org.telegram.ui.b.a(messageObject);
    }

    @Override
    public long i(o3.l lVar) {
        return -1L;
    }

    @Override
    public void j(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f303a;
    }

    @Override
    public boolean j0() {
        switch (this.f303a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void j2(s1 s1Var, hh.f fVar) {
        int i10 = this.f303a;
    }

    @Override
    public void k() {
        int i10 = this.f303a;
    }

    @Override
    public void k1() {
        int i10 = this.f303a;
    }

    @Override
    public Object l(com.google.android.gms.common.api.q qVar) {
        return null;
    }

    @Override
    public n3.h m(j2 j2Var, t0 t0Var) {
        return n3.h.f17105a;
    }

    @Override
    public void m0(String str) {
        int i10 = this.f303a;
    }

    @Override
    public void m1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f303a;
    }

    @Override
    public boolean m2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f303a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void n(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f303a;
    }

    @Override
    public boolean n0(y5 y5Var) {
        switch (this.f303a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void n2(s1 s1Var) {
        int i10 = this.f303a;
    }

    @Override
    public void o(s1 s1Var) {
        int i10 = this.f303a;
    }

    @Override
    public void p() {
        int i10 = this.f303a;
    }

    @Override
    public void p0(s1 s1Var, float f9, float f10) {
        int i10 = this.f303a;
    }

    @Override
    public void p1(s1 s1Var, TLRPC.Document document) {
        int i10 = this.f303a;
    }

    @Override
    public Object p2() {
        switch (this.f303a) {
            case 20:
                return new TreeSet();
            default:
                return new ConcurrentHashMap();
        }
    }

    @Override
    public void q2() {
        int i10 = this.f303a;
    }

    @Override
    public void r(rb rbVar, bb bbVar, ig igVar, hl hlVar) {
        rbVar.setInOutOffset(rbVar.getMeasuredHeight());
        hlVar.accept(Float.valueOf(rbVar.getTranslationY()));
        o1.k kVar = new o1.k(rbVar, rb.IN_OUT_OFFSET_Y, 0.0f);
        kVar.f19045u.a(0.8f);
        kVar.f19045u.b(400.0f);
        kVar.a(new pb(0, rbVar, igVar));
        kVar.b(new ob(hlVar, rbVar, 1));
        kVar.f();
        bbVar.run();
    }

    @Override
    public void r0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 >= i11) {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalArgumentException(l1.k(i12, "Illegal use of DownsampleAudioResampler. Channels:"));
            }
            int remaining = shortBuffer.remaining() / i12;
            int ceil = (int) Math.ceil((i11 / i10) * remaining);
            int i13 = remaining - ceil;
            float f9 = ceil;
            float f10 = f9 / f9;
            float f11 = i13;
            float f12 = f11 / f11;
            while (ceil > 0 && i13 > 0) {
                if (f10 >= f12) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i12 == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    ceil--;
                    f10 = ceil / f9;
                } else {
                    shortBuffer.position(shortBuffer.position() + i12);
                    i13--;
                    f12 = i13 / f11;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Illegal use of DownsampleAudioResampler");
    }

    @Override
    public void s(s1 s1Var) {
        int i10 = this.f303a;
    }

    @Override
    public void s2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
        int i10 = this.f303a;
    }

    @Override
    public void t() {
        int i10 = this.f303a;
    }

    @Override
    public void t0(s1 s1Var, TLRPC.User user, float f9, float f10) {
        int i10 = this.f303a;
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
    public void u(s1 s1Var) {
        int i10 = this.f303a;
    }

    @Override
    public void u1(s1 s1Var, float f9, float f10) {
        int i10 = this.f303a;
    }

    @Override
    public boolean u2(int i10) {
        switch (this.f303a) {
            case 18:
                return false;
            default:
                return false;
        }
    }

    @Override
    public o3.t v() {
        return new o3.o(-9223372036854775807L);
    }

    @Override
    public void v0(s1 s1Var, float f9, float f10, boolean z10) {
        int i10 = this.f303a;
    }

    @Override
    public void w(s1 s1Var) {
        int i10 = this.f303a;
    }

    @Override
    public boolean w0(MessageObject messageObject) {
        switch (this.f303a) {
            case 18:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void w2() {
        int i10 = this.f303a;
    }

    @Override
    public a4.n x(a4.l lVar) {
        int i10 = d0.f6579a;
        if (i10 >= 23 && i10 >= 31) {
            int g10 = f5.o.g(lVar.f101c.B);
            f5.a.v("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + d0.B(g10));
            a4.b bVar = new a4.b(g10, 0);
            a4.b bVar2 = new a4.b(g10, 1);
            ?? obj = new Object();
            obj.f50824a = bVar;
            obj.f50825b = bVar2;
            return obj.x(lVar);
        }
        return new f7.v(1).x(lVar);
    }

    @Override
    public void x0(zg zgVar) {
        zgVar.run();
    }

    @Override
    public void x2(s1 s1Var, int i10, int i11) {
        int i12 = this.f303a;
    }

    @Override
    public String y(long j10) {
        switch (this.f303a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void y0(s1 s1Var) {
        int i10 = this.f303a;
    }

    @Override
    public l9 y2() {
        switch (this.f303a) {
            case 18:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void z0() {
        int i10 = this.f303a;
    }

    private final void B3() {
    }

    private final void C3() {
    }

    private final void F3() {
    }

    private final void G3() {
    }

    private final void J() {
    }

    private final void J3() {
    }

    private final void K3() {
    }

    private final void M() {
    }

    private final void N3() {
    }

    private final void O3() {
    }

    private final void S2() {
    }

    private final void T2() {
    }

    private final void i0() {
    }

    private final void k0() {
    }

    private final void l2() {
    }

    private final void o2() {
    }

    @Override
    public void L0() {
    }

    @Override
    public void a() {
    }

    @Override
    public void release() {
    }

    @Override
    public void u0() {
    }

    private final void C0(s1 s1Var) {
    }

    private final void E0(s1 s1Var) {
    }

    private final void E1(s1 s1Var) {
    }

    private final void E2(s1 s1Var) {
    }

    private final void F2(s1 s1Var) {
    }

    private final void G1(s1 s1Var) {
    }

    private final void H3(int i10) {
    }

    private final void I2(s1 s1Var) {
    }

    private final void I3(int i10) {
    }

    private final void J2(s1 s1Var) {
    }

    private final void K1(s1 s1Var) {
    }

    private final void K2(s1 s1Var) {
    }

    private final void L2(s1 s1Var) {
    }

    private final void L3(MessageObject messageObject) {
    }

    private final void M2(s1 s1Var) {
    }

    private final void M3(MessageObject messageObject) {
    }

    private final void N2(s1 s1Var) {
    }

    private final void Q2(s1 s1Var) {
    }

    private final void R2(s1 s1Var) {
    }

    private final void T0(s1 s1Var) {
    }

    private final void U(s1 s1Var) {
    }

    private final void W(s1 s1Var) {
    }

    private final void Z0(s1 s1Var) {
    }

    private final void a1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void a3(String str) {
    }

    private final void b0(s1 s1Var) {
    }

    private final void b1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void b3(String str) {
    }

    private final void d1(s1 s1Var) {
    }

    private final void d2(s1 s1Var) {
    }

    private final void f1(s1 s1Var) {
    }

    private final void g3(s1 s1Var) {
    }

    private final void h0(s1 s1Var) {
    }

    private final void h3(s1 s1Var) {
    }

    private final void k3(s1 s1Var) {
    }

    private final void l0(s1 s1Var) {
    }

    private final void l1(s1 s1Var) {
    }

    private final void l3(s1 s1Var) {
    }

    private final void m3(MessageObject messageObject) {
    }

    private final void n1(s1 s1Var) {
    }

    private final void n3(MessageObject messageObject) {
    }

    private final void o0(s1 s1Var) {
    }

    private final void o3(s1 s1Var) {
    }

    private final void p3(s1 s1Var) {
    }

    private final void r1(s1 s1Var) {
    }

    private final void s1(s1 s1Var) {
    }

    private final void s3(s1 s1Var) {
    }

    private final void t3(s1 s1Var) {
    }

    private final void u3(s1 s1Var) {
    }

    private final void w3(s1 s1Var) {
    }

    private final void y3(s1 s1Var) {
    }

    private final void z3(s1 s1Var) {
    }

    @Override
    public void U0(Object obj) {
    }

    @Override
    public void j1(TLRPC.User user) {
    }

    @Override
    public void z(long j10) {
    }

    private final void G(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void G2(s1 s1Var, TLRPC.Document document) {
    }

    private final void H2(s1 s1Var, TLRPC.Document document) {
    }

    private final void I(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void c3(s1 s1Var, long j10) {
    }

    private final void d3(s1 s1Var, long j10) {
    }

    private final void g1(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void i1(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void i2(int i10, s1 s1Var) {
    }

    private final void k2(int i10, s1 s1Var) {
    }

    private final void o1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void q0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void q1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void q3(s1 s1Var, hh.f fVar) {
    }

    private final void r3(s1 s1Var, hh.f fVar) {
    }

    private final void s0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void v3(s1 s1Var, boolean z10) {
    }

    private final void w1(int i10, s1 s1Var) {
    }

    private final void x1(int i10, s1 s1Var) {
    }

    private final void x3(s1 s1Var, boolean z10) {
    }

    private final void y1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void z1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void q(Looper looper, k3.k kVar) {
    }

    private final void B(s1 s1Var, float f9, float f10) {
    }

    private final void D(s1 s1Var, float f9, float f10) {
    }

    private final void O0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final void O2(s1 s1Var, float f9, float f10) {
    }

    private final void P2(s1 s1Var, float f9, float f10) {
    }

    private final void Q0(s1 s1Var, TLObject tLObject, boolean z10) {
    }

    private final void U2(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void V2(s1 s1Var, CharacterStyle characterStyle, boolean z10) {
    }

    private final void i3(s1 s1Var, float f9, float f10) {
    }

    private final void j3(s1 s1Var, float f9, float f10) {
    }

    private final void r2(s1 s1Var, float f9, float f10) {
    }

    private final void t1(s1 s1Var, int i10, int i11) {
    }

    private final void t2(s1 s1Var, float f9, float f10) {
    }

    private final void v1(s1 s1Var, int i10, int i11) {
    }

    private final void W2(s1 s1Var, TLRPC.User user, float f9, float f10) {
    }

    private final void X2(s1 s1Var, TLRPC.User user, float f9, float f10) {
    }

    private final void Y2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void Z2(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void f2(s1 s1Var, float f9, float f10, boolean z10) {
    }

    private final void h2(s1 s1Var, float f9, float f10, boolean z10) {
    }

    private final void v2(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void z2(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void A2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
    }

    private final void B2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f9, float f10) {
    }

    private final void C2(s1 s1Var, int i10, float f9, float f10, boolean z10) {
    }

    private final void D2(s1 s1Var, int i10, float f9, float f10, boolean z10) {
    }

    private final void e3(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void f3(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void G0(s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
    }

    private final void K0(s1 s1Var, TLRPC.Chat chat, int i10, float f9, float f10, boolean z10) {
    }

    private final void D3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void E3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override
    public void X1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override
    public void B1(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
