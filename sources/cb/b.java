package cb;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.text.style.CharacterStyle;
import android.util.Log;
import android.view.View;
import j$.util.DesugarCollections;
import j3.n0;
import java.nio.ShortBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.Executors;
import org.telegram.messenger.BotInlineKeyboard;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.j1;
import org.telegram.ui.Cells.m9;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Cells.t0;
import org.telegram.ui.Cells.v0;
import org.telegram.ui.Components.eg;
import org.telegram.ui.Components.ji;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.wg;
import org.telegram.ui.cv0;
import org.telegram.ui.pn;
import r3.v;
public class b implements b6.l, a3.b, e2.d, g9.a, jf.a, nf.a, o3.p, oe.b, eg, j1, t0, q4.l, r3.m, ra.m, ji, c9.f {
    public final int f2235a;

    public b(int i10) {
        this.f2235a = i10;
    }

    @Override
    public boolean B0(MessageObject messageObject) {
        return true;
    }

    @Override
    public boolean B1() {
        return false;
    }

    @Override
    public o3.o C(o3.m mVar, n0 n0Var) {
        return o3.o.f16257o;
    }

    @Override
    public void C0(wg wgVar) {
        wgVar.run();
    }

    @Override
    public m9 D2() {
        return null;
    }

    @Override
    public boolean F1() {
        return false;
    }

    public boolean F2(CharSequence charSequence) {
        return false;
    }

    @Override
    public TLRPC.TL_channels_sendAsPeers H() {
        return null;
    }

    @Override
    public boolean H0() {
        return true;
    }

    @Override
    public Object J(com.google.android.gms.common.api.q qVar) {
        return null;
    }

    @Override
    public boolean K1(s1 s1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public boolean M0(Context context) {
        return e0.b.m(context);
    }

    @Override
    public boolean M1() {
        return false;
    }

    @Override
    public boolean P(s1 s1Var, TLRPC.TodoItem todoItem, boolean z4) {
        return false;
    }

    @Override
    public oe.a P0(f7.b bVar) {
        return new ke.j(bVar);
    }

    @Override
    public int P1(int i10, int i11, int i12) {
        nf.a aVar;
        if (i11 == 6) {
            aVar = nf.a.f14948m;
        } else if (i11 > i12) {
            aVar = nf.a.f14945j;
        } else if (i11 < i12) {
            aVar = nf.a.f14946k;
        } else {
            aVar = nf.a.f14947l;
        }
        return aVar.P1(i10, i11, i12);
    }

    @Override
    public boolean Q() {
        return false;
    }

    @Override
    public boolean R(s1 s1Var) {
        return false;
    }

    @Override
    public boolean R0(long j10) {
        return false;
    }

    @Override
    public void R1(s1 s1Var, TLRPC.WebPage webPage, String str, boolean z4) {
        ze.d.s(s1Var.getContext(), str);
    }

    @Override
    public boolean S() {
        return false;
    }

    @Override
    public CharacterStyle S1(s1 s1Var) {
        return null;
    }

    @Override
    public p2 T0() {
        return null;
    }

    @Override
    public boolean U1(s1 s1Var, MessageObject messageObject) {
        return false;
    }

    @Override
    public int W() {
        return 0;
    }

    @Override
    public o3.j W1(o3.m mVar, n0 n0Var) {
        if (n0Var.F == null) {
            return null;
        }
        return new o3.t(new o3.i(new Exception(), 6001));
    }

    @Override
    public void X0(ShortBuffer shortBuffer, int i10, ShortBuffer shortBuffer2, int i11) {
        nf.a aVar;
        if (i10 == 6) {
            aVar = nf.a.f14948m;
        } else if (i10 > i11) {
            aVar = nf.a.f14945j;
        } else if (i10 < i11) {
            aVar = nf.a.f14946k;
        } else {
            aVar = nf.a.f14947l;
        }
        aVar.X0(shortBuffer, i10, shortBuffer2, i11);
    }

    @Override
    public boolean X1() {
        return false;
    }

    @Override
    public ug.a Z() {
        return null;
    }

    @Override
    public long a() {
        return 0L;
    }

    @Override
    public boolean a0(s1 s1Var) {
        return false;
    }

    @Override
    public long a1() {
        throw new NoSuchElementException();
    }

    @Override
    public boolean a2(s1 s1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean c0(s1 s1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public boolean c1(s1 s1Var, boolean z4) {
        return false;
    }

    @Override
    public cv0 c2() {
        return null;
    }

    @Override
    public long d() {
        return 0L;
    }

    @Override
    public Object d0(c5.j jVar) {
        switch (this.f2235a) {
            case 26:
                return new i();
            default:
                h hVar = (h) jVar.a(h.class);
                synchronized (h7.s.class) {
                    byte b10 = (byte) (((byte) 1) | 2);
                    if (b10 == 3) {
                        h7.s.b(new Object());
                    } else {
                        StringBuilder sb = new StringBuilder();
                        if ((b10 & 1) == 0) {
                            sb.append(" enableFirelog");
                        }
                        if ((b10 & 2) == 0) {
                            sb.append(" firelogEventType");
                        }
                        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
                    }
                }
                return new ab.a(0);
        }
    }

    @Override
    public v d2(int i10, int i11) {
        return new r3.j();
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public boolean e2(long j10) {
        return false;
    }

    @Override
    public boolean f() {
        switch (this.f2235a) {
            case 17:
                return true;
            default:
                return true;
        }
    }

    @Override
    public String g(s1 s1Var) {
        return null;
    }

    @Override
    public boolean g0() {
        return false;
    }

    @Override
    public int g1() {
        return 0;
    }

    @Override
    public boolean g2(s1 s1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public Object mo28get() {
        switch (this.f2235a) {
            case 4:
                h7.u uVar = new h7.u(7);
                HashMap hashMap = new HashMap();
                Set set = Collections.EMPTY_SET;
                if (set != null) {
                    hashMap.put(v2.d.f45624a, new e3.b(30000L, 86400000L, set));
                    if (set != null) {
                        hashMap.put(v2.d.f45626c, new e3.b(1000L, 86400000L, set));
                        if (set != null) {
                            Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(e3.c.f5090b)));
                            if (unmodifiableSet != null) {
                                hashMap.put(v2.d.f45625b, new e3.b(86400000L, 86400000L, unmodifiableSet));
                                if (hashMap.keySet().size() >= v2.d.values().length) {
                                    new HashMap();
                                    return new e3.a(uVar, hashMap);
                                }
                                throw new IllegalStateException("Not all priorities have been configured");
                            }
                            throw new NullPointerException("Null flags");
                        }
                        throw new NullPointerException("Null flags");
                    }
                    throw new NullPointerException("Null flags");
                }
                throw new NullPointerException("Null flags");
            default:
                return new j6.a(Executors.newSingleThreadExecutor());
        }
    }

    @Override
    public boolean h(Context context) {
        return e0.b.j(context);
    }

    @Override
    public boolean h0() {
        return false;
    }

    @Override
    public boolean h1(int i10, s1 s1Var) {
        return false;
    }

    @Override
    public TL_stories.StoryItem i1() {
        return null;
    }

    @Override
    public int k0(s1 s1Var) {
        return 0;
    }

    @Override
    public boolean k1(long j10) {
        return false;
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public void m0() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public boolean m1(MessageObject messageObject) {
        return org.telegram.ui.b.a(messageObject);
    }

    @Override
    public long n0() {
        throw new NoSuchElementException();
    }

    @Override
    public boolean n1() {
        return false;
    }

    @Override
    public boolean next() {
        return false;
    }

    @Override
    public int p() {
        return 0;
    }

    @Override
    public boolean p0() {
        return false;
    }

    @Override
    public void q2(Bundle bundle) {
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Skipping logging Crashlytics event to Firebase, no Firebase Analytics", null);
        }
    }

    @Override
    public TLRPC.Peer r() {
        return null;
    }

    @Override
    public void r0(int i10, Object obj) {
        String str;
        switch (i10) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
    }

    @Override
    public boolean r2(s1 s1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean t0(u5 u5Var) {
        return false;
    }

    @Override
    public boolean t1() {
        return false;
    }

    @Override
    public pn u0() {
        return null;
    }

    @Override
    public Object u2() {
        switch (this.f2235a) {
            case 22:
                return new ArrayDeque();
            default:
                return new LinkedHashMap();
        }
    }

    @Override
    public String w(long j10) {
        return null;
    }

    @Override
    public boolean w2(v0 v0Var, float f10, float f11) {
        return false;
    }

    @Override
    public int z(n0 n0Var) {
        if (n0Var.F != null) {
            return 1;
        }
        return 0;
    }

    @Override
    public boolean z2(int i10) {
        return false;
    }

    @Override
    public void A2() {
    }

    @Override
    public void B2() {
    }

    @Override
    public void D() {
    }

    @Override
    public void E0() {
    }

    @Override
    public void E1() {
    }

    @Override
    public void E2() {
    }

    @Override
    public void J1() {
    }

    @Override
    public void L0() {
    }

    @Override
    public void O0() {
    }

    @Override
    public void Q0() {
    }

    @Override
    public void V1() {
    }

    @Override
    public void X() {
    }

    @Override
    public void Y0() {
    }

    @Override
    public void b() {
    }

    @Override
    public void c() {
    }

    @Override
    public void i2() {
    }

    @Override
    public void j() {
    }

    @Override
    public void j1() {
    }

    @Override
    public void k() {
    }

    @Override
    public void n2() {
    }

    @Override
    public void o() {
    }

    @Override
    public void p1() {
    }

    @Override
    public void q0() {
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
    public void t2() {
    }

    @Override
    public void v() {
    }

    @Override
    public void v1() {
    }

    @Override
    public void v2() {
    }

    @Override
    public void w1() {
    }

    @Override
    public void x0() {
    }

    @Override
    public void x1() {
    }

    @Override
    public void z0() {
    }

    @Override
    public void A(s1 s1Var) {
    }

    @Override
    public void A1(CharSequence charSequence) {
    }

    @Override
    public void B(boolean z4) {
    }

    @Override
    public void C1(long j10) {
    }

    @Override
    public void D0(s1 s1Var) {
    }

    @Override
    public void D1(v0 v0Var) {
    }

    @Override
    public void F(s1 s1Var) {
    }

    @Override
    public void H1(s1 s1Var) {
    }

    @Override
    public void I(MessageObject.TextLayoutBlock textLayoutBlock) {
    }

    @Override
    public void I0(s1 s1Var) {
    }

    @Override
    public void K0(s1 s1Var) {
    }

    @Override
    public void L(s1 s1Var) {
    }

    @Override
    public void N0(s1 s1Var) {
    }

    @Override
    public void O(MessageObject messageObject) {
    }

    @Override
    public void O1(s1 s1Var) {
    }

    @Override
    public void Q1(MessageObject messageObject) {
    }

    @Override
    public void S0(s1 s1Var) {
    }

    @Override
    public void U(s1 s1Var) {
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
    public void d1(s1 s1Var) {
    }

    @Override
    public void e1(s1 s1Var) {
    }

    @Override
    public void f0(int i10) {
    }

    @Override
    public void f1(int i10) {
    }

    @Override
    public void h2(r3.s sVar) {
    }

    @Override
    public void j2(s1 s1Var) {
    }

    @Override
    public void k2(int i10) {
    }

    @Override
    public void l0(s1 s1Var) {
    }

    @Override
    public void n(s1 s1Var) {
    }

    @Override
    public void o0(v0 v0Var) {
    }

    @Override
    public void o1(TLRPC.User user) {
    }

    @Override
    public void o2(boolean z4) {
    }

    @Override
    public void q(s1 s1Var) {
    }

    @Override
    public void s0(String str) {
    }

    @Override
    public void s2(s1 s1Var) {
    }

    @Override
    public void t(s1 s1Var) {
    }

    @Override
    public void u(s1 s1Var) {
    }

    @Override
    public void w0(v0 v0Var) {
    }

    @Override
    public void x(float f10) {
    }

    @Override
    public void y(s1 s1Var) {
    }

    @Override
    public void E(s1 s1Var, BotInlineKeyboard.ButtonCustom buttonCustom) {
    }

    @Override
    public void I1(s1 s1Var, boolean z4) {
    }

    @Override
    public void J0(int i10, int i11) {
    }

    @Override
    public void K(float f10, int i10) {
    }

    @Override
    public void L1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void M(s1 s1Var, jh.f fVar) {
    }

    @Override
    public void N(int i10, s1 s1Var) {
    }

    @Override
    public void U0(int i10, s1 s1Var) {
    }

    @Override
    public void V(v0 v0Var, int i10) {
    }

    @Override
    public void W0(s1 s1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void Y1(s1 s1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void e0(Looper looper, k3.k kVar) {
    }

    @Override
    public void l2(s1 s1Var, long j10) {
    }

    @Override
    public void m2(v0 v0Var, String str) {
    }

    @Override
    public void r1(s1 s1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void u1(s1 s1Var, TLRPC.Document document) {
    }

    @Override
    public void C2(s1 s1Var, int i10, int i11) {
    }

    @Override
    public void F0(s1 s1Var, TLObject tLObject, boolean z4) {
    }

    @Override
    public void G0(s1 s1Var, float f10, float f11) {
    }

    @Override
    public void N1(v0 v0Var, TLRPC.TL_premiumGiftOption tL_premiumGiftOption, String str) {
    }

    @Override
    public void b1(s1 s1Var, CharacterStyle characterStyle, boolean z4) {
    }

    @Override
    public void i0(s1 s1Var, float f10, float f11) {
    }

    @Override
    public void j0(v0 v0Var, int i10, int i11) {
    }

    @Override
    public void l1(v0 v0Var, TLRPC.Document document, TLRPC.VideoSize videoSize) {
    }

    @Override
    public void q1(CharSequence charSequence, boolean z4, boolean z10) {
    }

    @Override
    public void v0(s1 s1Var, float f10, float f11) {
    }

    @Override
    public void y1(View view, CharSequence charSequence, boolean z4) {
    }

    @Override
    public void z1(s1 s1Var, float f10, float f11) {
    }

    @Override
    public void A0(s1 s1Var, float f10, float f11, boolean z4) {
    }

    @Override
    public void Z1(s1 s1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void m(s1 s1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i10) {
    }

    @Override
    public void y0(s1 s1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void G(CharSequence charSequence, boolean z4, int i10, int i11, long j10) {
    }

    @Override
    public void f2(s1 s1Var, int i10, float f10, float f11, boolean z4) {
    }

    @Override
    public void i(s1 s1Var, ArrayList arrayList, int i10, int i11, int i12) {
    }

    @Override
    public void x2(s1 s1Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override
    public void y2(v0 v0Var, TLRPC.ReactionCount reactionCount, boolean z4, float f10, float f11) {
    }

    @Override
    public void T(s1 s1Var, TLRPC.Chat chat, int i10, float f10, float f11, boolean z4) {
    }

    @Override
    public void p2(int i10, int i11, int i12, long j10, long j11, boolean z4) {
    }

    @Override
    public void T1(MessageObject messageObject, String str, String str2, String str3, String str4, int i10, int i11) {
    }

    @Override
    public void b2(ArrayList arrayList, CharSequence charSequence, boolean z4, int i10, int i11, long j10, boolean z10, long j11) {
    }

    @Override
    public void G1(int i10, boolean z4, boolean z10, int i11, int i12, long j10, boolean z11, boolean z12, long j11) {
    }
}
