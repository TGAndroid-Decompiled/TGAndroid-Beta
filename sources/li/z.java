package li;

import android.animation.ValueAnimator;
import bi.de;
import java.net.URL;
import org.telegram.ui.Components.xq;
public final class z {
    public int f19032a;
    public long f19033b;
    public Object f19034c;

    public z(int i7, URL url, long j3) {
        this.f19032a = i7;
        this.f19034c = url;
        this.f19033b = j3;
    }

    public void a(a aVar, l2.y yVar) {
        long j3;
        boolean z9;
        int i7;
        int b10 = c8.l1.b(aVar);
        if (aVar != null) {
            j3 = aVar.f18388a;
        } else {
            j3 = Long.MIN_VALUE;
        }
        if (j3 == this.f19033b && this.f19032a >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f19033b = j3;
        ValueAnimator valueAnimator = (ValueAnimator) this.f19034c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f19034c = null;
        }
        if (z9 && (i7 = this.f19032a) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i7, b10);
            ofInt.addUpdateListener(new de(8, this, yVar));
            ofInt.setInterpolator(xq.f40310f);
            ofInt.setDuration(200L);
            this.f19034c = ofInt;
            ofInt.start();
            return;
        }
        this.f19032a = b10;
        yVar.d(b10);
    }
}
