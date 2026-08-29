package bg;

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
import i7.f6;
import nh.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.Cells.w9;
import org.telegram.ui.Components.ad;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.gp;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n6;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.pa;
import org.telegram.ui.Components.ry;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.a21;
import org.telegram.ui.d61;
import org.telegram.ui.f41;
import org.telegram.ui.g51;
import org.telegram.ui.h51;
import org.telegram.ui.ht;
import org.telegram.ui.i51;
import org.telegram.ui.k70;
import org.telegram.ui.ky0;
import org.telegram.ui.m4;
import org.telegram.ui.m51;
import org.telegram.ui.p5;
import org.telegram.ui.qc1;
import org.telegram.ui.u10;
import org.telegram.ui.ub;
import org.telegram.ui.xs0;
import org.telegram.ui.y31;
import org.telegram.ui.z11;
public final class d1 extends FrameLayout {
    public final int f2145a;
    public Object f2146b;
    public Object f2147c;

    public d1(Context context, int i10) {
        super(context);
        this.f2145a = i10;
    }

    public void b(int i10, CharSequence charSequence, boolean z10) {
        ImageView imageView = (ImageView) this.f2146b;
        if (z10) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
        ((TextView) this.f2147c).setText(charSequence);
    }

    public void c(String str, boolean z10) {
        boolean z11;
        n6 n6Var = (n6) this.f2147c;
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        n6Var.q(str, z11, true);
    }

    public void d(String str, boolean z10) {
        boolean z11;
        n6 n6Var = (n6) this.f2146b;
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        n6Var.q(str, z11, true);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        c6 c6Var;
        Paint paint;
        boolean a12;
        int k9;
        h5[] h5VarArr;
        char c3;
        float f9;
        ?? r10;
        float f10;
        float f11;
        org.telegram.ui.Cells.z zVar;
        float f12;
        switch (this.f2145a) {
            case 1:
                ((cg.r1) this.f2146b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, AndroidUtilities.dp(2.0f), getMeasuredWidth(), AndroidUtilities.dp(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                cg.r1 r1Var = (cg.r1) this.f2146b;
                r1Var.f3319f.setAlpha(((cg.p1) this.f2147c).G);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(24.0f) - 1, AndroidUtilities.dp(24.0f) - 1, r1Var.f3319f);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            case 8:
                super.dispatchDraw(canvas);
                Paint paint2 = (Paint) this.f2146b;
                int i10 = g6.f23009a7;
                c6Var = ((org.telegram.ui.ActionBar.o2) ((p5) this.f2147c).d).resourceProvider;
                paint2.setColor(g6.v0(i10, c6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint2);
                return;
            case 9:
                RectF rectF2 = (RectF) this.f2146b;
                rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Cells.y0 y0Var = (org.telegram.ui.Cells.y0) this.f2147c;
                int measuredWidth = y0Var.getMeasuredWidth();
                int i11 = y0Var.d;
                float x4 = y0Var.getX();
                float f13 = y0Var.f25981c;
                c6 c6Var2 = y0Var.f25980b;
                if (c6Var2 != null) {
                    c6Var2.l(x4, f13, measuredWidth, i11);
                } else {
                    g6.q(x4, f13, measuredWidth, i11);
                }
                float dp = AndroidUtilities.dp(18.0f);
                float dp2 = AndroidUtilities.dp(18.0f);
                Paint paint3 = null;
                if (c6Var2 != null) {
                    paint = c6Var2.G("paintChatActionBackground");
                } else {
                    paint = null;
                }
                if (paint == null) {
                    paint = g6.S0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF2, dp, dp2, paint);
                if (c6Var2 != null) {
                    a12 = c6Var2.l0();
                } else {
                    a12 = g6.a1();
                }
                if (a12) {
                    float dp3 = AndroidUtilities.dp(18.0f);
                    float dp4 = AndroidUtilities.dp(18.0f);
                    if (c6Var2 != null) {
                        paint3 = c6Var2.G("paintChatActionBackgroundDarken");
                    }
                    if (paint3 == null) {
                        paint3 = g6.S0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF2, dp3, dp4, paint3);
                }
                super.dispatchDraw(canvas);
                return;
            case 10:
                super.dispatchDraw(canvas);
                Paint paint4 = (Paint) this.f2146b;
                paint4.setColor(g6.v0(g6.f23009a7, ((ub) this.f2147c).f43213f.f43919e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint4);
                return;
            case 11:
                float dp5 = AndroidUtilities.dp(20.0f);
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.f2146b;
                path.rewind();
                path.addRoundRect(rectF3, dp5, dp5, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF3, 255, 31);
                super.dispatchDraw(canvas);
                rectF3.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), AndroidUtilities.dp(6.0f) + getPaddingTop());
                u10 u10Var = (u10) this.f2147c;
                u10Var.b(canvas, rectF3, 1, 1.0f);
                rectF3.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                u10Var.b(canvas, rectF3, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                return;
            case 12:
                super.dispatchDraw(canvas);
                Paint paint5 = (Paint) this.f2146b;
                paint5.setColor(((gp) this.f2147c).getThemedColor(g6.f23063d7));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint5);
                return;
            case 13:
                ry ryVar = (ry) this.f2147c;
                if (!ryVar.C.f28625q0 && ryVar.f32417w > 0.0f) {
                    if (((Paint) this.f2146b) == null) {
                        Paint paint6 = new Paint();
                        this.f2146b = paint6;
                        paint6.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f2146b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f2146b).setAlpha((int) (ryVar.f32417w * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f2146b);
                    canvas.restore();
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 14:
                n6 n6Var = (n6) this.f2146b;
                int dp6 = AndroidUtilities.dp(29.0f);
                int dp7 = AndroidUtilities.dp(18.83f);
                n6 n6Var2 = (n6) this.f2147c;
                n6Var.setBounds(getPaddingLeft(), r3 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r3);
                n6Var.draw(canvas);
                n6Var2.setBounds(getPaddingLeft(), r2 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r2);
                n6Var2.draw(canvas);
                return;
            case 16:
                Paint paint7 = (Paint) this.f2146b;
                fk0 fk0Var = (fk0) this.f2147c;
                int i12 = fk0Var.I0;
                if (i12 != 1 && i12 != 2 && i12 != 4) {
                    k9 = i0.a.d(0.7f, g6.v0(g6.F8, fk0Var.f28448g0), g6.v0(g6.f23133h5, fk0Var.f28448g0));
                } else {
                    k9 = i0.a.k(-1, 30);
                }
                paint7.setColor(k9);
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - AndroidUtilities.dpf2(6.0f)) / 2.0f;
                float g10 = fk0Var.g();
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
                ProfileActivity profileActivity = (ProfileActivity) this.f2147c;
                h5[] h5VarArr2 = profileActivity.f36103r;
                if (profileActivity.S4 != null) {
                    canvas.save();
                    canvas.translate(h5VarArr2[0].getX(), h5VarArr2[0].getY());
                    h5VarArr = h5VarArr2;
                    c3 = 2;
                    f9 = 0.0f;
                    r10 = 0;
                    f10 = 24.0f;
                    f11 = 14.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.S4.getMeasuredWidth(), profileActivity.S4.getMeasuredHeight(), (int) ((1.0f - profileActivity.O1) * 255.0f), 31);
                    profileActivity.S4.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    h5VarArr = h5VarArr2;
                    c3 = 2;
                    f9 = 0.0f;
                    r10 = 0;
                    f10 = 24.0f;
                    f11 = 14.0f;
                }
                if (profileActivity.f36067l5 && profileActivity.U5 != f9 && profileActivity.f36054j5 != 1.0f) {
                    float measuredHeight2 = (h5VarArr[1].getMeasuredHeight() / 2.0f) + h5VarArr[1].getY();
                    float dp8 = AndroidUtilities.dp(22.0f);
                    float x10 = ((h5VarArr[1].getX() + (AndroidUtilities.dp(28.0f) - profileActivity.f36061k5)) - dp8) - profileActivity.Z3();
                    profileActivity.f36081n5.setImageCoords(x10, measuredHeight2 - (dp8 / 2.0f), dp8, dp8);
                    profileActivity.f36081n5.setAlpha(profileActivity.U5);
                    canvas.save();
                    float f14 = profileActivity.U5;
                    canvas.scale(f14, f14, profileActivity.f36081n5.getCenterX(), profileActivity.f36081n5.getCenterY());
                    profileActivity.f36081n5.draw(canvas);
                    canvas.restore();
                    if (profileActivity.f36054j5 == f9) {
                        if (((ad) this.f2146b) == null) {
                            ad adVar = new ad(this);
                            this.f2146b = adVar;
                            adVar.h = new ky0(this, r10);
                        }
                        float dp9 = (1.0f - profileActivity.f36054j5) * AndroidUtilities.dp(28.0f);
                        float textWidth = h5VarArr[c3].getTextWidth();
                        if (profileActivity.P != null) {
                            f12 = (AndroidUtilities.dp(f10) + textWidth + AndroidUtilities.dp(4.0f)) * profileActivity.P.getVisibilityFactor();
                        } else {
                            f12 = 0.0f;
                        }
                        RectF rectF5 = AndroidUtilities.rectTmp;
                        rectF5.set(x10 - AndroidUtilities.dp(4.0f), measuredHeight2 - AndroidUtilities.dp(f11), x10 + Math.max(textWidth, f12) + dp9 + AndroidUtilities.dp(4.0f), measuredHeight2 + AndroidUtilities.dp(f11));
                        ad adVar2 = (ad) this.f2146b;
                        adVar2.f26745i = r10;
                        adVar2.f26741c = r10;
                        adVar2.a(rectF5);
                        ad adVar3 = (ad) this.f2146b;
                        adVar3.f26750n = true;
                        int k10 = i0.a.k(-1, 50);
                        adVar3.f26744g.setColor((int) r10);
                        org.telegram.ui.Cells.z zVar2 = adVar3.f26742e;
                        if (zVar2 != null) {
                            g6.B1(zVar2, k10, true);
                        }
                        ad adVar4 = (ad) this.f2146b;
                        adVar4.c(canvas, adVar4.f26744g);
                        org.telegram.ui.Cells.z zVar3 = adVar4.f26742e;
                        if (zVar3 != null) {
                            zVar3.draw(canvas);
                            return;
                        }
                        return;
                    }
                    ad adVar5 = (ad) this.f2146b;
                    if (adVar5 != null && (zVar = adVar5.f26742e) != null) {
                        zVar.setState(StateSet.NOTHING);
                        zVar.jumpToCurrentState();
                        return;
                    }
                    return;
                }
                return;
            case 23:
                Rect rect = (Rect) this.f2146b;
                z11 z11Var = (z11) this.f2147c;
                if (z11Var.N) {
                    z11Var.f45028f.setBounds(-rect.left, -rect.top, getWidth() + rect.right, getHeight() + rect.bottom);
                    z11Var.f45028f.draw(canvas);
                } else {
                    RectF rectF6 = AndroidUtilities.rectTmp;
                    rectF6.set(0.0f, 0.0f, AndroidUtilities.dp(14.0f) + getWidth(), getHeight());
                    canvas.drawRoundRect(rectF6, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), z11Var.f45024a);
                }
                super.dispatchDraw(canvas);
                return;
            case 27:
                ImageReceiver imageReceiver = (ImageReceiver) this.f2146b;
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
        switch (this.f2145a) {
            case 5:
                if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
                    kg.d0 d0Var = (kg.d0) this.f2147c;
                    if (!d0Var.f13689k) {
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
    public void dispatchSetPressed(boolean z10) {
        switch (this.f2145a) {
            case 5:
                return;
            default:
                super.dispatchSetPressed(z10);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int dp;
        switch (this.f2145a) {
            case 7:
                m4 m4Var = (m4) this.f2147c;
                w9 o10 = m4Var.L0.o(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.f2146b;
                obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (m4Var.L0.y() && m4Var.L0.o(getContext()).onTouchEvent(obtain)) {
                    return true;
                }
                if (o10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() == 0 && m4Var.L0.y() && (motionEvent.getY() < linearLayout.getTop() || motionEvent.getY() > linearLayout.getBottom())) {
                    if (!m4Var.L0.o(getContext()).onTouchEvent(obtain)) {
                        return true;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            case 17:
                int action = motionEvent.getAction();
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.f2147c;
                if (h1Var.F != null) {
                    MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                    obtain2.offsetLocation(h1Var.F.getX(), h1Var.F.getY());
                    boolean dispatchTouchEvent = h1Var.F.dispatchTouchEvent(motionEvent);
                    obtain2.recycle();
                    if (action == 1 || action == 3) {
                        h1Var.F = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                obtain3.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = h1Var.B.onTouchEvent(obtain3);
                obtain3.recycle();
                if (!h1Var.B.isInProgress() && ((GestureDetector) h1Var.C.f19159b).onTouchEvent(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (action == 1 || action == 3) {
                    h1Var.D = false;
                    h1Var.E = false;
                    o1.k kVar = h1Var.O;
                    if (!kVar.f19039f) {
                        float f9 = h1Var.M;
                        kVar.f19036b = f9;
                        kVar.f19037c = true;
                        o1.l lVar = kVar.f19045u;
                        int i10 = h1Var.I;
                        float f10 = (i10 / 2.0f) + f9;
                        int i11 = AndroidUtilities.displaySize.x;
                        if (f10 >= i11 / 2.0f) {
                            dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        lVar.f19052i = dp;
                        h1Var.O.f();
                    }
                    o1.k kVar2 = h1Var.P;
                    if (!kVar2.f19039f) {
                        float f11 = h1Var.N;
                        kVar2.f19036b = f11;
                        kVar2.f19037c = true;
                        kVar2.f19045u.f19052i = i7.w.a(f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - h1Var.J) - AndroidUtilities.dp(16.0f));
                        h1Var.P.f();
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
        float f9;
        boolean z11;
        float f10;
        switch (this.f2145a) {
            case 0:
                Path path = (Path) this.f2146b;
                e1 e1Var = (e1) this.f2147c;
                if (e1Var.h != null && (((z10 = e1Var.f2173f) && view == e1Var.d) || (!z10 && view == e1Var.f2171c))) {
                    if (z10) {
                        f9 = e1Var.f2172e;
                    } else {
                        f9 = 1.0f - e1Var.f2172e;
                    }
                    canvas.save();
                    path.rewind();
                    path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f9 * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                    canvas.clipPath(path);
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j10);
            case 6:
                Path path2 = (Path) this.f2146b;
                r5 r5Var = (r5) this.f2147c;
                if (r5Var.h != null && (((z11 = r5Var.f18519f) && view == r5Var.d) || (!z11 && view == r5Var.f18517c))) {
                    if (z11) {
                        f10 = r5Var.f18518e;
                    } else {
                        f10 = 1.0f - r5Var.f18518e;
                    }
                    canvas.save();
                    path2.rewind();
                    path2.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f10 * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                    canvas.clipPath(path2);
                    boolean drawChild2 = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild2;
                }
                return super.drawChild(canvas, view, j10);
            case 19:
                if (view instanceof bd0) {
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            case 24:
                if (view != ((SecretMediaViewer) this.f2146b).f36228w && super.drawChild(canvas, view, j10)) {
                    return true;
                }
                return false;
            case 25:
                Path path3 = (Path) this.f2146b;
                f41 f41Var = (f41) this.f2147c;
                RectF rectF = f41Var.N;
                if (view != f41Var.J && view != f41Var.f37997x) {
                    if (view == f41Var.L) {
                        canvas.save();
                        path3.rewind();
                        path3.addCircle(rectF.centerX() + f41Var.J.getX(), rectF.centerY() + f41Var.J.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                        canvas.clipPath(path3);
                        canvas.clipRect(0.0f, AndroidUtilities.lerp(f41Var.P, 0.0f, f41Var.f37995s), getWidth(), AndroidUtilities.lerp(f41Var.Q, getHeight(), f41Var.f37995s));
                        canvas.translate(-f41Var.L.getX(), -f41Var.L.getY());
                        canvas.translate(f41Var.J.getX() + rectF.left, f41Var.J.getY() + rectF.top);
                        canvas.scale(rectF.width() / f41Var.L.getMeasuredWidth(), rectF.height() / f41Var.L.getMeasuredHeight(), f41Var.L.getX(), f41Var.L.getY());
                        boolean drawChild3 = super.drawChild(canvas, view, j10);
                        canvas.restore();
                        return drawChild3;
                    }
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(f41Var.P, 0.0f, f41Var.f37995s), getWidth(), AndroidUtilities.lerp(f41Var.Q, getHeight(), f41Var.f37995s));
                boolean drawChild4 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild4;
            case 26:
                if (view == ((d61) this.f2147c).f37326d0 && kg.g0.f13716b && kg.g0.f13719f) {
                    for (int i10 = 0; i10 < ((d61) this.f2147c).f37326d0.getChildCount(); i10++) {
                        View childAt = ((d61) this.f2147c).f37326d0.getChildAt(i10);
                        if (childAt instanceof m51) {
                            m51 m51Var = (m51) childAt;
                            if (m51Var.getAnimatedScale() == 1.0f) {
                                ((Rect) this.f2146b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                canvas.save();
                                canvas.clipRect((Rect) this.f2146b);
                                super.drawChild(canvas, view, j10);
                                canvas.restore();
                            } else if (m51Var.getAnimatedScale() > 0.0f) {
                                ((Rect) this.f2146b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                Rect rect = (Rect) this.f2146b;
                                rect.set((int) (rect.centerX() - (m51Var.getAnimatedScale() * (((Rect) this.f2146b).width() / 2.0f))), (int) (((Rect) this.f2146b).centerY() - (m51Var.getAnimatedScale() * (((Rect) this.f2146b).height() / 2.0f))), (int) ((m51Var.getAnimatedScale() * (((Rect) this.f2146b).width() / 2.0f)) + ((Rect) this.f2146b).centerX()), (int) ((m51Var.getAnimatedScale() * (((Rect) this.f2146b).height() / 2.0f)) + ((Rect) this.f2146b).centerY()));
                                canvas.save();
                                canvas.clipRect((Rect) this.f2146b);
                                canvas.scale(m51Var.getAnimatedScale(), m51Var.getAnimatedScale(), ((Rect) this.f2146b).centerX(), ((Rect) this.f2146b).centerY());
                                super.drawChild(canvas, view, j10);
                                canvas.restore();
                            }
                        } else if ((childAt instanceof TextView) || (childAt instanceof h51) || (childAt instanceof g51) || (childAt instanceof i51)) {
                            ((Rect) this.f2146b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.f2146b);
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
        switch (this.f2145a) {
            case 5:
                kg.d0 d0Var = (kg.d0) this.f2147c;
                float f9 = d0Var.f13699u;
                float f10 = rect.bottom;
                if (f9 != f10 && d0Var.v) {
                    d0Var.f13699u = f10;
                    d1 d1Var = d0Var.f13683c;
                    kg.c0 c0Var = d0Var.f13681a;
                    if (!d0Var.f13695q) {
                        float f11 = d0Var.f13698t;
                        int dp = AndroidUtilities.dp(32.0f);
                        int i10 = d0Var.f13702y;
                        if (i10 == 1 || i10 == 2) {
                            dp = AndroidUtilities.dp(24.0f);
                        }
                        float f12 = dp;
                        if (c0Var.getMeasuredHeight() + f11 > (d1Var.getMeasuredHeight() - d0Var.f13699u) - f12) {
                            f11 = ((d1Var.getMeasuredHeight() - d0Var.f13699u) - c0Var.getMeasuredHeight()) - f12;
                        }
                        if (f11 < 0.0f) {
                            f11 = 0.0f;
                        }
                        c0Var.animate().translationY(f11).setDuration(250L).setUpdateListener(new kg.y(d0Var, 1)).setInterpolator(jr.f29800f).start();
                    }
                }
                return super.fitSystemWindows(rect);
            default:
                return super.fitSystemWindows(rect);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f2145a) {
            case 29:
                super.invalidate();
                org.telegram.ui.ActionBar.r0 r0Var = ((qc1) this.f2147c).f41662p0;
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
        switch (this.f2145a) {
            case 4:
                super.onAttachedToWindow();
                ((kg.o) this.f2146b).c();
                return;
            case 5:
                super.onAttachedToWindow();
                mc.a(this, (ih.u0) this.f2146b);
                return;
            case 19:
                super.onAttachedToWindow();
                ht htVar = (ht) this.f2147c;
                htVar.A.onAttachedToWindow();
                htVar.B.onAttachedToWindow();
                return;
            case 22:
                super.onAttachedToWindow();
                ((ProfileActivity) this.f2147c).f36081n5.onAttachedToWindow();
                return;
            case 24:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.f2146b).h.onAttachedToWindow();
                return;
            case 27:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f2146b).onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.f2145a) {
            case 17:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.f2147c;
                AndroidUtilities.setPreferredMaxRefreshRate(h1Var.f33732b, h1Var.d, h1Var.f33733c);
                h1Var.i(false);
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f2145a) {
            case 4:
                super.onDetachedFromWindow();
                ((kg.o) this.f2146b).d();
                return;
            case 5:
                super.onDetachedFromWindow();
                mc.h(this);
                return;
            case 19:
                super.onDetachedFromWindow();
                ht htVar = (ht) this.f2147c;
                htVar.A.onDetachedFromWindow();
                htVar.B.onDetachedFromWindow();
                return;
            case 22:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.f2147c).f36081n5.onDetachedFromWindow();
                return;
            case 24:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.f2146b).h.onDetachedFromWindow();
                return;
            case 27:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f2146b).onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: bg.d1.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ad adVar;
        switch (this.f2145a) {
            case 22:
                if ((((ProfileActivity) this.f2147c).f36054j5 == 0.0f && (adVar = (ad) this.f2146b) != null && adVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f2145a) {
            case 20:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = (i13 - i11) / 4;
                int i15 = i14 * 3;
                int x4 = org.telegram.ui.b.x(275.0f, i15, 2);
                k70 k70Var = (k70) this.f2147c;
                FrameLayout frameLayout = k70Var.f39778r;
                int i16 = 0;
                frameLayout.layout(0, x4, frameLayout.getMeasuredWidth(), k70Var.f39778r.getMeasuredHeight() + x4);
                int dp = AndroidUtilities.dp(139.0f) + AndroidUtilities.dp(150.0f) + x4;
                int measuredWidth = (getMeasuredWidth() - k70Var.f39775e.getMeasuredWidth()) / 2;
                pa paVar = k70Var.f39775e;
                paVar.layout(measuredWidth, dp, paVar.getMeasuredWidth() + measuredWidth, k70Var.f39775e.getMeasuredHeight() + dp);
                m2.g gVar = k70Var.d;
                gVar.layout(0, 0, gVar.getMeasuredWidth(), k70Var.d.getMeasuredHeight());
                int measuredHeight = ((i14 - k70Var.f39777n.getMeasuredHeight()) / 2) + i15;
                int measuredWidth2 = (getMeasuredWidth() - k70Var.f39777n.getMeasuredWidth()) / 2;
                cg.s0 s0Var = k70Var.f39777n;
                s0Var.layout(measuredWidth2, measuredHeight, s0Var.getMeasuredWidth() + measuredWidth2, k70Var.f39777n.getMeasuredHeight() + measuredHeight);
                int dp2 = measuredHeight - AndroidUtilities.dp(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - k70Var.f39776f.getMeasuredWidth()) / 2;
                TextView textView = k70Var.f39776f;
                textView.layout(measuredWidth3, dp2 - textView.getMeasuredHeight(), k70Var.f39776f.getMeasuredWidth() + measuredWidth3, dp2);
                FrameLayout frameLayout2 = (FrameLayout) this.f2146b;
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
                TextView textView2 = (TextView) this.f2146b;
                textView2.layout(dp5, dp4, textView2.getMeasuredWidth() + dp5, textView2.getMeasuredHeight() + dp4);
                int dp6 = AndroidUtilities.dp(18.0f) + dp4 + ((int) textView2.getTextSize());
                int dp7 = AndroidUtilities.dp(16.0f);
                TextView textView3 = (TextView) this.f2147c;
                textView3.layout(dp7, dp6, textView3.getMeasuredWidth() + dp7, textView3.getMeasuredHeight() + dp6);
                return;
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.f2147c).V4();
                return;
            case 23:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 24:
                super.onLayout(z10, i10, i11, i12, i13);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f2147c;
                if (secretMediaViewer.f36210n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - secretMediaViewer.f36210n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight;
                    y31 y31Var = secretMediaViewer.f36210n;
                    y31Var.layout(y31Var.getLeft(), currentActionBarHeight, secretMediaViewer.f36210n.getRight(), secretMediaViewer.f36210n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.f36219r != null && secretMediaViewer.f36210n != null) {
                    int measuredHeight2 = (secretMediaViewer.f36210n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - secretMediaViewer.f36210n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight)) - AndroidUtilities.dp(10.0f);
                    nh.t3 t3Var = secretMediaViewer.f36219r;
                    t3Var.layout(t3Var.getLeft(), measuredHeight2, secretMediaViewer.f36219r.getRight(), secretMediaViewer.f36219r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.W != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                    xs0 xs0Var = secretMediaViewer.W;
                    xs0Var.layout(xs0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.W.getRight(), secretMediaViewer.W.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f36195f;
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
        f2.j0 wVar;
        int measuredHeight;
        switch (this.f2145a) {
            case 1:
                super.onMeasure(i10, org.telegram.ui.b.B(2.0f, ((cg.p1) this.f2147c).f3269s, 1073741824));
                return;
            case 7:
                super.onMeasure(i10, i11);
                super.onMeasure(i10, org.telegram.ui.b.B(8.0f, ((LinearLayout) this.f2146b).getMeasuredHeight(), 1073741824));
                return;
            case 12:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                return;
            case 14:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
                setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                return;
            case 23:
                z11 z11Var = (z11) this.f2147c;
                View view = z11Var.D;
                View view2 = z11Var.E;
                LinearLayout linearLayout = z11Var.v;
                TextView textView = z11Var.f45031s;
                jl0 jl0Var = z11Var.f45034y;
                boolean z10 = z11Var.O.L;
                int dp = AndroidUtilities.dp(12.0f);
                if (z10) {
                    jl0Var.setLayoutParams(f6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
                    jl0Var.setPadding(dp, 0, dp, 0);
                    if (linearLayout != null) {
                        textView.setLayoutParams(f6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(f6.d(-1, 48.0f, 8388691, 16.0f, 162.0f, 16.0f, 16.0f));
                    } else {
                        textView.setLayoutParams(f6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
                    }
                } else {
                    jl0Var.setPadding(dp, dp / 2, dp, dp);
                    if (linearLayout != null) {
                        jl0Var.setLayoutParams(f6.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 136.0f));
                        textView.setLayoutParams(f6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(f6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                    } else {
                        jl0Var.setLayoutParams(f6.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 80.0f));
                        textView.setLayoutParams(f6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                    }
                }
                if (z10) {
                    view2.setVisibility(8);
                    view.setVisibility(8);
                } else {
                    if (textView != null) {
                        i12 = 136;
                    } else {
                        i12 = 80;
                    }
                    view2.setVisibility(0);
                    view2.setLayoutParams(f6.d(-1, AndroidUtilities.dp(2.0f), 80, 0.0f, 0.0f, 0.0f, i12));
                    view.setVisibility(0);
                    view.setLayoutParams(f6.d(-1, AndroidUtilities.dp(2.0f), 48, 0.0f, 44.0f, 0.0f, 0.0f));
                }
                if (z11Var.N != z10) {
                    a21 a21Var = z11Var.d;
                    if (z10) {
                        a21Var.getParentActivity();
                        wVar = new f2.j0(0, false);
                    } else {
                        a21Var.getParentActivity();
                        wVar = new f2.w(3, false);
                    }
                    z11Var.C = wVar;
                    jl0Var.setLayoutManager(wVar);
                    jl0Var.requestLayout();
                    int i13 = z11Var.H;
                    if (i13 != -1) {
                        z11Var.b(i13);
                    }
                    z11Var.N = z10;
                }
                super.onMeasure(i10, i11);
                return;
            case 24:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f2147c;
                xs0 xs0Var = secretMediaViewer.W;
                if (xs0Var != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                    int currentActionBarHeight = (measuredHeight2 - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                    if (secretMediaViewer.Q.getVisibility() != 0) {
                        measuredHeight = 0;
                    } else {
                        measuredHeight = secretMediaViewer.Q.getMeasuredHeight();
                    }
                    xs0Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(currentActionBarHeight - measuredHeight, 1073741824));
                }
                View view3 = secretMediaViewer.f36195f;
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
        switch (this.f2145a) {
            case 17:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.f2146b;
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
        throw new UnsupportedOperationException("Method not decompiled: bg.d1.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setBackgroundColor(int i10) {
        switch (this.f2145a) {
            case 15:
                ((Paint) this.f2146b).setColor(i10);
                return;
            default:
                super.setBackgroundColor(i10);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f2145a) {
            case 14:
                if (((n6) this.f2146b) != drawable && ((n6) this.f2147c) != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 23:
                if (drawable != ((z11) this.f2147c).f45028f && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public d1(Object obj, Context context, int i10) {
        super(context);
        this.f2145a = i10;
        this.f2147c = obj;
    }

    public d1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, Context context, Object obj, int i10) {
        super(context);
        this.f2145a = i10;
        this.f2147c = notificationCenterDelegate;
        this.f2146b = obj;
    }

    public d1(org.telegram.ui.Cells.y0 y0Var, Context context) {
        super(context);
        this.f2145a = 9;
        this.f2147c = y0Var;
        this.f2146b = new RectF();
    }

    public d1(kg.d0 d0Var, Context context) {
        super(context);
        this.f2145a = 5;
        this.f2147c = d0Var;
        this.f2146b = new ih.u0(this, 1);
    }

    public d1(f41 f41Var, Context context) {
        super(context);
        this.f2145a = 25;
        this.f2147c = f41Var;
        this.f2146b = new Path();
    }

    public d1(ub ubVar, Context context) {
        super(context);
        this.f2145a = 10;
        this.f2147c = ubVar;
        this.f2146b = new Paint(1);
    }

    public d1(kg.s sVar, Context context) {
        super(context);
        this.f2145a = 4;
        this.f2147c = sVar;
        this.f2146b = new kg.o(this, this);
    }

    public d1(p5 p5Var, Activity activity) {
        super(activity);
        this.f2145a = 8;
        this.f2147c = p5Var;
        this.f2146b = new Paint(1);
    }

    public d1(org.telegram.ui.Components.voip.h1 h1Var, Context context) {
        super(context);
        this.f2145a = 17;
        this.f2147c = h1Var;
        this.f2146b = new Path();
    }

    public d1(nd0 nd0Var, Context context) {
        super(context);
        this.f2145a = 15;
        this.f2147c = nd0Var;
        this.f2146b = new Paint();
    }

    public d1(Context context, TextView textView, TextView textView2) {
        super(context);
        this.f2145a = 21;
        this.f2146b = textView;
        this.f2147c = textView2;
    }

    public d1(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f2145a = 24;
        this.f2147c = secretMediaViewer;
        this.f2146b = secretMediaViewer;
        setWillNotDraw(false);
    }

    public d1(d61 d61Var, Context context) {
        super(context);
        this.f2145a = 26;
        this.f2147c = d61Var;
        this.f2146b = new Rect();
    }

    private final void a(boolean z10) {
    }

    public d1(Context context, int i10, c6 c6Var) {
        super(context);
        this.f2145a = i10;
        switch (i10) {
            case 14:
                super(context);
                n6 n6Var = new n6(true, true, true, false);
                this.f2146b = n6Var;
                jr jrVar = jr.h;
                n6Var.k(0.3f, 430L, jrVar);
                n6Var.u(AndroidUtilities.bold());
                n6Var.r(g6.v0(g6.A8, c6Var));
                n6Var.t(AndroidUtilities.dp(18.0f));
                n6Var.n(!LocaleController.isRTL);
                n6Var.setCallback(this);
                n6Var.G = AndroidUtilities.displaySize.x;
                n6 n6Var2 = new n6(true, true, true, false);
                this.f2147c = n6Var2;
                n6Var2.k(0.3f, 430L, jrVar);
                n6Var2.r(g6.v0(g6.B8, c6Var));
                n6Var2.t(AndroidUtilities.dp(14.0f));
                n6Var2.n(true ^ LocaleController.isRTL);
                n6Var2.setCallback(this);
                n6Var2.G = AndroidUtilities.displaySize.x;
                return;
            default:
                LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
                o6 o6Var = new o6(context, false, false, false);
                this.f2146b = o6Var;
                int i11 = g6.G6;
                o6Var.setTextColor(g6.v0(i11, c6Var));
                o6Var.setTextSize(AndroidUtilities.dp(17.0f));
                o6Var.setTypeface(AndroidUtilities.bold());
                g10.addView(o6Var, f6.q(-2, 23, 1));
                TextView textView = new TextView(context);
                this.f2147c = textView;
                textView.setTextSize(1, 11.0f);
                textView.setTextColor(g6.v0(i11, c6Var));
                textView.setSingleLine();
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                g10.addView(textView, f6.q(-2, -2, 1));
                addView(g10, f6.e(-2, -2, 17));
                return;
        }
    }

    public d1(z11 z11Var, Activity activity, a21 a21Var) {
        super(activity);
        this.f2145a = 23;
        this.f2147c = z11Var;
        Rect rect = new Rect();
        this.f2146b = rect;
        z11Var.f45024a.setColor(a21Var.getThemedColor(g6.f23062d6));
        Drawable drawable = z11Var.f45028f;
        drawable.setCallback(this);
        drawable.getPadding(rect);
    }

    public d1(gp gpVar, Context context) {
        super(context);
        this.f2145a = 12;
        this.f2147c = gpVar;
        this.f2146b = new Paint();
    }

    public d1(ht htVar, Activity activity) {
        super(activity);
        this.f2145a = 19;
        this.f2147c = htVar;
        this.f2146b = htVar;
        setWillNotDraw(false);
    }

    public d1(qc1 qc1Var, Context context, int i10) {
        super(context);
        this.f2145a = i10;
        switch (i10) {
            case 29:
                this.f2147c = qc1Var;
                super(context);
                this.f2146b = new int[2];
                return;
            default:
                this.f2147c = qc1Var;
                this.f2146b = new Paint();
                return;
        }
    }

    public d1(e1 e1Var, Context context) {
        super(context);
        this.f2145a = 0;
        this.f2147c = e1Var;
        this.f2146b = new Path();
    }

    public d1(fk0 fk0Var, Context context) {
        super(context);
        this.f2145a = 16;
        this.f2147c = fk0Var;
        this.f2146b = new Paint(1);
    }

    public d1(Context context) {
        super(context);
        this.f2145a = 11;
        this.f2146b = new Path();
        this.f2147c = new u10();
    }

    public d1(r5 r5Var, Context context) {
        super(context);
        this.f2145a = 6;
        this.f2147c = r5Var;
        this.f2146b = new Path();
    }
}
