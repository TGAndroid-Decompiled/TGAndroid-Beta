package defpackage;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public final class z31 extends ClickableSpan {
    public final byte a;
    public final Object b;

    public z31(Object obj, byte b) {
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
                ((c41) obj).a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 1:
                sf1 sf1Var = (sf1) obj;
                Context context = sf1Var.getContext();
                l11.u(context, "https://fragment.com/username/" + ((tf1) sf1Var.N).e.r);
                return;
            case 2:
                ((vg1) obj).finishFragment();
                return;
            case 3:
                ((tv0) obj).run();
                return;
            case 4:
                c52 c52Var = (c52) obj;
                goc.M0(c52Var.n, c52Var.a, c52Var.getContext());
                return;
            case 5:
                s95 s95Var = (s95) obj;
                p95 p95Var = s95Var.J;
                if (p95Var != null && (groupCallMessage = s95Var.I) != null) {
                    ((k75) p95Var).a(groupCallMessage);
                    return;
                }
                return;
            case 6:
                ((ActionBarLayout) ((LaunchActivity) obj).N()).S(new PremiumPreviewFragment(0, "gift"));
                return;
            case 7:
                i46 i46Var = ((a46) obj).c;
                do0.D0(i46Var.r1, i46Var.J0, i46Var.V1, null);
                return;
            case 8:
                ((zf6) obj).p(false);
                return;
            case 9:
                return;
            case 10:
                ((l9b) obj).S1.S();
                return;
            default:
                rrc rrcVar = (rrc) obj;
                goc.M0(rrc.e0(rrcVar), rrcVar.getResourceProvider(), rrcVar.getParentActivity());
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
                textPaint.setColor(cmb.v0(cmb.Ei, ((c52) obj).a));
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
                int i = cmb.Wc;
                i46 i46Var = ((a46) obj).c;
                int i2 = i46.R2;
                textPaint.setColor(cmb.v0(i, i46Var.J0));
                return;
            case 8:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 9:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((yj8) obj).p2;
                if (num != null) {
                    textPaint.setColor(num.intValue());
                    return;
                }
                return;
            case 10:
                textPaint.setUnderlineText(false);
                return;
            default:
                textPaint.setColor(((rrc) obj).getThemedColor(cmb.Ei));
                textPaint.setUnderlineText(false);
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(TextPaint textPaint) {
    }
}
