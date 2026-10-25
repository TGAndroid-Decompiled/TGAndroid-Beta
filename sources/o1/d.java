package o1;

import java.util.ArrayList;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class d extends i {
    public final int f18948a;
    public final Object f18949b;

    public d(Object obj, int i10) {
        this.f18948a = i10;
        this.f18949b = obj;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f18948a) {
            case 0:
                return ((ac.a) this.f18949b).f1236a;
            default:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                ArrayList arrayList = ((AnimatedPhoneNumberEditText) this.f18949b).f25838w;
                if (intValue < arrayList.size()) {
                    return ((Float) arrayList.get(num.intValue())).floatValue() * 100.0f;
                }
                return 0.0f;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f18948a) {
            case 0:
                ((ac.a) this.f18949b).f1236a = f7;
                return;
            default:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f18949b;
                ArrayList arrayList = animatedPhoneNumberEditText.f25838w;
                if (intValue < arrayList.size()) {
                    arrayList.set(num.intValue(), Float.valueOf(f7 / 100.0f));
                    animatedPhoneNumberEditText.invalidate();
                    return;
                }
                return;
        }
    }
}
