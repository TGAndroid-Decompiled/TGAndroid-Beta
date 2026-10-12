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
import android.util.StateSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import di.d4;
import di.l6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.yh;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.aa;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.fe0;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.hd;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.re0;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.ua;
import org.telegram.ui.Components.zp;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.Wallet.l4;
import org.telegram.ui.Wallet.z4;
import org.telegram.ui.a71;
import org.telegram.ui.ce1;
import org.telegram.ui.gc;
import org.telegram.ui.h80;
import org.telegram.ui.iu0;
import org.telegram.ui.k31;
import org.telegram.ui.k4;
import org.telegram.ui.k51;
import org.telegram.ui.l31;
import org.telegram.ui.p20;
import org.telegram.ui.r51;
import org.telegram.ui.r71;
import org.telegram.ui.s5;
import org.telegram.ui.u61;
import org.telegram.ui.uz0;
import org.telegram.ui.v61;
import org.telegram.ui.w61;
import org.telegram.ui.xt;
import w7.a6;
public final class v extends FrameLayout {
    public final int f889a;
    public Object f890b;
    public Object f891c;

    public v(Object obj, Context context, int i10) {
        super(context);
        this.f889a = i10;
        this.f891c = obj;
    }

    public void b(String str, boolean z10) {
        boolean z11;
        r6 r6Var = (r6) this.f891c;
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        r6Var.t(str, z11, true);
    }

    public void c(String str, boolean z10) {
        boolean z11;
        r6 r6Var = (r6) this.f890b;
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        r6Var.t(str, z11, true);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        c6 c6Var;
        Paint paint;
        boolean b12;
        int k10;
        h5[] h5VarArr;
        char c10;
        float f7;
        float f10;
        org.telegram.ui.Cells.z zVar;
        float f11;
        switch (this.f889a) {
            case 5:
                zf.z zVar2 = (zf.z) this.f891c;
                zVar2.b(g6.m1(0.65f, g6.w0(g6.f19901d6, (c6) this.f890b)));
                zVar2.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 6:
            case 14:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 23:
            case 24:
            case 25:
            case 27:
            case 28:
            default:
                super.dispatchDraw(canvas);
                return;
            case 7:
                super.dispatchDraw(canvas);
                Paint paint2 = (Paint) this.f890b;
                int i10 = g6.f19843a7;
                c6Var = ((m2) ((s5) this.f891c).d).resourceProvider;
                paint2.setColor(g6.w0(i10, c6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint2);
                return;
            case 8:
                RectF rectF = (RectF) this.f890b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Cells.a1 a1Var = (org.telegram.ui.Cells.a1) this.f891c;
                int measuredWidth = a1Var.getMeasuredWidth();
                int i11 = a1Var.d;
                float x10 = a1Var.getX();
                float f12 = a1Var.f20895c;
                c6 c6Var2 = a1Var.f20894b;
                if (c6Var2 != null) {
                    c6Var2.l(x10, f12, measuredWidth, i11);
                } else {
                    g6.q(x10, f12, measuredWidth, i11);
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
                    paint = g6.T0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, dp, dp2, paint);
                if (c6Var2 != null) {
                    b12 = c6Var2.m0();
                } else {
                    b12 = g6.b1();
                }
                if (b12) {
                    float dp3 = AndroidUtilities.dp(18.0f);
                    float dp4 = AndroidUtilities.dp(18.0f);
                    if (c6Var2 != null) {
                        paint3 = c6Var2.G("paintChatActionBackgroundDarken");
                    }
                    if (paint3 == null) {
                        paint3 = g6.T0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF, dp3, dp4, paint3);
                }
                super.dispatchDraw(canvas);
                return;
            case 9:
                super.dispatchDraw(canvas);
                Paint paint4 = (Paint) this.f890b;
                paint4.setColor(g6.w0(g6.f19843a7, ((gc) this.f891c).f36372f.e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint4);
                return;
            case 10:
                float dp5 = AndroidUtilities.dp(20.0f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.f890b;
                path.rewind();
                path.addRoundRect(rectF2, dp5, dp5, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF2, 255, 31);
                super.dispatchDraw(canvas);
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), AndroidUtilities.dp(6.0f) + getPaddingTop());
                p20 p20Var = (p20) this.f891c;
                p20Var.b(canvas, rectF2, 1, 1.0f);
                rectF2.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                p20Var.b(canvas, rectF2, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                return;
            case 11:
                super.dispatchDraw(canvas);
                Paint paint5 = (Paint) this.f890b;
                paint5.setColor(((zp) this.f891c).getThemedColor(g6.f19902d7));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint5);
                return;
            case 12:
                iz izVar = (iz) this.f891c;
                if (!izVar.G.f31069u0 && izVar.f26132w > 0.0f) {
                    if (((Paint) this.f890b) == null) {
                        Paint paint6 = new Paint();
                        this.f890b = paint6;
                        paint6.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f890b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f890b).setAlpha((int) (izVar.f26132w * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f890b);
                    canvas.restore();
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 13:
                r6 r6Var = (r6) this.f890b;
                int dp6 = AndroidUtilities.dp(29.0f);
                int dp7 = AndroidUtilities.dp(18.83f);
                r6 r6Var2 = (r6) this.f891c;
                r6Var.setBounds(getPaddingLeft(), r3 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r3);
                r6Var.draw(canvas);
                r6Var2.setBounds(getPaddingLeft(), r2 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r2);
                r6Var2.draw(canvas);
                return;
            case 15:
                Paint paint7 = (Paint) this.f890b;
                gl0 gl0Var = (gl0) this.f891c;
                int i12 = gl0Var.M0;
                if (i12 != 1 && i12 != 2 && i12 != 4) {
                    k10 = i0.a.d(0.7f, g6.w0(g6.F8, gl0Var.f25341k0), g6.w0(g6.f19972h5, gl0Var.f25341k0));
                } else {
                    k10 = i0.a.k(-1, 30);
                }
                paint7.setColor(k10);
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - AndroidUtilities.dpf2(6.0f)) / 2.0f;
                float g10 = gl0Var.g();
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
            case 21:
                super.dispatchDraw(canvas);
                ProfileActivity profileActivity = (ProfileActivity) this.f891c;
                h5[] h5VarArr2 = profileActivity.f32646r;
                if (profileActivity.W4 != null) {
                    canvas.save();
                    canvas.translate(h5VarArr2[0].getX(), h5VarArr2[0].getY());
                    f7 = 0.0f;
                    h5VarArr = h5VarArr2;
                    c10 = 2;
                    f10 = 2.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.W4.getMeasuredWidth(), profileActivity.W4.getMeasuredHeight(), (int) ((1.0f - profileActivity.S1) * 255.0f), 31);
                    profileActivity.W4.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    h5VarArr = h5VarArr2;
                    c10 = 2;
                    f7 = 0.0f;
                    f10 = 2.0f;
                }
                if (profileActivity.p5 && profileActivity.Y5 != f7 && profileActivity.f32625n5 != 1.0f) {
                    float measuredHeight2 = (h5VarArr[1].getMeasuredHeight() / f10) + h5VarArr[1].getY();
                    float dp8 = AndroidUtilities.dp(22.0f);
                    float x11 = ((h5VarArr[1].getX() + (AndroidUtilities.dp(28.0f) - profileActivity.f32632o5)) - dp8) - profileActivity.Z3();
                    profileActivity.f32652r5.setImageCoords(x11, measuredHeight2 - (dp8 / f10), dp8, dp8);
                    profileActivity.f32652r5.setAlpha(profileActivity.Y5);
                    canvas.save();
                    float f13 = profileActivity.Y5;
                    canvas.scale(f13, f13, profileActivity.f32652r5.getCenterX(), profileActivity.f32652r5.getCenterY());
                    profileActivity.f32652r5.draw(canvas);
                    canvas.restore();
                    if (profileActivity.f32625n5 == f7) {
                        if (((hd) this.f890b) == null) {
                            hd hdVar = new hd(this);
                            this.f890b = hdVar;
                            hdVar.h = new uz0(this, 0);
                        }
                        float dp9 = (1.0f - profileActivity.f32625n5) * AndroidUtilities.dp(28.0f);
                        float textWidth = h5VarArr[c10].getTextWidth();
                        if (profileActivity.T != null) {
                            f11 = (AndroidUtilities.dp(24.0f) + textWidth + AndroidUtilities.dp(4.0f)) * profileActivity.T.getVisibilityFactor();
                        } else {
                            f11 = f7;
                        }
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        rectF4.set(x11 - AndroidUtilities.dp(4.0f), measuredHeight2 - AndroidUtilities.dp(14.0f), x11 + Math.max(textWidth, f11) + dp9 + AndroidUtilities.dp(4.0f), measuredHeight2 + AndroidUtilities.dp(14.0f));
                        hd hdVar2 = (hd) this.f890b;
                        hdVar2.f25637i = false;
                        hdVar2.f25634c = 0;
                        hdVar2.a(rectF4);
                        hd hdVar3 = (hd) this.f890b;
                        hdVar3.f25642n = true;
                        int k11 = i0.a.k(-1, 50);
                        hdVar3.f25636g.setColor(0);
                        org.telegram.ui.Cells.z zVar3 = hdVar3.e;
                        if (zVar3 != null) {
                            g6.C1(zVar3, k11, true);
                        }
                        hd hdVar4 = (hd) this.f890b;
                        hdVar4.c(canvas, hdVar4.f25636g);
                        org.telegram.ui.Cells.z zVar4 = hdVar4.e;
                        if (zVar4 != null) {
                            zVar4.draw(canvas);
                            return;
                        }
                        return;
                    }
                    hd hdVar5 = (hd) this.f890b;
                    if (hdVar5 != null && (zVar = hdVar5.e) != null) {
                        zVar.setState(StateSet.NOTHING);
                        zVar.jumpToCurrentState();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                Rect rect = (Rect) this.f890b;
                k31 k31Var = (k31) this.f891c;
                if (k31Var.R) {
                    k31Var.f37506f.setBounds(-rect.left, -rect.top, getWidth() + rect.right, getHeight() + rect.bottom);
                    k31Var.f37506f.draw(canvas);
                } else {
                    RectF rectF5 = AndroidUtilities.rectTmp;
                    rectF5.set(0.0f, 0.0f, AndroidUtilities.dp(14.0f) + getWidth(), getHeight());
                    canvas.drawRoundRect(rectF5, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), k31Var.f37503a);
                }
                super.dispatchDraw(canvas);
                return;
            case 26:
                ImageReceiver imageReceiver = (ImageReceiver) this.f890b;
                imageReceiver.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                imageReceiver.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 29:
                super.dispatchDraw(canvas);
                z4 z4Var = (z4) this.f891c;
                if (z4Var.G) {
                    int save = canvas.save();
                    canvas.concat(z4Var.J);
                    canvas.translate(-z4Var.f33936q0.getLeft(), -z4Var.f33936q0.getTop());
                    super.drawChild(canvas, z4Var.f33936q0, getDrawingTime());
                    canvas.restoreToCount(save);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.f889a) {
            case 1:
                if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
                    t0 t0Var = (t0) this.f891c;
                    if (!t0Var.f871k) {
                        return true;
                    }
                    t0Var.d();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public void dispatchSetPressed(boolean z10) {
        switch (this.f889a) {
            case 1:
                return;
            default:
                super.dispatchSetPressed(z10);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        float f7;
        int dp;
        switch (this.f889a) {
            case 5:
                super.dispatchTouchEvent(motionEvent);
                return true;
            case 6:
                k4 k4Var = (k4) this.f891c;
                aa n10 = k4Var.P0.n(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.f890b;
                obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (k4Var.P0.x() && k4Var.P0.n(getContext()).onTouchEvent(obtain)) {
                    return true;
                }
                if (n10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() == 0 && k4Var.P0.x() && (motionEvent.getY() < linearLayout.getTop() || motionEvent.getY() > linearLayout.getBottom())) {
                    if (!k4Var.P0.n(getContext()).onTouchEvent(obtain)) {
                        return true;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            case 16:
                int action = motionEvent.getAction();
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.f891c;
                if (h1Var.J != null) {
                    MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                    obtain2.offsetLocation(h1Var.J.getX(), h1Var.J.getY());
                    boolean dispatchTouchEvent = h1Var.J.dispatchTouchEvent(motionEvent);
                    obtain2.recycle();
                    if (action == 1 || action == 3) {
                        h1Var.J = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                obtain3.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = h1Var.F.onTouchEvent(obtain3);
                obtain3.recycle();
                if (!h1Var.F.isInProgress() && ((GestureDetector) h1Var.G.f13233b).onTouchEvent(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (action == 1 || action == 3) {
                    h1Var.H = false;
                    h1Var.I = false;
                    o1.k kVar = h1Var.S;
                    if (!kVar.f16461f) {
                        float f10 = h1Var.Q;
                        kVar.f16459b = f10;
                        kVar.f16460c = true;
                        o1.l lVar = kVar.f16468u;
                        int i10 = h1Var.M;
                        float f11 = (i10 / 2.0f) + f10;
                        int i11 = AndroidUtilities.displaySize.x;
                        if (f11 >= i11 / 2.0f) {
                            dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        lVar.f16474i = dp;
                        h1Var.S.h();
                    }
                    o1.k kVar2 = h1Var.T;
                    if (!kVar2.f16461f) {
                        kVar2.f16459b = h1Var.R;
                        kVar2.f16460c = true;
                        kVar2.f16468u.f16474i = w7.s.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - h1Var.N) - AndroidUtilities.dp(16.0f));
                        h1Var.T.h();
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
        float f7;
        Rect rect;
        switch (this.f889a) {
            case 2:
                Path path = (Path) this.f890b;
                l6 l6Var = (l6) this.f891c;
                if (l6Var.h != null && (((z10 = l6Var.f7356f) && view == l6Var.d) || (!z10 && view == l6Var.f7355c))) {
                    if (z10) {
                        f7 = l6Var.e;
                    } else {
                        f7 = 1.0f - l6Var.e;
                    }
                    canvas.save();
                    path.rewind();
                    path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f7 * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                    canvas.clipPath(path);
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j10);
            case 18:
                if (view instanceof fe0) {
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            case 23:
                if (view != ((SecretMediaViewer) this.f890b).f32776w && super.drawChild(canvas, view, j10)) {
                    return true;
                }
                return false;
            case 24:
                Path path2 = (Path) this.f890b;
                r51 r51Var = (r51) this.f891c;
                RectF rectF = r51Var.R;
                if (view != r51Var.N && view != r51Var.f39609x) {
                    if (view == r51Var.P) {
                        canvas.save();
                        path2.rewind();
                        path2.addCircle(rectF.centerX() + r51Var.N.getX(), rectF.centerY() + r51Var.N.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                        canvas.clipPath(path2);
                        canvas.clipRect(0.0f, AndroidUtilities.lerp(r51Var.T, 0.0f, r51Var.f39607s), getWidth(), AndroidUtilities.lerp(r51Var.U, getHeight(), r51Var.f39607s));
                        canvas.translate(-r51Var.P.getX(), -r51Var.P.getY());
                        canvas.translate(r51Var.N.getX() + rectF.left, r51Var.N.getY() + rectF.top);
                        canvas.scale(rectF.width() / r51Var.P.getMeasuredWidth(), rectF.height() / r51Var.P.getMeasuredHeight(), r51Var.P.getX(), r51Var.P.getY());
                        boolean drawChild2 = super.drawChild(canvas, view, j10);
                        canvas.restore();
                        return drawChild2;
                    }
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(r51Var.T, 0.0f, r51Var.f39607s), getWidth(), AndroidUtilities.lerp(r51Var.U, getHeight(), r51Var.f39607s));
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild3;
            case 25:
                if (view == ((r71) this.f891c).f39637h0 && x0.f897b && x0.f899f) {
                    for (int i10 = 0; i10 < ((r71) this.f891c).f39637h0.getChildCount(); i10++) {
                        View childAt = ((r71) this.f891c).f39637h0.getChildAt(i10);
                        if (childAt instanceof a71) {
                            a71 a71Var = (a71) childAt;
                            if (a71Var.getAnimatedScale() == 1.0f) {
                                ((Rect) this.f890b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                canvas.save();
                                canvas.clipRect((Rect) this.f890b);
                                super.drawChild(canvas, view, j10);
                                canvas.restore();
                            } else if (a71Var.getAnimatedScale() > 0.0f) {
                                ((Rect) this.f890b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                ((Rect) this.f890b).set((int) (rect.centerX() - (a71Var.getAnimatedScale() * (((Rect) this.f890b).width() / 2.0f))), (int) (((Rect) this.f890b).centerY() - (a71Var.getAnimatedScale() * (((Rect) this.f890b).height() / 2.0f))), (int) ((a71Var.getAnimatedScale() * (((Rect) this.f890b).width() / 2.0f)) + ((Rect) this.f890b).centerX()), (int) ((a71Var.getAnimatedScale() * (((Rect) this.f890b).height() / 2.0f)) + ((Rect) this.f890b).centerY()));
                                canvas.save();
                                canvas.clipRect((Rect) this.f890b);
                                canvas.scale(a71Var.getAnimatedScale(), a71Var.getAnimatedScale(), ((Rect) this.f890b).centerX(), ((Rect) this.f890b).centerY());
                                super.drawChild(canvas, view, j10);
                                canvas.restore();
                            }
                        } else if ((childAt instanceof TextView) || (childAt instanceof v61) || (childAt instanceof u61) || (childAt instanceof w61)) {
                            ((Rect) this.f890b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.f890b);
                            super.drawChild(canvas, view, j10);
                            canvas.restore();
                        }
                    }
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            case 29:
                z4 z4Var = (z4) this.f891c;
                if (view == z4Var.f33936q0 && z4Var.F) {
                    int save = canvas.save();
                    canvas.concat(z4Var.J);
                    boolean drawChild4 = super.drawChild(canvas, view, j10);
                    canvas.restoreToCount(save);
                    return drawChild4;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public boolean fitSystemWindows(Rect rect) {
        switch (this.f889a) {
            case 1:
                t0 t0Var = (t0) this.f891c;
                float f7 = t0Var.f881u;
                float f10 = rect.bottom;
                if (f7 != f10 && t0Var.v) {
                    t0Var.f881u = f10;
                    v vVar = t0Var.f866c;
                    s0 s0Var = t0Var.f864a;
                    if (!t0Var.f877q) {
                        float f11 = t0Var.f880t;
                        int dp = AndroidUtilities.dp(32.0f);
                        int i10 = t0Var.f884y;
                        if (i10 == 1 || i10 == 2) {
                            dp = AndroidUtilities.dp(24.0f);
                        }
                        float f12 = dp;
                        if (s0Var.getMeasuredHeight() + f11 > (vVar.getMeasuredHeight() - t0Var.f881u) - f12) {
                            f11 = ((vVar.getMeasuredHeight() - t0Var.f881u) - s0Var.getMeasuredHeight()) - f12;
                        }
                        if (f11 < 0.0f) {
                            f11 = 0.0f;
                        }
                        s0Var.animate().translationY(f11).setDuration(250L).setUpdateListener(new j0(t0Var, 1)).setInterpolator(es.f24771f).start();
                    }
                }
                return super.fitSystemWindows(rect);
            default:
                return super.fitSystemWindows(rect);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f889a) {
            case 4:
                super.invalidate();
                ((ng.i) this.f891c).invalidate();
                return;
            case 28:
                super.invalidate();
                org.telegram.ui.ActionBar.p0 p0Var = ((ce1) this.f891c).f34905t0;
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
        switch (this.f889a) {
            case 0:
                super.onAttachedToWindow();
                ((u) this.f890b).c();
                return;
            case 1:
                super.onAttachedToWindow();
                sc.a(this, (m0) this.f890b);
                return;
            case 18:
                super.onAttachedToWindow();
                xt xtVar = (xt) this.f891c;
                xtVar.A.onAttachedToWindow();
                xtVar.B.onAttachedToWindow();
                return;
            case 21:
                super.onAttachedToWindow();
                ((ProfileActivity) this.f891c).f32652r5.onAttachedToWindow();
                return;
            case 23:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.f890b).h.onAttachedToWindow();
                return;
            case 26:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f890b).onAttachedToWindow();
                return;
            case 29:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((l4) this.f890b);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.f889a) {
            case 16:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.f891c;
                AndroidUtilities.setPreferredMaxRefreshRate(h1Var.f30212b, h1Var.d, h1Var.f30213c);
                h1Var.i(false);
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f889a) {
            case 0:
                super.onDetachedFromWindow();
                ((u) this.f890b).d();
                return;
            case 1:
                super.onDetachedFromWindow();
                sc.h(this);
                return;
            case 18:
                super.onDetachedFromWindow();
                xt xtVar = (xt) this.f891c;
                xtVar.A.onDetachedFromWindow();
                xtVar.B.onDetachedFromWindow();
                return;
            case 21:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.f891c).f32652r5.onDetachedFromWindow();
                return;
            case 23:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.f890b).h.onDetachedFromWindow();
                return;
            case 26:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f890b).onDetachedFromWindow();
                return;
            case 29:
                getViewTreeObserver().removeOnPreDrawListener((l4) this.f890b);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: ah.v.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        hd hdVar;
        switch (this.f889a) {
            case 21:
                if ((((ProfileActivity) this.f891c).f32625n5 == 0.0f && (hdVar = (hd) this.f890b) != null && hdVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f889a) {
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = (i13 - i11) / 4;
                int i15 = i14 * 3;
                int B = yh.B(275.0f, i15, 2);
                h80 h80Var = (h80) this.f891c;
                FrameLayout frameLayout = h80Var.f36652r;
                int i16 = 0;
                frameLayout.layout(0, B, frameLayout.getMeasuredWidth(), h80Var.f36652r.getMeasuredHeight() + B);
                int dp = AndroidUtilities.dp(139.0f) + AndroidUtilities.dp(150.0f) + B;
                int measuredWidth = (getMeasuredWidth() - h80Var.e.getMeasuredWidth()) / 2;
                ua uaVar = h80Var.e;
                uaVar.layout(measuredWidth, dp, uaVar.getMeasuredWidth() + measuredWidth, h80Var.e.getMeasuredHeight() + dp);
                z4.g gVar = h80Var.d;
                gVar.layout(0, 0, gVar.getMeasuredWidth(), h80Var.d.getMeasuredHeight());
                int measuredHeight = ((i14 - h80Var.f36651n.getMeasuredHeight()) / 2) + i15;
                int measuredWidth2 = (getMeasuredWidth() - h80Var.f36651n.getMeasuredWidth()) / 2;
                ci.n nVar = h80Var.f36651n;
                nVar.layout(measuredWidth2, measuredHeight, nVar.getMeasuredWidth() + measuredWidth2, h80Var.f36651n.getMeasuredHeight() + measuredHeight);
                int dp2 = measuredHeight - AndroidUtilities.dp(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - h80Var.f36650f.getMeasuredWidth()) / 2;
                TextView textView = h80Var.f36650f;
                textView.layout(measuredWidth3, dp2 - textView.getMeasuredHeight(), h80Var.f36650f.getMeasuredWidth() + measuredWidth3, dp2);
                FrameLayout frameLayout2 = (FrameLayout) this.f890b;
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
            case 20:
                int dp4 = AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(150.0f) + yh.B(275.0f, ((i13 - i11) / 4) * 3, 2);
                int dp5 = AndroidUtilities.dp(18.0f);
                TextView textView2 = (TextView) this.f890b;
                textView2.layout(dp5, dp4, textView2.getMeasuredWidth() + dp5, textView2.getMeasuredHeight() + dp4);
                int dp6 = AndroidUtilities.dp(18.0f) + dp4 + ((int) textView2.getTextSize());
                int dp7 = AndroidUtilities.dp(16.0f);
                TextView textView3 = (TextView) this.f891c;
                textView3.layout(dp7, dp6, textView3.getMeasuredWidth() + dp7, textView3.getMeasuredHeight() + dp6);
                return;
            case 21:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.f891c).V4();
                return;
            case 22:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f891c;
                if (secretMediaViewer.f32755n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f32755n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight;
                    k51 k51Var = secretMediaViewer.f32755n;
                    k51Var.layout(k51Var.getLeft(), currentActionBarHeight, secretMediaViewer.f32755n.getRight(), secretMediaViewer.f32755n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.f32764r != null && secretMediaViewer.f32755n != null) {
                    int measuredHeight2 = (secretMediaViewer.f32755n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f32755n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight)) - AndroidUtilities.dp(10.0f);
                    d4 d4Var = secretMediaViewer.f32764r;
                    d4Var.layout(d4Var.getLeft(), measuredHeight2, secretMediaViewer.f32764r.getRight(), secretMediaViewer.f32764r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.f32728a0 != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                    iu0 iu0Var = secretMediaViewer.f32728a0;
                    iu0Var.layout(iu0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.f32728a0.getRight(), secretMediaViewer.f32728a0.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f32740f;
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
        s4.b0 sVar;
        int measuredHeight;
        switch (this.f889a) {
            case 3:
                ViewGroup viewGroup = (ViewGroup) this.f890b;
                hg.e eVar = (hg.e) this.f891c;
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
                if (!eVar.E && !eVar.f10531w) {
                    dp += dp2;
                }
                int paddingTop = (size - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
                if (dp < paddingTop) {
                    i13 = paddingTop - dp;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(i13, 1073741824));
                return;
            case 6:
                super.onMeasure(i10, i11);
                super.onMeasure(i10, yh.D(8.0f, ((LinearLayout) this.f890b).getMeasuredHeight(), 1073741824));
                return;
            case 11:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                return;
            case 13:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
                setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                return;
            case 22:
                k31 k31Var = (k31) this.f891c;
                View view = k31Var.H;
                View view2 = k31Var.I;
                LinearLayout linearLayout = k31Var.v;
                TextView textView = k31Var.f37509s;
                mm0 mm0Var = k31Var.f37512y;
                boolean z10 = k31Var.S.P;
                int dp3 = AndroidUtilities.dp(12.0f);
                if (z10) {
                    mm0Var.setLayoutParams(a6.a(104.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 8388611));
                    mm0Var.setPadding(dp3, 0, dp3, 0);
                    if (linearLayout != null) {
                        textView.setLayoutParams(a6.a(48.0f, 16.0f, 162.0f, 16.0f, 72.0f, -1, 8388611));
                        linearLayout.setLayoutParams(a6.a(48.0f, 16.0f, 162.0f, 16.0f, 16.0f, -1, 8388691));
                    } else {
                        textView.setLayoutParams(a6.a(48.0f, 16.0f, 162.0f, 16.0f, 16.0f, -1, 8388611));
                    }
                } else {
                    mm0Var.setPadding(dp3, dp3 / 2, dp3, dp3);
                    if (linearLayout != null) {
                        mm0Var.setLayoutParams(a6.a(-1.0f, 0.0f, 44.0f, 0.0f, 136.0f, -1, 8388611));
                        textView.setLayoutParams(a6.a(48.0f, 16.0f, 0.0f, 16.0f, 72.0f, -1, 80));
                        linearLayout.setLayoutParams(a6.a(48.0f, 16.0f, 0.0f, 16.0f, 16.0f, -1, 80));
                    } else {
                        mm0Var.setLayoutParams(a6.a(-1.0f, 0.0f, 44.0f, 0.0f, 80.0f, -1, 8388611));
                        textView.setLayoutParams(a6.a(48.0f, 16.0f, 0.0f, 16.0f, 16.0f, -1, 80));
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
                    view2.setLayoutParams(a6.a(AndroidUtilities.dp(2.0f), 0.0f, 0.0f, 0.0f, i12, -1, 80));
                    view.setVisibility(0);
                    view.setLayoutParams(a6.a(AndroidUtilities.dp(2.0f), 0.0f, 44.0f, 0.0f, 0.0f, -1, 48));
                }
                if (k31Var.R != z10) {
                    l31 l31Var = k31Var.d;
                    if (z10) {
                        l31Var.getParentActivity();
                        sVar = new s4.b0(0, false);
                    } else {
                        l31Var.getParentActivity();
                        sVar = new s4.s(3, false);
                    }
                    k31Var.G = sVar;
                    mm0Var.setLayoutManager(sVar);
                    mm0Var.requestLayout();
                    int i14 = k31Var.L;
                    if (i14 != -1) {
                        k31Var.b(i14);
                    }
                    k31Var.R = z10;
                }
                super.onMeasure(i10, i11);
                return;
            case 23:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f891c;
                iu0 iu0Var = secretMediaViewer.f32728a0;
                if (iu0Var != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                    int currentActionBarHeight = (measuredHeight2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                    if (secretMediaViewer.U.getVisibility() != 0) {
                        measuredHeight = 0;
                    } else {
                        measuredHeight = secretMediaViewer.U.getMeasuredHeight();
                    }
                    iu0Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(currentActionBarHeight - measuredHeight, 1073741824));
                }
                View view3 = secretMediaViewer.f32740f;
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
        switch (this.f889a) {
            case 5:
                super.onSizeChanged(i10, i11, i12, i13);
                zf.z zVar = (zf.z) this.f891c;
                zVar.setBounds(0, 0, i10, i11);
                zVar.c(0, AndroidUtilities.dp(24.0f) + getPaddingBottom());
                return;
            case 16:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.f890b;
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
        throw new UnsupportedOperationException("Method not decompiled: ah.v.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setBackgroundColor(int i10) {
        switch (this.f889a) {
            case 14:
                ((Paint) this.f890b).setColor(i10);
                return;
            default:
                super.setBackgroundColor(i10);
                return;
        }
    }

    @Override
    public void setTranslationX(float f7) {
        switch (this.f889a) {
            case 4:
                super.setTranslationX(f7);
                ((ng.i) this.f891c).invalidate();
                return;
            default:
                super.setTranslationX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f889a) {
            case 4:
                super.setTranslationY(f7);
                ((ng.i) this.f891c).invalidate();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f889a) {
            case 13:
                if (((r6) this.f890b) != drawable && ((r6) this.f891c) != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 22:
                if (drawable != ((k31) this.f891c).f37506f && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public v(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f889a = i10;
        this.f891c = obj;
        this.f890b = obj2;
    }

    public v(Context context, int i10, c6 c6Var) {
        super(context);
        this.f889a = i10;
        switch (i10) {
            case 13:
                super(context);
                r6 r6Var = new r6(true, true, true);
                this.f890b = r6Var;
                es esVar = es.h;
                r6Var.n(0.3f, 430L, esVar);
                r6Var.x(AndroidUtilities.bold());
                r6Var.u(g6.w0(g6.A8, c6Var));
                r6Var.w(AndroidUtilities.dp(18.0f));
                r6Var.q(!LocaleController.isRTL);
                r6Var.setCallback(this);
                r6Var.M = AndroidUtilities.displaySize.x;
                r6 r6Var2 = new r6(true, true, true);
                this.f891c = r6Var2;
                r6Var2.n(0.3f, 430L, esVar);
                r6Var2.u(g6.w0(g6.B8, c6Var));
                r6Var2.w(AndroidUtilities.dp(14.0f));
                r6Var2.q(true ^ LocaleController.isRTL);
                r6Var2.setCallback(this);
                r6Var2.M = AndroidUtilities.displaySize.x;
                return;
            default:
                this.f891c = new zf.z(8);
                this.f890b = c6Var;
                return;
        }
    }

    public v(org.telegram.ui.Cells.a1 a1Var, Context context) {
        super(context);
        this.f889a = 8;
        this.f891c = a1Var;
        this.f890b = new RectF();
    }

    public v(t0 t0Var, Context context) {
        super(context);
        this.f889a = 1;
        this.f891c = t0Var;
        this.f890b = new m0(this, 0);
    }

    private final void a(boolean z10) {
    }

    public v(r51 r51Var, Context context) {
        super(context);
        this.f889a = 24;
        this.f891c = r51Var;
        this.f890b = new Path();
    }

    public v(gc gcVar, Context context) {
        super(context);
        this.f889a = 9;
        this.f891c = gcVar;
        this.f890b = new Paint(1);
    }

    public v(a0 a0Var, Context context) {
        super(context);
        this.f889a = 0;
        this.f891c = a0Var;
        this.f890b = new u(this, this);
    }

    public v(s5 s5Var, Activity activity) {
        super(activity);
        this.f889a = 7;
        this.f891c = s5Var;
        this.f890b = new Paint(1);
    }

    public v(org.telegram.ui.Components.voip.h1 h1Var, Context context) {
        super(context);
        this.f889a = 16;
        this.f891c = h1Var;
        this.f890b = new Path();
    }

    public v(re0 re0Var, Context context) {
        super(context);
        this.f889a = 14;
        this.f891c = re0Var;
        this.f890b = new Paint();
    }

    public v(z4 z4Var, Context context) {
        super(context);
        this.f889a = 29;
        this.f891c = z4Var;
        this.f890b = new l4(this, 0);
    }

    public v(Context context, TextView textView, TextView textView2) {
        super(context);
        this.f889a = 20;
        this.f890b = textView;
        this.f891c = textView2;
    }

    public v(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f889a = 23;
        this.f891c = secretMediaViewer;
        this.f890b = secretMediaViewer;
        setWillNotDraw(false);
    }

    public v(r71 r71Var, Context context) {
        super(context);
        this.f889a = 25;
        this.f891c = r71Var;
        this.f890b = new Rect();
    }

    public v(k31 k31Var, Activity activity, l31 l31Var) {
        super(activity);
        this.f889a = 22;
        this.f891c = k31Var;
        Rect rect = new Rect();
        this.f890b = rect;
        k31Var.f37503a.setColor(l31Var.getThemedColor(g6.f19901d6));
        Drawable drawable = k31Var.f37506f;
        drawable.setCallback(this);
        drawable.getPadding(rect);
    }

    public v(zp zpVar, Context context) {
        super(context);
        this.f889a = 11;
        this.f891c = zpVar;
        this.f890b = new Paint();
    }

    public v(xt xtVar, Activity activity) {
        super(activity);
        this.f889a = 18;
        this.f891c = xtVar;
        this.f890b = xtVar;
        setWillNotDraw(false);
    }

    public v(ce1 ce1Var, Context context, int i10) {
        super(context);
        this.f889a = i10;
        switch (i10) {
            case 28:
                this.f891c = ce1Var;
                super(context);
                this.f890b = new int[2];
                return;
            default:
                this.f891c = ce1Var;
                this.f890b = new Paint();
                return;
        }
    }

    public v(gl0 gl0Var, Context context) {
        super(context);
        this.f889a = 15;
        this.f891c = gl0Var;
        this.f890b = new Paint(1);
    }

    public v(Context context, int i10) {
        super(context);
        this.f889a = i10;
        switch (i10) {
            case 26:
                super(context);
                return;
            default:
                this.f890b = new Path();
                this.f891c = new p20();
                return;
        }
    }

    public v(l6 l6Var, Context context) {
        super(context);
        this.f889a = 2;
        this.f891c = l6Var;
        this.f890b = new Path();
    }
}
