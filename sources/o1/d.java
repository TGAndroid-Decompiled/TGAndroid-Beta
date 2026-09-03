package o1;

import java.util.ArrayList;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class d extends i {
    public final int f16157a;
    public final Object f16158b;

    public d(Object obj, int i10) {
        this.f16157a = i10;
        this.f16158b = obj;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f16157a) {
            case 0:
                return ((kb.a) this.f16158b).f10259a;
            default:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                ArrayList arrayList = ((AnimatedPhoneNumberEditText) this.f16158b).f22699w;
                if (intValue < arrayList.size()) {
                    return ((Float) arrayList.get(num.intValue())).floatValue() * 100.0f;
                }
                return 0.0f;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f16157a) {
            case 0:
                ((kb.a) this.f16158b).f10259a = f10;
                return;
            default:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f16158b;
                ArrayList arrayList = animatedPhoneNumberEditText.f22699w;
                if (intValue < arrayList.size()) {
                    arrayList.set(num.intValue(), Float.valueOf(f10 / 100.0f));
                    animatedPhoneNumberEditText.invalidate();
                    return;
                }
                return;
        }
    }
}
