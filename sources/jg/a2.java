package jg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.us;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.tk0;
public final class a2 extends tk0 implements us {
    public final Path f9887e3;
    public q0.a f9888f3;

    public a2(Context context) {
        super(context, null);
        this.f9887e3 = new Path();
        setWillNotDraw(false);
        setLayoutManager(new s4.a0());
        setAdapter(new s4.g0());
        setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
        setClipToPadding(false);
    }

    @Override
    public final Integer V0(int i10) {
        return 285212671;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == zs.C5) {
            getAdapter().f();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        q0.a aVar = this.f9888f3;
        if (aVar != null) {
            Path path = this.f9887e3;
            aVar.accept(path);
            canvas.save();
            canvas.clipPath(path);
        }
        super.draw(canvas);
        if (this.f9888f3 != null) {
            canvas.restore();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zs.e().c(this, zs.C5);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        zs.e().n(this, zs.C5);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, z20.B(16.0f, org.telegram.messenger.i0.L(48.0f) * Math.min(ig.h0.c().size(), 6), 1073741824));
    }

    public void setMaskProvider(q0.a aVar) {
        this.f9888f3 = aVar;
        invalidate();
    }
}
