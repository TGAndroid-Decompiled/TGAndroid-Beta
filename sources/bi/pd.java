package bi;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.hf0;
import org.telegram.ui.i40;
public final class pd extends ClickableSpan {
    public final int f3420a;
    public final Object f3421b;

    public pd(Object obj, int i10) {
        this.f3420a = i10;
        this.f3421b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        switch (this.f3420a) {
            case 0:
                ((qd) this.f3421b).S1.T();
                return;
            case 1:
                kh.c cVar = (kh.c) this.f3421b;
                kh.a aVar = cVar.I;
                if (aVar != null && (groupCallMessage = cVar.H) != null) {
                    ((i40) aVar).a(groupCallMessage);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.x1 x1Var = (org.telegram.ui.Cells.x1) this.f3421b;
                Context context = x1Var.getContext();
                nf.f.s(context, "https://fragment.com/username/" + ((org.telegram.ui.qa) x1Var.M).e.f36277r);
                return;
            case 3:
                ((org.telegram.ui.wb) this.f3421b).finishFragment();
                return;
            case 4:
                ((org.telegram.ui.s1) this.f3421b).run();
                return;
            case 5:
                ((org.telegram.ui.Components.wc) this.f3421b).f28747a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 6:
                ((ActionBarLayout) ((LaunchActivity) this.f3421b).O()).P(new PremiumPreviewFragment(0, "gift"));
                return;
            case 7:
                ((hf0) this.f3421b).q(false);
                return;
            case 8:
                qg.k0 k0Var = ((qg.d0) this.f3421b).f40706c;
                sg.m.m(k0Var.f21452n, qg.k0.i1(k0Var), k0Var.f40764a0, null);
                return;
            default:
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f3420a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, qg.k0.R0(((qg.d0) this.f3421b).f40706c)));
                return;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((qg.m1) this.f3421b).f40831u0;
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
