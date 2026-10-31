package oh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.i0;
import org.telegram.ui.Components.u8;
public final class b extends u8 {
    public final int e;

    public b(int i10, Context context, boolean z10) {
        super(context, z10);
        this.e = i10;
    }

    @Override
    public void invalidate() {
        switch (this.e) {
            case 1:
                if (th.p.f49348c) {
                    th.p.f49347b.add(this);
                    return;
                } else {
                    super.invalidate();
                    return;
                }
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int e;
        switch (this.e) {
            case 0:
                int i12 = this.f30863a.f30489n;
                if (i12 == 0) {
                    e = 0;
                } else {
                    e = i0.a.e(i12, 1, 20, 24);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i0.L(e), 1073741824), i11);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void invalidate(int i10, int i11, int i12, int i13) {
        switch (this.e) {
            case 1:
                if (th.p.f49348c) {
                    th.p.f49347b.add(this);
                    return;
                } else {
                    super.invalidate(i10, i11, i12, i13);
                    return;
                }
            default:
                super.invalidate(i10, i11, i12, i13);
                return;
        }
    }
}
