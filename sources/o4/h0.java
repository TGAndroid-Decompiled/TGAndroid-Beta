package o4;

import android.animation.ValueAnimator;
import java.net.URL;
import k7.l8;
import org.telegram.ui.Components.pr;
public final class h0 {
    public int f16495a;
    public long f16496b;
    public Object f16497c;

    public h0(int i10, URL url, long j10) {
        this.f16495a = i10;
        this.f16497c = url;
        this.f16496b = j10;
    }

    public void a(wh.a aVar, sf.h hVar) {
        long j10;
        boolean z4;
        int i10;
        int b10 = l8.b(aVar);
        if (aVar != null) {
            j10 = aVar.f49652a;
        } else {
            j10 = Long.MIN_VALUE;
        }
        if (j10 == this.f16496b && this.f16495a >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f16496b = j10;
        ValueAnimator valueAnimator = (ValueAnimator) this.f16497c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f16497c = null;
        }
        if (z4 && (i10 = this.f16495a) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
            ofInt.addUpdateListener(new xh.d(1, this, hVar));
            ofInt.setInterpolator(pr.f30168f);
            ofInt.setDuration(200L);
            this.f16497c = ofInt;
            ofInt.start();
            return;
        }
        this.f16495a = b10;
        hVar.c(b10);
    }
}
