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
public final class of1 implements rb2 {
    public final tf1 a;

    public of1(tf1 tf1Var) {
        this.a = tf1Var;
    }

    @Override
    public final boolean A1(hm hmVar) {
        return false;
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
    public final void H(wb2 wb2Var, int i, float f, float f2, boolean z) {
        r47 r47Var = wb2Var.getMessageObject().C;
        long B0 = r47.B0(r47Var.k);
        wf1 wf1Var = this.a.n;
        if (B0 == (-wf1Var.f.id)) {
            for (int i2 = 0; i2 < wf1Var.p0.size(); i2++) {
                r47 r47Var2 = (r47) wf1Var.p0.get(i2);
                if (r47Var2 != null && r47Var2.U != 1 && r47Var2.L1() == r47Var.L1()) {
                    wf1Var.c1(r47Var2);
                    return;
                }
            }
        }
        Bundle bundle = new Bundle();
        bundle.putLong("chat_id", wf1Var.f.id);
        bundle.putInt("message_id", r47Var.L1());
        wf1Var.presentFragment(new zu1(bundle));
    }

    @Override
    public final void I0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
        r47 messageObject = wb2Var.getMessageObject();
        wf1 wf1Var = this.a.n;
        if (wf1Var.q0.contains(Long.valueOf(messageObject.T))) {
            wf1Var.q0.remove(Long.valueOf(messageObject.T));
        } else {
            wf1Var.q0.add(Long.valueOf(messageObject.T));
        }
        wf1Var.a1(true);
        wf1Var.O0();
        wf1Var.F.f();
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
    public final void L(wb2 wb2Var, CharacterStyle characterStyle, boolean z) {
        TLRPC.WebPage webPage;
        wf1 wf1Var = this.a.n;
        if (characterStyle != null) {
            r47 messageObject = wb2Var.getMessageObject();
            if (characterStyle instanceof e8c) {
                e8c e8cVar = (e8c) characterStyle;
                hl.g(e8cVar.a.subSequence(e8cVar.b, e8cVar.c).toString());
                if (hl.C3()) {
                    Toast.makeText(wf1Var.getParentActivity(), ob6.M0(2131743847, null), 0).show();
                }
            } else if (characterStyle instanceof i8c) {
                Long A = Utilities.A(((i8c) characterStyle).getURL());
                long longValue = A.longValue();
                if (longValue > 0) {
                    TLRPC.User X1 = uc7.s1(wf1.f0(wf1Var)).X1(A);
                    if (X1 != null) {
                        uc7.s1(wf1.g0(wf1Var)).I3(X1, null, wf1Var, 0);
                        return;
                    }
                    return;
                }
                TLRPC.Chat M0 = uc7.s1(wf1.h0(wf1Var)).M0(Long.valueOf(-longValue));
                if (M0 != null) {
                    uc7.s1(wf1.i0(wf1Var)).I3(null, M0, wf1Var, 0);
                }
            } else if (characterStyle instanceof f8c) {
                String url = ((f8c) characterStyle).getURL();
                if (url.startsWith("@")) {
                    uc7.s1(wf1.k0(wf1Var)).H3(url.substring(1), wf1Var, 0, null);
                } else if (url.startsWith("#")) {
                    uj3 uj3Var = new uj3(null);
                    uj3Var.p2 = url;
                    wf1Var.presentFragment(uj3Var);
                }
            } else {
                String url2 = ((URLSpan) characterStyle).getURL();
                if (z) {
                    nx0 i = ik8.i(wf1Var.getParentActivity(), false, 1, null);
                    i.P = url2;
                    i.Q = false;
                    CharSequence[] charSequenceArr = {ob6.M0(2131747544, null), ob6.M0(2131751732, null)};
                    oh ohVar = new oh(this, url2, (byte) 2);
                    i.M = charSequenceArr;
                    i.L = ohVar;
                    wf1Var.showDialog(i);
                } else if (characterStyle instanceof h8c) {
                    String url3 = ((h8c) characterStyle).getURL();
                    if (!m01.h(url3)) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wf1Var.getParentActivity());
                        String M02 = ob6.M0(2131747506, null);
                        id idVar = alertDialog$Builder.a;
                        idVar.S = M02;
                        idVar.U = ob6.a0(null, null, 2131747509, url3);
                        alertDialog$Builder.j(ob6.M0(2131747544, null), new h01(wf1Var, url3, (byte) 6));
                        alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                        wf1Var.showDialog(idVar);
                        return;
                    }
                    m01.q(wf1Var.getParentActivity(), url3, true);
                } else {
                    TLRPC.MessageMedia messageMedia = messageObject.k.media;
                    if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                        String lowerCase = url2.toLowerCase();
                        String lowerCase2 = messageObject.k.media.webpage.url.toLowerCase();
                        if ((m01.j(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                            LaunchActivity launchActivity = LaunchActivity.H1;
                            if (launchActivity != null && launchActivity.O() != null && LaunchActivity.H1.O().k(messageObject) != null) {
                                return;
                            }
                            wf1Var.createArticleViewer(false).L(messageObject, null, null, null);
                            return;
                        }
                    }
                    m01.q(wf1Var.getParentActivity(), url2, true);
                }
            }
        }
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
    public final boolean R1(r47 r47Var) {
        return true;
    }

    @Override
    public final iv1 S() {
        return null;
    }

    @Override
    public final void T1(wb2 wb2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
        wf1 wf1Var = this.a.n;
        if (chat != null && chat != wf1Var.f) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", chat.id);
            if (i != 0) {
                bundle.putInt("message_id", i);
            }
            if (uc7.s1(wf1.b0(wf1Var)).C(bundle, wf1Var, null, null)) {
                wf1Var.presentFragment(new zu1(bundle), true);
            }
        }
    }

    @Override
    public final boolean V1(wb2 wb2Var, TLRPC.User user) {
        yb0 b;
        wf1 wf1Var = this.a.n;
        if (user != null && user.id != yac.h(wf1.d0(wf1Var)).e()) {
            ec0[] ec0VarArr = {ec0.d, ec0.h};
            TLRPC.UserFull Y1 = wf1Var.getMessagesController().Y1(user.id);
            if (Y1 != null) {
                b = yb0.c(user, Y1, ec0VarArr);
            } else {
                b = yb0.b(user, wf1.e0(wf1Var), ec0VarArr);
            }
            if (vh4.i(b)) {
                vh4.r().J((ViewGroup) wf1Var.fragmentView, wf1Var.getResourceProvider(), b, new h01(this, wb2Var, user));
                return true;
            }
        }
        return false;
    }

    @Override
    public final void W(wb2 wb2Var, TLRPC.User user, float f, float f2) {
        if (user != null && user.id != yac.h(wf1.c0(this.a.n)).e()) {
            a(user);
        }
    }

    @Override
    public final boolean W1(wb2 wb2Var) {
        return false;
    }

    @Override
    public final boolean Z() {
        return false;
    }

    public final void a(TLRPC.User user) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", user.id);
        wf1 wf1Var = this.a.n;
        long j = user.id;
        int i = wf1.Q0;
        wf1Var.J0(bundle, j);
        ProfileActivity profileActivity = new ProfileActivity(bundle, null);
        profileActivity.y3(0);
        wf1Var.presentFragment(profileActivity);
    }

    @Override
    public final CharacterStyle a0(wb2 wb2Var) {
        return null;
    }

    @Override
    public final void a1(wb2 wb2Var) {
        boolean z;
        tf1 tf1Var = this.a;
        wf1 wf1Var = tf1Var.n;
        if (wf1Var.getParentActivity() == null) {
            return;
        }
        Context context = tf1Var.c;
        r47 messageObject = wb2Var.getMessageObject();
        if (xc2.T(wf1Var.f) && !wf1Var.f.megagroup) {
            z = true;
        } else {
            z = false;
        }
        wf1Var.showDialog(kea.H0(context, messageObject, null, z, null));
    }

    @Override
    public final void a2(wb2 wb2Var, float f, float f2) {
        wf1 wf1Var = this.a.n;
        int i = wf1.Q0;
        wf1Var.M0(wb2Var, 0.0f, 0.0f);
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean c0() {
        return true;
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final void i() {
        a.t();
        boolean z = f11.a;
        a.q();
        m01.u(this.a.n.getParentActivity(), f11.g);
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
        if (!r47.Q4(r47Var.k) && !r47Var.g4()) {
            if (!r47Var.I3()) {
                return false;
            }
            return MediaController.z().q0(this.a.n.p0, r47Var, 0L, true, null, 0L);
        }
        boolean V = MediaController.z().V(r47Var);
        MediaController.z().u0(null, false);
        return V;
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
    public final void q0(defpackage.wb2 r14, float r15, float r16, boolean r17) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of1.q0(wb2, float, float, boolean):void");
    }

    @Override
    public final void q1(wb2 wb2Var, int i) {
        TLRPC.WebPage webPage;
        wf1 wf1Var = this.a.n;
        r47 messageObject = wb2Var.getMessageObject();
        TLRPC.TL_channelAdminLogEvent tL_channelAdminLogEvent = messageObject.L1;
        if (tL_channelAdminLogEvent != null && (tL_channelAdminLogEvent.action instanceof TLRPC.TL_channelAdminLogEventActionEditMessage)) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -r47.B0(messageObject.k));
            bundle.putInt("message_id", messageObject.L1());
            zu1 zu1Var = new zu1(bundle);
            if (xc2.c0(wf1Var.f)) {
                ro4.a(zu1Var, jf7.a(r47.B0(messageObject.k), r47.b2(wf1.l0(wf1Var), messageObject.k, true, false)));
            }
            wf1Var.presentFragment(zu1Var);
        } else if (i == 0) {
            TLRPC.MessageMedia messageMedia = messageObject.k.media;
            if (messageMedia != null && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                LaunchActivity launchActivity = LaunchActivity.H1;
                if (launchActivity == null || launchActivity.O() == null || LaunchActivity.H1.O().k(messageObject) == null) {
                    wf1Var.createArticleViewer(false).L(messageObject, null, null, null);
                }
            }
        } else if (i == 5) {
            TLRPC.User X1 = wf1Var.getMessagesController().X1(Long.valueOf(messageObject.k.media.user_id));
            TLRPC.MessageMedia messageMedia2 = messageObject.k.media;
            String str = messageMedia2.vcard;
            String str2 = messageMedia2.first_name;
            String str3 = messageMedia2.last_name;
            try {
                File f1 = hl.f1();
                f1.mkdirs();
                File file = new File(f1, "vcard.vcf");
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                bufferedWriter.write(str);
                bufferedWriter.close();
                wf1Var.showDialog(new r78(wf1Var, null, X1, null, file, null, str2, str3, null));
            } catch (Exception e) {
                cc4.g(e, true);
            }
        } else {
            TLRPC.MessageMedia messageMedia3 = messageObject.k.media;
            if (messageMedia3 != null && messageMedia3.webpage != null) {
                m01.u(wf1Var.getParentActivity(), messageObject.k.media.webpage.url);
            }
        }
    }

    @Override
    public final boolean s0(wb2 wb2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final void t1(r47 r47Var, String str, String str2, String str3, String str4, int i, int i2) {
        wf1 wf1Var = this.a.n;
        iv3.J0(wf1Var, r47Var, wf1Var.C0, str2, str3, str4, str, i, i2, -1, false);
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
    public final void v(wb2 wb2Var, float f, float f2) {
        wf1 wf1Var = this.a.n;
        int i = wf1.Q0;
        wf1Var.M0(wb2Var, 0.0f, 0.0f);
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
    public final void Q0() {
    }

    @Override
    public final void d() {
    }

    @Override
    public final void d2() {
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
    public final void I1(wb2 wb2Var) {
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
    public final void Y(int i) {
    }

    @Override
    public final void Y0(wb2 wb2Var) {
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
    public final void j0(wb2 wb2Var) {
    }

    @Override
    public final void l(wb2 wb2Var) {
    }

    @Override
    public final void m2(wb2 wb2Var) {
    }

    @Override
    public final void n1(o47 o47Var) {
    }

    @Override
    public final void v1(wb2 wb2Var) {
    }

    @Override
    public final void A0(wb2 wb2Var, boolean z) {
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
    public final void l0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void l1(wb2 wb2Var, boolean z) {
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
    public final void K0(wb2 wb2Var, float f, float f2) {
    }

    @Override
    public final void f1(wb2 wb2Var, float f, float f2) {
    }

    @Override
    public final void h2(wb2 wb2Var, boolean z, boolean z2) {
    }

    @Override
    public final void n0(wb2 wb2Var, int i, int i2) {
    }

    @Override
    public final void r1(wb2 wb2Var, boolean z, boolean z2) {
    }

    @Override
    public final void m(wb2 wb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override
    public final void z(wb2 wb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void V0(wb2 wb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
    }

    @Override
    public final void c1(wb2 wb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }
}
