package defpackage;

import android.util.Property;
import android.view.View;
public final class ny1 extends Property {
    public final byte a;

    public ny1(Class cls, String str, byte b) {
        super(cls, str);
        this.a = b;
    }

    @Override
    public final Object get(Object obj) {
        switch (this.a) {
            case 0:
                return Integer.valueOf(Math.round(((View) obj).getTranslationY()));
            case 1:
                return Float.valueOf(((rc2) obj).wd);
            case 2:
                return Float.valueOf(((vb8) obj).a);
            case 3:
                return Float.valueOf(((v29) obj).w);
            default:
                return Float.valueOf(((vob) obj).h);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((View) obj).setTranslationY(((Integer) obj2).intValue());
                return;
            case 1:
                ((rc2) obj).setAnimationOffsetX(((Float) obj2).floatValue());
                return;
            case 2:
                ((vb8) obj).b(((Float) obj2).floatValue());
                return;
            case 3:
                ((v29) obj).setTransitionProgress(((Float) obj2).floatValue());
                return;
            default:
                vob vobVar = (vob) obj;
                vobVar.h = ((Float) obj2).floatValue();
                vobVar.invalidate();
                return;
        }
    }
}
