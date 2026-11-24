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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.ContactsActivity;
public final class k81 implements View.OnClickListener {
    public final byte a;
    public final Object b;

    public k81(r23 r23Var, ts9 ts9Var, b61 b61Var) {
        this.a = (byte) 24;
        this.b = ts9Var;
    }

    @Override
    public final void onClick(View view) {
        CameraSessionWrapper cameraSession;
        int i;
        tk5 tk5Var;
        tk5 tk5Var2;
        byte b = this.a;
        int i2 = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                n81 n81Var = (n81) obj;
                switch (n81Var.f) {
                    case 0:
                        ((o81) n81Var.h).r.G.h(null, (b81) n81Var.getTag(), true);
                        return;
                    default:
                        ((t81) n81Var.h).n.G.h(null, (b81) n81Var.getTag(), true);
                        return;
                }
            case 1:
                ((wc7) obj).run();
                return;
            case 2:
                s09 s09Var = (s09) ((jp0) obj).e;
                if (!s09Var.b()) {
                    s09Var.setProgress(0.0f);
                    s09Var.d();
                    return;
                }
                return;
            case 3:
                lb1 lb1Var = (lb1) obj;
                CameraView cameraView = lb1Var.d;
                if (cameraView != null && (cameraSession = cameraView.getCameraSession()) != null) {
                    ShapeDrawable shapeDrawable = (ShapeDrawable) lb1Var.s.getBackground();
                    AnimatorSet animatorSet = lb1Var.w;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                        lb1Var.w = null;
                    }
                    lb1Var.w = new AnimatorSet();
                    qo qoVar = so.e;
                    if (lb1Var.s.getTag() == null) {
                        i = 68;
                    } else {
                        i = 34;
                    }
                    ObjectAnimator ofInt = ObjectAnimator.ofInt(shapeDrawable, qoVar, i);
                    ofInt.addUpdateListener(new fb1(lb1Var, (byte) 1));
                    lb1Var.w.playTogether(ofInt);
                    lb1Var.w.setDuration(200L);
                    lb1Var.w.setInterpolator(d53.f);
                    lb1Var.w.addListener(new b91(lb1Var, (byte) 1));
                    lb1Var.w.start();
                    Object tag = lb1Var.s.getTag();
                    ImageView imageView = lb1Var.s;
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
            case 4:
                pc1 pc1Var = (pc1) obj;
                jc1 jc1Var = pc1Var.f;
                jc1Var.d();
                jc1Var.k(true);
                hc1 hc1Var = pc1Var.d0;
                gm.r(hc1Var);
                hc1Var.run();
                return;
            case 5:
                tc1 tc1Var = (tc1) obj;
                oc7.d1().edit().putInt("aihintshown", 3).apply();
                a1 a1Var = new a1(tc1Var.getContext(), new r63());
                a1Var.o1(tc1Var.f.getText());
                a1Var.e2 = new mf2(tc1Var, (byte) 12);
                a1Var.m1(0L, true, new z02(tc1Var, (byte) 2));
                a1Var.show();
                return;
            case 6:
                ((l9b) obj).B();
                return;
            case 7:
                ((l97) obj).run();
                return;
            case 8:
                ((vi1) obj).A0();
                return;
            case 9:
                yv1 yv1Var = ((nr1) obj).b;
                yv1Var.j0.p();
                e51 e51Var = yv1Var.Y1;
                if (e51Var != null) {
                    e51Var.r1(0, null);
                }
                yv1Var.ma();
                return;
            case 10:
                yv1 yv1Var2 = ((iv1) obj).a;
                tk5Var = ((d) yv1Var2).parentLayout;
                if (tk5Var != null) {
                    tk5Var2 = ((d) yv1Var2).parentLayout;
                    ((ActionBarLayout) tk5Var2).p();
                    return;
                }
                return;
            case 11:
                int i3 = ChatActivityEnterView.z7;
                ((qw1) obj).a(Boolean.TRUE, 0, 0);
                return;
            case 12:
                ((n52) obj).r.U(null, null);
                return;
            case 13:
                p82 p82Var = (p82) obj;
                p82Var.K(true, 0, 0, 0L, false);
                j67 j67Var = p82Var.P;
                if (j67Var != null) {
                    j67Var.f(true);
                    p82Var.P = null;
                    return;
                }
                return;
            case 14:
                ua2 ua2Var = (ua2) obj;
                ua2Var.w.setProgress(0.0f);
                ua2Var.w.d();
                return;
            case 15:
                ((je2) obj).e.o0(true);
                return;
            case 16:
                rj2 rj2Var = (rj2) obj;
                if (!rj2Var.u1) {
                    int i4 = rj2Var.t1;
                    if (i4 != rj2Var.s1) {
                        rj2Var.u1 = true;
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
                        vg1 vg1Var = rj2Var.v1.a;
                        oc7 messagesController = vg1Var.getMessagesController();
                        TLRPC.Chat chat = vg1Var.f;
                        messagesController.P4(i2, -chat.id);
                        TLRPC.ChatFull M0 = vg1Var.getMessagesController().M0(chat.id);
                        if (M0 != null) {
                            vg1Var.x.k(-chat.id, i6, null, Integer.valueOf(M0.ttl_period), null, null);
                        }
                    }
                    if (rj2Var.u1) {
                        gm.d3(new xf2(rj2Var, (byte) 4), 200L);
                        return;
                    } else {
                        rj2Var.dismiss();
                        return;
                    }
                }
                return;
            case 17:
                ((ln2) obj).dismiss();
                return;
            case 18:
                po2 po2Var = (po2) obj;
                TLRPC.Chat chat2 = po2Var.J;
                if (chat2 != null && !chat2.title.equals(((vc) po2Var.r.b).getText().toString())) {
                    po2Var.getMessagesController().y(po2Var.J.id, ((vc) po2Var.r.b).getText().toString(), new ko2(po2Var, (byte) 1));
                }
                TLRPC.Chat chat3 = po2Var.J;
                if (chat3 != null && po2Var.n != po2Var.h) {
                    if (chat3.default_banned_rights == null) {
                        chat3.default_banned_rights = new TLRPC.TL_chatBannedRights();
                    }
                    po2Var.J.default_banned_rights.manage_linked_peers = !po2Var.n;
                    po2Var.getMessagesController().O4(po2Var.c, po2Var.J.default_banned_rights, false, po2Var);
                }
                po2Var.finishFragment();
                return;
            case 19:
                ((qo2) obj).dismiss();
                return;
            case 20:
                ((jp2) obj).n.n1.E(0);
                return;
            case 21:
                pp2 pp2Var = ((kp2) obj).r;
                if (!sd2.w(27, pp2Var.p1)) {
                    pp2Var.dismiss();
                    return;
                }
                b61 b61Var = pp2Var.r1;
                if (!b61Var.R) {
                    b61Var.setLoading(true);
                    oc7 r1 = oc7.r1(pp2Var.a);
                    dp2 dp2Var = new dp2(pp2Var, (byte) 2);
                    TLRPC.TL_channels_getAdminedPublicChannels tL_channels_getAdminedPublicChannels = new TLRPC.TL_channels_getAdminedPublicChannels();
                    tL_channels_getAdminedPublicChannels.for_community_peer = true;
                    r1.getConnectionsManager().sendRequestTyped(tL_channels_getAdminedPublicChannels, new kc((byte) 0), new s87(r1, dp2Var, (byte) 0));
                    return;
                }
                return;
            case 22:
                ((ContactsActivity) obj).m0();
                return;
            case 23:
                ((i13) obj).run();
                return;
            case 24:
                ts9 ts9Var = (ts9) obj;
                v7b v7bVar = (v7b) ts9Var.b;
                v7bVar.a0.A1 = true;
                ((r23[]) ts9Var.c)[0].dismiss();
                v7bVar.h(true);
                return;
            case 25:
                x53 x53Var = (x53) obj;
                if (x53Var.k) {
                    x53Var.d();
                    return;
                }
                return;
            case 26:
                bjb bjbVar = ((bjb[]) obj)[0];
                bjbVar.setChecked(!bjbVar.e.h);
                return;
            case 27:
                ((my0) ((k6d) obj).b).y0.run();
                return;
            case 28:
                hg9.n(3, (d) obj);
                return;
            default:
                ((ef3) obj).d1(true);
                return;
        }
    }

    public k81(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
