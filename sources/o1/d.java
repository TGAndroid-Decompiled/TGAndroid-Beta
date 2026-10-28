package o1;

import java.util.ArrayList;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class d extends i {
    public final int f18947a;
    public final Object f18948b;

    public d(Object obj, int i10) {
        this.f18947a = i10;
        this.f18948b = obj;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f18947a) {
            case 0:
                return ((ac.a) this.f18948b).f1236a;
            default:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                ArrayList arrayList = ((AnimatedPhoneNumberEditText) this.f18948b).f25842w;
                if (intValue < arrayList.size()) {
                    return ((Float) arrayList.get(num.intValue())).floatValue() * 100.0f;
                }
                return 0.0f;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f18947a) {
            case 0:
                ((ac.a) this.f18948b).f1236a = f7;
                return;
            default:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f18948b;
                ArrayList arrayList = animatedPhoneNumberEditText.f25842w;
                if (intValue < arrayList.size()) {
                    arrayList.set(num.intValue(), Float.valueOf(f7 / 100.0f));
                    animatedPhoneNumberEditText.invalidate();
                    return;
                }
                return;
        }
    }
}
