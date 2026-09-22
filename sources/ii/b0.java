package ii;

import android.animation.ValueAnimator;
import java.net.URL;
import org.telegram.ui.Components.qr;
import v7.o8;
public final class b0 {
    public int f11247a;
    public long f11248b;
    public Object f11249c;

    public b0(int i10, URL url, long j3) {
        this.f11247a = i10;
        this.f11249c = url;
        this.f11248b = j3;
    }

    public void a(a aVar, ei.d5 d5Var) {
        long j3;
        boolean z10;
        int i10;
        int b10 = o8.b(aVar);
        if (aVar != null) {
            j3 = aVar.f11202a;
        } else {
            j3 = Long.MIN_VALUE;
        }
        if (j3 == this.f11248b && this.f11247a >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11248b = j3;
        ValueAnimator valueAnimator = (ValueAnimator) this.f11249c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f11249c = null;
        }
        if (z10 && (i10 = this.f11247a) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
            ofInt.addUpdateListener(new ai.x(6, this, d5Var));
            ofInt.setInterpolator(qr.f27420f);
            ofInt.setDuration(200L);
            this.f11249c = ofInt;
            ofInt.start();
            return;
        }
        this.f11247a = b10;
        d5Var.d(b10);
    }
}
