package o1;

import java.util.ArrayList;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class d extends i {
    public final int f16446a;
    public final Object f16447b;

    public d(Object obj, int i10) {
        this.f16446a = i10;
        this.f16447b = obj;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f16446a) {
            case 0:
                return ((j) this.f16447b).f16467a;
            default:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                ArrayList arrayList = ((AnimatedPhoneNumberEditText) this.f16447b).f22846w;
                if (intValue < arrayList.size()) {
                    return ((Float) arrayList.get(num.intValue())).floatValue() * 100.0f;
                }
                return 0.0f;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f16446a) {
            case 0:
                ((j) this.f16447b).f16467a = f7;
                return;
            default:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f16447b;
                ArrayList arrayList = animatedPhoneNumberEditText.f22846w;
                if (intValue < arrayList.size()) {
                    arrayList.set(num.intValue(), Float.valueOf(f7 / 100.0f));
                    animatedPhoneNumberEditText.invalidate();
                    return;
                }
                return;
        }
    }
}
