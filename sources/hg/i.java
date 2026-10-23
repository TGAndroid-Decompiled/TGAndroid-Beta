package hg;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.e9;
public final class i extends e9 {
    public int E;
    public int F;
    public final m G;
    public int f11936w;
    public float f11937x;
    public long f11938y;

    public i(m mVar, Context context) {
        super(context);
        this.G = mVar;
    }

    @Override
    public final void a() {
        m mVar = this.G;
        Drawable drawable = mVar.O;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            Drawable drawable2 = mVar.O;
            int i10 = this.E;
            drawable2.setBounds(i10, this.F, bounds.width() + i10, bounds.height() + this.F);
        }
    }

    @Override
    public final void b() {
        m mVar = this.G;
        Drawable drawable = mVar.O;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int dp = (int) (this.f11937x * AndroidUtilities.dp(3.0f));
            int i10 = bounds.left;
            this.E = i10;
            int i11 = bounds.top;
            this.F = i11;
            mVar.O.setBounds(i10 + dp, AndroidUtilities.dp(1.0f) + i11, bounds.width() + this.E + dp, bounds.height() + AndroidUtilities.dp(1.0f) + this.F);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f11938y;
            if (j10 > 17) {
                j10 = 17;
            }
            this.f11938y = elapsedRealtime;
            if (this.f11936w == 0) {
                float f7 = (((float) j10) / 664.0f) + this.f11937x;
                this.f11937x = f7;
                if (f7 >= 1.0f) {
                    this.f11936w = 1;
                    this.f11937x = 1.0f;
                }
            } else {
                float f10 = this.f11937x - (((float) j10) / 664.0f);
                this.f11937x = f10;
                if (f10 <= 0.0f) {
                    this.f11936w = 0;
                    this.f11937x = 0.0f;
                }
            }
            getTextView().invalidate();
        }
    }
}
