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
import org.telegram.messenger.bi;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.ee0;
import org.telegram.ui.Components.pp;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.sk0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.a71;
import org.telegram.ui.c51;
import org.telegram.ui.c80;
import org.telegram.ui.d61;
import org.telegram.ui.e61;
import org.telegram.ui.f61;
import org.telegram.ui.hz0;
import org.telegram.ui.j61;
import org.telegram.ui.k20;
import org.telegram.ui.pd1;
import org.telegram.ui.rt;
import org.telegram.ui.v41;
import org.telegram.ui.wt0;
import org.telegram.ui.x21;
import org.telegram.ui.y21;
public final class m6 extends FrameLayout {
    public final int f5569a;
    public Object f5570b;
    public Object f5571c;

    public m6(Object obj, Context context, int i10) {
        super(context);
        this.f5569a = i10;
        this.f5571c = obj;
    }

    public void a(String str, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) this.f5571c;
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        o6Var.q(str, z11, true);
    }

    public void b(String str, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) this.f5570b;
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
        org.telegram.ui.ActionBar.i5[] i5VarArr;
        float f7;
        char c10;
        ?? r10;
        float f10;
        float f11;
        org.telegram.ui.Cells.z zVar;
        float f12;
        switch (this.f5569a) {
            case 3:
                yf.y yVar = (yf.y) this.f5571c;
                yVar.b(org.telegram.ui.ActionBar.i6.l1(0.65f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20827d6, (org.telegram.ui.ActionBar.d6) this.f5570b)));
                yVar.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 5:
                super.dispatchDraw(canvas);
                Paint paint2 = (Paint) this.f5570b;
                int i10 = org.telegram.ui.ActionBar.i6.f20771a7;
                d6Var = ((org.telegram.ui.ActionBar.n2) ((org.telegram.ui.p5) this.f5571c).d).resourceProvider;
                paint2.setColor(org.telegram.ui.ActionBar.i6.v0(i10, d6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint2);
                return;
            case 6:
                RectF rectF = (RectF) this.f5570b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Cells.z0 z0Var = (org.telegram.ui.Cells.z0) this.f5571c;
                int measuredWidth = z0Var.getMeasuredWidth();
                int i11 = z0Var.d;
                float x10 = z0Var.getX();
                float f13 = z0Var.f23798c;
                org.telegram.ui.ActionBar.d6 d6Var2 = z0Var.f23797b;
                if (d6Var2 != null) {
                    d6Var2.m(x10, f13, measuredWidth, i11);
                } else {
                    org.telegram.ui.ActionBar.i6.q(x10, f13, measuredWidth, i11);
                }
                float dp = AndroidUtilities.dp(18.0f);
                float dp2 = AndroidUtilities.dp(18.0f);
                Paint paint3 = null;
                if (d6Var2 != null) {
                    paint = d6Var2.H("paintChatActionBackground");
                } else {
                    paint = null;
                }
                if (paint == null) {
                    paint = org.telegram.ui.ActionBar.i6.S0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, dp, dp2, paint);
                if (d6Var2 != null) {
                    a12 = d6Var2.r0();
                } else {
                    a12 = org.telegram.ui.ActionBar.i6.a1();
                }
                if (a12) {
                    float dp3 = AndroidUtilities.dp(18.0f);
                    float dp4 = AndroidUtilities.dp(18.0f);
                    if (d6Var2 != null) {
                        paint3 = d6Var2.H("paintChatActionBackgroundDarken");
                    }
                    if (paint3 == null) {
                        paint3 = org.telegram.ui.ActionBar.i6.S0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF, dp3, dp4, paint3);
                }
                super.dispatchDraw(canvas);
                return;
            case 7:
                super.dispatchDraw(canvas);
                Paint paint4 = (Paint) this.f5570b;
                paint4.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20771a7, ((org.telegram.ui.bc) this.f5571c).f35115f.f35769e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint4);
                return;
            case 8:
                float dp5 = AndroidUtilities.dp(20.0f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.f5570b;
                path.rewind();
                path.addRoundRect(rectF2, dp5, dp5, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF2, 255, 31);
                super.dispatchDraw(canvas);
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), AndroidUtilities.dp(6.0f) + getPaddingTop());
                k20 k20Var = (k20) this.f5571c;
                k20Var.b(canvas, rectF2, 1, 1.0f);
                rectF2.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                k20Var.b(canvas, rectF2, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                return;
            case 9:
                super.dispatchDraw(canvas);
                Paint paint5 = (Paint) this.f5570b;
                paint5.setColor(((pp) this.f5571c).getThemedColor(org.telegram.ui.ActionBar.i6.f20828d7));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint5);
                return;
            case 10:
                az azVar = (az) this.f5571c;
                if (!azVar.G.f29250u0 && azVar.f24777w > 0.0f) {
                    if (((Paint) this.f5570b) == null) {
                        Paint paint6 = new Paint();
                        this.f5570b = paint6;
                        paint6.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f5570b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f5570b).setAlpha((int) (azVar.f24777w * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f5570b);
                    canvas.restore();
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 11:
                org.telegram.ui.Components.o6 o6Var = (org.telegram.ui.Components.o6) this.f5570b;
                int dp6 = AndroidUtilities.dp(29.0f);
                int dp7 = AndroidUtilities.dp(18.83f);
                org.telegram.ui.Components.o6 o6Var2 = (org.telegram.ui.Components.o6) this.f5571c;
                o6Var.setBounds(getPaddingLeft(), r3 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r3);
                o6Var.draw(canvas);
                o6Var2.setBounds(getPaddingLeft(), r2 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r2);
                o6Var2.draw(canvas);
                return;
            case 13:
                Paint paint7 = (Paint) this.f5570b;
                sk0 sk0Var = (sk0) this.f5571c;
                int i12 = sk0Var.M0;
                if (i12 != 1 && i12 != 2 && i12 != 4) {
                    k10 = i0.a.d(0.7f, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.F8, sk0Var.f30841k0), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20899h5, sk0Var.f30841k0));
                } else {
                    k10 = i0.a.k(-1, 30);
                }
                paint7.setColor(k10);
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - AndroidUtilities.dpf2(6.0f)) / 2.0f;
                float g10 = sk0Var.g();
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
                ProfileActivity profileActivity = (ProfileActivity) this.f5571c;
                org.telegram.ui.ActionBar.i5[] i5VarArr2 = profileActivity.f34339r;
                if (profileActivity.W4 != null) {
                    canvas.save();
                    canvas.translate(i5VarArr2[0].getX(), i5VarArr2[0].getY());
                    i5VarArr = i5VarArr2;
                    f7 = 0.0f;
                    c10 = 2;
                    r10 = 0;
                    f10 = 14.0f;
                    f11 = 24.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.W4.getMeasuredWidth(), profileActivity.W4.getMeasuredHeight(), (int) ((1.0f - profileActivity.S1) * 255.0f), 31);
                    profileActivity.W4.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    i5VarArr = i5VarArr2;
                    f7 = 0.0f;
                    c10 = 2;
                    r10 = 0;
                    f10 = 14.0f;
                    f11 = 24.0f;
                }
                if (profileActivity.p5 && profileActivity.Y5 != f7 && profileActivity.f34318n5 != 1.0f) {
                    float measuredHeight2 = (i5VarArr[1].getMeasuredHeight() / 2.0f) + i5VarArr[1].getY();
                    float dp8 = AndroidUtilities.dp(22.0f);
                    float x11 = ((i5VarArr[1].getX() + (AndroidUtilities.dp(28.0f) - profileActivity.f34325o5)) - dp8) - profileActivity.Z3();
                    profileActivity.f34345r5.setImageCoords(x11, measuredHeight2 - (dp8 / 2.0f), dp8, dp8);
                    profileActivity.f34345r5.setAlpha(profileActivity.Y5);
                    canvas.save();
                    float f14 = profileActivity.Y5;
                    canvas.scale(f14, f14, profileActivity.f34345r5.getCenterX(), profileActivity.f34345r5.getCenterY());
                    profileActivity.f34345r5.draw(canvas);
                    canvas.restore();
                    if (profileActivity.f34318n5 == f7) {
                        if (((org.telegram.ui.Components.gd) this.f5570b) == null) {
                            org.telegram.ui.Components.gd gdVar = new org.telegram.ui.Components.gd(this);
                            this.f5570b = gdVar;
                            gdVar.h = new hz0(this, r10);
                        }
                        float dp9 = (1.0f - profileActivity.f34318n5) * AndroidUtilities.dp(28.0f);
                        float textWidth = i5VarArr[c10].getTextWidth();
                        if (profileActivity.T != null) {
                            f12 = (AndroidUtilities.dp(f11) + textWidth + AndroidUtilities.dp(4.0f)) * profileActivity.T.getVisibilityFactor();
                        } else {
                            f12 = 0.0f;
                        }
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        rectF4.set(x11 - AndroidUtilities.dp(4.0f), measuredHeight2 - AndroidUtilities.dp(f10), x11 + Math.max(textWidth, f12) + dp9 + AndroidUtilities.dp(4.0f), measuredHeight2 + AndroidUtilities.dp(f10));
                        org.telegram.ui.Components.gd gdVar2 = (org.telegram.ui.Components.gd) this.f5570b;
                        gdVar2.f26860i = r10;
                        gdVar2.f26856c = r10;
                        gdVar2.a(rectF4);
                        org.telegram.ui.Components.gd gdVar3 = (org.telegram.ui.Components.gd) this.f5570b;
                        gdVar3.f26865n = true;
                        int k11 = i0.a.k(-1, 50);
                        gdVar3.f26859g.setColor((int) r10);
                        org.telegram.ui.Cells.z zVar2 = gdVar3.f26857e;
                        if (zVar2 != null) {
                            org.telegram.ui.ActionBar.i6.B1(zVar2, k11, true);
                        }
                        org.telegram.ui.Components.gd gdVar4 = (org.telegram.ui.Components.gd) this.f5570b;
                        gdVar4.c(canvas, gdVar4.f26859g);
                        org.telegram.ui.Cells.z zVar3 = gdVar4.f26857e;
                        if (zVar3 != null) {
                            zVar3.draw(canvas);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Components.gd gdVar5 = (org.telegram.ui.Components.gd) this.f5570b;
                    if (gdVar5 != null && (zVar = gdVar5.f26857e) != null) {
                        zVar.setState(StateSet.NOTHING);
                        zVar.jumpToCurrentState();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                Rect rect = (Rect) this.f5570b;
                x21 x21Var = (x21) this.f5571c;
                if (x21Var.R) {
                    x21Var.f42802f.setBounds(-rect.left, -rect.top, getWidth() + rect.right, getHeight() + rect.bottom);
                    x21Var.f42802f.draw(canvas);
                } else {
                    RectF rectF5 = AndroidUtilities.rectTmp;
                    rectF5.set(0.0f, 0.0f, AndroidUtilities.dp(14.0f) + getWidth(), getHeight());
                    canvas.drawRoundRect(rectF5, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), x21Var.f42798a);
                }
                super.dispatchDraw(canvas);
                return;
            case 24:
                ImageReceiver imageReceiver = (ImageReceiver) this.f5570b;
                imageReceiver.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                imageReceiver.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 28:
                ((rg.a1) this.f5570b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF6 = AndroidUtilities.rectTmp;
                rectF6.set(0.0f, AndroidUtilities.dp(2.0f), getMeasuredWidth(), AndroidUtilities.dp(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                rg.a1 a1Var = (rg.a1) this.f5570b;
                a1Var.f46052f.setAlpha(((rg.y0) this.f5571c).K);
                canvas.drawRoundRect(rectF6, AndroidUtilities.dp(24.0f) - 1, AndroidUtilities.dp(24.0f) - 1, a1Var.f46052f);
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
        switch (this.f5569a) {
            case 3:
                super.dispatchTouchEvent(motionEvent);
                return true;
            case 4:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f5571c;
                org.telegram.ui.Cells.ca o9 = i4Var.P0.o(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.f5570b;
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
                org.telegram.ui.Components.voip.k1 k1Var = (org.telegram.ui.Components.voip.k1) this.f5571c;
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
                if (!k1Var.F.isInProgress() && ((GestureDetector) k1Var.G.f14389b).onTouchEvent(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (action == 1 || action == 3) {
                    k1Var.H = false;
                    k1Var.I = false;
                    o1.k kVar = k1Var.S;
                    if (!kVar.f16986f) {
                        float f7 = k1Var.Q;
                        kVar.f16983b = f7;
                        kVar.f16984c = true;
                        o1.l lVar = kVar.f16993u;
                        int i10 = k1Var.M;
                        float f10 = (i10 / 2.0f) + f7;
                        int i11 = AndroidUtilities.displaySize.x;
                        if (f10 >= i11 / 2.0f) {
                            dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        lVar.f17000i = dp;
                        k1Var.S.f();
                    }
                    o1.k kVar2 = k1Var.T;
                    if (!kVar2.f16986f) {
                        float f11 = k1Var.R;
                        kVar2.f16983b = f11;
                        kVar2.f16984c = true;
                        kVar2.f16993u.f17000i = w7.q.a(f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - k1Var.N) - AndroidUtilities.dp(16.0f));
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
        switch (this.f5569a) {
            case 0:
                Path path = (Path) this.f5570b;
                n6 n6Var = (n6) this.f5571c;
                if (n6Var.h != null && (((z10 = n6Var.f5610f) && view == n6Var.d) || (!z10 && view == n6Var.f5608c))) {
                    if (z10) {
                        f7 = n6Var.f5609e;
                    } else {
                        f7 = 1.0f - n6Var.f5609e;
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
                if (view instanceof sd0) {
                    return false;
                }
                return super.drawChild(canvas, view, j3);
            case 21:
                if (view != ((SecretMediaViewer) this.f5570b).f34472w && super.drawChild(canvas, view, j3)) {
                    return true;
                }
                return false;
            case 22:
                Path path2 = (Path) this.f5570b;
                c51 c51Var = (c51) this.f5571c;
                RectF rectF = c51Var.R;
                if (view != c51Var.N && view != c51Var.f35324x) {
                    if (view == c51Var.P) {
                        canvas.save();
                        path2.rewind();
                        path2.addCircle(rectF.centerX() + c51Var.N.getX(), rectF.centerY() + c51Var.N.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                        canvas.clipPath(path2);
                        canvas.clipRect(0.0f, AndroidUtilities.lerp(c51Var.T, 0.0f, c51Var.f35322s), getWidth(), AndroidUtilities.lerp(c51Var.U, getHeight(), c51Var.f35322s));
                        canvas.translate(-c51Var.P.getX(), -c51Var.P.getY());
                        canvas.translate(c51Var.N.getX() + rectF.left, c51Var.N.getY() + rectF.top);
                        canvas.scale(rectF.width() / c51Var.P.getMeasuredWidth(), rectF.height() / c51Var.P.getMeasuredHeight(), c51Var.P.getX(), c51Var.P.getY());
                        boolean drawChild2 = super.drawChild(canvas, view, j3);
                        canvas.restore();
                        return drawChild2;
                    }
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(c51Var.T, 0.0f, c51Var.f35322s), getWidth(), AndroidUtilities.lerp(c51Var.U, getHeight(), c51Var.f35322s));
                boolean drawChild3 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild3;
            case 23:
                if (view == ((a71) this.f5571c).f34739h0 && zg.c0.f53348b && zg.c0.f53351f) {
                    for (int i10 = 0; i10 < ((a71) this.f5571c).f34739h0.getChildCount(); i10++) {
                        View childAt = ((a71) this.f5571c).f34739h0.getChildAt(i10);
                        if (childAt instanceof j61) {
                            j61 j61Var = (j61) childAt;
                            if (j61Var.getAnimatedScale() == 1.0f) {
                                ((Rect) this.f5570b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                canvas.save();
                                canvas.clipRect((Rect) this.f5570b);
                                super.drawChild(canvas, view, j3);
                                canvas.restore();
                            } else if (j61Var.getAnimatedScale() > 0.0f) {
                                ((Rect) this.f5570b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                Rect rect = (Rect) this.f5570b;
                                rect.set((int) (rect.centerX() - (j61Var.getAnimatedScale() * (((Rect) this.f5570b).width() / 2.0f))), (int) (((Rect) this.f5570b).centerY() - (j61Var.getAnimatedScale() * (((Rect) this.f5570b).height() / 2.0f))), (int) ((j61Var.getAnimatedScale() * (((Rect) this.f5570b).width() / 2.0f)) + ((Rect) this.f5570b).centerX()), (int) ((j61Var.getAnimatedScale() * (((Rect) this.f5570b).height() / 2.0f)) + ((Rect) this.f5570b).centerY()));
                                canvas.save();
                                canvas.clipRect((Rect) this.f5570b);
                                canvas.scale(j61Var.getAnimatedScale(), j61Var.getAnimatedScale(), ((Rect) this.f5570b).centerX(), ((Rect) this.f5570b).centerY());
                                super.drawChild(canvas, view, j3);
                                canvas.restore();
                            }
                        } else if ((childAt instanceof TextView) || (childAt instanceof e61) || (childAt instanceof d61) || (childAt instanceof f61)) {
                            ((Rect) this.f5570b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.f5570b);
                            super.drawChild(canvas, view, j3);
                            canvas.restore();
                        }
                    }
                    return false;
                }
                return super.drawChild(canvas, view, j3);
            case 27:
                Path path3 = (Path) this.f5570b;
                qg.l0 l0Var = (qg.l0) this.f5571c;
                if (l0Var.h != null && (((z11 = l0Var.f45143f) && view == l0Var.d) || (!z11 && view == l0Var.f45141c))) {
                    if (z11) {
                        f10 = l0Var.f45142e;
                    } else {
                        f10 = 1.0f - l0Var.f45142e;
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
        switch (this.f5569a) {
            case 2:
                super.invalidate();
                ((mg.i) this.f5571c).invalidate();
                return;
            case 26:
                super.invalidate();
                org.telegram.ui.ActionBar.q0 q0Var = ((pd1) this.f5571c).f39540t0;
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
        switch (this.f5569a) {
            case 16:
                super.onAttachedToWindow();
                rt rtVar = (rt) this.f5571c;
                rtVar.A.onAttachedToWindow();
                rtVar.B.onAttachedToWindow();
                return;
            case 19:
                super.onAttachedToWindow();
                ((ProfileActivity) this.f5571c).f34345r5.onAttachedToWindow();
                return;
            case 21:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.f5570b).h.onAttachedToWindow();
                return;
            case 24:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f5570b).onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.f5569a) {
            case 14:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                org.telegram.ui.Components.voip.k1 k1Var = (org.telegram.ui.Components.voip.k1) this.f5571c;
                AndroidUtilities.setPreferredMaxRefreshRate(k1Var.f32007b, k1Var.d, k1Var.f32008c);
                k1Var.i(false);
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f5569a) {
            case 16:
                super.onDetachedFromWindow();
                rt rtVar = (rt) this.f5571c;
                rtVar.A.onDetachedFromWindow();
                rtVar.B.onDetachedFromWindow();
                return;
            case 19:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.f5571c).f34345r5.onDetachedFromWindow();
                return;
            case 21:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.f5570b).h.onDetachedFromWindow();
                return;
            case 24:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f5570b).onDetachedFromWindow();
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
        switch (this.f5569a) {
            case 19:
                if ((((ProfileActivity) this.f5571c).f34318n5 == 0.0f && (gdVar = (org.telegram.ui.Components.gd) this.f5570b) != null && gdVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f5569a) {
            case 17:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = (i13 - i11) / 4;
                int i15 = i14 * 3;
                int z11 = bi.z(275.0f, i15, 2);
                c80 c80Var = (c80) this.f5571c;
                FrameLayout frameLayout = c80Var.f35354r;
                int i16 = 0;
                frameLayout.layout(0, z11, frameLayout.getMeasuredWidth(), c80Var.f35354r.getMeasuredHeight() + z11);
                int dp = AndroidUtilities.dp(139.0f) + AndroidUtilities.dp(150.0f) + z11;
                int measuredWidth = (getMeasuredWidth() - c80Var.f35351e.getMeasuredWidth()) / 2;
                org.telegram.ui.Components.ta taVar = c80Var.f35351e;
                taVar.layout(measuredWidth, dp, taVar.getMeasuredWidth() + measuredWidth, c80Var.f35351e.getMeasuredHeight() + dp);
                z4.g gVar = c80Var.d;
                gVar.layout(0, 0, gVar.getMeasuredWidth(), c80Var.d.getMeasuredHeight());
                int measuredHeight = ((i14 - c80Var.f35353n.getMeasuredHeight()) / 2) + i15;
                int measuredWidth2 = (getMeasuredWidth() - c80Var.f35353n.getMeasuredWidth()) / 2;
                bi.o oVar = c80Var.f35353n;
                oVar.layout(measuredWidth2, measuredHeight, oVar.getMeasuredWidth() + measuredWidth2, c80Var.f35353n.getMeasuredHeight() + measuredHeight);
                int dp2 = measuredHeight - AndroidUtilities.dp(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - c80Var.f35352f.getMeasuredWidth()) / 2;
                TextView textView = c80Var.f35352f;
                textView.layout(measuredWidth3, dp2 - textView.getMeasuredHeight(), c80Var.f35352f.getMeasuredWidth() + measuredWidth3, dp2);
                FrameLayout frameLayout2 = (FrameLayout) this.f5570b;
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
                int dp4 = AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(150.0f) + bi.z(275.0f, ((i13 - i11) / 4) * 3, 2);
                int dp5 = AndroidUtilities.dp(18.0f);
                TextView textView2 = (TextView) this.f5570b;
                textView2.layout(dp5, dp4, textView2.getMeasuredWidth() + dp5, textView2.getMeasuredHeight() + dp4);
                int dp6 = AndroidUtilities.dp(18.0f) + dp4 + ((int) textView2.getTextSize());
                int dp7 = AndroidUtilities.dp(16.0f);
                TextView textView3 = (TextView) this.f5571c;
                textView3.layout(dp7, dp6, textView3.getMeasuredWidth() + dp7, textView3.getMeasuredHeight() + dp6);
                return;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.f5571c).V4();
                return;
            case 20:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 21:
                super.onLayout(z10, i10, i11, i12, i13);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f5571c;
                if (secretMediaViewer.f34451n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f34451n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight;
                    v41 v41Var = secretMediaViewer.f34451n;
                    v41Var.layout(v41Var.getLeft(), currentActionBarHeight, secretMediaViewer.f34451n.getRight(), secretMediaViewer.f34451n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.f34460r != null && secretMediaViewer.f34451n != null) {
                    int measuredHeight2 = (secretMediaViewer.f34451n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f34451n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight)) - AndroidUtilities.dp(10.0f);
                    e4 e4Var = secretMediaViewer.f34460r;
                    e4Var.layout(e4Var.getLeft(), measuredHeight2, secretMediaViewer.f34460r.getRight(), secretMediaViewer.f34460r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.f34423a0 != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                    wt0 wt0Var = secretMediaViewer.f34423a0;
                    wt0Var.layout(wt0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.f34423a0.getRight(), secretMediaViewer.f34423a0.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f34436f;
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
        switch (this.f5569a) {
            case 1:
                ViewGroup viewGroup = (ViewGroup) this.f5570b;
                gg.e eVar = (gg.e) this.f5571c;
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
                if (!eVar.E && !eVar.f10562w) {
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
                super.onMeasure(i10, bi.B(8.0f, ((LinearLayout) this.f5570b).getMeasuredHeight(), 1073741824));
                return;
            case 9:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                return;
            case 11:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
                setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                return;
            case 20:
                x21 x21Var = (x21) this.f5571c;
                View view = x21Var.H;
                View view2 = x21Var.I;
                LinearLayout linearLayout = x21Var.v;
                TextView textView = x21Var.f42805s;
                zl0 zl0Var = x21Var.f42808y;
                boolean z10 = x21Var.S.P;
                int dp3 = AndroidUtilities.dp(12.0f);
                if (z10) {
                    zl0Var.setLayoutParams(w7.z5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
                    zl0Var.setPadding(dp3, 0, dp3, 0);
                    if (linearLayout != null) {
                        textView.setLayoutParams(w7.z5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(w7.z5.d(-1, 48.0f, 8388691, 16.0f, 162.0f, 16.0f, 16.0f));
                    } else {
                        textView.setLayoutParams(w7.z5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
                    }
                } else {
                    zl0Var.setPadding(dp3, dp3 / 2, dp3, dp3);
                    if (linearLayout != null) {
                        zl0Var.setLayoutParams(w7.z5.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 136.0f));
                        textView.setLayoutParams(w7.z5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(w7.z5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                    } else {
                        zl0Var.setLayoutParams(w7.z5.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 80.0f));
                        textView.setLayoutParams(w7.z5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
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
                    view2.setLayoutParams(w7.z5.d(-1, AndroidUtilities.dp(2.0f), 80, 0.0f, 0.0f, 0.0f, i12));
                    view.setVisibility(0);
                    view.setLayoutParams(w7.z5.d(-1, AndroidUtilities.dp(2.0f), 48, 0.0f, 44.0f, 0.0f, 0.0f));
                }
                if (x21Var.R != z10) {
                    y21 y21Var = x21Var.d;
                    if (z10) {
                        y21Var.getParentActivity();
                        sVar = new s4.c0(0, false);
                    } else {
                        y21Var.getParentActivity();
                        sVar = new s4.s(3, false);
                    }
                    x21Var.G = sVar;
                    zl0Var.setLayoutManager(sVar);
                    zl0Var.requestLayout();
                    int i14 = x21Var.L;
                    if (i14 != -1) {
                        x21Var.b(i14);
                    }
                    x21Var.R = z10;
                }
                super.onMeasure(i10, i11);
                return;
            case 21:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f5571c;
                wt0 wt0Var = secretMediaViewer.f34423a0;
                if (wt0Var != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                    int currentActionBarHeight = (measuredHeight2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                    if (secretMediaViewer.U.getVisibility() != 0) {
                        measuredHeight = 0;
                    } else {
                        measuredHeight = secretMediaViewer.U.getMeasuredHeight();
                    }
                    wt0Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(currentActionBarHeight - measuredHeight, 1073741824));
                }
                View view3 = secretMediaViewer.f34436f;
                if (view3 != null) {
                    view3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.navigationBarHeight, 1073741824));
                    return;
                }
                return;
            case 28:
                super.onMeasure(i10, bi.B(2.0f, ((rg.y0) this.f5571c).f46403s, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f5569a) {
            case 3:
                super.onSizeChanged(i10, i11, i12, i13);
                yf.y yVar = (yf.y) this.f5571c;
                yVar.setBounds(0, 0, i10, i11);
                yVar.c(0, AndroidUtilities.dp(24.0f) + getPaddingBottom());
                return;
            case 14:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.f5570b;
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
        switch (this.f5569a) {
            case 12:
                ((Paint) this.f5570b).setColor(i10);
                return;
            default:
                super.setBackgroundColor(i10);
                return;
        }
    }

    @Override
    public void setTranslationX(float f7) {
        switch (this.f5569a) {
            case 2:
                super.setTranslationX(f7);
                ((mg.i) this.f5571c).invalidate();
                return;
            default:
                super.setTranslationX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f5569a) {
            case 2:
                super.setTranslationY(f7);
                ((mg.i) this.f5571c).invalidate();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f5569a) {
            case 11:
                if (((org.telegram.ui.Components.o6) this.f5570b) != drawable && ((org.telegram.ui.Components.o6) this.f5571c) != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 20:
                if (drawable != ((x21) this.f5571c).f42802f && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public m6(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f5569a = i10;
        this.f5571c = obj;
        this.f5570b = obj2;
    }

    public m6(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f5569a = i10;
        switch (i10) {
            case 11:
                super(context);
                org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(true, true, true, false);
                this.f5570b = o6Var;
                tr trVar = tr.h;
                o6Var.k(0.3f, 430L, trVar);
                o6Var.u(AndroidUtilities.bold());
                o6Var.r(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.A8, d6Var));
                o6Var.t(AndroidUtilities.dp(18.0f));
                o6Var.n(!LocaleController.isRTL);
                o6Var.setCallback(this);
                o6Var.G = AndroidUtilities.displaySize.x;
                org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(true, true, true, false);
                this.f5571c = o6Var2;
                o6Var2.k(0.3f, 430L, trVar);
                o6Var2.r(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.B8, d6Var));
                o6Var2.t(AndroidUtilities.dp(14.0f));
                o6Var2.n(true ^ LocaleController.isRTL);
                o6Var2.setCallback(this);
                o6Var2.G = AndroidUtilities.displaySize.x;
                return;
            case 29:
                super(context);
                LinearLayout e7 = bi.e(context, 1);
                org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, false, false, false);
                this.f5570b = p6Var;
                int i11 = org.telegram.ui.ActionBar.i6.G6;
                p6Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
                p6Var.setTextSize(AndroidUtilities.dp(17.0f));
                p6Var.setTypeface(AndroidUtilities.bold());
                e7.addView(p6Var, w7.z5.q(-2, 23, 1));
                TextView textView = new TextView(context);
                this.f5571c = textView;
                textView.setTextSize(1, 11.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, d6Var));
                textView.setSingleLine();
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                e7.addView(textView, w7.z5.q(-2, -2, 1));
                addView(e7, w7.z5.e(-2, -2, 17));
                return;
            default:
                this.f5571c = new yf.y(8);
                this.f5570b = d6Var;
                return;
        }
    }

    public m6(org.telegram.ui.Cells.z0 z0Var, Context context) {
        super(context);
        this.f5569a = 6;
        this.f5571c = z0Var;
        this.f5570b = new RectF();
    }

    public m6(org.telegram.ui.bc bcVar, Context context) {
        super(context);
        this.f5569a = 7;
        this.f5571c = bcVar;
        this.f5570b = new Paint(1);
    }

    public m6(c51 c51Var, Context context) {
        super(context);
        this.f5569a = 22;
        this.f5571c = c51Var;
        this.f5570b = new Path();
    }

    public m6(org.telegram.ui.p5 p5Var, Activity activity) {
        super(activity);
        this.f5569a = 5;
        this.f5571c = p5Var;
        this.f5570b = new Paint(1);
    }

    public m6(org.telegram.ui.Components.voip.k1 k1Var, Context context) {
        super(context);
        this.f5569a = 14;
        this.f5571c = k1Var;
        this.f5570b = new Path();
    }

    public m6(ee0 ee0Var, Context context) {
        super(context);
        this.f5569a = 12;
        this.f5571c = ee0Var;
        this.f5570b = new Paint();
    }

    public m6(Context context, TextView textView, TextView textView2) {
        super(context);
        this.f5569a = 18;
        this.f5570b = textView;
        this.f5571c = textView2;
    }

    public m6(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f5569a = 21;
        this.f5571c = secretMediaViewer;
        this.f5570b = secretMediaViewer;
        setWillNotDraw(false);
    }

    public m6(a71 a71Var, Context context) {
        super(context);
        this.f5569a = 23;
        this.f5571c = a71Var;
        this.f5570b = new Rect();
    }

    public m6(x21 x21Var, Activity activity, y21 y21Var) {
        super(activity);
        this.f5569a = 20;
        this.f5571c = x21Var;
        Rect rect = new Rect();
        this.f5570b = rect;
        x21Var.f42798a.setColor(y21Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20827d6));
        Drawable drawable = x21Var.f42802f;
        drawable.setCallback(this);
        drawable.getPadding(rect);
    }

    public m6(pp ppVar, Context context) {
        super(context);
        this.f5569a = 9;
        this.f5571c = ppVar;
        this.f5570b = new Paint();
    }

    public m6(rt rtVar, Activity activity) {
        super(activity);
        this.f5569a = 16;
        this.f5571c = rtVar;
        this.f5570b = rtVar;
        setWillNotDraw(false);
    }

    public m6(pd1 pd1Var, Context context, int i10) {
        super(context);
        this.f5569a = i10;
        switch (i10) {
            case 26:
                this.f5571c = pd1Var;
                super(context);
                this.f5570b = new int[2];
                return;
            default:
                this.f5571c = pd1Var;
                this.f5570b = new Paint();
                return;
        }
    }

    public m6(qg.l0 l0Var, Context context) {
        super(context);
        this.f5569a = 27;
        this.f5571c = l0Var;
        this.f5570b = new Path();
    }

    public m6(sk0 sk0Var, Context context) {
        super(context);
        this.f5569a = 13;
        this.f5571c = sk0Var;
        this.f5570b = new Paint(1);
    }

    public m6(Context context, int i10) {
        super(context);
        this.f5569a = i10;
        switch (i10) {
            case 24:
                super(context);
                return;
            default:
                this.f5570b = new Path();
                this.f5571c = new k20();
                return;
        }
    }

    public m6(n6 n6Var, Context context) {
        super(context);
        this.f5569a = 0;
        this.f5571c = n6Var;
        this.f5570b = new Path();
    }
}
