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
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ContactsActivity;
public final class x91 implements View.OnClickListener {
    public final byte a;
    public final Object b;

    public x91(f13 f13Var, nu9 nu9Var, u41 u41Var) {
        this.a = (byte) 21;
        this.b = nu9Var;
    }

    @Override
    public final void onClick(View view) {
        CameraSessionWrapper cameraSession;
        int i;
        ui5 ui5Var;
        ui5 ui5Var2;
        byte b = this.a;
        int i2 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                da1 da1Var = (da1) obj;
                CameraView cameraView = da1Var.d;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) da1Var.s.getBackground();
                    AnimatorSet animatorSet = da1Var.w;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        da1Var.w = null;
                    }
                    da1Var.w = new AnimatorSet();
                    pn pnVar = rn.e;
                    if (da1Var.s.getTag() == null) {
                        i = 68;
                    } else {
                        i = 34;
                    }
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, pnVar, i);
                    ofInt.addUpdateListener(new w91(da1Var, (byte) 1));
                    da1Var.w.playTogether(ofInt);
                    da1Var.w.setDuration(200L);
                    da1Var.w.setInterpolator(s33.f);
                    da1Var.w.addListener(new g0(da1Var, (byte) 29));
                    da1Var.w.start();
                    Object tag = da1Var.s.getTag();
                    ImageView imageView = da1Var.s;
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
            case 1:
                ib1 ib1Var = (ib1) obj;
                cb1 cb1Var = ib1Var.f;
                cb1Var.d();
                cb1Var.k(true);
                za1 za1Var = ib1Var.d0;
                gl.r(za1Var);
                za1Var.run();
                return;
            case 2:
                mb1 mb1Var = (mb1) obj;
                na7.c1().edit().putInt("aihintshown", 3).apply();
                a1 a1Var = new a1(mb1Var.getContext(), new f53());
                a1Var.o1(mb1Var.f.getText());
                a1Var.e2 = new be2(mb1Var, (byte) 12);
                a1Var.m1(0L, true, new mz1(mb1Var, (byte) 2));
                a1Var.show();
                return;
            case 3:
                ((j7b) obj).B();
                return;
            case 4:
                ((s67) obj).run();
                return;
            case 5:
                ((nh1) obj).z0();
                return;
            case 6:
                mu1 mu1Var = ((aq1) obj).b;
                mu1Var.j0.p();
                x31 x31Var = mu1Var.Y1;
                if (x31Var != null) {
                    x31Var.r1(0, null);
                }
                mu1Var.ca();
                return;
            case 7:
                mu1 mu1Var2 = ((wt1) obj).a;
                ui5Var = ((d) mu1Var2).parentLayout;
                if (ui5Var != null) {
                    ui5Var2 = ((d) mu1Var2).parentLayout;
                    ((ActionBarLayout) ui5Var2).p();
                    return;
                }
                return;
            case 8:
                int i3 = ChatActivityEnterView.r7;
                ((ev1) obj).a(Boolean.TRUE, 0, 0);
                return;
            case 9:
                ((c42) obj).r.U(null, null);
                return;
            case 10:
                e72 e72Var = (e72) obj;
                e72Var.M(true, 0, 0, 0L, false);
                j47 j47Var = e72Var.P;
                if (j47Var != null) {
                    j47Var.f(true);
                    e72Var.P = null;
                    return;
                }
                return;
            case 11:
                i92 i92Var = (i92) obj;
                i92Var.w.setProgress(0.0f);
                i92Var.w.d();
                return;
            case 12:
                ((yc2) obj).e.n0(true);
                return;
            case 13:
                di2 di2Var = (di2) obj;
                if (!di2Var.u1) {
                    int i4 = di2Var.t1;
                    if (i4 != di2Var.s1) {
                        di2Var.u1 = true;
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
                        nf1 nf1Var = di2Var.v1.a;
                        na7 messagesController = nf1Var.getMessagesController();
                        TLRPC.Chat chat = nf1Var.f;
                        messagesController.N4(i2, -chat.id);
                        TLRPC.ChatFull L0 = nf1Var.getMessagesController().L0(chat.id);
                        if (L0 != null) {
                            nf1Var.x.k(-chat.id, i6, null, Integer.valueOf(L0.ttl_period), null, null);
                        }
                    }
                    if (di2Var.u1) {
                        gl.d3(new hq1(di2Var, (byte) 29), 200L);
                        return;
                    } else {
                        di2Var.dismiss();
                        return;
                    }
                }
                return;
            case 14:
                ((yl2) obj).dismiss();
                return;
            case 15:
                en2 en2Var = (en2) obj;
                TLRPC.Chat chat2 = en2Var.J;
                if (chat2 != null && !chat2.title.equals(((ps0) en2Var.r.b).getText().toString())) {
                    en2Var.getMessagesController().y(en2Var.J.id, ((ps0) en2Var.r.b).getText().toString(), new zm2(en2Var, (byte) 1));
                }
                TLRPC.Chat chat3 = en2Var.J;
                if (chat3 != null && en2Var.n != en2Var.h) {
                    if (chat3.default_banned_rights == null) {
                        chat3.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    en2Var.J.default_banned_rights.manage_linked_peers = !en2Var.n;
                    en2Var.getMessagesController().M4(en2Var.c, en2Var.J.default_banned_rights, false, en2Var);
                }
                en2Var.finishFragment();
                return;
            case 16:
                ((fn2) obj).dismiss();
                return;
            case 17:
                ((xn2) obj).n.n1.E(0);
                return;
            case 18:
                eo2 eo2Var = ((yn2) obj).r;
                if (!hc2.w(27, eo2Var.p1)) {
                    eo2Var.dismiss();
                    return;
                }
                u41 u41Var = eo2Var.r1;
                if (!u41Var.R) {
                    u41Var.setLoading(true);
                    na7 q1 = na7.q1(eo2Var.a);
                    sn2 sn2Var = new sn2(eo2Var, (byte) 2);
                    TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
                    tL_channels_getAdminedPublicChannels.for_community_peer = true;
                    q1.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new hc((byte) 0), new ae2(q1, sn2Var, (byte) 28));
                    return;
                }
                return;
            case 19:
                ((ContactsActivity) obj).l0();
                return;
            case 20:
                ((xz2) obj).run();
                return;
            case 21:
                nu9 nu9Var = (nu9) obj;
                t5b t5bVar = (t5b) nu9Var.b;
                t5bVar.a0.A1 = true;
                ((f13[]) nu9Var.c)[0].dismiss();
                t5bVar.h(true);
                return;
            case 22:
                m43 m43Var = (m43) obj;
                if (m43Var.k) {
                    m43Var.d();
                    return;
                }
                return;
            case 23:
                ahb ahbVar = ((ahb[]) obj)[0];
                ahbVar.setChecked(!ahbVar.e.h);
                return;
            case 24:
                ((fx0) ((i4d) obj).a).y0.run();
                return;
            case 25:
                de9.o(3, (d) obj);
                return;
            case 26:
                ((sd3) obj).d1(true);
                return;
            case 27:
                final je3 je3Var = (je3) obj;
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(je3Var.getContext());
                String M0 = k96.M0(2131752086, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.M0(2131752084, null);
                alertDialog$Builder.g(k96.M0(2131752577, null), new ed() {
                    @Override
                    public final void u(hd hdVar2, int i7) {
                        byte b2 = r2;
                        je3 je3Var2 = je3Var;
                        switch (b2) {
                            case 0:
                                je3Var2.dismiss();
                                return;
                            default:
                                je3Var2.dismiss();
                                lv6 lv6Var = je3Var2.U1;
                                ((r61) lv6Var.c).e0(je3Var2.T1, je3Var2.W1, je3Var2.b2);
                                return;
                        }
                    }
                });
                alertDialog$Builder.j(k96.M0(2131752089, null), new ed() {
                    @Override
                    public final void u(hd hdVar2, int i7) {
                        byte b2 = r2;
                        je3 je3Var2 = je3Var;
                        switch (b2) {
                            case 0:
                                je3Var2.dismiss();
                                return;
                            default:
                                je3Var2.dismiss();
                                lv6 lv6Var = je3Var2.U1;
                                ((r61) lv6Var.c).e0(je3Var2.T1, je3Var2.W1, je3Var2.b2);
                                return;
                        }
                    }
                });
                hdVar.show();
                hdVar.h();
                return;
            case 28:
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = ((ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj)[0];
                if (actionBarPopupWindow$ActionBarPopupWindowLayout != null) {
                    actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().b(true);
                    return;
                }
                return;
            default:
                oj3 oj3Var = (oj3) obj;
                na7.q1(oj3Var.G).s.clear();
                na7.c1().edit().remove("installReferer").commit();
                oj3Var.f();
                return;
        }
    }

    public x91(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
