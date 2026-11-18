package m5;

import android.animation.ValueAnimator;
import c8.ea;
import ch.w;
import java.net.URL;
import ki.e;
import org.telegram.ui.Components.lr;
public final class b {
    public long f20831a;
    public int f20832b;
    public Object f20833c;

    public b(int i7, URL url, long j3) {
        this.f20832b = i7;
        this.f20833c = url;
        this.f20831a = j3;
    }

    public void a(oi.a aVar, e eVar) {
        long j3;
        boolean z10;
        int i7;
        int b10 = ea.b(aVar);
        if (aVar != null) {
            j3 = aVar.f21906a;
        } else {
            j3 = Long.MIN_VALUE;
        }
        if (j3 == this.f20831a && this.f20832b >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f20831a = j3;
        ValueAnimator valueAnimator = (ValueAnimator) this.f20833c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f20833c = null;
        }
        if (z10 && (i7 = this.f20832b) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i7, b10);
            ofInt.addUpdateListener(new w(8, this, eVar));
            ofInt.setInterpolator(lr.f37208f);
            ofInt.setDuration(200L);
            this.f20833c = ofInt;
            ofInt.start();
            return;
        }
        this.f20832b = b10;
        eVar.c(b10);
    }
}
