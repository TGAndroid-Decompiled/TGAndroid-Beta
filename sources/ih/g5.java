package ih;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class g5 implements Comparator {
    public final int f9191a;
    public final p5 f9192b;

    public g5(p5 p5Var, int i10) {
        this.f9191a = i10;
        this.f9192b = p5Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f9191a) {
            case 0:
                p5 p5Var = this.f9192b;
                Integer num = (Integer) p5Var.f9329c.f9054n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num2 = (Integer) p5Var.f9329c.f9054n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                p5 p5Var2 = this.f9192b;
                Integer num3 = (Integer) p5Var2.f9329c.f9055o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f22398id));
                Integer num4 = (Integer) p5Var2.f9329c.f9055o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f22398id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                p5 p5Var3 = this.f9192b;
                Integer num5 = (Integer) p5Var3.f9329c.f9053m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f22398id));
                Integer num6 = (Integer) p5Var3.f9329c.f9053m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f22398id));
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
