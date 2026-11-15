package ki;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.hd;
import org.telegram.messenger.j6;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.t8;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.fz;
public final class j3 extends a41 {
    public static final int f18373b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        int i7;
        int i10;
        int i11;
        int i12;
        float f10;
        Object obj = b41Var.G;
        int i13 = 0;
        if (obj instanceof TL_payments.connectedBotStarRef) {
            k3 k3Var = (k3) view;
            TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
            boolean z11 = b41Var.f33190r;
            e6 e6Var = k3Var.f18397b;
            View view2 = k3Var.f18399e;
            ImageView imageView = k3Var.f18400f;
            TLRPC.User a22 = np.s1(k3Var.f18396a).a2(Long.valueOf(connectedbotstarref.bot_id));
            t8 t8Var = new t8((e6) null);
            t8Var.r(a22);
            k3Var.f18398c.f(a22, t8Var);
            TextView textView = k3Var.h;
            textView.setText(j6.m(q10.p(a22), textView.getPaint().getFontMetricsInt(), false, null, 0));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (connectedbotstarref.commission_permille > 0) {
                spannableStringBuilder.append((CharSequence) " d");
                fz fzVar = new fz();
                int i14 = org.telegram.ui.ActionBar.j6.lk;
                fzVar.f47229f = org.telegram.ui.ActionBar.j6.w0(i14, null);
                fzVar.f47231r = i14;
                fzVar.f47232s = null;
                fzVar.f47230n = true;
                fzVar.f47233w = k.J0(connectedbotstarref.commission_permille);
                if (fzVar.f47227c != null) {
                    fzVar.f47227c = null;
                    fzVar.a();
                }
                spannableStringBuilder.setSpan(fzVar, 1, 2, 33);
            }
            int i15 = connectedbotstarref.duration_months;
            if (i15 == 0) {
                spannableStringBuilder.append((CharSequence) hd.M0(2131748986, null));
            } else if (i15 >= 12 && i15 % 12 == 0) {
                spannableStringBuilder.append((CharSequence) hd.G(i15 / 12, "Years", new Object[0]));
            } else {
                spannableStringBuilder.append((CharSequence) hd.G(i15, "Months", new Object[0]));
            }
            k3Var.f18401n.setText(spannableStringBuilder);
            ImageView imageView2 = k3Var.f18402r;
            if (z11) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            imageView2.setVisibility(i7);
            k3Var.d.setVisibility(0);
            imageView.setVisibility(0);
            view2.setVisibility(0);
            int L = org.telegram.messenger.g0.L(9.665f);
            if (connectedbotstarref.revoked) {
                i10 = org.telegram.ui.ActionBar.j6.nk;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.lk;
            }
            ShapeDrawable L2 = org.telegram.ui.ActionBar.j6.L(L, org.telegram.ui.ActionBar.j6.w0(i10, e6Var));
            if (connectedbotstarref.revoked) {
                i11 = org.telegram.ui.ActionBar.j6.nk;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.lk;
            }
            m6 M = q6.M(i11);
            view2.setBackground(L2);
            q6.j(view2, L2, M, null, e6Var);
            if (connectedbotstarref.revoked) {
                i12 = 2131232207;
            } else {
                i12 = 2131232201;
            }
            imageView.setImageResource(i12);
            float f11 = 0.6f;
            if (connectedbotstarref.revoked) {
                f10 = 0.8f;
            } else {
                f10 = 0.6f;
            }
            imageView.setScaleX(f10);
            if (connectedbotstarref.revoked) {
                f11 = 0.8f;
            }
            imageView.setScaleY(f11);
            k3Var.f18403s = z10;
            k3Var.setWillNotDraw(!z10);
        } else if (obj instanceof TL_payments.starRefProgram) {
            k3 k3Var2 = (k3) view;
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
            boolean z12 = b41Var.f33190r;
            TLRPC.User a23 = np.s1(k3Var2.f18396a).a2(Long.valueOf(starrefprogram.bot_id));
            t8 t8Var2 = new t8((e6) null);
            t8Var2.r(a23);
            k3Var2.f18398c.f(a23, t8Var2);
            k3Var2.h.setText(q10.p(a23));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (starrefprogram.commission_permille > 0) {
                spannableStringBuilder2.append((CharSequence) " d");
                fz fzVar2 = new fz();
                int i16 = org.telegram.ui.ActionBar.j6.lk;
                fzVar2.f47229f = org.telegram.ui.ActionBar.j6.w0(i16, null);
                fzVar2.f47231r = i16;
                fzVar2.f47232s = null;
                fzVar2.f47230n = true;
                fzVar2.f47233w = k.J0(starrefprogram.commission_permille);
                if (fzVar2.f47227c != null) {
                    fzVar2.f47227c = null;
                    fzVar2.a();
                }
                spannableStringBuilder2.setSpan(fzVar2, 1, 2, 33);
            }
            int i17 = starrefprogram.duration_months;
            if (i17 == 0) {
                spannableStringBuilder2.append((CharSequence) hd.M0(2131748986, null));
            } else if (i17 >= 12 && i17 % 12 == 0) {
                spannableStringBuilder2.append((CharSequence) hd.G(i17 / 12, "Years", new Object[0]));
            } else {
                spannableStringBuilder2.append((CharSequence) hd.G(i17, "Months", new Object[0]));
            }
            k3Var2.f18401n.setText(spannableStringBuilder2);
            ImageView imageView3 = k3Var2.f18402r;
            if (!z12) {
                i13 = 8;
            }
            imageView3.setVisibility(i13);
            k3Var2.d.setVisibility(8);
            k3Var2.f18400f.setVisibility(8);
            k3Var2.f18399e.setVisibility(8);
            k3Var2.f18403s = z10;
            k3Var2.setWillNotDraw(!z10);
        }
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, e6 e6Var) {
        return new k3(i7, context, e6Var);
    }
}
