package m5;

import android.animation.ValueAnimator;
import c8.ca;
import ch.v;
import java.net.URL;
import ki.e;
import org.telegram.ui.Components.er;
public final class b {
    public long f20470a;
    public int f20471b;
    public Object f20472c;

    public b(int i7, URL url, long j3) {
        this.f20471b = i7;
        this.f20472c = url;
        this.f20470a = j3;
    }

    public void a(oi.a aVar, e eVar) {
        long j3;
        boolean z10;
        int i7;
        int b10 = ca.b(aVar);
        if (aVar != null) {
            j3 = aVar.f21543a;
        } else {
            j3 = Long.MIN_VALUE;
        }
        if (j3 == this.f20470a && this.f20471b >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f20470a = j3;
        ValueAnimator valueAnimator = (ValueAnimator) this.f20472c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f20472c = null;
        }
        if (z10 && (i7 = this.f20471b) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i7, b10);
            ofInt.addUpdateListener(new v(8, this, eVar));
            ofInt.setInterpolator(er.f34419f);
            ofInt.setDuration(200L);
            this.f20472c = ofInt;
            ofInt.start();
            return;
        }
        this.f20471b = b10;
        eVar.d(b10);
    }
}
