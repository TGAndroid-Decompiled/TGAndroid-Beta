package fi;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.hk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.j20;
import org.telegram.ui.sc0;
public final class ka extends ClickableSpan {
    public final int f12282a;
    public final Object f12283b;

    public ka(Object obj, int i7) {
        this.f12282a = i7;
        this.f12283b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        switch (this.f12282a) {
            case 0:
                ((la) this.f12283b).R1.S();
                return;
            case 1:
                nh.c cVar = (nh.c) this.f12283b;
                nh.a aVar = cVar.I;
                if (aVar != null && (groupCallMessage = cVar.H) != null) {
                    ((j20) aVar).a(groupCallMessage);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.b2 b2Var = (org.telegram.ui.Cells.b2) this.f12283b;
                Context context = b2Var.getContext();
                vf.c.t(context, "https://fragment.com/username/" + ((org.telegram.ui.ka) b2Var.M).f47240e.f47561r);
                return;
            case 3:
                ((org.telegram.ui.mb) this.f12283b).finishFragment();
                return;
            case 4:
                ((org.telegram.ui.o1) this.f12283b).run();
                return;
            case 5:
                ((gc) this.f12283b).f33871a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 6:
                hk hkVar = (hk) this.f12283b;
                org.telegram.ui.Wallet.z5.J0(hkVar.f34380n, hkVar.getContext(), hkVar.f38655a);
                return;
            case 7:
                ((ActionBarLayout) ((LaunchActivity) this.f12283b).M()).S(new PremiumPreviewFragment(0, "gift"));
                return;
            case 8:
                ((sc0) this.f12283b).p(false);
                return;
            case 9:
                org.telegram.ui.Wallet.o9 o9Var = (org.telegram.ui.Wallet.o9) this.f12283b;
                org.telegram.ui.Wallet.z5.J0(org.telegram.ui.Wallet.o9.i0(o9Var), o9Var.getParentActivity(), o9Var.getResourceProvider());
                return;
            case 10:
                ug.i0 i0Var = ((ug.b0) this.f12283b).f56539c;
                wg.l.I0(i0Var.f35905r1, i0Var.I0, i0Var.V1, null);
                return;
            default:
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7 = this.f12282a;
        Object obj = this.f12283b;
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
                textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Ci, ((hk) obj).f38655a));
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
                textPaint.setColor(((org.telegram.ui.Wallet.o9) obj).getThemedColor(org.telegram.ui.ActionBar.m6.Ci));
                textPaint.setUnderlineText(false);
                return;
            case 10:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                int i10 = org.telegram.ui.ActionBar.m6.Uc;
                ug.i0 i0Var = ((ug.b0) obj).f56539c;
                int i11 = ug.i0.R2;
                textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(i10, i0Var.I0));
                return;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((ug.f1) obj).f56588p2;
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
