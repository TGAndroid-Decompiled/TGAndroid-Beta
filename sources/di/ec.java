package di;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.h40;
import org.telegram.ui.hf0;
public final class ec extends ClickableSpan {
    public final int f7210a;
    public final Object f7211b;

    public ec(Object obj, int i10) {
        this.f7210a = i10;
        this.f7211b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        switch (this.f7210a) {
            case 0:
                ((fc) this.f7211b).S1.T();
                return;
            case 1:
                mh.c cVar = (mh.c) this.f7211b;
                mh.a aVar = cVar.I;
                if (aVar != null && (groupCallMessage = cVar.H) != null) {
                    ((h40) aVar).a(groupCallMessage);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.x1 x1Var = (org.telegram.ui.Cells.x1) this.f7211b;
                Context context = x1Var.getContext();
                of.f.s(context, "https://fragment.com/username/" + ((org.telegram.ui.pa) x1Var.M).f39479e.f39832r);
                return;
            case 3:
                ((org.telegram.ui.ub) this.f7211b).finishFragment();
                return;
            case 4:
                ((org.telegram.ui.r1) this.f7211b).run();
                return;
            case 5:
                ((org.telegram.ui.Components.yc) this.f7211b).f32908a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 6:
                ((ActionBarLayout) ((LaunchActivity) this.f7211b).O()).P(new PremiumPreviewFragment(0, "gift"));
                return;
            case 7:
                ((hf0) this.f7211b).q(false);
                return;
            case 8:
                sg.k0 k0Var = ((sg.d0) this.f7211b).f46091c;
                ug.n.m(k0Var.f24676n, sg.k0.i1(k0Var), k0Var.f46158a0, null);
                return;
            default:
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f7210a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, sg.k0.R0(((sg.d0) this.f7211b).f46091c)));
                return;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((sg.o1) this.f7211b).f46241u0;
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
