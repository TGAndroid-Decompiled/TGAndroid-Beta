package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
public final class ze1 implements ef7 {
    public final byte a;
    public final Object b;

    public ze1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void a(int i) {
        ad8 ad8Var;
        byte b = this.a;
        pj pjVar = pj.b;
        pj pjVar2 = pj.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((wf1) obj).X0(true);
                return;
            case 1:
                s42 s42Var = (s42) obj;
                n12 n12Var = s42Var.b;
                jj.X(n12Var.G3, n12Var.W0(), n12Var.S0() + 1, new jq0(s42Var, i, (byte) 1));
                return;
            case 2:
                ow4 ow4Var = (ow4) obj;
                if (i == 0) {
                    pjVar = pjVar2;
                }
                ow4Var.F0(oj.j(0L, pjVar), true, false, true);
                ow4Var.r1.setText("");
                return;
            case 3:
                ((NotificationsCustomSettingsActivity) obj).p0(true);
                return;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                if (photoViewer.E != null && (ad8Var = photoViewer.f0) != null && i > 0) {
                    d31.F(ad8Var, true).j();
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
                profileActivity.getNotificationCenter().k(80, Long.valueOf(profileActivity.e1));
                return;
            case 6:
                bua buaVar = (bua) obj;
                if (i == 0) {
                    pjVar = pjVar2;
                }
                buaVar.t = pjVar;
                buaVar.a(true);
                return;
            default:
                tzb tzbVar = ((xyb) obj).a;
                if (i == 0) {
                    tzbVar.S0(false);
                    return;
                } else {
                    tzbVar.finishFragment();
                    return;
                }
        }
    }
}
