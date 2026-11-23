package i;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import c8.l0;
public final class c extends l0 {
    public final ObjectAnimator f15960a;
    public final boolean f15961b;

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
        obj.f15963b = numberOfFrames2;
        int[] iArr = obj.f15962a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            obj.f15962a = new int[numberOfFrames2];
        }
        int[] iArr2 = obj.f15962a;
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
        obj.f15964c = i12;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i11, i7);
        j.a.a(ofInt, true);
        ofInt.setDuration(obj.f15964c);
        ofInt.setInterpolator(obj);
        this.f15961b = z11;
        this.f15960a = ofInt;
    }

    @Override
    public final boolean a() {
        return this.f15961b;
    }

    @Override
    public final void b() {
        this.f15960a.reverse();
    }

    @Override
    public final void c() {
        this.f15960a.start();
    }

    @Override
    public final void d() {
        this.f15960a.cancel();
    }
}
