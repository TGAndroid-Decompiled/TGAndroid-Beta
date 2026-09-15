package ci;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.h40;
import org.telegram.ui.hf0;
public final class dc extends ClickableSpan {
    public final int f4541a;
    public final Object f4542b;

    public dc(Object obj, int i10) {
        this.f4541a = i10;
        this.f4542b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        switch (this.f4541a) {
            case 0:
                ((ec) this.f4542b).S1.T();
                return;
            case 1:
                lh.c cVar = (lh.c) this.f4542b;
                lh.a aVar = cVar.I;
                if (aVar != null && (groupCallMessage = cVar.H) != null) {
                    ((h40) aVar).a(groupCallMessage);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.x1 x1Var = (org.telegram.ui.Cells.x1) this.f4542b;
                Context context = x1Var.getContext();
                nf.f.s(context, "https://fragment.com/username/" + ((org.telegram.ui.pa) x1Var.M).e.f36821r);
                return;
            case 3:
                ((org.telegram.ui.ub) this.f4542b).finishFragment();
                return;
            case 4:
                ((org.telegram.ui.q1) this.f4542b).run();
                return;
            case 5:
                ((org.telegram.ui.Components.vc) this.f4542b).f28688a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 6:
                ((ActionBarLayout) ((LaunchActivity) this.f4542b).O()).P(new PremiumPreviewFragment(0, "gift"));
                return;
            case 7:
                ((hf0) this.f4542b).q(false);
                return;
            case 8:
                rg.j0 j0Var = ((rg.c0) this.f4542b).f42266c;
                tg.o.m(j0Var.f30528n, rg.j0.i1(j0Var), j0Var.f42310a0, null);
                return;
            default:
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f4541a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, rg.j0.R0(((rg.c0) this.f4542b).f42266c)));
                return;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((rg.k1) this.f4542b).f42363u0;
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
