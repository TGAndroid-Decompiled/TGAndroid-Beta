package bi;

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
import org.telegram.messenger.vh;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ic1;
import org.telegram.ui.os0;
import org.telegram.ui.ps0;
import org.telegram.ui.sb1;
import org.telegram.ui.t21;
import org.telegram.ui.tc1;
import org.telegram.ui.xa1;
public final class j5 extends FrameLayout {
    public final int f4870a = 2;
    public Object f4871b;
    public Object f4872c;
    public Object d;
    public Object e;

    public j5(Context context) {
        super(context);
    }

    public float a() {
        h7 h7Var = (h7) this.e;
        return (h7Var.f4730b1.a(3) * h7Var.D0.getMeasuredHeight()) + (h7Var.f4730b1.a(2) * h7Var.B0.getMeasuredHeight()) + (h7Var.f4730b1.a(1) * h7Var.f4761s0.getMeasuredHeight()) + (h7Var.f4730b1.a(0) * h7Var.f4739g0.getMeasuredHeight()) + h7Var.f4737f0.getRealHeight() + 0.0f;
    }

    public void b(boolean z10) {
        int i10;
        float f7;
        float f10;
        ImageView imageView = (ImageView) this.f4871b;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        TextView textView = (TextView) this.f4872c;
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
        textView.setLayoutParams(gb1.h(-1, -2.0f, 55, f7, 14.0f, f10, 12.0f));
    }

    public void c(int i10, String str) {
        ((TextView) this.d).setText(str);
        ((ImageView) this.f4872c).setImageDrawable(getContext().getDrawable(i10));
    }

    public float d() {
        c6 c6Var;
        float max = Math.max(0.0f, getHeight() - a());
        h7 h7Var = (h7) this.e;
        mm0 mm0Var = h7Var.d;
        int childCount = mm0Var.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                break;
            }
            View childAt = mm0Var.getChildAt(childCount);
            mm0Var.getClass();
            int R = RecyclerView.R(childAt);
            if (R >= 0) {
                if (R == 2) {
                    max = childAt.getHeight() + childAt.getTranslationY() + childAt.getTop();
                    break;
                } else if (R == 1) {
                    max = childAt.getY();
                    break;
                } else if (R == 0) {
                    max = childAt.getY() - h7Var.f4737f0.getRealHeight();
                    break;
                }
            }
            childCount--;
        }
        float a2 = (h7Var.f4730b1.a(4) * h7Var.getBottomInset()) + max;
        Float f7 = h7Var.f4728a1;
        if (f7 != null && (c6Var = h7Var.f4730b1) != null && c6Var.f4430a < 1.0f) {
            return AndroidUtilities.lerp(f7.floatValue(), a2, h7Var.f4730b1.f4430a);
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
        switch (this.f4870a) {
            case 0:
                h7 h7Var = (h7) this.e;
                org.telegram.ui.Components.xa xaVar = h7Var.e;
                FrameLayout frameLayout = h7Var.f4749l0;
                h7Var.I(canvas, this);
                canvas.save();
                float d = d();
                float dp = AndroidUtilities.dp(12.0f);
                RectF rectF = (RectF) this.f4871b;
                rectF.set(h7.z1(h7Var), d, getWidth() - h7.A1(h7Var), getHeight() + dp);
                Paint paint = (Paint) this.f4872c;
                paint.setColor(h7Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23425h5));
                Path path = (Path) this.d;
                path.rewind();
                path.addRoundRect(rectF, dp, dp, Path.Direction.CW);
                canvas.drawPath(path, paint);
                super.dispatchDraw(canvas);
                if (getPaddingBottom() > 0 && frameLayout.getVisibility() == 0 && frameLayout.getAlpha() > 0.0f) {
                    paint.setAlpha((int) (frameLayout.getAlpha() * 255.0f));
                    canvas.drawRect(h7.B1(h7Var), getHeight() - getPaddingBottom(), getWidth() - h7.C1(h7Var), getHeight(), paint);
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
                h7Var.H(canvas, this);
                return;
            case 1:
            case 2:
            case 4:
            case 6:
            default:
                super.dispatchDraw(canvas);
                return;
            case 3:
                LinearGradient linearGradient = (LinearGradient) this.f4871b;
                Matrix matrix = (Matrix) this.d;
                Paint paint2 = (Paint) this.f4872c;
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                if (!photoViewer.S4) {
                    if (photoViewer.f35721n0.getVisibility() == 0) {
                        i10 = getMeasuredHeight() - AndroidUtilities.dp(48.0f);
                    } else {
                        i10 = 0;
                    }
                    int i12 = photoViewer.f35627c2;
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
                Paint paint4 = (Paint) this.f4871b;
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                float dp2 = AndroidUtilities.dp(8.0f);
                Paint paint5 = (Paint) this.f4872c;
                paint5.setColor(0);
                float dpf2 = AndroidUtilities.dpf2(1.0f);
                float dpf22 = AndroidUtilities.dpf2(0.33f);
                tc1 tc1Var = (tc1) this.e;
                paint5.setShadowLayer(dpf2, 0.0f, dpf22, i0.a.o(-16777216, (int) (tc1Var.S1.getAlpha() * 27.0f)));
                canvas.drawRoundRect(rectF2, dp2, dp2, paint5);
                ic1 ic1Var = tc1Var.f43799y0;
                sb1 sb1Var = tc1Var.f43733a;
                org.telegram.ui.ActionBar.y6.s(this, ic1Var, sb1Var);
                Paint d10 = sb1Var.d("paintChatActionBackground");
                int alpha = d10.getAlpha();
                d10.setAlpha((int) (tc1Var.S1.getAlpha() * alpha));
                canvas.drawRoundRect(rectF2, dp2, dp2, d10);
                d10.setAlpha(alpha);
                if (tc1Var.N1) {
                    float f7 = tc1Var.f43775o1;
                    if (f7 > 0.0f) {
                        paint3.setColor(i0.a.o(-16777216, (int) (f7 * 255.0f * tc1Var.f43777p1)));
                        canvas.drawRoundRect(rectF2, dp2, dp2, paint3);
                    }
                }
                paint4.setColor(520093695);
                paint4.setAlpha((int) (tc1Var.S1.getAlpha() * 30.0f));
                canvas.drawRoundRect(rectF2, dp2, dp2, paint4);
                super.dispatchDraw(canvas);
                return;
            case 7:
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.d;
                Paint paint6 = (Paint) this.f4872c;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                if (limitPreviewView.P) {
                    if (!limitPreviewView.f26220c0 && !limitPreviewView.R) {
                        paint6.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23374e7, u6Var));
                    } else {
                        paint6.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23446i6, u6Var));
                    }
                } else {
                    paint6.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23297a7, u6Var));
                }
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                tg.t tVar = limitPreviewView.f26222e0;
                if (tVar != null) {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ((org.telegram.ui.x5) ((org.telegram.ui.y0) tVar).f45912b).r0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                } else {
                    canvas.drawRoundRect(rectF3, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint6);
                }
                canvas.save();
                if (!limitPreviewView.P) {
                    canvas.clipRect(limitPreviewView.f26231n, 0, getMeasuredWidth(), getMeasuredHeight());
                }
                if (limitPreviewView.R) {
                    e = limitPreviewView.K;
                } else if (limitPreviewView.f26222e0 != null) {
                    e = (Paint) this.f4871b;
                } else {
                    e = tg.b1.d().e();
                }
                ViewGroup viewGroup = limitPreviewView.f26237y;
                if (viewGroup != null) {
                    tg.a1 a1Var = limitPreviewView.E;
                    if (a1Var != null) {
                        e = a1Var.f48794f;
                        a1Var.a();
                        Matrix matrix2 = a1Var.e;
                        matrix2.reset();
                        matrix2.postScale(1.0f, limitPreviewView.f26219c / 100.0f, 0.0f, 0.0f);
                        matrix2.postTranslate(0.0f, -limitPreviewView.F);
                        a1Var.d.setLocalMatrix(matrix2);
                    } else {
                        float f10 = 0.0f;
                        for (View view = this; view != viewGroup; view = (View) view.getParent()) {
                            f10 += view.getY();
                        }
                        tg.b1 d11 = tg.b1.d();
                        int measuredWidth = viewGroup.getMeasuredWidth();
                        int measuredHeight = viewGroup.getMeasuredHeight();
                        globalXOffset2 = limitPreviewView.getGlobalXOffset();
                        d11.f(globalXOffset2 - getLeft(), -f10, measuredWidth, measuredHeight);
                    }
                } else {
                    tg.b1 d12 = tg.b1.d();
                    int measuredWidth2 = limitPreviewView.getMeasuredWidth();
                    int measuredHeight2 = limitPreviewView.getMeasuredHeight();
                    globalXOffset = limitPreviewView.getGlobalXOffset();
                    d12.f(globalXOffset - getLeft(), -getTop(), measuredWidth2, measuredHeight2);
                }
                int alpha2 = e.getAlpha();
                if (limitPreviewView.V && (valueAnimator2 = limitPreviewView.f26227i0) != null) {
                    e.setAlpha((int) ((1.0f - ((Float) valueAnimator2.getAnimatedValue()).floatValue()) * alpha2));
                } else if (limitPreviewView.U && (valueAnimator = limitPreviewView.f26227i0) != null) {
                    e.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * alpha2));
                }
                if (limitPreviewView.P) {
                    if (!limitPreviewView.L && !limitPreviewView.M) {
                        AndroidUtilities.rectTmp.set(0.0f, 0.0f, limitPreviewView.f26231n, getMeasuredHeight());
                    } else {
                        AndroidUtilities.rectTmp.set(limitPreviewView.f26231n, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    }
                }
                canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), e);
                e.setAlpha(alpha2);
                canvas.restore();
                if (limitPreviewView.E == null && limitPreviewView.f26221d0) {
                    invalidate();
                }
                super.dispatchDraw(canvas);
                return;
            case 8:
                Paint paint7 = (Paint) this.f4872c;
                paint7.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Ii, (org.telegram.ui.ActionBar.u6) this.d));
                tg.f0 f0Var = (tg.f0) this.e;
                canvas.drawLine(AndroidUtilities.dp(18.0f), getHeight() / 2.0f, f0Var.d.getLeft() - AndroidUtilities.dp(20.0f), getHeight() / 2.0f, paint7);
                canvas.drawLine(AndroidUtilities.dp(20.0f) + f0Var.d.getRight(), getHeight() / 2.0f, getWidth() - AndroidUtilities.dp(18.0f), getHeight() / 2.0f, paint7);
                RectF rectF4 = AndroidUtilities.rectTmp;
                int top = f0Var.d.getTop();
                rectF4.set(f0Var.d.getLeft() - AndroidUtilities.dp(15.0f), ((f0Var.d.getBottom() + top) - AndroidUtilities.dp(30.0f)) / 2.0f, AndroidUtilities.dp(15.0f) + f0Var.d.getRight(), (AndroidUtilities.dp(30.0f) + (f0Var.d.getBottom() + f0Var.d.getTop())) / 2.0f);
                canvas.save();
                canvas.translate(rectF4.left, rectF4.top);
                rectF4.set(0.0f, 0.0f, rectF4.width(), rectF4.height());
                tg.a1 a1Var2 = (tg.a1) this.f4871b;
                a1Var2.e(rectF4);
                canvas.drawRoundRect(rectF4, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), a1Var2.f48794f);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            case 9:
                Drawable drawable3 = (Drawable) this.f4872c;
                tg.y0 y0Var = (tg.y0) this.e;
                drawable = ((org.telegram.ui.ActionBar.k3) y0Var).shadowDrawable;
                int i13 = y0Var.M;
                i11 = ((org.telegram.ui.ActionBar.k3) y0Var).backgroundPaddingTop;
                drawable.setBounds(0, org.telegram.ui.d3.w(2.0f, i11 + i13, 1), getMeasuredWidth(), getMeasuredHeight());
                drawable2 = ((org.telegram.ui.ActionBar.k3) y0Var).shadowDrawable;
                drawable2.draw(canvas);
                super.dispatchDraw(canvas);
                org.telegram.ui.Components.b8 b8Var = y0Var.N;
                if (b8Var != null && b8Var.getVisibility() == 0 && y0Var.N.getAlpha() != 0.0f) {
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
        switch (this.f4870a) {
            case 0:
                h7 h7Var = (h7) this.e;
                if (motionEvent.getAction() == 0 && motionEvent.getY() < d() && h7.y1(h7Var).isAttachedToWindow()) {
                    h7Var.dismiss();
                    return true;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 9:
                tg.y0 y0Var = (tg.y0) this.e;
                if (motionEvent.getAction() == 0) {
                    float y3 = motionEvent.getY();
                    int i11 = y0Var.M;
                    i10 = ((org.telegram.ui.ActionBar.k3) y0Var).backgroundPaddingTop;
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
        switch (this.f4870a) {
            case 1:
                RectF rectF = (RectF) this.f4871b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), ((org.telegram.ui.x5) this.e).r0(getX() + ((ViewGroup) getParent()).getX(), ((ViewGroup) getParent().getParent().getParent()).getY()));
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
        switch (this.f4870a) {
            case 0:
                h7 h7Var = (h7) this.e;
                if (view == h7Var.e) {
                    return false;
                }
                if (view != h7Var.f4735e0) {
                    canvas.save();
                    canvas.clipPath((Path) this.d);
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j10);
            case 6:
                float[] fArr = (float[]) this.f4872c;
                Path path = (Path) this.d;
                Matrix matrix = (Matrix) this.f4871b;
                fi.q5 q5Var = (fi.q5) this.e;
                sg.y0 y0Var = q5Var.f48210r0;
                if (view == q5Var.f48215w0) {
                    org.telegram.ui.Cells.s1 q5 = sg.g1.q(q5Var);
                    if (q5 == null || (photoImage = q5.getPhotoImage()) == null) {
                        return false;
                    }
                    matrix.reset();
                    float max = Math.max(photoImage.getImageWidth() / q5Var.f48217y0, photoImage.getImageHeight() / q5Var.f48218z0);
                    matrix.postScale((q5Var.f48217y0 / q5Var.f48215w0.getWidth()) * max, (q5Var.f48218z0 / q5Var.f48215w0.getHeight()) * max);
                    matrix.postTranslate((photoImage.getCenterX() + (q5.getX() + y0Var.getX())) - ((q5Var.f48217y0 * max) / 2.0f), (photoImage.getCenterY() + (q5.getY() + y0Var.getY())) - ((q5Var.f48218z0 * max) / 2.0f));
                    q5Var.f48215w0.setTransform(matrix);
                    canvas.save();
                    path.rewind();
                    AndroidUtilities.rectTmp.set(photoImage.getImageX() + q5.getX() + y0Var.getX(), photoImage.getImageY() + q5.getY() + y0Var.getY(), photoImage.getImageX2() + q5.getX() + y0Var.getX(), photoImage.getImageY2() + q5.getY() + y0Var.getY());
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
                if (view == ((ScrollView) this.f4871b)) {
                    canvas.save();
                    path2.rewind();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(getPaddingLeft(), AndroidUtilities.dp(18.0f) + ((tg.y0) this.e).M, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
                    path2.addRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Path.Direction.CW);
                    canvas.clipPath(path2);
                    super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return true;
                }
                return super.drawChild(canvas, view, j10);
            case 10:
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) this.d;
                ag.h0 h0Var = (ag.h0) this.f4872c;
                ag.h0 h0Var2 = (ag.h0) this.f4871b;
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                vh.f fVar = (vh.f) this.e;
                int i12 = (int) fVar.X.f19334f;
                if (view == fVar.f50317h0 && i12 > 0) {
                    h0Var2.setBounds(0, AndroidUtilities.dp(40.0f), getWidth(), AndroidUtilities.dp(48.0f));
                    int i13 = org.telegram.ui.ActionBar.y6.f23425h5;
                    h0Var2.b(org.telegram.ui.ActionBar.y6.w0(i13, u6Var));
                    h0Var2.draw(canvas);
                    int dp = AndroidUtilities.dp(48.0f) + i12;
                    h0Var.setBounds(0, dp - AndroidUtilities.dp(8.0f), getWidth(), dp);
                    h0Var.b(org.telegram.ui.ActionBar.y6.w0(i13, u6Var));
                    h0Var.draw(canvas);
                }
                return drawChild3;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    public void e() {
        float d = d();
        h7 h7Var = (h7) this.e;
        g5 g5Var = h7Var.f4735e0;
        g5Var.setTranslationY(d - g5Var.getHeight());
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(d - g5Var.getHeight(), 0.0f, AndroidUtilities.dp(32.0f)));
        g5Var.setAlpha(h7Var.f4730b1.a(0) * clamp01);
        g5Var.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        g5Var.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, clamp01));
        b7 b7Var = h7Var.f4737f0;
        b7Var.setTranslationY(d);
        h7Var.f4739g0.setTranslationY(b7Var.getRealHeight() + d);
        h7Var.f4761s0.setTranslationY(b7Var.getRealHeight() + d);
        h7Var.B0.setTranslationY(b7Var.getRealHeight() + d);
        h7Var.D0.setTranslationY(b7Var.getRealHeight() + d);
        FrameLayout frameLayout = h7Var.topBulletinContainer;
        if (frameLayout != null) {
            frameLayout.setTranslationY((getTranslationY() - a()) - AndroidUtilities.navigationBarHeight);
        }
        AndroidUtilities.updateViewVisibilityAnimated(h7Var.f4753o0, h7Var.d.canScrollVertically(1));
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f4870a) {
            case 9:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f4870a) {
            case 2:
                RectF rectF = (RectF) this.f4871b;
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
                Paint paint = (Paint) this.f4872c;
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
        switch (this.f4870a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                h7 h7Var = (h7) this.e;
                h5 h5Var = h7Var.T0;
                if (h5Var != null) {
                    int finalHeight = h7Var.f4737f0.getFinalHeight();
                    int T1 = h7Var.T1();
                    if (h7Var.f4730b1.d(1) && h7Var.f4751n0.getVisibility() == 0) {
                        i14 = h7Var.f4751n0.getMeasuredHeight();
                    } else {
                        i14 = 0;
                    }
                    h5Var.F(finalHeight, T1 + i14);
                }
                h7Var.n2();
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
                    xa1 xa1Var = photoViewer.H0;
                    xa1Var.layout(measuredWidth, xa1Var.getTop(), photoViewer.H0.getMeasuredWidth() + measuredWidth, photoViewer.H0.getMeasuredHeight() + photoViewer.H0.getTop());
                    return;
                }
                return;
            case 6:
                fi.q5 q5Var = (fi.q5) this.e;
                sg.y0 y0Var = q5Var.f48210r0;
                int measuredWidth2 = y0Var.getMeasuredWidth();
                int i16 = 0;
                for (int i17 = 0; i17 < y0Var.getChildCount(); i17++) {
                    View childAt = y0Var.getChildAt(i17);
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
                y0Var.layout(-measuredWidth2, 0, y0Var.getMeasuredWidth() - measuredWidth2, y0Var.getMeasuredHeight());
                TextureView textureView = q5Var.f48215w0;
                if (textureView != null) {
                    textureView.layout(0, 0, getMeasuredWidth(), y0Var.getMeasuredHeight());
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
        switch (this.f4870a) {
            case 0:
                h7 h7Var = (h7) this.e;
                int bottomInset = h7Var.getBottomInset();
                int i16 = 0;
                setPadding(0, 0, 0, bottomInset);
                h7Var.f4737f0.M.setPadding(0, 0, 0, bottomInset);
                int size = View.MeasureSpec.getSize(i11);
                h7Var.h = size;
                int size2 = View.MeasureSpec.getSize(i10);
                for (int i17 = 0; i17 < getChildCount(); i17++) {
                    View childAt = getChildAt(i17);
                    if (childAt instanceof fi.v3) {
                        childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
                    } else if (childAt == h7Var.d) {
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
                h5 h5Var = h7Var.T0;
                if (h5Var != null) {
                    int finalHeight = h7Var.f4737f0.getFinalHeight();
                    int T1 = h7Var.T1();
                    if (h7Var.f4730b1.d(1) && h7Var.f4751n0.getVisibility() == 0) {
                        i16 = h7Var.f4751n0.getMeasuredHeight();
                    }
                    h5Var.F(finalHeight, T1 + i16);
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
                fi.q5 q5Var = (fi.q5) this.e;
                sg.y0 y0Var = q5Var.f48210r0;
                y0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                TextureView textureView = q5Var.f48215w0;
                if (textureView != null) {
                    textureView.measure(View.MeasureSpec.makeMeasureSpec(y0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(y0Var.getMeasuredHeight(), 1073741824));
                }
                int measuredWidth2 = y0Var.getMeasuredWidth();
                int i18 = 0;
                for (int i19 = 0; i19 < y0Var.getChildCount(); i19++) {
                    View childAt2 = y0Var.getChildAt(i19);
                    int left2 = childAt2.getLeft();
                    int right = childAt2.getRight();
                    if (childAt2 instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt2;
                        left2 = childAt2.getLeft() + s1Var.getBoundsLeft();
                        left = childAt2.getLeft();
                        boundsRight = s1Var.getBoundsRight();
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
                setMeasuredDimension(i18 - measuredWidth2, y0Var.getMeasuredHeight());
                return;
            case 7:
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.e;
                org.telegram.ui.Components.s6 s6Var = limitPreviewView.v;
                TextView textView = limitPreviewView.f26235w;
                gh0 gh0Var = limitPreviewView.f26225g0;
                gh0 gh0Var2 = limitPreviewView.f26224f0;
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
                        float f7 = limitPreviewView.f26215a;
                        float f10 = 0.0f;
                        if (f7 == 0.0f) {
                            limitPreviewView.f26231n = 0;
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                if (!limitPreviewView.L && limitPreviewView.f26222e0 == null) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                limitPreviewView.setPremiumCountColor(z10);
                                if (limitPreviewView.f26222e0 != null) {
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
                            limitPreviewView.f26231n = (int) ((((size3 - measuredWidth) - f10) * limitPreviewView.f26215a) + measuredWidth);
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                limitPreviewView.setPremiumCountColor((limitPreviewView.L || limitPreviewView.f26222e0 != null) ? true : true);
                                limitPreviewView.setDefaultTextColor(true);
                            }
                        } else {
                            limitPreviewView.f26231n = size3;
                            if (!limitPreviewView.U && !limitPreviewView.V) {
                                limitPreviewView.setPremiumCountColor(true);
                                limitPreviewView.setDefaultTextColor(true);
                            }
                        }
                    } else {
                        int measuredWidth5 = gh0Var.getMeasuredWidth();
                        int measuredWidth6 = limitPreviewView.O.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                        if (s6Var.getVisibility() == 0) {
                            i20 = s6Var.getMeasuredWidth() + AndroidUtilities.dp(24.0f);
                        }
                        int clamp = (int) Utilities.clamp(size3 * limitPreviewView.f26215a, size3 - Math.max(measuredWidth5, measuredWidth6 + i20), max);
                        limitPreviewView.f26231n = clamp;
                        gh0Var2.measure(View.MeasureSpec.makeMeasureSpec(clamp, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                        gh0Var.measure(View.MeasureSpec.makeMeasureSpec(size3 - limitPreviewView.f26231n, 1073741824), View.MeasureSpec.makeMeasureSpec(size4, 1073741824));
                    }
                    setMeasuredDimension(size3, size4);
                    return;
                }
                super.onMeasure(i10, i11);
                return;
            case 9:
                tg.y0 y0Var2 = (tg.y0) this.e;
                y0Var2.L = 0;
                ScrollView scrollView = (ScrollView) this.f4871b;
                scrollView.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), Integer.MIN_VALUE));
                int size5 = View.MeasureSpec.getSize(i11) - scrollView.getMeasuredHeight();
                i15 = ((org.telegram.ui.ActionBar.k3) y0Var2).backgroundPaddingTop;
                y0Var2.L = i15 + size5;
                super.onMeasure(i10, i11);
                y0Var2.B();
                return;
        }
    }

    @Override
    public void setAlpha(float f7) {
        switch (this.f4870a) {
            case 3:
                super.setAlpha(f7);
                PhotoViewer photoViewer = (PhotoViewer) this.e;
                FrameLayout frameLayout = photoViewer.R7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.R7.setAlpha(f7);
                }
                os0 os0Var = photoViewer.U1;
                if (os0Var != null && os0Var.getVisibility() != 8) {
                    photoViewer.U1.setAlpha(photoViewer.f35829y7[0] * f7);
                }
                ps0 ps0Var = photoViewer.V1;
                if (ps0Var != null && ps0Var.getVisibility() != 8) {
                    photoViewer.V1.setAlpha(f7 * photoViewer.f35838z7[0]);
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
        switch (this.f4870a) {
            case 0:
                super.setTranslationY(f7);
                FrameLayout frameLayout = ((h7) this.e).topBulletinContainer;
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
                    photoViewer.R7.setTranslationY(photoViewer.P0.getTranslationY() - (photoViewer.U1.getAlpha() * org.telegram.messenger.t.c(46.0f, photoViewer.U1.getEditTextHeight(), 0)));
                }
                org.telegram.ui.k0 k0Var = photoViewer.X1;
                if (k0Var != null) {
                    k0Var.setTranslationY(f7);
                }
                TextView textView = photoViewer.T7;
                if (textView != null && textView.getVisibility() != 8) {
                    photoViewer.T7.setTranslationY(f7);
                    return;
                }
                return;
            case 9:
                super.setTranslationY(f7);
                ((tg.y0) this.e).onContainerTranslationYChanged(f7);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        int i11;
        switch (this.f4870a) {
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

    public j5(fi.q5 q5Var, Context context) {
        super(context);
        this.e = q5Var;
        this.f4871b = new Matrix();
        this.f4872c = new float[8];
        this.d = new Path();
    }

    public j5(LimitPreviewView limitPreviewView, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.e = limitPreviewView;
        this.d = u6Var;
        this.f4872c = new Paint();
        Paint paint = new Paint();
        this.f4871b = paint;
        paint.setColor(-1);
    }

    public j5(Context context, org.telegram.ui.ActionBar.u6 u6Var, vh.f fVar) {
        super(context);
        this.e = fVar;
        this.d = u6Var;
        this.f4871b = new ag.h0(2);
        this.f4872c = new ag.h0(8);
    }

    public j5(tg.y0 y0Var, Context context, ScrollView scrollView, Drawable drawable) {
        super(context);
        this.e = y0Var;
        this.f4871b = scrollView;
        this.f4872c = drawable;
        this.d = new Path();
    }

    public j5(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.f4872c = textView;
        vh.j(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23462j5, u6Var);
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.f4871b = imageView;
        org.telegram.ui.ActionBar.j2 j2Var = new org.telegram.ui.ActionBar.j2(false);
        this.d = j2Var;
        imageView.setImageDrawable(j2Var);
        j2Var.a(-1);
        addView(imageView, gb1.h(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 16.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new t21(this, 0));
        b(true);
        setMinimumHeight(AndroidUtilities.dp(56.0f));
    }

    public j5(org.telegram.ui.x5 x5Var, Context context) {
        super(context);
        this.e = x5Var;
        this.f4871b = new RectF();
        setWillNotDraw(false);
        View imageView = new ImageView(context);
        this.f4872c = imageView;
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        addView(imageView, gb1.i(-2, -2, 1));
        addView(textView, gb1.h(-2, -2.0f, 1, 0.0f, 25.0f, 0.0f, 0.0f));
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        setMinimumWidth(AndroidUtilities.dp(100.0f));
        int dp = AndroidUtilities.dp(10.0f);
        int o10 = i0.a.o(-16777216, 80);
        setBackground(org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, 0, o10, o10));
    }

    public j5(tc1 tc1Var, Activity activity) {
        super(activity);
        this.e = tc1Var;
        this.f4872c = new Paint(1);
        this.f4871b = new Paint(1);
        this.d = new Paint(1);
    }

    public j5(h7 h7Var, Context context) {
        super(context);
        this.e = h7Var;
        this.f4871b = new RectF();
        this.f4872c = new Paint(1);
        this.d = new Path();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public j5(tg.f0 f0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.e = f0Var;
        this.d = u6Var;
        this.f4871b = new tg.a1(org.telegram.ui.ActionBar.y6.Lj, org.telegram.ui.ActionBar.y6.Mj, -1, -1, u6Var);
        Paint paint = new Paint(1);
        this.f4872c = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
    }

    public j5(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.e = photoViewer;
        this.f4872c = new Paint(3);
        this.f4871b = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, 2130706432}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.d = new Matrix();
    }
}
