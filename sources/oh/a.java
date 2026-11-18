package oh;

import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.lq;
public abstract class a {
    public static final SparseArray f21904a = new SparseArray(6);

    public static SpannableStringBuilder a(int i7, CharSequence charSequence, boolean z10) {
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
        SparseArray sparseArray = f21904a;
        lq lqVar = (lq) sparseArray.get(i7);
        if (lqVar == null) {
            lqVar = new lq(i7, 0);
            lqVar.a(n6.Zl);
            sparseArray.put(i7, lqVar);
        }
        spannableStringBuilder.setSpan(lqVar, 0, 1, 33);
        if (z10) {
            spannableStringBuilder.append((char) 8297);
        }
        return spannableStringBuilder;
    }
}
