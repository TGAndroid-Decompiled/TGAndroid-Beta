package defpackage;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class va9 implements Comparator {
    public final byte a;
    public final zb9 b;

    public va9(zb9 zb9Var, byte b) {
        this.a = b;
        this.b = zb9Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        zb9 zb9Var = this.b;
        switch (b) {
            case 0:
                qb9 qb9Var = zb9Var.d;
                Integer num = (Integer) qb9Var.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                Integer num2 = (Integer) qb9Var.o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                qb9 qb9Var2 = zb9Var.d;
                Integer num3 = (Integer) qb9Var2.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num4 = (Integer) qb9Var2.n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                qb9 qb9Var3 = zb9Var.d;
                Integer num5 = (Integer) qb9Var3.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                Integer num6 = (Integer) qb9Var3.m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
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
