package ai;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class w4 implements Comparator {
    public final int f1065a;
    public final i6 f1066b;

    public w4(i6 i6Var, int i3) {
        this.f1065a = i3;
        this.f1066b = i6Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f1065a) {
            case 0:
                w5 w5Var = this.f1066b.d;
                Integer num = (Integer) w5Var.f1079o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f27007id));
                Integer num2 = (Integer) w5Var.f1079o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f27007id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                w5 w5Var2 = this.f1066b.d;
                Integer num3 = (Integer) w5Var2.f1078n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num4 = (Integer) w5Var2.f1078n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                w5 w5Var3 = this.f1066b.d;
                Integer num5 = (Integer) w5Var3.f1077m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f27007id));
                Integer num6 = (Integer) w5Var3.f1077m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f27007id));
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
