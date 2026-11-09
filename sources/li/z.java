package li;

import android.animation.ValueAnimator;
import bi.de;
import java.net.URL;
import org.telegram.ui.Components.xq;
public final class z {
    public int f19035a;
    public long f19036b;
    public Object f19037c;

    public z(int i7, URL url, long j3) {
        this.f19035a = i7;
        this.f19037c = url;
        this.f19036b = j3;
    }

    public void a(a aVar, l2.x xVar) {
        long j3;
        boolean z9;
        int i7;
        int b10 = c8.l1.b(aVar);
        if (aVar != null) {
            j3 = aVar.f18391a;
        } else {
            j3 = Long.MIN_VALUE;
        }
        if (j3 == this.f19036b && this.f19035a >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f19036b = j3;
        ValueAnimator valueAnimator = (ValueAnimator) this.f19037c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f19037c = null;
        }
        if (z9 && (i7 = this.f19035a) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i7, b10);
            ofInt.addUpdateListener(new de(8, this, xVar));
            ofInt.setInterpolator(xq.f40458f);
            ofInt.setDuration(200L);
            this.f19037c = ofInt;
            ofInt.start();
            return;
        }
        this.f19035a = b10;
        xVar.d(b10);
    }
}
