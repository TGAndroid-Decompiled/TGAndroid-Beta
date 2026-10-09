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
import org.telegram.ui.gf0;
public final class ac extends ClickableSpan {
    public final int f4735a;
    public final Object f4736b;

    public ac(Object obj, int i10) {
        this.f4735a = i10;
        this.f4736b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        switch (this.f4735a) {
            case 0:
                ((bc) this.f4736b).S1.S();
                return;
            case 1:
                lh.c cVar = (lh.c) this.f4736b;
                lh.a aVar = cVar.I;
                if (aVar != null && (groupCallMessage = cVar.H) != null) {
                    ((f40) aVar).a(groupCallMessage);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) this.f4736b;
                Context context = y1Var.getContext();
                of.f.s(context, "https://fragment.com/username/" + ((org.telegram.ui.qa) y1Var.M).f41063e.f41324r);
                return;
            case 3:
                ((org.telegram.ui.vb) this.f4736b).finishFragment();
                return;
            case 4:
                ((org.telegram.ui.r1) this.f4736b).run();
                return;
            case 5:
                ((org.telegram.ui.Components.ad) this.f4736b).f24662a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 6:
                gl glVar = (gl) this.f4736b;
                org.telegram.ui.Wallet.a5.u0(glVar.getContext(), glVar.f26780n, glVar.f30172a);
                return;
            case 7:
                ((ActionBarLayout) ((LaunchActivity) this.f4736b).O()).P(new PremiumPreviewFragment(0, "gift"));
                return;
            case 8:
                ((gf0) this.f4736b).q(false);
                return;
            case 9:
                org.telegram.ui.Wallet.j8 j8Var = (org.telegram.ui.Wallet.j8) this.f4736b;
                org.telegram.ui.Wallet.a5.u0(j8Var.getParentActivity(), org.telegram.ui.Wallet.j8.d0(j8Var), j8Var.getResourceProvider());
                return;
            case 10:
                rg.j0 j0Var = ((rg.c0) this.f4736b).f47213c;
                tg.m.o(j0Var.f26025n, rg.j0.j1(j0Var), j0Var.f47274a0, null);
                return;
            default:
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f4735a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Oh, ((gl) this.f4736b).f30172a));
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
                textPaint.setColor(((org.telegram.ui.Wallet.j8) this.f4736b).getThemedColor(org.telegram.ui.ActionBar.i6.Oh));
                textPaint.setUnderlineText(false);
                return;
            case 10:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, rg.j0.S0(((rg.c0) this.f4736b).f47213c)));
                return;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((rg.l1) this.f4736b).f47340u0;
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
