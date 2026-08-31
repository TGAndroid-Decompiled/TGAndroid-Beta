package i;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import j7.y7;
public final class c extends y7 {
    public final ObjectAnimator f7737a;
    public final boolean f7738b;

    public c(AnimationDrawable animationDrawable, boolean z4, boolean z10) {
        int i10;
        int i11;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i12 = z4 ? numberOfFrames - 1 : 0;
        if (z4) {
            i10 = 0;
        } else {
            i10 = numberOfFrames - 1;
        }
        ?? obj = new Object();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        obj.f7740b = numberOfFrames2;
        int[] iArr = obj.f7739a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            obj.f7739a = new int[numberOfFrames2];
        }
        int[] iArr2 = obj.f7739a;
        int i13 = 0;
        for (int i14 = 0; i14 < numberOfFrames2; i14++) {
            if (z4) {
                i11 = (numberOfFrames2 - i14) - 1;
            } else {
                i11 = i14;
            }
            int duration = animationDrawable.getDuration(i11);
            iArr2[i14] = duration;
            i13 += duration;
        }
        obj.f7741c = i13;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i12, i10);
        j.a.a(ofInt, true);
        ofInt.setDuration(obj.f7741c);
        ofInt.setInterpolator(obj);
        this.f7738b = z10;
        this.f7737a = ofInt;
    }

    @Override
    public final boolean a() {
        return this.f7738b;
    }

    @Override
    public final void b() {
        this.f7737a.reverse();
    }

    @Override
    public final void c() {
        this.f7737a.start();
    }

    @Override
    public final void d() {
        this.f7737a.cancel();
    }
}
