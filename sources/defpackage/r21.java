package defpackage;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class r21 extends ClickableSpan {
    public final byte a;
    public final Object b;

    public r21(Object obj, byte b) {
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
                ((u21) obj).a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                ke1 ke1Var = (ke1) obj;
                Context context = ke1Var.getContext();
                d01.t(context, "https://fragment.com/username/" + ((le1) ke1Var.N).e.r);
                return;
            case 2:
                ((nf1) obj).finishFragment();
                return;
            case 3:
                ((fv0) obj).run();
                return;
            case 4:
                r32 r32Var = (r32) obj;
                hmc.L0(r32Var.n, r32Var.a, r32Var.getContext());
                return;
            case 5:
                t75 t75Var = (t75) obj;
                q75 q75Var = t75Var.J;
                if (q75Var != null && (groupCallMessage = t75Var.I) != null) {
                    ((m55) q75Var).a(groupCallMessage);
                    return;
                }
                return;
            case 6:
                ((ActionBarLayout) ((LaunchActivity) obj).N()).S(new PremiumPreviewFragment(0, "gift"));
                return;
            case 7:
                h26 h26Var = ((z16) obj).c;
                dn0.D0(h26Var.r1, h26Var.J0, h26Var.V1, null);
                return;
            case 8:
                ((ae6) obj).p(false);
                return;
            case 9:
                return;
            case 10:
                ((j7b) obj).S1.S();
                return;
            default:
                qpc qpcVar = (qpc) obj;
                hmc.L0(qpc.d0(qpcVar), qpcVar.getResourceProvider(), qpcVar.getParentActivity());
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
                textPaint.setColor(bkb.v0(bkb.Ei, ((r32) obj).a));
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
                int i = bkb.Wc;
                h26 h26Var = ((z16) obj).c;
                int i2 = h26.R2;
                textPaint.setColor(bkb.v0(i, h26Var.J0));
                return;
            case 8:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 9:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((xh8) obj).p2;
                if (num != null) {
                    textPaint.setColor(num.intValue());
                    return;
                }
                return;
            case 10:
                textPaint.setUnderlineText(false);
                return;
            default:
                textPaint.setColor(((qpc) obj).getThemedColor(bkb.Ei));
                textPaint.setUnderlineText(false);
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(TextPaint textPaint) {
    }
}
