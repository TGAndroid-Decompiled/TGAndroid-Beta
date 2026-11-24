package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class abb extends o39 {
    public boolean f3;
    public boolean g3;
    public final dbb h3;

    public abb(dbb dbbVar, Context context) {
        super(context, null);
        this.h3 = dbbVar;
    }

    @Override
    public final void m0(int i) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.f3 == canScrollHorizontally && this.g3 == canScrollHorizontally2) {
            return;
        }
        zab zabVar = this.h3.d;
        if (zabVar != null) {
            zabVar.invalidate();
        }
        this.f3 = canScrollHorizontally;
        this.g3 = canScrollHorizontally2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        vv2 previewDelegate;
        xv2 e = xv2.e();
        dbb dbbVar = this.h3;
        abb abbVar = dbbVar.e;
        previewDelegate = dbbVar.getPreviewDelegate();
        boolean g = e.g(motionEvent, abbVar, previewDelegate, this.o2);
        if (!super.onInterceptTouchEvent(motionEvent) && !g) {
            return false;
        }
        return true;
    }
}
