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
    public float f10652w;
    public long f10653x;
    public int f10654y;

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
            int i10 = this.f10654y;
            drawable2.setBounds(i10, this.E, bounds.width() + i10, bounds.height() + this.E);
        }
    }

    @Override
    public final void b() {
        m mVar = this.F;
        Drawable drawable = mVar.O;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int dp = (int) (this.f10652w * AndroidUtilities.dp(3.0f));
            int i10 = bounds.left;
            this.f10654y = i10;
            int i11 = bounds.top;
            this.E = i11;
            mVar.O.setBounds(i10 + dp, AndroidUtilities.dp(1.0f) + i11, bounds.width() + this.f10654y + dp, bounds.height() + AndroidUtilities.dp(1.0f) + this.E);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.f10653x;
            if (j3 > 17) {
                j3 = 17;
            }
            this.f10653x = elapsedRealtime;
            if (this.v == 0) {
                float f7 = (((float) j3) / 664.0f) + this.f10652w;
                this.f10652w = f7;
                if (f7 >= 1.0f) {
                    this.v = 1;
                    this.f10652w = 1.0f;
                }
            } else {
                float f10 = this.f10652w - (((float) j3) / 664.0f);
                this.f10652w = f10;
                if (f10 <= 0.0f) {
                    this.v = 0;
                    this.f10652w = 0.0f;
                }
            }
            getTextView().invalidate();
        }
    }
}
