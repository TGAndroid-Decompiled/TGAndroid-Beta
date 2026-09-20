package ii;

import android.animation.ValueAnimator;
import java.net.URL;
import org.telegram.ui.Components.qr;
import v7.p8;
public final class b0 {
    public int f11249a;
    public long f11250b;
    public Object f11251c;

    public b0(int i10, URL url, long j3) {
        this.f11249a = i10;
        this.f11251c = url;
        this.f11250b = j3;
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
        if (j3 == this.f11250b && this.f11249a >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f11250b = j3;
        ValueAnimator valueAnimator = (ValueAnimator) this.f11251c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f11251c = null;
        }
        if (z10 && (i10 = this.f11249a) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
            ofInt.addUpdateListener(new ai.x(6, this, d5Var));
            ofInt.setInterpolator(qr.f27642f);
            ofInt.setDuration(200L);
            this.f11251c = ofInt;
            ofInt.start();
            return;
        }
        this.f11249a = b10;
        d5Var.d(b10);
    }
}
