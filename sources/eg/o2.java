package eg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.sl0;
public final class o2 extends sl0 implements NotificationCenter.NotificationCenterDelegate {
    public final Path U2;
    public q0.a V2;

    public o2(Context context) {
        super(context, null);
        this.U2 = new Path();
        setWillNotDraw(false);
        setLayoutManager(new f2.j0());
        setAdapter(new f2.p0());
        setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
        setClipToPadding(false);
    }

    @Override
    public final Integer V0(int i10) {
        return 285212671;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.customTypefacesLoaded) {
            getAdapter().l();
        }
    }

    @Override
    public final void draw(Canvas canvas) {
        q0.a aVar = this.V2;
        if (aVar != null) {
            Path path = this.U2;
            aVar.accept(path);
            canvas.save();
            canvas.clipPath(path);
        }
        super.draw(canvas);
        if (this.V2 != null) {
            canvas.restore();
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.customTypefacesLoaded);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, org.telegram.ui.b.B(16.0f, AndroidUtilities.dp(48.0f) * Math.min(dg.s0.c().size(), 6), 1073741824));
    }

    public void setMaskProvider(q0.a aVar) {
        this.V2 = aVar;
        invalidate();
    }
}
