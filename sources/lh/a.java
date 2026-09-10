package lh;

import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.uq;
public abstract class a {
    public static final SparseArray f12963a = new SparseArray(6);

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
        SparseArray sparseArray = f12963a;
        uq uqVar = (uq) sparseArray.get(i10);
        if (uqVar == null) {
            uqVar = new uq(i10, 0);
            uqVar.setColorKey(j6.il);
            sparseArray.put(i10, uqVar);
        }
        spannableStringBuilder.setSpan(uqVar, 0, 1, 33);
        if (z10) {
            spannableStringBuilder.append((char) 8297);
        }
        return spannableStringBuilder;
    }
}
