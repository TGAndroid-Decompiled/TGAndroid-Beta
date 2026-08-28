package bh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import bg.z;
import ff.c0;
import g7.e6;
import g7.n;
import gh.g5;
import gh.k5;
import gh.l4;
import gh.s3;
import gh.t3;
import kh.s5;
import kh.x3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.l0;
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.Cells.t1;
import org.telegram.ui.Cells.w0;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.pa;
import org.telegram.ui.Components.r7;
import org.telegram.ui.Components.tf0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z21;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.b1;
import org.telegram.ui.dc1;
import org.telegram.ui.m0;
import org.telegram.ui.ob1;
import org.telegram.ui.oc1;
import org.telegram.ui.ta1;
import org.telegram.ui.u5;
import org.telegram.ui.w21;
import org.telegram.ui.yr0;
import org.telegram.ui.zr0;
import yf.e1;
import zf.a1;
import zf.f0;
import zf.t;
import zf.x0;
import zf.z0;
public final class g extends FrameLayout {
    public final int f2026a = 3;
    public Object f2027b;
    public Object f2028c;
    public Object d;
    public Object f2029e;

    public g(Context context) {
        super(context);
    }

    public float a() {
        k5 k5Var = (k5) this.f2029e;
        return (k5Var.U0.a(3) * k5Var.f8429w0.getMeasuredHeight()) + (k5Var.U0.a(2) * k5Var.f8427u0.getMeasuredHeight()) + (k5Var.U0.a(1) * k5Var.f8420n0.getMeasuredHeight()) + (k5Var.U0.a(0) * k5Var.f8399b0.getMeasuredHeight()) + k5Var.f8397a0.getRealHeight() + 0.0f;
    }

    public void b(boolean z10) {
        int i9;
        float f10;
        float f11;
        ImageView imageView = (ImageView) this.f2027b;
        if (z10) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        imageView.setVisibility(i9);
        TextView textView = (TextView) this.f2028c;
        boolean z11 = LocaleController.isRTL;
        if (!z11 && z10) {
            f10 = 53.0f;
        } else {
            f10 = 22.0f;
        }
        if (z11 && z10) {
            f11 = 53.0f;
        } else {
            f11 = 22.0f;
        }
        textView.setLayoutParams(e6.d(-1, -2.0f, 55, f10, 14.0f, f11, 12.0f));
    }

    public void c(int i9, String str) {
        ((TextView) this.f2028c).setText(str);
        ((ImageView) this.f2027b).setImageDrawable(getContext().getDrawable(i9));
    }

    public float d() {
        l4 l4Var;
        float max = Math.max(0.0f, getHeight() - a());
        k5 k5Var = (k5) this.f2029e;
        wk0 wk0Var = k5Var.d;
        int childCount = wk0Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = wk0Var.getChildAt(childCount);
            wk0Var.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                if (R == 2) {
                    max = childAt.getHeight() + childAt.getTranslationY() + childAt.getTop();
                    break;
                } else if (R == 1) {
                    max = childAt.getY();
                    break;
                } else if (R == 0) {
                    max = childAt.getY() - k5Var.f8397a0.getRealHeight();
                    break;
                }
            }
            childCount--;
        }
        float a2 = (k5Var.U0.a(4) * k5Var.getBottomInset()) + max;
        Float f10 = k5Var.T0;
        if (f10 != null && (l4Var = k5Var.U0) != null && l4Var.f8488a < 1.0f) {
            return AndroidUtilities.lerp(f10.floatValue(), a2, k5Var.U0.f8488a);
        }
        return a2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        int v;
        FrameLayout frameLayout;
        int i9;
        Paint e10;
        float globalXOffset;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float globalXOffset2;
        Drawable drawable;
        int i10;
        Drawable drawable2;
        switch (this.f2026a) {
            case 1:
                k5 k5Var = (k5) this.f2029e;
                k5Var.H(canvas, this);
                canvas.save();
                float d = d();
                float dp = AndroidUtilities.dp(12.0f);
                RectF rectF = (RectF) this.f2027b;
                rectF.set(k5.n1(k5Var), d, getWidth() - k5.o1(k5Var), getHeight() + dp);
                Paint paint = (Paint) this.f2028c;
                paint.setColor(k5Var.getThemedColor(f6.f23072h5));
                Path path = (Path) this.d;
                path.rewind();
                path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
                canvas.drawPath(path, paint);
                super.dispatchDraw(canvas);
                e();
                canvas.restore();
                pa paVar = k5Var.f32408e;
                if (paVar != null && paVar.getVisibility() == 0 && paVar.getAlpha() > 0.0f) {
                    if (paVar.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(paVar.getX(), paVar.getY(), paVar.getX() + paVar.getMeasuredWidth(), paVar.getY() + paVar.getMeasuredHeight(), (int) (paVar.getAlpha() * 255.0f), 31);
                    } else {
                        canvas.save();
                        canvas.clipRect(paVar.getX(), paVar.getY(), paVar.getX() + paVar.getMeasuredWidth(), paVar.getY() + paVar.getMeasuredHeight());
                    }
                    canvas.translate(paVar.getX(), paVar.getY());
                    paVar.draw(canvas);
                    canvas.restore();
                }
                k5Var.G(canvas, this);
                return;
            case 2:
            case 3:
            case 6:
            case 8:
            default:
                super.dispatchDraw(canvas);
                return;
            case 4:
                Path path2 = (Path) this.f2027b;
                z21 z21Var = (z21) this.f2029e;
                boolean z11 = true;
                float z12 = z21Var.z(true);
                float lerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(12.0f), n.a(z12 / AndroidUtilities.dpf2(24.0f), 0.0f, 1.0f));
                z21Var.f35176x.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, z12));
                if (z12 <= AndroidUtilities.statusBarHeight / 2.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean bool = (Boolean) this.d;
                if (bool == null || bool.booleanValue() != z10) {
                    this.d = Boolean.valueOf(z10);
                    Window window = z21Var.getWindow();
                    if (z10) {
                        v = z21Var.getThemedColor(f6.f23072h5);
                    } else {
                        v = f6.v(z21Var.getThemedColor(f6.f23269s8), 855638016);
                    }
                    if (AndroidUtilities.computePerceivedBrightness(v) <= 0.721f) {
                        z11 = false;
                    }
                    AndroidUtilities.setLightStatusBar(window, z11);
                }
                z21Var.topBulletinContainer.setTranslationY(Math.max(z21Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, z12) + getTranslationY() + ((-frameLayout.getTop()) - z21Var.topBulletinContainer.getHeight()));
                path2.rewind();
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, z12, getWidth(), getHeight() + lerp);
                path2.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
                canvas.drawPath(path2, (Paint) this.f2028c);
                super.dispatchDraw(canvas);
                return;
            case 5:
                LinearGradient linearGradient = (LinearGradient) this.f2028c;
                Matrix matrix = (Matrix) this.d;
                Paint paint2 = (Paint) this.f2027b;
                PhotoViewer photoViewer = (PhotoViewer) this.f2029e;
                if (!photoViewer.O4) {
                    if (photoViewer.f35663j0.getVisibility() == 0) {
                        i9 = getMeasuredHeight() - AndroidUtilities.dp(48.0f);
                    } else {
                        i9 = 0;
                    }
                    int i11 = photoViewer.Y1;
                    if (i11 != 0 && i11 != 2 && i11 != -1) {
                        paint2.setShader(null);
                        paint2.setColor(2130706432);
                    } else {
                        matrix.reset();
                        matrix.postTranslate(0.0f, i9);
                        matrix.postScale(1.0f, Math.min(AndroidUtilities.dp(40.0f), getMeasuredHeight() - i9) / 16.0f);
                        linearGradient.setLocalMatrix(matrix);
                        paint2.setShader(linearGradient);
                    }
                    canvas.drawRect(0.0f, i9, getMeasuredWidth(), getMeasuredHeight(), paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 7:
                Paint paint3 = (Paint) this.d;
                Paint paint4 = (Paint) this.f2028c;
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                float dp2 = AndroidUtilities.dp(8.0f);
                Paint paint5 = (Paint) this.f2027b;
                paint5.setColor(0);
                float dpf2 = AndroidUtilities.dpf2(1.0f);
                float dpf22 = AndroidUtilities.dpf2(0.33f);
                oc1 oc1Var = (oc1) this.f2029e;
                paint5.setShadowLayer(dpf2, 0.0f, dpf22, i0.a.k(-16777216, (int) (oc1Var.N1.getAlpha() * 27.0f)));
                canvas.drawRoundRect(rectF3, dp2, dp2, paint5);
                dc1 dc1Var = oc1Var.f41105t0;
                ob1 ob1Var = oc1Var.f41056a;
                f6.s(this, dc1Var, ob1Var);
                Paint O = ob1Var.O("paintChatActionBackground");
                int alpha = O.getAlpha();
                O.setAlpha((int) (oc1Var.N1.getAlpha() * alpha));
                canvas.drawRoundRect(rectF3, dp2, dp2, O);
                O.setAlpha(alpha);
                if (oc1Var.I1) {
                    float f10 = oc1Var.f41085j1;
                    if (f10 > 0.0f) {
                        paint3.setColor(i0.a.k(-16777216, (int) (f10 * 255.0f * oc1Var.f41087k1)));
                        canvas.drawRoundRect(rectF3, dp2, dp2, paint3);
                    }
                }
                paint4.setColor(520093695);
                paint4.setAlpha((int) (oc1Var.N1.getAlpha() * 30.0f));
                canvas.drawRoundRect(rectF3, dp2, dp2, paint4);
                super.dispatchDraw(canvas);
                return;
            case 9:
                b6 b6Var = (b6) this.d;
                Paint paint6 = (Paint) this.f2027b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f2029e;
                if (limitPreviewView.L) {
                    if (!limitPreviewView.V && !limitPreviewView.N) {
                        paint6.setColor(f6.v0(f6.f23020e7, b6Var));
                    } else {
                        paint6.setColor(f6.v0(f6.f23092i6, b6Var));
                    }
                } else {
                    paint6.setColor(f6.v0(f6.f22947a7, b6Var));
                }
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                t tVar = limitPreviewView.f26448a0;
                if (tVar != null) {
                    canvas.drawRoundRect(rectF4, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ((u5) ((b1) tVar).f36593b).s0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                } else {
                    canvas.drawRoundRect(rectF4, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint6);
                }
                canvas.save();
                if (!limitPreviewView.L) {
                    canvas.clipRect(limitPreviewView.f26459n, 0, getMeasuredWidth(), getMeasuredHeight());
                }
                if (limitPreviewView.N) {
                    e10 = limitPreviewView.G;
                } else if (limitPreviewView.f26448a0 != null) {
                    e10 = (Paint) this.f2028c;
                } else {
                    e10 = a1.d().e();
                }
                ViewGroup viewGroup = limitPreviewView.f26464y;
                if (viewGroup != null) {
                    z0 z0Var = limitPreviewView.A;
                    if (z0Var != null) {
                        e10 = z0Var.f50792f;
                        z0Var.a();
                        Matrix matrix2 = z0Var.f50791e;
                        matrix2.reset();
                        matrix2.postScale(1.0f, limitPreviewView.f26451c / 100.0f, 0.0f, 0.0f);
                        matrix2.postTranslate(0.0f, -limitPreviewView.B);
                        z0Var.d.setLocalMatrix(matrix2);
                    } else {
                        float f11 = 0.0f;
                        for (View view = this; view != viewGroup; view = (View) view.getParent()) {
                            f11 += view.getY();
                        }
                        a1 d9 = a1.d();
                        int measuredWidth = viewGroup.getMeasuredWidth();
                        int measuredHeight = viewGroup.getMeasuredHeight();
                        globalXOffset2 = limitPreviewView.getGlobalXOffset();
                        d9.f(globalXOffset2 - getLeft(), -f11, measuredWidth, measuredHeight);
                    }
                } else {
                    a1 d10 = a1.d();
                    int measuredWidth2 = limitPreviewView.getMeasuredWidth();
                    int measuredHeight2 = limitPreviewView.getMeasuredHeight();
                    globalXOffset = limitPreviewView.getGlobalXOffset();
                    d10.f(globalXOffset - getLeft(), -getTop(), measuredWidth2, measuredHeight2);
                }
                int alpha2 = e10.getAlpha();
                if (limitPreviewView.R && (valueAnimator2 = limitPreviewView.f26455e0) != null) {
                    e10.setAlpha((int) ((1.0f - ((Float) valueAnimator2.getAnimatedValue()).floatValue()) * alpha2));
                } else if (limitPreviewView.Q && (valueAnimator = limitPreviewView.f26455e0) != null) {
                    e10.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * alpha2));
                }
                if (limitPreviewView.L) {
                    if (!limitPreviewView.H && !limitPreviewView.I) {
                        AndroidUtilities.rectTmp.set(0.0f, 0.0f, limitPreviewView.f26459n, getMeasuredHeight());
                    } else {
                        AndroidUtilities.rectTmp.set(limitPreviewView.f26459n, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    }
                }
                canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), e10);
                e10.setAlpha(alpha2);
                canvas.restore();
                if (limitPreviewView.A == null && limitPreviewView.W) {
                    invalidate();
                }
                super.dispatchDraw(canvas);
                return;
            case 10:
                Paint paint7 = (Paint) this.f2028c;
                paint7.setColor(f6.v0(f6.Ii, (b6) this.d));
                f0 f0Var = (f0) this.f2029e;
                canvas.drawLine(AndroidUtilities.dp(18.0f), getHeight() / 2.0f, f0Var.d.getLeft() - AndroidUtilities.dp(20.0f), getHeight() / 2.0f, paint7);
                canvas.drawLine(AndroidUtilities.dp(20.0f) + f0Var.d.getRight(), getHeight() / 2.0f, getWidth() - AndroidUtilities.dp(18.0f), getHeight() / 2.0f, paint7);
                RectF rectF5 = AndroidUtilities.rectTmp;
                int top = f0Var.d.getTop();
                rectF5.set(f0Var.d.getLeft() - AndroidUtilities.dp(15.0f), ((f0Var.d.getBottom() + top) - AndroidUtilities.dp(30.0f)) / 2.0f, AndroidUtilities.dp(15.0f) + f0Var.d.getRight(), (AndroidUtilities.dp(30.0f) + (f0Var.d.getBottom() + f0Var.d.getTop())) / 2.0f);
                canvas.save();
                canvas.translate(rectF5.left, rectF5.top);
                rectF5.set(0.0f, 0.0f, rectF5.width(), rectF5.height());
                z0 z0Var2 = (z0) this.f2027b;
                z0Var2.e(rectF5);
                canvas.drawRoundRect(rectF5, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), z0Var2.f50792f);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            case 11:
                Drawable drawable3 = (Drawable) this.d;
                x0 x0Var = (x0) this.f2029e;
                drawable = ((f3) x0Var).shadowDrawable;
                int i12 = x0Var.I;
                i10 = ((f3) x0Var).backgroundPaddingTop;
                drawable.setBounds(0, ll.D(2.0f, i10 + i12, 1), getMeasuredWidth(), getMeasuredHeight());
                drawable2 = ((f3) x0Var).shadowDrawable;
                drawable2.draw(canvas);
                super.dispatchDraw(canvas);
                r7 r7Var = x0Var.J;
                if (r7Var != null && r7Var.getVisibility() == 0 && x0Var.J.getAlpha() != 0.0f) {
                    drawable3.setBounds(0, x0Var.J.getBottom(), getMeasuredWidth(), drawable3.getIntrinsicHeight() + x0Var.J.getBottom());
                    drawable3.setAlpha((int) (x0Var.J.getAlpha() * 255.0f));
                    drawable3.draw(canvas);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i9;
        switch (this.f2026a) {
            case 1:
                k5 k5Var = (k5) this.f2029e;
                if (motionEvent.getAction() == 0 && motionEvent.getY() < d() && k5.l1(k5Var).isAttachedToWindow()) {
                    k5Var.dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 4:
                z21 z21Var = (z21) this.f2029e;
                if (z21Var.F != null && z21Var.G != null) {
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                        Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + z21Var.F.y());
                    }
                    if (z21Var.F.y() && z21Var.G.onTouchEvent(motionEvent)) {
                        Log.d("TA2", "overlay consumed (handle)");
                        return true;
                    }
                    boolean b10 = z21Var.G.b(motionEvent);
                    if (motionEvent.getAction() == 1) {
                        Log.d("TA2", "checkOnTap=" + b10);
                    }
                    if (b10) {
                        motionEvent.setAction(3);
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 11:
                x0 x0Var = (x0) this.f2029e;
                if (motionEvent.getAction() == 0) {
                    float y10 = motionEvent.getY();
                    int i10 = x0Var.I;
                    i9 = ((f3) x0Var).backgroundPaddingTop;
                    if (y10 < AndroidUtilities.dp(2.0f) + (i10 - i9)) {
                        x0Var.dismiss();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f2026a) {
            case 2:
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), ((u5) this.f2029e).s0(getX() + ((ViewGroup) getParent()).getX(), ((ViewGroup) getParent().getParent().getParent()).getY()));
                invalidate();
                super.draw(canvas);
                return;
            default:
                super.draw(canvas);
                return;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        ImageReceiver photoImage;
        switch (this.f2026a) {
            case 0:
                b6 b6Var = (b6) this.d;
                c0 c0Var = (c0) this.f2028c;
                c0 c0Var2 = (c0) this.f2027b;
                boolean drawChild = super.drawChild(canvas, view, j10);
                j jVar = (j) this.f2029e;
                int i9 = (int) jVar.T.f47780e;
                if (view == jVar.f2038d0 && i9 > 0) {
                    c0Var2.setBounds(0, AndroidUtilities.dp(40.0f), getWidth(), AndroidUtilities.dp(48.0f));
                    int i10 = f6.f23072h5;
                    c0Var2.b(f6.v0(i10, b6Var));
                    c0Var2.draw(canvas);
                    int dp = AndroidUtilities.dp(48.0f) + i9;
                    c0Var.setBounds(0, dp - AndroidUtilities.dp(8.0f), getWidth(), dp);
                    c0Var.b(f6.v0(i10, b6Var));
                    c0Var.draw(canvas);
                }
                return drawChild;
            case 1:
                k5 k5Var = (k5) this.f2029e;
                if (view == k5Var.f32408e) {
                    return false;
                }
                if (view != k5Var.Z) {
                    canvas.save();
                    canvas.clipPath((Path) this.d);
                    boolean drawChild2 = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild2;
                }
                return super.drawChild(canvas, view, j10);
            case 8:
                float[] fArr = (float[]) this.f2028c;
                Path path = (Path) this.d;
                Matrix matrix = (Matrix) this.f2027b;
                s5 s5Var = (s5) this.f2029e;
                yf.x0 x0Var = s5Var.f49793n0;
                if (view == s5Var.f49798s0) {
                    t1 q10 = e1.q(s5Var);
                    if (q10 == null || (photoImage = q10.getPhotoImage()) == null) {
                        return false;
                    }
                    matrix.reset();
                    float max = Math.max(photoImage.getImageWidth() / s5Var.f49800u0, photoImage.getImageHeight() / s5Var.f49801v0);
                    matrix.postScale((s5Var.f49800u0 / s5Var.f49798s0.getWidth()) * max, (s5Var.f49801v0 / s5Var.f49798s0.getHeight()) * max);
                    matrix.postTranslate((photoImage.getCenterX() + (q10.getX() + x0Var.getX())) - ((s5Var.f49800u0 * max) / 2.0f), (photoImage.getCenterY() + (q10.getY() + x0Var.getY())) - ((s5Var.f49801v0 * max) / 2.0f));
                    s5Var.f49798s0.setTransform(matrix);
                    canvas.save();
                    path.rewind();
                    AndroidUtilities.rectTmp.set(photoImage.getImageX() + q10.getX() + x0Var.getX(), photoImage.getImageY() + q10.getY() + x0Var.getY(), photoImage.getImageX2() + q10.getX() + x0Var.getX(), photoImage.getImageY2() + q10.getY() + x0Var.getY());
                    for (int i11 = 0; i11 < photoImage.getRoundRadius().length; i11++) {
                        int i12 = i11 * 2;
                        fArr[i12] = photoImage.getRoundRadius()[i11];
                        fArr[i12 + 1] = photoImage.getRoundRadius()[i11];
                    }
                    path.addRoundRect(AndroidUtilities.rectTmp, fArr, Path.Direction.CW);
                    canvas.clipPath(path);
                    boolean drawChild3 = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild3;
                }
                return super.drawChild(canvas, view, j10);
            case 11:
                Path path2 = (Path) this.f2027b;
                if (view == ((ScrollView) this.f2028c)) {
                    canvas.save();
                    path2.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(getPaddingLeft(), AndroidUtilities.dp(18.0f) + ((x0) this.f2029e).I, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
                    path2.addRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Path.Direction.CW);
                    canvas.clipPath(path2);
                    super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    public void e() {
        float d = d();
        k5 k5Var = (k5) this.f2029e;
        s3 s3Var = k5Var.Z;
        s3Var.setTranslationY(d - s3Var.getHeight());
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(d - s3Var.getHeight(), 0.0f, AndroidUtilities.dp(32.0f)));
        s3Var.setAlpha(k5Var.U0.a(0) * clamp01);
        s3Var.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        s3Var.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        g5 g5Var = k5Var.f8397a0;
        g5Var.setTranslationY(d);
        k5Var.f8399b0.setTranslationY(g5Var.getRealHeight() + d);
        k5Var.f8420n0.setTranslationY(g5Var.getRealHeight() + d);
        k5Var.f8427u0.setTranslationY(g5Var.getRealHeight() + d);
        k5Var.f8429w0.setTranslationY(g5Var.getRealHeight() + d);
        FrameLayout frameLayout = k5Var.topBulletinContainer;
        if (frameLayout != null) {
            frameLayout.setTranslationY((getTranslationY() - a()) - AndroidUtilities.navigationBarHeight);
        }
        AndroidUtilities.updateViewVisibilityAnimated(k5Var.f8415j0, k5Var.d.canScrollVertically(1));
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f2026a) {
            case 11:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f2026a) {
            case 4:
                super.onAttachedToWindow();
                gc.a(this, new z(13));
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f2026a) {
            case 4:
                super.onDetachedFromWindow();
                gc.h(this);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f2026a) {
            case 3:
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float[] fArr = (float[]) this.f2028c;
                fArr[3] = 0.0f;
                fArr[2] = 0.0f;
                fArr[1] = 0.0f;
                fArr[0] = 0.0f;
                float dp = AndroidUtilities.dp(4.0f);
                fArr[7] = dp;
                fArr[6] = dp;
                fArr[5] = dp;
                fArr[4] = dp;
                Path path = (Path) this.f2027b;
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                Paint paint = (Paint) this.f2029e;
                paint.setColor(2130706432);
                canvas.drawPath(path, paint);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int i13;
        int i14;
        int left;
        int boundsRight;
        switch (this.f2026a) {
            case 1:
                super.onLayout(z10, i9, i10, i11, i12);
                k5 k5Var = (k5) this.f2029e;
                t3 t3Var = k5Var.M0;
                if (t3Var != null) {
                    int finalHeight = k5Var.f8397a0.getFinalHeight();
                    int z12 = k5Var.z1();
                    if (k5Var.U0.d(1) && k5Var.f8413i0.getVisibility() == 0) {
                        i13 = k5Var.f8413i0.getMeasuredHeight();
                    } else {
                        i13 = 0;
                    }
                    t3Var.F(finalHeight, z12 + i13);
                }
                k5Var.T1();
                return;
            case 5:
                super.onLayout(z10, i9, i10, i11, i12);
                PhotoViewer photoViewer = (PhotoViewer) this.f2029e;
                if (photoViewer.D0.getVisibility() != 8) {
                    if (photoViewer.O0.getVisibility() == 0) {
                        i14 = AndroidUtilities.dp(63.0f);
                    } else {
                        i14 = 0;
                    }
                    int measuredWidth = (((i11 - i9) - i14) - photoViewer.D0.getMeasuredWidth()) / 2;
                    ta1 ta1Var = photoViewer.D0;
                    ta1Var.layout(measuredWidth, ta1Var.getTop(), photoViewer.D0.getMeasuredWidth() + measuredWidth, photoViewer.D0.getMeasuredHeight() + photoViewer.D0.getTop());
                    return;
                }
                return;
            case 8:
                s5 s5Var = (s5) this.f2029e;
                yf.x0 x0Var = s5Var.f49793n0;
                int measuredWidth2 = x0Var.getMeasuredWidth();
                int i15 = 0;
                for (int i16 = 0; i16 < x0Var.getChildCount(); i16++) {
                    View childAt = x0Var.getChildAt(i16);
                    int left2 = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof t1) {
                        t1 t1Var = (t1) childAt;
                        left2 = childAt.getLeft() + t1Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = t1Var.getBoundsRight();
                    } else if (childAt instanceof w0) {
                        w0 w0Var = (w0) childAt;
                        left2 = childAt.getLeft() + w0Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = w0Var.getBoundsRight();
                    } else {
                        measuredWidth2 = Math.min(left2, measuredWidth2);
                        i15 = Math.max(right, i15);
                    }
                    right = boundsRight + left;
                    measuredWidth2 = Math.min(left2, measuredWidth2);
                    i15 = Math.max(right, i15);
                }
                x0Var.layout(-measuredWidth2, 0, x0Var.getMeasuredWidth() - measuredWidth2, x0Var.getMeasuredHeight());
                TextureView textureView = s5Var.f49798s0;
                if (textureView != null) {
                    textureView.layout(0, 0, getMeasuredWidth(), x0Var.getMeasuredHeight());
                    return;
                }
                return;
            case 9:
                if (getChildCount() == 2) {
                    View childAt2 = getChildAt(0);
                    View childAt3 = getChildAt(1);
                    int measuredWidth3 = childAt2.getMeasuredWidth();
                    int i17 = i12 - i10;
                    childAt2.layout(0, 0, measuredWidth3, i17);
                    childAt3.layout(measuredWidth3, 0, i11 - i9, i17);
                    return;
                }
                super.onLayout(z10, i9, i10, i11, i12);
                return;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        int i11;
        int i12;
        int left;
        int boundsRight;
        int i13;
        float measuredWidth;
        int v02;
        int v03;
        int i14;
        switch (this.f2026a) {
            case 1:
                k5 k5Var = (k5) this.f2029e;
                int bottomInset = k5Var.getBottomInset();
                int i15 = 0;
                setPadding(0, 0, 0, bottomInset);
                k5Var.f8397a0.H.setPadding(0, 0, 0, bottomInset);
                int size = View.MeasureSpec.getSize(i10);
                k5Var.h = size;
                int size2 = View.MeasureSpec.getSize(i9);
                for (int i16 = 0; i16 < getChildCount(); i16++) {
                    View childAt = getChildAt(i16);
                    if (childAt instanceof x3) {
                        childAt.measure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
                    } else if (childAt == k5Var.d) {
                        childAt.measure(i9, View.MeasureSpec.makeMeasureSpec(size - bottomInset, 1073741824));
                    } else {
                        if (childAt.getLayoutParams() != null && childAt.getLayoutParams().height == -1) {
                            i11 = size;
                        } else {
                            i11 = 9999;
                        }
                        childAt.measure(i9, View.MeasureSpec.makeMeasureSpec(i11, Integer.MIN_VALUE));
                    }
                }
                setMeasuredDimension(size2, size);
                t3 t3Var = k5Var.M0;
                if (t3Var != null) {
                    int finalHeight = k5Var.f8397a0.getFinalHeight();
                    int z12 = k5Var.z1();
                    if (k5Var.U0.d(1) && k5Var.f8413i0.getVisibility() == 0) {
                        i15 = k5Var.f8413i0.getMeasuredHeight();
                    }
                    t3Var.F(finalHeight, z12 + i15);
                    return;
                }
                return;
            case 2:
            case 3:
            case 7:
            case 10:
            default:
                super.onMeasure(i9, i10);
                return;
            case 4:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824));
                return;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) this.f2029e;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.D0.getLayoutParams();
                if (photoViewer.O0.getVisibility() == 0) {
                    i12 = AndroidUtilities.dp(63.0f);
                } else {
                    i12 = 0;
                }
                layoutParams.rightMargin = i12;
                super.onMeasure(i9, i10);
                return;
            case 6:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), i10);
                return;
            case 8:
                s5 s5Var = (s5) this.f2029e;
                yf.x0 x0Var = s5Var.f49793n0;
                x0Var.measure(i9, View.MeasureSpec.makeMeasureSpec(0, 0));
                TextureView textureView = s5Var.f49798s0;
                if (textureView != null) {
                    textureView.measure(View.MeasureSpec.makeMeasureSpec(x0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(x0Var.getMeasuredHeight(), 1073741824));
                }
                int measuredWidth2 = x0Var.getMeasuredWidth();
                int i17 = 0;
                for (int i18 = 0; i18 < x0Var.getChildCount(); i18++) {
                    View childAt2 = x0Var.getChildAt(i18);
                    int left2 = childAt2.getLeft();
                    int right = childAt2.getRight();
                    if (childAt2 instanceof t1) {
                        t1 t1Var = (t1) childAt2;
                        left2 = childAt2.getLeft() + t1Var.getBoundsLeft();
                        left = childAt2.getLeft();
                        boundsRight = t1Var.getBoundsRight();
                    } else if (childAt2 instanceof w0) {
                        w0 w0Var = (w0) childAt2;
                        left2 = childAt2.getLeft() + w0Var.getBoundsLeft();
                        left = childAt2.getLeft();
                        boundsRight = w0Var.getBoundsRight();
                    } else {
                        measuredWidth2 = Math.min(left2, measuredWidth2);
                        i17 = Math.max(right, i17);
                    }
                    right = boundsRight + left;
                    measuredWidth2 = Math.min(left2, measuredWidth2);
                    i17 = Math.max(right, i17);
                }
                setMeasuredDimension(i17 - measuredWidth2, x0Var.getMeasuredHeight());
                return;
            case 9:
                b6 b6Var = (b6) this.d;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f2029e;
                TextView textView = limitPreviewView.f26462w;
                tf0 tf0Var = limitPreviewView.f26452c0;
                j6 j6Var = limitPreviewView.J;
                tf0 tf0Var2 = limitPreviewView.f26450b0;
                j6 j6Var2 = limitPreviewView.v;
                if (getChildCount() == 2) {
                    int size3 = View.MeasureSpec.getSize(i9);
                    int size4 = View.MeasureSpec.getSize(i10);
                    tf0Var2.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                    int measuredWidth3 = tf0Var2.getMeasuredWidth();
                    int measuredWidth4 = j6Var.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                    int i19 = 0;
                    if (textView.getVisibility() == 0) {
                        i13 = textView.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                    } else {
                        i13 = 0;
                    }
                    int max = Math.max(measuredWidth3, measuredWidth4 + i13);
                    tf0Var.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                    if (limitPreviewView.L) {
                        float f10 = limitPreviewView.f26447a;
                        float f11 = 0.0f;
                        int i20 = -1;
                        if (f10 == 0.0f) {
                            limitPreviewView.f26459n = 0;
                            if (!limitPreviewView.Q && !limitPreviewView.R) {
                                if (limitPreviewView.H || limitPreviewView.f26448a0 != null) {
                                    v03 = -1;
                                } else {
                                    v03 = f6.v0(f6.G6, b6Var);
                                }
                                j6Var2.setTextColor(v03);
                                if (limitPreviewView.f26448a0 == null) {
                                    i20 = f6.v0(f6.G6, b6Var);
                                }
                                j6Var.setTextColor(i20);
                            }
                        } else if (f10 < 1.0f) {
                            if (limitPreviewView.H) {
                                measuredWidth = 0.0f;
                            } else {
                                measuredWidth = tf0Var2.getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                            }
                            if (!limitPreviewView.H) {
                                f11 = tf0Var.getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                            }
                            limitPreviewView.f26459n = (int) ((((size3 - measuredWidth) - f11) * limitPreviewView.f26447a) + measuredWidth);
                            if (!limitPreviewView.Q && !limitPreviewView.R) {
                                if (limitPreviewView.H || limitPreviewView.f26448a0 != null) {
                                    v02 = -1;
                                } else {
                                    v02 = f6.v0(f6.G6, b6Var);
                                }
                                j6Var2.setTextColor(v02);
                                j6Var.setTextColor(-1);
                            }
                        } else {
                            limitPreviewView.f26459n = size3;
                            if (!limitPreviewView.Q && !limitPreviewView.R) {
                                j6Var2.setTextColor(-1);
                                j6Var.setTextColor(-1);
                            }
                        }
                    } else {
                        int measuredWidth5 = tf0Var.getMeasuredWidth();
                        int measuredWidth6 = limitPreviewView.K.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                        if (j6Var2.getVisibility() == 0) {
                            i19 = j6Var2.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                        }
                        int clamp = (int) Utilities.clamp(size3 * limitPreviewView.f26447a, size3 - Math.max(measuredWidth5, measuredWidth6 + i19), max);
                        limitPreviewView.f26459n = clamp;
                        tf0Var2.measure(View.MeasureSpec.makeMeasureSpec(clamp, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                        tf0Var.measure(View.MeasureSpec.makeMeasureSpec(size3 - limitPreviewView.f26459n, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                    }
                    setMeasuredDimension(size3, size4);
                    return;
                }
                super.onMeasure(i9, i10);
                return;
            case 11:
                x0 x0Var2 = (x0) this.f2029e;
                x0Var2.H = 0;
                ScrollView scrollView = (ScrollView) this.f2028c;
                scrollView.measure(i9, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), Integer.MIN_VALUE));
                int size5 = View.MeasureSpec.getSize(i10) - scrollView.getMeasuredHeight();
                i14 = ((f3) x0Var2).backgroundPaddingTop;
                x0Var2.H = i14 + size5;
                super.onMeasure(i9, i10);
                x0Var2.y();
                return;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f2026a) {
            case 5:
                super.setAlpha(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.f2029e;
                FrameLayout frameLayout = photoViewer.M7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.M7.setAlpha(f10);
                }
                yr0 yr0Var = photoViewer.Q1;
                if (yr0Var != null && yr0Var.getVisibility() != 8) {
                    photoViewer.Q1.setAlpha(photoViewer.f35768u7[0] * f10);
                }
                zr0 zr0Var = photoViewer.R1;
                if (zr0Var != null && zr0Var.getVisibility() != 8) {
                    photoViewer.R1.setAlpha(f10 * photoViewer.f35776v7[0]);
                    return;
                }
                return;
            default:
                super.setAlpha(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f2026a) {
            case 1:
                super.setTranslationY(f10);
                FrameLayout frameLayout = ((k5) this.f2029e).topBulletinContainer;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((getTranslationY() - a()) - AndroidUtilities.navigationBarHeight);
                    return;
                }
                return;
            case 4:
                super.setTranslationY(f10);
                z21 z21Var = (z21) this.f2029e;
                FrameLayout frameLayout2 = z21Var.topBulletinContainer;
                frameLayout2.setTranslationY(Math.max(z21Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, z21Var.z(true)) + ((-frameLayout2.getTop()) - z21Var.topBulletinContainer.getHeight()) + f10);
                return;
            case 5:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.f2029e;
                FrameLayout frameLayout3 = photoViewer.M7;
                if (frameLayout3 != null && frameLayout3.getVisibility() != 8) {
                    photoViewer.M7.setTranslationY(photoViewer.L0.getTranslationY() - (photoViewer.Q1.getAlpha() * l0.b(46.0f, photoViewer.Q1.getEditTextHeight(), 0)));
                }
                m0 m0Var = photoViewer.T1;
                if (m0Var != null) {
                    m0Var.setTranslationY(f10);
                }
                TextView textView = photoViewer.O7;
                if (textView != null && textView.getVisibility() != 8) {
                    photoViewer.O7.setTranslationY(f10);
                    return;
                }
                return;
            case 11:
                super.setTranslationY(f10);
                ((x0) this.f2029e).onContainerTranslationYChanged(f10);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i9) {
        int i10;
        switch (this.f2026a) {
            case 5:
                super.setVisibility(i9);
                PhotoViewer photoViewer = (PhotoViewer) this.f2029e;
                FrameLayout frameLayout = photoViewer.M7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    FrameLayout frameLayout2 = photoViewer.M7;
                    if (i9 == 0) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    frameLayout2.setVisibility(i10);
                    return;
                }
                return;
            default:
                super.setVisibility(i9);
                return;
        }
    }

    public g(s5 s5Var, Context context) {
        super(context);
        this.f2029e = s5Var;
        this.f2027b = new Matrix();
        this.f2028c = new float[8];
        this.d = new Path();
    }

    public g(LimitPreviewView limitPreviewView, Context context, b6 b6Var) {
        super(context);
        this.f2029e = limitPreviewView;
        this.d = b6Var;
        this.f2027b = new Paint();
        Paint paint = new Paint();
        this.f2028c = paint;
        paint.setColor(-1);
    }

    public g(Context context, j jVar, b6 b6Var) {
        super(context);
        this.f2029e = jVar;
        this.d = b6Var;
        this.f2027b = new c0(2);
        this.f2028c = new c0(8);
    }

    public g(x0 x0Var, Context context, ScrollView scrollView, Drawable drawable) {
        super(context);
        this.f2029e = x0Var;
        this.f2028c = scrollView;
        this.d = drawable;
        this.f2027b = new Path();
    }

    public g(Context context, b6 b6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.f2028c = textView;
        ll.k(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTextColor(f6.v0(f6.f23108j5, b6Var));
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.f2027b = imageView;
        h2 h2Var = new h2(false);
        this.d = h2Var;
        imageView.setImageDrawable(h2Var);
        h2Var.a(-1);
        addView(imageView, e6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 16.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new w21(this, 0));
        b(true);
        setMinimumHeight(AndroidUtilities.dp(56.0f));
    }

    public g(u5 u5Var, Context context) {
        super(context);
        this.f2029e = u5Var;
        this.d = new RectF();
        setWillNotDraw(false);
        View imageView = new ImageView(context);
        this.f2027b = imageView;
        TextView textView = new TextView(context);
        this.f2028c = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        addView(imageView, e6.e(-2, -2, 1));
        addView(textView, e6.d(-2, -2.0f, 1, 0.0f, 25.0f, 0.0f, 0.0f));
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        setMinimumWidth(AndroidUtilities.dp(100.0f));
        int dp = AndroidUtilities.dp(10.0f);
        int k10 = i0.a.k(-16777216, 80);
        setBackground(f6.i0(dp, dp, dp, dp, 0, k10, k10));
    }

    public g(z21 z21Var, Context context) {
        super(context);
        this.f2029e = z21Var;
        this.f2027b = new Path();
        Paint paint = new Paint(1);
        this.f2028c = paint;
        paint.setColor(z21Var.getThemedColor(f6.f23072h5));
        f6.m(paint);
    }

    public g(oc1 oc1Var, Activity activity) {
        super(activity);
        this.f2029e = oc1Var;
        this.f2027b = new Paint(1);
        this.f2028c = new Paint(1);
        this.d = new Paint(1);
    }

    public g(k5 k5Var, Context context) {
        super(context);
        this.f2029e = k5Var;
        this.f2027b = new RectF();
        this.f2028c = new Paint(1);
        this.d = new Path();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public g(f0 f0Var, Context context, b6 b6Var) {
        super(context);
        this.f2029e = f0Var;
        this.d = b6Var;
        this.f2027b = new z0(f6.Lj, f6.Mj, -1, -1, b6Var);
        Paint paint = new Paint(1);
        this.f2028c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
    }

    public g(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.f2029e = photoViewer;
        this.f2027b = new Paint(3);
        this.f2028c = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, 2130706432}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.d = new Matrix();
    }
}
