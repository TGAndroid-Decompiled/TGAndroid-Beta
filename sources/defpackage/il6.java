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
public abstract class il6 extends FrameLayout {
    public boolean E;
    public float F;
    public float G;
    public boolean H;
    public float I;
    public final ArrayList J;
    public final Rect K;
    public final int a;
    public final a9c b;
    public final uo3 c;
    public final fo6 d;
    public final pa9 e;
    public final Bitmap f;
    public final int h;
    public final boolean n;
    public final FrameLayout r;
    public final TextView s;
    public final TextView w;
    public final gx7 x;
    public qma y;

    public il6(Context context, int i, Bitmap bitmap, Bitmap bitmap2, int i2, fo6 fo6Var) {
        super(context);
        gc8 gc8Var = (gc8) this;
        fx7 xh4Var = new xh4(gc8Var, (byte) 12);
        this.J = new ArrayList();
        this.K = new Rect();
        this.a = i;
        this.n = context instanceof BubbleActivity;
        a9c a9cVar = new a9c();
        this.b = a9cVar;
        a9cVar.a = new z3f((byte) 21);
        uo3 uo3Var = new uo3("MaskPaint", true);
        this.c = uo3Var;
        this.d = fo6Var;
        this.f = bitmap;
        this.h = i2;
        nx7 nx7Var = new nx7(getPaintingSize(), bitmap2, i2, null);
        nx7Var.G = true;
        pa9 pa9Var = new pa9(context, nx7Var, bitmap, null, null);
        this.e = pa9Var;
        pa9Var.setAlpha(0.0f);
        pa9Var.setDelegate(new aj3(gc8Var, (byte) 19));
        pa9Var.setUndoStore(a9cVar);
        pa9Var.setQueue(uo3Var);
        pa9Var.setVisibility(4);
        pa9Var.setBrush(new Object());
        pa9Var.setBrushSize(xh4Var.get());
        pa9Var.setColor(-65536);
        addView(pa9Var, tre.e(-1, -1, 51));
        gx7 gx7Var = new gx7(context);
        this.x = gx7Var;
        gx7Var.b(0.05f, 1.0f);
        gx7Var.setBrushWeight(xh4Var.get());
        gx7Var.setRenderView(pa9Var);
        gx7Var.setValueOverride(xh4Var);
        gx7Var.setTranslationX(-hl.L(18.0f));
        gx7Var.setAlpha(0.0f);
        addView(gx7Var, tre.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.r = frameLayout;
        frameLayout.setAlpha(0.0f);
        frameLayout.setVisibility(8);
        addView(frameLayout, tre.e(-1, 44, 80));
        TextView textView = new TextView(context);
        this.s = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(hl.o());
        textView.setBackground(aob.f0(aob.p1(0.15f, -1), 3, -1));
        textView.setPadding(hl.L(28.0f), 0, hl.L(28.0f), 0);
        textView.setText(ob6.M0(2131752570, null).toUpperCase());
        textView.setTextColor(-1);
        textView.setGravity(17);
        TextView l = ik8.l(frameLayout, textView, tre.d(-2, 44.0f, 3, -8.0f, 0.0f, 0.0f, 0.0f), context);
        this.w = l;
        bs2.t(l, 1, 15.0f);
        int i3 = aob.qg;
        hf0 f0 = aob.f0(aob.p1(0.15f, aob.w0(null, i3, false)), 3, -1);
        uob K = yob.K(0.15f, i3);
        l.setBackground(f0);
        yob.j(l, f0, null, K, null);
        l.setPadding(hl.L(28.0f), 0, hl.L(28.0f), 0);
        l.setText(ob6.M0(2131745674, null).toUpperCase());
        yob.X(l, i3, null);
        l.setGravity(17);
        frameLayout.addView(l, tre.d(-2, 44.0f, 5, 0.0f, 0.0f, -8.0f, 0.0f));
    }

    private qma getPaintingSize() {
        float f;
        float f2;
        qma qmaVar = this.y;
        if (qmaVar != null) {
            return qmaVar;
        }
        Bitmap bitmap = this.f;
        qma qmaVar2 = new qma(bitmap.getWidth(), bitmap.getHeight());
        qmaVar2.a = 1280.0f;
        float floor = (float) Math.floor((1280.0f * f2) / f);
        qmaVar2.b = floor;
        if (floor > 1280.0f) {
            qmaVar2.b = 1280.0f;
            qmaVar2.a = (float) Math.floor((1280.0f * f) / f2);
        }
        this.y = qmaVar2;
        return qmaVar2;
    }

    public final void a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        pa9 pa9Var = this.e;
        float translationX = ((x - pa9Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / pa9Var.getScaleX();
        float y = ((motionEvent.getY() - pa9Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) / pa9Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-pa9Var.getRotation());
        double d2 = y;
        float measuredWidth = (pa9Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d2)));
        float measuredHeight = (pa9Var.getMeasuredHeight() / 2.0f) + ((float) ik8.d(radians, d2, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        pa9Var.e(obtain);
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
        pa9 pa9Var = this.e;
        fo6 fo6Var = this.d;
        if (fo6Var != null) {
            float f13 = fo6Var.c * 1.0f;
            int measuredWidth = pa9Var.getMeasuredWidth();
            int measuredHeight = pa9Var.getMeasuredHeight();
            if (measuredWidth != 0 && measuredHeight != 0) {
                int i = fo6Var.k;
                if (i == 90 || i == 270) {
                    measuredHeight = measuredWidth;
                    measuredWidth = measuredHeight;
                }
                float max = Math.max(f5 / ((int) (fo6Var.e * f9)), f6 / ((int) (fo6Var.f * f10)));
                f7 = f13 * max;
                float C = xnb.C(fo6Var.a, measuredWidth, f, max);
                float f14 = fo6Var.c;
                f2 += C * f14;
                f11 += fo6Var.b * measuredHeight * f * max * f14;
                f8 = fo6Var.d + i + f4;
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
        pa9Var.setScaleX(f12);
        pa9Var.setScaleY(f12);
        pa9Var.setTranslationX(f2);
        pa9Var.setTranslationY(f11);
        pa9Var.setRotation(f8);
        pa9Var.invalidate();
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        fo6 fo6Var;
        int i = 0;
        if (view == this.e && (fo6Var = this.d) != null) {
            canvas.save();
            if (!this.n) {
                i = hl.m;
            }
            int currentActionBarHeight = a.getCurrentActionBarHeight() + i;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i2 = fo6Var.k;
            if (i2 == 90 || i2 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredWidth * fo6Var.e)) / fo6Var.c);
            int scaleY = (int) ((view.getScaleY() * (measuredHeight * fo6Var.f)) / fo6Var.c);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + this.F;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - hl.L(48.0f))) - scaleY) / 2.0f) + hl.L(8.0f) + i + this.G;
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
            RectF rectF = hl.P;
            rectF.set((-c.getWidth()) / 2.0f, (-c.getHeight()) / 2.0f, c.getWidth() / 2.0f, c.getHeight() / 2.0f);
            canvas.drawBitmap(c, (Rect) null, rectF, new Paint(3));
            c.recycle();
            return createBitmap;
        }
        return c;
    }

    public pa9 getRenderView() {
        return this.e;
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (!this.n) {
            Typeface typeface = hl.a;
        }
        pa9 pa9Var = this.e;
        int ceil = (int) Math.ceil((i5 - pa9Var.getMeasuredWidth()) / 2.0f);
        int measuredHeight = (i6 - pa9Var.getMeasuredHeight()) / 2;
        pa9Var.layout(ceil, measuredHeight, pa9Var.getMeasuredWidth() + ceil, pa9Var.getMeasuredHeight() + measuredHeight);
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
        int i3 = hl.q.y;
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
            rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, hl.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
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
