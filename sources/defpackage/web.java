package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class web extends d79 {
    public boolean f3;
    public boolean g3;
    public final zeb h3;

    public web(zeb zebVar, Context context) {
        super(context, null);
        this.h3 = zebVar;
    }

    @Override
    public final void n0(int i) {
        boolean canScrollHorizontally = canScrollHorizontally(-1);
        boolean canScrollHorizontally2 = canScrollHorizontally(1);
        if (this.f3 == canScrollHorizontally && this.g3 == canScrollHorizontally2) {
            return;
        }
        h8b h8bVar = this.h3.d;
        if (h8bVar != null) {
            h8bVar.invalidate();
        }
        this.f3 = canScrollHorizontally;
        this.g3 = canScrollHorizontally2;
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        pw2 previewDelegate;
        rw2 e = rw2.e();
        zeb zebVar = this.h3;
        web webVar = zebVar.e;
        previewDelegate = zebVar.getPreviewDelegate();
        boolean g = e.g(motionEvent, webVar, previewDelegate, this.o2);
        if (!super.onInterceptTouchEvent(motionEvent) && !g) {
            return false;
        }
        return true;
    }
}
