package ii;

import android.animation.ValueAnimator;
import java.net.URL;
import org.telegram.ui.Components.js;
import v7.n8;
public final class b0 {
    public int f12278a;
    public long f12279b;
    public Object f12280c;

    public b0(int i10, URL url, long j3) {
        this.f12278a = i10;
        this.f12280c = url;
        this.f12279b = j3;
    }

    public void a(a aVar, ei.c5 c5Var) {
        long j3;
        boolean z10;
        int i10;
        int b10 = n8.b(aVar);
        if (aVar != null) {
            j3 = aVar.f12231a;
        } else {
            j3 = Long.MIN_VALUE;
        }
        if (j3 == this.f12279b && this.f12278a >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f12279b = j3;
        ValueAnimator valueAnimator = (ValueAnimator) this.f12280c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f12280c = null;
        }
        if (z10 && (i10 = this.f12278a) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
            ofInt.addUpdateListener(new ai.x(6, this, c5Var));
            ofInt.setInterpolator(js.f27627f);
            ofInt.setDuration(200L);
            this.f12280c = ofInt;
            ofInt.start();
            return;
        }
        this.f12278a = b10;
        c5Var.d(b10);
    }
}
