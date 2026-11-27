package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.CheckBoxBase;
public class jja extends FrameLayout {
    public static long F0;
    public static boolean G0;
    public Path A0;
    public ValueAnimator B0;
    public float C0;
    public boolean D0;
    public boolean E;
    public final mm E0;
    public boolean F;
    public StaticLayout G;
    public String H;
    public boolean I;
    public int J;
    public Bitmap K;
    public Paint L;
    public boolean M;
    public final mm N;
    public final hn O;
    public pkb P;
    public CheckBoxBase Q;
    public final gd4 R;
    public boolean S;
    public float T;
    public float U;
    public float V;
    public boolean W;
    public int a;
    public boolean a0;
    public final ImageReceiver b;
    public boolean b0;
    public final ImageReceiver c;
    public GradientDrawable c0;
    public final ImageReceiver d;
    public boolean d0;
    public sca e;
    public boolean e0;
    public final int f;
    public boolean f0;
    public boolean g0;
    public boolean h;
    public final Path h0;
    public npa i0;
    public float j0;
    public float k0;
    public float l0;
    public float m0;
    public r47 n;
    public mpa n0;
    public final Path o0;
    public pkb p0;
    public pkb q0;
    public int r;
    public pkb r0;
    public tk4 s;
    public int s0;
    public final Paint t0;
    public final Paint u0;
    public final mm v0;
    public jja w;
    public za1 w0;
    public float x;
    public boolean x0;
    public float y;
    public boolean y0;
    public final RectF z0;

    public jja(Context context, gd4 gd4Var, int i) {
        super(context);
        this.a = 0;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.b = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(null);
        this.c = imageReceiver2;
        ImageReceiver imageReceiver3 = new ImageReceiver(null);
        this.d = imageReceiver3;
        this.x = 1.0f;
        this.y = 1.0f;
        this.I = true;
        k43 k43Var = k43.h;
        this.N = new mm(this, 0L, 350L, k43Var);
        hn hnVar = new hn(false, true, true);
        this.O = hnVar;
        this.h0 = new Path();
        this.o0 = new Path();
        this.s0 = 0;
        this.t0 = new Paint(1);
        this.u0 = new Paint(1);
        this.v0 = new mm(this, 0L, 200L, k43Var);
        this.z0 = new RectF();
        this.E0 = new mm(this, 0L, 320L, k43Var);
        this.R = gd4Var;
        this.f = i;
        i(false, false);
        imageReceiver2.p0(this);
        imageReceiver.p0(this);
        imageReceiver3.p0(this);
        imageReceiver2.h1 = new hja(this, (byte) 0);
        hnVar.setCallback(this);
        hnVar.w(hl.L(12.0f));
        hnVar.u(-1);
        hnVar.x(hl.o());
        hnVar.N = hl.q.x;
        setWillNotDraw(false);
    }

    private float getPadding() {
        if (this.T != 0.0f) {
            float f = this.U;
            if (f == 9.0f || this.r == 9) {
                if (f == 9.0f) {
                    float N = hl.N(1.0f) * this.T;
                    return qd4.A(1.0f, this.T, hl.N(2.0f), N);
                }
                float N2 = hl.N(2.0f) * this.T;
                return qd4.A(1.0f, this.T, hl.N(1.0f), N2);
            }
        }
        if (this.r == 9) {
            return hl.N(1.0f);
        }
        return hl.N(2.0f);
    }

    private void setPrivacyType(int i) {
        int i2;
        if (this.J == i) {
            return;
        }
        this.J = i;
        this.K = null;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 100) {
                        i2 = 0;
                    } else {
                        i2 = 2131232301;
                    }
                } else {
                    i2 = 2131232165;
                }
            } else {
                i2 = 2131232167;
            }
        } else {
            i2 = 2131232391;
        }
        if (i2 != 0) {
            Context context = getContext();
            HashMap hashMap = (HashMap) this.R.g;
            Bitmap bitmap = (Bitmap) hashMap.get(Integer.valueOf(i2));
            if (bitmap == null) {
                Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), i2);
                int width = decodeResource.getWidth();
                int height = decodeResource.getHeight();
                Bitmap.Config config = Bitmap.Config.ARGB_8888;
                Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
                Canvas canvas = new Canvas(createBitmap);
                Paint paint = new Paint(3);
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                paint.setColorFilter(new PorterDuffColorFilter(-10461088, mode));
                canvas.drawBitmap(decodeResource, 0.0f, 0.0f, paint);
                Utilities.stackBlurBitmap(createBitmap, hl.L(1.0f));
                Bitmap createBitmap2 = Bitmap.createBitmap(decodeResource.getWidth(), decodeResource.getHeight(), config);
                Canvas canvas2 = new Canvas(createBitmap2);
                canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                canvas2.drawBitmap(createBitmap, 0.0f, 0.0f, paint);
                paint.setColorFilter(new PorterDuffColorFilter(-1, mode));
                canvas2.drawBitmap(decodeResource, 0.0f, 0.0f, paint);
                createBitmap.recycle();
                decodeResource.recycle();
                hashMap.put(Integer.valueOf(i2), createBitmap2);
                bitmap = createBitmap2;
            }
            this.K = bitmap;
        }
        invalidate();
    }

    public final void a(Canvas canvas, float f, float f2, float f3) {
        canvas.save();
        Path path = this.A0;
        if (path == null) {
            path = new Path();
            this.A0 = path;
        }
        path.rewind();
        RectF rectF = hl.P;
        rectF.set(0.0f, 0.0f, f, f2);
        float L = hl.L(12.0f) * f3;
        this.A0.addRoundRect(rectF, L, L, Path.Direction.CW);
        this.A0.close();
        canvas.clipPath(this.A0);
        canvas.scale(f / getWidth(), f2 / getHeight());
        boolean C = this.b.C();
        if (!C || f3 < 1.0f) {
            float f4 = 1.0f - f3;
            d(f4, 1.0f, f4, canvas, false);
        }
        if (C && f3 > 0.0f) {
            d(1.0f - f3, f3, 0.0f, canvas, true);
        }
        canvas.restore();
    }

    public final void b(Canvas canvas, RectF rectF, float f) {
        float f2;
        if (this.e0) {
            ImageReceiver imageReceiver = this.c;
            if ((imageReceiver == null || imageReceiver.R0) && this.h && this.P != null) {
                float L = hl.L(5.33f);
                pkb pkbVar = this.P;
                pkbVar.p = (int) (rectF.width() - (2.0f * L));
                pkbVar.t = hl.L(14.0f);
                pkbVar.a.setShadowLayer(hl.L(1.0f), 0.0f, hl.L(0.66f), aob.p1(0.4f * f, -16777216));
                float f3 = rectF.left + L;
                float f4 = rectF.top;
                if (this.r <= 2) {
                    f2 = 15.0f;
                } else {
                    f2 = 11.33f;
                }
                pkbVar.c(f3, f4 + hl.L(f2), 1.0f, aob.p1(f, -1), canvas);
            }
        }
    }

    public final void c(Canvas canvas, RectF rectF, float f) {
        int i;
        int i2;
        int i3;
        int L;
        String str;
        float f2 = f;
        if (this.E) {
            ImageReceiver imageReceiver = this.c;
            if (imageReceiver == null || imageReceiver.R0) {
                float L2 = (hl.L(20.0f) * this.C0) + rectF.width();
                float width = rectF.width() / L2;
                if (f2 < 1.0f) {
                    f2 = (float) Math.pow(f2, 8.0d);
                }
                canvas.save();
                canvas.translate(rectF.left, rectF.top);
                canvas.scale(width, width, 0.0f, rectF.height());
                canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                int i4 = this.r;
                gd4 gd4Var = this.R;
                if (i4 != 9 && this.G == null && (str = this.H) != null) {
                    this.G = new StaticLayout(this.H, (TextPaint) gd4Var.a, (int) Math.ceil(((TextPaint) gd4Var.a).measureText(str)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                } else if ((i4 >= 9 || this.H == null) && this.G != null) {
                    this.G = null;
                }
                boolean q = q(L2);
                int L3 = hl.L(8.0f);
                StaticLayout staticLayout = this.G;
                int i5 = 0;
                if (staticLayout != null) {
                    i = staticLayout.getWidth();
                } else {
                    i = 0;
                }
                int i6 = L3 + i;
                if (this.I) {
                    i2 = hl.L(10.0f);
                } else {
                    i2 = 0;
                }
                int i7 = i6 + i2;
                float L4 = hl.L(5.0f);
                float height = ((rectF.height() + hl.L(1.0f)) - hl.L(17.0f)) - hl.L(4.0f);
                if (q) {
                    i3 = hl.L(22.0f);
                } else {
                    i3 = 0;
                }
                canvas.translate(L4, height - i3);
                RectF rectF2 = hl.P;
                rectF2.set(0.0f, 0.0f, i7, hl.L(17.0f));
                int alpha = aob.i2.getAlpha();
                aob.i2.setAlpha((int) (alpha * f2));
                canvas.drawRoundRect(rectF2, hl.L(4.0f), hl.L(4.0f), aob.i2);
                aob.i2.setAlpha(alpha);
                if (this.I) {
                    canvas.save();
                    if (this.G == null) {
                        L = hl.L(5.0f);
                    } else {
                        L = hl.L(4.0f);
                    }
                    float f3 = L;
                    int L5 = hl.L(17.0f);
                    Drawable drawable = (Drawable) gd4Var.c;
                    canvas.translate(f3, (L5 - ((Drawable) gd4Var.c).getIntrinsicHeight()) / 2.0f);
                    drawable.setAlpha((int) (this.x * 255.0f * f2));
                    drawable.draw(canvas);
                    canvas.restore();
                }
                if (this.G != null) {
                    if (this.I) {
                        i5 = 10;
                    }
                    canvas.translate(hl.L(i5 + 4), (hl.L(17.0f) - this.G.getHeight()) / 2.0f);
                    TextPaint textPaint = (TextPaint) gd4Var.a;
                    int alpha2 = ((TextPaint) gd4Var.a).getAlpha();
                    textPaint.setAlpha((int) (alpha2 * f2));
                    this.G.draw(canvas);
                    textPaint.setAlpha(alpha2);
                }
                canvas.restore();
            }
        }
    }

    public final void d(float r31, float r32, float r33, android.graphics.Canvas r34, boolean r35) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jja.d(float, float, float, android.graphics.Canvas, boolean):void");
    }

    public final void e(Canvas canvas, RectF rectF, float f) {
        Bitmap bitmap;
        if (this.e0 && (bitmap = this.K) != null && !bitmap.isRecycled()) {
            int L = hl.L((rectF.width() / ((hl.L(20.0f) * this.C0) + rectF.width())) * 17.33f);
            canvas.save();
            float f2 = L;
            canvas.translate((rectF.right - f2) - hl.L(5.66f), rectF.top + hl.L(5.66f));
            Paint paint = this.L;
            if (paint == null) {
                paint = new Paint(3);
                this.L = paint;
            }
            paint.setAlpha((int) (f * 255.0f));
            RectF rectF2 = hl.P;
            rectF2.set(0.0f, 0.0f, f2, f2);
            canvas.drawBitmap(this.K, (Rect) null, rectF2, this.L);
            canvas.restore();
        }
    }

    public final void f(Canvas canvas, RectF rectF, float f) {
        float width;
        float width2;
        gd4 gd4Var;
        if (this.e0) {
            ImageReceiver imageReceiver = this.c;
            if ((imageReceiver == null || imageReceiver.R0) && this.r < 5) {
                float L = (hl.L(20.0f) * this.C0) + rectF.width();
                float width3 = rectF.width() / L;
                boolean q = q(L);
                float d = this.N.d(this.M);
                float f2 = f * d;
                if (f2 < 1.0f) {
                    f2 = (float) Math.pow(f2, 8.0d);
                }
                if (d > 0.0f) {
                    canvas.save();
                    canvas.translate(rectF.left, rectF.top);
                    if (q) {
                        width = 0.0f;
                    } else {
                        width = rectF.width();
                    }
                    canvas.scale(width3, width3, width, rectF.height());
                    canvas.clipRect(0.0f, 0.0f, rectF.width(), rectF.height());
                    hn hnVar = this.O;
                    float c = hnVar.c() + hl.L(26.0f);
                    if (q) {
                        width2 = hl.L(5.0f);
                    } else {
                        width2 = (rectF.width() - hl.L(5.0f)) - c;
                    }
                    canvas.translate(width2, ((rectF.height() + hl.L(1.0f)) - hl.L(17.0f)) - hl.L(4.0f));
                    RectF rectF2 = hl.P;
                    rectF2.set(0.0f, 0.0f, c, hl.L(17.0f));
                    int alpha = aob.i2.getAlpha();
                    aob.i2.setAlpha((int) (alpha * f2));
                    canvas.drawRoundRect(rectF2, hl.L(4.0f), hl.L(4.0f), aob.i2);
                    aob.i2.setAlpha(alpha);
                    canvas.save();
                    int L2 = hl.L(17.0f);
                    Drawable drawable = (Drawable) this.R.d;
                    canvas.translate(hl.L(3.0f), (L2 - ((Drawable) gd4Var.d).getBounds().height()) / 2.0f);
                    drawable.setAlpha((int) (this.x * 255.0f * f2));
                    drawable.draw(canvas);
                    canvas.restore();
                    canvas.translate(hl.L(22.0f), 0.0f);
                    hnVar.setBounds(0, 0, (int) c, hl.L(17.0f));
                    hnVar.C = (int) (f2 * 255.0f);
                    hnVar.draw(canvas);
                    canvas.restore();
                }
            }
        }
    }

    public final int g(r47 r47Var) {
        TL_stories.StoryItem storyItem;
        if (this.g0) {
            return 100;
        }
        if (this.e0 && r47Var != null && (storyItem = r47Var.l) != null) {
            u9b u9bVar = storyItem.parsedPrivacy;
            if (u9bVar == null) {
                u9bVar = new u9b(this.f, storyItem.privacy);
                storyItem.parsedPrivacy = u9bVar;
            }
            int i = u9bVar.a;
            if (i == 2 || i == 1 || i == 3) {
                return i;
            }
            return -1;
        }
        return -1;
    }

    public View getCrossfadeView() {
        return this.w;
    }

    public int getMessageId() {
        r47 r47Var = this.n;
        if (r47Var != null) {
            return r47Var.e1();
        }
        return 0;
    }

    public r47 getMessageObject() {
        return this.n;
    }

    public int getStyle() {
        return this.s0;
    }

    public final void i(boolean z, boolean z2) {
        boolean z3;
        int i;
        CheckBoxBase checkBoxBase = this.Q;
        if (checkBoxBase != null && checkBoxBase.q) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 == z) {
            return;
        }
        if (checkBoxBase == null) {
            CheckBoxBase checkBoxBase2 = new CheckBoxBase(21, null, this);
            this.Q = checkBoxBase2;
            checkBoxBase2.h(-1, aob.Ci, aob.k7);
            if (this.x0 && (i = this.a) != 0) {
                CheckBoxBase checkBoxBase3 = this.Q;
                int v = aob.v(i, aob.p1(0.25f, -1));
                if (checkBoxBase3.x != v) {
                    checkBoxBase3.x = v;
                    checkBoxBase3.b();
                }
            }
            this.Q.k(false);
            this.Q.d(1);
            this.Q.e(0, 0, hl.L(24.0f), hl.L(24.0f));
            if (this.S) {
                this.Q.l = true;
            }
        }
        this.Q.f(-1, z, z2);
        ValueAnimator valueAnimator = this.B0;
        if (valueAnimator != null) {
            this.B0 = null;
            valueAnimator.cancel();
        }
        float f = 0.0f;
        if (z2) {
            float f2 = this.C0;
            if (z) {
                f = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f);
            this.B0 = ofFloat;
            ofFloat.addUpdateListener(new ce0(this, (byte) 13));
            this.B0.setDuration(200L);
            this.B0.addListener(new i1a((byte) 3, this, z));
            this.B0.start();
        } else {
            if (z) {
                f = 1.0f;
            }
            this.C0 = f;
        }
        invalidate();
    }

    public final void j(boolean z, float f) {
        if (this.y != f) {
            this.y = f;
            if (z) {
                invalidate();
            }
        }
    }

    public final void k(int r29, defpackage.r47 r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jja.k(int, r47, boolean):void");
    }

    public final void l(boolean z, boolean z2) {
        if (this.D0 == z) {
            return;
        }
        this.D0 = z;
        if (!z2) {
            this.E0.a(z);
        }
        invalidate();
    }

    public final void m(String str, boolean z) {
        this.H = str;
        this.E = true;
        this.F = false;
        StaticLayout staticLayout = this.G;
        if (staticLayout != null && !staticLayout.getText().toString().equals(str)) {
            this.G = null;
        }
        this.I = z;
    }

    public final void n(float f, float f2) {
        this.k0 = f;
        this.l0 = f2;
        this.m0 = (float) Math.sqrt(Math.pow(getHeight(), 2.0d) + Math.pow(getWidth(), 2.0d));
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(ete.a(this.m0 * 0.3f, 250.0f, 550.0f));
        duration.setInterpolator(k43.j);
        duration.addUpdateListener(new ija(this, (byte) 0));
        duration.addListener(new po9(this, (byte) 15));
        duration.start();
    }

    public final void o() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jja.o():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.S = true;
        CheckBoxBase checkBoxBase = this.Q;
        if (checkBoxBase != null) {
            checkBoxBase.l = true;
        }
        if (this.n != null) {
            this.c.I();
            this.b.I();
            this.d.I();
        }
        mpa mpaVar = this.n0;
        if (mpaVar != null) {
            if (mpaVar.i) {
                this.n0 = mpa.e(this);
            } else {
                mpaVar.a(this);
            }
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.S = false;
        CheckBoxBase checkBoxBase = this.Q;
        if (checkBoxBase != null) {
            checkBoxBase.l = false;
        }
        if (this.n != null) {
            this.c.K();
            this.b.K();
            this.d.K();
        }
        mpa mpaVar = this.n0;
        if (mpaVar != null) {
            mpaVar.b(this);
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(1.0f, 1.0f, 1.0f, canvas, false);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        try {
            if (this.n != null) {
                accessibilityNodeInfo.setEnabled(true);
                accessibilityNodeInfo.setClickable(true);
                accessibilityNodeInfo.addAction(16);
            }
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        boolean z = this.e0;
        if (z) {
            i3 = (int) (size * 1.25f);
        } else {
            i3 = size;
        }
        if (z && this.r == 1) {
            i3 /= 2;
        }
        setMeasuredDimension(size, i3);
        p();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        za1 za1Var = this.w0;
        if (za1Var != null && za1Var.b(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void p() {
        if (getMeasuredHeight() > 0 && getMeasuredWidth() > 0) {
            r47 r47Var = this.n;
            if (r47Var != null && r47Var.t2()) {
                if (this.n0 == null) {
                    this.n0 = mpa.e(this);
                    return;
                }
                return;
            }
            mpa mpaVar = this.n0;
            if (mpaVar != null) {
                mpaVar.b(this);
                this.n0 = null;
            }
        }
    }

    public final boolean q(float f) {
        int i;
        int i2;
        int i3;
        int i4;
        if (this.e0 && this.r < 5) {
            int L = hl.L(26.0f) + ((int) this.O.c());
            if (this.E) {
                int L2 = hl.L(8.0f);
                StaticLayout staticLayout = this.G;
                if (staticLayout != null) {
                    i3 = staticLayout.getWidth();
                } else {
                    i3 = 0;
                }
                int i5 = L2 + i3;
                if (this.I) {
                    i4 = hl.L(10.0f);
                } else {
                    i4 = 0;
                }
                i = i5 + i4;
            } else {
                i = 0;
            }
            if (L > 0 && i > 0) {
                i2 = hl.L(8.0f);
            } else {
                i2 = 0;
            }
            if (L + i2 + i > f) {
                return true;
            }
        }
        return false;
    }

    public void setGradientView(tk4 tk4Var) {
        this.s = tk4Var;
    }

    public void setHighlightProgress(float f) {
        if (this.V != f) {
            this.V = f;
            invalidate();
        }
    }

    public void setReorder(boolean z) {
        this.y0 = z;
        invalidate();
    }

    public void setStyle(int i) {
        if (this.s0 != i) {
            this.s0 = i;
            if (i == 1) {
                CheckBoxBase checkBoxBase = new CheckBoxBase(21, null, this);
                this.Q = checkBoxBase;
                checkBoxBase.h(-1, aob.Ci, aob.k7);
                this.Q.k(true);
                this.Q.d(0);
                this.Q.e(0, 0, hl.L(24.0f), hl.L(24.0f));
                if (this.S) {
                    this.Q.l = true;
                }
                za1 za1Var = new za1(this);
                this.w0 = za1Var;
                za1Var.h = new ux9(this, (byte) 27);
            }
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.O != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    public void h() {
    }
}
