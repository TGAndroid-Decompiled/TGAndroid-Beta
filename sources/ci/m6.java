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
import org.telegram.messenger.ai;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.ie0;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.bu0;
import org.telegram.ui.c31;
import org.telegram.ui.c51;
import org.telegram.ui.c80;
import org.telegram.ui.d31;
import org.telegram.ui.i20;
import org.telegram.ui.j51;
import org.telegram.ui.j71;
import org.telegram.ui.m61;
import org.telegram.ui.mz0;
import org.telegram.ui.n61;
import org.telegram.ui.o61;
import org.telegram.ui.qt;
import org.telegram.ui.s61;
import org.telegram.ui.wd1;
public final class m6 extends FrameLayout {
    public final int f5598a;
    public Object f5599b;
    public Object f5600c;

    public m6(Object obj, Context context, int i10) {
        super(context);
        this.f5598a = i10;
        this.f5600c = obj;
    }

    public void a(String str, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.q6 q6Var = (org.telegram.ui.Components.q6) this.f5600c;
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        q6Var.t(str, z11, true);
    }

    public void b(String str, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.q6 q6Var = (org.telegram.ui.Components.q6) this.f5599b;
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        q6Var.t(str, z11, true);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.d6 d6Var;
        Paint paint;
        boolean b12;
        int k10;
        org.telegram.ui.ActionBar.h5[] h5VarArr;
        float f7;
        float f10;
        float f11;
        char c10;
        ?? r10;
        org.telegram.ui.Cells.z zVar;
        float f12;
        switch (this.f5598a) {
            case 3:
                yf.y yVar = (yf.y) this.f5600c;
                yVar.b(org.telegram.ui.ActionBar.h6.m1(0.65f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20786d6, (org.telegram.ui.ActionBar.d6) this.f5599b)));
                yVar.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 4:
            case 12:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 21:
            case 22:
            case 23:
            case 25:
            case 26:
            case 28:
            default:
                super.dispatchDraw(canvas);
                return;
            case 5:
                super.dispatchDraw(canvas);
                Paint paint2 = (Paint) this.f5599b;
                int i10 = org.telegram.ui.ActionBar.h6.f20730a7;
                d6Var = ((org.telegram.ui.ActionBar.m2) ((org.telegram.ui.n5) this.f5600c).d).resourceProvider;
                paint2.setColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint2);
                return;
            case 6:
                RectF rectF = (RectF) this.f5599b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Cells.z0 z0Var = (org.telegram.ui.Cells.z0) this.f5600c;
                int measuredWidth = z0Var.getMeasuredWidth();
                int i11 = z0Var.d;
                float x10 = z0Var.getX();
                float f13 = z0Var.f23786c;
                org.telegram.ui.ActionBar.d6 d6Var2 = z0Var.f23785b;
                if (d6Var2 != null) {
                    d6Var2.m(x10, f13, measuredWidth, i11);
                } else {
                    org.telegram.ui.ActionBar.h6.q(x10, f13, measuredWidth, i11);
                }
                float dp = AndroidUtilities.dp(18.0f);
                float dp2 = AndroidUtilities.dp(18.0f);
                Paint paint3 = null;
                if (d6Var2 != null) {
                    paint = d6Var2.F("paintChatActionBackground");
                } else {
                    paint = null;
                }
                if (paint == null) {
                    paint = org.telegram.ui.ActionBar.h6.T0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, dp, dp2, paint);
                if (d6Var2 != null) {
                    b12 = d6Var2.k0();
                } else {
                    b12 = org.telegram.ui.ActionBar.h6.b1();
                }
                if (b12) {
                    float dp3 = AndroidUtilities.dp(18.0f);
                    float dp4 = AndroidUtilities.dp(18.0f);
                    if (d6Var2 != null) {
                        paint3 = d6Var2.F("paintChatActionBackgroundDarken");
                    }
                    if (paint3 == null) {
                        paint3 = org.telegram.ui.ActionBar.h6.T0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF, dp3, dp4, paint3);
                }
                super.dispatchDraw(canvas);
                return;
            case 7:
                super.dispatchDraw(canvas);
                Paint paint4 = (Paint) this.f5599b;
                paint4.setColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20730a7, ((org.telegram.ui.zb) this.f5600c).f44630f.f36334e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint4);
                return;
            case 8:
                float dp5 = AndroidUtilities.dp(20.0f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.f5599b;
                path.rewind();
                path.addRoundRect(rectF2, dp5, dp5, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF2, 255, 31);
                super.dispatchDraw(canvas);
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), AndroidUtilities.dp(6.0f) + getPaddingTop());
                i20 i20Var = (i20) this.f5600c;
                i20Var.b(canvas, rectF2, 1, 1.0f);
                rectF2.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                i20Var.b(canvas, rectF2, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                return;
            case 9:
                super.dispatchDraw(canvas);
                Paint paint5 = (Paint) this.f5599b;
                paint5.setColor(((cq) this.f5600c).getThemedColor(org.telegram.ui.ActionBar.h6.f20787d7));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint5);
                return;
            case 10:
                nz nzVar = (nz) this.f5600c;
                if (!nzVar.G.f24718u0 && nzVar.f29187w > 0.0f) {
                    if (((Paint) this.f5599b) == null) {
                        Paint paint6 = new Paint();
                        this.f5599b = paint6;
                        paint6.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f5599b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f5599b).setAlpha((int) (nzVar.f29187w * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f5599b);
                    canvas.restore();
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 11:
                org.telegram.ui.Components.q6 q6Var = (org.telegram.ui.Components.q6) this.f5599b;
                int dp6 = AndroidUtilities.dp(29.0f);
                int dp7 = AndroidUtilities.dp(18.83f);
                org.telegram.ui.Components.q6 q6Var2 = (org.telegram.ui.Components.q6) this.f5600c;
                q6Var.setBounds(getPaddingLeft(), r3 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r3);
                q6Var.draw(canvas);
                q6Var2.setBounds(getPaddingLeft(), r2 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r2);
                q6Var2.draw(canvas);
                return;
            case 13:
                Paint paint7 = (Paint) this.f5599b;
                ml0 ml0Var = (ml0) this.f5600c;
                int i12 = ml0Var.M0;
                if (i12 != 1 && i12 != 2 && i12 != 4) {
                    k10 = i0.a.d(0.7f, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.F8, ml0Var.f28775k0), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20857h5, ml0Var.f28775k0));
                } else {
                    k10 = i0.a.k(-1, 30);
                }
                paint7.setColor(k10);
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - AndroidUtilities.dpf2(6.0f)) / 2.0f;
                float g10 = ml0Var.g();
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
                ProfileActivity profileActivity = (ProfileActivity) this.f5600c;
                org.telegram.ui.ActionBar.h5[] h5VarArr2 = profileActivity.f34357r;
                if (profileActivity.W4 != null) {
                    canvas.save();
                    canvas.translate(h5VarArr2[0].getX(), h5VarArr2[0].getY());
                    h5VarArr = h5VarArr2;
                    r10 = 0;
                    f7 = 0.0f;
                    f11 = 24.0f;
                    f10 = 14.0f;
                    c10 = 2;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.W4.getMeasuredWidth(), profileActivity.W4.getMeasuredHeight(), (int) ((1.0f - profileActivity.S1) * 255.0f), 31);
                    profileActivity.W4.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    h5VarArr = h5VarArr2;
                    f7 = 0.0f;
                    f10 = 14.0f;
                    f11 = 24.0f;
                    c10 = 2;
                    r10 = 0;
                }
                if (profileActivity.p5 && profileActivity.Y5 != f7 && profileActivity.f34336n5 != 1.0f) {
                    float measuredHeight2 = (h5VarArr[1].getMeasuredHeight() / 2.0f) + h5VarArr[1].getY();
                    float dp8 = AndroidUtilities.dp(22.0f);
                    float x11 = ((h5VarArr[1].getX() + (AndroidUtilities.dp(28.0f) - profileActivity.f34343o5)) - dp8) - profileActivity.Z3();
                    profileActivity.f34363r5.setImageCoords(x11, measuredHeight2 - (dp8 / 2.0f), dp8, dp8);
                    profileActivity.f34363r5.setAlpha(profileActivity.Y5);
                    canvas.save();
                    float f14 = profileActivity.Y5;
                    canvas.scale(f14, f14, profileActivity.f34363r5.getCenterX(), profileActivity.f34363r5.getCenterY());
                    profileActivity.f34363r5.draw(canvas);
                    canvas.restore();
                    if (profileActivity.f34336n5 == f7) {
                        if (((org.telegram.ui.Components.id) this.f5599b) == null) {
                            org.telegram.ui.Components.id idVar = new org.telegram.ui.Components.id(this);
                            this.f5599b = idVar;
                            idVar.h = new mz0(this, r10);
                        }
                        float dp9 = (1.0f - profileActivity.f34336n5) * AndroidUtilities.dp(28.0f);
                        float textWidth = h5VarArr[c10].getTextWidth();
                        if (profileActivity.T != null) {
                            f12 = (AndroidUtilities.dp(f11) + textWidth + AndroidUtilities.dp(4.0f)) * profileActivity.T.getVisibilityFactor();
                        } else {
                            f12 = f7;
                        }
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        rectF4.set(x11 - AndroidUtilities.dp(4.0f), measuredHeight2 - AndroidUtilities.dp(f10), x11 + Math.max(textWidth, f12) + dp9 + AndroidUtilities.dp(4.0f), measuredHeight2 + AndroidUtilities.dp(f10));
                        org.telegram.ui.Components.id idVar2 = (org.telegram.ui.Components.id) this.f5599b;
                        idVar2.f27283i = r10;
                        idVar2.f27279c = r10;
                        idVar2.a(rectF4);
                        org.telegram.ui.Components.id idVar3 = (org.telegram.ui.Components.id) this.f5599b;
                        idVar3.f27288n = true;
                        int k11 = i0.a.k(-1, 50);
                        idVar3.f27282g.setColor((int) r10);
                        org.telegram.ui.Cells.z zVar2 = idVar3.f27280e;
                        if (zVar2 != null) {
                            org.telegram.ui.ActionBar.h6.C1(zVar2, k11, true);
                        }
                        org.telegram.ui.Components.id idVar4 = (org.telegram.ui.Components.id) this.f5599b;
                        idVar4.c(canvas, idVar4.f27282g);
                        org.telegram.ui.Cells.z zVar3 = idVar4.f27280e;
                        if (zVar3 != null) {
                            zVar3.draw(canvas);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Components.id idVar5 = (org.telegram.ui.Components.id) this.f5599b;
                    if (idVar5 != null && (zVar = idVar5.f27280e) != null) {
                        zVar.setState(StateSet.NOTHING);
                        zVar.jumpToCurrentState();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                Rect rect = (Rect) this.f5599b;
                c31 c31Var = (c31) this.f5600c;
                if (c31Var.R) {
                    c31Var.f36539f.setBounds(-rect.left, -rect.top, getWidth() + rect.right, getHeight() + rect.bottom);
                    c31Var.f36539f.draw(canvas);
                } else {
                    RectF rectF5 = AndroidUtilities.rectTmp;
                    rectF5.set(0.0f, 0.0f, AndroidUtilities.dp(14.0f) + getWidth(), getHeight());
                    canvas.drawRoundRect(rectF5, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), c31Var.f36535a);
                }
                super.dispatchDraw(canvas);
                return;
            case 24:
                ImageReceiver imageReceiver = (ImageReceiver) this.f5599b;
                imageReceiver.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                imageReceiver.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 27:
                super.dispatchDraw(canvas);
                org.telegram.ui.Wallet.c5 c5Var = (org.telegram.ui.Wallet.c5) this.f5600c;
                if (c5Var.G) {
                    int save = canvas.save();
                    canvas.concat(c5Var.J);
                    canvas.translate(-c5Var.f34757q0.getLeft(), -c5Var.f34757q0.getTop());
                    super.drawChild(canvas, c5Var.f34757q0, getDrawingTime());
                    canvas.restoreToCount(save);
                    return;
                }
                return;
            case 29:
                ((rg.a1) this.f5599b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF6 = AndroidUtilities.rectTmp;
                rectF6.set(0.0f, AndroidUtilities.dp(2.0f), getMeasuredWidth(), AndroidUtilities.dp(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                rg.a1 a1Var = (rg.a1) this.f5599b;
                a1Var.f47269f.setAlpha(((rg.y0) this.f5600c).K);
                canvas.drawRoundRect(rectF6, AndroidUtilities.dp(24.0f) - 1, AndroidUtilities.dp(24.0f) - 1, a1Var.f47269f);
                canvas.restore();
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        float f7;
        int dp;
        switch (this.f5598a) {
            case 3:
                super.dispatchTouchEvent(motionEvent);
                return true;
            case 4:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.f5600c;
                org.telegram.ui.Cells.aa n10 = h4Var.P0.n(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.f5599b;
                obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (h4Var.P0.x() && h4Var.P0.n(getContext()).onTouchEvent(obtain)) {
                    return true;
                }
                if (n10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() == 0 && h4Var.P0.x() && (motionEvent.getY() < linearLayout.getTop() || motionEvent.getY() > linearLayout.getBottom())) {
                    if (!h4Var.P0.n(getContext()).onTouchEvent(obtain)) {
                        return true;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            case 14:
                int action = motionEvent.getAction();
                org.telegram.ui.Components.voip.k1 k1Var = (org.telegram.ui.Components.voip.k1) this.f5600c;
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
                if (!k1Var.F.isInProgress() && ((GestureDetector) k1Var.G.f15693b).onTouchEvent(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (action == 1 || action == 3) {
                    k1Var.H = false;
                    k1Var.I = false;
                    o1.k kVar = k1Var.S;
                    if (!kVar.f16981f) {
                        float f10 = k1Var.Q;
                        kVar.f16978b = f10;
                        kVar.f16979c = true;
                        o1.l lVar = kVar.f16988u;
                        int i10 = k1Var.M;
                        float f11 = (i10 / 2.0f) + f10;
                        int i11 = AndroidUtilities.displaySize.x;
                        if (f11 >= i11 / 2.0f) {
                            dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        lVar.f16995i = dp;
                        k1Var.S.h();
                    }
                    o1.k kVar2 = k1Var.T;
                    if (!kVar2.f16981f) {
                        kVar2.f16978b = k1Var.R;
                        kVar2.f16979c = true;
                        kVar2.f16988u.f16995i = w7.o.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - k1Var.N) - AndroidUtilities.dp(16.0f));
                        k1Var.T.h();
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
        Rect rect;
        boolean z11;
        float f10;
        switch (this.f5598a) {
            case 0:
                Path path = (Path) this.f5599b;
                n6 n6Var = (n6) this.f5600c;
                if (n6Var.h != null && (((z10 = n6Var.f5640f) && view == n6Var.d) || (!z10 && view == n6Var.f5638c))) {
                    if (z10) {
                        f7 = n6Var.f5639e;
                    } else {
                        f7 = 1.0f - n6Var.f5639e;
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
                if (view instanceof ie0) {
                    return false;
                }
                return super.drawChild(canvas, view, j3);
            case 21:
                if (view != ((SecretMediaViewer) this.f5599b).f34490w && super.drawChild(canvas, view, j3)) {
                    return true;
                }
                return false;
            case 22:
                Path path2 = (Path) this.f5599b;
                j51 j51Var = (j51) this.f5600c;
                RectF rectF = j51Var.R;
                if (view != j51Var.N && view != j51Var.f38855x) {
                    if (view == j51Var.P) {
                        canvas.save();
                        path2.rewind();
                        path2.addCircle(rectF.centerX() + j51Var.N.getX(), rectF.centerY() + j51Var.N.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                        canvas.clipPath(path2);
                        canvas.clipRect(0.0f, AndroidUtilities.lerp(j51Var.T, 0.0f, j51Var.f38853s), getWidth(), AndroidUtilities.lerp(j51Var.U, getHeight(), j51Var.f38853s));
                        canvas.translate(-j51Var.P.getX(), -j51Var.P.getY());
                        canvas.translate(j51Var.N.getX() + rectF.left, j51Var.N.getY() + rectF.top);
                        canvas.scale(rectF.width() / j51Var.P.getMeasuredWidth(), rectF.height() / j51Var.P.getMeasuredHeight(), j51Var.P.getX(), j51Var.P.getY());
                        boolean drawChild2 = super.drawChild(canvas, view, j3);
                        canvas.restore();
                        return drawChild2;
                    }
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(j51Var.T, 0.0f, j51Var.f38853s), getWidth(), AndroidUtilities.lerp(j51Var.U, getHeight(), j51Var.f38853s));
                boolean drawChild3 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild3;
            case 23:
                if (view == ((j71) this.f5600c).f38894h0 && zg.d0.f54589b && zg.d0.f54592f) {
                    for (int i10 = 0; i10 < ((j71) this.f5600c).f38894h0.getChildCount(); i10++) {
                        View childAt = ((j71) this.f5600c).f38894h0.getChildAt(i10);
                        if (childAt instanceof s61) {
                            s61 s61Var = (s61) childAt;
                            if (s61Var.getAnimatedScale() == 1.0f) {
                                ((Rect) this.f5599b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                canvas.save();
                                canvas.clipRect((Rect) this.f5599b);
                                super.drawChild(canvas, view, j3);
                                canvas.restore();
                            } else if (s61Var.getAnimatedScale() > 0.0f) {
                                ((Rect) this.f5599b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                ((Rect) this.f5599b).set((int) (rect.centerX() - (s61Var.getAnimatedScale() * (((Rect) this.f5599b).width() / 2.0f))), (int) (((Rect) this.f5599b).centerY() - (s61Var.getAnimatedScale() * (((Rect) this.f5599b).height() / 2.0f))), (int) ((s61Var.getAnimatedScale() * (((Rect) this.f5599b).width() / 2.0f)) + ((Rect) this.f5599b).centerX()), (int) ((s61Var.getAnimatedScale() * (((Rect) this.f5599b).height() / 2.0f)) + ((Rect) this.f5599b).centerY()));
                                canvas.save();
                                canvas.clipRect((Rect) this.f5599b);
                                canvas.scale(s61Var.getAnimatedScale(), s61Var.getAnimatedScale(), ((Rect) this.f5599b).centerX(), ((Rect) this.f5599b).centerY());
                                super.drawChild(canvas, view, j3);
                                canvas.restore();
                            }
                        } else if ((childAt instanceof TextView) || (childAt instanceof n61) || (childAt instanceof m61) || (childAt instanceof o61)) {
                            ((Rect) this.f5599b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.f5599b);
                            super.drawChild(canvas, view, j3);
                            canvas.restore();
                        }
                    }
                    return false;
                }
                return super.drawChild(canvas, view, j3);
            case 27:
                org.telegram.ui.Wallet.c5 c5Var = (org.telegram.ui.Wallet.c5) this.f5600c;
                if (view == c5Var.f34757q0 && c5Var.F) {
                    int save = canvas.save();
                    canvas.concat(c5Var.J);
                    boolean drawChild4 = super.drawChild(canvas, view, j3);
                    canvas.restoreToCount(save);
                    return drawChild4;
                }
                return super.drawChild(canvas, view, j3);
            case 28:
                Path path3 = (Path) this.f5599b;
                qg.l0 l0Var = (qg.l0) this.f5600c;
                if (l0Var.h != null && (((z11 = l0Var.f46428f) && view == l0Var.d) || (!z11 && view == l0Var.f46426c))) {
                    if (z11) {
                        f10 = l0Var.f46427e;
                    } else {
                        f10 = 1.0f - l0Var.f46427e;
                    }
                    canvas.save();
                    path3.rewind();
                    path3.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f10 * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                    canvas.clipPath(path3);
                    boolean drawChild5 = super.drawChild(canvas, view, j3);
                    canvas.restore();
                    return drawChild5;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f5598a) {
            case 2:
                super.invalidate();
                ((mg.i) this.f5600c).invalidate();
                return;
            case 26:
                super.invalidate();
                org.telegram.ui.ActionBar.p0 p0Var = ((wd1) this.f5600c).f43378t0;
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
        switch (this.f5598a) {
            case 16:
                super.onAttachedToWindow();
                qt qtVar = (qt) this.f5600c;
                qtVar.A.onAttachedToWindow();
                qtVar.B.onAttachedToWindow();
                return;
            case 19:
                super.onAttachedToWindow();
                ((ProfileActivity) this.f5600c).f34363r5.onAttachedToWindow();
                return;
            case 21:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.f5599b).h.onAttachedToWindow();
                return;
            case 24:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f5599b).onAttachedToWindow();
                return;
            case 27:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((org.telegram.ui.Wallet.n4) this.f5599b);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.f5598a) {
            case 14:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                org.telegram.ui.Components.voip.k1 k1Var = (org.telegram.ui.Components.voip.k1) this.f5600c;
                AndroidUtilities.setPreferredMaxRefreshRate(k1Var.f32059b, k1Var.d, k1Var.f32060c);
                k1Var.i(false);
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f5598a) {
            case 16:
                super.onDetachedFromWindow();
                qt qtVar = (qt) this.f5600c;
                qtVar.A.onDetachedFromWindow();
                qtVar.B.onDetachedFromWindow();
                return;
            case 19:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.f5600c).f34363r5.onDetachedFromWindow();
                return;
            case 21:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.f5599b).h.onDetachedFromWindow();
                return;
            case 24:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f5599b).onDetachedFromWindow();
                return;
            case 27:
                getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Wallet.n4) this.f5599b);
                super.onDetachedFromWindow();
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
        org.telegram.ui.Components.id idVar;
        switch (this.f5598a) {
            case 19:
                if ((((ProfileActivity) this.f5600c).f34336n5 == 0.0f && (idVar = (org.telegram.ui.Components.id) this.f5599b) != null && idVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f5598a) {
            case 17:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = (i13 - i11) / 4;
                int i15 = i14 * 3;
                int A = ai.A(275.0f, i15, 2);
                c80 c80Var = (c80) this.f5600c;
                FrameLayout frameLayout = c80Var.f36633r;
                int i16 = 0;
                frameLayout.layout(0, A, frameLayout.getMeasuredWidth(), c80Var.f36633r.getMeasuredHeight() + A);
                int dp = AndroidUtilities.dp(139.0f) + AndroidUtilities.dp(150.0f) + A;
                int measuredWidth = (getMeasuredWidth() - c80Var.f36630e.getMeasuredWidth()) / 2;
                org.telegram.ui.Components.ua uaVar = c80Var.f36630e;
                uaVar.layout(measuredWidth, dp, uaVar.getMeasuredWidth() + measuredWidth, c80Var.f36630e.getMeasuredHeight() + dp);
                z4.g gVar = c80Var.d;
                gVar.layout(0, 0, gVar.getMeasuredWidth(), c80Var.d.getMeasuredHeight());
                int measuredHeight = ((i14 - c80Var.f36632n.getMeasuredHeight()) / 2) + i15;
                int measuredWidth2 = (getMeasuredWidth() - c80Var.f36632n.getMeasuredWidth()) / 2;
                bi.o oVar = c80Var.f36632n;
                oVar.layout(measuredWidth2, measuredHeight, oVar.getMeasuredWidth() + measuredWidth2, c80Var.f36632n.getMeasuredHeight() + measuredHeight);
                int dp2 = measuredHeight - AndroidUtilities.dp(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - c80Var.f36631f.getMeasuredWidth()) / 2;
                TextView textView = c80Var.f36631f;
                textView.layout(measuredWidth3, dp2 - textView.getMeasuredHeight(), c80Var.f36631f.getMeasuredWidth() + measuredWidth3, dp2);
                FrameLayout frameLayout2 = (FrameLayout) this.f5599b;
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
                int dp4 = AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(150.0f) + ai.A(275.0f, ((i13 - i11) / 4) * 3, 2);
                int dp5 = AndroidUtilities.dp(18.0f);
                TextView textView2 = (TextView) this.f5599b;
                textView2.layout(dp5, dp4, textView2.getMeasuredWidth() + dp5, textView2.getMeasuredHeight() + dp4);
                int dp6 = AndroidUtilities.dp(18.0f) + dp4 + ((int) textView2.getTextSize());
                int dp7 = AndroidUtilities.dp(16.0f);
                TextView textView3 = (TextView) this.f5600c;
                textView3.layout(dp7, dp6, textView3.getMeasuredWidth() + dp7, textView3.getMeasuredHeight() + dp6);
                return;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.f5600c).V4();
                return;
            case 20:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 21:
                super.onLayout(z10, i10, i11, i12, i13);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f5600c;
                if (secretMediaViewer.f34469n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f34469n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight;
                    c51 c51Var = secretMediaViewer.f34469n;
                    c51Var.layout(c51Var.getLeft(), currentActionBarHeight, secretMediaViewer.f34469n.getRight(), secretMediaViewer.f34469n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.f34478r != null && secretMediaViewer.f34469n != null) {
                    int measuredHeight2 = (secretMediaViewer.f34469n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f34469n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight)) - AndroidUtilities.dp(10.0f);
                    d4 d4Var = secretMediaViewer.f34478r;
                    d4Var.layout(d4Var.getLeft(), measuredHeight2, secretMediaViewer.f34478r.getRight(), secretMediaViewer.f34478r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.f34441a0 != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                    bu0 bu0Var = secretMediaViewer.f34441a0;
                    bu0Var.layout(bu0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.f34441a0.getRight(), secretMediaViewer.f34441a0.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f34454f;
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
        s4.d0 sVar;
        int measuredHeight;
        switch (this.f5598a) {
            case 1:
                ViewGroup viewGroup = (ViewGroup) this.f5599b;
                gg.e eVar = (gg.e) this.f5600c;
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
                if (!eVar.E && !eVar.f10577w) {
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
                super.onMeasure(i10, ai.C(8.0f, ((LinearLayout) this.f5599b).getMeasuredHeight(), 1073741824));
                return;
            case 9:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                return;
            case 11:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
                setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                return;
            case 20:
                c31 c31Var = (c31) this.f5600c;
                View view = c31Var.H;
                View view2 = c31Var.I;
                LinearLayout linearLayout = c31Var.v;
                TextView textView = c31Var.f36542s;
                sm0 sm0Var = c31Var.f36545y;
                boolean z10 = c31Var.S.P;
                int dp3 = AndroidUtilities.dp(12.0f);
                if (z10) {
                    sm0Var.setLayoutParams(w7.x5.a(104.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 8388611));
                    sm0Var.setPadding(dp3, 0, dp3, 0);
                    if (linearLayout != null) {
                        textView.setLayoutParams(w7.x5.a(48.0f, 16.0f, 162.0f, 16.0f, 72.0f, -1, 8388611));
                        linearLayout.setLayoutParams(w7.x5.a(48.0f, 16.0f, 162.0f, 16.0f, 16.0f, -1, 8388691));
                    } else {
                        textView.setLayoutParams(w7.x5.a(48.0f, 16.0f, 162.0f, 16.0f, 16.0f, -1, 8388611));
                    }
                } else {
                    sm0Var.setPadding(dp3, dp3 / 2, dp3, dp3);
                    if (linearLayout != null) {
                        sm0Var.setLayoutParams(w7.x5.a(-1.0f, 0.0f, 44.0f, 0.0f, 136.0f, -1, 8388611));
                        textView.setLayoutParams(w7.x5.a(48.0f, 16.0f, 0.0f, 16.0f, 72.0f, -1, 80));
                        linearLayout.setLayoutParams(w7.x5.a(48.0f, 16.0f, 0.0f, 16.0f, 16.0f, -1, 80));
                    } else {
                        sm0Var.setLayoutParams(w7.x5.a(-1.0f, 0.0f, 44.0f, 0.0f, 80.0f, -1, 8388611));
                        textView.setLayoutParams(w7.x5.a(48.0f, 16.0f, 0.0f, 16.0f, 16.0f, -1, 80));
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
                    view2.setLayoutParams(w7.x5.a(AndroidUtilities.dp(2.0f), 0.0f, 0.0f, 0.0f, i12, -1, 80));
                    view.setVisibility(0);
                    view.setLayoutParams(w7.x5.a(AndroidUtilities.dp(2.0f), 0.0f, 44.0f, 0.0f, 0.0f, -1, 48));
                }
                if (c31Var.R != z10) {
                    d31 d31Var = c31Var.d;
                    if (z10) {
                        d31Var.getParentActivity();
                        sVar = new s4.d0(0, false);
                    } else {
                        d31Var.getParentActivity();
                        sVar = new s4.s(3, false);
                    }
                    c31Var.G = sVar;
                    sm0Var.setLayoutManager(sVar);
                    sm0Var.requestLayout();
                    int i14 = c31Var.L;
                    if (i14 != -1) {
                        c31Var.b(i14);
                    }
                    c31Var.R = z10;
                }
                super.onMeasure(i10, i11);
                return;
            case 21:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f5600c;
                bu0 bu0Var = secretMediaViewer.f34441a0;
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
                View view3 = secretMediaViewer.f34454f;
                if (view3 != null) {
                    view3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.navigationBarHeight, 1073741824));
                    return;
                }
                return;
            case 29:
                super.onMeasure(i10, ai.C(2.0f, ((rg.y0) this.f5600c).f47617s, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f5598a) {
            case 3:
                super.onSizeChanged(i10, i11, i12, i13);
                yf.y yVar = (yf.y) this.f5600c;
                yVar.setBounds(0, 0, i10, i11);
                yVar.c(0, AndroidUtilities.dp(24.0f) + getPaddingBottom());
                return;
            case 14:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.f5599b;
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
        switch (this.f5598a) {
            case 12:
                ((Paint) this.f5599b).setColor(i10);
                return;
            default:
                super.setBackgroundColor(i10);
                return;
        }
    }

    @Override
    public void setTranslationX(float f7) {
        switch (this.f5598a) {
            case 2:
                super.setTranslationX(f7);
                ((mg.i) this.f5600c).invalidate();
                return;
            default:
                super.setTranslationX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f5598a) {
            case 2:
                super.setTranslationY(f7);
                ((mg.i) this.f5600c).invalidate();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f5598a) {
            case 11:
                if (((org.telegram.ui.Components.q6) this.f5599b) != drawable && ((org.telegram.ui.Components.q6) this.f5600c) != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 20:
                if (drawable != ((c31) this.f5600c).f36539f && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public m6(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f5598a = i10;
        this.f5600c = obj;
        this.f5599b = obj2;
    }

    public m6(Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f5598a = i10;
        switch (i10) {
            case 11:
                super(context);
                org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(true, true, true);
                this.f5599b = q6Var;
                is isVar = is.h;
                q6Var.n(0.3f, 430L, isVar);
                q6Var.x(AndroidUtilities.bold());
                q6Var.u(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.A8, d6Var));
                q6Var.w(AndroidUtilities.dp(18.0f));
                q6Var.q(!LocaleController.isRTL);
                q6Var.setCallback(this);
                q6Var.M = AndroidUtilities.displaySize.x;
                org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(true, true, true);
                this.f5600c = q6Var2;
                q6Var2.n(0.3f, 430L, isVar);
                q6Var2.u(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.B8, d6Var));
                q6Var2.w(AndroidUtilities.dp(14.0f));
                q6Var2.q(true ^ LocaleController.isRTL);
                q6Var2.setCallback(this);
                q6Var2.M = AndroidUtilities.displaySize.x;
                return;
            default:
                this.f5600c = new yf.y(8);
                this.f5599b = d6Var;
                return;
        }
    }

    public m6(org.telegram.ui.Cells.z0 z0Var, Context context) {
        super(context);
        this.f5598a = 6;
        this.f5600c = z0Var;
        this.f5599b = new RectF();
    }

    public m6(j51 j51Var, Context context) {
        super(context);
        this.f5598a = 22;
        this.f5600c = j51Var;
        this.f5599b = new Path();
    }

    public m6(org.telegram.ui.zb zbVar, Context context) {
        super(context);
        this.f5598a = 7;
        this.f5600c = zbVar;
        this.f5599b = new Paint(1);
    }

    public m6(org.telegram.ui.n5 n5Var, Activity activity) {
        super(activity);
        this.f5598a = 5;
        this.f5600c = n5Var;
        this.f5599b = new Paint(1);
    }

    public m6(org.telegram.ui.Components.voip.k1 k1Var, Context context) {
        super(context);
        this.f5598a = 14;
        this.f5600c = k1Var;
        this.f5599b = new Path();
    }

    public m6(ue0 ue0Var, Context context) {
        super(context);
        this.f5598a = 12;
        this.f5600c = ue0Var;
        this.f5599b = new Paint();
    }

    public m6(org.telegram.ui.Wallet.c5 c5Var, Context context) {
        super(context);
        this.f5598a = 27;
        this.f5600c = c5Var;
        this.f5599b = new org.telegram.ui.Wallet.n4(this, 0);
    }

    public m6(Context context, TextView textView, TextView textView2) {
        super(context);
        this.f5598a = 18;
        this.f5599b = textView;
        this.f5600c = textView2;
    }

    public m6(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f5598a = 21;
        this.f5600c = secretMediaViewer;
        this.f5599b = secretMediaViewer;
        setWillNotDraw(false);
    }

    public m6(j71 j71Var, Context context) {
        super(context);
        this.f5598a = 23;
        this.f5600c = j71Var;
        this.f5599b = new Rect();
    }

    public m6(c31 c31Var, Activity activity, d31 d31Var) {
        super(activity);
        this.f5598a = 20;
        this.f5600c = c31Var;
        Rect rect = new Rect();
        this.f5599b = rect;
        c31Var.f36535a.setColor(d31Var.getThemedColor(org.telegram.ui.ActionBar.h6.f20786d6));
        Drawable drawable = c31Var.f36539f;
        drawable.setCallback(this);
        drawable.getPadding(rect);
    }

    public m6(cq cqVar, Context context) {
        super(context);
        this.f5598a = 9;
        this.f5600c = cqVar;
        this.f5599b = new Paint();
    }

    public m6(qt qtVar, Activity activity) {
        super(activity);
        this.f5598a = 16;
        this.f5600c = qtVar;
        this.f5599b = qtVar;
        setWillNotDraw(false);
    }

    public m6(wd1 wd1Var, Context context, int i10) {
        super(context);
        this.f5598a = i10;
        switch (i10) {
            case 26:
                this.f5600c = wd1Var;
                super(context);
                this.f5599b = new int[2];
                return;
            default:
                this.f5600c = wd1Var;
                this.f5599b = new Paint();
                return;
        }
    }

    public m6(qg.l0 l0Var, Context context) {
        super(context);
        this.f5598a = 28;
        this.f5600c = l0Var;
        this.f5599b = new Path();
    }

    public m6(ml0 ml0Var, Context context) {
        super(context);
        this.f5598a = 13;
        this.f5600c = ml0Var;
        this.f5599b = new Paint(1);
    }

    public m6(Context context, int i10) {
        super(context);
        this.f5598a = i10;
        switch (i10) {
            case 24:
                super(context);
                return;
            default:
                this.f5599b = new Path();
                this.f5600c = new i20();
                return;
        }
    }

    public m6(n6 n6Var, Context context) {
        super(context);
        this.f5598a = 0;
        this.f5600c = n6Var;
        this.f5599b = new Path();
    }
}
