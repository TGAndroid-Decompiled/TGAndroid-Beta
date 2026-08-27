package j4;

import ag.t2;
import android.animation.ValueAnimator;
import h7.z6;
import java.net.URL;
import org.telegram.ui.Components.er;

public final class x0 {

    public long f12710a;

    public int f12711b;

    public Object f12712c;

    public x0(int i10, URL url, long j10) {
        this.f12711b = i10;
        this.f12712c = url;
        this.f12710a = j10;
    }

    public void a(rh.a aVar, lh.p pVar) {
        int i10;
        int iB = z6.b(aVar);
        long j10 = aVar != null ? aVar.f47027a : Long.MIN_VALUE;
        boolean z10 = j10 == this.f12710a && this.f12711b >= 0;
        this.f12710a = j10;
        ValueAnimator valueAnimator = (ValueAnimator) this.f12712c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f12712c = null;
        }
        if (!z10 || (i10 = this.f12711b) == iB) {
            this.f12711b = iB;
            pVar.d(iB);
            return;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i10, iB);
        valueAnimatorOfInt.addUpdateListener(new t2(27, this, pVar));
        valueAnimatorOfInt.setInterpolator(er.f28122f);
        valueAnimatorOfInt.setDuration(200L);
        this.f12712c = valueAnimatorOfInt;
        valueAnimatorOfInt.start();
    }
}
