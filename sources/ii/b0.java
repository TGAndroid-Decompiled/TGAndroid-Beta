package ii;

import android.animation.ValueAnimator;
import java.net.URL;
import org.telegram.ui.Components.sr;
import v7.p8;
public final class b0 {
    public int f11234a;
    public long f11235b;
    public Object f11236c;

    public b0(int i10, URL url, long j3) {
        this.f11234a = i10;
        this.f11236c = url;
        this.f11235b = j3;
    }

    public void a(a aVar, ei.d5 d5Var) {
        long j3;
        boolean z10;
        int i10;
        int b10 = p8.b(aVar);
        if (aVar != null) {
            j3 = aVar.f11190a;
        } else {
            j3 = Long.MIN_VALUE;
        }
        if (j3 == this.f11235b && this.f11234a >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11235b = j3;
        ValueAnimator valueAnimator = (ValueAnimator) this.f11236c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f11236c = null;
        }
        if (z10 && (i10 = this.f11234a) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
            ofInt.addUpdateListener(new ai.x(6, this, d5Var));
            ofInt.setInterpolator(sr.f28339f);
            ofInt.setDuration(200L);
            this.f11236c = ofInt;
            ofInt.start();
            return;
        }
        this.f11234a = b10;
        d5Var.d(b10);
    }
}
