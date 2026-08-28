package ih;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.lj0;
import org.telegram.ui.xc;
public final class e implements d5.d {
    public final int f11344a;

    public e(int i9) {
        this.f11344a = i9;
    }

    @Override
    public final void accept(Object obj) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f11344a) {
            case 0:
                View view = (View) obj;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                return;
            case 1:
                ((View) obj).setTranslationY(0.0f);
                return;
            case 2:
                ((q) ((View) obj)).invalidate();
                return;
            case 3:
                ((j4.y0) obj).f13616b.getClass();
                return;
            case 4:
                xc.Y0((View) obj);
                return;
            case 5:
                View view2 = (View) obj;
                if ((view2 instanceof org.telegram.ui.Cells.t1) && (messageObject = ((org.telegram.ui.Cells.t1) view2).getMessageObject()) != null) {
                    messageObject.forceUpdate = true;
                    return;
                }
                return;
            case 6:
                View view3 = (View) obj;
                if ((view3 instanceof org.telegram.ui.Cells.t1) && (messageObject2 = ((org.telegram.ui.Cells.t1) view3).getMessageObject()) != null) {
                    messageObject2.forceUpdate = true;
                    messageObject2.reactionsChanged = true;
                    return;
                }
                return;
            case 7:
                View view4 = (View) obj;
                if (view4 instanceof org.telegram.ui.ActionBar.y2) {
                    ((org.telegram.ui.ActionBar.y2) view4).getTextView().invalidate();
                    return;
                } else {
                    view4.invalidate();
                    return;
                }
            case 8:
                View view5 = (View) obj;
                if (view5 instanceof org.telegram.ui.Cells.h5) {
                    org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view5;
                    h5Var.f24434b.invalidate();
                    h5Var.f24435c.invalidate();
                    return;
                } else if (view5 instanceof pf.m1) {
                    ((pf.m1) view5).f45713c.invalidate();
                    return;
                } else {
                    view5.invalidate();
                    return;
                }
            case 9:
                View view6 = (View) obj;
                if (view6 instanceof org.telegram.ui.Cells.d8) {
                    ((org.telegram.ui.Cells.d8) view6).a(true);
                    return;
                }
                return;
            case 10:
                View view7 = (View) obj;
                if (view7 instanceof org.telegram.ui.Cells.d8) {
                    ((org.telegram.ui.Cells.d8) view7).c(true);
                    return;
                }
                return;
            case 11:
                Long l10 = (Long) obj;
                if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(ProfileActivity.m4(l10.longValue()));
                        return;
                    }
                    return;
                }
                AndroidUtilities.runOnUIThread(new lj0(0));
                return;
            case 12:
                Boolean bool = (Boolean) obj;
                return;
            case 13:
                View view8 = (View) obj;
                view8.setScaleX(1.0f);
                view8.setScaleY(1.0f);
                return;
            case 14:
                View view9 = (View) obj;
                if (view9 instanceof org.telegram.ui.web.h) {
                    ((org.telegram.ui.web.h) view9).setChecked(false);
                    return;
                }
                return;
            case 15:
                View view10 = (View) obj;
                if (view10 instanceof org.telegram.ui.web.h) {
                    ((org.telegram.ui.web.h) view10).setChecked(false);
                    return;
                }
                return;
            case 16:
                View view11 = (View) obj;
                if (view11 instanceof pf.m1) {
                    ((pf.m1) view11).f45713c.invalidate();
                    return;
                }
                return;
            case 17:
                View view12 = (View) obj;
                if (view12 instanceof pf.m1) {
                    ((pf.m1) view12).d.a(false, true);
                    return;
                }
                return;
            default:
                ((View) obj).invalidate();
                return;
        }
    }

    public e(xc xcVar) {
        this.f11344a = 4;
    }
}
