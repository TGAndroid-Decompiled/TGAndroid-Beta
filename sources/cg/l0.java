package cg;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import nh.wa;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ka;
import org.telegram.ui.ob;
import org.telegram.ui.pe0;
import org.telegram.ui.q30;
public final class l0 extends ClickableSpan {
    public final int f3196a;
    public final Object f3197b;

    public l0(Object obj, int i10) {
        this.f3196a = i10;
        this.f3197b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        switch (this.f3196a) {
            case 0:
                v0 v0Var = ((n0) this.f3197b).f3224c;
                eg.y.m(v0Var.f34662n, v0.i1(v0Var), v0Var.W, null);
                return;
            case 1:
                return;
            case 2:
                ((wa) this.f3197b).O1.T();
                return;
            case 3:
                org.telegram.ui.Cells.w1 w1Var = (org.telegram.ui.Cells.w1) this.f3197b;
                Context context = w1Var.getContext();
                ye.d.s(context, "https://fragment.com/username/" + ((ka) w1Var.I).f39819e.f40145r);
                return;
            case 4:
                ((ob) this.f3197b).finishFragment();
                return;
            case 5:
                ((org.telegram.ui.u1) this.f3197b).run();
                return;
            case 6:
                ((tc) this.f3197b).f32922a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 7:
                ((ActionBarLayout) ((LaunchActivity) this.f3197b).O()).P(new PremiumPreviewFragment(0, "gift"));
                return;
            case 8:
                ((pe0) this.f3197b).q(false);
                return;
            default:
                wg.c cVar = (wg.c) this.f3197b;
                wg.a aVar = cVar.E;
                if (aVar != null && (groupCallMessage = cVar.D) != null) {
                    ((q30) aVar).a(groupCallMessage);
                    return;
                }
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f3196a) {
            case 0:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(g6.v0(g6.gc, v0.R0(((n0) this.f3197b).f3224c)));
                return;
            case 1:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((f2) this.f3197b).f3137q0;
                if (num != null) {
                    textPaint.setColor(num.intValue());
                    return;
                }
                return;
            case 2:
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
                super.updateDrawState(textPaint);
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
            default:
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(TextPaint textPaint) {
    }
}
