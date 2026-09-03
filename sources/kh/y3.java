package kh;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class y3 implements Comparator {
    public final int f11072a;
    public final q5 f11073b;

    public y3(q5 q5Var, int i10) {
        this.f11072a = i10;
        this.f11073b = q5Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f11072a) {
            case 0:
                a5 a5Var = this.f11073b.d;
                Integer num = (Integer) a5Var.f10591o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f19165id));
                Integer num2 = (Integer) a5Var.f10591o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f19165id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                a5 a5Var2 = this.f11073b.d;
                Integer num3 = (Integer) a5Var2.f10590n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num4 = (Integer) a5Var2.f10590n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                a5 a5Var3 = this.f11073b.d;
                Integer num5 = (Integer) a5Var3.f10589m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f19165id));
                Integer num6 = (Integer) a5Var3.f10589m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f19165id));
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
