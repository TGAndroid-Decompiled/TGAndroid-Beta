package i;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import f7.h8;
public final class c extends h8 {
    public final ObjectAnimator f10830a;
    public final boolean f10831b;

    public c(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
        int i9;
        int i10;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i11 = z10 ? numberOfFrames - 1 : 0;
        if (z10) {
            i9 = 0;
        } else {
            i9 = numberOfFrames - 1;
        }
        ?? obj = new Object();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        obj.f10833b = numberOfFrames2;
        int[] iArr = obj.f10832a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            obj.f10832a = new int[numberOfFrames2];
        }
        int[] iArr2 = obj.f10832a;
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
        obj.f10834c = i12;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i11, i9);
        j.a.a(ofInt, true);
        ofInt.setDuration(obj.f10834c);
        ofInt.setInterpolator(obj);
        this.f10831b = z11;
        this.f10830a = ofInt;
    }

    @Override
    public final boolean a() {
        return this.f10831b;
    }

    @Override
    public final void b() {
        this.f10830a.reverse();
    }

    @Override
    public final void c() {
        this.f10830a.start();
    }

    @Override
    public final void d() {
        this.f10830a.cancel();
    }
}
