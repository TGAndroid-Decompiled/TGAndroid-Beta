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
public abstract class gl6 extends FrameLayout {
    public boolean E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public final ArrayList J;
    public final Rect K;
    public final int a;
    public final b7c b;
    public final np3 c;
    public final ao6 d;
    public final e99 e;
    public final Bitmap f;
    public final int h;
    public final boolean n;
    public final FrameLayout r;
    public final TextView s;
    public final TextView w;
    public final aw7 x;
    public xka y;

    public gl6(Context context, int i, Bitmap bitmap, Bitmap bitmap2, int i2, ao6 ao6Var) {
        super(context);
        zv7 ai4Var = new ai4(this, (byte) 12);
        this.J = new ArrayList();
        this.K = new Rect();
        this.a = i;
        this.n = context instanceof BubbleActivity;
        b7c b7cVar = new b7c();
        this.b = b7cVar;
        b7cVar.a = new k1f((byte) 21);
        np3 np3Var = new np3("MaskPaint", true);
        this.c = np3Var;
        this.d = ao6Var;
        this.f = bitmap;
        this.h = i2;
        hw7 hw7Var = new hw7(getPaintingSize(), bitmap2, i2, null);
        hw7Var.G = true;
        e99 e99Var = new e99(context, hw7Var, bitmap, null, null);
        this.e = e99Var;
        e99Var.setAlpha(0.0f);
        e99Var.setDelegate(new fk3(this));
        e99Var.setUndoStore(b7cVar);
        e99Var.setQueue(np3Var);
        e99Var.setVisibility(4);
        e99Var.setBrush(new Object());
        e99Var.setBrushSize(ai4Var.get());
        e99Var.setColor(-65536);
        addView(e99Var, qoe.e(-1, -1, 51));
        aw7 aw7Var = new aw7(context);
        this.x = aw7Var;
        aw7Var.b(0.05f, 1.0f);
        aw7Var.setBrushWeight(ai4Var.get());
        aw7Var.setRenderView(e99Var);
        aw7Var.setValueOverride(ai4Var);
        aw7Var.setTranslationX(-gm.L(18.0f));
        aw7Var.setAlpha(0.0f);
        addView(aw7Var, qoe.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setAlpha(0.0f);
        frameLayout.setVisibility(8);
        addView(frameLayout, qoe.e(-1, 44, 80));
        TextView textView = new TextView(context);
        this.s = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(gm.o());
        textView.setBackground(cmb.f0(cmb.p1(0.15f, -1), 3, -1));
        textView.setPadding(gm.L(28.0f), 0, gm.L(28.0f), 0);
        textView.setText(jb6.M0(2131752542, null).toUpperCase());
        textView.setTextColor(-1);
        textView.setGravity(17);
        TextView l = wi8.l(frameLayout, textView, qoe.d(-2, 44.0f, 3, -8.0f, 0.0f, 0.0f, 0.0f), context);
        this.w = l;
        ts2.s(l, 1, 15.0f);
        int i3 = cmb.pg;
        fg0 f0 = cmb.f0(cmb.p1(0.15f, cmb.w0(null, i3, false)), 3, -1);
        wmb K = anb.K(0.15f, i3);
        l.setBackground(f0);
        anb.j(l, f0, null, K, null);
        l.setPadding(gm.L(28.0f), 0, gm.L(28.0f), 0);
        l.setText(jb6.M0(2131745680, null).toUpperCase());
        anb.X(l, i3, null);
        l.setGravity(17);
        frameLayout.addView(l, qoe.d(-2, 44.0f, 5, 0.0f, 0.0f, -8.0f, 0.0f));
    }

    private xka getPaintingSize() {
        float f;
        float f2;
        xka xkaVar = this.y;
        if (xkaVar != null) {
            return xkaVar;
        }
        Bitmap bitmap = this.f;
        xka xkaVar2 = new xka(bitmap.getWidth(), bitmap.getHeight());
        xkaVar2.a = 1280.0f;
        float floor = (float) Math.floor((1280.0f * f2) / f);
        xkaVar2.b = floor;
        if (floor > 1280.0f) {
            xkaVar2.b = 1280.0f;
            xkaVar2.a = (float) Math.floor((1280.0f * f) / f2);
        }
        this.y = xkaVar2;
        return xkaVar2;
    }

    public final void a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        e99 e99Var = this.e;
        float translationX = ((x - e99Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / e99Var.getScaleX();
        float y = ((motionEvent.getY() - e99Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) / e99Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-e99Var.getRotation());
        double d2 = y;
        float measuredWidth = (e99Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        float measuredHeight = (e99Var.getMeasuredHeight() / 2.0f) + ((float) wi8.d(radians, d2, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        e99Var.e(obtain);
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
        e99 e99Var = this.e;
        ao6 ao6Var = this.d;
        if (ao6Var != null) {
            float f13 = ao6Var.c * 1.0f;
            int measuredWidth = e99Var.getMeasuredWidth();
            int measuredHeight = e99Var.getMeasuredHeight();
            if (measuredWidth != 0 && measuredHeight != 0) {
                int i = ao6Var.k;
                if (i == 90 || i == 270) {
                    measuredHeight = measuredWidth;
                    measuredWidth = measuredHeight;
                }
                float max = Math.max(f5 / ((int) (ao6Var.e * f9)), f6 / ((int) (ao6Var.f * f10)));
                f7 = f13 * max;
                float C = mlb.C(ao6Var.a, measuredWidth, f, max);
                float f14 = ao6Var.c;
                f2 += C * f14;
                f11 += ao6Var.b * measuredHeight * f * max * f14;
                f8 = ao6Var.d + i + f4;
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
        e99Var.setScaleX(f12);
        e99Var.setScaleY(f12);
        e99Var.setTranslationX(f2);
        e99Var.setTranslationY(f11);
        e99Var.setRotation(f8);
        e99Var.invalidate();
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        ao6 ao6Var;
        int i = 0;
        if (view == this.e && (ao6Var = this.d) != null) {
            canvas.save();
            if (!this.n) {
                i = gm.m;
            }
            int currentActionBarHeight = a.getCurrentActionBarHeight() + i;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = ao6Var.k;
            if (i2 == 90 || i2 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredWidth * ao6Var.e)) / ao6Var.c);
            int scaleY = (int) ((view.getScaleY() * (measuredHeight * ao6Var.f)) / ao6Var.c);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + this.F;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - gm.L(48.0f))) - scaleY) / 2.0f) + gm.L(8.0f) + i + this.G;
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
            RectF rectF = gm.P;
            rectF.set((-c.getWidth()) / 2.0f, (-c.getHeight()) / 2.0f, c.getWidth() / 2.0f, c.getHeight() / 2.0f);
            canvas.drawBitmap(c, (Rect) null, rectF, new Paint(3));
            c.recycle();
            return createBitmap;
        }
        return c;
    }

    public e99 getRenderView() {
        return this.e;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (!this.n) {
            Typeface typeface = gm.a;
        }
        e99 e99Var = this.e;
        int ceil = (int) Math.ceil((i5 - e99Var.getMeasuredWidth()) / 2.0f);
        int measuredHeight = (i6 - e99Var.getMeasuredHeight()) / 2;
        e99Var.layout(ceil, measuredHeight, e99Var.getMeasuredWidth() + ceil, e99Var.getMeasuredHeight() + measuredHeight);
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
        int i3 = gm.q.y;
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
            rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, gm.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
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
