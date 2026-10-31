package bi;

import android.animation.ValueAnimator;
import java.net.URL;
import org.telegram.ui.Components.gr;
public final class d0 {
    public int f2914a;
    public long f2915b;
    public Object f2916c;

    public d0(int i10, URL url, long j10) {
        this.f2914a = i10;
        this.f2916c = url;
        this.f2915b = j10;
    }

    public void a(a aVar, a1.c cVar) {
        long j10;
        boolean z10;
        int i10;
        int b10 = v7.a5.b(aVar);
        if (aVar != null) {
            j10 = aVar.f2817a;
        } else {
            j10 = Long.MIN_VALUE;
        }
        if (j10 == this.f2915b && this.f2914a >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f2915b = j10;
        ValueAnimator valueAnimator = (ValueAnimator) this.f2916c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f2916c = null;
        }
        if (z10 && (i10 = this.f2914a) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
            ofInt.addUpdateListener(new ag.p2(4, this, cVar));
            ofInt.setInterpolator(gr.f26495f);
            ofInt.setDuration(200L);
            this.f2916c = ofInt;
            ofInt.start();
            return;
        }
        this.f2914a = b10;
        cVar.d(b10);
    }
}
