package bg;

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
import i7.f6;
import jh.d5;
import jh.h5;
import nh.f5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k31;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.ua;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.fc1;
import org.telegram.ui.pb1;
import org.telegram.ui.qc1;
import org.telegram.ui.ua1;
import org.telegram.ui.v5;
import org.telegram.ui.w21;
import org.telegram.ui.xr0;
import org.telegram.ui.yr0;
public final class u1 extends FrameLayout {
    public final int f2542a = 7;
    public Object f2543b;
    public Object f2544c;
    public Object d;
    public Object f2545e;

    public u1(Context context) {
        super(context);
    }

    public float a() {
        h5 h5Var = (h5) this.f2545e;
        return (h5Var.U0.a(3) * h5Var.f12195w0.getMeasuredHeight()) + (h5Var.U0.a(2) * h5Var.f12193u0.getMeasuredHeight()) + (h5Var.U0.a(1) * h5Var.f12186n0.getMeasuredHeight()) + (h5Var.U0.a(0) * h5Var.f12165b0.getMeasuredHeight()) + h5Var.f12163a0.getRealHeight() + 0.0f;
    }

    public void b(boolean z10) {
        int i10;
        float f9;
        float f10;
        ImageView imageView = (ImageView) this.f2543b;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        TextView textView = (TextView) this.f2544c;
        boolean z11 = LocaleController.isRTL;
        if (!z11 && z10) {
            f9 = 53.0f;
        } else {
            f9 = 22.0f;
        }
        if (z11 && z10) {
            f10 = 53.0f;
        } else {
            f10 = 22.0f;
        }
        textView.setLayoutParams(f6.d(-1, -2.0f, 55, f9, 14.0f, f10, 12.0f));
    }

    public void c(int i10, String str) {
        ((TextView) this.f2544c).setText(str);
        ((ImageView) this.f2543b).setImageDrawable(getContext().getDrawable(i10));
    }

    public float d() {
        a5.d dVar;
        float max = Math.max(0.0f, getHeight() - a());
        h5 h5Var = (h5) this.f2545e;
        jl0 jl0Var = h5Var.d;
        int childCount = jl0Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = jl0Var.getChildAt(childCount);
            jl0Var.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                if (R == 2) {
                    max = childAt.getHeight() + childAt.getTranslationY() + childAt.getTop();
                    break;
                } else if (R == 1) {
                    max = childAt.getY();
                    break;
                } else if (R == 0) {
                    max = childAt.getY() - h5Var.f12163a0.getRealHeight();
                    break;
                }
            }
            childCount--;
        }
        float a2 = (h5Var.U0.a(4) * h5Var.getBottomInset()) + max;
        Float f9 = h5Var.T0;
        if (f9 != null && (dVar = h5Var.U0) != null && dVar.f164c < 1.0f) {
            return AndroidUtilities.lerp(f9.floatValue(), a2, h5Var.U0.f164c);
        }
        return a2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Paint e10;
        float globalXOffset;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float globalXOffset2;
        Drawable drawable;
        int i10;
        Drawable drawable2;
        boolean z10;
        int v;
        FrameLayout frameLayout;
        int i11;
        switch (this.f2542a) {
            case 1:
                c6 c6Var = (c6) this.d;
                Paint paint = (Paint) this.f2543b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f2545e;
                if (limitPreviewView.L) {
                    if (!limitPreviewView.V && !limitPreviewView.N) {
                        paint.setColor(g6.v0(g6.f23081e7, c6Var));
                    } else {
                        paint.setColor(g6.v0(g6.f23152i6, c6Var));
                    }
                } else {
                    paint.setColor(g6.v0(g6.f23009a7, c6Var));
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                cg.x xVar = limitPreviewView.f26459a0;
                if (xVar != null) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ((v5) ((org.telegram.ui.c1) xVar).f36955b).t0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                } else {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
                }
                canvas.save();
                if (!limitPreviewView.L) {
                    canvas.clipRect(limitPreviewView.f26470n, 0, getMeasuredWidth(), getMeasuredHeight());
                }
                if (limitPreviewView.N) {
                    e10 = limitPreviewView.G;
                } else if (limitPreviewView.f26459a0 != null) {
                    e10 = (Paint) this.f2544c;
                } else {
                    e10 = cg.s1.d().e();
                }
                ViewGroup viewGroup = limitPreviewView.f26475y;
                if (viewGroup != null) {
                    cg.r1 r1Var = limitPreviewView.A;
                    if (r1Var != null) {
                        e10 = r1Var.f3319f;
                        r1Var.a();
                        Matrix matrix = r1Var.f3318e;
                        matrix.reset();
                        matrix.postScale(1.0f, limitPreviewView.f26462c / 100.0f, 0.0f, 0.0f);
                        matrix.postTranslate(0.0f, -limitPreviewView.B);
                        r1Var.d.setLocalMatrix(matrix);
                    } else {
                        float f9 = 0.0f;
                        for (View view = this; view != viewGroup; view = (View) view.getParent()) {
                            f9 += view.getY();
                        }
                        cg.s1 d = cg.s1.d();
                        int measuredWidth = viewGroup.getMeasuredWidth();
                        int measuredHeight = viewGroup.getMeasuredHeight();
                        globalXOffset2 = limitPreviewView.getGlobalXOffset();
                        d.f(globalXOffset2 - getLeft(), -f9, measuredWidth, measuredHeight);
                    }
                } else {
                    cg.s1 d10 = cg.s1.d();
                    int measuredWidth2 = limitPreviewView.getMeasuredWidth();
                    int measuredHeight2 = limitPreviewView.getMeasuredHeight();
                    globalXOffset = limitPreviewView.getGlobalXOffset();
                    d10.f(globalXOffset - getLeft(), -getTop(), measuredWidth2, measuredHeight2);
                }
                int alpha = e10.getAlpha();
                if (limitPreviewView.R && (valueAnimator2 = limitPreviewView.f26466e0) != null) {
                    e10.setAlpha((int) ((1.0f - ((Float) valueAnimator2.getAnimatedValue()).floatValue()) * alpha));
                } else if (limitPreviewView.Q && (valueAnimator = limitPreviewView.f26466e0) != null) {
                    e10.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * alpha));
                }
                if (limitPreviewView.L) {
                    if (!limitPreviewView.H && !limitPreviewView.I) {
                        AndroidUtilities.rectTmp.set(0.0f, 0.0f, limitPreviewView.f26470n, getMeasuredHeight());
                    } else {
                        AndroidUtilities.rectTmp.set(limitPreviewView.f26470n, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    }
                }
                canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), e10);
                e10.setAlpha(alpha);
                canvas.restore();
                if (limitPreviewView.A == null && limitPreviewView.W) {
                    invalidate();
                }
                super.dispatchDraw(canvas);
                return;
            case 2:
                Paint paint2 = (Paint) this.f2544c;
                paint2.setColor(g6.v0(g6.Ii, (c6) this.d));
                cg.q0 q0Var = (cg.q0) this.f2545e;
                canvas.drawLine(AndroidUtilities.dp(18.0f), getHeight() / 2.0f, q0Var.d.getLeft() - AndroidUtilities.dp(20.0f), getHeight() / 2.0f, paint2);
                canvas.drawLine(AndroidUtilities.dp(20.0f) + q0Var.d.getRight(), getHeight() / 2.0f, getWidth() - AndroidUtilities.dp(18.0f), getHeight() / 2.0f, paint2);
                RectF rectF2 = AndroidUtilities.rectTmp;
                int top = q0Var.d.getTop();
                rectF2.set(q0Var.d.getLeft() - AndroidUtilities.dp(15.0f), ((q0Var.d.getBottom() + top) - AndroidUtilities.dp(30.0f)) / 2.0f, AndroidUtilities.dp(15.0f) + q0Var.d.getRight(), (AndroidUtilities.dp(30.0f) + (q0Var.d.getBottom() + q0Var.d.getTop())) / 2.0f);
                canvas.save();
                canvas.translate(rectF2.left, rectF2.top);
                rectF2.set(0.0f, 0.0f, rectF2.width(), rectF2.height());
                cg.r1 r1Var2 = (cg.r1) this.f2543b;
                r1Var2.e(rectF2);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), r1Var2.f3319f);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            case 3:
                Drawable drawable3 = (Drawable) this.f2544c;
                cg.p1 p1Var = (cg.p1) this.f2545e;
                drawable = ((org.telegram.ui.ActionBar.f3) p1Var).shadowDrawable;
                int i12 = p1Var.I;
                i10 = ((org.telegram.ui.ActionBar.f3) p1Var).backgroundPaddingTop;
                drawable.setBounds(0, org.telegram.ui.b.C(2.0f, i10 + i12, 1), getMeasuredWidth(), getMeasuredHeight());
                drawable2 = ((org.telegram.ui.ActionBar.f3) p1Var).shadowDrawable;
                drawable2.draw(canvas);
                super.dispatchDraw(canvas);
                cg.m1 m1Var = p1Var.J;
                if (m1Var != null && m1Var.getVisibility() == 0 && p1Var.J.getAlpha() != 0.0f) {
                    drawable3.setBounds(0, p1Var.J.getBottom(), getMeasuredWidth(), drawable3.getIntrinsicHeight() + p1Var.J.getBottom());
                    drawable3.setAlpha((int) (p1Var.J.getAlpha() * 255.0f));
                    drawable3.draw(canvas);
                    return;
                }
                return;
            case 4:
            case 6:
            case 7:
            case 10:
            default:
                super.dispatchDraw(canvas);
                return;
            case 5:
                h5 h5Var = (h5) this.f2545e;
                h5Var.H(canvas, this);
                canvas.save();
                float d11 = d();
                float dp = AndroidUtilities.dp(12.0f);
                RectF rectF3 = (RectF) this.f2543b;
                rectF3.set(h5.n1(h5Var), d11, getWidth() - h5.o1(h5Var), getHeight() + dp);
                Paint paint3 = (Paint) this.f2544c;
                paint3.setColor(h5Var.getThemedColor(g6.f23133h5));
                Path path = (Path) this.d;
                path.rewind();
                path.addRoundRect(rectF3, dp, dp, Path.Direction.CW);
                canvas.drawPath(path, paint3);
                super.dispatchDraw(canvas);
                e();
                canvas.restore();
                ua uaVar = h5Var.f34660e;
                if (uaVar != null && uaVar.getVisibility() == 0 && uaVar.getAlpha() > 0.0f) {
                    if (uaVar.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(uaVar.getX(), uaVar.getY(), uaVar.getX() + uaVar.getMeasuredWidth(), uaVar.getY() + uaVar.getMeasuredHeight(), (int) (uaVar.getAlpha() * 255.0f), 31);
                    } else {
                        canvas.save();
                        canvas.clipRect(uaVar.getX(), uaVar.getY(), uaVar.getX() + uaVar.getMeasuredWidth(), uaVar.getY() + uaVar.getMeasuredHeight());
                    }
                    canvas.translate(uaVar.getX(), uaVar.getY());
                    uaVar.draw(canvas);
                    canvas.restore();
                }
                h5Var.G(canvas, this);
                return;
            case 8:
                Path path2 = (Path) this.d;
                k31 k31Var = (k31) this.f2545e;
                boolean z11 = true;
                float A = k31Var.A(true);
                float lerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(12.0f), i7.w.a(A / AndroidUtilities.dpf2(24.0f), 0.0f, 1.0f));
                k31Var.f29914x.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, A));
                if (A <= AndroidUtilities.statusBarHeight / 2.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean bool = (Boolean) this.f2544c;
                if (bool == null || bool.booleanValue() != z10) {
                    this.f2544c = Boolean.valueOf(z10);
                    Window window = k31Var.getWindow();
                    if (z10) {
                        v = k31Var.getThemedColor(g6.f23133h5);
                    } else {
                        v = g6.v(k31Var.getThemedColor(g6.f23329s8), 855638016);
                    }
                    if (AndroidUtilities.computePerceivedBrightness(v) <= 0.721f) {
                        z11 = false;
                    }
                    AndroidUtilities.setLightStatusBar(window, z11);
                }
                k31Var.topBulletinContainer.setTranslationY(Math.max(k31Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, A) + getTranslationY() + ((-frameLayout.getTop()) - k31Var.topBulletinContainer.getHeight()));
                path2.rewind();
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(0.0f, A, getWidth(), getHeight() + lerp);
                path2.addRoundRect(rectF4, lerp, lerp, Path.Direction.CW);
                canvas.drawPath(path2, (Paint) this.f2543b);
                super.dispatchDraw(canvas);
                return;
            case 9:
                LinearGradient linearGradient = (LinearGradient) this.d;
                Matrix matrix2 = (Matrix) this.f2543b;
                Paint paint4 = (Paint) this.f2544c;
                PhotoViewer photoViewer = (PhotoViewer) this.f2545e;
                if (!photoViewer.O4) {
                    if (photoViewer.f35729j0.getVisibility() == 0) {
                        i11 = getMeasuredHeight() - AndroidUtilities.dp(48.0f);
                    } else {
                        i11 = 0;
                    }
                    int i13 = photoViewer.Y1;
                    if (i13 != 0 && i13 != 2 && i13 != -1) {
                        paint4.setShader(null);
                        paint4.setColor(2130706432);
                    } else {
                        matrix2.reset();
                        matrix2.postTranslate(0.0f, i11);
                        matrix2.postScale(1.0f, Math.min(AndroidUtilities.dp(40.0f), getMeasuredHeight() - i11) / 16.0f);
                        linearGradient.setLocalMatrix(matrix2);
                        paint4.setShader(linearGradient);
                    }
                    canvas.drawRect(0.0f, i11, getMeasuredWidth(), getMeasuredHeight(), paint4);
                }
                super.dispatchDraw(canvas);
                return;
            case 11:
                Paint paint5 = (Paint) this.d;
                Paint paint6 = (Paint) this.f2544c;
                RectF rectF5 = AndroidUtilities.rectTmp;
                rectF5.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                float dp2 = AndroidUtilities.dp(8.0f);
                Paint paint7 = (Paint) this.f2543b;
                paint7.setColor(0);
                float dpf2 = AndroidUtilities.dpf2(1.0f);
                float dpf22 = AndroidUtilities.dpf2(0.33f);
                qc1 qc1Var = (qc1) this.f2545e;
                paint7.setShadowLayer(dpf2, 0.0f, dpf22, i0.a.k(-16777216, (int) (qc1Var.N1.getAlpha() * 27.0f)));
                canvas.drawRoundRect(rectF5, dp2, dp2, paint7);
                fc1 fc1Var = qc1Var.f41672t0;
                pb1 pb1Var = qc1Var.f41623a;
                g6.s(this, fc1Var, pb1Var);
                Paint G = pb1Var.G("paintChatActionBackground");
                int alpha2 = G.getAlpha();
                G.setAlpha((int) (qc1Var.N1.getAlpha() * alpha2));
                canvas.drawRoundRect(rectF5, dp2, dp2, G);
                G.setAlpha(alpha2);
                if (qc1Var.I1) {
                    float f10 = qc1Var.f41652j1;
                    if (f10 > 0.0f) {
                        paint5.setColor(i0.a.k(-16777216, (int) (f10 * 255.0f * qc1Var.f41654k1)));
                        canvas.drawRoundRect(rectF5, dp2, dp2, paint5);
                    }
                }
                paint6.setColor(520093695);
                paint6.setAlpha((int) (qc1Var.N1.getAlpha() * 30.0f));
                canvas.drawRoundRect(rectF5, dp2, dp2, paint6);
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        switch (this.f2542a) {
            case 3:
                cg.p1 p1Var = (cg.p1) this.f2545e;
                if (motionEvent.getAction() == 0) {
                    float y8 = motionEvent.getY();
                    int i11 = p1Var.I;
                    i10 = ((org.telegram.ui.ActionBar.f3) p1Var).backgroundPaddingTop;
                    if (y8 < AndroidUtilities.dp(2.0f) + (i11 - i10)) {
                        p1Var.dismiss();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 5:
                h5 h5Var = (h5) this.f2545e;
                if (motionEvent.getAction() == 0 && motionEvent.getY() < d() && h5.l1(h5Var).isAttachedToWindow()) {
                    h5Var.dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 8:
                k31 k31Var = (k31) this.f2545e;
                if (k31Var.F != null && k31Var.G != null) {
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                        Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + k31Var.F.y());
                    }
                    if (k31Var.F.y() && k31Var.G.onTouchEvent(motionEvent)) {
                        Log.d("TA2", "overlay consumed (handle)");
                        return true;
                    }
                    boolean b10 = k31Var.G.b(motionEvent);
                    if (motionEvent.getAction() == 1) {
                        Log.d("TA2", "checkOnTap=" + b10);
                    }
                    if (b10) {
                        motionEvent.setAction(3);
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f2542a) {
            case 6:
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), ((v5) this.f2545e).t0(getX() + ((ViewGroup) getParent()).getX(), ((ViewGroup) getParent().getParent().getParent()).getY()));
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
        switch (this.f2542a) {
            case 0:
                float[] fArr = (float[]) this.f2544c;
                Path path = (Path) this.d;
                Matrix matrix = (Matrix) this.f2543b;
                f5 f5Var = (f5) this.f2545e;
                v1 v1Var = f5Var.f2148n0;
                if (view == f5Var.f2153s0) {
                    org.telegram.ui.Cells.s1 q6 = d2.q(f5Var);
                    if (q6 == null || (photoImage = q6.getPhotoImage()) == null) {
                        return false;
                    }
                    matrix.reset();
                    float max = Math.max(photoImage.getImageWidth() / f5Var.f2155u0, photoImage.getImageHeight() / f5Var.f2156v0);
                    matrix.postScale((f5Var.f2155u0 / f5Var.f2153s0.getWidth()) * max, (f5Var.f2156v0 / f5Var.f2153s0.getHeight()) * max);
                    matrix.postTranslate((photoImage.getCenterX() + (q6.getX() + v1Var.getX())) - ((f5Var.f2155u0 * max) / 2.0f), (photoImage.getCenterY() + (q6.getY() + v1Var.getY())) - ((f5Var.f2156v0 * max) / 2.0f));
                    f5Var.f2153s0.setTransform(matrix);
                    canvas.save();
                    path.rewind();
                    AndroidUtilities.rectTmp.set(photoImage.getImageX() + q6.getX() + v1Var.getX(), photoImage.getImageY() + q6.getY() + v1Var.getY(), photoImage.getImageX2() + q6.getX() + v1Var.getX(), photoImage.getImageY2() + q6.getY() + v1Var.getY());
                    for (int i10 = 0; i10 < photoImage.getRoundRadius().length; i10++) {
                        int i11 = i10 * 2;
                        fArr[i11] = photoImage.getRoundRadius()[i10];
                        fArr[i11 + 1] = photoImage.getRoundRadius()[i10];
                    }
                    path.addRoundRect(AndroidUtilities.rectTmp, fArr, Path.Direction.CW);
                    canvas.clipPath(path);
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j10);
            case 1:
            case 2:
            default:
                return super.drawChild(canvas, view, j10);
            case 3:
                Path path2 = (Path) this.d;
                if (view == ((ScrollView) this.f2543b)) {
                    canvas.save();
                    path2.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(getPaddingLeft(), AndroidUtilities.dp(18.0f) + ((cg.p1) this.f2545e).I, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
                    path2.addRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Path.Direction.CW);
                    canvas.clipPath(path2);
                    super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 4:
                c6 c6Var = (c6) this.d;
                jf.b0 b0Var = (jf.b0) this.f2544c;
                jf.b0 b0Var2 = (jf.b0) this.f2543b;
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                eh.f fVar = (eh.f) this.f2545e;
                int i12 = (int) fVar.T.f49510e;
                if (view == fVar.f6222d0 && i12 > 0) {
                    b0Var2.setBounds(0, AndroidUtilities.dp(40.0f), getWidth(), AndroidUtilities.dp(48.0f));
                    int i13 = g6.f23133h5;
                    b0Var2.b(g6.v0(i13, c6Var));
                    b0Var2.draw(canvas);
                    int dp = AndroidUtilities.dp(48.0f) + i12;
                    b0Var.setBounds(0, dp - AndroidUtilities.dp(8.0f), getWidth(), dp);
                    b0Var.b(g6.v0(i13, c6Var));
                    b0Var.draw(canvas);
                }
                return drawChild2;
            case 5:
                h5 h5Var = (h5) this.f2545e;
                if (view == h5Var.f34660e) {
                    return false;
                }
                if (view != h5Var.Z) {
                    canvas.save();
                    canvas.clipPath((Path) this.d);
                    boolean drawChild3 = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild3;
                }
                return super.drawChild(canvas, view, j10);
        }
    }

    public void e() {
        float d = d();
        h5 h5Var = (h5) this.f2545e;
        jh.r3 r3Var = h5Var.Z;
        r3Var.setTranslationY(d - r3Var.getHeight());
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(d - r3Var.getHeight(), 0.0f, AndroidUtilities.dp(32.0f)));
        r3Var.setAlpha(h5Var.U0.a(0) * clamp01);
        r3Var.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        r3Var.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        d5 d5Var = h5Var.f12163a0;
        d5Var.setTranslationY(d);
        h5Var.f12165b0.setTranslationY(d5Var.getRealHeight() + d);
        h5Var.f12186n0.setTranslationY(d5Var.getRealHeight() + d);
        h5Var.f12193u0.setTranslationY(d5Var.getRealHeight() + d);
        h5Var.f12195w0.setTranslationY(d5Var.getRealHeight() + d);
        FrameLayout frameLayout = h5Var.topBulletinContainer;
        if (frameLayout != null) {
            frameLayout.setTranslationY((getTranslationY() - a()) - AndroidUtilities.navigationBarHeight);
        }
        AndroidUtilities.updateViewVisibilityAnimated(h5Var.f12181j0, h5Var.d.canScrollVertically(1));
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f2542a) {
            case 3:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f2542a) {
            case 8:
                super.onAttachedToWindow();
                mc.a(this, new eg.x(11));
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f2542a) {
            case 8:
                super.onDetachedFromWindow();
                mc.h(this);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f2542a) {
            case 7:
                RectF rectF = (RectF) this.f2543b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float[] fArr = (float[]) this.f2544c;
                fArr[3] = 0.0f;
                fArr[2] = 0.0f;
                fArr[1] = 0.0f;
                fArr[0] = 0.0f;
                float dp = AndroidUtilities.dp(4.0f);
                fArr[7] = dp;
                fArr[6] = dp;
                fArr[5] = dp;
                fArr[4] = dp;
                Path path = (Path) this.d;
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                Paint paint = (Paint) this.f2545e;
                paint.setColor(2130706432);
                canvas.drawPath(path, paint);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int left;
        int boundsRight;
        int i14;
        int i15;
        switch (this.f2542a) {
            case 0:
                f5 f5Var = (f5) this.f2545e;
                v1 v1Var = f5Var.f2148n0;
                int measuredWidth = v1Var.getMeasuredWidth();
                int i16 = 0;
                for (int i17 = 0; i17 < v1Var.getChildCount(); i17++) {
                    View childAt = v1Var.getChildAt(i17);
                    int left2 = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                        left2 = childAt.getLeft() + s1Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = s1Var.getBoundsRight();
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                        left2 = childAt.getLeft() + v0Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = v0Var.getBoundsRight();
                    } else {
                        measuredWidth = Math.min(left2, measuredWidth);
                        i16 = Math.max(right, i16);
                    }
                    right = boundsRight + left;
                    measuredWidth = Math.min(left2, measuredWidth);
                    i16 = Math.max(right, i16);
                }
                v1Var.layout(-measuredWidth, 0, v1Var.getMeasuredWidth() - measuredWidth, v1Var.getMeasuredHeight());
                TextureView textureView = f5Var.f2153s0;
                if (textureView != null) {
                    textureView.layout(0, 0, getMeasuredWidth(), v1Var.getMeasuredHeight());
                    return;
                }
                return;
            case 1:
                if (getChildCount() == 2) {
                    View childAt2 = getChildAt(0);
                    View childAt3 = getChildAt(1);
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int i18 = i13 - i11;
                    childAt2.layout(0, 0, measuredWidth2, i18);
                    childAt3.layout(measuredWidth2, 0, i12 - i10, i18);
                    return;
                }
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 5:
                super.onLayout(z10, i10, i11, i12, i13);
                h5 h5Var = (h5) this.f2545e;
                cg.g gVar = h5Var.M0;
                if (gVar != null) {
                    int finalHeight = h5Var.f12163a0.getFinalHeight();
                    int z12 = h5Var.z1();
                    if (h5Var.U0.d(1) && h5Var.f12179i0.getVisibility() == 0) {
                        i14 = h5Var.f12179i0.getMeasuredHeight();
                    } else {
                        i14 = 0;
                    }
                    gVar.F(finalHeight, z12 + i14);
                }
                h5Var.T1();
                return;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer photoViewer = (PhotoViewer) this.f2545e;
                if (photoViewer.D0.getVisibility() != 8) {
                    if (photoViewer.O0.getVisibility() == 0) {
                        i15 = AndroidUtilities.dp(63.0f);
                    } else {
                        i15 = 0;
                    }
                    int measuredWidth3 = (((i12 - i10) - i15) - photoViewer.D0.getMeasuredWidth()) / 2;
                    ua1 ua1Var = photoViewer.D0;
                    ua1Var.layout(measuredWidth3, ua1Var.getTop(), photoViewer.D0.getMeasuredWidth() + measuredWidth3, photoViewer.D0.getMeasuredHeight() + photoViewer.D0.getTop());
                    return;
                }
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int left;
        int boundsRight;
        int i12;
        float measuredWidth;
        int v02;
        int v03;
        int i13;
        int i14;
        int i15;
        switch (this.f2542a) {
            case 0:
                f5 f5Var = (f5) this.f2545e;
                v1 v1Var = f5Var.f2148n0;
                v1Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                TextureView textureView = f5Var.f2153s0;
                if (textureView != null) {
                    textureView.measure(View.MeasureSpec.makeMeasureSpec(v1Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(v1Var.getMeasuredHeight(), 1073741824));
                }
                int measuredWidth2 = v1Var.getMeasuredWidth();
                int i16 = 0;
                for (int i17 = 0; i17 < v1Var.getChildCount(); i17++) {
                    View childAt = v1Var.getChildAt(i17);
                    int left2 = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                        left2 = childAt.getLeft() + s1Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = s1Var.getBoundsRight();
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                        left2 = childAt.getLeft() + v0Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = v0Var.getBoundsRight();
                    } else {
                        measuredWidth2 = Math.min(left2, measuredWidth2);
                        i16 = Math.max(right, i16);
                    }
                    right = boundsRight + left;
                    measuredWidth2 = Math.min(left2, measuredWidth2);
                    i16 = Math.max(right, i16);
                }
                setMeasuredDimension(i16 - measuredWidth2, v1Var.getMeasuredHeight());
                return;
            case 1:
                c6 c6Var = (c6) this.d;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f2545e;
                TextView textView = limitPreviewView.f26473w;
                cg.y yVar = limitPreviewView.f26463c0;
                o6 o6Var = limitPreviewView.J;
                cg.y yVar2 = limitPreviewView.f26461b0;
                o6 o6Var2 = limitPreviewView.v;
                if (getChildCount() == 2) {
                    int size = View.MeasureSpec.getSize(i10);
                    int size2 = View.MeasureSpec.getSize(i11);
                    yVar2.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    int measuredWidth3 = yVar2.getMeasuredWidth();
                    int measuredWidth4 = o6Var.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                    int i18 = 0;
                    if (textView.getVisibility() == 0) {
                        i12 = textView.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                    } else {
                        i12 = 0;
                    }
                    int max = Math.max(measuredWidth3, measuredWidth4 + i12);
                    yVar.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    if (limitPreviewView.L) {
                        float f9 = limitPreviewView.f26458a;
                        float f10 = 0.0f;
                        int i19 = -1;
                        if (f9 == 0.0f) {
                            limitPreviewView.f26470n = 0;
                            if (!limitPreviewView.Q && !limitPreviewView.R) {
                                if (limitPreviewView.H || limitPreviewView.f26459a0 != null) {
                                    v03 = -1;
                                } else {
                                    v03 = g6.v0(g6.G6, c6Var);
                                }
                                o6Var2.setTextColor(v03);
                                if (limitPreviewView.f26459a0 == null) {
                                    i19 = g6.v0(g6.G6, c6Var);
                                }
                                o6Var.setTextColor(i19);
                            }
                        } else if (f9 < 1.0f) {
                            if (limitPreviewView.H) {
                                measuredWidth = 0.0f;
                            } else {
                                measuredWidth = yVar2.getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                            }
                            if (!limitPreviewView.H) {
                                f10 = yVar.getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                            }
                            limitPreviewView.f26470n = (int) ((((size - measuredWidth) - f10) * limitPreviewView.f26458a) + measuredWidth);
                            if (!limitPreviewView.Q && !limitPreviewView.R) {
                                if (limitPreviewView.H || limitPreviewView.f26459a0 != null) {
                                    v02 = -1;
                                } else {
                                    v02 = g6.v0(g6.G6, c6Var);
                                }
                                o6Var2.setTextColor(v02);
                                o6Var.setTextColor(-1);
                            }
                        } else {
                            limitPreviewView.f26470n = size;
                            if (!limitPreviewView.Q && !limitPreviewView.R) {
                                o6Var2.setTextColor(-1);
                                o6Var.setTextColor(-1);
                            }
                        }
                    } else {
                        int measuredWidth5 = yVar.getMeasuredWidth();
                        int measuredWidth6 = limitPreviewView.K.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                        if (o6Var2.getVisibility() == 0) {
                            i18 = o6Var2.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                        }
                        int clamp = (int) Utilities.clamp(size * limitPreviewView.f26458a, size - Math.max(measuredWidth5, measuredWidth6 + i18), max);
                        limitPreviewView.f26470n = clamp;
                        yVar2.measure(View.MeasureSpec.makeMeasureSpec(clamp, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                        yVar.measure(View.MeasureSpec.makeMeasureSpec(size - limitPreviewView.f26470n, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    }
                    setMeasuredDimension(size, size2);
                    return;
                }
                super.onMeasure(i10, i11);
                return;
            case 2:
            case 4:
            case 6:
            case 7:
            default:
                super.onMeasure(i10, i11);
                return;
            case 3:
                cg.p1 p1Var = (cg.p1) this.f2545e;
                p1Var.H = 0;
                ScrollView scrollView = (ScrollView) this.f2543b;
                scrollView.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), Integer.MIN_VALUE));
                int size3 = View.MeasureSpec.getSize(i11) - scrollView.getMeasuredHeight();
                i13 = ((org.telegram.ui.ActionBar.f3) p1Var).backgroundPaddingTop;
                p1Var.H = i13 + size3;
                super.onMeasure(i10, i11);
                p1Var.y();
                return;
            case 5:
                h5 h5Var = (h5) this.f2545e;
                int bottomInset = h5Var.getBottomInset();
                int i20 = 0;
                setPadding(0, 0, 0, bottomInset);
                h5Var.f12163a0.H.setPadding(0, 0, 0, bottomInset);
                int size4 = View.MeasureSpec.getSize(i11);
                h5Var.h = size4;
                int size5 = View.MeasureSpec.getSize(i10);
                for (int i21 = 0; i21 < getChildCount(); i21++) {
                    View childAt2 = getChildAt(i21);
                    if (childAt2 instanceof nh.t3) {
                        childAt2.measure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
                    } else if (childAt2 == h5Var.d) {
                        childAt2.measure(i10, View.MeasureSpec.makeMeasureSpec(size4 - bottomInset, 1073741824));
                    } else {
                        if (childAt2.getLayoutParams() != null && childAt2.getLayoutParams().height == -1) {
                            i14 = size4;
                        } else {
                            i14 = 9999;
                        }
                        childAt2.measure(i10, View.MeasureSpec.makeMeasureSpec(i14, Integer.MIN_VALUE));
                    }
                }
                setMeasuredDimension(size5, size4);
                cg.g gVar = h5Var.M0;
                if (gVar != null) {
                    int finalHeight = h5Var.f12163a0.getFinalHeight();
                    int z12 = h5Var.z1();
                    if (h5Var.U0.d(1) && h5Var.f12179i0.getVisibility() == 0) {
                        i20 = h5Var.f12179i0.getMeasuredHeight();
                    }
                    gVar.F(finalHeight, z12 + i20);
                    return;
                }
                return;
            case 8:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) this.f2545e;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.D0.getLayoutParams();
                if (photoViewer.O0.getVisibility() == 0) {
                    i15 = AndroidUtilities.dp(63.0f);
                } else {
                    i15 = 0;
                }
                layoutParams.rightMargin = i15;
                super.onMeasure(i10, i11);
                return;
            case 10:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
                return;
        }
    }

    @Override
    public void setAlpha(float f9) {
        switch (this.f2542a) {
            case 9:
                super.setAlpha(f9);
                PhotoViewer photoViewer = (PhotoViewer) this.f2545e;
                FrameLayout frameLayout = photoViewer.M7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.M7.setAlpha(f9);
                }
                xr0 xr0Var = photoViewer.Q1;
                if (xr0Var != null && xr0Var.getVisibility() != 8) {
                    photoViewer.Q1.setAlpha(photoViewer.f35834u7[0] * f9);
                }
                yr0 yr0Var = photoViewer.R1;
                if (yr0Var != null && yr0Var.getVisibility() != 8) {
                    photoViewer.R1.setAlpha(f9 * photoViewer.f35843v7[0]);
                    return;
                }
                return;
            default:
                super.setAlpha(f9);
                return;
        }
    }

    @Override
    public void setTranslationY(float f9) {
        switch (this.f2542a) {
            case 3:
                super.setTranslationY(f9);
                ((cg.p1) this.f2545e).onContainerTranslationYChanged(f9);
                return;
            case 4:
            case 6:
            case 7:
            default:
                super.setTranslationY(f9);
                return;
            case 5:
                super.setTranslationY(f9);
                FrameLayout frameLayout = ((h5) this.f2545e).topBulletinContainer;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((getTranslationY() - a()) - AndroidUtilities.navigationBarHeight);
                    return;
                }
                return;
            case 8:
                super.setTranslationY(f9);
                k31 k31Var = (k31) this.f2545e;
                FrameLayout frameLayout2 = k31Var.topBulletinContainer;
                frameLayout2.setTranslationY(Math.max(k31Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, k31Var.A(true)) + ((-frameLayout2.getTop()) - k31Var.topBulletinContainer.getHeight()) + f9);
                return;
            case 9:
                super.setTranslationY(f9);
                PhotoViewer photoViewer = (PhotoViewer) this.f2545e;
                FrameLayout frameLayout3 = photoViewer.M7;
                if (frameLayout3 != null && frameLayout3.getVisibility() != 8) {
                    photoViewer.M7.setTranslationY(photoViewer.L0.getTranslationY() - (photoViewer.Q1.getAlpha() * j7.l1.d(46.0f, photoViewer.Q1.getEditTextHeight(), 0)));
                }
                org.telegram.ui.n0 n0Var = photoViewer.T1;
                if (n0Var != null) {
                    n0Var.setTranslationY(f9);
                }
                TextView textView = photoViewer.O7;
                if (textView != null && textView.getVisibility() != 8) {
                    photoViewer.O7.setTranslationY(f9);
                    return;
                }
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        int i11;
        switch (this.f2542a) {
            case 9:
                super.setVisibility(i10);
                PhotoViewer photoViewer = (PhotoViewer) this.f2545e;
                FrameLayout frameLayout = photoViewer.M7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    FrameLayout frameLayout2 = photoViewer.M7;
                    if (i10 == 0) {
                        i11 = 0;
                    } else {
                        i11 = 4;
                    }
                    frameLayout2.setVisibility(i11);
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public u1(f5 f5Var, Context context) {
        super(context);
        this.f2545e = f5Var;
        this.f2543b = new Matrix();
        this.f2544c = new float[8];
        this.d = new Path();
    }

    public u1(LimitPreviewView limitPreviewView, Context context, c6 c6Var) {
        super(context);
        this.f2545e = limitPreviewView;
        this.d = c6Var;
        this.f2543b = new Paint();
        Paint paint = new Paint();
        this.f2544c = paint;
        paint.setColor(-1);
    }

    public u1(Context context, eh.f fVar, c6 c6Var) {
        super(context);
        this.f2545e = fVar;
        this.d = c6Var;
        this.f2543b = new jf.b0(2);
        this.f2544c = new jf.b0(8);
    }

    public u1(cg.p1 p1Var, Context context, ScrollView scrollView, Drawable drawable) {
        super(context);
        this.f2545e = p1Var;
        this.f2543b = scrollView;
        this.f2544c = drawable;
        this.d = new Path();
    }

    public u1(Context context, c6 c6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.f2544c = textView;
        org.telegram.ui.b.g(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTextColor(g6.v0(g6.f23169j5, c6Var));
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.f2543b = imageView;
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.d = h2Var;
        imageView.setImageDrawable(h2Var);
        h2Var.a(-1);
        addView(imageView, f6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 16.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new w21(this, 0));
        b(true);
        setMinimumHeight(AndroidUtilities.dp(56.0f));
    }

    public u1(v5 v5Var, Context context) {
        super(context);
        this.f2545e = v5Var;
        this.d = new RectF();
        setWillNotDraw(false);
        View imageView = new ImageView(context);
        this.f2543b = imageView;
        TextView textView = new TextView(context);
        this.f2544c = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        addView(imageView, f6.e(-2, -2, 1));
        addView(textView, f6.d(-2, -2.0f, 1, 0.0f, 25.0f, 0.0f, 0.0f));
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        setMinimumWidth(AndroidUtilities.dp(100.0f));
        int dp = AndroidUtilities.dp(10.0f);
        int k9 = i0.a.k(-16777216, 80);
        setBackground(g6.i0(dp, dp, dp, dp, 0, k9, k9));
    }

    public u1(k31 k31Var, Context context) {
        super(context);
        this.f2545e = k31Var;
        this.d = new Path();
        Paint paint = new Paint(1);
        this.f2543b = paint;
        paint.setColor(k31Var.getThemedColor(g6.f23133h5));
        g6.m(paint);
    }

    public u1(qc1 qc1Var, Activity activity) {
        super(activity);
        this.f2545e = qc1Var;
        this.f2543b = new Paint(1);
        this.f2544c = new Paint(1);
        this.d = new Paint(1);
    }

    public u1(h5 h5Var, Context context) {
        super(context);
        this.f2545e = h5Var;
        this.f2543b = new RectF();
        this.f2544c = new Paint(1);
        this.d = new Path();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public u1(cg.q0 q0Var, Context context, c6 c6Var) {
        super(context);
        this.f2545e = q0Var;
        this.d = c6Var;
        this.f2543b = new cg.r1(g6.Lj, g6.Mj, -1, -1, c6Var);
        Paint paint = new Paint(1);
        this.f2544c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
    }

    public u1(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.f2545e = photoViewer;
        this.f2544c = new Paint(3);
        this.d = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, 2130706432}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f2543b = new Matrix();
    }
}
