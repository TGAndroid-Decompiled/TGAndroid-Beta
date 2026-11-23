package i;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import c8.k0;
public final class c extends k0 {
    public final ObjectAnimator f15899a;
    public final boolean f15900b;

    public c(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
        int i7;
        int i10;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i11 = z10 ? numberOfFrames - 1 : 0;
        if (z10) {
            i7 = 0;
        } else {
            i7 = numberOfFrames - 1;
        }
        ?? obj = new Object();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        obj.f15902b = numberOfFrames2;
        int[] iArr = obj.f15901a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            obj.f15901a = new int[numberOfFrames2];
        }
        int[] iArr2 = obj.f15901a;
        int i12 = 0;
        for (int i13 = 0; i13 < numberOfFrames2; i13++) {
            if (z10) {
                i10 = (numberOfFrames2 - i13) - 1;
            } else {
                i10 = i13;
            }
            int duration = animationDrawable.getDuration(i10);
            iArr2[i13] = duration;
            i12 += duration;
        }
        obj.f15903c = i12;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i11, i7);
        j.a.a(ofInt, true);
        ofInt.setDuration(obj.f15903c);
        ofInt.setInterpolator(obj);
        this.f15900b = z11;
        this.f15899a = ofInt;
    }

    @Override
    public final boolean a() {
        return this.f15900b;
    }

    @Override
    public final void b() {
        this.f15899a.reverse();
    }

    @Override
    public final void c() {
        this.f15899a.start();
    }

    @Override
    public final void d() {
        this.f15899a.cancel();
    }
}
