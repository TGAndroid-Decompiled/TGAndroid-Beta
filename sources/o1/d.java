package o1;

import java.util.ArrayList;
import org.telegram.ui.Components.AnimatedPhoneNumberEditText;

public final class d extends i {

    public final int f19125a;

    public final Object f19126b;

    public d(Object obj, int i10) {
        this.f19125a = i10;
        this.f19126b = obj;
    }

    @Override
    public final float a(Object obj) {
        switch (this.f19125a) {
            case 0:
                return ((hb.a) this.f19126b).f8860a;
            default:
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                ArrayList arrayList = ((AnimatedPhoneNumberEditText) this.f19126b).f26067w;
                if (iIntValue < arrayList.size()) {
                    return ((Float) arrayList.get(num.intValue())).floatValue() * 100.0f;
                }
                return 0.0f;
        }
    }

    @Override
    public final void b(Object obj, float f10) {
        switch (this.f19125a) {
            case 0:
                ((hb.a) this.f19126b).f8860a = f10;
                break;
            default:
                Integer num = (Integer) obj;
                int iIntValue = num.intValue();
                AnimatedPhoneNumberEditText animatedPhoneNumberEditText = (AnimatedPhoneNumberEditText) this.f19126b;
                ArrayList arrayList = animatedPhoneNumberEditText.f26067w;
                if (iIntValue < arrayList.size()) {
                    arrayList.set(num.intValue(), Float.valueOf(f10 / 100.0f));
                    animatedPhoneNumberEditText.invalidate();
                }
                break;
        }
    }
}
