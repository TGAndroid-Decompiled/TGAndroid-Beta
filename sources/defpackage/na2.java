package defpackage;

import android.text.Spanned;
import java.util.Comparator;
public final class na2 implements Comparator {
    public final byte a;
    public final Spanned b;

    public na2(Spanned spanned, byte b) {
        this.a = b;
        this.b = spanned;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int spanStart;
        int spanStart2;
        byte b = this.a;
        Spanned spanned = this.b;
        switch (b) {
            case 0:
                spanStart = spanned.getSpanStart((nj2) obj2);
                spanStart2 = spanned.getSpanStart((nj2) obj);
                break;
            case 1:
                spanStart = spanned.getSpanStart((kib) obj2);
                spanStart2 = spanned.getSpanStart((kib) obj);
                break;
            default:
                spanStart = spanned.getSpanStart((qg9) obj2);
                spanStart2 = spanned.getSpanStart((qg9) obj);
                break;
        }
        return spanStart - spanStart2;
    }
}
