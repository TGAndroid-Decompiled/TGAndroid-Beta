package defpackage;

import android.view.View;
public final class gt3 extends vk4 {
    public final byte a;

    @Override
    public final float a(Object obj) {
        switch (this.a) {
            case 0:
                return ((View) obj).getAlpha();
            case 1:
                return ((View) obj).getTranslationX();
            case 2:
                return ((View) obj).getTranslationY();
            case 3:
                return ((View) obj).getScaleX();
            case 4:
                return ((View) obj).getScaleY();
            case 5:
                return ((View) obj).getRotation();
            case 6:
                return ((View) obj).getRotationX();
            default:
                return ((View) obj).getRotationY();
        }
    }

    @Override
    public final void b(Object obj, float f) {
        switch (this.a) {
            case 0:
                ((View) obj).setAlpha(f);
                return;
            case 1:
                ((View) obj).setTranslationX(f);
                return;
            case 2:
                ((View) obj).setTranslationY(f);
                return;
            case 3:
                ((View) obj).setScaleX(f);
                return;
            case 4:
                ((View) obj).setScaleY(f);
                return;
            case 5:
                ((View) obj).setRotation(f);
                return;
            case 6:
                ((View) obj).setRotationX(f);
                return;
            default:
                ((View) obj).setRotationY(f);
                return;
        }
    }
}
