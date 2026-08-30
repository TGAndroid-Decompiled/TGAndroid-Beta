package ah;

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
import dg.c1;
import eg.o1;
import eg.q1;
import eg.s0;
import f2.i0;
import f2.w;
import k7.b6;
import k7.n;
import kh.t0;
import lf.b0;
import m2.h;
import mg.c0;
import mg.d0;
import mg.g0;
import mg.o;
import mg.s;
import mg.y;
import o1.j;
import o1.k;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.y3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k5;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.ActionBar.r0;
import org.telegram.ui.Cells.y0;
import org.telegram.ui.Cells.y9;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.hd0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.ka;
import org.telegram.ui.Components.kp;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.Components.voip.g1;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.cd1;
import org.telegram.ui.g20;
import org.telegram.ui.gt0;
import org.telegram.ui.i41;
import org.telegram.ui.l21;
import org.telegram.ui.l4;
import org.telegram.ui.m21;
import org.telegram.ui.p41;
import org.telegram.ui.pt;
import org.telegram.ui.q61;
import org.telegram.ui.r5;
import org.telegram.ui.s51;
import org.telegram.ui.t51;
import org.telegram.ui.u51;
import org.telegram.ui.u70;
import org.telegram.ui.vy0;
import org.telegram.ui.y51;
import org.telegram.ui.zb;
import ph.f3;
public final class d extends FrameLayout {
    public final int f196a;
    public Object f197b;
    public Object f198c;

    public d(Context context, int i10) {
        super(context);
        this.f196a = i10;
    }

    public void b(int i10, CharSequence charSequence, boolean z4) {
        ImageView imageView = (ImageView) this.f197b;
        if (z4) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
        ((TextView) this.f198c).setText(charSequence);
    }

    public void c(String str, boolean z4) {
        boolean z10;
        j6 j6Var = (j6) this.f198c;
        if (z4 && !LocaleController.isRTL) {
            z10 = true;
        } else {
            z10 = false;
        }
        j6Var.q(str, z10, true);
    }

    public void d(String str, boolean z4) {
        boolean z10;
        j6 j6Var = (j6) this.f197b;
        if (z4 && !LocaleController.isRTL) {
            z10 = true;
        } else {
            z10 = false;
        }
        j6Var.q(str, z10, true);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        f6 f6Var;
        Paint paint;
        boolean a12;
        int k10;
        k5[] k5VarArr;
        char c3;
        float f10;
        ?? r10;
        float f11;
        float f12;
        z zVar;
        float f13;
        switch (this.f196a) {
            case 0:
                b0 b0Var = (b0) this.f198c;
                b0Var.b(org.telegram.ui.ActionBar.j6.l1(0.65f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19906d6, (f6) this.f197b)));
                b0Var.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 2:
                ((q1) this.f197b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, AndroidUtilities.dp(2.0f), getMeasuredWidth(), AndroidUtilities.dp(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                q1 q1Var = (q1) this.f197b;
                q1Var.f5457f.setAlpha(((o1) this.f198c).H);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(24.0f) - 1, AndroidUtilities.dp(24.0f) - 1, q1Var.f5457f);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            case 8:
                super.dispatchDraw(canvas);
                Paint paint2 = (Paint) this.f197b;
                int i10 = org.telegram.ui.ActionBar.j6.f19852a7;
                f6Var = ((p2) ((r5) this.f198c).d).resourceProvider;
                paint2.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint2);
                return;
            case 9:
                RectF rectF2 = (RectF) this.f197b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                y0 y0Var = (y0) this.f198c;
                int measuredWidth = y0Var.getMeasuredWidth();
                int i11 = y0Var.d;
                float x10 = y0Var.getX();
                float f14 = y0Var.f22605c;
                f6 f6Var2 = y0Var.f22604b;
                if (f6Var2 != null) {
                    f6Var2.l(x10, f14, measuredWidth, i11);
                } else {
                    org.telegram.ui.ActionBar.j6.q(x10, f14, measuredWidth, i11);
                }
                float dp = AndroidUtilities.dp(18.0f);
                float dp2 = AndroidUtilities.dp(18.0f);
                Paint paint3 = null;
                if (f6Var2 != null) {
                    paint = f6Var2.G("paintChatActionBackground");
                } else {
                    paint = null;
                }
                if (paint == null) {
                    paint = org.telegram.ui.ActionBar.j6.S0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF2, dp, dp2, paint);
                if (f6Var2 != null) {
                    a12 = f6Var2.m0();
                } else {
                    a12 = org.telegram.ui.ActionBar.j6.a1();
                }
                if (a12) {
                    float dp3 = AndroidUtilities.dp(18.0f);
                    float dp4 = AndroidUtilities.dp(18.0f);
                    if (f6Var2 != null) {
                        paint3 = f6Var2.G("paintChatActionBackgroundDarken");
                    }
                    if (paint3 == null) {
                        paint3 = org.telegram.ui.ActionBar.j6.S0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF2, dp3, dp4, paint3);
                }
                super.dispatchDraw(canvas);
                return;
            case 10:
                super.dispatchDraw(canvas);
                Paint paint4 = (Paint) this.f197b;
                paint4.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19852a7, ((zb) this.f198c).f40752f.e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint4);
                return;
            case 11:
                float dp5 = AndroidUtilities.dp(20.0f);
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.f197b;
                path.rewind();
                path.addRoundRect(rectF3, dp5, dp5, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF3, 255, 31);
                super.dispatchDraw(canvas);
                rectF3.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), AndroidUtilities.dp(6.0f) + getPaddingTop());
                g20 g20Var = (g20) this.f198c;
                g20Var.b(canvas, rectF3, 1, 1.0f);
                rectF3.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                g20Var.b(canvas, rectF3, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                return;
            case 12:
                super.dispatchDraw(canvas);
                Paint paint5 = (Paint) this.f197b;
                paint5.setColor(((kp) this.f198c).getThemedColor(org.telegram.ui.ActionBar.j6.f19907d7));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint5);
                return;
            case 13:
                wy wyVar = (wy) this.f198c;
                if (!wyVar.D.f26463r0 && wyVar.f30443w > 0.0f) {
                    if (((Paint) this.f197b) == null) {
                        Paint paint6 = new Paint();
                        this.f197b = paint6;
                        paint6.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f197b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f197b).setAlpha((int) (wyVar.f30443w * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f197b);
                    canvas.restore();
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 14:
                j6 j6Var = (j6) this.f197b;
                int dp6 = AndroidUtilities.dp(29.0f);
                int dp7 = AndroidUtilities.dp(18.83f);
                j6 j6Var2 = (j6) this.f198c;
                j6Var.setBounds(getPaddingLeft(), r3 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r3);
                j6Var.draw(canvas);
                j6Var2.setBounds(getPaddingLeft(), r2 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r2);
                j6Var2.draw(canvas);
                return;
            case 16:
                Paint paint7 = (Paint) this.f197b;
                pk0 pk0Var = (pk0) this.f198c;
                int i12 = pk0Var.J0;
                if (i12 != 1 && i12 != 2 && i12 != 4) {
                    k10 = i0.a.d(0.7f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, pk0Var.f27903h0), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19977h5, pk0Var.f27903h0));
                } else {
                    k10 = i0.a.k(-1, 30);
                }
                paint7.setColor(k10);
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - AndroidUtilities.dpf2(6.0f)) / 2.0f;
                float g10 = pk0Var.g();
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
            case 22:
                super.dispatchDraw(canvas);
                ProfileActivity profileActivity = (ProfileActivity) this.f198c;
                k5[] k5VarArr2 = profileActivity.f32147r;
                if (profileActivity.T4 != null) {
                    canvas.save();
                    canvas.translate(k5VarArr2[0].getX(), k5VarArr2[0].getY());
                    k5VarArr = k5VarArr2;
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
                    k5VarArr = k5VarArr2;
                    c3 = 2;
                    f10 = 0.0f;
                    r10 = 0;
                    f11 = 24.0f;
                    f12 = 14.0f;
                }
                if (profileActivity.f32116m5 && profileActivity.V5 != f10 && profileActivity.f32104k5 != 1.0f) {
                    float measuredHeight2 = (k5VarArr[1].getMeasuredHeight() / 2.0f) + k5VarArr[1].getY();
                    float dp8 = AndroidUtilities.dp(22.0f);
                    float x11 = ((k5VarArr[1].getX() + (AndroidUtilities.dp(28.0f) - profileActivity.f32110l5)) - dp8) - profileActivity.Z3();
                    profileActivity.f32131o5.setImageCoords(x11, measuredHeight2 - (dp8 / 2.0f), dp8, dp8);
                    profileActivity.f32131o5.setAlpha(profileActivity.V5);
                    canvas.save();
                    float f15 = profileActivity.V5;
                    canvas.scale(f15, f15, profileActivity.f32131o5.getCenterX(), profileActivity.f32131o5.getCenterY());
                    profileActivity.f32131o5.draw(canvas);
                    canvas.restore();
                    if (profileActivity.f32104k5 == f10) {
                        if (((xc) this.f197b) == null) {
                            xc xcVar = new xc(this);
                            this.f197b = xcVar;
                            xcVar.h = new vy0(this, r10);
                        }
                        float dp9 = (1.0f - profileActivity.f32104k5) * AndroidUtilities.dp(28.0f);
                        float textWidth = k5VarArr[c3].getTextWidth();
                        if (profileActivity.Q != null) {
                            f13 = (AndroidUtilities.dp(f11) + textWidth + AndroidUtilities.dp(4.0f)) * profileActivity.Q.getVisibilityFactor();
                        } else {
                            f13 = 0.0f;
                        }
                        RectF rectF5 = AndroidUtilities.rectTmp;
                        rectF5.set(x11 - AndroidUtilities.dp(4.0f), measuredHeight2 - AndroidUtilities.dp(f12), x11 + Math.max(textWidth, f13) + dp9 + AndroidUtilities.dp(4.0f), measuredHeight2 + AndroidUtilities.dp(f12));
                        xc xcVar2 = (xc) this.f197b;
                        xcVar2.f30653i = r10;
                        xcVar2.f30650c = r10;
                        xcVar2.a(rectF5);
                        xc xcVar3 = (xc) this.f197b;
                        xcVar3.f30658n = true;
                        int k11 = i0.a.k(-1, 50);
                        xcVar3.f30652g.setColor((int) r10);
                        z zVar2 = xcVar3.e;
                        if (zVar2 != null) {
                            org.telegram.ui.ActionBar.j6.B1(zVar2, k11, true);
                        }
                        xc xcVar4 = (xc) this.f197b;
                        xcVar4.c(canvas, xcVar4.f30652g);
                        z zVar3 = xcVar4.e;
                        if (zVar3 != null) {
                            zVar3.draw(canvas);
                            return;
                        }
                        return;
                    }
                    xc xcVar5 = (xc) this.f197b;
                    if (xcVar5 != null && (zVar = xcVar5.e) != null) {
                        zVar.setState(StateSet.NOTHING);
                        zVar.jumpToCurrentState();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                Rect rect = (Rect) this.f197b;
                l21 l21Var = (l21) this.f198c;
                if (l21Var.O) {
                    l21Var.f35892f.setBounds(-rect.left, -rect.top, getWidth() + rect.right, getHeight() + rect.bottom);
                    l21Var.f35892f.draw(canvas);
                } else {
                    RectF rectF6 = AndroidUtilities.rectTmp;
                    rectF6.set(0.0f, 0.0f, AndroidUtilities.dp(14.0f) + getWidth(), getHeight());
                    canvas.drawRoundRect(rectF6, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), l21Var.f35889a);
                }
                super.dispatchDraw(canvas);
                return;
            case 27:
                ImageReceiver imageReceiver = (ImageReceiver) this.f197b;
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
        switch (this.f196a) {
            case 6:
                if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
                    d0 d0Var = (d0) this.f198c;
                    if (!d0Var.f13979k) {
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
        switch (this.f196a) {
            case 6:
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
        switch (this.f196a) {
            case 0:
                super.dispatchTouchEvent(motionEvent);
                return true;
            case 7:
                l4 l4Var = (l4) this.f198c;
                y9 o10 = l4Var.M0.o(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.f197b;
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
            case 17:
                int action = motionEvent.getAction();
                g1 g1Var = (g1) this.f198c;
                if (g1Var.G != null) {
                    MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                    obtain2.offsetLocation(g1Var.G.getX(), g1Var.G.getY());
                    boolean dispatchTouchEvent = g1Var.G.dispatchTouchEvent(motionEvent);
                    obtain2.recycle();
                    if (action == 1 || action == 3) {
                        g1Var.G = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                obtain3.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = g1Var.C.onTouchEvent(obtain3);
                obtain3.recycle();
                if (!g1Var.C.isInProgress() && ((GestureDetector) g1Var.D.f21045b).onTouchEvent(motionEvent)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (action == 1 || action == 3) {
                    g1Var.E = false;
                    g1Var.F = false;
                    j jVar = g1Var.P;
                    if (!jVar.f16192f) {
                        float f10 = g1Var.N;
                        jVar.f16190b = f10;
                        jVar.f16191c = true;
                        k kVar = jVar.f16198u;
                        int i10 = g1Var.J;
                        float f11 = (i10 / 2.0f) + f10;
                        int i11 = AndroidUtilities.displaySize.x;
                        if (f11 >= i11 / 2.0f) {
                            dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        kVar.f16204i = dp;
                        g1Var.P.f();
                    }
                    j jVar2 = g1Var.Q;
                    if (!jVar2.f16192f) {
                        float f12 = g1Var.O;
                        jVar2.f16190b = f12;
                        jVar2.f16191c = true;
                        jVar2.f16198u.f16204i = n.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - g1Var.K) - AndroidUtilities.dp(16.0f));
                        g1Var.Q.f();
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
        switch (this.f196a) {
            case 1:
                Path path = (Path) this.f197b;
                c1 c1Var = (c1) this.f198c;
                if (c1Var.h != null && (((z4 = c1Var.f4423f) && view == c1Var.d) || (!z4 && view == c1Var.f4422c))) {
                    if (z4) {
                        f10 = c1Var.e;
                    } else {
                        f10 = 1.0f - c1Var.e;
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
            case 19:
                if (view instanceof hd0) {
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            case 24:
                if (view != ((SecretMediaViewer) this.f197b).f32271w && super.drawChild(canvas, view, j10)) {
                    return true;
                }
                return false;
            case 25:
                Path path2 = (Path) this.f197b;
                p41 p41Var = (p41) this.f198c;
                RectF rectF = p41Var.O;
                if (view != p41Var.K && view != p41Var.f37181x) {
                    if (view == p41Var.M) {
                        canvas.save();
                        path2.rewind();
                        path2.addCircle(rectF.centerX() + p41Var.K.getX(), rectF.centerY() + p41Var.K.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                        canvas.clipPath(path2);
                        canvas.clipRect(0.0f, AndroidUtilities.lerp(p41Var.Q, 0.0f, p41Var.f37179s), getWidth(), AndroidUtilities.lerp(p41Var.R, getHeight(), p41Var.f37179s));
                        canvas.translate(-p41Var.M.getX(), -p41Var.M.getY());
                        canvas.translate(p41Var.K.getX() + rectF.left, p41Var.K.getY() + rectF.top);
                        canvas.scale(rectF.width() / p41Var.M.getMeasuredWidth(), rectF.height() / p41Var.M.getMeasuredHeight(), p41Var.M.getX(), p41Var.M.getY());
                        boolean drawChild2 = super.drawChild(canvas, view, j10);
                        canvas.restore();
                        return drawChild2;
                    }
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(p41Var.Q, 0.0f, p41Var.f37179s), getWidth(), AndroidUtilities.lerp(p41Var.R, getHeight(), p41Var.f37179s));
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild3;
            case 26:
                if (view == ((q61) this.f198c).f37605e0 && g0.f14004b && g0.f14006f) {
                    for (int i10 = 0; i10 < ((q61) this.f198c).f37605e0.getChildCount(); i10++) {
                        View childAt = ((q61) this.f198c).f37605e0.getChildAt(i10);
                        if (childAt instanceof y51) {
                            y51 y51Var = (y51) childAt;
                            if (y51Var.getAnimatedScale() == 1.0f) {
                                ((Rect) this.f197b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                canvas.save();
                                canvas.clipRect((Rect) this.f197b);
                                super.drawChild(canvas, view, j10);
                                canvas.restore();
                            } else if (y51Var.getAnimatedScale() > 0.0f) {
                                ((Rect) this.f197b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                Rect rect = (Rect) this.f197b;
                                rect.set((int) (rect.centerX() - (y51Var.getAnimatedScale() * (((Rect) this.f197b).width() / 2.0f))), (int) (((Rect) this.f197b).centerY() - (y51Var.getAnimatedScale() * (((Rect) this.f197b).height() / 2.0f))), (int) ((y51Var.getAnimatedScale() * (((Rect) this.f197b).width() / 2.0f)) + ((Rect) this.f197b).centerX()), (int) ((y51Var.getAnimatedScale() * (((Rect) this.f197b).height() / 2.0f)) + ((Rect) this.f197b).centerY()));
                                canvas.save();
                                canvas.clipRect((Rect) this.f197b);
                                canvas.scale(y51Var.getAnimatedScale(), y51Var.getAnimatedScale(), ((Rect) this.f197b).centerX(), ((Rect) this.f197b).centerY());
                                super.drawChild(canvas, view, j10);
                                canvas.restore();
                            }
                        } else if ((childAt instanceof TextView) || (childAt instanceof t51) || (childAt instanceof s51) || (childAt instanceof u51)) {
                            ((Rect) this.f197b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.f197b);
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
        switch (this.f196a) {
            case 6:
                d0 d0Var = (d0) this.f198c;
                float f10 = d0Var.f13989u;
                float f11 = rect.bottom;
                if (f10 != f11 && d0Var.v) {
                    d0Var.f13989u = f11;
                    d dVar = d0Var.f13974c;
                    c0 c0Var = d0Var.f13972a;
                    if (!d0Var.f13985q) {
                        float f12 = d0Var.f13988t;
                        int dp = AndroidUtilities.dp(32.0f);
                        int i10 = d0Var.f13992y;
                        if (i10 == 1 || i10 == 2) {
                            dp = AndroidUtilities.dp(24.0f);
                        }
                        float f13 = dp;
                        if (c0Var.getMeasuredHeight() + f12 > (dVar.getMeasuredHeight() - d0Var.f13989u) - f13) {
                            f12 = ((dVar.getMeasuredHeight() - d0Var.f13989u) - c0Var.getMeasuredHeight()) - f13;
                        }
                        if (f12 < 0.0f) {
                            f12 = 0.0f;
                        }
                        c0Var.animate().translationY(f12).setDuration(250L).setUpdateListener(new y(d0Var, 1)).setInterpolator(nr.f27346f).start();
                    }
                }
                return super.fitSystemWindows(rect);
            default:
                return super.fitSystemWindows(rect);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f196a) {
            case 29:
                super.invalidate();
                r0 r0Var = ((cd1) this.f198c).f33328q0;
                if (r0Var != null) {
                    r0Var.invalidate();
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
        switch (this.f196a) {
            case 5:
                super.onAttachedToWindow();
                ((o) this.f197b).c();
                return;
            case 6:
                super.onAttachedToWindow();
                ic.a(this, (t0) this.f197b);
                return;
            case 19:
                super.onAttachedToWindow();
                pt ptVar = (pt) this.f198c;
                ptVar.A.onAttachedToWindow();
                ptVar.B.onAttachedToWindow();
                return;
            case 22:
                super.onAttachedToWindow();
                ((ProfileActivity) this.f198c).f32131o5.onAttachedToWindow();
                return;
            case 24:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.f197b).h.onAttachedToWindow();
                return;
            case 27:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f197b).onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.f196a) {
            case 17:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                g1 g1Var = (g1) this.f198c;
                AndroidUtilities.setPreferredMaxRefreshRate(g1Var.f29638b, g1Var.d, g1Var.f29639c);
                g1Var.i(false);
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f196a) {
            case 5:
                super.onDetachedFromWindow();
                ((o) this.f197b).d();
                return;
            case 6:
                super.onDetachedFromWindow();
                ic.h(this);
                return;
            case 19:
                super.onDetachedFromWindow();
                pt ptVar = (pt) this.f198c;
                ptVar.A.onDetachedFromWindow();
                ptVar.B.onDetachedFromWindow();
                return;
            case 22:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.f198c).f32131o5.onDetachedFromWindow();
                return;
            case 24:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.f197b).h.onDetachedFromWindow();
                return;
            case 27:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f197b).onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: ah.d.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        xc xcVar;
        switch (this.f196a) {
            case 22:
                if ((((ProfileActivity) this.f198c).f32104k5 == 0.0f && (xcVar = (xc) this.f197b) != null && xcVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f196a) {
            case 20:
                super.onLayout(z4, i10, i11, i12, i13);
                int i14 = (i13 - i11) / 4;
                int i15 = i14 * 3;
                int x10 = org.telegram.ui.b.x(275.0f, i15, 2);
                u70 u70Var = (u70) this.f198c;
                FrameLayout frameLayout = u70Var.f38866r;
                int i16 = 0;
                frameLayout.layout(0, x10, frameLayout.getMeasuredWidth(), u70Var.f38866r.getMeasuredHeight() + x10);
                int dp = AndroidUtilities.dp(139.0f) + AndroidUtilities.dp(150.0f) + x10;
                int measuredWidth = (getMeasuredWidth() - u70Var.e.getMeasuredWidth()) / 2;
                ka kaVar = u70Var.e;
                kaVar.layout(measuredWidth, dp, kaVar.getMeasuredWidth() + measuredWidth, u70Var.e.getMeasuredHeight() + dp);
                h hVar = u70Var.d;
                hVar.layout(0, 0, hVar.getMeasuredWidth(), u70Var.d.getMeasuredHeight());
                int measuredHeight = ((i14 - u70Var.f38865n.getMeasuredHeight()) / 2) + i15;
                int measuredWidth2 = (getMeasuredWidth() - u70Var.f38865n.getMeasuredWidth()) / 2;
                s0 s0Var = u70Var.f38865n;
                s0Var.layout(measuredWidth2, measuredHeight, s0Var.getMeasuredWidth() + measuredWidth2, u70Var.f38865n.getMeasuredHeight() + measuredHeight);
                int dp2 = measuredHeight - AndroidUtilities.dp(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - u70Var.f38864f.getMeasuredWidth()) / 2;
                TextView textView = u70Var.f38864f;
                textView.layout(measuredWidth3, dp2 - textView.getMeasuredHeight(), u70Var.f38864f.getMeasuredWidth() + measuredWidth3, dp2);
                FrameLayout frameLayout2 = (FrameLayout) this.f197b;
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
            case 21:
                int dp4 = AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(150.0f) + org.telegram.ui.b.x(275.0f, ((i13 - i11) / 4) * 3, 2);
                int dp5 = AndroidUtilities.dp(18.0f);
                TextView textView2 = (TextView) this.f197b;
                textView2.layout(dp5, dp4, textView2.getMeasuredWidth() + dp5, textView2.getMeasuredHeight() + dp4);
                int dp6 = AndroidUtilities.dp(18.0f) + dp4 + ((int) textView2.getTextSize());
                int dp7 = AndroidUtilities.dp(16.0f);
                TextView textView3 = (TextView) this.f198c;
                textView3.layout(dp7, dp6, textView3.getMeasuredWidth() + dp7, textView3.getMeasuredHeight() + dp6);
                return;
            case 22:
                super.onLayout(z4, i10, i11, i12, i13);
                ((ProfileActivity) this.f198c).V4();
                return;
            case 23:
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
            case 24:
                super.onLayout(z4, i10, i11, i12, i13);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f198c;
                if (secretMediaViewer.f32252n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f32252n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight;
                    i41 i41Var = secretMediaViewer.f32252n;
                    i41Var.layout(i41Var.getLeft(), currentActionBarHeight, secretMediaViewer.f32252n.getRight(), secretMediaViewer.f32252n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.f32261r != null && secretMediaViewer.f32252n != null) {
                    int measuredHeight2 = (secretMediaViewer.f32252n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f32252n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight)) - AndroidUtilities.dp(10.0f);
                    f3 f3Var = secretMediaViewer.f32261r;
                    f3Var.layout(f3Var.getLeft(), measuredHeight2, secretMediaViewer.f32261r.getRight(), secretMediaViewer.f32261r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.X != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                    gt0 gt0Var = secretMediaViewer.X;
                    gt0Var.layout(gt0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.X.getRight(), secretMediaViewer.X.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f32237f;
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
        i0 wVar;
        int measuredHeight;
        switch (this.f196a) {
            case 2:
                super.onMeasure(i10, org.telegram.ui.b.B(2.0f, ((o1) this.f198c).f5396s, 1073741824));
                return;
            case 7:
                super.onMeasure(i10, i11);
                super.onMeasure(i10, org.telegram.ui.b.B(8.0f, ((LinearLayout) this.f197b).getMeasuredHeight(), 1073741824));
                return;
            case 12:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                return;
            case 14:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
                setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                return;
            case 23:
                l21 l21Var = (l21) this.f198c;
                View view = l21Var.E;
                View view2 = l21Var.F;
                LinearLayout linearLayout = l21Var.v;
                TextView textView = l21Var.f35895s;
                sl0 sl0Var = l21Var.f35898y;
                boolean z4 = l21Var.P.M;
                int dp = AndroidUtilities.dp(12.0f);
                if (z4) {
                    sl0Var.setLayoutParams(b6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
                    sl0Var.setPadding(dp, 0, dp, 0);
                    if (linearLayout != null) {
                        textView.setLayoutParams(b6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(b6.d(-1, 48.0f, 8388691, 16.0f, 162.0f, 16.0f, 16.0f));
                    } else {
                        textView.setLayoutParams(b6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
                    }
                } else {
                    sl0Var.setPadding(dp, dp / 2, dp, dp);
                    if (linearLayout != null) {
                        sl0Var.setLayoutParams(b6.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 136.0f));
                        textView.setLayoutParams(b6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(b6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                    } else {
                        sl0Var.setLayoutParams(b6.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 80.0f));
                        textView.setLayoutParams(b6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
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
                    view2.setLayoutParams(b6.d(-1, AndroidUtilities.dp(2.0f), 80, 0.0f, 0.0f, 0.0f, i12));
                    view.setVisibility(0);
                    view.setLayoutParams(b6.d(-1, AndroidUtilities.dp(2.0f), 48, 0.0f, 44.0f, 0.0f, 0.0f));
                }
                if (l21Var.O != z4) {
                    m21 m21Var = l21Var.d;
                    if (z4) {
                        m21Var.getParentActivity();
                        wVar = new i0(0, false);
                    } else {
                        m21Var.getParentActivity();
                        wVar = new w(3, false);
                    }
                    l21Var.D = wVar;
                    sl0Var.setLayoutManager(wVar);
                    sl0Var.requestLayout();
                    int i13 = l21Var.I;
                    if (i13 != -1) {
                        l21Var.b(i13);
                    }
                    l21Var.O = z4;
                }
                super.onMeasure(i10, i11);
                return;
            case 24:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f198c;
                gt0 gt0Var = secretMediaViewer.X;
                if (gt0Var != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                    int currentActionBarHeight = (measuredHeight2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                    if (secretMediaViewer.R.getVisibility() != 0) {
                        measuredHeight = 0;
                    } else {
                        measuredHeight = secretMediaViewer.R.getMeasuredHeight();
                    }
                    gt0Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(currentActionBarHeight - measuredHeight, 1073741824));
                }
                View view3 = secretMediaViewer.f32237f;
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
        switch (this.f196a) {
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                b0 b0Var = (b0) this.f198c;
                b0Var.setBounds(0, 0, i10, i11);
                b0Var.c(0, AndroidUtilities.dp(24.0f) + getPaddingBottom());
                return;
            case 17:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.f197b;
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
        throw new UnsupportedOperationException("Method not decompiled: ah.d.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setBackgroundColor(int i10) {
        switch (this.f196a) {
            case 15:
                ((Paint) this.f197b).setColor(i10);
                return;
            default:
                super.setBackgroundColor(i10);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f196a) {
            case 14:
                if (((j6) this.f197b) != drawable && ((j6) this.f198c) != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 23:
                if (drawable != ((l21) this.f198c).f35892f && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public d(Object obj, Context context, int i10) {
        super(context);
        this.f196a = i10;
        this.f198c = obj;
    }

    public d(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, Object obj, int i10) {
        super(context);
        this.f196a = i10;
        this.f198c = notificationCenterDelegate;
        this.f197b = obj;
    }

    public d(Context context, int i10, f6 f6Var) {
        super(context);
        this.f196a = i10;
        switch (i10) {
            case 3:
                super(context);
                LinearLayout f10 = y3.f(context, 1);
                k6 k6Var = new k6(context, false, false, false);
                this.f197b = k6Var;
                int i11 = org.telegram.ui.ActionBar.j6.G6;
                k6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
                k6Var.setTextSize(AndroidUtilities.dp(17.0f));
                k6Var.setTypeface(AndroidUtilities.bold());
                f10.addView(k6Var, b6.q(-2, 23, 1));
                TextView textView = new TextView(context);
                this.f198c = textView;
                textView.setTextSize(1, 11.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
                textView.setSingleLine();
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                f10.addView(textView, b6.q(-2, -2, 1));
                addView(f10, b6.e(-2, -2, 17));
                return;
            case 14:
                super(context);
                j6 j6Var = new j6(true, true, true, false);
                this.f197b = j6Var;
                nr nrVar = nr.h;
                j6Var.k(0.3f, 430L, nrVar);
                j6Var.u(AndroidUtilities.bold());
                j6Var.r(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A8, f6Var));
                j6Var.t(AndroidUtilities.dp(18.0f));
                j6Var.n(!LocaleController.isRTL);
                j6Var.setCallback(this);
                j6Var.G = AndroidUtilities.displaySize.x;
                j6 j6Var2 = new j6(true, true, true, false);
                this.f198c = j6Var2;
                j6Var2.k(0.3f, 430L, nrVar);
                j6Var2.r(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B8, f6Var));
                j6Var2.t(AndroidUtilities.dp(14.0f));
                j6Var2.n(true ^ LocaleController.isRTL);
                j6Var2.setCallback(this);
                j6Var2.G = AndroidUtilities.displaySize.x;
                return;
            default:
                this.f198c = new b0(8);
                this.f197b = f6Var;
                return;
        }
    }

    private final void a(boolean z4) {
    }

    public d(y0 y0Var, Context context) {
        super(context);
        this.f196a = 9;
        this.f198c = y0Var;
        this.f197b = new RectF();
    }

    public d(d0 d0Var, Context context) {
        super(context);
        this.f196a = 6;
        this.f198c = d0Var;
        this.f197b = new t0(this, 1);
    }

    public d(p41 p41Var, Context context) {
        super(context);
        this.f196a = 25;
        this.f198c = p41Var;
        this.f197b = new Path();
    }

    public d(zb zbVar, Context context) {
        super(context);
        this.f196a = 10;
        this.f198c = zbVar;
        this.f197b = new Paint(1);
    }

    public d(s sVar, Context context) {
        super(context);
        this.f196a = 5;
        this.f198c = sVar;
        this.f197b = new o(this, this);
    }

    public d(r5 r5Var, Activity activity) {
        super(activity);
        this.f196a = 8;
        this.f198c = r5Var;
        this.f197b = new Paint(1);
    }

    public d(g1 g1Var, Context context) {
        super(context);
        this.f196a = 17;
        this.f198c = g1Var;
        this.f197b = new Path();
    }

    public d(vd0 vd0Var, Context context) {
        super(context);
        this.f196a = 15;
        this.f198c = vd0Var;
        this.f197b = new Paint();
    }

    public d(Context context, TextView textView, TextView textView2) {
        super(context);
        this.f196a = 21;
        this.f197b = textView;
        this.f198c = textView2;
    }

    public d(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f196a = 24;
        this.f198c = secretMediaViewer;
        this.f197b = secretMediaViewer;
        setWillNotDraw(false);
    }

    public d(q61 q61Var, Context context) {
        super(context);
        this.f196a = 26;
        this.f198c = q61Var;
        this.f197b = new Rect();
    }

    public d(l21 l21Var, Activity activity, m21 m21Var) {
        super(activity);
        this.f196a = 23;
        this.f198c = l21Var;
        Rect rect = new Rect();
        this.f197b = rect;
        l21Var.f35889a.setColor(m21Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6));
        Drawable drawable = l21Var.f35892f;
        drawable.setCallback(this);
        drawable.getPadding(rect);
    }

    public d(kp kpVar, Context context) {
        super(context);
        this.f196a = 12;
        this.f198c = kpVar;
        this.f197b = new Paint();
    }

    public d(pt ptVar, Activity activity) {
        super(activity);
        this.f196a = 19;
        this.f198c = ptVar;
        this.f197b = ptVar;
        setWillNotDraw(false);
    }

    public d(cd1 cd1Var, Context context, int i10) {
        super(context);
        this.f196a = i10;
        switch (i10) {
            case 29:
                this.f198c = cd1Var;
                super(context);
                this.f197b = new int[2];
                return;
            default:
                this.f198c = cd1Var;
                this.f197b = new Paint();
                return;
        }
    }

    public d(c1 c1Var, Context context) {
        super(context);
        this.f196a = 1;
        this.f198c = c1Var;
        this.f197b = new Path();
    }

    public d(pk0 pk0Var, Context context) {
        super(context);
        this.f196a = 16;
        this.f198c = pk0Var;
        this.f197b = new Paint(1);
    }

    public d(Context context) {
        super(context);
        this.f196a = 11;
        this.f197b = new Path();
        this.f198c = new g20();
    }
}
