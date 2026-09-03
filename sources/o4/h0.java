package o4;

import android.animation.ValueAnimator;
import java.net.URL;
import k7.i8;
import org.telegram.ui.Components.mr;
import ph.z8;
public final class h0 {
    public long f16329a;
    public int f16330b;
    public Object f16331c;

    public h0(int i10, URL url, long j10) {
        this.f16330b = i10;
        this.f16331c = url;
        this.f16329a = j10;
    }

    public void a(vh.a aVar, z8 z8Var) {
        long j10;
        boolean z4;
        int i10;
        int b10 = i8.b(aVar);
        if (aVar != null) {
            j10 = aVar.f45852a;
        } else {
            j10 = Long.MIN_VALUE;
        }
        if (j10 == this.f16329a && this.f16330b >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f16329a = j10;
        ValueAnimator valueAnimator = (ValueAnimator) this.f16331c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f16331c = null;
        }
        if (z4 && (i10 = this.f16330b) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
            ofInt.addUpdateListener(new wh.d(1, this, z8Var));
            ofInt.setInterpolator(mr.f27122f);
            ofInt.setDuration(200L);
            this.f16331c = ofInt;
            ofInt.start();
            return;
        }
        this.f16330b = b10;
        z8Var.c(b10);
    }
}
