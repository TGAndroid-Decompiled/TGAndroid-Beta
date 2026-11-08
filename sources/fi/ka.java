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
import org.telegram.ui.g20;
import org.telegram.ui.pc0;
public final class ka extends ClickableSpan {
    public final int f12280a;
    public final Object f12281b;

    public ka(Object obj, int i7) {
        this.f12280a = i7;
        this.f12281b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        switch (this.f12280a) {
            case 0:
                ((la) this.f12281b).R1.S();
                return;
            case 1:
                nh.c cVar = (nh.c) this.f12281b;
                nh.a aVar = cVar.I;
                if (aVar != null && (groupCallMessage = cVar.H) != null) {
                    ((g20) aVar).a(groupCallMessage);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.b2 b2Var = (org.telegram.ui.Cells.b2) this.f12281b;
                Context context = b2Var.getContext();
                vf.c.t(context, "https://fragment.com/username/" + ((org.telegram.ui.ka) b2Var.M).f47153e.f47483r);
                return;
            case 3:
                ((org.telegram.ui.mb) this.f12281b).finishFragment();
                return;
            case 4:
                ((org.telegram.ui.o1) this.f12281b).run();
                return;
            case 5:
                ((hc) this.f12281b).f34212a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 6:
                ik ikVar = (ik) this.f12281b;
                org.telegram.ui.Wallet.x5.J0(ikVar.f34742n, ikVar.getContext(), ikVar.f39003a);
                return;
            case 7:
                ((ActionBarLayout) ((LaunchActivity) this.f12281b).M()).S(new PremiumPreviewFragment(0, "gift"));
                return;
            case 8:
                ((pc0) this.f12281b).p(false);
                return;
            case 9:
                org.telegram.ui.Wallet.m9 m9Var = (org.telegram.ui.Wallet.m9) this.f12281b;
                org.telegram.ui.Wallet.x5.J0(org.telegram.ui.Wallet.m9.i0(m9Var), m9Var.getParentActivity(), m9Var.getResourceProvider());
                return;
            case 10:
                ug.i0 i0Var = ((ug.b0) this.f12281b).f56528c;
                wg.l.I0(i0Var.f36279o1, i0Var.I0, i0Var.S1, null);
                return;
            default:
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7 = this.f12280a;
        Object obj = this.f12281b;
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
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, ((ik) obj).f39003a));
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
                textPaint.setColor(((org.telegram.ui.Wallet.m9) obj).getThemedColor(org.telegram.ui.ActionBar.k6.Ci));
                textPaint.setUnderlineText(false);
                return;
            case 10:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                int i10 = org.telegram.ui.ActionBar.k6.Uc;
                ug.i0 i0Var = ((ug.b0) obj).f56528c;
                int i11 = ug.i0.O2;
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, i0Var.I0));
                return;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((ug.f1) obj).f56574m2;
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
