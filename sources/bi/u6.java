package bi;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class u6 implements Comparator {
    public final int f4085a;
    public final g8 f4086b;

    public u6(g8 g8Var, int i7) {
        this.f4085a = i7;
        this.f4086b = g8Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f4085a) {
            case 0:
                u7 u7Var = this.f4086b.d;
                Integer num = (Integer) u7Var.f4099o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28409id));
                Integer num2 = (Integer) u7Var.f4099o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28409id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                u7 u7Var2 = this.f4086b.d;
                Integer num3 = (Integer) u7Var2.f4098n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num4 = (Integer) u7Var2.f4098n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                u7 u7Var3 = this.f4086b.d;
                Integer num5 = (Integer) u7Var3.f4097m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28409id));
                Integer num6 = (Integer) u7Var3.f4097m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28409id));
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
