package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.camera.CameraSessionWrapper;
import org.telegram.messenger.camera.CameraView;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ContactsActivity;
public final class r81 implements View.OnClickListener {
    public final byte a;
    public final Object b;

    public r81(y13 y13Var, ku9 ku9Var, c51 c51Var) {
        this.a = (byte) 23;
        this.b = ku9Var;
    }

    @Override
    public final void onClick(View view) {
        CameraSessionWrapper cameraSession;
        int i;
        wk5 wk5Var;
        wk5 wk5Var2;
        byte b = this.a;
        int i2 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ze7) obj).run();
                return;
            case 1:
                e29 e29Var = (e29) ((jo0) obj).e;
                if (!e29Var.b()) {
                    e29Var.setProgress(0.0f);
                    e29Var.d();
                    return;
                }
                return;
            case 2:
                la1 la1Var = (la1) obj;
                CameraView cameraView = la1Var.d;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) la1Var.s.getBackground();
                    AnimatorSet animatorSet = la1Var.w;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        la1Var.w = null;
                    }
                    la1Var.w = new AnimatorSet();
                    qn qnVar = sn.e;
                    if (la1Var.s.getTag() == null) {
                        i = 68;
                    } else {
                        i = 34;
                    }
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, qnVar, i);
                    ofInt.addUpdateListener(new ea1(la1Var, (byte) 1));
                    la1Var.w.playTogether(ofInt);
                    la1Var.w.setDuration(200L);
                    la1Var.w.setInterpolator(k43.f);
                    la1Var.w.addListener(new h0(la1Var, (byte) 29));
                    la1Var.w.start();
                    Object tag = la1Var.s.getTag();
                    ImageView imageView = la1Var.s;
                    if (tag == null) {
                        imageView.setTag(1);
                        cameraSession.setCurrentFlashMode("torch");
                        return;
                    }
                    imageView.setTag(null);
                    cameraSession.setCurrentFlashMode("off");
                    return;
                }
                return;
            case 3:
                qb1 qb1Var = (qb1) obj;
                kb1 kb1Var = qb1Var.f;
                kb1Var.d();
                kb1Var.k(true);
                hb1 hb1Var = qb1Var.d0;
                hl.r(hb1Var);
                hb1Var.run();
                return;
            case 4:
                ub1 ub1Var = (ub1) obj;
                uc7.e1().edit().putInt("aihintshown", 3).apply();
                b1 b1Var = new b1(ub1Var.getContext(), new x53());
                b1Var.q1(ub1Var.f.getText());
                b1Var.e2 = new te2(ub1Var, (byte) 12);
                b1Var.o1(0L, true, new e02(ub1Var, (byte) 2));
                b1Var.show();
                return;
            case 5:
                ((hbb) obj).B();
                return;
            case 6:
                ((o97) obj).run();
                return;
            case 7:
                ((wh1) obj).A0();
                return;
            case 8:
                zu1 zu1Var = ((oq1) obj).b;
                zu1Var.j0.p();
                f41 f41Var = zu1Var.Y1;
                if (f41Var != null) {
                    f41Var.s1(0, null);
                }
                zu1Var.na();
                return;
            case 9:
                zu1 zu1Var2 = ((ju1) obj).a;
                wk5Var = ((e) zu1Var2).parentLayout;
                if (wk5Var != null) {
                    wk5Var2 = ((e) zu1Var2).parentLayout;
                    ((ActionBarLayout) wk5Var2).p();
                    return;
                }
                return;
            case 10:
                int i3 = ChatActivityEnterView.X7;
                ((bw1) obj).a(Boolean.TRUE, 0, 0);
                return;
            case 11:
                ((s42) obj).r.U(null, null);
                return;
            case 12:
                v72 v72Var = (v72) obj;
                v72Var.K(true, 0, 0, 0L, false);
                q67 q67Var = v72Var.P;
                if (q67Var != null) {
                    q67Var.f(true);
                    v72Var.P = null;
                    return;
                }
                return;
            case 13:
                y92 y92Var = (y92) obj;
                y92Var.w.setProgress(0.0f);
                y92Var.w.d();
                return;
            case 14:
                ((od2) obj).e.n0(true);
                return;
            case 15:
                zi2 zi2Var = (zi2) obj;
                if (!zi2Var.u1) {
                    int i4 = zi2Var.t1;
                    if (i4 != zi2Var.s1) {
                        zi2Var.u1 = true;
                        int i5 = 70;
                        if (i4 == 3) {
                            i2 = 2678400;
                        } else if (i4 == 2) {
                            i2 = 604800;
                        } else if (i4 == 1) {
                            i2 = 86400;
                        } else {
                            i5 = 71;
                        }
                        int i6 = i5;
                        wf1 wf1Var = zi2Var.v1.a;
                        uc7 messagesController = wf1Var.getMessagesController();
                        TLRPC.Chat chat = wf1Var.f;
                        messagesController.V4(i2, -chat.id);
                        TLRPC.ChatFull N0 = wf1Var.getMessagesController().N0(chat.id);
                        if (N0 != null) {
                            wf1Var.x.k(-chat.id, i6, null, Integer.valueOf(N0.ttl_period), null, null);
                        }
                    }
                    if (zi2Var.u1) {
                        hl.d3(new vd2(zi2Var, (byte) 5), 200L);
                        return;
                    } else {
                        zi2Var.dismiss();
                        return;
                    }
                }
                return;
            case 16:
                ((sm2) obj).dismiss();
                return;
            case 17:
                xn2 xn2Var = (xn2) obj;
                TLRPC.Chat chat2 = xn2Var.J;
                if (chat2 != null && !chat2.title.equals(((xs0) xn2Var.r.b).getText().toString())) {
                    xn2Var.getMessagesController().A(xn2Var.J.id, ((xs0) xn2Var.r.b).getText().toString(), new sn2(xn2Var, (byte) 1));
                }
                TLRPC.Chat chat3 = xn2Var.J;
                if (chat3 != null && xn2Var.n != xn2Var.h) {
                    if (chat3.default_banned_rights == null) {
                        chat3.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    xn2Var.J.default_banned_rights.manage_linked_peers = !xn2Var.n;
                    xn2Var.getMessagesController().U4(xn2Var.c, xn2Var.J.default_banned_rights, false, xn2Var);
                }
                xn2Var.finishFragment();
                return;
            case 18:
                ((yn2) obj).dismiss();
                return;
            case 19:
                ((qo2) obj).n.n1.F(0);
                return;
            case 20:
                xo2 xo2Var = ((ro2) obj).r;
                if (!xc2.w(27, xo2Var.p1)) {
                    xo2Var.dismiss();
                    return;
                }
                c51 c51Var = xo2Var.r1;
                if (!c51Var.R) {
                    c51Var.setLoading(true);
                    uc7 s1 = uc7.s1(xo2Var.a);
                    lo2 lo2Var = new lo2(xo2Var, (byte) 2);
                    TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
                    tL_channels_getAdminedPublicChannels.for_community_peer = true;
                    s1.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new ic((byte) 0), new qe2(s1, lo2Var, (byte) 28));
                    return;
                }
                return;
            case 21:
                ((ContactsActivity) obj).l0();
                return;
            case 22:
                ((q03) obj).run();
                return;
            case 23:
                ku9 ku9Var = (ku9) obj;
                r9b r9bVar = (r9b) ku9Var.b;
                r9bVar.a0.A1 = true;
                ((y13[]) ku9Var.c)[0].dismiss();
                r9bVar.h(true);
                return;
            case 24:
                e53 e53Var = (e53) obj;
                if (e53Var.k) {
                    e53Var.d();
                    return;
                }
                return;
            case 25:
                wkb wkbVar = ((wkb[]) obj)[0];
                wkbVar.setChecked(!wkbVar.e.h);
                return;
            case 26:
                ((nx0) ((z8d) obj).b).y0.run();
                return;
            case 27:
                uh9.o(3, (e) obj);
                return;
            case 28:
                ((me3) obj).e1(true);
                return;
            default:
                final df3 df3Var = (df3) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(df3Var.getContext());
                String M0 = ob6.M0(2131752063, null);
                id idVar = alertDialog$Builder.a;
                idVar.S = M0;
                idVar.U = ob6.M0(2131752061, null);
                alertDialog$Builder.g(ob6.M0(2131752570, null), new fd() {
                    @Override
                    public final void w(id idVar2, int i7) {
                        byte b2 = r2;
                        df3 df3Var2 = df3Var;
                        switch (b2) {
                            case 0:
                                df3Var2.dismiss();
                                return;
                            default:
                                df3Var2.dismiss();
                                qx6 qx6Var = df3Var2.U1;
                                ((z61) qx6Var.c).e0(df3Var2.T1, df3Var2.W1, df3Var2.b2);
                                return;
                        }
                    }
                });
                alertDialog$Builder.j(ob6.M0(2131752066, null), new fd() {
                    @Override
                    public final void w(id idVar2, int i7) {
                        byte b2 = r2;
                        df3 df3Var2 = df3Var;
                        switch (b2) {
                            case 0:
                                df3Var2.dismiss();
                                return;
                            default:
                                df3Var2.dismiss();
                                qx6 qx6Var = df3Var2.U1;
                                ((z61) qx6Var.c).e0(df3Var2.T1, df3Var2.W1, df3Var2.b2);
                                return;
                        }
                    }
                });
                idVar.show();
                idVar.h();
                return;
        }
    }

    public r81(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
