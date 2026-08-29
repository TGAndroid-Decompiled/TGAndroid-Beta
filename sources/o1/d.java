package o1;

import android.view.View;
public final class d extends j {
    public final int f19022a;

    @Override
    public final float a(Object obj) {
        switch (this.f19022a) {
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
    public final void b(Object obj, float f9) {
        switch (this.f19022a) {
            case 0:
                ((View) obj).setAlpha(f9);
                return;
            case 1:
                ((View) obj).setTranslationX(f9);
                return;
            case 2:
                ((View) obj).setTranslationY(f9);
                return;
            case 3:
                ((View) obj).setScaleX(f9);
                return;
            case 4:
                ((View) obj).setScaleY(f9);
                return;
            case 5:
                ((View) obj).setRotation(f9);
                return;
            case 6:
                ((View) obj).setRotationX(f9);
                return;
            default:
                ((View) obj).setRotationY(f9);
                return;
        }
    }
}
