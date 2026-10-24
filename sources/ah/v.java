package ah;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ei.c6;
import ei.x3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.tl;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Components.ae0;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.fl0;
import org.telegram.ui.Components.ne0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.up;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.zr;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.Wallet.o5;
import org.telegram.ui.Wallet.z4;
import org.telegram.ui.a41;
import org.telegram.ui.a61;
import org.telegram.ui.ac;
import org.telegram.ui.d51;
import org.telegram.ui.e51;
import org.telegram.ui.f51;
import org.telegram.ui.ht;
import org.telegram.ui.j51;
import org.telegram.ui.jt0;
import org.telegram.ui.k4;
import org.telegram.ui.ly0;
import org.telegram.ui.n70;
import org.telegram.ui.pc1;
import org.telegram.ui.s5;
import org.telegram.ui.t31;
import org.telegram.ui.w10;
import w7.z5;
public final class v extends FrameLayout {
    public final int f894a;
    public Object f895b;
    public Object f896c;

    public v(Object obj, Context context, int i10) {
        super(context);
        this.f894a = i10;
        this.f896c = obj;
    }

    public void b(Canvas canvas) {
        ne0 ne0Var = (ne0) this.f896c;
        Drawable drawable = ne0Var.f28881a;
        if (drawable != null) {
            if (!(drawable instanceof wc0) && !(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable)) {
                float max = Math.max(getMeasuredWidth() / ne0Var.f28881a.getIntrinsicWidth(), (getMeasuredHeight() + ne0Var.G) / ne0Var.f28881a.getIntrinsicHeight());
                int ceil = (int) Math.ceil(ne0Var.f28881a.getIntrinsicWidth() * max);
                int ceil2 = (int) Math.ceil(ne0Var.f28881a.getIntrinsicHeight() * max);
                int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                int measuredHeight = ((getMeasuredHeight() - ceil2) + ne0Var.G) / 2;
                ne0Var.f28881a.setBounds(measuredWidth, measuredHeight, ceil + measuredWidth, ceil2 + measuredHeight);
                ne0Var.f28881a.draw(canvas);
            } else {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                ne0Var.f28881a.draw(canvas);
            }
        } else {
            super.onDraw(canvas);
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (Paint) this.f895b);
    }

    public void c(int i10, CharSequence charSequence, boolean z10) {
        ImageView imageView = (ImageView) this.f895b;
        if (z10) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
        ((TextView) this.f896c).setText(charSequence);
        requestLayout();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        g6 g6Var;
        Paint paint;
        boolean c12;
        int o10;
        n5[] n5VarArr;
        float f7;
        org.telegram.ui.Cells.y yVar;
        float f10;
        switch (this.f894a) {
            case 6:
                zf.y yVar2 = (zf.y) this.f896c;
                yVar2.b(k6.o1(0.65f, k6.w0(k6.f21184d6, (g6) this.f895b)));
                yVar2.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 8:
                super.dispatchDraw(canvas);
                Paint paint2 = (Paint) this.f895b;
                int i10 = k6.f21126a7;
                g6Var = ((o2) ((s5) this.f896c).d).resourceProvider;
                paint2.setColor(k6.w0(i10, g6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint2);
                return;
            case 9:
                RectF rectF = (RectF) this.f895b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Cells.y0 y0Var = (org.telegram.ui.Cells.y0) this.f896c;
                int measuredWidth = y0Var.getMeasuredWidth();
                int i11 = y0Var.e;
                float x10 = y0Var.getX();
                float f11 = y0Var.d;
                g6 g6Var2 = y0Var.f23967c;
                if (g6Var2 != null) {
                    g6Var2.b(x10, f11, measuredWidth, i11);
                } else {
                    k6.q(x10, f11, measuredWidth, i11);
                }
                float dp = AndroidUtilities.dp(18.0f);
                float dp2 = AndroidUtilities.dp(18.0f);
                Paint paint3 = null;
                if (g6Var2 != null) {
                    paint = g6Var2.d("paintChatActionBackground");
                } else {
                    paint = null;
                }
                if (paint == null) {
                    paint = k6.U0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, dp, dp2, paint);
                if (g6Var2 != null) {
                    c12 = g6Var2.f();
                } else {
                    c12 = k6.c1();
                }
                if (c12) {
                    float dp3 = AndroidUtilities.dp(18.0f);
                    float dp4 = AndroidUtilities.dp(18.0f);
                    if (g6Var2 != null) {
                        paint3 = g6Var2.d("paintChatActionBackgroundDarken");
                    }
                    if (paint3 == null) {
                        paint3 = k6.U0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF, dp3, dp4, paint3);
                }
                super.dispatchDraw(canvas);
                return;
            case 10:
                super.dispatchDraw(canvas);
                Paint paint4 = (Paint) this.f895b;
                paint4.setColor(k6.w0(k6.f21126a7, ((ac) this.f896c).f35725f.e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint4);
                return;
            case 11:
                float dp5 = AndroidUtilities.dp(20.0f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.f895b;
                path.rewind();
                path.addRoundRect(rectF2, dp5, dp5, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF2, 255, 31);
                super.dispatchDraw(canvas);
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), AndroidUtilities.dp(6.0f) + getPaddingTop());
                w10 w10Var = (w10) this.f896c;
                w10Var.b(canvas, rectF2, 1, 1.0f);
                rectF2.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                w10Var.b(canvas, rectF2, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                return;
            case 12:
                super.dispatchDraw(canvas);
                Paint paint5 = (Paint) this.f895b;
                paint5.setColor(((up) this.f896c).getThemedColor(k6.f21185d7));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint5);
                return;
            case 13:
                ez ezVar = (ez) this.f896c;
                if (!ezVar.G.f30365u0 && ezVar.f26149w > 0.0f) {
                    if (((Paint) this.f895b) == null) {
                        Paint paint6 = new Paint();
                        this.f895b = paint6;
                        paint6.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f895b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f895b).setAlpha((int) (ezVar.f26149w * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f895b);
                    canvas.restore();
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 15:
                Paint paint7 = (Paint) this.f895b;
                fl0 fl0Var = (fl0) this.f896c;
                int i12 = fl0Var.M0;
                if (i12 != 1 && i12 != 2 && i12 != 4) {
                    o10 = i0.a.f(0.7f, k6.w0(k6.F8, fl0Var.f26370k0), k6.w0(k6.f21255h5, fl0Var.f26370k0));
                } else {
                    o10 = i0.a.o(-1, 30);
                }
                paint7.setColor(o10);
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - AndroidUtilities.dpf2(6.0f)) / 2.0f;
                float g10 = fl0Var.g();
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(measuredWidth2 - measuredWidth3, (measuredHeight - measuredWidth3) - g10, measuredWidth2 + measuredWidth3, measuredHeight + measuredWidth3 + g10);
                canvas.save();
                canvas.scale(childAt.getScaleX(), childAt.getScaleY(), measuredWidth2, measuredHeight);
                canvas.drawRoundRect(rectF3, measuredWidth3, measuredWidth3, paint7);
                canvas.restore();
                canvas.save();
                canvas.translate(0.0f, g10);
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            case 21:
                super.dispatchDraw(canvas);
                ProfileActivity profileActivity = (ProfileActivity) this.f896c;
                n5[] n5VarArr2 = profileActivity.f34002r;
                if (profileActivity.Y4 != null) {
                    canvas.save();
                    canvas.translate(n5VarArr2[0].getX(), n5VarArr2[0].getY());
                    n5VarArr = n5VarArr2;
                    f7 = 0.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.Y4.getMeasuredWidth(), profileActivity.Y4.getMeasuredHeight(), (int) ((1.0f - profileActivity.T1) * 255.0f), 31);
                    profileActivity.Y4.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    n5VarArr = n5VarArr2;
                    f7 = 0.0f;
                }
                if (profileActivity.f34008r5 && profileActivity.f33906c6 != f7 && profileActivity.p5 != 1.0f) {
                    float measuredHeight2 = (n5VarArr[1].getMeasuredHeight() / 2.0f) + n5VarArr[1].getY();
                    float dp6 = AndroidUtilities.dp(22.0f);
                    float x11 = ((n5VarArr[1].getX() + (AndroidUtilities.dp(28.0f) - profileActivity.f34001q5)) - dp6) - profileActivity.b4();
                    profileActivity.f34023t5.setImageCoords(x11, measuredHeight2 - (dp6 / 2.0f), dp6, dp6);
                    profileActivity.f34023t5.setAlpha(profileActivity.f33906c6);
                    canvas.save();
                    float f12 = profileActivity.f33906c6;
                    canvas.scale(f12, f12, profileActivity.f34023t5.getCenterX(), profileActivity.f34023t5.getCenterY());
                    profileActivity.f34023t5.draw(canvas);
                    canvas.restore();
                    if (profileActivity.p5 == f7) {
                        if (((dd) this.f895b) == null) {
                            dd ddVar = new dd(this);
                            this.f895b = ddVar;
                            ddVar.h = new ly0(this, 1);
                        }
                        float dp7 = (1.0f - profileActivity.p5) * AndroidUtilities.dp(28.0f);
                        float textWidth = n5VarArr[2].getTextWidth();
                        if (profileActivity.T != null) {
                            f10 = (AndroidUtilities.dp(24.0f) + textWidth + AndroidUtilities.dp(4.0f)) * profileActivity.T.getVisibilityFactor();
                        } else {
                            f10 = f7;
                        }
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        rectF4.set(x11 - AndroidUtilities.dp(4.0f), measuredHeight2 - AndroidUtilities.dp(14.0f), x11 + Math.max(textWidth, f10) + dp7 + AndroidUtilities.dp(4.0f), measuredHeight2 + AndroidUtilities.dp(14.0f));
                        dd ddVar2 = (dd) this.f895b;
                        ddVar2.f25703i = false;
                        ddVar2.f25700c = 0;
                        ddVar2.a(rectF4);
                        dd ddVar3 = (dd) this.f895b;
                        ddVar3.f25708n = true;
                        int o11 = i0.a.o(-1, 50);
                        ddVar3.f25702g.setColor(0);
                        org.telegram.ui.Cells.y yVar3 = ddVar3.e;
                        if (yVar3 != null) {
                            k6.E1(yVar3, o11, true);
                        }
                        dd ddVar4 = (dd) this.f895b;
                        ddVar4.c(canvas, ddVar4.f25702g);
                        org.telegram.ui.Cells.y yVar4 = ddVar4.e;
                        if (yVar4 != null) {
                            yVar4.draw(canvas);
                            return;
                        }
                        return;
                    }
                    dd ddVar5 = (dd) this.f895b;
                    if (ddVar5 != null && (yVar = ddVar5.e) != null) {
                        yVar.setState(StateSet.NOTHING);
                        yVar.jumpToCurrentState();
                        return;
                    }
                    return;
                }
                return;
            case 25:
                ImageReceiver imageReceiver = (ImageReceiver) this.f895b;
                imageReceiver.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                imageReceiver.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 28:
                super.dispatchDraw(canvas);
                ((o5) this.f896c).getClass();
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.f894a) {
            case 1:
                if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
                    t0 t0Var = (t0) this.f896c;
                    if (!t0Var.f876k) {
                        return true;
                    }
                    t0Var.d();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public void dispatchSetPressed(boolean z10) {
        switch (this.f894a) {
            case 1:
                return;
            default:
                super.dispatchSetPressed(z10);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        float f7;
        int dp;
        switch (this.f894a) {
            case 6:
                super.dispatchTouchEvent(motionEvent);
                return true;
            case 7:
                k4 k4Var = (k4) this.f896c;
                aa n10 = k4Var.Q0.n(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.f895b;
                obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (k4Var.Q0.x() && k4Var.Q0.n(getContext()).onTouchEvent(obtain)) {
                    return true;
                }
                if (n10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() == 0 && k4Var.Q0.x() && (motionEvent.getY() < linearLayout.getTop() || motionEvent.getY() > linearLayout.getBottom())) {
                    if (!k4Var.Q0.n(getContext()).onTouchEvent(obtain)) {
                        return true;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            case 16:
                int action = motionEvent.getAction();
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.f896c;
                if (h1Var.J != null) {
                    MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                    obtain2.offsetLocation(h1Var.J.getX(), h1Var.J.getY());
                    boolean dispatchTouchEvent = h1Var.J.dispatchTouchEvent(motionEvent);
                    obtain2.recycle();
                    if (action == 1 || action == 3) {
                        h1Var.J = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                obtain3.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = h1Var.F.onTouchEvent(obtain3);
                obtain3.recycle();
                if (!h1Var.F.isInProgress() && ((GestureDetector) h1Var.G.f16072b).onTouchEvent(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (action == 1 || action == 3) {
                    h1Var.H = false;
                    h1Var.I = false;
                    o1.k kVar = h1Var.S;
                    if (!kVar.f17615f) {
                        float f10 = h1Var.Q;
                        kVar.f17613b = f10;
                        kVar.f17614c = true;
                        o1.l lVar = kVar.f17622u;
                        int i10 = h1Var.M;
                        float f11 = (i10 / 2.0f) + f10;
                        int i11 = AndroidUtilities.displaySize.x;
                        if (f11 >= i11 / 2.0f) {
                            dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        lVar.f17628i = dp;
                        h1Var.S.h();
                    }
                    o1.k kVar2 = h1Var.T;
                    if (!kVar2.f17615f) {
                        kVar2.f17613b = h1Var.R;
                        kVar2.f17614c = true;
                        kVar2.f17622u.f17628i = w7.r.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - h1Var.N) - AndroidUtilities.dp(16.0f));
                        h1Var.T.h();
                    }
                }
                if (onTouchEvent || z10) {
                    return true;
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        float f7;
        Rect rect;
        boolean z11;
        float f10;
        switch (this.f894a) {
            case 3:
                Path path = (Path) this.f895b;
                c6 c6Var = (c6) this.f896c;
                if (c6Var.h != null && (((z10 = c6Var.f8836f) && view == c6Var.d) || (!z10 && view == c6Var.f8835c))) {
                    if (z10) {
                        f7 = c6Var.e;
                    } else {
                        f7 = 1.0f - c6Var.e;
                    }
                    canvas.save();
                    path.rewind();
                    path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f7 * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                    canvas.clipPath(path);
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j10);
            case 18:
                if (view instanceof ae0) {
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            case 22:
                if (view != ((SecretMediaViewer) this.f895b).f34136w && super.drawChild(canvas, view, j10)) {
                    return true;
                }
                return false;
            case 23:
                Path path2 = (Path) this.f895b;
                a41 a41Var = (a41) this.f896c;
                RectF rectF = a41Var.R;
                if (view != a41Var.N && view != a41Var.f35589x) {
                    if (view == a41Var.P) {
                        canvas.save();
                        path2.rewind();
                        path2.addCircle(rectF.centerX() + a41Var.N.getX(), rectF.centerY() + a41Var.N.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                        canvas.clipPath(path2);
                        canvas.clipRect(0.0f, AndroidUtilities.lerp(a41Var.T, 0.0f, a41Var.f35587s), getWidth(), AndroidUtilities.lerp(a41Var.U, getHeight(), a41Var.f35587s));
                        canvas.translate(-a41Var.P.getX(), -a41Var.P.getY());
                        canvas.translate(a41Var.N.getX() + rectF.left, a41Var.N.getY() + rectF.top);
                        canvas.scale(rectF.width() / a41Var.P.getMeasuredWidth(), rectF.height() / a41Var.P.getMeasuredHeight(), a41Var.P.getX(), a41Var.P.getY());
                        boolean drawChild2 = super.drawChild(canvas, view, j10);
                        canvas.restore();
                        return drawChild2;
                    }
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(a41Var.T, 0.0f, a41Var.f35587s), getWidth(), AndroidUtilities.lerp(a41Var.U, getHeight(), a41Var.f35587s));
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild3;
            case 24:
                if (view == ((a61) this.f896c).f35622h0 && x0.f902b && x0.f904f) {
                    for (int i10 = 0; i10 < ((a61) this.f896c).f35622h0.getChildCount(); i10++) {
                        View childAt = ((a61) this.f896c).f35622h0.getChildAt(i10);
                        if (childAt instanceof j51) {
                            j51 j51Var = (j51) childAt;
                            if (j51Var.getAnimatedScale() == 1.0f) {
                                ((Rect) this.f895b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                canvas.save();
                                canvas.clipRect((Rect) this.f895b);
                                super.drawChild(canvas, view, j10);
                                canvas.restore();
                            } else if (j51Var.getAnimatedScale() > 0.0f) {
                                ((Rect) this.f895b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                ((Rect) this.f895b).set((int) (rect.centerX() - (j51Var.getAnimatedScale() * (((Rect) this.f895b).width() / 2.0f))), (int) (((Rect) this.f895b).centerY() - (j51Var.getAnimatedScale() * (((Rect) this.f895b).height() / 2.0f))), (int) ((j51Var.getAnimatedScale() * (((Rect) this.f895b).width() / 2.0f)) + ((Rect) this.f895b).centerX()), (int) ((j51Var.getAnimatedScale() * (((Rect) this.f895b).height() / 2.0f)) + ((Rect) this.f895b).centerY()));
                                canvas.save();
                                canvas.clipRect((Rect) this.f895b);
                                canvas.scale(j51Var.getAnimatedScale(), j51Var.getAnimatedScale(), ((Rect) this.f895b).centerX(), ((Rect) this.f895b).centerY());
                                super.drawChild(canvas, view, j10);
                                canvas.restore();
                            }
                        } else if ((childAt instanceof TextView) || (childAt instanceof e51) || (childAt instanceof d51) || (childAt instanceof f51)) {
                            ((Rect) this.f895b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.f895b);
                            super.drawChild(canvas, view, j10);
                            canvas.restore();
                        }
                    }
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            case 28:
                o5 o5Var = (o5) this.f896c;
                if (view == o5Var.f34954r0 && o5Var.E) {
                    int save = canvas.save();
                    canvas.concat(o5Var.H);
                    boolean drawChild4 = super.drawChild(canvas, view, j10);
                    canvas.restoreToCount(save);
                    return drawChild4;
                }
                return super.drawChild(canvas, view, j10);
            case 29:
                Path path3 = (Path) this.f895b;
                rg.l0 l0Var = (rg.l0) this.f896c;
                if (l0Var.h != null && (((z11 = l0Var.f45858f) && view == l0Var.d) || (!z11 && view == l0Var.f45857c))) {
                    if (z11) {
                        f10 = l0Var.e;
                    } else {
                        f10 = 1.0f - l0Var.e;
                    }
                    canvas.save();
                    path3.rewind();
                    path3.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f10 * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                    canvas.clipPath(path3);
                    boolean drawChild5 = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild5;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public boolean fitSystemWindows(Rect rect) {
        switch (this.f894a) {
            case 1:
                t0 t0Var = (t0) this.f896c;
                float f7 = t0Var.f886u;
                float f10 = rect.bottom;
                if (f7 != f10 && t0Var.v) {
                    t0Var.f886u = f10;
                    v vVar = t0Var.f871c;
                    s0 s0Var = t0Var.f869a;
                    if (!t0Var.f882q) {
                        float f11 = t0Var.f885t;
                        int dp = AndroidUtilities.dp(32.0f);
                        int i10 = t0Var.f889y;
                        if (i10 == 1 || i10 == 2) {
                            dp = AndroidUtilities.dp(24.0f);
                        }
                        float f12 = dp;
                        if (s0Var.getMeasuredHeight() + f11 > (vVar.getMeasuredHeight() - t0Var.f886u) - f12) {
                            f11 = ((vVar.getMeasuredHeight() - t0Var.f886u) - s0Var.getMeasuredHeight()) - f12;
                        }
                        if (f11 < 0.0f) {
                            f11 = 0.0f;
                        }
                        s0Var.animate().translationY(f11).setDuration(250L).setUpdateListener(new j0(t0Var, 1)).setInterpolator(zr.f33337f).start();
                    }
                }
                return super.fitSystemWindows(rect);
            default:
                return super.fitSystemWindows(rect);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f894a) {
            case 5:
                super.invalidate();
                ((ng.i) this.f896c).invalidate();
                return;
            case 27:
                super.invalidate();
                org.telegram.ui.ActionBar.p0 p0Var = ((pc1) this.f896c).f40497u0;
                if (p0Var != null) {
                    p0Var.invalidate();
                    return;
                }
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f894a) {
            case 0:
                super.onAttachedToWindow();
                ((u) this.f895b).c();
                return;
            case 1:
                super.onAttachedToWindow();
                oc.a(this, (m0) this.f895b);
                return;
            case 18:
                super.onAttachedToWindow();
                ht htVar = (ht) this.f896c;
                htVar.A.onAttachedToWindow();
                htVar.B.onAttachedToWindow();
                return;
            case 21:
                super.onAttachedToWindow();
                ((ProfileActivity) this.f896c).f34023t5.onAttachedToWindow();
                return;
            case 22:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.f895b).h.onAttachedToWindow();
                return;
            case 25:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f895b).onAttachedToWindow();
                return;
            case 28:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((z4) this.f895b);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.f894a) {
            case 16:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.f896c;
                AndroidUtilities.setPreferredMaxRefreshRate(h1Var.f31599b, h1Var.d, h1Var.f31600c);
                h1Var.i(false);
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f894a) {
            case 0:
                super.onDetachedFromWindow();
                ((u) this.f895b).d();
                return;
            case 1:
                super.onDetachedFromWindow();
                oc.h(this);
                return;
            case 18:
                super.onDetachedFromWindow();
                ht htVar = (ht) this.f896c;
                htVar.A.onDetachedFromWindow();
                htVar.B.onDetachedFromWindow();
                return;
            case 21:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.f896c).f34023t5.onDetachedFromWindow();
                return;
            case 22:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.f895b).h.onDetachedFromWindow();
                return;
            case 25:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f895b).onDetachedFromWindow();
                return;
            case 28:
                getViewTreeObserver().removeOnPreDrawListener((z4) this.f895b);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: ah.v.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        dd ddVar;
        switch (this.f894a) {
            case 21:
                if ((((ProfileActivity) this.f896c).p5 == 0.0f && (ddVar = (dd) this.f895b) != null && ddVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f894a) {
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = (i13 - i11) / 4;
                int i15 = i14 * 3;
                int A = tl.A(275.0f, i15, 2);
                n70 n70Var = (n70) this.f896c;
                FrameLayout frameLayout = n70Var.f39758r;
                int i16 = 0;
                frameLayout.layout(0, A, frameLayout.getMeasuredWidth(), n70Var.f39758r.getMeasuredHeight() + A);
                int dp = AndroidUtilities.dp(139.0f) + AndroidUtilities.dp(150.0f) + A;
                int measuredWidth = (getMeasuredWidth() - n70Var.e.getMeasuredWidth()) / 2;
                qa qaVar = n70Var.e;
                qaVar.layout(measuredWidth, dp, qaVar.getMeasuredWidth() + measuredWidth, n70Var.e.getMeasuredHeight() + dp);
                z4.h hVar = n70Var.d;
                hVar.layout(0, 0, hVar.getMeasuredWidth(), n70Var.d.getMeasuredHeight());
                int measuredHeight = ((i14 - n70Var.f39757n.getMeasuredHeight()) / 2) + i15;
                int measuredWidth2 = (getMeasuredWidth() - n70Var.f39757n.getMeasuredWidth()) / 2;
                di.n nVar = n70Var.f39757n;
                nVar.layout(measuredWidth2, measuredHeight, nVar.getMeasuredWidth() + measuredWidth2, n70Var.f39757n.getMeasuredHeight() + measuredHeight);
                int dp2 = measuredHeight - AndroidUtilities.dp(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - n70Var.f39756f.getMeasuredWidth()) / 2;
                TextView textView = n70Var.f39756f;
                textView.layout(measuredWidth3, dp2 - textView.getMeasuredHeight(), n70Var.f39756f.getMeasuredWidth() + measuredWidth3, dp2);
                FrameLayout frameLayout2 = (FrameLayout) this.f895b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
                int dp3 = AndroidUtilities.dp(4);
                if (!AndroidUtilities.isTablet()) {
                    i16 = AndroidUtilities.statusBarHeight;
                }
                int i17 = dp3 + i16;
                if (marginLayoutParams.topMargin != i17) {
                    marginLayoutParams.topMargin = i17;
                    frameLayout2.requestLayout();
                    return;
                }
                return;
            case 20:
                int dp4 = AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(150.0f) + tl.A(275.0f, ((i13 - i11) / 4) * 3, 2);
                int dp5 = AndroidUtilities.dp(18.0f);
                TextView textView2 = (TextView) this.f895b;
                textView2.layout(dp5, dp4, textView2.getMeasuredWidth() + dp5, textView2.getMeasuredHeight() + dp4);
                int dp6 = AndroidUtilities.dp(18.0f) + dp4 + ((int) textView2.getTextSize());
                int dp7 = AndroidUtilities.dp(16.0f);
                TextView textView3 = (TextView) this.f896c;
                textView3.layout(dp7, dp6, textView3.getMeasuredWidth() + dp7, textView3.getMeasuredHeight() + dp6);
                return;
            case 21:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.f896c).Z4();
                return;
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f896c;
                if (secretMediaViewer.f34115n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f34115n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight;
                    t31 t31Var = secretMediaViewer.f34115n;
                    t31Var.layout(t31Var.getLeft(), currentActionBarHeight, secretMediaViewer.f34115n.getRight(), secretMediaViewer.f34115n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.f34124r != null && secretMediaViewer.f34115n != null) {
                    int measuredHeight2 = (secretMediaViewer.f34115n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f34115n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight)) - AndroidUtilities.dp(10.0f);
                    x3 x3Var = secretMediaViewer.f34124r;
                    x3Var.layout(x3Var.getLeft(), measuredHeight2, secretMediaViewer.f34124r.getRight(), secretMediaViewer.f34124r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.f34088a0 != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                    jt0 jt0Var = secretMediaViewer.f34088a0;
                    jt0Var.layout(jt0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.f34088a0.getRight(), secretMediaViewer.f34088a0.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f34100f;
                if (view != null) {
                    int i18 = i13 - i11;
                    view.layout(0, i18, i12 - i10, AndroidUtilities.navigationBarHeight + i18);
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
        int i12;
        boolean z10;
        int i13;
        float f7;
        boolean z11;
        float f10;
        float f11;
        float f12;
        float f13;
        StaticLayout staticLayout;
        int dp;
        int measuredHeight;
        switch (this.f894a) {
            case 2:
                float f14 = 8.0f;
                int size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(8.0f);
                TextView textView = (TextView) this.f896c;
                CharSequence text = textView.getText();
                if (size > 0 && !TextUtils.isEmpty(text)) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
                    TextPaint textPaint = new TextPaint(textView.getPaint());
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    float measureText = textPaint.measureText(text, 0, text.length());
                    float f15 = size;
                    if (measureText > f15) {
                        textPaint.setTextSize(AndroidUtilities.dp(11.0f));
                        String[] split = text.toString().split("\\s+");
                        int length = split.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 < length) {
                                if (textPaint.measureText(split[i14]) > f15) {
                                    staticLayout = null;
                                    f12 = f15;
                                    f13 = 12.0f;
                                    i12 = 2;
                                    z10 = true;
                                } else {
                                    i14++;
                                }
                            } else {
                                f12 = f15;
                                f13 = 12.0f;
                                i12 = 2;
                                z10 = true;
                                staticLayout = new StaticLayout(text, textPaint, size, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            }
                        }
                        if (staticLayout != null && staticLayout.getLineCount() <= i12) {
                            i13 = i12;
                            f7 = 11.0f;
                        } else {
                            f7 = Math.max(8.0f, (f12 * f13) / measureText);
                            i13 = z10 ? 1 : 0;
                        }
                    } else {
                        i12 = 2;
                        z10 = true;
                        i13 = 1;
                        f7 = 12.0f;
                    }
                    textView.setTextSize(z10 ? 1 : 0, f7);
                    textView.setMaxLines(i13);
                    if (i13 == z10) {
                        z11 = z10 ? 1 : 0;
                    } else {
                        z11 = false;
                    }
                    textView.setSingleLine(z11);
                    if (i13 == i12) {
                        f10 = 0.85f;
                    } else {
                        f10 = 1.0f;
                    }
                    textView.setLineSpacing(0.0f, f10);
                    if (i13 == i12) {
                        z10 = false;
                    }
                    textView.setIncludeFontPadding(z10);
                    if (i13 == i12) {
                        f11 = 29.0f;
                    } else {
                        f11 = 35.0f;
                    }
                    layoutParams.topMargin = AndroidUtilities.dp(f11);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((ImageView) this.f895b).getLayoutParams();
                    if (i13 == i12) {
                        f14 = 4.0f;
                    }
                    layoutParams2.topMargin = AndroidUtilities.dp(f14);
                }
                super.onMeasure(i10, i11);
                return;
            case 4:
                ViewGroup viewGroup = (ViewGroup) this.f895b;
                hg.e eVar = (hg.e) this.f896c;
                if (eVar.K && eVar.J) {
                    super.onMeasure(i10, i11);
                    return;
                }
                int size2 = View.MeasureSpec.getSize(i11);
                if (size2 == 0) {
                    size2 = viewGroup.getMeasuredHeight();
                }
                if (size2 == 0) {
                    size2 = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                }
                int dp2 = AndroidUtilities.dp(50.0f);
                int i15 = 0;
                if (eVar.v != 0) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(30.0f) + dp2;
                }
                if (!eVar.E && !eVar.f11866w) {
                    dp += dp2;
                }
                int paddingTop = (size2 - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
                if (dp < paddingTop) {
                    i15 = paddingTop - dp;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
                return;
            case 7:
                super.onMeasure(i10, i11);
                super.onMeasure(i10, tl.C(8.0f, ((LinearLayout) this.f895b).getMeasuredHeight(), 1073741824));
                return;
            case 12:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                return;
            case 22:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f896c;
                jt0 jt0Var = secretMediaViewer.f34088a0;
                if (jt0Var != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                    int currentActionBarHeight = (measuredHeight2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                    if (secretMediaViewer.U.getVisibility() != 0) {
                        measuredHeight = 0;
                    } else {
                        measuredHeight = secretMediaViewer.U.getMeasuredHeight();
                    }
                    jt0Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(currentActionBarHeight - measuredHeight, 1073741824));
                }
                View view = secretMediaViewer.f34100f;
                if (view != null) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.navigationBarHeight, 1073741824));
                    return;
                }
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f894a) {
            case 6:
                super.onSizeChanged(i10, i11, i12, i13);
                zf.y yVar = (zf.y) this.f896c;
                yVar.setBounds(0, 0, i10, i11);
                yVar.c(0, AndroidUtilities.dp(24.0f) + getPaddingBottom());
                return;
            case 14:
                ne0 ne0Var = (ne0) this.f896c;
                gh.b bVar = ne0Var.H;
                super.onSizeChanged(i10, i11, i12, i13);
                if (i10 > 0 && i11 > 0) {
                    ne0Var.J = Bitmap.createBitmap(54, Math.max(1, Math.round((i11 * 54) / i10)), Bitmap.Config.ARGB_8888);
                    ne0Var.K = new Canvas(ne0Var.J);
                    bVar.a(ne0Var.J);
                    bVar.c(i10, i11);
                    return;
                }
                return;
            case 16:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.f895b;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i10, i11);
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: ah.v.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setBackgroundColor(int i10) {
        switch (this.f894a) {
            case 14:
                ((Paint) this.f895b).setColor(i10);
                return;
            default:
                super.setBackgroundColor(i10);
                return;
        }
    }

    @Override
    public void setTranslationX(float f7) {
        switch (this.f894a) {
            case 5:
                super.setTranslationX(f7);
                ((ng.i) this.f896c).invalidate();
                return;
            default:
                super.setTranslationX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f894a) {
            case 5:
                super.setTranslationY(f7);
                ((ng.i) this.f896c).invalidate();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    public v(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f894a = i10;
        this.f896c = obj;
        this.f895b = obj2;
    }

    public v(Context context, g6 g6Var) {
        super(context);
        this.f894a = 6;
        this.f896c = new zf.y(8);
        this.f895b = g6Var;
    }

    public v(org.telegram.ui.Cells.y0 y0Var, Context context) {
        super(context);
        this.f894a = 9;
        this.f896c = y0Var;
        this.f895b = new RectF();
    }

    public v(t0 t0Var, Context context) {
        super(context);
        this.f894a = 1;
        this.f896c = t0Var;
        this.f895b = new m0(this, 0);
    }

    public v(a41 a41Var, Context context) {
        super(context);
        this.f894a = 23;
        this.f896c = a41Var;
        this.f895b = new Path();
    }

    public v(ac acVar, Context context) {
        super(context);
        this.f894a = 10;
        this.f896c = acVar;
        this.f895b = new Paint(1);
    }

    public v(s5 s5Var, Activity activity) {
        super(activity);
        this.f894a = 8;
        this.f896c = s5Var;
        this.f895b = new Paint(1);
    }

    public v(a0 a0Var, Context context) {
        super(context);
        this.f894a = 0;
        this.f896c = a0Var;
        this.f895b = new u(this, this);
    }

    public v(org.telegram.ui.Components.voip.h1 h1Var, Context context) {
        super(context);
        this.f894a = 16;
        this.f896c = h1Var;
        this.f895b = new Path();
    }

    public v(ne0 ne0Var, Context context) {
        super(context);
        this.f894a = 14;
        this.f896c = ne0Var;
        this.f895b = new Paint();
    }

    public v(o5 o5Var, Context context) {
        super(context);
        this.f894a = 28;
        this.f896c = o5Var;
        this.f895b = new z4(0, this);
    }

    public v(Context context, TextView textView, TextView textView2) {
        super(context);
        this.f894a = 20;
        this.f895b = textView;
        this.f896c = textView2;
    }

    public v(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f894a = 22;
        this.f896c = secretMediaViewer;
        this.f895b = secretMediaViewer;
        setWillNotDraw(false);
    }

    private final void a(boolean z10) {
    }

    public v(a61 a61Var, Context context) {
        super(context);
        this.f894a = 24;
        this.f896c = a61Var;
        this.f895b = new Rect();
    }

    public v(up upVar, Context context) {
        super(context);
        this.f894a = 12;
        this.f896c = upVar;
        this.f895b = new Paint();
    }

    public v(ht htVar, Activity activity) {
        super(activity);
        this.f894a = 18;
        this.f896c = htVar;
        this.f895b = htVar;
        setWillNotDraw(false);
    }

    public v(pc1 pc1Var, Context context, int i10) {
        super(context);
        this.f894a = i10;
        switch (i10) {
            case 27:
                this.f896c = pc1Var;
                super(context);
                this.f895b = new int[2];
                return;
            default:
                this.f896c = pc1Var;
                this.f895b = new Paint();
                return;
        }
    }

    public v(Context context, int i10) {
        super(context);
        this.f894a = i10;
        switch (i10) {
            case 11:
                super(context);
                this.f895b = new Path();
                this.f896c = new w10();
                return;
            case 25:
                super(context);
                return;
            default:
                ImageView imageView = new ImageView(context);
                this.f895b = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                addView(imageView, z5.d(24, 24.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                this.f896c = textView;
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                textView.setGravity(17);
                addView(textView, z5.d(-1, -2.0f, 49, 4.0f, 35.0f, 4.0f, 0.0f));
                return;
        }
    }

    public v(rg.l0 l0Var, Context context) {
        super(context);
        this.f894a = 29;
        this.f896c = l0Var;
        this.f895b = new Path();
    }

    public v(fl0 fl0Var, Context context) {
        super(context);
        this.f894a = 15;
        this.f896c = fl0Var;
        this.f895b = new Paint(1);
    }

    public v(c6 c6Var, Context context) {
        super(context);
        this.f894a = 3;
        this.f896c = c6Var;
        this.f895b = new Path();
    }
}
