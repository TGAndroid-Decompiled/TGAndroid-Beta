package ig;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class r extends AnimatorListenerAdapter {
    public final float[] f7518a;
    public final float f7519b;
    public final float f7520c;
    public final boolean d;
    public final s e;

    public r(s sVar, float[] fArr, float f10, float f11, boolean z4) {
        this.e = sVar;
        this.f7518a = fArr;
        this.f7519b = f10;
        this.f7520c = f11;
        this.d = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f7518a;
        fArr[0] = 1.0f;
        s sVar = this.e;
        eg.i iVar = sVar.f7521a;
        iVar.f6156b.f6122i = AndroidUtilities.lerp(this.f7519b, this.f7520c, 1.0f);
        fg.a aVar = iVar.f6156b;
        float f10 = aVar.f6120f;
        float f11 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        aVar.f6120f = (f11 * i10) + f10;
        aVar.b();
        sVar.a(iVar.f6156b.f6122i);
        iVar.h(750L);
    }
}
