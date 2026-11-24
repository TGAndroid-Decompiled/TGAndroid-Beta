package defpackage;

import android.content.Context;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.view.ViewGroup;
import android.widget.Toast;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class ff1 implements bb2 {
    public final kf1 a;

    public ff1(kf1 kf1Var) {
        this.a = kf1Var;
    }

    @Override
    public final boolean A1(gb2 gb2Var, int i) {
        return false;
    }

    @Override
    public final boolean B2(gb2 gb2Var, k27 k27Var) {
        if (!k27.Q4(k27Var.k) && !k27Var.g4()) {
            if (!k27Var.I3()) {
                return false;
            }
            return MediaController.w().n0(this.a.n.p0, k27Var, 0L, true, null, 0L);
        }
        boolean R = MediaController.w().R(k27Var);
        MediaController.w().q0(null, false);
        return R;
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
    public final boolean F(gb2 gb2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean F0(gb2 gb2Var) {
        return false;
    }

    @Override
    public final void F1(gb2 gb2Var, int i) {
        TLRPC.WebPage webPage;
        nf1 nf1Var = this.a.n;
        k27 messageObject = gb2Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.L1;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -k27.B0(messageObject.k));
            bundle.putInt("message_id", messageObject.L1());
            mu1 mu1Var = new mu1(bundle);
            if (hc2.c0(nf1Var.f)) {
                mm4.a(mu1Var, zc7.a(k27.B0(messageObject.k), k27.b2(nf1.s0(nf1Var), messageObject.k, true, false)));
            }
            nf1Var.presentFragment(mu1Var);
        } else if (i == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.k.media;
            if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().k(messageObject) == null) {
                    nf1Var.createArticleViewer(false).L(messageObject, null, null, null);
                }
            }
        } else if (i == 5) {
            TLRPC.User V1 = nf1Var.getMessagesController().V1(Long.valueOf(messageObject.k.media.user_id));
            TLRPC.MessageMedia messageMedia2 = messageObject.k.media;
            String str = messageMedia2.vcard;
            String str2 = messageMedia2.first_name;
            String str3 = messageMedia2.last_name;
            try {
                File f1 = gl.f1();
                f1.mkdirs();
                File file = new File(f1, "vcard.vcf");
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write(str);
                bufferedWriter.close();
                nf1Var.showDialog(new b48(nf1Var, null, V1, null, file, null, str2, str3, null));
            } catch (Exception e) {
                fa4.g(e, true);
            }
        } else {
            TLRPC.MessageMedia messageMedia3 = messageObject.k.media;
            if (messageMedia3 != null && messageMedia3.webpage != null) {
                d01.t(nf1Var.getParentActivity(), messageObject.k.media.webpage.url);
            }
        }
    }

    @Override
    public final void I1(k27 k27Var, String str, String str2, String str3, String str4, int i, int i2) {
        nf1 nf1Var = this.a.n;
        ou3.I0(nf1Var, k27Var, nf1Var.C0, str2, str3, str4, str, i, i2, -1, false);
    }

    @Override
    public final boolean J0(long j) {
        return false;
    }

    @Override
    public final void K1(gb2 gb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        d01.t(gb2Var.getContext(), str);
    }

    @Override
    public final void M(gb2 gb2Var, int i, float f, float f2, boolean z) {
        k27 k27Var = gb2Var.getMessageObject().C;
        long B0 = k27.B0(k27Var.k);
        nf1 nf1Var = this.a.n;
        if (B0 == (-nf1Var.f.id)) {
            for (int i2 = 0; i2 < nf1Var.p0.size(); i2++) {
                k27 k27Var2 = (k27) nf1Var.p0.get(i2);
                if (k27Var2 != null && k27Var2.U != 1 && k27Var2.L1() == k27Var.L1()) {
                    nf1Var.b1(k27Var2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", nf1Var.f.id);
        bundle.putInt("message_id", k27Var.L1());
        nf1Var.presentFragment(new mu1(bundle));
    }

    @Override
    public final boolean N() {
        return false;
    }

    @Override
    public final boolean N1() {
        return false;
    }

    @Override
    public final void O(gb2 gb2Var, CharacterStyle characterStyle, boolean z) {
        TLRPC.WebPage webPage;
        nf1 nf1Var = this.a.n;
        if (characterStyle != null) {
            k27 messageObject = gb2Var.getMessageObject();
            if (characterStyle instanceof f4c) {
                f4c f4cVar = (f4c) characterStyle;
                gl.g(f4cVar.a.subSequence(f4cVar.b, f4cVar.c).toString());
                if (gl.D3()) {
                    Toast.makeText(nf1Var.getParentActivity(), k96.M0(2131743953, null), 0).show();
                }
            } else if (characterStyle instanceof j4c) {
                Long A = Utilities.A(((j4c) characterStyle).getURL());
                long longValue = A.longValue();
                if (longValue > 0) {
                    TLRPC.User V1 = na7.q1(nf1.n0(nf1Var)).V1(A);
                    if (V1 != null) {
                        na7.q1(nf1.o0(nf1Var)).A3(V1, null, nf1Var, 0);
                        return;
                    }
                    return;
                }
                TLRPC.Chat K0 = na7.q1(nf1.p0(nf1Var)).K0(Long.valueOf(-longValue));
                if (K0 != null) {
                    na7.q1(nf1.q0(nf1Var)).A3(null, K0, nf1Var, 0);
                }
            } else if (characterStyle instanceof g4c) {
                String url = ((g4c) characterStyle).getURL();
                if (url.startsWith("@")) {
                    na7.q1(nf1.r0(nf1Var)).z3(url.substring(1), nf1Var, 0, null);
                } else if (url.startsWith("#")) {
                    cj3 cj3Var = new cj3(null);
                    cj3Var.p2 = url;
                    nf1Var.presentFragment(cj3Var);
                }
            } else {
                String url2 = ((URLSpan) characterStyle).getURL();
                if (z) {
                    fx0 i = ug8.i(nf1Var.getParentActivity(), false, 1, null);
                    i.P = url2;
                    i.Q = false;
                    CharSequence[] charSequenceArr = {k96.M0(2131747624, null), k96.M0(2131751755, null)};
                    fe feVar = new fe(this, url2, (byte) 2);
                    i.M = charSequenceArr;
                    i.L = feVar;
                    nf1Var.showDialog(i);
                } else if (characterStyle instanceof i4c) {
                    String url3 = ((i4c) characterStyle).getURL();
                    if (!d01.g(Uri.parse(url3), false, null)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(nf1Var.getParentActivity());
                        String M0 = k96.M0(2131747586, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        hdVar.U = k96.a0(null, null, 2131747589, url3);
                        alertDialog$Builder.j(k96.M0(2131747624, null), new q31(nf1Var, url3, (byte) 5));
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        nf1Var.showDialog(hdVar);
                        return;
                    }
                    d01.p(nf1Var.getParentActivity(), url3, true);
                } else {
                    TLRPC.MessageMedia messageMedia = messageObject.k.media;
                    if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                        String lowerCase = url2.toLowerCase();
                        String lowerCase2 = messageObject.k.media.webpage.url.toLowerCase();
                        if ((d01.i(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                            LaunchActivity launchActivity = LaunchActivity.H1;
                            if (launchActivity != null && launchActivity.O() != null && LaunchActivity.H1.O().k(messageObject) != null) {
                                return;
                            }
                            nf1Var.createArticleViewer(false).L(messageObject, null, null, null);
                            return;
                        }
                    }
                    d01.p(nf1Var.getParentActivity(), url2, true);
                }
            }
        }
    }

    @Override
    public final boolean P() {
        return false;
    }

    @Override
    public final int Q() {
        return 0;
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
    public final int U(gb2 gb2Var) {
        return 0;
    }

    @Override
    public final void V0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        k27 messageObject = gb2Var.getMessageObject();
        nf1 nf1Var = this.a.n;
        if (nf1Var.q0.contains(Long.valueOf(messageObject.T))) {
            nf1Var.q0.remove(Long.valueOf(messageObject.T));
        } else {
            nf1Var.q0.add(Long.valueOf(messageObject.T));
        }
        nf1Var.Z0(true);
        nf1Var.N0();
        nf1Var.F.f();
    }

    @Override
    public final vu1 W() {
        return null;
    }

    @Override
    public final ma8 Z1() {
        return null;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        nf1 nf1Var = this.a.n;
        long j = user.id;
        int i = nf1.Q0;
        nf1Var.I0(bundle, j);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.x3(0);
        nf1Var.presentFragment(profileActivity);
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final void b0(gb2 gb2Var, TLRPC.User user, float f, float f2) {
        if (user != null && user.id != y6c.h(nf1.k0(this.a.n)).e()) {
            a(user);
        }
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
    public final boolean d0() {
        return false;
    }

    @Override
    public final CharacterStyle e0(gb2 gb2Var) {
        return null;
    }

    @Override
    public final boolean g2(k27 k27Var) {
        return true;
    }

    @Override
    public final boolean h0() {
        return true;
    }

    @Override
    public final boolean h1(gb2 gb2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final void i2(gb2 gb2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
        nf1 nf1Var = this.a.n;
        if (chat != null && chat != nf1Var.f) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (i != 0) {
                bundle.putInt("message_id", i);
            }
            if (na7.q1(nf1.j0(nf1Var)).A(bundle, nf1Var, null, null)) {
                nf1Var.presentFragment(new mu1(bundle), true);
            }
        }
    }

    @Override
    public final boolean k2(gb2 gb2Var, TLRPC.User user) {
        wb0 b;
        nf1 nf1Var = this.a.n;
        if (user != null && user.id != y6c.h(nf1.l0(nf1Var)).e()) {
            cc0[] cc0VarArr = {cc0.d, cc0.h};
            TLRPC.UserFull W1 = nf1Var.getMessagesController().W1(user.id);
            if (W1 != null) {
                b = wb0.c(user, W1, cc0VarArr);
            } else {
                b = wb0.b(user, nf1.m0(nf1Var), cc0VarArr);
            }
            if (xf4.i(b)) {
                xf4.t().J((ViewGroup) nf1Var.fragmentView, nf1Var.getResourceProvider(), b, new q31(this, gb2Var, user));
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean l() {
        return true;
    }

    @Override
    public final boolean l2(gb2 gb2Var) {
        return false;
    }

    @Override
    public final void p() {
        a.t();
        boolean z = w01.a;
        a.q();
        d01.t(this.a.n.getParentActivity(), w01.g);
    }

    @Override
    public final void q1(gb2 gb2Var) {
        boolean z;
        kf1 kf1Var = this.a;
        nf1 nf1Var = kf1Var.n;
        if (nf1Var.getParentActivity() == null) {
            return;
        }
        Context context = kf1Var.c;
        k27 messageObject = gb2Var.getMessageObject();
        if (hc2.T(nf1Var.f) && !nf1Var.f.megagroup) {
            z = true;
        } else {
            z = false;
        }
        nf1Var.showDialog(taa.G0(context, messageObject, null, z, null));
    }

    @Override
    public final boolean r0(gb2 gb2Var, boolean z) {
        return false;
    }

    @Override
    public final void s2(gb2 gb2Var, float f, float f2) {
        nf1 nf1Var = this.a.n;
        int i = nf1.Q0;
        nf1Var.L0(gb2Var, 0.0f, 0.0f);
    }

    @Override
    public final boolean w0(gb2 gb2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final String x(long j) {
        return null;
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
    public final void z(gb2 gb2Var, float f, float f2) {
        nf1 nf1Var = this.a.n;
        int i = nf1.Q0;
        nf1Var.L0(gb2Var, 0.0f, 0.0f);
    }

    @Override
    public final void z0(defpackage.gb2 r14, float r15, float r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ff1.z0(gb2, float, float, boolean):void");
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
    public final void t() {
    }

    @Override
    public final void u2() {
    }

    @Override
    public final void D1(h27 h27Var) {
    }

    @Override
    public final void E(gb2 gb2Var) {
    }

    @Override
    public final void H2(gb2 gb2Var) {
    }

    @Override
    public final void I(gb2 gb2Var) {
    }

    @Override
    public final void M1(gb2 gb2Var) {
    }

    @Override
    public final void N0(gb2 gb2Var) {
    }

    @Override
    public final void S(gb2 gb2Var) {
    }

    @Override
    public final void V(gb2 gb2Var) {
    }

    @Override
    public final void X(k27 k27Var) {
    }

    @Override
    public final void X0(gb2 gb2Var) {
    }

    @Override
    public final void X1(gb2 gb2Var) {
    }

    @Override
    public final void Y1(gb2 gb2Var) {
    }

    @Override
    public final void c0(int i) {
    }

    @Override
    public final void c1(gb2 gb2Var) {
    }

    @Override
    public final void e2(gb2 gb2Var) {
    }

    @Override
    public final void i0(k27 k27Var) {
    }

    @Override
    public final void k0(String str) {
    }

    @Override
    public final void l1(gb2 gb2Var) {
    }

    @Override
    public final void n1(gb2 gb2Var) {
    }

    @Override
    public final void q(gb2 gb2Var) {
    }

    @Override
    public final void q0(gb2 gb2Var) {
    }

    @Override
    public final void v2(gb2 gb2Var) {
    }

    @Override
    public final void x1(gb2 gb2Var) {
    }

    @Override
    public final void C1(gb2 gb2Var, boolean z) {
    }

    @Override
    public final void E0(gb2 gb2Var, long j) {
    }

    @Override
    public final void M0(gb2 gb2Var, boolean z) {
    }

    @Override
    public final void O1(gb2 gb2Var, iq0 iq0Var) {
    }

    @Override
    public final void Y(gb2 gb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
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
    public final void l0(gb2 gb2Var, int i) {
    }

    @Override
    public final void u0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void G1(gb2 gb2Var, boolean z, boolean z2) {
    }

    @Override
    public final void H(gb2 gb2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void W1(gb2 gb2Var, TLObject tLObject, boolean z) {
    }

    @Override
    public final void Y0(gb2 gb2Var, float f, float f2) {
    }

    @Override
    public final void v0(gb2 gb2Var, int i, int i2) {
    }

    @Override
    public final void v1(gb2 gb2Var, float f, float f2) {
    }

    @Override
    public final void x2(gb2 gb2Var, boolean z, boolean z2) {
    }

    @Override
    public final void D(gb2 gb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void s(gb2 gb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override
    public final void m1(gb2 gb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
    }

    @Override
    public final void r1(gb2 gb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }
}
