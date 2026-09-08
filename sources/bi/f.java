package bi;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.ue;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bd;
public final class f implements e2.h {
    public final int f2970a;

    public f(int i10) {
        this.f2970a = i10;
    }

    @Override
    public final void accept(Object obj) {
        MessageObject messageObject;
        MessageObject messageObject2;
        switch (this.f2970a) {
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
                ((u) ((View) obj)).invalidate();
                return;
            case 3:
                View view2 = (View) obj;
                if (view2 instanceof ig.x1) {
                    ((ig.x1) view2).f12302c.invalidate();
                    return;
                }
                return;
            case 4:
                View view3 = (View) obj;
                if (view3 instanceof ig.x1) {
                    ((ig.x1) view3).d.a(false, true);
                    return;
                }
                return;
            case 5:
                ((m4.j1) obj).e();
                return;
            case 6:
                ((m4.j1) obj).e0();
                return;
            case 7:
                ((m4.j1) obj).z0();
                return;
            case 8:
                ((m4.j1) obj).G0();
                return;
            case 9:
                ((m4.j1) obj).V();
                return;
            case 10:
                ((m4.j1) obj).F();
                return;
            case 11:
                ((m4.j1) obj).F0();
                return;
            case 12:
                ((m4.j1) obj).E0();
                return;
            case 13:
                ((m4.j1) obj).L();
                return;
            case 14:
                ((m4.j1) obj).stop();
                return;
            case 15:
                ((m4.j1) obj).b();
                return;
            case 16:
                ((m4.j1) obj).H();
                return;
            case 17:
                ((m4.j1) obj).v();
                return;
            case 18:
                ((n2.j) obj).a();
                return;
            case 19:
                ((View) obj).invalidate();
                return;
            case 20:
                bd.Y0((View) obj);
                return;
            case 21:
                View view4 = (View) obj;
                if ((view4 instanceof org.telegram.ui.Cells.t1) && (messageObject = ((org.telegram.ui.Cells.t1) view4).getMessageObject()) != null) {
                    messageObject.forceUpdate = true;
                    return;
                }
                return;
            case 22:
                View view5 = (View) obj;
                if ((view5 instanceof org.telegram.ui.Cells.t1) && (messageObject2 = ((org.telegram.ui.Cells.t1) view5).getMessageObject()) != null) {
                    messageObject2.forceUpdate = true;
                    messageObject2.reactionsChanged = true;
                    return;
                }
                return;
            case 23:
                View view6 = (View) obj;
                if (view6 instanceof org.telegram.ui.ActionBar.y2) {
                    ((org.telegram.ui.ActionBar.y2) view6).getTextView().invalidate();
                    return;
                } else {
                    view6.invalidate();
                    return;
                }
            case 24:
                View view7 = (View) obj;
                if (view7 instanceof org.telegram.ui.Cells.g5) {
                    org.telegram.ui.Cells.g5 g5Var = (org.telegram.ui.Cells.g5) view7;
                    g5Var.f22000b.invalidate();
                    g5Var.f22001c.invalidate();
                    return;
                } else if (view7 instanceof ig.x1) {
                    ((ig.x1) view7).f12302c.invalidate();
                    return;
                } else {
                    view7.invalidate();
                    return;
                }
            case 25:
                View view8 = (View) obj;
                if (view8 instanceof org.telegram.ui.Cells.f8) {
                    ((org.telegram.ui.Cells.f8) view8).a(true);
                    return;
                }
                return;
            case 26:
                View view9 = (View) obj;
                if (view9 instanceof org.telegram.ui.Cells.f8) {
                    ((org.telegram.ui.Cells.f8) view9).c(true);
                    return;
                }
                return;
            case 27:
                Long l4 = (Long) obj;
                if (l4 != null && l4.longValue() != Long.MAX_VALUE) {
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(ProfileActivity.m4(l4.longValue()));
                        return;
                    }
                    return;
                }
                AndroidUtilities.runOnUIThread(new ue(26));
                return;
            case 28:
                Boolean bool = (Boolean) obj;
                return;
            default:
                View view10 = (View) obj;
                view10.setScaleX(1.0f);
                view10.setScaleY(1.0f);
                return;
        }
    }

    public f(bd bdVar) {
        this.f2970a = 20;
    }
}
