package defpackage;

import java.util.Comparator;
import org.telegram.ui.Dictation.DictationAsr;
public final class gm3 implements Comparator {
    public final byte a;
    public final float[] b;

    public gm3(float[] fArr, byte b) {
        this.a = b;
        this.b = fArr;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        float f;
        byte b = this.a;
        float[] fArr = this.b;
        Integer num = (Integer) obj;
        Integer num2 = (Integer) obj2;
        switch (b) {
            case 0:
                nm3[] nm3VarArr = DictationAsr.a;
                return Float.compare(fArr[num2.intValue()], fArr[num.intValue()]);
            case 1:
                return Float.compare(fArr[num2.intValue()], fArr[num.intValue()]);
            case 2:
                return Float.compare(fArr[(num.intValue() * 3) + 2], fArr[(num2.intValue() * 3) + 2]);
            case 3:
                float f2 = fArr[num.intValue()];
                float f3 = 0.0f;
                if (f2 > 0.0f) {
                    f = (float) Math.log(f2);
                } else {
                    f = 0.0f;
                }
                float f4 = fArr[num2.intValue()];
                if (f4 > 0.0f) {
                    f3 = (float) Math.log(f4);
                }
                return Float.compare(f, f3);
            case 4:
                return Float.compare(fArr[(num.intValue() * 3) + 2], fArr[(num2.intValue() * 3) + 2]);
            default:
                return Float.compare(fArr[(num.intValue() * 3) + 2], fArr[(num2.intValue() * 3) + 2]);
        }
    }
}
