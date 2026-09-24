package ci;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.bf0;
import org.telegram.ui.c40;
public final class ac extends ClickableSpan {
    public final int f4357a;
    public final Object f4358b;

    public ac(Object obj, int i10) {
        this.f4357a = i10;
        this.f4358b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        switch (this.f4357a) {
            case 0:
                ((bc) this.f4358b).S1.T();
                return;
            case 1:
                lh.c cVar = (lh.c) this.f4358b;
                lh.a aVar = cVar.I;
                if (aVar != null && (groupCallMessage = cVar.H) != null) {
                    ((c40) aVar).a(groupCallMessage);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) this.f4358b;
                Context context = y1Var.getContext();
                nf.f.s(context, "https://fragment.com/username/" + ((org.telegram.ui.pa) y1Var.M).e.f36820r);
                return;
            case 3:
                ((org.telegram.ui.ub) this.f4358b).finishFragment();
                return;
            case 4:
                ((org.telegram.ui.r1) this.f4358b).run();
                return;
            case 5:
                ((org.telegram.ui.Components.yc) this.f4358b).f30578a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 6:
                ((ActionBarLayout) ((LaunchActivity) this.f4358b).O()).P(new PremiumPreviewFragment(0, "gift"));
                return;
            case 7:
                ((bf0) this.f4358b).q(false);
                return;
            case 8:
                rg.j0 j0Var = ((rg.c0) this.f4358b).f42536c;
                tg.m.m(j0Var.f22949n, rg.j0.i1(j0Var), j0Var.f42580a0, null);
                return;
            default:
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f4357a) {
            case 0:
                textPaint.setUnderlineText(false);
                return;
            case 1:
                return;
            case 2:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 3:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 4:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 5:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 6:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 7:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 8:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.gc, rg.j0.R0(((rg.c0) this.f4358b).f42536c)));
                return;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((rg.k1) this.f4358b).f42633u0;
                if (num != null) {
                    textPaint.setColor(num.intValue());
                    return;
                }
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(TextPaint textPaint) {
    }
}
