package ci;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import org.telegram.ui.Components.zy;
public final class pc extends AnimatorListenerAdapter {
    public final int f5788a;
    public final int f5789b;
    public final float f5790c;
    public final View d;

    public pc(View view, int i3, float f10, int i10) {
        this.f5788a = i10;
        this.d = view;
        this.f5789b = i3;
        this.f5790c = f10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f5788a) {
            case 0:
                qc qcVar = (qc) this.d;
                qcVar.f5862d0 = this.f5790c;
                if (qcVar.getValue() != this.f5789b) {
                    qcVar.e(qcVar.getValue());
                }
                qcVar.invalidate();
                return;
            case 1:
                zy zyVar = (zy) this.d;
                int i3 = this.f5789b;
                if (i3 == 5) {
                    f10 = 0.0f;
                } else {
                    f10 = -this.f5790c;
                }
                zyVar.b(f10, i3 + 1);
                zyVar.E = 0.0f;
                zyVar.invalidate();
                return;
            default:
                ((org.telegram.ui.web.i1) this.d).c(this.f5789b, this.f5790c, false);
                return;
        }
    }

    public pc(qc qcVar, float f10, int i3) {
        this.f5788a = 0;
        this.d = qcVar;
        this.f5790c = f10;
        this.f5789b = i3;
    }
}
