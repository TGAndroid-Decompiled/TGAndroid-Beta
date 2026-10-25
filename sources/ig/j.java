package ig;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.i9;
public final class j extends i9 {
    public int E;
    public int F;
    public final n G;
    public int f14107w;
    public float f14108x;
    public long f14109y;

    public j(n nVar, Context context) {
        super(context);
        this.G = nVar;
    }

    @Override
    public final void a() {
        n nVar = this.G;
        Drawable drawable = nVar.O;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            Drawable drawable2 = nVar.O;
            int i10 = this.E;
            drawable2.setBounds(i10, this.F, bounds.width() + i10, bounds.height() + this.F);
        }
    }

    @Override
    public final void b() {
        n nVar = this.G;
        Drawable drawable = nVar.O;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int dp = (int) (this.f14108x * AndroidUtilities.dp(3.0f));
            int i10 = bounds.left;
            this.E = i10;
            int i11 = bounds.top;
            this.F = i11;
            nVar.O.setBounds(i10 + dp, AndroidUtilities.dp(1.0f) + i11, bounds.width() + this.E + dp, bounds.height() + AndroidUtilities.dp(1.0f) + this.F);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f14109y;
            if (j10 > 17) {
                j10 = 17;
            }
            this.f14109y = elapsedRealtime;
            if (this.f14107w == 0) {
                float f7 = (((float) j10) / 664.0f) + this.f14108x;
                this.f14108x = f7;
                if (f7 >= 1.0f) {
                    this.f14107w = 1;
                    this.f14108x = 1.0f;
                }
            } else {
                float f10 = this.f14108x - (((float) j10) / 664.0f);
                this.f14108x = f10;
                if (f10 <= 0.0f) {
                    this.f14107w = 0;
                    this.f14108x = 0.0f;
                }
            }
            getTextView().invalidate();
        }
    }
}
