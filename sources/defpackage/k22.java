package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;
import android.text.style.URLSpan;
import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ProfileActivity;
public final class k22 implements rac {
    public final byte a;
    public final Object b;

    public k22(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final Object a(Object obj) {
        View view;
        r59 r59Var;
        gd1 gd1Var;
        q7c q7cVar;
        View view2;
        byte b = this.a;
        int i = 6;
        boolean z = false;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                k47 k47Var = (k47) obj;
                ((s22) obj2).P = k47Var;
                return Boolean.valueOf(MediaController.w().n0(td4.u(k47Var), k47Var, 0L, true, null, 0L));
            case 1:
                uf8 uf8Var = (uf8) obj2;
                View view3 = (View) obj;
                ImageReceiver imageReceiver = new ImageReceiver(view3);
                int i2 = cmb.Fc;
                if (cmb.I.o()) {
                    i = 3;
                }
                meb c = eq3.c(i * 0.12f, i2);
                c.t = true;
                c.m = cmb.gf;
                imageReceiver.a0(gn5.p(vuc.b(uf8Var.b.geo, 300, 168, 15, Math.min(2, (int) Math.ceil(gm.p)))), null, null, null, new bk2(c), null, 0);
                view3.addOnAttachStateChangeListener(new tf8(imageReceiver, (byte) 0));
                imageReceiver.q0(gm.L(14.0f));
                return new yb1(imageReceiver, view3.getContext().getResources().getDrawable(2131231651).mutate(), (byte) 4);
            case 2:
                if (((View) obj).getParent() != ((h15) obj2).c) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!l7c.K(r59Var.T(view).f));
            case 3:
                Paint[] paintArr = ((if5) obj2).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            case 4:
                ry5 ry5Var = (ry5) obj2;
                Integer num = (Integer) obj;
                if (num.intValue() == 2) {
                    i22 i22Var = new i22(ry5Var.getContext(), new hy5(ry5Var), false, false, false, ry5Var.G1);
                    i22Var.n = true;
                    i22Var.v1(jb6.M0(2131754425, null));
                    i22Var.W3 = new mj4(ry5Var, i22Var, false, (byte) 6);
                    i22Var.setOnDismissListener(new g5((byte) 5));
                    i22Var.t1(1, false);
                    i22Var.Z0();
                    MediaController.h2 = true;
                    i22Var.d2.h0();
                    i22Var.show();
                } else if (num.intValue() == 6 && (gd1Var = ry5Var.P1) != null) {
                    gd1Var.a();
                }
                return Boolean.TRUE;
            case 5:
                wg6 wg6Var = (wg6) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    gm.c3(new sg6(wg6Var, (byte) 3));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                URLSpan uRLSpan = (URLSpan) obj;
                RectF rectF = ProfileActivity.e7;
                profileActivity.getClass();
                if (uRLSpan != null) {
                    profileActivity.i3(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            case 7:
                int i3 = ((SparseIntArray) obj2).get(((Integer) obj).intValue(), -1);
                if (i3 == -1) {
                    return Boolean.TRUE;
                }
                if (i3 == 1) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                k47 k47Var2 = (k47) obj;
                ((zz9) obj2).k2 = k47Var2;
                return Boolean.valueOf(MediaController.w().n0(td4.u(k47Var2), k47Var2, 0L, true, null, 0L));
            case 9:
                uwa uwaVar = (uwa) obj2;
                return uwaVar.r[((Integer) obj).intValue() % uwaVar.r.length];
            case 10:
                wfb wfbVar = (wfb) obj2;
                return wfbVar.r[((Integer) obj).intValue() % wfbVar.r.length];
            case 11:
                if (((View) obj).getParent() != ((q7c) obj2)) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!l7c.K(q7cVar.T(view2).f));
            default:
                return new ptc((wu) obj2, (Integer) obj, (byte) 3);
        }
    }
}
