package gg;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.e9;
public final class i extends e9 {
    public int E;
    public final m F;
    public int v;
    public float f9758w;
    public long f9759x;
    public int f9760y;

    public i(m mVar, Context context) {
        super(context);
        this.F = mVar;
    }

    @Override
    public final void a() {
        m mVar = this.F;
        Drawable drawable = mVar.O;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            Drawable drawable2 = mVar.O;
            int i10 = this.f9760y;
            drawable2.setBounds(i10, this.E, bounds.width() + i10, bounds.height() + this.E);
        }
    }

    @Override
    public final void b() {
        m mVar = this.F;
        Drawable drawable = mVar.O;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int dp = (int) (this.f9758w * AndroidUtilities.dp(3.0f));
            int i10 = bounds.left;
            this.f9760y = i10;
            int i11 = bounds.top;
            this.E = i11;
            mVar.O.setBounds(i10 + dp, AndroidUtilities.dp(1.0f) + i11, bounds.width() + this.f9760y + dp, bounds.height() + AndroidUtilities.dp(1.0f) + this.E);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.f9759x;
            if (j3 > 17) {
                j3 = 17;
            }
            this.f9759x = elapsedRealtime;
            if (this.v == 0) {
                float f7 = (((float) j3) / 664.0f) + this.f9758w;
                this.f9758w = f7;
                if (f7 >= 1.0f) {
                    this.v = 1;
                    this.f9758w = 1.0f;
                }
            } else {
                float f10 = this.f9758w - (((float) j3) / 664.0f);
                this.f9758w = f10;
                if (f10 <= 0.0f) {
                    this.v = 0;
                    this.f9758w = 0.0f;
                }
            }
            getTextView().invalidate();
        }
    }
}
