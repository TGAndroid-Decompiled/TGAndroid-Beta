package ag;

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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import h7.z5;
import hh.e5;
import hh.i5;
import hh.j4;
import hh.r3;
import lh.r5;
import lh.w3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.b31;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.na;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.as0;
import org.telegram.ui.cc1;
import org.telegram.ui.mb1;
import org.telegram.ui.nc1;
import org.telegram.ui.ra1;
import org.telegram.ui.v21;
import org.telegram.ui.v5;
import org.telegram.ui.zr0;

public final class w extends FrameLayout {

    public final int f684a = 1;

    public Object f685b;

    public Object f686c;
    public Object d;

    public Object f687e;

    public w(Context context) {
        super(context);
    }

    public float a() {
        i5 i5Var = (i5) this.f687e;
        return (i5Var.U0.a(3) * i5Var.f9483w0.getMeasuredHeight()) + (i5Var.U0.a(2) * i5Var.f9481u0.getMeasuredHeight()) + (i5Var.U0.a(1) * i5Var.f9474n0.getMeasuredHeight()) + (i5Var.U0.a(0) * i5Var.f9453b0.getMeasuredHeight()) + i5Var.f9451a0.getRealHeight() + 0.0f;
    }

    public void b(boolean z10) {
        ((ImageView) this.f685b).setVisibility(z10 ? 0 : 8);
        TextView textView = (TextView) this.d;
        boolean z11 = LocaleController.isRTL;
        textView.setLayoutParams(z5.d(-1, -2.0f, 55, (z11 || !z10) ? 22.0f : 53.0f, 14.0f, (z11 && z10) ? 53.0f : 22.0f, 12.0f));
    }

    public void c(int i10, String str) {
        ((TextView) this.d).setText(str);
        ((ImageView) this.f685b).setImageDrawable(getContext().getDrawable(i10));
    }

    public float d() {
        j4 j4Var;
        float fMax = Math.max(0.0f, getHeight() - a());
        i5 i5Var = (i5) this.f687e;
        zk0 zk0Var = i5Var.d;
        for (int childCount = zk0Var.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = zk0Var.getChildAt(childCount);
            zk0Var.getClass();
            int iR = RecyclerView.R(childAt);
            if (iR >= 0) {
                if (iR == 2) {
                    fMax = childAt.getHeight() + childAt.getTranslationY() + childAt.getTop();
                    break;
                }
                if (iR == 1) {
                    fMax = childAt.getY();
                    break;
                }
                if (iR == 0) {
                    fMax = childAt.getY() - i5Var.f9451a0.getRealHeight();
                    break;
                }
            }
        }
        float fA = (i5Var.U0.a(4) * i5Var.getBottomInset()) + fMax;
        Float f10 = i5Var.T0;
        return (f10 == null || (j4Var = i5Var.U0) == null || j4Var.f9524a >= 1.0f) ? fA : AndroidUtilities.lerp(f10.floatValue(), fA, i5Var.U0.f9524a);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        switch (this.f684a) {
            case 0:
                c6 c6Var = (c6) this.f686c;
                Paint paint = (Paint) this.f685b;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f687e;
                if (!limitPreviewView.L) {
                    paint.setColor(g6.v0(g6.f22999a7, c6Var));
                } else if (limitPreviewView.V || limitPreviewView.N) {
                    paint.setColor(g6.v0(g6.f23144i6, c6Var));
                } else {
                    paint.setColor(g6.v0(g6.f23073e7, c6Var));
                }
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                c0 c0Var = limitPreviewView.f26444a0;
                if (c0Var != null) {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), ((v5) ((org.telegram.ui.c1) c0Var).f36910b).t0(getX() + ((ViewGroup) getParent()).getX(), getY() + ((ViewGroup) getParent()).getY()));
                } else {
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
                }
                canvas.save();
                if (!limitPreviewView.L) {
                    canvas.clipRect(limitPreviewView.f26455n, 0, getMeasuredWidth(), getMeasuredHeight());
                }
                Paint paintE = limitPreviewView.N ? limitPreviewView.G : limitPreviewView.f26444a0 != null ? (Paint) this.d : j2.d().e();
                ViewGroup viewGroup = limitPreviewView.f26460y;
                if (viewGroup != null) {
                    i2 i2Var = limitPreviewView.A;
                    if (i2Var != null) {
                        paintE = i2Var.f458f;
                        float f10 = limitPreviewView.f26447c;
                        float f11 = -limitPreviewView.B;
                        i2Var.a();
                        Matrix matrix = i2Var.f457e;
                        matrix.reset();
                        matrix.postScale(1.0f, f10 / 100.0f, 0.0f, 0.0f);
                        matrix.postTranslate(0.0f, f11);
                        i2Var.d.setLocalMatrix(matrix);
                    } else {
                        float y10 = 0.0f;
                        for (View view = this; view != viewGroup; view = (View) view.getParent()) {
                            y10 += view.getY();
                        }
                        j2.d().f(limitPreviewView.getGlobalXOffset() - getLeft(), -y10, viewGroup.getMeasuredWidth(), viewGroup.getMeasuredHeight());
                    }
                } else {
                    j2.d().f(limitPreviewView.getGlobalXOffset() - getLeft(), -getTop(), limitPreviewView.getMeasuredWidth(), limitPreviewView.getMeasuredHeight());
                }
                int alpha = paintE.getAlpha();
                if (limitPreviewView.R && (valueAnimator2 = limitPreviewView.f26451e0) != null) {
                    paintE.setAlpha((int) ((1.0f - ((Float) valueAnimator2.getAnimatedValue()).floatValue()) * alpha));
                } else if (limitPreviewView.Q && (valueAnimator = limitPreviewView.f26451e0) != null) {
                    paintE.setAlpha((int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * alpha));
                }
                if (limitPreviewView.L) {
                    if (limitPreviewView.H || limitPreviewView.I) {
                        AndroidUtilities.rectTmp.set(limitPreviewView.f26455n, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                    } else {
                        AndroidUtilities.rectTmp.set(0.0f, 0.0f, limitPreviewView.f26455n, getMeasuredHeight());
                    }
                }
                canvas.drawRoundRect(AndroidUtilities.rectTmp, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paintE);
                paintE.setAlpha(alpha);
                canvas.restore();
                if (limitPreviewView.A == null && limitPreviewView.W) {
                    invalidate();
                }
                super.dispatchDraw(canvas);
                break;
            case 1:
                Paint paint2 = (Paint) this.f685b;
                paint2.setColor(g6.v0(g6.Ii, (c6) this.f686c));
                float fDp = AndroidUtilities.dp(18.0f);
                float height = getHeight() / 2.0f;
                c1 c1Var = (c1) this.f687e;
                canvas.drawLine(fDp, height, c1Var.d.getLeft() - AndroidUtilities.dp(20.0f), getHeight() / 2.0f, paint2);
                canvas.drawLine(AndroidUtilities.dp(20.0f) + c1Var.d.getRight(), getHeight() / 2.0f, getWidth() - AndroidUtilities.dp(18.0f), getHeight() / 2.0f, paint2);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(c1Var.d.getLeft() - AndroidUtilities.dp(15.0f), ((c1Var.d.getBottom() + c1Var.d.getTop()) - AndroidUtilities.dp(30.0f)) / 2.0f, AndroidUtilities.dp(15.0f) + c1Var.d.getRight(), (AndroidUtilities.dp(30.0f) + (c1Var.d.getBottom() + c1Var.d.getTop())) / 2.0f);
                canvas.save();
                canvas.translate(rectF2.left, rectF2.top);
                rectF2.set(0.0f, 0.0f, rectF2.width(), rectF2.height());
                i2 i2Var2 = (i2) this.d;
                i2Var2.e(rectF2);
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), i2Var2.f458f);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
            case 2:
                Drawable drawable = (Drawable) this.f686c;
                g2 g2Var = (g2) this.f687e;
                ((org.telegram.ui.ActionBar.e3) g2Var).shadowDrawable.setBounds(0, rl.C(2.0f, ((org.telegram.ui.ActionBar.e3) g2Var).backgroundPaddingTop + g2Var.I, 1), getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.ActionBar.e3) g2Var).shadowDrawable.draw(canvas);
                super.dispatchDraw(canvas);
                d2 d2Var = g2Var.J;
                if (d2Var != null && d2Var.getVisibility() == 0 && g2Var.J.getAlpha() != 0.0f) {
                    drawable.setBounds(0, g2Var.J.getBottom(), getMeasuredWidth(), drawable.getIntrinsicHeight() + g2Var.J.getBottom());
                    drawable.setAlpha((int) (g2Var.J.getAlpha() * 255.0f));
                    drawable.draw(canvas);
                    break;
                }
                break;
            case 3:
            case 5:
            case 6:
            case 9:
            default:
                super.dispatchDraw(canvas);
                break;
            case 4:
                i5 i5Var = (i5) this.f687e;
                i5Var.I(canvas, this);
                canvas.save();
                float fD = d();
                float fDp2 = AndroidUtilities.dp(12.0f);
                RectF rectF3 = (RectF) this.d;
                rectF3.set(((org.telegram.ui.ActionBar.e3) i5Var).backgroundPaddingLeft, fD, getWidth() - ((org.telegram.ui.ActionBar.e3) i5Var).backgroundPaddingLeft, getHeight() + fDp2);
                Paint paint3 = (Paint) this.f685b;
                paint3.setColor(i5Var.getThemedColor(g6.f23124h5));
                Path path = (Path) this.f686c;
                path.rewind();
                path.addRoundRect(rectF3, fDp2, fDp2, Path.Direction.CW);
                canvas.drawPath(path, paint3);
                super.dispatchDraw(canvas);
                e();
                canvas.restore();
                na naVar = i5Var.f31853e;
                if (naVar != null && naVar.getVisibility() == 0 && naVar.getAlpha() > 0.0f) {
                    if (naVar.getAlpha() < 1.0f) {
                        canvas.saveLayerAlpha(naVar.getX(), naVar.getY(), naVar.getX() + naVar.getMeasuredWidth(), naVar.getY() + naVar.getMeasuredHeight(), (int) (naVar.getAlpha() * 255.0f), 31);
                    } else {
                        canvas.save();
                        canvas.clipRect(naVar.getX(), naVar.getY(), naVar.getX() + naVar.getMeasuredWidth(), naVar.getY() + naVar.getMeasuredHeight());
                    }
                    canvas.translate(naVar.getX(), naVar.getY());
                    naVar.draw(canvas);
                    canvas.restore();
                }
                i5Var.H(canvas, this);
                break;
            case 7:
                Path path2 = (Path) this.d;
                b31 b31Var = (b31) this.f687e;
                float fB = b31Var.B(true);
                float fLerp = AndroidUtilities.lerp(0, AndroidUtilities.dp(12.0f), h7.n.a(fB / AndroidUtilities.dpf2(24.0f), 0.0f, 1.0f));
                b31Var.f26914x.setTranslationY(Math.max(AndroidUtilities.statusBarHeight, fB));
                boolean z10 = fB <= ((float) AndroidUtilities.statusBarHeight) / 2.0f;
                Boolean bool = (Boolean) this.f686c;
                if (bool == null || bool.booleanValue() != z10) {
                    this.f686c = Boolean.valueOf(z10);
                    AndroidUtilities.setLightStatusBar(b31Var.getWindow(), AndroidUtilities.computePerceivedBrightness(z10 ? b31Var.getThemedColor(g6.f23124h5) : g6.v(b31Var.getThemedColor(g6.f23322s8), 855638016)) > 0.721f);
                }
                FrameLayout frameLayout = b31Var.topBulletinContainer;
                frameLayout.setTranslationY(Math.max(b31Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, fB) + getTranslationY() + ((-frameLayout.getTop()) - b31Var.topBulletinContainer.getHeight()));
                path2.rewind();
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(0.0f, fB, getWidth(), getHeight() + fLerp);
                path2.addRoundRect(rectF4, fLerp, fLerp, Path.Direction.CW);
                canvas.drawPath(path2, (Paint) this.f685b);
                super.dispatchDraw(canvas);
                break;
            case 8:
                LinearGradient linearGradient = (LinearGradient) this.d;
                Matrix matrix2 = (Matrix) this.f686c;
                Paint paint4 = (Paint) this.f685b;
                PhotoViewer photoViewer = (PhotoViewer) this.f687e;
                if (!photoViewer.O4) {
                    int measuredHeight = photoViewer.f35666j0.getVisibility() == 0 ? getMeasuredHeight() - AndroidUtilities.dp(48.0f) : 0;
                    int i10 = photoViewer.Y1;
                    if (i10 == 0 || i10 == 2 || i10 == -1) {
                        matrix2.reset();
                        float fMin = Math.min(AndroidUtilities.dp(40.0f), getMeasuredHeight() - measuredHeight);
                        matrix2.postTranslate(0.0f, measuredHeight);
                        matrix2.postScale(1.0f, fMin / 16.0f);
                        linearGradient.setLocalMatrix(matrix2);
                        paint4.setShader(linearGradient);
                    } else {
                        paint4.setShader(null);
                        paint4.setColor(2130706432);
                    }
                    canvas.drawRect(0.0f, measuredHeight, getMeasuredWidth(), getMeasuredHeight(), paint4);
                }
                super.dispatchDraw(canvas);
                break;
            case 10:
                Paint paint5 = (Paint) this.f686c;
                Paint paint6 = (Paint) this.d;
                RectF rectF5 = AndroidUtilities.rectTmp;
                rectF5.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                float fDp3 = AndroidUtilities.dp(8.0f);
                Paint paint7 = (Paint) this.f685b;
                paint7.setColor(0);
                float fDpf2 = AndroidUtilities.dpf2(1.0f);
                float fDpf3 = AndroidUtilities.dpf2(0.33f);
                nc1 nc1Var = (nc1) this.f687e;
                paint7.setShadowLayer(fDpf2, 0.0f, fDpf3, i0.b.k(-16777216, (int) (nc1Var.N1.getAlpha() * 27.0f)));
                canvas.drawRoundRect(rectF5, fDp3, fDp3, paint7);
                cc1 cc1Var = nc1Var.f40784t0;
                mb1 mb1Var = nc1Var.f40735a;
                g6.s(this, cc1Var, mb1Var);
                Paint paintN = mb1Var.N("paintChatActionBackground");
                int alpha2 = paintN.getAlpha();
                paintN.setAlpha((int) (nc1Var.N1.getAlpha() * alpha2));
                canvas.drawRoundRect(rectF5, fDp3, fDp3, paintN);
                paintN.setAlpha(alpha2);
                if (nc1Var.I1) {
                    float f12 = nc1Var.f40764j1;
                    if (f12 > 0.0f) {
                        paint5.setColor(i0.b.k(-16777216, (int) (f12 * 255.0f * nc1Var.f40766k1)));
                        canvas.drawRoundRect(rectF5, fDp3, fDp3, paint5);
                    }
                }
                paint6.setColor(520093695);
                paint6.setAlpha((int) (nc1Var.N1.getAlpha() * 30.0f));
                canvas.drawRoundRect(rectF5, fDp3, fDp3, paint6);
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f684a) {
            case 2:
                g2 g2Var = (g2) this.f687e;
                if (motionEvent.getAction() == 0) {
                    if (motionEvent.getY() < AndroidUtilities.dp(2.0f) + (g2Var.I - ((org.telegram.ui.ActionBar.e3) g2Var).backgroundPaddingTop)) {
                        g2Var.dismiss();
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            case 4:
                i5 i5Var = (i5) this.f687e;
                if (motionEvent.getAction() != 0 || motionEvent.getY() >= d() || !((org.telegram.ui.ActionBar.e3) i5Var).containerView.isAttachedToWindow()) {
                    return super.dispatchTouchEvent(motionEvent);
                }
                i5Var.dismiss();
                return true;
            case 7:
                b31 b31Var = (b31) this.f687e;
                if (b31Var.F != null && b31Var.G != null) {
                    if (motionEvent.getAction() == 0 || motionEvent.getAction() == 1) {
                        Log.d("TA2", "container dispatch act=" + motionEvent.getAction() + " inSel=" + b31Var.F.y());
                    }
                    if (b31Var.F.y() && b31Var.G.onTouchEvent(motionEvent)) {
                        Log.d("TA2", "overlay consumed (handle)");
                        return true;
                    }
                    boolean zB = b31Var.G.b(motionEvent);
                    if (motionEvent.getAction() == 1) {
                        Log.d("TA2", "checkOnTap=" + zB);
                    }
                    if (zB) {
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
        switch (this.f684a) {
            case 5:
                RectF rectF = (RectF) this.f686c;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), ((v5) this.f687e).t0(getX() + ((ViewGroup) getParent()).getX(), ((ViewGroup) getParent().getParent().getParent()).getY()));
                invalidate();
                super.draw(canvas);
                break;
            default:
                super.draw(canvas);
                break;
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        ImageReceiver photoImage;
        switch (this.f684a) {
            case 2:
                Path path = (Path) this.f685b;
                if (view != ((ScrollView) this.d)) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(getPaddingLeft(), AndroidUtilities.dp(18.0f) + ((g2) this.f687e).I, getMeasuredWidth() - getPaddingRight(), getMeasuredHeight());
                path.addRoundRect(rectF, AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f), Path.Direction.CW);
                canvas.clipPath(path);
                super.drawChild(canvas, view, j10);
                canvas.restore();
                return true;
            case 3:
                c6 c6Var = (c6) this.f686c;
                gf.c0 c0Var = (gf.c0) this.d;
                gf.c0 c0Var2 = (gf.c0) this.f685b;
                boolean zDrawChild = super.drawChild(canvas, view, j10);
                ch.h hVar = (ch.h) this.f687e;
                int i10 = (int) hVar.T.f48502e;
                if (view == hVar.f2919d0 && i10 > 0) {
                    c0Var2.setBounds(0, AndroidUtilities.dp(40.0f), getWidth(), AndroidUtilities.dp(48.0f));
                    int i11 = g6.f23124h5;
                    c0Var2.b(g6.v0(i11, c6Var));
                    c0Var2.draw(canvas);
                    int iDp = AndroidUtilities.dp(48.0f) + i10;
                    c0Var.setBounds(0, iDp - AndroidUtilities.dp(8.0f), getWidth(), iDp);
                    c0Var.b(g6.v0(i11, c6Var));
                    c0Var.draw(canvas);
                }
                return zDrawChild;
            case 4:
                i5 i5Var = (i5) this.f687e;
                if (view == i5Var.f31853e) {
                    return false;
                }
                if (view == i5Var.Z) {
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipPath((Path) this.f686c);
                boolean zDrawChild2 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return zDrawChild2;
            case 11:
                float[] fArr = (float[]) this.d;
                Path path2 = (Path) this.f686c;
                Matrix matrix = (Matrix) this.f685b;
                r5 r5Var = (r5) this.f687e;
                zf.x0 x0Var = r5Var.f50388n0;
                if (view != r5Var.f50393s0) {
                    return super.drawChild(canvas, view, j10);
                }
                org.telegram.ui.Cells.s1 cell = r5Var.getCell();
                if (cell == null || (photoImage = cell.getPhotoImage()) == null) {
                    return false;
                }
                matrix.reset();
                float fMax = Math.max(photoImage.getImageWidth() / r5Var.f50395u0, photoImage.getImageHeight() / r5Var.f50396v0);
                matrix.postScale((r5Var.f50395u0 / r5Var.f50393s0.getWidth()) * fMax, (r5Var.f50396v0 / r5Var.f50393s0.getHeight()) * fMax);
                matrix.postTranslate((photoImage.getCenterX() + (cell.getX() + x0Var.getX())) - ((r5Var.f50395u0 * fMax) / 2.0f), (photoImage.getCenterY() + (cell.getY() + x0Var.getY())) - ((r5Var.f50396v0 * fMax) / 2.0f));
                r5Var.f50393s0.setTransform(matrix);
                canvas.save();
                path2.rewind();
                AndroidUtilities.rectTmp.set(photoImage.getImageX() + cell.getX() + x0Var.getX(), photoImage.getImageY() + cell.getY() + x0Var.getY(), photoImage.getImageX2() + cell.getX() + x0Var.getX(), photoImage.getImageY2() + cell.getY() + x0Var.getY());
                for (int i12 = 0; i12 < photoImage.getRoundRadius().length; i12++) {
                    int i13 = i12 * 2;
                    fArr[i13] = photoImage.getRoundRadius()[i12];
                    fArr[i13 + 1] = photoImage.getRoundRadius()[i12];
                }
                path2.addRoundRect(AndroidUtilities.rectTmp, fArr, Path.Direction.CW);
                canvas.clipPath(path2);
                boolean zDrawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return zDrawChild3;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    public void e() {
        float fD = d();
        i5 i5Var = (i5) this.f687e;
        r3 r3Var = i5Var.Z;
        r3Var.setTranslationY(fD - r3Var.getHeight());
        float fClamp01 = Utilities.clamp01(AndroidUtilities.ilerp(fD - r3Var.getHeight(), 0.0f, AndroidUtilities.dp(32.0f)));
        r3Var.setAlpha(i5Var.U0.a(0) * fClamp01);
        r3Var.setScaleX(AndroidUtilities.lerp(0.5f, 1.0f, fClamp01));
        r3Var.setScaleY(AndroidUtilities.lerp(0.5f, 1.0f, fClamp01));
        e5 e5Var = i5Var.f9451a0;
        e5Var.setTranslationY(fD);
        i5Var.f9453b0.setTranslationY(e5Var.getRealHeight() + fD);
        i5Var.f9474n0.setTranslationY(e5Var.getRealHeight() + fD);
        i5Var.f9481u0.setTranslationY(e5Var.getRealHeight() + fD);
        i5Var.f9483w0.setTranslationY(e5Var.getRealHeight() + fD);
        FrameLayout frameLayout = i5Var.topBulletinContainer;
        if (frameLayout != null) {
            frameLayout.setTranslationY((getTranslationY() - a()) - AndroidUtilities.navigationBarHeight);
        }
        AndroidUtilities.updateViewVisibilityAnimated(i5Var.f9469j0, i5Var.d.canScrollVertically(1));
    }

    @Override
    public boolean hasOverlappingRendering() {
        switch (this.f684a) {
            case 2:
                return false;
            default:
                return super.hasOverlappingRendering();
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f684a) {
            case 7:
                super.onAttachedToWindow();
                ec.a(this, new cg.w(13));
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f684a) {
            case 7:
                super.onDetachedFromWindow();
                ec.h(this);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f684a) {
            case 6:
                RectF rectF = (RectF) this.f687e;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                float[] fArr = (float[]) this.f686c;
                fArr[3] = 0.0f;
                fArr[2] = 0.0f;
                fArr[1] = 0.0f;
                fArr[0] = 0.0f;
                float fDp = AndroidUtilities.dp(4.0f);
                fArr[7] = fDp;
                fArr[6] = fDp;
                fArr[5] = fDp;
                fArr[4] = fDp;
                Path path = (Path) this.d;
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                path.close();
                Paint paint = (Paint) this.f685b;
                paint.setColor(2130706432);
                canvas.drawPath(path, paint);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int left;
        int boundsRight;
        switch (this.f684a) {
            case 0:
                if (getChildCount() == 2) {
                    View childAt = getChildAt(0);
                    View childAt2 = getChildAt(1);
                    int measuredWidth = childAt.getMeasuredWidth();
                    int i14 = i13 - i11;
                    childAt.layout(0, 0, measuredWidth, i14);
                    childAt2.layout(measuredWidth, 0, i12 - i10, i14);
                } else {
                    super.onLayout(z10, i10, i11, i12, i13);
                }
                break;
            case 4:
                super.onLayout(z10, i10, i11, i12, i13);
                i5 i5Var = (i5) this.f687e;
                i iVar = i5Var.M0;
                if (iVar != null) {
                    iVar.F(i5Var.f9451a0.getFinalHeight(), i5Var.z1() + ((i5Var.U0.d(1) && i5Var.f9467i0.getVisibility() == 0) ? i5Var.f9467i0.getMeasuredHeight() : 0));
                }
                i5Var.T1();
                break;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                PhotoViewer photoViewer = (PhotoViewer) this.f687e;
                if (photoViewer.D0.getVisibility() != 8) {
                    int iDp = (((i12 - i10) - (photoViewer.O0.getVisibility() == 0 ? AndroidUtilities.dp(63.0f) : 0)) - photoViewer.D0.getMeasuredWidth()) / 2;
                    ra1 ra1Var = photoViewer.D0;
                    ra1Var.layout(iDp, ra1Var.getTop(), photoViewer.D0.getMeasuredWidth() + iDp, photoViewer.D0.getMeasuredHeight() + photoViewer.D0.getTop());
                }
                break;
            case 11:
                r5 r5Var = (r5) this.f687e;
                zf.x0 x0Var = r5Var.f50388n0;
                int measuredWidth2 = x0Var.getMeasuredWidth();
                int iMax = 0;
                for (int i15 = 0; i15 < x0Var.getChildCount(); i15++) {
                    View childAt3 = x0Var.getChildAt(i15);
                    int left2 = childAt3.getLeft();
                    int right = childAt3.getRight();
                    if (childAt3 instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt3;
                        left2 = childAt3.getLeft() + s1Var.getBoundsLeft();
                        left = childAt3.getLeft();
                        boundsRight = s1Var.getBoundsRight();
                    } else {
                        if (childAt3 instanceof org.telegram.ui.Cells.v0) {
                            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt3;
                            left2 = childAt3.getLeft() + v0Var.getBoundsLeft();
                            left = childAt3.getLeft();
                            boundsRight = v0Var.getBoundsRight();
                        }
                        measuredWidth2 = Math.min(left2, measuredWidth2);
                        iMax = Math.max(right, iMax);
                    }
                    right = boundsRight + left;
                    measuredWidth2 = Math.min(left2, measuredWidth2);
                    iMax = Math.max(right, iMax);
                }
                x0Var.layout(-measuredWidth2, 0, x0Var.getMeasuredWidth() - measuredWidth2, x0Var.getMeasuredHeight());
                TextureView textureView = r5Var.f50393s0;
                if (textureView != null) {
                    textureView.layout(0, 0, getMeasuredWidth(), x0Var.getMeasuredHeight());
                }
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int left;
        int boundsRight;
        switch (this.f684a) {
            case 0:
                c6 c6Var = (c6) this.f686c;
                LimitPreviewView limitPreviewView = (LimitPreviewView) this.f687e;
                TextView textView = limitPreviewView.f26458w;
                d0 d0Var = limitPreviewView.f26448c0;
                j6 j6Var = limitPreviewView.J;
                d0 d0Var2 = limitPreviewView.f26446b0;
                j6 j6Var2 = limitPreviewView.v;
                if (getChildCount() == 2) {
                    int size = View.MeasureSpec.getSize(i10);
                    int size2 = View.MeasureSpec.getSize(i11);
                    d0Var2.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    int iMax = Math.max(d0Var2.getMeasuredWidth(), j6Var.getMeasuredWidth() + AndroidUtilities.dp(24.0f) + (textView.getVisibility() == 0 ? textView.getMeasuredWidth() + AndroidUtilities.dp(24.0f) : 0));
                    d0Var.measure(View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    if (limitPreviewView.L) {
                        float f10 = limitPreviewView.f26443a;
                        if (f10 == 0.0f) {
                            limitPreviewView.f26455n = 0;
                            if (!limitPreviewView.Q && !limitPreviewView.R) {
                                j6Var2.setTextColor((!limitPreviewView.H && limitPreviewView.f26444a0 == null) ? g6.v0(g6.G6, c6Var) : -1);
                                j6Var.setTextColor(limitPreviewView.f26444a0 == null ? g6.v0(g6.G6, c6Var) : -1);
                            }
                        } else if (f10 < 1.0f) {
                            float measuredWidth = limitPreviewView.H ? 0.0f : d0Var2.getMeasuredWidth() - AndroidUtilities.dp(8.0f);
                            limitPreviewView.f26455n = (int) ((((size - measuredWidth) - (limitPreviewView.H ? 0.0f : d0Var.getMeasuredWidth() - AndroidUtilities.dp(8.0f))) * limitPreviewView.f26443a) + measuredWidth);
                            if (!limitPreviewView.Q && !limitPreviewView.R) {
                                j6Var2.setTextColor((!limitPreviewView.H && limitPreviewView.f26444a0 == null) ? g6.v0(g6.G6, c6Var) : -1);
                                j6Var.setTextColor(-1);
                            }
                        } else {
                            limitPreviewView.f26455n = size;
                            if (!limitPreviewView.Q && !limitPreviewView.R) {
                                j6Var2.setTextColor(-1);
                                j6Var.setTextColor(-1);
                            }
                        }
                    } else {
                        int iClamp = (int) Utilities.clamp(size * limitPreviewView.f26443a, size - Math.max(d0Var.getMeasuredWidth(), (limitPreviewView.K.getMeasuredWidth() + AndroidUtilities.dp(24.0f)) + (j6Var2.getVisibility() == 0 ? j6Var2.getMeasuredWidth() + AndroidUtilities.dp(24.0f) : 0)), iMax);
                        limitPreviewView.f26455n = iClamp;
                        d0Var2.measure(View.MeasureSpec.makeMeasureSpec(iClamp, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                        d0Var.measure(View.MeasureSpec.makeMeasureSpec(size - limitPreviewView.f26455n, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
                    }
                    setMeasuredDimension(size, size2);
                } else {
                    super.onMeasure(i10, i11);
                }
                break;
            case 1:
            case 3:
            case 5:
            case 6:
            case 10:
            default:
                super.onMeasure(i10, i11);
                break;
            case 2:
                g2 g2Var = (g2) this.f687e;
                g2Var.H = 0;
                ScrollView scrollView = (ScrollView) this.d;
                scrollView.measure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), Integer.MIN_VALUE));
                g2Var.H = ((org.telegram.ui.ActionBar.e3) g2Var).backgroundPaddingTop + (View.MeasureSpec.getSize(i11) - scrollView.getMeasuredHeight());
                super.onMeasure(i10, i11);
                g2Var.z();
                break;
            case 4:
                i5 i5Var = (i5) this.f687e;
                int bottomInset = i5Var.getBottomInset();
                int measuredHeight = 0;
                setPadding(0, 0, 0, bottomInset);
                i5Var.f9451a0.H.setPadding(0, 0, 0, bottomInset);
                int size3 = View.MeasureSpec.getSize(i11);
                i5Var.h = size3;
                int size4 = View.MeasureSpec.getSize(i10);
                for (int i12 = 0; i12 < getChildCount(); i12++) {
                    View childAt = getChildAt(i12);
                    if (childAt instanceof w3) {
                        childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(100.0f), 1073741824));
                    } else if (childAt == i5Var.d) {
                        childAt.measure(i10, View.MeasureSpec.makeMeasureSpec(size3 - bottomInset, 1073741824));
                    } else {
                        childAt.measure(i10, View.MeasureSpec.makeMeasureSpec((childAt.getLayoutParams() == null || childAt.getLayoutParams().height != -1) ? 9999 : size3, Integer.MIN_VALUE));
                    }
                }
                setMeasuredDimension(size4, size3);
                i iVar = i5Var.M0;
                if (iVar != null) {
                    int finalHeight = i5Var.f9451a0.getFinalHeight();
                    int iZ1 = i5Var.z1();
                    if (i5Var.U0.d(1) && i5Var.f9467i0.getVisibility() == 0) {
                        measuredHeight = i5Var.f9467i0.getMeasuredHeight();
                    }
                    iVar.F(finalHeight, iZ1 + measuredHeight);
                }
                break;
            case 7:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i11), 1073741824));
                break;
            case 8:
                PhotoViewer photoViewer = (PhotoViewer) this.f687e;
                ((FrameLayout.LayoutParams) photoViewer.D0.getLayoutParams()).rightMargin = photoViewer.O0.getVisibility() == 0 ? AndroidUtilities.dp(63.0f) : 0;
                super.onMeasure(i10, i11);
                break;
            case 9:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), i11);
                break;
            case 11:
                r5 r5Var = (r5) this.f687e;
                zf.x0 x0Var = r5Var.f50388n0;
                x0Var.measure(i10, View.MeasureSpec.makeMeasureSpec(0, 0));
                TextureView textureView = r5Var.f50393s0;
                if (textureView != null) {
                    textureView.measure(View.MeasureSpec.makeMeasureSpec(x0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(x0Var.getMeasuredHeight(), 1073741824));
                }
                int measuredWidth2 = x0Var.getMeasuredWidth();
                int iMax2 = 0;
                for (int i13 = 0; i13 < x0Var.getChildCount(); i13++) {
                    View childAt2 = x0Var.getChildAt(i13);
                    int left2 = childAt2.getLeft();
                    int right = childAt2.getRight();
                    if (childAt2 instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt2;
                        left2 = childAt2.getLeft() + s1Var.getBoundsLeft();
                        left = childAt2.getLeft();
                        boundsRight = s1Var.getBoundsRight();
                    } else {
                        if (childAt2 instanceof org.telegram.ui.Cells.v0) {
                            org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt2;
                            left2 = childAt2.getLeft() + v0Var.getBoundsLeft();
                            left = childAt2.getLeft();
                            boundsRight = v0Var.getBoundsRight();
                        }
                        measuredWidth2 = Math.min(left2, measuredWidth2);
                        iMax2 = Math.max(right, iMax2);
                    }
                    right = boundsRight + left;
                    measuredWidth2 = Math.min(left2, measuredWidth2);
                    iMax2 = Math.max(right, iMax2);
                }
                setMeasuredDimension(iMax2 - measuredWidth2, x0Var.getMeasuredHeight());
                break;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f684a) {
            case 8:
                super.setAlpha(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.f687e;
                FrameLayout frameLayout = photoViewer.M7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.M7.setAlpha(f10);
                }
                zr0 zr0Var = photoViewer.Q1;
                if (zr0Var != null && zr0Var.getVisibility() != 8) {
                    photoViewer.Q1.setAlpha(photoViewer.f35771u7[0] * f10);
                }
                as0 as0Var = photoViewer.R1;
                if (as0Var != null && as0Var.getVisibility() != 8) {
                    photoViewer.R1.setAlpha(f10 * photoViewer.f35779v7[0]);
                    break;
                }
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f684a) {
            case 2:
                super.setTranslationY(f10);
                ((g2) this.f687e).onContainerTranslationYChanged(f10);
                break;
            case 3:
            case 5:
            case 6:
            default:
                super.setTranslationY(f10);
                break;
            case 4:
                super.setTranslationY(f10);
                FrameLayout frameLayout = ((i5) this.f687e).topBulletinContainer;
                if (frameLayout != null) {
                    frameLayout.setTranslationY((getTranslationY() - a()) - AndroidUtilities.navigationBarHeight);
                }
                break;
            case 7:
                super.setTranslationY(f10);
                b31 b31Var = (b31) this.f687e;
                FrameLayout frameLayout2 = b31Var.topBulletinContainer;
                frameLayout2.setTranslationY(Math.max(b31Var.topBulletinContainer.getHeight() + AndroidUtilities.dp(56.0f) + AndroidUtilities.statusBarHeight, b31Var.B(true)) + ((-frameLayout2.getTop()) - b31Var.topBulletinContainer.getHeight()) + f10);
                break;
            case 8:
                super.setTranslationY(f10);
                PhotoViewer photoViewer = (PhotoViewer) this.f687e;
                FrameLayout frameLayout3 = photoViewer.M7;
                if (frameLayout3 != null && frameLayout3.getVisibility() != 8) {
                    photoViewer.M7.setTranslationY(photoViewer.L0.getTranslationY() - (photoViewer.Q1.getAlpha() * i0.a.d(46.0f, photoViewer.Q1.getEditTextHeight(), 0)));
                }
                org.telegram.ui.n0 n0Var = photoViewer.T1;
                if (n0Var != null) {
                    n0Var.setTranslationY(f10);
                }
                TextView textView = photoViewer.O7;
                if (textView != null && textView.getVisibility() != 8) {
                    photoViewer.O7.setTranslationY(f10);
                    break;
                }
                break;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f684a) {
            case 8:
                super.setVisibility(i10);
                PhotoViewer photoViewer = (PhotoViewer) this.f687e;
                FrameLayout frameLayout = photoViewer.M7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer.M7.setVisibility(i10 == 0 ? 0 : 4);
                    break;
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }

    public w(r5 r5Var, Context context) {
        super(context);
        this.f687e = r5Var;
        this.f685b = new Matrix();
        this.d = new float[8];
        this.f686c = new Path();
    }

    public w(LimitPreviewView limitPreviewView, Context context, c6 c6Var) {
        super(context);
        this.f687e = limitPreviewView;
        this.f686c = c6Var;
        this.f685b = new Paint();
        Paint paint = new Paint();
        this.d = paint;
        paint.setColor(-1);
    }

    public w(Context context, ch.h hVar, c6 c6Var) {
        super(context);
        this.f687e = hVar;
        this.f686c = c6Var;
        this.f685b = new gf.c0(2);
        this.d = new gf.c0(8);
    }

    public w(g2 g2Var, Context context, ScrollView scrollView, Drawable drawable) {
        super(context);
        this.f687e = g2Var;
        this.d = scrollView;
        this.f686c = drawable;
        this.f685b = new Path();
    }

    public w(Context context, c6 c6Var) {
        super(context);
        TextView textView = new TextView(context);
        this.d = textView;
        rl.h(20.0f, 1, textView);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setTextColor(g6.v0(g6.f23161j5, c6Var));
        addView(textView);
        ImageView imageView = new ImageView(context);
        this.f685b = imageView;
        org.telegram.ui.ActionBar.g2 g2Var = new org.telegram.ui.ActionBar.g2(false);
        this.f686c = g2Var;
        imageView.setImageDrawable(g2Var);
        g2Var.a(-1);
        addView(imageView, z5.d(24, 24.0f, (LocaleController.isRTL ? 5 : 3) | 48, 16.0f, 16.0f, 16.0f, 0.0f));
        imageView.setOnClickListener(new v21(this, 0));
        b(true);
        setMinimumHeight(AndroidUtilities.dp(56.0f));
    }

    public w(v5 v5Var, Context context) {
        super(context);
        this.f687e = v5Var;
        this.f686c = new RectF();
        setWillNotDraw(false);
        View imageView = new ImageView(context);
        this.f685b = imageView;
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 12.0f);
        addView(imageView, z5.e(-2, -2, 1));
        addView(textView, z5.d(-2, -2.0f, 1, 0.0f, 25.0f, 0.0f, 0.0f));
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        setMinimumWidth(AndroidUtilities.dp(100.0f));
        int iDp = AndroidUtilities.dp(10.0f);
        int iK = i0.b.k(-16777216, 80);
        setBackground(g6.i0(iDp, iDp, iDp, iDp, 0, iK, iK));
    }

    public w(b31 b31Var, Context context) {
        super(context);
        this.f687e = b31Var;
        this.d = new Path();
        Paint paint = new Paint(1);
        this.f685b = paint;
        paint.setColor(b31Var.getThemedColor(g6.f23124h5));
        g6.m(paint);
    }

    public w(nc1 nc1Var, Activity activity) {
        super(activity);
        this.f687e = nc1Var;
        this.f685b = new Paint(1);
        this.d = new Paint(1);
        this.f686c = new Paint(1);
    }

    public w(i5 i5Var, Context context) {
        super(context);
        this.f687e = i5Var;
        this.d = new RectF();
        this.f685b = new Paint(1);
        this.f686c = new Path();
        setWillNotDraw(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public w(c1 c1Var, Context context, c6 c6Var) {
        super(context);
        this.f687e = c1Var;
        this.f686c = c6Var;
        this.d = new i2(g6.Lj, g6.Mj, -1, -1, c6Var);
        Paint paint = new Paint(1);
        this.f685b = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(1.0f);
    }

    public w(PhotoViewer photoViewer, ContextThemeWrapper contextThemeWrapper) {
        super(contextThemeWrapper);
        this.f687e = photoViewer;
        this.f685b = new Paint(3);
        this.d = new LinearGradient(0.0f, 0.0f, 0.0f, 16.0f, new int[]{0, 2130706432}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.f686c = new Matrix();
    }
}
