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
public final class k1 implements View.OnClickListener {
    public final byte a;
    public final Object b;

    public k1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onClick(View view) {
        int i;
        int i2;
        hn hnVar;
        String str;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((t1) obj).h();
                return;
            case 1:
                ((bf7) obj).run();
                return;
            case 2:
                ((p5) obj).dismiss();
                return;
            case 3:
                s6 s6Var = (s6) obj;
                a aVar = s6Var.b;
                s7 s7Var = (s7) view;
                if (s7Var.t()) {
                    if (aVar.v0.a()) {
                        s7Var.U(null, null);
                        return;
                    }
                    return;
                } else if (s7Var.v()) {
                    aVar.C(s7Var.T(true));
                    return;
                } else {
                    s6Var.o(((Integer) view.getTag()).intValue());
                    return;
                }
            case 4:
                m9 m9Var = (m9) obj;
                if (m9Var.e.size() == 1) {
                    new uy(m9Var.getContext(), null, null, (kv4) m9Var.e.get(0)).show();
                    return;
                } else {
                    new k9(m9Var.getContext()).show();
                    return;
                }
            case 5:
                fb fbVar = (fb) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(fbVar.getContext());
                String M0 = ob6.M0(2131742545, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131742546, null);
                alertDialog$Builder.j(ob6.M0(2131747558, null), new ua(fbVar));
                alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                alertDialog$Builder.o();
                return;
            case 6:
                jb jbVar = (jb) obj;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter = jbVar.T1;
                if (tL_channelAdminLogEventsFilter.join && tL_channelAdminLogEventsFilter.leave && tL_channelAdminLogEventsFilter.edit_rank && tL_channelAdminLogEventsFilter.invite && tL_channelAdminLogEventsFilter.ban && tL_channelAdminLogEventsFilter.unban && tL_channelAdminLogEventsFilter.kick && tL_channelAdminLogEventsFilter.unkick && tL_channelAdminLogEventsFilter.promote && tL_channelAdminLogEventsFilter.demote && tL_channelAdminLogEventsFilter.info && tL_channelAdminLogEventsFilter.settings && tL_channelAdminLogEventsFilter.pinned && tL_channelAdminLogEventsFilter.edit && tL_channelAdminLogEventsFilter.delete && tL_channelAdminLogEventsFilter.group_call && tL_channelAdminLogEventsFilter.invites) {
                    jbVar.T1 = null;
                }
                zh6 zh6Var = jbVar.V1;
                if (zh6Var != null && jbVar.U1 != null && zh6Var.m() >= jbVar.U1.size()) {
                    jbVar.V1 = null;
                }
                bf1 bf1Var = jbVar.b2;
                TLRPC.TL_channelAdminLogEventsFilter tL_channelAdminLogEventsFilter2 = jbVar.T1;
                zh6 zh6Var2 = jbVar.V1;
                wf1 wf1Var = bf1Var.a;
                wf1Var.v0 = tL_channelAdminLogEventsFilter2;
                wf1Var.x0 = zh6Var2;
                if (tL_channelAdminLogEventsFilter2 == null && zh6Var2 == null) {
                    wf1Var.J.setSubtitle(ob6.M0(2131751039, null));
                } else {
                    wf1Var.J.setSubtitle(ob6.M0(2131750877, null));
                }
                wf1Var.X0(true);
                jbVar.dismiss();
                return;
            case 7:
                ((od) obj).dismiss();
                return;
            case 8:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj;
                atomicBoolean.set(!atomicBoolean.get());
                ((sg2) view).c(atomicBoolean.get(), true);
                return;
            case 9:
                ((zg3) obj).run();
                return;
            case 10:
                ((fs) obj).toggle();
                return;
            case 11:
                nv0 webView = ((m) obj).f.getWebView();
                if (webView != null) {
                    webView.reload();
                    return;
                }
                return;
            case 12:
                ((mz) obj).dismiss();
                return;
            case 13:
                x60 x60Var = (x60) obj;
                if (view == x60Var.e) {
                    jj.k(x60Var.getParentActivity(), null, new zm9(x60Var, (byte) 8));
                    return;
                }
                int i3 = ((w60) view).e;
                if (x60Var.Y() == 0 && i3 > 0) {
                    AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(x60Var.getParentActivity());
                    String M02 = ob6.M0(2131748341, null);
                    id idVar2 = alertDialog$Builder2.a;
                    idVar2.S = M02;
                    idVar2.U = ob6.a0("AutoDeleteConfirmMessage", null, 2131753858, ob6.c0(i3 * 60));
                    alertDialog$Builder2.g(ob6.M0(2131752570, null), new xz((byte) 7));
                    alertDialog$Builder2.j(ob6.M0(2131751125, null), new o(x60Var, view, (byte) 16));
                    alertDialog$Builder2.o();
                    return;
                }
                x60Var.a0(view, true);
                return;
            case 14:
                ((ob0) obj).j0();
                return;
            case 15:
                ((dc0) obj).b(false);
                return;
            case 16:
                ((ny) obj).run();
                return;
            case 17:
                ((ny) obj).run();
                return;
            case 18:
                ChatActivityEnterView chatActivityEnterView = ((ew1) ((oq0) obj).d).a;
                int i4 = ChatActivityEnterView.X7;
                chatActivityEnterView.c1((TL_keyboard.KeyboardButton) view.getTag());
                return;
            case 19:
                ((pz) obj).run();
                return;
            case 20:
                ((xac) obj).run();
                return;
            case 21:
                ((qr0) obj).w.f0(1);
                return;
            case 22:
                or0 or0Var = ((sr0) obj).d;
                rr0 rr0Var = or0Var.a;
                rr0 rr0Var2 = or0Var.a;
                TLRPC.Dialog S0 = rr0Var.getMessagesController().S0(rr0Var.a);
                if (S0 != null && S0.top_message != 0 && !rr0Var2.d0()) {
                    TLRPC.User X1 = rr0Var2.getMessagesController().X1(Long.valueOf(rr0Var2.a));
                    if (X1 != null && X1.bot_has_main_app) {
                        rr0Var2.getMessagesController().G3(rr0Var2, rr0Var2.getMessagesController().X1(Long.valueOf(rr0Var2.a)), null, rr0Var2.getClassGuid(), null, false, false);
                        return;
                    } else {
                        rr0Var2.g0(false);
                        return;
                    }
                }
                lr0 lr0Var = new lr0(rr0Var2, (byte) 1);
                if (rr0Var2.d0()) {
                    rr0Var2.getMessagesController().t5(lr0Var, rr0Var2.a);
                    return;
                } else {
                    lr0Var.run();
                    return;
                }
            case 23:
                ((g21) ((d21) obj).o1).j();
                v21.e();
                return;
            case 24:
                ((t21) obj).f();
                return;
            case 25:
                x31 x31Var = (x31) obj;
                in inVar = x31Var.f;
                int i5 = x31Var.a;
                boolean z = x31Var.r;
                x31Var.r = !z;
                ej2 ej2Var = x31Var.h;
                if (!z) {
                    i = 2131753694;
                } else {
                    i = 2131753691;
                }
                ej2Var.c(ob6.M0(i, null), true, true);
                inVar.a();
                if (x31Var.r) {
                    i2 = 2131753692;
                } else {
                    i2 = 2131753693;
                }
                inVar.c(ob6.M0(i2, null), true, true);
                boolean z2 = x31Var.r;
                int i6 = x31Var.x;
                if (z2) {
                    x31Var.x = i6 | 1;
                } else {
                    x31Var.x = i6 & (-2);
                }
                uc7.s1(i5).X3.edit().putInt("dialog_botflags" + x31Var.s, x31Var.x).apply();
                TL_account.toggleConnectedBotPaused toggleconnectedbotpaused = new TL_account.toggleConnectedBotPaused();
                toggleconnectedbotpaused.peer = uc7.s1(i5).j1(x31Var.s);
                toggleconnectedbotpaused.paused = x31Var.r;
                ConnectionsManager.getInstance(i5).sendRequest(toggleconnectedbotpaused, null);
                return;
            case 26:
                TL_account.TL_businessChatLink tL_businessChatLink = ((l41) obj).f;
                if (tL_businessChatLink != null) {
                    hl.g(tL_businessChatLink.link);
                    d31.b0(LaunchActivity.Q()).k(false).j();
                    return;
                }
                return;
            case 27:
                r61 r61Var = (r61) obj;
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(r61Var.getContext());
                String M03 = ob6.M0(2131752063, null);
                if (TextUtils.isEmpty(r61Var.c.i)) {
                    str = "";
                } else {
                    str = " (" + ((Object) hnVar.i) + ")";
                }
                String concat = M03.concat(str);
                id idVar3 = alertDialog$Builder3.a;
                idVar3.S = concat;
                idVar3.U = ob6.M0(2131744471, null);
                alertDialog$Builder3.j(r61Var.b.i, new tg0(r61Var, (byte) 22));
                alertDialog$Builder3.g(ob6.M0(2131752570, null), null);
                r61Var.d.showDialog(idVar3);
                View c = idVar3.c(-1);
                if (c instanceof TextView) {
                    int i7 = aob.p7;
                    yob.X((TextView) c, i7, null);
                    c.setBackground(aob.H0(hl.L(6.0f), aob.p1(0.12f, aob.w0(null, i7, false))));
                    return;
                }
                return;
            case 28:
                z61 z61Var = (z61) ((x61) obj).f;
                z61Var.M = !z61Var.M;
                z61Var.A0(true);
                z61Var.y0();
                return;
            default:
                n71 n71Var = (n71) obj;
                switch (n71Var.f) {
                    case 0:
                        ((o71) n71Var.h).r.G.g(null, (c71) n71Var.getTag(), true);
                        return;
                    default:
                        ((t71) n71Var.h).n.G.g(null, (c71) n71Var.getTag(), true);
                        return;
                }
        }
    }
}
