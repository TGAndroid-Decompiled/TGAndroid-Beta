package k5;

import a8.zd;
import android.animation.ValueAnimator;
import bh.b0;
import java.net.URL;
import jg.e1;
import org.telegram.ui.Components.ds;
public final class b {
    public long f16387a;
    public int f16388b;
    public Object f16389c;

    public b(int i10, URL url, long j10) {
        this.f16388b = i10;
        this.f16389c = url;
        this.f16387a = j10;
    }

    public void a(li.a aVar, e1 e1Var) {
        long j10;
        boolean z10;
        int i10;
        int b10 = zd.b(aVar);
        if (aVar != null) {
            j10 = aVar.f17052a;
        } else {
            j10 = Long.MIN_VALUE;
        }
        if (j10 == this.f16387a && this.f16388b >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f16387a = j10;
        ValueAnimator valueAnimator = (ValueAnimator) this.f16389c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f16389c = null;
        }
        if (z10 && (i10 = this.f16388b) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
            ofInt.addUpdateListener(new b0(8, this, e1Var));
            ofInt.setInterpolator(ds.f27530f);
            ofInt.setDuration(200L);
            this.f16389c = ofInt;
            ofInt.start();
            return;
        }
        this.f16388b = b10;
        e1Var.i(b10);
    }
}
