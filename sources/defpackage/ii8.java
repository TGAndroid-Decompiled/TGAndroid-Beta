package defpackage;

import android.content.Context;
import android.graphics.Canvas;
public final class ii8 extends wb2 {
    public final byte Ld;
    public final int Md;
    public final int Nd;

    public ii8(Context context, int i, vnb vnbVar, int i2, int i3, byte b) {
        super(context, i, false, null, vnbVar);
        this.Ld = b;
        this.Md = i2;
        this.Nd = i3;
    }

    @Override
    public final void j1(Canvas canvas) {
        switch (this.Ld) {
            case 0:
                this.S4 = 0;
                this.T4 = this.Q4.size() - 1;
                super.j1(canvas);
                return;
            default:
                this.S4 = 0;
                this.T4 = this.Q4.size() - 1;
                super.j1(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.Ld) {
            case 0:
                setMeasuredDimension(this.Md, this.Nd);
                return;
            default:
                setMeasuredDimension(this.Md, this.Nd);
                return;
        }
    }

    @Override
    public final void setPressed(boolean z) {
        byte b = this.Ld;
    }

    private final void h4(boolean z) {
    }

    private final void i4(boolean z) {
    }
}
