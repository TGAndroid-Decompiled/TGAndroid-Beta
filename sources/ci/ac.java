package ci;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.gl;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.f40;
import org.telegram.ui.ff0;
public final class ac extends ClickableSpan {
    public final int f4734a;
    public final Object f4735b;

    public ac(Object obj, int i10) {
        this.f4734a = i10;
        this.f4735b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        switch (this.f4734a) {
            case 0:
                ((bc) this.f4735b).S1.S();
                return;
            case 1:
                lh.c cVar = (lh.c) this.f4735b;
                lh.a aVar = cVar.I;
                if (aVar != null && (groupCallMessage = cVar.H) != null) {
                    ((f40) aVar).a(groupCallMessage);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) this.f4735b;
                Context context = y1Var.getContext();
                of.f.s(context, "https://fragment.com/username/" + ((org.telegram.ui.pa) y1Var.M).f40804e.f41084r);
                return;
            case 3:
                ((org.telegram.ui.ub) this.f4735b).finishFragment();
                return;
            case 4:
                ((org.telegram.ui.q1) this.f4735b).run();
                return;
            case 5:
                ((org.telegram.ui.Components.ad) this.f4735b).f24492a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 6:
                gl glVar = (gl) this.f4735b;
                org.telegram.ui.Wallet.c5.u0(glVar.getContext(), glVar.f26746n, glVar.f30160a);
                return;
            case 7:
                ((ActionBarLayout) ((LaunchActivity) this.f4735b).O()).P(new PremiumPreviewFragment(0, "gift"));
                return;
            case 8:
                ((ff0) this.f4735b).q(false);
                return;
            case 9:
                org.telegram.ui.Wallet.l8 l8Var = (org.telegram.ui.Wallet.l8) this.f4735b;
                org.telegram.ui.Wallet.c5.u0(l8Var.getParentActivity(), org.telegram.ui.Wallet.l8.d0(l8Var), l8Var.getResourceProvider());
                return;
            case 10:
                rg.j0 j0Var = ((rg.c0) this.f4735b).f47303c;
                tg.m.o(j0Var.f25523n, rg.j0.j1(j0Var), j0Var.f47364a0, null);
                return;
            default:
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f4734a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, ((gl) this.f4735b).f30160a));
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
                textPaint.setColor(((org.telegram.ui.Wallet.l8) this.f4735b).getThemedColor(org.telegram.ui.ActionBar.h6.Oh));
                textPaint.setUnderlineText(false);
                return;
            case 10:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.gc, rg.j0.S0(((rg.c0) this.f4735b).f47303c)));
                return;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((rg.l1) this.f4735b).f47430u0;
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
