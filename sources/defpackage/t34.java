package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d;
public final class t34 extends q7c {
    public final byte n3;

    public t34(Context context, int i, int i2, boolean z, jac jacVar, oac oacVar, pac pacVar, ylb ylbVar, int i3, int i4) {
        super(context, i, i2, z, jacVar, oacVar, pacVar, ylbVar, i3, i4);
        this.n3 = (byte) 8;
    }

    @Override
    public final Integer W0(int i) {
        switch (this.n3) {
            case 0:
                c6c G = this.g3.G(i);
                if (G != null && G.d == 2) {
                    return 0;
                }
                return super.W0(i);
            case 1:
                return 0;
            default:
                return super.W0(i);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.n3) {
            case 2:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (gm.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                return;
            case 3:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (gm.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                return;
            case 4:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (gm.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                return;
            case 5:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (gm.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                return;
            case 6:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (gm.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                return;
            case 7:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (gm.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final boolean u1(View view) {
        switch (this.n3) {
            case 8:
                if (view instanceof m0c) {
                    m0c m0cVar = (m0c) view;
                    if (m0cVar.G > 0.0f || m0cVar.J.q()) {
                        return false;
                    }
                }
                return true;
            default:
                return super.u1(view);
        }
    }

    public t34(Context context, int i, int i2, boolean z, jac jacVar, oac oacVar, pac pacVar, ylb ylbVar, byte b) {
        super(context, i, i2, z, jacVar, oacVar, pacVar, ylbVar);
        this.n3 = b;
    }

    public t34(d dVar, jac jacVar, oac oacVar, pac pacVar, byte b) {
        super(dVar, jacVar, oacVar, pacVar);
        this.n3 = b;
    }
}
