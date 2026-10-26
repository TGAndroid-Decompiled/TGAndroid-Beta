package fi;

import android.app.Activity;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.re0;
import org.telegram.ui.t30;
public final class hb extends ClickableSpan {
    public final int f10970a;
    public final Object f10971b;

    public hb(Object obj, int i10) {
        this.f10970a = i10;
        this.f10971b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        int i10;
        switch (this.f10970a) {
            case 0:
                ((ib) this.f10971b).S1.S();
                return;
            case 1:
                nh.c cVar = (nh.c) this.f10971b;
                nh.a aVar = cVar.I;
                if (aVar != null && (groupCallMessage = cVar.H) != null) {
                    ((t30) aVar).a(groupCallMessage);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.w1 w1Var = (org.telegram.ui.Cells.w1) this.f10971b;
                Context context = w1Var.getContext();
                qf.d.r(context, "https://fragment.com/username/" + ((org.telegram.ui.sa) w1Var.M).e.f43712r);
                return;
            case 3:
                ((org.telegram.ui.wb) this.f10971b).finishFragment();
                return;
            case 4:
                ((org.telegram.ui.q1) this.f10971b).run();
                return;
            case 5:
                ((wc) this.f10971b).f34408a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 6:
                al alVar = (al) this.f10971b;
                org.telegram.ui.Wallet.m5.F0(alVar.getContext(), alVar.f26533n, alVar.f30214a);
                return;
            case 7:
                ((ActionBarLayout) ((LaunchActivity) this.f10971b).O()).R(new PremiumPreviewFragment(0, "gift"));
                return;
            case 8:
                ((re0) this.f10971b).p(false);
                return;
            case 9:
                org.telegram.ui.Wallet.i9 i9Var = (org.telegram.ui.Wallet.i9) this.f10971b;
                Activity parentActivity = i9Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.r2) i9Var).currentAccount;
                org.telegram.ui.Wallet.m5.F0(parentActivity, i10, i9Var.getResourceProvider());
                return;
            case 10:
                tg.j0 j0Var = ((tg.c0) this.f10971b).f48829c;
                vg.n.m(j0Var.f26811n, tg.j0.i1(j0Var), j0Var.f48884a0, null);
                return;
            default:
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f10970a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, ((al) this.f10971b).f30214a));
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
                textPaint.setColor(((org.telegram.ui.Wallet.i9) this.f10971b).getThemedColor(org.telegram.ui.ActionBar.y6.Oh));
                textPaint.setUnderlineText(false);
                return;
            case 10:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.gc, tg.j0.S0(((tg.c0) this.f10971b).f48829c)));
                return;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((tg.m1) this.f10971b).f48952u0;
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
