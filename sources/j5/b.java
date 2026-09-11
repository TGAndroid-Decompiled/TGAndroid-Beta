package j5;

import ah.m0;
import android.animation.ValueAnimator;
import fi.f;
import java.net.URL;
import org.telegram.ui.Components.pr;
import v7.c9;
public final class b {
    public long f13512a;
    public int f13513b;
    public Object f13514c;

    public b(int i10, URL url, long j3) {
        this.f13513b = i10;
        this.f13514c = url;
        this.f13512a = j3;
    }

    public void a(ji.a aVar, f fVar) {
        long j3;
        boolean z10;
        int i10;
        int b10 = c9.b(aVar);
        if (aVar != null) {
            j3 = aVar.f13731a;
        } else {
            j3 = Long.MIN_VALUE;
        }
        if (j3 == this.f13512a && this.f13513b >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f13512a = j3;
        ValueAnimator valueAnimator = (ValueAnimator) this.f13514c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f13514c = null;
        }
        if (z10 && (i10 = this.f13513b) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
            ofInt.addUpdateListener(new m0(7, this, fVar));
            ofInt.setInterpolator(pr.f29466f);
            ofInt.setDuration(200L);
            this.f13514c = ofInt;
            ofInt.start();
            return;
        }
        this.f13513b = b10;
        fVar.c(b10);
    }
}
