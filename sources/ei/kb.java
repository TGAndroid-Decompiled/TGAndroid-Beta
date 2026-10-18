package ei;

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
import org.telegram.ui.pe0;
import org.telegram.ui.q30;
public final class kb extends ClickableSpan {
    public final int f9339a;
    public final Object f9340b;

    public kb(Object obj, int i10) {
        this.f9339a = i10;
        this.f9340b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        switch (this.f9339a) {
            case 0:
                ((lb) this.f9340b).S1.S();
                return;
            case 1:
                mh.c cVar = (mh.c) this.f9340b;
                mh.a aVar = cVar.I;
                if (aVar != null && (groupCallMessage = cVar.H) != null) {
                    ((q30) aVar).a(groupCallMessage);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) this.f9340b;
                Context context = y1Var.getContext();
                pf.d.r(context, "https://fragment.com/username/" + ((org.telegram.ui.ta) y1Var.M).e.f41910r);
                return;
            case 3:
                ((org.telegram.ui.xb) this.f9340b).finishFragment();
                return;
            case 4:
                ((org.telegram.ui.t1) this.f9340b).run();
                return;
            case 5:
                ((xc) this.f9340b).f32360a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 6:
                al alVar = (al) this.f9340b;
                org.telegram.ui.Wallet.n5.D0(alVar.getContext(), alVar.f24630n, alVar.f28237a);
                return;
            case 7:
                ((ActionBarLayout) ((LaunchActivity) this.f9340b).O()).P(new PremiumPreviewFragment(0, "gift"));
                return;
            case 8:
                ((pe0) this.f9340b).q(false);
                return;
            case 9:
                org.telegram.ui.Wallet.i9 i9Var = (org.telegram.ui.Wallet.i9) this.f9340b;
                org.telegram.ui.Wallet.n5.D0(i9Var.getParentActivity(), org.telegram.ui.Wallet.i9.d0(i9Var), i9Var.getResourceProvider());
                return;
            case 10:
                sg.k0 k0Var = ((sg.d0) this.f9340b).f46233c;
                ug.m.n(k0Var.f24915n, sg.k0.j1(k0Var), k0Var.f46279a0, null);
                return;
            default:
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f9339a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, ((al) this.f9340b).f28237a));
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
                textPaint.setColor(((org.telegram.ui.Wallet.i9) this.f9340b).getThemedColor(org.telegram.ui.ActionBar.h6.Oh));
                textPaint.setUnderlineText(false);
                return;
            case 10:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21045gc, sg.k0.S0(((sg.d0) this.f9340b).f46233c)));
                return;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((sg.m1) this.f9340b).f46339u0;
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
