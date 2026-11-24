package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
public final class re1 implements uc7 {
    public final byte a;
    public final Object b;

    public re1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(int i) {
        k98 k98Var;
        byte b = this.a;
        oj ojVar = oj.b;
        oj ojVar2 = oj.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((nf1) obj).W0(true);
                return;
            case 1:
                c42 c42Var = (c42) obj;
                x02 x02Var = c42Var.b;
                ij.X(x02Var.G3, x02Var.V0(), x02Var.R0() + 1, new jq0(c42Var, i, (byte) 1));
                return;
            case 2:
                lu4 lu4Var = (lu4) obj;
                if (i == 0) {
                    ojVar = ojVar2;
                }
                lu4Var.E0(nj.j(0L, ojVar), true, false, true);
                lu4Var.r1.setText("");
                return;
            case 3:
                ((NotificationsCustomSettingsActivity) obj).p0(true);
                return;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.f9;
                if (photoViewer.E != null && (k98Var = photoViewer.f0) != null && i > 0) {
                    u21.F(k98Var, true).j();
                    return;
                }
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) obj;
                RectF rectF = ProfileActivity.Z6;
                if (i == 1) {
                    profileActivity.getNotificationCenter().n(profileActivity, 4);
                    profileActivity.getNotificationCenter().k(4, new Object[0]);
                    profileActivity.J1 = (byte) 0;
                    profileActivity.finishFragment();
                    return;
                }
                profileActivity.getNotificationCenter().k(79, Long.valueOf(profileActivity.e1));
                return;
            case 6:
                aqa aqaVar = (aqa) obj;
                if (i == 0) {
                    ojVar = ojVar2;
                }
                aqaVar.s = ojVar;
                aqaVar.a(true);
                return;
            default:
                qvb qvbVar = ((wub) obj).a;
                if (i == 0) {
                    qvbVar.R0(false);
                    return;
                } else {
                    qvbVar.finishFragment();
                    return;
                }
        }
    }
}
