package fh;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class l4 implements Comparator {
    public final int f6605a;
    public final g6 f6606b;

    public l4(g6 g6Var, int i9) {
        this.f6605a = i9;
        this.f6606b = g6Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f6605a) {
            case 0:
                p5 p5Var = this.f6606b.d;
                Integer num = (Integer) p5Var.f6713o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f22386id));
                Integer num2 = (Integer) p5Var.f6713o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f22386id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                p5 p5Var2 = this.f6606b.d;
                Integer num3 = (Integer) p5Var2.f6712n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num4 = (Integer) p5Var2.f6712n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                p5 p5Var3 = this.f6606b.d;
                Integer num5 = (Integer) p5Var3.f6711m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f22386id));
                Integer num6 = (Integer) p5Var3.f6711m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f22386id));
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
