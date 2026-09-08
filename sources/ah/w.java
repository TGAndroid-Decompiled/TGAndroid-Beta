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
import di.f4;
import di.n6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.wl;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.ca;
import org.telegram.ui.Components.fk0;
import org.telegram.ui.Components.gd;
import org.telegram.ui.Components.gd0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.lp;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.xy;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.ac;
import org.telegram.ui.au0;
import org.telegram.ui.d51;
import org.telegram.ui.d80;
import org.telegram.ui.f31;
import org.telegram.ui.g31;
import org.telegram.ui.i4;
import org.telegram.ui.j71;
import org.telegram.ui.k51;
import org.telegram.ui.l20;
import org.telegram.ui.m61;
import org.telegram.ui.n61;
import org.telegram.ui.o5;
import org.telegram.ui.o61;
import org.telegram.ui.rl0;
import org.telegram.ui.s61;
import org.telegram.ui.st;
import org.telegram.ui.wd1;
import w7.x5;
public final class w extends FrameLayout {
    public final int f723a;
    public Object f724b;
    public Object f725c;

    public w(Object obj, Context context, int i10) {
        super(context);
        this.f723a = i10;
        this.f725c = obj;
    }

    public void b(String str, boolean z10) {
        boolean z11;
        p6 p6Var = (p6) this.f725c;
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        p6Var.q(str, z11, true);
    }

    public void c(String str, boolean z10) {
        boolean z11;
        p6 p6Var = (p6) this.f724b;
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        p6Var.q(str, z11, true);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        f6 f6Var;
        Paint paint;
        boolean a12;
        int k10;
        j5[] j5VarArr;
        float f7;
        char c10;
        float f10;
        org.telegram.ui.Cells.z zVar;
        float f11;
        switch (this.f723a) {
            case 5:
                yf.z zVar2 = (yf.z) this.f725c;
                zVar2.b(j6.l1(0.65f, j6.v0(j6.f20690d6, (f6) this.f724b)));
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
            default:
                super.dispatchDraw(canvas);
                return;
            case 7:
                super.dispatchDraw(canvas);
                Paint paint2 = (Paint) this.f724b;
                int i10 = j6.f20634a7;
                f6Var = ((n2) ((o5) this.f725c).d).resourceProvider;
                paint2.setColor(j6.v0(i10, f6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint2);
                return;
            case 8:
                RectF rectF = (RectF) this.f724b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Cells.z0 z0Var = (org.telegram.ui.Cells.z0) this.f725c;
                int measuredWidth = z0Var.getMeasuredWidth();
                int i11 = z0Var.d;
                float x10 = z0Var.getX();
                float f12 = z0Var.f23617c;
                f6 f6Var2 = z0Var.f23616b;
                if (f6Var2 != null) {
                    f6Var2.l(x10, f12, measuredWidth, i11);
                } else {
                    j6.q(x10, f12, measuredWidth, i11);
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
                    paint = j6.S0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, dp, dp2, paint);
                if (f6Var2 != null) {
                    a12 = f6Var2.o0();
                } else {
                    a12 = j6.a1();
                }
                if (a12) {
                    float dp3 = AndroidUtilities.dp(18.0f);
                    float dp4 = AndroidUtilities.dp(18.0f);
                    if (f6Var2 != null) {
                        paint3 = f6Var2.G("paintChatActionBackgroundDarken");
                    }
                    if (paint3 == null) {
                        paint3 = j6.S0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF, dp3, dp4, paint3);
                }
                super.dispatchDraw(canvas);
                return;
            case 9:
                super.dispatchDraw(canvas);
                Paint paint4 = (Paint) this.f724b;
                paint4.setColor(j6.v0(j6.f20634a7, ((ac) this.f725c).f34406f.f35088e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint4);
                return;
            case 10:
                float dp5 = AndroidUtilities.dp(20.0f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.f724b;
                path.rewind();
                path.addRoundRect(rectF2, dp5, dp5, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF2, 255, 31);
                super.dispatchDraw(canvas);
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), AndroidUtilities.dp(6.0f) + getPaddingTop());
                l20 l20Var = (l20) this.f725c;
                l20Var.b(canvas, rectF2, 1, 1.0f);
                rectF2.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                l20Var.b(canvas, rectF2, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                return;
            case 11:
                super.dispatchDraw(canvas);
                Paint paint5 = (Paint) this.f724b;
                paint5.setColor(((lp) this.f725c).getThemedColor(j6.f20691d7));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint5);
                return;
            case 12:
                xy xyVar = (xy) this.f725c;
                if (!xyVar.G.f28015u0 && xyVar.f32807w > 0.0f) {
                    if (((Paint) this.f724b) == null) {
                        Paint paint6 = new Paint();
                        this.f724b = paint6;
                        paint6.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f724b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f724b).setAlpha((int) (xyVar.f32807w * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f724b);
                    canvas.restore();
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 13:
                p6 p6Var = (p6) this.f724b;
                int dp6 = AndroidUtilities.dp(29.0f);
                int dp7 = AndroidUtilities.dp(18.83f);
                p6 p6Var2 = (p6) this.f725c;
                p6Var.setBounds(getPaddingLeft(), r3 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r3);
                p6Var.draw(canvas);
                p6Var2.setBounds(getPaddingLeft(), r2 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r2);
                p6Var2.draw(canvas);
                return;
            case 15:
                Paint paint7 = (Paint) this.f724b;
                fk0 fk0Var = (fk0) this.f725c;
                int i12 = fk0Var.M0;
                if (i12 != 1 && i12 != 2 && i12 != 4) {
                    k10 = i0.a.d(0.7f, j6.v0(j6.F8, fk0Var.f26129k0), j6.v0(j6.f20761h5, fk0Var.f26129k0));
                } else {
                    k10 = i0.a.k(-1, 30);
                }
                paint7.setColor(k10);
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - AndroidUtilities.dpf2(6.0f)) / 2.0f;
                float g10 = fk0Var.g();
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
                ProfileActivity profileActivity = (ProfileActivity) this.f725c;
                j5[] j5VarArr2 = profileActivity.f34001r;
                if (profileActivity.W4 != null) {
                    canvas.save();
                    canvas.translate(j5VarArr2[0].getX(), j5VarArr2[0].getY());
                    f7 = 0.0f;
                    j5VarArr = j5VarArr2;
                    c10 = 2;
                    f10 = 2.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.W4.getMeasuredWidth(), profileActivity.W4.getMeasuredHeight(), (int) ((1.0f - profileActivity.S1) * 255.0f), 31);
                    profileActivity.W4.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    j5VarArr = j5VarArr2;
                    f7 = 0.0f;
                    c10 = 2;
                    f10 = 2.0f;
                }
                if (profileActivity.p5 && profileActivity.Y5 != f7 && profileActivity.f33980n5 != 1.0f) {
                    float measuredHeight2 = (j5VarArr[1].getMeasuredHeight() / f10) + j5VarArr[1].getY();
                    float dp8 = AndroidUtilities.dp(22.0f);
                    float x11 = ((j5VarArr[1].getX() + (AndroidUtilities.dp(28.0f) - profileActivity.f33987o5)) - dp8) - profileActivity.Z3();
                    profileActivity.f34007r5.setImageCoords(x11, measuredHeight2 - (dp8 / f10), dp8, dp8);
                    profileActivity.f34007r5.setAlpha(profileActivity.Y5);
                    canvas.save();
                    float f13 = profileActivity.Y5;
                    canvas.scale(f13, f13, profileActivity.f34007r5.getCenterX(), profileActivity.f34007r5.getCenterY());
                    profileActivity.f34007r5.draw(canvas);
                    canvas.restore();
                    if (profileActivity.f33980n5 == f7) {
                        if (((gd) this.f724b) == null) {
                            gd gdVar = new gd(this);
                            this.f724b = gdVar;
                            gdVar.h = new rl0(this, 29);
                        }
                        float dp9 = (1.0f - profileActivity.f33980n5) * AndroidUtilities.dp(28.0f);
                        float textWidth = j5VarArr[c10].getTextWidth();
                        if (profileActivity.T != null) {
                            f11 = (AndroidUtilities.dp(24.0f) + textWidth + AndroidUtilities.dp(4.0f)) * profileActivity.T.getVisibilityFactor();
                        } else {
                            f11 = 0.0f;
                        }
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        rectF4.set(x11 - AndroidUtilities.dp(4.0f), measuredHeight2 - AndroidUtilities.dp(14.0f), x11 + Math.max(textWidth, f11) + dp9 + AndroidUtilities.dp(4.0f), measuredHeight2 + AndroidUtilities.dp(14.0f));
                        gd gdVar2 = (gd) this.f724b;
                        gdVar2.f26380i = false;
                        gdVar2.f26376c = 0;
                        gdVar2.a(rectF4);
                        gd gdVar3 = (gd) this.f724b;
                        gdVar3.f26385n = true;
                        int k11 = i0.a.k(-1, 50);
                        gdVar3.f26379g.setColor(0);
                        org.telegram.ui.Cells.z zVar3 = gdVar3.f26377e;
                        if (zVar3 != null) {
                            j6.B1(zVar3, k11, true);
                        }
                        gd gdVar4 = (gd) this.f724b;
                        gdVar4.c(canvas, gdVar4.f26379g);
                        org.telegram.ui.Cells.z zVar4 = gdVar4.f26377e;
                        if (zVar4 != null) {
                            zVar4.draw(canvas);
                            return;
                        }
                        return;
                    }
                    gd gdVar5 = (gd) this.f724b;
                    if (gdVar5 != null && (zVar = gdVar5.f26377e) != null) {
                        zVar.setState(StateSet.NOTHING);
                        zVar.jumpToCurrentState();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                Rect rect = (Rect) this.f724b;
                f31 f31Var = (f31) this.f725c;
                if (f31Var.R) {
                    f31Var.f36281f.setBounds(-rect.left, -rect.top, getWidth() + rect.right, getHeight() + rect.bottom);
                    f31Var.f36281f.draw(canvas);
                } else {
                    RectF rectF5 = AndroidUtilities.rectTmp;
                    rectF5.set(0.0f, 0.0f, AndroidUtilities.dp(14.0f) + getWidth(), getHeight());
                    canvas.drawRoundRect(rectF5, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), f31Var.f36277a);
                }
                super.dispatchDraw(canvas);
                return;
            case 26:
                ImageReceiver imageReceiver = (ImageReceiver) this.f724b;
                imageReceiver.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                imageReceiver.draw(canvas);
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.f723a) {
            case 1:
                if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
                    u0 u0Var = (u0) this.f725c;
                    if (!u0Var.f705k) {
                        return true;
                    }
                    u0Var.d();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public void dispatchSetPressed(boolean z10) {
        switch (this.f723a) {
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
        int dp;
        switch (this.f723a) {
            case 5:
                super.dispatchTouchEvent(motionEvent);
                return true;
            case 6:
                i4 i4Var = (i4) this.f725c;
                ca o9 = i4Var.P0.o(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.f724b;
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
            case 16:
                int action = motionEvent.getAction();
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.f725c;
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
                if (!h1Var.F.isInProgress() && ((GestureDetector) h1Var.G.f15098b).onTouchEvent(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (action == 1 || action == 3) {
                    h1Var.H = false;
                    h1Var.I = false;
                    o1.k kVar = h1Var.S;
                    if (!kVar.f16845f) {
                        float f7 = h1Var.Q;
                        kVar.f16842b = f7;
                        kVar.f16843c = true;
                        o1.l lVar = kVar.f16852u;
                        int i10 = h1Var.M;
                        float f10 = (i10 / 2.0f) + f7;
                        int i11 = AndroidUtilities.displaySize.x;
                        if (f10 >= i11 / 2.0f) {
                            dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        lVar.f16859i = dp;
                        h1Var.S.f();
                    }
                    o1.k kVar2 = h1Var.T;
                    if (!kVar2.f16845f) {
                        float f11 = h1Var.R;
                        kVar2.f16842b = f11;
                        kVar2.f16843c = true;
                        kVar2.f16852u.f16859i = w7.p.a(f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - h1Var.N) - AndroidUtilities.dp(16.0f));
                        h1Var.T.f();
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
        switch (this.f723a) {
            case 2:
                Path path = (Path) this.f724b;
                n6 n6Var = (n6) this.f725c;
                if (n6Var.h != null && (((z10 = n6Var.f7714f) && view == n6Var.d) || (!z10 && view == n6Var.f7712c))) {
                    if (z10) {
                        f7 = n6Var.f7713e;
                    } else {
                        f7 = 1.0f - n6Var.f7713e;
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
            case 18:
                if (view instanceof gd0) {
                    return false;
                }
                return super.drawChild(canvas, view, j3);
            case 23:
                if (view != ((SecretMediaViewer) this.f724b).f34134w && super.drawChild(canvas, view, j3)) {
                    return true;
                }
                return false;
            case 24:
                Path path2 = (Path) this.f724b;
                k51 k51Var = (k51) this.f725c;
                RectF rectF = k51Var.R;
                if (view != k51Var.N && view != k51Var.f37958x) {
                    if (view == k51Var.P) {
                        canvas.save();
                        path2.rewind();
                        path2.addCircle(rectF.centerX() + k51Var.N.getX(), rectF.centerY() + k51Var.N.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                        canvas.clipPath(path2);
                        canvas.clipRect(0.0f, AndroidUtilities.lerp(k51Var.T, 0.0f, k51Var.f37956s), getWidth(), AndroidUtilities.lerp(k51Var.U, getHeight(), k51Var.f37956s));
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
                canvas.clipRect(0.0f, AndroidUtilities.lerp(k51Var.T, 0.0f, k51Var.f37956s), getWidth(), AndroidUtilities.lerp(k51Var.U, getHeight(), k51Var.f37956s));
                boolean drawChild3 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild3;
            case 25:
                if (view == ((j71) this.f725c).f37673h0 && y0.f732b && y0.f735f) {
                    for (int i10 = 0; i10 < ((j71) this.f725c).f37673h0.getChildCount(); i10++) {
                        View childAt = ((j71) this.f725c).f37673h0.getChildAt(i10);
                        if (childAt instanceof s61) {
                            s61 s61Var = (s61) childAt;
                            if (s61Var.getAnimatedScale() == 1.0f) {
                                ((Rect) this.f724b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                canvas.save();
                                canvas.clipRect((Rect) this.f724b);
                                super.drawChild(canvas, view, j3);
                                canvas.restore();
                            } else if (s61Var.getAnimatedScale() > 0.0f) {
                                ((Rect) this.f724b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                Rect rect = (Rect) this.f724b;
                                rect.set((int) (rect.centerX() - (s61Var.getAnimatedScale() * (((Rect) this.f724b).width() / 2.0f))), (int) (((Rect) this.f724b).centerY() - (s61Var.getAnimatedScale() * (((Rect) this.f724b).height() / 2.0f))), (int) ((s61Var.getAnimatedScale() * (((Rect) this.f724b).width() / 2.0f)) + ((Rect) this.f724b).centerX()), (int) ((s61Var.getAnimatedScale() * (((Rect) this.f724b).height() / 2.0f)) + ((Rect) this.f724b).centerY()));
                                canvas.save();
                                canvas.clipRect((Rect) this.f724b);
                                canvas.scale(s61Var.getAnimatedScale(), s61Var.getAnimatedScale(), ((Rect) this.f724b).centerX(), ((Rect) this.f724b).centerY());
                                super.drawChild(canvas, view, j3);
                                canvas.restore();
                            }
                        } else if ((childAt instanceof TextView) || (childAt instanceof n61) || (childAt instanceof m61) || (childAt instanceof o61)) {
                            ((Rect) this.f724b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.f724b);
                            super.drawChild(canvas, view, j3);
                            canvas.restore();
                        }
                    }
                    return false;
                }
                return super.drawChild(canvas, view, j3);
            case 29:
                Path path3 = (Path) this.f724b;
                rg.n0 n0Var = (rg.n0) this.f725c;
                if (n0Var.h != null && (((z11 = n0Var.f45354f) && view == n0Var.d) || (!z11 && view == n0Var.f45352c))) {
                    if (z11) {
                        f10 = n0Var.f45353e;
                    } else {
                        f10 = 1.0f - n0Var.f45353e;
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
    public boolean fitSystemWindows(Rect rect) {
        switch (this.f723a) {
            case 1:
                u0 u0Var = (u0) this.f725c;
                float f7 = u0Var.f715u;
                float f10 = rect.bottom;
                if (f7 != f10 && u0Var.v) {
                    u0Var.f715u = f10;
                    w wVar = u0Var.f699c;
                    t0 t0Var = u0Var.f697a;
                    if (!u0Var.f711q) {
                        float f11 = u0Var.f714t;
                        int dp = AndroidUtilities.dp(32.0f);
                        int i10 = u0Var.f718y;
                        if (i10 == 1 || i10 == 2) {
                            dp = AndroidUtilities.dp(24.0f);
                        }
                        float f12 = dp;
                        if (t0Var.getMeasuredHeight() + f11 > (wVar.getMeasuredHeight() - u0Var.f715u) - f12) {
                            f11 = ((wVar.getMeasuredHeight() - u0Var.f715u) - t0Var.getMeasuredHeight()) - f12;
                        }
                        if (f11 < 0.0f) {
                            f11 = 0.0f;
                        }
                        t0Var.animate().translationY(f11).setDuration(250L).setUpdateListener(new k0(u0Var, 1)).setInterpolator(pr.f29493f).start();
                    }
                }
                return super.fitSystemWindows(rect);
            default:
                return super.fitSystemWindows(rect);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f723a) {
            case 4:
                super.invalidate();
                ((ng.i) this.f725c).invalidate();
                return;
            case 28:
                super.invalidate();
                org.telegram.ui.ActionBar.q0 q0Var = ((wd1) this.f725c).f41994t0;
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
        switch (this.f723a) {
            case 0:
                super.onAttachedToWindow();
                ((v) this.f724b).c();
                return;
            case 1:
                super.onAttachedToWindow();
                qc.a(this, (n0) this.f724b);
                return;
            case 18:
                super.onAttachedToWindow();
                st stVar = (st) this.f725c;
                stVar.A.onAttachedToWindow();
                stVar.B.onAttachedToWindow();
                return;
            case 21:
                super.onAttachedToWindow();
                ((ProfileActivity) this.f725c).f34007r5.onAttachedToWindow();
                return;
            case 23:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.f724b).h.onAttachedToWindow();
                return;
            case 26:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f724b).onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.f723a) {
            case 16:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.f725c;
                AndroidUtilities.setPreferredMaxRefreshRate(h1Var.f31546b, h1Var.d, h1Var.f31547c);
                h1Var.i(false);
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f723a) {
            case 0:
                super.onDetachedFromWindow();
                ((v) this.f724b).d();
                return;
            case 1:
                super.onDetachedFromWindow();
                qc.h(this);
                return;
            case 18:
                super.onDetachedFromWindow();
                st stVar = (st) this.f725c;
                stVar.A.onDetachedFromWindow();
                stVar.B.onDetachedFromWindow();
                return;
            case 21:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.f725c).f34007r5.onDetachedFromWindow();
                return;
            case 23:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.f724b).h.onDetachedFromWindow();
                return;
            case 26:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f724b).onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: ah.w.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        gd gdVar;
        switch (this.f723a) {
            case 21:
                if ((((ProfileActivity) this.f725c).f33980n5 == 0.0f && (gdVar = (gd) this.f724b) != null && gdVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f723a) {
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = (i13 - i11) / 4;
                int i15 = i14 * 3;
                int y3 = wl.y(275.0f, i15, 2);
                d80 d80Var = (d80) this.f725c;
                FrameLayout frameLayout = d80Var.f35744r;
                int i16 = 0;
                frameLayout.layout(0, y3, frameLayout.getMeasuredWidth(), d80Var.f35744r.getMeasuredHeight() + y3);
                int dp = AndroidUtilities.dp(139.0f) + AndroidUtilities.dp(150.0f) + y3;
                int measuredWidth = (getMeasuredWidth() - d80Var.f35741e.getMeasuredWidth()) / 2;
                sa saVar = d80Var.f35741e;
                saVar.layout(measuredWidth, dp, saVar.getMeasuredWidth() + measuredWidth, d80Var.f35741e.getMeasuredHeight() + dp);
                z4.g gVar = d80Var.d;
                gVar.layout(0, 0, gVar.getMeasuredWidth(), d80Var.d.getMeasuredHeight());
                int measuredHeight = ((i14 - d80Var.f35743n.getMeasuredHeight()) / 2) + i15;
                int measuredWidth2 = (getMeasuredWidth() - d80Var.f35743n.getMeasuredWidth()) / 2;
                ci.n nVar = d80Var.f35743n;
                nVar.layout(measuredWidth2, measuredHeight, nVar.getMeasuredWidth() + measuredWidth2, d80Var.f35743n.getMeasuredHeight() + measuredHeight);
                int dp2 = measuredHeight - AndroidUtilities.dp(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - d80Var.f35742f.getMeasuredWidth()) / 2;
                TextView textView = d80Var.f35742f;
                textView.layout(measuredWidth3, dp2 - textView.getMeasuredHeight(), d80Var.f35742f.getMeasuredWidth() + measuredWidth3, dp2);
                FrameLayout frameLayout2 = (FrameLayout) this.f724b;
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
                int dp4 = AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(150.0f) + wl.y(275.0f, ((i13 - i11) / 4) * 3, 2);
                int dp5 = AndroidUtilities.dp(18.0f);
                TextView textView2 = (TextView) this.f724b;
                textView2.layout(dp5, dp4, textView2.getMeasuredWidth() + dp5, textView2.getMeasuredHeight() + dp4);
                int dp6 = AndroidUtilities.dp(18.0f) + dp4 + ((int) textView2.getTextSize());
                int dp7 = AndroidUtilities.dp(16.0f);
                TextView textView3 = (TextView) this.f725c;
                textView3.layout(dp7, dp6, textView3.getMeasuredWidth() + dp7, textView3.getMeasuredHeight() + dp6);
                return;
            case 21:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.f725c).V4();
                return;
            case 22:
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f725c;
                if (secretMediaViewer.f34113n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f34113n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight;
                    d51 d51Var = secretMediaViewer.f34113n;
                    d51Var.layout(d51Var.getLeft(), currentActionBarHeight, secretMediaViewer.f34113n.getRight(), secretMediaViewer.f34113n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.f34122r != null && secretMediaViewer.f34113n != null) {
                    int measuredHeight2 = (secretMediaViewer.f34113n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f34113n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight)) - AndroidUtilities.dp(10.0f);
                    f4 f4Var = secretMediaViewer.f34122r;
                    f4Var.layout(f4Var.getLeft(), measuredHeight2, secretMediaViewer.f34122r.getRight(), secretMediaViewer.f34122r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.f34085a0 != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                    au0 au0Var = secretMediaViewer.f34085a0;
                    au0Var.layout(au0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.f34085a0.getRight(), secretMediaViewer.f34085a0.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f34098f;
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
        switch (this.f723a) {
            case 3:
                ViewGroup viewGroup = (ViewGroup) this.f724b;
                hg.e eVar = (hg.e) this.f725c;
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
                if (!eVar.E && !eVar.f11049w) {
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
                super.onMeasure(i10, wl.C(8.0f, ((LinearLayout) this.f724b).getMeasuredHeight(), 1073741824));
                return;
            case 11:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                return;
            case 13:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
                setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                return;
            case 22:
                f31 f31Var = (f31) this.f725c;
                View view = f31Var.H;
                View view2 = f31Var.I;
                LinearLayout linearLayout = f31Var.v;
                TextView textView = f31Var.f36284s;
                ll0 ll0Var = f31Var.f36287y;
                boolean z10 = f31Var.S.P;
                int dp3 = AndroidUtilities.dp(12.0f);
                if (z10) {
                    ll0Var.setLayoutParams(x5.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
                    ll0Var.setPadding(dp3, 0, dp3, 0);
                    if (linearLayout != null) {
                        textView.setLayoutParams(x5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(x5.d(-1, 48.0f, 8388691, 16.0f, 162.0f, 16.0f, 16.0f));
                    } else {
                        textView.setLayoutParams(x5.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
                    }
                } else {
                    ll0Var.setPadding(dp3, dp3 / 2, dp3, dp3);
                    if (linearLayout != null) {
                        ll0Var.setLayoutParams(x5.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 136.0f));
                        textView.setLayoutParams(x5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(x5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                    } else {
                        ll0Var.setLayoutParams(x5.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 80.0f));
                        textView.setLayoutParams(x5.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
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
                    view2.setLayoutParams(x5.d(-1, AndroidUtilities.dp(2.0f), 80, 0.0f, 0.0f, 0.0f, i12));
                    view.setVisibility(0);
                    view.setLayoutParams(x5.d(-1, AndroidUtilities.dp(2.0f), 48, 0.0f, 44.0f, 0.0f, 0.0f));
                }
                if (f31Var.R != z10) {
                    g31 g31Var = f31Var.d;
                    if (z10) {
                        g31Var.getParentActivity();
                        sVar = new s4.c0(0, false);
                    } else {
                        g31Var.getParentActivity();
                        sVar = new s4.s(3, false);
                    }
                    f31Var.G = sVar;
                    ll0Var.setLayoutManager(sVar);
                    ll0Var.requestLayout();
                    int i14 = f31Var.L;
                    if (i14 != -1) {
                        f31Var.b(i14);
                    }
                    f31Var.R = z10;
                }
                super.onMeasure(i10, i11);
                return;
            case 23:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f725c;
                au0 au0Var = secretMediaViewer.f34085a0;
                if (au0Var != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                    int currentActionBarHeight = (measuredHeight2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                    if (secretMediaViewer.U.getVisibility() != 0) {
                        measuredHeight = 0;
                    } else {
                        measuredHeight = secretMediaViewer.U.getMeasuredHeight();
                    }
                    au0Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(currentActionBarHeight - measuredHeight, 1073741824));
                }
                View view3 = secretMediaViewer.f34098f;
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
        switch (this.f723a) {
            case 5:
                super.onSizeChanged(i10, i11, i12, i13);
                yf.z zVar = (yf.z) this.f725c;
                zVar.setBounds(0, 0, i10, i11);
                zVar.c(0, AndroidUtilities.dp(24.0f) + getPaddingBottom());
                return;
            case 16:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.f724b;
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
        throw new UnsupportedOperationException("Method not decompiled: ah.w.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setBackgroundColor(int i10) {
        switch (this.f723a) {
            case 14:
                ((Paint) this.f724b).setColor(i10);
                return;
            default:
                super.setBackgroundColor(i10);
                return;
        }
    }

    @Override
    public void setTranslationX(float f7) {
        switch (this.f723a) {
            case 4:
                super.setTranslationX(f7);
                ((ng.i) this.f725c).invalidate();
                return;
            default:
                super.setTranslationX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f723a) {
            case 4:
                super.setTranslationY(f7);
                ((ng.i) this.f725c).invalidate();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f723a) {
            case 13:
                if (((p6) this.f724b) != drawable && ((p6) this.f725c) != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 22:
                if (drawable != ((f31) this.f725c).f36281f && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public w(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f723a = i10;
        this.f725c = obj;
        this.f724b = obj2;
    }

    public w(Context context, int i10, f6 f6Var) {
        super(context);
        this.f723a = i10;
        switch (i10) {
            case 13:
                super(context);
                p6 p6Var = new p6(true, true, true, false);
                this.f724b = p6Var;
                pr prVar = pr.h;
                p6Var.k(0.3f, 430L, prVar);
                p6Var.u(AndroidUtilities.bold());
                p6Var.r(j6.v0(j6.A8, f6Var));
                p6Var.t(AndroidUtilities.dp(18.0f));
                p6Var.n(!LocaleController.isRTL);
                p6Var.setCallback(this);
                p6Var.G = AndroidUtilities.displaySize.x;
                p6 p6Var2 = new p6(true, true, true, false);
                this.f725c = p6Var2;
                p6Var2.k(0.3f, 430L, prVar);
                p6Var2.r(j6.v0(j6.B8, f6Var));
                p6Var2.t(AndroidUtilities.dp(14.0f));
                p6Var2.n(true ^ LocaleController.isRTL);
                p6Var2.setCallback(this);
                p6Var2.G = AndroidUtilities.displaySize.x;
                return;
            default:
                this.f725c = new yf.z(8);
                this.f724b = f6Var;
                return;
        }
    }

    private final void a(boolean z10) {
    }

    public w(org.telegram.ui.Cells.z0 z0Var, Context context) {
        super(context);
        this.f723a = 8;
        this.f725c = z0Var;
        this.f724b = new RectF();
    }

    public w(u0 u0Var, Context context) {
        super(context);
        this.f723a = 1;
        this.f725c = u0Var;
        this.f724b = new n0(this, 0);
    }

    public w(k51 k51Var, Context context) {
        super(context);
        this.f723a = 24;
        this.f725c = k51Var;
        this.f724b = new Path();
    }

    public w(ac acVar, Context context) {
        super(context);
        this.f723a = 9;
        this.f725c = acVar;
        this.f724b = new Paint(1);
    }

    public w(b0 b0Var, Context context) {
        super(context);
        this.f723a = 0;
        this.f725c = b0Var;
        this.f724b = new v(this, this);
    }

    public w(o5 o5Var, Activity activity) {
        super(activity);
        this.f723a = 7;
        this.f725c = o5Var;
        this.f724b = new Paint(1);
    }

    public w(org.telegram.ui.Components.voip.h1 h1Var, Context context) {
        super(context);
        this.f723a = 16;
        this.f725c = h1Var;
        this.f724b = new Path();
    }

    public w(sd0 sd0Var, Context context) {
        super(context);
        this.f723a = 14;
        this.f725c = sd0Var;
        this.f724b = new Paint();
    }

    public w(Context context, TextView textView, TextView textView2) {
        super(context);
        this.f723a = 20;
        this.f724b = textView;
        this.f725c = textView2;
    }

    public w(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f723a = 23;
        this.f725c = secretMediaViewer;
        this.f724b = secretMediaViewer;
        setWillNotDraw(false);
    }

    public w(j71 j71Var, Context context) {
        super(context);
        this.f723a = 25;
        this.f725c = j71Var;
        this.f724b = new Rect();
    }

    public w(f31 f31Var, Activity activity, g31 g31Var) {
        super(activity);
        this.f723a = 22;
        this.f725c = f31Var;
        Rect rect = new Rect();
        this.f724b = rect;
        f31Var.f36277a.setColor(g31Var.getThemedColor(j6.f20690d6));
        Drawable drawable = f31Var.f36281f;
        drawable.setCallback(this);
        drawable.getPadding(rect);
    }

    public w(lp lpVar, Context context) {
        super(context);
        this.f723a = 11;
        this.f725c = lpVar;
        this.f724b = new Paint();
    }

    public w(st stVar, Activity activity) {
        super(activity);
        this.f723a = 18;
        this.f725c = stVar;
        this.f724b = stVar;
        setWillNotDraw(false);
    }

    public w(wd1 wd1Var, Context context, int i10) {
        super(context);
        this.f723a = i10;
        switch (i10) {
            case 28:
                this.f725c = wd1Var;
                super(context);
                this.f724b = new int[2];
                return;
            default:
                this.f725c = wd1Var;
                this.f724b = new Paint();
                return;
        }
    }

    public w(rg.n0 n0Var, Context context) {
        super(context);
        this.f723a = 29;
        this.f725c = n0Var;
        this.f724b = new Path();
    }

    public w(fk0 fk0Var, Context context) {
        super(context);
        this.f723a = 15;
        this.f725c = fk0Var;
        this.f724b = new Paint(1);
    }

    public w(Context context, int i10) {
        super(context);
        this.f723a = i10;
        switch (i10) {
            case 26:
                super(context);
                return;
            default:
                this.f724b = new Path();
                this.f725c = new l20();
                return;
        }
    }

    public w(n6 n6Var, Context context) {
        super(context);
        this.f723a = 2;
        this.f725c = n6Var;
        this.f724b = new Path();
    }
}
