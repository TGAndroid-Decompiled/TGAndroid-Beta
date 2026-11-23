package m5;

import android.animation.ValueAnimator;
import c8.fa;
import ch.w;
import java.net.URL;
import kg.f1;
import org.telegram.ui.Components.kr;
public final class b {
    public long f20924a;
    public int f20925b;
    public Object f20926c;

    public b(int i7, URL url, long j3) {
        this.f20925b = i7;
        this.f20926c = url;
        this.f20924a = j3;
    }

    public void a(oi.a aVar, f1 f1Var) {
        long j3;
        boolean z10;
        int i7;
        int b10 = fa.b(aVar);
        if (aVar != null) {
            j3 = aVar.f22000a;
        } else {
            j3 = Long.MIN_VALUE;
        }
        if (j3 == this.f20924a && this.f20925b >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f20924a = j3;
        ValueAnimator valueAnimator = (ValueAnimator) this.f20926c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f20926c = null;
        }
        if (z10 && (i7 = this.f20925b) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i7, b10);
            ofInt.addUpdateListener(new w(8, this, f1Var));
            ofInt.setInterpolator(kr.f36858f);
            ofInt.setDuration(200L);
            this.f20926c = ofInt;
            ofInt.start();
            return;
        }
        this.f20925b = b10;
        f1Var.c(b10);
    }
}
