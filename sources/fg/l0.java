package fg;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.af0;
import org.telegram.ui.d40;
import org.telegram.ui.oa;
import org.telegram.ui.sb;
import qh.r9;
public final class l0 extends ClickableSpan {
    public final int f6377a;
    public final Object f6378b;

    public l0(Object obj, int i10) {
        this.f6377a = i10;
        this.f6378b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        switch (this.f6377a) {
            case 0:
                v0 v0Var = ((n0) this.f6378b).f6410c;
                hg.x.m(v0Var.f31017n, v0.i1(v0Var), v0Var.X, null);
                return;
            case 1:
                return;
            case 2:
                org.telegram.ui.Cells.x1 x1Var = (org.telegram.ui.Cells.x1) this.f6378b;
                Context context = x1Var.getContext();
                af.g.s(context, "https://fragment.com/username/" + ((oa) x1Var.J).f39695e.f39997r);
                return;
            case 3:
                ((sb) this.f6378b).finishFragment();
                return;
            case 4:
                ((org.telegram.ui.s1) this.f6378b).run();
                return;
            case 5:
                ((qc) this.f6378b).f30362a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 6:
                ((ActionBarLayout) ((LaunchActivity) this.f6378b).O()).P(new PremiumPreviewFragment(0, "gift"));
                return;
            case 7:
                ((af0) this.f6378b).q(false);
                return;
            case 8:
                ((r9) this.f6378b).P1.T();
                return;
            default:
                zg.c cVar = (zg.c) this.f6378b;
                zg.a aVar = cVar.F;
                if (aVar != null && (groupCallMessage = cVar.E) != null) {
                    ((d40) aVar).a(groupCallMessage);
                    return;
                }
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f6377a) {
            case 0:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(k6.v0(k6.f21720gc, v0.R0(((n0) this.f6378b).f6410c)));
                return;
            case 1:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((d2) this.f6378b).f6290r0;
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
