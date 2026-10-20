package j5;

import ah.l0;
import android.animation.ValueAnimator;
import java.net.URL;
import org.telegram.ui.Components.bs;
import w7.i;
public final class c {
    public long f14256a;
    public int f14257b;
    public Object f14258c;

    public c(int i10, URL url, long j10) {
        this.f14257b = i10;
        this.f14258c = url;
        this.f14256a = j10;
    }

    public void a(ki.a aVar, b bVar) {
        long j10;
        boolean z10;
        int i10;
        int b10 = i.b(aVar);
        if (aVar != null) {
            j10 = aVar.f15094a;
        } else {
            j10 = Long.MIN_VALUE;
        }
        if (j10 == this.f14256a && this.f14257b >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f14256a = j10;
        ValueAnimator valueAnimator = (ValueAnimator) this.f14258c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f14258c = null;
        }
        if (z10 && (i10 = this.f14257b) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
            ofInt.addUpdateListener(new l0(8, this, bVar));
            ofInt.setInterpolator(bs.f25021f);
            ofInt.setDuration(200L);
            this.f14258c = ofInt;
            ofInt.start();
            return;
        }
        this.f14257b = b10;
        bVar.i(b10);
    }
}
