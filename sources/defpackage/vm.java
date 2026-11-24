package defpackage;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
public final class vm extends wld {
    public final ObjectAnimator a;
    public final boolean b;

    public vm(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int i;
        int i2;
        int numberOfFrames = animationDrawable.getNumberOfFrames() - 1;
        if (z) {
            i = numberOfFrames;
            numberOfFrames = 0;
        } else {
            i = 0;
        }
        ?? obj = new Object();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        obj.b = numberOfFrames2;
        int[] iArr = obj.a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            iArr = new int[numberOfFrames2];
            obj.a = iArr;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < numberOfFrames2; i4++) {
            if (z) {
                i2 = (numberOfFrames2 - i4) - 1;
            } else {
                i2 = i4;
            }
            int duration = animationDrawable.getDuration(i2);
            iArr[i4] = duration;
            i3 += duration;
        }
        obj.c = i3;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, numberOfFrames);
        zo2.a(ofInt, true);
        ofInt.setDuration(obj.c);
        ofInt.setInterpolator(obj);
        this.b = z2;
        this.a = ofInt;
    }

    @Override
    public final boolean a() {
        return this.b;
    }

    @Override
    public final void b() {
        this.a.reverse();
    }

    @Override
    public final void c() {
        this.a.start();
    }

    @Override
    public final void d() {
        this.a.cancel();
    }
}
