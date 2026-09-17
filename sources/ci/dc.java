package ci;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.j40;
import org.telegram.ui.jf0;
public final class dc extends ClickableSpan {
    public final int f4546a;
    public final Object f4547b;

    public dc(Object obj, int i10) {
        this.f4546a = i10;
        this.f4547b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        switch (this.f4546a) {
            case 0:
                ((ec) this.f4547b).S1.T();
                return;
            case 1:
                lh.c cVar = (lh.c) this.f4547b;
                lh.a aVar = cVar.I;
                if (aVar != null && (groupCallMessage = cVar.H) != null) {
                    ((j40) aVar).a(groupCallMessage);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.x1 x1Var = (org.telegram.ui.Cells.x1) this.f4547b;
                Context context = x1Var.getContext();
                nf.f.s(context, "https://fragment.com/username/" + ((org.telegram.ui.ra) x1Var.M).e.f37434r);
                return;
            case 3:
                ((org.telegram.ui.wb) this.f4547b).finishFragment();
                return;
            case 4:
                ((org.telegram.ui.q1) this.f4547b).run();
                return;
            case 5:
                ((org.telegram.ui.Components.vc) this.f4547b).f28681a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 6:
                ((ActionBarLayout) ((LaunchActivity) this.f4547b).O()).P(new PremiumPreviewFragment(0, "gift"));
                return;
            case 7:
                ((jf0) this.f4547b).q(false);
                return;
            case 8:
                rg.j0 j0Var = ((rg.c0) this.f4547b).f42288c;
                tg.o.m(j0Var.f30451n, rg.j0.i1(j0Var), j0Var.f42332a0, null);
                return;
            default:
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f4546a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, rg.j0.R0(((rg.c0) this.f4547b).f42288c)));
                return;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((rg.k1) this.f4547b).f42385u0;
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
