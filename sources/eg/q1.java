package eg;

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
import k7.c6;
import mh.c5;
import mh.g5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.pa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.f60;
import org.telegram.ui.ic1;
import org.telegram.ui.jd1;
import org.telegram.ui.ms0;
import org.telegram.ui.ns0;
import org.telegram.ui.ob1;
import org.telegram.ui.y5;
import org.telegram.ui.yc1;
import qh.n4;
public final class q1 extends FrameLayout {
    public final int f5443a = 7;
    public Object f5444b;
    public Object f5445c;
    public Object d;
    public Object f5446e;

    public q1(Context context) {
        super(context);
    }

    public float a() {
        g5 g5Var = (g5) this.f5446e;
        return (g5Var.V0.a(3) * g5Var.f14119x0.getMeasuredHeight()) + (g5Var.V0.a(2) * g5Var.f14117v0.getMeasuredHeight()) + (g5Var.V0.a(1) * g5Var.f14110o0.getMeasuredHeight()) + (g5Var.V0.a(0) * g5Var.f14089c0.getMeasuredHeight()) + g5Var.f14087b0.getRealHeight() + 0.0f;
    }

    public void b(boolean z4) {
        int i10;
        float f10;
        float f11;
        ImageView imageView = (ImageView) this.f5444b;
        if (z4) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        TextView textView = (TextView) this.f5445c;
        boolean z10 = LocaleController.isRTL;
        if (!z10 && z4) {
            f10 = 53.0f;
        } else {
            f10 = 22.0f;
        }
        if (z10 && z4) {
            f11 = 53.0f;
        } else {
            f11 = 22.0f;
        }
        textView.setLayoutParams(c6.d(-1, -2.0f, 55, f10, 14.0f, f11, 12.0f));
    }

    public void c(int i10, String str) {
        ((TextView) this.f5445c).setText(str);
        ((ImageView) this.f5444b).setImageDrawable(getContext().getDrawable(i10));
    }

    public float d() {
        c5.d dVar;
        float max = Math.max(0.0f, getHeight() - a());
        g5 g5Var = (g5) this.f5446e;
        sl0 sl0Var = g5Var.d;
        int childCount = sl0Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = sl0Var.getChildAt(childCount);
            sl0Var.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                if (R == 2) {
                    max = childAt.getHeight() + childAt.getTranslationY() + childAt.getTop();
                    break;
                } else if (R == 1) {
                    max = childAt.getY();
                    break;
                } else if (R == 0) {
                    max = childAt.getY() - g5Var.f14087b0.getRealHeight();
                    break;
                }
            }
            childCount--;
        }
        float a2 = (g5Var.V0.a(4) * g5Var.getBottomInset()) + max;
        Float f10 = g5Var.U0;
        if (f10 != null && (dVar = g5Var.V0) != null && dVar.f2267c < 1.0f) {
            return AndroidUtilities.lerp(f10.floatValue(), a2, g5Var.V0.f2267c);
        }
        return a2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        Paint e6;
        float globalXOffset;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float globalXOffset2;
        Drawable drawable;
        int i10;
        Drawable drawable2;
        boolean z4;
        int v;
        FrameLayout frameLayout;
        int i11;
        switch (this.f5443a) {
            case 1:
                g6 g6Var = (g6) this.d;
                Paint paint = (Paint) this.f5444b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f5446e;
                if (limitPreviewView.M) {
                    if (!limitPreviewView.W && !limitPreviewView.O) {
                        paint.setColor(k6.v0(k6.f21680e7, g6Var));
                    } else {
                        paint.setColor(k6.v0(k6.f21752i6, g6Var));
                    }
                } else {
                    paint.setColor(k6.v0(k6.f21607a7, g6Var));
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                fg.x xVar = limitPreviewView.f24949b0;
                if (xVar != null) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ((y5) ((org.telegram.ui.a1) xVar).f34976b).t0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                } else {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
                }
                canvas.save();
                if (!limitPreviewView.M) {
                    canvas.clipRect(limitPreviewView.f24959n, 0, getMeasuredWidth(), getMeasuredHeight());
                }
                if (limitPreviewView.O) {
                    e6 = limitPreviewView.H;
                } else if (limitPreviewView.f24949b0 != null) {
                    e6 = (Paint) this.f5445c;
                } else {
                    e6 = fg.q1.d().e();
                }
                ViewGroup viewGroup = limitPreviewView.f24964y;
                if (viewGroup != null) {
                    fg.p1 p1Var = limitPreviewView.B;
                    if (p1Var != null) {
                        e6 = p1Var.f6490f;
                        p1Var.a();
                        Matrix matrix = p1Var.f6489e;
                        matrix.reset();
                        matrix.postScale(1.0f, limitPreviewView.f24950c / 100.0f, 0.0f, 0.0f);
                        matrix.postTranslate(0.0f, -limitPreviewView.C);
                        p1Var.d.setLocalMatrix(matrix);
                    } else {
                        float f10 = 0.0f;
                        for (View view = this; view != viewGroup; view = (View) view.getParent()) {
                            f10 += view.getY();
                        }
                        fg.q1 d = fg.q1.d();
                        int measuredWidth = viewGroup.getMeasuredWidth();
                        int measuredHeight = viewGroup.getMeasuredHeight();
                        globalXOffset2 = limitPreviewView.getGlobalXOffset();
                        d.f(globalXOffset2 - getLeft(), -f10, measuredWidth, measuredHeight);
                    }
                } else {
                    fg.q1 d10 = fg.q1.d();
                    int measuredWidth2 = limitPreviewView.getMeasuredWidth();
                    int measuredHeight2 = limitPreviewView.getMeasuredHeight();
                    globalXOffset = limitPreviewView.getGlobalXOffset();
                    d10.f(globalXOffset - getLeft(), -getTop(), measuredWidth2, measuredHeight2);
                }
                int alpha = e6.getAlpha();
                if (limitPreviewView.S && (valueAnimator2 = limitPreviewView.f24956f0) != null) {
                    e6.setAlpha((int) ((1.0f - ((Float) valueAnimator2.getAnimatedValue()).floatValue()) * alpha));
                } else if (limitPreviewView.R && (valueAnimator = limitPreviewView.f24956f0) != null) {
                    e6.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * alpha));
                }
                if (limitPreviewView.M) {
                    if (!limitPreviewView.I && !limitPreviewView.J) {
                        AndroidUtilities.rectTmp.set(0.0f, 0.0f, limitPreviewView.f24959n, getMeasuredHeight());
                    } else {
                        AndroidUtilities.rectTmp.set(limitPreviewView.f24959n, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    }
                }
                canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), e6);
                e6.setAlpha(alpha);
                canvas.restore();
                if (limitPreviewView.B == null && limitPreviewView.f24947a0) {
                    invalidate();
                }
                super.dispatchDraw(canvas);
                return;
            case 2:
                Paint paint2 = (Paint) this.f5445c;
                paint2.setColor(k6.v0(k6.Ii, (g6) this.d));
                fg.q0 q0Var = (fg.q0) this.f5446e;
                canvas.drawLine(AndroidUtilities.dp(18.0f), getHeight() / 2.0f, q0Var.d.getLeft() - AndroidUtilities.dp(20.0f), getHeight() / 2.0f, paint2);
                canvas.drawLine(AndroidUtilities.dp(20.0f) + q0Var.d.getRight(), getHeight() / 2.0f, getWidth() - AndroidUtilities.dp(18.0f), getHeight() / 2.0f, paint2);
                RectF rectF2 = AndroidUtilities.rectTmp;
                int top = q0Var.d.getTop();
                rectF2.set(q0Var.d.getLeft() - AndroidUtilities.dp(15.0f), ((q0Var.d.getBottom() + top) - AndroidUtilities.dp(30.0f)) / 2.0f, AndroidUtilities.dp(15.0f) + q0Var.d.getRight(), (AndroidUtilities.dp(30.0f) + (q0Var.d.getBottom() + q0Var.d.getTop())) / 2.0f);
                canvas.save();
                canvas.translate(rectF2.left, rectF2.top);
                rectF2.set(0.0f, 0.0f, rectF2.width(), rectF2.height());
                fg.p1 p1Var2 = (fg.p1) this.f5444b;
                p1Var2.e(rectF2);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), p1Var2.f6490f);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            case 3:
                Drawable drawable3 = (Drawable) this.f5445c;
                fg.n1 n1Var = (fg.n1) this.f5446e;
                drawable = ((org.telegram.ui.ActionBar.h3) n1Var).shadowDrawable;
                int i12 = n1Var.J;
                i10 = ((org.telegram.ui.ActionBar.h3) n1Var).backgroundPaddingTop;
                drawable.setBounds(0, org.telegram.ui.b.C(2.0f, i10 + i12, 1), getMeasuredWidth(), getMeasuredHeight());
                drawable2 = ((org.telegram.ui.ActionBar.h3) n1Var).shadowDrawable;
                drawable2.draw(canvas);
                super.dispatchDraw(canvas);
                fg.k1 k1Var = n1Var.K;
                if (k1Var != null && k1Var.getVisibility() == 0 && n1Var.K.getAlpha() != 0.0f) {
                    drawable3.setBounds(0, n1Var.K.getBottom(), getMeasuredWidth(), drawable3.getIntrinsicHeight() + n1Var.K.getBottom());
                    drawable3.setAlpha((int) (n1Var.K.getAlpha() * 255.0f));
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
                g5 g5Var = (g5) this.f5446e;
                g5Var.H(canvas, this);
                canvas.save();
                float d11 = d();
                float dp = AndroidUtilities.dp(12.0f);
                RectF rectF3 = (RectF) this.f5444b;
                rectF3.set(g5.n1(g5Var), d11, getWidth() - g5.o1(g5Var), getHeight() + dp);
                Paint paint3 = (Paint) this.f5445c;
                paint3.setColor(g5Var.getThemedColor(k6.f21733h5));
                Path path = (Path) this.d;
                path.rewind();
                path.addRoundRect(rectF3, dp, dp, Path.Direction.CW);
                canvas.drawPath(path, paint3);
                super.dispatchDraw(canvas);
                e();
                canvas.restore();
                pa paVar = g5Var.f31015e;
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
                g5Var.G(canvas, this);
                return;
            case 8:
                Path path2 = (Path) this.d;
                v31 v31Var = (v31) this.f5446e;
                boolean z10 = true;
                float A = v31Var.A(true);
                float lerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(12.0f), k7.o.a(A / AndroidUtilities.dpf2(24.0f), 0.0f, 1.0f));
                v31Var.f31786x.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, A));
                if (A <= AndroidUtilities.statusBarHeight / 2.0f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Boolean bool = (Boolean) this.f5445c;
                if (bool == null || bool.booleanValue() != z4) {
                    this.f5445c = Boolean.valueOf(z4);
                    Window window = v31Var.getWindow();
                    if (z4) {
                        v = v31Var.getThemedColor(k6.f21733h5);
                    } else {
                        v = k6.v(v31Var.getThemedColor(k6.f21932s8), 855638016);
                    }
                    if (AndroidUtilities.computePerceivedBrightness(v) <= 0.721f) {
                        z10 = false;
                    }
                    AndroidUtilities.setLightStatusBar(window, z10);
                }
                v31Var.topBulletinContainer.setTranslationY(Math.max(v31Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, A) + getTranslationY() + ((-frameLayout.getTop()) - v31Var.topBulletinContainer.getHeight()));
                path2.rewind();
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(0.0f, A, getWidth(), getHeight() + lerp);
                path2.addRoundRect(rectF4, lerp, lerp, Path.Direction.CW);
                canvas.drawPath(path2, (Paint) this.f5444b);
                super.dispatchDraw(canvas);
                return;
            case 9:
                LinearGradient linearGradient = (LinearGradient) this.d;
                Matrix matrix2 = (Matrix) this.f5444b;
                Paint paint4 = (Paint) this.f5445c;
                PhotoViewer photoViewer = (PhotoViewer) this.f5446e;
                if (!photoViewer.P4) {
                    if (photoViewer.f34312k0.getVisibility() == 0) {
                        i11 = getMeasuredHeight() - AndroidUtilities.dp(48.0f);
                    } else {
                        i11 = 0;
                    }
                    int i13 = photoViewer.Z1;
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
                Paint paint6 = (Paint) this.f5445c;
                RectF rectF5 = AndroidUtilities.rectTmp;
                rectF5.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                float dp2 = AndroidUtilities.dp(8.0f);
                Paint paint7 = (Paint) this.f5444b;
                paint7.setColor(0);
                float dpf2 = AndroidUtilities.dpf2(1.0f);
                float dpf22 = AndroidUtilities.dpf2(0.33f);
                jd1 jd1Var = (jd1) this.f5446e;
                paint7.setShadowLayer(dpf2, 0.0f, dpf22, i0.a.k(-16777216, (int) (jd1Var.O1.getAlpha() * 27.0f)));
                canvas.drawRoundRect(rectF5, dp2, dp2, paint7);
                yc1 yc1Var = jd1Var.f38013u0;
                ic1 ic1Var = jd1Var.f37961a;
                k6.s(this, yc1Var, ic1Var);
                Paint F = ic1Var.F("paintChatActionBackground");
                int alpha2 = F.getAlpha();
                F.setAlpha((int) (jd1Var.O1.getAlpha() * alpha2));
                canvas.drawRoundRect(rectF5, dp2, dp2, F);
                F.setAlpha(alpha2);
                if (jd1Var.J1) {
                    float f11 = jd1Var.f37993k1;
                    if (f11 > 0.0f) {
                        paint5.setColor(i0.a.k(-16777216, (int) (f11 * 255.0f * jd1Var.l1)));
                        canvas.drawRoundRect(rectF5, dp2, dp2, paint5);
                    }
                }
                paint6.setColor(520093695);
                paint6.setAlpha((int) (jd1Var.O1.getAlpha() * 30.0f));
                canvas.drawRoundRect(rectF5, dp2, dp2, paint6);
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        switch (this.f5443a) {
            case 3:
                fg.n1 n1Var = (fg.n1) this.f5446e;
                if (motionEvent.getAction() == 0) {
                    float y10 = motionEvent.getY();
                    int i11 = n1Var.J;
                    i10 = ((org.telegram.ui.ActionBar.h3) n1Var).backgroundPaddingTop;
                    if (y10 < AndroidUtilities.dp(2.0f) + (i11 - i10)) {
                        n1Var.dismiss();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 5:
                g5 g5Var = (g5) this.f5446e;
                if (motionEvent.getAction() == 0 && motionEvent.getY() < d() && g5.l1(g5Var).isAttachedToWindow()) {
                    g5Var.dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 8:
                v31 v31Var = (v31) this.f5446e;
                if (v31Var.G != null && v31Var.H != null) {
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                        Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + v31Var.G.y());
                    }
                    if (v31Var.G.y() && v31Var.H.onTouchEvent(motionEvent)) {
                        Log.d("TA2", "overlay consumed (handle)");
                        return true;
                    }
                    boolean b10 = v31Var.H.b(motionEvent);
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
        switch (this.f5443a) {
            case 6:
                RectF rectF = (RectF) this.d;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), ((y5) this.f5446e).t0(getX() + ((ViewGroup) getParent()).getX(), ((ViewGroup) getParent().getParent().getParent()).getY()));
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
        switch (this.f5443a) {
            case 0:
                float[] fArr = (float[]) this.f5445c;
                Path path = (Path) this.d;
                Matrix matrix = (Matrix) this.f5444b;
                n4 n4Var = (n4) this.f5446e;
                r1 r1Var = n4Var.f5553o0;
                if (view == n4Var.f5558t0) {
                    org.telegram.ui.Cells.t1 q10 = y1.q(n4Var);
                    if (q10 == null || (photoImage = q10.getPhotoImage()) == null) {
                        return false;
                    }
                    matrix.reset();
                    float max = Math.max(photoImage.getImageWidth() / n4Var.f5560v0, photoImage.getImageHeight() / n4Var.f5561w0);
                    matrix.postScale((n4Var.f5560v0 / n4Var.f5558t0.getWidth()) * max, (n4Var.f5561w0 / n4Var.f5558t0.getHeight()) * max);
                    matrix.postTranslate((photoImage.getCenterX() + (q10.getX() + r1Var.getX())) - ((n4Var.f5560v0 * max) / 2.0f), (photoImage.getCenterY() + (q10.getY() + r1Var.getY())) - ((n4Var.f5561w0 * max) / 2.0f));
                    n4Var.f5558t0.setTransform(matrix);
                    canvas.save();
                    path.rewind();
                    AndroidUtilities.rectTmp.set(photoImage.getImageX() + q10.getX() + r1Var.getX(), photoImage.getImageY() + q10.getY() + r1Var.getY(), photoImage.getImageX2() + q10.getX() + r1Var.getX(), photoImage.getImageY2() + q10.getY() + r1Var.getY());
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
                if (view == ((ScrollView) this.f5444b)) {
                    canvas.save();
                    path2.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(getPaddingLeft(), AndroidUtilities.dp(18.0f) + ((fg.n1) this.f5446e).J, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
                    path2.addRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Path.Direction.CW);
                    canvas.clipPath(path2);
                    super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 4:
                g6 g6Var = (g6) this.d;
                lf.b0 b0Var = (lf.b0) this.f5445c;
                lf.b0 b0Var2 = (lf.b0) this.f5444b;
                boolean drawChild2 = super.drawChild(canvas, view, j10);
                hh.f fVar = (hh.f) this.f5446e;
                int i12 = (int) fVar.U.f50546e;
                if (view == fVar.f7703e0 && i12 > 0) {
                    b0Var2.setBounds(0, AndroidUtilities.dp(40.0f), getWidth(), AndroidUtilities.dp(48.0f));
                    int i13 = k6.f21733h5;
                    b0Var2.b(k6.v0(i13, g6Var));
                    b0Var2.draw(canvas);
                    int dp = AndroidUtilities.dp(48.0f) + i12;
                    b0Var.setBounds(0, dp - AndroidUtilities.dp(8.0f), getWidth(), dp);
                    b0Var.b(k6.v0(i13, g6Var));
                    b0Var.draw(canvas);
                }
                return drawChild2;
            case 5:
                g5 g5Var = (g5) this.f5446e;
                if (view == g5Var.f31015e) {
                    return false;
                }
                if (view != g5Var.f14085a0) {
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
        g5 g5Var = (g5) this.f5446e;
        mh.q3 q3Var = g5Var.f14085a0;
        q3Var.setTranslationY(d - q3Var.getHeight());
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(d - q3Var.getHeight(), 0.0f, AndroidUtilities.dp(32.0f)));
        q3Var.setAlpha(g5Var.V0.a(0) * clamp01);
        q3Var.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        q3Var.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        c5 c5Var = g5Var.f14087b0;
        c5Var.setTranslationY(d);
        g5Var.f14089c0.setTranslationY(c5Var.getRealHeight() + d);
        g5Var.f14110o0.setTranslationY(c5Var.getRealHeight() + d);
        g5Var.f14117v0.setTranslationY(c5Var.getRealHeight() + d);
        g5Var.f14119x0.setTranslationY(c5Var.getRealHeight() + d);
        FrameLayout frameLayout = g5Var.topBulletinContainer;
        if (frameLayout != null) {
            frameLayout.setTranslationY((getTranslationY() - a()) - AndroidUtilities.navigationBarHeight);
        }
        AndroidUtilities.updateViewVisibilityAnimated(g5Var.f14105k0, g5Var.d.canScrollVertically(1));
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f5443a) {
            case 3:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f5443a) {
            case 8:
                super.onAttachedToWindow();
                ic.a(this, new hg.w(8));
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f5443a) {
            case 8:
                super.onDetachedFromWindow();
                ic.h(this);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f5443a) {
            case 7:
                RectF rectF = (RectF) this.f5444b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float[] fArr = (float[]) this.f5445c;
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
                Paint paint = (Paint) this.f5446e;
                paint.setColor(2130706432);
                canvas.drawPath(path, paint);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int left;
        int boundsRight;
        int i14;
        int i15;
        switch (this.f5443a) {
            case 0:
                n4 n4Var = (n4) this.f5446e;
                r1 r1Var = n4Var.f5553o0;
                int measuredWidth = r1Var.getMeasuredWidth();
                int i16 = 0;
                for (int i17 = 0; i17 < r1Var.getChildCount(); i17++) {
                    View childAt = r1Var.getChildAt(i17);
                    int left2 = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                        left2 = childAt.getLeft() + t1Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = t1Var.getBoundsRight();
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
                r1Var.layout(-measuredWidth, 0, r1Var.getMeasuredWidth() - measuredWidth, r1Var.getMeasuredHeight());
                TextureView textureView = n4Var.f5558t0;
                if (textureView != null) {
                    textureView.layout(0, 0, getMeasuredWidth(), r1Var.getMeasuredHeight());
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
                super.onLayout(z4, i10, i11, i12, i13);
                return;
            case 5:
                super.onLayout(z4, i10, i11, i12, i13);
                g5 g5Var = (g5) this.f5446e;
                fg.g gVar = g5Var.N0;
                if (gVar != null) {
                    int finalHeight = g5Var.f14087b0.getFinalHeight();
                    int z12 = g5Var.z1();
                    if (g5Var.V0.d(1) && g5Var.f14103j0.getVisibility() == 0) {
                        i14 = g5Var.f14103j0.getMeasuredHeight();
                    } else {
                        i14 = 0;
                    }
                    gVar.F(finalHeight, z12 + i14);
                }
                g5Var.T1();
                return;
            case 9:
                super.onLayout(z4, i10, i11, i12, i13);
                PhotoViewer photoViewer = (PhotoViewer) this.f5446e;
                if (photoViewer.E0.getVisibility() != 8) {
                    if (photoViewer.P0.getVisibility() == 0) {
                        i15 = AndroidUtilities.dp(63.0f);
                    } else {
                        i15 = 0;
                    }
                    int measuredWidth3 = (((i12 - i10) - i15) - photoViewer.E0.getMeasuredWidth()) / 2;
                    ob1 ob1Var = photoViewer.E0;
                    ob1Var.layout(measuredWidth3, ob1Var.getTop(), photoViewer.E0.getMeasuredWidth() + measuredWidth3, photoViewer.E0.getMeasuredHeight() + photoViewer.E0.getTop());
                    return;
                }
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
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
        switch (this.f5443a) {
            case 0:
                n4 n4Var = (n4) this.f5446e;
                r1 r1Var = n4Var.f5553o0;
                r1Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                TextureView textureView = n4Var.f5558t0;
                if (textureView != null) {
                    textureView.measure(View.MeasureSpec.makeMeasureSpec(r1Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(r1Var.getMeasuredHeight(), 1073741824));
                }
                int measuredWidth2 = r1Var.getMeasuredWidth();
                int i16 = 0;
                for (int i17 = 0; i17 < r1Var.getChildCount(); i17++) {
                    View childAt = r1Var.getChildAt(i17);
                    int left2 = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                        left2 = childAt.getLeft() + t1Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = t1Var.getBoundsRight();
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
                setMeasuredDimension(i16 - measuredWidth2, r1Var.getMeasuredHeight());
                return;
            case 1:
                g6 g6Var = (g6) this.d;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f5446e;
                TextView textView = limitPreviewView.f24962w;
                fg.y yVar = limitPreviewView.f24952d0;
                org.telegram.ui.Components.k6 k6Var = limitPreviewView.K;
                fg.y yVar2 = limitPreviewView.f24951c0;
                org.telegram.ui.Components.k6 k6Var2 = limitPreviewView.v;
                if (getChildCount() == 2) {
                    int size = View.MeasureSpec.getSize(i10);
                    int size2 = View.MeasureSpec.getSize(i11);
                    yVar2.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    int measuredWidth3 = yVar2.getMeasuredWidth();
                    int measuredWidth4 = k6Var.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                    int i18 = 0;
                    if (textView.getVisibility() == 0) {
                        i12 = textView.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                    } else {
                        i12 = 0;
                    }
                    int max = Math.max(measuredWidth3, measuredWidth4 + i12);
                    yVar.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    if (limitPreviewView.M) {
                        float f10 = limitPreviewView.f24946a;
                        float f11 = 0.0f;
                        int i19 = -1;
                        if (f10 == 0.0f) {
                            limitPreviewView.f24959n = 0;
                            if (!limitPreviewView.R && !limitPreviewView.S) {
                                if (limitPreviewView.I || limitPreviewView.f24949b0 != null) {
                                    v03 = -1;
                                } else {
                                    v03 = k6.v0(k6.G6, g6Var);
                                }
                                k6Var2.setTextColor(v03);
                                if (limitPreviewView.f24949b0 == null) {
                                    i19 = k6.v0(k6.G6, g6Var);
                                }
                                k6Var.setTextColor(i19);
                            }
                        } else if (f10 < 1.0f) {
                            if (limitPreviewView.I) {
                                measuredWidth = 0.0f;
                            } else {
                                measuredWidth = yVar2.getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                            }
                            if (!limitPreviewView.I) {
                                f11 = yVar.getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                            }
                            limitPreviewView.f24959n = (int) ((((size - measuredWidth) - f11) * limitPreviewView.f24946a) + measuredWidth);
                            if (!limitPreviewView.R && !limitPreviewView.S) {
                                if (limitPreviewView.I || limitPreviewView.f24949b0 != null) {
                                    v02 = -1;
                                } else {
                                    v02 = k6.v0(k6.G6, g6Var);
                                }
                                k6Var2.setTextColor(v02);
                                k6Var.setTextColor(-1);
                            }
                        } else {
                            limitPreviewView.f24959n = size;
                            if (!limitPreviewView.R && !limitPreviewView.S) {
                                k6Var2.setTextColor(-1);
                                k6Var.setTextColor(-1);
                            }
                        }
                    } else {
                        int measuredWidth5 = yVar.getMeasuredWidth();
                        int measuredWidth6 = limitPreviewView.L.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                        if (k6Var2.getVisibility() == 0) {
                            i18 = k6Var2.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                        }
                        int clamp = (int) Utilities.clamp(size * limitPreviewView.f24946a, size - Math.max(measuredWidth5, measuredWidth6 + i18), max);
                        limitPreviewView.f24959n = clamp;
                        yVar2.measure(View.MeasureSpec.makeMeasureSpec(clamp, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                        yVar.measure(View.MeasureSpec.makeMeasureSpec(size - limitPreviewView.f24959n, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
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
                fg.n1 n1Var = (fg.n1) this.f5446e;
                n1Var.I = 0;
                ScrollView scrollView = (ScrollView) this.f5444b;
                scrollView.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), Integer.MIN_VALUE));
                int size3 = View.MeasureSpec.getSize(i11) - scrollView.getMeasuredHeight();
                i13 = ((org.telegram.ui.ActionBar.h3) n1Var).backgroundPaddingTop;
                n1Var.I = i13 + size3;
                super.onMeasure(i10, i11);
                n1Var.y();
                return;
            case 5:
                g5 g5Var = (g5) this.f5446e;
                int bottomInset = g5Var.getBottomInset();
                int i20 = 0;
                setPadding(0, 0, 0, bottomInset);
                g5Var.f14087b0.I.setPadding(0, 0, 0, bottomInset);
                int size4 = View.MeasureSpec.getSize(i11);
                g5Var.h = size4;
                int size5 = View.MeasureSpec.getSize(i10);
                for (int i21 = 0; i21 < getChildCount(); i21++) {
                    View childAt2 = getChildAt(i21);
                    if (childAt2 instanceof qh.e3) {
                        childAt2.measure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
                    } else if (childAt2 == g5Var.d) {
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
                fg.g gVar = g5Var.N0;
                if (gVar != null) {
                    int finalHeight = g5Var.f14087b0.getFinalHeight();
                    int z12 = g5Var.z1();
                    if (g5Var.V0.d(1) && g5Var.f14103j0.getVisibility() == 0) {
                        i20 = g5Var.f14103j0.getMeasuredHeight();
                    }
                    gVar.F(finalHeight, z12 + i20);
                    return;
                }
                return;
            case 8:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            case 9:
                PhotoViewer photoViewer = (PhotoViewer) this.f5446e;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.E0.getLayoutParams();
                if (photoViewer.P0.getVisibility() == 0) {
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
    public void setAlpha(float f10) {
        switch (this.f5443a) {
            case 9:
                super.setAlpha(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.f5446e;
                FrameLayout frameLayout = photoViewer.N7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.N7.setAlpha(f10);
                }
                ms0 ms0Var = photoViewer.R1;
                if (ms0Var != null && ms0Var.getVisibility() != 8) {
                    photoViewer.R1.setAlpha(photoViewer.f34417v7[0] * f10);
                }
                ns0 ns0Var = photoViewer.S1;
                if (ns0Var != null && ns0Var.getVisibility() != 8) {
                    photoViewer.S1.setAlpha(f10 * photoViewer.f34427w7[0]);
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
        switch (this.f5443a) {
            case 3:
                super.setTranslationY(f10);
                ((fg.n1) this.f5446e).onContainerTranslationYChanged(f10);
                return;
            case 4:
            case 6:
            case 7:
            default:
                super.setTranslationY(f10);
                return;
            case 5:
                super.setTranslationY(f10);
                FrameLayout frameLayout = ((g5) this.f5446e).topBulletinContainer;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((getTranslationY() - a()) - AndroidUtilities.navigationBarHeight);
                    return;
                }
                return;
            case 8:
                super.setTranslationY(f10);
                v31 v31Var = (v31) this.f5446e;
                FrameLayout frameLayout2 = v31Var.topBulletinContainer;
                frameLayout2.setTranslationY(Math.max(v31Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, v31Var.A(true)) + ((-frameLayout2.getTop()) - v31Var.topBulletinContainer.getHeight()) + f10);
                return;
            case 9:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.f5446e;
                FrameLayout frameLayout3 = photoViewer.N7;
                if (frameLayout3 != null && frameLayout3.getVisibility() != 8) {
                    photoViewer.N7.setTranslationY(photoViewer.M0.getTranslationY() - (photoViewer.R1.getAlpha() * l.d.c(46.0f, photoViewer.R1.getEditTextHeight(), 0)));
                }
                org.telegram.ui.l0 l0Var = photoViewer.U1;
                if (l0Var != null) {
                    l0Var.setTranslationY(f10);
                }
                TextView textView = photoViewer.P7;
                if (textView != null && textView.getVisibility() != 8) {
                    photoViewer.P7.setTranslationY(f10);
                    return;
                }
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        int i11;
        switch (this.f5443a) {
            case 9:
                super.setVisibility(i10);
                PhotoViewer photoViewer = (PhotoViewer) this.f5446e;
                FrameLayout frameLayout = photoViewer.N7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    FrameLayout frameLayout2 = photoViewer.N7;
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

    public q1(n4 n4Var, Context context) {
        super(context);
        this.f5446e = n4Var;
        this.f5444b = new Matrix();
        this.f5445c = new float[8];
        this.d = new Path();
    }

    public q1(LimitPreviewView limitPreviewView, Context context, g6 g6Var) {
        super(context);
        this.f5446e = limitPreviewView;
        this.d = g6Var;
        this.f5444b = new Paint();
        Paint paint = new Paint();
        this.f5445c = paint;
        paint.setColor(-1);
    }

    public q1(Context context, hh.f fVar, g6 g6Var) {
        super(context);
        this.f5446e = fVar;
        this.d = g6Var;
        this.f5444b = new lf.b0(2);
        this.f5445c = new lf.b0(8);
    }

    public q1(fg.n1 n1Var, Context context, ScrollView scrollView, Drawable drawable) {
        super(context);
        this.f5446e = n1Var;
        this.f5444b = scrollView;
        this.f5445c = drawable;
        this.d = new Path();
    }

    public q1(Context context, g6 g6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.f5445c = textView;
        org.telegram.ui.b.g(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTextColor(k6.v0(k6.f21768j5, g6Var));
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.f5444b = imageView;
        org.telegram.ui.ActionBar.i2 i2Var = new org.telegram.ui.ActionBar.i2(false);
        this.d = i2Var;
        imageView.setImageDrawable(i2Var);
        i2Var.a(-1);
        addView(imageView, c6.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 16.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new f60(this, 29));
        b(true);
        setMinimumHeight(AndroidUtilities.dp(56.0f));
    }

    public q1(y5 y5Var, Context context) {
        super(context);
        this.f5446e = y5Var;
        this.d = new RectF();
        setWillNotDraw(false);
        View imageView = new ImageView(context);
        this.f5444b = imageView;
        TextView textView = new TextView(context);
        this.f5445c = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        addView(imageView, c6.e(-2, -2, 1));
        addView(textView, c6.d(-2, -2.0f, 1, 0.0f, 25.0f, 0.0f, 0.0f));
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        setMinimumWidth(AndroidUtilities.dp(100.0f));
        int dp = AndroidUtilities.dp(10.0f);
        int k10 = i0.a.k(-16777216, 80);
        setBackground(k6.i0(dp, dp, dp, dp, 0, k10, k10));
    }

    public q1(v31 v31Var, Context context) {
        super(context);
        this.f5446e = v31Var;
        this.d = new Path();
        Paint paint = new Paint(1);
        this.f5444b = paint;
        paint.setColor(v31Var.getThemedColor(k6.f21733h5));
        k6.m(paint);
    }

    public q1(jd1 jd1Var, Activity activity) {
        super(activity);
        this.f5446e = jd1Var;
        this.f5444b = new Paint(1);
        this.f5445c = new Paint(1);
        this.d = new Paint(1);
    }

    public q1(g5 g5Var, Context context) {
        super(context);
        this.f5446e = g5Var;
        this.f5444b = new RectF();
        this.f5445c = new Paint(1);
        this.d = new Path();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public q1(fg.q0 q0Var, Context context, g6 g6Var) {
        super(context);
        this.f5446e = q0Var;
        this.d = g6Var;
        this.f5444b = new fg.p1(k6.Lj, k6.Mj, -1, -1, g6Var);
        Paint paint = new Paint(1);
        this.f5445c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
    }

    public q1(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.f5446e = photoViewer;
        this.f5445c = new Paint(3);
        this.d = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, 2130706432}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f5444b = new Matrix();
    }
}
