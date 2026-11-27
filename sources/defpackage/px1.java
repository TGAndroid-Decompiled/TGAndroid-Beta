package defpackage;

import android.util.Property;
import android.view.View;
public final class px1 extends Property {
    public final byte a;

    public px1(Class cls, String str, byte b) {
        super(cls, str);
        this.a = b;
    }

    @Override
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 1:
                return Float.valueOf(((wb2) obj).wd);
            case 2:
                return Float.valueOf(((kd8) obj).a);
            case 3:
                return Float.valueOf(((i49) obj).w);
            default:
                return Float.valueOf(((tqb) obj).h);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((View) obj).setTranslationY(((Integer) obj2).intValue());
                return;
            case 1:
                ((wb2) obj).setAnimationOffsetX(((Float) obj2).floatValue());
                return;
            case 2:
                ((kd8) obj).b(((Float) obj2).floatValue());
                return;
            case 3:
                ((i49) obj).setTransitionProgress(((Float) obj2).floatValue());
                return;
            default:
                tqb tqbVar = (tqb) obj;
                tqbVar.h = ((Float) obj2).floatValue();
                tqbVar.invalidate();
                return;
        }
    }
}
