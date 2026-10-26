package k5;

import a8.zd;
import android.animation.ValueAnimator;
import bh.b0;
import java.net.URL;
import jg.e1;
import org.telegram.ui.Components.ds;
public final class b {
    public long f16388a;
    public int f16389b;
    public Object f16390c;

    public b(int i10, URL url, long j10) {
        this.f16389b = i10;
        this.f16390c = url;
        this.f16388a = j10;
    }

    public void a(li.a aVar, e1 e1Var) {
        long j10;
        boolean z10;
        int i10;
        int b10 = zd.b(aVar);
        if (aVar != null) {
            j10 = aVar.f17053a;
        } else {
            j10 = Long.MIN_VALUE;
        }
        if (j10 == this.f16388a && this.f16389b >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f16388a = j10;
        ValueAnimator valueAnimator = (ValueAnimator) this.f16390c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f16390c = null;
        }
        if (z10 && (i10 = this.f16389b) != b10) {
            ValueAnimator ofInt = ValueAnimator.ofInt(i10, b10);
            ofInt.addUpdateListener(new b0(8, this, e1Var));
            ofInt.setInterpolator(ds.f27586f);
            ofInt.setDuration(200L);
            this.f16390c = ofInt;
            ofInt.start();
            return;
        }
        this.f16389b = b10;
        e1Var.i(b10);
    }
}
