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
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.tl;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ec1;
import org.telegram.ui.js0;
import org.telegram.ui.ks0;
import org.telegram.ui.pb1;
import org.telegram.ui.pc1;
import org.telegram.ui.ua1;
import org.telegram.ui.w50;
public final class o5 extends FrameLayout {
    public final int f1934a = 0;
    public Object f1935b;
    public Object f1936c;
    public Object d;
    public Object e;

    public o5(Context context) {
        super(context);
    }

    public float a() {
        l7 l7Var = (l7) this.e;
        return (l7Var.f1713b1.a(3) * l7Var.D0.getMeasuredHeight()) + (l7Var.f1713b1.a(2) * l7Var.B0.getMeasuredHeight()) + (l7Var.f1713b1.a(1) * l7Var.f1744s0.getMeasuredHeight()) + (l7Var.f1713b1.a(0) * l7Var.f1722g0.getMeasuredHeight()) + l7Var.f1720f0.getRealHeight() + 0.0f;
    }

    public void b(boolean z10) {
        int i10;
        float f7;
        float f10;
        ImageView imageView = (ImageView) this.f1935b;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        TextView textView = (TextView) this.f1936c;
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
        ((ImageView) this.f1936c).setImageDrawable(getContext().getDrawable(i10));
    }

    public float d() {
        h6 h6Var;
        float max = Math.max(0.0f, getHeight() - a());
        l7 l7Var = (l7) this.e;
        lm0 lm0Var = l7Var.d;
        int childCount = lm0Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = lm0Var.getChildAt(childCount);
            lm0Var.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                if (R == 2) {
                    max = childAt.getHeight() + childAt.getTranslationY() + childAt.getTop();
                    break;
                } else if (R == 1) {
                    max = childAt.getY();
                    break;
                } else if (R == 0) {
                    max = childAt.getY() - l7Var.f1720f0.getRealHeight();
                    break;
                }
            }
            childCount--;
        }
        float a2 = (l7Var.f1713b1.a(4) * l7Var.getBottomInset()) + max;
        Float f7 = l7Var.f1711a1;
        if (f7 != null && (h6Var = l7Var.f1713b1) != null && h6Var.f1403a < 1.0f) {
            return AndroidUtilities.lerp(f7.floatValue(), a2, l7Var.f1713b1.f1403a);
        }
        return a2;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        int i10;
        Paint e;
        float globalXOffset;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        float globalXOffset2;
        Drawable drawable;
        int i11;
        Drawable drawable2;
        switch (this.f1934a) {
            case 0:
                l7 l7Var = (l7) this.e;
                org.telegram.ui.Components.va vaVar = l7Var.e;
                FrameLayout frameLayout = l7Var.f1732l0;
                l7Var.I(canvas, this);
                canvas.save();
                float d = d();
                float dp = AndroidUtilities.dp(12.0f);
                RectF rectF = (RectF) this.f1935b;
                rectF.set(l7.z1(l7Var), d, getWidth() - l7.A1(l7Var), getHeight() + dp);
                Paint paint = (Paint) this.f1936c;
                paint.setColor(l7Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21255h5));
                Path path = (Path) this.d;
                path.rewind();
                path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
                canvas.drawPath(path, paint);
                super.dispatchDraw(canvas);
                if (getPaddingBottom() > 0 && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                    paint.setAlpha((int) (frameLayout.getAlpha() * 255.0f));
                    canvas.drawRect(l7.B1(l7Var), getHeight() - getPaddingBottom(), getWidth() - l7.C1(l7Var), getHeight(), paint);
                    paint.setAlpha(255);
                }
                e();
                canvas.restore();
                if (vaVar != null && vaVar.getVisibility() == 0 && vaVar.getAlpha() > 0.0f) {
                    if (vaVar.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(vaVar.getX(), vaVar.getY(), vaVar.getMeasuredWidth() + vaVar.getX(), vaVar.getMeasuredHeight() + vaVar.getY(), (int) (vaVar.getAlpha() * 255.0f), 31);
                    } else {
                        canvas.save();
                        canvas.clipRect(vaVar.getX(), vaVar.getY(), vaVar.getX() + vaVar.getMeasuredWidth(), vaVar.getY() + vaVar.getMeasuredHeight());
                    }
                    canvas.translate(vaVar.getX(), vaVar.getY());
                    vaVar.draw(canvas);
                    canvas.restore();
                }
                l7Var.G(canvas, this);
                return;
            case 1:
            case 2:
            case 4:
            case 6:
            default:
                super.dispatchDraw(canvas);
                return;
            case 3:
                LinearGradient linearGradient = (LinearGradient) this.f1935b;
                Matrix matrix = (Matrix) this.d;
                Paint paint2 = (Paint) this.f1936c;
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (!photoViewer.S4) {
                    if (photoViewer.f33660n0.getVisibility() == 0) {
                        i10 = getMeasuredHeight() - AndroidUtilities.dp(48.0f);
                    } else {
                        i10 = 0;
                    }
                    int i12 = photoViewer.f33566c2;
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
            case 5:
                Paint paint3 = (Paint) this.d;
                Paint paint4 = (Paint) this.f1935b;
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                float dp2 = AndroidUtilities.dp(8.0f);
                Paint paint5 = (Paint) this.f1936c;
                paint5.setColor(0);
                float dpf2 = AndroidUtilities.dpf2(1.0f);
                float dpf22 = AndroidUtilities.dpf2(0.33f);
                pc1 pc1Var = (pc1) this.e;
                paint5.setShadowLayer(dpf2, 0.0f, dpf22, i0.a.o(-16777216, (int) (pc1Var.S1.getAlpha() * 27.0f)));
                canvas.drawRoundRect(rectF2, dp2, dp2, paint5);
                ec1 ec1Var = pc1Var.f40508y0;
                pb1 pb1Var = pc1Var.f40442a;
                org.telegram.ui.ActionBar.k6.s(this, ec1Var, pb1Var);
                Paint d10 = pb1Var.d("paintChatActionBackground");
                int alpha = d10.getAlpha();
                d10.setAlpha((int) (pc1Var.S1.getAlpha() * alpha));
                canvas.drawRoundRect(rectF2, dp2, dp2, d10);
                d10.setAlpha(alpha);
                if (pc1Var.N1) {
                    float f7 = pc1Var.f40484o1;
                    if (f7 > 0.0f) {
                        paint3.setColor(i0.a.o(-16777216, (int) (f7 * 255.0f * pc1Var.f40486p1)));
                        canvas.drawRoundRect(rectF2, dp2, dp2, paint3);
                    }
                }
                paint4.setColor(520093695);
                paint4.setAlpha((int) (pc1Var.S1.getAlpha() * 30.0f));
                canvas.drawRoundRect(rectF2, dp2, dp2, paint4);
                super.dispatchDraw(canvas);
                return;
            case 7:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.d;
                Paint paint6 = (Paint) this.f1936c;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                if (limitPreviewView.P) {
                    if (!limitPreviewView.f24430c0 && !limitPreviewView.R) {
                        paint6.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.e7, g6Var));
                    } else {
                        paint6.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21273i6, g6Var));
                    }
                } else {
                    paint6.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21126a7, g6Var));
                }
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                sg.t tVar = limitPreviewView.f24432e0;
                if (tVar != null) {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ((org.telegram.ui.y5) ((org.telegram.ui.a1) tVar).f35546b).u0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                } else {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint6);
                }
                canvas.save();
                if (!limitPreviewView.P) {
                    canvas.clipRect(limitPreviewView.f24441n, 0, getMeasuredWidth(), getMeasuredHeight());
                }
                if (limitPreviewView.R) {
                    e = limitPreviewView.K;
                } else if (limitPreviewView.f24432e0 != null) {
                    e = (Paint) this.f1935b;
                } else {
                    e = sg.b1.d().e();
                }
                ViewGroup viewGroup = limitPreviewView.f24447y;
                if (viewGroup != null) {
                    sg.a1 a1Var = limitPreviewView.E;
                    if (a1Var != null) {
                        e = a1Var.f46618f;
                        a1Var.a();
                        Matrix matrix2 = a1Var.e;
                        matrix2.reset();
                        matrix2.postScale(1.0f, limitPreviewView.f24429c / 100.0f, 0.0f, 0.0f);
                        matrix2.postTranslate(0.0f, -limitPreviewView.F);
                        a1Var.d.setLocalMatrix(matrix2);
                    } else {
                        float f10 = 0.0f;
                        for (View view = this; view != viewGroup; view = (View) view.getParent()) {
                            f10 += view.getY();
                        }
                        sg.b1 d11 = sg.b1.d();
                        int measuredWidth = viewGroup.getMeasuredWidth();
                        int measuredHeight = viewGroup.getMeasuredHeight();
                        globalXOffset2 = limitPreviewView.getGlobalXOffset();
                        d11.f(globalXOffset2 - getLeft(), -f10, measuredWidth, measuredHeight);
                    }
                } else {
                    sg.b1 d12 = sg.b1.d();
                    int measuredWidth2 = limitPreviewView.getMeasuredWidth();
                    int measuredHeight2 = limitPreviewView.getMeasuredHeight();
                    globalXOffset = limitPreviewView.getGlobalXOffset();
                    d12.f(globalXOffset - getLeft(), -getTop(), measuredWidth2, measuredHeight2);
                }
                int alpha2 = e.getAlpha();
                if (limitPreviewView.V && (valueAnimator2 = limitPreviewView.f24437i0) != null) {
                    e.setAlpha((int) ((1.0f - ((Float) valueAnimator2.getAnimatedValue()).floatValue()) * alpha2));
                } else if (limitPreviewView.U && (valueAnimator = limitPreviewView.f24437i0) != null) {
                    e.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * alpha2));
                }
                if (limitPreviewView.P) {
                    if (!limitPreviewView.L && !limitPreviewView.M) {
                        AndroidUtilities.rectTmp.set(0.0f, 0.0f, limitPreviewView.f24441n, getMeasuredHeight());
                    } else {
                        AndroidUtilities.rectTmp.set(limitPreviewView.f24441n, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    }
                }
                canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), e);
                e.setAlpha(alpha2);
                canvas.restore();
                if (limitPreviewView.E == null && limitPreviewView.f24431d0) {
                    invalidate();
                }
                super.dispatchDraw(canvas);
                return;
            case 8:
                Paint paint7 = (Paint) this.f1936c;
                paint7.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ii, (org.telegram.ui.ActionBar.g6) this.d));
                sg.f0 f0Var = (sg.f0) this.e;
                canvas.drawLine(AndroidUtilities.dp(18.0f), getHeight() / 2.0f, f0Var.d.getLeft() - AndroidUtilities.dp(20.0f), getHeight() / 2.0f, paint7);
                canvas.drawLine(AndroidUtilities.dp(20.0f) + f0Var.d.getRight(), getHeight() / 2.0f, getWidth() - AndroidUtilities.dp(18.0f), getHeight() / 2.0f, paint7);
                RectF rectF4 = AndroidUtilities.rectTmp;
                int top = f0Var.d.getTop();
                rectF4.set(f0Var.d.getLeft() - AndroidUtilities.dp(15.0f), ((f0Var.d.getBottom() + top) - AndroidUtilities.dp(30.0f)) / 2.0f, AndroidUtilities.dp(15.0f) + f0Var.d.getRight(), (AndroidUtilities.dp(30.0f) + (f0Var.d.getBottom() + f0Var.d.getTop())) / 2.0f);
                canvas.save();
                canvas.translate(rectF4.left, rectF4.top);
                rectF4.set(0.0f, 0.0f, rectF4.width(), rectF4.height());
                sg.a1 a1Var2 = (sg.a1) this.f1935b;
                a1Var2.e(rectF4);
                canvas.drawRoundRect(rectF4, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), a1Var2.f46618f);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            case 9:
                Drawable drawable3 = (Drawable) this.f1936c;
                sg.y0 y0Var = (sg.y0) this.e;
                drawable = ((org.telegram.ui.ActionBar.h3) y0Var).shadowDrawable;
                int i13 = y0Var.M;
                i11 = ((org.telegram.ui.ActionBar.h3) y0Var).backgroundPaddingTop;
                drawable.setBounds(0, tl.D(2.0f, i11 + i13, 1), getMeasuredWidth(), getMeasuredHeight());
                drawable2 = ((org.telegram.ui.ActionBar.h3) y0Var).shadowDrawable;
                drawable2.draw(canvas);
                super.dispatchDraw(canvas);
                org.telegram.ui.Components.x7 x7Var = y0Var.N;
                if (x7Var != null && x7Var.getVisibility() == 0 && y0Var.N.getAlpha() != 0.0f) {
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
        switch (this.f1934a) {
            case 0:
                l7 l7Var = (l7) this.e;
                if (motionEvent.getAction() == 0 && motionEvent.getY() < d() && l7.y1(l7Var).isAttachedToWindow()) {
                    l7Var.dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 9:
                sg.y0 y0Var = (sg.y0) this.e;
                if (motionEvent.getAction() == 0) {
                    float y3 = motionEvent.getY();
                    int i11 = y0Var.M;
                    i10 = ((org.telegram.ui.ActionBar.h3) y0Var).backgroundPaddingTop;
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
        switch (this.f1934a) {
            case 1:
                RectF rectF = (RectF) this.f1935b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), ((org.telegram.ui.y5) this.e).u0(getX() + ((ViewGroup) getParent()).getX(), ((ViewGroup) getParent().getParent().getParent()).getY()));
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
        switch (this.f1934a) {
            case 0:
                l7 l7Var = (l7) this.e;
                if (view == l7Var.e) {
                    return false;
                }
                if (view != l7Var.f1718e0) {
                    canvas.save();
                    canvas.clipPath((Path) this.d);
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j10);
            case 6:
                float[] fArr = (float[]) this.f1936c;
                Path path = (Path) this.d;
                Matrix matrix = (Matrix) this.f1935b;
                ei.r5 r5Var = (ei.r5) this.e;
                rg.x0 x0Var = r5Var.f45766r0;
                if (view == r5Var.f45771w0) {
                    org.telegram.ui.Cells.t1 q6 = rg.f1.q(r5Var);
                    if (q6 == null || (photoImage = q6.getPhotoImage()) == null) {
                        return false;
                    }
                    matrix.reset();
                    float max = Math.max(photoImage.getImageWidth() / r5Var.f45773y0, photoImage.getImageHeight() / r5Var.f45774z0);
                    matrix.postScale((r5Var.f45773y0 / r5Var.f45771w0.getWidth()) * max, (r5Var.f45774z0 / r5Var.f45771w0.getHeight()) * max);
                    matrix.postTranslate((photoImage.getCenterX() + (q6.getX() + x0Var.getX())) - ((r5Var.f45773y0 * max) / 2.0f), (photoImage.getCenterY() + (q6.getY() + x0Var.getY())) - ((r5Var.f45774z0 * max) / 2.0f));
                    r5Var.f45771w0.setTransform(matrix);
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
            case 9:
                Path path2 = (Path) this.d;
                if (view == ((ScrollView) this.f1935b)) {
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
            case 10:
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.d;
                zf.y yVar = (zf.y) this.f1936c;
                zf.y yVar2 = (zf.y) this.f1935b;
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                uh.f fVar = (uh.f) this.e;
                int i12 = (int) fVar.X.e;
                if (view == fVar.f48286h0 && i12 > 0) {
                    yVar2.setBounds(0, AndroidUtilities.dp(40.0f), getWidth(), AndroidUtilities.dp(48.0f));
                    int i13 = org.telegram.ui.ActionBar.k6.f21255h5;
                    yVar2.b(org.telegram.ui.ActionBar.k6.w0(i13, g6Var));
                    yVar2.draw(canvas);
                    int dp = AndroidUtilities.dp(48.0f) + i12;
                    yVar.setBounds(0, dp - AndroidUtilities.dp(8.0f), getWidth(), dp);
                    yVar.b(org.telegram.ui.ActionBar.k6.w0(i13, g6Var));
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
        l5 l5Var = l7Var.f1718e0;
        l5Var.setTranslationY(d - l5Var.getHeight());
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(d - l5Var.getHeight(), 0.0f, AndroidUtilities.dp(32.0f)));
        l5Var.setAlpha(l7Var.f1713b1.a(0) * clamp01);
        l5Var.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        l5Var.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        f7 f7Var = l7Var.f1720f0;
        f7Var.setTranslationY(d);
        l7Var.f1722g0.setTranslationY(f7Var.getRealHeight() + d);
        l7Var.f1744s0.setTranslationY(f7Var.getRealHeight() + d);
        l7Var.B0.setTranslationY(f7Var.getRealHeight() + d);
        l7Var.D0.setTranslationY(f7Var.getRealHeight() + d);
        FrameLayout frameLayout = l7Var.topBulletinContainer;
        if (frameLayout != null) {
            frameLayout.setTranslationY((getTranslationY() - a()) - AndroidUtilities.navigationBarHeight);
        }
        AndroidUtilities.updateViewVisibilityAnimated(l7Var.f1736o0, l7Var.d.canScrollVertically(1));
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f1934a) {
            case 9:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f1934a) {
            case 2:
                RectF rectF = (RectF) this.f1935b;
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
                Paint paint = (Paint) this.f1936c;
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
        switch (this.f1934a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                l7 l7Var = (l7) this.e;
                m5 m5Var = l7Var.T0;
                if (m5Var != null) {
                    int finalHeight = l7Var.f1720f0.getFinalHeight();
                    int T1 = l7Var.T1();
                    if (l7Var.f1713b1.d(1) && l7Var.f1734n0.getVisibility() == 0) {
                        i14 = l7Var.f1734n0.getMeasuredHeight();
                    } else {
                        i14 = 0;
                    }
                    m5Var.F(finalHeight, T1 + i14);
                }
                l7Var.n2();
                return;
            case 3:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (photoViewer.H0.getVisibility() != 8) {
                    if (photoViewer.S0.getVisibility() == 0) {
                        i15 = AndroidUtilities.dp(63.0f);
                    } else {
                        i15 = 0;
                    }
                    int measuredWidth = (((i12 - i10) - i15) - photoViewer.H0.getMeasuredWidth()) / 2;
                    ua1 ua1Var = photoViewer.H0;
                    ua1Var.layout(measuredWidth, ua1Var.getTop(), photoViewer.H0.getMeasuredWidth() + measuredWidth, photoViewer.H0.getMeasuredHeight() + photoViewer.H0.getTop());
                    return;
                }
                return;
            case 6:
                ei.r5 r5Var = (ei.r5) this.e;
                rg.x0 x0Var = r5Var.f45766r0;
                int measuredWidth2 = x0Var.getMeasuredWidth();
                int i16 = 0;
                for (int i17 = 0; i17 < x0Var.getChildCount(); i17++) {
                    View childAt = x0Var.getChildAt(i17);
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
                x0Var.layout(-measuredWidth2, 0, x0Var.getMeasuredWidth() - measuredWidth2, x0Var.getMeasuredHeight());
                TextureView textureView = r5Var.f45771w0;
                if (textureView != null) {
                    textureView.layout(0, 0, getMeasuredWidth(), x0Var.getMeasuredHeight());
                    return;
                }
                return;
            case 7:
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
        boolean z10;
        int i15;
        switch (this.f1934a) {
            case 0:
                l7 l7Var = (l7) this.e;
                int bottomInset = l7Var.getBottomInset();
                int i16 = 0;
                setPadding(0, 0, 0, bottomInset);
                l7Var.f1720f0.M.setPadding(0, 0, 0, bottomInset);
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
                    int finalHeight = l7Var.f1720f0.getFinalHeight();
                    int T1 = l7Var.T1();
                    if (l7Var.f1713b1.d(1) && l7Var.f1734n0.getVisibility() == 0) {
                        i16 = l7Var.f1734n0.getMeasuredHeight();
                    }
                    m5Var.F(finalHeight, T1 + i16);
                    return;
                }
                return;
            case 1:
            case 2:
            case 5:
            case 8:
            default:
                super.onMeasure(i10, i11);
                return;
            case 3:
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
            case 4:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
                return;
            case 6:
                ei.r5 r5Var = (ei.r5) this.e;
                rg.x0 x0Var = r5Var.f45766r0;
                x0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                TextureView textureView = r5Var.f45771w0;
                if (textureView != null) {
                    textureView.measure(View.MeasureSpec.makeMeasureSpec(x0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(x0Var.getMeasuredHeight(), 1073741824));
                }
                int measuredWidth2 = x0Var.getMeasuredWidth();
                int i18 = 0;
                for (int i19 = 0; i19 < x0Var.getChildCount(); i19++) {
                    View childAt2 = x0Var.getChildAt(i19);
                    int left2 = childAt2.getLeft();
                    int right = childAt2.getRight();
                    if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt2;
                        left2 = childAt2.getLeft() + t1Var.getBoundsLeft();
                        left = childAt2.getLeft();
                        boundsRight = t1Var.getBoundsRight();
                    } else if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt2;
                        left2 = childAt2.getLeft() + v0Var.getBoundsLeft();
                        left = childAt2.getLeft();
                        boundsRight = v0Var.getBoundsRight();
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
            case 7:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                org.telegram.ui.Components.o6 o6Var = limitPreviewView.v;
                TextView textView = limitPreviewView.f24445w;
                gh0 gh0Var = limitPreviewView.f24435g0;
                gh0 gh0Var2 = limitPreviewView.f24434f0;
                if (getChildCount() == 2) {
                    int size3 = View.MeasureSpec.getSize(i10);
                    int size4 = View.MeasureSpec.getSize(i11);
                    gh0Var2.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                    int measuredWidth3 = gh0Var2.getMeasuredWidth();
                    int measuredWidth4 = limitPreviewView.N.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                    int i20 = 0;
                    boolean z11 = false;
                    if (textView.getVisibility() == 0) {
                        i14 = textView.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                    } else {
                        i14 = 0;
                    }
                    int max = Math.max(measuredWidth3, measuredWidth4 + i14);
                    gh0Var.measure(View.MeasureSpec.makeMeasureSpec(size3, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                    if (limitPreviewView.P) {
                        float f7 = limitPreviewView.f24425a;
                        float f10 = 0.0f;
                        if (f7 == 0.0f) {
                            limitPreviewView.f24441n = 0;
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                if (!limitPreviewView.L && limitPreviewView.f24432e0 == null) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                limitPreviewView.setPremiumCountColor(z10);
                                if (limitPreviewView.f24432e0 != null) {
                                    limitPreviewView.setDefaultTextColor(true);
                                } else {
                                    limitPreviewView.setDefaultTextColor(false);
                                }
                            }
                        } else if (f7 < 1.0f) {
                            if (limitPreviewView.L) {
                                measuredWidth = 0.0f;
                            } else {
                                measuredWidth = gh0Var2.getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                            }
                            if (!limitPreviewView.L) {
                                f10 = gh0Var.getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                            }
                            limitPreviewView.f24441n = (int) ((((size3 - measuredWidth) - f10) * limitPreviewView.f24425a) + measuredWidth);
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                limitPreviewView.setPremiumCountColor((limitPreviewView.L || limitPreviewView.f24432e0 != null) ? true : true);
                                limitPreviewView.setDefaultTextColor(true);
                            }
                        } else {
                            limitPreviewView.f24441n = size3;
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                limitPreviewView.setPremiumCountColor(true);
                                limitPreviewView.setDefaultTextColor(true);
                            }
                        }
                    } else {
                        int measuredWidth5 = gh0Var.getMeasuredWidth();
                        int measuredWidth6 = limitPreviewView.O.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                        if (o6Var.getVisibility() == 0) {
                            i20 = o6Var.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                        }
                        int clamp = (int) Utilities.clamp(size3 * limitPreviewView.f24425a, size3 - Math.max(measuredWidth5, measuredWidth6 + i20), max);
                        limitPreviewView.f24441n = clamp;
                        gh0Var2.measure(View.MeasureSpec.makeMeasureSpec(clamp, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                        gh0Var.measure(View.MeasureSpec.makeMeasureSpec(size3 - limitPreviewView.f24441n, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                    }
                    setMeasuredDimension(size3, size4);
                    return;
                }
                super.onMeasure(i10, i11);
                return;
            case 9:
                sg.y0 y0Var = (sg.y0) this.e;
                y0Var.L = 0;
                ScrollView scrollView = (ScrollView) this.f1935b;
                scrollView.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), Integer.MIN_VALUE));
                int size5 = View.MeasureSpec.getSize(i11) - scrollView.getMeasuredHeight();
                i15 = ((org.telegram.ui.ActionBar.h3) y0Var).backgroundPaddingTop;
                y0Var.L = i15 + size5;
                super.onMeasure(i10, i11);
                y0Var.B();
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f1934a) {
            case 3:
                super.setAlpha(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.R7.setAlpha(f7);
                }
                js0 js0Var = photoViewer.U1;
                if (js0Var != null && js0Var.getVisibility() != 8) {
                    photoViewer.U1.setAlpha(photoViewer.f33768y7[0] * f7);
                }
                ks0 ks0Var = photoViewer.V1;
                if (ks0Var != null && ks0Var.getVisibility() != 8) {
                    photoViewer.V1.setAlpha(f7 * photoViewer.f33777z7[0]);
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
        switch (this.f1934a) {
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
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout2 = photoViewer.R7;
                if (frameLayout2 != null && frameLayout2.getVisibility() != 8) {
                    photoViewer.R7.setTranslationY(photoViewer.P0.getTranslationY() - (photoViewer.U1.getAlpha() * i2.o1.g(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                }
                org.telegram.ui.l0 l0Var = photoViewer.X1;
                if (l0Var != null) {
                    l0Var.setTranslationY(f7);
                }
                TextView textView = photoViewer.T7;
                if (textView != null && textView.getVisibility() != 8) {
                    photoViewer.T7.setTranslationY(f7);
                    return;
                }
                return;
            case 9:
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
        switch (this.f1934a) {
            case 3:
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
        this.f1935b = new Matrix();
        this.f1936c = new float[8];
        this.d = new Path();
    }

    public o5(LimitPreviewView limitPreviewView, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.e = limitPreviewView;
        this.d = g6Var;
        this.f1936c = new Paint();
        Paint paint = new Paint();
        this.f1935b = paint;
        paint.setColor(-1);
    }

    public o5(Context context, org.telegram.ui.ActionBar.g6 g6Var, uh.f fVar) {
        super(context);
        this.e = fVar;
        this.d = g6Var;
        this.f1935b = new zf.y(2);
        this.f1936c = new zf.y(8);
    }

    public o5(sg.y0 y0Var, Context context, ScrollView scrollView, Drawable drawable) {
        super(context);
        this.e = y0Var;
        this.f1935b = scrollView;
        this.f1936c = drawable;
        this.d = new Path();
    }

    public o5(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.f1936c = textView;
        tl.k(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21290j5, g6Var);
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.f1935b = imageView;
        org.telegram.ui.ActionBar.h2 h2Var = new org.telegram.ui.ActionBar.h2(false);
        this.d = h2Var;
        imageView.setImageDrawable(h2Var);
        h2Var.a(-1);
        addView(imageView, w7.z5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 16.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new w50(this, 28));
        b(true);
        setMinimumHeight(AndroidUtilities.dp(56.0f));
    }

    public o5(org.telegram.ui.y5 y5Var, Context context) {
        super(context);
        this.e = y5Var;
        this.f1935b = new RectF();
        setWillNotDraw(false);
        View imageView = new ImageView(context);
        this.f1936c = imageView;
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
        setBackground(org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, 0, o10, o10));
    }

    public o5(pc1 pc1Var, Activity activity) {
        super(activity);
        this.e = pc1Var;
        this.f1936c = new Paint(1);
        this.f1935b = new Paint(1);
        this.d = new Paint(1);
    }

    public o5(l7 l7Var, Context context) {
        super(context);
        this.e = l7Var;
        this.f1935b = new RectF();
        this.f1936c = new Paint(1);
        this.d = new Path();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public o5(sg.f0 f0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.e = f0Var;
        this.d = g6Var;
        this.f1935b = new sg.a1(org.telegram.ui.ActionBar.k6.Lj, org.telegram.ui.ActionBar.k6.Mj, -1, -1, g6Var);
        Paint paint = new Paint(1);
        this.f1936c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
    }

    public o5(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.e = photoViewer;
        this.f1936c = new Paint(3);
        this.f1935b = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, 2130706432}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.d = new Matrix();
    }
}
