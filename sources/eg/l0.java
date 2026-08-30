package eg;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.c40;
import org.telegram.ui.oa;
import org.telegram.ui.sb;
import org.telegram.ui.ze0;
import ph.t9;
public final class l0 extends ClickableSpan {
    public final int f5349a;
    public final Object f5350b;

    public l0(Object obj, int i10) {
        this.f5349a = i10;
        this.f5350b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        switch (this.f5349a) {
            case 0:
                v0 v0Var = ((n0) this.f5350b).f5367c;
                gg.x.m(v0Var.f28678n, v0.i1(v0Var), v0Var.X, null);
                return;
            case 1:
                return;
            case 2:
                org.telegram.ui.Cells.x1 x1Var = (org.telegram.ui.Cells.x1) this.f5350b;
                Context context = x1Var.getContext();
                af.g.s(context, "https://fragment.com/username/" + ((oa) x1Var.J).e.f37256r);
                return;
            case 3:
                ((sb) this.f5350b).finishFragment();
                return;
            case 4:
                ((org.telegram.ui.s1) this.f5350b).run();
                return;
            case 5:
                ((qc) this.f5350b).f28112a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 6:
                ((ActionBarLayout) ((LaunchActivity) this.f5350b).O()).P(new PremiumPreviewFragment(0, "gift"));
                return;
            case 7:
                ((ze0) this.f5350b).q(false);
                return;
            case 8:
                ((t9) this.f5350b).P1.T();
                return;
            default:
                yg.c cVar = (yg.c) this.f5350b;
                yg.a aVar = cVar.F;
                if (aVar != null && (groupCallMessage = cVar.E) != null) {
                    ((c40) aVar).a(groupCallMessage);
                    return;
                }
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f5349a) {
            case 0:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(j6.v0(j6.f19966gc, v0.R0(((n0) this.f5350b).f5367c)));
                return;
            case 1:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((e2) this.f5350b).f5274r0;
                if (num != null) {
                    textPaint.setColor(num.intValue());
                    return;
                }
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
                textPaint.setUnderlineText(false);
                return;
            default:
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(TextPaint textPaint) {
    }
}
