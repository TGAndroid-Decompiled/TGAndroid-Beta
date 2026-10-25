package oh;

import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.zq;
public abstract class a {
    public static final SparseArray f19418a = new SparseArray(6);

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
        SparseArray sparseArray = f19418a;
        zq zqVar = (zq) sparseArray.get(i10);
        if (zqVar == null) {
            zqVar = new zq(i10, 0);
            zqVar.setColorKey(y6.il);
            sparseArray.put(i10, zqVar);
        }
        spannableStringBuilder.setSpan(zqVar, 0, 1, 33);
        if (z10) {
            spannableStringBuilder.append((char) 8297);
        }
        return spannableStringBuilder;
    }
}
