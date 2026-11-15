package di;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.gz;
public final class fc extends AnimatorListenerAdapter {
    public final int f8572a;
    public final int f8573b;
    public final float f8574c;
    public final View d;

    public fc(View view, int i7, float f10, int i10) {
        this.f8572a = i10;
        this.d = view;
        this.f8573b = i7;
        this.f8574c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f8572a) {
            case 0:
                gc gcVar = (gc) this.d;
                gcVar.f8631d0 = this.f8574c;
                if (gcVar.getValue() != this.f8573b) {
                    gcVar.e(gcVar.getValue());
                }
                gcVar.invalidate();
                return;
            case 1:
                gz gzVar = (gz) this.d;
                int i7 = this.f8573b;
                if (i7 == 5) {
                    f10 = 0.0f;
                } else {
                    f10 = -this.f8574c;
                }
                gzVar.b(f10, i7 + 1);
                gzVar.E = 0.0f;
                gzVar.invalidate();
                return;
            default:
                ((org.telegram.ui.web.j1) this.d).c(this.f8573b, this.f8574c, false);
                return;
        }
    }

    public fc(gc gcVar, float f10, int i7) {
        this.f8572a = 0;
        this.d = gcVar;
        this.f8574c = f10;
        this.f8573b = i7;
    }
}
