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
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.b9;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
import org.telegram.ui.iz;
public final class d3 extends n41 {
    public static final int f18621b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        int i7;
        int i10;
        int i11;
        int i12;
        float f10;
        Object obj = o41Var.H;
        int i13 = 0;
        if (obj instanceof TL_payments.connectedBotStarRef) {
            e3 e3Var = (e3) view;
            TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
            boolean z11 = o41Var.f38064s;
            h6 h6Var = e3Var.f18635b;
            View view2 = e3Var.f18637e;
            ImageView imageView = e3Var.f18638f;
            TLRPC.User c22 = np.u1(e3Var.f18634a).c2(Long.valueOf(connectedbotstarref.bot_id));
            b9 b9Var = new b9((h6) null);
            b9Var.r(c22);
            e3Var.f18636c.f(c22, b9Var);
            TextView textView = e3Var.h;
            textView.setText(j6.m(p10.q(c22), textView.getPaint().getFontMetricsInt(), false, null, 0));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (connectedbotstarref.commission_permille > 0) {
                spannableStringBuilder.append((CharSequence) " d");
                iz izVar = new iz();
                int i14 = m6.lk;
                izVar.f48850f = m6.w0(i14, null);
                izVar.f48852r = i14;
                izVar.f48853s = null;
                izVar.f48851n = true;
                izVar.f48854w = j.J0(connectedbotstarref.commission_permille);
                if (izVar.f48848c != null) {
                    izVar.f48848c = null;
                    izVar.a();
                }
                spannableStringBuilder.setSpan(izVar, 1, 2, 33);
            }
            int i15 = connectedbotstarref.duration_months;
            if (i15 == 0) {
                spannableStringBuilder.append((CharSequence) hd.N0(2131748793, null));
            } else if (i15 >= 12 && i15 % 12 == 0) {
                spannableStringBuilder.append((CharSequence) hd.G(i15 / 12, "Years", new Object[0]));
            } else {
                spannableStringBuilder.append((CharSequence) hd.G(i15, "Months", new Object[0]));
            }
            e3Var.f18639n.setText(spannableStringBuilder);
            ImageView imageView2 = e3Var.f18640r;
            if (z11) {
                i7 = 0;
            } else {
                i7 = 8;
            }
            imageView2.setVisibility(i7);
            e3Var.d.setVisibility(0);
            imageView.setVisibility(0);
            view2.setVisibility(0);
            int L = org.telegram.messenger.g0.L(9.665f);
            if (connectedbotstarref.revoked) {
                i10 = m6.nk;
            } else {
                i10 = m6.lk;
            }
            ShapeDrawable L2 = m6.L(L, m6.w0(i10, h6Var));
            if (connectedbotstarref.revoked) {
                i11 = m6.nk;
            } else {
                i11 = m6.lk;
            }
            p6 M = t6.M(i11);
            view2.setBackground(L2);
            t6.j(view2, L2, M, null, h6Var);
            if (connectedbotstarref.revoked) {
                i12 = 2131232208;
            } else {
                i12 = 2131232202;
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
            e3Var.f18641s = z10;
            e3Var.setWillNotDraw(!z10);
        } else if (obj instanceof TL_payments.starRefProgram) {
            e3 e3Var2 = (e3) view;
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
            boolean z12 = o41Var.f38064s;
            TLRPC.User c23 = np.u1(e3Var2.f18634a).c2(Long.valueOf(starrefprogram.bot_id));
            b9 b9Var2 = new b9((h6) null);
            b9Var2.r(c23);
            e3Var2.f18636c.f(c23, b9Var2);
            e3Var2.h.setText(p10.q(c23));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (starrefprogram.commission_permille > 0) {
                spannableStringBuilder2.append((CharSequence) " d");
                iz izVar2 = new iz();
                int i16 = m6.lk;
                izVar2.f48850f = m6.w0(i16, null);
                izVar2.f48852r = i16;
                izVar2.f48853s = null;
                izVar2.f48851n = true;
                izVar2.f48854w = j.J0(starrefprogram.commission_permille);
                if (izVar2.f48848c != null) {
                    izVar2.f48848c = null;
                    izVar2.a();
                }
                spannableStringBuilder2.setSpan(izVar2, 1, 2, 33);
            }
            int i17 = starrefprogram.duration_months;
            if (i17 == 0) {
                spannableStringBuilder2.append((CharSequence) hd.N0(2131748793, null));
            } else if (i17 >= 12 && i17 % 12 == 0) {
                spannableStringBuilder2.append((CharSequence) hd.G(i17 / 12, "Years", new Object[0]));
            } else {
                spannableStringBuilder2.append((CharSequence) hd.G(i17, "Months", new Object[0]));
            }
            e3Var2.f18639n.setText(spannableStringBuilder2);
            ImageView imageView3 = e3Var2.f18640r;
            if (!z12) {
                i13 = 8;
            }
            imageView3.setVisibility(i13);
            e3Var2.d.setVisibility(8);
            e3Var2.f18638f.setVisibility(8);
            e3Var2.f18637e.setVisibility(8);
            e3Var2.f18641s = z10;
            e3Var2.setWillNotDraw(!z10);
        }
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, h6 h6Var) {
        return new e3(i7, context, h6Var);
    }
}
