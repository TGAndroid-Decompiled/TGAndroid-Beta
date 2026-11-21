package bi;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class y6 implements Comparator {
    public final int f4291a;
    public final k8 f4292b;

    public y6(k8 k8Var, int i7) {
        this.f4291a = i7;
        this.f4292b = k8Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f4291a) {
            case 0:
                y7 y7Var = this.f4292b.d;
                Integer num = (Integer) y7Var.f4305o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28437id));
                Integer num2 = (Integer) y7Var.f4305o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28437id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                y7 y7Var2 = this.f4292b.d;
                Integer num3 = (Integer) y7Var2.f4304n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num4 = (Integer) y7Var2.f4304n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                y7 y7Var3 = this.f4292b.d;
                Integer num5 = (Integer) y7Var3.f4303m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28437id));
                Integer num6 = (Integer) y7Var3.f4303m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28437id));
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
