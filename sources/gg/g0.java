package gg;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.a3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.g8;
import org.telegram.ui.Cells.h5;
import org.telegram.ui.Components.c30;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cd;
public final class g0 implements e2.h {
    public final int f8892a;

    public g0(int i10) {
        this.f8892a = i10;
    }

    @Override
    public final void accept(Object obj) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f8892a) {
            case 0:
                View view = (View) obj;
                if (view instanceof g2) {
                    ((g2) view).f8895c.invalidate();
                    return;
                }
                return;
            case 1:
                View view2 = (View) obj;
                if (view2 instanceof g2) {
                    ((g2) view2).d.a(false, true);
                    return;
                }
                return;
            case 2:
                ((View) obj).invalidate();
                return;
            case 3:
                ((m4.l1) obj).e();
                return;
            case 4:
                ((m4.l1) obj).e0();
                return;
            case 5:
                ((m4.l1) obj).z0();
                return;
            case 6:
                ((m4.l1) obj).G0();
                return;
            case 7:
                ((m4.l1) obj).V();
                return;
            case 8:
                ((m4.l1) obj).F();
                return;
            case 9:
                ((m4.l1) obj).F0();
                return;
            case 10:
                ((m4.l1) obj).E0();
                return;
            case 11:
                ((m4.l1) obj).L();
                return;
            case 12:
                ((m4.l1) obj).stop();
                return;
            case 13:
                ((m4.l1) obj).b();
                return;
            case 14:
                ((m4.l1) obj).H();
                return;
            case 15:
                ((m4.l1) obj).v();
                return;
            case 16:
                ((n2.j) obj).a();
                return;
            case 17:
                cd.Y0((View) obj);
                return;
            case 18:
                View view3 = (View) obj;
                if ((view3 instanceof org.telegram.ui.Cells.t1) && (messageObject = ((org.telegram.ui.Cells.t1) view3).getMessageObject()) != null) {
                    messageObject.forceUpdate = true;
                    return;
                }
                return;
            case 19:
                View view4 = (View) obj;
                if ((view4 instanceof org.telegram.ui.Cells.t1) && (messageObject2 = ((org.telegram.ui.Cells.t1) view4).getMessageObject()) != null) {
                    messageObject2.forceUpdate = true;
                    messageObject2.reactionsChanged = true;
                    return;
                }
                return;
            case 20:
                View view5 = (View) obj;
                if (view5 instanceof a3) {
                    ((a3) view5).getTextView().invalidate();
                    return;
                } else {
                    view5.invalidate();
                    return;
                }
            case 21:
                View view6 = (View) obj;
                if (view6 instanceof h5) {
                    h5 h5Var = (h5) view6;
                    h5Var.f19257b.invalidate();
                    h5Var.f19258c.invalidate();
                    return;
                } else if (view6 instanceof g2) {
                    ((g2) view6).f8895c.invalidate();
                    return;
                } else {
                    view6.invalidate();
                    return;
                }
            case 22:
                View view7 = (View) obj;
                if (view7 instanceof g8) {
                    ((g8) view7).a(true);
                    return;
                }
                return;
            case 23:
                View view8 = (View) obj;
                if (view8 instanceof g8) {
                    ((g8) view8).c(true);
                    return;
                }
                return;
            case 24:
                Long l4 = (Long) obj;
                if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                    p2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(ProfileActivity.m4(l4.longValue()));
                        return;
                    }
                    return;
                }
                AndroidUtilities.runOnUIThread(new c30(20));
                return;
            case 25:
                Boolean bool = (Boolean) obj;
                return;
            case 26:
                View view9 = (View) obj;
                view9.setScaleX(1.0f);
                view9.setScaleY(1.0f);
                return;
            case 27:
                View view10 = (View) obj;
                if (view10 instanceof org.telegram.ui.web.i) {
                    ((org.telegram.ui.web.i) view10).setChecked(false);
                    return;
                }
                return;
            case 28:
                View view11 = (View) obj;
                if (view11 instanceof org.telegram.ui.web.i) {
                    ((org.telegram.ui.web.i) view11).setChecked(false);
                    return;
                }
                return;
            default:
                ((u2.a1) obj).f42272b.release();
                return;
        }
    }

    public g0(cd cdVar) {
        this.f8892a = 17;
    }
}
