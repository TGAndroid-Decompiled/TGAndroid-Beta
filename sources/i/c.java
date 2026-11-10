package i;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import c8.h0;
public final class c extends h0 {
    public final ObjectAnimator f15104a;
    public final boolean f15105b;

    public c(AnimationDrawable animationDrawable, boolean z9, boolean z10) {
        int i7;
        int i10;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i11 = z9 ? numberOfFrames - 1 : 0;
        if (z9) {
            i7 = 0;
        } else {
            i7 = numberOfFrames - 1;
        }
        ?? obj = new Object();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        obj.f15107b = numberOfFrames2;
        int[] iArr = obj.f15106a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            obj.f15106a = new int[numberOfFrames2];
        }
        int[] iArr2 = obj.f15106a;
        int i12 = 0;
        for (int i13 = 0; i13 < numberOfFrames2; i13++) {
            if (z9) {
                i10 = (numberOfFrames2 - i13) - 1;
            } else {
                i10 = i13;
            }
            int duration = animationDrawable.getDuration(i10);
            iArr2[i13] = duration;
            i12 += duration;
        }
        obj.f15108c = i12;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i11, i7);
        j.a.a(ofInt, true);
        ofInt.setDuration(obj.f15108c);
        ofInt.setInterpolator(obj);
        this.f15105b = z10;
        this.f15104a = ofInt;
    }

    @Override
    public final boolean a() {
        return this.f15105b;
    }

    @Override
    public final void b() {
        this.f15104a.reverse();
    }

    @Override
    public final void c() {
        this.f15104a.start();
    }

    @Override
    public final void d() {
        this.f15104a.cancel();
    }
}
