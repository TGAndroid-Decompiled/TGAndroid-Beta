package gh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.zk0;

public final class c5 extends m41 {

    public static final int f7185a = 0;

    static {
        m41.setup(new c5());
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        d5 d5Var = (d5) view;
        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) n41Var.G;
        int i10 = n41Var.f30857z;
        String str = (String) n41Var.f30844l;
        boolean z11 = n41Var.f30838e;
        ri0 ri0Var = d5Var.f22913c;
        b5 b5Var = d5Var.J;
        if (b5Var == null || d5Var.I != stargiftattributemodel.document.f22386id) {
            d5Var.I = stargiftattributemodel.document.f22386id;
            if (b5Var != null) {
                b5Var.o(ri0Var);
            }
            d5Var.J = new b5(3, d5Var.H, stargiftattributemodel.document);
        }
        if (ri0Var.isAttachedToWindow()) {
            d5Var.J.a(ri0Var);
        }
        CharSequence charSequenceHighlightText = stargiftattributemodel.name;
        if (!TextUtils.isEmpty(str)) {
            charSequenceHighlightText = AndroidUtilities.highlightText(charSequenceHighlightText, str, d5Var.B);
        }
        if (i10 > 0) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceHighlightText);
            spannableStringBuilder.append((CharSequence) "  ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) Integer.toString(i10));
            spannableStringBuilder.setSpan(new k41(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
            charSequenceHighlightText = spannableStringBuilder;
        }
        d5Var.g(charSequenceHighlightText, 0, d5Var.J);
        d5Var.setChecked(z11);
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new d5(context, i10, c6Var);
    }
}
