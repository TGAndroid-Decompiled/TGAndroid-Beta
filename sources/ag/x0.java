package ag;

import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import lh.ib;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.mc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ma;
import org.telegram.ui.q30;
import org.telegram.ui.qb;
import org.telegram.ui.te0;

public final class x0 extends ClickableSpan {

    public final int f695a;

    public final Object f696b;

    public x0(Object obj, int i10) {
        this.f695a = i10;
        this.f696b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        switch (this.f695a) {
            case 0:
                i1 i1Var = ((z0) this.f696b).f736c;
                cg.x.m(i1Var.f31855n, ((org.telegram.ui.ActionBar.e3) i1Var).resourcesProvider, i1Var.W, null);
                break;
            case 1:
                break;
            case 2:
                ((ib) this.f696b).O1.T();
                break;
            case 3:
                org.telegram.ui.Cells.w1 w1Var = (org.telegram.ui.Cells.w1) this.f696b;
                we.e.s(w1Var.getContext(), "https://fragment.com/username/" + ((ma) w1Var.I).f40423e.f40706r);
                break;
            case 4:
                ((qb) this.f696b).finishFragment();
                break;
            case 5:
                ((org.telegram.ui.u1) this.f696b).run();
                break;
            case 6:
                ((mc) this.f696b).f30643a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                break;
            case 7:
                ((ActionBarLayout) ((LaunchActivity) this.f696b).O()).P(new PremiumPreviewFragment(0, "gift"));
                break;
            case 8:
                ((te0) this.f696b).q(false);
                break;
            default:
                ug.d dVar = (ug.d) this.f696b;
                ug.a aVar = dVar.E;
                if (aVar != null && (groupCallMessage = dVar.D) != null) {
                    ((q30) aVar).a(groupCallMessage);
                    break;
                }
                break;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f695a) {
            case 0:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(g6.v0(g6.gc, ((org.telegram.ui.ActionBar.e3) ((z0) this.f696b).f736c).resourcesProvider));
                break;
            case 1:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((y2) this.f696b).f723q0;
                if (num != null) {
                    textPaint.setColor(num.intValue());
                }
                break;
            case 2:
                textPaint.setUnderlineText(false);
                break;
            case 3:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 4:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 5:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 6:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 7:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            case 8:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(TextPaint textPaint) {
    }
}
