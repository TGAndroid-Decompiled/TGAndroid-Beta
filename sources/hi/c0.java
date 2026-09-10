package hi;

import android.animation.ValueAnimator;
import java.net.URL;
import org.telegram.ui.Components.wr;
import v7.f8;
public final class c0 {
    public int f9482a;
    public long f9483b;
    public Object f9484c;

    public c0(int i10, URL url, long j3) {
        this.f9482a = i10;
        this.f9484c = url;
        this.f9483b = j3;
    }

    public void a(a aVar, a1.c cVar) {
        long j3;
        boolean z10;
        int i10;
        int b10 = f8.b(aVar);
        if (aVar != null) {
            j3 = aVar.f9420a;
        } else {
            j3 = Long.MIN_VALUE;
        }
        if (j3 == this.f9483b && this.f9482a >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f9483b = j3;
        ValueAnimator valueAnimator = (ValueAnimator) this.f9484c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f9484c = null;
        }
        if (z10 && (i10 = this.f9482a) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
            ofInt.addUpdateListener(new gg.t1(4, this, cVar));
            ofInt.setInterpolator(wr.f28819f);
            ofInt.setDuration(200L);
            this.f9484c = ofInt;
            ofInt.start();
            return;
        }
        this.f9482a = b10;
        cVar.g(b10);
    }
}
