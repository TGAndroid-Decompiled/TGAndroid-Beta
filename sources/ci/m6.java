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
import org.telegram.messenger.ok;
import org.telegram.ui.Components.ce0;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.yy;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.a71;
import org.telegram.ui.b51;
import org.telegram.ui.d61;
import org.telegram.ui.e61;
import org.telegram.ui.f61;
import org.telegram.ui.g20;
import org.telegram.ui.il0;
import org.telegram.ui.j61;
import org.telegram.ui.nt;
import org.telegram.ui.od1;
import org.telegram.ui.tt0;
import org.telegram.ui.u41;
import org.telegram.ui.v21;
import org.telegram.ui.w21;
import org.telegram.ui.y70;
public final class m6 extends FrameLayout {
    public final int f5170a;
    public Object f5171b;
    public Object f5172c;

    public m6(Object obj, Context context, int i10) {
        super(context);
        this.f5170a = i10;
        this.f5172c = obj;
    }

    public void a(String str, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) this.f5172c;
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        o6Var.q(str, z11, true);
    }

    public void b(String str, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) this.f5171b;
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        o6Var.q(str, z11, true);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.d6 d6Var;
        Paint paint;
        boolean a12;
        int k10;
        org.telegram.ui.ActionBar.h5[] h5VarArr;
        float f7;
        ?? r92;
        char c10;
        float f10;
        float f11;
        org.telegram.ui.Cells.z zVar;
        float f12;
        switch (this.f5170a) {
            case 3:
                yf.y yVar = (yf.y) this.f5172c;
                yVar.b(org.telegram.ui.ActionBar.h6.l1(0.65f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19045d6, (org.telegram.ui.ActionBar.d6) this.f5171b)));
                yVar.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 5:
                super.dispatchDraw(canvas);
                Paint paint2 = (Paint) this.f5171b;
                int i10 = org.telegram.ui.ActionBar.h6.f18989a7;
                d6Var = ((org.telegram.ui.ActionBar.m2) ((org.telegram.ui.o5) this.f5172c).d).resourceProvider;
                paint2.setColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint2);
                return;
            case 6:
                RectF rectF = (RectF) this.f5171b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Cells.z0 z0Var = (org.telegram.ui.Cells.z0) this.f5172c;
                int measuredWidth = z0Var.getMeasuredWidth();
                int i11 = z0Var.d;
                float x10 = z0Var.getX();
                float f13 = z0Var.f21887c;
                org.telegram.ui.ActionBar.d6 d6Var2 = z0Var.f21886b;
                if (d6Var2 != null) {
                    d6Var2.m(x10, f13, measuredWidth, i11);
                } else {
                    org.telegram.ui.ActionBar.h6.q(x10, f13, measuredWidth, i11);
                }
                float dp = AndroidUtilities.dp(18.0f);
                float dp2 = AndroidUtilities.dp(18.0f);
                Paint paint3 = null;
                if (d6Var2 != null) {
                    paint = d6Var2.G("paintChatActionBackground");
                } else {
                    paint = null;
                }
                if (paint == null) {
                    paint = org.telegram.ui.ActionBar.h6.S0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, dp, dp2, paint);
                if (d6Var2 != null) {
                    a12 = d6Var2.p0();
                } else {
                    a12 = org.telegram.ui.ActionBar.h6.a1();
                }
                if (a12) {
                    float dp3 = AndroidUtilities.dp(18.0f);
                    float dp4 = AndroidUtilities.dp(18.0f);
                    if (d6Var2 != null) {
                        paint3 = d6Var2.G("paintChatActionBackgroundDarken");
                    }
                    if (paint3 == null) {
                        paint3 = org.telegram.ui.ActionBar.h6.S0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF, dp3, dp4, paint3);
                }
                super.dispatchDraw(canvas);
                return;
            case 7:
                super.dispatchDraw(canvas);
                Paint paint4 = (Paint) this.f5171b;
                paint4.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18989a7, ((org.telegram.ui.zb) this.f5172c).f40417f.e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint4);
                return;
            case 8:
                float dp5 = AndroidUtilities.dp(20.0f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.f5171b;
                path.rewind();
                path.addRoundRect(rectF2, dp5, dp5, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF2, 255, 31);
                super.dispatchDraw(canvas);
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), AndroidUtilities.dp(6.0f) + getPaddingTop());
                g20 g20Var = (g20) this.f5172c;
                g20Var.b(canvas, rectF2, 1, 1.0f);
                rectF2.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                g20Var.b(canvas, rectF2, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                return;
            case 9:
                super.dispatchDraw(canvas);
                Paint paint5 = (Paint) this.f5171b;
                paint5.setColor(((np) this.f5172c).getThemedColor(org.telegram.ui.ActionBar.h6.f19046d7));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint5);
                return;
            case 10:
                yy yyVar = (yy) this.f5172c;
                if (!yyVar.G.f26284u0 && yyVar.f30719w > 0.0f) {
                    if (((Paint) this.f5171b) == null) {
                        Paint paint6 = new Paint();
                        this.f5171b = paint6;
                        paint6.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f5171b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f5171b).setAlpha((int) (yyVar.f30719w * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f5171b);
                    canvas.restore();
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 11:
                org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) this.f5171b;
                int dp6 = AndroidUtilities.dp(29.0f);
                int dp7 = AndroidUtilities.dp(18.83f);
                org.telegram.ui.Components.o6 o6Var2 = (org.telegram.ui.Components.o6) this.f5172c;
                o6Var.setBounds(getPaddingLeft(), r3 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r3);
                o6Var.draw(canvas);
                o6Var2.setBounds(getPaddingLeft(), r2 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r2);
                o6Var2.draw(canvas);
                return;
            case 13:
                Paint paint7 = (Paint) this.f5171b;
                qk0 qk0Var = (qk0) this.f5172c;
                int i12 = qk0Var.M0;
                if (i12 != 1 && i12 != 2 && i12 != 4) {
                    k10 = i0.a.d(0.7f, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.F8, qk0Var.f27670k0), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19115h5, qk0Var.f27670k0));
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
                ProfileActivity profileActivity = (ProfileActivity) this.f5172c;
                org.telegram.ui.ActionBar.h5[] h5VarArr2 = profileActivity.f31627r;
                if (profileActivity.W4 != null) {
                    canvas.save();
                    canvas.translate(h5VarArr2[0].getX(), h5VarArr2[0].getY());
                    h5VarArr = h5VarArr2;
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
                    h5VarArr = h5VarArr2;
                    f7 = 0.0f;
                    r92 = 0;
                    c10 = 2;
                    f10 = 14.0f;
                    f11 = 24.0f;
                }
                if (profileActivity.p5 && profileActivity.Y5 != f7 && profileActivity.f31606n5 != 1.0f) {
                    float measuredHeight2 = (h5VarArr[1].getMeasuredHeight() / 2.0f) + h5VarArr[1].getY();
                    float dp8 = AndroidUtilities.dp(22.0f);
                    float x11 = ((h5VarArr[1].getX() + (AndroidUtilities.dp(28.0f) - profileActivity.f31613o5)) - dp8) - profileActivity.Z3();
                    profileActivity.f31633r5.setImageCoords(x11, measuredHeight2 - (dp8 / 2.0f), dp8, dp8);
                    profileActivity.f31633r5.setAlpha(profileActivity.Y5);
                    canvas.save();
                    float f14 = profileActivity.Y5;
                    canvas.scale(f14, f14, profileActivity.f31633r5.getCenterX(), profileActivity.f31633r5.getCenterY());
                    profileActivity.f31633r5.draw(canvas);
                    canvas.restore();
                    if (profileActivity.f31606n5 == f7) {
                        if (((org.telegram.ui.Components.gd) this.f5171b) == null) {
                            org.telegram.ui.Components.gd gdVar = new org.telegram.ui.Components.gd(this);
                            this.f5171b = gdVar;
                            gdVar.h = new il0(this, 29);
                        }
                        float dp9 = (1.0f - profileActivity.f31606n5) * AndroidUtilities.dp(28.0f);
                        float textWidth = h5VarArr[c10].getTextWidth();
                        if (profileActivity.T != null) {
                            f12 = (AndroidUtilities.dp(f11) + textWidth + AndroidUtilities.dp(4.0f)) * profileActivity.T.getVisibilityFactor();
                        } else {
                            f12 = 0.0f;
                        }
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        rectF4.set(x11 - AndroidUtilities.dp(4.0f), measuredHeight2 - AndroidUtilities.dp(f10), x11 + Math.max(textWidth, f12) + dp9 + AndroidUtilities.dp(4.0f), measuredHeight2 + AndroidUtilities.dp(f10));
                        org.telegram.ui.Components.gd gdVar2 = (org.telegram.ui.Components.gd) this.f5171b;
                        gdVar2.f24423i = r92;
                        gdVar2.f24420c = r92;
                        gdVar2.a(rectF4);
                        org.telegram.ui.Components.gd gdVar3 = (org.telegram.ui.Components.gd) this.f5171b;
                        gdVar3.f24428n = true;
                        int k11 = i0.a.k(-1, 50);
                        gdVar3.f24422g.setColor((int) r92);
                        org.telegram.ui.Cells.z zVar2 = gdVar3.e;
                        if (zVar2 != null) {
                            org.telegram.ui.ActionBar.h6.B1(zVar2, k11, true);
                        }
                        org.telegram.ui.Components.gd gdVar4 = (org.telegram.ui.Components.gd) this.f5171b;
                        gdVar4.c(canvas, gdVar4.f24422g);
                        org.telegram.ui.Cells.z zVar3 = gdVar4.e;
                        if (zVar3 != null) {
                            zVar3.draw(canvas);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Components.gd gdVar5 = (org.telegram.ui.Components.gd) this.f5171b;
                    if (gdVar5 != null && (zVar = gdVar5.e) != null) {
                        zVar.setState(StateSet.NOTHING);
                        zVar.jumpToCurrentState();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                Rect rect = (Rect) this.f5171b;
                v21 v21Var = (v21) this.f5172c;
                if (v21Var.R) {
                    v21Var.f38595f.setBounds(-rect.left, -rect.top, getWidth() + rect.right, getHeight() + rect.bottom);
                    v21Var.f38595f.draw(canvas);
                } else {
                    RectF rectF5 = AndroidUtilities.rectTmp;
                    rectF5.set(0.0f, 0.0f, AndroidUtilities.dp(14.0f) + getWidth(), getHeight());
                    canvas.drawRoundRect(rectF5, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), v21Var.f38592a);
                }
                super.dispatchDraw(canvas);
                return;
            case 24:
                ImageReceiver imageReceiver = (ImageReceiver) this.f5171b;
                imageReceiver.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                imageReceiver.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 28:
                ((rg.z0) this.f5171b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF6 = AndroidUtilities.rectTmp;
                rectF6.set(0.0f, AndroidUtilities.dp(2.0f), getMeasuredWidth(), AndroidUtilities.dp(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                rg.z0 z0Var2 = (rg.z0) this.f5171b;
                z0Var2.f42826f.setAlpha(((rg.x0) this.f5172c).K);
                canvas.drawRoundRect(rectF6, AndroidUtilities.dp(24.0f) - 1, AndroidUtilities.dp(24.0f) - 1, z0Var2.f42826f);
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
        switch (this.f5170a) {
            case 3:
                super.dispatchTouchEvent(motionEvent);
                return true;
            case 4:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f5172c;
                org.telegram.ui.Cells.ca o9 = i4Var.P0.o(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.f5171b;
                obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (i4Var.P0.y() && i4Var.P0.o(getContext()).onTouchEvent(obtain)) {
                    return true;
                }
                if (o9.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() == 0 && i4Var.P0.y() && (motionEvent.getY() < linearLayout.getTop() || motionEvent.getY() > linearLayout.getBottom())) {
                    if (!i4Var.P0.o(getContext()).onTouchEvent(obtain)) {
                        return true;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            case 14:
                int action = motionEvent.getAction();
                org.telegram.ui.Components.voip.k1 k1Var = (org.telegram.ui.Components.voip.k1) this.f5172c;
                if (k1Var.J != null) {
                    MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                    obtain2.offsetLocation(k1Var.J.getX(), k1Var.J.getY());
                    boolean dispatchTouchEvent = k1Var.J.dispatchTouchEvent(motionEvent);
                    obtain2.recycle();
                    if (action == 1 || action == 3) {
                        k1Var.J = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                obtain3.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = k1Var.F.onTouchEvent(obtain3);
                obtain3.recycle();
                if (!k1Var.F.isInProgress() && ((GestureDetector) k1Var.G.f15101b).onTouchEvent(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (action == 1 || action == 3) {
                    k1Var.H = false;
                    k1Var.I = false;
                    o1.k kVar = k1Var.S;
                    if (!kVar.f15511f) {
                        float f7 = k1Var.Q;
                        kVar.f15509b = f7;
                        kVar.f15510c = true;
                        o1.l lVar = kVar.f15518u;
                        int i10 = k1Var.M;
                        float f10 = (i10 / 2.0f) + f7;
                        int i11 = AndroidUtilities.displaySize.x;
                        if (f10 >= i11 / 2.0f) {
                            dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        lVar.f15524i = dp;
                        k1Var.S.f();
                    }
                    o1.k kVar2 = k1Var.T;
                    if (!kVar2.f15511f) {
                        float f11 = k1Var.R;
                        kVar2.f15509b = f11;
                        kVar2.f15510c = true;
                        kVar2.f15518u.f15524i = w7.q.a(f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - k1Var.N) - AndroidUtilities.dp(16.0f));
                        k1Var.T.f();
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
        switch (this.f5170a) {
            case 0:
                Path path = (Path) this.f5171b;
                n6 n6Var = (n6) this.f5172c;
                if (n6Var.h != null && (((z10 = n6Var.f5210f) && view == n6Var.d) || (!z10 && view == n6Var.f5209c))) {
                    if (z10) {
                        f7 = n6Var.e;
                    } else {
                        f7 = 1.0f - n6Var.e;
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
                if (view instanceof qd0) {
                    return false;
                }
                return super.drawChild(canvas, view, j3);
            case 21:
                if (view != ((SecretMediaViewer) this.f5171b).f31757w && super.drawChild(canvas, view, j3)) {
                    return true;
                }
                return false;
            case 22:
                Path path2 = (Path) this.f5171b;
                b51 b51Var = (b51) this.f5172c;
                RectF rectF = b51Var.R;
                if (view != b51Var.N && view != b51Var.f32321x) {
                    if (view == b51Var.P) {
                        canvas.save();
                        path2.rewind();
                        path2.addCircle(rectF.centerX() + b51Var.N.getX(), rectF.centerY() + b51Var.N.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                        canvas.clipPath(path2);
                        canvas.clipRect(0.0f, AndroidUtilities.lerp(b51Var.T, 0.0f, b51Var.f32319s), getWidth(), AndroidUtilities.lerp(b51Var.U, getHeight(), b51Var.f32319s));
                        canvas.translate(-b51Var.P.getX(), -b51Var.P.getY());
                        canvas.translate(b51Var.N.getX() + rectF.left, b51Var.N.getY() + rectF.top);
                        canvas.scale(rectF.width() / b51Var.P.getMeasuredWidth(), rectF.height() / b51Var.P.getMeasuredHeight(), b51Var.P.getX(), b51Var.P.getY());
                        boolean drawChild2 = super.drawChild(canvas, view, j3);
                        canvas.restore();
                        return drawChild2;
                    }
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(b51Var.T, 0.0f, b51Var.f32319s), getWidth(), AndroidUtilities.lerp(b51Var.U, getHeight(), b51Var.f32319s));
                boolean drawChild3 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild3;
            case 23:
                if (view == ((a71) this.f5172c).f32013h0 && zg.e0.f49280b && zg.e0.f49282f) {
                    for (int i10 = 0; i10 < ((a71) this.f5172c).f32013h0.getChildCount(); i10++) {
                        View childAt = ((a71) this.f5172c).f32013h0.getChildAt(i10);
                        if (childAt instanceof j61) {
                            j61 j61Var = (j61) childAt;
                            if (j61Var.getAnimatedScale() == 1.0f) {
                                ((Rect) this.f5171b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                canvas.save();
                                canvas.clipRect((Rect) this.f5171b);
                                super.drawChild(canvas, view, j3);
                                canvas.restore();
                            } else if (j61Var.getAnimatedScale() > 0.0f) {
                                ((Rect) this.f5171b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                Rect rect = (Rect) this.f5171b;
                                rect.set((int) (rect.centerX() - (j61Var.getAnimatedScale() * (((Rect) this.f5171b).width() / 2.0f))), (int) (((Rect) this.f5171b).centerY() - (j61Var.getAnimatedScale() * (((Rect) this.f5171b).height() / 2.0f))), (int) ((j61Var.getAnimatedScale() * (((Rect) this.f5171b).width() / 2.0f)) + ((Rect) this.f5171b).centerX()), (int) ((j61Var.getAnimatedScale() * (((Rect) this.f5171b).height() / 2.0f)) + ((Rect) this.f5171b).centerY()));
                                canvas.save();
                                canvas.clipRect((Rect) this.f5171b);
                                canvas.scale(j61Var.getAnimatedScale(), j61Var.getAnimatedScale(), ((Rect) this.f5171b).centerX(), ((Rect) this.f5171b).centerY());
                                super.drawChild(canvas, view, j3);
                                canvas.restore();
                            }
                        } else if ((childAt instanceof TextView) || (childAt instanceof e61) || (childAt instanceof d61) || (childAt instanceof f61)) {
                            ((Rect) this.f5171b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.f5171b);
                            super.drawChild(canvas, view, j3);
                            canvas.restore();
                        }
                    }
                    return false;
                }
                return super.drawChild(canvas, view, j3);
            case 27:
                Path path3 = (Path) this.f5171b;
                qg.m0 m0Var = (qg.m0) this.f5172c;
                if (m0Var.h != null && (((z11 = m0Var.f41745f) && view == m0Var.d) || (!z11 && view == m0Var.f41744c))) {
                    if (z11) {
                        f10 = m0Var.e;
                    } else {
                        f10 = 1.0f - m0Var.e;
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
        switch (this.f5170a) {
            case 2:
                super.invalidate();
                ((mg.i) this.f5172c).invalidate();
                return;
            case 26:
                super.invalidate();
                org.telegram.ui.ActionBar.p0 p0Var = ((od1) this.f5172c).f36180t0;
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
        switch (this.f5170a) {
            case 16:
                super.onAttachedToWindow();
                nt ntVar = (nt) this.f5172c;
                ntVar.A.onAttachedToWindow();
                ntVar.B.onAttachedToWindow();
                return;
            case 19:
                super.onAttachedToWindow();
                ((ProfileActivity) this.f5172c).f31633r5.onAttachedToWindow();
                return;
            case 21:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.f5171b).h.onAttachedToWindow();
                return;
            case 24:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f5171b).onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.f5170a) {
            case 14:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                org.telegram.ui.Components.voip.k1 k1Var = (org.telegram.ui.Components.voip.k1) this.f5172c;
                AndroidUtilities.setPreferredMaxRefreshRate(k1Var.f29414b, k1Var.d, k1Var.f29415c);
                k1Var.i(false);
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f5170a) {
            case 16:
                super.onDetachedFromWindow();
                nt ntVar = (nt) this.f5172c;
                ntVar.A.onDetachedFromWindow();
                ntVar.B.onDetachedFromWindow();
                return;
            case 19:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.f5172c).f31633r5.onDetachedFromWindow();
                return;
            case 21:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.f5171b).h.onDetachedFromWindow();
                return;
            case 24:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f5171b).onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: ci.m6.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.gd gdVar;
        switch (this.f5170a) {
            case 19:
                if ((((ProfileActivity) this.f5172c).f31606n5 == 0.0f && (gdVar = (org.telegram.ui.Components.gd) this.f5171b) != null && gdVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f5170a) {
            case 17:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = (i13 - i11) / 4;
                int i15 = i14 * 3;
                int A = ok.A(275.0f, i15, 2);
                y70 y70Var = (y70) this.f5172c;
                FrameLayout frameLayout = y70Var.f40058r;
                int i16 = 0;
                frameLayout.layout(0, A, frameLayout.getMeasuredWidth(), y70Var.f40058r.getMeasuredHeight() + A);
                int dp = AndroidUtilities.dp(139.0f) + AndroidUtilities.dp(150.0f) + A;
                int measuredWidth = (getMeasuredWidth() - y70Var.e.getMeasuredWidth()) / 2;
                org.telegram.ui.Components.sa saVar = y70Var.e;
                saVar.layout(measuredWidth, dp, saVar.getMeasuredWidth() + measuredWidth, y70Var.e.getMeasuredHeight() + dp);
                z4.g gVar = y70Var.d;
                gVar.layout(0, 0, gVar.getMeasuredWidth(), y70Var.d.getMeasuredHeight());
                int measuredHeight = ((i14 - y70Var.f40057n.getMeasuredHeight()) / 2) + i15;
                int measuredWidth2 = (getMeasuredWidth() - y70Var.f40057n.getMeasuredWidth()) / 2;
                bi.o oVar = y70Var.f40057n;
                oVar.layout(measuredWidth2, measuredHeight, oVar.getMeasuredWidth() + measuredWidth2, y70Var.f40057n.getMeasuredHeight() + measuredHeight);
                int dp2 = measuredHeight - AndroidUtilities.dp(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - y70Var.f40056f.getMeasuredWidth()) / 2;
                TextView textView = y70Var.f40056f;
                textView.layout(measuredWidth3, dp2 - textView.getMeasuredHeight(), y70Var.f40056f.getMeasuredWidth() + measuredWidth3, dp2);
                FrameLayout frameLayout2 = (FrameLayout) this.f5171b;
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
                int dp4 = AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(150.0f) + ok.A(275.0f, ((i13 - i11) / 4) * 3, 2);
                int dp5 = AndroidUtilities.dp(18.0f);
                TextView textView2 = (TextView) this.f5171b;
                textView2.layout(dp5, dp4, textView2.getMeasuredWidth() + dp5, textView2.getMeasuredHeight() + dp4);
                int dp6 = AndroidUtilities.dp(18.0f) + dp4 + ((int) textView2.getTextSize());
                int dp7 = AndroidUtilities.dp(16.0f);
                TextView textView3 = (TextView) this.f5172c;
                textView3.layout(dp7, dp6, textView3.getMeasuredWidth() + dp7, textView3.getMeasuredHeight() + dp6);
                return;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.f5172c).V4();
                return;
            case 20:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 21:
                super.onLayout(z10, i10, i11, i12, i13);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f5172c;
                if (secretMediaViewer.f31736n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f31736n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight;
                    u41 u41Var = secretMediaViewer.f31736n;
                    u41Var.layout(u41Var.getLeft(), currentActionBarHeight, secretMediaViewer.f31736n.getRight(), secretMediaViewer.f31736n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.f31745r != null && secretMediaViewer.f31736n != null) {
                    int measuredHeight2 = (secretMediaViewer.f31736n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f31736n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight)) - AndroidUtilities.dp(10.0f);
                    e4 e4Var = secretMediaViewer.f31745r;
                    e4Var.layout(e4Var.getLeft(), measuredHeight2, secretMediaViewer.f31745r.getRight(), secretMediaViewer.f31745r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.f31709a0 != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                    tt0 tt0Var = secretMediaViewer.f31709a0;
                    tt0Var.layout(tt0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.f31709a0.getRight(), secretMediaViewer.f31709a0.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f31721f;
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
        switch (this.f5170a) {
            case 1:
                ViewGroup viewGroup = (ViewGroup) this.f5171b;
                gg.e eVar = (gg.e) this.f5172c;
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
                if (!eVar.E && !eVar.f9700w) {
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
                super.onMeasure(i10, ok.C(8.0f, ((LinearLayout) this.f5171b).getMeasuredHeight(), 1073741824));
                return;
            case 9:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                return;
            case 11:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
                setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                return;
            case 20:
                v21 v21Var = (v21) this.f5172c;
                View view = v21Var.H;
                View view2 = v21Var.I;
                LinearLayout linearLayout = v21Var.v;
                TextView textView = v21Var.f38598s;
                wl0 wl0Var = v21Var.f38601y;
                boolean z10 = v21Var.S.P;
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
                if (v21Var.R != z10) {
                    w21 w21Var = v21Var.d;
                    if (z10) {
                        w21Var.getParentActivity();
                        sVar = new s4.c0(0, false);
                    } else {
                        w21Var.getParentActivity();
                        sVar = new s4.s(3, false);
                    }
                    v21Var.G = sVar;
                    wl0Var.setLayoutManager(sVar);
                    wl0Var.requestLayout();
                    int i14 = v21Var.L;
                    if (i14 != -1) {
                        v21Var.b(i14);
                    }
                    v21Var.R = z10;
                }
                super.onMeasure(i10, i11);
                return;
            case 21:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f5172c;
                tt0 tt0Var = secretMediaViewer.f31709a0;
                if (tt0Var != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                    int currentActionBarHeight = (measuredHeight2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                    if (secretMediaViewer.U.getVisibility() != 0) {
                        measuredHeight = 0;
                    } else {
                        measuredHeight = secretMediaViewer.U.getMeasuredHeight();
                    }
                    tt0Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(currentActionBarHeight - measuredHeight, 1073741824));
                }
                View view3 = secretMediaViewer.f31721f;
                if (view3 != null) {
                    view3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.navigationBarHeight, 1073741824));
                    return;
                }
                return;
            case 28:
                super.onMeasure(i10, ok.C(2.0f, ((rg.x0) this.f5172c).f42812s, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f5170a) {
            case 3:
                super.onSizeChanged(i10, i11, i12, i13);
                yf.y yVar = (yf.y) this.f5172c;
                yVar.setBounds(0, 0, i10, i11);
                yVar.c(0, AndroidUtilities.dp(24.0f) + getPaddingBottom());
                return;
            case 14:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.f5171b;
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
        throw new UnsupportedOperationException("Method not decompiled: ci.m6.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setBackgroundColor(int i10) {
        switch (this.f5170a) {
            case 12:
                ((Paint) this.f5171b).setColor(i10);
                return;
            default:
                super.setBackgroundColor(i10);
                return;
        }
    }

    @Override
    public void setTranslationX(float f7) {
        switch (this.f5170a) {
            case 2:
                super.setTranslationX(f7);
                ((mg.i) this.f5172c).invalidate();
                return;
            default:
                super.setTranslationX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f5170a) {
            case 2:
                super.setTranslationY(f7);
                ((mg.i) this.f5172c).invalidate();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f5170a) {
            case 11:
                if (((org.telegram.ui.Components.o6) this.f5171b) != drawable && ((org.telegram.ui.Components.o6) this.f5172c) != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 20:
                if (drawable != ((v21) this.f5172c).f38595f && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public m6(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f5170a = i10;
        this.f5172c = obj;
        this.f5171b = obj2;
    }

    public m6(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f5170a = i10;
        switch (i10) {
            case 11:
                super(context);
                org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(true, true, true, false);
                this.f5171b = o6Var;
                rr rrVar = rr.h;
                o6Var.k(0.3f, 430L, rrVar);
                o6Var.u(AndroidUtilities.bold());
                o6Var.r(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.A8, d6Var));
                o6Var.t(AndroidUtilities.dp(18.0f));
                o6Var.n(!LocaleController.isRTL);
                o6Var.setCallback(this);
                o6Var.G = AndroidUtilities.displaySize.x;
                org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(true, true, true, false);
                this.f5172c = o6Var2;
                o6Var2.k(0.3f, 430L, rrVar);
                o6Var2.r(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.B8, d6Var));
                o6Var2.t(AndroidUtilities.dp(14.0f));
                o6Var2.n(true ^ LocaleController.isRTL);
                o6Var2.setCallback(this);
                o6Var2.G = AndroidUtilities.displaySize.x;
                return;
            case 29:
                super(context);
                LinearLayout f7 = ok.f(context, 1);
                org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, false, false, false);
                this.f5171b = p6Var;
                int i11 = org.telegram.ui.ActionBar.h6.G6;
                p6Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
                p6Var.setTextSize(AndroidUtilities.dp(17.0f));
                p6Var.setTypeface(AndroidUtilities.bold());
                f7.addView(p6Var, w7.y5.q(-2, 23, 1));
                TextView textView = new TextView(context);
                this.f5172c = textView;
                textView.setTextSize(1, 11.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, d6Var));
                textView.setSingleLine();
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                f7.addView(textView, w7.y5.q(-2, -2, 1));
                addView(f7, w7.y5.e(-2, -2, 17));
                return;
            default:
                this.f5172c = new yf.y(8);
                this.f5171b = d6Var;
                return;
        }
    }

    public m6(org.telegram.ui.Cells.z0 z0Var, Context context) {
        super(context);
        this.f5170a = 6;
        this.f5172c = z0Var;
        this.f5171b = new RectF();
    }

    public m6(b51 b51Var, Context context) {
        super(context);
        this.f5170a = 22;
        this.f5172c = b51Var;
        this.f5171b = new Path();
    }

    public m6(org.telegram.ui.zb zbVar, Context context) {
        super(context);
        this.f5170a = 7;
        this.f5172c = zbVar;
        this.f5171b = new Paint(1);
    }

    public m6(org.telegram.ui.o5 o5Var, Activity activity) {
        super(activity);
        this.f5170a = 5;
        this.f5172c = o5Var;
        this.f5171b = new Paint(1);
    }

    public m6(org.telegram.ui.Components.voip.k1 k1Var, Context context) {
        super(context);
        this.f5170a = 14;
        this.f5172c = k1Var;
        this.f5171b = new Path();
    }

    public m6(ce0 ce0Var, Context context) {
        super(context);
        this.f5170a = 12;
        this.f5172c = ce0Var;
        this.f5171b = new Paint();
    }

    public m6(Context context, TextView textView, TextView textView2) {
        super(context);
        this.f5170a = 18;
        this.f5171b = textView;
        this.f5172c = textView2;
    }

    public m6(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f5170a = 21;
        this.f5172c = secretMediaViewer;
        this.f5171b = secretMediaViewer;
        setWillNotDraw(false);
    }

    public m6(a71 a71Var, Context context) {
        super(context);
        this.f5170a = 23;
        this.f5172c = a71Var;
        this.f5171b = new Rect();
    }

    public m6(v21 v21Var, Activity activity, w21 w21Var) {
        super(activity);
        this.f5170a = 20;
        this.f5172c = v21Var;
        Rect rect = new Rect();
        this.f5171b = rect;
        v21Var.f38592a.setColor(w21Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19045d6));
        Drawable drawable = v21Var.f38595f;
        drawable.setCallback(this);
        drawable.getPadding(rect);
    }

    public m6(np npVar, Context context) {
        super(context);
        this.f5170a = 9;
        this.f5172c = npVar;
        this.f5171b = new Paint();
    }

    public m6(nt ntVar, Activity activity) {
        super(activity);
        this.f5170a = 16;
        this.f5172c = ntVar;
        this.f5171b = ntVar;
        setWillNotDraw(false);
    }

    public m6(od1 od1Var, Context context, int i10) {
        super(context);
        this.f5170a = i10;
        switch (i10) {
            case 26:
                this.f5172c = od1Var;
                super(context);
                this.f5171b = new int[2];
                return;
            default:
                this.f5172c = od1Var;
                this.f5171b = new Paint();
                return;
        }
    }

    public m6(qg.m0 m0Var, Context context) {
        super(context);
        this.f5170a = 27;
        this.f5172c = m0Var;
        this.f5171b = new Path();
    }

    public m6(qk0 qk0Var, Context context) {
        super(context);
        this.f5170a = 13;
        this.f5172c = qk0Var;
        this.f5171b = new Paint(1);
    }

    public m6(Context context, int i10) {
        super(context);
        this.f5170a = i10;
        switch (i10) {
            case 24:
                super(context);
                return;
            default:
                this.f5171b = new Path();
                this.f5172c = new g20();
                return;
        }
    }

    public m6(n6 n6Var, Context context) {
        super(context);
        this.f5170a = 0;
        this.f5172c = n6Var;
        this.f5171b = new Path();
    }
}
