package defpackage;

import android.view.ViewPropertyAnimator;
public final class m21 extends q11 {
    public float a;
    public l21 b;
    public de0 c;
    public in d;
    public boolean e;

    @Override
    public CharSequence getAccessibilityText() {
        return this.d.getText();
    }

    public void setProgress(float f) {
        boolean z;
        float f2;
        boolean z2 = this.e;
        float f3 = 1.0f;
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        boolean z3 = false;
        if (i < 0) {
            z = true;
        } else {
            z = false;
        }
        if (z2 != z) {
            if (i < 0) {
                z3 = true;
            }
            this.e = z3;
            ViewPropertyAnimator animate = this.c.animate();
            if (this.e) {
                f2 = 0.78f;
            } else {
                f2 = 1.0f;
            }
            ViewPropertyAnimator scaleX = animate.scaleX(f2);
            if (this.e) {
                f3 = 0.78f;
            }
            scaleX.scaleY(f3).setDuration(320L).setInterpolator(k43.h).start();
        }
        this.a = f;
        this.b.invalidate();
    }

    public void setTextColor(int i) {
        this.d.setTextColor(i);
    }
}
