package lh;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class g5 implements Comparator {
    public final int f12781a;
    public final p5 f12782b;

    public g5(p5 p5Var, int i10) {
        this.f12781a = i10;
        this.f12782b = p5Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f12781a) {
            case 0:
                p5 p5Var = this.f12782b;
                Integer num = (Integer) p5Var.f12896c.f12629n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num2 = (Integer) p5Var.f12896c.f12629n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                p5 p5Var2 = this.f12782b;
                Integer num3 = (Integer) p5Var2.f12896c.f12630o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f20849id));
                Integer num4 = (Integer) p5Var2.f12896c.f12630o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f20849id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                p5 p5Var3 = this.f12782b;
                Integer num5 = (Integer) p5Var3.f12896c.f12628m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f20849id));
                Integer num6 = (Integer) p5Var3.f12896c.f12628m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f20849id));
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
