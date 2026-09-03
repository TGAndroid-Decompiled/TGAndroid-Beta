package db;

import android.content.Context;
import android.media.MediaDrmException;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import androidx.car.app.messaging.model.b;
import c9.f;
import d4.i;
import d4.j;
import d4.k;
import h5.d0;
import h5.o;
import j$.util.Objects;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.w;
import mb.d;
import o3.u;
import o3.v;
import org.json.JSONObject;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.kb;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.mb;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.wa;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.ya;
import org.telegram.ui.cv0;
import p9.c;
import r3.m;
import r3.s;
import ra.l;
public final class a implements b, j, h3.a, jf.a, w, nf.a, o3.w, of.a, mb, j1, c, q9.a, m, ra.m, qg.a, f {
    public static a f4295b;
    public static a f4296c;
    public final int f4297a;

    public a(int i10) {
        this.f4297a = i10;
    }

    public static Calendar F3() {
        if (f4296c == null) {
            f4296c = new a(9);
        }
        f4296c.getClass();
        return Calendar.getInstance();
    }

    public static short I3(short s6, short s9) {
        int i10;
        int i11 = s6 + 32768;
        int i12 = s9 + 32768;
        int i13 = 65535;
        if (i11 >= 32768 && i12 >= 32768) {
            i10 = (((i11 + i12) * 2) - ((i11 * i12) / 32768)) - 65535;
        } else {
            i10 = (i11 * i12) / 32768;
        }
        if (i10 != 65536) {
            i13 = i10;
        }
        return (short) (i13 - 32768);
    }

    public static String R3(mc.c cVar) {
        String str = cVar.f13895a;
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

    public static final CharSequence W3(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public static p9.b n0(cb.b bVar) {
        return new p9.b(System.currentTimeMillis() + 3600000, new c5.c(8), new d(true, false, false), 10.0d, 1.2d, 60);
    }

    @Override
    public void A(s1 s1Var) {
        int i10 = this.f4297a;
    }

    @Override
    public void A0(s1 s1Var, float f10, float f11, boolean z4) {
        int i10 = this.f4297a;
    }

    @Override
    public byte[] B() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override
    public boolean B0(MessageObject messageObject) {
        switch (this.f4297a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void B2() {
        int i10 = this.f4297a;
    }

    @Override
    public void C2(s1 s1Var, int i10, int i11) {
        int i12 = this.f4297a;
    }

    @Override
    public int D() {
        return 352321535;
    }

    @Override
    public void D0(s1 s1Var) {
        int i10 = this.f4297a;
    }

    @Override
    public m9 D2() {
        switch (this.f4297a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void E(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
        int i10 = this.f4297a;
    }

    @Override
    public void E0() {
        int i10 = this.f4297a;
    }

    @Override
    public void F(s1 s1Var) {
        int i10 = this.f4297a;
    }

    @Override
    public void F0(s1 s1Var, TLObject tLObject, boolean z4) {
        int i10 = this.f4297a;
    }

    @Override
    public boolean F1() {
        switch (this.f4297a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void G(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public void G0(s1 s1Var, float f10, float f11) {
        int i10 = this.f4297a;
    }

    @Override
    public void H1(s1 s1Var) {
        int i10 = this.f4297a;
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
        int i10 = this.f4297a;
    }

    @Override
    public void I0(s1 s1Var) {
        int i10 = this.f4297a;
    }

    @Override
    public void I1(s1 s1Var, boolean z4) {
        int i10 = this.f4297a;
    }

    @Override
    public void J(nb nbVar, wa waVar, fg fgVar, gl glVar) {
        nbVar.setInOutOffset(nbVar.getMeasuredHeight());
        glVar.accept(Float.valueOf(nbVar.getTranslationY()));
        o1.j jVar = new o1.j(nbVar, nb.IN_OUT_OFFSET_Y, 0.0f);
        jVar.f16178u.a(0.8f);
        jVar.f16178u.b(400.0f);
        jVar.a(new lb(0, nbVar, fgVar));
        jVar.b(new kb(glVar, nbVar, 1));
        jVar.f();
        waVar.run();
    }

    @Override
    public p9.b K(cb.b bVar, JSONObject jSONObject) {
        return n0(bVar);
    }

    @Override
    public void K0(s1 s1Var) {
        int i10 = this.f4297a;
    }

    @Override
    public boolean K1(s1 s1Var, TLRPC.Chat chat) {
        switch (this.f4297a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void L(s1 s1Var) {
        int i10 = this.f4297a;
    }

    @Override
    public void L1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f4297a;
    }

    @Override
    public void M(s1 s1Var, jh.f fVar) {
        int i10 = this.f4297a;
    }

    @Override
    public boolean M0(Context context) {
        return false;
    }

    @Override
    public boolean M1() {
        switch (this.f4297a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void N(int i10, s1 s1Var) {
        int i11 = this.f4297a;
    }

    @Override
    public void N0(s1 s1Var) {
        int i10 = this.f4297a;
    }

    @Override
    public void O(MessageObject messageObject) {
        int i10 = this.f4297a;
    }

    @Override
    public void O1(s1 s1Var) {
        int i10 = this.f4297a;
    }

    @Override
    public boolean P(s1 s1Var, TLRPC.TodoItem todoItem, boolean z4) {
        switch (this.f4297a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int P1(int i10, int i11, int i12) {
        return i10 / 2;
    }

    @Override
    public boolean Q() {
        switch (this.f4297a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void Q1(MessageObject messageObject) {
        int i10 = this.f4297a;
    }

    @Override
    public boolean R(s1 s1Var) {
        switch (this.f4297a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean R0(long j10) {
        switch (this.f4297a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void R1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        switch (this.f4297a) {
            case 17:
            default:
                ze.d.s(s1Var.getContext(), str);
                return;
        }
    }

    @Override
    public boolean S() {
        switch (this.f4297a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void S0(s1 s1Var) {
        int i10 = this.f4297a;
    }

    @Override
    public CharacterStyle S1(s1 s1Var) {
        switch (this.f4297a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void T(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
        int i11 = this.f4297a;
    }

    @Override
    public void T1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
        int i12 = this.f4297a;
    }

    @Override
    public void U(s1 s1Var) {
        int i10 = this.f4297a;
    }

    @Override
    public void U0(int i10, s1 s1Var) {
        int i11 = this.f4297a;
    }

    @Override
    public boolean U1(s1 s1Var, MessageObject messageObject) {
        switch (this.f4297a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public k V(i iVar) {
        int i10 = d0.f6924a;
        if (i10 >= 23 && i10 >= 31) {
            int g10 = o.g(iVar.f4143c.C);
            h5.a.v("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + d0.B(g10));
            return new af.c(g10).V(iVar);
        }
        return new z9.d(4).V(iVar);
    }

    @Override
    public void V1() {
        int i10 = this.f4297a;
    }

    @Override
    public int W() {
        switch (this.f4297a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public void W0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
        int i10 = this.f4297a;
    }

    @Override
    public byte[] X(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public void X0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        int min = Math.min(shortBuffer.remaining() / 2, shortBuffer2.remaining());
        for (int i12 = 0; i12 < min; i12++) {
            shortBuffer2.put(I3(shortBuffer.get(), shortBuffer.get()));
        }
    }

    @Override
    public void Y(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public void Y1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
        int i10 = this.f4297a;
    }

    @Override
    public ug.a Z() {
        switch (this.f4297a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public void Z1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
        int i10 = this.f4297a;
    }

    @Override
    public Map a(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public boolean a0(s1 s1Var) {
        switch (this.f4297a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean a2(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        switch (this.f4297a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void b(nb nbVar, wa waVar, ua uaVar, xa xaVar) {
        o1.j jVar = new o1.j(nbVar, nb.IN_OUT_OFFSET_Y, nbVar.getHeight());
        jVar.f16178u.a(0.8f);
        jVar.f16178u.b(400.0f);
        jVar.a(new ya(uaVar, 1));
        jVar.b(new kb(xaVar, nbVar, 0));
        jVar.f();
        waVar.run();
    }

    @Override
    public u b0(byte[] bArr, List list, int i10, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override
    public void b1(s1 s1Var, CharacterStyle characterStyle, boolean z4) {
        int i10 = this.f4297a;
    }

    @Override
    public boolean c0(s1 s1Var, TLRPC.User user) {
        switch (this.f4297a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean c1(s1 s1Var, boolean z4) {
        switch (this.f4297a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public cv0 c2() {
        switch (this.f4297a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public v d() {
        throw new IllegalStateException();
    }

    @Override
    public Object d0(c5.j jVar) {
        switch (this.f4297a) {
            case 26:
                return new bb.b(jVar.x(bb.a.class));
            default:
                return new bb.a(jVar.c(ab.a.class));
        }
    }

    @Override
    public void d1(s1 s1Var) {
        int i10 = this.f4297a;
    }

    @Override
    public r3.v d2(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean e() {
        switch (this.f4297a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public int e0() {
        return 0;
    }

    @Override
    public void e1(s1 s1Var) {
        int i10 = this.f4297a;
    }

    @Override
    public boolean e2(long j10) {
        switch (this.f4297a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean f() {
        switch (this.f4297a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public void f0(int i10) {
        int i11 = this.f4297a;
    }

    @Override
    public void f2(s1 s1Var, int i10, float f10, float f11, boolean z4) {
        int i11 = this.f4297a;
    }

    @Override
    public String g(s1 s1Var) {
        switch (this.f4297a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public boolean g0() {
        switch (this.f4297a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean g2(s1 s1Var, TLRPC.TodoItem todoItem) {
        switch (this.f4297a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean h(Context context) {
        return false;
    }

    @Override
    public int h0() {
        return 1;
    }

    @Override
    public boolean h1(int i10, s1 s1Var) {
        switch (this.f4297a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void h2(s sVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void i(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
        int i13 = this.f4297a;
    }

    @Override
    public void i0(s1 s1Var, float f10, float f11) {
        int i10 = this.f4297a;
    }

    @Override
    public void j() {
        int i10 = this.f4297a;
    }

    @Override
    public boolean j0(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public void j1() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void j2(s1 s1Var) {
        int i10 = this.f4297a;
    }

    @Override
    public int k0(s1 s1Var) {
        switch (this.f4297a) {
            case 17:
                return 0;
            default:
                return 0;
        }
    }

    @Override
    public long l() {
        return SystemClock.elapsedRealtime();
    }

    @Override
    public void l0(s1 s1Var) {
        int i10 = this.f4297a;
    }

    @Override
    public void l2(s1 s1Var, long j10) {
        int i10 = this.f4297a;
    }

    @Override
    public void m(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
        int i11 = this.f4297a;
    }

    @Override
    public int m0() {
        return 1711276032;
    }

    @Override
    public boolean m1(MessageObject messageObject) {
        int i10 = this.f4297a;
        return org.telegram.ui.b.a(messageObject);
    }

    @Override
    public void n(s1 s1Var) {
        int i10 = this.f4297a;
    }

    @Override
    public void o() {
        int i10 = this.f4297a;
    }

    @Override
    public boolean p(l.k kVar) {
        return false;
    }

    @Override
    public boolean p0() {
        switch (this.f4297a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void p1() {
        int i10 = this.f4297a;
    }

    @Override
    public void q(s1 s1Var) {
        int i10 = this.f4297a;
    }

    @Override
    public void r(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 < i11) {
            of.a.f16558t.r(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 > i11) {
            of.a.f16557q.r(shortBuffer, i10, shortBuffer2, i11, i12);
        } else if (i10 == i11) {
            shortBuffer2.put(shortBuffer);
        } else {
            throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
        }
    }

    @Override
    public void r1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        int i10 = this.f4297a;
    }

    @Override
    public boolean r2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        switch (this.f4297a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void s() {
        int i10 = this.f4297a;
    }

    @Override
    public void s0(String str) {
        int i10 = this.f4297a;
    }

    @Override
    public void s2(s1 s1Var) {
        int i10 = this.f4297a;
    }

    @Override
    public void t(s1 s1Var) {
        int i10 = this.f4297a;
    }

    @Override
    public boolean t0(u5 u5Var) {
        switch (this.f4297a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void u(s1 s1Var) {
        int i10 = this.f4297a;
    }

    @Override
    public void u1(s1 s1Var, TLRPC.Document document) {
        int i10 = this.f4297a;
    }

    @Override
    public Object u2() {
        switch (this.f4297a) {
            case 22:
                return new ArrayList();
            default:
                return new l(true);
        }
    }

    @Override
    public StackTraceElement[] v(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override
    public void v0(s1 s1Var, float f10, float f11) {
        int i10 = this.f4297a;
    }

    @Override
    public void v2() {
        int i10 = this.f4297a;
    }

    @Override
    public String w(long j10) {
        switch (this.f4297a) {
            case 17:
                return null;
            default:
                return null;
        }
    }

    @Override
    public int x() {
        return 872415231;
    }

    @Override
    public void x2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
        int i10 = this.f4297a;
    }

    @Override
    public void y(s1 s1Var) {
        int i10 = this.f4297a;
    }

    @Override
    public void y0(s1 s1Var, TLRPC.User user, float f10, float f11) {
        int i10 = this.f4297a;
    }

    @Override
    public n3.b z(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public void z1(s1 s1Var, float f10, float f11) {
        int i10 = this.f4297a;
    }

    @Override
    public boolean z2(int i10) {
        switch (this.f4297a) {
            case 17:
                return false;
            default:
                return false;
        }
    }

    private final void G3() {
    }

    private final void H3() {
    }

    private final void L0() {
    }

    private final void L3() {
    }

    private final void M3() {
    }

    private final void O0() {
    }

    private final void P3() {
    }

    private final void Q3() {
    }

    private final void U3() {
    }

    private final void V3() {
    }

    private final void X2() {
    }

    private final void Y2() {
    }

    private final void q2() {
    }

    private final void t2() {
    }

    private final void w0() {
    }

    private final void x0() {
    }

    @Override
    public void release() {
    }

    private final void B1(s1 s1Var) {
    }

    private final void B3(s1 s1Var) {
    }

    private final void C0(s1 s1Var) {
    }

    private final void C1(s1 s1Var) {
    }

    private final void D3(s1 s1Var) {
    }

    private final void E3(s1 s1Var) {
    }

    private final void H0(s1 s1Var) {
    }

    private final void J0(s1 s1Var) {
    }

    private final void J2(s1 s1Var) {
    }

    private final void K2(s1 s1Var) {
    }

    private final void N2(s1 s1Var) {
    }

    private final void N3(int i10) {
    }

    private final void O2(s1 s1Var) {
    }

    private final void O3(int i10) {
    }

    private final void P0(s1 s1Var) {
    }

    private final void P2(s1 s1Var) {
    }

    private final void Q0(s1 s1Var) {
    }

    private final void Q2(s1 s1Var) {
    }

    private final void R2(s1 s1Var) {
    }

    private final void S2(s1 s1Var) {
    }

    private final void S3(MessageObject messageObject) {
    }

    private final void T3(MessageObject messageObject) {
    }

    private final void V2(s1 s1Var) {
    }

    private final void W2(s1 s1Var) {
    }

    private final void X1(s1 s1Var) {
    }

    private final void Y0(s1 s1Var) {
    }

    private final void Z0(s1 s1Var) {
    }

    private final void b2(s1 s1Var) {
    }

    private final void f3(String str) {
    }

    private final void g3(String str) {
    }

    private final void i2(s1 s1Var) {
    }

    private final void k1(s1 s1Var) {
    }

    private final void k2(s1 s1Var) {
    }

    private final void l1(s1 s1Var) {
    }

    private final void l3(s1 s1Var) {
    }

    private final void m3(s1 s1Var) {
    }

    private final void n1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void o1(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    private final void p3(s1 s1Var) {
    }

    private final void q1(s1 s1Var) {
    }

    private final void q3(s1 s1Var) {
    }

    private final void r3(MessageObject messageObject) {
    }

    private final void s1(s1 s1Var) {
    }

    private final void s3(MessageObject messageObject) {
    }

    private final void t3(s1 s1Var) {
    }

    private final void u3(s1 s1Var) {
    }

    private final void w1(s1 s1Var) {
    }

    private final void x1(s1 s1Var) {
    }

    private final void x3(s1 s1Var) {
    }

    private final void y3(s1 s1Var) {
    }

    private final void z0(s1 s1Var) {
    }

    private final void z3(s1 s1Var) {
    }

    @Override
    public void C(o3.c cVar) {
    }

    @Override
    public void H(byte[] bArr) {
    }

    private final void A1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    private final void A3(s1 s1Var, boolean z4) {
    }

    private final void C3(s1 s1Var, boolean z4) {
    }

    private final void G1(int i10, s1 s1Var) {
    }

    private final void J1(int i10, s1 s1Var) {
    }

    private final void L2(s1 s1Var, TLRPC.Document document) {
    }

    private final void M2(s1 s1Var, TLRPC.Document document) {
    }

    private final void N1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void T0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void V0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void W1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    private final void h3(s1 s1Var, long j10) {
    }

    private final void i3(s1 s1Var, long j10) {
    }

    private final void o2(int i10, s1 s1Var) {
    }

    private final void p2(int i10, s1 s1Var) {
    }

    private final void r0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void t1(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void u0(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    private final void v1(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    private final void v3(s1 s1Var, jh.f fVar) {
    }

    private final void w3(s1 s1Var, jh.f fVar) {
    }

    private final void y1(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void c(l.k kVar, boolean z4) {
    }

    @Override
    public void k(byte[] bArr, k3.k kVar) {
    }

    private final void D1(s1 s1Var, int i10, int i11) {
    }

    private final void E1(s1 s1Var, int i10, int i11) {
    }

    private final void T2(s1 s1Var, float f10, float f11) {
    }

    private final void U2(s1 s1Var, float f10, float f11) {
    }

    private final void Z2(s1 s1Var, CharacterStyle characterStyle, boolean z4) {
    }

    private final void a3(s1 s1Var, CharacterStyle characterStyle, boolean z4) {
    }

    private final void g1(s1 s1Var, TLObject tLObject, boolean z4) {
    }

    private final void i1(s1 s1Var, TLObject tLObject, boolean z4) {
    }

    private final void n3(s1 s1Var, float f10, float f11) {
    }

    private final void o0(s1 s1Var, float f10, float f11) {
    }

    private final void o3(s1 s1Var, float f10, float f11) {
    }

    private final void q0(s1 s1Var, float f10, float f11) {
    }

    private final void w2(s1 s1Var, float f10, float f11) {
    }

    private final void y2(s1 s1Var, float f10, float f11) {
    }

    private final void A2(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void E2(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    private final void b3(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void c3(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    private final void d3(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void e3(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    private final void m2(s1 s1Var, float f10, float f11, boolean z4) {
    }

    private final void n2(s1 s1Var, float f10, float f11, boolean z4) {
    }

    private final void F2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    private final void G2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    private final void H2(s1 s1Var, int i10, float f10, float f11, boolean z4) {
    }

    private final void I2(s1 s1Var, int i10, float f10, float f11, boolean z4) {
    }

    private final void j3(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void k3(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    private final void a1(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    private final void f1(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    private final void J3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    private final void K3(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
