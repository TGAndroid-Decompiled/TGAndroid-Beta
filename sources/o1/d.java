package o1;

import java.util.ArrayList;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class d extends h {
    public final int f13937a;
    public final Object f13938b;

    public d(Object obj, int i10) {
        this.f13937a = i10;
        this.f13938b = obj;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f13937a) {
            case 0:
                return ((i) this.f13938b).f13941a;
            default:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                ArrayList arrayList = ((AnimatedPhoneNumberEditText) this.f13938b).Q1;
                if (intValue < arrayList.size()) {
                    return ((Float) arrayList.get(num.intValue())).floatValue() * 100.0f;
                }
                return 0.0f;
        }
    }

    @Override
    public final void b(Object obj, float f7) {
        switch (this.f13937a) {
            case 0:
                ((i) this.f13938b).f13941a = f7;
                return;
            default:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f13938b;
                ArrayList arrayList = animatedPhoneNumberEditText.Q1;
                if (intValue < arrayList.size()) {
                    arrayList.set(num.intValue(), Float.valueOf(f7 / 100.0f));
                    animatedPhoneNumberEditText.invalidate();
                    return;
                }
                return;
        }
    }
}
