package hi;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.qk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.f20;
import org.telegram.ui.oc0;
public final class ha extends ClickableSpan {
    public final int f14387a;
    public final Object f14388b;

    public ha(Object obj, int i7) {
        this.f14387a = i7;
        this.f14388b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        switch (this.f14387a) {
            case 0:
                ((ia) this.f14388b).S1.S();
                return;
            case 1:
                nh.c cVar = (nh.c) this.f14388b;
                nh.a aVar = cVar.J;
                if (aVar != null && (groupCallMessage = cVar.I) != null) {
                    ((f20) aVar).a(groupCallMessage);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.b2 b2Var = (org.telegram.ui.Cells.b2) this.f14388b;
                Context context = b2Var.getContext();
                vf.c.t(context, "https://fragment.com/username/" + ((org.telegram.ui.ka) b2Var.N).f48611e.f48912r);
                return;
            case 3:
                ((org.telegram.ui.lb) this.f14388b).finishFragment();
                return;
            case 4:
                ((org.telegram.ui.o1) this.f14388b).run();
                return;
            case 5:
                ((cc) this.f14388b).f33534a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 6:
                qk qkVar = (qk) this.f14388b;
                org.telegram.ui.Wallet.y5.J0(qkVar.f38676n, qkVar.getContext(), qkVar.f33608a);
                return;
            case 7:
                ((ActionBarLayout) ((LaunchActivity) this.f14388b).M()).S(new PremiumPreviewFragment(0, "gift"));
                return;
            case 8:
                ((oc0) this.f14388b).p(false);
                return;
            case 9:
                org.telegram.ui.Wallet.p9 p9Var = (org.telegram.ui.Wallet.p9) this.f14388b;
                org.telegram.ui.Wallet.y5.J0(org.telegram.ui.Wallet.p9.i0(p9Var), p9Var.getParentActivity(), p9Var.getResourceProvider());
                return;
            case 10:
                ug.j0 j0Var = ((ug.c0) this.f14388b).f58054c;
                wg.l.I0(j0Var.f35935s1, j0Var.J0, j0Var.W1, null);
                return;
            default:
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7 = this.f14387a;
        Object obj = this.f14388b;
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
                textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, ((qk) obj).f33608a));
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
                textPaint.setColor(((org.telegram.ui.Wallet.p9) obj).getThemedColor(org.telegram.ui.ActionBar.j6.Fi));
                textPaint.setUnderlineText(false);
                return;
            case 10:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                int i10 = org.telegram.ui.ActionBar.j6.Xc;
                ug.j0 j0Var = ((ug.c0) obj).f58054c;
                int i11 = ug.j0.S2;
                textPaint.setColor(org.telegram.ui.ActionBar.j6.w0(i10, j0Var.J0));
                return;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((ug.g1) obj).f58102q2;
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
