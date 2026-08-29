package l4;

import android.animation.ValueAnimator;
import bg.b3;
import i7.x7;
import java.net.URL;
import org.telegram.ui.Components.jr;
public final class y0 {
    public long f14471a;
    public int f14472b;
    public Object f14473c;

    public y0(int i10, URL url, long j10) {
        this.f14472b = i10;
        this.f14473c = url;
        this.f14471a = j10;
    }

    public void a(th.a aVar, sf.f1 f1Var) {
        long j10;
        boolean z10;
        int i10;
        int b10 = x7.b(aVar);
        if (aVar != null) {
            j10 = aVar.f48327a;
        } else {
            j10 = Long.MIN_VALUE;
        }
        if (j10 == this.f14471a && this.f14472b >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f14471a = j10;
        ValueAnimator valueAnimator = (ValueAnimator) this.f14473c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f14473c = null;
        }
        if (z10 && (i10 = this.f14472b) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
            ofInt.addUpdateListener(new b3(28, this, f1Var));
            ofInt.setInterpolator(jr.f29800f);
            ofInt.setDuration(200L);
            this.f14473c = ofInt;
            ofInt.start();
            return;
        }
        this.f14472b = b10;
        f1Var.d(b10);
    }
}
