package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
public final class zf1 implements we7 {
    public final byte a;
    public final Object b;

    public zf1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(int i) {
        lb8 lb8Var;
        byte b = this.a;
        ok okVar = ok.b;
        ok okVar2 = ok.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((vg1) obj).X0(true);
                return;
            case 1:
                n52 n52Var = (n52) obj;
                i22 i22Var = n52Var.b;
                ik.X(i22Var.G3, i22Var.V0(), i22Var.R0() + 1, new jr0(n52Var, i, (byte) 1));
                return;
            case 2:
                mw4 mw4Var = (mw4) obj;
                if (i == 0) {
                    okVar = okVar2;
                }
                mw4Var.E0(nk.j(0L, okVar), true, false, true);
                mw4Var.r1.setText("");
                return;
            case 3:
                ((NotificationsCustomSettingsActivity) obj).q0(true);
                return;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                if (photoViewer.E != null && (lb8Var = photoViewer.f0) != null && i > 0) {
                    c41.F(lb8Var, true).j();
                    return;
                }
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.e7;
                if (i == 1) {
                    profileActivity.getNotificationCenter().n(profileActivity, 4);
                    profileActivity.getNotificationCenter().k(4, new Object[0]);
                    profileActivity.J1 = (byte) 0;
                    profileActivity.finishFragment();
                    return;
                }
                profileActivity.getNotificationCenter().k(80, Long.valueOf(profileActivity.e1));
                return;
            case 6:
                asa asaVar = (asa) obj;
                if (i == 0) {
                    okVar = okVar2;
                }
                asaVar.s = okVar;
                asaVar.a(true);
                return;
            default:
                sxb sxbVar = ((xwb) obj).a;
                if (i == 0) {
                    sxbVar.S0(false);
                    return;
                } else {
                    sxbVar.finishFragment();
                    return;
                }
        }
    }
}
