package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class cdb extends r59 {
    public boolean f3;
    public boolean g3;
    public final fdb h3;

    public cdb(fdb fdbVar, Context context) {
        super(context, null);
        this.h3 = fdbVar;
    }

    @Override
    public final void m0(int i) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.f3 == canScrollHorizontally && this.g3 == canScrollHorizontally2) {
            return;
        }
        bdb bdbVar = this.h3.d;
        if (bdbVar != null) {
            bdbVar.invalidate();
        }
        this.f3 = canScrollHorizontally;
        this.g3 = canScrollHorizontally2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        fx2 previewDelegate;
        hx2 e = hx2.e();
        fdb fdbVar = this.h3;
        cdb cdbVar = fdbVar.e;
        previewDelegate = fdbVar.getPreviewDelegate();
        boolean g = e.g(motionEvent, cdbVar, previewDelegate, this.o2);
        if (!super.onInterceptTouchEvent(motionEvent) && !g) {
            return false;
        }
        return true;
    }
}
