package gh;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;

public final class n5 implements Comparator {

    public final int f7467a;

    public final w5 f7468b;

    public n5(w5 w5Var, int i10) {
        this.f7467a = i10;
        this.f7468b = w5Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f7467a) {
            case 0:
                w5 w5Var = this.f7468b;
                Integer num = (Integer) w5Var.f7607c.f7334n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num2 = (Integer) w5Var.f7607c.f7334n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                w5 w5Var2 = this.f7468b;
                Integer num3 = (Integer) w5Var2.f7607c.f7335o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f22386id));
                Integer num4 = (Integer) w5Var2.f7607c.f7335o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f22386id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                w5 w5Var3 = this.f7468b;
                Integer num5 = (Integer) w5Var3.f7607c.f7333m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f22386id));
                Integer num6 = (Integer) w5Var3.f7607c.f7333m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f22386id));
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
