package eg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;

public final class s extends AnimatorListenerAdapter {

    public final float[] f5437a;

    public final float f5438b;

    public final float f5439c;
    public final boolean d;

    public final t f5440e;

    public s(t tVar, float[] fArr, float f10, float f11, boolean z10) {
        this.f5440e = tVar;
        this.f5437a = fArr;
        this.f5438b = f10;
        this.f5439c = f11;
        this.d = z10;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float[] fArr = this.f5437a;
        float f10 = 1.0f - fArr[0];
        fArr[0] = 1.0f;
        t tVar = this.f5440e;
        ag.k kVar = tVar.f5441a;
        kVar.f2129b.f2094i = AndroidUtilities.lerp(this.f5438b, this.f5439c, 1.0f);
        bg.a aVar = kVar.f2129b;
        aVar.f2092f = (f10 * 360.0f * (this.d ? 1 : -1)) + aVar.f2092f;
        aVar.b();
        tVar.a(kVar.f2129b.f2094i);
        kVar.h(750L);
    }
}
