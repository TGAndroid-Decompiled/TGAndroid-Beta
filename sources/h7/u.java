package h7;

import android.media.MediaDrmException;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import android.view.View;
import androidx.biometric.f0;
import h5.d0;
import j$.util.Objects;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.w;
import o3.v;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.k1;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.eg;
import org.telegram.ui.Components.u5;
import org.telegram.ui.nn;
import org.telegram.ui.vu0;
public final class u implements androidx.car.app.messaging.model.b, d4.j, h3.a, w, v, of.a, eg, k1, t0, pf.a, q9.a, r3.m, ra.m, qg.a, c9.e {
    public static u f7035b;
    public static u f7036c;
    public static u d;
    public final int f7037a;

    public u(int i10) {
        this.f7037a = i10;
    }

    public static Calendar F2() {
        if (d == null) {
            d = new u(9);
        }
        d.getClass();
        return Calendar.getInstance();
    }

    public static String G2(mc.c cVar) {
        String str = cVar.f13911a;
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

    public static final CharSequence H2(Object obj) {
        Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    @Override
    public boolean A0(MessageObject messageObject) {
        return true;
    }

    @Override
    public n9 C2() {
        return null;
    }

    @Override
    public n3.b D0(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public boolean D1() {
        return false;
    }

    @Override
    public int D2() {
        return 1711276032;
    }

    @Override
    public byte[] F1(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public TLRPC.TL_channels_sendAsPeers G() {
        return null;
    }

    @Override
    public boolean G0() {
        return true;
    }

    @Override
    public boolean I1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public o3.u K() {
        throw new IllegalStateException();
    }

    @Override
    public boolean K1() {
        return false;
    }

    @Override
    public byte[] M0() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override
    public int N1(int i10, int i11, int i12) {
        of.a aVar;
        if (i11 == 6) {
            aVar = of.a.f16578p;
        } else if (i11 > i12) {
            aVar = of.a.f16575l;
        } else if (i11 < i12) {
            aVar = of.a.f16576m;
        } else {
            aVar = of.a.f16577o;
        }
        return aVar.N1(i10, i11, i12);
    }

    @Override
    public boolean O0(long j10) {
        return false;
    }

    @Override
    public boolean P(t1 t1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override
    public void P1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        af.g.s(t1Var.getContext(), str);
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public p2 Q0() {
        return null;
    }

    @Override
    public void Q1(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public boolean R(t1 t1Var) {
        return false;
    }

    @Override
    public CharacterStyle R1(t1 t1Var) {
        return null;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public boolean T1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public void U0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        of.a aVar;
        if (i10 == 6) {
            aVar = of.a.f16578p;
        } else if (i10 > i11) {
            aVar = of.a.f16575l;
        } else if (i10 < i11) {
            aVar = of.a.f16576m;
        } else {
            aVar = of.a.f16577o;
        }
        aVar.U0(shortBuffer, i10, shortBuffer2, i11);
    }

    @Override
    public o3.t U1(byte[] bArr, List list, int i10, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override
    public int W() {
        return 0;
    }

    @Override
    public int W1() {
        return 0;
    }

    @Override
    public long X() {
        return SystemClock.elapsedRealtime();
    }

    @Override
    public int X0() {
        return 352321535;
    }

    @Override
    public boolean Y0(t1 t1Var, boolean z4) {
        return false;
    }

    @Override
    public ug.a Z() {
        return null;
    }

    @Override
    public boolean Z1(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public long a() {
        return 0L;
    }

    @Override
    public boolean a0(t1 t1Var) {
        return false;
    }

    @Override
    public vu0 a2() {
        return null;
    }

    @Override
    public long b() {
        return 0L;
    }

    @Override
    public int b2() {
        return 1;
    }

    @Override
    public int c1() {
        return 0;
    }

    @Override
    public r3.v c2(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public boolean d0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean d1(int i10, t1 t1Var) {
        return false;
    }

    @Override
    public boolean d2(long j10) {
        return false;
    }

    @Override
    public boolean e() {
        switch (this.f7037a) {
            case 16:
                return true;
            default:
                return true;
        }
    }

    @Override
    public boolean e0(l.k kVar) {
        return false;
    }

    @Override
    public TL_stories.StoryItem e1() {
        return null;
    }

    @Override
    public Object f0(c5.j jVar) {
        switch (this.f7037a) {
            case 26:
                return new bb.b(jVar.x(bb.a.class));
            default:
                return new bb.a(jVar.d(ab.a.class));
        }
    }

    @Override
    public void f1() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean f2(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public String g(t1 t1Var) {
        return null;
    }

    @Override
    public boolean g1(long j10) {
        return false;
    }

    @Override
    public void g2(r3.s sVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean h0() {
        return false;
    }

    @Override
    public void h1(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public boolean j1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override
    public boolean k() {
        return false;
    }

    @Override
    public int k0(t1 t1Var) {
        return 0;
    }

    @Override
    public boolean k1() {
        return false;
    }

    @Override
    public int l() {
        return 0;
    }

    @Override
    public boolean n0() {
        return false;
    }

    @Override
    public TLRPC.Peer p() {
        return null;
    }

    @Override
    public boolean p2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean q0(u5 u5Var) {
        return false;
    }

    @Override
    public boolean q1() {
        return false;
    }

    @Override
    public nn r0() {
        return null;
    }

    @Override
    public Object s2() {
        switch (this.f7037a) {
            case 22:
                return new ArrayList();
            default:
                return new ra.l(true);
        }
    }

    @Override
    public void u0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 == i11) {
            shortBuffer2.put(shortBuffer);
            return;
        }
        throw new IllegalArgumentException("Illegal use of PassThroughAudioResampler");
    }

    @Override
    public boolean u2(v0 v0Var, float f10, float f11) {
        return false;
    }

    @Override
    public Map v(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public StackTraceElement[] v0(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= 1024) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[1024];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, 512);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - 512, stackTraceElementArr2, 512, 512);
        return stackTraceElementArr2;
    }

    @Override
    public String w(long j10) {
        return null;
    }

    @Override
    public d4.k w1(d4.i iVar) {
        int i10 = d0.f6937a;
        if (i10 >= 23 && i10 >= 31) {
            int g10 = h5.o.g(iVar.f4162c.C);
            h5.a.v("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + d0.B(g10));
            return new bf.b(g10).w1(iVar);
        }
        return new ab.a(5).w1(iVar);
    }

    @Override
    public boolean w2(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public int x0() {
        return 872415231;
    }

    @Override
    public boolean y2(int i10) {
        return false;
    }

    @Override
    public boolean z1() {
        return false;
    }

    @Override
    public void A2() {
    }

    @Override
    public void C() {
    }

    @Override
    public void C0() {
    }

    @Override
    public void C1() {
    }

    @Override
    public void E2() {
    }

    @Override
    public void H1() {
    }

    @Override
    public void K0() {
    }

    @Override
    public void N0() {
    }

    @Override
    public void V0() {
    }

    @Override
    public void V1() {
    }

    @Override
    public void Y() {
    }

    @Override
    public void f() {
    }

    @Override
    public void h() {
    }

    @Override
    public void h2() {
    }

    @Override
    public void j() {
    }

    @Override
    public void l1() {
    }

    @Override
    public void m2() {
    }

    @Override
    public void o() {
    }

    @Override
    public void o0() {
    }

    @Override
    public void p1() {
    }

    @Override
    public void r() {
    }

    @Override
    public void r2() {
    }

    @Override
    public void release() {
    }

    @Override
    public void s() {
    }

    @Override
    public void s1() {
    }

    @Override
    public void t1() {
    }

    @Override
    public void t2() {
    }

    @Override
    public void u1() {
    }

    @Override
    public void w0() {
    }

    @Override
    public void z2() {
    }

    @Override
    public void A(t1 t1Var) {
    }

    @Override
    public void A1(long j10) {
    }

    @Override
    public void B(f0 f0Var) {
    }

    @Override
    public void B0(t1 t1Var) {
    }

    @Override
    public void B1(v0 v0Var) {
    }

    @Override
    public void E1(t1 t1Var) {
    }

    @Override
    public void F(t1 t1Var) {
    }

    @Override
    public void H0(t1 t1Var) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void J0(t1 t1Var) {
    }

    @Override
    public void L(t1 t1Var) {
    }

    @Override
    public void L0(t1 t1Var) {
    }

    @Override
    public void M1(t1 t1Var) {
    }

    @Override
    public void O(MessageObject messageObject) {
    }

    @Override
    public void O1(MessageObject messageObject) {
    }

    @Override
    public void P0(t1 t1Var) {
    }

    @Override
    public void S0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override
    public void U(t1 t1Var) {
    }

    @Override
    public void Z0(t1 t1Var) {
    }

    @Override
    public void a1(t1 t1Var) {
    }

    @Override
    public void b0(boolean z4) {
    }

    @Override
    public void b1(int i10) {
    }

    @Override
    public void c0(v0 v0Var) {
    }

    @Override
    public void g0(int i10) {
    }

    @Override
    public void i2(t1 t1Var) {
    }

    @Override
    public void j2(int i10) {
    }

    @Override
    public void l0(t1 t1Var) {
    }

    @Override
    public void m0(v0 v0Var) {
    }

    @Override
    public void m1(byte[] bArr) {
    }

    @Override
    public void n(t1 t1Var) {
    }

    @Override
    public void n2(boolean z4) {
    }

    @Override
    public void p0(String str) {
    }

    @Override
    public void q(t1 t1Var) {
    }

    @Override
    public void q2(t1 t1Var) {
    }

    @Override
    public void t(t1 t1Var) {
    }

    @Override
    public void t0(v0 v0Var) {
    }

    @Override
    public void u(t1 t1Var) {
    }

    @Override
    public void x(float f10) {
    }

    @Override
    public void y(t1 t1Var) {
    }

    @Override
    public void y1(CharSequence charSequence) {
    }

    @Override
    public void z(boolean z4) {
    }

    @Override
    public void E(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void G1(t1 t1Var, boolean z4) {
    }

    @Override
    public void H(float f10, int i10) {
    }

    @Override
    public void I0(int i10, int i11) {
    }

    @Override
    public void J(v0 v0Var, int i10) {
    }

    @Override
    public void J1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void M(t1 t1Var, jh.f fVar) {
    }

    @Override
    public void N(int i10, t1 t1Var) {
    }

    @Override
    public void R0(int i10, t1 t1Var) {
    }

    @Override
    public void T0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void V(byte[] bArr, k3.k kVar) {
    }

    @Override
    public void X1(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void c(l.k kVar, boolean z4) {
    }

    @Override
    public void k2(t1 t1Var, long j10) {
    }

    @Override
    public void l2(v0 v0Var, String str) {
    }

    @Override
    public void o1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void r1(t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public void B2(t1 t1Var, int i10, int i11) {
    }

    @Override
    public void E0(t1 t1Var, TLObject tLObject, boolean z4) {
    }

    @Override
    public void F0(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void L1(v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public void W0(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    @Override
    public void i0(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void i1(v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public void j0(v0 v0Var, int i10, int i11) {
    }

    @Override
    public void n1(CharSequence charSequence, boolean z4, boolean z10) {
    }

    @Override
    public void s0(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void v1(View view, CharSequence charSequence, boolean z4) {
    }

    @Override
    public void x1(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void Y1(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void y0(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void z0(t1 t1Var, float f10, float f11, boolean z4) {
    }

    @Override
    public void D(CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
    }

    @Override
    public void e2(t1 t1Var, int i10, float f10, float f11, boolean z4) {
    }

    @Override
    public void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void v2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override
    public void x2(v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override
    public void T(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    @Override
    public void o2(int i10, int i11, int i12, long j10, long j11, boolean z4) {
    }

    @Override
    public void S1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }
}
