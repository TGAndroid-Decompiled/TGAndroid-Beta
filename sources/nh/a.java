package nh;

import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.yq;
public abstract class a {
    public static final SparseArray f17470a = new SparseArray(6);

    public static SpannableStringBuilder a(int i10, CharSequence charSequence, boolean z10) {
        SpannableStringBuilder spannableStringBuilder;
        if (charSequence instanceof SpannableStringBuilder) {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        if (z10) {
            spannableStringBuilder.insert(0, (CharSequence) "* \u2068");
        } else {
            spannableStringBuilder.insert(0, (CharSequence) "* ");
        }
        SparseArray sparseArray = f17470a;
        yq yqVar = (yq) sparseArray.get(i10);
        if (yqVar == null) {
            yqVar = new yq(i10, 0);
            yqVar.setColorKey(h6.il);
            sparseArray.put(i10, yqVar);
        }
        spannableStringBuilder.setSpan(yqVar, 0, 1, 33);
        if (z10) {
            spannableStringBuilder.append((char) 8297);
        }
        return spannableStringBuilder;
    }
}
