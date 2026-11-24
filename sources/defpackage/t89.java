package defpackage;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class t89 implements Comparator {
    public final byte a;
    public final z99 b;

    public t89(z99 z99Var, byte b) {
        this.a = b;
        this.b = z99Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        z99 z99Var = this.b;
        switch (b) {
            case 0:
                q99 q99Var = z99Var.d;
                Integer num = (Integer) q99Var.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                Integer num2 = (Integer) q99Var.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                q99 q99Var2 = z99Var.d;
                Integer num3 = (Integer) q99Var2.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num4 = (Integer) q99Var2.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                q99 q99Var3 = z99Var.d;
                Integer num5 = (Integer) q99Var3.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                Integer num6 = (Integer) q99Var3.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                if (num5 == null) {
                    return 1;
                }
                if (num6 == null) {
                    return -1;
                }
                return num6.intValue() - num5.intValue();
        }
    }
}
