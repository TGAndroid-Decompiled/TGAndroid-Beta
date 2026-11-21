package jg;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.ui.Cells.a9;
public final class i extends a9 {
    public long E;
    public int F;
    public int G;
    public final m H;
    public int f17559x;
    public float f17560y;

    public i(m mVar, Context context) {
        super(context);
        this.H = mVar;
    }

    @Override
    public final void a() {
        m mVar = this.H;
        Drawable drawable = mVar.P;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            Drawable drawable2 = mVar.P;
            int i7 = this.F;
            drawable2.setBounds(i7, this.G, bounds.width() + i7, bounds.height() + this.G);
        }
    }

    @Override
    public final void b() {
        m mVar = this.H;
        Drawable drawable = mVar.P;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int L = (int) (this.f17560y * org.telegram.messenger.g0.L(3.0f));
            int i7 = bounds.left;
            this.F = i7;
            int i10 = bounds.top;
            this.G = i10;
            mVar.P.setBounds(i7 + L, org.telegram.messenger.g0.L(1.0f) + i10, bounds.width() + this.F + L, bounds.height() + org.telegram.messenger.g0.L(1.0f) + this.G);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.E;
            if (j3 > 17) {
                j3 = 17;
            }
            this.E = elapsedRealtime;
            if (this.f17559x == 0) {
                float f10 = (((float) j3) / 664.0f) + this.f17560y;
                this.f17560y = f10;
                if (f10 >= 1.0f) {
                    this.f17559x = 1;
                    this.f17560y = 1.0f;
                }
            } else {
                float f11 = this.f17560y - (((float) j3) / 664.0f);
                this.f17560y = f11;
                if (f11 <= 0.0f) {
                    this.f17559x = 0;
                    this.f17560y = 0.0f;
                }
            }
            getTextView().invalidate();
        }
    }
}
