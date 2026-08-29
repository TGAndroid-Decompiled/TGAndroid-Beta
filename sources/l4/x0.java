package l4;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.y2;
import org.telegram.ui.Cells.b8;
import org.telegram.ui.Cells.f5;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ef0;
import org.telegram.ui.vc;
public final class x0 implements f5.d {
    public final int f14470a;

    public x0(int i10) {
        this.f14470a = i10;
    }

    @Override
    public final void accept(Object obj) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f14470a) {
            case 0:
                ((z0) obj).f14475b.getClass();
                return;
            case 1:
                View view = (View) obj;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                return;
            case 2:
                ((View) obj).setTranslationY(0.0f);
                return;
            case 3:
                ((lh.o) ((View) obj)).invalidate();
                return;
            case 4:
                vc.Y0((View) obj);
                return;
            case 5:
                View view2 = (View) obj;
                if ((view2 instanceof s1) && (messageObject = ((s1) view2).getMessageObject()) != null) {
                    messageObject.forceUpdate = true;
                    return;
                }
                return;
            case 6:
                View view3 = (View) obj;
                if ((view3 instanceof s1) && (messageObject2 = ((s1) view3).getMessageObject()) != null) {
                    messageObject2.forceUpdate = true;
                    messageObject2.reactionsChanged = true;
                    return;
                }
                return;
            case 7:
                View view4 = (View) obj;
                if (view4 instanceof y2) {
                    ((y2) view4).getTextView().invalidate();
                    return;
                } else {
                    view4.invalidate();
                    return;
                }
            case 8:
                View view5 = (View) obj;
                if (view5 instanceof f5) {
                    f5 f5Var = (f5) view5;
                    f5Var.f24314b.invalidate();
                    f5Var.f24315c.invalidate();
                    return;
                } else if (view5 instanceof sf.m1) {
                    ((sf.m1) view5).f47886c.invalidate();
                    return;
                } else {
                    view5.invalidate();
                    return;
                }
            case 9:
                View view6 = (View) obj;
                if (view6 instanceof b8) {
                    ((b8) view6).a(true);
                    return;
                }
                return;
            case 10:
                View view7 = (View) obj;
                if (view7 instanceof b8) {
                    ((b8) view7).c(true);
                    return;
                }
                return;
            case 11:
                Long l10 = (Long) obj;
                if (l10 != null && l10.longValue() != Long.MAX_VALUE) {
                    o2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(ProfileActivity.m4(l10.longValue()));
                        return;
                    }
                    return;
                }
                AndroidUtilities.runOnUIThread(new ef0(2));
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
                if (view9 instanceof org.telegram.ui.web.i) {
                    ((org.telegram.ui.web.i) view9).setChecked(false);
                    return;
                }
                return;
            case 15:
                View view10 = (View) obj;
                if (view10 instanceof org.telegram.ui.web.i) {
                    ((org.telegram.ui.web.i) view10).setChecked(false);
                    return;
                }
                return;
            case 16:
                View view11 = (View) obj;
                if (view11 instanceof sf.m1) {
                    ((sf.m1) view11).f47886c.invalidate();
                    return;
                }
                return;
            case 17:
                View view12 = (View) obj;
                if (view12 instanceof sf.m1) {
                    ((sf.m1) view12).d.a(false, true);
                    return;
                }
                return;
            default:
                ((View) obj).invalidate();
                return;
        }
    }

    public x0(vc vcVar) {
        this.f14470a = 4;
    }
}
