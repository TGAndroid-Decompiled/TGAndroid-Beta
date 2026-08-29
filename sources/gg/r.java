package gg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class r extends AnimatorListenerAdapter {
    public final float[] f7328a;
    public final float f7329b;
    public final float f7330c;
    public final boolean d;
    public final s f7331e;

    public r(s sVar, float[] fArr, float f9, float f10, boolean z10) {
        this.f7331e = sVar;
        this.f7328a = fArr;
        this.f7329b = f9;
        this.f7330c = f10;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f7328a;
        fArr[0] = 1.0f;
        s sVar = this.f7331e;
        cg.i iVar = sVar.f7332a;
        iVar.f5590b.f5555i = AndroidUtilities.lerp(this.f7329b, this.f7330c, 1.0f);
        dg.a aVar = iVar.f5590b;
        float f9 = aVar.f5553f;
        float f10 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        aVar.f5553f = (f10 * i10) + f9;
        aVar.b();
        sVar.a(iVar.f5590b.f5555i);
        iVar.h(750L);
    }
}
