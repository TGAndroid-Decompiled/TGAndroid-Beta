package kh;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class z3 implements Comparator {
    public final int f10973a;
    public final r5 f10974b;

    public z3(r5 r5Var, int i10) {
        this.f10973a = i10;
        this.f10974b = r5Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f10973a) {
            case 0:
                b5 b5Var = this.f10974b.d;
                Integer num = (Integer) b5Var.f10493o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f19190id));
                Integer num2 = (Integer) b5Var.f10493o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f19190id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                b5 b5Var2 = this.f10974b.d;
                Integer num3 = (Integer) b5Var2.f10492n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num4 = (Integer) b5Var2.f10492n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                b5 b5Var3 = this.f10974b.d;
                Integer num5 = (Integer) b5Var3.f10491m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f19190id));
                Integer num6 = (Integer) b5Var3.f10491m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f19190id));
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
