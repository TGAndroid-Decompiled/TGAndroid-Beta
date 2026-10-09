package ii;

import android.animation.ValueAnimator;
import java.net.URL;
import org.telegram.ui.Components.hs;
import v7.n8;
public final class b0 {
    public int f12281a;
    public long f12282b;
    public Object f12283c;

    public b0(int i10, URL url, long j3) {
        this.f12281a = i10;
        this.f12283c = url;
        this.f12282b = j3;
    }

    public void a(a aVar, ei.c5 c5Var) {
        long j3;
        boolean z10;
        int i10;
        int b10 = n8.b(aVar);
        if (aVar != null) {
            j3 = aVar.f12233a;
        } else {
            j3 = Long.MIN_VALUE;
        }
        if (j3 == this.f12282b && this.f12281a >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12282b = j3;
        ValueAnimator valueAnimator = (ValueAnimator) this.f12283c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f12283c = null;
        }
        if (z10 && (i10 = this.f12281a) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
            ofInt.addUpdateListener(new ai.x(6, this, c5Var));
            ofInt.setInterpolator(hs.f27118f);
            ofInt.setDuration(200L);
            this.f12283c = ofInt;
            ofInt.start();
            return;
        }
        this.f12281a = b10;
        c5Var.e(b10);
    }
}
