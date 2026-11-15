package ai;

import java.util.Comparator;
import org.telegram.ui.Dictation.DictationAsr;
public final class k implements Comparator {
    public final int f1269a;
    public final float[] f1270b;

    public k(int i7, float[] fArr) {
        this.f1269a = i7;
        this.f1270b = fArr;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        float f10;
        switch (this.f1269a) {
            case 0:
                float[] fArr = this.f1270b;
                t[] tVarArr = DictationAsr.f42579a;
                return Float.compare(fArr[((Integer) obj2).intValue()], fArr[((Integer) obj).intValue()]);
            case 1:
                float[] fArr2 = this.f1270b;
                return Float.compare(fArr2[(((Integer) obj).intValue() * 3) + 2], fArr2[(((Integer) obj2).intValue() * 3) + 2]);
            case 2:
                float[] fArr3 = this.f1270b;
                return Float.compare(fArr3[(((Integer) obj).intValue() * 3) + 2], fArr3[(((Integer) obj2).intValue() * 3) + 2]);
            case 3:
                float[] fArr4 = this.f1270b;
                return Float.compare(fArr4[(((Integer) obj).intValue() * 3) + 2], fArr4[(((Integer) obj2).intValue() * 3) + 2]);
            default:
                float[] fArr5 = this.f1270b;
                Integer num = (Integer) obj2;
                float f11 = fArr5[((Integer) obj).intValue()];
                float f12 = 0.0f;
                if (f11 > 0.0f) {
                    f10 = (float) Math.log(f11);
                } else {
                    f10 = 0.0f;
                }
                float f13 = fArr5[num.intValue()];
                if (f13 > 0.0f) {
                    f12 = (float) Math.log(f13);
                }
                return Float.compare(f10, f12);
        }
    }
}
