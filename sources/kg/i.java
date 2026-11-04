package kg;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.ui.Cells.y8;
public final class i extends y8 {
    public long E;
    public int F;
    public int G;
    public final m H;
    public int f17040x;
    public float f17041y;

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
            int i3 = this.F;
            drawable2.setBounds(i3, this.G, bounds.width() + i3, bounds.height() + this.G);
        }
    }

    @Override
    public final void b() {
        m mVar = this.H;
        Drawable drawable = mVar.P;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int L = (int) (this.f17041y * org.telegram.messenger.g0.L(3.0f));
            int i3 = bounds.left;
            this.F = i3;
            int i10 = bounds.top;
            this.G = i10;
            mVar.P.setBounds(i3 + L, org.telegram.messenger.g0.L(1.0f) + i10, bounds.width() + this.F + L, bounds.height() + org.telegram.messenger.g0.L(1.0f) + this.G);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.E;
            if (j10 > 17) {
                j10 = 17;
            }
            this.E = elapsedRealtime;
            if (this.f17040x == 0) {
                float f10 = (((float) j10) / 664.0f) + this.f17041y;
                this.f17041y = f10;
                if (f10 >= 1.0f) {
                    this.f17040x = 1;
                    this.f17041y = 1.0f;
                }
            } else {
                float f11 = this.f17041y - (((float) j10) / 664.0f);
                this.f17041y = f11;
                if (f11 <= 0.0f) {
                    this.f17040x = 0;
                    this.f17041y = 0.0f;
                }
            }
            getTextView().invalidate();
        }
    }
}
