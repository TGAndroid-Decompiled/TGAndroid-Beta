package m5;

import android.animation.ValueAnimator;
import c8.ea;
import ch.w;
import java.net.URL;
import kg.x1;
import org.telegram.ui.Components.nr;
public final class b {
    public long f20859a;
    public int f20860b;
    public Object f20861c;

    public b(int i7, URL url, long j3) {
        this.f20860b = i7;
        this.f20861c = url;
        this.f20859a = j3;
    }

    public void a(oi.a aVar, x1 x1Var) {
        long j3;
        boolean z10;
        int i7;
        int b10 = ea.b(aVar);
        if (aVar != null) {
            j3 = aVar.f21931a;
        } else {
            j3 = Long.MIN_VALUE;
        }
        if (j3 == this.f20859a && this.f20860b >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f20859a = j3;
        ValueAnimator valueAnimator = (ValueAnimator) this.f20861c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f20861c = null;
        }
        if (z10 && (i7 = this.f20860b) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i7, b10);
            ofInt.addUpdateListener(new w(8, this, x1Var));
            ofInt.setInterpolator(nr.f37956f);
            ofInt.setDuration(200L);
            this.f20861c = ofInt;
            ofInt.start();
            return;
        }
        this.f20860b = b10;
        x1Var.c(b10);
    }
}
