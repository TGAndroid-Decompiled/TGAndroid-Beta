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
public final class o5f implements aq2, aka, yyb, e51, bq2, sx9, i8a, p30, m63, ok6, l74, bb2, wq9, lo7, rk1, c38 {
    public static o5f F;
    public static o5f b;
    public final byte a;
    public static final o5f c = new o5f((byte) 1);
    public static final o5f d = new o5f((byte) 2);
    public static final o5f e = new o5f((byte) 3);
    public static final o5f f = new o5f((byte) 4);
    public static final o5f h = new o5f((byte) 5);
    public static final o5f n = new o5f((byte) 6);
    public static final o5f r = new o5f((byte) 7);
    public static final o5f s = new o5f((byte) 8);
    public static final o5f w = new o5f((byte) 9);
    public static final o5f x = new o5f((byte) 10);
    public static final o5f y = new o5f((byte) 11);
    public static final o5f E = new o5f((byte) 12);

    public o5f(byte b2) {
        this.a = b2;
    }

    public static String o0() {
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

    public static q7a p0(ize izeVar) {
        return new q7a(System.currentTimeMillis() + 3600000, new g30(8), new j00(true, false, false), 10.0d, 1.2d, 60);
    }

    public static String q0(hg5 hg5Var) {
        String str = hg5Var.a;
        if ("br".equals(str)) {
            return "\n";
        }
        if ("img".equals(str)) {
            String str2 = (String) hg5Var.a().get("alt");
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

    public static synchronized void t0() {
        synchronized (o5f.class) {
            if (b == null) {
                b = new o5f((byte) 0);
            }
        }
    }

    @Override
    public final boolean A1(gb2 gb2Var, int i) {
        return false;
    }

    @Override
    public final boolean B2(gb2 gb2Var, k27 k27Var) {
        return false;
    }

    @Override
    public final boolean D0(gb2 gb2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final gib E2() {
        return null;
    }

    @Override
    public final boolean F0(gb2 gb2Var) {
        return false;
    }

    @Override
    public final boolean G(gb2 gb2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean H(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override
    public final boolean J0(long j) {
        return false;
    }

    @Override
    public final int K() {
        return MediaCodecList.getCodecCount();
    }

    @Override
    public final void K1(gb2 gb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        d01.t(gb2Var.getContext(), str);
    }

    @Override
    public final Object L(gl2 gl2Var) {
        switch (this.a) {
            case 1:
                Object i = gl2Var.i(new xw8(nk0.class, Executor.class));
                i.getClass();
                return new t44((Executor) i);
            case 2:
            default:
                return new jnd((ktd) gl2Var.a(ktd.class), (u44) gl2Var.a(u44.class));
            case 3:
                return new ltd((ae7) gl2Var.a(ae7.class));
        }
    }

    @Override
    public final boolean N1() {
        return false;
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final int R() {
        return 0;
    }

    @Override
    public final wxb S(int i, int i2) {
        return new yn3();
    }

    @Override
    public final boolean T0(gb2 gb2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override
    public final boolean T1(gm gmVar) {
        return false;
    }

    @Override
    public final int V(gb2 gb2Var) {
        return 0;
    }

    @Override
    public final vu1 X() {
        return null;
    }

    @Override
    public final ma8 Z1() {
        return null;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final boolean a0(uk1 uk1Var, float f2, float f3) {
        return false;
    }

    @Override
    public final Object apply(Object obj) {
        y3f y3fVar = (y3f) obj;
        try {
            int i = y3fVar.i();
            byte[] bArr = new byte[i];
            hef hefVar = new hef(i, bArr);
            tgf a = qgf.c.a(y3f.class);
            xdd xddVar = hefVar.a;
            xdd xddVar2 = xddVar;
            if (xddVar == null) {
                ?? obj2 = new Object();
                Charset charset = eff.a;
                obj2.a = hefVar;
                hefVar.a = obj2;
                xddVar2 = obj2;
            }
            a.c(y3fVar, xddVar2);
            if (i - hefVar.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            fyb.j(tb4.y("Serializing ", y3fVar.getClass().getName(), " to a byte array threw an IOException (should never happen)."), e2);
            return null;
        }
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final String b1(gb2 gb2Var) {
        return null;
    }

    @Override
    public final boolean c2(long j) {
        return false;
    }

    @Override
    public final o63 createDataSource() {
        return new qf0(false);
    }

    @Override
    public final long d() {
        return 0L;
    }

    @Override
    public final MediaCodecInfo e(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override
    public final boolean e0() {
        return false;
    }

    @Override
    public final List f(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (mp2 mp2Var : componentRegistrar.getComponents()) {
            String str = mp2Var.a;
            if (str != null) {
                v82 v82Var = new v82(str, mp2Var, (byte) 7);
                Set set = mp2Var.b;
                Set set2 = mp2Var.c;
                byte b2 = mp2Var.d;
                boolean z = mp2Var.e;
                mp2Var = new mp2(str, set, set2, b2, z ? 1 : 0, v82Var, mp2Var.g);
            }
            arrayList.add(mp2Var);
        }
        return arrayList;
    }

    @Override
    public final CharacterStyle f0(gb2 gb2Var) {
        return null;
    }

    @Override
    public final byte[] g(int i, int i2, byte[] bArr) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override
    public final boolean g2(k27 k27Var) {
        return true;
    }

    @Override
    public final long h(ja3 ja3Var) {
        return -1L;
    }

    @Override
    public final q7a h0(ize izeVar, JSONObject jSONObject) {
        return p0(izeVar);
    }

    @Override
    public final boolean h1(gb2 gb2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final void i(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2, int i3) {
        if (i >= i2) {
            if (i3 != 1 && i3 != 2) {
                w26.j(de9.k(i3, "Illegal use of DownsampleAudioResampler. Channels:"));
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
        w26.j("Illegal use of DownsampleAudioResampler");
    }

    @Override
    public final boolean i0() {
        return false;
    }

    @Override
    public final boolean j(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
            return true;
        }
        return false;
    }

    @Override
    public final fv9 k() {
        return new oc0(-9223372036854775807L);
    }

    @Override
    public final boolean k0() {
        return false;
    }

    @Override
    public final boolean k2(gb2 gb2Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean l() {
        byte b2 = this.a;
        return true;
    }

    @Override
    public final boolean l2(gb2 gb2Var) {
        return false;
    }

    @Override
    public final Object n0(ua9 ua9Var) {
        return null;
    }

    @Override
    public final boolean s0(gb2 gb2Var, boolean z) {
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
    public final d v() {
        return null;
    }

    @Override
    public final String x(long j) {
        return null;
    }

    @Override
    public final boolean x0(gb2 gb2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean y1() {
        return false;
    }

    @Override
    public final boolean y2(int i) {
        return false;
    }

    @Override
    public final boolean z1(k27 k27Var) {
        return oo1.a(k27Var);
    }

    @Override
    public final void B0() {
    }

    @Override
    public final void C2() {
    }

    @Override
    public final void R1() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void i1() {
    }

    @Override
    public final void p() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void u2() {
    }

    @Override
    public final void z() {
    }

    @Override
    public final void C(long j) {
    }

    @Override
    public final void D(uk1 uk1Var) {
    }

    @Override
    public final void D1(h27 h27Var) {
    }

    @Override
    public final void F(gb2 gb2Var) {
    }

    @Override
    public final void H2(gb2 gb2Var) {
    }

    @Override
    public final void J(gb2 gb2Var) {
    }

    @Override
    public final void M(uk1 uk1Var) {
    }

    @Override
    public final void M1(gb2 gb2Var) {
    }

    @Override
    public final void N0(gb2 gb2Var) {
    }

    @Override
    public final void T(gb2 gb2Var) {
    }

    @Override
    public final void W(gb2 gb2Var) {
    }

    @Override
    public final void X0(gb2 gb2Var) {
    }

    @Override
    public final void X1(gb2 gb2Var) {
    }

    @Override
    public final void Y(k27 k27Var) {
    }

    @Override
    public final void Y1(gb2 gb2Var) {
    }

    @Override
    public final void b0(long j) {
    }

    @Override
    public final void c1(gb2 gb2Var) {
    }

    @Override
    public final void d0(int i) {
    }

    @Override
    public final void e2(gb2 gb2Var) {
    }

    @Override
    public final void g0(fv9 fv9Var) {
    }

    @Override
    public final void j0(k27 k27Var) {
    }

    @Override
    public final void l0(String str) {
    }

    @Override
    public final void l1(gb2 gb2Var) {
    }

    @Override
    public final void m(uk1 uk1Var) {
    }

    @Override
    public final void n1(gb2 gb2Var) {
    }

    @Override
    public final void q(gb2 gb2Var) {
    }

    @Override
    public final void q1(gb2 gb2Var) {
    }

    @Override
    public final void r(uk1 uk1Var) {
    }

    @Override
    public final void r0(gb2 gb2Var) {
    }

    @Override
    public final void v2(gb2 gb2Var) {
    }

    @Override
    public final void w(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override
    public final void x1(gb2 gb2Var) {
    }

    @Override
    public final void B(uk1 uk1Var, int i) {
    }

    @Override
    public final void C1(gb2 gb2Var, boolean z) {
    }

    @Override
    public final void E0(gb2 gb2Var, long j) {
    }

    @Override
    public final void F1(gb2 gb2Var, int i) {
    }

    @Override
    public final void M0(gb2 gb2Var, boolean z) {
    }

    @Override
    public final void O1(gb2 gb2Var, iq0 iq0Var) {
    }

    @Override
    public final void V0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void Z(gb2 gb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void b2(String str, String str2) {
    }

    @Override
    public final void d2(gb2 gb2Var, k08 k08Var) {
    }

    @Override
    public final void j2(gb2 gb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void m0(gb2 gb2Var, int i) {
    }

    @Override
    public final void n(uk1 uk1Var, String str) {
    }

    @Override
    public final void v0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void A(gb2 gb2Var, float f2, float f3) {
    }

    @Override
    public final void G1(gb2 gb2Var, boolean z, boolean z2) {
    }

    @Override
    public final void I(gb2 gb2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void P(gb2 gb2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override
    public final void U(uk1 uk1Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public final void W1(gb2 gb2Var, TLObject tLObject, boolean z) {
    }

    @Override
    public final void Y0(gb2 gb2Var, float f2, float f3) {
    }

    @Override
    public final void o(uk1 uk1Var, int i, int i2) {
    }

    @Override
    public final void s2(gb2 gb2Var, float f2, float f3) {
    }

    @Override
    public final void u(uk1 uk1Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public final void v1(gb2 gb2Var, float f2, float f3) {
    }

    @Override
    public final void w0(gb2 gb2Var, int i, int i2) {
    }

    @Override
    public final void x2(gb2 gb2Var, boolean z, boolean z2) {
    }

    @Override
    public final void A0(gb2 gb2Var, float f2, float f3, boolean z) {
    }

    @Override
    public final void E(gb2 gb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void c0(gb2 gb2Var, TLRPC.User user, float f2, float f3) {
    }

    @Override
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
    }

    @Override
    public final void s(gb2 gb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override
    public final void N(gb2 gb2Var, int i, float f2, float f3, boolean z) {
    }

    @Override
    public final void m1(gb2 gb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    @Override
    public final void r1(gb2 gb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override
    public final void y(uk1 uk1Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    @Override
    public final void i2(gb2 gb2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    @Override
    public final void I1(k27 k27Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
