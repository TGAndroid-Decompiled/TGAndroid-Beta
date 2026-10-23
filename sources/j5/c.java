package j5;

import ah.l0;
import android.animation.ValueAnimator;
import java.net.URL;
import org.telegram.ui.Components.bs;
import w7.i;
public final class c {
    public long f14301a;
    public int f14302b;
    public Object f14303c;

    public c(int i10, URL url, long j10) {
        this.f14302b = i10;
        this.f14303c = url;
        this.f14301a = j10;
    }

    public void a(ki.a aVar, b bVar) {
        long j10;
        boolean z10;
        int i10;
        int b10 = i.b(aVar);
        if (aVar != null) {
            j10 = aVar.f15140a;
        } else {
            j10 = Long.MIN_VALUE;
        }
        if (j10 == this.f14301a && this.f14302b >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f14301a = j10;
        ValueAnimator valueAnimator = (ValueAnimator) this.f14303c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f14303c = null;
        }
        if (z10 && (i10 = this.f14302b) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
            ofInt.addUpdateListener(new l0(8, this, bVar));
            ofInt.setInterpolator(bs.f25133f);
            ofInt.setDuration(200L);
            this.f14303c = ofInt;
            ofInt.start();
            return;
        }
        this.f14302b = b10;
        bVar.j(b10);
    }
}
