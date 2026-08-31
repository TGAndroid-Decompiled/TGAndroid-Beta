package ag;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
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
import eg.a1;
import f2.j0;
import f2.w;
import fg.n1;
import fg.p1;
import fg.s0;
import k7.c6;
import lf.b0;
import lh.t0;
import ng.c0;
import ng.d0;
import ng.g0;
import ng.s;
import ng.y;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.l5;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.y0;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.jd0;
import org.telegram.ui.Components.ka;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.voip.h1;
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.xd0;
import org.telegram.ui.Components.yy;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.a61;
import org.telegram.ui.ed1;
import org.telegram.ui.h20;
import org.telegram.ui.it0;
import org.telegram.ui.k41;
import org.telegram.ui.l4;
import org.telegram.ui.n21;
import org.telegram.ui.o21;
import org.telegram.ui.qt;
import org.telegram.ui.r41;
import org.telegram.ui.r5;
import org.telegram.ui.r61;
import org.telegram.ui.u51;
import org.telegram.ui.v51;
import org.telegram.ui.v70;
import org.telegram.ui.w51;
import org.telegram.ui.xy0;
import org.telegram.ui.yb;
import qh.f3;
public final class l extends FrameLayout {
    public final int f211a;
    public Object f212b;
    public Object f213c;

    public l(Context context, int i10) {
        super(context);
        this.f211a = i10;
    }

    public void b(int i10, CharSequence charSequence, boolean z4) {
        ImageView imageView = (ImageView) this.f212b;
        if (z4) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
        ((TextView) this.f213c).setText(charSequence);
    }

    public void c(String str, boolean z4) {
        boolean z10;
        j6 j6Var = (j6) this.f213c;
        if (z4 && !LocaleController.isRTL) {
            z10 = true;
        } else {
            z10 = false;
        }
        j6Var.q(str, z10, true);
    }

    public void d(String str, boolean z4) {
        boolean z10;
        j6 j6Var = (j6) this.f212b;
        if (z4 && !LocaleController.isRTL) {
            z10 = true;
        } else {
            z10 = false;
        }
        j6Var.q(str, z10, true);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        g6 g6Var;
        Paint paint;
        boolean a12;
        int k10;
        l5[] l5VarArr;
        char c3;
        float f10;
        ?? r10;
        float f11;
        float f12;
        z zVar;
        float f13;
        switch (this.f211a) {
            case 1:
                b0 b0Var = (b0) this.f213c;
                b0Var.b(k6.l1(0.65f, k6.v0(k6.f21659d6, (g6) this.f212b)));
                b0Var.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 3:
                ((p1) this.f212b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, AndroidUtilities.dp(2.0f), getMeasuredWidth(), AndroidUtilities.dp(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                p1 p1Var = (p1) this.f212b;
                p1Var.f6490f.setAlpha(((n1) this.f213c).H);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(24.0f) - 1, AndroidUtilities.dp(24.0f) - 1, p1Var.f6490f);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            case 9:
                super.dispatchDraw(canvas);
                Paint paint2 = (Paint) this.f212b;
                int i10 = k6.f21605a7;
                g6Var = ((p2) ((r5) this.f213c).d).resourceProvider;
                paint2.setColor(k6.v0(i10, g6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint2);
                return;
            case 10:
                RectF rectF2 = (RectF) this.f212b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                y0 y0Var = (y0) this.f213c;
                int measuredWidth = y0Var.getMeasuredWidth();
                int i11 = y0Var.d;
                float x10 = y0Var.getX();
                float f14 = y0Var.f24430c;
                g6 g6Var2 = y0Var.f24429b;
                if (g6Var2 != null) {
                    g6Var2.l(x10, f14, measuredWidth, i11);
                } else {
                    k6.q(x10, f14, measuredWidth, i11);
                }
                float dp = AndroidUtilities.dp(18.0f);
                float dp2 = AndroidUtilities.dp(18.0f);
                Paint paint3 = null;
                if (g6Var2 != null) {
                    paint = g6Var2.F("paintChatActionBackground");
                } else {
                    paint = null;
                }
                if (paint == null) {
                    paint = k6.S0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF2, dp, dp2, paint);
                if (g6Var2 != null) {
                    a12 = g6Var2.o0();
                } else {
                    a12 = k6.a1();
                }
                if (a12) {
                    float dp3 = AndroidUtilities.dp(18.0f);
                    float dp4 = AndroidUtilities.dp(18.0f);
                    if (g6Var2 != null) {
                        paint3 = g6Var2.F("paintChatActionBackgroundDarken");
                    }
                    if (paint3 == null) {
                        paint3 = k6.S0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF2, dp3, dp4, paint3);
                }
                super.dispatchDraw(canvas);
                return;
            case 11:
                super.dispatchDraw(canvas);
                Paint paint4 = (Paint) this.f212b;
                paint4.setColor(k6.v0(k6.f21605a7, ((yb) this.f213c).f43597f.f35121e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint4);
                return;
            case 12:
                float dp5 = AndroidUtilities.dp(20.0f);
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.f212b;
                path.rewind();
                path.addRoundRect(rectF3, dp5, dp5, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF3, 255, 31);
                super.dispatchDraw(canvas);
                rectF3.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), AndroidUtilities.dp(6.0f) + getPaddingTop());
                h20 h20Var = (h20) this.f213c;
                h20Var.b(canvas, rectF3, 1, 1.0f);
                rectF3.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                h20Var.b(canvas, rectF3, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                return;
            case 13:
                super.dispatchDraw(canvas);
                Paint paint5 = (Paint) this.f212b;
                paint5.setColor(((mp) this.f213c).getThemedColor(k6.f21660d7));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint5);
                return;
            case 14:
                yy yyVar = (yy) this.f213c;
                if (!yyVar.D.f29318r0 && yyVar.f33648w > 0.0f) {
                    if (((Paint) this.f212b) == null) {
                        Paint paint6 = new Paint();
                        this.f212b = paint6;
                        paint6.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f212b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f212b).setAlpha((int) (yyVar.f33648w * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f212b);
                    canvas.restore();
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 15:
                j6 j6Var = (j6) this.f212b;
                int dp6 = AndroidUtilities.dp(29.0f);
                int dp7 = AndroidUtilities.dp(18.83f);
                j6 j6Var2 = (j6) this.f213c;
                j6Var.setBounds(getPaddingLeft(), r3 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r3);
                j6Var.draw(canvas);
                j6Var2.setBounds(getPaddingLeft(), r2 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r2);
                j6Var2.draw(canvas);
                return;
            case 17:
                Paint paint7 = (Paint) this.f212b;
                rk0 rk0Var = (rk0) this.f213c;
                int i12 = rk0Var.J0;
                if (i12 != 1 && i12 != 2 && i12 != 4) {
                    k10 = i0.a.d(0.7f, k6.v0(k6.F8, rk0Var.f30771h0), k6.v0(k6.f21731h5, rk0Var.f30771h0));
                } else {
                    k10 = i0.a.k(-1, 30);
                }
                paint7.setColor(k10);
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - AndroidUtilities.dpf2(6.0f)) / 2.0f;
                float g10 = rk0Var.g();
                RectF rectF4 = AndroidUtilities.rectTmp;
                rectF4.set(measuredWidth2 - measuredWidth3, (measuredHeight - measuredWidth3) - g10, measuredWidth2 + measuredWidth3, measuredHeight + measuredWidth3 + g10);
                canvas.save();
                canvas.scale(childAt.getScaleX(), childAt.getScaleY(), measuredWidth2, measuredHeight);
                canvas.drawRoundRect(rectF4, measuredWidth3, measuredWidth3, paint7);
                canvas.restore();
                canvas.save();
                canvas.translate(0.0f, g10);
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            case 23:
                super.dispatchDraw(canvas);
                ProfileActivity profileActivity = (ProfileActivity) this.f213c;
                l5[] l5VarArr2 = profileActivity.f34680r;
                if (profileActivity.T4 != null) {
                    canvas.save();
                    canvas.translate(l5VarArr2[0].getX(), l5VarArr2[0].getY());
                    l5VarArr = l5VarArr2;
                    c3 = 2;
                    f10 = 0.0f;
                    r10 = 0;
                    f11 = 24.0f;
                    f12 = 14.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.T4.getMeasuredWidth(), profileActivity.T4.getMeasuredHeight(), (int) ((1.0f - profileActivity.P1) * 255.0f), 31);
                    profileActivity.T4.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    l5VarArr = l5VarArr2;
                    c3 = 2;
                    f10 = 0.0f;
                    r10 = 0;
                    f11 = 24.0f;
                    f12 = 14.0f;
                }
                if (profileActivity.f34649m5 && profileActivity.V5 != f10 && profileActivity.f34637k5 != 1.0f) {
                    float measuredHeight2 = (l5VarArr[1].getMeasuredHeight() / 2.0f) + l5VarArr[1].getY();
                    float dp8 = AndroidUtilities.dp(22.0f);
                    float x11 = ((l5VarArr[1].getX() + (AndroidUtilities.dp(28.0f) - profileActivity.f34643l5)) - dp8) - profileActivity.Z3();
                    profileActivity.f34664o5.setImageCoords(x11, measuredHeight2 - (dp8 / 2.0f), dp8, dp8);
                    profileActivity.f34664o5.setAlpha(profileActivity.V5);
                    canvas.save();
                    float f15 = profileActivity.V5;
                    canvas.scale(f15, f15, profileActivity.f34664o5.getCenterX(), profileActivity.f34664o5.getCenterY());
                    profileActivity.f34664o5.draw(canvas);
                    canvas.restore();
                    if (profileActivity.f34637k5 == f10) {
                        if (((xc) this.f212b) == null) {
                            xc xcVar = new xc(this);
                            this.f212b = xcVar;
                            xcVar.h = new xy0(this, r10);
                        }
                        float dp9 = (1.0f - profileActivity.f34637k5) * AndroidUtilities.dp(28.0f);
                        float textWidth = l5VarArr[c3].getTextWidth();
                        if (profileActivity.Q != null) {
                            f13 = (AndroidUtilities.dp(f11) + textWidth + AndroidUtilities.dp(4.0f)) * profileActivity.Q.getVisibilityFactor();
                        } else {
                            f13 = 0.0f;
                        }
                        RectF rectF5 = AndroidUtilities.rectTmp;
                        rectF5.set(x11 - AndroidUtilities.dp(4.0f), measuredHeight2 - AndroidUtilities.dp(f12), x11 + Math.max(textWidth, f13) + dp9 + AndroidUtilities.dp(4.0f), measuredHeight2 + AndroidUtilities.dp(f12));
                        xc xcVar2 = (xc) this.f212b;
                        xcVar2.f33029i = r10;
                        xcVar2.f33025c = r10;
                        xcVar2.a(rectF5);
                        xc xcVar3 = (xc) this.f212b;
                        xcVar3.f33034n = true;
                        int k11 = i0.a.k(-1, 50);
                        xcVar3.f33028g.setColor((int) r10);
                        z zVar2 = xcVar3.f33026e;
                        if (zVar2 != null) {
                            k6.B1(zVar2, k11, true);
                        }
                        xc xcVar4 = (xc) this.f212b;
                        xcVar4.c(canvas, xcVar4.f33028g);
                        z zVar3 = xcVar4.f33026e;
                        if (zVar3 != null) {
                            zVar3.draw(canvas);
                            return;
                        }
                        return;
                    }
                    xc xcVar5 = (xc) this.f212b;
                    if (xcVar5 != null && (zVar = xcVar5.f33026e) != null) {
                        zVar.setState(StateSet.NOTHING);
                        zVar.jumpToCurrentState();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                Rect rect = (Rect) this.f212b;
                n21 n21Var = (n21) this.f213c;
                if (n21Var.O) {
                    n21Var.f39273f.setBounds(-rect.left, -rect.top, getWidth() + rect.right, getHeight() + rect.bottom);
                    n21Var.f39273f.draw(canvas);
                } else {
                    RectF rectF6 = AndroidUtilities.rectTmp;
                    rectF6.set(0.0f, 0.0f, AndroidUtilities.dp(14.0f) + getWidth(), getHeight());
                    canvas.drawRoundRect(rectF6, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), n21Var.f39269a);
                }
                super.dispatchDraw(canvas);
                return;
            case 28:
                ImageReceiver imageReceiver = (ImageReceiver) this.f212b;
                imageReceiver.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                imageReceiver.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.f211a) {
            case 7:
                if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
                    d0 d0Var = (d0) this.f213c;
                    if (!d0Var.f16041k) {
                        return true;
                    }
                    d0Var.d();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public void dispatchSetPressed(boolean z4) {
        switch (this.f211a) {
            case 7:
                return;
            default:
                super.dispatchSetPressed(z4);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        int dp;
        switch (this.f211a) {
            case 1:
                super.dispatchTouchEvent(motionEvent);
                return true;
            case 8:
                l4 l4Var = (l4) this.f213c;
                y9 o10 = l4Var.M0.o(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.f212b;
                obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (l4Var.M0.y() && l4Var.M0.o(getContext()).onTouchEvent(obtain)) {
                    return true;
                }
                if (o10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() == 0 && l4Var.M0.y() && (motionEvent.getY() < linearLayout.getTop() || motionEvent.getY() > linearLayout.getBottom())) {
                    if (!l4Var.M0.o(getContext()).onTouchEvent(obtain)) {
                        return true;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            case 18:
                int action = motionEvent.getAction();
                h1 h1Var = (h1) this.f213c;
                if (h1Var.G != null) {
                    MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                    obtain2.offsetLocation(h1Var.G.getX(), h1Var.G.getY());
                    boolean dispatchTouchEvent = h1Var.G.dispatchTouchEvent(motionEvent);
                    obtain2.recycle();
                    if (action == 1 || action == 3) {
                        h1Var.G = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                obtain3.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = h1Var.C.onTouchEvent(obtain3);
                obtain3.recycle();
                if (!h1Var.C.isInProgress() && ((GestureDetector) h1Var.D.f22788b).onTouchEvent(motionEvent)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (action == 1 || action == 3) {
                    h1Var.E = false;
                    h1Var.F = false;
                    o1.j jVar = h1Var.P;
                    if (!jVar.f16330f) {
                        float f10 = h1Var.N;
                        jVar.f16327b = f10;
                        jVar.f16328c = true;
                        o1.k kVar = jVar.f16336u;
                        int i10 = h1Var.J;
                        float f11 = (i10 / 2.0f) + f10;
                        int i11 = AndroidUtilities.displaySize.x;
                        if (f11 >= i11 / 2.0f) {
                            dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        kVar.f16343i = dp;
                        h1Var.P.f();
                    }
                    o1.j jVar2 = h1Var.Q;
                    if (!jVar2.f16330f) {
                        float f12 = h1Var.O;
                        jVar2.f16327b = f12;
                        jVar2.f16328c = true;
                        jVar2.f16336u.f16343i = k7.o.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - h1Var.K) - AndroidUtilities.dp(16.0f));
                        h1Var.Q.f();
                    }
                }
                if (onTouchEvent || z4) {
                    return true;
                }
                return false;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z4;
        float f10;
        switch (this.f211a) {
            case 2:
                Path path = (Path) this.f212b;
                a1 a1Var = (a1) this.f213c;
                if (a1Var.h != null && (((z4 = a1Var.f5061f) && view == a1Var.d) || (!z4 && view == a1Var.f5059c))) {
                    if (z4) {
                        f10 = a1Var.f5060e;
                    } else {
                        f10 = 1.0f - a1Var.f5060e;
                    }
                    canvas.save();
                    path.rewind();
                    path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f10 * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                    canvas.clipPath(path);
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j10);
            case 20:
                if (view instanceof jd0) {
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            case 25:
                if (view != ((SecretMediaViewer) this.f212b).f34807w && super.drawChild(canvas, view, j10)) {
                    return true;
                }
                return false;
            case 26:
                Path path2 = (Path) this.f212b;
                r41 r41Var = (r41) this.f213c;
                RectF rectF = r41Var.O;
                if (view != r41Var.K && view != r41Var.f40776x) {
                    if (view == r41Var.M) {
                        canvas.save();
                        path2.rewind();
                        path2.addCircle(rectF.centerX() + r41Var.K.getX(), rectF.centerY() + r41Var.K.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                        canvas.clipPath(path2);
                        canvas.clipRect(0.0f, AndroidUtilities.lerp(r41Var.Q, 0.0f, r41Var.f40774s), getWidth(), AndroidUtilities.lerp(r41Var.R, getHeight(), r41Var.f40774s));
                        canvas.translate(-r41Var.M.getX(), -r41Var.M.getY());
                        canvas.translate(r41Var.K.getX() + rectF.left, r41Var.K.getY() + rectF.top);
                        canvas.scale(rectF.width() / r41Var.M.getMeasuredWidth(), rectF.height() / r41Var.M.getMeasuredHeight(), r41Var.M.getX(), r41Var.M.getY());
                        boolean drawChild2 = super.drawChild(canvas, view, j10);
                        canvas.restore();
                        return drawChild2;
                    }
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(r41Var.Q, 0.0f, r41Var.f40774s), getWidth(), AndroidUtilities.lerp(r41Var.R, getHeight(), r41Var.f40774s));
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild3;
            case 27:
                if (view == ((r61) this.f213c).f40791e0 && g0.f16068b && g0.f16071f) {
                    for (int i10 = 0; i10 < ((r61) this.f213c).f40791e0.getChildCount(); i10++) {
                        View childAt = ((r61) this.f213c).f40791e0.getChildAt(i10);
                        if (childAt instanceof a61) {
                            a61 a61Var = (a61) childAt;
                            if (a61Var.getAnimatedScale() == 1.0f) {
                                ((Rect) this.f212b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                canvas.save();
                                canvas.clipRect((Rect) this.f212b);
                                super.drawChild(canvas, view, j10);
                                canvas.restore();
                            } else if (a61Var.getAnimatedScale() > 0.0f) {
                                ((Rect) this.f212b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                Rect rect = (Rect) this.f212b;
                                rect.set((int) (rect.centerX() - (a61Var.getAnimatedScale() * (((Rect) this.f212b).width() / 2.0f))), (int) (((Rect) this.f212b).centerY() - (a61Var.getAnimatedScale() * (((Rect) this.f212b).height() / 2.0f))), (int) ((a61Var.getAnimatedScale() * (((Rect) this.f212b).width() / 2.0f)) + ((Rect) this.f212b).centerX()), (int) ((a61Var.getAnimatedScale() * (((Rect) this.f212b).height() / 2.0f)) + ((Rect) this.f212b).centerY()));
                                canvas.save();
                                canvas.clipRect((Rect) this.f212b);
                                canvas.scale(a61Var.getAnimatedScale(), a61Var.getAnimatedScale(), ((Rect) this.f212b).centerX(), ((Rect) this.f212b).centerY());
                                super.drawChild(canvas, view, j10);
                                canvas.restore();
                            }
                        } else if ((childAt instanceof TextView) || (childAt instanceof v51) || (childAt instanceof u51) || (childAt instanceof w51)) {
                            ((Rect) this.f212b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.f212b);
                            super.drawChild(canvas, view, j10);
                            canvas.restore();
                        }
                    }
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public boolean fitSystemWindows(Rect rect) {
        switch (this.f211a) {
            case 7:
                d0 d0Var = (d0) this.f213c;
                float f10 = d0Var.f16051u;
                float f11 = rect.bottom;
                if (f10 != f11 && d0Var.v) {
                    d0Var.f16051u = f11;
                    l lVar = d0Var.f16035c;
                    c0 c0Var = d0Var.f16033a;
                    if (!d0Var.f16047q) {
                        float f12 = d0Var.f16050t;
                        int dp = AndroidUtilities.dp(32.0f);
                        int i10 = d0Var.f16054y;
                        if (i10 == 1 || i10 == 2) {
                            dp = AndroidUtilities.dp(24.0f);
                        }
                        float f13 = dp;
                        if (c0Var.getMeasuredHeight() + f12 > (lVar.getMeasuredHeight() - d0Var.f16051u) - f13) {
                            f12 = ((lVar.getMeasuredHeight() - d0Var.f16051u) - c0Var.getMeasuredHeight()) - f13;
                        }
                        if (f12 < 0.0f) {
                            f12 = 0.0f;
                        }
                        c0Var.animate().translationY(f12).setDuration(250L).setUpdateListener(new y(d0Var, 1)).setInterpolator(pr.f30183f).start();
                    }
                }
                return super.fitSystemWindows(rect);
            default:
                return super.fitSystemWindows(rect);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f211a) {
            case 0:
                super.invalidate();
                ((o) this.f213c).invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f211a) {
            case 6:
                super.onAttachedToWindow();
                ((ng.o) this.f212b).c();
                return;
            case 7:
                super.onAttachedToWindow();
                ic.a(this, (t0) this.f212b);
                return;
            case 20:
                super.onAttachedToWindow();
                qt qtVar = (qt) this.f213c;
                qtVar.A.onAttachedToWindow();
                qtVar.B.onAttachedToWindow();
                return;
            case 23:
                super.onAttachedToWindow();
                ((ProfileActivity) this.f213c).f34664o5.onAttachedToWindow();
                return;
            case 25:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.f212b).h.onAttachedToWindow();
                return;
            case 28:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f212b).onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.f211a) {
            case 18:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                h1 h1Var = (h1) this.f213c;
                AndroidUtilities.setPreferredMaxRefreshRate(h1Var.f32068b, h1Var.d, h1Var.f32069c);
                h1Var.i(false);
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f211a) {
            case 6:
                super.onDetachedFromWindow();
                ((ng.o) this.f212b).d();
                return;
            case 7:
                super.onDetachedFromWindow();
                ic.h(this);
                return;
            case 20:
                super.onDetachedFromWindow();
                qt qtVar = (qt) this.f213c;
                qtVar.A.onDetachedFromWindow();
                qtVar.B.onDetachedFromWindow();
                return;
            case 23:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.f213c).f34664o5.onDetachedFromWindow();
                return;
            case 25:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.f212b).h.onDetachedFromWindow();
                return;
            case 28:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f212b).onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: ag.l.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        xc xcVar;
        switch (this.f211a) {
            case 23:
                if ((((ProfileActivity) this.f213c).f34637k5 == 0.0f && (xcVar = (xc) this.f212b) != null && xcVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f211a) {
            case 21:
                super.onLayout(z4, i10, i11, i12, i13);
                int i14 = (i13 - i11) / 4;
                int i15 = i14 * 3;
                int x10 = org.telegram.ui.b.x(275.0f, i15, 2);
                v70 v70Var = (v70) this.f213c;
                FrameLayout frameLayout = v70Var.f42145r;
                int i16 = 0;
                frameLayout.layout(0, x10, frameLayout.getMeasuredWidth(), v70Var.f42145r.getMeasuredHeight() + x10);
                int dp = AndroidUtilities.dp(139.0f) + AndroidUtilities.dp(150.0f) + x10;
                int measuredWidth = (getMeasuredWidth() - v70Var.f42142e.getMeasuredWidth()) / 2;
                ka kaVar = v70Var.f42142e;
                kaVar.layout(measuredWidth, dp, kaVar.getMeasuredWidth() + measuredWidth, v70Var.f42142e.getMeasuredHeight() + dp);
                m2.h hVar = v70Var.d;
                hVar.layout(0, 0, hVar.getMeasuredWidth(), v70Var.d.getMeasuredHeight());
                int measuredHeight = ((i14 - v70Var.f42144n.getMeasuredHeight()) / 2) + i15;
                int measuredWidth2 = (getMeasuredWidth() - v70Var.f42144n.getMeasuredWidth()) / 2;
                s0 s0Var = v70Var.f42144n;
                s0Var.layout(measuredWidth2, measuredHeight, s0Var.getMeasuredWidth() + measuredWidth2, v70Var.f42144n.getMeasuredHeight() + measuredHeight);
                int dp2 = measuredHeight - AndroidUtilities.dp(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - v70Var.f42143f.getMeasuredWidth()) / 2;
                TextView textView = v70Var.f42143f;
                textView.layout(measuredWidth3, dp2 - textView.getMeasuredHeight(), v70Var.f42143f.getMeasuredWidth() + measuredWidth3, dp2);
                FrameLayout frameLayout2 = (FrameLayout) this.f212b;
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
            case 22:
                int dp4 = AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(150.0f) + org.telegram.ui.b.x(275.0f, ((i13 - i11) / 4) * 3, 2);
                int dp5 = AndroidUtilities.dp(18.0f);
                TextView textView2 = (TextView) this.f212b;
                textView2.layout(dp5, dp4, textView2.getMeasuredWidth() + dp5, textView2.getMeasuredHeight() + dp4);
                int dp6 = AndroidUtilities.dp(18.0f) + dp4 + ((int) textView2.getTextSize());
                int dp7 = AndroidUtilities.dp(16.0f);
                TextView textView3 = (TextView) this.f213c;
                textView3.layout(dp7, dp6, textView3.getMeasuredWidth() + dp7, textView3.getMeasuredHeight() + dp6);
                return;
            case 23:
                super.onLayout(z4, i10, i11, i12, i13);
                ((ProfileActivity) this.f213c).V4();
                return;
            case 24:
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
            case 25:
                super.onLayout(z4, i10, i11, i12, i13);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f213c;
                if (secretMediaViewer.f34788n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f34788n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight;
                    k41 k41Var = secretMediaViewer.f34788n;
                    k41Var.layout(k41Var.getLeft(), currentActionBarHeight, secretMediaViewer.f34788n.getRight(), secretMediaViewer.f34788n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.f34797r != null && secretMediaViewer.f34788n != null) {
                    int measuredHeight2 = (secretMediaViewer.f34788n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f34788n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight)) - AndroidUtilities.dp(10.0f);
                    f3 f3Var = secretMediaViewer.f34797r;
                    f3Var.layout(f3Var.getLeft(), measuredHeight2, secretMediaViewer.f34797r.getRight(), secretMediaViewer.f34797r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.X != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                    it0 it0Var = secretMediaViewer.X;
                    it0Var.layout(it0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.X.getRight(), secretMediaViewer.X.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f34773f;
                if (view != null) {
                    int i18 = i13 - i11;
                    view.layout(0, i18, i12 - i10, AndroidUtilities.navigationBarHeight + i18);
                    return;
                }
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        j0 wVar;
        int measuredHeight;
        switch (this.f211a) {
            case 3:
                super.onMeasure(i10, org.telegram.ui.b.B(2.0f, ((n1) this.f213c).f6417s, 1073741824));
                return;
            case 8:
                super.onMeasure(i10, i11);
                super.onMeasure(i10, org.telegram.ui.b.B(8.0f, ((LinearLayout) this.f212b).getMeasuredHeight(), 1073741824));
                return;
            case 13:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                return;
            case 15:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
                setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                return;
            case 24:
                n21 n21Var = (n21) this.f213c;
                View view = n21Var.E;
                View view2 = n21Var.F;
                LinearLayout linearLayout = n21Var.v;
                TextView textView = n21Var.f39276s;
                tl0 tl0Var = n21Var.f39279y;
                boolean z4 = n21Var.P.M;
                int dp = AndroidUtilities.dp(12.0f);
                if (z4) {
                    tl0Var.setLayoutParams(c6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
                    tl0Var.setPadding(dp, 0, dp, 0);
                    if (linearLayout != null) {
                        textView.setLayoutParams(c6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(c6.d(-1, 48.0f, 8388691, 16.0f, 162.0f, 16.0f, 16.0f));
                    } else {
                        textView.setLayoutParams(c6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
                    }
                } else {
                    tl0Var.setPadding(dp, dp / 2, dp, dp);
                    if (linearLayout != null) {
                        tl0Var.setLayoutParams(c6.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 136.0f));
                        textView.setLayoutParams(c6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(c6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                    } else {
                        tl0Var.setLayoutParams(c6.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 80.0f));
                        textView.setLayoutParams(c6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                    }
                }
                if (z4) {
                    view2.setVisibility(8);
                    view.setVisibility(8);
                } else {
                    if (textView != null) {
                        i12 = 136;
                    } else {
                        i12 = 80;
                    }
                    view2.setVisibility(0);
                    view2.setLayoutParams(c6.d(-1, AndroidUtilities.dp(2.0f), 80, 0.0f, 0.0f, 0.0f, i12));
                    view.setVisibility(0);
                    view.setLayoutParams(c6.d(-1, AndroidUtilities.dp(2.0f), 48, 0.0f, 44.0f, 0.0f, 0.0f));
                }
                if (n21Var.O != z4) {
                    o21 o21Var = n21Var.d;
                    if (z4) {
                        o21Var.getParentActivity();
                        wVar = new j0(0, false);
                    } else {
                        o21Var.getParentActivity();
                        wVar = new w(3, false);
                    }
                    n21Var.D = wVar;
                    tl0Var.setLayoutManager(wVar);
                    tl0Var.requestLayout();
                    int i13 = n21Var.I;
                    if (i13 != -1) {
                        n21Var.b(i13);
                    }
                    n21Var.O = z4;
                }
                super.onMeasure(i10, i11);
                return;
            case 25:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f213c;
                it0 it0Var = secretMediaViewer.X;
                if (it0Var != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                    int currentActionBarHeight = (measuredHeight2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                    if (secretMediaViewer.R.getVisibility() != 0) {
                        measuredHeight = 0;
                    } else {
                        measuredHeight = secretMediaViewer.R.getMeasuredHeight();
                    }
                    it0Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(currentActionBarHeight - measuredHeight, 1073741824));
                }
                View view3 = secretMediaViewer.f34773f;
                if (view3 != null) {
                    view3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.navigationBarHeight, 1073741824));
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
        switch (this.f211a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                b0 b0Var = (b0) this.f213c;
                b0Var.setBounds(0, 0, i10, i11);
                b0Var.c(0, AndroidUtilities.dp(24.0f) + getPaddingBottom());
                return;
            case 18:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.f212b;
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
        throw new UnsupportedOperationException("Method not decompiled: ag.l.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setBackgroundColor(int i10) {
        switch (this.f211a) {
            case 16:
                ((Paint) this.f212b).setColor(i10);
                return;
            default:
                super.setBackgroundColor(i10);
                return;
        }
    }

    @Override
    public void setTranslationX(float f10) {
        switch (this.f211a) {
            case 0:
                super.setTranslationX(f10);
                ((o) this.f213c).invalidate();
                return;
            default:
                super.setTranslationX(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f211a) {
            case 0:
                super.setTranslationY(f10);
                ((o) this.f213c).invalidate();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f211a) {
            case 15:
                if (((j6) this.f212b) != drawable && ((j6) this.f213c) != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 24:
                if (drawable != ((n21) this.f213c).f39273f && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public l(Object obj, Context context, int i10) {
        super(context);
        this.f211a = i10;
        this.f213c = obj;
    }

    public l(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, Object obj, int i10) {
        super(context);
        this.f211a = i10;
        this.f213c = notificationCenterDelegate;
        this.f212b = obj;
    }

    public l(Context context, int i10, g6 g6Var) {
        super(context);
        this.f211a = i10;
        switch (i10) {
            case 4:
                super(context);
                LinearLayout f10 = y3.f(context, 1);
                org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, false, false);
                this.f212b = k6Var;
                int i11 = k6.G6;
                k6Var.setTextColor(k6.v0(i11, g6Var));
                k6Var.setTextSize(AndroidUtilities.dp(17.0f));
                k6Var.setTypeface(AndroidUtilities.bold());
                f10.addView(k6Var, c6.q(-2, 23, 1));
                TextView textView = new TextView(context);
                this.f213c = textView;
                textView.setTextSize(1, 11.0f);
                textView.setTextColor(k6.v0(i11, g6Var));
                textView.setSingleLine();
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                f10.addView(textView, c6.q(-2, -2, 1));
                addView(f10, c6.e(-2, -2, 17));
                return;
            case 15:
                super(context);
                j6 j6Var = new j6(true, true, true, false);
                this.f212b = j6Var;
                pr prVar = pr.h;
                j6Var.k(0.3f, 430L, prVar);
                j6Var.u(AndroidUtilities.bold());
                j6Var.r(k6.v0(k6.A8, g6Var));
                j6Var.t(AndroidUtilities.dp(18.0f));
                j6Var.n(!LocaleController.isRTL);
                j6Var.setCallback(this);
                j6Var.G = AndroidUtilities.displaySize.x;
                j6 j6Var2 = new j6(true, true, true, false);
                this.f213c = j6Var2;
                j6Var2.k(0.3f, 430L, prVar);
                j6Var2.r(k6.v0(k6.B8, g6Var));
                j6Var2.t(AndroidUtilities.dp(14.0f));
                j6Var2.n(true ^ LocaleController.isRTL);
                j6Var2.setCallback(this);
                j6Var2.G = AndroidUtilities.displaySize.x;
                return;
            default:
                this.f213c = new b0(8);
                this.f212b = g6Var;
                return;
        }
    }

    private final void a(boolean z4) {
    }

    public l(y0 y0Var, Context context) {
        super(context);
        this.f211a = 10;
        this.f213c = y0Var;
        this.f212b = new RectF();
    }

    public l(d0 d0Var, Context context) {
        super(context);
        this.f211a = 7;
        this.f213c = d0Var;
        this.f212b = new t0(this, 1);
    }

    public l(r41 r41Var, Context context) {
        super(context);
        this.f211a = 26;
        this.f213c = r41Var;
        this.f212b = new Path();
    }

    public l(yb ybVar, Context context) {
        super(context);
        this.f211a = 11;
        this.f213c = ybVar;
        this.f212b = new Paint(1);
    }

    public l(s sVar, Context context) {
        super(context);
        this.f211a = 6;
        this.f213c = sVar;
        this.f212b = new ng.o(this, this);
    }

    public l(r5 r5Var, Activity activity) {
        super(activity);
        this.f211a = 9;
        this.f213c = r5Var;
        this.f212b = new Paint(1);
    }

    public l(h1 h1Var, Context context) {
        super(context);
        this.f211a = 18;
        this.f213c = h1Var;
        this.f212b = new Path();
    }

    public l(xd0 xd0Var, Context context) {
        super(context);
        this.f211a = 16;
        this.f213c = xd0Var;
        this.f212b = new Paint();
    }

    public l(Context context, TextView textView, TextView textView2) {
        super(context);
        this.f211a = 22;
        this.f212b = textView;
        this.f213c = textView2;
    }

    public l(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f211a = 25;
        this.f213c = secretMediaViewer;
        this.f212b = secretMediaViewer;
        setWillNotDraw(false);
    }

    public l(r61 r61Var, Context context) {
        super(context);
        this.f211a = 27;
        this.f213c = r61Var;
        this.f212b = new Rect();
    }

    public l(n21 n21Var, Activity activity, o21 o21Var) {
        super(activity);
        this.f211a = 24;
        this.f213c = n21Var;
        Rect rect = new Rect();
        this.f212b = rect;
        n21Var.f39269a.setColor(o21Var.getThemedColor(k6.f21659d6));
        Drawable drawable = n21Var.f39273f;
        drawable.setCallback(this);
        drawable.getPadding(rect);
    }

    public l(mp mpVar, Context context) {
        super(context);
        this.f211a = 13;
        this.f213c = mpVar;
        this.f212b = new Paint();
    }

    public l(qt qtVar, Activity activity) {
        super(activity);
        this.f211a = 20;
        this.f213c = qtVar;
        this.f212b = qtVar;
        setWillNotDraw(false);
    }

    public l(Context context, ed1 ed1Var) {
        super(context);
        this.f211a = 29;
        this.f213c = ed1Var;
        this.f212b = new Paint();
    }

    public l(a1 a1Var, Context context) {
        super(context);
        this.f211a = 2;
        this.f213c = a1Var;
        this.f212b = new Path();
    }

    public l(rk0 rk0Var, Context context) {
        super(context);
        this.f211a = 17;
        this.f213c = rk0Var;
        this.f212b = new Paint(1);
    }

    public l(Context context) {
        super(context);
        this.f211a = 12;
        this.f212b = new Path();
        this.f213c = new h20();
    }
}
