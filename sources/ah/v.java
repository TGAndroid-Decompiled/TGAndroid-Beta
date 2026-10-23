package ah;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
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
import ei.c6;
import ei.x3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.nk;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.j5;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.z9;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.fd;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.p6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.wp;
import org.telegram.ui.Components.zd0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.Wallet.a5;
import org.telegram.ui.Wallet.o5;
import org.telegram.ui.a51;
import org.telegram.ui.ac;
import org.telegram.ui.b51;
import org.telegram.ui.c51;
import org.telegram.ui.et;
import org.telegram.ui.g51;
import org.telegram.ui.ht0;
import org.telegram.ui.j70;
import org.telegram.ui.kc1;
import org.telegram.ui.l4;
import org.telegram.ui.q31;
import org.telegram.ui.qy0;
import org.telegram.ui.s10;
import org.telegram.ui.t5;
import org.telegram.ui.x31;
import org.telegram.ui.x51;
import w7.z5;
public final class v extends FrameLayout {
    public final int f893a;
    public Object f894b;
    public Object f895c;

    public v(Object obj, Context context, int i10) {
        super(context);
        this.f893a = i10;
        this.f895c = obj;
    }

    public void b(Canvas canvas) {
        me0 me0Var = (me0) this.f895c;
        Drawable drawable = me0Var.f28495a;
        if (drawable != null) {
            if (!(drawable instanceof wc0) && !(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable)) {
                float max = Math.max(getMeasuredWidth() / me0Var.f28495a.getIntrinsicWidth(), (getMeasuredHeight() + me0Var.G) / me0Var.f28495a.getIntrinsicHeight());
                int ceil = (int) Math.ceil(me0Var.f28495a.getIntrinsicWidth() * max);
                int ceil2 = (int) Math.ceil(me0Var.f28495a.getIntrinsicHeight() * max);
                int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                int measuredHeight = ((getMeasuredHeight() - ceil2) + me0Var.G) / 2;
                me0Var.f28495a.setBounds(measuredWidth, measuredHeight, ceil + measuredWidth, ceil2 + measuredHeight);
                me0Var.f28495a.draw(canvas);
            } else {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                me0Var.f28495a.draw(canvas);
            }
        } else {
            super.onDraw(canvas);
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (Paint) this.f894b);
    }

    public void c(int i10, CharSequence charSequence, boolean z10) {
        ImageView imageView = (ImageView) this.f894b;
        if (z10) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
        ((TextView) this.f895c).setText(charSequence);
        requestLayout();
    }

    public void d(String str, boolean z10) {
        boolean z11;
        p6 p6Var = (p6) this.f895c;
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        p6Var.t(str, z11, true);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        d6 d6Var;
        Paint paint;
        boolean b12;
        int o10;
        j5[] j5VarArr;
        float f7;
        org.telegram.ui.Cells.z zVar;
        float f10;
        switch (this.f893a) {
            case 6:
                zf.y yVar = (zf.y) this.f895c;
                yVar.b(h6.m1(0.65f, h6.w0(h6.f20994d6, (d6) this.f894b)));
                yVar.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 8:
                super.dispatchDraw(canvas);
                Paint paint2 = (Paint) this.f894b;
                int i10 = h6.f20936a7;
                d6Var = ((n2) ((t5) this.f895c).d).resourceProvider;
                paint2.setColor(h6.w0(i10, d6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint2);
                return;
            case 9:
                RectF rectF = (RectF) this.f894b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Cells.z0 z0Var = (org.telegram.ui.Cells.z0) this.f895c;
                int measuredWidth = z0Var.getMeasuredWidth();
                int i11 = z0Var.d;
                float x10 = z0Var.getX();
                float f11 = z0Var.f23866c;
                d6 d6Var2 = z0Var.f23865b;
                if (d6Var2 != null) {
                    d6Var2.d(x10, f11, measuredWidth, i11);
                } else {
                    h6.q(x10, f11, measuredWidth, i11);
                }
                float dp = AndroidUtilities.dp(18.0f);
                float dp2 = AndroidUtilities.dp(18.0f);
                Paint paint3 = null;
                if (d6Var2 != null) {
                    paint = d6Var2.n("paintChatActionBackground");
                } else {
                    paint = null;
                }
                if (paint == null) {
                    paint = h6.T0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, dp, dp2, paint);
                if (d6Var2 != null) {
                    b12 = d6Var2.s();
                } else {
                    b12 = h6.b1();
                }
                if (b12) {
                    float dp3 = AndroidUtilities.dp(18.0f);
                    float dp4 = AndroidUtilities.dp(18.0f);
                    if (d6Var2 != null) {
                        paint3 = d6Var2.n("paintChatActionBackgroundDarken");
                    }
                    if (paint3 == null) {
                        paint3 = h6.T0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF, dp3, dp4, paint3);
                }
                super.dispatchDraw(canvas);
                return;
            case 10:
                super.dispatchDraw(canvas);
                Paint paint4 = (Paint) this.f894b;
                paint4.setColor(h6.w0(h6.f20936a7, ((ac) this.f895c).f35344f.e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint4);
                return;
            case 11:
                float dp5 = AndroidUtilities.dp(20.0f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.f894b;
                path.rewind();
                path.addRoundRect(rectF2, dp5, dp5, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF2, 255, 31);
                super.dispatchDraw(canvas);
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), AndroidUtilities.dp(6.0f) + getPaddingTop());
                s10 s10Var = (s10) this.f895c;
                s10Var.b(canvas, rectF2, 1, 1.0f);
                rectF2.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                s10Var.b(canvas, rectF2, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                return;
            case 12:
                super.dispatchDraw(canvas);
                Paint paint5 = (Paint) this.f894b;
                paint5.setColor(((wp) this.f895c).getThemedColor(h6.f20995d7));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint5);
                return;
            case 13:
                gz gzVar = (gz) this.f895c;
                if (!gzVar.G.f30782u0 && gzVar.f26699w > 0.0f) {
                    if (((Paint) this.f894b) == null) {
                        Paint paint6 = new Paint();
                        this.f894b = paint6;
                        paint6.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f894b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f894b).setAlpha((int) (gzVar.f26699w * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f894b);
                    canvas.restore();
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 14:
                p6 p6Var = (p6) this.f894b;
                int dp6 = AndroidUtilities.dp(29.0f);
                int dp7 = AndroidUtilities.dp(18.83f);
                p6 p6Var2 = (p6) this.f895c;
                p6Var.setBounds(getPaddingLeft(), r3 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r3);
                p6Var.draw(canvas);
                p6Var2.setBounds(getPaddingLeft(), r2 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r2);
                p6Var2.draw(canvas);
                return;
            case 16:
                Paint paint7 = (Paint) this.f894b;
                dl0 dl0Var = (dl0) this.f895c;
                int i12 = dl0Var.M0;
                if (i12 != 1 && i12 != 2 && i12 != 4) {
                    o10 = i0.a.f(0.7f, h6.w0(h6.F8, dl0Var.f25550k0), h6.w0(h6.f21065h5, dl0Var.f25550k0));
                } else {
                    o10 = i0.a.o(-1, 30);
                }
                paint7.setColor(o10);
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - AndroidUtilities.dpf2(6.0f)) / 2.0f;
                float g10 = dl0Var.g();
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
            case 22:
                super.dispatchDraw(canvas);
                ProfileActivity profileActivity = (ProfileActivity) this.f895c;
                j5[] j5VarArr2 = profileActivity.f33703r;
                if (profileActivity.Y4 != null) {
                    canvas.save();
                    canvas.translate(j5VarArr2[0].getX(), j5VarArr2[0].getY());
                    j5VarArr = j5VarArr2;
                    f7 = 0.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.Y4.getMeasuredWidth(), profileActivity.Y4.getMeasuredHeight(), (int) ((1.0f - profileActivity.T1) * 255.0f), 31);
                    profileActivity.Y4.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    j5VarArr = j5VarArr2;
                    f7 = 0.0f;
                }
                if (profileActivity.f33709r5 && profileActivity.f33591a6 != f7 && profileActivity.p5 != 1.0f) {
                    float measuredHeight2 = (j5VarArr[1].getMeasuredHeight() / 2.0f) + j5VarArr[1].getY();
                    float dp8 = AndroidUtilities.dp(22.0f);
                    float x11 = ((j5VarArr[1].getX() + (AndroidUtilities.dp(28.0f) - profileActivity.f33702q5)) - dp8) - profileActivity.Z3();
                    profileActivity.f33724t5.setImageCoords(x11, measuredHeight2 - (dp8 / 2.0f), dp8, dp8);
                    profileActivity.f33724t5.setAlpha(profileActivity.f33591a6);
                    canvas.save();
                    float f12 = profileActivity.f33591a6;
                    canvas.scale(f12, f12, profileActivity.f33724t5.getCenterX(), profileActivity.f33724t5.getCenterY());
                    profileActivity.f33724t5.draw(canvas);
                    canvas.restore();
                    if (profileActivity.p5 == f7) {
                        if (((fd) this.f894b) == null) {
                            fd fdVar = new fd(this);
                            this.f894b = fdVar;
                            fdVar.h = new qy0(this, 0);
                        }
                        float dp9 = (1.0f - profileActivity.p5) * AndroidUtilities.dp(28.0f);
                        float textWidth = j5VarArr[2].getTextWidth();
                        if (profileActivity.T != null) {
                            f10 = (AndroidUtilities.dp(24.0f) + textWidth + AndroidUtilities.dp(4.0f)) * profileActivity.T.getVisibilityFactor();
                        } else {
                            f10 = f7;
                        }
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        rectF4.set(x11 - AndroidUtilities.dp(4.0f), measuredHeight2 - AndroidUtilities.dp(14.0f), x11 + Math.max(textWidth, f10) + dp9 + AndroidUtilities.dp(4.0f), measuredHeight2 + AndroidUtilities.dp(14.0f));
                        fd fdVar2 = (fd) this.f894b;
                        fdVar2.f26202i = false;
                        fdVar2.f26199c = 0;
                        fdVar2.a(rectF4);
                        fd fdVar3 = (fd) this.f894b;
                        fdVar3.f26207n = true;
                        int o11 = i0.a.o(-1, 50);
                        fdVar3.f26201g.setColor(0);
                        org.telegram.ui.Cells.z zVar2 = fdVar3.e;
                        if (zVar2 != null) {
                            h6.C1(zVar2, o11, true);
                        }
                        fd fdVar4 = (fd) this.f894b;
                        fdVar4.c(canvas, fdVar4.f26201g);
                        org.telegram.ui.Cells.z zVar3 = fdVar4.e;
                        if (zVar3 != null) {
                            zVar3.draw(canvas);
                            return;
                        }
                        return;
                    }
                    fd fdVar5 = (fd) this.f894b;
                    if (fdVar5 != null && (zVar = fdVar5.e) != null) {
                        zVar.setState(StateSet.NOTHING);
                        zVar.jumpToCurrentState();
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ImageReceiver imageReceiver = (ImageReceiver) this.f894b;
                imageReceiver.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                imageReceiver.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 29:
                super.dispatchDraw(canvas);
                ((o5) this.f895c).getClass();
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.f893a) {
            case 1:
                if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
                    t0 t0Var = (t0) this.f895c;
                    if (!t0Var.f875k) {
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
        switch (this.f893a) {
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
        switch (this.f893a) {
            case 6:
                super.dispatchTouchEvent(motionEvent);
                return true;
            case 7:
                l4 l4Var = (l4) this.f895c;
                z9 n10 = l4Var.P0.n(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.f894b;
                obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (l4Var.P0.x() && l4Var.P0.n(getContext()).onTouchEvent(obtain)) {
                    return true;
                }
                if (n10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() == 0 && l4Var.P0.x() && (motionEvent.getY() < linearLayout.getTop() || motionEvent.getY() > linearLayout.getBottom())) {
                    if (!l4Var.P0.n(getContext()).onTouchEvent(obtain)) {
                        return true;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            case 17:
                int action = motionEvent.getAction();
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.f895c;
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
                if (!h1Var.F.isInProgress() && ((GestureDetector) h1Var.G.f16009b).onTouchEvent(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (action == 1 || action == 3) {
                    h1Var.H = false;
                    h1Var.I = false;
                    o1.k kVar = h1Var.S;
                    if (!kVar.f17552f) {
                        float f10 = h1Var.Q;
                        kVar.f17550b = f10;
                        kVar.f17551c = true;
                        o1.l lVar = kVar.f17559u;
                        int i10 = h1Var.M;
                        float f11 = (i10 / 2.0f) + f10;
                        int i11 = AndroidUtilities.displaySize.x;
                        if (f11 >= i11 / 2.0f) {
                            dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        lVar.f17565i = dp;
                        h1Var.S.h();
                    }
                    o1.k kVar2 = h1Var.T;
                    if (!kVar2.f17552f) {
                        kVar2.f17550b = h1Var.R;
                        kVar2.f17551c = true;
                        kVar2.f17559u.f17565i = w7.r.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - h1Var.N) - AndroidUtilities.dp(16.0f));
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
        switch (this.f893a) {
            case 3:
                Path path = (Path) this.f894b;
                c6 c6Var = (c6) this.f895c;
                if (c6Var.h != null && (((z10 = c6Var.f8827f) && view == c6Var.d) || (!z10 && view == c6Var.f8826c))) {
                    if (z10) {
                        f7 = c6Var.e;
                    } else {
                        f7 = 1.0f - c6Var.e;
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
            case 19:
                if (view instanceof zd0) {
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            case 23:
                if (view != ((SecretMediaViewer) this.f894b).f33837w && super.drawChild(canvas, view, j10)) {
                    return true;
                }
                return false;
            case 24:
                Path path2 = (Path) this.f894b;
                x31 x31Var = (x31) this.f895c;
                RectF rectF = x31Var.R;
                if (view != x31Var.N && view != x31Var.f43037x) {
                    if (view == x31Var.P) {
                        canvas.save();
                        path2.rewind();
                        path2.addCircle(rectF.centerX() + x31Var.N.getX(), rectF.centerY() + x31Var.N.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                        canvas.clipPath(path2);
                        canvas.clipRect(0.0f, AndroidUtilities.lerp(x31Var.T, 0.0f, x31Var.f43035s), getWidth(), AndroidUtilities.lerp(x31Var.U, getHeight(), x31Var.f43035s));
                        canvas.translate(-x31Var.P.getX(), -x31Var.P.getY());
                        canvas.translate(x31Var.N.getX() + rectF.left, x31Var.N.getY() + rectF.top);
                        canvas.scale(rectF.width() / x31Var.P.getMeasuredWidth(), rectF.height() / x31Var.P.getMeasuredHeight(), x31Var.P.getX(), x31Var.P.getY());
                        boolean drawChild2 = super.drawChild(canvas, view, j10);
                        canvas.restore();
                        return drawChild2;
                    }
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(x31Var.T, 0.0f, x31Var.f43035s), getWidth(), AndroidUtilities.lerp(x31Var.U, getHeight(), x31Var.f43035s));
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild3;
            case 25:
                if (view == ((x51) this.f895c).f43065h0 && x0.f901b && x0.f903f) {
                    for (int i10 = 0; i10 < ((x51) this.f895c).f43065h0.getChildCount(); i10++) {
                        View childAt = ((x51) this.f895c).f43065h0.getChildAt(i10);
                        if (childAt instanceof g51) {
                            g51 g51Var = (g51) childAt;
                            if (g51Var.getAnimatedScale() == 1.0f) {
                                ((Rect) this.f894b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                canvas.save();
                                canvas.clipRect((Rect) this.f894b);
                                super.drawChild(canvas, view, j10);
                                canvas.restore();
                            } else if (g51Var.getAnimatedScale() > 0.0f) {
                                ((Rect) this.f894b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                ((Rect) this.f894b).set((int) (rect.centerX() - (g51Var.getAnimatedScale() * (((Rect) this.f894b).width() / 2.0f))), (int) (((Rect) this.f894b).centerY() - (g51Var.getAnimatedScale() * (((Rect) this.f894b).height() / 2.0f))), (int) ((g51Var.getAnimatedScale() * (((Rect) this.f894b).width() / 2.0f)) + ((Rect) this.f894b).centerX()), (int) ((g51Var.getAnimatedScale() * (((Rect) this.f894b).height() / 2.0f)) + ((Rect) this.f894b).centerY()));
                                canvas.save();
                                canvas.clipRect((Rect) this.f894b);
                                canvas.scale(g51Var.getAnimatedScale(), g51Var.getAnimatedScale(), ((Rect) this.f894b).centerX(), ((Rect) this.f894b).centerY());
                                super.drawChild(canvas, view, j10);
                                canvas.restore();
                            }
                        } else if ((childAt instanceof TextView) || (childAt instanceof b51) || (childAt instanceof a51) || (childAt instanceof c51)) {
                            ((Rect) this.f894b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.f894b);
                            super.drawChild(canvas, view, j10);
                            canvas.restore();
                        }
                    }
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            case 29:
                o5 o5Var = (o5) this.f895c;
                if (view == o5Var.f34665r0 && o5Var.E) {
                    int save = canvas.save();
                    canvas.concat(o5Var.H);
                    boolean drawChild4 = super.drawChild(canvas, view, j10);
                    canvas.restoreToCount(save);
                    return drawChild4;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    public void e(String str, boolean z10) {
        boolean z11;
        p6 p6Var = (p6) this.f894b;
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        p6Var.t(str, z11, true);
    }

    @Override
    public boolean fitSystemWindows(Rect rect) {
        switch (this.f893a) {
            case 1:
                t0 t0Var = (t0) this.f895c;
                float f7 = t0Var.f885u;
                float f10 = rect.bottom;
                if (f7 != f10 && t0Var.v) {
                    t0Var.f885u = f10;
                    v vVar = t0Var.f870c;
                    s0 s0Var = t0Var.f868a;
                    if (!t0Var.f881q) {
                        float f11 = t0Var.f884t;
                        int dp = AndroidUtilities.dp(32.0f);
                        int i10 = t0Var.f888y;
                        if (i10 == 1 || i10 == 2) {
                            dp = AndroidUtilities.dp(24.0f);
                        }
                        float f12 = dp;
                        if (s0Var.getMeasuredHeight() + f11 > (vVar.getMeasuredHeight() - t0Var.f885u) - f12) {
                            f11 = ((vVar.getMeasuredHeight() - t0Var.f885u) - s0Var.getMeasuredHeight()) - f12;
                        }
                        if (f11 < 0.0f) {
                            f11 = 0.0f;
                        }
                        s0Var.animate().translationY(f11).setDuration(250L).setUpdateListener(new j0(t0Var, 1)).setInterpolator(bs.f25025f).start();
                    }
                }
                return super.fitSystemWindows(rect);
            default:
                return super.fitSystemWindows(rect);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f893a) {
            case 5:
                super.invalidate();
                ((ng.i) this.f895c).invalidate();
                return;
            case 28:
                super.invalidate();
                org.telegram.ui.ActionBar.p0 p0Var = ((kc1) this.f895c).f38573t0;
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
        switch (this.f893a) {
            case 0:
                super.onAttachedToWindow();
                ((u) this.f894b).c();
                return;
            case 1:
                super.onAttachedToWindow();
                qc.a(this, (m0) this.f894b);
                return;
            case 19:
                super.onAttachedToWindow();
                et etVar = (et) this.f895c;
                etVar.A.onAttachedToWindow();
                etVar.B.onAttachedToWindow();
                return;
            case 22:
                super.onAttachedToWindow();
                ((ProfileActivity) this.f895c).f33724t5.onAttachedToWindow();
                return;
            case 23:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.f894b).h.onAttachedToWindow();
                return;
            case 26:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f894b).onAttachedToWindow();
                return;
            case 29:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((a5) this.f894b);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.f893a) {
            case 17:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                org.telegram.ui.Components.voip.h1 h1Var = (org.telegram.ui.Components.voip.h1) this.f895c;
                AndroidUtilities.setPreferredMaxRefreshRate(h1Var.f31448b, h1Var.d, h1Var.f31449c);
                h1Var.i(false);
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f893a) {
            case 0:
                super.onDetachedFromWindow();
                ((u) this.f894b).d();
                return;
            case 1:
                super.onDetachedFromWindow();
                qc.h(this);
                return;
            case 19:
                super.onDetachedFromWindow();
                et etVar = (et) this.f895c;
                etVar.A.onDetachedFromWindow();
                etVar.B.onDetachedFromWindow();
                return;
            case 22:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.f895c).f33724t5.onDetachedFromWindow();
                return;
            case 23:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.f894b).h.onDetachedFromWindow();
                return;
            case 26:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f894b).onDetachedFromWindow();
                return;
            case 29:
                getViewTreeObserver().removeOnPreDrawListener((a5) this.f894b);
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
        fd fdVar;
        switch (this.f893a) {
            case 22:
                if ((((ProfileActivity) this.f895c).p5 == 0.0f && (fdVar = (fd) this.f894b) != null && fdVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f893a) {
            case 20:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = (i13 - i11) / 4;
                int i15 = i14 * 3;
                int A = nk.A(275.0f, i15, 2);
                j70 j70Var = (j70) this.f895c;
                FrameLayout frameLayout = j70Var.f38196r;
                int i16 = 0;
                frameLayout.layout(0, A, frameLayout.getMeasuredWidth(), j70Var.f38196r.getMeasuredHeight() + A);
                int dp = AndroidUtilities.dp(139.0f) + AndroidUtilities.dp(150.0f) + A;
                int measuredWidth = (getMeasuredWidth() - j70Var.e.getMeasuredWidth()) / 2;
                sa saVar = j70Var.e;
                saVar.layout(measuredWidth, dp, saVar.getMeasuredWidth() + measuredWidth, j70Var.e.getMeasuredHeight() + dp);
                z4.g gVar = j70Var.d;
                gVar.layout(0, 0, gVar.getMeasuredWidth(), j70Var.d.getMeasuredHeight());
                int measuredHeight = ((i14 - j70Var.f38195n.getMeasuredHeight()) / 2) + i15;
                int measuredWidth2 = (getMeasuredWidth() - j70Var.f38195n.getMeasuredWidth()) / 2;
                di.n nVar = j70Var.f38195n;
                nVar.layout(measuredWidth2, measuredHeight, nVar.getMeasuredWidth() + measuredWidth2, j70Var.f38195n.getMeasuredHeight() + measuredHeight);
                int dp2 = measuredHeight - AndroidUtilities.dp(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - j70Var.f38194f.getMeasuredWidth()) / 2;
                TextView textView = j70Var.f38194f;
                textView.layout(measuredWidth3, dp2 - textView.getMeasuredHeight(), j70Var.f38194f.getMeasuredWidth() + measuredWidth3, dp2);
                FrameLayout frameLayout2 = (FrameLayout) this.f894b;
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
                int dp4 = AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(150.0f) + nk.A(275.0f, ((i13 - i11) / 4) * 3, 2);
                int dp5 = AndroidUtilities.dp(18.0f);
                TextView textView2 = (TextView) this.f894b;
                textView2.layout(dp5, dp4, textView2.getMeasuredWidth() + dp5, textView2.getMeasuredHeight() + dp4);
                int dp6 = AndroidUtilities.dp(18.0f) + dp4 + ((int) textView2.getTextSize());
                int dp7 = AndroidUtilities.dp(16.0f);
                TextView textView3 = (TextView) this.f895c;
                textView3.layout(dp7, dp6, textView3.getMeasuredWidth() + dp7, textView3.getMeasuredHeight() + dp6);
                return;
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.f895c).V4();
                return;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f895c;
                if (secretMediaViewer.f33816n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f33816n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight;
                    q31 q31Var = secretMediaViewer.f33816n;
                    q31Var.layout(q31Var.getLeft(), currentActionBarHeight, secretMediaViewer.f33816n.getRight(), secretMediaViewer.f33816n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.f33825r != null && secretMediaViewer.f33816n != null) {
                    int measuredHeight2 = (secretMediaViewer.f33816n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f33816n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight)) - AndroidUtilities.dp(10.0f);
                    x3 x3Var = secretMediaViewer.f33825r;
                    x3Var.layout(x3Var.getLeft(), measuredHeight2, secretMediaViewer.f33825r.getRight(), secretMediaViewer.f33825r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.f33789a0 != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                    ht0 ht0Var = secretMediaViewer.f33789a0;
                    ht0Var.layout(ht0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.f33789a0.getRight(), secretMediaViewer.f33789a0.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f33801f;
                if (view != null) {
                    int i18 = i13 - i11;
                    view.layout(0, i18, i12 - i10, AndroidUtilities.navigationBarHeight + i18);
                    return;
                }
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        boolean z10;
        int i13;
        float f7;
        boolean z11;
        float f10;
        float f11;
        float f12;
        float f13;
        StaticLayout staticLayout;
        int dp;
        int measuredHeight;
        switch (this.f893a) {
            case 2:
                float f14 = 8.0f;
                int size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(8.0f);
                TextView textView = (TextView) this.f895c;
                CharSequence text = textView.getText();
                if (size > 0 && !TextUtils.isEmpty(text)) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
                    TextPaint textPaint = new TextPaint(textView.getPaint());
                    textPaint.setTextSize(AndroidUtilities.dp(12.0f));
                    float measureText = textPaint.measureText(text, 0, text.length());
                    float f15 = size;
                    if (measureText > f15) {
                        textPaint.setTextSize(AndroidUtilities.dp(11.0f));
                        String[] split = text.toString().split("\\s+");
                        int length = split.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 < length) {
                                if (textPaint.measureText(split[i14]) > f15) {
                                    staticLayout = null;
                                    f12 = f15;
                                    f13 = 12.0f;
                                    i12 = 2;
                                    z10 = true;
                                } else {
                                    i14++;
                                }
                            } else {
                                f12 = f15;
                                f13 = 12.0f;
                                i12 = 2;
                                z10 = true;
                                staticLayout = new StaticLayout(text, textPaint, size, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            }
                        }
                        if (staticLayout != null && staticLayout.getLineCount() <= i12) {
                            i13 = i12;
                            f7 = 11.0f;
                        } else {
                            f7 = Math.max(8.0f, (f12 * f13) / measureText);
                            i13 = z10 ? 1 : 0;
                        }
                    } else {
                        i12 = 2;
                        z10 = true;
                        i13 = 1;
                        f7 = 12.0f;
                    }
                    textView.setTextSize(z10 ? 1 : 0, f7);
                    textView.setMaxLines(i13);
                    if (i13 == z10) {
                        z11 = z10 ? 1 : 0;
                    } else {
                        z11 = false;
                    }
                    textView.setSingleLine(z11);
                    if (i13 == i12) {
                        f10 = 0.85f;
                    } else {
                        f10 = 1.0f;
                    }
                    textView.setLineSpacing(0.0f, f10);
                    if (i13 == i12) {
                        z10 = false;
                    }
                    textView.setIncludeFontPadding(z10);
                    if (i13 == i12) {
                        f11 = 29.0f;
                    } else {
                        f11 = 35.0f;
                    }
                    layoutParams.topMargin = AndroidUtilities.dp(f11);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((ImageView) this.f894b).getLayoutParams();
                    if (i13 == i12) {
                        f14 = 4.0f;
                    }
                    layoutParams2.topMargin = AndroidUtilities.dp(f14);
                }
                super.onMeasure(i10, i11);
                return;
            case 4:
                ViewGroup viewGroup = (ViewGroup) this.f894b;
                hg.e eVar = (hg.e) this.f895c;
                if (eVar.K && eVar.J) {
                    super.onMeasure(i10, i11);
                    return;
                }
                int size2 = View.MeasureSpec.getSize(i11);
                if (size2 == 0) {
                    size2 = viewGroup.getMeasuredHeight();
                }
                if (size2 == 0) {
                    size2 = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                }
                int dp2 = AndroidUtilities.dp(50.0f);
                int i15 = 0;
                if (eVar.v != 0) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(30.0f) + dp2;
                }
                if (!eVar.E && !eVar.f11839w) {
                    dp += dp2;
                }
                int paddingTop = (size2 - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
                if (dp < paddingTop) {
                    i15 = paddingTop - dp;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
                return;
            case 7:
                super.onMeasure(i10, i11);
                super.onMeasure(i10, nk.C(8.0f, ((LinearLayout) this.f894b).getMeasuredHeight(), 1073741824));
                return;
            case 12:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                return;
            case 14:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
                setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                return;
            case 23:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f895c;
                ht0 ht0Var = secretMediaViewer.f33789a0;
                if (ht0Var != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                    int currentActionBarHeight = (measuredHeight2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                    if (secretMediaViewer.U.getVisibility() != 0) {
                        measuredHeight = 0;
                    } else {
                        measuredHeight = secretMediaViewer.U.getMeasuredHeight();
                    }
                    ht0Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(currentActionBarHeight - measuredHeight, 1073741824));
                }
                View view = secretMediaViewer.f33801f;
                if (view != null) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.navigationBarHeight, 1073741824));
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
        switch (this.f893a) {
            case 6:
                super.onSizeChanged(i10, i11, i12, i13);
                zf.y yVar = (zf.y) this.f895c;
                yVar.setBounds(0, 0, i10, i11);
                yVar.c(0, AndroidUtilities.dp(24.0f) + getPaddingBottom());
                return;
            case 15:
                me0 me0Var = (me0) this.f895c;
                gh.b bVar = me0Var.H;
                super.onSizeChanged(i10, i11, i12, i13);
                if (i10 > 0 && i11 > 0) {
                    me0Var.J = Bitmap.createBitmap(54, Math.max(1, Math.round((i11 * 54) / i10)), Bitmap.Config.ARGB_8888);
                    me0Var.K = new Canvas(me0Var.J);
                    bVar.a(me0Var.J);
                    bVar.c(i10, i11);
                    return;
                }
                return;
            case 17:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.f894b;
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
        switch (this.f893a) {
            case 15:
                ((Paint) this.f894b).setColor(i10);
                return;
            default:
                super.setBackgroundColor(i10);
                return;
        }
    }

    @Override
    public void setTranslationX(float f7) {
        switch (this.f893a) {
            case 5:
                super.setTranslationX(f7);
                ((ng.i) this.f895c).invalidate();
                return;
            default:
                super.setTranslationX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f893a) {
            case 5:
                super.setTranslationY(f7);
                ((ng.i) this.f895c).invalidate();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f893a) {
            case 14:
                if (((p6) this.f894b) != drawable && ((p6) this.f895c) != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public v(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f893a = i10;
        this.f895c = obj;
        this.f894b = obj2;
    }

    public v(Context context, int i10, d6 d6Var) {
        super(context);
        this.f893a = i10;
        switch (i10) {
            case 14:
                super(context);
                p6 p6Var = new p6(true, true, true);
                this.f894b = p6Var;
                bs bsVar = bs.h;
                p6Var.n(0.3f, 430L, bsVar);
                p6Var.x(AndroidUtilities.bold());
                p6Var.u(h6.w0(h6.A8, d6Var));
                p6Var.w(AndroidUtilities.dp(18.0f));
                p6Var.q(!LocaleController.isRTL);
                p6Var.setCallback(this);
                p6Var.M = AndroidUtilities.displaySize.x;
                p6 p6Var2 = new p6(true, true, true);
                this.f895c = p6Var2;
                p6Var2.n(0.3f, 430L, bsVar);
                p6Var2.u(h6.w0(h6.B8, d6Var));
                p6Var2.w(AndroidUtilities.dp(14.0f));
                p6Var2.q(true ^ LocaleController.isRTL);
                p6Var2.setCallback(this);
                p6Var2.M = AndroidUtilities.displaySize.x;
                return;
            default:
                this.f895c = new zf.y(8);
                this.f894b = d6Var;
                return;
        }
    }

    public v(org.telegram.ui.Cells.z0 z0Var, Context context) {
        super(context);
        this.f893a = 9;
        this.f895c = z0Var;
        this.f894b = new RectF();
    }

    public v(t0 t0Var, Context context) {
        super(context);
        this.f893a = 1;
        this.f895c = t0Var;
        this.f894b = new m0(this, 0);
    }

    private final void a(boolean z10) {
    }

    public v(x31 x31Var, Context context) {
        super(context);
        this.f893a = 24;
        this.f895c = x31Var;
        this.f894b = new Path();
    }

    public v(ac acVar, Context context) {
        super(context);
        this.f893a = 10;
        this.f895c = acVar;
        this.f894b = new Paint(1);
    }

    public v(a0 a0Var, Context context) {
        super(context);
        this.f893a = 0;
        this.f895c = a0Var;
        this.f894b = new u(this, this);
    }

    public v(t5 t5Var, Activity activity) {
        super(activity);
        this.f893a = 8;
        this.f895c = t5Var;
        this.f894b = new Paint(1);
    }

    public v(org.telegram.ui.Components.voip.h1 h1Var, Context context) {
        super(context);
        this.f893a = 17;
        this.f895c = h1Var;
        this.f894b = new Path();
    }

    public v(me0 me0Var, Context context) {
        super(context);
        this.f893a = 15;
        this.f895c = me0Var;
        this.f894b = new Paint();
    }

    public v(o5 o5Var, Context context) {
        super(context);
        this.f893a = 29;
        this.f895c = o5Var;
        this.f894b = new a5(0, this);
    }

    public v(Context context, TextView textView, TextView textView2) {
        super(context);
        this.f893a = 21;
        this.f894b = textView;
        this.f895c = textView2;
    }

    public v(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f893a = 23;
        this.f895c = secretMediaViewer;
        this.f894b = secretMediaViewer;
        setWillNotDraw(false);
    }

    public v(x51 x51Var, Context context) {
        super(context);
        this.f893a = 25;
        this.f895c = x51Var;
        this.f894b = new Rect();
    }

    public v(wp wpVar, Context context) {
        super(context);
        this.f893a = 12;
        this.f895c = wpVar;
        this.f894b = new Paint();
    }

    public v(et etVar, Activity activity) {
        super(activity);
        this.f893a = 19;
        this.f895c = etVar;
        this.f894b = etVar;
        setWillNotDraw(false);
    }

    public v(kc1 kc1Var, Context context, int i10) {
        super(context);
        this.f893a = i10;
        switch (i10) {
            case 28:
                this.f895c = kc1Var;
                super(context);
                this.f894b = new int[2];
                return;
            default:
                this.f895c = kc1Var;
                this.f894b = new Paint();
                return;
        }
    }

    public v(Context context, int i10) {
        super(context);
        this.f893a = i10;
        switch (i10) {
            case 11:
                super(context);
                this.f894b = new Path();
                this.f895c = new s10();
                return;
            case 26:
                super(context);
                return;
            default:
                ImageView imageView = new ImageView(context);
                this.f894b = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                addView(imageView, z5.d(24, 24.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                this.f895c = textView;
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                textView.setGravity(17);
                addView(textView, z5.d(-1, -2.0f, 49, 4.0f, 35.0f, 4.0f, 0.0f));
                return;
        }
    }

    public v(dl0 dl0Var, Context context) {
        super(context);
        this.f893a = 16;
        this.f895c = dl0Var;
        this.f894b = new Paint(1);
    }

    public v(c6 c6Var, Context context) {
        super(context);
        this.f893a = 3;
        this.f895c = c6Var;
        this.f894b = new Path();
    }
}
