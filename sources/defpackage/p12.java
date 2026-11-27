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
public final class p12 implements qcc {
    public final byte a;
    public final Object b;

    public p12(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final Object a(Object obj) {
        View view;
        d79 d79Var;
        gc1 gc1Var;
        q9c q9cVar;
        View view2;
        byte b = this.a;
        int i = 6;
        boolean z = true;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                r47 r47Var = (r47) obj;
                ((x12) obj2).P = r47Var;
                return Boolean.valueOf(MediaController.z().q0(qd4.t(r47Var), r47Var, 0L, true, null, 0L));
            case 1:
                gh8 gh8Var = (gh8) obj2;
                View view3 = (View) obj;
                ImageReceiver imageReceiver = new ImageReceiver(view3);
                int i2 = aob.Gc;
                if (aob.I.o()) {
                    i = 3;
                }
                ggb c = lp3.c(i * 0.12f, i2);
                c.t = true;
                c.m = aob.hf;
                imageReceiver.a0(jn5.p(jxc.b(gh8Var.b.geo, 300, 168, 15, Math.min(2, (int) Math.ceil(hl.p)))), null, null, null, new jj2(c), null, 0);
                view3.addOnAttachStateChangeListener(new fh8(imageReceiver, (byte) 0));
                imageReceiver.q0(hl.L(14.0f));
                return new ya1(imageReceiver, view3.getContext().getResources().getDrawable(2131231650).mutate(), (byte) 4);
            case 2:
                if (((View) obj).getParent() != ((m15) obj2).c) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!l9c.K(d79Var.U(view).f));
            case 3:
                Paint[] paintArr = ((lf5) obj2).h;
                return paintArr[((Integer) obj).intValue() % paintArr.length];
            case 4:
                wy5 wy5Var = (wy5) obj2;
                Integer num = (Integer) obj;
                if (num.intValue() == 2) {
                    n12 n12Var = new n12(wy5Var.getContext(), new my5(wy5Var), false, false, false, wy5Var.A1);
                    n12Var.n = true;
                    n12Var.w1(ob6.M0(2131754421, null));
                    n12Var.W3 = new ym4(wy5Var, n12Var, false, (byte) 4);
                    n12Var.setOnDismissListener(new h5((byte) 5));
                    n12Var.u1(1, false);
                    n12Var.a1();
                    MediaController.h2 = true;
                    n12Var.d2.g0();
                    n12Var.show();
                } else if (num.intValue() == 6 && (gc1Var = wy5Var.J1) != null) {
                    gc1Var.a();
                }
                return Boolean.TRUE;
            case 5:
                zg6 zg6Var = (zg6) obj2;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj;
                if (tL_error != null && "PHONE_CODE_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    hl.c3(new ug6(zg6Var, (byte) 3));
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            case 6:
                ProfileActivity profileActivity = (ProfileActivity) obj2;
                URLSpan uRLSpan = (URLSpan) obj;
                RectF rectF = ProfileActivity.Z6;
                profileActivity.getClass();
                if (uRLSpan != null) {
                    profileActivity.f3(uRLSpan.getURL(), null);
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            case 7:
                int i3 = ((SparseIntArray) obj2).get(((Integer) obj).intValue(), -1);
                if (i3 == -1) {
                    return Boolean.TRUE;
                }
                if (i3 != 1) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                r47 r47Var2 = (r47) obj;
                ((r1a) obj2).k2 = r47Var2;
                return Boolean.valueOf(MediaController.z().q0(qd4.t(r47Var2), r47Var2, 0L, true, null, 0L));
            case 9:
                uya uyaVar = (uya) obj2;
                return uyaVar.r[((Integer) obj).intValue() % uyaVar.r.length];
            case 10:
                rhb rhbVar = (rhb) obj2;
                return rhbVar.r[((Integer) obj).intValue() % rhbVar.r.length];
            case 11:
                if (((View) obj).getParent() != ((q9c) obj2)) {
                    return Boolean.FALSE;
                }
                return Boolean.valueOf(!l9c.K(q9cVar.U(view2).f));
            default:
                return new zwc((xt) obj2, (Integer) obj, (byte) 0);
        }
    }
}
