package defpackage;

import android.graphics.RectF;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.style.CharacterStyle;
import android.util.Base64;
import com.google.firebase.components.ComponentRegistrar;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.d;
public final class q7f implements lr2, bma, z0c, l61, mr2, uz9, iaa, p40, y73, rm6, u84, mc2, ys9, oq7, zl1, e58 {
    public static q7f F;
    public static q7f b;
    public final byte a;
    public static final q7f c = new q7f((byte) 1);
    public static final q7f d = new q7f((byte) 2);
    public static final q7f e = new q7f((byte) 3);
    public static final q7f f = new q7f((byte) 4);
    public static final q7f h = new q7f((byte) 5);
    public static final q7f n = new q7f((byte) 6);
    public static final q7f r = new q7f((byte) 7);
    public static final q7f s = new q7f((byte) 8);
    public static final q7f w = new q7f((byte) 9);
    public static final q7f x = new q7f((byte) 10);
    public static final q7f y = new q7f((byte) 11);
    public static final q7f E = new q7f((byte) 12);

    public q7f(byte b2) {
        this.a = b2;
    }

    public static String B0(gi5 gi5Var) {
        String str = gi5Var.a;
        if ("br".equals(str)) {
            return "\n";
        }
        if ("img".equals(str)) {
            String str2 = (String) gi5Var.a().get("alt");
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

    public static synchronized void C0() {
        synchronized (q7f.class) {
            if (b == null) {
                b = new q7f((byte) 0);
            }
        }
    }

    public static String y0() {
        UUID randomUUID = UUID.randomUUID();
        ByteBuffer wrap = ByteBuffer.wrap(new byte[17]);
        wrap.putLong(randomUUID.getMostSignificantBits());
        wrap.putLong(randomUUID.getLeastSignificantBits());
        byte[] array = wrap.array();
        byte b2 = array[0];
        array[16] = b2;
        array[0] = (byte) ((15 & b2) | 112);
        return new String(Base64.encode(array, 11), Charset.defaultCharset()).substring(0, 22);
    }

    public static r9a z0(k1f k1fVar) {
        return new r9a(System.currentTimeMillis() + 3600000, new g40(8), new j10(true, false, false), 10.0d, 1.2d, 60);
    }

    @Override
    public final boolean A0(long j) {
        return false;
    }

    @Override
    public final ix9 D() {
        return new od0(-9223372036854775807L);
    }

    @Override
    public final boolean D1(gn gnVar) {
        return false;
    }

    @Override
    public final boolean E(rc2 rc2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean J0(rc2 rc2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override
    public final boolean K() {
        return false;
    }

    @Override
    public final boolean L(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override
    public final pc8 M1() {
        return null;
    }

    @Override
    public final boolean N() {
        return false;
    }

    @Override
    public final int O() {
        return 0;
    }

    @Override
    public final boolean O1(long j) {
        return false;
    }

    @Override
    public final String P0(rc2 rc2Var) {
        return null;
    }

    @Override
    public final int Q(rc2 rc2Var) {
        return 0;
    }

    @Override
    public final hw1 S() {
        return null;
    }

    @Override
    public final boolean S0(rc2 rc2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean U1(k47 k47Var) {
        return true;
    }

    @Override
    public final int V() {
        return MediaCodecList.getCodecCount();
    }

    @Override
    public final Object X(sm2 sm2Var) {
        switch (this.a) {
            case 1:
                Object i = sm2Var.i(new yy8(nl0.class, Executor.class));
                i.getClass();
                return new e64((Executor) i);
            case 2:
            default:
                return new mpd((nvd) sm2Var.a(nvd.class), (f64) sm2Var.a(f64.class));
            case 3:
                return new ovd((cg7) sm2Var.a(cg7.class));
        }
    }

    @Override
    public final boolean Y1(rc2 rc2Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean Z() {
        return false;
    }

    @Override
    public final boolean Z1(rc2 rc2Var) {
        return false;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final CharacterStyle a0(rc2 rc2Var) {
        return null;
    }

    @Override
    public final Object apply(Object obj) {
        a6f a6fVar = (a6f) obj;
        try {
            int i = a6fVar.i();
            byte[] bArr = new byte[i];
            igf igfVar = new igf(i, bArr);
            uif a = rif.c.a(a6f.class);
            hoe hoeVar = igfVar.a;
            hoe hoeVar2 = hoeVar;
            if (hoeVar == null) {
                ?? obj2 = new Object();
                Charset charset = fhf.a;
                obj2.a = igfVar;
                igfVar.a = obj2;
                hoeVar2 = obj2;
            }
            a.d(a6fVar, hoeVar2);
            if (i - igfVar.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            rjb.k(kt6.o("Serializing ", a6fVar.getClass().getName(), " to a byte array threw an IOException (should never happen)."), e2);
            return null;
        }
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final yzb c0(int i, int i2) {
        return new ip3();
    }

    @Override
    public final a83 createDataSource() {
        return new qg0(false);
    }

    @Override
    public final long d() {
        return 0L;
    }

    @Override
    public final boolean d0() {
        return false;
    }

    @Override
    public final MediaCodecInfo e(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override
    public final boolean f() {
        byte b2 = this.a;
        return true;
    }

    @Override
    public final List g(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (xq2 xq2Var : componentRegistrar.getComponents()) {
            String str = xq2Var.a;
            if (str != null) {
                x92 x92Var = new x92(str, xq2Var, (byte) 8);
                Set set = xq2Var.b;
                Set set2 = xq2Var.c;
                byte b2 = xq2Var.d;
                boolean z = xq2Var.e;
                xq2Var = new xq2(str, set, set2, b2, z ? 1 : 0, x92Var, xq2Var.g);
            }
            arrayList.add(xq2Var);
        }
        return arrayList;
    }

    @Override
    public final byte[] j(int i, int i2, byte[] bArr) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override
    public final boolean j0(cm1 cm1Var, float f2, float f3) {
        return false;
    }

    @Override
    public final boolean l0(rc2 rc2Var, boolean z) {
        return false;
    }

    @Override
    public final boolean l1() {
        return false;
    }

    @Override
    public final boolean m1(k47 k47Var) {
        return aq1.a(k47Var);
    }

    @Override
    public final boolean m2(int i) {
        return false;
    }

    @Override
    public final Object n0(uc9 uc9Var) {
        return null;
    }

    @Override
    public final boolean n1(rc2 rc2Var, int i) {
        return false;
    }

    @Override
    public final boolean n2(rc2 rc2Var, k47 k47Var) {
        return false;
    }

    @Override
    public final long p(vb3 vb3Var) {
        return -1L;
    }

    @Override
    public final boolean p0(rc2 rc2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final hkb p2() {
        return null;
    }

    @Override
    public final r9a q0(k1f k1fVar, JSONObject jSONObject) {
        return z0(k1fVar);
    }

    @Override
    public final void s(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2, int i3) {
        if (i >= i2) {
            if (i3 != 1 && i3 != 2) {
                u36.j(hg9.j(i3, "Illegal use of DownsampleAudioResampler. Channels:"));
                return;
            }
            int remaining = shortBuffer.remaining() / i3;
            int ceil = (int) Math.ceil((i2 / i) * remaining);
            int i4 = remaining - ceil;
            float f2 = ceil;
            float f3 = f2 / f2;
            float f4 = i4;
            float f5 = f4 / f4;
            while (ceil > 0 && i4 > 0) {
                if (f3 >= f5) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i3 == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    ceil--;
                    f3 = ceil / f2;
                } else {
                    shortBuffer.position(shortBuffer.position() + i3);
                    i4--;
                    f5 = i4 / f4;
                }
            }
            return;
        }
        u36.j("Illegal use of DownsampleAudioResampler");
    }

    @Override
    public final String t(long j) {
        return null;
    }

    @Override
    public final boolean t0(rc2 rc2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    public final String toString() {
        switch (this.a) {
            case 2:
                return "NoDeclaredBrand";
            default:
                return super.toString();
        }
    }

    @Override
    public final boolean v(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
            return true;
        }
        return false;
    }

    @Override
    public final d w() {
        return null;
    }

    @Override
    public final boolean w0() {
        return false;
    }

    @Override
    public final boolean x0(rc2 rc2Var) {
        return false;
    }

    @Override
    public final void x1(rc2 rc2Var, TLRPC.WebPage webPage, String str, boolean z) {
        l11.u(rc2Var.getContext(), str);
    }

    @Override
    public final boolean z1() {
        return false;
    }

    @Override
    public final void B() {
    }

    @Override
    public final void C1() {
    }

    @Override
    public final void T0() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void g2() {
    }

    @Override
    public final void i() {
    }

    @Override
    public final void o2() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void s0() {
    }

    @Override
    public final void A(rc2 rc2Var) {
    }

    @Override
    public final void F0(rc2 rc2Var) {
    }

    @Override
    public final void G(rc2 rc2Var) {
    }

    @Override
    public final void I(long j) {
    }

    @Override
    public final void J(cm1 cm1Var) {
    }

    @Override
    public final void J1(rc2 rc2Var) {
    }

    @Override
    public final void L1(rc2 rc2Var) {
    }

    @Override
    public final void M0(rc2 rc2Var) {
    }

    @Override
    public final void P(rc2 rc2Var) {
    }

    @Override
    public final void Q0(rc2 rc2Var) {
    }

    @Override
    public final void Q1(rc2 rc2Var) {
    }

    @Override
    public final void R(rc2 rc2Var) {
    }

    @Override
    public final void T(k47 k47Var) {
    }

    @Override
    public final void U0(rc2 rc2Var) {
    }

    @Override
    public final void X0(rc2 rc2Var) {
    }

    @Override
    public final void Y(int i) {
    }

    @Override
    public final void Z0(rc2 rc2Var) {
    }

    @Override
    public final void b0(cm1 cm1Var) {
    }

    @Override
    public final void e0(k47 k47Var) {
    }

    @Override
    public final void f0(ix9 ix9Var) {
    }

    @Override
    public final void h(cm1 cm1Var) {
    }

    @Override
    public final void h0(String str) {
    }

    @Override
    public final void i2(rc2 rc2Var) {
    }

    @Override
    public final void k(rc2 rc2Var) {
    }

    @Override
    public final void k0(rc2 rc2Var) {
    }

    @Override
    public final void k1(rc2 rc2Var) {
    }

    @Override
    public final void o(cm1 cm1Var) {
    }

    @Override
    public final void q1(h47 h47Var) {
    }

    @Override
    public final void q2(rc2 rc2Var) {
    }

    @Override
    public final void u0(long j) {
    }

    @Override
    public final void x(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override
    public final void y1(rc2 rc2Var) {
    }

    @Override
    public final void B1(rc2 rc2Var, ir0 ir0Var) {
    }

    @Override
    public final void C(cm1 cm1Var, int i) {
    }

    @Override
    public final void D0(rc2 rc2Var, boolean z) {
    }

    @Override
    public final void L0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void N1(String str, String str2) {
    }

    @Override
    public final void P1(rc2 rc2Var, n28 n28Var) {
    }

    @Override
    public final void U(rc2 rc2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void X1(rc2 rc2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void i0(rc2 rc2Var, int i) {
    }

    @Override
    public final void l(cm1 cm1Var, String str) {
    }

    @Override
    public final void m0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void o1(rc2 rc2Var, boolean z) {
    }

    @Override
    public final void t1(rc2 rc2Var, int i) {
    }

    @Override
    public final void v0(rc2 rc2Var, long j) {
    }

    @Override
    public final void F(rc2 rc2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void I1(rc2 rc2Var, TLObject tLObject, boolean z) {
    }

    @Override
    public final void M(rc2 rc2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override
    public final void N0(rc2 rc2Var, float f2, float f3) {
    }

    @Override
    public final void d2(rc2 rc2Var, float f2, float f3) {
    }

    @Override
    public final void g0(cm1 cm1Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public final void i1(rc2 rc2Var, float f2, float f3) {
    }

    @Override
    public final void l2(rc2 rc2Var, boolean z, boolean z2) {
    }

    @Override
    public final void n(cm1 cm1Var, int i, int i2) {
    }

    @Override
    public final void o0(rc2 rc2Var, int i, int i2) {
    }

    @Override
    public final void r(cm1 cm1Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public final void u(rc2 rc2Var, float f2, float f3) {
    }

    @Override
    public final void u1(rc2 rc2Var, boolean z, boolean z2) {
    }

    @Override
    public final void W(rc2 rc2Var, TLRPC.User user, float f2, float f3) {
    }

    @Override
    public final void m(rc2 rc2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
    }

    @Override
    public final void r0(rc2 rc2Var, float f2, float f3, boolean z) {
    }

    @Override
    public final void z(rc2 rc2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void H(rc2 rc2Var, int i, float f2, float f3, boolean z) {
    }

    @Override
    public final void V0(rc2 rc2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    @Override
    public final void b1(rc2 rc2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override
    public final void y(cm1 cm1Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    @Override
    public final void W1(rc2 rc2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    @Override
    public final void w1(k47 k47Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
