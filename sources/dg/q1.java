package dg;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import k7.b6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.ai;
public abstract class q1 extends FrameLayout {
    public float B;
    public float C;
    public boolean D;
    public float E;
    public final ArrayList F;
    public final Rect G;
    public final int f4733a;
    public final cg.i2 f4734b;
    public final DispatchQueue f4735c;
    public final MediaController.CropState d;
    public final cg.p1 e;
    public final Bitmap f4736f;
    public final int h;
    public final boolean f4737n;
    public final FrameLayout f4738r;
    public final TextView f4739s;
    public final TextView v;
    public final t2 f4740w;
    public jv0 f4741x;
    public boolean f4742y;

    public q1(Context context, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, MediaController.CropState cropState) {
        super(context);
        s2 e0Var = new androidx.biometric.e0(this, 8);
        this.F = new ArrayList();
        this.G = new Rect();
        this.f4733a = i10;
        this.f4737n = context instanceof BubbleActivity;
        cg.i2 i2Var = new cg.i2();
        this.f4734b = i2Var;
        i2Var.f2411a = new Object();
        DispatchQueue dispatchQueue = new DispatchQueue("MaskPaint");
        this.f4735c = dispatchQueue;
        this.d = cropState;
        this.f4736f = bitmap;
        this.h = i11;
        cg.d1 d1Var = new cg.d1(getPaintingSize(), bitmap2, i11, null);
        d1Var.G = true;
        cg.p1 p1Var = new cg.p1(context, d1Var, bitmap, null, null);
        this.e = p1Var;
        p1Var.setAlpha(0.0f);
        p1Var.setDelegate(new p1(this));
        p1Var.setUndoStore(i2Var);
        p1Var.setQueue(dispatchQueue);
        p1Var.setVisibility(4);
        p1Var.setBrush(new Object());
        p1Var.setBrushSize(e0Var.get());
        p1Var.setColor(-65536);
        addView(p1Var, b6.e(-1, -1, 51));
        t2 t2Var = new t2(context);
        this.f4740w = t2Var;
        t2Var.b(0.05f, 1.0f);
        t2Var.setBrushWeight(e0Var.get());
        t2Var.setRenderView(p1Var);
        t2Var.setValueOverride(e0Var);
        t2Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        t2Var.setAlpha(0.0f);
        addView(t2Var, b6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f4738r = frameLayout;
        frameLayout.setAlpha(0.0f);
        frameLayout.setVisibility(8);
        addView(frameLayout, b6.e(-1, 44, 80));
        TextView textView = new TextView(context);
        this.f4739s = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(j6.f0(j6.l1(0.15f, -1), 3, -1));
        textView.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTextColor(-1);
        textView.setGravity(17);
        TextView h = ai.h(frameLayout, textView, b6.d(-2, 44.0f, 3, -8.0f, 0.0f, 0.0f, 0.0f), context);
        this.v = h;
        ai.o(15.0f, 1, h);
        int i12 = j6.f20279zf;
        h.setBackground(j6.f0(j6.l1(0.15f, j6.w0(null, i12, false)), 3, -1));
        h.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
        h.setText(LocaleController.getString(R.string.Save).toUpperCase());
        h.setTextColor(j6.w0(null, i12, false));
        h.setGravity(17);
        frameLayout.addView(h, b6.d(-2, 44.0f, 5, 0.0f, 0.0f, -8.0f, 0.0f));
    }

    private jv0 getPaintingSize() {
        float f10;
        float f11;
        jv0 jv0Var = this.f4741x;
        if (jv0Var != null) {
            return jv0Var;
        }
        Bitmap bitmap = this.f4736f;
        jv0 jv0Var2 = new jv0(bitmap.getWidth(), bitmap.getHeight());
        float f12 = 1280;
        jv0Var2.f26062a = f12;
        float floor = (float) Math.floor((f12 * f11) / f10);
        jv0Var2.f26063b = floor;
        if (floor > f12) {
            jv0Var2.f26063b = f12;
            jv0Var2.f26062a = (float) Math.floor((f12 * f10) / f11);
        }
        this.f4741x = jv0Var2;
        return jv0Var2;
    }

    public final void a(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        cg.p1 p1Var = this.e;
        float translationX = ((x10 - p1Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / p1Var.getScaleX();
        float y10 = ((motionEvent.getY() - p1Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) / p1Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-p1Var.getRotation());
        double d10 = y10;
        float measuredWidth = (p1Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        float measuredHeight = (p1Var.getMeasuredHeight() / 2.0f) + ((float) kf.k0.a(radians, d10, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        p1Var.e(obtain);
        obtain.recycle();
    }

    public final void b(float f10, float f11, float f12, float f13, float f14, float f15) {
        float f16;
        float f17;
        float f18;
        float f19;
        this.B = f11;
        float f20 = 0.0f + f12;
        this.C = f20;
        float f21 = 1.0f;
        cg.p1 p1Var = this.e;
        MediaController.CropState cropState = this.d;
        if (cropState != null) {
            float f22 = cropState.cropScale * 1.0f;
            int measuredWidth = p1Var.getMeasuredWidth();
            int measuredHeight = p1Var.getMeasuredHeight();
            if (measuredWidth != 0 && measuredHeight != 0) {
                int i10 = cropState.transformRotation;
                if (i10 == 90 || i10 == 270) {
                    measuredHeight = measuredWidth;
                    measuredWidth = measuredHeight;
                }
                float max = Math.max(f14 / ((int) (cropState.cropPw * f18)), f15 / ((int) (cropState.cropPh * f19)));
                f16 = f22 * max;
                float z4 = e2.c.z(cropState.cropPx, measuredWidth, f10, max);
                float f23 = cropState.cropScale;
                f11 += z4 * f23;
                f20 += cropState.cropPy * measuredHeight * f10 * max * f23;
                f17 = cropState.cropRotate + i10 + f13;
            } else {
                return;
            }
        } else {
            f16 = this.E * 1.0f;
            f17 = f13;
        }
        float f24 = f10 * f16;
        if (!Float.isNaN(f24)) {
            f21 = f24;
        }
        p1Var.setScaleX(f21);
        p1Var.setScaleY(f21);
        p1Var.setTranslationX(f11);
        p1Var.setTranslationY(f20);
        p1Var.setRotation(f17);
        p1Var.invalidate();
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        MediaController.CropState cropState;
        int i10 = 0;
        if (view == this.e && (cropState = this.d) != null) {
            canvas.save();
            if (!this.f4737n) {
                i10 = AndroidUtilities.statusBarHeight;
            }
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10;
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int i11 = cropState.transformRotation;
            if (i11 == 90 || i11 == 270) {
                measuredHeight = measuredWidth;
                measuredWidth = measuredHeight;
            }
            int scaleX = (int) ((view.getScaleX() * (measuredWidth * cropState.cropPw)) / cropState.cropScale);
            int scaleY = (int) ((view.getScaleY() * (measuredHeight * cropState.cropPh)) / cropState.cropScale);
            float ceil = ((float) Math.ceil((getMeasuredWidth() - scaleX) / 2.0f)) + this.B;
            float additionalBottom = (((getAdditionalBottom() + ((getMeasuredHeight() - currentActionBarHeight) - AndroidUtilities.dp(48.0f))) - scaleY) / 2.0f) + AndroidUtilities.dp(8.0f) + i10 + this.C;
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
        Bitmap c3 = this.e.c(false, false);
        int i10 = this.h;
        if (i10 != 0) {
            int width = c3.getWidth();
            int height = c3.getHeight();
            if ((i10 / 90) % 2 != 0) {
                width = c3.getHeight();
                height = c3.getWidth();
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.translate(width / 2.0f, height / 2.0f);
            canvas.rotate(-i10);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((-c3.getWidth()) / 2.0f, (-c3.getHeight()) / 2.0f, c3.getWidth() / 2.0f, c3.getHeight() / 2.0f);
            canvas.drawBitmap(c3, (Rect) null, rectF, new Paint(3));
            c3.recycle();
            return createBitmap;
        }
        return c3;
    }

    public cg.p1 getRenderView() {
        return this.e;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (!this.f4737n) {
            int i16 = AndroidUtilities.REPLACING_TAG_TYPE_LINK;
        }
        cg.p1 p1Var = this.e;
        int ceil = (int) Math.ceil((i14 - p1Var.getMeasuredWidth()) / 2.0f);
        int measuredHeight = (i15 - p1Var.getMeasuredHeight()) / 2;
        p1Var.layout(ceil, measuredHeight, p1Var.getMeasuredWidth() + ceil, p1Var.getMeasuredHeight() + measuredHeight);
        FrameLayout frameLayout = this.f4738r;
        frameLayout.layout(0, i15 - frameLayout.getMeasuredHeight(), frameLayout.getMeasuredWidth(), i15);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f10;
        float f11;
        this.D = true;
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        setMeasuredDimension(size, size2);
        int i12 = AndroidUtilities.displaySize.y;
        Bitmap bitmap = this.f4736f;
        if (bitmap != null) {
            f11 = bitmap.getWidth();
            f10 = bitmap.getHeight();
        } else {
            f10 = size2;
            f11 = size;
        }
        float f12 = size;
        float floor = (float) Math.floor((f12 * f10) / f11);
        float f13 = i12;
        if (floor > f13) {
            f12 = (float) Math.floor((f11 * f13) / f10);
            floor = f13;
        }
        this.e.measure(View.MeasureSpec.makeMeasureSpec((int) f12, 1073741824), View.MeasureSpec.makeMeasureSpec((int) floor, 1073741824));
        this.E = 1.0f;
        measureChild(this.f4740w, i10, i11);
        measureChild(this.f4738r, i10, i11);
        this.D = false;
        if (Build.VERSION.SDK_INT >= 29) {
            ArrayList arrayList = this.F;
            arrayList.clear();
            Rect rect = this.G;
            arrayList.add(rect);
            int measuredHeight = (int) (getMeasuredHeight() * 0.3f);
            rect.set(0, (getMeasuredHeight() - measuredHeight) / 2, AndroidUtilities.dp(20.0f), (getMeasuredHeight() + measuredHeight) / 2);
            setSystemGestureExclusionRects(arrayList);
        }
    }

    @Override
    public final void requestLayout() {
        if (this.D) {
            return;
        }
        super.requestLayout();
    }

    public void setEraser(boolean z4) {
        ?? r22;
        if (this.f4742y == z4) {
            return;
        }
        this.f4742y = z4;
        if (z4) {
            r22 = new Object();
        } else {
            r22 = new Object();
        }
        this.e.setBrush(r22);
    }
}
