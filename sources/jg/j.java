package jg;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import org.telegram.ui.Cells.z8;
public final class j extends z8 {
    public long D;
    public int E;
    public int F;
    public final n G;
    public int f16805x;
    public float f16806y;

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
            int i7 = this.E;
            drawable2.setBounds(i7, this.F, bounds.width() + i7, bounds.height() + this.F);
        }
    }

    @Override
    public final void b() {
        n nVar = this.G;
        Drawable drawable = nVar.O;
        if (drawable != null) {
            Rect bounds = drawable.getBounds();
            int L = (int) (this.f16806y * org.telegram.messenger.g0.L(3.0f));
            int i7 = bounds.left;
            this.E = i7;
            int i10 = bounds.top;
            this.F = i10;
            nVar.O.setBounds(i7 + L, org.telegram.messenger.g0.L(1.0f) + i10, bounds.width() + this.E + L, bounds.height() + org.telegram.messenger.g0.L(1.0f) + this.F);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j3 = elapsedRealtime - this.D;
            if (j3 > 17) {
                j3 = 17;
            }
            this.D = elapsedRealtime;
            if (this.f16805x == 0) {
                float f10 = (((float) j3) / 664.0f) + this.f16806y;
                this.f16806y = f10;
                if (f10 >= 1.0f) {
                    this.f16805x = 1;
                    this.f16806y = 1.0f;
                }
            } else {
                float f11 = this.f16806y - (((float) j3) / 664.0f);
                this.f16806y = f11;
                if (f11 <= 0.0f) {
                    this.f16805x = 0;
                    this.f16806y = 0.0f;
                }
            }
            getTextView().invalidate();
        }
    }
}
