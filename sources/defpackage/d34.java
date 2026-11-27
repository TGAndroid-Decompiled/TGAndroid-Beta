package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.e;
public final class d34 extends q9c {
    public final byte n3;

    public d34(Context context, int i, int i2, boolean z, icc iccVar, ncc nccVar, occ occVar, vnb vnbVar, int i3, int i4) {
        super(context, i, i2, z, iccVar, nccVar, occVar, vnbVar, i3, i4);
        this.n3 = (byte) 9;
    }

    @Override
    public final Integer X0(int i) {
        switch (this.n3) {
            case 0:
                b8c G = this.g3.G(i);
                if (G != null && G.d == 2) {
                    return 0;
                }
                return super.X0(i);
            case 1:
            default:
                return super.X0(i);
            case 2:
                return 0;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.n3) {
            case 1:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (hl.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                return;
            case 2:
            default:
                super.onMeasure(i, i2);
                return;
            case 3:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (hl.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                return;
            case 4:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (hl.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                return;
            case 5:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (hl.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                return;
            case 6:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (hl.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                return;
            case 7:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (hl.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                return;
            case 8:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (hl.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                return;
        }
    }

    @Override
    public final boolean v1(View view) {
        switch (this.n3) {
            case 9:
                if (view instanceof l2c) {
                    l2c l2cVar = (l2c) view;
                    if (l2cVar.G > 0.0f || l2cVar.J.q()) {
                        return false;
                    }
                }
                return true;
            default:
                return super.v1(view);
        }
    }

    public d34(Context context, int i, int i2, boolean z, icc iccVar, ncc nccVar, occ occVar, vnb vnbVar, byte b) {
        super(context, i, i2, z, iccVar, nccVar, occVar, vnbVar);
        this.n3 = b;
    }

    public d34(e eVar, icc iccVar, ncc nccVar, occ occVar, byte b) {
        super(eVar, iccVar, nccVar, occVar);
        this.n3 = b;
    }
}
