package of;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.b9;
public final class i extends b9 {
    public int A;
    public final m B;
    public int v;
    public float f19363w;
    public long f19364x;
    public int f19365y;

    public i(m mVar, Context context) {
        super(context);
        this.B = mVar;
    }

    @Override
    public final void a() {
        m mVar = this.B;
        Drawable drawable = mVar.K;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            Drawable drawable2 = mVar.K;
            int i9 = this.f19365y;
            drawable2.setBounds(i9, this.A, bounds.width() + i9, bounds.height() + this.A);
        }
    }

    @Override
    public final void b() {
        m mVar = this.B;
        Drawable drawable = mVar.K;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int dp = (int) (this.f19363w * AndroidUtilities.dp(3.0f));
            int i9 = bounds.left;
            this.f19365y = i9;
            int i10 = bounds.top;
            this.A = i10;
            mVar.K.setBounds(i9 + dp, AndroidUtilities.dp(1.0f) + i10, bounds.width() + this.f19365y + dp, bounds.height() + AndroidUtilities.dp(1.0f) + this.A);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = elapsedRealtime - this.f19364x;
            if (j10 > 17) {
                j10 = 17;
            }
            this.f19364x = elapsedRealtime;
            if (this.v == 0) {
                float f10 = (((float) j10) / 664.0f) + this.f19363w;
                this.f19363w = f10;
                if (f10 >= 1.0f) {
                    this.v = 1;
                    this.f19363w = 1.0f;
                }
            } else {
                float f11 = this.f19363w - (((float) j10) / 664.0f);
                this.f19363w = f11;
                if (f11 <= 0.0f) {
                    this.v = 0;
                    this.f19363w = 0.0f;
                }
            }
            getTextView().invalidate();
        }
    }
}
