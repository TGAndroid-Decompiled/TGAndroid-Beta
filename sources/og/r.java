package og;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.i0;
public final class r extends AnimatorListenerAdapter {
    public final float[] f14218a;
    public final float f14219b;
    public final float f14220c;
    public final boolean d;
    public final s e;

    public r(s sVar, float[] fArr, float f7, float f10, boolean z10) {
        this.e = sVar;
        this.f14218a = fArr;
        this.f14219b = f7;
        this.f14220c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f14218a;
        fArr[0] = 1.0f;
        this.e.f14221a.f11920b.f11885l = i0.T1(this.f14219b, this.f14220c, 1.0f);
        lg.h hVar = this.e.f14221a.f11920b;
        float f7 = hVar.f11880f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        hVar.f11880f = (f10 * i10) + f7;
        this.e.f14221a.f11920b.b();
        s sVar = this.e;
        sVar.a(sVar.f14221a.f11920b.f11885l);
        this.e.f14221a.j(750L);
    }
}
