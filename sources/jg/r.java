package jg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class r extends AnimatorListenerAdapter {
    public final float[] f10058a;
    public final float f10059b;
    public final float f10060c;
    public final boolean d;
    public final s f10061e;

    public r(s sVar, float[] fArr, float f10, float f11, boolean z4) {
        this.f10061e = sVar;
        this.f10058a = fArr;
        this.f10059b = f10;
        this.f10060c = f11;
        this.d = z4;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10;
        float[] fArr = this.f10058a;
        fArr[0] = 1.0f;
        s sVar = this.f10061e;
        fg.i iVar = sVar.f10062a;
        iVar.f7087b.f7052i = AndroidUtilities.lerp(this.f10059b, this.f10060c, 1.0f);
        gg.a aVar = iVar.f7087b;
        float f10 = aVar.f7050f;
        float f11 = (1.0f - fArr[0]) * 360.0f;
        if (this.d) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        aVar.f7050f = (f11 * i10) + f10;
        aVar.b();
        sVar.a(iVar.f7087b.f7052i);
        iVar.h(750L);
    }
}
