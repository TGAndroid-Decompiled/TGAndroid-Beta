package defpackage;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class a31 extends ClickableSpan {
    public final byte a;
    public final Object b;

    public a31(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((d31) obj).a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                te1 te1Var = (te1) obj;
                Context context = te1Var.getContext();
                m01.u(context, "https://fragment.com/username/" + ((ue1) te1Var.N).e.r);
                return;
            case 2:
                ((wf1) obj).finishFragment();
                return;
            case 3:
                ((tu0) obj).run();
                return;
            case 4:
                h42 h42Var = (h42) obj;
                uqc.L0(h42Var.n, h42Var.a, h42Var.getContext());
                return;
            case 5:
                v95 v95Var = (v95) obj;
                s95 s95Var = v95Var.J;
                if (s95Var != null && (groupCallMessage = v95Var.I) != null) {
                    ((o75) s95Var).a(groupCallMessage);
                    return;
                }
                return;
            case 6:
                ((ActionBarLayout) ((LaunchActivity) obj).N()).S(new PremiumPreviewFragment(0, "gift"));
                return;
            case 7:
                l46 l46Var = ((d46) obj).c;
                dn0.E0(l46Var.r1, l46Var.J0, l46Var.V1, null);
                return;
            case 8:
                ((cg6) obj).p(false);
                return;
            case 9:
                return;
            case 10:
                ((hbb) obj).S1.S();
                return;
            default:
                euc eucVar = (euc) obj;
                uqc.L0(euc.d0(eucVar), eucVar.getResourceProvider(), eucVar.getParentActivity());
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 1:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
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
                textPaint.setColor(aob.v0(aob.Fi, ((h42) obj).a));
                textPaint.setUnderlineText(false);
                return;
            case 5:
                return;
            case 6:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 7:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                int i = aob.Xc;
                l46 l46Var = ((d46) obj).c;
                int i2 = l46.R2;
                textPaint.setColor(aob.v0(i, l46Var.J0));
                return;
            case 8:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 9:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((kl8) obj).p2;
                if (num != null) {
                    textPaint.setColor(num.intValue());
                    return;
                }
                return;
            case 10:
                textPaint.setUnderlineText(false);
                return;
            default:
                textPaint.setColor(((euc) obj).getThemedColor(aob.Fi));
                textPaint.setUnderlineText(false);
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(TextPaint textPaint) {
    }
}
