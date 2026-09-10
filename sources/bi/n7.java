package bi;

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
import org.telegram.messenger.em;
import org.telegram.ui.Components.be0;
import org.telegram.ui.Components.ez;
import org.telegram.ui.Components.pd0;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.sp;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.ae1;
import org.telegram.ui.au0;
import org.telegram.ui.c80;
import org.telegram.ui.g51;
import org.telegram.ui.j31;
import org.telegram.ui.k31;
import org.telegram.ui.l71;
import org.telegram.ui.m20;
import org.telegram.ui.n51;
import org.telegram.ui.o61;
import org.telegram.ui.p61;
import org.telegram.ui.q61;
import org.telegram.ui.ql0;
import org.telegram.ui.tt;
import org.telegram.ui.u61;
public final class n7 extends FrameLayout {
    public final int f3238a;
    public Object f3239b;
    public Object f3240c;

    public n7(Object obj, Context context, int i10) {
        super(context);
        this.f3238a = i10;
        this.f3240c = obj;
    }

    public void a(String str, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) this.f3240c;
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        n6Var.q(str, z11, true);
    }

    public void b(String str, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) this.f3239b;
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        n6Var.q(str, z11, true);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f6 f6Var;
        Paint paint;
        boolean a12;
        int k10;
        org.telegram.ui.ActionBar.l5[] l5VarArr;
        float f7;
        ?? r92;
        char c10;
        float f10;
        float f11;
        org.telegram.ui.Cells.z zVar;
        float f12;
        switch (this.f3238a) {
            case 3:
                xf.z zVar2 = (xf.z) this.f3240c;
                zVar2.b(org.telegram.ui.ActionBar.j6.l1(0.65f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, (org.telegram.ui.ActionBar.f6) this.f3239b)));
                zVar2.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 5:
                super.dispatchDraw(canvas);
                Paint paint2 = (Paint) this.f3239b;
                int i10 = org.telegram.ui.ActionBar.j6.f17872a7;
                f6Var = ((org.telegram.ui.ActionBar.p2) ((org.telegram.ui.o5) this.f3240c).d).resourceProvider;
                paint2.setColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint2);
                return;
            case 6:
                RectF rectF = (RectF) this.f3239b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Cells.z0 z0Var = (org.telegram.ui.Cells.z0) this.f3240c;
                int measuredWidth = z0Var.getMeasuredWidth();
                int i11 = z0Var.d;
                float x10 = z0Var.getX();
                float f13 = z0Var.f20767c;
                org.telegram.ui.ActionBar.f6 f6Var2 = z0Var.f20766b;
                if (f6Var2 != null) {
                    f6Var2.l(x10, f13, measuredWidth, i11);
                } else {
                    org.telegram.ui.ActionBar.j6.q(x10, f13, measuredWidth, i11);
                }
                float dp = AndroidUtilities.dp(18.0f);
                float dp2 = AndroidUtilities.dp(18.0f);
                Paint paint3 = null;
                if (f6Var2 != null) {
                    paint = f6Var2.F("paintChatActionBackground");
                } else {
                    paint = null;
                }
                if (paint == null) {
                    paint = org.telegram.ui.ActionBar.j6.S0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, dp, dp2, paint);
                if (f6Var2 != null) {
                    a12 = f6Var2.m0();
                } else {
                    a12 = org.telegram.ui.ActionBar.j6.a1();
                }
                if (a12) {
                    float dp3 = AndroidUtilities.dp(18.0f);
                    float dp4 = AndroidUtilities.dp(18.0f);
                    if (f6Var2 != null) {
                        paint3 = f6Var2.F("paintChatActionBackgroundDarken");
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
                Paint paint4 = (Paint) this.f3239b;
                paint4.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17872a7, ((org.telegram.ui.cc) this.f3240c).f31604f.e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint4);
                return;
            case 8:
                float dp5 = AndroidUtilities.dp(20.0f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.f3239b;
                path.rewind();
                path.addRoundRect(rectF2, dp5, dp5, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF2, 255, 31);
                super.dispatchDraw(canvas);
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), AndroidUtilities.dp(6.0f) + getPaddingTop());
                m20 m20Var = (m20) this.f3240c;
                m20Var.b(canvas, rectF2, 1, 1.0f);
                rectF2.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                m20Var.b(canvas, rectF2, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                return;
            case 9:
                super.dispatchDraw(canvas);
                Paint paint5 = (Paint) this.f3239b;
                paint5.setColor(((sp) this.f3240c).getThemedColor(org.telegram.ui.ActionBar.j6.f17929d7));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint5);
                return;
            case 10:
                ez ezVar = (ez) this.f3240c;
                if (!ezVar.G.f26860u0 && ezVar.f22786w > 0.0f) {
                    if (((Paint) this.f3239b) == null) {
                        Paint paint6 = new Paint();
                        this.f3239b = paint6;
                        paint6.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f3239b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f3239b).setAlpha((int) (ezVar.f22786w * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f3239b);
                    canvas.restore();
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 11:
                org.telegram.ui.Components.n6 n6Var = (org.telegram.ui.Components.n6) this.f3239b;
                int dp6 = AndroidUtilities.dp(29.0f);
                int dp7 = AndroidUtilities.dp(18.83f);
                org.telegram.ui.Components.n6 n6Var2 = (org.telegram.ui.Components.n6) this.f3240c;
                n6Var.setBounds(getPaddingLeft(), r3 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r3);
                n6Var.draw(canvas);
                n6Var2.setBounds(getPaddingLeft(), r2 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r2);
                n6Var2.draw(canvas);
                return;
            case 13:
                Paint paint7 = (Paint) this.f3239b;
                pk0 pk0Var = (pk0) this.f3240c;
                int i12 = pk0Var.M0;
                if (i12 != 1 && i12 != 2 && i12 != 4) {
                    k10 = i0.a.d(0.7f, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.F8, pk0Var.f26182k0), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17998h5, pk0Var.f26182k0));
                } else {
                    k10 = i0.a.k(-1, 30);
                }
                paint7.setColor(k10);
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - AndroidUtilities.dpf2(6.0f)) / 2.0f;
                float g10 = pk0Var.g();
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
                ProfileActivity profileActivity = (ProfileActivity) this.f3240c;
                org.telegram.ui.ActionBar.l5[] l5VarArr2 = profileActivity.f30467r;
                if (profileActivity.W4 != null) {
                    canvas.save();
                    canvas.translate(l5VarArr2[0].getX(), l5VarArr2[0].getY());
                    l5VarArr = l5VarArr2;
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
                    l5VarArr = l5VarArr2;
                    f7 = 0.0f;
                    r92 = 0;
                    c10 = 2;
                    f10 = 14.0f;
                    f11 = 24.0f;
                }
                if (profileActivity.p5 && profileActivity.Y5 != f7 && profileActivity.f30446n5 != 1.0f) {
                    float measuredHeight2 = (l5VarArr[1].getMeasuredHeight() / 2.0f) + l5VarArr[1].getY();
                    float dp8 = AndroidUtilities.dp(22.0f);
                    float x11 = ((l5VarArr[1].getX() + (AndroidUtilities.dp(28.0f) - profileActivity.f30453o5)) - dp8) - profileActivity.Z3();
                    profileActivity.f30473r5.setImageCoords(x11, measuredHeight2 - (dp8 / 2.0f), dp8, dp8);
                    profileActivity.f30473r5.setAlpha(profileActivity.Y5);
                    canvas.save();
                    float f14 = profileActivity.Y5;
                    canvas.scale(f14, f14, profileActivity.f30473r5.getCenterX(), profileActivity.f30473r5.getCenterY());
                    profileActivity.f30473r5.draw(canvas);
                    canvas.restore();
                    if (profileActivity.f30446n5 == f7) {
                        if (((org.telegram.ui.Components.ed) this.f3239b) == null) {
                            org.telegram.ui.Components.ed edVar = new org.telegram.ui.Components.ed(this);
                            this.f3239b = edVar;
                            edVar.h = new ql0(this, 29);
                        }
                        float dp9 = (1.0f - profileActivity.f30446n5) * AndroidUtilities.dp(28.0f);
                        float textWidth = l5VarArr[c10].getTextWidth();
                        if (profileActivity.T != null) {
                            f12 = (AndroidUtilities.dp(f11) + textWidth + AndroidUtilities.dp(4.0f)) * profileActivity.T.getVisibilityFactor();
                        } else {
                            f12 = 0.0f;
                        }
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        rectF4.set(x11 - AndroidUtilities.dp(4.0f), measuredHeight2 - AndroidUtilities.dp(f10), x11 + Math.max(textWidth, f12) + dp9 + AndroidUtilities.dp(4.0f), measuredHeight2 + AndroidUtilities.dp(f10));
                        org.telegram.ui.Components.ed edVar2 = (org.telegram.ui.Components.ed) this.f3239b;
                        edVar2.f22677i = r92;
                        edVar2.f22674c = r92;
                        edVar2.a(rectF4);
                        org.telegram.ui.Components.ed edVar3 = (org.telegram.ui.Components.ed) this.f3239b;
                        edVar3.f22682n = true;
                        int k11 = i0.a.k(-1, 50);
                        edVar3.f22676g.setColor((int) r92);
                        org.telegram.ui.Cells.z zVar3 = edVar3.e;
                        if (zVar3 != null) {
                            org.telegram.ui.ActionBar.j6.B1(zVar3, k11, true);
                        }
                        org.telegram.ui.Components.ed edVar4 = (org.telegram.ui.Components.ed) this.f3239b;
                        edVar4.c(canvas, edVar4.f22676g);
                        org.telegram.ui.Cells.z zVar4 = edVar4.e;
                        if (zVar4 != null) {
                            zVar4.draw(canvas);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Components.ed edVar5 = (org.telegram.ui.Components.ed) this.f3239b;
                    if (edVar5 != null && (zVar = edVar5.e) != null) {
                        zVar.setState(StateSet.NOTHING);
                        zVar.jumpToCurrentState();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                Rect rect = (Rect) this.f3239b;
                j31 j31Var = (j31) this.f3240c;
                if (j31Var.R) {
                    j31Var.f33869f.setBounds(-rect.left, -rect.top, getWidth() + rect.right, getHeight() + rect.bottom);
                    j31Var.f33869f.draw(canvas);
                } else {
                    RectF rectF5 = AndroidUtilities.rectTmp;
                    rectF5.set(0.0f, 0.0f, AndroidUtilities.dp(14.0f) + getWidth(), getHeight());
                    canvas.drawRoundRect(rectF5, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), j31Var.f33866a);
                }
                super.dispatchDraw(canvas);
                return;
            case 24:
                ImageReceiver imageReceiver = (ImageReceiver) this.f3239b;
                imageReceiver.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                imageReceiver.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 28:
                ((qg.c1) this.f3239b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF6 = AndroidUtilities.rectTmp;
                rectF6.set(0.0f, AndroidUtilities.dp(2.0f), getMeasuredWidth(), AndroidUtilities.dp(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                qg.c1 c1Var = (qg.c1) this.f3239b;
                c1Var.f40690f.setAlpha(((qg.a1) this.f3240c).K);
                canvas.drawRoundRect(rectF6, AndroidUtilities.dp(24.0f) - 1, AndroidUtilities.dp(24.0f) - 1, c1Var.f40690f);
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
        switch (this.f3238a) {
            case 3:
                super.dispatchTouchEvent(motionEvent);
                return true;
            case 4:
                org.telegram.ui.j4 j4Var = (org.telegram.ui.j4) this.f3240c;
                org.telegram.ui.Cells.ea o9 = j4Var.P0.o(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.f3239b;
                obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (j4Var.P0.y() && j4Var.P0.o(getContext()).onTouchEvent(obtain)) {
                    return true;
                }
                if (o9.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() == 0 && j4Var.P0.y() && (motionEvent.getY() < linearLayout.getTop() || motionEvent.getY() > linearLayout.getBottom())) {
                    if (!j4Var.P0.o(getContext()).onTouchEvent(obtain)) {
                        return true;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            case 14:
                int action = motionEvent.getAction();
                org.telegram.ui.Components.voip.i1 i1Var = (org.telegram.ui.Components.voip.i1) this.f3240c;
                if (i1Var.J != null) {
                    MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                    obtain2.offsetLocation(i1Var.J.getX(), i1Var.J.getY());
                    boolean dispatchTouchEvent = i1Var.J.dispatchTouchEvent(motionEvent);
                    obtain2.recycle();
                    if (action == 1 || action == 3) {
                        i1Var.J = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                obtain3.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = i1Var.F.onTouchEvent(obtain3);
                obtain3.recycle();
                if (!i1Var.F.isInProgress() && ((GestureDetector) i1Var.G.f12721b).onTouchEvent(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (action == 1 || action == 3) {
                    i1Var.H = false;
                    i1Var.I = false;
                    o1.k kVar = i1Var.S;
                    if (!kVar.f14127f) {
                        float f7 = i1Var.Q;
                        kVar.f14125b = f7;
                        kVar.f14126c = true;
                        o1.l lVar = kVar.f14134u;
                        int i10 = i1Var.M;
                        float f10 = (i10 / 2.0f) + f7;
                        int i11 = AndroidUtilities.displaySize.x;
                        if (f10 >= i11 / 2.0f) {
                            dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        lVar.f14140i = dp;
                        i1Var.S.f();
                    }
                    o1.k kVar2 = i1Var.T;
                    if (!kVar2.f14127f) {
                        float f11 = i1Var.R;
                        kVar2.f14125b = f11;
                        kVar2.f14126c = true;
                        kVar2.f14134u.f14140i = w7.q.a(f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - i1Var.N) - AndroidUtilities.dp(16.0f));
                        i1Var.T.f();
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
        switch (this.f3238a) {
            case 0:
                Path path = (Path) this.f3239b;
                o7 o7Var = (o7) this.f3240c;
                if (o7Var.h != null && (((z10 = o7Var.f3324f) && view == o7Var.d) || (!z10 && view == o7Var.f3323c))) {
                    if (z10) {
                        f7 = o7Var.e;
                    } else {
                        f7 = 1.0f - o7Var.e;
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
                if (view != ((SecretMediaViewer) this.f3239b).f30597w && super.drawChild(canvas, view, j3)) {
                    return true;
                }
                return false;
            case 22:
                Path path2 = (Path) this.f3239b;
                n51 n51Var = (n51) this.f3240c;
                RectF rectF = n51Var.R;
                if (view != n51Var.N && view != n51Var.f35133x) {
                    if (view == n51Var.P) {
                        canvas.save();
                        path2.rewind();
                        path2.addCircle(rectF.centerX() + n51Var.N.getX(), rectF.centerY() + n51Var.N.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                        canvas.clipPath(path2);
                        canvas.clipRect(0.0f, AndroidUtilities.lerp(n51Var.T, 0.0f, n51Var.f35131s), getWidth(), AndroidUtilities.lerp(n51Var.U, getHeight(), n51Var.f35131s));
                        canvas.translate(-n51Var.P.getX(), -n51Var.P.getY());
                        canvas.translate(n51Var.N.getX() + rectF.left, n51Var.N.getY() + rectF.top);
                        canvas.scale(rectF.width() / n51Var.P.getMeasuredWidth(), rectF.height() / n51Var.P.getMeasuredHeight(), n51Var.P.getX(), n51Var.P.getY());
                        boolean drawChild2 = super.drawChild(canvas, view, j3);
                        canvas.restore();
                        return drawChild2;
                    }
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(n51Var.T, 0.0f, n51Var.f35131s), getWidth(), AndroidUtilities.lerp(n51Var.U, getHeight(), n51Var.f35131s));
                boolean drawChild3 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild3;
            case 23:
                if (view == ((l71) this.f3240c).f34570h0 && yg.f0.f46996b && yg.f0.f46998f) {
                    for (int i10 = 0; i10 < ((l71) this.f3240c).f34570h0.getChildCount(); i10++) {
                        View childAt = ((l71) this.f3240c).f34570h0.getChildAt(i10);
                        if (childAt instanceof u61) {
                            u61 u61Var = (u61) childAt;
                            if (u61Var.getAnimatedScale() == 1.0f) {
                                ((Rect) this.f3239b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                canvas.save();
                                canvas.clipRect((Rect) this.f3239b);
                                super.drawChild(canvas, view, j3);
                                canvas.restore();
                            } else if (u61Var.getAnimatedScale() > 0.0f) {
                                ((Rect) this.f3239b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                Rect rect = (Rect) this.f3239b;
                                rect.set((int) (rect.centerX() - (u61Var.getAnimatedScale() * (((Rect) this.f3239b).width() / 2.0f))), (int) (((Rect) this.f3239b).centerY() - (u61Var.getAnimatedScale() * (((Rect) this.f3239b).height() / 2.0f))), (int) ((u61Var.getAnimatedScale() * (((Rect) this.f3239b).width() / 2.0f)) + ((Rect) this.f3239b).centerX()), (int) ((u61Var.getAnimatedScale() * (((Rect) this.f3239b).height() / 2.0f)) + ((Rect) this.f3239b).centerY()));
                                canvas.save();
                                canvas.clipRect((Rect) this.f3239b);
                                canvas.scale(u61Var.getAnimatedScale(), u61Var.getAnimatedScale(), ((Rect) this.f3239b).centerX(), ((Rect) this.f3239b).centerY());
                                super.drawChild(canvas, view, j3);
                                canvas.restore();
                            }
                        } else if ((childAt instanceof TextView) || (childAt instanceof p61) || (childAt instanceof o61) || (childAt instanceof q61)) {
                            ((Rect) this.f3239b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.f3239b);
                            super.drawChild(canvas, view, j3);
                            canvas.restore();
                        }
                    }
                    return false;
                }
                return super.drawChild(canvas, view, j3);
            case 27:
                Path path3 = (Path) this.f3239b;
                pg.l0 l0Var = (pg.l0) this.f3240c;
                if (l0Var.h != null && (((z11 = l0Var.f40097f) && view == l0Var.d) || (!z11 && view == l0Var.f40096c))) {
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
        switch (this.f3238a) {
            case 2:
                super.invalidate();
                ((lg.i) this.f3240c).invalidate();
                return;
            case 26:
                super.invalidate();
                org.telegram.ui.ActionBar.r0 r0Var = ((ae1) this.f3240c).f30966t0;
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
        switch (this.f3238a) {
            case 16:
                super.onAttachedToWindow();
                tt ttVar = (tt) this.f3240c;
                ttVar.A.onAttachedToWindow();
                ttVar.B.onAttachedToWindow();
                return;
            case 19:
                super.onAttachedToWindow();
                ((ProfileActivity) this.f3240c).f30473r5.onAttachedToWindow();
                return;
            case 21:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.f3239b).h.onAttachedToWindow();
                return;
            case 24:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f3239b).onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.f3238a) {
            case 14:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                org.telegram.ui.Components.voip.i1 i1Var = (org.telegram.ui.Components.voip.i1) this.f3240c;
                AndroidUtilities.setPreferredMaxRefreshRate(i1Var.f28172b, i1Var.d, i1Var.f28173c);
                i1Var.i(false);
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f3238a) {
            case 16:
                super.onDetachedFromWindow();
                tt ttVar = (tt) this.f3240c;
                ttVar.A.onDetachedFromWindow();
                ttVar.B.onDetachedFromWindow();
                return;
            case 19:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.f3240c).f30473r5.onDetachedFromWindow();
                return;
            case 21:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.f3239b).h.onDetachedFromWindow();
                return;
            case 24:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f3239b).onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: bi.n7.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.ed edVar;
        switch (this.f3238a) {
            case 19:
                if ((((ProfileActivity) this.f3240c).f30446n5 == 0.0f && (edVar = (org.telegram.ui.Components.ed) this.f3239b) != null && edVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f3238a) {
            case 17:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = (i13 - i11) / 4;
                int i15 = i14 * 3;
                int y3 = em.y(275.0f, i15, 2);
                c80 c80Var = (c80) this.f3240c;
                FrameLayout frameLayout = c80Var.f31566r;
                int i16 = 0;
                frameLayout.layout(0, y3, frameLayout.getMeasuredWidth(), c80Var.f31566r.getMeasuredHeight() + y3);
                int dp = AndroidUtilities.dp(139.0f) + AndroidUtilities.dp(150.0f) + y3;
                int measuredWidth = (getMeasuredWidth() - c80Var.e.getMeasuredWidth()) / 2;
                org.telegram.ui.Components.ra raVar = c80Var.e;
                raVar.layout(measuredWidth, dp, raVar.getMeasuredWidth() + measuredWidth, c80Var.e.getMeasuredHeight() + dp);
                z4.g gVar = c80Var.d;
                gVar.layout(0, 0, gVar.getMeasuredWidth(), c80Var.d.getMeasuredHeight());
                int measuredHeight = ((i14 - c80Var.f31565n.getMeasuredHeight()) / 2) + i15;
                int measuredWidth2 = (getMeasuredWidth() - c80Var.f31565n.getMeasuredWidth()) / 2;
                ai.t tVar = c80Var.f31565n;
                tVar.layout(measuredWidth2, measuredHeight, tVar.getMeasuredWidth() + measuredWidth2, c80Var.f31565n.getMeasuredHeight() + measuredHeight);
                int dp2 = measuredHeight - AndroidUtilities.dp(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - c80Var.f31564f.getMeasuredWidth()) / 2;
                TextView textView = c80Var.f31564f;
                textView.layout(measuredWidth3, dp2 - textView.getMeasuredHeight(), c80Var.f31564f.getMeasuredWidth() + measuredWidth3, dp2);
                FrameLayout frameLayout2 = (FrameLayout) this.f3239b;
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
                int dp4 = AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(150.0f) + em.y(275.0f, ((i13 - i11) / 4) * 3, 2);
                int dp5 = AndroidUtilities.dp(18.0f);
                TextView textView2 = (TextView) this.f3239b;
                textView2.layout(dp5, dp4, textView2.getMeasuredWidth() + dp5, textView2.getMeasuredHeight() + dp4);
                int dp6 = AndroidUtilities.dp(18.0f) + dp4 + ((int) textView2.getTextSize());
                int dp7 = AndroidUtilities.dp(16.0f);
                TextView textView3 = (TextView) this.f3240c;
                textView3.layout(dp7, dp6, textView3.getMeasuredWidth() + dp7, textView3.getMeasuredHeight() + dp6);
                return;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.f3240c).V4();
                return;
            case 20:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 21:
                super.onLayout(z10, i10, i11, i12, i13);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f3240c;
                if (secretMediaViewer.f30576n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - secretMediaViewer.f30576n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight;
                    g51 g51Var = secretMediaViewer.f30576n;
                    g51Var.layout(g51Var.getLeft(), currentActionBarHeight, secretMediaViewer.f30576n.getRight(), secretMediaViewer.f30576n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.f30585r != null && secretMediaViewer.f30576n != null) {
                    int measuredHeight2 = (secretMediaViewer.f30576n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - secretMediaViewer.f30576n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight)) - AndroidUtilities.dp(10.0f);
                    x4 x4Var = secretMediaViewer.f30585r;
                    x4Var.layout(x4Var.getLeft(), measuredHeight2, secretMediaViewer.f30585r.getRight(), secretMediaViewer.f30585r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.f30549a0 != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                    au0 au0Var = secretMediaViewer.f30549a0;
                    au0Var.layout(au0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.f30549a0.getRight(), secretMediaViewer.f30549a0.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f30561f;
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
        switch (this.f3238a) {
            case 1:
                ViewGroup viewGroup = (ViewGroup) this.f3239b;
                fg.e eVar = (fg.e) this.f3240c;
                if (eVar.K && eVar.J) {
                    super.onMeasure(i10, i11);
                    return;
                }
                int size = View.MeasureSpec.getSize(i11);
                if (size == 0) {
                    size = viewGroup.getMeasuredHeight();
                }
                if (size == 0) {
                    size = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                }
                int dp2 = AndroidUtilities.dp(50.0f);
                int i13 = 0;
                if (eVar.v != 0) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(30.0f) + dp2;
                }
                if (!eVar.E && !eVar.f7997w) {
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
                super.onMeasure(i10, em.C(8.0f, ((LinearLayout) this.f3239b).getMeasuredHeight(), 1073741824));
                return;
            case 9:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                return;
            case 11:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
                setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                return;
            case 20:
                j31 j31Var = (j31) this.f3240c;
                View view = j31Var.H;
                View view2 = j31Var.I;
                LinearLayout linearLayout = j31Var.v;
                TextView textView = j31Var.f33872s;
                vl0 vl0Var = j31Var.f33875y;
                boolean z10 = j31Var.S.P;
                int dp3 = AndroidUtilities.dp(12.0f);
                if (z10) {
                    vl0Var.setLayoutParams(w7.a6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
                    vl0Var.setPadding(dp3, 0, dp3, 0);
                    if (linearLayout != null) {
                        textView.setLayoutParams(w7.a6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(w7.a6.d(-1, 48.0f, 8388691, 16.0f, 162.0f, 16.0f, 16.0f));
                    } else {
                        textView.setLayoutParams(w7.a6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
                    }
                } else {
                    vl0Var.setPadding(dp3, dp3 / 2, dp3, dp3);
                    if (linearLayout != null) {
                        vl0Var.setLayoutParams(w7.a6.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 136.0f));
                        textView.setLayoutParams(w7.a6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(w7.a6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                    } else {
                        vl0Var.setLayoutParams(w7.a6.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 80.0f));
                        textView.setLayoutParams(w7.a6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
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
                    view2.setLayoutParams(w7.a6.d(-1, AndroidUtilities.dp(2.0f), 80, 0.0f, 0.0f, 0.0f, i12));
                    view.setVisibility(0);
                    view.setLayoutParams(w7.a6.d(-1, AndroidUtilities.dp(2.0f), 48, 0.0f, 44.0f, 0.0f, 0.0f));
                }
                if (j31Var.R != z10) {
                    k31 k31Var = j31Var.d;
                    if (z10) {
                        k31Var.getParentActivity();
                        sVar = new s4.c0(0, false);
                    } else {
                        k31Var.getParentActivity();
                        sVar = new s4.s(3, false);
                    }
                    j31Var.G = sVar;
                    vl0Var.setLayoutManager(sVar);
                    vl0Var.requestLayout();
                    int i14 = j31Var.L;
                    if (i14 != -1) {
                        j31Var.b(i14);
                    }
                    j31Var.R = z10;
                }
                super.onMeasure(i10, i11);
                return;
            case 21:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f3240c;
                au0 au0Var = secretMediaViewer.f30549a0;
                if (au0Var != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                    int currentActionBarHeight = (measuredHeight2 - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                    if (secretMediaViewer.U.getVisibility() != 0) {
                        measuredHeight = 0;
                    } else {
                        measuredHeight = secretMediaViewer.U.getMeasuredHeight();
                    }
                    au0Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(currentActionBarHeight - measuredHeight, 1073741824));
                }
                View view3 = secretMediaViewer.f30561f;
                if (view3 != null) {
                    view3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.navigationBarHeight, 1073741824));
                    return;
                }
                return;
            case 28:
                super.onMeasure(i10, em.C(2.0f, ((qg.a1) this.f3240c).f40665s, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f3238a) {
            case 3:
                super.onSizeChanged(i10, i11, i12, i13);
                xf.z zVar = (xf.z) this.f3240c;
                zVar.setBounds(0, 0, i10, i11);
                zVar.c(0, AndroidUtilities.dp(24.0f) + getPaddingBottom());
                return;
            case 14:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.f3239b;
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
        throw new UnsupportedOperationException("Method not decompiled: bi.n7.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setBackgroundColor(int i10) {
        switch (this.f3238a) {
            case 12:
                ((Paint) this.f3239b).setColor(i10);
                return;
            default:
                super.setBackgroundColor(i10);
                return;
        }
    }

    @Override
    public void setTranslationX(float f7) {
        switch (this.f3238a) {
            case 2:
                super.setTranslationX(f7);
                ((lg.i) this.f3240c).invalidate();
                return;
            default:
                super.setTranslationX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f3238a) {
            case 2:
                super.setTranslationY(f7);
                ((lg.i) this.f3240c).invalidate();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f3238a) {
            case 11:
                if (((org.telegram.ui.Components.n6) this.f3239b) != drawable && ((org.telegram.ui.Components.n6) this.f3240c) != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 20:
                if (drawable != ((j31) this.f3240c).f33869f && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public n7(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f3238a = i10;
        this.f3240c = obj;
        this.f3239b = obj2;
    }

    public n7(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f3238a = i10;
        switch (i10) {
            case 11:
                super(context);
                org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(true, true, true, false);
                this.f3239b = n6Var;
                wr wrVar = wr.h;
                n6Var.k(0.3f, 430L, wrVar);
                n6Var.u(AndroidUtilities.bold());
                n6Var.r(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.A8, f6Var));
                n6Var.t(AndroidUtilities.dp(18.0f));
                n6Var.n(!LocaleController.isRTL);
                n6Var.setCallback(this);
                n6Var.G = AndroidUtilities.displaySize.x;
                org.telegram.ui.Components.n6 n6Var2 = new org.telegram.ui.Components.n6(true, true, true, false);
                this.f3240c = n6Var2;
                n6Var2.k(0.3f, 430L, wrVar);
                n6Var2.r(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B8, f6Var));
                n6Var2.t(AndroidUtilities.dp(14.0f));
                n6Var2.n(true ^ LocaleController.isRTL);
                n6Var2.setCallback(this);
                n6Var2.G = AndroidUtilities.displaySize.x;
                return;
            case 29:
                super(context);
                LinearLayout f7 = em.f(context, 1);
                org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, false, false);
                this.f3239b = o6Var;
                int i11 = org.telegram.ui.ActionBar.j6.G6;
                o6Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
                o6Var.setTextSize(AndroidUtilities.dp(17.0f));
                o6Var.setTypeface(AndroidUtilities.bold());
                f7.addView(o6Var, w7.a6.q(-2, 23, 1));
                TextView textView = new TextView(context);
                this.f3240c = textView;
                textView.setTextSize(1, 11.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, f6Var));
                textView.setSingleLine();
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                f7.addView(textView, w7.a6.q(-2, -2, 1));
                addView(f7, w7.a6.e(-2, -2, 17));
                return;
            default:
                this.f3240c = new xf.z(8);
                this.f3239b = f6Var;
                return;
        }
    }

    public n7(org.telegram.ui.Cells.z0 z0Var, Context context) {
        super(context);
        this.f3238a = 6;
        this.f3240c = z0Var;
        this.f3239b = new RectF();
    }

    public n7(n51 n51Var, Context context) {
        super(context);
        this.f3238a = 22;
        this.f3240c = n51Var;
        this.f3239b = new Path();
    }

    public n7(org.telegram.ui.cc ccVar, Context context) {
        super(context);
        this.f3238a = 7;
        this.f3240c = ccVar;
        this.f3239b = new Paint(1);
    }

    public n7(org.telegram.ui.o5 o5Var, Activity activity) {
        super(activity);
        this.f3238a = 5;
        this.f3240c = o5Var;
        this.f3239b = new Paint(1);
    }

    public n7(org.telegram.ui.Components.voip.i1 i1Var, Context context) {
        super(context);
        this.f3238a = 14;
        this.f3240c = i1Var;
        this.f3239b = new Path();
    }

    public n7(be0 be0Var, Context context) {
        super(context);
        this.f3238a = 12;
        this.f3240c = be0Var;
        this.f3239b = new Paint();
    }

    public n7(Context context, TextView textView, TextView textView2) {
        super(context);
        this.f3238a = 18;
        this.f3239b = textView;
        this.f3240c = textView2;
    }

    public n7(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f3238a = 21;
        this.f3240c = secretMediaViewer;
        this.f3239b = secretMediaViewer;
        setWillNotDraw(false);
    }

    public n7(l71 l71Var, Context context) {
        super(context);
        this.f3238a = 23;
        this.f3240c = l71Var;
        this.f3239b = new Rect();
    }

    public n7(j31 j31Var, Activity activity, k31 k31Var) {
        super(activity);
        this.f3238a = 20;
        this.f3240c = j31Var;
        Rect rect = new Rect();
        this.f3239b = rect;
        j31Var.f33866a.setColor(k31Var.getThemedColor(org.telegram.ui.ActionBar.j6.f17928d6));
        Drawable drawable = j31Var.f33869f;
        drawable.setCallback(this);
        drawable.getPadding(rect);
    }

    public n7(sp spVar, Context context) {
        super(context);
        this.f3238a = 9;
        this.f3240c = spVar;
        this.f3239b = new Paint();
    }

    public n7(tt ttVar, Activity activity) {
        super(activity);
        this.f3238a = 16;
        this.f3240c = ttVar;
        this.f3239b = ttVar;
        setWillNotDraw(false);
    }

    public n7(ae1 ae1Var, Context context, int i10) {
        super(context);
        this.f3238a = i10;
        switch (i10) {
            case 26:
                this.f3240c = ae1Var;
                super(context);
                this.f3239b = new int[2];
                return;
            default:
                this.f3240c = ae1Var;
                this.f3239b = new Paint();
                return;
        }
    }

    public n7(pg.l0 l0Var, Context context) {
        super(context);
        this.f3238a = 27;
        this.f3240c = l0Var;
        this.f3239b = new Path();
    }

    public n7(pk0 pk0Var, Context context) {
        super(context);
        this.f3238a = 13;
        this.f3240c = pk0Var;
        this.f3239b = new Paint(1);
    }

    public n7(Context context, int i10) {
        super(context);
        this.f3238a = i10;
        switch (i10) {
            case 24:
                super(context);
                return;
            default:
                this.f3239b = new Path();
                this.f3240c = new m20();
                return;
        }
    }

    public n7(o7 o7Var, Context context) {
        super(context);
        this.f3238a = 0;
        this.f3240c = o7Var;
        this.f3239b = new Path();
    }
}
