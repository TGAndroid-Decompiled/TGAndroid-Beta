package j5;

import ah.l0;
import android.animation.ValueAnimator;
import java.net.URL;
import org.telegram.ui.Components.bs;
import w7.i;
public final class c {
    public long f14251a;
    public int f14252b;
    public Object f14253c;

    public c(int i10, URL url, long j10) {
        this.f14252b = i10;
        this.f14253c = url;
        this.f14251a = j10;
    }

    public void a(ki.a aVar, b bVar) {
        long j10;
        boolean z10;
        int i10;
        int b10 = i.b(aVar);
        if (aVar != null) {
            j10 = aVar.f15088a;
        } else {
            j10 = Long.MIN_VALUE;
        }
        if (j10 == this.f14251a && this.f14252b >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f14251a = j10;
        ValueAnimator valueAnimator = (ValueAnimator) this.f14253c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f14253c = null;
        }
        if (z10 && (i10 = this.f14252b) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
            ofInt.addUpdateListener(new l0(8, this, bVar));
            ofInt.setInterpolator(bs.f25030f);
            ofInt.setDuration(200L);
            this.f14253c = ofInt;
            ofInt.start();
            return;
        }
        this.f14252b = b10;
        bVar.i(b10);
    }
}
