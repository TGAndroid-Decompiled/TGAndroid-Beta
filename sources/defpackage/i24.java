package defpackage;

import android.content.Context;
import android.view.View;
import org.telegram.ui.ActionBar.d;
public final class i24 extends q5c {
    public final byte n3;

    public i24(Context context, int i, int i2, boolean z, i8c i8cVar, n8c n8cVar, o8c o8cVar, wjb wjbVar, int i3, int i4) {
        super(context, i, i2, z, i8cVar, n8cVar, o8cVar, wjbVar, i3, i4);
        this.n3 = (byte) 8;
    }

    @Override
    public final Integer W0(int i) {
        switch (this.n3) {
            case 0:
                c4c G = this.g3.G(i);
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
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (gl.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                return;
            case 3:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (gl.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                return;
            case 4:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (gl.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                return;
            case 5:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (gl.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                return;
            case 6:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (gl.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                return;
            case 7:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (gl.q.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
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
                if (view instanceof lyb) {
                    lyb lybVar = (lyb) view;
                    if (lybVar.G > 0.0f || lybVar.J.q()) {
                        return false;
                    }
                }
                return true;
            default:
                return super.u1(view);
        }
    }

    public i24(Context context, int i, int i2, boolean z, i8c i8cVar, n8c n8cVar, o8c o8cVar, wjb wjbVar, byte b) {
        super(context, i, i2, z, i8cVar, n8cVar, o8cVar, wjbVar);
        this.n3 = b;
    }

    public i24(d dVar, i8c i8cVar, n8c n8cVar, o8c o8cVar, byte b) {
        super(dVar, i8cVar, n8cVar, o8cVar);
        this.n3 = b;
    }
}
