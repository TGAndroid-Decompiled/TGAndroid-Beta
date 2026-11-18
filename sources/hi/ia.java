package hi;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.xk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.i20;
import org.telegram.ui.oc0;
public final class ia extends ClickableSpan {
    public final int f14777a;
    public final Object f14778b;

    public ia(Object obj, int i7) {
        this.f14777a = i7;
        this.f14778b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        switch (this.f14777a) {
            case 0:
                ((ja) this.f14778b).S1.S();
                return;
            case 1:
                nh.c cVar = (nh.c) this.f14778b;
                nh.a aVar = cVar.J;
                if (aVar != null && (groupCallMessage = cVar.I) != null) {
                    ((i20) aVar).a(groupCallMessage);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.b2 b2Var = (org.telegram.ui.Cells.b2) this.f14778b;
                Context context = b2Var.getContext();
                vf.c.t(context, "https://fragment.com/username/" + ((org.telegram.ui.ka) b2Var.N).f49227e.f49515r);
                return;
            case 3:
                ((org.telegram.ui.lb) this.f14778b).finishFragment();
                return;
            case 4:
                ((org.telegram.ui.o1) this.f14778b).run();
                return;
            case 5:
                ((lc) this.f14778b).f37091a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 6:
                xk xkVar = (xk) this.f14778b;
                org.telegram.ui.Wallet.n6.N0(xkVar.f42118n, xkVar.getContext(), xkVar.f36765a);
                return;
            case 7:
                ((ActionBarLayout) ((LaunchActivity) this.f14778b).M()).S(new PremiumPreviewFragment(0, "gift"));
                return;
            case 8:
                ((oc0) this.f14778b).p(false);
                return;
            case 9:
                org.telegram.ui.Wallet.da daVar = (org.telegram.ui.Wallet.da) this.f14778b;
                org.telegram.ui.Wallet.n6.N0(org.telegram.ui.Wallet.da.i0(daVar), daVar.getParentActivity(), daVar.getResourceProvider());
                return;
            case 10:
                ug.l0 l0Var = ((ug.e0) this.f14778b).f58646c;
                wg.l.J0(l0Var.f39538s1, l0Var.J0, l0Var.W1, null);
                return;
            default:
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7 = this.f14777a;
        Object obj = this.f14778b;
        switch (i7) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, ((xk) obj).f36765a));
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
                textPaint.setColor(((org.telegram.ui.Wallet.da) obj).getThemedColor(org.telegram.ui.ActionBar.n6.Fi));
                textPaint.setUnderlineText(false);
                return;
            case 10:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                int i10 = org.telegram.ui.ActionBar.n6.Xc;
                ug.l0 l0Var = ((ug.e0) obj).f58646c;
                int i11 = ug.l0.S2;
                textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(i10, l0Var.J0));
                return;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((ug.i1) obj).f58692q2;
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
