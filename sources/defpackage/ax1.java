package defpackage;

import android.util.Property;
import android.view.View;
public final class ax1 extends Property {
    public final byte a;

    public ax1(Class cls, String str, byte b) {
        super(cls, str);
        this.a = b;
    }

    @Override
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 1:
                return Float.valueOf(((gb2) obj).wd);
            case 2:
                return Float.valueOf(((u98) obj).a);
            case 3:
                return Float.valueOf(((t09) obj).w);
            default:
                return Float.valueOf(((umb) obj).h);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((View) obj).setTranslationY(((Integer) obj2).intValue());
                return;
            case 1:
                ((gb2) obj).setAnimationOffsetX(((Float) obj2).floatValue());
                return;
            case 2:
                ((u98) obj).b(((Float) obj2).floatValue());
                return;
            case 3:
                ((t09) obj).setTransitionProgress(((Float) obj2).floatValue());
                return;
            default:
                umb umbVar = (umb) obj;
                umbVar.h = ((Float) obj2).floatValue();
                umbVar.invalidate();
                return;
        }
    }
}
