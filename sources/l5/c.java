package l5;

import android.animation.ValueAnimator;
import b8.ne;
import ci.uc;
import java.net.URL;
import org.telegram.ui.Components.xq;
public final class c {
    public long f18042a;
    public int f18043b;
    public Object f18044c;

    public c(int i3, URL url, long j10) {
        this.f18043b = i3;
        this.f18044c = url;
        this.f18042a = j10;
    }

    public void a(mi.a aVar, b bVar) {
        long j10;
        boolean z10;
        int i3;
        int b10 = ne.b(aVar);
        if (aVar != null) {
            j10 = aVar.f19430a;
        } else {
            j10 = Long.MIN_VALUE;
        }
        if (j10 == this.f18042a && this.f18043b >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f18042a = j10;
        ValueAnimator valueAnimator = (ValueAnimator) this.f18044c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f18044c = null;
        }
        if (z10 && (i3 = this.f18043b) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i3, b10);
            ofInt.addUpdateListener(new uc(8, this, bVar));
            ofInt.setInterpolator(xq.f40452f);
            ofInt.setDuration(200L);
            this.f18044c = ofInt;
            ofInt.start();
            return;
        }
        this.f18043b = b10;
        bVar.e(b10);
    }
}
