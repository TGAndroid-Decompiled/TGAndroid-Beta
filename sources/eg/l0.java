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
import org.telegram.ui.bf0;
import org.telegram.ui.e40;
import org.telegram.ui.qa;
import org.telegram.ui.ub;
import ph.t9;
public final class l0 extends ClickableSpan {
    public final int f5338a;
    public final Object f5339b;

    public l0(Object obj, int i10) {
        this.f5338a = i10;
        this.f5339b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        switch (this.f5338a) {
            case 0:
                v0 v0Var = ((n0) this.f5339b).f5356c;
                gg.x.m(v0Var.f28701n, v0.i1(v0Var), v0Var.X, null);
                return;
            case 1:
                return;
            case 2:
                org.telegram.ui.Cells.w1 w1Var = (org.telegram.ui.Cells.w1) this.f5339b;
                Context context = w1Var.getContext();
                ze.d.s(context, "https://fragment.com/username/" + ((qa) w1Var.J).e.f37780r);
                return;
            case 3:
                ((ub) this.f5339b).finishFragment();
                return;
            case 4:
                ((org.telegram.ui.u1) this.f5339b).run();
                return;
            case 5:
                ((qc) this.f5339b).f28140a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 6:
                ((ActionBarLayout) ((LaunchActivity) this.f5339b).O()).P(new PremiumPreviewFragment(0, "gift"));
                return;
            case 7:
                ((bf0) this.f5339b).q(false);
                return;
            case 8:
                ((t9) this.f5339b).P1.T();
                return;
            default:
                yg.c cVar = (yg.c) this.f5339b;
                yg.a aVar = cVar.F;
                if (aVar != null && (groupCallMessage = cVar.E) != null) {
                    ((e40) aVar).a(groupCallMessage);
                    return;
                }
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f5338a) {
            case 0:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(j6.v0(j6.f19941gc, v0.R0(((n0) this.f5339b).f5356c)));
                return;
            case 1:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((e2) this.f5339b).f5263r0;
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
