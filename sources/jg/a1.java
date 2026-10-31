package jg;

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
import org.telegram.messenger.cd;
import org.telegram.messenger.s5;
import org.telegram.messenger.ye;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.pu0;
import w7.b6;
public abstract class a1 extends FrameLayout {
    public boolean D;
    public float E;
    public float F;
    public boolean G;
    public float H;
    public final ArrayList I;
    public final Rect J;
    public final int f9877a;
    public final ig.t1 f9878b;
    public final s5 f9879c;
    public final ye d;
    public final ig.c1 e;
    public final Bitmap f9880f;
    public final int h;
    public final boolean f9881n;
    public final FrameLayout f9882r;
    public final TextView f9883s;
    public final TextView f9884w;
    public final d2 f9885x;
    public pu0 f9886y;

    public a1(Context context, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, ye yeVar) {
        super(context);
        c2 lVar = new a4.l(this, 22);
        this.I = new ArrayList();
        this.J = new Rect();
        this.f9877a = i10;
        this.f9881n = context instanceof BubbleActivity;
        ig.t1 t1Var = new ig.t1();
        this.f9878b = t1Var;
        t1Var.f8469a = new t7.u(9);
        s5 s5Var = new s5("MaskPaint", true);
        this.f9879c = s5Var;
        this.d = yeVar;
        this.f9880f = bitmap;
        this.h = i11;
        ig.q0 q0Var = new ig.q0(getPaintingSize(), bitmap2, i11, null);
        q0Var.G = true;
        ig.c1 c1Var = new ig.c1(context, q0Var, bitmap, null, null);
        this.e = c1Var;
        c1Var.setAlpha(0.0f);
        c1Var.setDelegate(new k6.h(this, 29));
        c1Var.setUndoStore(t1Var);
        c1Var.setQueue(s5Var);
        c1Var.setVisibility(4);
        c1Var.setBrush(new Object());
        c1Var.setBrushSize(lVar.get());
        c1Var.setColor(-65536);
        addView(c1Var, b6.e(-1, -1, 51));
        d2 d2Var = new d2(context);
        this.f9885x = d2Var;
        d2Var.b(0.05f, 1.0f);
        d2Var.setBrushWeight(lVar.get());
        d2Var.setRenderView(c1Var);
        d2Var.setValueOverride(lVar);
        d2Var.setTranslationX(-org.telegram.messenger.i0.L(18.0f));
        d2Var.setAlpha(0.0f);
        addView(d2Var, b6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9882r = frameLayout;
        frameLayout.setAlpha(0.0f);
        frameLayout.setVisibility(8);
        addView(frameLayout, b6.e(-1, 44, 80));
        TextView textView = new TextView(context);
        this.f9883s = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setBackground(t6.h0(t6.r1(0.15f, -1), 3, -1));
        textView.setPadding(org.telegram.messenger.i0.L(28.0f), 0, org.telegram.messenger.i0.L(28.0f), 0);
        textView.setText(cd.L0(2131752589, null).toUpperCase());
        textView.setTextColor(-1);
        textView.setGravity(17);
        TextView l4 = org.telegram.ui.Cells.f1.l(frameLayout, textView, b6.d(-2, 44.0f, 3, -8.0f, 0.0f, 0.0f, 0.0f), context);
        this.f9884w = l4;
        sc.e.t(l4, 1, 15.0f);
        int i12 = t6.f21125ng;
        org.telegram.ui.Cells.y h02 = t6.h0(t6.r1(0.15f, t6.x0(null, i12, false)), 3, -1);
        w6 L = a7.L(0.15f, i12);
        l4.setBackground(h02);
        a7.k(l4, h02, null, L, null);
        l4.setPadding(org.telegram.messenger.i0.L(28.0f), 0, org.telegram.messenger.i0.L(28.0f), 0);
        l4.setText(cd.L0(2131745963, null).toUpperCase());
        a7.V(l4, i12, null);
        l4.setGravity(17);
        frameLayout.addView(l4, b6.d(-2, 44.0f, 5, 0.0f, 0.0f, -8.0f, 0.0f));
    }

    private pu0 getPaintingSize() {
        float f7;
        float f10;
        pu0 pu0Var = this.f9886y;
        if (pu0Var != null) {
            return pu0Var;
        }
        Bitmap bitmap = this.f9880f;
        pu0 pu0Var2 = new pu0(bitmap.getWidth(), bitmap.getHeight());
        float f11 = 1280;
        pu0Var2.f29435a = f11;
        float floor = (float) Math.floor((f11 * f10) / f7);
        pu0Var2.f29436b = floor;
        if (floor > f11) {
            pu0Var2.f29436b = f11;
            pu0Var2.f29435a = (float) Math.floor((f11 * f7) / f10);
        }
        this.f9886y = pu0Var2;
        return pu0Var2;
    }

    public final void a(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        ig.c1 c1Var = this.e;
        float translationX = ((x10 - c1Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / c1Var.getScaleX();
        float y3 = ((motionEvent.getY() - c1Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) / c1Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-c1Var.getRotation());
        double d10 = y3;
        float measuredWidth = (c1Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        float measuredHeight = (c1Var.getMeasuredHeight() / 2.0f) + ((float) i0.a.c(radians, d10, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        c1Var.e(obtain);
        obtain.recycle();
    }

    public final void b(float f7, float f10, float f11, float f12, float f13, float f14) {
        float f15;
        float f16;
        float f17;
        float f18;
        this.E = f10;
        float f19 = 0.0f + f11;
        this.F = f19;
        float f20 = 1.0f;
        ig.c1 c1Var = this.e;
        ye yeVar = this.d;
        if (yeVar != null) {
            float f21 = yeVar.f19366c * 1.0f;
            int measuredWidth = c1Var.getMeasuredWidth();
            int measuredHeight = c1Var.getMeasuredHeight();
            if (measuredWidth != 0 && measuredHeight != 0) {
                int i10 = yeVar.f19370k;
                if (i10 == 90 || i10 == 270) {
                    measuredHeight = measuredWidth;
                    measuredWidth = measuredHeight;
                }
                float max = Math.max(f13 / ((int) (yeVar.e * f17)), f14 / ((int) (yeVar.f19367f * f18)));
                f15 = f21 * max;
                float E = c3.i0.E(yeVar.f19364a, measuredWidth, f7, max);
                float f22 = yeVar.f19366c;
                f10 += E * f22;
                f19 += yeVar.f19365b * measuredHeight * f7 * max * f22;
                f16 = yeVar.d + i10 + f12;
            } else {
                return;
            }
        } else {
            f15 = this.H * 1.0f;
            f16 = f12;
        }
        float f23 = f7 * f15;
        if (!Float.isNaN(f23)) {
            f20 = f23;
        }
        c1Var.setScaleX(f20);
        c1Var.setScaleY(f20);
        c1Var.setTranslationX(f10);
        c1Var.setTranslationY(f19);
        c1Var.setRotation(f16);
        c1Var.invalidate();
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        ye yeVar;
        int i10 = 0;
        if (view == this.e && (yeVar = this.d) != null) {
            canvas.save();
            if (!this.f9881n) {
                i10 = org.telegram.messenger.i0.f16020m;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i10;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i11 = yeVar.f19370k;
            if (i11 == 90 || i11 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredWidth * yeVar.e)) / yeVar.f19366c);
            int scaleY = (int) ((view.getScaleY() * (measuredHeight * yeVar.f19367f)) / yeVar.f19366c);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + this.E;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - org.telegram.messenger.i0.L(48.0f))) - scaleY) / 2.0f) + org.telegram.messenger.i0.L(8.0f) + i10 + this.F;
            canvas.clipRect(Math.max(0.0f, ceil), Math.max(0.0f, additionalBottom), Math.min(ceil + scaleX, getMeasuredWidth()), Math.min(getMeasuredHeight(), additionalBottom + scaleY));
            i10 = 1;
        }
        boolean drawChild = super.drawChild(canvas, view, j10);
        if (i10 != 0) {
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
        Bitmap c10 = this.e.c(false, false);
        int i10 = this.h;
        if (i10 != 0) {
            int width = c10.getWidth();
            int height = c10.getHeight();
            if ((i10 / 90) % 2 != 0) {
                width = c10.getHeight();
                height = c10.getWidth();
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(width / 2.0f, height / 2.0f);
            canvas.rotate(-i10);
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set((-c10.getWidth()) / 2.0f, (-c10.getHeight()) / 2.0f, c10.getWidth() / 2.0f, c10.getHeight() / 2.0f);
            canvas.drawBitmap(c10, (Rect) null, rectF, new Paint(3));
            c10.recycle();
            return createBitmap;
        }
        return c10;
    }

    public ig.c1 getRenderView() {
        return this.e;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (!this.f9881n) {
            Typeface typeface = org.telegram.messenger.i0.f15999a;
        }
        ig.c1 c1Var = this.e;
        int ceil = (int) Math.ceil((i14 - c1Var.getMeasuredWidth()) / 2.0f);
        int measuredHeight = (i15 - c1Var.getMeasuredHeight()) / 2;
        c1Var.layout(ceil, measuredHeight, c1Var.getMeasuredWidth() + ceil, c1Var.getMeasuredHeight() + measuredHeight);
        FrameLayout frameLayout = this.f9882r;
        frameLayout.layout(0, i15 - frameLayout.getMeasuredHeight(), frameLayout.getMeasuredWidth(), i15);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        float f10;
        this.G = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int i12 = org.telegram.messenger.i0.f16026q.y;
        Bitmap bitmap = this.f9880f;
        if (bitmap != null) {
            f10 = bitmap.getWidth();
            f7 = bitmap.getHeight();
        } else {
            f7 = size2;
            f10 = size;
        }
        float f11 = size;
        float floor = (float) Math.floor((f11 * f7) / f10);
        float f12 = i12;
        if (floor > f12) {
            f11 = (float) Math.floor((f10 * f12) / f7);
            floor = f12;
        }
        this.e.measure(View.MeasureSpec.makeMeasureSpec((int) f11, 1073741824), View.MeasureSpec.makeMeasureSpec((int) floor, 1073741824));
        this.H = 1.0f;
        measureChild(this.f9885x, i10, i11);
        measureChild(this.f9882r, i10, i11);
        this.G = false;
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.I;
            arrayList.clear();
            Rect rect = this.J;
            arrayList.add(rect);
            int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
            rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, org.telegram.messenger.i0.L(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            setSystemGestureExclusionRects(arrayList);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.G) {
            return;
        }
        super.requestLayout();
    }

    public void setEraser(boolean z10) {
        ?? r22;
        if (this.D == z10) {
            return;
        }
        this.D = z10;
        if (z10) {
            r22 = new Object();
        } else {
            r22 = new Object();
        }
        this.e.setBrush(r22);
    }
}
