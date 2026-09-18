package ci;

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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.wh;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.mp;
import org.telegram.ui.Components.pd0;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xy;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.b51;
import org.telegram.ui.bu0;
import org.telegram.ui.d31;
import org.telegram.ui.d80;
import org.telegram.ui.e31;
import org.telegram.ui.g71;
import org.telegram.ui.i51;
import org.telegram.ui.j61;
import org.telegram.ui.k61;
import org.telegram.ui.l20;
import org.telegram.ui.l61;
import org.telegram.ui.p61;
import org.telegram.ui.sl0;
import org.telegram.ui.st;
import org.telegram.ui.vd1;
public final class n6 extends FrameLayout {
    public final int f5073a;
    public Object f5074b;
    public Object f5075c;

    public n6(Object obj, Context context, int i10) {
        super(context);
        this.f5073a = i10;
        this.f5075c = obj;
    }

    public void a(String str, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) this.f5075c;
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        o6Var.q(str, z11, true);
    }

    public void b(String str, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) this.f5074b;
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        o6Var.q(str, z11, true);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.e6 e6Var;
        Paint paint;
        boolean a12;
        int k10;
        org.telegram.ui.ActionBar.j5[] j5VarArr;
        float f7;
        ?? r92;
        char c10;
        float f10;
        float f11;
        org.telegram.ui.Cells.z zVar;
        float f12;
        switch (this.f5073a) {
            case 3:
                yf.z zVar2 = (yf.z) this.f5075c;
                zVar2.b(org.telegram.ui.ActionBar.j6.l1(0.65f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19062d6, (org.telegram.ui.ActionBar.e6) this.f5074b)));
                zVar2.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 5:
                super.dispatchDraw(canvas);
                Paint paint2 = (Paint) this.f5074b;
                int i10 = org.telegram.ui.ActionBar.j6.f19006a7;
                e6Var = ((org.telegram.ui.ActionBar.n2) ((org.telegram.ui.o5) this.f5075c).d).resourceProvider;
                paint2.setColor(org.telegram.ui.ActionBar.j6.v0(i10, e6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint2);
                return;
            case 6:
                RectF rectF = (RectF) this.f5074b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Cells.z0 z0Var = (org.telegram.ui.Cells.z0) this.f5075c;
                int measuredWidth = z0Var.getMeasuredWidth();
                int i11 = z0Var.d;
                float x10 = z0Var.getX();
                float f13 = z0Var.f21866c;
                org.telegram.ui.ActionBar.e6 e6Var2 = z0Var.f21865b;
                if (e6Var2 != null) {
                    e6Var2.m(x10, f13, measuredWidth, i11);
                } else {
                    org.telegram.ui.ActionBar.j6.q(x10, f13, measuredWidth, i11);
                }
                float dp = AndroidUtilities.dp(18.0f);
                float dp2 = AndroidUtilities.dp(18.0f);
                Paint paint3 = null;
                if (e6Var2 != null) {
                    paint = e6Var2.G("paintChatActionBackground");
                } else {
                    paint = null;
                }
                if (paint == null) {
                    paint = org.telegram.ui.ActionBar.j6.S0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, dp, dp2, paint);
                if (e6Var2 != null) {
                    a12 = e6Var2.p0();
                } else {
                    a12 = org.telegram.ui.ActionBar.j6.a1();
                }
                if (a12) {
                    float dp3 = AndroidUtilities.dp(18.0f);
                    float dp4 = AndroidUtilities.dp(18.0f);
                    if (e6Var2 != null) {
                        paint3 = e6Var2.G("paintChatActionBackgroundDarken");
                    }
                    if (paint3 == null) {
                        paint3 = org.telegram.ui.ActionBar.j6.S0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF, dp3, dp4, paint3);
                }
                super.dispatchDraw(canvas);
                return;
            case 7:
                super.dispatchDraw(canvas);
                Paint paint4 = (Paint) this.f5074b;
                paint4.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19006a7, ((org.telegram.ui.bc) this.f5075c).f32304f.e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint4);
                return;
            case 8:
                float dp5 = AndroidUtilities.dp(20.0f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.f5074b;
                path.rewind();
                path.addRoundRect(rectF2, dp5, dp5, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF2, 255, 31);
                super.dispatchDraw(canvas);
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), AndroidUtilities.dp(6.0f) + getPaddingTop());
                l20 l20Var = (l20) this.f5075c;
                l20Var.b(canvas, rectF2, 1, 1.0f);
                rectF2.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                l20Var.b(canvas, rectF2, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                return;
            case 9:
                super.dispatchDraw(canvas);
                Paint paint5 = (Paint) this.f5074b;
                paint5.setColor(((mp) this.f5075c).getThemedColor(org.telegram.ui.ActionBar.j6.f19063d7));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint5);
                return;
            case 10:
                xy xyVar = (xy) this.f5075c;
                if (!xyVar.G.f25947u0 && xyVar.f30400w > 0.0f) {
                    if (((Paint) this.f5074b) == null) {
                        Paint paint6 = new Paint();
                        this.f5074b = paint6;
                        paint6.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f5074b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f5074b).setAlpha((int) (xyVar.f30400w * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f5074b);
                    canvas.restore();
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 11:
                org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) this.f5074b;
                int dp6 = AndroidUtilities.dp(29.0f);
                int dp7 = AndroidUtilities.dp(18.83f);
                org.telegram.ui.Components.o6 o6Var2 = (org.telegram.ui.Components.o6) this.f5075c;
                o6Var.setBounds(getPaddingLeft(), r3 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r3);
                o6Var.draw(canvas);
                o6Var2.setBounds(getPaddingLeft(), r2 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r2);
                o6Var2.draw(canvas);
                return;
            case 13:
                Paint paint7 = (Paint) this.f5074b;
                qk0 qk0Var = (qk0) this.f5075c;
                int i12 = qk0Var.M0;
                if (i12 != 1 && i12 != 2 && i12 != 4) {
                    k10 = i0.a.d(0.7f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, qk0Var.f27658k0), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19133h5, qk0Var.f27658k0));
                } else {
                    k10 = i0.a.k(-1, 30);
                }
                paint7.setColor(k10);
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - AndroidUtilities.dpf2(6.0f)) / 2.0f;
                float g10 = qk0Var.g();
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
            case 19:
                super.dispatchDraw(canvas);
                ProfileActivity profileActivity = (ProfileActivity) this.f5075c;
                org.telegram.ui.ActionBar.j5[] j5VarArr2 = profileActivity.f31599r;
                if (profileActivity.W4 != null) {
                    canvas.save();
                    canvas.translate(j5VarArr2[0].getX(), j5VarArr2[0].getY());
                    j5VarArr = j5VarArr2;
                    f7 = 0.0f;
                    r92 = 0;
                    c10 = 2;
                    f10 = 14.0f;
                    f11 = 24.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.W4.getMeasuredWidth(), profileActivity.W4.getMeasuredHeight(), (int) ((1.0f - profileActivity.S1) * 255.0f), 31);
                    profileActivity.W4.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    j5VarArr = j5VarArr2;
                    f7 = 0.0f;
                    r92 = 0;
                    c10 = 2;
                    f10 = 14.0f;
                    f11 = 24.0f;
                }
                if (profileActivity.p5 && profileActivity.Y5 != f7 && profileActivity.f31578n5 != 1.0f) {
                    float measuredHeight2 = (j5VarArr[1].getMeasuredHeight() / 2.0f) + j5VarArr[1].getY();
                    float dp8 = AndroidUtilities.dp(22.0f);
                    float x11 = ((j5VarArr[1].getX() + (AndroidUtilities.dp(28.0f) - profileActivity.f31585o5)) - dp8) - profileActivity.Z3();
                    profileActivity.f31605r5.setImageCoords(x11, measuredHeight2 - (dp8 / 2.0f), dp8, dp8);
                    profileActivity.f31605r5.setAlpha(profileActivity.Y5);
                    canvas.save();
                    float f14 = profileActivity.Y5;
                    canvas.scale(f14, f14, profileActivity.f31605r5.getCenterX(), profileActivity.f31605r5.getCenterY());
                    profileActivity.f31605r5.draw(canvas);
                    canvas.restore();
                    if (profileActivity.f31578n5 == f7) {
                        if (((org.telegram.ui.Components.fd) this.f5074b) == null) {
                            org.telegram.ui.Components.fd fdVar = new org.telegram.ui.Components.fd(this);
                            this.f5074b = fdVar;
                            fdVar.h = new sl0(this, 29);
                        }
                        float dp9 = (1.0f - profileActivity.f31578n5) * AndroidUtilities.dp(28.0f);
                        float textWidth = j5VarArr[c10].getTextWidth();
                        if (profileActivity.T != null) {
                            f12 = (AndroidUtilities.dp(f11) + textWidth + AndroidUtilities.dp(4.0f)) * profileActivity.T.getVisibilityFactor();
                        } else {
                            f12 = 0.0f;
                        }
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        rectF4.set(x11 - AndroidUtilities.dp(4.0f), measuredHeight2 - AndroidUtilities.dp(f10), x11 + Math.max(textWidth, f12) + dp9 + AndroidUtilities.dp(4.0f), measuredHeight2 + AndroidUtilities.dp(f10));
                        org.telegram.ui.Components.fd fdVar2 = (org.telegram.ui.Components.fd) this.f5074b;
                        fdVar2.f24130i = r92;
                        fdVar2.f24127c = r92;
                        fdVar2.a(rectF4);
                        org.telegram.ui.Components.fd fdVar3 = (org.telegram.ui.Components.fd) this.f5074b;
                        fdVar3.f24135n = true;
                        int k11 = i0.a.k(-1, 50);
                        fdVar3.f24129g.setColor((int) r92);
                        org.telegram.ui.Cells.z zVar3 = fdVar3.e;
                        if (zVar3 != null) {
                            org.telegram.ui.ActionBar.j6.B1(zVar3, k11, true);
                        }
                        org.telegram.ui.Components.fd fdVar4 = (org.telegram.ui.Components.fd) this.f5074b;
                        fdVar4.c(canvas, fdVar4.f24129g);
                        org.telegram.ui.Cells.z zVar4 = fdVar4.e;
                        if (zVar4 != null) {
                            zVar4.draw(canvas);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Components.fd fdVar5 = (org.telegram.ui.Components.fd) this.f5074b;
                    if (fdVar5 != null && (zVar = fdVar5.e) != null) {
                        zVar.setState(StateSet.NOTHING);
                        zVar.jumpToCurrentState();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                Rect rect = (Rect) this.f5074b;
                d31 d31Var = (d31) this.f5075c;
                if (d31Var.R) {
                    d31Var.f32850f.setBounds(-rect.left, -rect.top, getWidth() + rect.right, getHeight() + rect.bottom);
                    d31Var.f32850f.draw(canvas);
                } else {
                    RectF rectF5 = AndroidUtilities.rectTmp;
                    rectF5.set(0.0f, 0.0f, AndroidUtilities.dp(14.0f) + getWidth(), getHeight());
                    canvas.drawRoundRect(rectF5, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), d31Var.f32847a);
                }
                super.dispatchDraw(canvas);
                return;
            case 24:
                ImageReceiver imageReceiver = (ImageReceiver) this.f5074b;
                imageReceiver.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                imageReceiver.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 28:
                ((rg.z0) this.f5074b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF6 = AndroidUtilities.rectTmp;
                rectF6.set(0.0f, AndroidUtilities.dp(2.0f), getMeasuredWidth(), AndroidUtilities.dp(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                rg.z0 z0Var2 = (rg.z0) this.f5074b;
                z0Var2.f42810f.setAlpha(((rg.x0) this.f5075c).K);
                canvas.drawRoundRect(rectF6, AndroidUtilities.dp(24.0f) - 1, AndroidUtilities.dp(24.0f) - 1, z0Var2.f42810f);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int dp;
        switch (this.f5073a) {
            case 3:
                super.dispatchTouchEvent(motionEvent);
                return true;
            case 4:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.f5075c;
                org.telegram.ui.Cells.ca o9 = h4Var.P0.o(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.f5074b;
                obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (h4Var.P0.y() && h4Var.P0.o(getContext()).onTouchEvent(obtain)) {
                    return true;
                }
                if (o9.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() == 0 && h4Var.P0.y() && (motionEvent.getY() < linearLayout.getTop() || motionEvent.getY() > linearLayout.getBottom())) {
                    if (!h4Var.P0.o(getContext()).onTouchEvent(obtain)) {
                        return true;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            case 14:
                int action = motionEvent.getAction();
                org.telegram.ui.Components.voip.j1 j1Var = (org.telegram.ui.Components.voip.j1) this.f5075c;
                if (j1Var.J != null) {
                    MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                    obtain2.offsetLocation(j1Var.J.getX(), j1Var.J.getY());
                    boolean dispatchTouchEvent = j1Var.J.dispatchTouchEvent(motionEvent);
                    obtain2.recycle();
                    if (action == 1 || action == 3) {
                        j1Var.J = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                obtain3.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = j1Var.F.onTouchEvent(obtain3);
                obtain3.recycle();
                if (!j1Var.F.isInProgress() && ((GestureDetector) j1Var.G.f15073b).onTouchEvent(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (action == 1 || action == 3) {
                    j1Var.H = false;
                    j1Var.I = false;
                    o1.k kVar = j1Var.S;
                    if (!kVar.f15483f) {
                        float f7 = j1Var.Q;
                        kVar.f15481b = f7;
                        kVar.f15482c = true;
                        o1.l lVar = kVar.f15490u;
                        int i10 = j1Var.M;
                        float f10 = (i10 / 2.0f) + f7;
                        int i11 = AndroidUtilities.displaySize.x;
                        if (f10 >= i11 / 2.0f) {
                            dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        lVar.f15496i = dp;
                        j1Var.S.f();
                    }
                    o1.k kVar2 = j1Var.T;
                    if (!kVar2.f15483f) {
                        float f11 = j1Var.R;
                        kVar2.f15481b = f11;
                        kVar2.f15482c = true;
                        kVar2.f15490u.f15496i = w7.q.a(f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - j1Var.N) - AndroidUtilities.dp(16.0f));
                        j1Var.T.f();
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
    public boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z10;
        float f7;
        boolean z11;
        float f10;
        switch (this.f5073a) {
            case 0:
                Path path = (Path) this.f5074b;
                o6 o6Var = (o6) this.f5075c;
                if (o6Var.h != null && (((z10 = o6Var.f5135f) && view == o6Var.d) || (!z10 && view == o6Var.f5134c))) {
                    if (z10) {
                        f7 = o6Var.e;
                    } else {
                        f7 = 1.0f - o6Var.e;
                    }
                    canvas.save();
                    path.rewind();
                    path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f7 * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                    canvas.clipPath(path);
                    boolean drawChild = super.drawChild(canvas, view, j3);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j3);
            case 16:
                if (view instanceof pd0) {
                    return false;
                }
                return super.drawChild(canvas, view, j3);
            case 21:
                if (view != ((SecretMediaViewer) this.f5074b).f31729w && super.drawChild(canvas, view, j3)) {
                    return true;
                }
                return false;
            case 22:
                Path path2 = (Path) this.f5074b;
                i51 i51Var = (i51) this.f5075c;
                RectF rectF = i51Var.R;
                if (view != i51Var.N && view != i51Var.f34326x) {
                    if (view == i51Var.P) {
                        canvas.save();
                        path2.rewind();
                        path2.addCircle(rectF.centerX() + i51Var.N.getX(), rectF.centerY() + i51Var.N.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                        canvas.clipPath(path2);
                        canvas.clipRect(0.0f, AndroidUtilities.lerp(i51Var.T, 0.0f, i51Var.f34324s), getWidth(), AndroidUtilities.lerp(i51Var.U, getHeight(), i51Var.f34324s));
                        canvas.translate(-i51Var.P.getX(), -i51Var.P.getY());
                        canvas.translate(i51Var.N.getX() + rectF.left, i51Var.N.getY() + rectF.top);
                        canvas.scale(rectF.width() / i51Var.P.getMeasuredWidth(), rectF.height() / i51Var.P.getMeasuredHeight(), i51Var.P.getX(), i51Var.P.getY());
                        boolean drawChild2 = super.drawChild(canvas, view, j3);
                        canvas.restore();
                        return drawChild2;
                    }
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(i51Var.T, 0.0f, i51Var.f34324s), getWidth(), AndroidUtilities.lerp(i51Var.U, getHeight(), i51Var.f34324s));
                boolean drawChild3 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild3;
            case 23:
                if (view == ((g71) this.f5075c).f33728h0 && zg.e0.f49272b && zg.e0.f49274f) {
                    for (int i10 = 0; i10 < ((g71) this.f5075c).f33728h0.getChildCount(); i10++) {
                        View childAt = ((g71) this.f5075c).f33728h0.getChildAt(i10);
                        if (childAt instanceof p61) {
                            p61 p61Var = (p61) childAt;
                            if (p61Var.getAnimatedScale() == 1.0f) {
                                ((Rect) this.f5074b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                canvas.save();
                                canvas.clipRect((Rect) this.f5074b);
                                super.drawChild(canvas, view, j3);
                                canvas.restore();
                            } else if (p61Var.getAnimatedScale() > 0.0f) {
                                ((Rect) this.f5074b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                Rect rect = (Rect) this.f5074b;
                                rect.set((int) (rect.centerX() - (p61Var.getAnimatedScale() * (((Rect) this.f5074b).width() / 2.0f))), (int) (((Rect) this.f5074b).centerY() - (p61Var.getAnimatedScale() * (((Rect) this.f5074b).height() / 2.0f))), (int) ((p61Var.getAnimatedScale() * (((Rect) this.f5074b).width() / 2.0f)) + ((Rect) this.f5074b).centerX()), (int) ((p61Var.getAnimatedScale() * (((Rect) this.f5074b).height() / 2.0f)) + ((Rect) this.f5074b).centerY()));
                                canvas.save();
                                canvas.clipRect((Rect) this.f5074b);
                                canvas.scale(p61Var.getAnimatedScale(), p61Var.getAnimatedScale(), ((Rect) this.f5074b).centerX(), ((Rect) this.f5074b).centerY());
                                super.drawChild(canvas, view, j3);
                                canvas.restore();
                            }
                        } else if ((childAt instanceof TextView) || (childAt instanceof k61) || (childAt instanceof j61) || (childAt instanceof l61)) {
                            ((Rect) this.f5074b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.f5074b);
                            super.drawChild(canvas, view, j3);
                            canvas.restore();
                        }
                    }
                    return false;
                }
                return super.drawChild(canvas, view, j3);
            case 27:
                Path path3 = (Path) this.f5074b;
                qg.l0 l0Var = (qg.l0) this.f5075c;
                if (l0Var.h != null && (((z11 = l0Var.f41726f) && view == l0Var.d) || (!z11 && view == l0Var.f41725c))) {
                    if (z11) {
                        f10 = l0Var.e;
                    } else {
                        f10 = 1.0f - l0Var.e;
                    }
                    canvas.save();
                    path3.rewind();
                    path3.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f10 * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                    canvas.clipPath(path3);
                    boolean drawChild4 = super.drawChild(canvas, view, j3);
                    canvas.restore();
                    return drawChild4;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f5073a) {
            case 2:
                super.invalidate();
                ((mg.i) this.f5075c).invalidate();
                return;
            case 26:
                super.invalidate();
                org.telegram.ui.ActionBar.q0 q0Var = ((vd1) this.f5075c).f38519t0;
                if (q0Var != null) {
                    q0Var.invalidate();
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
        switch (this.f5073a) {
            case 16:
                super.onAttachedToWindow();
                st stVar = (st) this.f5075c;
                stVar.A.onAttachedToWindow();
                stVar.B.onAttachedToWindow();
                return;
            case 19:
                super.onAttachedToWindow();
                ((ProfileActivity) this.f5075c).f31605r5.onAttachedToWindow();
                return;
            case 21:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.f5074b).h.onAttachedToWindow();
                return;
            case 24:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f5074b).onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.f5073a) {
            case 14:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                org.telegram.ui.Components.voip.j1 j1Var = (org.telegram.ui.Components.voip.j1) this.f5075c;
                AndroidUtilities.setPreferredMaxRefreshRate(j1Var.f29304b, j1Var.d, j1Var.f29305c);
                j1Var.i(false);
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f5073a) {
            case 16:
                super.onDetachedFromWindow();
                st stVar = (st) this.f5075c;
                stVar.A.onDetachedFromWindow();
                stVar.B.onDetachedFromWindow();
                return;
            case 19:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.f5075c).f31605r5.onDetachedFromWindow();
                return;
            case 21:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.f5074b).h.onDetachedFromWindow();
                return;
            case 24:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f5074b).onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: ci.n6.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.fd fdVar;
        switch (this.f5073a) {
            case 19:
                if ((((ProfileActivity) this.f5075c).f31578n5 == 0.0f && (fdVar = (org.telegram.ui.Components.fd) this.f5074b) != null && fdVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f5073a) {
            case 17:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = (i13 - i11) / 4;
                int i15 = i14 * 3;
                int A = wh.A(275.0f, i15, 2);
                d80 d80Var = (d80) this.f5075c;
                FrameLayout frameLayout = d80Var.f32895r;
                int i16 = 0;
                frameLayout.layout(0, A, frameLayout.getMeasuredWidth(), d80Var.f32895r.getMeasuredHeight() + A);
                int dp = AndroidUtilities.dp(139.0f) + AndroidUtilities.dp(150.0f) + A;
                int measuredWidth = (getMeasuredWidth() - d80Var.e.getMeasuredWidth()) / 2;
                org.telegram.ui.Components.sa saVar = d80Var.e;
                saVar.layout(measuredWidth, dp, saVar.getMeasuredWidth() + measuredWidth, d80Var.e.getMeasuredHeight() + dp);
                z4.g gVar = d80Var.d;
                gVar.layout(0, 0, gVar.getMeasuredWidth(), d80Var.d.getMeasuredHeight());
                int measuredHeight = ((i14 - d80Var.f32894n.getMeasuredHeight()) / 2) + i15;
                int measuredWidth2 = (getMeasuredWidth() - d80Var.f32894n.getMeasuredWidth()) / 2;
                bi.o oVar = d80Var.f32894n;
                oVar.layout(measuredWidth2, measuredHeight, oVar.getMeasuredWidth() + measuredWidth2, d80Var.f32894n.getMeasuredHeight() + measuredHeight);
                int dp2 = measuredHeight - AndroidUtilities.dp(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - d80Var.f32893f.getMeasuredWidth()) / 2;
                TextView textView = d80Var.f32893f;
                textView.layout(measuredWidth3, dp2 - textView.getMeasuredHeight(), d80Var.f32893f.getMeasuredWidth() + measuredWidth3, dp2);
                FrameLayout frameLayout2 = (FrameLayout) this.f5074b;
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
            case 18:
                int dp4 = AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(150.0f) + wh.A(275.0f, ((i13 - i11) / 4) * 3, 2);
                int dp5 = AndroidUtilities.dp(18.0f);
                TextView textView2 = (TextView) this.f5074b;
                textView2.layout(dp5, dp4, textView2.getMeasuredWidth() + dp5, textView2.getMeasuredHeight() + dp4);
                int dp6 = AndroidUtilities.dp(18.0f) + dp4 + ((int) textView2.getTextSize());
                int dp7 = AndroidUtilities.dp(16.0f);
                TextView textView3 = (TextView) this.f5075c;
                textView3.layout(dp7, dp6, textView3.getMeasuredWidth() + dp7, textView3.getMeasuredHeight() + dp6);
                return;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.f5075c).V4();
                return;
            case 20:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 21:
                super.onLayout(z10, i10, i11, i12, i13);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f5075c;
                if (secretMediaViewer.f31708n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f31708n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight;
                    b51 b51Var = secretMediaViewer.f31708n;
                    b51Var.layout(b51Var.getLeft(), currentActionBarHeight, secretMediaViewer.f31708n.getRight(), secretMediaViewer.f31708n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.f31717r != null && secretMediaViewer.f31708n != null) {
                    int measuredHeight2 = (secretMediaViewer.f31708n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f31708n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight)) - AndroidUtilities.dp(10.0f);
                    f4 f4Var = secretMediaViewer.f31717r;
                    f4Var.layout(f4Var.getLeft(), measuredHeight2, secretMediaViewer.f31717r.getRight(), secretMediaViewer.f31717r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.f31681a0 != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                    bu0 bu0Var = secretMediaViewer.f31681a0;
                    bu0Var.layout(bu0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.f31681a0.getRight(), secretMediaViewer.f31681a0.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f31693f;
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
        int dp;
        int i12;
        s4.c0 sVar;
        int measuredHeight;
        switch (this.f5073a) {
            case 1:
                ViewGroup viewGroup = (ViewGroup) this.f5074b;
                gg.e eVar = (gg.e) this.f5075c;
                if (eVar.K && eVar.J) {
                    super.onMeasure(i10, i11);
                    return;
                }
                int size = View.MeasureSpec.getSize(i11);
                if (size == 0) {
                    size = viewGroup.getMeasuredHeight();
                }
                if (size == 0) {
                    size = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                }
                int dp2 = AndroidUtilities.dp(50.0f);
                int i13 = 0;
                if (eVar.v != 0) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(30.0f) + dp2;
                }
                if (!eVar.E && !eVar.f9718w) {
                    dp += dp2;
                }
                int paddingTop = (size - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
                if (dp < paddingTop) {
                    i13 = paddingTop - dp;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
                return;
            case 4:
                super.onMeasure(i10, i11);
                super.onMeasure(i10, wh.C(8.0f, ((LinearLayout) this.f5074b).getMeasuredHeight(), 1073741824));
                return;
            case 9:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                return;
            case 11:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
                setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                return;
            case 20:
                d31 d31Var = (d31) this.f5075c;
                View view = d31Var.H;
                View view2 = d31Var.I;
                LinearLayout linearLayout = d31Var.v;
                TextView textView = d31Var.f32853s;
                wl0 wl0Var = d31Var.f32856y;
                boolean z10 = d31Var.S.P;
                int dp3 = AndroidUtilities.dp(12.0f);
                if (z10) {
                    wl0Var.setLayoutParams(w7.y5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
                    wl0Var.setPadding(dp3, 0, dp3, 0);
                    if (linearLayout != null) {
                        textView.setLayoutParams(w7.y5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(w7.y5.d(-1, 48.0f, 8388691, 16.0f, 162.0f, 16.0f, 16.0f));
                    } else {
                        textView.setLayoutParams(w7.y5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
                    }
                } else {
                    wl0Var.setPadding(dp3, dp3 / 2, dp3, dp3);
                    if (linearLayout != null) {
                        wl0Var.setLayoutParams(w7.y5.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 136.0f));
                        textView.setLayoutParams(w7.y5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(w7.y5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                    } else {
                        wl0Var.setLayoutParams(w7.y5.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 80.0f));
                        textView.setLayoutParams(w7.y5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
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
                    view2.setLayoutParams(w7.y5.d(-1, AndroidUtilities.dp(2.0f), 80, 0.0f, 0.0f, 0.0f, i12));
                    view.setVisibility(0);
                    view.setLayoutParams(w7.y5.d(-1, AndroidUtilities.dp(2.0f), 48, 0.0f, 44.0f, 0.0f, 0.0f));
                }
                if (d31Var.R != z10) {
                    e31 e31Var = d31Var.d;
                    if (z10) {
                        e31Var.getParentActivity();
                        sVar = new s4.c0(0, false);
                    } else {
                        e31Var.getParentActivity();
                        sVar = new s4.s(3, false);
                    }
                    d31Var.G = sVar;
                    wl0Var.setLayoutManager(sVar);
                    wl0Var.requestLayout();
                    int i14 = d31Var.L;
                    if (i14 != -1) {
                        d31Var.b(i14);
                    }
                    d31Var.R = z10;
                }
                super.onMeasure(i10, i11);
                return;
            case 21:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f5075c;
                bu0 bu0Var = secretMediaViewer.f31681a0;
                if (bu0Var != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                    int currentActionBarHeight = (measuredHeight2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                    if (secretMediaViewer.U.getVisibility() != 0) {
                        measuredHeight = 0;
                    } else {
                        measuredHeight = secretMediaViewer.U.getMeasuredHeight();
                    }
                    bu0Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(currentActionBarHeight - measuredHeight, 1073741824));
                }
                View view3 = secretMediaViewer.f31693f;
                if (view3 != null) {
                    view3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.navigationBarHeight, 1073741824));
                    return;
                }
                return;
            case 28:
                super.onMeasure(i10, wh.C(2.0f, ((rg.x0) this.f5075c).f42796s, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f5073a) {
            case 3:
                super.onSizeChanged(i10, i11, i12, i13);
                yf.z zVar = (yf.z) this.f5075c;
                zVar.setBounds(0, 0, i10, i11);
                zVar.c(0, AndroidUtilities.dp(24.0f) + getPaddingBottom());
                return;
            case 14:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.f5074b;
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
        throw new UnsupportedOperationException("Method not decompiled: ci.n6.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setBackgroundColor(int i10) {
        switch (this.f5073a) {
            case 12:
                ((Paint) this.f5074b).setColor(i10);
                return;
            default:
                super.setBackgroundColor(i10);
                return;
        }
    }

    @Override
    public void setTranslationX(float f7) {
        switch (this.f5073a) {
            case 2:
                super.setTranslationX(f7);
                ((mg.i) this.f5075c).invalidate();
                return;
            default:
                super.setTranslationX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f5073a) {
            case 2:
                super.setTranslationY(f7);
                ((mg.i) this.f5075c).invalidate();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f5073a) {
            case 11:
                if (((org.telegram.ui.Components.o6) this.f5074b) != drawable && ((org.telegram.ui.Components.o6) this.f5075c) != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 20:
                if (drawable != ((d31) this.f5075c).f32850f && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public n6(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f5073a = i10;
        this.f5075c = obj;
        this.f5074b = obj2;
    }

    public n6(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f5073a = i10;
        switch (i10) {
            case 11:
                super(context);
                org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(true, true, true, false);
                this.f5074b = o6Var;
                qr qrVar = qr.h;
                o6Var.k(0.3f, 430L, qrVar);
                o6Var.u(AndroidUtilities.bold());
                o6Var.r(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A8, e6Var));
                o6Var.t(AndroidUtilities.dp(18.0f));
                o6Var.n(!LocaleController.isRTL);
                o6Var.setCallback(this);
                o6Var.G = AndroidUtilities.displaySize.x;
                org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(true, true, true, false);
                this.f5075c = o6Var2;
                o6Var2.k(0.3f, 430L, qrVar);
                o6Var2.r(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B8, e6Var));
                o6Var2.t(AndroidUtilities.dp(14.0f));
                o6Var2.n(true ^ LocaleController.isRTL);
                o6Var2.setCallback(this);
                o6Var2.G = AndroidUtilities.displaySize.x;
                return;
            case 29:
                super(context);
                LinearLayout e = wh.e(context, 1);
                org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, false, false, false);
                this.f5074b = p6Var;
                int i11 = org.telegram.ui.ActionBar.j6.G6;
                p6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, e6Var));
                p6Var.setTextSize(AndroidUtilities.dp(17.0f));
                p6Var.setTypeface(AndroidUtilities.bold());
                e.addView(p6Var, w7.y5.q(-2, 23, 1));
                TextView textView = new TextView(context);
                this.f5075c = textView;
                textView.setTextSize(1, 11.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, e6Var));
                textView.setSingleLine();
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                e.addView(textView, w7.y5.q(-2, -2, 1));
                addView(e, w7.y5.e(-2, -2, 17));
                return;
            default:
                this.f5075c = new yf.z(8);
                this.f5074b = e6Var;
                return;
        }
    }

    public n6(org.telegram.ui.Cells.z0 z0Var, Context context) {
        super(context);
        this.f5073a = 6;
        this.f5075c = z0Var;
        this.f5074b = new RectF();
    }

    public n6(i51 i51Var, Context context) {
        super(context);
        this.f5073a = 22;
        this.f5075c = i51Var;
        this.f5074b = new Path();
    }

    public n6(org.telegram.ui.bc bcVar, Context context) {
        super(context);
        this.f5073a = 7;
        this.f5075c = bcVar;
        this.f5074b = new Paint(1);
    }

    public n6(org.telegram.ui.o5 o5Var, Activity activity) {
        super(activity);
        this.f5073a = 5;
        this.f5075c = o5Var;
        this.f5074b = new Paint(1);
    }

    public n6(org.telegram.ui.Components.voip.j1 j1Var, Context context) {
        super(context);
        this.f5073a = 14;
        this.f5075c = j1Var;
        this.f5074b = new Path();
    }

    public n6(be0 be0Var, Context context) {
        super(context);
        this.f5073a = 12;
        this.f5075c = be0Var;
        this.f5074b = new Paint();
    }

    public n6(Context context, TextView textView, TextView textView2) {
        super(context);
        this.f5073a = 18;
        this.f5074b = textView;
        this.f5075c = textView2;
    }

    public n6(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f5073a = 21;
        this.f5075c = secretMediaViewer;
        this.f5074b = secretMediaViewer;
        setWillNotDraw(false);
    }

    public n6(g71 g71Var, Context context) {
        super(context);
        this.f5073a = 23;
        this.f5075c = g71Var;
        this.f5074b = new Rect();
    }

    public n6(d31 d31Var, Activity activity, e31 e31Var) {
        super(activity);
        this.f5073a = 20;
        this.f5075c = d31Var;
        Rect rect = new Rect();
        this.f5074b = rect;
        d31Var.f32847a.setColor(e31Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19062d6));
        Drawable drawable = d31Var.f32850f;
        drawable.setCallback(this);
        drawable.getPadding(rect);
    }

    public n6(mp mpVar, Context context) {
        super(context);
        this.f5073a = 9;
        this.f5075c = mpVar;
        this.f5074b = new Paint();
    }

    public n6(st stVar, Activity activity) {
        super(activity);
        this.f5073a = 16;
        this.f5075c = stVar;
        this.f5074b = stVar;
        setWillNotDraw(false);
    }

    public n6(vd1 vd1Var, Context context, int i10) {
        super(context);
        this.f5073a = i10;
        switch (i10) {
            case 26:
                this.f5075c = vd1Var;
                super(context);
                this.f5074b = new int[2];
                return;
            default:
                this.f5075c = vd1Var;
                this.f5074b = new Paint();
                return;
        }
    }

    public n6(qg.l0 l0Var, Context context) {
        super(context);
        this.f5073a = 27;
        this.f5075c = l0Var;
        this.f5074b = new Path();
    }

    public n6(qk0 qk0Var, Context context) {
        super(context);
        this.f5073a = 13;
        this.f5075c = qk0Var;
        this.f5074b = new Paint(1);
    }

    public n6(Context context, int i10) {
        super(context);
        this.f5073a = i10;
        switch (i10) {
            case 24:
                super(context);
                return;
            default:
                this.f5074b = new Path();
                this.f5075c = new l20();
                return;
        }
    }

    public n6(o6 o6Var, Context context) {
        super(context);
        this.f5073a = 0;
        this.f5075c = o6Var;
        this.f5074b = new Path();
    }
}
