package defpackage;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class fc9 implements Comparator {
    public final byte a;
    public final nd9 b;

    public fc9(nd9 nd9Var, byte b) {
        this.a = b;
        this.b = nd9Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        byte b = this.a;
        nd9 nd9Var = this.b;
        switch (b) {
            case 0:
                ed9 ed9Var = nd9Var.e;
                Integer num = (Integer) ed9Var.o.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num2 = (Integer) ed9Var.o.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                ed9 ed9Var2 = nd9Var.e;
                Integer num3 = (Integer) ed9Var2.n.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.id));
                Integer num4 = (Integer) ed9Var2.n.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                ed9 ed9Var3 = nd9Var.e;
                Integer num5 = (Integer) ed9Var3.p.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.id));
                Integer num6 = (Integer) ed9Var3.p.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.id));
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
