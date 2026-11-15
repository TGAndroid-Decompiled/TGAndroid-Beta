package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.y31;
public final class i5 extends a41 {
    public static final int f3621b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        j5 j5Var = (j5) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) b41Var.G;
        int i7 = b41Var.f33197z;
        String str = (String) b41Var.f33184l;
        boolean z11 = b41Var.f33178e;
        fh0 fh0Var = j5Var.f29901c;
        h5 h5Var = j5Var.f3636b0;
        if (h5Var == null || j5Var.f3635a0 != stargiftattributemodel.document.f28057id) {
            j5Var.f3635a0 = stargiftattributemodel.document.f28057id;
            if (h5Var != null) {
                h5Var.n(fh0Var);
            }
            j5Var.f3636b0 = new org.telegram.ui.Components.g5(3, j5Var.W, stargiftattributemodel.document);
        }
        if (fh0Var.isAttachedToWindow()) {
            j5Var.f3636b0.a(fh0Var);
        }
        SpannableStringBuilder spannableStringBuilder = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            spannableStringBuilder = org.telegram.messenger.g0.w1(spannableStringBuilder, str, j5Var.P);
        }
        if (i7 > 0) {
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
            spannableStringBuilder2.append((CharSequence) "  ");
            int length = spannableStringBuilder2.length();
            spannableStringBuilder2.append((CharSequence) Integer.toString(i7));
            spannableStringBuilder2.setSpan(new y31(org.telegram.messenger.g0.o()), length, spannableStringBuilder2.length(), 33);
            spannableStringBuilder = spannableStringBuilder2;
        }
        j5Var.j(spannableStringBuilder, 0, j5Var.f3636b0);
        j5Var.setChecked(z11);
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new j5(i7, context, e6Var);
    }
}
