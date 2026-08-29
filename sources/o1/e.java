package o1;

import java.util.ArrayList;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class e extends j {
    public final int f19023a;
    public final Object f19024b;

    public e(Object obj, int i10) {
        this.f19023a = i10;
        this.f19024b = obj;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f19023a) {
            case 0:
                return ((ib.a) this.f19024b).f8824a;
            default:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                ArrayList arrayList = ((AnimatedPhoneNumberEditText) this.f19024b).f26082w;
                if (intValue < arrayList.size()) {
                    return ((Float) arrayList.get(num.intValue())).floatValue() * 100.0f;
                }
                return 0.0f;
        }
    }

    @Override
    public final void b(Object obj, float f9) {
        switch (this.f19023a) {
            case 0:
                ((ib.a) this.f19024b).f8824a = f9;
                return;
            default:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f19024b;
                ArrayList arrayList = animatedPhoneNumberEditText.f26082w;
                if (intValue < arrayList.size()) {
                    arrayList.set(num.intValue(), Float.valueOf(f9 / 100.0f));
                    animatedPhoneNumberEditText.invalidate();
                    return;
                }
                return;
        }
    }
}
