package eh;

import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.dq;
public abstract class a {
    public static final SparseArray f6593a = new SparseArray(6);

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
        SparseArray sparseArray = f6593a;
        dq dqVar = (dq) sparseArray.get(i10);
        if (dqVar == null) {
            dqVar = new dq(i10, 0);
            dqVar.a(t6.Wl);
            sparseArray.put(i10, dqVar);
        }
        spannableStringBuilder.setSpan(dqVar, 0, 1, 33);
        if (z10) {
            spannableStringBuilder.append((char) 8297);
        }
        return spannableStringBuilder;
    }
}
