package ci;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.il;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.h40;
import org.telegram.ui.hf0;
public final class ac extends ClickableSpan {
    public final int f4733a;
    public final Object f4734b;

    public ac(Object obj, int i10) {
        this.f4733a = i10;
        this.f4734b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        switch (this.f4733a) {
            case 0:
                ((bc) this.f4734b).S1.S();
                return;
            case 1:
                lh.c cVar = (lh.c) this.f4734b;
                lh.a aVar = cVar.I;
                if (aVar != null && (groupCallMessage = cVar.H) != null) {
                    ((h40) aVar).a(groupCallMessage);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) this.f4734b;
                Context context = y1Var.getContext();
                of.f.s(context, "https://fragment.com/username/" + ((org.telegram.ui.ta) y1Var.M).f42138e.f42438r);
                return;
            case 3:
                ((org.telegram.ui.yb) this.f4734b).finishFragment();
                return;
            case 4:
                ((org.telegram.ui.r1) this.f4734b).run();
                return;
            case 5:
                ((org.telegram.ui.Components.zc) this.f4734b).f33327a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 6:
                il ilVar = (il) this.f4734b;
                org.telegram.ui.Wallet.c5.u0(ilVar.getContext(), ilVar.f27198n, ilVar.f30569a);
                return;
            case 7:
                ((ActionBarLayout) ((LaunchActivity) this.f4734b).O()).P(new PremiumPreviewFragment(0, "gift"));
                return;
            case 8:
                ((hf0) this.f4734b).q(false);
                return;
            case 9:
                org.telegram.ui.Wallet.l8 l8Var = (org.telegram.ui.Wallet.l8) this.f4734b;
                org.telegram.ui.Wallet.c5.u0(l8Var.getParentActivity(), org.telegram.ui.Wallet.l8.d0(l8Var), l8Var.getResourceProvider());
                return;
            case 10:
                rg.j0 j0Var = ((rg.c0) this.f4734b).f47435c;
                tg.m.o(j0Var.f25289n, rg.j0.j1(j0Var), j0Var.f47496a0, null);
                return;
            default:
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f4733a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, ((il) this.f4734b).f30569a));
                textPaint.setUnderlineText(false);
                return;
            case 7:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 8:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 9:
                textPaint.setColor(((org.telegram.ui.Wallet.l8) this.f4734b).getThemedColor(org.telegram.ui.ActionBar.h6.Oh));
                textPaint.setUnderlineText(false);
                return;
            case 10:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, rg.j0.S0(((rg.c0) this.f4734b).f47435c)));
                return;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((rg.l1) this.f4734b).f47562u0;
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
