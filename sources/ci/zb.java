package ci;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ff0;
import org.telegram.ui.h40;
public final class zb extends ClickableSpan {
    public final int f6381a;
    public final Object f6382b;

    public zb(Object obj, int i10) {
        this.f6381a = i10;
        this.f6382b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        switch (this.f6381a) {
            case 0:
                ((ac) this.f6382b).S1.T();
                return;
            case 1:
                lh.c cVar = (lh.c) this.f6382b;
                lh.a aVar = cVar.I;
                if (aVar != null && (groupCallMessage = cVar.H) != null) {
                    ((h40) aVar).a(groupCallMessage);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) this.f6382b;
                Context context = y1Var.getContext();
                nf.f.s(context, "https://fragment.com/username/" + ((org.telegram.ui.ra) y1Var.M).f39964e.f40434r);
                return;
            case 3:
                ((org.telegram.ui.wb) this.f6382b).finishFragment();
                return;
            case 4:
                ((org.telegram.ui.r1) this.f6382b).run();
                return;
            case 5:
                ((org.telegram.ui.Components.yc) this.f6382b).f33135a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 6:
                ((ActionBarLayout) ((LaunchActivity) this.f6382b).O()).P(new PremiumPreviewFragment(0, "gift"));
                return;
            case 7:
                ((ff0) this.f6382b).q(false);
                return;
            case 8:
                rg.k0 k0Var = ((rg.d0) this.f6382b).f46099c;
                tg.m.m(k0Var.f25309n, rg.k0.i1(k0Var), k0Var.f46151a0, null);
                return;
            default:
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f6381a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, rg.k0.R0(((rg.d0) this.f6382b).f46099c)));
                return;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((rg.m1) this.f6382b).f46212u0;
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
