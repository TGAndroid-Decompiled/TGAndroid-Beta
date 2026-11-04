package gi;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.hk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.b20;
import org.telegram.ui.nc0;
public final class ka extends ClickableSpan {
    public final int f13046a;
    public final Object f13047b;

    public ka(Object obj, int i3) {
        this.f13046a = i3;
        this.f13047b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        switch (this.f13046a) {
            case 0:
                ((la) this.f13047b).S1.S();
                return;
            case 1:
                oh.c cVar = (oh.c) this.f13047b;
                oh.a aVar = cVar.J;
                if (aVar != null && (groupCallMessage = cVar.I) != null) {
                    ((b20) aVar).a(groupCallMessage);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.b2 b2Var = (org.telegram.ui.Cells.b2) this.f13047b;
                Context context = b2Var.getContext();
                sf.c.t(context, "https://fragment.com/username/" + ((org.telegram.ui.ja) b2Var.N).f46580e.f46844r);
                return;
            case 3:
                ((org.telegram.ui.kb) this.f13047b).finishFragment();
                return;
            case 4:
                ((org.telegram.ui.p1) this.f13047b).run();
                return;
            case 5:
                ((fc) this.f13047b).f33772a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 6:
                hk hkVar = (hk) this.f13047b;
                org.telegram.ui.Wallet.w5.J0(hkVar.f34416n, hkVar.getContext(), hkVar.f38415a);
                return;
            case 7:
                ((ActionBarLayout) ((LaunchActivity) this.f13047b).M()).S(new PremiumPreviewFragment(0, "gift"));
                return;
            case 8:
                ((nc0) this.f13047b).p(false);
                return;
            case 9:
                org.telegram.ui.Wallet.m9 m9Var = (org.telegram.ui.Wallet.m9) this.f13047b;
                org.telegram.ui.Wallet.w5.J0(org.telegram.ui.Wallet.m9.i0(m9Var), m9Var.getParentActivity(), m9Var.getResourceProvider());
                return;
            case 10:
                vg.i0 i0Var = ((vg.b0) this.f13047b).f56572c;
                xg.n.I0(i0Var.f36105p1, i0Var.J0, i0Var.T1, null);
                return;
            default:
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i3 = this.f13046a;
        Object obj = this.f13047b;
        switch (i3) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, ((hk) obj).f38415a));
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
                vg.i0 i0Var = ((vg.b0) obj).f56572c;
                int i11 = vg.i0.P2;
                textPaint.setColor(org.telegram.ui.ActionBar.k6.w0(i10, i0Var.J0));
                return;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((vg.h1) obj).f56636n2;
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
