package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.camera.CameraView;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.d;
public final class aa1 extends ViewGroup {
    public final byte a = 0;
    public final Object b;
    public final d c;

    public aa1(da1 da1Var, Context context) {
        super(context);
        this.c = da1Var;
        this.b = new Path();
    }

    public static RectF a(int i, int i2, int i3) {
        RectF rectF = gl.P;
        rectF.set(i - i3, i2 - i3, i + i3, i2 + i3);
        return rectF;
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        switch (this.a) {
            case 0:
                Path path = (Path) this.b;
                boolean drawChild = super.drawChild(canvas, view, j);
                da1 da1Var = (da1) this.c;
                Paint paint = da1Var.r;
                Paint paint2 = da1Var.n;
                if (da1Var.e0() && view == da1Var.d) {
                    float min = Math.min(1.0f, Math.max(0.0f, ((float) (SystemClock.elapsedRealtime() - da1Var.M)) / 75.0f));
                    if (min < 1.0f) {
                        da1Var.fragmentView.invalidate();
                    }
                    RectF rectF = da1Var.K;
                    RectF rectF2 = da1Var.L;
                    RectF rectF3 = gl.P;
                    gl.X1(rectF, rectF2, min, rectF3);
                    if (da1Var.c0 < 1.0f) {
                        if (da1Var.d0 == null) {
                            da1Var.l0();
                        }
                        gl.X1(da1Var.d0, rectF3, da1Var.c0, rectF3);
                    }
                    int width = (int) (rectF3.width() * view.getWidth());
                    int height = (int) (rectF3.height() * view.getHeight());
                    int centerX = (int) (rectF3.centerX() * view.getWidth());
                    float centerY = rectF3.centerY();
                    float f = da1Var.F;
                    float f2 = (f * 0.5f) + 0.5f;
                    int i = (int) (width * f2);
                    int i2 = (int) (f2 * height);
                    int i3 = centerX - (i / 2);
                    int height2 = ((int) (centerY * view.getHeight())) - (i2 / 2);
                    paint2.setAlpha((int) ((1.0f - (Math.min(1.0f, f) * (1.0f - da1Var.x))) * 255.0f));
                    float f3 = height2;
                    canvas.drawRect(0.0f, 0.0f, view.getMeasuredWidth(), f3, paint2);
                    int i4 = height2 + i2;
                    float f4 = i4;
                    canvas.drawRect(0.0f, f4, view.getMeasuredWidth(), view.getMeasuredHeight(), paint2);
                    float f5 = i3;
                    canvas.drawRect(0.0f, f3, f5, f4, paint2);
                    int i5 = i3 + i;
                    float f6 = i5;
                    canvas.drawRect(f6, f3, view.getMeasuredWidth(), f4, paint2);
                    paint2.setAlpha((int) (Math.max(0.0f, 1.0f - da1Var.F) * 255.0f));
                    canvas.drawRect(f5, f3, f6, f4, paint2);
                    int U1 = gl.U1(Math.min(1.0f, da1Var.F * 20.0f), 0, gl.L(4.0f));
                    int i6 = U1 / 2;
                    int U12 = gl.U1(Math.min(1.2f, (float) Math.pow(da1Var.F, 1.7999999523162842d)), Math.min(i, i2), gl.L(20.0f));
                    paint.setAlpha((int) (Math.min(1.0f, da1Var.F) * 255.0f));
                    path.reset();
                    int i7 = height2 + U12;
                    path.arcTo(a(i3, i7, i6), 0.0f, 180.0f);
                    float f7 = U1 * 1.5f;
                    int i8 = (int) (f5 + f7);
                    int i9 = (int) (f3 + f7);
                    int i10 = U1 << 1;
                    path.arcTo(a(i8, i9, i10), 180.0f, 90.0f);
                    int i11 = i3 + U12;
                    path.arcTo(a(i11, height2, i6), 270.0f, 180.0f);
                    path.lineTo(i3 + i6, height2 + i6);
                    path.arcTo(a(i8, i9, U1), 270.0f, -90.0f);
                    path.close();
                    canvas.drawPath(path, paint);
                    path.reset();
                    path.arcTo(a(i5, i7, i6), 180.0f, -180.0f);
                    int i12 = (int) (f6 - f7);
                    path.arcTo(a(i12, i9, i10), 0.0f, -90.0f);
                    int i13 = i5 - U12;
                    path.arcTo(a(i13, height2, i6), 270.0f, -180.0f);
                    path.arcTo(a(i12, i9, U1), 270.0f, 90.0f);
                    path.close();
                    canvas.drawPath(path, paint);
                    path.reset();
                    int i14 = i4 - U12;
                    path.arcTo(a(i3, i14, i6), 0.0f, -180.0f);
                    int i15 = (int) (f4 - f7);
                    path.arcTo(a(i8, i15, i10), 180.0f, -90.0f);
                    path.arcTo(a(i11, i4, i6), 90.0f, -180.0f);
                    path.arcTo(a(i8, i15, U1), 90.0f, 90.0f);
                    path.close();
                    canvas.drawPath(path, paint);
                    path.reset();
                    path.arcTo(a(i5, i14, i6), 180.0f, 180.0f);
                    path.arcTo(a(i12, i15, i10), 0.0f, 90.0f);
                    path.arcTo(a(i13, i4, i6), 90.0f, 180.0f);
                    path.arcTo(a(i12, i15, U1), 90.0f, -90.0f);
                    path.close();
                    canvas.drawPath(path, paint);
                    return drawChild;
                }
                return drawChild;
            default:
                return super.drawChild(canvas, view, j);
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        a aVar;
        a aVar2;
        a aVar3;
        int measuredHeight;
        int L;
        a aVar4;
        a aVar5;
        a aVar6;
        byte b = this.a;
        d dVar = this.c;
        switch (b) {
            case 0:
                int i5 = i3 - i;
                int i6 = i4 - i2;
                da1 da1Var = (da1) dVar;
                byte b2 = da1Var.X;
                if (b2 != 0) {
                    aVar = ((d) da1Var).actionBar;
                    aVar2 = ((d) da1Var).actionBar;
                    int measuredWidth = aVar2.getMeasuredWidth();
                    aVar3 = ((d) da1Var).actionBar;
                    aVar.layout(0, 0, measuredWidth, aVar3.getMeasuredHeight());
                    CameraView cameraView = da1Var.d;
                    if (cameraView != null) {
                        cameraView.layout(0, 0, cameraView.getMeasuredWidth(), da1Var.d.getMeasuredHeight());
                    }
                    int min = (int) (Math.min(i5, i6) / 1.5f);
                    ba1 ba1Var = da1Var.b;
                    if (b2 == 1) {
                        measuredHeight = ((i6 - min) / 2) - ba1Var.getMeasuredHeight();
                        L = gl.L(30.0f);
                    } else {
                        measuredHeight = ((i6 - min) / 2) - ba1Var.getMeasuredHeight();
                        L = gl.L(64.0f);
                    }
                    int i7 = measuredHeight - L;
                    da1Var.b.layout(gl.L(36.0f), i7, da1Var.b.getMeasuredWidth() + gl.L(36.0f), da1Var.b.getMeasuredHeight() + i7);
                    if (b2 == 3) {
                        int w = de9.w(8.0f, da1Var.b.getMeasuredHeight(), i7);
                        da1Var.c.layout(gl.L(36.0f), w, da1Var.c.getMeasuredWidth() + gl.L(36.0f), da1Var.c.getMeasuredHeight() + w);
                    }
                    da1Var.h.layout(0, getMeasuredHeight() - da1Var.h.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
                    int measuredWidth2 = (i5 / 2) - (da1Var.s.getMeasuredWidth() / 2);
                    int L2 = gl.L(80.0f) + ug8.g(i6, min, 2, min);
                    ImageView imageView = da1Var.s;
                    imageView.layout(measuredWidth2, L2, imageView.getMeasuredWidth() + measuredWidth2, da1Var.s.getMeasuredHeight() + L2);
                } else {
                    CameraView cameraView2 = da1Var.d;
                    if (cameraView2 != null) {
                        cameraView2.layout(0, 0, cameraView2.getMeasuredWidth(), da1Var.d.getMeasuredHeight());
                    }
                    da1Var.h.setTextSize(0, i6 / 22);
                    da1Var.h.setPadding(0, 0, 0, i6 / 15);
                    int i8 = (int) (i6 * 0.65f);
                    da1Var.b.layout(gl.L(36.0f), i8, da1Var.b.getMeasuredWidth() + gl.L(36.0f), da1Var.b.getMeasuredHeight() + i8);
                }
                if (b2 != 3) {
                    int i9 = (int) (i6 * 0.74f);
                    int i10 = (int) (i5 * 0.05f);
                    TextView textView = da1Var.c;
                    textView.layout(i10, i9, textView.getMeasuredWidth() + i10, da1Var.c.getMeasuredHeight() + i9);
                }
                da1Var.l0();
                return;
            default:
                p3c p3cVar = (p3c) dVar;
                aVar4 = ((d) p3cVar).actionBar;
                aVar5 = ((d) p3cVar).actionBar;
                int measuredWidth3 = aVar5.getMeasuredWidth();
                aVar6 = ((d) p3cVar).actionBar;
                aVar4.layout(0, 0, measuredWidth3, aVar6.getMeasuredHeight());
                s71 s71Var = p3cVar.E;
                s71Var.layout(0, 0, s71Var.getMeasuredWidth(), p3cVar.E.getMeasuredHeight());
                hv7 hv7Var = (hv7) this.b;
                hv7Var.layout(0, 0, hv7Var.getMeasuredWidth(), hv7Var.getMeasuredHeight());
                return;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        a aVar;
        a aVar2;
        a aVar3;
        byte b = this.a;
        d dVar = this.c;
        switch (b) {
            case 0:
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                da1 da1Var = (da1) dVar;
                aVar = ((d) da1Var).actionBar;
                aVar.measure(i, i2);
                byte b2 = da1Var.X;
                CameraView cameraView = da1Var.d;
                if (b2 == 0) {
                    if (cameraView != null) {
                        cameraView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * 0.704f), 1073741824));
                    }
                } else {
                    if (cameraView != null) {
                        cameraView.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    }
                    da1Var.h.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                    da1Var.s.measure(View.MeasureSpec.makeMeasureSpec(gl.L(60.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(gl.L(60.0f), 1073741824));
                }
                da1Var.b.measure(ug8.f(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                TextView textView = da1Var.c;
                if (b2 == 3) {
                    textView.measure(ug8.f(72.0f, size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                } else {
                    textView.measure(View.MeasureSpec.makeMeasureSpec((int) (size * 0.9f), 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 0));
                }
                setMeasuredDimension(size, size2);
                return;
            default:
                int size3 = View.MeasureSpec.getSize(i);
                int size4 = View.MeasureSpec.getSize(i2);
                p3c p3cVar = (p3c) dVar;
                aVar2 = ((d) p3cVar).actionBar;
                aVar2.measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i2);
                s71 s71Var = p3cVar.E;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
                aVar3 = ((d) p3cVar).actionBar;
                s71Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(gl.L(3.0f) + aVar3.getMeasuredHeight(), 1073741824));
                ((hv7) this.b).measure(View.MeasureSpec.makeMeasureSpec(size3, 1073741824), i2);
                setMeasuredDimension(size3, size4);
                return;
        }
    }

    public aa1(p3c p3cVar, Context context, hv7 hv7Var) {
        super(context);
        this.c = p3cVar;
        this.b = hv7Var;
    }
}
