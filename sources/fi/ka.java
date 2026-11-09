package fi;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.ik;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.i20;
import org.telegram.ui.rc0;
public final class ka extends ClickableSpan {
    public final int f12281a;
    public final Object f12282b;

    public ka(Object obj, int i7) {
        this.f12281a = i7;
        this.f12282b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        switch (this.f12281a) {
            case 0:
                ((la) this.f12282b).R1.S();
                return;
            case 1:
                nh.c cVar = (nh.c) this.f12282b;
                nh.a aVar = cVar.I;
                if (aVar != null && (groupCallMessage = cVar.H) != null) {
                    ((i20) aVar).a(groupCallMessage);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.b2 b2Var = (org.telegram.ui.Cells.b2) this.f12282b;
                Context context = b2Var.getContext();
                vf.c.t(context, "https://fragment.com/username/" + ((org.telegram.ui.ka) b2Var.M).f47249e.f47544r);
                return;
            case 3:
                ((org.telegram.ui.mb) this.f12282b).finishFragment();
                return;
            case 4:
                ((org.telegram.ui.o1) this.f12282b).run();
                return;
            case 5:
                ((hc) this.f12282b).f34271a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 6:
                ik ikVar = (ik) this.f12282b;
                org.telegram.ui.Wallet.w5.J0(ikVar.f34780n, ikVar.getContext(), ikVar.f39070a);
                return;
            case 7:
                ((ActionBarLayout) ((LaunchActivity) this.f12282b).M()).S(new PremiumPreviewFragment(0, "gift"));
                return;
            case 8:
                ((rc0) this.f12282b).p(false);
                return;
            case 9:
                org.telegram.ui.Wallet.l9 l9Var = (org.telegram.ui.Wallet.l9) this.f12282b;
                org.telegram.ui.Wallet.w5.J0(org.telegram.ui.Wallet.l9.i0(l9Var), l9Var.getParentActivity(), l9Var.getResourceProvider());
                return;
            case 10:
                ug.i0 i0Var = ((ug.b0) this.f12282b).f56540c;
                wg.l.I0(i0Var.f36305o1, i0Var.I0, i0Var.S1, null);
                return;
            default:
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7 = this.f12281a;
        Object obj = this.f12282b;
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
                textPaint.setColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.Ci, ((ik) obj).f39070a));
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
                textPaint.setColor(((org.telegram.ui.Wallet.l9) obj).getThemedColor(org.telegram.ui.ActionBar.l6.Ci));
                textPaint.setUnderlineText(false);
                return;
            case 10:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                int i10 = org.telegram.ui.ActionBar.l6.Uc;
                ug.i0 i0Var = ((ug.b0) obj).f56540c;
                int i11 = ug.i0.O2;
                textPaint.setColor(org.telegram.ui.ActionBar.l6.w0(i10, i0Var.I0));
                return;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((ug.f1) obj).f56586m2;
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
