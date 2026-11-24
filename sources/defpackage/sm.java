package defpackage;

import java.util.ArrayList;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;
public final class sm extends ri4 {
    public final byte a;
    public final Object b;

    public sm(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final float a(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                ArrayList arrayList = ((AnimatedPhoneNumberEditText) obj2).W1;
                if (intValue < arrayList.size()) {
                    return ((Float) arrayList.get(num.intValue())).floatValue() * 100.0f;
                }
                return 0.0f;
            default:
                return ((ti4) obj2).a;
        }
    }

    @Override
    public final void b(Object obj, float f) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) obj2;
                ArrayList arrayList = animatedPhoneNumberEditText.W1;
                if (intValue < arrayList.size()) {
                    arrayList.set(num.intValue(), Float.valueOf(f / 100.0f));
                    animatedPhoneNumberEditText.invalidate();
                    return;
                }
                return;
            default:
                ((ti4) obj2).a = f;
                return;
        }
    }
}
