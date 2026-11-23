package bi;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class x6 implements Comparator {
    public final int f4252a;
    public final j8 f4253b;

    public x6(j8 j8Var, int i7) {
        this.f4252a = i7;
        this.f4253b = j8Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f4252a) {
            case 0:
                x7 x7Var = this.f4253b.d;
                Integer num = (Integer) x7Var.f4266o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28440id));
                Integer num2 = (Integer) x7Var.f4266o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28440id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                x7 x7Var2 = this.f4253b.d;
                Integer num3 = (Integer) x7Var2.f4265n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num4 = (Integer) x7Var2.f4265n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                x7 x7Var3 = this.f4253b.d;
                Integer num5 = (Integer) x7Var3.f4264m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28440id));
                Integer num6 = (Integer) x7Var3.f4264m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28440id));
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
