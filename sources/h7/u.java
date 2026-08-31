package h7;

import android.media.MediaDrmException;
import android.os.SystemClock;
import android.text.style.CharacterStyle;
import android.view.View;
import h5.d0;
import j$.util.Objects;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.x;
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
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.wg;
import org.telegram.ui.nn;
import org.telegram.ui.xu0;
public final class u implements androidx.car.app.messaging.model.b, d4.j, h3.a, x, v, of.a, eg, k1, t0, pf.a, q9.a, r3.m, ra.m, ki, c9.e {
    public static u f7348b;
    public static u f7349c;
    public static u d;
    public final int f7350a;

    public u(int i10) {
        this.f7350a = i10;
    }

    public static Calendar K2() {
        if (d == null) {
            d = new u(9);
        }
        d.getClass();
        return Calendar.getInstance();
    }

    public static String L2(mc.c cVar) {
        String str = cVar.f13630a;
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

    public static final CharSequence M2(Object obj) {
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
    public d4.k A1(d4.i iVar) {
        int i10 = d0.f7237a;
        if (i10 >= 23 && i10 >= 31) {
            int g10 = h5.o.g(iVar.f4232c.C);
            h5.a.v("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type " + d0.B(g10));
            return new bf.b(g10).A1(iVar);
        }
        return new ab.a(5).A1(iVar);
    }

    @Override
    public boolean A2(v0 v0Var, float f10, float f11) {
        return false;
    }

    @Override
    public void B0(wg wgVar) {
        wgVar.run();
    }

    @Override
    public boolean C2(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public boolean D1() {
        return false;
    }

    @Override
    public n3.b E0(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public boolean E2(int i10) {
        return false;
    }

    @Override
    public TLRPC.TL_channels_sendAsPeers F() {
        return null;
    }

    @Override
    public boolean H0() {
        return true;
    }

    @Override
    public boolean H1() {
        return false;
    }

    @Override
    public n9 I2() {
        return null;
    }

    @Override
    public o3.u J() {
        throw new IllegalStateException();
    }

    @Override
    public byte[] K1(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public boolean N(t1 t1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override
    public boolean N1(t1 t1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean O() {
        return false;
    }

    @Override
    public byte[] O0() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override
    public boolean P(t1 t1Var) {
        return false;
    }

    @Override
    public boolean P1() {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean R0(long j10) {
        return false;
    }

    @Override
    public int S1(int i10, int i11, int i12) {
        of.a aVar;
        if (i11 == 6) {
            aVar = of.a.f16750p;
        } else if (i11 > i12) {
            aVar = of.a.f16747l;
        } else if (i11 < i12) {
            aVar = of.a.f16748m;
        } else {
            aVar = of.a.f16749o;
        }
        return aVar.S1(i10, i11, i12);
    }

    @Override
    public p2 T0() {
        return null;
    }

    @Override
    public void U1(t1 t1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        af.g.s(t1Var.getContext(), str);
    }

    @Override
    public int V() {
        return 0;
    }

    @Override
    public void V1(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public long W() {
        return SystemClock.elapsedRealtime();
    }

    @Override
    public CharacterStyle W1(t1 t1Var) {
        return null;
    }

    @Override
    public void X0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        of.a aVar;
        if (i10 == 6) {
            aVar = of.a.f16750p;
        } else if (i10 > i11) {
            aVar = of.a.f16747l;
        } else if (i10 < i11) {
            aVar = of.a.f16748m;
        } else {
            aVar = of.a.f16749o;
        }
        aVar.X0(shortBuffer, i10, shortBuffer2, i11);
    }

    @Override
    public boolean Y1(t1 t1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public vg.a Z() {
        return null;
    }

    @Override
    public o3.t Z1(byte[] bArr, List list, int i10, HashMap hashMap) {
        throw new IllegalStateException();
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
    public long b() {
        return 0L;
    }

    @Override
    public boolean b1(t1 t1Var, boolean z4) {
        return false;
    }

    @Override
    public boolean b2() {
        return false;
    }

    @Override
    public boolean c0(t1 t1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public boolean d0(l.l lVar) {
        return false;
    }

    @Override
    public boolean e() {
        switch (this.f7350a) {
            case 16:
                return true;
            default:
                return true;
        }
    }

    @Override
    public Object e0(c5.j jVar) {
        switch (this.f7350a) {
            case 26:
                return new bb.c(jVar.w(bb.b.class));
            default:
                return new bb.b(jVar.c(ab.a.class));
        }
    }

    @Override
    public boolean e2(t1 t1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public int f1() {
        return 0;
    }

    @Override
    public String g(t1 t1Var) {
        return null;
    }

    @Override
    public boolean g0() {
        return false;
    }

    @Override
    public boolean g1(int i10, t1 t1Var) {
        return false;
    }

    @Override
    public xu0 g2() {
        return null;
    }

    @Override
    public boolean h0() {
        return false;
    }

    @Override
    public TL_stories.StoryItem h1() {
        return null;
    }

    @Override
    public int h2() {
        return 1;
    }

    @Override
    public void i1() {
        throw new UnsupportedOperationException();
    }

    @Override
    public r3.v i2(int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean j1(long j10) {
        return false;
    }

    @Override
    public boolean j2(long j10) {
        return false;
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
    public void k1(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public int l() {
        return 0;
    }

    @Override
    public boolean l2(t1 t1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean m1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override
    public void m2(r3.s sVar) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean n0() {
        return false;
    }

    @Override
    public boolean n1() {
        return false;
    }

    @Override
    public TLRPC.Peer p() {
        return null;
    }

    @Override
    public boolean q0(u5 u5Var) {
        return false;
    }

    @Override
    public nn r0() {
        return null;
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
    public boolean u1() {
        return false;
    }

    @Override
    public String v(long j10) {
        return null;
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
    public boolean v2(t1 t1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public Map w(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public Object y2() {
        switch (this.f7350a) {
            case 22:
                return new ArrayList();
            default:
                return new ra.l(true);
        }
    }

    @Override
    public void B() {
    }

    @Override
    public void D0() {
    }

    @Override
    public void F2() {
    }

    @Override
    public void G1() {
    }

    @Override
    public void G2() {
    }

    @Override
    public void J2() {
    }

    @Override
    public void L0() {
    }

    @Override
    public void M1() {
    }

    @Override
    public void P0() {
    }

    @Override
    public void Q0() {
    }

    @Override
    public void X() {
    }

    @Override
    public void Y0() {
    }

    @Override
    public void a2() {
    }

    @Override
    public void f() {
    }

    @Override
    public void h() {
    }

    @Override
    public void j() {
    }

    @Override
    public void n2() {
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
    public void release() {
    }

    @Override
    public void s2() {
    }

    @Override
    public void t1() {
    }

    @Override
    public void u() {
    }

    @Override
    public void w0() {
    }

    @Override
    public void w1() {
    }

    @Override
    public void x1() {
    }

    @Override
    public void x2() {
    }

    @Override
    public void y0() {
    }

    @Override
    public void y1() {
    }

    @Override
    public void z2() {
    }

    @Override
    public void A(boolean z4) {
    }

    @Override
    public void C0(t1 t1Var) {
    }

    @Override
    public void C1(CharSequence charSequence) {
    }

    @Override
    public void E(t1 t1Var) {
    }

    @Override
    public void E1(long j10) {
    }

    @Override
    public void F1(v0 v0Var) {
    }

    @Override
    public void H(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void I0(t1 t1Var) {
    }

    @Override
    public void J1(t1 t1Var) {
    }

    @Override
    public void K(t1 t1Var) {
    }

    @Override
    public void K0(t1 t1Var) {
    }

    @Override
    public void M(MessageObject messageObject) {
    }

    @Override
    public void M0(ja.c cVar) {
    }

    @Override
    public void N0(t1 t1Var) {
    }

    @Override
    public void R1(t1 t1Var) {
    }

    @Override
    public void S0(t1 t1Var) {
    }

    @Override
    public void T(t1 t1Var) {
    }

    @Override
    public void T1(MessageObject messageObject) {
    }

    @Override
    public void V0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override
    public void Y(boolean z4) {
    }

    @Override
    public void Z0(Object obj) {
    }

    @Override
    public void b0(v0 v0Var) {
    }

    @Override
    public void c1(t1 t1Var) {
    }

    @Override
    public void d1(t1 t1Var) {
    }

    @Override
    public void e1(int i10) {
    }

    @Override
    public void f0(int i10) {
    }

    @Override
    public void l0(t1 t1Var) {
    }

    @Override
    public void m0(v0 v0Var) {
    }

    @Override
    public void n(t1 t1Var) {
    }

    @Override
    public void o1(TLRPC.User user) {
    }

    @Override
    public void o2(t1 t1Var) {
    }

    @Override
    public void p0(String str) {
    }

    @Override
    public void p2(int i10) {
    }

    @Override
    public void q(t1 t1Var) {
    }

    @Override
    public void q1(byte[] bArr) {
    }

    @Override
    public void s(t1 t1Var) {
    }

    @Override
    public void t(t1 t1Var) {
    }

    @Override
    public void t0(v0 v0Var) {
    }

    @Override
    public void t2(boolean z4) {
    }

    @Override
    public void w2(t1 t1Var) {
    }

    @Override
    public void x(float f10) {
    }

    @Override
    public void y(t1 t1Var) {
    }

    @Override
    public void z(t1 t1Var) {
    }

    @Override
    public void D(t1 t1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void G(float f10, int i10) {
    }

    @Override
    public void I(v0 v0Var, int i10) {
    }

    @Override
    public void J0(int i10, int i11) {
    }

    @Override
    public void L(int i10, t1 t1Var) {
    }

    @Override
    public void L1(t1 t1Var, boolean z4) {
    }

    @Override
    public void O1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void Q(t1 t1Var, kh.f fVar) {
    }

    @Override
    public void U(byte[] bArr, k3.k kVar) {
    }

    @Override
    public void U0(int i10, t1 t1Var) {
    }

    @Override
    public void W0(t1 t1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void c(l.l lVar, boolean z4) {
    }

    @Override
    public void c2(t1 t1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void q2(t1 t1Var, long j10) {
    }

    @Override
    public void r2(v0 v0Var, String str) {
    }

    @Override
    public void s1(t1 t1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void v1(t1 t1Var, TLRPC.Document document) {
    }

    @Override
    public void B1(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void F0(t1 t1Var, TLObject tLObject, boolean z4) {
    }

    @Override
    public void G0(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void H2(t1 t1Var, int i10, int i11) {
    }

    @Override
    public void Q1(v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public void a1(t1 t1Var, CharacterStyle characterStyle, boolean z4) {
    }

    @Override
    public void i0(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void j0(v0 v0Var, int i10, int i11) {
    }

    @Override
    public void l1(v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public void r1(CharSequence charSequence, boolean z4, boolean z10) {
    }

    @Override
    public void s0(t1 t1Var, float f10, float f11) {
    }

    @Override
    public void z1(View view, CharSequence charSequence, boolean z4) {
    }

    @Override
    public void d2(t1 t1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(t1 t1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void x0(t1 t1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void z0(t1 t1Var, float f10, float f11, boolean z4) {
    }

    @Override
    public void B2(t1 t1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override
    public void C(CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
    }

    @Override
    public void D2(v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override
    public void i(t1 t1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void k2(t1 t1Var, int i10, float f10, float f11, boolean z4) {
    }

    @Override
    public void S(t1 t1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    @Override
    public void u2(int i10, int i11, int i12, long j10, long j11, boolean z4) {
    }

    @Override
    public void X1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override
    public void f2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }

    @Override
    public void I1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
    }
}
