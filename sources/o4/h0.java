package o4;

import android.animation.ValueAnimator;
import java.net.URL;
import k7.i8;
import org.telegram.ui.Components.nr;
public final class h0 {
    public long f16347a;
    public int f16348b;
    public Object f16349c;

    public h0(int i10, URL url, long j10) {
        this.f16348b = i10;
        this.f16349c = url;
        this.f16347a = j10;
    }

    public void a(vh.a aVar, rh.e eVar) {
        long j10;
        boolean z4;
        int i10;
        int b10 = i8.b(aVar);
        if (aVar != null) {
            j10 = aVar.f45774a;
        } else {
            j10 = Long.MIN_VALUE;
        }
        if (j10 == this.f16347a && this.f16348b >= 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f16347a = j10;
        ValueAnimator valueAnimator = (ValueAnimator) this.f16349c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f16349c = null;
        }
        if (z4 && (i10 = this.f16348b) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
            ofInt.addUpdateListener(new wh.d(1, this, eVar));
            ofInt.setInterpolator(nr.f27346f);
            ofInt.setDuration(200L);
            this.f16349c = ofInt;
            ofInt.start();
            return;
        }
        this.f16348b = b10;
        eVar.c(b10);
    }
}
