package ii;

import android.animation.ValueAnimator;
import java.net.URL;
import org.telegram.ui.Components.tr;
import v7.o8;
public final class b0 {
    public int f12233a;
    public long f12234b;
    public Object f12235c;

    public b0(int i10, URL url, long j3) {
        this.f12233a = i10;
        this.f12235c = url;
        this.f12234b = j3;
    }

    public void a(a aVar, ei.f fVar) {
        long j3;
        boolean z10;
        int i10;
        int b10 = o8.b(aVar);
        if (aVar != null) {
            j3 = aVar.f12185a;
        } else {
            j3 = Long.MIN_VALUE;
        }
        if (j3 == this.f12234b && this.f12233a >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12234b = j3;
        ValueAnimator valueAnimator = (ValueAnimator) this.f12235c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f12235c = null;
        }
        if (z10 && (i10 = this.f12233a) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
            ofInt.addUpdateListener(new ai.x(6, this, fVar));
            ofInt.setInterpolator(tr.f31141f);
            ofInt.setDuration(200L);
            this.f12235c = ofInt;
            ofInt.start();
            return;
        }
        this.f12233a = b10;
        fVar.d(b10);
    }
}
