package ai;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.kk;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s41;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.hs0;
import org.telegram.ui.is0;
import org.telegram.ui.kb1;
import org.telegram.ui.kc1;
import org.telegram.ui.qa1;
import org.telegram.ui.s50;
import org.telegram.ui.zb1;
public final class o5 extends FrameLayout {
    public final int f1933a = 0;
    public Object f1934b;
    public Object f1935c;
    public Object d;
    public Object e;

    public o5(Context context) {
        super(context);
    }

    public float a() {
        l7 l7Var = (l7) this.e;
        return (l7Var.f1721b1.a(3) * l7Var.D0.getMeasuredHeight()) + (l7Var.f1721b1.a(2) * l7Var.B0.getMeasuredHeight()) + (l7Var.f1721b1.a(1) * l7Var.f1752s0.getMeasuredHeight()) + (l7Var.f1721b1.a(0) * l7Var.f1730g0.getMeasuredHeight()) + l7Var.f1728f0.getRealHeight() + 0.0f;
    }

    public void b(boolean z10) {
        int i10;
        float f7;
        float f10;
        ImageView imageView = (ImageView) this.f1934b;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        TextView textView = (TextView) this.f1935c;
        boolean z11 = LocaleController.isRTL;
        if (!z11 && z10) {
            f7 = 53.0f;
        } else {
            f7 = 22.0f;
        }
        if (z11 && z10) {
            f10 = 53.0f;
        } else {
            f10 = 22.0f;
        }
        textView.setLayoutParams(w7.z5.d(-1, -2.0f, 55, f7, 14.0f, f10, 12.0f));
    }

    public void c(int i10, String str) {
        ((TextView) this.d).setText(str);
        ((ImageView) this.f1935c).setImageDrawable(getContext().getDrawable(i10));
    }

    public float d() {
        h6 h6Var;
        float max = Math.max(0.0f, getHeight() - a());
        l7 l7Var = (l7) this.e;
        im0 im0Var = l7Var.d;
        int childCount = im0Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = im0Var.getChildAt(childCount);
            im0Var.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                if (R == 2) {
                    max = childAt.getHeight() + childAt.getTranslationY() + childAt.getTop();
                    break;
                } else if (R == 1) {
                    max = childAt.getY();
                    break;
                } else if (R == 0) {
                    max = childAt.getY() - l7Var.f1728f0.getRealHeight();
                    break;
                }
            }
            childCount--;
        }
        float a2 = (l7Var.f1721b1.a(4) * l7Var.getBottomInset()) + max;
        Float f7 = l7Var.f1719a1;
        if (f7 != null && (h6Var = l7Var.f1721b1) != null && h6Var.f1423a < 1.0f) {
            return AndroidUtilities.lerp(f7.floatValue(), a2, l7Var.f1721b1.f1423a);
        }
        return a2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        int v;
        FrameLayout frameLayout;
        int i10;
        Paint e;
        float globalXOffset;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float globalXOffset2;
        Drawable drawable;
        int i11;
        Drawable drawable2;
        switch (this.f1933a) {
            case 0:
                l7 l7Var = (l7) this.e;
                org.telegram.ui.Components.xa xaVar = l7Var.e;
                FrameLayout frameLayout2 = l7Var.f1740l0;
                l7Var.J(canvas, this);
                canvas.save();
                float d = d();
                float dp = AndroidUtilities.dp(12.0f);
                RectF rectF = (RectF) this.f1934b;
                rectF.set(l7.A1(l7Var), d, getWidth() - l7.B1(l7Var), getHeight() + dp);
                Paint paint = (Paint) this.f1935c;
                paint.setColor(l7Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21058h5));
                Path path = (Path) this.d;
                path.rewind();
                path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
                canvas.drawPath(path, paint);
                super.dispatchDraw(canvas);
                if (getPaddingBottom() > 0 && frameLayout2.getVisibility() == 0 && frameLayout2.getAlpha() > 0.0f) {
                    paint.setAlpha((int) (frameLayout2.getAlpha() * 255.0f));
                    canvas.drawRect(l7.C1(l7Var), getHeight() - getPaddingBottom(), getWidth() - l7.D1(l7Var), getHeight(), paint);
                    paint.setAlpha(255);
                }
                e();
                canvas.restore();
                if (xaVar != null && xaVar.getVisibility() == 0 && xaVar.getAlpha() > 0.0f) {
                    if (xaVar.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(xaVar.getX(), xaVar.getY(), xaVar.getMeasuredWidth() + xaVar.getX(), xaVar.getMeasuredHeight() + xaVar.getY(), (int) (xaVar.getAlpha() * 255.0f), 31);
                    } else {
                        canvas.save();
                        canvas.clipRect(xaVar.getX(), xaVar.getY(), xaVar.getX() + xaVar.getMeasuredWidth(), xaVar.getY() + xaVar.getMeasuredHeight());
                    }
                    canvas.translate(xaVar.getX(), xaVar.getY());
                    xaVar.draw(canvas);
                    canvas.restore();
                }
                l7Var.I(canvas, this);
                return;
            case 1:
            case 2:
            case 5:
            case 7:
            default:
                super.dispatchDraw(canvas);
                return;
            case 3:
                Path path2 = (Path) this.d;
                s41 s41Var = (s41) this.e;
                boolean z11 = true;
                float B = s41Var.B(true);
                float lerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(12.0f), w7.r.a(B / AndroidUtilities.dpf2(24.0f), 0.0f, 1.0f));
                s41Var.f30178x.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, B));
                if (B <= AndroidUtilities.statusBarHeight / 2.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Boolean bool = (Boolean) this.f1934b;
                if (bool == null || bool.booleanValue() != z10) {
                    this.f1934b = Boolean.valueOf(z10);
                    Window window = s41Var.getWindow();
                    if (z10) {
                        v = s41Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21058h5);
                    } else {
                        v = org.telegram.ui.ActionBar.h6.v(s41Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21266s8), 855638016);
                    }
                    if (AndroidUtilities.computePerceivedBrightness(v) <= 0.721f) {
                        z11 = false;
                    }
                    AndroidUtilities.setLightStatusBar(window, z11);
                }
                s41Var.topBulletinContainer.setTranslationY(Math.max(s41Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, B) + getTranslationY() + ((-frameLayout.getTop()) - s41Var.topBulletinContainer.getHeight()));
                path2.rewind();
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, B, getWidth(), getHeight() + lerp);
                path2.addRoundRect(rectF2, lerp, lerp, Path.Direction.CW);
                canvas.drawPath(path2, (Paint) this.f1935c);
                super.dispatchDraw(canvas);
                return;
            case 4:
                LinearGradient linearGradient = (LinearGradient) this.f1934b;
                Matrix matrix = (Matrix) this.d;
                Paint paint2 = (Paint) this.f1935c;
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (!photoViewer.S4) {
                    if (photoViewer.f33350n0.getVisibility() == 0) {
                        i10 = getMeasuredHeight() - AndroidUtilities.dp(48.0f);
                    } else {
                        i10 = 0;
                    }
                    int i12 = photoViewer.f33256c2;
                    if (i12 != 0 && i12 != 2 && i12 != -1) {
                        paint2.setShader(null);
                        paint2.setColor(2130706432);
                    } else {
                        matrix.reset();
                        matrix.postTranslate(0.0f, i10);
                        matrix.postScale(1.0f, Math.min(AndroidUtilities.dp(40.0f), getMeasuredHeight() - i10) / 16.0f);
                        linearGradient.setLocalMatrix(matrix);
                        paint2.setShader(linearGradient);
                    }
                    canvas.drawRect(0.0f, i10, getMeasuredWidth(), getMeasuredHeight(), paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 6:
                Paint paint3 = (Paint) this.d;
                Paint paint4 = (Paint) this.f1934b;
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                float dp2 = AndroidUtilities.dp(8.0f);
                Paint paint5 = (Paint) this.f1935c;
                paint5.setColor(0);
                float dpf2 = AndroidUtilities.dpf2(1.0f);
                float dpf22 = AndroidUtilities.dpf2(0.33f);
                kc1 kc1Var = (kc1) this.e;
                paint5.setShadowLayer(dpf2, 0.0f, dpf22, i0.a.o(-16777216, (int) (kc1Var.R1.getAlpha() * 27.0f)));
                canvas.drawRoundRect(rectF3, dp2, dp2, paint5);
                zb1 zb1Var = kc1Var.f38572x0;
                kb1 kb1Var = kc1Var.f38510a;
                org.telegram.ui.ActionBar.h6.s(this, zb1Var, kb1Var);
                Paint n10 = kb1Var.n("paintChatActionBackground");
                int alpha = n10.getAlpha();
                n10.setAlpha((int) (kc1Var.R1.getAlpha() * alpha));
                canvas.drawRoundRect(rectF3, dp2, dp2, n10);
                n10.setAlpha(alpha);
                if (kc1Var.M1) {
                    float f7 = kc1Var.f38549n1;
                    if (f7 > 0.0f) {
                        paint3.setColor(i0.a.o(-16777216, (int) (f7 * 255.0f * kc1Var.f38551o1)));
                        canvas.drawRoundRect(rectF3, dp2, dp2, paint3);
                    }
                }
                paint4.setColor(520093695);
                paint4.setAlpha((int) (kc1Var.R1.getAlpha() * 30.0f));
                canvas.drawRoundRect(rectF3, dp2, dp2, paint4);
                super.dispatchDraw(canvas);
                return;
            case 8:
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.d;
                Paint paint6 = (Paint) this.f1935c;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                if (limitPreviewView.P) {
                    if (!limitPreviewView.f24282c0 && !limitPreviewView.R) {
                        paint6.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.e7, d6Var));
                    } else {
                        paint6.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21076i6, d6Var));
                    }
                } else {
                    paint6.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20929a7, d6Var));
                }
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                sg.t tVar = limitPreviewView.f24284e0;
                if (tVar != null) {
                    canvas.drawRoundRect(rectF4, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ((org.telegram.ui.z5) ((org.telegram.ui.b1) tVar).f35464b).u0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                } else {
                    canvas.drawRoundRect(rectF4, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint6);
                }
                canvas.save();
                if (!limitPreviewView.P) {
                    canvas.clipRect(limitPreviewView.f24292n, 0, getMeasuredWidth(), getMeasuredHeight());
                }
                if (limitPreviewView.R) {
                    e = limitPreviewView.K;
                } else if (limitPreviewView.f24284e0 != null) {
                    e = (Paint) this.f1934b;
                } else {
                    e = sg.b1.d().e();
                }
                ViewGroup viewGroup = limitPreviewView.f24297y;
                if (viewGroup != null) {
                    sg.a1 a1Var = limitPreviewView.E;
                    if (a1Var != null) {
                        e = a1Var.f46186f;
                        a1Var.a();
                        Matrix matrix2 = a1Var.e;
                        matrix2.reset();
                        matrix2.postScale(1.0f, limitPreviewView.f24281c / 100.0f, 0.0f, 0.0f);
                        matrix2.postTranslate(0.0f, -limitPreviewView.F);
                        a1Var.d.setLocalMatrix(matrix2);
                    } else {
                        float f10 = 0.0f;
                        for (View view = this; view != viewGroup; view = (View) view.getParent()) {
                            f10 += view.getY();
                        }
                        sg.b1 d10 = sg.b1.d();
                        int measuredWidth = viewGroup.getMeasuredWidth();
                        int measuredHeight = viewGroup.getMeasuredHeight();
                        globalXOffset2 = limitPreviewView.getGlobalXOffset();
                        d10.f(globalXOffset2 - getLeft(), -f10, measuredWidth, measuredHeight);
                    }
                } else {
                    sg.b1 d11 = sg.b1.d();
                    int measuredWidth2 = limitPreviewView.getMeasuredWidth();
                    int measuredHeight2 = limitPreviewView.getMeasuredHeight();
                    globalXOffset = limitPreviewView.getGlobalXOffset();
                    d11.f(globalXOffset - getLeft(), -getTop(), measuredWidth2, measuredHeight2);
                }
                int alpha2 = e.getAlpha();
                if (limitPreviewView.V && (valueAnimator2 = limitPreviewView.f24289i0) != null) {
                    e.setAlpha((int) ((1.0f - ((Float) valueAnimator2.getAnimatedValue()).floatValue()) * alpha2));
                } else if (limitPreviewView.U && (valueAnimator = limitPreviewView.f24289i0) != null) {
                    e.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * alpha2));
                }
                if (limitPreviewView.P) {
                    if (!limitPreviewView.L && !limitPreviewView.M) {
                        AndroidUtilities.rectTmp.set(0.0f, 0.0f, limitPreviewView.f24292n, getMeasuredHeight());
                    } else {
                        AndroidUtilities.rectTmp.set(limitPreviewView.f24292n, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    }
                }
                canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), e);
                e.setAlpha(alpha2);
                canvas.restore();
                if (limitPreviewView.E == null && limitPreviewView.f24283d0) {
                    invalidate();
                }
                super.dispatchDraw(canvas);
                return;
            case 9:
                Paint paint7 = (Paint) this.f1935c;
                paint7.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Ii, (org.telegram.ui.ActionBar.d6) this.d));
                sg.g0 g0Var = (sg.g0) this.e;
                canvas.drawLine(AndroidUtilities.dp(18.0f), getHeight() / 2.0f, g0Var.d.getLeft() - AndroidUtilities.dp(20.0f), getHeight() / 2.0f, paint7);
                canvas.drawLine(AndroidUtilities.dp(20.0f) + g0Var.d.getRight(), getHeight() / 2.0f, getWidth() - AndroidUtilities.dp(18.0f), getHeight() / 2.0f, paint7);
                RectF rectF5 = AndroidUtilities.rectTmp;
                int top = g0Var.d.getTop();
                rectF5.set(g0Var.d.getLeft() - AndroidUtilities.dp(15.0f), ((g0Var.d.getBottom() + top) - AndroidUtilities.dp(30.0f)) / 2.0f, AndroidUtilities.dp(15.0f) + g0Var.d.getRight(), (AndroidUtilities.dp(30.0f) + (g0Var.d.getBottom() + g0Var.d.getTop())) / 2.0f);
                canvas.save();
                canvas.translate(rectF5.left, rectF5.top);
                rectF5.set(0.0f, 0.0f, rectF5.width(), rectF5.height());
                sg.a1 a1Var2 = (sg.a1) this.f1934b;
                a1Var2.e(rectF5);
                canvas.drawRoundRect(rectF5, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), a1Var2.f46186f);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            case 10:
                Drawable drawable3 = (Drawable) this.f1935c;
                sg.y0 y0Var = (sg.y0) this.e;
                drawable = ((org.telegram.ui.ActionBar.f3) y0Var).shadowDrawable;
                int i13 = y0Var.M;
                i11 = ((org.telegram.ui.ActionBar.f3) y0Var).backgroundPaddingTop;
                drawable.setBounds(0, kk.D(2.0f, i11 + i13, 1), getMeasuredWidth(), getMeasuredHeight());
                drawable2 = ((org.telegram.ui.ActionBar.f3) y0Var).shadowDrawable;
                drawable2.draw(canvas);
                super.dispatchDraw(canvas);
                org.telegram.ui.Components.z7 z7Var = y0Var.N;
                if (z7Var != null && z7Var.getVisibility() == 0 && y0Var.N.getAlpha() != 0.0f) {
                    drawable3.setBounds(0, y0Var.N.getBottom(), getMeasuredWidth(), drawable3.getIntrinsicHeight() + y0Var.N.getBottom());
                    drawable3.setAlpha((int) (y0Var.N.getAlpha() * 255.0f));
                    drawable3.draw(canvas);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i10;
        switch (this.f1933a) {
            case 0:
                l7 l7Var = (l7) this.e;
                if (motionEvent.getAction() == 0 && motionEvent.getY() < d() && l7.z1(l7Var).isAttachedToWindow()) {
                    l7Var.dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 3:
                s41 s41Var = (s41) this.e;
                if (s41Var.J != null && s41Var.K != null) {
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                        Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + s41Var.J.x());
                    }
                    if (s41Var.J.x() && s41Var.K.onTouchEvent(motionEvent)) {
                        Log.d("TA2", "overlay consumed (handle)");
                        return true;
                    }
                    boolean b10 = s41Var.K.b(motionEvent);
                    if (motionEvent.getAction() == 1) {
                        Log.d("TA2", "checkOnTap=" + b10);
                    }
                    if (b10) {
                        motionEvent.setAction(3);
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 10:
                sg.y0 y0Var = (sg.y0) this.e;
                if (motionEvent.getAction() == 0) {
                    float y3 = motionEvent.getY();
                    int i11 = y0Var.M;
                    i10 = ((org.telegram.ui.ActionBar.f3) y0Var).backgroundPaddingTop;
                    if (y3 < AndroidUtilities.dp(2.0f) + (i11 - i10)) {
                        y0Var.dismiss();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f1933a) {
            case 1:
                RectF rectF = (RectF) this.f1934b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), ((org.telegram.ui.z5) this.e).u0(getX() + ((ViewGroup) getParent()).getX(), ((ViewGroup) getParent().getParent().getParent()).getY()));
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
        switch (this.f1933a) {
            case 0:
                l7 l7Var = (l7) this.e;
                if (view == l7Var.e) {
                    return false;
                }
                if (view != l7Var.f1726e0) {
                    canvas.save();
                    canvas.clipPath((Path) this.d);
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j10);
            case 7:
                float[] fArr = (float[]) this.f1935c;
                Path path = (Path) this.d;
                Matrix matrix = (Matrix) this.f1934b;
                ei.r5 r5Var = (ei.r5) this.e;
                rg.x0 x0Var = r5Var.f45326r0;
                if (view == r5Var.f45331w0) {
                    org.telegram.ui.Cells.u1 q6 = rg.e1.q(r5Var);
                    if (q6 == null || (photoImage = q6.getPhotoImage()) == null) {
                        return false;
                    }
                    matrix.reset();
                    float max = Math.max(photoImage.getImageWidth() / r5Var.f45333y0, photoImage.getImageHeight() / r5Var.f45334z0);
                    matrix.postScale((r5Var.f45333y0 / r5Var.f45331w0.getWidth()) * max, (r5Var.f45334z0 / r5Var.f45331w0.getHeight()) * max);
                    matrix.postTranslate((photoImage.getCenterX() + (q6.getX() + x0Var.getX())) - ((r5Var.f45333y0 * max) / 2.0f), (photoImage.getCenterY() + (q6.getY() + x0Var.getY())) - ((r5Var.f45334z0 * max) / 2.0f));
                    r5Var.f45331w0.setTransform(matrix);
                    canvas.save();
                    path.rewind();
                    AndroidUtilities.rectTmp.set(photoImage.getImageX() + q6.getX() + x0Var.getX(), photoImage.getImageY() + q6.getY() + x0Var.getY(), photoImage.getImageX2() + q6.getX() + x0Var.getX(), photoImage.getImageY2() + q6.getY() + x0Var.getY());
                    for (int i10 = 0; i10 < photoImage.getRoundRadius().length; i10++) {
                        int i11 = i10 * 2;
                        fArr[i11] = photoImage.getRoundRadius()[i10];
                        fArr[i11 + 1] = photoImage.getRoundRadius()[i10];
                    }
                    path.addRoundRect(AndroidUtilities.rectTmp, fArr, Path.Direction.CW);
                    canvas.clipPath(path);
                    boolean drawChild2 = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild2;
                }
                return super.drawChild(canvas, view, j10);
            case 10:
                Path path2 = (Path) this.d;
                if (view == ((ScrollView) this.f1934b)) {
                    canvas.save();
                    path2.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(getPaddingLeft(), AndroidUtilities.dp(18.0f) + ((sg.y0) this.e).M, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
                    path2.addRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Path.Direction.CW);
                    canvas.clipPath(path2);
                    super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 11:
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.d;
                zf.y yVar = (zf.y) this.f1935c;
                zf.y yVar2 = (zf.y) this.f1934b;
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                uh.f fVar = (uh.f) this.e;
                int i12 = (int) fVar.X.e;
                if (view == fVar.f47842h0 && i12 > 0) {
                    yVar2.setBounds(0, AndroidUtilities.dp(40.0f), getWidth(), AndroidUtilities.dp(48.0f));
                    int i13 = org.telegram.ui.ActionBar.h6.f21058h5;
                    yVar2.b(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
                    yVar2.draw(canvas);
                    int dp = AndroidUtilities.dp(48.0f) + i12;
                    yVar.setBounds(0, dp - AndroidUtilities.dp(8.0f), getWidth(), dp);
                    yVar.b(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
                    yVar.draw(canvas);
                }
                return drawChild3;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    public void e() {
        float d = d();
        l7 l7Var = (l7) this.e;
        l5 l5Var = l7Var.f1726e0;
        l5Var.setTranslationY(d - l5Var.getHeight());
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(d - l5Var.getHeight(), 0.0f, AndroidUtilities.dp(32.0f)));
        l5Var.setAlpha(l7Var.f1721b1.a(0) * clamp01);
        l5Var.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        l5Var.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        f7 f7Var = l7Var.f1728f0;
        f7Var.setTranslationY(d);
        l7Var.f1730g0.setTranslationY(f7Var.getRealHeight() + d);
        l7Var.f1752s0.setTranslationY(f7Var.getRealHeight() + d);
        l7Var.B0.setTranslationY(f7Var.getRealHeight() + d);
        l7Var.D0.setTranslationY(f7Var.getRealHeight() + d);
        FrameLayout frameLayout = l7Var.topBulletinContainer;
        if (frameLayout != null) {
            frameLayout.setTranslationY((getTranslationY() - a()) - AndroidUtilities.navigationBarHeight);
        }
        AndroidUtilities.updateViewVisibilityAnimated(l7Var.f1744o0, l7Var.d.canScrollVertically(1));
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f1933a) {
            case 10:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f1933a) {
            case 3:
                super.onAttachedToWindow();
                org.telegram.ui.Components.qc.a(this, new ei.o8(9));
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f1933a) {
            case 3:
                super.onDetachedFromWindow();
                org.telegram.ui.Components.qc.h(this);
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f1933a) {
            case 2:
                RectF rectF = (RectF) this.f1934b;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float[] fArr = (float[]) this.e;
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
                Paint paint = (Paint) this.f1935c;
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
        int i14;
        int i15;
        int left;
        int boundsRight;
        switch (this.f1933a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                l7 l7Var = (l7) this.e;
                m5 m5Var = l7Var.T0;
                if (m5Var != null) {
                    int finalHeight = l7Var.f1728f0.getFinalHeight();
                    int U1 = l7Var.U1();
                    if (l7Var.f1721b1.d(1) && l7Var.f1742n0.getVisibility() == 0) {
                        i14 = l7Var.f1742n0.getMeasuredHeight();
                    } else {
                        i14 = 0;
                    }
                    m5Var.F(finalHeight, U1 + i14);
                }
                l7Var.o2();
                return;
            case 4:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (photoViewer.H0.getVisibility() != 8) {
                    if (photoViewer.S0.getVisibility() == 0) {
                        i15 = AndroidUtilities.dp(63.0f);
                    } else {
                        i15 = 0;
                    }
                    int measuredWidth = (((i12 - i10) - i15) - photoViewer.H0.getMeasuredWidth()) / 2;
                    qa1 qa1Var = photoViewer.H0;
                    qa1Var.layout(measuredWidth, qa1Var.getTop(), photoViewer.H0.getMeasuredWidth() + measuredWidth, photoViewer.H0.getMeasuredHeight() + photoViewer.H0.getTop());
                    return;
                }
                return;
            case 7:
                ei.r5 r5Var = (ei.r5) this.e;
                rg.x0 x0Var = r5Var.f45326r0;
                int measuredWidth2 = x0Var.getMeasuredWidth();
                int i16 = 0;
                for (int i17 = 0; i17 < x0Var.getChildCount(); i17++) {
                    View childAt = x0Var.getChildAt(i17);
                    int left2 = childAt.getLeft();
                    int right = childAt.getRight();
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                        left2 = childAt.getLeft() + u1Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = u1Var.getBoundsRight();
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                        left2 = childAt.getLeft() + w0Var.getBoundsLeft();
                        left = childAt.getLeft();
                        boundsRight = w0Var.getBoundsRight();
                    } else {
                        measuredWidth2 = Math.min(left2, measuredWidth2);
                        i16 = Math.max(right, i16);
                    }
                    right = boundsRight + left;
                    measuredWidth2 = Math.min(left2, measuredWidth2);
                    i16 = Math.max(right, i16);
                }
                x0Var.layout(-measuredWidth2, 0, x0Var.getMeasuredWidth() - measuredWidth2, x0Var.getMeasuredHeight());
                TextureView textureView = r5Var.f45331w0;
                if (textureView != null) {
                    textureView.layout(0, 0, getMeasuredWidth(), x0Var.getMeasuredHeight());
                    return;
                }
                return;
            case 8:
                if (getChildCount() == 2) {
                    View childAt2 = getChildAt(0);
                    View childAt3 = getChildAt(1);
                    int measuredWidth3 = childAt2.getMeasuredWidth();
                    int i18 = i13 - i11;
                    childAt2.layout(0, 0, measuredWidth3, i18);
                    childAt3.layout(measuredWidth3, 0, i12 - i10, i18);
                    return;
                }
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int left;
        int boundsRight;
        int i14;
        float measuredWidth;
        int w02;
        int w03;
        int i15;
        switch (this.f1933a) {
            case 0:
                l7 l7Var = (l7) this.e;
                int bottomInset = l7Var.getBottomInset();
                int i16 = 0;
                setPadding(0, 0, 0, bottomInset);
                l7Var.f1728f0.M.setPadding(0, 0, 0, bottomInset);
                int size = View.MeasureSpec.getSize(i11);
                l7Var.h = size;
                int size2 = View.MeasureSpec.getSize(i10);
                for (int i17 = 0; i17 < getChildCount(); i17++) {
                    View childAt = getChildAt(i17);
                    if (childAt instanceof ei.x3) {
                        childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
                    } else if (childAt == l7Var.d) {
                        childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(size - bottomInset, 1073741824));
                    } else {
                        if (childAt.getLayoutParams() != null && childAt.getLayoutParams().height == -1) {
                            i12 = size;
                        } else {
                            i12 = 9999;
                        }
                        childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE));
                    }
                }
                setMeasuredDimension(size2, size);
                m5 m5Var = l7Var.T0;
                if (m5Var != null) {
                    int finalHeight = l7Var.f1728f0.getFinalHeight();
                    int U1 = l7Var.U1();
                    if (l7Var.f1721b1.d(1) && l7Var.f1742n0.getVisibility() == 0) {
                        i16 = l7Var.f1742n0.getMeasuredHeight();
                    }
                    m5Var.F(finalHeight, U1 + i16);
                    return;
                }
                return;
            case 1:
            case 2:
            case 6:
            case 9:
            default:
                super.onMeasure(i10, i11);
                return;
            case 3:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                return;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) photoViewer.H0.getLayoutParams();
                if (photoViewer.S0.getVisibility() == 0) {
                    i13 = AndroidUtilities.dp(63.0f);
                } else {
                    i13 = 0;
                }
                layoutParams.rightMargin = i13;
                super.onMeasure(i10, i11);
                return;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
                return;
            case 7:
                ei.r5 r5Var = (ei.r5) this.e;
                rg.x0 x0Var = r5Var.f45326r0;
                x0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                TextureView textureView = r5Var.f45331w0;
                if (textureView != null) {
                    textureView.measure(View.MeasureSpec.makeMeasureSpec(x0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(x0Var.getMeasuredHeight(), 1073741824));
                }
                int measuredWidth2 = x0Var.getMeasuredWidth();
                int i18 = 0;
                for (int i19 = 0; i19 < x0Var.getChildCount(); i19++) {
                    View childAt2 = x0Var.getChildAt(i19);
                    int left2 = childAt2.getLeft();
                    int right = childAt2.getRight();
                    if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt2;
                        left2 = childAt2.getLeft() + u1Var.getBoundsLeft();
                        left = childAt2.getLeft();
                        boundsRight = u1Var.getBoundsRight();
                    } else if (childAt2 instanceof org.telegram.ui.Cells.w0) {
                        org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt2;
                        left2 = childAt2.getLeft() + w0Var.getBoundsLeft();
                        left = childAt2.getLeft();
                        boundsRight = w0Var.getBoundsRight();
                    } else {
                        measuredWidth2 = Math.min(left2, measuredWidth2);
                        i18 = Math.max(right, i18);
                    }
                    right = boundsRight + left;
                    measuredWidth2 = Math.min(left2, measuredWidth2);
                    i18 = Math.max(right, i18);
                }
                setMeasuredDimension(i18 - measuredWidth2, x0Var.getMeasuredHeight());
                return;
            case 8:
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.d;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                TextView textView = limitPreviewView.f24295w;
                dh0 dh0Var = limitPreviewView.f24287g0;
                org.telegram.ui.Components.q6 q6Var = limitPreviewView.N;
                dh0 dh0Var2 = limitPreviewView.f24286f0;
                org.telegram.ui.Components.q6 q6Var2 = limitPreviewView.v;
                if (getChildCount() == 2) {
                    int size3 = View.MeasureSpec.getSize(i10);
                    int size4 = View.MeasureSpec.getSize(i11);
                    dh0Var2.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                    int measuredWidth3 = dh0Var2.getMeasuredWidth();
                    int measuredWidth4 = q6Var.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                    int i20 = 0;
                    if (textView.getVisibility() == 0) {
                        i14 = textView.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                    } else {
                        i14 = 0;
                    }
                    int max = Math.max(measuredWidth3, measuredWidth4 + i14);
                    dh0Var.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                    if (limitPreviewView.P) {
                        float f7 = limitPreviewView.f24277a;
                        float f10 = 0.0f;
                        int i21 = -1;
                        if (f7 == 0.0f) {
                            limitPreviewView.f24292n = 0;
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                if (limitPreviewView.L || limitPreviewView.f24284e0 != null) {
                                    w03 = -1;
                                } else {
                                    w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var);
                                }
                                q6Var2.setTextColor(w03);
                                if (limitPreviewView.f24284e0 == null) {
                                    i21 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var);
                                }
                                q6Var.setTextColor(i21);
                            }
                        } else if (f7 < 1.0f) {
                            if (limitPreviewView.L) {
                                measuredWidth = 0.0f;
                            } else {
                                measuredWidth = dh0Var2.getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                            }
                            if (!limitPreviewView.L) {
                                f10 = dh0Var.getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                            }
                            limitPreviewView.f24292n = (int) ((((size3 - measuredWidth) - f10) * limitPreviewView.f24277a) + measuredWidth);
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                if (limitPreviewView.L || limitPreviewView.f24284e0 != null) {
                                    w02 = -1;
                                } else {
                                    w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var);
                                }
                                q6Var2.setTextColor(w02);
                                q6Var.setTextColor(-1);
                            }
                        } else {
                            limitPreviewView.f24292n = size3;
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                q6Var2.setTextColor(-1);
                                q6Var.setTextColor(-1);
                            }
                        }
                    } else {
                        int measuredWidth5 = dh0Var.getMeasuredWidth();
                        int measuredWidth6 = limitPreviewView.O.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                        if (q6Var2.getVisibility() == 0) {
                            i20 = q6Var2.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                        }
                        int clamp = (int) Utilities.clamp(size3 * limitPreviewView.f24277a, size3 - Math.max(measuredWidth5, measuredWidth6 + i20), max);
                        limitPreviewView.f24292n = clamp;
                        dh0Var2.measure(View.MeasureSpec.makeMeasureSpec(clamp, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                        dh0Var.measure(View.MeasureSpec.makeMeasureSpec(size3 - limitPreviewView.f24292n, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                    }
                    setMeasuredDimension(size3, size4);
                    return;
                }
                super.onMeasure(i10, i11);
                return;
            case 10:
                sg.y0 y0Var = (sg.y0) this.e;
                y0Var.L = 0;
                ScrollView scrollView = (ScrollView) this.f1934b;
                scrollView.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), Integer.MIN_VALUE));
                int size5 = View.MeasureSpec.getSize(i11) - scrollView.getMeasuredHeight();
                i15 = ((org.telegram.ui.ActionBar.f3) y0Var).backgroundPaddingTop;
                y0Var.L = i15 + size5;
                super.onMeasure(i10, i11);
                y0Var.A();
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f1933a) {
            case 4:
                super.setAlpha(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.R7.setAlpha(f7);
                }
                hs0 hs0Var = photoViewer.U1;
                if (hs0Var != null && hs0Var.getVisibility() != 8) {
                    photoViewer.U1.setAlpha(photoViewer.f33458y7[0] * f7);
                }
                is0 is0Var = photoViewer.V1;
                if (is0Var != null && is0Var.getVisibility() != 8) {
                    photoViewer.V1.setAlpha(f7 * photoViewer.f33467z7[0]);
                    return;
                }
                return;
            default:
                super.setAlpha(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f1933a) {
            case 0:
                super.setTranslationY(f7);
                FrameLayout frameLayout = ((l7) this.e).topBulletinContainer;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((getTranslationY() - a()) - AndroidUtilities.navigationBarHeight);
                    return;
                }
                return;
            case 3:
                super.setTranslationY(f7);
                s41 s41Var = (s41) this.e;
                FrameLayout frameLayout2 = s41Var.topBulletinContainer;
                frameLayout2.setTranslationY(Math.max(s41Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, s41Var.B(true)) + ((-frameLayout2.getTop()) - s41Var.topBulletinContainer.getHeight()) + f7);
                return;
            case 4:
                super.setTranslationY(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout3 = photoViewer.R7;
                if (frameLayout3 != null && frameLayout3.getVisibility() != 8) {
                    photoViewer.R7.setTranslationY(photoViewer.P0.getTranslationY() - (photoViewer.U1.getAlpha() * org.telegram.messenger.g0.b(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                }
                org.telegram.ui.m0 m0Var = photoViewer.X1;
                if (m0Var != null) {
                    m0Var.setTranslationY(f7);
                }
                TextView textView = photoViewer.T7;
                if (textView != null && textView.getVisibility() != 8) {
                    photoViewer.T7.setTranslationY(f7);
                    return;
                }
                return;
            case 10:
                super.setTranslationY(f7);
                ((sg.y0) this.e).onContainerTranslationYChanged(f7);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        int i11;
        switch (this.f1933a) {
            case 4:
                super.setVisibility(i10);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    FrameLayout frameLayout2 = photoViewer.R7;
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

    public o5(ei.r5 r5Var, Context context) {
        super(context);
        this.e = r5Var;
        this.f1934b = new Matrix();
        this.f1935c = new float[8];
        this.d = new Path();
    }

    public o5(LimitPreviewView limitPreviewView, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.e = limitPreviewView;
        this.d = d6Var;
        this.f1935c = new Paint();
        Paint paint = new Paint();
        this.f1934b = paint;
        paint.setColor(-1);
    }

    public o5(Context context, org.telegram.ui.ActionBar.d6 d6Var, uh.f fVar) {
        super(context);
        this.e = fVar;
        this.d = d6Var;
        this.f1934b = new zf.y(2);
        this.f1935c = new zf.y(8);
    }

    public o5(sg.y0 y0Var, Context context, ScrollView scrollView, Drawable drawable) {
        super(context);
        this.e = y0Var;
        this.f1934b = scrollView;
        this.f1935c = drawable;
        this.d = new Path();
    }

    public o5(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.f1935c = textView;
        kk.k(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21093j5, d6Var));
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.f1934b = imageView;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.d = g2Var;
        imageView.setImageDrawable(g2Var);
        g2Var.a(-1);
        addView(imageView, w7.z5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 16.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new s50(this, 28));
        b(true);
        setMinimumHeight(AndroidUtilities.dp(56.0f));
    }

    public o5(org.telegram.ui.z5 z5Var, Context context) {
        super(context);
        this.e = z5Var;
        this.f1934b = new RectF();
        setWillNotDraw(false);
        View imageView = new ImageView(context);
        this.f1935c = imageView;
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        addView(imageView, w7.z5.e(-2, -2, 1));
        addView(textView, w7.z5.d(-2, -2.0f, 1, 0.0f, 25.0f, 0.0f, 0.0f));
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        setMinimumWidth(AndroidUtilities.dp(100.0f));
        int dp = AndroidUtilities.dp(10.0f);
        int o10 = i0.a.o(-16777216, 80);
        setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, 0, o10, o10));
    }

    public o5(s41 s41Var, Context context) {
        super(context);
        this.e = s41Var;
        this.d = new Path();
        Paint paint = new Paint(1);
        this.f1935c = paint;
        paint.setColor(s41Var.getThemedColor(org.telegram.ui.ActionBar.h6.f21058h5));
        org.telegram.ui.ActionBar.h6.m(paint);
    }

    public o5(kc1 kc1Var, Activity activity) {
        super(activity);
        this.e = kc1Var;
        this.f1935c = new Paint(1);
        this.f1934b = new Paint(1);
        this.d = new Paint(1);
    }

    public o5(l7 l7Var, Context context) {
        super(context);
        this.e = l7Var;
        this.f1934b = new RectF();
        this.f1935c = new Paint(1);
        this.d = new Path();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public o5(sg.g0 g0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.e = g0Var;
        this.d = d6Var;
        this.f1934b = new sg.a1(org.telegram.ui.ActionBar.h6.Lj, org.telegram.ui.ActionBar.h6.Mj, -1, -1, d6Var);
        Paint paint = new Paint(1);
        this.f1935c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
    }

    public o5(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.e = photoViewer;
        this.f1935c = new Paint(3);
        this.f1934b = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, 2130706432}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.d = new Matrix();
    }
}
