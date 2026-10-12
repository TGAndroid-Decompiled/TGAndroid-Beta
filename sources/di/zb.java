package di;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.dl;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.l40;
import org.telegram.ui.mf0;
public final class zb extends ClickableSpan {
    public final int f8194a;
    public final Object f8195b;

    public zb(Object obj, int i10) {
        this.f8194a = i10;
        this.f8195b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        switch (this.f8194a) {
            case 0:
                ((ac) this.f8195b).S1.S();
                return;
            case 1:
                mh.c cVar = (mh.c) this.f8195b;
                mh.a aVar = cVar.I;
                if (aVar != null && (groupCallMessage = cVar.H) != null) {
                    ((l40) aVar).a(groupCallMessage);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) this.f8195b;
                Context context = y1Var.getContext();
                pf.d.s(context, "https://fragment.com/username/" + ((org.telegram.ui.ua) y1Var.M).e.f40940r);
                return;
            case 3:
                ((org.telegram.ui.ac) this.f8195b).finishFragment();
                return;
            case 4:
                ((org.telegram.ui.t1) this.f8195b).run();
                return;
            case 5:
                ((org.telegram.ui.Components.zc) this.f8195b).f31835a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 6:
                dl dlVar = (dl) this.f8195b;
                org.telegram.ui.Wallet.z4.u0(dlVar.getContext(), dlVar.f24427n, dlVar.f27670a);
                return;
            case 7:
                ((ActionBarLayout) ((LaunchActivity) this.f8195b).O()).P(new PremiumPreviewFragment(0, "gift"));
                return;
            case 8:
                ((mf0) this.f8195b).q(false);
                return;
            case 9:
                org.telegram.ui.Wallet.i8 i8Var = (org.telegram.ui.Wallet.i8) this.f8195b;
                org.telegram.ui.Wallet.z4.u0(i8Var.getParentActivity(), org.telegram.ui.Wallet.i8.d0(i8Var), i8Var.getResourceProvider());
                return;
            case 10:
                sg.j0 j0Var = ((sg.c0) this.f8195b).f45149c;
                ug.n.n(j0Var.f24345n, sg.j0.j1(j0Var), j0Var.f45203a0, null);
                return;
            default:
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f8194a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, ((dl) this.f8195b).f27670a));
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
                textPaint.setColor(((org.telegram.ui.Wallet.i8) this.f8195b).getThemedColor(org.telegram.ui.ActionBar.g6.Oh));
                textPaint.setUnderlineText(false);
                return;
            case 10:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19960gc, sg.j0.S0(((sg.c0) this.f8195b).f45149c)));
                return;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((sg.m1) this.f8195b).f45271u0;
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
