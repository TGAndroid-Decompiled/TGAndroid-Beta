package og;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.i0;
public final class r extends AnimatorListenerAdapter {
    public final float[] f14217a;
    public final float f14218b;
    public final float f14219c;
    public final boolean d;
    public final s e;

    public r(s sVar, float[] fArr, float f7, float f10, boolean z10) {
        this.e = sVar;
        this.f14217a = fArr;
        this.f14218b = f7;
        this.f14219c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f14217a;
        fArr[0] = 1.0f;
        this.e.f14220a.f11919b.f11884l = i0.T1(this.f14218b, this.f14219c, 1.0f);
        lg.h hVar = this.e.f14220a.f11919b;
        float f7 = hVar.f11879f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        hVar.f11879f = (f10 * i10) + f7;
        this.e.f14220a.f11919b.b();
        s sVar = this.e;
        sVar.a(sVar.f14220a.f11919b.f11884l);
        this.e.f14220a.j(750L);
    }
}
