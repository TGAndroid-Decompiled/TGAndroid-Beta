package j5;

import ah.m0;
import android.animation.ValueAnimator;
import fi.f;
import java.net.URL;
import org.telegram.ui.Components.pr;
import v7.c9;
public final class b {
    public long f13538a;
    public int f13539b;
    public Object f13540c;

    public b(int i10, URL url, long j3) {
        this.f13539b = i10;
        this.f13540c = url;
        this.f13538a = j3;
    }

    public void a(ji.a aVar, f fVar) {
        long j3;
        boolean z10;
        int i10;
        int b10 = c9.b(aVar);
        if (aVar != null) {
            j3 = aVar.f13757a;
        } else {
            j3 = Long.MIN_VALUE;
        }
        if (j3 == this.f13538a && this.f13539b >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f13538a = j3;
        ValueAnimator valueAnimator = (ValueAnimator) this.f13540c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f13540c = null;
        }
        if (z10 && (i10 = this.f13539b) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
            ofInt.addUpdateListener(new m0(7, this, fVar));
            ofInt.setInterpolator(pr.f29493f);
            ofInt.setDuration(200L);
            this.f13540c = ofInt;
            ofInt.start();
            return;
        }
        this.f13539b = b10;
        fVar.c(b10);
    }
}
