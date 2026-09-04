package o1;

import java.util.ArrayList;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class d extends i {
    public final int f16802a;
    public final Object f16803b;

    public d(Object obj, int i10) {
        this.f16802a = i10;
        this.f16803b = obj;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f16802a) {
            case 0:
                return ((j) this.f16803b).f16824a;
            default:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                ArrayList arrayList = ((AnimatedPhoneNumberEditText) this.f16803b).f23658w;
                if (intValue < arrayList.size()) {
                    return ((Float) arrayList.get(num.intValue())).floatValue() * 100.0f;
                }
                return 0.0f;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f16802a) {
            case 0:
                ((j) this.f16803b).f16824a = f7;
                return;
            default:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f16803b;
                ArrayList arrayList = animatedPhoneNumberEditText.f23658w;
                if (intValue < arrayList.size()) {
                    arrayList.set(num.intValue(), Float.valueOf(f7 / 100.0f));
                    animatedPhoneNumberEditText.invalidate();
                    return;
                }
                return;
        }
    }
}
