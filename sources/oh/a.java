package oh;

import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.wp;
public abstract class a {
    public static final SparseArray f21018a = new SparseArray(6);

    public static SpannableStringBuilder a(int i7, CharSequence charSequence, boolean z9) {
        SpannableStringBuilder spannableStringBuilder;
        if (charSequence instanceof SpannableStringBuilder) {
            spannableStringBuilder = (SpannableStringBuilder) charSequence;
        } else {
            spannableStringBuilder = new SpannableStringBuilder(charSequence);
        }
        if (z9) {
            spannableStringBuilder.insert(0, (CharSequence) "* \u2068");
        } else {
            spannableStringBuilder.insert(0, (CharSequence) "* ");
        }
        SparseArray sparseArray = f21018a;
        wp wpVar = (wp) sparseArray.get(i7);
        if (wpVar == null) {
            wpVar = new wp(i7, 0);
            wpVar.a(l6.Wl);
            sparseArray.put(i7, wpVar);
        }
        spannableStringBuilder.setSpan(wpVar, 0, 1, 33);
        if (z9) {
            spannableStringBuilder.append((char) 8297);
        }
        return spannableStringBuilder;
    }
}
