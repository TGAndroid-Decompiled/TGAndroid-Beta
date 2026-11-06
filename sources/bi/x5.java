package bi;

import android.app.Activity;
import android.content.Context;
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
import android.graphics.drawable.ShapeDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.ii0;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Components.tx;
import org.telegram.ui.Components.vo;
import org.telegram.ui.Components.xq;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.a11;
import org.telegram.ui.ks;
import org.telegram.ui.kz0;
import org.telegram.ui.q11;
import org.telegram.ui.qu0;
import org.telegram.ui.rz0;
import org.telegram.ui.u01;
import org.telegram.ui.u50;
import org.telegram.ui.u71;
import org.telegram.ui.up0;
import org.telegram.ui.v01;
import org.telegram.ui.w01;
import org.telegram.ui.x90;
import org.telegram.ui.z10;
public final class x5 extends FrameLayout {
    public final int f5025a;
    public Object f5026b;
    public Object f5027c;

    public x5(int i7, Context context, Object obj) {
        super(context);
        this.f5025a = i7;
        this.f5027c = obj;
    }

    public void d(Canvas canvas) {
        ec0 ec0Var = (ec0) this.f5027c;
        Drawable drawable = ec0Var.f33198a;
        if (drawable != null) {
            if (!(drawable instanceof qa0) && !(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable)) {
                float max = Math.max(getMeasuredWidth() / ec0Var.f33198a.getIntrinsicWidth(), (getMeasuredHeight() + ec0Var.G) / ec0Var.f33198a.getIntrinsicHeight());
                int ceil = (int) Math.ceil(ec0Var.f33198a.getIntrinsicWidth() * max);
                int ceil2 = (int) Math.ceil(ec0Var.f33198a.getIntrinsicHeight() * max);
                int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                int measuredHeight = ((getMeasuredHeight() - ceil2) + ec0Var.G) / 2;
                ec0Var.f33198a.setBounds(measuredWidth, measuredHeight, ceil + measuredWidth, ceil2 + measuredHeight);
                ec0Var.f33198a.draw(canvas);
            } else {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                ec0Var.f33198a.draw(canvas);
            }
        } else {
            super.onDraw(canvas);
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (Paint) this.f5026b);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f6 f6Var;
        Paint paint;
        boolean d12;
        int o4;
        ?? r11;
        float f10;
        float f11;
        org.telegram.ui.Cells.y yVar;
        float f12;
        Paint paint2 = null;
        switch (this.f5025a) {
            case 8:
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.f5026b;
                int i7 = org.telegram.ui.ActionBar.k6.f27792a7;
                f6Var = ((org.telegram.ui.ActionBar.f2) ((org.telegram.ui.n5) this.f5027c).d).resourceProvider;
                paint3.setColor(org.telegram.ui.ActionBar.k6.w0(i7, f6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint3);
                return;
            case 10:
                RectF rectF = (RectF) this.f5026b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.f5027c;
                int measuredWidth = w0Var.getMeasuredWidth();
                int i10 = w0Var.f30694e;
                float x10 = w0Var.getX();
                float f13 = w0Var.d;
                org.telegram.ui.ActionBar.f6 f6Var2 = w0Var.f30693c;
                if (f6Var2 != null) {
                    f6Var2.b(x10, f13, measuredWidth, i10);
                } else {
                    org.telegram.ui.ActionBar.k6.r(x10, f13, measuredWidth, i10);
                }
                float L = org.telegram.messenger.g0.L(18.0f);
                float L2 = org.telegram.messenger.g0.L(18.0f);
                if (f6Var2 != null) {
                    paint = f6Var2.d("paintChatActionBackground");
                } else {
                    paint = null;
                }
                if (paint == null) {
                    paint = org.telegram.ui.ActionBar.k6.V0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, L, L2, paint);
                if (f6Var2 != null) {
                    d12 = f6Var2.g();
                } else {
                    d12 = org.telegram.ui.ActionBar.k6.d1();
                }
                if (d12) {
                    float L3 = org.telegram.messenger.g0.L(18.0f);
                    float L4 = org.telegram.messenger.g0.L(18.0f);
                    if (f6Var2 != null) {
                        paint2 = f6Var2.d("paintChatActionBackgroundDarken");
                    }
                    if (paint2 == null) {
                        paint2 = org.telegram.ui.ActionBar.k6.V0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF, L3, L4, paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 11:
                super.dispatchDraw(canvas);
                Paint paint4 = (Paint) this.f5026b;
                paint4.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27792a7, ((org.telegram.ui.rb) this.f5027c).f49422f.f49981e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint4);
                return;
            case 12:
                float L5 = org.telegram.messenger.g0.L(20.0f);
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.f5026b;
                path.rewind();
                path.addRoundRect(rectF2, L5, L5, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF2, 255, 31);
                super.dispatchDraw(canvas);
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), org.telegram.messenger.g0.L(6.0f) + getPaddingTop());
                h6.m mVar = (h6.m) this.f5027c;
                mVar.m(canvas, rectF2, 1, 1.0f);
                rectF2.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - org.telegram.messenger.g0.L(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                mVar.m(canvas, rectF2, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                return;
            case 13:
                super.dispatchDraw(canvas);
                Paint paint5 = (Paint) this.f5026b;
                paint5.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27849d7, ((vo) this.f5027c).I0));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint5);
                return;
            case 14:
                tx txVar = (tx) this.f5027c;
                if (!txVar.G.f34130u0 && txVar.f38437x > 0.0f) {
                    if (((Paint) this.f5026b) == null) {
                        Paint paint6 = new Paint();
                        this.f5026b = paint6;
                        paint6.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f5026b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f5026b).setAlpha((int) (txVar.f38437x * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), getMeasuredHeight(), (Paint) this.f5026b);
                    canvas.restore();
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 16:
                Paint paint7 = (Paint) this.f5026b;
                ii0 ii0Var = (ii0) this.f5027c;
                int i11 = ii0Var.M0;
                if (i11 != 1 && i11 != 2 && i11 != 4) {
                    o4 = i0.a.f(0.7f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, ii0Var.f34667k0), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27921h5, ii0Var.f34667k0));
                } else {
                    o4 = i0.a.o(-1, 30);
                }
                paint7.setColor(o4);
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - org.telegram.messenger.g0.N(6.0f)) / 2.0f;
                float g10 = ii0Var.g();
                RectF rectF3 = org.telegram.messenger.g0.P;
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
            case 17:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.f5026b;
                z10 z10Var = (z10) this.f5027c;
                org.telegram.ui.Components.z8 z8Var = z10Var.J;
                TextView textView = z10Var.K;
                float f14 = z10Var.O;
                if (f14 == 1.0f) {
                    shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    z8Var.setTranslationX(0.0f);
                    textView.setTranslationX(0.0f);
                } else {
                    float interpolation = 1.0f - xq.f40310f.getInterpolation(f14);
                    float left = (z10Var.P - getLeft()) * interpolation;
                    shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((z10Var.R - getRight()) * interpolation)), getMeasuredHeight());
                    z8Var.setTranslationX(left);
                    textView.setTranslationX(-((z10Var.Q - textView.getLeft()) * interpolation));
                }
                shapeDrawable.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 18:
                RectF rectF4 = (RectF) this.f5027c;
                rectF4.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Components.voip.i1 i1Var = (org.telegram.ui.Components.voip.i1) this.f5026b;
                i1Var.d(((View) getParent()).getX() + getX(), ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF4, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), i1Var.b());
                super.dispatchDraw(canvas);
                return;
            case 23:
                super.dispatchDraw(canvas);
                ProfileActivity profileActivity = (ProfileActivity) this.f5027c;
                if (profileActivity.W4 != null) {
                    canvas.save();
                    canvas.translate(profileActivity.f41782r.getX(), profileActivity.f41782r.getY());
                    r11 = 1;
                    f10 = 0.0f;
                    f11 = 2.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.W4.getMeasuredWidth(), profileActivity.W4.getMeasuredHeight(), (int) ((1.0f - profileActivity.R1) * 255.0f), 31);
                    profileActivity.W4.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    r11 = 1;
                    f10 = 0.0f;
                    f11 = 2.0f;
                }
                if (profileActivity.f41773p5 && profileActivity.f41781q6 != f10 && profileActivity.f41760n5 != 1.0f) {
                    float measuredHeight2 = (profileActivity.f41782r.getMeasuredHeight() / f11) + profileActivity.f41782r.getY();
                    float L6 = org.telegram.messenger.g0.L(22.0f);
                    float x11 = ((profileActivity.f41782r.getX() + (org.telegram.messenger.g0.L(28.0f) - profileActivity.f41766o5)) - L6) - profileActivity.p4();
                    profileActivity.f41788r5.y0(x11, measuredHeight2 - (L6 / f11), L6, L6);
                    profileActivity.f41788r5.setAlpha(profileActivity.f41781q6);
                    canvas.save();
                    float f15 = profileActivity.f41781q6;
                    canvas.scale(f15, f15, profileActivity.f41788r5.r(), profileActivity.f41788r5.s());
                    profileActivity.f41788r5.h(canvas, null);
                    canvas.restore();
                    if (profileActivity.f41760n5 == f10) {
                        if (((org.telegram.ui.Components.pc) this.f5026b) == null) {
                            org.telegram.ui.Components.pc pcVar = new org.telegram.ui.Components.pc(this);
                            this.f5026b = pcVar;
                            pcVar.h = new qu0(this, r11);
                        }
                        float L7 = (1.0f - profileActivity.f41760n5) * org.telegram.messenger.g0.L(28.0f);
                        float textWidth = profileActivity.f41782r.getTextWidth();
                        if (profileActivity.S != null) {
                            f12 = (org.telegram.messenger.g0.L(24.0f) + textWidth + org.telegram.messenger.g0.L(4.0f)) * profileActivity.S.getVisibilityFactor();
                        } else {
                            f12 = f10;
                        }
                        RectF rectF5 = org.telegram.messenger.g0.P;
                        rectF5.set(x11 - org.telegram.messenger.g0.L(4.0f), measuredHeight2 - org.telegram.messenger.g0.L(14.0f), x11 + Math.max(textWidth, f12) + L7 + org.telegram.messenger.g0.L(4.0f), measuredHeight2 + org.telegram.messenger.g0.L(14.0f));
                        org.telegram.ui.Components.pc pcVar2 = (org.telegram.ui.Components.pc) this.f5026b;
                        pcVar2.f36966i = false;
                        pcVar2.f36962c = 0;
                        pcVar2.a(rectF5);
                        org.telegram.ui.Components.pc pcVar3 = (org.telegram.ui.Components.pc) this.f5026b;
                        pcVar3.f36971n = r11;
                        int o10 = i0.a.o(-1, 50);
                        pcVar3.f36965g.setColor(0);
                        org.telegram.ui.Cells.y yVar2 = pcVar3.f36963e;
                        if (yVar2 != null) {
                            org.telegram.ui.ActionBar.k6.H1(yVar2, o10, r11);
                        }
                        org.telegram.ui.Components.pc pcVar4 = (org.telegram.ui.Components.pc) this.f5026b;
                        pcVar4.c(canvas, pcVar4.f36965g);
                        org.telegram.ui.Cells.y yVar3 = pcVar4.f36963e;
                        if (yVar3 != null) {
                            yVar3.draw(canvas);
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Components.pc pcVar5 = (org.telegram.ui.Components.pc) this.f5026b;
                    if (pcVar5 != null && (yVar = pcVar5.f36963e) != null) {
                        yVar.setState(StateSet.NOTHING);
                        yVar.jumpToCurrentState();
                        return;
                    }
                    return;
                }
                return;
            case 29:
                super.dispatchDraw(canvas);
                ((org.telegram.ui.Wallet.y5) this.f5027c).getClass();
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.f5025a) {
            case 3:
                if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
                    ch.b0 b0Var = (ch.b0) this.f5027c;
                    if (!b0Var.f6191k) {
                        return true;
                    }
                    b0Var.d();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public void dispatchSetPressed(boolean z9) {
        switch (this.f5025a) {
            case 3:
                return;
            default:
                super.dispatchSetPressed(z9);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f5025a) {
            case 6:
                org.telegram.messenger.bb bbVar = (org.telegram.messenger.bb) ((a8.r7) this.f5027c).f615c;
                if (bbVar != null) {
                    return bbVar.b(motionEvent, new org.telegram.messenger.ia(this, 0));
                }
                return super.dispatchTouchEvent(motionEvent);
            case 7:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.f5027c;
                org.telegram.ui.Cells.u9 n10 = g4Var.Q0.n(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.f5026b;
                obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (g4Var.Q0.x() && g4Var.Q0.n(getContext()).onTouchEvent(obtain)) {
                    return true;
                }
                if (n10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() == 0 && g4Var.Q0.x() && (motionEvent.getY() < linearLayout.getTop() || motionEvent.getY() > linearLayout.getBottom())) {
                    if (!g4Var.Q0.n(getContext()).onTouchEvent(obtain)) {
                        return true;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        boolean z9;
        float f10;
        Rect rect;
        switch (this.f5025a) {
            case 4:
                Path path = (Path) this.f5026b;
                fi.l5 l5Var = (fi.l5) this.f5027c;
                if (l5Var.h != null && (((z9 = l5Var.f12323f) && view == l5Var.d) || (!z9 && view == l5Var.f12321c))) {
                    if (z9) {
                        f10 = l5Var.f12322e;
                    } else {
                        f10 = 1.0f - l5Var.f12322e;
                    }
                    canvas.save();
                    path.rewind();
                    path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f10 * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                    canvas.clipPath(path);
                    boolean drawChild = super.drawChild(canvas, view, j3);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j3);
            case 20:
                if (view instanceof sb0) {
                    return false;
                }
                return super.drawChild(canvas, view, j3);
            case 24:
                if (view != ((SecretMediaViewer) this.f5026b).f41919x && super.drawChild(canvas, view, j3)) {
                    return true;
                }
                return false;
            case 25:
                Path path2 = (Path) this.f5026b;
                rz0 rz0Var = (rz0) this.f5027c;
                RectF rectF = rz0Var.R;
                if (view != rz0Var.N && view != rz0Var.f49586y) {
                    if (view == rz0Var.P) {
                        canvas.save();
                        path2.rewind();
                        path2.addCircle(rectF.centerX() + rz0Var.N.getX(), rectF.centerY() + rz0Var.N.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                        canvas.clipPath(path2);
                        canvas.clipRect(0.0f, org.telegram.messenger.g0.T1(rz0Var.T, 0.0f, rz0Var.f49583s), getWidth(), org.telegram.messenger.g0.T1(rz0Var.U, getHeight(), rz0Var.f49583s));
                        canvas.translate(-rz0Var.P.getX(), -rz0Var.P.getY());
                        canvas.translate(rz0Var.N.getX() + rectF.left, rz0Var.N.getY() + rectF.top);
                        canvas.scale(rectF.width() / rz0Var.P.getMeasuredWidth(), rectF.height() / rz0Var.P.getMeasuredHeight(), rz0Var.P.getX(), rz0Var.P.getY());
                        boolean drawChild2 = super.drawChild(canvas, view, j3);
                        canvas.restore();
                        return drawChild2;
                    }
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, org.telegram.messenger.g0.T1(rz0Var.T, 0.0f, rz0Var.f49583s), getWidth(), org.telegram.messenger.g0.T1(rz0Var.U, getHeight(), rz0Var.f49583s));
                boolean drawChild3 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild3;
            case 26:
                if (view == ((q11) this.f5027c).f49008h0 && ch.e0.f6232b && ch.e0.f6235f) {
                    for (int i7 = 0; i7 < ((q11) this.f5027c).f49008h0.getChildCount(); i7++) {
                        View childAt = ((q11) this.f5027c).f49008h0.getChildAt(i7);
                        if (childAt instanceof a11) {
                            a11 a11Var = (a11) childAt;
                            if (a11Var.getAnimatedScale() == 1.0f) {
                                ((Rect) this.f5026b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                canvas.save();
                                canvas.clipRect((Rect) this.f5026b);
                                super.drawChild(canvas, view, j3);
                                canvas.restore();
                            } else if (a11Var.getAnimatedScale() > 0.0f) {
                                ((Rect) this.f5026b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                ((Rect) this.f5026b).set((int) (rect.centerX() - (a11Var.getAnimatedScale() * (((Rect) this.f5026b).width() / 2.0f))), (int) (((Rect) this.f5026b).centerY() - (a11Var.getAnimatedScale() * (((Rect) this.f5026b).height() / 2.0f))), (int) ((a11Var.getAnimatedScale() * (((Rect) this.f5026b).width() / 2.0f)) + ((Rect) this.f5026b).centerX()), (int) ((a11Var.getAnimatedScale() * (((Rect) this.f5026b).height() / 2.0f)) + ((Rect) this.f5026b).centerY()));
                                canvas.save();
                                canvas.clipRect((Rect) this.f5026b);
                                canvas.scale(a11Var.getAnimatedScale(), a11Var.getAnimatedScale(), ((Rect) this.f5026b).centerX(), ((Rect) this.f5026b).centerY());
                                super.drawChild(canvas, view, j3);
                                canvas.restore();
                            }
                        } else if ((childAt instanceof TextView) || (childAt instanceof v01) || (childAt instanceof u01) || (childAt instanceof w01)) {
                            ((Rect) this.f5026b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.f5026b);
                            super.drawChild(canvas, view, j3);
                            canvas.restore();
                        }
                    }
                    return false;
                }
                return super.drawChild(canvas, view, j3);
            case 29:
                org.telegram.ui.Wallet.y5 y5Var = (org.telegram.ui.Wallet.y5) this.f5027c;
                if (view == y5Var.f43363s0 && y5Var.F) {
                    int save = canvas.save();
                    canvas.concat(y5Var.I);
                    boolean drawChild4 = super.drawChild(canvas, view, j3);
                    canvas.restoreToCount(save);
                    return drawChild4;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    public void e(int i7, CharSequence charSequence, boolean z9) {
        ImageView imageView = (ImageView) this.f5026b;
        if (z9) {
            org.telegram.messenger.g0.R3(imageView, i7);
        } else {
            imageView.setImageResource(i7);
        }
        ((TextView) this.f5027c).setText(charSequence);
        requestLayout();
    }

    public void f(float f10) {
        org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) this.f5026b;
        j6Var.a();
        j6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(c8.j9.a(f10, 0.0f, 1.0f) * 100.0f))), !org.telegram.messenger.hd.f22871a0, true);
        org.telegram.ui.r6 r6Var = (org.telegram.ui.r6) this.f5027c;
        r6Var.f49370c = f10;
        r6Var.invalidate();
    }

    @Override
    public boolean fitSystemWindows(Rect rect) {
        switch (this.f5025a) {
            case 3:
                ch.b0 b0Var = (ch.b0) this.f5027c;
                float f10 = b0Var.f6201u;
                float f11 = rect.bottom;
                if (f10 != f11 && b0Var.v) {
                    b0Var.f6201u = f11;
                    x5 x5Var = b0Var.f6185c;
                    ch.a0 a0Var = b0Var.f6183a;
                    if (!b0Var.f6197q) {
                        float f12 = b0Var.f6200t;
                        int L = org.telegram.messenger.g0.L(32.0f);
                        int i7 = b0Var.f6204y;
                        if (i7 == 1 || i7 == 2) {
                            L = org.telegram.messenger.g0.L(24.0f);
                        }
                        float f13 = L;
                        if (a0Var.getMeasuredHeight() + f12 > (x5Var.getMeasuredHeight() - b0Var.f6201u) - f13) {
                            f12 = ((x5Var.getMeasuredHeight() - b0Var.f6201u) - a0Var.getMeasuredHeight()) - f13;
                        }
                        if (f12 < 0.0f) {
                            f12 = 0.0f;
                        }
                        a0Var.animate().translationY(f12).setDuration(250L).setUpdateListener(new ch.t(b0Var, 1)).setInterpolator(xq.f40310f).start();
                    }
                }
                return super.fitSystemWindows(rect);
            default:
                return super.fitSystemWindows(rect);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f5025a) {
            case 28:
                super.invalidate();
                org.telegram.ui.ActionBar.l0 l0Var = ((u71) this.f5027c).f50299u0;
                if (l0Var != null) {
                    l0Var.invalidate();
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
        switch (this.f5025a) {
            case 2:
                super.onAttachedToWindow();
                ((ch.k) this.f5026b).c();
                return;
            case 3:
                super.onAttachedToWindow();
                setTag(2131296351, (ch.v) this.f5026b);
                return;
            case 20:
                super.onAttachedToWindow();
                ks ksVar = (ks) this.f5027c;
                ksVar.A.P();
                ksVar.B.P();
                return;
            case 23:
                super.onAttachedToWindow();
                ((ProfileActivity) this.f5027c).f41788r5.P();
                return;
            case 24:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.f5026b).h.P();
                return;
            case 29:
                super.onAttachedToWindow();
                getViewTreeObserver().addOnPreDrawListener((org.telegram.ui.Wallet.l5) this.f5026b);
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f5025a) {
            case 2:
                super.onDetachedFromWindow();
                ((ch.k) this.f5026b).d();
                return;
            case 3:
                super.onDetachedFromWindow();
                setTag(2131296351, null);
                return;
            case 20:
                super.onDetachedFromWindow();
                ks ksVar = (ks) this.f5027c;
                ksVar.A.R();
                ksVar.B.R();
                return;
            case 23:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.f5027c).f41788r5.R();
                return;
            case 24:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.f5026b).h.R();
                return;
            case 29:
                getViewTreeObserver().removeOnPreDrawListener((org.telegram.ui.Wallet.l5) this.f5026b);
                super.onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: bi.x5.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        org.telegram.ui.Components.pc pcVar;
        switch (this.f5025a) {
            case 6:
                org.telegram.messenger.bb bbVar = (org.telegram.messenger.bb) ((a8.r7) this.f5027c).d;
                if (bbVar != null) {
                    return bbVar.b(motionEvent, new org.telegram.messenger.ia(this, 1));
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 23:
                if ((((ProfileActivity) this.f5027c).f41760n5 == 0.0f && (pcVar = (org.telegram.ui.Components.pc) this.f5026b) != null && pcVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.f5025a) {
            case 6:
                super.onLayout(z9, i7, i10, i11, i12);
                x90 x90Var = (x90) ((a8.r7) this.f5027c).f616e;
                if (x90Var != null) {
                    x90Var.run();
                    return;
                }
                return;
            case 21:
                super.onLayout(z9, i7, i10, i11, i12);
                int i13 = (i12 - i10) / 4;
                int i14 = i13 * 3;
                int y10 = org.telegram.messenger.camera.q.y(275.0f, i14, 2);
                u50 u50Var = (u50) this.f5027c;
                FrameLayout frameLayout = u50Var.f50212r;
                int i15 = 0;
                frameLayout.layout(0, y10, frameLayout.getMeasuredWidth(), u50Var.f50212r.getMeasuredHeight() + y10);
                int L = org.telegram.messenger.g0.L(139.0f) + org.telegram.messenger.g0.L(150.0f) + y10;
                int measuredWidth = (getMeasuredWidth() - u50Var.f50209e.getMeasuredWidth()) / 2;
                org.telegram.ui.Components.ea eaVar = u50Var.f50209e;
                eaVar.layout(measuredWidth, L, eaVar.getMeasuredWidth() + measuredWidth, u50Var.f50209e.getMeasuredHeight() + L);
                c5.k kVar = u50Var.d;
                kVar.layout(0, 0, kVar.getMeasuredWidth(), u50Var.d.getMeasuredHeight());
                int measuredHeight = ((i13 - u50Var.f50211n.getMeasuredHeight()) / 2) + i14;
                int measuredWidth2 = (getMeasuredWidth() - u50Var.f50211n.getMeasuredWidth()) / 2;
                ei.k kVar2 = u50Var.f50211n;
                kVar2.layout(measuredWidth2, measuredHeight, kVar2.getMeasuredWidth() + measuredWidth2, u50Var.f50211n.getMeasuredHeight() + measuredHeight);
                int L2 = measuredHeight - org.telegram.messenger.g0.L(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - u50Var.f50210f.getMeasuredWidth()) / 2;
                TextView textView = u50Var.f50210f;
                textView.layout(measuredWidth3, L2 - textView.getMeasuredHeight(), u50Var.f50210f.getMeasuredWidth() + measuredWidth3, L2);
                FrameLayout frameLayout2 = (FrameLayout) this.f5026b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
                int L3 = org.telegram.messenger.g0.L(4);
                if (!org.telegram.messenger.g0.Q1()) {
                    i15 = org.telegram.messenger.g0.f22531m;
                }
                int i16 = L3 + i15;
                if (marginLayoutParams.topMargin != i16) {
                    marginLayoutParams.topMargin = i16;
                    frameLayout2.requestLayout();
                    return;
                }
                return;
            case 22:
                int L4 = org.telegram.messenger.g0.L(25.0f) + org.telegram.messenger.g0.L(150.0f) + org.telegram.messenger.camera.q.y(275.0f, ((i12 - i10) / 4) * 3, 2);
                int L5 = org.telegram.messenger.g0.L(18.0f);
                TextView textView2 = (TextView) this.f5026b;
                textView2.layout(L5, L4, textView2.getMeasuredWidth() + L5, textView2.getMeasuredHeight() + L4);
                int L6 = org.telegram.messenger.g0.L(18.0f) + L4 + ((int) textView2.getTextSize());
                int L7 = org.telegram.messenger.g0.L(16.0f);
                TextView textView3 = (TextView) this.f5027c;
                textView3.layout(L7, L6, textView3.getMeasuredWidth() + L7, textView3.getMeasuredHeight() + L6);
                return;
            case 23:
                super.onLayout(z9, i7, i10, i11, i12);
                ((ProfileActivity) this.f5027c).q5();
                return;
            case 24:
                super.onLayout(z9, i7, i10, i11, i12);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f5027c;
                if (secretMediaViewer.f41898n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f41898n.getMeasuredHeight()) / 2) + org.telegram.messenger.g0.f22531m;
                    kz0 kz0Var = secretMediaViewer.f41898n;
                    kz0Var.layout(kz0Var.getLeft(), currentActionBarHeight, secretMediaViewer.f41898n.getRight(), secretMediaViewer.f41898n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.f41906r != null && secretMediaViewer.f41898n != null) {
                    int measuredHeight2 = (secretMediaViewer.f41898n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f41898n.getMeasuredHeight()) / 2) + org.telegram.messenger.g0.f22531m)) - org.telegram.messenger.g0.L(10.0f);
                    fi.m3 m3Var = secretMediaViewer.f41906r;
                    m3Var.layout(m3Var.getLeft(), measuredHeight2, secretMediaViewer.f41906r.getRight(), secretMediaViewer.f41906r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.Y != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22531m;
                    up0 up0Var = secretMediaViewer.Y;
                    up0Var.layout(up0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.Y.getRight(), secretMediaViewer.Y.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f41883f;
                if (view != null) {
                    int i17 = i12 - i10;
                    view.layout(0, i17, i11 - i7, org.telegram.messenger.g0.f22532n + i17);
                    return;
                }
                return;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        int i11;
        boolean z9;
        int i12;
        float f10;
        boolean z10;
        float f11;
        float f12;
        float f13;
        float f14;
        StaticLayout staticLayout;
        int L;
        int measuredHeight;
        switch (this.f5025a) {
            case 1:
                float f15 = 8.0f;
                int size = View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(8.0f);
                TextView textView = (TextView) this.f5027c;
                CharSequence text = textView.getText();
                if (size > 0 && !TextUtils.isEmpty(text)) {
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
                    TextPaint textPaint = new TextPaint(textView.getPaint());
                    textPaint.setTextSize(org.telegram.messenger.g0.L(12.0f));
                    float measureText = textPaint.measureText(text, 0, text.length());
                    float f16 = size;
                    if (measureText > f16) {
                        textPaint.setTextSize(org.telegram.messenger.g0.L(11.0f));
                        String[] split = text.toString().split("\\s+");
                        int length = split.length;
                        int i13 = 0;
                        while (true) {
                            if (i13 < length) {
                                if (textPaint.measureText(split[i13]) > f16) {
                                    staticLayout = null;
                                    f13 = f16;
                                    f14 = 12.0f;
                                    i11 = 2;
                                    z9 = true;
                                } else {
                                    i13++;
                                }
                            } else {
                                f13 = f16;
                                f14 = 12.0f;
                                i11 = 2;
                                z9 = true;
                                staticLayout = new StaticLayout(text, textPaint, size, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            }
                        }
                        if (staticLayout != null && staticLayout.getLineCount() <= i11) {
                            i12 = i11;
                            f10 = 11.0f;
                        } else {
                            f10 = Math.max(8.0f, (f13 * f14) / measureText);
                            i12 = z9 ? 1 : 0;
                        }
                    } else {
                        i11 = 2;
                        z9 = true;
                        i12 = 1;
                        f10 = 12.0f;
                    }
                    textView.setTextSize(z9 ? 1 : 0, f10);
                    textView.setMaxLines(i12);
                    if (i12 == z9) {
                        z10 = z9 ? 1 : 0;
                    } else {
                        z10 = false;
                    }
                    textView.setSingleLine(z10);
                    if (i12 == i11) {
                        f11 = 0.85f;
                    } else {
                        f11 = 1.0f;
                    }
                    textView.setLineSpacing(0.0f, f11);
                    if (i12 == i11) {
                        z9 = false;
                    }
                    textView.setIncludeFontPadding(z9);
                    if (i12 == i11) {
                        f12 = 29.0f;
                    } else {
                        f12 = 35.0f;
                    }
                    layoutParams.topMargin = org.telegram.messenger.g0.L(f12);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((ImageView) this.f5026b).getLayoutParams();
                    if (i12 == i11) {
                        f15 = 4.0f;
                    }
                    layoutParams2.topMargin = org.telegram.messenger.g0.L(f15);
                }
                super.onMeasure(i7, i10);
                return;
            case 5:
                ViewGroup viewGroup = (ViewGroup) this.f5026b;
                jg.e eVar = (jg.e) this.f5027c;
                if (eVar.K && eVar.J) {
                    super.onMeasure(i7, i10);
                    return;
                }
                int size2 = View.MeasureSpec.getSize(i10);
                if (size2 == 0) {
                    size2 = viewGroup.getMeasuredHeight();
                }
                if (size2 == 0) {
                    size2 = (org.telegram.messenger.g0.f22537q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f22531m;
                }
                int L2 = org.telegram.messenger.g0.L(50.0f);
                int i14 = 0;
                if (eVar.f16707w != 0) {
                    L = 0;
                } else {
                    L = org.telegram.messenger.g0.L(30.0f) + L2;
                }
                if (!eVar.E && !eVar.f16708x) {
                    L += L2;
                }
                int paddingTop = (size2 - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
                if (L < paddingTop) {
                    i14 = paddingTop - L;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
                return;
            case 7:
                super.onMeasure(i7, i10);
                super.onMeasure(i7, org.telegram.messenger.camera.q.B(8.0f, ((LinearLayout) this.f5026b).getMeasuredHeight(), 1073741824));
                return;
            case 9:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(350.0f), 1073741824));
                return;
            case 13:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                return;
            case 24:
                super.onMeasure(i7, i10);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f5027c;
                up0 up0Var = secretMediaViewer.Y;
                if (up0Var != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                    int currentActionBarHeight = (measuredHeight2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f22531m;
                    if (secretMediaViewer.S.getVisibility() != 0) {
                        measuredHeight = 0;
                    } else {
                        measuredHeight = secretMediaViewer.S.getMeasuredHeight();
                    }
                    up0Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(currentActionBarHeight - measuredHeight, 1073741824));
                }
                View view = secretMediaViewer.f41883f;
                if (view != null) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f22532n, 1073741824));
                    return;
                }
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i7, int i10, int i11, int i12) {
        switch (this.f5025a) {
            case 15:
                ec0 ec0Var = (ec0) this.f5027c;
                ri.b bVar = ec0Var.H;
                super.onSizeChanged(i7, i10, i11, i12);
                if (i7 > 0 && i10 > 0) {
                    ec0Var.J = Bitmap.createBitmap(54, Math.max(1, Math.round((i10 * 54) / i7)), Bitmap.Config.ARGB_8888);
                    ec0Var.K = new Canvas(ec0Var.J);
                    bVar.a(ec0Var.J);
                    bVar.b(i7, i10);
                    return;
                }
                return;
            default:
                super.onSizeChanged(i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: bi.x5.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setBackgroundColor(int i7) {
        switch (this.f5025a) {
            case 15:
                ((Paint) this.f5026b).setColor(i7);
                return;
            default:
                super.setBackgroundColor(i7);
                return;
        }
    }

    public x5(int i7, Context context, boolean z9) {
        super(context);
        this.f5025a = i7;
    }

    public x5(Object obj, Context context, Object obj2, int i7) {
        super(context);
        this.f5025a = i7;
        this.f5027c = obj;
        this.f5026b = obj2;
    }

    public x5(org.telegram.ui.Cells.w0 w0Var, Context context) {
        super(context);
        this.f5025a = 10;
        this.f5027c = w0Var;
        this.f5026b = new RectF();
    }

    public x5(ch.b0 b0Var, Context context) {
        super(context);
        this.f5025a = 3;
        this.f5027c = b0Var;
        this.f5026b = new ch.v(this, 0);
    }

    public x5(org.telegram.ui.rb rbVar, Context context) {
        super(context);
        this.f5025a = 11;
        this.f5027c = rbVar;
        this.f5026b = new Paint(1);
    }

    public x5(rz0 rz0Var, Context context) {
        super(context);
        this.f5025a = 25;
        this.f5027c = rz0Var;
        this.f5026b = new Path();
    }

    public x5(org.telegram.ui.n5 n5Var, Activity activity) {
        super(activity);
        this.f5025a = 8;
        this.f5027c = n5Var;
        this.f5026b = new Paint(1);
    }

    public x5(ch.o oVar, Context context) {
        super(context);
        this.f5025a = 2;
        this.f5027c = oVar;
        this.f5026b = new ch.k(this, this);
    }

    public x5(Context context, org.telegram.ui.Components.voip.i1 i1Var) {
        super(context);
        this.f5025a = 18;
        this.f5027c = new RectF();
        this.f5026b = i1Var;
        i1Var.a(this);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(org.telegram.messenger.hd.M0(2131743255, null));
        textView.setTextSize(1, 15.0f);
        textView.setGravity(1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(-1);
        textView2.setGravity(1);
        textView2.setText(org.telegram.messenger.hd.M0(2131743256, null));
        addView(textView, c8.ha.d(-1, -2.0f, 3, 0.0f, 24.0f, 0.0f, 0.0f));
        addView(textView2, c8.ha.d(-1, -2.0f, 3, 0.0f, 50.0f, 0.0f, 0.0f));
    }

    private final void c(boolean z9) {
    }

    public x5(a8.r7 r7Var, Context context) {
        super(context);
        this.f5025a = 6;
        this.f5027c = r7Var;
        ?? obj = new Object();
        obj.d = new cb.c((Object) obj, 1);
        obj.f19230g = new ArrayList();
        obj.f19228e = this;
        obj.f19225a = context;
        this.f5026b = obj;
        setClickable(true);
    }

    public x5(ec0 ec0Var, Context context) {
        super(context);
        this.f5025a = 15;
        this.f5027c = ec0Var;
        this.f5026b = new Paint();
    }

    public x5(org.telegram.ui.Wallet.y5 y5Var, Context context) {
        super(context);
        this.f5025a = 29;
        this.f5027c = y5Var;
        this.f5026b = new org.telegram.ui.Wallet.l5(0, this);
    }

    public x5(Context context, TextView textView, TextView textView2) {
        super(context);
        this.f5025a = 22;
        this.f5026b = textView;
        this.f5027c = textView2;
    }

    public x5(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f5025a = 24;
        this.f5027c = secretMediaViewer;
        this.f5026b = secretMediaViewer;
        setWillNotDraw(false);
    }

    public x5(q11 q11Var, Context context) {
        super(context);
        this.f5025a = 26;
        this.f5027c = q11Var;
        this.f5026b = new Rect();
    }

    public x5(vo voVar, Context context) {
        super(context);
        this.f5025a = 13;
        this.f5027c = voVar;
        this.f5026b = new Paint();
    }

    public x5(ks ksVar, Activity activity) {
        super(activity);
        this.f5025a = 20;
        this.f5027c = ksVar;
        this.f5026b = ksVar;
        setWillNotDraw(false);
    }

    public x5(u71 u71Var, Context context, int i7) {
        super(context);
        this.f5025a = i7;
        switch (i7) {
            case 28:
                this.f5027c = u71Var;
                super(context);
                this.f5026b = new int[2];
                return;
            default:
                this.f5027c = u71Var;
                this.f5026b = new Paint();
                return;
        }
    }

    public x5(Context context, int i7) {
        super(context);
        this.f5025a = i7;
        switch (i7) {
            case 12:
                super(context);
                this.f5026b = new Path();
                this.f5027c = new h6.m(28);
                return;
            default:
                ImageView imageView = new ImageView(context);
                this.f5026b = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                addView(imageView, c8.ha.d(24, 24.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                this.f5027c = textView;
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                textView.setGravity(17);
                addView(textView, c8.ha.d(-1, -2.0f, 49, 4.0f, 35.0f, 4.0f, 0.0f));
                return;
        }
    }

    public x5(ii0 ii0Var, Context context) {
        super(context);
        this.f5025a = 16;
        this.f5027c = ii0Var;
        this.f5026b = new Paint(1);
    }

    public x5(fi.l5 l5Var, Context context) {
        super(context);
        this.f5025a = 4;
        this.f5027c = l5Var;
        this.f5026b = new Path();
    }
}
