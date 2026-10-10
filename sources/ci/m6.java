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
import org.telegram.messenger.bi;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.ie0;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.ue0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.cu0;
import org.telegram.ui.d31;
import org.telegram.ui.d51;
import org.telegram.ui.d80;
import org.telegram.ui.e31;
import org.telegram.ui.j20;
import org.telegram.ui.k51;
import org.telegram.ui.k71;
import org.telegram.ui.n61;
import org.telegram.ui.nz0;
import org.telegram.ui.o61;
import org.telegram.ui.p61;
import org.telegram.ui.rt;
import org.telegram.ui.t61;
import org.telegram.ui.xd1;
public final class m6 extends FrameLayout {
    public final int f5599a;
    public Object f5600b;
    public Object f5601c;

    public m6(Object obj, Context context, int i10) {
        super(context);
        this.f5599a = i10;
        this.f5601c = obj;
    }

    public void a(String str, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.q6 q6Var = (org.telegram.ui.Components.q6) this.f5601c;
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        q6Var.t(str, z11, true);
    }

    public void b(String str, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.q6 q6Var = (org.telegram.ui.Components.q6) this.f5600b;
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        q6Var.t(str, z11, true);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.e6 e6Var;
        Paint paint;
        boolean b12;
        int k10;
        org.telegram.ui.ActionBar.j5[] j5VarArr;
        float f7;
        float f10;
        float f11;
        char c10;
        ?? r10;
        org.telegram.ui.Cells.z zVar;
        float f12;
        switch (this.f5599a) {
            case 3:
                yf.y yVar = (yf.y) this.f5601c;
                yVar.b(org.telegram.ui.ActionBar.i6.m1(0.65f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20801d6, (org.telegram.ui.ActionBar.e6) this.f5600b)));
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
                Paint paint2 = (Paint) this.f5600b;
                int i10 = org.telegram.ui.ActionBar.i6.f20745a7;
                e6Var = ((org.telegram.ui.ActionBar.n2) ((org.telegram.ui.o5) this.f5601c).d).resourceProvider;
                paint2.setColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint2);
                return;
            case 6:
                RectF rectF = (RectF) this.f5600b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Cells.z0 z0Var = (org.telegram.ui.Cells.z0) this.f5601c;
                int measuredWidth = z0Var.getMeasuredWidth();
                int i11 = z0Var.d;
                float x10 = z0Var.getX();
                float f13 = z0Var.f23798c;
                org.telegram.ui.ActionBar.e6 e6Var2 = z0Var.f23797b;
                if (e6Var2 != null) {
                    e6Var2.m(x10, f13, measuredWidth, i11);
                } else {
                    org.telegram.ui.ActionBar.i6.q(x10, f13, measuredWidth, i11);
                }
                float dp = AndroidUtilities.dp(18.0f);
                float dp2 = AndroidUtilities.dp(18.0f);
                Paint paint3 = null;
                if (e6Var2 != null) {
                    paint = e6Var2.F("paintChatActionBackground");
                } else {
                    paint = null;
                }
                if (paint == null) {
                    paint = org.telegram.ui.ActionBar.i6.T0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, dp, dp2, paint);
                if (e6Var2 != null) {
                    b12 = e6Var2.k0();
                } else {
                    b12 = org.telegram.ui.ActionBar.i6.b1();
                }
                if (b12) {
                    float dp3 = AndroidUtilities.dp(18.0f);
                    float dp4 = AndroidUtilities.dp(18.0f);
                    if (e6Var2 != null) {
                        paint3 = e6Var2.F("paintChatActionBackgroundDarken");
                    }
                    if (paint3 == null) {
                        paint3 = org.telegram.ui.ActionBar.i6.T0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF, dp3, dp4, paint3);
                }
                super.dispatchDraw(canvas);
                return;
            case 7:
                super.dispatchDraw(canvas);
                Paint paint4 = (Paint) this.f5600b;
                paint4.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20745a7, ((org.telegram.ui.ac) this.f5601c).f35946f.f36661e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint4);
                return;
            case 8:
                float dp5 = AndroidUtilities.dp(20.0f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.f5600b;
                path.rewind();
                path.addRoundRect(rectF2, dp5, dp5, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF2, 255, 31);
                super.dispatchDraw(canvas);
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), AndroidUtilities.dp(6.0f) + getPaddingTop());
                j20 j20Var = (j20) this.f5601c;
                j20Var.b(canvas, rectF2, 1, 1.0f);
                rectF2.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                j20Var.b(canvas, rectF2, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                return;
            case 9:
                super.dispatchDraw(canvas);
                Paint paint5 = (Paint) this.f5600b;
                paint5.setColor(((cq) this.f5601c).getThemedColor(org.telegram.ui.ActionBar.i6.f20802d7));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint5);
                return;
            case 10:
                nz nzVar = (nz) this.f5601c;
                if (!nzVar.G.f24745u0 && nzVar.f29277w > 0.0f) {
                    if (((Paint) this.f5600b) == null) {
                        Paint paint6 = new Paint();
                        this.f5600b = paint6;
                        paint6.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f5600b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f5600b).setAlpha((int) (nzVar.f29277w * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f5600b);
                    canvas.restore();
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 11:
                org.telegram.ui.Components.q6 q6Var = (org.telegram.ui.Components.q6) this.f5600b;
                int dp6 = AndroidUtilities.dp(29.0f);
                int dp7 = AndroidUtilities.dp(18.83f);
                org.telegram.ui.Components.q6 q6Var2 = (org.telegram.ui.Components.q6) this.f5601c;
                q6Var.setBounds(getPaddingLeft(), r3 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r3);
                q6Var.draw(canvas);
                q6Var2.setBounds(getPaddingLeft(), r2 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r2);
                q6Var2.draw(canvas);
                return;
            case 13:
                Paint paint7 = (Paint) this.f5600b;
                ll0 ll0Var = (ll0) this.f5601c;
                int i12 = ll0Var.M0;
                if (i12 != 1 && i12 != 2 && i12 != 4) {
                    k10 = i0.a.d(0.7f, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.F8, ll0Var.f28404k0), org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20872h5, ll0Var.f28404k0));
                } else {
                    k10 = i0.a.k(-1, 30);
                }
                paint7.setColor(k10);
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - AndroidUtilities.dpf2(6.0f)) / 2.0f;
                float g10 = ll0Var.g();
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
                ProfileActivity profileActivity = (ProfileActivity) this.f5601c;
                org.telegram.ui.ActionBar.j5[] j5VarArr2 = profileActivity.f34367r;
                if (profileActivity.W4 != null) {
                    canvas.save();
                    canvas.translate(j5VarArr2[0].getX(), j5VarArr2[0].getY());
                    j5VarArr = j5VarArr2;
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
                    j5VarArr = j5VarArr2;
                    f7 = 0.0f;
                    f10 = 14.0f;
                    f11 = 24.0f;
                    c10 = 2;
                    r10 = 0;
                }
                if (profileActivity.p5 && profileActivity.Y5 != f7 && profileActivity.f34346n5 != 1.0f) {
                    float measuredHeight2 = (j5VarArr[1].getMeasuredHeight() / 2.0f) + j5VarArr[1].getY();
                    float dp8 = AndroidUtilities.dp(22.0f);
                    float x11 = ((j5VarArr[1].getX() + (AndroidUtilities.dp(28.0f) - profileActivity.f34353o5)) - dp8) - profileActivity.Z3();
                    profileActivity.f34373r5.setImageCoords(x11, measuredHeight2 - (dp8 / 2.0f), dp8, dp8);
                    profileActivity.f34373r5.setAlpha(profileActivity.Y5);
                    canvas.save();
                    float f14 = profileActivity.Y5;
                    canvas.scale(f14, f14, profileActivity.f34373r5.getCenterX(), profileActivity.f34373r5.getCenterY());
                    profileActivity.f34373r5.draw(canvas);
                    canvas.restore();
                    if (profileActivity.f34346n5 == f7) {
                        if (((org.telegram.ui.Components.id) this.f5600b) == null) {
                            org.telegram.ui.Components.id idVar = new org.telegram.ui.Components.id(this);
                            this.f5600b = idVar;
                            idVar.h = new nz0(this, r10);
                        }
                        float dp9 = (1.0f - profileActivity.f34346n5) * AndroidUtilities.dp(28.0f);
                        float textWidth = j5VarArr[c10].getTextWidth();
                        if (profileActivity.T != null) {
                            f12 = (AndroidUtilities.dp(f11) + textWidth + AndroidUtilities.dp(4.0f)) * profileActivity.T.getVisibilityFactor();
                        } else {
                            f12 = f7;
                        }
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        rectF4.set(x11 - AndroidUtilities.dp(4.0f), measuredHeight2 - AndroidUtilities.dp(f10), x11 + Math.max(textWidth, f12) + dp9 + AndroidUtilities.dp(4.0f), measuredHeight2 + AndroidUtilities.dp(f10));
                        org.telegram.ui.Components.id idVar2 = (org.telegram.ui.Components.id) this.f5600b;
                        idVar2.f27352i = r10;
                        idVar2.f27348c = r10;
                        idVar2.a(rectF4);
                        org.telegram.ui.Components.id idVar3 = (org.telegram.ui.Components.id) this.f5600b;
                        idVar3.f27357n = true;
                        int k11 = i0.a.k(-1, 50);
                        idVar3.f27351g.setColor((int) r10);
                        org.telegram.ui.Cells.z zVar2 = idVar3.f27349e;
                        if (zVar2 != null) {
                            org.telegram.ui.ActionBar.i6.C1(zVar2, k11, true);
                        }
                        org.telegram.ui.Components.id idVar4 = (org.telegram.ui.Components.id) this.f5600b;
                        idVar4.c(canvas, idVar4.f27351g);
                        org.telegram.ui.Cells.z zVar3 = idVar4.f27349e;
                        if (zVar3 != null) {
                            zVar3.draw(canvas);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Components.id idVar5 = (org.telegram.ui.Components.id) this.f5600b;
                    if (idVar5 != null && (zVar = idVar5.f27349e) != null) {
                        zVar.setState(StateSet.NOTHING);
                        zVar.jumpToCurrentState();
                        return;
                    }
                    return;
                }
                return;
            case 20:
                Rect rect = (Rect) this.f5600b;
                d31 d31Var = (d31) this.f5601c;
                if (d31Var.R) {
                    d31Var.f36870f.setBounds(-rect.left, -rect.top, getWidth() + rect.right, getHeight() + rect.bottom);
                    d31Var.f36870f.draw(canvas);
                } else {
                    RectF rectF5 = AndroidUtilities.rectTmp;
                    rectF5.set(0.0f, 0.0f, AndroidUtilities.dp(14.0f) + getWidth(), getHeight());
                    canvas.drawRoundRect(rectF5, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), d31Var.f36866a);
                }
                super.dispatchDraw(canvas);
                return;
            case 24:
                ImageReceiver imageReceiver = (ImageReceiver) this.f5600b;
                imageReceiver.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                imageReceiver.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 27:
                super.dispatchDraw(canvas);
                org.telegram.ui.Wallet.b5 b5Var = (org.telegram.ui.Wallet.b5) this.f5601c;
                if (b5Var.G) {
                    int save = canvas.save();
                    canvas.concat(b5Var.J);
                    canvas.translate(-b5Var.f34726q0.getLeft(), -b5Var.f34726q0.getTop());
                    super.drawChild(canvas, b5Var.f34726q0, getDrawingTime());
                    canvas.restoreToCount(save);
                    return;
                }
                return;
            case 29:
                ((rg.a1) this.f5600b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF6 = AndroidUtilities.rectTmp;
                rectF6.set(0.0f, AndroidUtilities.dp(2.0f), getMeasuredWidth(), AndroidUtilities.dp(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                rg.a1 a1Var = (rg.a1) this.f5600b;
                a1Var.f47223f.setAlpha(((rg.y0) this.f5601c).K);
                canvas.drawRoundRect(rectF6, AndroidUtilities.dp(24.0f) - 1, AndroidUtilities.dp(24.0f) - 1, a1Var.f47223f);
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
        switch (this.f5599a) {
            case 3:
                super.dispatchTouchEvent(motionEvent);
                return true;
            case 4:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f5601c;
                org.telegram.ui.Cells.aa n10 = i4Var.P0.n(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.f5600b;
                obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (i4Var.P0.x() && i4Var.P0.n(getContext()).onTouchEvent(obtain)) {
                    return true;
                }
                if (n10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() == 0 && i4Var.P0.x() && (motionEvent.getY() < linearLayout.getTop() || motionEvent.getY() > linearLayout.getBottom())) {
                    if (!i4Var.P0.n(getContext()).onTouchEvent(obtain)) {
                        return true;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            case 14:
                int action = motionEvent.getAction();
                org.telegram.ui.Components.voip.j1 j1Var = (org.telegram.ui.Components.voip.j1) this.f5601c;
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
                if (!j1Var.F.isInProgress() && ((GestureDetector) j1Var.G.f15672b).onTouchEvent(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (action == 1 || action == 3) {
                    j1Var.H = false;
                    j1Var.I = false;
                    o1.k kVar = j1Var.S;
                    if (!kVar.f16935f) {
                        float f10 = j1Var.Q;
                        kVar.f16932b = f10;
                        kVar.f16933c = true;
                        o1.l lVar = kVar.f16942u;
                        int i10 = j1Var.M;
                        float f11 = (i10 / 2.0f) + f10;
                        int i11 = AndroidUtilities.displaySize.x;
                        if (f11 >= i11 / 2.0f) {
                            dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        lVar.f16949i = dp;
                        j1Var.S.h();
                    }
                    o1.k kVar2 = j1Var.T;
                    if (!kVar2.f16935f) {
                        kVar2.f16932b = j1Var.R;
                        kVar2.f16933c = true;
                        kVar2.f16942u.f16949i = w7.o.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - j1Var.N) - AndroidUtilities.dp(16.0f));
                        j1Var.T.h();
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
        switch (this.f5599a) {
            case 0:
                Path path = (Path) this.f5600b;
                n6 n6Var = (n6) this.f5601c;
                if (n6Var.h != null && (((z10 = n6Var.f5641f) && view == n6Var.d) || (!z10 && view == n6Var.f5639c))) {
                    if (z10) {
                        f7 = n6Var.f5640e;
                    } else {
                        f7 = 1.0f - n6Var.f5640e;
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
                if (view != ((SecretMediaViewer) this.f5600b).f34500w && super.drawChild(canvas, view, j3)) {
                    return true;
                }
                return false;
            case 22:
                Path path2 = (Path) this.f5600b;
                k51 k51Var = (k51) this.f5601c;
                RectF rectF = k51Var.R;
                if (view != k51Var.N && view != k51Var.f39145x) {
                    if (view == k51Var.P) {
                        canvas.save();
                        path2.rewind();
                        path2.addCircle(rectF.centerX() + k51Var.N.getX(), rectF.centerY() + k51Var.N.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                        canvas.clipPath(path2);
                        canvas.clipRect(0.0f, AndroidUtilities.lerp(k51Var.T, 0.0f, k51Var.f39143s), getWidth(), AndroidUtilities.lerp(k51Var.U, getHeight(), k51Var.f39143s));
                        canvas.translate(-k51Var.P.getX(), -k51Var.P.getY());
                        canvas.translate(k51Var.N.getX() + rectF.left, k51Var.N.getY() + rectF.top);
                        canvas.scale(rectF.width() / k51Var.P.getMeasuredWidth(), rectF.height() / k51Var.P.getMeasuredHeight(), k51Var.P.getX(), k51Var.P.getY());
                        boolean drawChild2 = super.drawChild(canvas, view, j3);
                        canvas.restore();
                        return drawChild2;
                    }
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(k51Var.T, 0.0f, k51Var.f39143s), getWidth(), AndroidUtilities.lerp(k51Var.U, getHeight(), k51Var.f39143s));
                boolean drawChild3 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild3;
            case 23:
                if (view == ((k71) this.f5601c).f39176h0 && zg.d0.f54546b && zg.d0.f54549f) {
                    for (int i10 = 0; i10 < ((k71) this.f5601c).f39176h0.getChildCount(); i10++) {
                        View childAt = ((k71) this.f5601c).f39176h0.getChildAt(i10);
                        if (childAt instanceof t61) {
                            t61 t61Var = (t61) childAt;
                            if (t61Var.getAnimatedScale() == 1.0f) {
                                ((Rect) this.f5600b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                canvas.save();
                                canvas.clipRect((Rect) this.f5600b);
                                super.drawChild(canvas, view, j3);
                                canvas.restore();
                            } else if (t61Var.getAnimatedScale() > 0.0f) {
                                ((Rect) this.f5600b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                ((Rect) this.f5600b).set((int) (rect.centerX() - (t61Var.getAnimatedScale() * (((Rect) this.f5600b).width() / 2.0f))), (int) (((Rect) this.f5600b).centerY() - (t61Var.getAnimatedScale() * (((Rect) this.f5600b).height() / 2.0f))), (int) ((t61Var.getAnimatedScale() * (((Rect) this.f5600b).width() / 2.0f)) + ((Rect) this.f5600b).centerX()), (int) ((t61Var.getAnimatedScale() * (((Rect) this.f5600b).height() / 2.0f)) + ((Rect) this.f5600b).centerY()));
                                canvas.save();
                                canvas.clipRect((Rect) this.f5600b);
                                canvas.scale(t61Var.getAnimatedScale(), t61Var.getAnimatedScale(), ((Rect) this.f5600b).centerX(), ((Rect) this.f5600b).centerY());
                                super.drawChild(canvas, view, j3);
                                canvas.restore();
                            }
                        } else if ((childAt instanceof TextView) || (childAt instanceof o61) || (childAt instanceof n61) || (childAt instanceof p61)) {
                            ((Rect) this.f5600b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.f5600b);
                            super.drawChild(canvas, view, j3);
                            canvas.restore();
                        }
                    }
                    return false;
                }
                return super.drawChild(canvas, view, j3);
            case 27:
                org.telegram.ui.Wallet.b5 b5Var = (org.telegram.ui.Wallet.b5) this.f5601c;
                if (view == b5Var.f34726q0 && b5Var.F) {
                    int save = canvas.save();
                    canvas.concat(b5Var.J);
                    boolean drawChild4 = super.drawChild(canvas, view, j3);
                    canvas.restoreToCount(save);
                    return drawChild4;
                }
                return super.drawChild(canvas, view, j3);
            case 28:
                Path path3 = (Path) this.f5600b;
                qg.l0 l0Var = (qg.l0) this.f5601c;
                if (l0Var.h != null && (((z11 = l0Var.f46378f) && view == l0Var.d) || (!z11 && view == l0Var.f46376c))) {
                    if (z11) {
                        f10 = l0Var.f46377e;
                    } else {
                        f10 = 1.0f - l0Var.f46377e;
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
        switch (this.f5599a) {
            case 2:
                super.invalidate();
                ((mg.i) this.f5601c).invalidate();
                return;
            case 26:
                super.invalidate();
                org.telegram.ui.ActionBar.q0 q0Var = ((xd1) this.f5601c).f44034t0;
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
        switch (this.f5599a) {
            case 16:
                super.onAttachedToWindow();
                rt rtVar = (rt) this.f5601c;
                rtVar.A.onAttachedToWindow();
                rtVar.B.onAttachedToWindow();
                return;
            case 19:
                super.onAttachedToWindow();
                ((ProfileActivity) this.f5601c).f34373r5.onAttachedToWindow();
                return;
            case 21:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.f5600b).h.onAttachedToWindow();
                return;
            case 24:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f5600b).onAttachedToWindow();
                return;
            case 27:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((org.telegram.ui.Wallet.m4) this.f5600b);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.f5599a) {
            case 14:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                org.telegram.ui.Components.voip.j1 j1Var = (org.telegram.ui.Components.voip.j1) this.f5601c;
                AndroidUtilities.setPreferredMaxRefreshRate(j1Var.f32065b, j1Var.d, j1Var.f32066c);
                j1Var.i(false);
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f5599a) {
            case 16:
                super.onDetachedFromWindow();
                rt rtVar = (rt) this.f5601c;
                rtVar.A.onDetachedFromWindow();
                rtVar.B.onDetachedFromWindow();
                return;
            case 19:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.f5601c).f34373r5.onDetachedFromWindow();
                return;
            case 21:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.f5600b).h.onDetachedFromWindow();
                return;
            case 24:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f5600b).onDetachedFromWindow();
                return;
            case 27:
                getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Wallet.m4) this.f5600b);
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
        switch (this.f5599a) {
            case 19:
                if ((((ProfileActivity) this.f5601c).f34346n5 == 0.0f && (idVar = (org.telegram.ui.Components.id) this.f5600b) != null && idVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f5599a) {
            case 17:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = (i13 - i11) / 4;
                int i15 = i14 * 3;
                int A = bi.A(275.0f, i15, 2);
                d80 d80Var = (d80) this.f5601c;
                FrameLayout frameLayout = d80Var.f36941r;
                int i16 = 0;
                frameLayout.layout(0, A, frameLayout.getMeasuredWidth(), d80Var.f36941r.getMeasuredHeight() + A);
                int dp = AndroidUtilities.dp(139.0f) + AndroidUtilities.dp(150.0f) + A;
                int measuredWidth = (getMeasuredWidth() - d80Var.f36938e.getMeasuredWidth()) / 2;
                org.telegram.ui.Components.va vaVar = d80Var.f36938e;
                vaVar.layout(measuredWidth, dp, vaVar.getMeasuredWidth() + measuredWidth, d80Var.f36938e.getMeasuredHeight() + dp);
                z4.g gVar = d80Var.d;
                gVar.layout(0, 0, gVar.getMeasuredWidth(), d80Var.d.getMeasuredHeight());
                int measuredHeight = ((i14 - d80Var.f36940n.getMeasuredHeight()) / 2) + i15;
                int measuredWidth2 = (getMeasuredWidth() - d80Var.f36940n.getMeasuredWidth()) / 2;
                bi.o oVar = d80Var.f36940n;
                oVar.layout(measuredWidth2, measuredHeight, oVar.getMeasuredWidth() + measuredWidth2, d80Var.f36940n.getMeasuredHeight() + measuredHeight);
                int dp2 = measuredHeight - AndroidUtilities.dp(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - d80Var.f36939f.getMeasuredWidth()) / 2;
                TextView textView = d80Var.f36939f;
                textView.layout(measuredWidth3, dp2 - textView.getMeasuredHeight(), d80Var.f36939f.getMeasuredWidth() + measuredWidth3, dp2);
                FrameLayout frameLayout2 = (FrameLayout) this.f5600b;
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
                int dp4 = AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(150.0f) + bi.A(275.0f, ((i13 - i11) / 4) * 3, 2);
                int dp5 = AndroidUtilities.dp(18.0f);
                TextView textView2 = (TextView) this.f5600b;
                textView2.layout(dp5, dp4, textView2.getMeasuredWidth() + dp5, textView2.getMeasuredHeight() + dp4);
                int dp6 = AndroidUtilities.dp(18.0f) + dp4 + ((int) textView2.getTextSize());
                int dp7 = AndroidUtilities.dp(16.0f);
                TextView textView3 = (TextView) this.f5601c;
                textView3.layout(dp7, dp6, textView3.getMeasuredWidth() + dp7, textView3.getMeasuredHeight() + dp6);
                return;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.f5601c).V4();
                return;
            case 20:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 21:
                super.onLayout(z10, i10, i11, i12, i13);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f5601c;
                if (secretMediaViewer.f34479n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f34479n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight;
                    d51 d51Var = secretMediaViewer.f34479n;
                    d51Var.layout(d51Var.getLeft(), currentActionBarHeight, secretMediaViewer.f34479n.getRight(), secretMediaViewer.f34479n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.f34488r != null && secretMediaViewer.f34479n != null) {
                    int measuredHeight2 = (secretMediaViewer.f34479n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f34479n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight)) - AndroidUtilities.dp(10.0f);
                    d4 d4Var = secretMediaViewer.f34488r;
                    d4Var.layout(d4Var.getLeft(), measuredHeight2, secretMediaViewer.f34488r.getRight(), secretMediaViewer.f34488r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.f34451a0 != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                    cu0 cu0Var = secretMediaViewer.f34451a0;
                    cu0Var.layout(cu0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.f34451a0.getRight(), secretMediaViewer.f34451a0.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f34464f;
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
        switch (this.f5599a) {
            case 1:
                ViewGroup viewGroup = (ViewGroup) this.f5600b;
                gg.e eVar = (gg.e) this.f5601c;
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
                if (!eVar.E && !eVar.f10578w) {
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
                super.onMeasure(i10, bi.C(8.0f, ((LinearLayout) this.f5600b).getMeasuredHeight(), 1073741824));
                return;
            case 9:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                return;
            case 11:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
                setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                return;
            case 20:
                d31 d31Var = (d31) this.f5601c;
                View view = d31Var.H;
                View view2 = d31Var.I;
                LinearLayout linearLayout = d31Var.v;
                TextView textView = d31Var.f36873s;
                rm0 rm0Var = d31Var.f36876y;
                boolean z10 = d31Var.S.P;
                int dp3 = AndroidUtilities.dp(12.0f);
                if (z10) {
                    rm0Var.setLayoutParams(w7.x5.a(104.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 8388611));
                    rm0Var.setPadding(dp3, 0, dp3, 0);
                    if (linearLayout != null) {
                        textView.setLayoutParams(w7.x5.a(48.0f, 16.0f, 162.0f, 16.0f, 72.0f, -1, 8388611));
                        linearLayout.setLayoutParams(w7.x5.a(48.0f, 16.0f, 162.0f, 16.0f, 16.0f, -1, 8388691));
                    } else {
                        textView.setLayoutParams(w7.x5.a(48.0f, 16.0f, 162.0f, 16.0f, 16.0f, -1, 8388611));
                    }
                } else {
                    rm0Var.setPadding(dp3, dp3 / 2, dp3, dp3);
                    if (linearLayout != null) {
                        rm0Var.setLayoutParams(w7.x5.a(-1.0f, 0.0f, 44.0f, 0.0f, 136.0f, -1, 8388611));
                        textView.setLayoutParams(w7.x5.a(48.0f, 16.0f, 0.0f, 16.0f, 72.0f, -1, 80));
                        linearLayout.setLayoutParams(w7.x5.a(48.0f, 16.0f, 0.0f, 16.0f, 16.0f, -1, 80));
                    } else {
                        rm0Var.setLayoutParams(w7.x5.a(-1.0f, 0.0f, 44.0f, 0.0f, 80.0f, -1, 8388611));
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
                if (d31Var.R != z10) {
                    e31 e31Var = d31Var.d;
                    if (z10) {
                        e31Var.getParentActivity();
                        sVar = new s4.d0(0, false);
                    } else {
                        e31Var.getParentActivity();
                        sVar = new s4.s(3, false);
                    }
                    d31Var.G = sVar;
                    rm0Var.setLayoutManager(sVar);
                    rm0Var.requestLayout();
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
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f5601c;
                cu0 cu0Var = secretMediaViewer.f34451a0;
                if (cu0Var != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                    int currentActionBarHeight = (measuredHeight2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                    if (secretMediaViewer.U.getVisibility() != 0) {
                        measuredHeight = 0;
                    } else {
                        measuredHeight = secretMediaViewer.U.getMeasuredHeight();
                    }
                    cu0Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(currentActionBarHeight - measuredHeight, 1073741824));
                }
                View view3 = secretMediaViewer.f34464f;
                if (view3 != null) {
                    view3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.navigationBarHeight, 1073741824));
                    return;
                }
                return;
            case 29:
                super.onMeasure(i10, bi.C(2.0f, ((rg.y0) this.f5601c).f47571s, 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f5599a) {
            case 3:
                super.onSizeChanged(i10, i11, i12, i13);
                yf.y yVar = (yf.y) this.f5601c;
                yVar.setBounds(0, 0, i10, i11);
                yVar.c(0, AndroidUtilities.dp(24.0f) + getPaddingBottom());
                return;
            case 14:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.f5600b;
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
        switch (this.f5599a) {
            case 12:
                ((Paint) this.f5600b).setColor(i10);
                return;
            default:
                super.setBackgroundColor(i10);
                return;
        }
    }

    @Override
    public void setTranslationX(float f7) {
        switch (this.f5599a) {
            case 2:
                super.setTranslationX(f7);
                ((mg.i) this.f5601c).invalidate();
                return;
            default:
                super.setTranslationX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f5599a) {
            case 2:
                super.setTranslationY(f7);
                ((mg.i) this.f5601c).invalidate();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f5599a) {
            case 11:
                if (((org.telegram.ui.Components.q6) this.f5600b) != drawable && ((org.telegram.ui.Components.q6) this.f5601c) != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 20:
                if (drawable != ((d31) this.f5601c).f36870f && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public m6(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f5599a = i10;
        this.f5601c = obj;
        this.f5600b = obj2;
    }

    public m6(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f5599a = i10;
        switch (i10) {
            case 11:
                super(context);
                org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(true, true, true);
                this.f5600b = q6Var;
                is isVar = is.h;
                q6Var.n(0.3f, 430L, isVar);
                q6Var.x(AndroidUtilities.bold());
                q6Var.u(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.A8, e6Var));
                q6Var.w(AndroidUtilities.dp(18.0f));
                q6Var.q(!LocaleController.isRTL);
                q6Var.setCallback(this);
                q6Var.M = AndroidUtilities.displaySize.x;
                org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(true, true, true);
                this.f5601c = q6Var2;
                q6Var2.n(0.3f, 430L, isVar);
                q6Var2.u(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.B8, e6Var));
                q6Var2.w(AndroidUtilities.dp(14.0f));
                q6Var2.q(true ^ LocaleController.isRTL);
                q6Var2.setCallback(this);
                q6Var2.M = AndroidUtilities.displaySize.x;
                return;
            default:
                this.f5601c = new yf.y(8);
                this.f5600b = e6Var;
                return;
        }
    }

    public m6(org.telegram.ui.Cells.z0 z0Var, Context context) {
        super(context);
        this.f5599a = 6;
        this.f5601c = z0Var;
        this.f5600b = new RectF();
    }

    public m6(k51 k51Var, Context context) {
        super(context);
        this.f5599a = 22;
        this.f5601c = k51Var;
        this.f5600b = new Path();
    }

    public m6(org.telegram.ui.ac acVar, Context context) {
        super(context);
        this.f5599a = 7;
        this.f5601c = acVar;
        this.f5600b = new Paint(1);
    }

    public m6(org.telegram.ui.o5 o5Var, Activity activity) {
        super(activity);
        this.f5599a = 5;
        this.f5601c = o5Var;
        this.f5600b = new Paint(1);
    }

    public m6(org.telegram.ui.Components.voip.j1 j1Var, Context context) {
        super(context);
        this.f5599a = 14;
        this.f5601c = j1Var;
        this.f5600b = new Path();
    }

    public m6(ue0 ue0Var, Context context) {
        super(context);
        this.f5599a = 12;
        this.f5601c = ue0Var;
        this.f5600b = new Paint();
    }

    public m6(org.telegram.ui.Wallet.b5 b5Var, Context context) {
        super(context);
        this.f5599a = 27;
        this.f5601c = b5Var;
        this.f5600b = new org.telegram.ui.Wallet.m4(this, 0);
    }

    public m6(Context context, TextView textView, TextView textView2) {
        super(context);
        this.f5599a = 18;
        this.f5600b = textView;
        this.f5601c = textView2;
    }

    public m6(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f5599a = 21;
        this.f5601c = secretMediaViewer;
        this.f5600b = secretMediaViewer;
        setWillNotDraw(false);
    }

    public m6(k71 k71Var, Context context) {
        super(context);
        this.f5599a = 23;
        this.f5601c = k71Var;
        this.f5600b = new Rect();
    }

    public m6(d31 d31Var, Activity activity, e31 e31Var) {
        super(activity);
        this.f5599a = 20;
        this.f5601c = d31Var;
        Rect rect = new Rect();
        this.f5600b = rect;
        d31Var.f36866a.setColor(e31Var.getThemedColor(org.telegram.ui.ActionBar.i6.f20801d6));
        Drawable drawable = d31Var.f36870f;
        drawable.setCallback(this);
        drawable.getPadding(rect);
    }

    public m6(cq cqVar, Context context) {
        super(context);
        this.f5599a = 9;
        this.f5601c = cqVar;
        this.f5600b = new Paint();
    }

    public m6(rt rtVar, Activity activity) {
        super(activity);
        this.f5599a = 16;
        this.f5601c = rtVar;
        this.f5600b = rtVar;
        setWillNotDraw(false);
    }

    public m6(xd1 xd1Var, Context context, int i10) {
        super(context);
        this.f5599a = i10;
        switch (i10) {
            case 26:
                this.f5601c = xd1Var;
                super(context);
                this.f5600b = new int[2];
                return;
            default:
                this.f5601c = xd1Var;
                this.f5600b = new Paint();
                return;
        }
    }

    public m6(qg.l0 l0Var, Context context) {
        super(context);
        this.f5599a = 28;
        this.f5601c = l0Var;
        this.f5600b = new Path();
    }

    public m6(ll0 ll0Var, Context context) {
        super(context);
        this.f5599a = 13;
        this.f5601c = ll0Var;
        this.f5600b = new Paint(1);
    }

    public m6(Context context, int i10) {
        super(context);
        this.f5599a = i10;
        switch (i10) {
            case 24:
                super(context);
                return;
            default:
                this.f5600b = new Path();
                this.f5601c = new j20();
                return;
        }
    }

    public m6(n6 n6Var, Context context) {
        super(context);
        this.f5599a = 0;
        this.f5601c = n6Var;
        this.f5600b = new Path();
    }
}
