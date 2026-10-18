package i;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import v7.w7;
public final class c extends w7 {
    public final ObjectAnimator f12270a;
    public final boolean f12271b;

    public c(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
        int i10;
        int i11;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i12 = z10 ? numberOfFrames - 1 : 0;
        if (z10) {
            i10 = 0;
        } else {
            i10 = numberOfFrames - 1;
        }
        ?? obj = new Object();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        obj.f12273b = numberOfFrames2;
        int[] iArr = obj.f12272a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            obj.f12272a = new int[numberOfFrames2];
        }
        int[] iArr2 = obj.f12272a;
        int i13 = 0;
        for (int i14 = 0; i14 < numberOfFrames2; i14++) {
            if (z10) {
                i11 = (numberOfFrames2 - i14) - 1;
            } else {
                i11 = i14;
            }
            int duration = animationDrawable.getDuration(i11);
            iArr2[i14] = duration;
            i13 += duration;
        }
        obj.f12274c = i13;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i12, i10);
        j.a.a(ofInt, true);
        ofInt.setDuration(obj.f12274c);
        ofInt.setInterpolator(obj);
        this.f12271b = z11;
        this.f12270a = ofInt;
    }

    @Override
    public final boolean a() {
        return this.f12271b;
    }

    @Override
    public final void b() {
        this.f12270a.reverse();
    }

    @Override
    public final void c() {
        this.f12270a.start();
    }

    @Override
    public final void d() {
        this.f12270a.cancel();
    }
}
