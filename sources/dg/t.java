package dg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class t extends AnimatorListenerAdapter {
    public final float[] f4546a;
    public final float f4547b;
    public final float f4548c;
    public final boolean d;
    public final u f4549e;

    public t(u uVar, float[] fArr, float f10, float f11, boolean z10) {
        this.f4549e = uVar;
        this.f4546a = fArr;
        this.f4547b = f10;
        this.f4548c = f11;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i9;
        float[] fArr = this.f4546a;
        fArr[0] = 1.0f;
        u uVar = this.f4549e;
        q qVar = uVar.f4550a;
        qVar.f205b.f168i = AndroidUtilities.lerp(this.f4547b, this.f4548c, 1.0f);
        ag.a aVar = qVar.f205b;
        float f10 = aVar.f166f;
        float f11 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        aVar.f166f = (f11 * i9) + f10;
        aVar.b();
        uVar.a(qVar.f205b.f168i);
        qVar.h(750L);
    }
}
