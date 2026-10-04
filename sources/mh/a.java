package mh;

import android.text.SpannableStringBuilder;
import android.util.SparseArray;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.rq;
public abstract class a {
    public static final SparseArray f16435a = new SparseArray(6);

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
        SparseArray sparseArray = f16435a;
        rq rqVar = (rq) sparseArray.get(i10);
        if (rqVar == null) {
            rqVar = new rq(i10, 0);
            rqVar.setColorKey(i6.il);
            sparseArray.put(i10, rqVar);
        }
        spannableStringBuilder.setSpan(rqVar, 0, 1, 33);
        if (z10) {
            spannableStringBuilder.append((char) 8297);
        }
        return spannableStringBuilder;
    }
}
