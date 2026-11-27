package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.PhotoViewer;
public final class afb extends View {
    public ImageReceiver a;
    public ImageReceiver b;
    public View c;
    public k88 d;
    public Path e;
    public Drawable f;

    @Override
    public final void draw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() - hl.L(30.0f);
        int L = hl.L(46.0f) + measuredWidth;
        ImageReceiver imageReceiver = this.a;
        imageReceiver.i0((measuredWidth - hl.L(46.0f)) - hl.L(30.0f), measuredHeight - hl.L(30.0f), hl.L(60.0f), hl.L(60.0f));
        this.b.i0(L - hl.L(30.0f), measuredHeight - hl.L(30.0f), hl.L(60.0f), hl.L(60.0f));
        Drawable drawable = this.f;
        drawable.setBounds(bp1.A(2, measuredWidth, drawable), bp1.y(2, measuredHeight, drawable), bp1.w(2, measuredWidth, drawable), bp1.i(2, measuredHeight, drawable));
        drawable.draw(canvas);
        Path path = this.e;
        path.reset();
        path.addCircle(L, measuredHeight, hl.L(30.0f), Path.Direction.CW);
        imageReceiver.h(canvas, null);
        if (this.c != null) {
            CropAreaView cropAreaView = this.d.b.a;
            float L2 = hl.L(60.0f) / cropAreaView.a;
            float left = (0.0f - this.d.getLeft()) - cropAreaView.b;
            canvas.save();
            canvas.clipPath(path);
            canvas.scale(L2, L2, 0.0f, 0.0f);
            canvas.translate(left, (0.0f - this.d.getTop()) - cropAreaView.c);
            canvas.translate((L - hl.L(30.0f)) / L2, (measuredHeight - hl.L(30.0f)) / L2);
            PhotoViewer.q0().g4 = true;
            this.c.draw(canvas);
            PhotoViewer.q0().g4 = false;
            canvas.restore();
        }
        super.draw(canvas);
        this.c.invalidate();
        invalidate();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.I();
        this.b.I();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.K();
        this.b.K();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        this.a.q0(hl.L(30.0f));
        this.b.q0(hl.L(30.0f));
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(86.0f), 1073741824));
    }
}
