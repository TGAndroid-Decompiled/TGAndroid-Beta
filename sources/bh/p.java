package bh;

import a8.ee;
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
import fi.b6;
import fi.v3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.wh;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.ea;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.Components.voip.i1;
import org.telegram.ui.Components.zd0;
import org.telegram.ui.Components.zp;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.Wallet.m5;
import org.telegram.ui.Wallet.x4;
import org.telegram.ui.bc;
import org.telegram.ui.f41;
import org.telegram.ui.f61;
import org.telegram.ui.ht;
import org.telegram.ui.i51;
import org.telegram.ui.j4;
import org.telegram.ui.j51;
import org.telegram.ui.k51;
import org.telegram.ui.o51;
import org.telegram.ui.oy0;
import org.telegram.ui.qt0;
import org.telegram.ui.r5;
import org.telegram.ui.r70;
import org.telegram.ui.vc1;
import org.telegram.ui.y10;
import org.telegram.ui.y31;
public final class p extends FrameLayout {
    public final int f4100a;
    public Object f4101b;
    public Object f4102c;

    public p(Object obj, Context context, int i10) {
        super(context);
        this.f4100a = i10;
        this.f4102c = obj;
    }

    public void b(Canvas canvas) {
        me0 me0Var = (me0) this.f4102c;
        Drawable drawable = me0Var.f30513a;
        if (drawable != null) {
            if (!(drawable instanceof vc0) && !(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable)) {
                float max = Math.max(getMeasuredWidth() / me0Var.f30513a.getIntrinsicWidth(), (getMeasuredHeight() + me0Var.G) / me0Var.f30513a.getIntrinsicHeight());
                int ceil = (int) Math.ceil(me0Var.f30513a.getIntrinsicWidth() * max);
                int ceil2 = (int) Math.ceil(me0Var.f30513a.getIntrinsicHeight() * max);
                int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                int measuredHeight = ((getMeasuredHeight() - ceil2) + me0Var.G) / 2;
                me0Var.f30513a.setBounds(measuredWidth, measuredHeight, ceil + measuredWidth, ceil2 + measuredHeight);
                me0Var.f30513a.draw(canvas);
            } else {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                me0Var.f30513a.draw(canvas);
            }
        } else {
            super.onDraw(canvas);
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (Paint) this.f4101b);
    }

    public void c(int i10, CharSequence charSequence, boolean z10) {
        ImageView imageView = (ImageView) this.f4101b;
        if (z10) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
        ((TextView) this.f4102c).setText(charSequence);
        requestLayout();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        u6 u6Var;
        Paint paint;
        boolean c12;
        int o10;
        float f7;
        org.telegram.ui.Cells.y yVar;
        float f10;
        switch (this.f4100a) {
            case 7:
                super.dispatchDraw(canvas);
                Paint paint2 = (Paint) this.f4101b;
                int i10 = y6.f23300a7;
                u6Var = ((r2) ((r5) this.f4102c).d).resourceProvider;
                paint2.setColor(y6.w0(i10, u6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint2);
                return;
            case 8:
                RectF rectF = (RectF) this.f4101b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Cells.y0 y0Var = (org.telegram.ui.Cells.y0) this.f4102c;
                int measuredWidth = y0Var.getMeasuredWidth();
                int i11 = y0Var.e;
                float x9 = y0Var.getX();
                float f11 = y0Var.d;
                u6 u6Var2 = y0Var.f25737c;
                if (u6Var2 != null) {
                    u6Var2.b(x9, f11, measuredWidth, i11);
                } else {
                    y6.q(x9, f11, measuredWidth, i11);
                }
                float dp = AndroidUtilities.dp(18.0f);
                float dp2 = AndroidUtilities.dp(18.0f);
                Paint paint3 = null;
                if (u6Var2 != null) {
                    paint = u6Var2.d("paintChatActionBackground");
                } else {
                    paint = null;
                }
                if (paint == null) {
                    paint = y6.U0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, dp, dp2, paint);
                if (u6Var2 != null) {
                    c12 = u6Var2.f();
                } else {
                    c12 = y6.c1();
                }
                if (c12) {
                    float dp3 = AndroidUtilities.dp(18.0f);
                    float dp4 = AndroidUtilities.dp(18.0f);
                    if (u6Var2 != null) {
                        paint3 = u6Var2.d("paintChatActionBackgroundDarken");
                    }
                    if (paint3 == null) {
                        paint3 = y6.U0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF, dp3, dp4, paint3);
                }
                super.dispatchDraw(canvas);
                return;
            case 9:
                super.dispatchDraw(canvas);
                Paint paint4 = (Paint) this.f4101b;
                paint4.setColor(y6.w0(y6.f23300a7, ((bc) this.f4102c).f37970f.e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint4);
                return;
            case 10:
                float dp5 = AndroidUtilities.dp(20.0f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.f4101b;
                path.rewind();
                path.addRoundRect(rectF2, dp5, dp5, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF2, 255, 31);
                super.dispatchDraw(canvas);
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), AndroidUtilities.dp(6.0f) + getPaddingTop());
                y10 y10Var = (y10) this.f4102c;
                y10Var.b(canvas, rectF2, 1, 1.0f);
                rectF2.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                y10Var.b(canvas, rectF2, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                return;
            case 11:
                super.dispatchDraw(canvas);
                Paint paint5 = (Paint) this.f4101b;
                paint5.setColor(((zp) this.f4102c).getThemedColor(y6.f23358d7));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint5);
                return;
            case 12:
                fz fzVar = (fz) this.f4102c;
                if (!fzVar.G.f32768u0 && fzVar.f28329w > 0.0f) {
                    if (((Paint) this.f4101b) == null) {
                        Paint paint6 = new Paint();
                        this.f4101b = paint6;
                        paint6.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f4101b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f4101b).setAlpha((int) (fzVar.f28329w * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f4101b);
                    canvas.restore();
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 14:
                Paint paint7 = (Paint) this.f4101b;
                gl0 gl0Var = (gl0) this.f4102c;
                int i12 = gl0Var.M0;
                if (i12 != 1 && i12 != 2 && i12 != 4) {
                    o10 = i0.a.f(0.7f, y6.w0(y6.F8, gl0Var.f28630k0), y6.w0(y6.f23428h5, gl0Var.f28630k0));
                } else {
                    o10 = i0.a.o(-1, 30);
                }
                paint7.setColor(o10);
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - AndroidUtilities.dpf2(6.0f)) / 2.0f;
                float g7 = gl0Var.g();
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(measuredWidth2 - measuredWidth3, (measuredHeight - measuredWidth3) - g7, measuredWidth2 + measuredWidth3, measuredHeight + measuredWidth3 + g7);
                canvas.save();
                canvas.scale(childAt.getScaleX(), childAt.getScaleY(), measuredWidth2, measuredHeight);
                canvas.drawRoundRect(rectF3, measuredWidth3, measuredWidth3, paint7);
                canvas.restore();
                canvas.save();
                canvas.translate(0.0f, g7);
                super.dispatchDraw(canvas);
                canvas.restore();
                return;
            case 20:
                super.dispatchDraw(canvas);
                ProfileActivity profileActivity = (ProfileActivity) this.f4102c;
                if (profileActivity.f35993c5 != null) {
                    canvas.save();
                    canvas.translate(profileActivity.f36091r.getX(), profileActivity.f36091r.getY());
                    f7 = 0.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.f35993c5.getMeasuredWidth(), profileActivity.f35993c5.getMeasuredHeight(), (int) ((1.0f - profileActivity.S1) * 255.0f), 31);
                    profileActivity.f35993c5.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    f7 = 0.0f;
                }
                if (profileActivity.f36125v5 && profileActivity.f36030h6 != f7 && profileActivity.f36111t5 != 1.0f) {
                    float measuredHeight2 = (profileActivity.f36091r.getMeasuredHeight() / 2.0f) + profileActivity.f36091r.getY();
                    float dp6 = AndroidUtilities.dp(22.0f);
                    float x10 = ((profileActivity.f36091r.getX() + (AndroidUtilities.dp(28.0f) - profileActivity.f36118u5)) - dp6) - profileActivity.h4();
                    profileActivity.f36141x5.setImageCoords(x10, measuredHeight2 - (dp6 / 2.0f), dp6, dp6);
                    profileActivity.f36141x5.setAlpha(profileActivity.f36030h6);
                    canvas.save();
                    float f12 = profileActivity.f36030h6;
                    canvas.scale(f12, f12, profileActivity.f36141x5.getCenterX(), profileActivity.f36141x5.getCenterY());
                    profileActivity.f36141x5.draw(canvas);
                    canvas.restore();
                    if (profileActivity.f36111t5 == f7) {
                        if (((ed) this.f4101b) == null) {
                            ed edVar = new ed(this);
                            this.f4101b = edVar;
                            edVar.h = new oy0(this, 2);
                        }
                        float dp7 = (1.0f - profileActivity.f36111t5) * AndroidUtilities.dp(28.0f);
                        float textWidth = profileActivity.f36091r.getTextWidth();
                        if (profileActivity.S != null) {
                            f10 = (AndroidUtilities.dp(24.0f) + textWidth + AndroidUtilities.dp(4.0f)) * profileActivity.S.getVisibilityFactor();
                        } else {
                            f10 = f7;
                        }
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        rectF4.set(x10 - AndroidUtilities.dp(4.0f), measuredHeight2 - AndroidUtilities.dp(14.0f), x10 + Math.max(textWidth, f10) + dp7 + AndroidUtilities.dp(4.0f), measuredHeight2 + AndroidUtilities.dp(14.0f));
                        ed edVar2 = (ed) this.f4101b;
                        edVar2.f27828i = false;
                        edVar2.f27825c = 0;
                        edVar2.a(rectF4);
                        ed edVar3 = (ed) this.f4101b;
                        edVar3.f27833n = true;
                        int o11 = i0.a.o(-1, 50);
                        edVar3.f27827g.setColor(0);
                        org.telegram.ui.Cells.y yVar2 = edVar3.e;
                        if (yVar2 != null) {
                            y6.E1(yVar2, o11, true);
                        }
                        ed edVar4 = (ed) this.f4101b;
                        edVar4.c(canvas, edVar4.f27827g);
                        org.telegram.ui.Cells.y yVar3 = edVar4.e;
                        if (yVar3 != null) {
                            yVar3.draw(canvas);
                            return;
                        }
                        return;
                    }
                    ed edVar5 = (ed) this.f4101b;
                    if (edVar5 != null && (yVar = edVar5.e) != null) {
                        yVar.setState(StateSet.NOTHING);
                        yVar.jumpToCurrentState();
                        return;
                    }
                    return;
                }
                return;
            case 24:
                ImageReceiver imageReceiver = (ImageReceiver) this.f4101b;
                imageReceiver.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                imageReceiver.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 27:
                super.dispatchDraw(canvas);
                ((m5) this.f4102c).getClass();
                return;
            case 28:
                ag.h0 h0Var = (ag.h0) this.f4102c;
                h0Var.b(y6.o1(0.65f, y6.w0(y6.f23357d6, (u6) this.f4101b)));
                h0Var.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.f4100a) {
            case 1:
                if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
                    i0 i0Var = (i0) this.f4102c;
                    if (!i0Var.f4054k) {
                        return true;
                    }
                    i0Var.d();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public void dispatchSetPressed(boolean z10) {
        switch (this.f4100a) {
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
        switch (this.f4100a) {
            case 6:
                j4 j4Var = (j4) this.f4102c;
                ea n10 = j4Var.Q0.n(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.f4101b;
                obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (j4Var.Q0.x() && j4Var.Q0.n(getContext()).onTouchEvent(obtain)) {
                    return true;
                }
                if (n10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() == 0 && j4Var.Q0.x() && (motionEvent.getY() < linearLayout.getTop() || motionEvent.getY() > linearLayout.getBottom())) {
                    if (!j4Var.Q0.n(getContext()).onTouchEvent(obtain)) {
                        return true;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            case 15:
                int action = motionEvent.getAction();
                i1 i1Var = (i1) this.f4102c;
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
                if (!i1Var.F.isInProgress() && ((GestureDetector) i1Var.G.f15827b).onTouchEvent(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (action == 1 || action == 3) {
                    i1Var.H = false;
                    i1Var.I = false;
                    o1.j jVar = i1Var.S;
                    if (!jVar.f18962f) {
                        float f10 = i1Var.Q;
                        jVar.f18960b = f10;
                        jVar.f18961c = true;
                        o1.k kVar = jVar.f18968u;
                        int i10 = i1Var.M;
                        float f11 = (i10 / 2.0f) + f10;
                        int i11 = AndroidUtilities.displaySize.x;
                        if (f11 >= i11 / 2.0f) {
                            dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        kVar.f18974i = dp;
                        i1Var.S.h();
                    }
                    o1.j jVar2 = i1Var.T;
                    if (!jVar2.f18962f) {
                        jVar2.f18960b = i1Var.R;
                        jVar2.f18961c = true;
                        jVar2.f18968u.f18974i = ee.a(f7, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - i1Var.N) - AndroidUtilities.dp(16.0f));
                        i1Var.T.h();
                    }
                }
                if (onTouchEvent || z10) {
                    return true;
                }
                return false;
            case 28:
                super.dispatchTouchEvent(motionEvent);
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        float f7;
        Rect rect;
        boolean z11;
        float f10;
        switch (this.f4100a) {
            case 3:
                Path path = (Path) this.f4101b;
                b6 b6Var = (b6) this.f4102c;
                if (b6Var.h != null && (((z10 = b6Var.f10562f) && view == b6Var.d) || (!z10 && view == b6Var.f10561c))) {
                    if (z10) {
                        f7 = b6Var.e;
                    } else {
                        f7 = 1.0f - b6Var.e;
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
            case 17:
                if (view instanceof zd0) {
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            case 21:
                if (view != ((SecretMediaViewer) this.f4101b).f36224w && super.drawChild(canvas, view, j10)) {
                    return true;
                }
                return false;
            case 22:
                Path path2 = (Path) this.f4101b;
                f41 f41Var = (f41) this.f4102c;
                RectF rectF = f41Var.R;
                if (view != f41Var.N && view != f41Var.f39164x) {
                    if (view == f41Var.P) {
                        canvas.save();
                        path2.rewind();
                        path2.addCircle(rectF.centerX() + f41Var.N.getX(), rectF.centerY() + f41Var.N.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                        canvas.clipPath(path2);
                        canvas.clipRect(0.0f, AndroidUtilities.lerp(f41Var.T, 0.0f, f41Var.f39162s), getWidth(), AndroidUtilities.lerp(f41Var.U, getHeight(), f41Var.f39162s));
                        canvas.translate(-f41Var.P.getX(), -f41Var.P.getY());
                        canvas.translate(f41Var.N.getX() + rectF.left, f41Var.N.getY() + rectF.top);
                        canvas.scale(rectF.width() / f41Var.P.getMeasuredWidth(), rectF.height() / f41Var.P.getMeasuredHeight(), f41Var.P.getX(), f41Var.P.getY());
                        boolean drawChild2 = super.drawChild(canvas, view, j10);
                        canvas.restore();
                        return drawChild2;
                    }
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(f41Var.T, 0.0f, f41Var.f39162s), getWidth(), AndroidUtilities.lerp(f41Var.U, getHeight(), f41Var.f39162s));
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild3;
            case 23:
                if (view == ((f61) this.f4102c).f39202h0 && m0.f4082b && m0.f4084f) {
                    for (int i10 = 0; i10 < ((f61) this.f4102c).f39202h0.getChildCount(); i10++) {
                        View childAt = ((f61) this.f4102c).f39202h0.getChildAt(i10);
                        if (childAt instanceof o51) {
                            o51 o51Var = (o51) childAt;
                            if (o51Var.getAnimatedScale() == 1.0f) {
                                ((Rect) this.f4101b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                canvas.save();
                                canvas.clipRect((Rect) this.f4101b);
                                super.drawChild(canvas, view, j10);
                                canvas.restore();
                            } else if (o51Var.getAnimatedScale() > 0.0f) {
                                ((Rect) this.f4101b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                ((Rect) this.f4101b).set((int) (rect.centerX() - (o51Var.getAnimatedScale() * (((Rect) this.f4101b).width() / 2.0f))), (int) (((Rect) this.f4101b).centerY() - (o51Var.getAnimatedScale() * (((Rect) this.f4101b).height() / 2.0f))), (int) ((o51Var.getAnimatedScale() * (((Rect) this.f4101b).width() / 2.0f)) + ((Rect) this.f4101b).centerX()), (int) ((o51Var.getAnimatedScale() * (((Rect) this.f4101b).height() / 2.0f)) + ((Rect) this.f4101b).centerY()));
                                canvas.save();
                                canvas.clipRect((Rect) this.f4101b);
                                canvas.scale(o51Var.getAnimatedScale(), o51Var.getAnimatedScale(), ((Rect) this.f4101b).centerX(), ((Rect) this.f4101b).centerY());
                                super.drawChild(canvas, view, j10);
                                canvas.restore();
                            }
                        } else if ((childAt instanceof TextView) || (childAt instanceof j51) || (childAt instanceof i51) || (childAt instanceof k51)) {
                            ((Rect) this.f4101b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.f4101b);
                            super.drawChild(canvas, view, j10);
                            canvas.restore();
                        }
                    }
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            case 27:
                m5 m5Var = (m5) this.f4102c;
                if (view == m5Var.f36962s0 && m5Var.F) {
                    int save = canvas.save();
                    canvas.concat(m5Var.I);
                    boolean drawChild4 = super.drawChild(canvas, view, j10);
                    canvas.restoreToCount(save);
                    return drawChild4;
                }
                return super.drawChild(canvas, view, j10);
            case 29:
                Path path3 = (Path) this.f4101b;
                sg.l0 l0Var = (sg.l0) this.f4102c;
                if (l0Var.h != null && (((z11 = l0Var.f48334f) && view == l0Var.d) || (!z11 && view == l0Var.f48333c))) {
                    if (z11) {
                        f10 = l0Var.e;
                    } else {
                        f10 = 1.0f - l0Var.e;
                    }
                    canvas.save();
                    path3.rewind();
                    path3.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f10 * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                    canvas.clipPath(path3);
                    boolean drawChild5 = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild5;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public boolean fitSystemWindows(Rect rect) {
        switch (this.f4100a) {
            case 1:
                i0 i0Var = (i0) this.f4102c;
                float f7 = i0Var.f4064u;
                float f10 = rect.bottom;
                if (f7 != f10 && i0Var.v) {
                    i0Var.f4064u = f10;
                    p pVar = i0Var.f4049c;
                    h0 h0Var = i0Var.f4047a;
                    if (!i0Var.f4060q) {
                        float f11 = i0Var.f4063t;
                        int dp = AndroidUtilities.dp(32.0f);
                        int i10 = i0Var.f4067y;
                        if (i10 == 1 || i10 == 2) {
                            dp = AndroidUtilities.dp(24.0f);
                        }
                        float f12 = dp;
                        if (h0Var.getMeasuredHeight() + f11 > (pVar.getMeasuredHeight() - i0Var.f4064u) - f12) {
                            f11 = ((pVar.getMeasuredHeight() - i0Var.f4064u) - h0Var.getMeasuredHeight()) - f12;
                        }
                        if (f11 < 0.0f) {
                            f11 = 0.0f;
                        }
                        h0Var.animate().translationY(f11).setDuration(250L).setUpdateListener(new z(i0Var, 1)).setInterpolator(ds.f27530f).start();
                    }
                }
                return super.fitSystemWindows(rect);
            default:
                return super.fitSystemWindows(rect);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f4100a) {
            case 5:
                super.invalidate();
                ((og.i) this.f4102c).invalidate();
                return;
            case 26:
                super.invalidate();
                org.telegram.ui.ActionBar.q0 q0Var = ((vc1) this.f4102c).f44301u0;
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
        switch (this.f4100a) {
            case 0:
                super.onAttachedToWindow();
                ((o) this.f4101b).c();
                return;
            case 1:
                super.onAttachedToWindow();
                qc.a(this, (c0) this.f4101b);
                return;
            case 17:
                super.onAttachedToWindow();
                ht htVar = (ht) this.f4102c;
                htVar.A.onAttachedToWindow();
                htVar.B.onAttachedToWindow();
                return;
            case 20:
                super.onAttachedToWindow();
                ((ProfileActivity) this.f4102c).f36141x5.onAttachedToWindow();
                return;
            case 21:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.f4101b).h.onAttachedToWindow();
                return;
            case 24:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f4101b).onAttachedToWindow();
                return;
            case 27:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((x4) this.f4101b);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.f4100a) {
            case 15:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                i1 i1Var = (i1) this.f4102c;
                AndroidUtilities.setPreferredMaxRefreshRate(i1Var.f33952b, i1Var.d, i1Var.f33953c);
                i1Var.i(false);
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f4100a) {
            case 0:
                super.onDetachedFromWindow();
                ((o) this.f4101b).d();
                return;
            case 1:
                super.onDetachedFromWindow();
                qc.h(this);
                return;
            case 17:
                super.onDetachedFromWindow();
                ht htVar = (ht) this.f4102c;
                htVar.A.onDetachedFromWindow();
                htVar.B.onDetachedFromWindow();
                return;
            case 20:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.f4102c).f36141x5.onDetachedFromWindow();
                return;
            case 21:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.f4101b).h.onDetachedFromWindow();
                return;
            case 24:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f4101b).onDetachedFromWindow();
                return;
            case 27:
                getViewTreeObserver().removeOnPreDrawListener((x4) this.f4101b);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: bh.p.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        ed edVar;
        switch (this.f4100a) {
            case 20:
                if ((((ProfileActivity) this.f4102c).f36111t5 == 0.0f && (edVar = (ed) this.f4101b) != null && edVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f4100a) {
            case 18:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = (i13 - i11) / 4;
                int i15 = i14 * 3;
                int B = wh.B(275.0f, i15, 2);
                r70 r70Var = (r70) this.f4102c;
                FrameLayout frameLayout = r70Var.f42875r;
                int i16 = 0;
                frameLayout.layout(0, B, frameLayout.getMeasuredWidth(), r70Var.f42875r.getMeasuredHeight() + B);
                int dp = AndroidUtilities.dp(139.0f) + AndroidUtilities.dp(150.0f) + B;
                int measuredWidth = (getMeasuredWidth() - r70Var.e.getMeasuredWidth()) / 2;
                sa saVar = r70Var.e;
                saVar.layout(measuredWidth, dp, saVar.getMeasuredWidth() + measuredWidth, r70Var.e.getMeasuredHeight() + dp);
                a5.m mVar = r70Var.d;
                mVar.layout(0, 0, mVar.getMeasuredWidth(), r70Var.d.getMeasuredHeight());
                int measuredHeight = ((i14 - r70Var.f42874n.getMeasuredHeight()) / 2) + i15;
                int measuredWidth2 = (getMeasuredWidth() - r70Var.f42874n.getMeasuredWidth()) / 2;
                ei.n nVar = r70Var.f42874n;
                nVar.layout(measuredWidth2, measuredHeight, nVar.getMeasuredWidth() + measuredWidth2, r70Var.f42874n.getMeasuredHeight() + measuredHeight);
                int dp2 = measuredHeight - AndroidUtilities.dp(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - r70Var.f42873f.getMeasuredWidth()) / 2;
                TextView textView = r70Var.f42873f;
                textView.layout(measuredWidth3, dp2 - textView.getMeasuredHeight(), r70Var.f42873f.getMeasuredWidth() + measuredWidth3, dp2);
                FrameLayout frameLayout2 = (FrameLayout) this.f4101b;
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
            case 19:
                int dp4 = AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(150.0f) + wh.B(275.0f, ((i13 - i11) / 4) * 3, 2);
                int dp5 = AndroidUtilities.dp(18.0f);
                TextView textView2 = (TextView) this.f4101b;
                textView2.layout(dp5, dp4, textView2.getMeasuredWidth() + dp5, textView2.getMeasuredHeight() + dp4);
                int dp6 = AndroidUtilities.dp(18.0f) + dp4 + ((int) textView2.getTextSize());
                int dp7 = AndroidUtilities.dp(16.0f);
                TextView textView3 = (TextView) this.f4102c;
                textView3.layout(dp7, dp6, textView3.getMeasuredWidth() + dp7, textView3.getMeasuredHeight() + dp6);
                return;
            case 20:
                super.onLayout(z10, i10, i11, i12, i13);
                ((ProfileActivity) this.f4102c).h5();
                return;
            case 21:
                super.onLayout(z10, i10, i11, i12, i13);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f4102c;
                if (secretMediaViewer.f36203n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f36203n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight;
                    y31 y31Var = secretMediaViewer.f36203n;
                    y31Var.layout(y31Var.getLeft(), currentActionBarHeight, secretMediaViewer.f36203n.getRight(), secretMediaViewer.f36203n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.f36212r != null && secretMediaViewer.f36203n != null) {
                    int measuredHeight2 = (secretMediaViewer.f36203n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f36203n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight)) - AndroidUtilities.dp(10.0f);
                    v3 v3Var = secretMediaViewer.f36212r;
                    v3Var.layout(v3Var.getLeft(), measuredHeight2, secretMediaViewer.f36212r.getRight(), secretMediaViewer.f36212r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.f36176a0 != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                    qt0 qt0Var = secretMediaViewer.f36176a0;
                    qt0Var.layout(qt0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.f36176a0.getRight(), secretMediaViewer.f36176a0.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f36188f;
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
        switch (this.f4100a) {
            case 2:
                float f14 = 8.0f;
                int size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(8.0f);
                TextView textView = (TextView) this.f4102c;
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
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((ImageView) this.f4101b).getLayoutParams();
                    if (i13 == i12) {
                        f14 = 4.0f;
                    }
                    layoutParams2.topMargin = AndroidUtilities.dp(f14);
                }
                super.onMeasure(i10, i11);
                return;
            case 4:
                ViewGroup viewGroup = (ViewGroup) this.f4101b;
                ig.e eVar = (ig.e) this.f4102c;
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
                if (!eVar.E && !eVar.f14040w) {
                    dp += dp2;
                }
                int paddingTop = (size2 - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
                if (dp < paddingTop) {
                    i15 = paddingTop - dp;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
                return;
            case 6:
                super.onMeasure(i10, i11);
                super.onMeasure(i10, wh.D(8.0f, ((LinearLayout) this.f4101b).getMeasuredHeight(), 1073741824));
                return;
            case 11:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                return;
            case 21:
                super.onMeasure(i10, i11);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f4102c;
                qt0 qt0Var = secretMediaViewer.f36176a0;
                if (qt0Var != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                    int currentActionBarHeight = (measuredHeight2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                    if (secretMediaViewer.U.getVisibility() != 0) {
                        measuredHeight = 0;
                    } else {
                        measuredHeight = secretMediaViewer.U.getMeasuredHeight();
                    }
                    qt0Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(currentActionBarHeight - measuredHeight, 1073741824));
                }
                View view = secretMediaViewer.f36188f;
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
        switch (this.f4100a) {
            case 13:
                me0 me0Var = (me0) this.f4102c;
                hh.b bVar = me0Var.H;
                super.onSizeChanged(i10, i11, i12, i13);
                if (i10 > 0 && i11 > 0) {
                    me0Var.J = Bitmap.createBitmap(54, Math.max(1, Math.round((i11 * 54) / i10)), Bitmap.Config.ARGB_8888);
                    me0Var.K = new Canvas(me0Var.J);
                    bVar.a(me0Var.J);
                    bVar.b(i10, i11);
                    return;
                }
                return;
            case 15:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.f4101b;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i10, i11);
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                return;
            case 28:
                super.onSizeChanged(i10, i11, i12, i13);
                ag.h0 h0Var = (ag.h0) this.f4102c;
                h0Var.setBounds(0, 0, i10, i11);
                h0Var.c(0, AndroidUtilities.dp(24.0f) + getPaddingBottom());
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: bh.p.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setBackgroundColor(int i10) {
        switch (this.f4100a) {
            case 13:
                ((Paint) this.f4101b).setColor(i10);
                return;
            default:
                super.setBackgroundColor(i10);
                return;
        }
    }

    @Override
    public void setTranslationX(float f7) {
        switch (this.f4100a) {
            case 5:
                super.setTranslationX(f7);
                ((og.i) this.f4102c).invalidate();
                return;
            default:
                super.setTranslationX(f7);
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f4100a) {
            case 5:
                super.setTranslationY(f7);
                ((og.i) this.f4102c).invalidate();
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    public p(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.f4100a = i10;
        this.f4102c = obj;
        this.f4101b = obj2;
    }

    public p(Context context, u6 u6Var) {
        super(context);
        this.f4100a = 28;
        this.f4102c = new ag.h0(8);
        this.f4101b = u6Var;
    }

    public p(org.telegram.ui.Cells.y0 y0Var, Context context) {
        super(context);
        this.f4100a = 8;
        this.f4102c = y0Var;
        this.f4101b = new RectF();
    }

    public p(i0 i0Var, Context context) {
        super(context);
        this.f4100a = 1;
        this.f4102c = i0Var;
        this.f4101b = new c0(this, 0);
    }

    public p(bc bcVar, Context context) {
        super(context);
        this.f4100a = 9;
        this.f4102c = bcVar;
        this.f4101b = new Paint(1);
    }

    public p(f41 f41Var, Context context) {
        super(context);
        this.f4100a = 22;
        this.f4102c = f41Var;
        this.f4101b = new Path();
    }

    public p(r5 r5Var, Activity activity) {
        super(activity);
        this.f4100a = 7;
        this.f4102c = r5Var;
        this.f4101b = new Paint(1);
    }

    public p(u uVar, Context context) {
        super(context);
        this.f4100a = 0;
        this.f4102c = uVar;
        this.f4101b = new o(this, this);
    }

    public p(i1 i1Var, Context context) {
        super(context);
        this.f4100a = 15;
        this.f4102c = i1Var;
        this.f4101b = new Path();
    }

    public p(me0 me0Var, Context context) {
        super(context);
        this.f4100a = 13;
        this.f4102c = me0Var;
        this.f4101b = new Paint();
    }

    public p(m5 m5Var, Context context) {
        super(context);
        this.f4100a = 27;
        this.f4102c = m5Var;
        this.f4101b = new x4(0, this);
    }

    public p(Context context, TextView textView, TextView textView2) {
        super(context);
        this.f4100a = 19;
        this.f4101b = textView;
        this.f4102c = textView2;
    }

    public p(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f4100a = 21;
        this.f4102c = secretMediaViewer;
        this.f4101b = secretMediaViewer;
        setWillNotDraw(false);
    }

    public p(f61 f61Var, Context context) {
        super(context);
        this.f4100a = 23;
        this.f4102c = f61Var;
        this.f4101b = new Rect();
    }

    public p(zp zpVar, Context context) {
        super(context);
        this.f4100a = 11;
        this.f4102c = zpVar;
        this.f4101b = new Paint();
    }

    public p(ht htVar, Activity activity) {
        super(activity);
        this.f4100a = 17;
        this.f4102c = htVar;
        this.f4101b = htVar;
        setWillNotDraw(false);
    }

    public p(vc1 vc1Var, Context context, int i10) {
        super(context);
        this.f4100a = i10;
        switch (i10) {
            case 26:
                this.f4102c = vc1Var;
                super(context);
                this.f4101b = new int[2];
                return;
            default:
                this.f4102c = vc1Var;
                this.f4101b = new Paint();
                return;
        }
    }

    public p(Context context, int i10) {
        super(context);
        this.f4100a = i10;
        switch (i10) {
            case 10:
                super(context);
                this.f4101b = new Path();
                this.f4102c = new y10();
                return;
            case 24:
                super(context);
                return;
            default:
                ImageView imageView = new ImageView(context);
                this.f4101b = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                addView(imageView, kb1.h(24, 24.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                this.f4102c = textView;
                textView.setTypeface(AndroidUtilities.bold());
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                textView.setGravity(17);
                addView(textView, kb1.h(-1, -2.0f, 49, 4.0f, 35.0f, 4.0f, 0.0f));
                return;
        }
    }

    private final void a(boolean z10) {
    }

    public p(sg.l0 l0Var, Context context) {
        super(context);
        this.f4100a = 29;
        this.f4102c = l0Var;
        this.f4101b = new Path();
    }

    public p(gl0 gl0Var, Context context) {
        super(context);
        this.f4100a = 14;
        this.f4102c = gl0Var;
        this.f4101b = new Paint(1);
    }

    public p(b6 b6Var, Context context) {
        super(context);
        this.f4100a = 3;
        this.f4102c = b6Var;
        this.f4101b = new Path();
    }
}
