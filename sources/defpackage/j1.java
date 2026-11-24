package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m;
public final class j1 implements View.OnClickListener {
    public final byte a;
    public final Object b;

    public j1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i;
        int i2;
        gn gnVar;
        String str;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((s1) obj).h();
                return;
            case 1:
                ((va7) obj).run();
                return;
            case 2:
                ((o5) obj).dismiss();
                return;
            case 3:
                r6 r6Var = (r6) obj;
                a aVar = r6Var.b;
                r7 r7Var = (r7) view;
                if (r7Var.t()) {
                    if (aVar.v0.a()) {
                        r7Var.U(null, null);
                        return;
                    }
                    return;
                } else if (r7Var.v()) {
                    aVar.B(r7Var.T(true));
                    return;
                } else {
                    r6Var.o(((Integer) view.getTag()).intValue());
                    return;
                }
            case 4:
                l9 l9Var = (l9) obj;
                if (l9Var.e.size() == 1) {
                    new ty(l9Var.getContext(), null, null, (gt4) l9Var.e.get(0)).show();
                    return;
                } else {
                    new j9(l9Var.getContext()).show();
                    return;
                }
            case 5:
                eb ebVar = (eb) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ebVar.getContext());
                String M0 = k96.M0(2131742651, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.M0(2131742652, null);
                alertDialog$Builder.j(k96.M0(2131747638, null), new ta(ebVar));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                alertDialog$Builder.o();
                return;
            case 6:
                ib ibVar = (ib) obj;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = ibVar.T1;
                if (tL_channelAdminLogEventsFilter.join && tL_channelAdminLogEventsFilter.leave && tL_channelAdminLogEventsFilter.edit_rank && tL_channelAdminLogEventsFilter.invite && tL_channelAdminLogEventsFilter.ban && tL_channelAdminLogEventsFilter.unban && tL_channelAdminLogEventsFilter.kick && tL_channelAdminLogEventsFilter.unkick && tL_channelAdminLogEventsFilter.promote && tL_channelAdminLogEventsFilter.demote && tL_channelAdminLogEventsFilter.info && tL_channelAdminLogEventsFilter.settings && tL_channelAdminLogEventsFilter.pinned && tL_channelAdminLogEventsFilter.edit && tL_channelAdminLogEventsFilter.delete && tL_channelAdminLogEventsFilter.group_call && tL_channelAdminLogEventsFilter.invites) {
                    ibVar.T1 = null;
                }
                vf6 vf6Var = ibVar.V1;
                if (vf6Var != null && ibVar.U1 != null && vf6Var.m() >= ibVar.U1.size()) {
                    ibVar.V1 = null;
                }
                ue1 ue1Var = ibVar.b2;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = ibVar.T1;
                vf6 vf6Var2 = ibVar.V1;
                nf1 nf1Var = ue1Var.a;
                nf1Var.v0 = tL_channelAdminLogEventsFilter2;
                nf1Var.x0 = vf6Var2;
                if (tL_channelAdminLogEventsFilter2 == null && vf6Var2 == null) {
                    nf1Var.J.setSubtitle(k96.M0(2131751062, null));
                } else {
                    nf1Var.J.setSubtitle(k96.M0(2131750900, null));
                }
                nf1Var.W0(true);
                ibVar.dismiss();
                return;
            case 7:
                ((nd) obj).dismiss();
                return;
            case 8:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj;
                atomicBoolean.set(!atomicBoolean.get());
                ((ag2) view).c(atomicBoolean.get(), true);
                return;
            case 9:
                ((mk2) obj).run();
                return;
            case 10:
                ((es) obj).toggle();
                return;
            case 11:
                cv0 webView = ((m) obj).f.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            case 12:
                ((lz) obj).dismiss();
                return;
            case 13:
                v60 v60Var = (v60) obj;
                if (view == v60Var.e) {
                    ij.k(v60Var.getParentActivity(), null, new lj9(v60Var, (byte) 8));
                    return;
                }
                int i3 = ((u60) view).e;
                if (v60Var.Y() == 0 && i3 > 0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(v60Var.getParentActivity());
                    String M02 = k96.M0(2131748395, null);
                    hd hdVar2 = alertDialog$Builder2.a;
                    hdVar2.S = M02;
                    hdVar2.U = k96.a0("AutoDeleteConfirmMessage", null, 2131753862, k96.c0(i3 * 60));
                    alertDialog$Builder2.g(k96.M0(2131752577, null), new wz((byte) 7));
                    alertDialog$Builder2.j(k96.M0(2131751148, null), new o(v60Var, view, (byte) 16));
                    alertDialog$Builder2.o();
                    return;
                }
                v60Var.a0(view, true);
                return;
            case 14:
                ((mb0) obj).j0();
                return;
            case 15:
                ((bc0) obj).b(false);
                return;
            case 16:
                ((wl1) obj).run();
                return;
            case 17:
                ((wl1) obj).run();
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView = ((qv1) ((oq0) obj).d).a;
                int i4 = ChatActivityEnterView.r7;
                chatActivityEnterView.Y0((TL_keyboard.KeyboardButton) view.getTag());
                return;
            case 19:
                ((oz) obj).run();
                return;
            case 20:
                ((x6c) obj).run();
                return;
            case 21:
                ((x11) ((u11) obj).o1).f();
                m21.e();
                return;
            case 22:
                ((k21) obj).f();
                return;
            case 23:
                o31 o31Var = (o31) obj;
                hn hnVar = o31Var.f;
                int i5 = o31Var.a;
                boolean z = o31Var.r;
                o31Var.r = !z;
                ii2 ii2Var = o31Var.h;
                if (!z) {
                    i = 2131753698;
                } else {
                    i = 2131753695;
                }
                ii2Var.c(k96.M0(i, null), true, true);
                hnVar.a();
                if (o31Var.r) {
                    i2 = 2131753696;
                } else {
                    i2 = 2131753697;
                }
                hnVar.c(k96.M0(i2, null), true, true);
                boolean z2 = o31Var.r;
                int i6 = o31Var.x;
                if (z2) {
                    o31Var.x = i6 | 1;
                } else {
                    o31Var.x = i6 & (-2);
                }
                na7.q1(i5).W3.edit().putInt("dialog_botflags" + o31Var.s, o31Var.x).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = na7.q1(i5).h1(o31Var.s);
                toggleconnectedbotpaused.paused = o31Var.r;
                ConnectionsManager.getInstance(i5).sendRequest(toggleconnectedbotpaused, null);
                return;
            case 24:
                TL_account.TL_businessChatLink tL_businessChatLink = ((d41) obj).f;
                if (tL_businessChatLink != null) {
                    gl.g(tL_businessChatLink.link);
                    u21.b0(LaunchActivity.Q()).k(false).j();
                    return;
                }
                return;
            case 25:
                j61 j61Var = (j61) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(j61Var.getContext());
                String M03 = k96.M0(2131752086, null);
                if (TextUtils.isEmpty(j61Var.c.i)) {
                    str = "";
                } else {
                    str = " (" + ((Object) gnVar.i) + ")";
                }
                String concat = M03.concat(str);
                hd hdVar3 = alertDialog$Builder3.a;
                hdVar3.S = concat;
                hdVar3.U = k96.M0(2131744577, null);
                alertDialog$Builder3.j(j61Var.b.i, new sg0(j61Var, (byte) 21));
                alertDialog$Builder3.g(k96.M0(2131752577, null), null);
                j61Var.d.showDialog(hdVar3);
                View c = hdVar3.c(-1);
                if (c instanceof TextView) {
                    int i7 = bkb.o7;
                    zkb.X((TextView) c, i7, null);
                    c.setBackground(bkb.H0(gl.L(6.0f), bkb.p1(0.12f, bkb.w0(null, i7, false))));
                    return;
                }
                return;
            case 26:
                r61 r61Var = (r61) ((p61) obj).f;
                r61Var.M = !r61Var.M;
                r61Var.z0(true);
                r61Var.x0();
                return;
            case 27:
                f71 f71Var = (f71) obj;
                switch (f71Var.f) {
                    case 0:
                        ((g71) f71Var.h).r.G.i(null, (u61) f71Var.getTag(), true);
                        return;
                    default:
                        ((l71) f71Var.h).n.G.i(null, (u61) f71Var.getTag(), true);
                        return;
                }
            default:
                ((va7) obj).run();
                return;
        }
    }
}
