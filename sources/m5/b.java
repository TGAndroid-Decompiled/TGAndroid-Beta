package m5;

import android.animation.ValueAnimator;
import c8.fa;
import ch.w;
import java.net.URL;
import kg.y1;
import org.telegram.ui.Components.nr;
public final class b {
    public long f20828a;
    public int f20829b;
    public Object f20830c;

    public b(int i7, URL url, long j3) {
        this.f20829b = i7;
        this.f20830c = url;
        this.f20828a = j3;
    }

    public void a(oi.a aVar, y1 y1Var) {
        long j3;
        boolean z10;
        int i7;
        int b10 = fa.b(aVar);
        if (aVar != null) {
            j3 = aVar.f21900a;
        } else {
            j3 = Long.MIN_VALUE;
        }
        if (j3 == this.f20828a && this.f20829b >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f20828a = j3;
        ValueAnimator valueAnimator = (ValueAnimator) this.f20830c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f20830c = null;
        }
        if (z10 && (i7 = this.f20829b) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i7, b10);
            ofInt.addUpdateListener(new w(8, this, y1Var));
            ofInt.setInterpolator(nr.f37917f);
            ofInt.setDuration(200L);
            this.f20830c = ofInt;
            ofInt.start();
            return;
        }
        this.f20829b = b10;
        y1Var.c(b10);
    }
}
