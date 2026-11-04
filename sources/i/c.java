package i;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;
import b8.qc;
public final class c extends qc {
    public final ObjectAnimator f14477a;
    public final boolean f14478b;

    public c(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
        int i3;
        int i10;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i11 = z10 ? numberOfFrames - 1 : 0;
        if (z10) {
            i3 = 0;
        } else {
            i3 = numberOfFrames - 1;
        }
        ?? obj = new Object();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        obj.f14480b = numberOfFrames2;
        int[] iArr = obj.f14479a;
        if (iArr == null || iArr.length < numberOfFrames2) {
            obj.f14479a = new int[numberOfFrames2];
        }
        int[] iArr2 = obj.f14479a;
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
        obj.f14481c = i12;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i11, i3);
        j.a.a(ofInt, true);
        ofInt.setDuration(obj.f14481c);
        ofInt.setInterpolator(obj);
        this.f14478b = z11;
        this.f14477a = ofInt;
    }

    @Override
    public final boolean a() {
        return this.f14478b;
    }

    @Override
    public final void b() {
        this.f14477a.reverse();
    }

    @Override
    public final void c() {
        this.f14477a.start();
    }

    @Override
    public final void d() {
        this.f14477a.cancel();
    }
}
