package hi;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.xk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.h20;
import org.telegram.ui.oc0;
public final class cb extends ClickableSpan {
    public final int f14282a;
    public final Object f14283b;

    public cb(Object obj, int i7) {
        this.f14282a = i7;
        this.f14283b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        switch (this.f14282a) {
            case 0:
                ((db) this.f14283b).S1.S();
                return;
            case 1:
                nh.c cVar = (nh.c) this.f14283b;
                nh.a aVar = cVar.J;
                if (aVar != null && (groupCallMessage = cVar.I) != null) {
                    ((h20) aVar).a(groupCallMessage);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.f14283b;
                Context context = c2Var.getContext();
                vf.c.t(context, "https://fragment.com/username/" + ((org.telegram.ui.ka) c2Var.N).f49381e.f49666r);
                return;
            case 3:
                ((org.telegram.ui.lb) this.f14283b).finishFragment();
                return;
            case 4:
                ((org.telegram.ui.o1) this.f14283b).run();
                return;
            case 5:
                ((org.telegram.ui.Components.kc) this.f14283b).f36698a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 6:
                xk xkVar = (xk) this.f14283b;
                org.telegram.ui.Wallet.o6.N0(xkVar.f42071n, xkVar.getContext(), xkVar.f37134a);
                return;
            case 7:
                ((ActionBarLayout) ((LaunchActivity) this.f14283b).M()).S(new PremiumPreviewFragment(0, "gift"));
                return;
            case 8:
                ((oc0) this.f14283b).p(false);
                return;
            case 9:
                org.telegram.ui.Wallet.ea eaVar = (org.telegram.ui.Wallet.ea) this.f14283b;
                org.telegram.ui.Wallet.o6.N0(org.telegram.ui.Wallet.ea.i0(eaVar), eaVar.getParentActivity(), eaVar.getResourceProvider());
                return;
            case 10:
                ug.k0 k0Var = ((ug.d0) this.f14283b).f58764c;
                wg.l.J0(k0Var.f39250s1, k0Var.J0, k0Var.W1, null);
                return;
            default:
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7 = this.f14282a;
        Object obj = this.f14283b;
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
                textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, ((xk) obj).f37134a));
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
                textPaint.setColor(((org.telegram.ui.Wallet.ea) obj).getThemedColor(org.telegram.ui.ActionBar.n6.Fi));
                textPaint.setUnderlineText(false);
                return;
            case 10:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                int i10 = org.telegram.ui.ActionBar.n6.Xc;
                ug.k0 k0Var = ((ug.d0) obj).f58764c;
                int i11 = ug.k0.S2;
                textPaint.setColor(org.telegram.ui.ActionBar.n6.w0(i10, k0Var.J0));
                return;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((ug.h1) obj).f58811q2;
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
