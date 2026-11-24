package defpackage;

import android.text.SpannableStringBuilder;
import android.util.SparseArray;
public abstract class og3 {
    public static final SparseArray a = new SparseArray(6);

    public static SpannableStringBuilder a(int i, CharSequence charSequence, boolean z) {
        SpannableStringBuilder spannableStringBuilder;
        if (charSequence instanceof SpannableStringBuilder) {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        if (z) {
            spannableStringBuilder.insert(0, (CharSequence) "* \u2068");
        } else {
            spannableStringBuilder.insert(0, (CharSequence) "* ");
        }
        SparseArray sparseArray = a;
        pn2 pn2Var = (pn2) sparseArray.get(i);
        if (pn2Var == null) {
            pn2Var = new pn2(i, 0);
            pn2Var.a(cmb.Yl);
            sparseArray.put(i, pn2Var);
        }
        spannableStringBuilder.setSpan(pn2Var, 0, 1, 33);
        if (z) {
            spannableStringBuilder.append((char) 8297);
        }
        return spannableStringBuilder;
    }
}
