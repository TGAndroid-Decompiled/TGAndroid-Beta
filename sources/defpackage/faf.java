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
import org.telegram.ui.ActionBar.e;
public final class faf implements tq2, una, y2c, m51, uq2, m1a, yba, q30, f73, um6, g84, rb2, pu9, lr7, al1 {
    public static faf F;
    public static faf b;
    public final byte a;
    public static final faf c = new faf((byte) 1);
    public static final faf d = new faf((byte) 2);
    public static final faf e = new faf((byte) 3);
    public static final faf f = new faf((byte) 4);
    public static final faf h = new faf((byte) 5);
    public static final faf n = new faf((byte) 6);
    public static final faf r = new faf((byte) 7);
    public static final faf s = new faf((byte) 8);
    public static final faf w = new faf((byte) 9);
    public static final faf x = new faf((byte) 10);
    public static final faf y = new faf((byte) 11);
    public static final faf E = new faf((byte) 12);

    public faf(byte b2) {
        this.a = b2;
    }

    public static String B0(ji5 ji5Var) {
        String str = ji5Var.a;
        if ("br".equals(str)) {
            return "\n";
        }
        if ("img".equals(str)) {
            String str2 = (String) ji5Var.a().get("alt");
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

    public static synchronized void D0() {
        synchronized (faf.class) {
            if (b == null) {
                b = new faf((byte) 0);
            }
        }
    }

    public static String x0() {
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

    public static hba z0(z3f z3fVar) {
        return new hba(System.currentTimeMillis() + 3600000, new h30(8), new k00(true, false, false), 10.0d, 1.2d, 60);
    }

    @Override
    public final boolean A1(hm hmVar) {
        return false;
    }

    @Override
    public final zy9 C() {
        return new qc0(-9223372036854775807L);
    }

    @Override
    public final boolean E(wb2 wb2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean G0(wb2 wb2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override
    public final de8 J1() {
        return null;
    }

    @Override
    public final boolean K() {
        return false;
    }

    @Override
    public final boolean L1(long j) {
        return false;
    }

    @Override
    public final boolean M() {
        return false;
    }

    @Override
    public final String M0(wb2 wb2Var) {
        return null;
    }

    @Override
    public final int N() {
        return 0;
    }

    @Override
    public final int P(wb2 wb2Var) {
        return 0;
    }

    @Override
    public final boolean P0(wb2 wb2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean R(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override
    public final boolean R1(r47 r47Var) {
        return true;
    }

    @Override
    public final iv1 S() {
        return null;
    }

    @Override
    public final int V() {
        return MediaCodecList.getCodecCount();
    }

    @Override
    public final boolean V1(wb2 wb2Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean W1(wb2 wb2Var) {
        return false;
    }

    @Override
    public final boolean Z() {
        return false;
    }

    @Override
    public final long a() {
        return 0L;
    }

    @Override
    public final CharacterStyle a0(wb2 wb2Var) {
        return null;
    }

    @Override
    public final Object apply(Object obj) {
        p8f p8fVar = (p8f) obj;
        try {
            int i = p8fVar.i();
            byte[] bArr = new byte[i];
            xif xifVar = new xif(i, bArr);
            jlf a = glf.c.a(p8f.class);
            oqd oqdVar = xifVar.a;
            oqd oqdVar2 = oqdVar;
            if (oqdVar == null) {
                ?? obj2 = new Object();
                Charset charset = ujf.a;
                obj2.a = xifVar;
                xifVar.a = obj2;
                oqdVar2 = obj2;
            }
            a.g(p8fVar, oqdVar2);
            if (i - xifVar.d == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e2) {
            grb.j(qd4.y("Serializing ", p8fVar.getClass().getName(), " to a byte array threw an IOException (should never happen)."), e2);
            return null;
        }
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final Object b0(am2 am2Var) {
        switch (this.a) {
            case 1:
                Object h2 = am2Var.h(new h09(ok0.class, Executor.class));
                h2.getClass();
                return new p54((Executor) h2);
            case 2:
            default:
                return new asd((ayd) am2Var.a(ayd.class), (q54) am2Var.a(q54.class));
            case 3:
                return new byd((jg7) am2Var.a(jg7.class));
        }
    }

    @Override
    public final long c() {
        return 0L;
    }

    @Override
    public final boolean c0() {
        return false;
    }

    @Override
    public final h73 createDataSource() {
        return new sf0(false);
    }

    @Override
    public final MediaCodecInfo e(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override
    public final x1c e0(int i, int i2) {
        return new po3();
    }

    @Override
    public final List f(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (fq2 fq2Var : componentRegistrar.getComponents()) {
            String str = fq2Var.a;
            if (str != null) {
                q72 q72Var = new q72(str, fq2Var, (byte) 9);
                Set set = fq2Var.b;
                Set set2 = fq2Var.c;
                byte b2 = fq2Var.d;
                boolean z = fq2Var.e;
                fq2Var = new fq2(str, set, set2, b2, z ? 1 : 0, q72Var, fq2Var.g);
            }
            arrayList.add(fq2Var);
        }
        return arrayList;
    }

    @Override
    public final byte[] g(int i, int i2, byte[] bArr) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override
    public final boolean h() {
        byte b2 = this.a;
        return true;
    }

    @Override
    public final boolean i0(dl1 dl1Var, float f2, float f3) {
        return false;
    }

    @Override
    public final boolean i1() {
        return false;
    }

    @Override
    public final boolean i2(int i) {
        return false;
    }

    @Override
    public final boolean j1(r47 r47Var) {
        return bp1.a(r47Var);
    }

    @Override
    public final boolean j2(wb2 wb2Var, r47 r47Var) {
        return false;
    }

    @Override
    public final boolean k0(wb2 wb2Var, boolean z) {
        return false;
    }

    @Override
    public final boolean k1(wb2 wb2Var, int i) {
        return false;
    }

    @Override
    public final bmb l2() {
        return null;
    }

    @Override
    public final boolean o0(wb2 wb2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final long p(cb3 cb3Var) {
        return -1L;
    }

    @Override
    public final void s(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2, int i3) {
        if (i >= i2) {
            if (i3 != 1 && i3 != 2) {
                lq5.j(uh9.k(i3, "Illegal use of DownsampleAudioResampler. Channels:"));
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
        lq5.j("Illegal use of DownsampleAudioResampler");
    }

    @Override
    public final boolean s0(wb2 wb2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final boolean t(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean t0() {
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
    public final String u(long j) {
        return null;
    }

    @Override
    public final void u1(wb2 wb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        m01.u(wb2Var.getContext(), str);
    }

    @Override
    public final hba v0(z3f z3fVar, JSONObject jSONObject) {
        return z0(z3fVar);
    }

    @Override
    public final e w() {
        return null;
    }

    @Override
    public final boolean w0(wb2 wb2Var) {
        return false;
    }

    @Override
    public final boolean w1() {
        return false;
    }

    @Override
    public final boolean y0(long j) {
        return false;
    }

    @Override
    public final void D() {
    }

    @Override
    public final void Q0() {
    }

    @Override
    public final void d() {
    }

    @Override
    public final void d2() {
    }

    @Override
    public final void i() {
    }

    @Override
    public final void k2() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void r0() {
    }

    @Override
    public final void z1() {
    }

    @Override
    public final void A(wb2 wb2Var) {
    }

    @Override
    public final void C0(wb2 wb2Var) {
    }

    @Override
    public final void G(wb2 wb2Var) {
    }

    @Override
    public final void G1(wb2 wb2Var) {
    }

    @Override
    public final void I(long j) {
    }

    @Override
    public final void I1(wb2 wb2Var) {
    }

    @Override
    public final void J(dl1 dl1Var) {
    }

    @Override
    public final void J0(wb2 wb2Var) {
    }

    @Override
    public final void N0(wb2 wb2Var) {
    }

    @Override
    public final void N1(wb2 wb2Var) {
    }

    @Override
    public final void O(wb2 wb2Var) {
    }

    @Override
    public final void Q(wb2 wb2Var) {
    }

    @Override
    public final void T(r47 r47Var) {
    }

    @Override
    public final void U0(wb2 wb2Var) {
    }

    @Override
    public final void X(dl1 dl1Var) {
    }

    @Override
    public final void Y(int i) {
    }

    @Override
    public final void Y0(wb2 wb2Var) {
    }

    @Override
    public final void a1(wb2 wb2Var) {
    }

    @Override
    public final void d0(r47 r47Var) {
    }

    @Override
    public final void e2(wb2 wb2Var) {
    }

    @Override
    public final void g0(String str) {
    }

    @Override
    public final void h1(wb2 wb2Var) {
    }

    @Override
    public final void j(dl1 dl1Var) {
    }

    @Override
    public final void j0(wb2 wb2Var) {
    }

    @Override
    public final void l(wb2 wb2Var) {
    }

    @Override
    public final void m0(zy9 zy9Var) {
    }

    @Override
    public final void m2(wb2 wb2Var) {
    }

    @Override
    public final void n1(o47 o47Var) {
    }

    @Override
    public final void o(dl1 dl1Var) {
    }

    @Override
    public final void p0(long j) {
    }

    @Override
    public final void v1(wb2 wb2Var) {
    }

    @Override
    public final void x(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override
    public final void A0(wb2 wb2Var, boolean z) {
    }

    @Override
    public final void B(dl1 dl1Var, int i) {
    }

    @Override
    public final void I0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void K1(String str, String str2) {
    }

    @Override
    public final void M1(wb2 wb2Var, q38 q38Var) {
    }

    @Override
    public final void U(wb2 wb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void U1(wb2 wb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void h0(wb2 wb2Var, int i) {
    }

    @Override
    public final void k(dl1 dl1Var, String str) {
    }

    @Override
    public final void l0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void l1(wb2 wb2Var, boolean z) {
    }

    @Override
    public final void q1(wb2 wb2Var, int i) {
    }

    @Override
    public final void u0(wb2 wb2Var, long j) {
    }

    @Override
    public final void y1(wb2 wb2Var, iq0 iq0Var) {
    }

    @Override
    public final void F(wb2 wb2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void F1(wb2 wb2Var, TLObject tLObject, boolean z) {
    }

    @Override
    public final void K0(wb2 wb2Var, float f2, float f3) {
    }

    @Override
    public final void L(wb2 wb2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override
    public final void a2(wb2 wb2Var, float f2, float f3) {
    }

    @Override
    public final void f0(dl1 dl1Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public final void f1(wb2 wb2Var, float f2, float f3) {
    }

    @Override
    public final void h2(wb2 wb2Var, boolean z, boolean z2) {
    }

    @Override
    public final void n(dl1 dl1Var, int i, int i2) {
    }

    @Override
    public final void n0(wb2 wb2Var, int i, int i2) {
    }

    @Override
    public final void q(dl1 dl1Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public final void r1(wb2 wb2Var, boolean z, boolean z2) {
    }

    @Override
    public final void v(wb2 wb2Var, float f2, float f3) {
    }

    @Override
    public final void W(wb2 wb2Var, TLRPC.User user, float f2, float f3) {
    }

    @Override
    public final void m(wb2 wb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override
    public final void onScrollLimit(int i, int i2, int i3, boolean z) {
    }

    @Override
    public final void onScrollProgress(int i, int i2, int i3, int i4) {
    }

    @Override
    public final void q0(wb2 wb2Var, float f2, float f3, boolean z) {
    }

    @Override
    public final void z(wb2 wb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void H(wb2 wb2Var, int i, float f2, float f3, boolean z) {
    }

    @Override
    public final void V0(wb2 wb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    @Override
    public final void c1(wb2 wb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override
    public final void y(dl1 dl1Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    @Override
    public final void T1(wb2 wb2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    @Override
    public final void t1(r47 r47Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
