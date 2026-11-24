package defpackage;

import android.content.Context;
import android.graphics.RectF;
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
public final class ng1 implements mc2 {
    public final sg1 a;

    public ng1(sg1 sg1Var) {
        this.a = sg1Var;
    }

    @Override
    public final boolean A0(long j) {
        return false;
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
    public final void H(rc2 rc2Var, int i, float f, float f2, boolean z) {
        k47 k47Var = rc2Var.getMessageObject().C;
        long B0 = k47.B0(k47Var.k);
        vg1 vg1Var = this.a.n;
        if (B0 == (-vg1Var.f.id)) {
            for (int i2 = 0; i2 < vg1Var.p0.size(); i2++) {
                k47 k47Var2 = (k47) vg1Var.p0.get(i2);
                if (k47Var2 != null && k47Var2.U != 1 && k47Var2.L1() == k47Var.L1()) {
                    vg1Var.c1(k47Var2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", vg1Var.f.id);
        bundle.putInt("message_id", k47Var.L1());
        vg1Var.presentFragment(new yv1(bundle));
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
    public final void L0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        k47 messageObject = rc2Var.getMessageObject();
        vg1 vg1Var = this.a.n;
        if (vg1Var.q0.contains(Long.valueOf(messageObject.T))) {
            vg1Var.q0.remove(Long.valueOf(messageObject.T));
        } else {
            vg1Var.q0.add(Long.valueOf(messageObject.T));
        }
        vg1Var.a1(true);
        vg1Var.O0();
        vg1Var.F.f();
    }

    @Override
    public final void M(rc2 rc2Var, CharacterStyle characterStyle, boolean z) {
        TLRPC.WebPage webPage;
        vg1 vg1Var = this.a.n;
        if (characterStyle != null) {
            k47 messageObject = rc2Var.getMessageObject();
            if (characterStyle instanceof f6c) {
                f6c f6cVar = (f6c) characterStyle;
                gm.g(f6cVar.a.subSequence(f6cVar.b, f6cVar.c).toString());
                if (gm.C3()) {
                    Toast.makeText(vg1Var.getParentActivity(), jb6.M0(2131743879, null), 0).show();
                }
            } else if (characterStyle instanceof j6c) {
                Long A = Utilities.A(((j6c) characterStyle).getURL());
                long longValue = A.longValue();
                if (longValue > 0) {
                    TLRPC.User W1 = oc7.r1(vg1.o0(vg1Var)).W1(A);
                    if (W1 != null) {
                        oc7.r1(vg1.p0(vg1Var)).D3(W1, null, vg1Var, 0);
                        return;
                    }
                    return;
                }
                TLRPC.Chat L0 = oc7.r1(vg1.q0(vg1Var)).L0(Long.valueOf(-longValue));
                if (L0 != null) {
                    oc7.r1(vg1.r0(vg1Var)).D3(null, L0, vg1Var, 0);
                }
            } else if (characterStyle instanceof g6c) {
                String url = ((g6c) characterStyle).getURL();
                if (url.startsWith("@")) {
                    oc7.r1(vg1.s0(vg1Var)).C3(url.substring(1), vg1Var, 0, null);
                } else if (url.startsWith("#")) {
                    nk3 nk3Var = new nk3(null);
                    nk3Var.p2 = url;
                    vg1Var.presentFragment(nk3Var);
                }
            } else {
                String url2 = ((URLSpan) characterStyle).getURL();
                if (z) {
                    my0 i = wi8.i(vg1Var.getParentActivity(), false, 1, null);
                    i.P = url2;
                    i.Q = false;
                    CharSequence[] charSequenceArr = {jb6.M0(2131747550, null), jb6.M0(2131751704, null)};
                    ff ffVar = new ff(this, url2, (byte) 2);
                    i.M = charSequenceArr;
                    i.L = ffVar;
                    vg1Var.showDialog(i);
                } else if (characterStyle instanceof i6c) {
                    String url3 = ((i6c) characterStyle).getURL();
                    if (!l11.h(url3)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(vg1Var.getParentActivity());
                        String M0 = jb6.M0(2131747512, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M0;
                        heVar.U = jb6.a0(null, null, 2131747515, url3);
                        alertDialog$Builder.j(jb6.M0(2131747550, null), new g11(vg1Var, url3, (byte) 6));
                        alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                        vg1Var.showDialog(heVar);
                        return;
                    }
                    l11.q(vg1Var.getParentActivity(), url3, true);
                } else {
                    TLRPC.MessageMedia messageMedia = messageObject.k.media;
                    if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                        String lowerCase = url2.toLowerCase();
                        String lowerCase2 = messageObject.k.media.webpage.url.toLowerCase();
                        if ((l11.j(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                            LaunchActivity launchActivity = LaunchActivity.H1;
                            if (launchActivity != null && launchActivity.O() != null && LaunchActivity.H1.O().k(messageObject) != null) {
                                return;
                            }
                            vg1Var.createArticleViewer(false).L(messageObject, null, null, null);
                            return;
                        }
                    }
                    l11.q(vg1Var.getParentActivity(), url2, true);
                }
            }
        }
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
    public final void W(rc2 rc2Var, TLRPC.User user, float f, float f2) {
        if (user != null && user.id != z8c.h(vg1.l0(this.a.n)).e()) {
            a(user);
        }
    }

    @Override
    public final void W1(rc2 rc2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
        vg1 vg1Var = this.a.n;
        if (chat != null && chat != vg1Var.f) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (i != 0) {
                bundle.putInt("message_id", i);
            }
            if (oc7.r1(vg1.k0(vg1Var)).A(bundle, vg1Var, null, null)) {
                vg1Var.presentFragment(new yv1(bundle), true);
            }
        }
    }

    @Override
    public final boolean Y1(rc2 rc2Var, TLRPC.User user) {
        wc0 b;
        vg1 vg1Var = this.a.n;
        if (user != null && user.id != z8c.h(vg1.m0(vg1Var)).e()) {
            cd0[] cd0VarArr = {cd0.d, cd0.h};
            TLRPC.UserFull X1 = vg1Var.getMessagesController().X1(user.id);
            if (X1 != null) {
                b = wc0.c(user, X1, cd0VarArr);
            } else {
                b = wc0.b(user, vg1.n0(vg1Var), cd0VarArr);
            }
            if (yh4.l(b)) {
                yh4.t().J((ViewGroup) vg1Var.fragmentView, vg1Var.getResourceProvider(), b, new g11(this, rc2Var, user));
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean Z() {
        return false;
    }

    @Override
    public final void Z0(rc2 rc2Var) {
        boolean z;
        sg1 sg1Var = this.a;
        vg1 vg1Var = sg1Var.n;
        if (vg1Var.getParentActivity() == null) {
            return;
        }
        Context context = sg1Var.c;
        k47 messageObject = rc2Var.getMessageObject();
        if (sd2.T(vg1Var.f) && !vg1Var.f.megagroup) {
            z = true;
        } else {
            z = false;
        }
        vg1Var.showDialog(tca.G0(context, messageObject, null, z, null));
    }

    @Override
    public final boolean Z1(rc2 rc2Var) {
        return false;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        vg1 vg1Var = this.a.n;
        long j = user.id;
        int i = vg1.Q0;
        vg1Var.J0(bundle, j);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.B3(0);
        vg1Var.presentFragment(profileActivity);
    }

    @Override
    public final CharacterStyle a0(rc2 rc2Var) {
        return null;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean d0() {
        return true;
    }

    @Override
    public final void d2(rc2 rc2Var, float f, float f2) {
        vg1 vg1Var = this.a.n;
        int i = vg1.Q0;
        vg1Var.M0(rc2Var, 0.0f, 0.0f);
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final void i() {
        a.t();
        boolean z = e21.a;
        a.q();
        l11.u(this.a.n.getParentActivity(), e21.g);
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
    public final boolean n1(rc2 rc2Var, int i) {
        return false;
    }

    @Override
    public final boolean n2(rc2 rc2Var, k47 k47Var) {
        if (!k47.Q4(k47Var.k) && !k47Var.g4()) {
            if (!k47Var.I3()) {
                return false;
            }
            return MediaController.w().n0(this.a.n.p0, k47Var, 0L, true, null, 0L);
        }
        boolean R = MediaController.w().R(k47Var);
        MediaController.w().q0(null, false);
        return R;
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
    public final void r0(defpackage.rc2 r14, float r15, float r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ng1.r0(rc2, float, float, boolean):void");
    }

    @Override
    public final String t(long j) {
        return null;
    }

    @Override
    public final boolean t0(rc2 rc2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final void t1(rc2 rc2Var, int i) {
        TLRPC.WebPage webPage;
        vg1 vg1Var = this.a.n;
        k47 messageObject = rc2Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.L1;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -k47.B0(messageObject.k));
            bundle.putInt("message_id", messageObject.L1());
            yv1 yv1Var = new yv1(bundle);
            if (sd2.c0(vg1Var.f)) {
                no4.a(yv1Var, bf7.a(k47.B0(messageObject.k), k47.b2(vg1.t0(vg1Var), messageObject.k, true, false)));
            }
            vg1Var.presentFragment(yv1Var);
        } else if (i == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.k.media;
            if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().k(messageObject) == null) {
                    vg1Var.createArticleViewer(false).L(messageObject, null, null, null);
                }
            }
        } else if (i == 5) {
            TLRPC.User W1 = vg1Var.getMessagesController().W1(Long.valueOf(messageObject.k.media.user_id));
            TLRPC.MessageMedia messageMedia2 = messageObject.k.media;
            String str = messageMedia2.vcard;
            String str2 = messageMedia2.first_name;
            String str3 = messageMedia2.last_name;
            try {
                File f1 = gm.f1();
                f1.mkdirs();
                File file = new File(f1, "vcard.vcf");
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write(str);
                bufferedWriter.close();
                vg1Var.showDialog(new d68(vg1Var, null, W1, null, file, null, str2, str3, null));
            } catch (Exception e) {
                fc4.g(e, true);
            }
        } else {
            TLRPC.MessageMedia messageMedia3 = messageObject.k.media;
            if (messageMedia3 != null && messageMedia3.webpage != null) {
                l11.u(vg1Var.getParentActivity(), messageObject.k.media.webpage.url);
            }
        }
    }

    @Override
    public final void u(rc2 rc2Var, float f, float f2) {
        vg1 vg1Var = this.a.n;
        int i = vg1.Q0;
        vg1Var.M0(rc2Var, 0.0f, 0.0f);
    }

    @Override
    public final void w1(k47 k47Var, String str, String str2, String str3, String str4, int i, int i2) {
        vg1 vg1Var = this.a.n;
        zv3.I0(vg1Var, k47Var, vg1Var.C0, str2, str3, str4, str, i, i2, -1, false);
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
    public final void A(rc2 rc2Var) {
    }

    @Override
    public final void C1() {
    }

    @Override
    public final void F0(rc2 rc2Var) {
    }

    @Override
    public final void G(rc2 rc2Var) {
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
    public final void T0() {
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
    public final void c() {
    }

    @Override
    public final void e0(k47 k47Var) {
    }

    @Override
    public final void g2() {
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
    public final void o2() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void q1(h47 h47Var) {
    }

    @Override
    public final void q2(rc2 rc2Var) {
    }

    @Override
    public final void s0() {
    }

    @Override
    public final void y1(rc2 rc2Var) {
    }

    @Override
    public final void B1(rc2 rc2Var, ir0 ir0Var) {
    }

    @Override
    public final void D0(rc2 rc2Var, boolean z) {
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
    public final void m0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void o1(rc2 rc2Var, boolean z) {
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
    public final void N0(rc2 rc2Var, float f, float f2) {
    }

    @Override
    public final void i1(rc2 rc2Var, float f, float f2) {
    }

    @Override
    public final void l2(rc2 rc2Var, boolean z, boolean z2) {
    }

    @Override
    public final void o0(rc2 rc2Var, int i, int i2) {
    }

    @Override
    public final void u1(rc2 rc2Var, boolean z, boolean z2) {
    }

    @Override
    public final void m(rc2 rc2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override
    public final void z(rc2 rc2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void V0(rc2 rc2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
    }

    @Override
    public final void b1(rc2 rc2Var, ArrayList arrayList, int i, int i2, int i3) {
    }
}
