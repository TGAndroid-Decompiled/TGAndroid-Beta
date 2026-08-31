package o1;

import android.view.View;
public final class c extends i {
    public final int f16313a;

    @Override
    public final float a(Object obj) {
        switch (this.f16313a) {
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
    public final void b(Object obj, float f10) {
        switch (this.f16313a) {
            case 0:
                ((View) obj).setAlpha(f10);
                return;
            case 1:
                ((View) obj).setTranslationX(f10);
                return;
            case 2:
                ((View) obj).setTranslationY(f10);
                return;
            case 3:
                ((View) obj).setScaleX(f10);
                return;
            case 4:
                ((View) obj).setScaleY(f10);
                return;
            case 5:
                ((View) obj).setRotation(f10);
                return;
            case 6:
                ((View) obj).setRotationX(f10);
                return;
            default:
                ((View) obj).setRotationY(f10);
                return;
        }
    }
}
