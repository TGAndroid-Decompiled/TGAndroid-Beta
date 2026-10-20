package ei;

import android.app.Activity;
import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ne0;
import org.telegram.ui.o30;
public final class kb extends ClickableSpan {
    public final int f9338a;
    public final Object f9339b;

    public kb(Object obj, int i10) {
        this.f9338a = i10;
        this.f9339b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        int i10;
        switch (this.f9338a) {
            case 0:
                ((lb) this.f9339b).S1.S();
                return;
            case 1:
                mh.c cVar = (mh.c) this.f9339b;
                mh.a aVar = cVar.I;
                if (aVar != null && (groupCallMessage = cVar.H) != null) {
                    ((o30) aVar).a(groupCallMessage);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) this.f9339b;
                Context context = y1Var.getContext();
                pf.d.r(context, "https://fragment.com/username/" + ((org.telegram.ui.ra) y1Var.M).e.f41416r);
                return;
            case 3:
                ((org.telegram.ui.vb) this.f9339b).finishFragment();
                return;
            case 4:
                ((org.telegram.ui.t1) this.f9339b).run();
                return;
            case 5:
                ((xc) this.f9339b).f32387a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 6:
                al alVar = (al) this.f9339b;
                org.telegram.ui.Wallet.o5.E0(alVar.getContext(), alVar.f24648n, alVar.f28172a);
                return;
            case 7:
                ((ActionBarLayout) ((LaunchActivity) this.f9339b).O()).P(new PremiumPreviewFragment(0, "gift"));
                return;
            case 8:
                ((ne0) this.f9339b).q(false);
                return;
            case 9:
                org.telegram.ui.Wallet.i9 i9Var = (org.telegram.ui.Wallet.i9) this.f9339b;
                Activity parentActivity = i9Var.getParentActivity();
                i10 = ((org.telegram.ui.ActionBar.n2) i9Var).currentAccount;
                org.telegram.ui.Wallet.o5.E0(parentActivity, i10, i9Var.getResourceProvider());
                return;
            case 10:
                sg.k0 k0Var = ((sg.d0) this.f9339b).f46240c;
                ug.m.n(k0Var.f24882n, sg.k0.j1(k0Var), k0Var.f46286a0, null);
                return;
            default:
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f9338a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, ((al) this.f9339b).f28172a));
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
                textPaint.setColor(((org.telegram.ui.Wallet.i9) this.f9339b).getThemedColor(org.telegram.ui.ActionBar.h6.Oh));
                textPaint.setUnderlineText(false);
                return;
            case 10:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21049gc, sg.k0.S0(((sg.d0) this.f9339b).f46240c)));
                return;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((sg.m1) this.f9339b).f46346u0;
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
