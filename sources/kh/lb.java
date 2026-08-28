package kh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.n30;
import org.telegram.ui.qe0;
public final class lb extends ClickableSpan {
    public final int f15617a;
    public final Object f15618b;

    public lb(Object obj, int i9) {
        this.f15617a = i9;
        this.f15618b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        switch (this.f15617a) {
            case 0:
                ((mb) this.f15618b).O1.T();
                return;
            case 1:
                org.telegram.ui.Cells.x1 x1Var = (org.telegram.ui.Cells.x1) this.f15618b;
                Context context = x1Var.getContext();
                ve.e.s(context, "https://fragment.com/username/" + ((org.telegram.ui.la) x1Var.I).f40092e.f40367r);
                return;
            case 2:
                ((org.telegram.ui.pb) this.f15618b).finishFragment();
                return;
            case 3:
                ((org.telegram.ui.t1) this.f15618b).run();
                return;
            case 4:
                ((org.telegram.ui.Components.oc) this.f15618b).f31355a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 5:
                ((ActionBarLayout) ((LaunchActivity) this.f15618b).O()).P(new PremiumPreviewFragment(0, "gift"));
                return;
            case 6:
                ((qe0) this.f15618b).q(false);
                return;
            case 7:
                tg.d dVar = (tg.d) this.f15618b;
                tg.a aVar = dVar.E;
                if (aVar != null && (groupCallMessage = dVar.D) != null) {
                    ((n30) aVar).a(groupCallMessage);
                    return;
                }
                return;
            case 8:
                zf.j0 j0Var = ((zf.c0) this.f15618b).f50478c;
                bg.a0.m(j0Var.f32410n, zf.j0.i1(j0Var), j0Var.W, null);
                return;
            default:
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f15617a) {
            case 0:
                textPaint.setUnderlineText(false);
                return;
            case 1:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
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
                return;
            case 8:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23061gc, zf.j0.R0(((zf.c0) this.f15618b).f50478c)));
                return;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((zf.k1) this.f15618b).f50582q0;
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
