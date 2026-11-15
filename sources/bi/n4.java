package bi;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class n4 implements Comparator {
    public final int f3735a;
    public final a6 f3736b;

    public n4(a6 a6Var, int i7) {
        this.f3735a = i7;
        this.f3736b = a6Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f3735a) {
            case 0:
                o5 o5Var = this.f3736b.d;
                Integer num = (Integer) o5Var.f3764m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28057id));
                Integer num2 = (Integer) o5Var.f3764m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28057id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                o5 o5Var2 = this.f3736b.d;
                Integer num3 = (Integer) o5Var2.f3765n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num4 = (Integer) o5Var2.f3765n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                o5 o5Var3 = this.f3736b.d;
                Integer num5 = (Integer) o5Var3.f3766o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28057id));
                Integer num6 = (Integer) o5Var3.f3766o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28057id));
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
