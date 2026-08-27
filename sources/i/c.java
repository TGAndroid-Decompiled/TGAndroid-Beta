package i;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import g7.v7;

public final class c extends v7 {

    public final ObjectAnimator f10471a;

    public final boolean f10472b;

    public c(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i10 = z10 ? numberOfFrames - 1 : 0;
        int i11 = z10 ? 0 : numberOfFrames - 1;
        d dVar = new d();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        dVar.f10474b = numberOfFrames2;
        int[] iArr = dVar.f10473a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            dVar.f10473a = new int[numberOfFrames2];
        }
        int[] iArr2 = dVar.f10473a;
        int i12 = 0;
        for (int i13 = 0; i13 < numberOfFrames2; i13++) {
            int duration = animationDrawable.getDuration(z10 ? (numberOfFrames2 - i13) - 1 : i13);
            iArr2[i13] = duration;
            i12 += duration;
        }
        dVar.f10475c = i12;
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i10, i11);
        j.a.a(objectAnimatorOfInt, true);
        objectAnimatorOfInt.setDuration(dVar.f10475c);
        objectAnimatorOfInt.setInterpolator(dVar);
        this.f10472b = z11;
        this.f10471a = objectAnimatorOfInt;
    }

    @Override
    public final boolean a() {
        return this.f10472b;
    }

    @Override
    public final void b() {
        this.f10471a.reverse();
    }

    @Override
    public final void c() {
        this.f10471a.start();
    }

    @Override
    public final void d() {
        this.f10471a.cancel();
    }
}
