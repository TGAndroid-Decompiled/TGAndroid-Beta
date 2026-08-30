package nh;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.mc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bd;
public final class e implements h5.d {
    public final int f15288a;

    public e(int i10) {
        this.f15288a = i10;
    }

    @Override
    public final void accept(Object obj) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f15288a) {
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
                ((p) ((View) obj)).invalidate();
                return;
            case 3:
                ((o3.l) obj).a();
                return;
            case 4:
                ((o4.i0) obj).f16354b.release();
                return;
            case 5:
                bd.Y0((View) obj);
                return;
            case 6:
                View view2 = (View) obj;
                if ((view2 instanceof org.telegram.ui.Cells.t1) && (messageObject = ((org.telegram.ui.Cells.t1) view2).getMessageObject()) != null) {
                    messageObject.forceUpdate = true;
                    return;
                }
                return;
            case 7:
                View view3 = (View) obj;
                if ((view3 instanceof org.telegram.ui.Cells.t1) && (messageObject2 = ((org.telegram.ui.Cells.t1) view3).getMessageObject()) != null) {
                    messageObject2.forceUpdate = true;
                    messageObject2.reactionsChanged = true;
                    return;
                }
                return;
            case 8:
                View view4 = (View) obj;
                if (view4 instanceof org.telegram.ui.ActionBar.z2) {
                    ((org.telegram.ui.ActionBar.z2) view4).getTextView().invalidate();
                    return;
                } else {
                    view4.invalidate();
                    return;
                }
            case 9:
                View view5 = (View) obj;
                if (view5 instanceof org.telegram.ui.Cells.h5) {
                    org.telegram.ui.Cells.h5 h5Var = (org.telegram.ui.Cells.h5) view5;
                    h5Var.f21132b.invalidate();
                    h5Var.f21133c.invalidate();
                    return;
                } else if (view5 instanceof uf.l1) {
                    ((uf.l1) view5).f45374c.invalidate();
                    return;
                } else {
                    view5.invalidate();
                    return;
                }
            case 10:
                View view6 = (View) obj;
                if (view6 instanceof org.telegram.ui.Cells.d8) {
                    ((org.telegram.ui.Cells.d8) view6).a(true);
                    return;
                }
                return;
            case 11:
                View view7 = (View) obj;
                if (view7 instanceof org.telegram.ui.Cells.d8) {
                    ((org.telegram.ui.Cells.d8) view7).c(true);
                    return;
                }
                return;
            case 12:
                Long l10 = (Long) obj;
                if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(ProfileActivity.m4(l10.longValue()));
                        return;
                    }
                    return;
                }
                AndroidUtilities.runOnUIThread(new mc(28));
                return;
            case 13:
                Boolean bool = (Boolean) obj;
                return;
            case 14:
                View view8 = (View) obj;
                view8.setScaleX(1.0f);
                view8.setScaleY(1.0f);
                return;
            case 15:
                View view9 = (View) obj;
                if (view9 instanceof org.telegram.ui.web.h) {
                    ((org.telegram.ui.web.h) view9).setChecked(false);
                    return;
                }
                return;
            case 16:
                View view10 = (View) obj;
                if (view10 instanceof org.telegram.ui.web.h) {
                    ((org.telegram.ui.web.h) view10).setChecked(false);
                    return;
                }
                return;
            case 17:
                View view11 = (View) obj;
                if (view11 instanceof uf.l1) {
                    ((uf.l1) view11).f45374c.invalidate();
                    return;
                }
                return;
            case 18:
                View view12 = (View) obj;
                if (view12 instanceof uf.l1) {
                    ((uf.l1) view12).d.a(false, true);
                    return;
                }
                return;
            default:
                ((View) obj).invalidate();
                return;
        }
    }

    public e(bd bdVar) {
        this.f15288a = 5;
    }
}
