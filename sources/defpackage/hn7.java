package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;
public class hn7 extends LinearLayout implements tjb {
    public static final s33 y0 = new s33(0.0f, 0.5f, 0.5f, 1.0f);
    public int E;
    public boolean F;
    public int G;
    public boolean H;
    public int I;
    public int J;
    public fn7 K;
    public en7 L;
    public dn7 M;
    public long N;
    public final SparseArray O;
    public int[] P;
    public final Paint Q;
    public int R;
    public int S;
    public int T;
    public final kr9 U;
    public final kr9 V;
    public int W;
    public boolean a;
    public hx a0;
    public int b;
    public float b0;
    public int c;
    public long c0;
    public int d;
    public float d0;
    public final TextView e;
    public VelocityTracker e0;
    public final int f;
    public final int f0;
    public final int g0;
    public final int h;
    public final int h0;
    public boolean i0;
    public boolean j0;
    public final Paint k0;
    public final int l0;
    public byte m0;
    public final int n;
    public int n0;
    public int o0;
    public boolean p0;
    public boolean q0;
    public int r;
    public final gn7 r0;
    public final boolean s;
    public int s0;
    public final wjb t0;
    public boolean u0;
    public q8c v0;
    public final int w;
    public Integer w0;
    public int x;
    public int x0;
    public String[] y;

    public hn7(int i, wjb wjbVar, Context context) {
        super(context);
        this.b = 3;
        this.c = 1;
        this.N = 300L;
        this.O = new SparseArray();
        this.P = new int[this.b];
        this.S = Integer.MIN_VALUE;
        this.m0 = (byte) 0;
        this.s0 = -1;
        this.u0 = true;
        this.t0 = wjbVar;
        int L = gl.L(i);
        this.w = L;
        Paint paint = new Paint();
        this.k0 = paint;
        paint.setColor(bkb.v0(bkb.Ei, wjbVar));
        this.l0 = (int) TypedValue.applyDimension(1, 2.0f, getResources().getDisplayMetrics());
        TypedValue.applyDimension(1, 48.0f, getResources().getDisplayMetrics());
        this.f = -1;
        int applyDimension = (int) TypedValue.applyDimension(1, 180.0f, getResources().getDisplayMetrics());
        this.h = applyDimension;
        int i2 = this.f;
        if (i2 != -1 && applyDimension != -1 && i2 > applyDimension) {
            w26.j("minHeight > maxHeight");
            throw null;
        }
        this.n = (int) TypedValue.applyDimension(1, 64.0f, getResources().getDisplayMetrics());
        this.r = -1;
        this.s = true;
        this.r0 = new gn7(this);
        setWillNotDraw(false);
        TextView textView = new TextView(getContext());
        this.e = textView;
        textView.setGravity(17);
        this.e.setSingleLine(true);
        zkb.X(this.e, bkb.i5, wjbVar);
        this.e.setBackgroundResource(0);
        float f = L;
        this.e.setTextSize(0, f);
        this.e.setVisibility(4);
        addView(this.e, new LinearLayout.LayoutParams(-1, -2));
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f0 = viewConfiguration.getScaledTouchSlop();
        this.g0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.h0 = viewConfiguration.getScaledMaximumFlingVelocity() / 8;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setTextAlign(Paint.Align.CENTER);
        paint2.setTextSize(f);
        paint2.setTypeface(this.e.getTypeface());
        paint2.setColor(this.e.getTextColors().getColorForState(LinearLayout.ENABLED_STATE_SET, -1));
        this.Q = paint2;
        this.U = new kr9(getContext(), null);
        this.V = new kr9(getContext(), new DecelerateInterpolator(2.5f));
        n();
        setImportantForAccessibility(1);
        setAccessibilityDelegate(new cn7(this));
    }

    public static int g(int i, int i2) {
        if (i2 != -1) {
            int size = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            if (mode != Integer.MIN_VALUE) {
                if (mode != 0) {
                    if (mode != 1073741824) {
                        w26.j(de9.k(mode, "Unknown measure mode: "));
                        return 0;
                    }
                } else {
                    return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
                }
            } else {
                return View.MeasureSpec.makeMeasureSpec(Math.min(size, i2), 1073741824);
            }
        }
        return i;
    }

    public static int k(int i, int i2, int i3) {
        if (i != -1) {
            int max = Math.max(i, i2);
            int mode = View.MeasureSpec.getMode(i3);
            int size = View.MeasureSpec.getSize(i3);
            if (mode != Integer.MIN_VALUE) {
                if (mode == 1073741824) {
                    return size;
                }
            } else if (size < max) {
                return size | 16777216;
            }
            return max;
        }
        return i2;
    }

    public final void a(boolean z) {
        this.e.setVisibility(4);
        if (!h(this.U)) {
            h(this.V);
        }
        this.W = 0;
        int i = this.R;
        kr9 kr9Var = this.U;
        if (z) {
            kr9Var.d(-i, 300);
        } else {
            kr9Var.d(i, 300);
        }
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.Ei));
    }

    public final void b(int i) {
        String str;
        SparseArray sparseArray = this.O;
        if (((String) sparseArray.get(i)) != null) {
            return;
        }
        int i2 = this.E;
        if (i >= i2 && i <= this.G) {
            String[] strArr = this.y;
            if (strArr != null) {
                str = strArr[i - i2];
            } else {
                dn7 dn7Var = this.M;
                if (dn7Var != null) {
                    str = dn7Var.c(i);
                } else {
                    str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i));
                }
            }
        } else {
            str = "";
        }
        sparseArray.put(i, str);
    }

    public final boolean c() {
        int i = this.S - this.T;
        if (i == 0) {
            return false;
        }
        this.W = 0;
        int abs = Math.abs(i);
        int i2 = this.R;
        if (abs > i2 / 2) {
            if (i > 0) {
                i2 = -i2;
            }
            i += i2;
        }
        this.V.d(i, 800);
        invalidate();
        return true;
    }

    @Override
    public final void computeScroll() {
        kr9 kr9Var;
        kr9 kr9Var2 = this.U;
        if (kr9Var2.q) {
            kr9Var = this.V;
            if (kr9Var.q) {
                return;
            }
        } else {
            kr9Var = kr9Var2;
        }
        kr9Var.b();
        int i = kr9Var.k;
        int i2 = this.W;
        if (i2 == 0) {
            i2 = kr9Var.c;
            this.W = i2;
        }
        scrollBy(0, i - i2);
        this.W = i;
        if (kr9Var.q) {
            if (kr9Var == kr9Var2) {
                if (!c()) {
                    n();
                }
                i(0);
                return;
            } else if (this.m0 != 1) {
                n();
                return;
            } else {
                return;
            }
        }
        invalidate();
    }

    @Override
    public final int computeVerticalScrollExtent() {
        return getHeight();
    }

    @Override
    public final int computeVerticalScrollOffset() {
        return this.T;
    }

    @Override
    public final int computeVerticalScrollRange() {
        return ((this.G - this.E) + 1) * this.R;
    }

    public CharSequence d(int i) {
        return this.e.getText();
    }

    @Override
    public final boolean dispatchKeyEvent(android.view.KeyEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hn7.dispatchKeyEvent(android.view.KeyEvent):boolean");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            j();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 3) {
            j();
        }
        return super.dispatchTrackballEvent(motionEvent);
    }

    public final int e(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (this.H && i > (i5 = this.G) && (i7 = i5 - (i6 = this.E)) != 0) {
            return (((i - i5) % i7) + i6) - 1;
        }
        if (this.F && i < (i2 = this.E) && (i4 = (i3 = this.G) - i2) != 0) {
            return (i3 - ((i2 - i) % i4)) + 1;
        }
        return i;
    }

    public final void f() {
        this.O.clear();
        int[] iArr = this.P;
        int value = getValue();
        for (int i = 0; i < this.P.length; i++) {
            int i2 = (i - this.c) + value;
            if (this.i0) {
                i2 = e(i2);
            }
            iArr[i] = i2;
            b(i2);
        }
    }

    @Override
    public float getBottomFadingEdgeStrength() {
        return 0.9f;
    }

    public String[] getDisplayedValues() {
        return this.y;
    }

    public int getItemsCount() {
        return this.b;
    }

    public int getMaxValue() {
        return this.G;
    }

    public int getMinValue() {
        return this.E;
    }

    @Override
    public int getSolidColor() {
        return 0;
    }

    @Override
    public float getTopFadingEdgeStrength() {
        return 0.9f;
    }

    public int getValue() {
        return this.I;
    }

    public boolean getWrapSelectorWheel() {
        return this.i0;
    }

    public final boolean h(kr9 kr9Var) {
        kr9Var.q = true;
        int i = kr9Var.e - kr9Var.k;
        int i2 = this.S - ((this.T + i) % this.R);
        if (i2 == 0) {
            return false;
        }
        int abs = Math.abs(i2);
        int i3 = this.R;
        if (abs > i3 / 2) {
            if (i2 > 0) {
                i2 -= i3;
            } else {
                i2 += i3;
            }
        }
        scrollBy(0, i + i2);
        return true;
    }

    public final void i(int i) {
        String str;
        if (this.m0 != i) {
            this.m0 = i;
            en7 en7Var = this.L;
            if (en7Var != null) {
                en7Var.b(i);
            }
            if (i == 0) {
                AccessibilityManager accessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
                if (accessibilityManager.isTouchExplorationEnabled()) {
                    String[] strArr = this.y;
                    int i2 = this.I;
                    if (strArr == null) {
                        dn7 dn7Var = this.M;
                        if (dn7Var != null) {
                            str = dn7Var.c(i2);
                        } else {
                            str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i2));
                        }
                    } else {
                        str = strArr[i2 - this.E];
                    }
                    AccessibilityEvent obtain = AccessibilityEvent.obtain();
                    obtain.setEventType(16384);
                    obtain.getText().add(str);
                    accessibilityManager.sendAccessibilityEvent(obtain);
                }
            }
        }
    }

    public final void j() {
        hx hxVar = this.a0;
        if (hxVar != null) {
            removeCallbacks(hxVar);
        }
        this.r0.a();
    }

    public final void l(int i, boolean z) {
        int min;
        en7 en7Var;
        fn7 fn7Var;
        if (this.I != i) {
            if (this.i0) {
                min = e(i);
            } else {
                min = Math.min(Math.max(i, this.E), this.G);
            }
            int i2 = this.I;
            this.J = min;
            this.I = min;
            n();
            if (Math.abs(i2 - min) > 0.9f) {
                gl.W3(this);
            }
            if (z && (fn7Var = this.K) != null) {
                fn7Var.i(this, this.I);
            }
            f();
            invalidate();
            if (this.m0 == 0 && (en7Var = this.L) != null) {
                en7Var.b(0);
            }
        }
    }

    public final void m() {
        int i;
        if (this.s) {
            String[] strArr = this.y;
            Paint paint = this.Q;
            int i2 = 0;
            if (strArr == null) {
                float f = 0.0f;
                for (int i3 = 0; i3 <= 9; i3++) {
                    float measureText = paint.measureText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i3)));
                    if (measureText > f) {
                        f = measureText;
                    }
                }
                for (int i4 = this.G; i4 > 0; i4 /= 10) {
                    i2++;
                }
                i = (int) (i2 * f);
            } else {
                int length = strArr.length;
                int i5 = 0;
                while (i2 < length) {
                    float measureText2 = paint.measureText(strArr[i2]);
                    if (measureText2 > i5) {
                        i5 = (int) measureText2;
                    }
                    i2++;
                }
                i = i5;
            }
            TextView textView = this.e;
            int paddingRight = textView.getPaddingRight() + textView.getPaddingLeft() + i;
            if (this.r != paddingRight) {
                int i6 = this.n;
                if (paddingRight > i6) {
                    this.r = paddingRight;
                } else {
                    this.r = i6;
                }
                invalidate();
            }
        }
    }

    public final void n() {
        String str;
        String[] strArr = this.y;
        int i = this.I;
        if (strArr == null) {
            dn7 dn7Var = this.M;
            if (dn7Var != null) {
                str = dn7Var.c(i);
            } else {
                str = String.format(Locale.getDefault(), "%d", Integer.valueOf(i));
            }
        } else {
            str = strArr[i - this.E];
        }
        if (!TextUtils.isEmpty(str)) {
            TextView textView = this.e;
            if (!str.equals(textView.getText().toString())) {
                textView.setText(str);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j();
    }

    @Override
    public void onDraw(Canvas canvas) {
        float width;
        int i;
        float measuredHeight;
        boolean z;
        int i2;
        int i3 = this.x0;
        Paint paint = this.Q;
        int i4 = 3;
        if (i3 == 5) {
            paint.setTextAlign(Paint.Align.RIGHT);
            width = getWidth();
        } else if (i3 == 3) {
            paint.setTextAlign(Paint.Align.LEFT);
            width = 0.0f;
        } else {
            paint.setTextAlign(Paint.Align.CENTER);
            width = getWidth() / 2.0f;
        }
        float f = width + this.d;
        float f2 = this.T;
        int[] iArr = this.P;
        int i5 = 0;
        while (i5 < iArr.length) {
            String str = (String) this.O.get(iArr[i5]);
            if (str != null && (i5 != this.c || this.e.getVisibility() != 0)) {
                if (this.b > i4) {
                    float measuredHeight2 = getMeasuredHeight() * 0.5f;
                    float textSize = f2 - (paint.getTextSize() / 2.0f);
                    if (textSize < getMeasuredHeight() / 2.0f) {
                        measuredHeight = textSize / measuredHeight2;
                        z = true;
                    } else {
                        measuredHeight = (getMeasuredHeight() - textSize) / measuredHeight2;
                        z = false;
                    }
                    float interpolation = y0.getInterpolation(Utilities.i(measuredHeight, 1.0f, 0.0f));
                    float textSize2 = paint.getTextSize() * (1.0f - interpolation);
                    if (!z) {
                        textSize2 = -textSize2;
                    }
                    canvas.save();
                    canvas.translate(0.0f, textSize2);
                    canvas.scale((0.2f * interpolation) + 0.8f, interpolation, f, textSize);
                    if (interpolation < 0.1f) {
                        i2 = paint.getAlpha();
                        paint.setAlpha((int) ((i2 * interpolation) / 0.1f));
                    } else {
                        i2 = -1;
                    }
                    canvas.drawText(str, f, f2, paint);
                    canvas.restore();
                    if (i2 != -1) {
                        paint.setAlpha(i2);
                    }
                } else {
                    canvas.drawText(str, f, f2, paint);
                }
            }
            f2 += this.R;
            i5++;
            i4 = 3;
        }
        if (this.u0) {
            int i6 = this.n0;
            int i7 = this.l0;
            canvas.drawRect(0.0f, i6, getRight(), i6 + i7, this.k0);
            canvas.drawRect(0.0f, i - i7, getRight(), this.o0, this.k0);
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || motionEvent.getActionMasked() != 0) {
            return false;
        }
        j();
        this.e.setVisibility(4);
        float y = motionEvent.getY();
        this.b0 = y;
        this.d0 = y;
        this.c0 = motionEvent.getEventTime();
        float f = this.b0;
        int i = (f > this.n0 ? 1 : (f == this.n0 ? 0 : -1));
        gn7 gn7Var = this.r0;
        if (i < 0) {
            if (this.m0 == 0) {
                gn7Var.a();
                gn7Var.b = (byte) 1;
                gn7Var.a = (byte) 2;
                gn7Var.c.postDelayed(gn7Var, ViewConfiguration.getTapTimeout());
            }
        } else if (f > this.o0 && this.m0 == 0) {
            gn7Var.a();
            gn7Var.b = (byte) 1;
            gn7Var.a = (byte) 1;
            gn7Var.c.postDelayed(gn7Var, ViewConfiguration.getTapTimeout());
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        kr9 kr9Var = this.U;
        boolean z = kr9Var.q;
        kr9 kr9Var2 = this.V;
        if (!z) {
            kr9Var.q = true;
            kr9Var2.q = true;
            i(0);
            return true;
        } else if (!kr9Var2.q) {
            kr9Var.q = true;
            kr9Var2.q = true;
            return true;
        } else {
            float f2 = this.b0;
            if (f2 < this.n0) {
                long longPressTimeout = ViewConfiguration.getLongPressTimeout();
                Runnable runnable = this.a0;
                if (runnable == null) {
                    this.a0 = new hx(this, (byte) 2);
                } else {
                    removeCallbacks(runnable);
                }
                hx hxVar = this.a0;
                hxVar.b = false;
                postDelayed(hxVar, longPressTimeout);
                return true;
            }
            if (f2 > this.o0) {
                long longPressTimeout2 = ViewConfiguration.getLongPressTimeout();
                Runnable runnable2 = this.a0;
                if (runnable2 == null) {
                    this.a0 = new hx(this, (byte) 2);
                } else {
                    removeCallbacks(runnable2);
                }
                hx hxVar2 = this.a0;
                hxVar2.b = true;
                postDelayed(hxVar2, longPressTimeout2);
            }
            return true;
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        TextView textView = this.e;
        int measuredWidth2 = textView.getMeasuredWidth();
        int measuredHeight2 = textView.getMeasuredHeight();
        int i5 = (measuredWidth - measuredWidth2) / 2;
        int i6 = (measuredHeight - measuredHeight2) / 2;
        textView.layout(i5, i6, measuredWidth2 + i5, measuredHeight2 + i6);
        if (z) {
            f();
            int[] iArr = this.P;
            int length = iArr.length;
            int i7 = this.w;
            int bottom = (int) (((((getBottom() - getTop()) + i7) - (length * i7)) / iArr.length) + 0.5f);
            this.x = bottom;
            this.R = bottom + i7;
            int top = (textView.getTop() + textView.getBaseline()) - (this.R * this.c);
            this.S = top;
            this.T = top;
            n();
            setVerticalFadingEdgeEnabled(true);
            setFadingEdgeLength(((getBottom() - getTop()) - i7) / 2);
            this.n0 = ((getHeight() - i7) - this.x) / 2;
            this.o0 = ((getHeight() + i7) + this.x) / 2;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(g(i, this.r), g(i2, this.h));
        setMeasuredDimension(k(this.n, getMeasuredWidth(), i), k(this.f, getMeasuredHeight(), i2));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        VelocityTracker velocityTracker = this.e0;
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            this.e0 = velocityTracker;
        }
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int i = this.f0;
        if (actionMasked != 1) {
            if (actionMasked != 2) {
                return true;
            }
            float y = motionEvent.getY();
            if (this.m0 != 1) {
                if (((int) Math.abs(y - this.b0)) > i) {
                    j();
                    i(1);
                }
            } else {
                scrollBy(0, (int) (y - this.d0));
                invalidate();
            }
            this.d0 = y;
            return true;
        }
        hx hxVar = this.a0;
        if (hxVar != null) {
            removeCallbacks(hxVar);
        }
        gn7 gn7Var = this.r0;
        gn7Var.a();
        VelocityTracker velocityTracker2 = this.e0;
        velocityTracker2.computeCurrentVelocity(1000, this.h0);
        int yVelocity = (int) velocityTracker2.getYVelocity();
        if (Math.abs(yVelocity) > this.g0) {
            this.W = 0;
            kr9 kr9Var = this.U;
            if (yVelocity > 0) {
                kr9Var.c(0, 0, 0, yVelocity, 0, 0, 0, Integer.MAX_VALUE);
            } else {
                kr9Var.c(0, Integer.MAX_VALUE, 0, yVelocity, 0, 0, 0, Integer.MAX_VALUE);
            }
            invalidate();
            i(2);
        } else {
            int y2 = (int) motionEvent.getY();
            int abs = (int) Math.abs(y2 - this.b0);
            long eventTime = motionEvent.getEventTime() - this.c0;
            if (abs <= i && eventTime < ViewConfiguration.getTapTimeout()) {
                int i2 = (y2 / this.R) - this.c;
                if (i2 > 0) {
                    a(true);
                    gn7Var.a();
                    gn7Var.b = (byte) 2;
                    gn7Var.a = (byte) 1;
                    gn7Var.c.post(gn7Var);
                } else if (i2 < 0) {
                    a(false);
                    gn7Var.a();
                    gn7Var.b = (byte) 2;
                    gn7Var.a = (byte) 2;
                    gn7Var.c.post(gn7Var);
                }
            } else {
                c();
            }
            i(0);
        }
        this.e0.recycle();
        this.e0 = null;
        return true;
    }

    @Override
    public final void scrollBy(int i, int i2) {
        int[] iArr = this.P;
        boolean z = this.i0;
        if (!z && i2 > 0 && iArr[this.c] <= this.E) {
            int i3 = this.T + i2;
            int i4 = this.S;
            if (i3 > i4) {
                this.T = i4;
                return;
            }
        }
        if (!z && i2 < 0 && iArr[this.c] >= this.G) {
            int i5 = this.T + i2;
            int i6 = this.S;
            if (i5 < i6) {
                this.T = i6;
                return;
            }
        }
        this.T += i2;
        while (true) {
            int i7 = this.T;
            if (i7 - this.S <= this.x) {
                break;
            }
            this.T = i7 - this.R;
            System.arraycopy(iArr, 0, iArr, 1, iArr.length - 1);
            int i8 = iArr[1] - 1;
            if (this.i0 && i8 < this.E) {
                i8 = this.G;
            }
            iArr[0] = i8;
            b(i8);
            if (!this.i0 && iArr[this.c] <= this.E) {
                int i9 = this.T;
                int i10 = this.S;
                if (i9 > i10) {
                    this.T = i10;
                }
            }
        }
        while (true) {
            int i11 = this.T;
            if (i11 - this.S < (-this.x)) {
                this.T = i11 + this.R;
                System.arraycopy(iArr, 1, iArr, 0, iArr.length - 1);
                int i12 = iArr[iArr.length - 2] + 1;
                if (this.i0 && i12 > this.G) {
                    i12 = this.E;
                }
                iArr[iArr.length - 1] = i12;
                b(i12);
                if (!this.i0 && iArr[this.c] >= this.G) {
                    int i13 = this.T;
                    int i14 = this.S;
                    if (i13 < i14) {
                        this.T = i14;
                    }
                }
            } else {
                l(iArr[this.c], true);
                return;
            }
        }
    }

    public void setAllItemsCount(int i) {
        this.w0 = Integer.valueOf(i);
        setWrapSelectorWheel(this.j0);
    }

    public void setContentDescriptionCallback(q8c q8cVar) {
        this.v0 = q8cVar;
    }

    public void setDisplayedValues(String[] strArr) {
        if (this.y == strArr) {
            return;
        }
        this.y = strArr;
        n();
        f();
        m();
    }

    public void setDrawDividers(boolean z) {
        this.u0 = z;
        invalidate();
    }

    @Override
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.e.setEnabled(z);
    }

    public void setFormatter(dn7 dn7Var) {
        if (dn7Var == this.M) {
            return;
        }
        this.M = dn7Var;
        f();
        n();
    }

    @Override
    public void setGravity(int i) {
        this.x0 = i;
        super.setGravity(i);
    }

    public void setItemCount(int i) {
        if (this.b == i) {
            return;
        }
        this.b = i;
        this.c = i / 2;
        this.P = new int[i];
        f();
    }

    public void setMaxValue(int i) {
        en7 en7Var;
        this.H = true;
        if (this.G != i) {
            if (i >= 0) {
                this.G = i;
                if (i < this.I) {
                    int i2 = this.J;
                    if (i >= i2) {
                        this.I = i2;
                    } else {
                        this.I = i;
                    }
                }
                setWrapSelectorWheel(this.j0);
                f();
                n();
                m();
                invalidate();
                if (this.m0 == 0 && (en7Var = this.L) != null) {
                    en7Var.b(0);
                    return;
                }
                return;
            }
            w26.j("maxValue must be >= 0");
        }
    }

    public void setMinValue(int i) {
        en7 en7Var;
        this.F = true;
        if (this.E != i) {
            if (i >= 0) {
                this.E = i;
                if (i > this.I) {
                    int i2 = this.J;
                    if (i <= i2) {
                        this.I = i2;
                    } else {
                        this.I = i;
                    }
                }
                setWrapSelectorWheel(this.j0);
                f();
                n();
                m();
                invalidate();
                if (this.m0 == 0 && (en7Var = this.L) != null) {
                    en7Var.b(0);
                    return;
                }
                return;
            }
            w26.j("minValue must be >= 0");
        }
    }

    public void setOnLongPressUpdateInterval(long j) {
        this.N = j;
    }

    public void setOnScrollListener(en7 en7Var) {
        this.L = en7Var;
    }

    public void setOnValueChangedListener(fn7 fn7Var) {
        this.K = fn7Var;
    }

    public void setSelectorColor(int i) {
        this.a = true;
        this.k0.setColor(i);
    }

    public void setTextColor(int i) {
        zkb.q(this.e);
        this.e.setTextColor(i);
        this.Q.setColor(i);
    }

    public void setTextOffset(int i) {
        this.d = i;
        invalidate();
    }

    public void setValue(int i) {
        l(i, false);
    }

    public void setWrapSelectorWheel(boolean r5) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hn7.setWrapSelectorWheel(boolean):void");
    }

    @Override
    public final void updateColors() {
        Paint paint;
        try {
            if (!this.a && (paint = this.k0) != null) {
                paint.setColor(bkb.v0(bkb.Ei, this.t0));
                invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    public hn7(Context context, wjb wjbVar) {
        this(18, wjbVar, context);
    }

    public hn7(LaunchActivity launchActivity) {
        this(launchActivity, null);
    }
}
