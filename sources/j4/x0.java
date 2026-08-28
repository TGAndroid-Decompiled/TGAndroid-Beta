package j4;

import android.animation.ValueAnimator;
import g7.v6;
import java.net.URL;
import org.telegram.ui.Components.gr;
public final class x0 {
    public long f13606a;
    public int f13607b;
    public Object f13608c;

    public x0(int i9, URL url, long j10) {
        this.f13607b = i9;
        this.f13608c = url;
        this.f13606a = j10;
    }

    public void a(qh.a aVar, kh.p pVar) {
        long j10;
        boolean z10;
        int i9;
        int b10 = v6.b(aVar);
        if (aVar != null) {
            j10 = aVar.f46268a;
        } else {
            j10 = Long.MIN_VALUE;
        }
        if (j10 == this.f13606a && this.f13607b >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f13606a = j10;
        ValueAnimator valueAnimator = (ValueAnimator) this.f13608c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f13608c = null;
        }
        if (z10 && (i9 = this.f13607b) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i9, b10);
            ofInt.addUpdateListener(new f2.g(26, this, pVar));
            ofInt.setInterpolator(gr.f28844f);
            ofInt.setDuration(200L);
            this.f13608c = ofInt;
            ofInt.start();
            return;
        }
        this.f13607b = b10;
        pVar.h(b10);
    }
}
