package defpackage;

import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.function.ToIntFunction;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ProfileActivity;
public final class kn1 implements ToIntFunction {
    public final byte a;
    public final Object b;

    public kn1(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final int applyAsInt(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                return ((Integer) ((HashMap) obj2).get((View) obj)).intValue();
            case 1:
                RectF rectF = ProfileActivity.Z6;
                return ((Integer) ((ArrayList) obj2).get(((Integer) obj).intValue())).intValue();
            case 2:
                return ((SpannableStringBuilder) obj2).getSpanStart((el9) obj);
            default:
                return ((int[]) ((IdentityHashMap) obj2).get((TL_iv.pageTableCell) obj))[1];
        }
    }
}
