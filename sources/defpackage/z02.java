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
public final class z02 implements q8c {
    public final byte a;
    public final Object b;

    public z02(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final Object a(Object obj) {
        View view;
        o39 o39Var;
        yb1 yb1Var;
        q5c q5cVar;
        View view2;
        byte b = this.a;
        int i = 6;
        boolean z = false;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                k27 k27Var = (k27) obj;
                ((h12) obj2).P = k27Var;
                return Boolean.valueOf(MediaController.w().n0(tb4.t(k27Var), k27Var, 0L, true, null, 0L));
            case 1:
                sd8 sd8Var = (sd8) obj2;
                View view3 = (View) obj;
                ImageReceiver imageReceiver = new ImageReceiver(view3);
                int i2 = bkb.Fc;
                if (bkb.I.o()) {
                    i = 3;
                }
                kcb c = uo3.c(i * 0.12f, i2);
                c.t = true;
                c.m = bkb.gf;
                imageReceiver.a0(gl5.p(usc.b(sd8Var.b.geo, 300, 168, 15, Math.min(2, (int) Math.ceil(gl.p)))), null, null, null, new ni2(c), null, 0);
                view3.addOnAttachStateChangeListener(new rd8(imageReceiver, (byte) 0));
                imageReceiver.q0(gl.L(14.0f));
                return new qa1(imageReceiver, view3.getContext().getResources().getDrawable(2131231650).mutate(), (byte) 4);
            case 2:
                if (((View) obj).getParent() != ((iz4) obj2).c) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!l5c.K(o39Var.T(view).f));
            case 3:
                Paint[] paintArr = ((kd5) obj2).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            case 4:
                rw5 rw5Var = (rw5) obj2;
                Integer num = (Integer) obj;
                if (num.intValue() == 2) {
                    x02 x02Var = new x02(rw5Var.getContext(), new hw5(rw5Var), false, false, false, rw5Var.G1);
                    x02Var.n = true;
                    x02Var.v1(k96.M0(2131754425, null));
                    x02Var.W3 = new sk4(rw5Var, x02Var, false, (byte) 4);
                    x02Var.setOnDismissListener(new g5((byte) 5));
                    x02Var.t1(1, false);
                    x02Var.Z0();
                    MediaController.h2 = true;
                    x02Var.d2.h0();
                    x02Var.show();
                } else if (num.intValue() == 6 && (yb1Var = rw5Var.P1) != null) {
                    yb1Var.a();
                }
                return Boolean.TRUE;
            case 5:
                ve6 ve6Var = (ve6) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    gl.c3(new re6(ve6Var, (byte) 3));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                URLSpan uRLSpan = (URLSpan) obj;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.getClass();
                if (uRLSpan != null) {
                    profileActivity.e3(uRLSpan.getURL(), null);
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
                k27 k27Var2 = (k27) obj;
                ((yx9) obj2).k2 = k27Var2;
                return Boolean.valueOf(MediaController.w().n0(tb4.t(k27Var2), k27Var2, 0L, true, null, 0L));
            case 9:
                qua quaVar = (qua) obj2;
                return quaVar.r[((Integer) obj).intValue() % quaVar.r.length];
            case 10:
                wdb wdbVar = (wdb) obj2;
                return wdbVar.r[((Integer) obj).intValue() % wdbVar.r.length];
            case 11:
                if (((View) obj).getParent() != ((q5c) obj2)) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!l5c.K(q5cVar.T(view2).f));
            default:
                return new isc((wt) obj2, (Integer) obj, (byte) 1);
        }
    }
}
