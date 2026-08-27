package j4;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.ActionBar.x2;
import org.telegram.ui.Cells.a8;
import org.telegram.ui.Cells.e5;
import org.telegram.ui.Cells.s1;
import org.telegram.ui.Components.gc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xc;
import qf.m1;

public final class w0 implements d5.d {

    public final int f12703a;

    public w0(int i10) {
        this.f12703a = i10;
    }

    @Override
    public final void accept(Object obj) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f12703a) {
            case 0:
                ((y0) obj).f12714b.getClass();
                break;
            case 1:
                View view = (View) obj;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                break;
            case 2:
                ((View) obj).setTranslationY(0.0f);
                break;
            case 3:
                ((jh.o) ((View) obj)).invalidate();
                break;
            case 4:
                xc.Y0((View) obj);
                break;
            case 5:
                View view2 = (View) obj;
                if ((view2 instanceof s1) && (messageObject = ((s1) view2).getMessageObject()) != null) {
                    messageObject.forceUpdate = true;
                    break;
                }
                break;
            case 6:
                View view3 = (View) obj;
                if ((view3 instanceof s1) && (messageObject2 = ((s1) view3).getMessageObject()) != null) {
                    messageObject2.forceUpdate = true;
                    messageObject2.reactionsChanged = true;
                    break;
                }
                break;
            case 7:
                View view4 = (View) obj;
                if (!(view4 instanceof x2)) {
                    view4.invalidate();
                } else {
                    ((x2) view4).getTextView().invalidate();
                }
                break;
            case 8:
                View view5 = (View) obj;
                if (view5 instanceof e5) {
                    e5 e5Var = (e5) view5;
                    e5Var.f24263b.invalidate();
                    e5Var.f24264c.invalidate();
                } else if (!(view5 instanceof m1)) {
                    view5.invalidate();
                } else {
                    ((m1) view5).f46383c.invalidate();
                }
                break;
            case 9:
                View view6 = (View) obj;
                if (view6 instanceof a8) {
                    ((a8) view6).a(true);
                }
                break;
            case 10:
                View view7 = (View) obj;
                if (view7 instanceof a8) {
                    ((a8) view7).c(true);
                }
                break;
            case 11:
                Long l10 = (Long) obj;
                if (l10 == null || l10.longValue() == Long.MAX_VALUE) {
                    AndroidUtilities.runOnUIThread(new gc(29));
                } else {
                    n2 n2VarU = LaunchActivity.U();
                    if (n2VarU != null) {
                        n2VarU.presentFragment(ProfileActivity.m4(l10.longValue()));
                    }
                }
                break;
            case 12:
                break;
            case 13:
                View view8 = (View) obj;
                view8.setScaleX(1.0f);
                view8.setScaleY(1.0f);
                break;
            case 14:
                View view9 = (View) obj;
                if (view9 instanceof org.telegram.ui.web.i) {
                    ((org.telegram.ui.web.i) view9).setChecked(false);
                }
                break;
            case 15:
                View view10 = (View) obj;
                if (view10 instanceof org.telegram.ui.web.i) {
                    ((org.telegram.ui.web.i) view10).setChecked(false);
                }
                break;
            case 16:
                View view11 = (View) obj;
                if (view11 instanceof m1) {
                    ((m1) view11).f46383c.invalidate();
                }
                break;
            case 17:
                View view12 = (View) obj;
                if (view12 instanceof m1) {
                    ((m1) view12).d.a(false, true);
                }
                break;
            default:
                ((View) obj).invalidate();
                break;
        }
    }

    public w0(xc xcVar) {
        this.f12703a = 4;
    }
}
