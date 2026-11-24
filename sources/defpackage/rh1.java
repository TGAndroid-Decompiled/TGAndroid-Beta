package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ChatsWidgetConfigActivity;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.p;
import org.telegram.ui.LaunchActivity;
public final class rh1 implements ed, n8c, ll5, yw5, xz8, sc7, cq0, do5, e39, CameraController.VideoTakeCallback, m48, i8b, fi4, ResultCallback, vt3, m7 {
    public final byte a;
    public final Object b;

    public rh1(zp1 zp1Var, boolean z) {
        this.a = (byte) 7;
        this.b = zp1Var;
    }

    @Override
    public final void C(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        oy8 y;
        rk1 rk1Var;
        uk1 uk1Var = (uk1) this.b;
        if (z && (y = uk1Var.J.y()) != null) {
            k27 k27Var = uk1Var.Q0;
            if (k27Var != null && !k27Var.o1) {
                k27Var.o1 = true;
                y.I(0, false, false);
                gl.d3(new pk1(y, (byte) 0));
                if (k27Var.n1 || uk1Var.M1) {
                    k27Var.n1 = false;
                    uk1Var.M1 = false;
                    try {
                        uk1Var.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (uk1Var.getContext() instanceof LaunchActivity) {
                        ((LaunchActivity) uk1Var.getContext()).w0.c(false);
                    }
                    TLRPC.VideoSize videoSize = uk1Var.J1;
                    if (videoSize != null && (rk1Var = uk1Var.g1) != null) {
                        rk1Var.u(uk1Var, uk1Var.I1, videoSize);
                    }
                }
            } else if (y.b0 < 1) {
                y.stop();
                y.I(y.e[0] - 1, false, false);
            }
        }
    }

    @Override
    public final boolean a(gi3 gi3Var, int i, Bundle bundle) {
        gy1 gy1Var = (gy1) this.b;
        ChatActivityEnterView chatActivityEnterView = gy1Var.f2;
        if (chatActivityEnterView.o7) {
            return true;
        }
        int i2 = t01.a;
        if (Build.VERSION.SDK_INT >= 25 && (i & 1) != 0) {
            try {
                ((fo5) gi3Var.a).h();
            } catch (Exception unused) {
                return false;
            }
        }
        fo5 fo5Var = (fo5) gi3Var.a;
        if (!fo5Var.getDescription().hasMimeType("image/gif") && !z3a.w0(fo5Var.f(), null)) {
            gy1Var.J(fo5Var.f(), fo5Var.getDescription().getMimeType(0));
            return true;
        } else if (chatActivityEnterView.c()) {
            ij.J(chatActivityEnterView.E3, chatActivityEnterView.F3.a(), new q31(gy1Var, gi3Var, (byte) 21), chatActivityEnterView.L4);
            return true;
        } else {
            gy1Var.L(gi3Var, true, 0, 0);
            return true;
        }
    }

    public final void b(String str) {
        mu1 mu1Var = ((vs1) this.b).R;
        if (str.startsWith("@")) {
            mu1Var.getMessagesController().z3(str.substring(1), mu1Var, 0, null);
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            if (str.startsWith("/")) {
                mu1Var.a0.B1(null, str, false, false);
                if (mu1Var.a0.getFieldText() == null) {
                    mu1Var.u7(false);
                    return;
                }
                return;
            }
            mu1Var.Ca(0, str, null, null, false);
        } else {
            cj3 cj3Var = new cj3(null);
            cj3Var.p2 = str;
            mu1Var.presentFragment(cj3Var);
        }
    }

    @Override
    public final void c(ArrayList arrayList) {
        vo1 vo1Var = (vo1) this.b;
        mu1 mu1Var = vo1Var.p;
        if (mu1Var.getParentActivity() != null && mu1Var.getParentActivity() != null) {
            uo1 uo1Var = new uo1(vo1Var, mu1Var, mu1Var.getParentActivity(), mu1Var.Ba, arrayList);
            boolean O7 = mu1Var.O7();
            uo1Var.i0 = O7;
            uo1Var.n = O7;
            uo1Var.p0 = false;
            mu1Var.F5(false);
            mu1Var.showDialog(uo1Var);
        }
    }

    @Override
    public final boolean d(int i, View view) {
        Object O;
        d32 d32Var = (d32) this.b;
        w39 adapter = d32Var.r.getAdapter();
        v22 v22Var = d32Var.w;
        if (adapter == v22Var) {
            O = v22Var.E(i);
        } else {
            c32 c32Var = d32Var.E;
            O = c32Var.O(c32Var.S(i), c32Var.Q(i));
        }
        return d32Var.U(view, O);
    }

    @Override
    public final void e1(long j, int i, g28 g28Var) {
        g28Var.run();
    }

    @Override
    public final void h(int i) {
        nl2 nl2Var = ((p) this.b).a;
        boolean z = true;
        if (i != 1 && i != 2) {
            if (i == 3) {
                nl2Var.b();
                return;
            }
            return;
        }
        if (i != 2) {
            z = false;
        }
        nl2Var.a(z);
    }

    @Override
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 1:
                ti1 ti1Var = (ti1) obj3;
                c4c c4cVar = (c4c) obj;
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f = (Float) serializable;
                Float f2 = (Float) serializable2;
                vi1 vi1Var = ti1Var.f;
                Object obj4 = c4cVar.H;
                if (obj4 instanceof TL_stars.StarsTransaction) {
                    jva.k1(ti1Var.getContext(), true, vi1Var.e, ti1Var.c, (TL_stars.StarsTransaction) c4cVar.H, ti1Var.b);
                    return;
                } else if (obj4 instanceof TL_stats.BroadcastRevenueTransaction) {
                    zi1.N(ti1Var.getContext(), ti1Var.c, (TL_stats.BroadcastRevenueTransaction) c4cVar.H, vi1Var.e, ti1Var.b);
                    return;
                } else {
                    return;
                }
            default:
                it2 it2Var = (it2) obj3;
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f3 = (Float) serializable;
                Float f4 = (Float) serializable2;
                int i = ((c4c) obj).d;
                if (i == 1) {
                    TLRPC.User V1 = it2Var.getMessagesController().V1(Long.valueOf(it2Var.I));
                    if (V1 != null && it2Var.getParentActivity() != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, it2Var.r, it2Var.getParentActivity());
                        String M0 = k96.M0(2131751540, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        hdVar.U = k96.M0(2131754100, null);
                        alertDialog$Builder.j(k96.M0(2131751586, null), new v82(it2Var, V1, (byte) 8));
                        alertDialog$Builder.g(k96.M0(2131752577, null), null);
                        alertDialog$Builder.c(-1);
                        alertDialog$Builder.o();
                        return;
                    }
                    return;
                } else if (i == 2) {
                    boolean z = !it2Var.Y;
                    it2Var.Y = z;
                    ((ahb) view2).setChecked(z);
                    return;
                } else {
                    return;
                }
        }
    }

    @Override
    public final void k(boolean z) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 7:
                mu1 mu1Var = ((zp1) obj).b.b;
                mu1Var.va(mu1Var.s4, true);
                return;
            case 8:
                mu1 mu1Var2 = ((js1) obj).m1;
                if (z) {
                    mu1Var2.Z5();
                    UndoView undoView = mu1Var2.N3;
                    if (undoView != null) {
                        undoView.j(76, 0L, null);
                        return;
                    }
                    return;
                }
                return;
            default:
                kf2 kf2Var = ((cf2) obj).m1;
                if (z && kf2.Y(kf2Var) != null) {
                    d dVar = (d) kf2.a0(kf2Var).getFragmentStack().get(kf2.Z(kf2Var).getFragmentStack().size() - 2);
                    if (dVar instanceof p82) {
                        dVar.removeSelfFromStack();
                        Bundle bundle = new Bundle();
                        bundle.putLong("chat_id", kf2Var.N);
                        p82 p82Var = new p82(bundle);
                        p82Var.p0(kf2Var.r);
                        ((ActionBarLayout) kf2.c0(kf2Var)).b(kf2.b0(kf2Var).getFragmentStack().size() - 1, p82Var);
                        kf2Var.finishFragment();
                        p82Var.c.j(76, 0L, null);
                        return;
                    }
                    kf2Var.finishFragment();
                    return;
                }
                return;
        }
    }

    @Override
    public final void m() {
        ChatsWidgetConfigActivity chatsWidgetConfigActivity = (ChatsWidgetConfigActivity) this.b;
        int i = ChatsWidgetConfigActivity.G;
        Intent intent = new Intent();
        intent.putExtra("appWidgetId", chatsWidgetConfigActivity.F);
        chatsWidgetConfigActivity.setResult(-1, intent);
        chatsWidgetConfigActivity.finish();
    }

    @Override
    public final void n(Exception exc) {
        ((eq0) this.b).setClickable(false);
    }

    @Override
    public final void onComplete(Object obj) {
        je2 je2Var = (je2) this.b;
        Pair pair = (Pair) obj;
        if (pair != null) {
            je2Var.a.put((Long) pair.first, (Bitmap) pair.second);
        }
    }

    @Override
    public final void onFinishVideoRecording(String str, long j) {
        int i;
        int i2;
        jm6 jm6Var;
        q42 q42Var = (q42) this.b;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = q42Var.e;
        x02 x02Var = chatAttachAlertPhotoLayout.b;
        if (q42Var.a != null && !x02Var.P1 && chatAttachAlertPhotoLayout.Q != null) {
            ChatAttachAlertPhotoLayout.r1 = false;
            try {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(new File(str).getAbsolutePath(), options);
                i = options.outWidth;
                try {
                    i2 = options.outHeight;
                } catch (Exception unused) {
                    i2 = 0;
                    int i3 = i;
                    int i4 = ChatAttachAlertPhotoLayout.v1;
                    ChatAttachAlertPhotoLayout.v1 = i4 - 1;
                    jm6Var = new jm6(i4, q42Var.a.getAbsolutePath(), 0, true, i3, i2);
                    jm6Var.E = (int) (((float) j) / 1000.0f);
                    jm6Var.c = str;
                    if (x02Var.N2 != 0) {
                        zl6 zl6Var = new zl6();
                        jm6Var.A = zl6Var;
                        zl6Var.l = true;
                        zl6Var.u = false;
                        zl6Var.v = 1.0f;
                    }
                    chatAttachAlertPhotoLayout.m0(jm6Var, false, false);
                }
            } catch (Exception unused2) {
                i = 0;
            }
            int i32 = i;
            int i42 = ChatAttachAlertPhotoLayout.v1;
            ChatAttachAlertPhotoLayout.v1 = i42 - 1;
            jm6Var = new jm6(i42, q42Var.a.getAbsolutePath(), 0, true, i32, i2);
            jm6Var.E = (int) (((float) j) / 1000.0f);
            jm6Var.c = str;
            if (x02Var.N2 != 0 && chatAttachAlertPhotoLayout.Q.isFrontface()) {
                zl6 zl6Var2 = new zl6();
                jm6Var.A = zl6Var2;
                zl6Var2.l = true;
                zl6Var2.u = false;
                zl6Var2.v = 1.0f;
            }
            chatAttachAlertPhotoLayout.m0(jm6Var, false, false);
        }
    }

    @Override
    public final boolean run() {
        TLRPC.Message message;
        fb5 fb5Var;
        gb2 gb2Var = (gb2) this.b;
        k27 k27Var = gb2Var.Q5;
        if (k27Var != null && (message = k27Var.k) != null) {
            if (k27Var.D != 29 || ((fb5Var = gb2Var.X5) != null && fb5Var.i)) {
                if ((message.noforwards && !k27.c3(message)) || gb2Var.Q5.R4() || gb2Var.Q5.y2()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public final void u(hd hdVar, int i) {
        int i2;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((yh1) obj).h0(hdVar);
                return;
            case 4:
                ((vm1) obj).run();
                return;
            case 6:
                mu1 mu1Var = ((aq1) obj).b;
                mu1Var.finishFragment();
                mu1Var.getNotificationCenter().k(127, mu1Var.e4);
                return;
            case 10:
                mu1 mu1Var2 = ((qs1) obj).a.R;
                i2 = ((d) mu1Var2).currentAccount;
                je2.e(i2).a(mu1Var2.l6, true, true);
                return;
            case 11:
                ((ay1) obj).a.V0.q();
                return;
            case 13:
                ((kx1) obj).run();
                na7.c1().edit().putBoolean("trimvoicehint", false).apply();
                return;
            case 17:
                ((k62) obj).b.dismiss();
                return;
            case 18:
                ((s52) obj).a.F.q();
                return;
            case 20:
                ((w82) obj).b.d0();
                return;
            case 21:
                x92 x92Var = (x92) obj;
                boolean z = x92Var.s;
                if (!z || x92Var.h.linked_chat_id != 0) {
                    hd[] hdVarArr = {new hd(3, null, x92Var.getParentActivity())};
                    TLRPC.TL_channels_setDiscussionGroup tL_channels_setDiscussionGroup = new TLRPC.TL_channels_setDiscussionGroup();
                    if (z) {
                        tL_channels_setDiscussionGroup.broadcast = na7.g1(x92Var.f);
                        tL_channels_setDiscussionGroup.group = new TLRPC.TL_inputChannelEmpty();
                    } else {
                        tL_channels_setDiscussionGroup.broadcast = new TLRPC.TL_inputChannelEmpty();
                        tL_channels_setDiscussionGroup.group = na7.g1(x92Var.f);
                    }
                    gl.e3(new l92(x92Var, hdVarArr, x92Var.getConnectionsManager().sendRequest(tL_channels_setDiscussionGroup, new pl(x92Var, hdVarArr, (byte) 21)), (byte) 0), 500L);
                    return;
                }
                return;
            default:
                ((fh) obj).a(1);
                return;
        }
    }

    @Override
    public final boolean w(long j, int i, int i2, int i3, j8b j8bVar) {
        k72 k72Var = (k72) ((j72) this.b).T;
        ImageReceiver imageReceiver = k72Var.a;
        j8bVar.c = imageReceiver;
        j8bVar.l = imageReceiver;
        j72 j72Var = k72Var.H;
        j8bVar.m = j72Var;
        boolean z = j72Var.w;
        k72 k72Var2 = k72Var.L.e;
        j8bVar.a = k72Var2;
        j8bVar.k = k72Var2.getAlpha();
        j8bVar.h = 0.0f;
        j8bVar.i = gl.q.y;
        j8bVar.g = (View) k72Var.getParent();
        return true;
    }

    @Override
    public final void onError(TLRPC.TL_error tL_error) {
    }

    public rh1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void i(boolean z) {
    }

    @Override
    public final void onError(Throwable th) {
    }

    @Override
    public final void v(ImageReceiver imageReceiver) {
    }

    @Override
    public final void E(int i, Drawable drawable) {
    }
}
