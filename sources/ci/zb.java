package ci;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ef0;
import org.telegram.ui.f40;
public final class zb extends ClickableSpan {
    public final int f5922a;
    public final Object f5923b;

    public zb(Object obj, int i10) {
        this.f5922a = i10;
        this.f5923b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        switch (this.f5922a) {
            case 0:
                ((ac) this.f5923b).S1.T();
                return;
            case 1:
                lh.c cVar = (lh.c) this.f5923b;
                lh.a aVar = cVar.I;
                if (aVar != null && (groupCallMessage = cVar.H) != null) {
                    ((f40) aVar).a(groupCallMessage);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) this.f5923b;
                Context context = y1Var.getContext();
                nf.f.s(context, "https://fragment.com/username/" + ((org.telegram.ui.sa) y1Var.M).e.f37740r);
                return;
            case 3:
                ((org.telegram.ui.wb) this.f5923b).finishFragment();
                return;
            case 4:
                ((org.telegram.ui.s1) this.f5923b).run();
                return;
            case 5:
                ((org.telegram.ui.Components.xc) this.f5923b).f30389a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 6:
                ((ActionBarLayout) ((LaunchActivity) this.f5923b).O()).P(new PremiumPreviewFragment(0, "gift"));
                return;
            case 7:
                ((ef0) this.f5923b).q(false);
                return;
            case 8:
                rg.j0 j0Var = ((rg.c0) this.f5923b).f42595c;
                tg.m.m(j0Var.f22964n, rg.j0.i1(j0Var), j0Var.f42639a0, null);
                return;
            default:
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f5922a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, rg.j0.R0(((rg.c0) this.f5923b).f42595c)));
                return;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((rg.k1) this.f5923b).f42692u0;
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
