package j5;

import ah.l0;
import android.animation.ValueAnimator;
import java.net.URL;
import org.telegram.ui.Components.es;
import v7.u8;
public final class b {
    public long f12844a;
    public int f12845b;
    public Object f12846c;

    public b(int i10, URL url, long j10) {
        this.f12845b = i10;
        this.f12846c = url;
        this.f12844a = j10;
    }

    public void a(ji.a aVar, f1.a aVar2) {
        long j10;
        boolean z10;
        int i10;
        int b10 = u8.b(aVar);
        if (aVar != null) {
            j10 = aVar.f13106a;
        } else {
            j10 = Long.MIN_VALUE;
        }
        if (j10 == this.f12844a && this.f12845b >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12844a = j10;
        ValueAnimator valueAnimator = (ValueAnimator) this.f12846c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f12846c = null;
        }
        if (z10 && (i10 = this.f12845b) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
            ofInt.addUpdateListener(new l0(7, this, aVar2));
            ofInt.setInterpolator(es.f24465f);
            ofInt.setDuration(200L);
            this.f12846c = ofInt;
            ofInt.start();
            return;
        }
        this.f12845b = b10;
        aVar2.c(b10);
    }
}
