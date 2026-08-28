package o1;

import java.util.ArrayList;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class d extends i {
    public final int f18778a;
    public final Object f18779b;

    public d(Object obj, int i9) {
        this.f18778a = i9;
        this.f18779b = obj;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f18778a) {
            case 0:
                return ((gb.a) this.f18779b).f7689a;
            default:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                ArrayList arrayList = ((AnimatedPhoneNumberEditText) this.f18779b).f26071w;
                if (intValue < arrayList.size()) {
                    return ((Float) arrayList.get(num.intValue())).floatValue() * 100.0f;
                }
                return 0.0f;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f18778a) {
            case 0:
                ((gb.a) this.f18779b).f7689a = f10;
                return;
            default:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f18779b;
                ArrayList arrayList = animatedPhoneNumberEditText.f26071w;
                if (intValue < arrayList.size()) {
                    arrayList.set(num.intValue(), Float.valueOf(f10 / 100.0f));
                    animatedPhoneNumberEditText.invalidate();
                    return;
                }
                return;
        }
    }
}
