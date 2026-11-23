package hi;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.zk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.i20;
import org.telegram.ui.pc0;
public final class ha extends ClickableSpan {
    public final int f14764a;
    public final Object f14765b;

    public ha(Object obj, int i7) {
        this.f14764a = i7;
        this.f14765b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        switch (this.f14764a) {
            case 0:
                ((ia) this.f14765b).S1.S();
                return;
            case 1:
                nh.c cVar = (nh.c) this.f14765b;
                nh.a aVar = cVar.J;
                if (aVar != null && (groupCallMessage = cVar.I) != null) {
                    ((i20) aVar).a(groupCallMessage);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.c2 c2Var = (org.telegram.ui.Cells.c2) this.f14765b;
                Context context = c2Var.getContext();
                vf.c.t(context, "https://fragment.com/username/" + ((org.telegram.ui.ka) c2Var.N).f49265e.f49537r);
                return;
            case 3:
                ((org.telegram.ui.lb) this.f14765b).finishFragment();
                return;
            case 4:
                ((org.telegram.ui.o1) this.f14765b).run();
                return;
            case 5:
                ((lc) this.f14765b).f37160a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 6:
                zk zkVar = (zk) this.f14765b;
                org.telegram.ui.Wallet.n6.N0(zkVar.f42914n, zkVar.getContext(), zkVar.f37518a);
                return;
            case 7:
                ((ActionBarLayout) ((LaunchActivity) this.f14765b).M()).S(new PremiumPreviewFragment(0, "gift"));
                return;
            case 8:
                ((pc0) this.f14765b).p(false);
                return;
            case 9:
                org.telegram.ui.Wallet.da daVar = (org.telegram.ui.Wallet.da) this.f14765b;
                org.telegram.ui.Wallet.n6.N0(org.telegram.ui.Wallet.da.i0(daVar), daVar.getParentActivity(), daVar.getResourceProvider());
                return;
            case 10:
                ug.k0 k0Var = ((ug.d0) this.f14765b).f58684c;
                wg.l.J0(k0Var.f39535s1, k0Var.J0, k0Var.W1, null);
                return;
            default:
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i7 = this.f14764a;
        Object obj = this.f14765b;
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
                textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.Fi, ((zk) obj).f37518a));
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
                textPaint.setColor(((org.telegram.ui.Wallet.da) obj).getThemedColor(org.telegram.ui.ActionBar.m6.Fi));
                textPaint.setUnderlineText(false);
                return;
            case 10:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                int i10 = org.telegram.ui.ActionBar.m6.Xc;
                ug.k0 k0Var = ((ug.d0) obj).f58684c;
                int i11 = ug.k0.S2;
                textPaint.setColor(org.telegram.ui.ActionBar.m6.w0(i10, k0Var.J0));
                return;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((ug.h1) obj).f58731q2;
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
