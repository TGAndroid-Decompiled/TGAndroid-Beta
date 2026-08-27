package gh;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;

public final class f4 implements Comparator {

    public final int f7254a;

    public final y5 f7255b;

    public f4(y5 y5Var, int i10) {
        this.f7254a = i10;
        this.f7255b = y5Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f7254a) {
            case 0:
                i5 i5Var = this.f7255b.d;
                Integer num = (Integer) i5Var.f7335o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f22386id));
                Integer num2 = (Integer) i5Var.f7335o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f22386id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                i5 i5Var2 = this.f7255b.d;
                Integer num3 = (Integer) i5Var2.f7334n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num4 = (Integer) i5Var2.f7334n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                i5 i5Var3 = this.f7255b.d;
                Integer num5 = (Integer) i5Var3.f7333m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f22386id));
                Integer num6 = (Integer) i5Var3.f7333m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f22386id));
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
