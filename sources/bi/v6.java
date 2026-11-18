package bi;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class v6 implements Comparator {
    public final int f4143a;
    public final h8 f4144b;

    public v6(h8 h8Var, int i7) {
        this.f4143a = i7;
        this.f4144b = h8Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f4143a) {
            case 0:
                v7 v7Var = this.f4144b.d;
                Integer num = (Integer) v7Var.f4157o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28411id));
                Integer num2 = (Integer) v7Var.f4157o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28411id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                v7 v7Var2 = this.f4144b.d;
                Integer num3 = (Integer) v7Var2.f4156n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num4 = (Integer) v7Var2.f4156n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                v7 v7Var3 = this.f4144b.d;
                Integer num5 = (Integer) v7Var3.f4155m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28411id));
                Integer num6 = (Integer) v7Var3.f4155m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28411id));
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
