package kh;

import java.util.Comparator;
import org.telegram.tgnet.tl.TL_stars;
public final class f5 implements Comparator {
    public final int f10722a;
    public final o5 f10723b;

    public f5(o5 o5Var, int i10) {
        this.f10722a = i10;
        this.f10723b = o5Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f10722a) {
            case 0:
                o5 o5Var = this.f10723b;
                Integer num = (Integer) o5Var.f10851c.f10590n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj).backdrop_id));
                Integer num2 = (Integer) o5Var.f10851c.f10590n.get(Integer.valueOf(((TL_stars.starGiftAttributeBackdrop) obj2).backdrop_id));
                if (num == null) {
                    return 1;
                }
                if (num2 == null) {
                    return -1;
                }
                return num2.intValue() - num.intValue();
            case 1:
                o5 o5Var2 = this.f10723b;
                Integer num3 = (Integer) o5Var2.f10851c.f10591o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj).document.f19165id));
                Integer num4 = (Integer) o5Var2.f10851c.f10591o.get(Long.valueOf(((TL_stars.starGiftAttributePattern) obj2).document.f19165id));
                if (num3 == null) {
                    return 1;
                }
                if (num4 == null) {
                    return -1;
                }
                return num4.intValue() - num3.intValue();
            default:
                o5 o5Var3 = this.f10723b;
                Integer num5 = (Integer) o5Var3.f10851c.f10589m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj).document.f19165id));
                Integer num6 = (Integer) o5Var3.f10851c.f10589m.get(Long.valueOf(((TL_stars.starGiftAttributeModel) obj2).document.f19165id));
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
