package defpackage;

import android.text.SpannableStringBuilder;
import android.util.SparseArray;
public abstract class bf3 {
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
        cm2 cm2Var = (cm2) sparseArray.get(i);
        if (cm2Var == null) {
            cm2Var = new cm2(i, 0);
            cm2Var.a(bkb.Yl);
            sparseArray.put(i, cm2Var);
        }
        spannableStringBuilder.setSpan(cm2Var, 0, 1, 33);
        if (z) {
            spannableStringBuilder.append((char) 8297);
        }
        return spannableStringBuilder;
    }
}
