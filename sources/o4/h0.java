package o4;

import android.animation.ValueAnimator;
import java.net.URL;
import k7.l8;
import org.telegram.ui.Components.pr;
public final class h0 {
    public int f16493a;
    public long f16494b;
    public Object f16495c;

    public h0(int i10, URL url, long j10) {
        this.f16493a = i10;
        this.f16495c = url;
        this.f16494b = j10;
    }

    public void a(wh.a aVar, sf.g gVar) {
        long j10;
        boolean z4;
        int i10;
        int b10 = l8.b(aVar);
        if (aVar != null) {
            j10 = aVar.f49615a;
        } else {
            j10 = Long.MIN_VALUE;
        }
        if (j10 == this.f16494b && this.f16493a >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f16494b = j10;
        ValueAnimator valueAnimator = (ValueAnimator) this.f16495c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f16495c = null;
        }
        if (z4 && (i10 = this.f16493a) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
            ofInt.addUpdateListener(new xh.d(1, this, gVar));
            ofInt.setInterpolator(pr.f30183f);
            ofInt.setDuration(200L);
            this.f16495c = ofInt;
            ofInt.start();
            return;
        }
        this.f16493a = b10;
        gVar.c(b10);
    }
}
