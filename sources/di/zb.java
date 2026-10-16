package di;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.Components.cl;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.l40;
import org.telegram.ui.lf0;
public final class zb extends ClickableSpan {
    public final int f8197a;
    public final Object f8198b;

    public zb(Object obj, int i10) {
        this.f8197a = i10;
        this.f8198b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        switch (this.f8197a) {
            case 0:
                ((ac) this.f8198b).S1.S();
                return;
            case 1:
                mh.c cVar = (mh.c) this.f8198b;
                mh.a aVar = cVar.I;
                if (aVar != null && (groupCallMessage = cVar.H) != null) {
                    ((l40) aVar).a(groupCallMessage);
                    return;
                }
                return;
            case 2:
                org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) this.f8198b;
                Context context = y1Var.getContext();
                pf.d.r(context, "https://fragment.com/username/" + ((org.telegram.ui.ua) y1Var.M).e.f40627r);
                return;
            case 3:
                ((org.telegram.ui.ac) this.f8198b).finishFragment();
                return;
            case 4:
                ((org.telegram.ui.t1) this.f8198b).run();
                return;
            case 5:
                ((org.telegram.ui.Components.zc) this.f8198b).f31539a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 6:
                cl clVar = (cl) this.f8198b;
                org.telegram.ui.Wallet.a5.u0(clVar.getContext(), clVar.f23782n, clVar.f27359a);
                return;
            case 7:
                ((ActionBarLayout) ((LaunchActivity) this.f8198b).O()).P(new PremiumPreviewFragment(0, "gift"));
                return;
            case 8:
                ((lf0) this.f8198b).q(false);
                return;
            case 9:
                org.telegram.ui.Wallet.j8 j8Var = (org.telegram.ui.Wallet.j8) this.f8198b;
                org.telegram.ui.Wallet.a5.u0(j8Var.getParentActivity(), org.telegram.ui.Wallet.j8.d0(j8Var), j8Var.getResourceProvider());
                return;
            case 10:
                sg.j0 j0Var = ((sg.c0) this.f8198b).f45149c;
                ug.n.n(j0Var.f24070n, sg.j0.j1(j0Var), j0Var.f45203a0, null);
                return;
            default:
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.f8197a) {
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
                textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Oh, ((cl) this.f8198b).f27359a));
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
                textPaint.setColor(((org.telegram.ui.Wallet.j8) this.f8198b).getThemedColor(org.telegram.ui.ActionBar.g6.Oh));
                textPaint.setUnderlineText(false);
                return;
            case 10:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19660gc, sg.j0.S0(((sg.c0) this.f8198b).f45149c)));
                return;
            default:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((sg.m1) this.f8198b).f45271u0;
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
