package j5;

import ah.l0;
import android.animation.ValueAnimator;
import java.net.URL;
import org.telegram.ui.Components.es;
import v7.u8;
public final class b {
    public long f12840a;
    public int f12841b;
    public Object f12842c;

    public b(int i10, URL url, long j10) {
        this.f12841b = i10;
        this.f12842c = url;
        this.f12840a = j10;
    }

    public void a(ji.a aVar, f1.a aVar2) {
        long j10;
        boolean z10;
        int i10;
        int b10 = u8.b(aVar);
        if (aVar != null) {
            j10 = aVar.f13102a;
        } else {
            j10 = Long.MIN_VALUE;
        }
        if (j10 == this.f12840a && this.f12841b >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12840a = j10;
        ValueAnimator valueAnimator = (ValueAnimator) this.f12842c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f12842c = null;
        }
        if (z10 && (i10 = this.f12841b) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
            ofInt.addUpdateListener(new l0(7, this, aVar2));
            ofInt.setInterpolator(es.f24771f);
            ofInt.setDuration(200L);
            this.f12842c = ofInt;
            ofInt.start();
            return;
        }
        this.f12841b = b10;
        aVar2.c(b10);
    }
}
