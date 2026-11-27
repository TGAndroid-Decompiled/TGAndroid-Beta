package defpackage;

import android.text.SpannableStringBuilder;
import android.util.SparseArray;
public abstract class vf3 {
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
        wm2 wm2Var = (wm2) sparseArray.get(i);
        if (wm2Var == null) {
            wm2Var = new wm2(i, 0);
            wm2Var.a(aob.Zl);
            sparseArray.put(i, wm2Var);
        }
        spannableStringBuilder.setSpan(wm2Var, 0, 1, 33);
        if (z) {
            spannableStringBuilder.append((char) 8297);
        }
        return spannableStringBuilder;
    }
}
