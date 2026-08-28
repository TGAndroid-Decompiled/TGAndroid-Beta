package fh;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class u5 implements Comparator {
    public final int f6788a;
    public final e6 f6789b;

    public u5(e6 e6Var, int i9) {
        this.f6788a = i9;
        this.f6789b = e6Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f6788a) {
            case 0:
                e6 e6Var = this.f6789b;
                Integer num = (Integer) e6Var.f6430c.f6712n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num2 = (Integer) e6Var.f6430c.f6712n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                e6 e6Var2 = this.f6789b;
                Integer num3 = (Integer) e6Var2.f6430c.f6713o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f22386id));
                Integer num4 = (Integer) e6Var2.f6430c.f6713o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f22386id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                e6 e6Var3 = this.f6789b;
                Integer num5 = (Integer) e6Var3.f6430c.f6711m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f22386id));
                Integer num6 = (Integer) e6Var3.f6430c.f6711m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f22386id));
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
