package kb;

import ae.j;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaDrmException;
import android.net.Uri;
import android.text.style.CharacterStyle;
import android.util.Log;
import c3.b0;
import c3.k0;
import c3.q;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import e2.l0;
import ea.b;
import ea.c;
import ea.e;
import g2.g;
import g2.h;
import gf.f;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.ref.ReferenceQueue;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l.l;
import l.x;
import m2.t;
import n2.o;
import n2.p;
import org.json.JSONObject;
import org.telegram.messenger.d20;
import org.telegram.messenger.hj;
import org.telegram.messenger.kj;
import org.telegram.messenger.s2;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.l9;
import org.telegram.ui.Cells.q0;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.s0;
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.ja;
import org.telegram.ui.Components.la;
import org.telegram.ui.Components.ma;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.tf;
import org.telegram.ui.Components.ya;
import org.telegram.ui.Components.za;
import org.telegram.ui.ps0;
import r2.u;
import r9.d;
import y2.n;
public class a implements ai, q, e, g, d, OnFailureListener, n, x, n2.q, ab, l1, q0, u, uf.a, vf.a, Continuation, y6.d {
    public final int f10963a;

    public a(int i10) {
        this.f10963a = i10;
    }

    public static c O1(t7.u uVar) {
        return new c(System.currentTimeMillis() + 3600000, new j(8), new b(true, false, false), 10.0d, 1.2d, 60);
    }

    public static boolean Q1(q1.b r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: kb.a.Q1(q1.b, android.text.Editable, int, int, boolean):boolean");
    }

    @Override
    public boolean A1(q1 q1Var, kj kjVar) {
        return false;
    }

    @Override
    public boolean B(l lVar) {
        return false;
    }

    @Override
    public void C(mg mgVar) {
        mgVar.run();
    }

    @Override
    public boolean D() {
        return false;
    }

    @Override
    public boolean E1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public ps0 H1() {
        return null;
    }

    @Override
    public boolean I0(long j10) {
        return false;
    }

    @Override
    public k0 I1(int i10, int i11) {
        return new c3.n();
    }

    @Override
    public Object K(bh.d dVar) {
        jb.a aVar = new jb.a();
        androidx.emoji2.text.n nVar = new androidx.emoji2.text.n(2);
        ReferenceQueue referenceQueue = aVar.f9775a;
        Set set = aVar.f9776b;
        set.add(new jb.l(aVar, referenceQueue, set, nVar));
        Thread thread = new Thread(new j9.u(18, referenceQueue, set), "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    @Override
    public boolean K1(long j10) {
        return false;
    }

    @Override
    public void L(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11, int i12) {
        if (i10 >= i11) {
            if (i12 != 1 && i12 != 2) {
                throw new IllegalArgumentException(i0.a.i(i12, "Illegal use of DownsampleAudioResampler. Channels:"));
            }
            int remaining = shortBuffer.remaining() / i12;
            int ceil = (int) Math.ceil((i11 / i10) * remaining);
            int i13 = remaining - ceil;
            float f7 = ceil;
            float f10 = f7 / f7;
            float f11 = i13;
            float f12 = f11 / f11;
            while (ceil > 0 && i13 > 0) {
                if (f10 >= f12) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i12 == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    ceil--;
                    f10 = ceil / f7;
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
    public boolean M0(q1 q1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean N1(q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public boolean P(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public byte[] P0(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public boolean R(q1 q1Var) {
        return false;
    }

    public boolean R1(CharSequence charSequence) {
        return false;
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public boolean S0(kj kjVar) {
        return f1.a(kjVar);
    }

    @Override
    public boolean T0(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override
    public boolean V(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        if ("secure-playback".equals(str) && "video/avc".equals(str2)) {
            return true;
        }
        return false;
    }

    @Override
    public int V0() {
        return MediaCodecList.getCodecCount();
    }

    @Override
    public int W() {
        return 0;
    }

    @Override
    public boolean W1(q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public h2.b X(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public void X0(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public zg.a Y() {
        return null;
    }

    @Override
    public o Y0(byte[] bArr, List list, int i10, HashMap hashMap) {
        throw new IllegalStateException();
    }

    @Override
    public boolean Z(q1 q1Var) {
        return false;
    }

    @Override
    public long a() {
        return 0L;
    }

    @Override
    public boolean a0(q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean a1() {
        return false;
    }

    @Override
    public long b() {
        return 0L;
    }

    @Override
    public byte[] b0() {
        throw new MediaDrmException("Attempting to open a session using a dummy ExoMediaDrm.");
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public boolean c2(int i10) {
        return false;
    }

    @Override
    public h createDataSource() {
        return new g2.c(false);
    }

    @Override
    public MediaCodecInfo d(int i10) {
        return MediaCodecList.getCodecInfoAt(i10);
    }

    @Override
    public boolean d0() {
        return false;
    }

    @Override
    public int d1() {
        return 1;
    }

    @Override
    public a3.l e(Context context, String str, y6.c cVar) {
        a3.l lVar = new a3.l();
        int p02 = cVar.p0(context, str, true);
        lVar.f140b = p02;
        if (p02 != 0) {
            lVar.f141c = 1;
            return lVar;
        }
        int x12 = cVar.x1(context, str);
        lVar.f139a = x12;
        if (x12 != 0) {
            lVar.f141c = -1;
        }
        return lVar;
    }

    @Override
    public boolean f() {
        switch (this.f10963a) {
            case 15:
                return true;
            default:
                return true;
        }
    }

    @Override
    public int f0(q1 q1Var) {
        return 0;
    }

    @Override
    public Object g1(Uri uri, g2.l lVar) {
        return Long.valueOf(l0.V(new BufferedReader(new InputStreamReader(lVar)).readLine()));
    }

    @Override
    public l9 g2() {
        return null;
    }

    @Override
    public String h(q1 q1Var) {
        return null;
    }

    @Override
    public k2 h0() {
        return null;
    }

    @Override
    public c h1(t7.u uVar, JSONObject jSONObject) {
        return O1(uVar);
    }

    @Override
    public boolean i0() {
        return false;
    }

    @Override
    public boolean i1(s0 s0Var, float f7, float f10) {
        return false;
    }

    @Override
    public boolean j1() {
        return false;
    }

    @Override
    public Map k(byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public boolean k1(q1 q1Var, int i10) {
        return false;
    }

    @Override
    public void m(bb bbVar, la laVar, ja jaVar, ma maVar) {
        o1.j jVar = new o1.j(bbVar, bb.IN_OUT_OFFSET_Y, bbVar.getHeight());
        jVar.f13958m.a(0.8f);
        jVar.f13958m.b(400.0f);
        jVar.a(new na(jaVar, 1));
        jVar.b(new ya(maVar, bbVar, 0));
        jVar.h();
        laVar.run();
    }

    @Override
    public boolean m0(o5 o5Var) {
        return false;
    }

    @Override
    public boolean o1() {
        return false;
    }

    @Override
    public void onFailure(Exception exc) {
        Log.e("OptionalModuleUtils", "Failed to check feature availability", exc);
    }

    @Override
    public void p0(bb bbVar, la laVar, tf tfVar, gl glVar) {
        bbVar.setInOutOffset(bbVar.getMeasuredHeight());
        glVar.accept(Float.valueOf(bbVar.getTranslationY()));
        o1.j jVar = new o1.j((Object) bbVar, bb.IN_OUT_OFFSET_Y, 0.0f);
        jVar.f13958m.a(0.8f);
        jVar.f13958m.b(400.0f);
        jVar.a(new za(0, bbVar, tfVar));
        jVar.b(new ya(glVar, bbVar, 1));
        jVar.h();
        laVar.run();
    }

    @Override
    public boolean p1(q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public void q0(byte[] bArr, byte[] bArr2) {
        throw new IllegalStateException();
    }

    @Override
    public boolean r1() {
        return false;
    }

    @Override
    public int t1(int i10, int i11, int i12) {
        return (i10 / i11) * i12;
    }

    @Override
    public Object then(Task task) {
        return null;
    }

    @Override
    public p u() {
        throw new IllegalStateException();
    }

    @Override
    public void u0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        if (i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("Output must be 2 or 1 channels");
        }
        int min = Math.min(shortBuffer.remaining() / i10, shortBuffer2.remaining() / i11);
        for (int i12 = 0; i12 < min; i12++) {
            short s10 = shortBuffer.get();
            short s11 = shortBuffer.get();
            shortBuffer.position(shortBuffer.position() + 4);
            if (i11 == 2) {
                shortBuffer2.put(s10);
                shortBuffer2.put(s11);
            } else if (i11 == 1) {
                shortBuffer2.put(hb.a.B0(s10, s11));
            }
        }
    }

    @Override
    public boolean w0(kj kjVar) {
        return true;
    }

    @Override
    public void w1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        f.r(q1Var.getContext(), str);
    }

    @Override
    public String x(long j10) {
        return null;
    }

    @Override
    public boolean x1(String str, byte[] bArr) {
        throw new IllegalStateException();
    }

    @Override
    public CharacterStyle y1(q1 q1Var) {
        return null;
    }

    @Override
    public void B1() {
    }

    @Override
    public void N() {
    }

    @Override
    public void Q0() {
    }

    @Override
    public void U0() {
    }

    @Override
    public void Z1() {
    }

    @Override
    public void e2() {
    }

    @Override
    public void j() {
    }

    @Override
    public void j0() {
    }

    @Override
    public void o() {
    }

    @Override
    public void release() {
    }

    @Override
    public void s() {
    }

    @Override
    public void y0() {
    }

    @Override
    public void A(q1 q1Var) {
    }

    @Override
    public void B0(byte[] bArr) {
    }

    @Override
    public void C0(q1 q1Var) {
    }

    @Override
    public void E0(long j10) {
    }

    @Override
    public void F(s0 s0Var) {
    }

    @Override
    public void F0(q1 q1Var) {
    }

    @Override
    public void G0(s0 s0Var) {
    }

    @Override
    public void G1(b0 b0Var) {
    }

    @Override
    public void H(q1 q1Var) {
    }

    @Override
    public void I(s0 s0Var) {
    }

    @Override
    public void J(hj hjVar) {
    }

    @Override
    public void J0(q1 q1Var) {
    }

    @Override
    public void M(q1 q1Var) {
    }

    @Override
    public void N0(q1 q1Var) {
    }

    @Override
    public void O(kj kjVar) {
    }

    @Override
    public void O0(q1 q1Var) {
    }

    @Override
    public void P1(q1 q1Var) {
    }

    @Override
    public void U(q1 q1Var) {
    }

    @Override
    public void X1(q1 q1Var) {
    }

    @Override
    public void c0(int i10) {
    }

    @Override
    public void g0(q1 q1Var) {
    }

    @Override
    public void k0(TLRPC.TL_chatInviteExported tL_chatInviteExported) {
    }

    @Override
    public void l0(String str) {
    }

    @Override
    public void m1(q1 q1Var) {
    }

    @Override
    public void n(q1 q1Var) {
    }

    @Override
    public void n0(Object obj) {
    }

    @Override
    public void q(q1 q1Var) {
    }

    @Override
    public void t(q1 q1Var) {
    }

    @Override
    public void u1(q1 q1Var) {
    }

    @Override
    public void v(q1 q1Var) {
    }

    @Override
    public void v0(TLRPC.User user) {
    }

    @Override
    public void v1(kj kjVar) {
    }

    @Override
    public void w(s0 s0Var) {
    }

    @Override
    public void x0(q1 q1Var) {
    }

    @Override
    public void y(t tVar) {
    }

    @Override
    public void z(q1 q1Var) {
    }

    @Override
    public void C1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void F1(q1 q1Var, d20 d20Var) {
    }

    @Override
    public void G(q1 q1Var, s2 s2Var) {
    }

    @Override
    public void J1(String str, String str2) {
    }

    @Override
    public void K0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void S1(q1 q1Var, long j10) {
    }

    @Override
    public void W0(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void Z0(q1 q1Var, TLRPC.Document document) {
    }

    @Override
    public void c1(q1 q1Var, int i10) {
    }

    @Override
    public void e1(s0 s0Var, String str) {
    }

    @Override
    public void g(l lVar, boolean z10) {
    }

    @Override
    public void n1(q1 q1Var, boolean z10) {
    }

    @Override
    public void p(byte[] bArr, j2.l lVar) {
    }

    @Override
    public void q1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void r(s0 s0Var, int i10) {
    }

    @Override
    public void s1(q1 q1Var, int i10) {
    }

    @Override
    public void A0(q1 q1Var, float f7, float f10) {
    }

    @Override
    public void D0(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void E(s0 s0Var, int i10, int i11) {
    }

    @Override
    public void L0(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void R0(s0 s0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public void e0(q1 q1Var, float f7, float f10) {
    }

    @Override
    public void f1(q1 q1Var, float f7, float f10) {
    }

    @Override
    public void f2(q1 q1Var, int i10, int i11) {
    }

    @Override
    public void l1(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void o0(q1 q1Var, float f7, float f10) {
    }

    @Override
    public void t0(s0 s0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public void z0(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void D1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void l(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void r0(q1 q1Var, TLRPC.User user, float f7, float f10) {
    }

    @Override
    public void s0(q1 q1Var, float f7, float f10, boolean z10) {
    }

    @Override
    public void L1(q1 q1Var, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void M1(s0 s0Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void b2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f7, float f10) {
    }

    @Override
    public void i(q1 q1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void T(q1 q1Var, TLRPC.Chat chat, int i10, float f7, float f10, boolean z10) {
    }

    @Override
    public void b1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i10, int i11, long j10, boolean z11, long j11) {
    }

    @Override
    public void z1(kj kjVar, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override
    public void H0(int i10, boolean z10, boolean z11, int i11, int i12, long j10, boolean z12, boolean z13, long j11) {
    }
}
