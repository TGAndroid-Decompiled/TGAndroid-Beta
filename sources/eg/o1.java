package eg;

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
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.yh;
public abstract class o1 extends FrameLayout {
    public float B;
    public float C;
    public boolean D;
    public float E;
    public final ArrayList F;
    public final Rect G;
    public final int f5388a;
    public final dg.h2 f5389b;
    public final DispatchQueue f5390c;
    public final MediaController.CropState d;
    public final dg.o1 f5391e;
    public final Bitmap f5392f;
    public final int h;
    public final boolean f5393n;
    public final FrameLayout f5394r;
    public final TextView f5395s;
    public final TextView v;
    public final r2 f5396w;
    public jv0 f5397x;
    public boolean f5398y;

    public o1(Context context, int i10, Bitmap bitmap, Bitmap bitmap2, int i11, MediaController.CropState cropState) {
        super(context);
        q2 f0Var = new androidx.biometric.f0(this, 9);
        this.F = new ArrayList();
        this.G = new Rect();
        this.f5388a = i10;
        this.f5393n = context instanceof BubbleActivity;
        dg.h2 h2Var = new dg.h2();
        this.f5389b = h2Var;
        h2Var.f4556a = new Object();
        DispatchQueue dispatchQueue = new DispatchQueue("MaskPaint");
        this.f5390c = dispatchQueue;
        this.d = cropState;
        this.f5392f = bitmap;
        this.h = i11;
        dg.c1 c1Var = new dg.c1(getPaintingSize(), bitmap2, i11, null);
        c1Var.G = true;
        dg.o1 o1Var = new dg.o1(context, c1Var, bitmap, null, null);
        this.f5391e = o1Var;
        o1Var.setAlpha(0.0f);
        o1Var.setDelegate(new n1(this));
        o1Var.setUndoStore(h2Var);
        o1Var.setQueue(dispatchQueue);
        o1Var.setVisibility(4);
        o1Var.setBrush(new Object());
        o1Var.setBrushSize(f0Var.get());
        o1Var.setColor(-65536);
        addView(o1Var, c6.e(-1, -1, 51));
        r2 r2Var = new r2(context);
        this.f5396w = r2Var;
        r2Var.b(0.05f, 1.0f);
        r2Var.setBrushWeight(f0Var.get());
        r2Var.setRenderView(o1Var);
        r2Var.setValueOverride(f0Var);
        r2Var.setTranslationX(-AndroidUtilities.dp(18.0f));
        r2Var.setAlpha(0.0f);
        addView(r2Var, c6.c(-1.0f, -1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f5394r = frameLayout;
        frameLayout.setAlpha(0.0f);
        frameLayout.setVisibility(8);
        addView(frameLayout, c6.e(-1, 44, 80));
        TextView textView = new TextView(context);
        this.f5395s = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setBackground(k6.f0(k6.l1(0.15f, -1), 3, -1));
        textView.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
        textView.setText(LocaleController.getString(R.string.Cancel).toUpperCase());
        textView.setTextColor(-1);
        textView.setGravity(17);
        TextView h = yh.h(frameLayout, textView, c6.d(-2, 44.0f, 3, -8.0f, 0.0f, 0.0f, 0.0f), context);
        this.v = h;
        yh.p(15.0f, 1, h);
        int i12 = k6.f22061zf;
        h.setBackground(k6.f0(k6.l1(0.15f, k6.w0(null, i12, false)), 3, -1));
        h.setPadding(AndroidUtilities.dp(28.0f), 0, AndroidUtilities.dp(28.0f), 0);
        h.setText(LocaleController.getString(R.string.Save).toUpperCase());
        h.setTextColor(k6.w0(null, i12, false));
        h.setGravity(17);
        frameLayout.addView(h, c6.d(-2, 44.0f, 5, 0.0f, 0.0f, -8.0f, 0.0f));
    }

    private jv0 getPaintingSize() {
        float f10;
        float f11;
        jv0 jv0Var = this.f5397x;
        if (jv0Var != null) {
            return jv0Var;
        }
        Bitmap bitmap = this.f5392f;
        jv0 jv0Var2 = new jv0(bitmap.getWidth(), bitmap.getHeight());
        float f12 = 1280;
        jv0Var2.f28201a = f12;
        float floor = (float) Math.floor((f12 * f11) / f10);
        jv0Var2.f28202b = floor;
        if (floor > f12) {
            jv0Var2.f28202b = f12;
            jv0Var2.f28201a = (float) Math.floor((f12 * f10) / f11);
        }
        this.f5397x = jv0Var2;
        return jv0Var2;
    }

    public final void a(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        dg.o1 o1Var = this.f5391e;
        float translationX = ((x10 - o1Var.getTranslationX()) - (getMeasuredWidth() / 2.0f)) / o1Var.getScaleX();
        float y10 = ((motionEvent.getY() - o1Var.getTranslationY()) - (getMeasuredHeight() / 2.0f)) / o1Var.getScaleY();
        double d = translationX;
        double radians = (float) Math.toRadians(-o1Var.getRotation());
        double d10 = y10;
        float measuredWidth = (o1Var.getMeasuredWidth() / 2.0f) + ((float) ((Math.cos(radians) * d) - (Math.sin(radians) * d10)));
        float measuredHeight = (o1Var.getMeasuredHeight() / 2.0f) + ((float) l.d.a(radians, d10, Math.sin(radians) * d));
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setLocation(measuredWidth, measuredHeight);
        o1Var.e(obtain);
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
        dg.o1 o1Var = this.f5391e;
        MediaController.CropState cropState = this.d;
        if (cropState != null) {
            float f22 = cropState.cropScale * 1.0f;
            int measuredWidth = o1Var.getMeasuredWidth();
            int measuredHeight = o1Var.getMeasuredHeight();
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
        o1Var.setScaleX(f21);
        o1Var.setScaleY(f21);
        o1Var.setTranslationX(f11);
        o1Var.setTranslationY(f20);
        o1Var.setRotation(f17);
        o1Var.invalidate();
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        MediaController.CropState cropState;
        int i10 = 0;
        if (view == this.f5391e && (cropState = this.d) != null) {
            canvas.save();
            if (!this.f5393n) {
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
        Bitmap c3 = this.f5391e.c(false, false);
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

    public dg.o1 getRenderView() {
        return this.f5391e;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (!this.f5393n) {
            int i16 = AndroidUtilities.REPLACING_TAG_TYPE_LINK;
        }
        dg.o1 o1Var = this.f5391e;
        int ceil = (int) Math.ceil((i14 - o1Var.getMeasuredWidth()) / 2.0f);
        int measuredHeight = (i15 - o1Var.getMeasuredHeight()) / 2;
        o1Var.layout(ceil, measuredHeight, o1Var.getMeasuredWidth() + ceil, o1Var.getMeasuredHeight() + measuredHeight);
        FrameLayout frameLayout = this.f5394r;
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
        Bitmap bitmap = this.f5392f;
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
        this.f5391e.measure(View.MeasureSpec.makeMeasureSpec((int) f12, 1073741824), View.MeasureSpec.makeMeasureSpec((int) floor, 1073741824));
        this.E = 1.0f;
        measureChild(this.f5396w, i10, i11);
        measureChild(this.f5394r, i10, i11);
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
        if (this.f5398y == z4) {
            return;
        }
        this.f5398y = z4;
        if (z4) {
            r22 = new Object();
        } else {
            r22 = new Object();
        }
        this.f5391e.setBrush(r22);
    }
}
