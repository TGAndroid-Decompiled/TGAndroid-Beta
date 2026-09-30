package ii;

import android.animation.ValueAnimator;
import java.net.URL;
import org.telegram.ui.Components.tr;
import v7.p8;
public final class b0 {
    public int f11248a;
    public long f11249b;
    public Object f11250c;

    public b0(int i10, URL url, long j3) {
        this.f11248a = i10;
        this.f11250c = url;
        this.f11249b = j3;
    }

    public void a(a aVar, ei.d5 d5Var) {
        long j3;
        boolean z10;
        int i10;
        int b10 = p8.b(aVar);
        if (aVar != null) {
            j3 = aVar.f11204a;
        } else {
            j3 = Long.MIN_VALUE;
        }
        if (j3 == this.f11249b && this.f11248a >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11249b = j3;
        ValueAnimator valueAnimator = (ValueAnimator) this.f11250c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f11250c = null;
        }
        if (z10 && (i10 = this.f11248a) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
            ofInt.addUpdateListener(new ai.x(6, this, d5Var));
            ofInt.setInterpolator(tr.f28636f);
            ofInt.setDuration(200L);
            this.f11250c = ofInt;
            ofInt.start();
            return;
        }
        this.f11248a = b10;
        d5Var.d(b10);
    }
}
