package hg;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.d9;
public final class i extends d9 {
    public int E;
    public final m F;
    public int v;
    public float f11909w;
    public long f11910x;
    public int f11911y;

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
            int i10 = this.f11911y;
            drawable2.setBounds(i10, this.E, bounds.width() + i10, bounds.height() + this.E);
        }
    }

    @Override
    public final void b() {
        m mVar = this.F;
        Drawable drawable = mVar.O;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int dp = (int) (this.f11909w * AndroidUtilities.dp(3.0f));
            int i10 = bounds.left;
            this.f11911y = i10;
            int i11 = bounds.top;
            this.E = i11;
            mVar.O.setBounds(i10 + dp, AndroidUtilities.dp(1.0f) + i11, bounds.width() + this.f11911y + dp, bounds.height() + AndroidUtilities.dp(1.0f) + this.E);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f11910x;
            if (j10 > 17) {
                j10 = 17;
            }
            this.f11910x = elapsedRealtime;
            if (this.v == 0) {
                float f7 = (((float) j10) / 664.0f) + this.f11909w;
                this.f11909w = f7;
                if (f7 >= 1.0f) {
                    this.v = 1;
                    this.f11909w = 1.0f;
                }
            } else {
                float f10 = this.f11909w - (((float) j10) / 664.0f);
                this.f11909w = f10;
                if (f10 <= 0.0f) {
                    this.v = 0;
                    this.f11909w = 0.0f;
                }
            }
            getTextView().invalidate();
        }
    }
}
