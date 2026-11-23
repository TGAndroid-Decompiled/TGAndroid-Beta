package bi;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class a7 implements Comparator {
    public final int f3359a;
    public final m8 f3360b;

    public a7(m8 m8Var, int i7) {
        this.f3359a = i7;
        this.f3360b = m8Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f3359a) {
            case 0:
                a8 a8Var = this.f3360b.d;
                Integer num = (Integer) a8Var.f3373o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f28404id));
                Integer num2 = (Integer) a8Var.f3373o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f28404id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                a8 a8Var2 = this.f3360b.d;
                Integer num3 = (Integer) a8Var2.f3372n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num4 = (Integer) a8Var2.f3372n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                a8 a8Var3 = this.f3360b.d;
                Integer num5 = (Integer) a8Var3.f3371m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f28404id));
                Integer num6 = (Integer) a8Var3.f3371m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f28404id));
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
