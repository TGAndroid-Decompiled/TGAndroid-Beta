package ei;

import android.app.Activity;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.yk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.r30;
import org.telegram.ui.te0;
public final class kb extends ClickableSpan {
    public final int f9349a;
    public final Object f9350b;

    public kb(Object obj, int i10) {
        this.f9349a = i10;
        this.f9350b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        int i10;
        switch (this.f9349a) {
            case 0:
                ((lb) this.f9350b).S1.S();
                return;
            case 1:
                mh.c cVar = (mh.c) this.f9350b;
                mh.a aVar = cVar.I;
                if (aVar != null && (groupCallMessage = cVar.H) != null) {
                    ((r30) aVar).a(groupCallMessage);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.x1 x1Var = (org.telegram.ui.Cells.x1) this.f9350b;
                Context context = x1Var.getContext();
                pf.d.r(context, "https://fragment.com/username/" + ((org.telegram.ui.ra) x1Var.M).e.f41331r);
                return;
            case 3:
                ((org.telegram.ui.vb) this.f9350b).finishFragment();
                return;
            case 4:
                ((org.telegram.ui.s1) this.f9350b).run();
                return;
            case 5:
                ((vc) this.f9350b).f31414a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 6:
                yk ykVar = (yk) this.f9350b;
                org.telegram.ui.Wallet.o5.E0(ykVar.getContext(), ykVar.f32954n, ykVar.f27703a);
                return;
            case 7:
                ((ActionBarLayout) ((LaunchActivity) this.f9350b).O()).Q(new PremiumPreviewFragment(0, "gift"));
                return;
            case 8:
                ((te0) this.f9350b).p(false);
                return;
            case 9:
                org.telegram.ui.Wallet.j9 j9Var = (org.telegram.ui.Wallet.j9) this.f9350b;
                Activity parentActivity = j9Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.o2) j9Var).currentAccount;
                org.telegram.ui.Wallet.o5.E0(parentActivity, i10, j9Var.getResourceProvider());
                return;
            case 10:
                sg.j0 j0Var = ((sg.c0) this.f9350b).f46650c;
                ug.l.m(j0Var.f33212n, sg.j0.i1(j0Var), j0Var.f46705a0, null);
                return;
            default:
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f9349a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, ((yk) this.f9350b).f27703a));
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
                textPaint.setColor(((org.telegram.ui.Wallet.j9) this.f9350b).getThemedColor(org.telegram.ui.ActionBar.k6.Oh));
                textPaint.setUnderlineText(false);
                return;
            case 10:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21243gc, sg.j0.S0(((sg.c0) this.f9350b).f46650c)));
                return;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((sg.m1) this.f9350b).f46773u0;
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
