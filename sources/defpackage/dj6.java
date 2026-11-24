package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.BubbleActivity;
public abstract class dj6 extends FrameLayout {
    public boolean E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public final ArrayList J;
    public final Rect K;
    public final int a;
    public final b5c b;
    public final do3 c;
    public final zl6 d;
    public final c79 e;
    public final Bitmap f;
    public final int h;
    public final boolean n;
    public final FrameLayout r;
    public final TextView s;
    public final TextView w;
    public final zt7 x;
    public via y;

    public dj6(Context context, int i, Bitmap bitmap, Bitmap bitmap2, int i2, zl6 zl6Var) {
        super(context);
        yt7 z24Var = new z24(this, (byte) 15);
        this.J = new ArrayList();
        this.K = new Rect();
        this.a = i;
        this.n = context instanceof BubbleActivity;
        b5c b5cVar = new b5c();
        this.b = b5cVar;
        b5cVar.a = new ize((byte) 21);
        do3 do3Var = new do3("MaskPaint", true);
        this.c = do3Var;
        this.d = zl6Var;
        this.f = bitmap;
        this.h = i2;
        gu7 gu7Var = new gu7(getPaintingSize(), bitmap2, i2, null);
        gu7Var.G = true;
        c79 c79Var = new c79(context, gu7Var, bitmap, null, null);
        this.e = c79Var;
        c79Var.setAlpha(0.0f);
        c79Var.setDelegate(new s34(this, (byte) 14));
        c79Var.setUndoStore(b5cVar);
        c79Var.setQueue(do3Var);
        c79Var.setVisibility(4);
        c79Var.setBrush(new Object());
        c79Var.setBrushSize(z24Var.get());
        c79Var.setColor(-65536);
        addView(c79Var, nme.e(-1, -1, 51));
        zt7 zt7Var = new zt7(context);
        this.x = zt7Var;
        zt7Var.b(0.05f, 1.0f);
        zt7Var.setBrushWeight(z24Var.get());
        zt7Var.setRenderView(c79Var);
        zt7Var.setValueOverride(z24Var);
        zt7Var.setTranslationX(-gl.L(18.0f));
        zt7Var.setAlpha(0.0f);
        addView(zt7Var, nme.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setAlpha(0.0f);
        frameLayout.setVisibility(8);
        addView(frameLayout, nme.e(-1, 44, 80));
        TextView textView = new TextView(context);
        this.s = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(gl.o());
        textView.setBackground(bkb.f0(bkb.p1(0.15f, -1), 3, -1));
        textView.setPadding(gl.L(28.0f), 0, gl.L(28.0f), 0);
        textView.setText(k96.M0(2131752577, null).toUpperCase());
        textView.setTextColor(-1);
        textView.setGravity(17);
        TextView l = ug8.l(frameLayout, textView, nme.d(-2, 44.0f, 3, -8.0f, 0.0f, 0.0f, 0.0f), context);
        this.w = l;
        ir2.t(l, 1, 15.0f);
        int i3 = bkb.pg;
        ff0 f0 = bkb.f0(bkb.p1(0.15f, bkb.w0(null, i3, false)), 3, -1);
        vkb K = zkb.K(0.15f, i3);
        l.setBackground(f0);
        zkb.j(l, f0, null, K, null);
        l.setPadding(gl.L(28.0f), 0, gl.L(28.0f), 0);
        l.setText(k96.M0(2131745754, null).toUpperCase());
        zkb.X(l, i3, null);
        l.setGravity(17);
        frameLayout.addView(l, nme.d(-2, 44.0f, 5, 0.0f, 0.0f, -8.0f, 0.0f));
    }

    private via getPaintingSize() {
        float f;
        float f2;
        via viaVar = this.y;
        if (viaVar != null) {
            return viaVar;
        }
        Bitmap bitmap = this.f;
        via viaVar2 = new via(bitmap.getWidth(), bitmap.getHeight());
        viaVar2.a = 1280.0f;
        float floor = (float) Math.floor((1280.0f * f2) / f);
        viaVar2.b = floor;
        if (floor > 1280.0f) {
            viaVar2.b = 1280.0f;
            viaVar2.a = (float) Math.floor((1280.0f * f) / f2);
        }
        this.y = viaVar2;
        return viaVar2;
    }

    public final void a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        c79 c79Var = this.e;
        float translationX = ((x - c79Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / c79Var.getScaleX();
        float y = ((motionEvent.getY() - c79Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) / c79Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-c79Var.getRotation());
        double d2 = y;
        float measuredWidth = (c79Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        float measuredHeight = (c79Var.getMeasuredHeight() / 2.0f) + ((float) ug8.d(radians, d2, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        c79Var.e(obtain);
        obtain.recycle();
    }

    public final void b(float f, float f2, float f3, float f4, float f5, float f6) {
        float f7;
        float f8;
        float f9;
        float f10;
        this.F = f2;
        float f11 = 0.0f + f3;
        this.G = f11;
        float f12 = 1.0f;
        c79 c79Var = this.e;
        zl6 zl6Var = this.d;
        if (zl6Var != null) {
            float f13 = zl6Var.c * 1.0f;
            int measuredWidth = c79Var.getMeasuredWidth();
            int measuredHeight = c79Var.getMeasuredHeight();
            if (measuredWidth != 0 && measuredHeight != 0) {
                int i = zl6Var.k;
                if (i == 90 || i == 270) {
                    measuredHeight = measuredWidth;
                    measuredWidth = measuredHeight;
                }
                float max = Math.max(f5 / ((int) (zl6Var.e * f9)), f6 / ((int) (zl6Var.f * f10)));
                f7 = f13 * max;
                float C = yjb.C(zl6Var.a, measuredWidth, f, max);
                float f14 = zl6Var.c;
                f2 += C * f14;
                f11 += zl6Var.b * measuredHeight * f * max * f14;
                f8 = zl6Var.d + i + f4;
            } else {
                return;
            }
        } else {
            f7 = this.I * 1.0f;
            f8 = f4;
        }
        float f15 = f * f7;
        if (!Float.isNaN(f15)) {
            f12 = f15;
        }
        c79Var.setScaleX(f12);
        c79Var.setScaleY(f12);
        c79Var.setTranslationX(f2);
        c79Var.setTranslationY(f11);
        c79Var.setRotation(f8);
        c79Var.invalidate();
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        zl6 zl6Var;
        int i = 0;
        if (view == this.e && (zl6Var = this.d) != null) {
            canvas.save();
            if (!this.n) {
                i = gl.m;
            }
            int currentActionBarHeight = a.getCurrentActionBarHeight() + i;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = zl6Var.k;
            if (i2 == 90 || i2 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredWidth * zl6Var.e)) / zl6Var.c);
            int scaleY = (int) ((view.getScaleY() * (measuredHeight * zl6Var.f)) / zl6Var.c);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + this.F;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - gl.L(48.0f))) - scaleY) / 2.0f) + gl.L(8.0f) + i + this.G;
            canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, additionalBottom), Math.min(ceil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            i = 1;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        if (i != 0) {
            canvas.restore();
        }
        return drawChild;
    }

    public int getAdditionalBottom() {
        return 0;
    }

    public int getAdditionalTop() {
        return 0;
    }

    public Bitmap getBitmap() {
        Bitmap c = this.e.c(false, false);
        int i = this.h;
        if (i != 0) {
            int width = c.getWidth();
            int height = c.getHeight();
            if ((i / 90) % 2 != 0) {
                width = c.getHeight();
                height = c.getWidth();
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(width / 2.0f, height / 2.0f);
            canvas.rotate(-i);
            RectF rectF = gl.P;
            rectF.set((-c.getWidth()) / 2.0f, (-c.getHeight()) / 2.0f, c.getWidth() / 2.0f, c.getHeight() / 2.0f);
            canvas.drawBitmap(c, (Rect) null, rectF, new Paint(3));
            c.recycle();
            return createBitmap;
        }
        return c;
    }

    public c79 getRenderView() {
        return this.e;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (!this.n) {
            Typeface typeface = gl.a;
        }
        c79 c79Var = this.e;
        int ceil = (int) Math.ceil((i5 - c79Var.getMeasuredWidth()) / 2.0f);
        int measuredHeight = (i6 - c79Var.getMeasuredHeight()) / 2;
        c79Var.layout(ceil, measuredHeight, c79Var.getMeasuredWidth() + ceil, c79Var.getMeasuredHeight() + measuredHeight);
        FrameLayout frameLayout = this.r;
        frameLayout.layout(0, i6 - frameLayout.getMeasuredHeight(), frameLayout.getMeasuredWidth(), i6);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        float f;
        float f2;
        this.H = true;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        setMeasuredDimension(size, size2);
        int i3 = gl.q.y;
        Bitmap bitmap = this.f;
        if (bitmap != null) {
            f2 = bitmap.getWidth();
            f = bitmap.getHeight();
        } else {
            f = size2;
            f2 = size;
        }
        float f3 = size;
        float floor = (float) Math.floor((f3 * f) / f2);
        float f4 = i3;
        if (floor > f4) {
            f3 = (float) Math.floor((f2 * f4) / f);
            floor = f4;
        }
        this.e.measure(View.MeasureSpec.makeMeasureSpec((int) f3, 1073741824), View.MeasureSpec.makeMeasureSpec((int) floor, 1073741824));
        this.I = 1.0f;
        measureChild(this.x, i, i2);
        measureChild(this.r, i, i2);
        this.H = false;
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.J;
            arrayList.clear();
            Rect rect = this.K;
            arrayList.add(rect);
            int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
            rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, gl.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            setSystemGestureExclusionRects(arrayList);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.H) {
            return;
        }
        super.requestLayout();
    }

    public void setEraser(boolean z) {
        ?? r2;
        if (this.E == z) {
            return;
        }
        this.E = z;
        if (z) {
            r2 = new Object();
        } else {
            r2 = new Object();
        }
        this.e.setBrush(r2);
    }
}
