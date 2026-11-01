package dh;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import kg.j0;
import kg.q0;
import kg.v1;
import mg.v;
import org.telegram.messenger.voip.GroupCallMessage;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.b2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.kk;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.Wallet.b6;
import org.telegram.ui.Wallet.r9;
import org.telegram.ui.e30;
import org.telegram.ui.na;
import org.telegram.ui.p1;
import org.telegram.ui.sb;
import org.telegram.ui.vd0;
import vh.e8;
public final class a extends ClickableSpan {
    public final int f5933a;
    public final Object f5934b;

    public a(Object obj, int i10) {
        this.f5933a = i10;
        this.f5934b = obj;
    }

    @Override
    public final void onClick(View view) {
        GroupCallMessage groupCallMessage;
        switch (this.f5933a) {
            case 0:
                d dVar = (d) this.f5934b;
                b bVar = dVar.I;
                if (bVar != null && (groupCallMessage = dVar.H) != null) {
                    ((e30) bVar).a(groupCallMessage);
                    return;
                }
                return;
            case 1:
                q0 q0Var = ((j0) this.f5934b).f11131c;
                v.I0(q0Var.f26727o1, q0Var.I0, q0Var.S1, null);
                return;
            case 2:
                return;
            case 3:
                b2 b2Var = (b2) this.f5934b;
                Context context = b2Var.getContext();
                gf.f.r(context, "https://fragment.com/username/" + ((na) b2Var.M).e.f40115r);
                return;
            case 4:
                ((sb) this.f5934b).finishFragment();
                return;
            case 5:
                ((p1) this.f5934b).run();
                return;
            case 6:
                ((cc) this.f5934b).f25076a.presentFragment(new PremiumPreviewFragment(0, "settings"));
                return;
            case 7:
                kk kkVar = (kk) this.f5934b;
                b6.J0(kkVar.f27872n, kkVar.getContext(), kkVar.f30963a);
                return;
            case 8:
                ((ActionBarLayout) ((LaunchActivity) this.f5934b).M()).R(new PremiumPreviewFragment(0, "gift"));
                return;
            case 9:
                ((vd0) this.f5934b).p(false);
                return;
            case 10:
                r9 r9Var = (r9) this.f5934b;
                b6.J0(r9.i0(r9Var), r9Var.getParentActivity(), r9Var.getResourceProvider());
                return;
            default:
                ((e8) this.f5934b).R1.S();
                return;
        }
    }

    @Override
    public final void updateDrawState(TextPaint textPaint) {
        int i10 = this.f5933a;
        Object obj = this.f5934b;
        switch (i10) {
            case 0:
                return;
            case 1:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                int i11 = t6.Uc;
                q0 q0Var = ((j0) obj).f11131c;
                int i12 = q0.O2;
                textPaint.setColor(t6.w0(i11, q0Var.I0));
                return;
            case 2:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                Integer num = ((v1) obj).f11305m2;
                if (num != null) {
                    textPaint.setColor(num.intValue());
                    return;
                }
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
                textPaint.setColor(t6.w0(t6.Ci, ((kk) obj).f30963a));
                textPaint.setUnderlineText(false);
                return;
            case 8:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 9:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                return;
            case 10:
                textPaint.setColor(((r9) obj).getThemedColor(t6.Ci));
                textPaint.setUnderlineText(false);
                return;
            default:
                textPaint.setUnderlineText(false);
                return;
        }
    }

    private final void a(View view) {
    }

    private final void b(TextPaint textPaint) {
    }
}
