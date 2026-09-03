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
import kf.b0;
import kh.t0;
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
import org.telegram.ui.Cells.x9;
import org.telegram.ui.Cells.y0;
import org.telegram.ui.Cells.z;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.id0;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.ka;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.voip.g1;
import org.telegram.ui.Components.wd0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.xc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.a61;
import org.telegram.ui.ac;
import org.telegram.ui.b61;
import org.telegram.ui.f61;
import org.telegram.ui.gl0;
import org.telegram.ui.i20;
import org.telegram.ui.jd1;
import org.telegram.ui.n4;
import org.telegram.ui.nt0;
import org.telegram.ui.p41;
import org.telegram.ui.rt;
import org.telegram.ui.t21;
import org.telegram.ui.t5;
import org.telegram.ui.u21;
import org.telegram.ui.w41;
import org.telegram.ui.w70;
import org.telegram.ui.x61;
import org.telegram.ui.z51;
import ph.f3;
public final class e extends FrameLayout {
    public final int f211a;
    public Object f212b;
    public Object f213c;

    public e(Context context, int i10) {
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
        f6 f6Var;
        Paint paint;
        boolean a12;
        int k10;
        k5[] k5VarArr;
        ?? r82;
        float f10;
        char c3;
        float f11;
        float f12;
        z zVar;
        float f13;
        switch (this.f211a) {
            case 0:
                b0 b0Var = (b0) this.f213c;
                b0Var.b(org.telegram.ui.ActionBar.j6.l1(0.65f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, (f6) this.f212b)));
                b0Var.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 2:
                ((q1) this.f212b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, AndroidUtilities.dp(2.0f), getMeasuredWidth(), AndroidUtilities.dp(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                q1 q1Var = (q1) this.f212b;
                q1Var.f5446f.setAlpha(((o1) this.f213c).H);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(24.0f) - 1, AndroidUtilities.dp(24.0f) - 1, q1Var.f5446f);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            case 8:
                super.dispatchDraw(canvas);
                Paint paint2 = (Paint) this.f212b;
                int i10 = org.telegram.ui.ActionBar.j6.f19827a7;
                f6Var = ((p2) ((t5) this.f213c).d).resourceProvider;
                paint2.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint2);
                return;
            case 9:
                RectF rectF2 = (RectF) this.f212b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                y0 y0Var = (y0) this.f213c;
                int measuredWidth = y0Var.getMeasuredWidth();
                int i11 = y0Var.d;
                float x10 = y0Var.getX();
                float f14 = y0Var.f22574c;
                f6 f6Var2 = y0Var.f22573b;
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
                Paint paint4 = (Paint) this.f212b;
                paint4.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19827a7, ((ac) this.f213c).f32547f.e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint4);
                return;
            case 11:
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
                i20 i20Var = (i20) this.f213c;
                i20Var.b(canvas, rectF3, 1, 1.0f);
                rectF3.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                i20Var.b(canvas, rectF3, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                return;
            case 12:
                super.dispatchDraw(canvas);
                Paint paint5 = (Paint) this.f212b;
                paint5.setColor(((jp) this.f213c).getThemedColor(org.telegram.ui.ActionBar.j6.f19882d7));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint5);
                return;
            case 13:
                wy wyVar = (wy) this.f213c;
                if (!wyVar.D.f26475r0 && wyVar.f30374w > 0.0f) {
                    if (((Paint) this.f212b) == null) {
                        Paint paint6 = new Paint();
                        this.f212b = paint6;
                        paint6.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f212b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f212b).setAlpha((int) (wyVar.f30374w * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f212b);
                    canvas.restore();
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 14:
                j6 j6Var = (j6) this.f212b;
                int dp6 = AndroidUtilities.dp(29.0f);
                int dp7 = AndroidUtilities.dp(18.83f);
                j6 j6Var2 = (j6) this.f213c;
                j6Var.setBounds(getPaddingLeft(), r3 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r3);
                j6Var.draw(canvas);
                j6Var2.setBounds(getPaddingLeft(), r2 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r2);
                j6Var2.draw(canvas);
                return;
            case 16:
                Paint paint7 = (Paint) this.f212b;
                pk0 pk0Var = (pk0) this.f213c;
                int i12 = pk0Var.J0;
                if (i12 != 1 && i12 != 2 && i12 != 4) {
                    k10 = i0.a.d(0.7f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, pk0Var.f27898h0), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19952h5, pk0Var.f27898h0));
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
                ProfileActivity profileActivity = (ProfileActivity) this.f213c;
                k5[] k5VarArr2 = profileActivity.f32121r;
                if (profileActivity.T4 != null) {
                    canvas.save();
                    canvas.translate(k5VarArr2[0].getX(), k5VarArr2[0].getY());
                    k5VarArr = k5VarArr2;
                    r82 = 0;
                    f10 = 0.0f;
                    c3 = 2;
                    f11 = 24.0f;
                    f12 = 14.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.T4.getMeasuredWidth(), profileActivity.T4.getMeasuredHeight(), (int) ((1.0f - profileActivity.P1) * 255.0f), 31);
                    profileActivity.T4.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    k5VarArr = k5VarArr2;
                    r82 = 0;
                    f10 = 0.0f;
                    c3 = 2;
                    f11 = 24.0f;
                    f12 = 14.0f;
                }
                if (profileActivity.f32090m5 && profileActivity.V5 != f10 && profileActivity.f32078k5 != 1.0f) {
                    float measuredHeight2 = (k5VarArr[1].getMeasuredHeight() / 2.0f) + k5VarArr[1].getY();
                    float dp8 = AndroidUtilities.dp(22.0f);
                    float x11 = ((k5VarArr[1].getX() + (AndroidUtilities.dp(28.0f) - profileActivity.f32084l5)) - dp8) - profileActivity.Z3();
                    profileActivity.f32105o5.setImageCoords(x11, measuredHeight2 - (dp8 / 2.0f), dp8, dp8);
                    profileActivity.f32105o5.setAlpha(profileActivity.V5);
                    canvas.save();
                    float f15 = profileActivity.V5;
                    canvas.scale(f15, f15, profileActivity.f32105o5.getCenterX(), profileActivity.f32105o5.getCenterY());
                    profileActivity.f32105o5.draw(canvas);
                    canvas.restore();
                    if (profileActivity.f32078k5 == f10) {
                        if (((xc) this.f212b) == null) {
                            xc xcVar = new xc(this);
                            this.f212b = xcVar;
                            xcVar.h = new gl0(this, 29);
                        }
                        float dp9 = (1.0f - profileActivity.f32078k5) * AndroidUtilities.dp(28.0f);
                        float textWidth = k5VarArr[c3].getTextWidth();
                        if (profileActivity.Q != null) {
                            f13 = (AndroidUtilities.dp(f11) + textWidth + AndroidUtilities.dp(4.0f)) * profileActivity.Q.getVisibilityFactor();
                        } else {
                            f13 = 0.0f;
                        }
                        RectF rectF5 = AndroidUtilities.rectTmp;
                        rectF5.set(x11 - AndroidUtilities.dp(4.0f), measuredHeight2 - AndroidUtilities.dp(f12), x11 + Math.max(textWidth, f13) + dp9 + AndroidUtilities.dp(4.0f), measuredHeight2 + AndroidUtilities.dp(f12));
                        xc xcVar2 = (xc) this.f212b;
                        xcVar2.f30589i = r82;
                        xcVar2.f30586c = r82;
                        xcVar2.a(rectF5);
                        xc xcVar3 = (xc) this.f212b;
                        xcVar3.f30594n = true;
                        int k11 = i0.a.k(-1, 50);
                        xcVar3.f30588g.setColor((int) r82);
                        z zVar2 = xcVar3.e;
                        if (zVar2 != null) {
                            org.telegram.ui.ActionBar.j6.B1(zVar2, k11, true);
                        }
                        xc xcVar4 = (xc) this.f212b;
                        xcVar4.c(canvas, xcVar4.f30588g);
                        z zVar3 = xcVar4.e;
                        if (zVar3 != null) {
                            zVar3.draw(canvas);
                            return;
                        }
                        return;
                    }
                    xc xcVar5 = (xc) this.f212b;
                    if (xcVar5 != null && (zVar = xcVar5.e) != null) {
                        zVar.setState(StateSet.NOTHING);
                        zVar.jumpToCurrentState();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                Rect rect = (Rect) this.f212b;
                t21 t21Var = (t21) this.f213c;
                if (t21Var.O) {
                    t21Var.f38364f.setBounds(-rect.left, -rect.top, getWidth() + rect.right, getHeight() + rect.bottom);
                    t21Var.f38364f.draw(canvas);
                } else {
                    RectF rectF6 = AndroidUtilities.rectTmp;
                    rectF6.set(0.0f, 0.0f, AndroidUtilities.dp(14.0f) + getWidth(), getHeight());
                    canvas.drawRoundRect(rectF6, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), t21Var.f38361a);
                }
                super.dispatchDraw(canvas);
                return;
            case 27:
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
            case 6:
                if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
                    d0 d0Var = (d0) this.f213c;
                    if (!d0Var.f13967k) {
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
        switch (this.f211a) {
            case 0:
                super.dispatchTouchEvent(motionEvent);
                return true;
            case 7:
                n4 n4Var = (n4) this.f213c;
                x9 o10 = n4Var.M0.o(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.f212b;
                obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (n4Var.M0.y() && n4Var.M0.o(getContext()).onTouchEvent(obtain)) {
                    return true;
                }
                if (o10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() == 0 && n4Var.M0.y() && (motionEvent.getY() < linearLayout.getTop() || motionEvent.getY() > linearLayout.getBottom())) {
                    if (!n4Var.M0.o(getContext()).onTouchEvent(obtain)) {
                        return true;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            case 17:
                int action = motionEvent.getAction();
                g1 g1Var = (g1) this.f213c;
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
                if (!g1Var.C.isInProgress() && ((GestureDetector) g1Var.D.f31508b).onTouchEvent(motionEvent)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (action == 1 || action == 3) {
                    g1Var.E = false;
                    g1Var.F = false;
                    j jVar = g1Var.P;
                    if (!jVar.f16172f) {
                        float f10 = g1Var.N;
                        jVar.f16170b = f10;
                        jVar.f16171c = true;
                        k kVar = jVar.f16178u;
                        int i10 = g1Var.J;
                        float f11 = (i10 / 2.0f) + f10;
                        int i11 = AndroidUtilities.displaySize.x;
                        if (f11 >= i11 / 2.0f) {
                            dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        kVar.f16184i = dp;
                        g1Var.P.f();
                    }
                    j jVar2 = g1Var.Q;
                    if (!jVar2.f16172f) {
                        float f12 = g1Var.O;
                        jVar2.f16170b = f12;
                        jVar2.f16171c = true;
                        jVar2.f16178u.f16184i = n.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - g1Var.K) - AndroidUtilities.dp(16.0f));
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
        switch (this.f211a) {
            case 1:
                Path path = (Path) this.f212b;
                c1 c1Var = (c1) this.f213c;
                if (c1Var.h != null && (((z4 = c1Var.f4429f) && view == c1Var.d) || (!z4 && view == c1Var.f4428c))) {
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
                if (view instanceof id0) {
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            case 24:
                if (view != ((SecretMediaViewer) this.f212b).f32245w && super.drawChild(canvas, view, j10)) {
                    return true;
                }
                return false;
            case 25:
                Path path2 = (Path) this.f212b;
                w41 w41Var = (w41) this.f213c;
                RectF rectF = w41Var.O;
                if (view != w41Var.K && view != w41Var.f39273x) {
                    if (view == w41Var.M) {
                        canvas.save();
                        path2.rewind();
                        path2.addCircle(rectF.centerX() + w41Var.K.getX(), rectF.centerY() + w41Var.K.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                        canvas.clipPath(path2);
                        canvas.clipRect(0.0f, AndroidUtilities.lerp(w41Var.Q, 0.0f, w41Var.f39271s), getWidth(), AndroidUtilities.lerp(w41Var.R, getHeight(), w41Var.f39271s));
                        canvas.translate(-w41Var.M.getX(), -w41Var.M.getY());
                        canvas.translate(w41Var.K.getX() + rectF.left, w41Var.K.getY() + rectF.top);
                        canvas.scale(rectF.width() / w41Var.M.getMeasuredWidth(), rectF.height() / w41Var.M.getMeasuredHeight(), w41Var.M.getX(), w41Var.M.getY());
                        boolean drawChild2 = super.drawChild(canvas, view, j10);
                        canvas.restore();
                        return drawChild2;
                    }
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(w41Var.Q, 0.0f, w41Var.f39271s), getWidth(), AndroidUtilities.lerp(w41Var.R, getHeight(), w41Var.f39271s));
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild3;
            case 26:
                if (view == ((x61) this.f213c).f39862e0 && g0.f13992b && g0.f13994f) {
                    for (int i10 = 0; i10 < ((x61) this.f213c).f39862e0.getChildCount(); i10++) {
                        View childAt = ((x61) this.f213c).f39862e0.getChildAt(i10);
                        if (childAt instanceof f61) {
                            f61 f61Var = (f61) childAt;
                            if (f61Var.getAnimatedScale() == 1.0f) {
                                ((Rect) this.f212b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                canvas.save();
                                canvas.clipRect((Rect) this.f212b);
                                super.drawChild(canvas, view, j10);
                                canvas.restore();
                            } else if (f61Var.getAnimatedScale() > 0.0f) {
                                ((Rect) this.f212b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                Rect rect = (Rect) this.f212b;
                                rect.set((int) (rect.centerX() - (f61Var.getAnimatedScale() * (((Rect) this.f212b).width() / 2.0f))), (int) (((Rect) this.f212b).centerY() - (f61Var.getAnimatedScale() * (((Rect) this.f212b).height() / 2.0f))), (int) ((f61Var.getAnimatedScale() * (((Rect) this.f212b).width() / 2.0f)) + ((Rect) this.f212b).centerX()), (int) ((f61Var.getAnimatedScale() * (((Rect) this.f212b).height() / 2.0f)) + ((Rect) this.f212b).centerY()));
                                canvas.save();
                                canvas.clipRect((Rect) this.f212b);
                                canvas.scale(f61Var.getAnimatedScale(), f61Var.getAnimatedScale(), ((Rect) this.f212b).centerX(), ((Rect) this.f212b).centerY());
                                super.drawChild(canvas, view, j10);
                                canvas.restore();
                            }
                        } else if ((childAt instanceof TextView) || (childAt instanceof a61) || (childAt instanceof z51) || (childAt instanceof b61)) {
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
            case 6:
                d0 d0Var = (d0) this.f213c;
                float f10 = d0Var.f13977u;
                float f11 = rect.bottom;
                if (f10 != f11 && d0Var.v) {
                    d0Var.f13977u = f11;
                    e eVar = d0Var.f13962c;
                    c0 c0Var = d0Var.f13960a;
                    if (!d0Var.f13973q) {
                        float f12 = d0Var.f13976t;
                        int dp = AndroidUtilities.dp(32.0f);
                        int i10 = d0Var.f13980y;
                        if (i10 == 1 || i10 == 2) {
                            dp = AndroidUtilities.dp(24.0f);
                        }
                        float f13 = dp;
                        if (c0Var.getMeasuredHeight() + f12 > (eVar.getMeasuredHeight() - d0Var.f13977u) - f13) {
                            f12 = ((eVar.getMeasuredHeight() - d0Var.f13977u) - c0Var.getMeasuredHeight()) - f13;
                        }
                        if (f12 < 0.0f) {
                            f12 = 0.0f;
                        }
                        c0Var.animate().translationY(f12).setDuration(250L).setUpdateListener(new y(d0Var, 1)).setInterpolator(mr.f27122f).start();
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
            case 29:
                super.invalidate();
                r0 r0Var = ((jd1) this.f213c).f35220q0;
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
        switch (this.f211a) {
            case 5:
                super.onAttachedToWindow();
                ((o) this.f212b).c();
                return;
            case 6:
                super.onAttachedToWindow();
                ic.a(this, (t0) this.f212b);
                return;
            case 19:
                super.onAttachedToWindow();
                rt rtVar = (rt) this.f213c;
                rtVar.A.onAttachedToWindow();
                rtVar.B.onAttachedToWindow();
                return;
            case 22:
                super.onAttachedToWindow();
                ((ProfileActivity) this.f213c).f32105o5.onAttachedToWindow();
                return;
            case 24:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.f212b).h.onAttachedToWindow();
                return;
            case 27:
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
            case 17:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                g1 g1Var = (g1) this.f213c;
                AndroidUtilities.setPreferredMaxRefreshRate(g1Var.f29610b, g1Var.d, g1Var.f29611c);
                g1Var.i(false);
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f211a) {
            case 5:
                super.onDetachedFromWindow();
                ((o) this.f212b).d();
                return;
            case 6:
                super.onDetachedFromWindow();
                ic.h(this);
                return;
            case 19:
                super.onDetachedFromWindow();
                rt rtVar = (rt) this.f213c;
                rtVar.A.onDetachedFromWindow();
                rtVar.B.onDetachedFromWindow();
                return;
            case 22:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.f213c).f32105o5.onDetachedFromWindow();
                return;
            case 24:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.f212b).h.onDetachedFromWindow();
                return;
            case 27:
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
        throw new UnsupportedOperationException("Method not decompiled: ah.e.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        xc xcVar;
        switch (this.f211a) {
            case 22:
                if ((((ProfileActivity) this.f213c).f32078k5 == 0.0f && (xcVar = (xc) this.f212b) != null && xcVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent)) {
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
            case 20:
                super.onLayout(z4, i10, i11, i12, i13);
                int i14 = (i13 - i11) / 4;
                int i15 = i14 * 3;
                int x10 = org.telegram.ui.b.x(275.0f, i15, 2);
                w70 w70Var = (w70) this.f213c;
                FrameLayout frameLayout = w70Var.f39292r;
                int i16 = 0;
                frameLayout.layout(0, x10, frameLayout.getMeasuredWidth(), w70Var.f39292r.getMeasuredHeight() + x10);
                int dp = AndroidUtilities.dp(139.0f) + AndroidUtilities.dp(150.0f) + x10;
                int measuredWidth = (getMeasuredWidth() - w70Var.e.getMeasuredWidth()) / 2;
                ka kaVar = w70Var.e;
                kaVar.layout(measuredWidth, dp, kaVar.getMeasuredWidth() + measuredWidth, w70Var.e.getMeasuredHeight() + dp);
                h hVar = w70Var.d;
                hVar.layout(0, 0, hVar.getMeasuredWidth(), w70Var.d.getMeasuredHeight());
                int measuredHeight = ((i14 - w70Var.f39291n.getMeasuredHeight()) / 2) + i15;
                int measuredWidth2 = (getMeasuredWidth() - w70Var.f39291n.getMeasuredWidth()) / 2;
                s0 s0Var = w70Var.f39291n;
                s0Var.layout(measuredWidth2, measuredHeight, s0Var.getMeasuredWidth() + measuredWidth2, w70Var.f39291n.getMeasuredHeight() + measuredHeight);
                int dp2 = measuredHeight - AndroidUtilities.dp(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - w70Var.f39290f.getMeasuredWidth()) / 2;
                TextView textView = w70Var.f39290f;
                textView.layout(measuredWidth3, dp2 - textView.getMeasuredHeight(), w70Var.f39290f.getMeasuredWidth() + measuredWidth3, dp2);
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
            case 21:
                int dp4 = AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(150.0f) + org.telegram.ui.b.x(275.0f, ((i13 - i11) / 4) * 3, 2);
                int dp5 = AndroidUtilities.dp(18.0f);
                TextView textView2 = (TextView) this.f212b;
                textView2.layout(dp5, dp4, textView2.getMeasuredWidth() + dp5, textView2.getMeasuredHeight() + dp4);
                int dp6 = AndroidUtilities.dp(18.0f) + dp4 + ((int) textView2.getTextSize());
                int dp7 = AndroidUtilities.dp(16.0f);
                TextView textView3 = (TextView) this.f213c;
                textView3.layout(dp7, dp6, textView3.getMeasuredWidth() + dp7, textView3.getMeasuredHeight() + dp6);
                return;
            case 22:
                super.onLayout(z4, i10, i11, i12, i13);
                ((ProfileActivity) this.f213c).V4();
                return;
            case 23:
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
            case 24:
                super.onLayout(z4, i10, i11, i12, i13);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f213c;
                if (secretMediaViewer.f32226n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f32226n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight;
                    p41 p41Var = secretMediaViewer.f32226n;
                    p41Var.layout(p41Var.getLeft(), currentActionBarHeight, secretMediaViewer.f32226n.getRight(), secretMediaViewer.f32226n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.f32235r != null && secretMediaViewer.f32226n != null) {
                    int measuredHeight2 = (secretMediaViewer.f32226n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f32226n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight)) - AndroidUtilities.dp(10.0f);
                    f3 f3Var = secretMediaViewer.f32235r;
                    f3Var.layout(f3Var.getLeft(), measuredHeight2, secretMediaViewer.f32235r.getRight(), secretMediaViewer.f32235r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.X != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                    nt0 nt0Var = secretMediaViewer.X;
                    nt0Var.layout(nt0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.X.getRight(), secretMediaViewer.X.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f32211f;
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
        switch (this.f211a) {
            case 2:
                super.onMeasure(i10, org.telegram.ui.b.B(2.0f, ((o1) this.f213c).f5385s, 1073741824));
                return;
            case 7:
                super.onMeasure(i10, i11);
                super.onMeasure(i10, org.telegram.ui.b.B(8.0f, ((LinearLayout) this.f212b).getMeasuredHeight(), 1073741824));
                return;
            case 12:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                return;
            case 14:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
                setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                return;
            case 23:
                t21 t21Var = (t21) this.f213c;
                View view = t21Var.E;
                View view2 = t21Var.F;
                LinearLayout linearLayout = t21Var.v;
                TextView textView = t21Var.f38367s;
                rl0 rl0Var = t21Var.f38370y;
                boolean z4 = t21Var.P.M;
                int dp = AndroidUtilities.dp(12.0f);
                if (z4) {
                    rl0Var.setLayoutParams(b6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
                    rl0Var.setPadding(dp, 0, dp, 0);
                    if (linearLayout != null) {
                        textView.setLayoutParams(b6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(b6.d(-1, 48.0f, 8388691, 16.0f, 162.0f, 16.0f, 16.0f));
                    } else {
                        textView.setLayoutParams(b6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
                    }
                } else {
                    rl0Var.setPadding(dp, dp / 2, dp, dp);
                    if (linearLayout != null) {
                        rl0Var.setLayoutParams(b6.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 136.0f));
                        textView.setLayoutParams(b6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(b6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                    } else {
                        rl0Var.setLayoutParams(b6.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 80.0f));
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
                if (t21Var.O != z4) {
                    u21 u21Var = t21Var.d;
                    if (z4) {
                        u21Var.getParentActivity();
                        wVar = new i0(0, false);
                    } else {
                        u21Var.getParentActivity();
                        wVar = new w(3, false);
                    }
                    t21Var.D = wVar;
                    rl0Var.setLayoutManager(wVar);
                    rl0Var.requestLayout();
                    int i13 = t21Var.I;
                    if (i13 != -1) {
                        t21Var.b(i13);
                    }
                    t21Var.O = z4;
                }
                super.onMeasure(i10, i11);
                return;
            case 24:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f213c;
                nt0 nt0Var = secretMediaViewer.X;
                if (nt0Var != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                    int currentActionBarHeight = (measuredHeight2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                    if (secretMediaViewer.R.getVisibility() != 0) {
                        measuredHeight = 0;
                    } else {
                        measuredHeight = secretMediaViewer.R.getMeasuredHeight();
                    }
                    nt0Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(currentActionBarHeight - measuredHeight, 1073741824));
                }
                View view3 = secretMediaViewer.f32211f;
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
            case 0:
                super.onSizeChanged(i10, i11, i12, i13);
                b0 b0Var = (b0) this.f213c;
                b0Var.setBounds(0, 0, i10, i11);
                b0Var.c(0, AndroidUtilities.dp(24.0f) + getPaddingBottom());
                return;
            case 17:
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
        throw new UnsupportedOperationException("Method not decompiled: ah.e.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setBackgroundColor(int i10) {
        switch (this.f211a) {
            case 15:
                ((Paint) this.f212b).setColor(i10);
                return;
            default:
                super.setBackgroundColor(i10);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f211a) {
            case 14:
                if (((j6) this.f212b) != drawable && ((j6) this.f213c) != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 23:
                if (drawable != ((t21) this.f213c).f38364f && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public e(Object obj, Context context, int i10) {
        super(context);
        this.f211a = i10;
        this.f213c = obj;
    }

    public e(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, Object obj, int i10) {
        super(context);
        this.f211a = i10;
        this.f213c = notificationCenterDelegate;
        this.f212b = obj;
    }

    public e(Context context, int i10, f6 f6Var) {
        super(context);
        this.f211a = i10;
        switch (i10) {
            case 3:
                super(context);
                LinearLayout f10 = y3.f(context, 1);
                k6 k6Var = new k6(context, false, false, false);
                this.f212b = k6Var;
                int i11 = org.telegram.ui.ActionBar.j6.G6;
                k6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
                k6Var.setTextSize(AndroidUtilities.dp(17.0f));
                k6Var.setTypeface(AndroidUtilities.bold());
                f10.addView(k6Var, b6.q(-2, 23, 1));
                TextView textView = new TextView(context);
                this.f213c = textView;
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
                this.f212b = j6Var;
                mr mrVar = mr.h;
                j6Var.k(0.3f, 430L, mrVar);
                j6Var.u(AndroidUtilities.bold());
                j6Var.r(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A8, f6Var));
                j6Var.t(AndroidUtilities.dp(18.0f));
                j6Var.n(!LocaleController.isRTL);
                j6Var.setCallback(this);
                j6Var.G = AndroidUtilities.displaySize.x;
                j6 j6Var2 = new j6(true, true, true, false);
                this.f213c = j6Var2;
                j6Var2.k(0.3f, 430L, mrVar);
                j6Var2.r(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B8, f6Var));
                j6Var2.t(AndroidUtilities.dp(14.0f));
                j6Var2.n(true ^ LocaleController.isRTL);
                j6Var2.setCallback(this);
                j6Var2.G = AndroidUtilities.displaySize.x;
                return;
            default:
                this.f213c = new b0(8);
                this.f212b = f6Var;
                return;
        }
    }

    private final void a(boolean z4) {
    }

    public e(y0 y0Var, Context context) {
        super(context);
        this.f211a = 9;
        this.f213c = y0Var;
        this.f212b = new RectF();
    }

    public e(d0 d0Var, Context context) {
        super(context);
        this.f211a = 6;
        this.f213c = d0Var;
        this.f212b = new t0(this, 1);
    }

    public e(w41 w41Var, Context context) {
        super(context);
        this.f211a = 25;
        this.f213c = w41Var;
        this.f212b = new Path();
    }

    public e(ac acVar, Context context) {
        super(context);
        this.f211a = 10;
        this.f213c = acVar;
        this.f212b = new Paint(1);
    }

    public e(s sVar, Context context) {
        super(context);
        this.f211a = 5;
        this.f213c = sVar;
        this.f212b = new o(this, this);
    }

    public e(t5 t5Var, Activity activity) {
        super(activity);
        this.f211a = 8;
        this.f213c = t5Var;
        this.f212b = new Paint(1);
    }

    public e(g1 g1Var, Context context) {
        super(context);
        this.f211a = 17;
        this.f213c = g1Var;
        this.f212b = new Path();
    }

    public e(wd0 wd0Var, Context context) {
        super(context);
        this.f211a = 15;
        this.f213c = wd0Var;
        this.f212b = new Paint();
    }

    public e(Context context, TextView textView, TextView textView2) {
        super(context);
        this.f211a = 21;
        this.f212b = textView;
        this.f213c = textView2;
    }

    public e(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f211a = 24;
        this.f213c = secretMediaViewer;
        this.f212b = secretMediaViewer;
        setWillNotDraw(false);
    }

    public e(x61 x61Var, Context context) {
        super(context);
        this.f211a = 26;
        this.f213c = x61Var;
        this.f212b = new Rect();
    }

    public e(t21 t21Var, Activity activity, u21 u21Var) {
        super(activity);
        this.f211a = 23;
        this.f213c = t21Var;
        Rect rect = new Rect();
        this.f212b = rect;
        t21Var.f38361a.setColor(u21Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6));
        Drawable drawable = t21Var.f38364f;
        drawable.setCallback(this);
        drawable.getPadding(rect);
    }

    public e(jp jpVar, Context context) {
        super(context);
        this.f211a = 12;
        this.f213c = jpVar;
        this.f212b = new Paint();
    }

    public e(rt rtVar, Activity activity) {
        super(activity);
        this.f211a = 19;
        this.f213c = rtVar;
        this.f212b = rtVar;
        setWillNotDraw(false);
    }

    public e(jd1 jd1Var, Context context, int i10) {
        super(context);
        this.f211a = i10;
        switch (i10) {
            case 29:
                this.f213c = jd1Var;
                super(context);
                this.f212b = new int[2];
                return;
            default:
                this.f213c = jd1Var;
                this.f212b = new Paint();
                return;
        }
    }

    public e(c1 c1Var, Context context) {
        super(context);
        this.f211a = 1;
        this.f213c = c1Var;
        this.f212b = new Path();
    }

    public e(pk0 pk0Var, Context context) {
        super(context);
        this.f211a = 16;
        this.f213c = pk0Var;
        this.f212b = new Paint(1);
    }

    public e(Context context) {
        super(context);
        this.f211a = 11;
        this.f212b = new Path();
        this.f213c = new i20();
    }
}
