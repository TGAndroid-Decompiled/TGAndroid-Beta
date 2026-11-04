package ii;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.i6;
import org.telegram.messenger.l10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.u8;
import org.telegram.ui.cz;
public final class m3 extends q31 {
    public static final int f15080b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        int i3;
        int i10;
        int i11;
        int i12;
        float f10;
        Object obj = r31Var.G;
        int i13 = 0;
        if (obj instanceof TL_payments.connectedBotStarRef) {
            n3 n3Var = (n3) view;
            TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
            boolean z11 = r31Var.f37633r;
            e6 e6Var = n3Var.f15101b;
            View view2 = n3Var.f15103e;
            ImageView imageView = n3Var.f15104f;
            TLRPC.User a22 = hp.s1(n3Var.f15100a).a2(Long.valueOf(connectedbotstarref.bot_id));
            u8 u8Var = new u8((e6) null);
            u8Var.r(a22);
            n3Var.f15102c.e(a22, u8Var);
            TextView textView = n3Var.h;
            textView.setText(i6.m(l10.p(a22), textView.getPaint().getFontMetricsInt(), false, null, 0));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (connectedbotstarref.commission_permille > 0) {
                spannableStringBuilder.append((CharSequence) " d");
                cz czVar = new cz();
                int i14 = k6.ik;
                czVar.f44492f = k6.w0(i14, null);
                czVar.f44494r = i14;
                czVar.f44495s = null;
                czVar.f44493n = true;
                czVar.f44496w = k.J0(connectedbotstarref.commission_permille);
                if (czVar.f44490c != null) {
                    czVar.f44490c = null;
                    czVar.a();
                }
                spannableStringBuilder.setSpan(czVar, 1, 2, 33);
            }
            int i15 = connectedbotstarref.duration_months;
            if (i15 == 0) {
                spannableStringBuilder.append((CharSequence) bd.M0(2131748994, null));
            } else if (i15 >= 12 && i15 % 12 == 0) {
                spannableStringBuilder.append((CharSequence) bd.G(i15 / 12, "Years", new Object[0]));
            } else {
                spannableStringBuilder.append((CharSequence) bd.G(i15, "Months", new Object[0]));
            }
            n3Var.f15105n.setText(spannableStringBuilder);
            ImageView imageView2 = n3Var.f15106r;
            if (z11) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            imageView2.setVisibility(i3);
            n3Var.d.setVisibility(0);
            imageView.setVisibility(0);
            view2.setVisibility(0);
            int L = org.telegram.messenger.g0.L(9.665f);
            if (connectedbotstarref.revoked) {
                i10 = k6.kk;
            } else {
                i10 = k6.ik;
            }
            ShapeDrawable L2 = k6.L(L, k6.w0(i10, e6Var));
            if (connectedbotstarref.revoked) {
                i11 = k6.kk;
            } else {
                i11 = k6.ik;
            }
            n6 N = r6.N(i11);
            view2.setBackground(L2);
            r6.k(view2, L2, N, null, e6Var);
            if (connectedbotstarref.revoked) {
                i12 = 2131232206;
            } else {
                i12 = 2131232200;
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
            n3Var.f15107s = z10;
            n3Var.setWillNotDraw(!z10);
        } else if (obj instanceof TL_payments.starRefProgram) {
            n3 n3Var2 = (n3) view;
            TL_payments.starRefProgram starrefprogram = (TL_payments.starRefProgram) obj;
            boolean z12 = r31Var.f37633r;
            TLRPC.User a23 = hp.s1(n3Var2.f15100a).a2(Long.valueOf(starrefprogram.bot_id));
            u8 u8Var2 = new u8((e6) null);
            u8Var2.r(a23);
            n3Var2.f15102c.e(a23, u8Var2);
            n3Var2.h.setText(l10.p(a23));
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            if (starrefprogram.commission_permille > 0) {
                spannableStringBuilder2.append((CharSequence) " d");
                cz czVar2 = new cz();
                int i16 = k6.ik;
                czVar2.f44492f = k6.w0(i16, null);
                czVar2.f44494r = i16;
                czVar2.f44495s = null;
                czVar2.f44493n = true;
                czVar2.f44496w = k.J0(starrefprogram.commission_permille);
                if (czVar2.f44490c != null) {
                    czVar2.f44490c = null;
                    czVar2.a();
                }
                spannableStringBuilder2.setSpan(czVar2, 1, 2, 33);
            }
            int i17 = starrefprogram.duration_months;
            if (i17 == 0) {
                spannableStringBuilder2.append((CharSequence) bd.M0(2131748994, null));
            } else if (i17 >= 12 && i17 % 12 == 0) {
                spannableStringBuilder2.append((CharSequence) bd.G(i17 / 12, "Years", new Object[0]));
            } else {
                spannableStringBuilder2.append((CharSequence) bd.G(i17, "Months", new Object[0]));
            }
            n3Var2.f15105n.setText(spannableStringBuilder2);
            ImageView imageView3 = n3Var2.f15106r;
            if (!z12) {
                i13 = 8;
            }
            imageView3.setVisibility(i13);
            n3Var2.d.setVisibility(8);
            n3Var2.f15104f.setVisibility(8);
            n3Var2.f15103e.setVisibility(8);
            n3Var2.f15107s = z10;
            n3Var2.setWillNotDraw(!z10);
        }
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, e6 e6Var) {
        return new n3(i3, context, e6Var);
    }
}
