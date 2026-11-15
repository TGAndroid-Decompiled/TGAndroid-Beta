package ai;

import a8.r7;
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
import c8.i9;
import c8.ja;
import hi.j5;
import hi.l3;
import java.util.ArrayList;
import org.telegram.messenger.ab;
import org.telegram.messenger.ha;
import org.telegram.messenger.hd;
import org.telegram.messenger.i20;
import org.telegram.messenger.k5;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Cells.t9;
import org.telegram.ui.Components.aa;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.h6;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.Components.tb0;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.yx;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.g4;
import org.telegram.ui.iz0;
import org.telegram.ui.n11;
import org.telegram.ui.n5;
import org.telegram.ui.ns;
import org.telegram.ui.pu0;
import org.telegram.ui.pz0;
import org.telegram.ui.qb;
import org.telegram.ui.r01;
import org.telegram.ui.r6;
import org.telegram.ui.s01;
import org.telegram.ui.t01;
import org.telegram.ui.t50;
import org.telegram.ui.t71;
import org.telegram.ui.up0;
import org.telegram.ui.x01;
import org.telegram.ui.y10;
import org.telegram.ui.y90;
public final class k0 extends FrameLayout {
    public final int f1271a;
    public Object f1272b;
    public Object f1273c;

    public k0(int i7, Context context, Object obj) {
        super(context);
        this.f1271a = i7;
        this.f1273c = obj;
    }

    public void d(Canvas canvas) {
        fc0 fc0Var = (fc0) this.f1273c;
        Drawable drawable = fc0Var.f34564a;
        if (drawable != null) {
            if (!(drawable instanceof ra0) && !(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable)) {
                int max = Math.max(0, fc0Var.H);
                float max2 = Math.max(getMeasuredWidth() / fc0Var.f34564a.getIntrinsicWidth(), (getMeasuredHeight() + max) / fc0Var.f34564a.getIntrinsicHeight());
                int ceil = (int) Math.ceil(fc0Var.f34564a.getIntrinsicWidth() * max2);
                int ceil2 = (int) Math.ceil(fc0Var.f34564a.getIntrinsicHeight() * max2);
                int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                int measuredHeight = ((getMeasuredHeight() - ceil2) + max) / 2;
                fc0Var.f34564a.setBounds(measuredWidth, measuredHeight, ceil + measuredWidth, ceil2 + measuredHeight);
                fc0Var.f34564a.draw(canvas);
            } else {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                fc0Var.f34564a.draw(canvas);
            }
        } else {
            super.onDraw(canvas);
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (Paint) this.f1272b);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        e6 e6Var;
        Paint paint;
        boolean d12;
        int o4;
        ?? r12;
        ?? r13;
        float f10;
        float f11;
        float f12;
        org.telegram.ui.Cells.y yVar;
        float f13;
        Paint paint2 = null;
        switch (this.f1271a) {
            case 0:
                super.dispatchDraw(canvas);
                float L = org.telegram.messenger.g0.L(28.0f);
                float height = getHeight() / 2.0f;
                canvas.drawCircle(L, height, org.telegram.messenger.g0.N(9.2f), (Paint) this.f1272b);
                for (int i7 = -1; i7 <= 1; i7++) {
                    canvas.drawCircle(org.telegram.ui.Cells.y0.d(4.0f, i7, L), height, org.telegram.messenger.g0.N(1.35f), (Paint) this.f1273c);
                }
                return;
            case 10:
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.f1272b;
                int i10 = j6.f28792a7;
                e6Var = ((org.telegram.ui.ActionBar.e2) ((n5) this.f1273c).d).resourceProvider;
                paint3.setColor(j6.w0(i10, e6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint3);
                return;
            case 12:
                RectF rectF = (RectF) this.f1272b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) this.f1273c;
                int measuredWidth = w0Var.getMeasuredWidth();
                int i11 = w0Var.f31850e;
                float x10 = w0Var.getX();
                float f14 = w0Var.d;
                e6 e6Var2 = w0Var.f31849c;
                if (e6Var2 != null) {
                    e6Var2.b(x10, f14, measuredWidth, i11);
                } else {
                    j6.r(x10, f14, measuredWidth, i11);
                }
                float L2 = org.telegram.messenger.g0.L(18.0f);
                float L3 = org.telegram.messenger.g0.L(18.0f);
                if (e6Var2 != null) {
                    paint = e6Var2.d("paintChatActionBackground");
                } else {
                    paint = null;
                }
                if (paint == null) {
                    paint = j6.V0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, L2, L3, paint);
                if (e6Var2 != null) {
                    d12 = e6Var2.g();
                } else {
                    d12 = j6.d1();
                }
                if (d12) {
                    float L4 = org.telegram.messenger.g0.L(18.0f);
                    float L5 = org.telegram.messenger.g0.L(18.0f);
                    if (e6Var2 != null) {
                        paint2 = e6Var2.d("paintChatActionBackgroundDarken");
                    }
                    if (paint2 == null) {
                        paint2 = j6.V0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF, L4, L5, paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 13:
                super.dispatchDraw(canvas);
                Paint paint4 = (Paint) this.f1272b;
                paint4.setColor(j6.w0(j6.f28792a7, ((qb) this.f1273c).f50538f.f51175e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint4);
                return;
            case 14:
                float L6 = org.telegram.messenger.g0.L(20.0f);
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.f1272b;
                path.rewind();
                path.addRoundRect(rectF2, L6, L6, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF2, 255, 31);
                super.dispatchDraw(canvas);
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), org.telegram.messenger.g0.L(6.0f) + getPaddingTop());
                h6.m mVar = (h6.m) this.f1273c;
                mVar.m(canvas, rectF2, 1, 1.0f);
                rectF2.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - org.telegram.messenger.g0.L(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                mVar.m(canvas, rectF2, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                return;
            case 15:
                super.dispatchDraw(canvas);
                Paint paint5 = (Paint) this.f1272b;
                paint5.setColor(j6.w0(j6.f28850d7, ((ep) this.f1273c).J0));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint5);
                return;
            case 16:
                yx yxVar = (yx) this.f1273c;
                if (!yxVar.H.f36995v0 && yxVar.f42184x > 0.0f) {
                    if (((Paint) this.f1272b) == null) {
                        Paint paint6 = new Paint();
                        this.f1272b = paint6;
                        paint6.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f1272b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f1272b).setAlpha((int) (yxVar.f42184x * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), getMeasuredHeight(), (Paint) this.f1272b);
                    canvas.restore();
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 18:
                Paint paint7 = (Paint) this.f1272b;
                mi0 mi0Var = (mi0) this.f1273c;
                int i12 = mi0Var.N0;
                if (i12 != 1 && i12 != 2 && i12 != 4) {
                    o4 = i0.a.f(0.7f, j6.w0(j6.F8, mi0Var.f37282l0), j6.w0(j6.f28922h5, mi0Var.f37282l0));
                } else {
                    o4 = i0.a.o(-1, 30);
                }
                paint7.setColor(o4);
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - org.telegram.messenger.g0.N(6.0f)) / 2.0f;
                float g10 = mi0Var.g();
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
            case 19:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.f1272b;
                y10 y10Var = (y10) this.f1273c;
                w8 w8Var = y10Var.K;
                TextView textView = y10Var.L;
                float f15 = y10Var.P;
                if (f15 == 1.0f) {
                    shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    w8Var.setTranslationX(0.0f);
                    textView.setTranslationX(0.0f);
                } else {
                    float interpolation = 1.0f - er.f34419f.getInterpolation(f15);
                    float left = (y10Var.Q - getLeft()) * interpolation;
                    shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((y10Var.S - getRight()) * interpolation)), getMeasuredHeight());
                    w8Var.setTranslationX(left);
                    textView.setTranslationX(-((y10Var.R - textView.getLeft()) * interpolation));
                }
                shapeDrawable.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 20:
                RectF rectF4 = (RectF) this.f1273c;
                rectF4.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Components.voip.m1 m1Var = (org.telegram.ui.Components.voip.m1) this.f1272b;
                m1Var.d(((View) getParent()).getX() + getX(), ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF4, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), m1Var.b());
                super.dispatchDraw(canvas);
                return;
            case 25:
                super.dispatchDraw(canvas);
                ProfileActivity profileActivity = (ProfileActivity) this.f1273c;
                if (profileActivity.Y4 != null) {
                    canvas.save();
                    canvas.translate(profileActivity.f43181r.getX() + profileActivity.Z4, profileActivity.f43181r.getY());
                    f10 = 0.0f;
                    r12 = 0;
                    r13 = 1;
                    f11 = 2.0f;
                    f12 = 28.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.Y4.getMeasuredWidth(), profileActivity.Y4.getMeasuredHeight(), (int) ((1.0f - profileActivity.T1) * 255.0f), 31);
                    profileActivity.Y4.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    r12 = 0;
                    r13 = 1;
                    f10 = 0.0f;
                    f11 = 2.0f;
                    f12 = 28.0f;
                }
                if (profileActivity.f43201t5 && profileActivity.f43215v6 != f10 && profileActivity.f43187r5 != 1.0f) {
                    float measuredHeight2 = (profileActivity.f43181r.getMeasuredHeight() / f11) + profileActivity.f43181r.getY();
                    float L7 = org.telegram.messenger.g0.L(22.0f);
                    float x11 = ((profileActivity.f43181r.getX() + (org.telegram.messenger.g0.L(f12) - profileActivity.s5)) - L7) - profileActivity.q4();
                    profileActivity.f43214v5.y0(x11, measuredHeight2 - (L7 / f11), L7, L7);
                    profileActivity.f43214v5.setAlpha(profileActivity.f43215v6);
                    canvas.save();
                    float f16 = profileActivity.f43215v6;
                    canvas.scale(f16, f16, profileActivity.f43214v5.r(), profileActivity.f43214v5.s());
                    profileActivity.f43214v5.h(canvas, null);
                    canvas.restore();
                    if (profileActivity.f43187r5 == f10) {
                        if (((kc) this.f1272b) == null) {
                            kc kcVar = new kc(this);
                            this.f1272b = kcVar;
                            kcVar.h = new pu0(this, r13);
                        }
                        float L8 = (1.0f - profileActivity.f43187r5) * org.telegram.messenger.g0.L(f12);
                        float textWidth = profileActivity.f43181r.getTextWidth();
                        if (profileActivity.T != null) {
                            f13 = profileActivity.T.getVisibilityFactor() * (org.telegram.messenger.g0.L(24.0f) + textWidth + org.telegram.messenger.g0.L(4.0f));
                        } else {
                            f13 = f10;
                        }
                        RectF rectF5 = org.telegram.messenger.g0.P;
                        rectF5.set(x11 - org.telegram.messenger.g0.L(4.0f), measuredHeight2 - org.telegram.messenger.g0.L(14.0f), x11 + Math.max(textWidth, f13) + L8 + org.telegram.messenger.g0.L(4.0f), measuredHeight2 + org.telegram.messenger.g0.L(14.0f));
                        kc kcVar2 = (kc) this.f1272b;
                        kcVar2.f36366i = r12;
                        kcVar2.f36362c = r12;
                        kcVar2.a(rectF5);
                        kc kcVar3 = (kc) this.f1272b;
                        kcVar3.f36371n = r13;
                        int o10 = i0.a.o(-1, 50);
                        kcVar3.f36365g.setColor((int) r12);
                        org.telegram.ui.Cells.y yVar2 = kcVar3.f36363e;
                        if (yVar2 != null) {
                            j6.H1(yVar2, o10, r13);
                        }
                        kc kcVar4 = (kc) this.f1272b;
                        kcVar4.c(canvas, kcVar4.f36365g);
                        org.telegram.ui.Cells.y yVar3 = kcVar4.f36363e;
                        if (yVar3 != null) {
                            yVar3.draw(canvas);
                            return;
                        }
                        return;
                    }
                    kc kcVar5 = (kc) this.f1272b;
                    if (kcVar5 != null && (yVar = kcVar5.f36363e) != null) {
                        yVar.setState(StateSet.NOTHING);
                        yVar.jumpToCurrentState();
                        return;
                    }
                    return;
                }
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.f1271a) {
            case 3:
                if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
                    ch.b0 b0Var = (ch.b0) this.f1273c;
                    if (!b0Var.f5019k) {
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
    public void dispatchSetPressed(boolean z10) {
        switch (this.f1271a) {
            case 3:
                return;
            default:
                super.dispatchSetPressed(z10);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f1271a) {
            case 8:
                ab abVar = (ab) ((r7) this.f1273c).f618c;
                if (abVar != null) {
                    return abVar.c(motionEvent, new ha(this, 0));
                }
                return super.dispatchTouchEvent(motionEvent);
            case 9:
                g4 g4Var = (g4) this.f1273c;
                t9 n10 = g4Var.R0.n(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.f1272b;
                obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (g4Var.R0.x() && g4Var.R0.n(getContext()).onTouchEvent(obtain)) {
                    return true;
                }
                if (n10.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() == 0 && g4Var.R0.x() && (motionEvent.getY() < linearLayout.getTop() || motionEvent.getY() > linearLayout.getBottom())) {
                    if (!g4Var.R0.n(getContext()).onTouchEvent(obtain)) {
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
        boolean z10;
        float f10;
        Rect rect;
        switch (this.f1271a) {
            case 6:
                Path path = (Path) this.f1272b;
                j5 j5Var = (j5) this.f1273c;
                if (j5Var.h != null && (((z10 = j5Var.f14466f) && view == j5Var.d) || (!z10 && view == j5Var.f14464c))) {
                    if (z10) {
                        f10 = j5Var.f14465e;
                    } else {
                        f10 = 1.0f - j5Var.f14465e;
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
            case 22:
                if (view instanceof tb0) {
                    return false;
                }
                return super.drawChild(canvas, view, j3);
            case 25:
                ProfileActivity profileActivity = (ProfileActivity) this.f1273c;
                float f11 = profileActivity.R1;
                if (f11 < 1.0f && view != profileActivity.f43063a0 && view != profileActivity.f43079c0 && view != profileActivity.f43086d0) {
                    if (f11 <= 0.0f) {
                        return false;
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (profileActivity.R1 * 255.0f), 31);
                    boolean drawChild2 = super.drawChild(canvas, view, j3);
                    canvas.restore();
                    return drawChild2;
                }
                return super.drawChild(canvas, view, j3);
            case 26:
                if (view != ((SecretMediaViewer) this.f1272b).f43319x && super.drawChild(canvas, view, j3)) {
                    return true;
                }
                return false;
            case 27:
                Path path2 = (Path) this.f1272b;
                pz0 pz0Var = (pz0) this.f1273c;
                RectF rectF = pz0Var.S;
                if (view != pz0Var.O && view != pz0Var.f50406y) {
                    if (view == pz0Var.Q) {
                        canvas.save();
                        path2.rewind();
                        path2.addCircle(rectF.centerX() + pz0Var.O.getX(), rectF.centerY() + pz0Var.O.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                        canvas.clipPath(path2);
                        canvas.clipRect(0.0f, org.telegram.messenger.g0.T1(pz0Var.U, 0.0f, pz0Var.f50403s), getWidth(), org.telegram.messenger.g0.T1(pz0Var.V, getHeight(), pz0Var.f50403s));
                        canvas.translate(-pz0Var.Q.getX(), -pz0Var.Q.getY());
                        canvas.translate(pz0Var.O.getX() + rectF.left, pz0Var.O.getY() + rectF.top);
                        canvas.scale(rectF.width() / pz0Var.Q.getMeasuredWidth(), rectF.height() / pz0Var.Q.getMeasuredHeight(), pz0Var.Q.getX(), pz0Var.Q.getY());
                        boolean drawChild3 = super.drawChild(canvas, view, j3);
                        canvas.restore();
                        return drawChild3;
                    }
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, org.telegram.messenger.g0.T1(pz0Var.U, 0.0f, pz0Var.f50403s), getWidth(), org.telegram.messenger.g0.T1(pz0Var.V, getHeight(), pz0Var.f50403s));
                boolean drawChild4 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild4;
            case 28:
                if (view == ((n11) this.f1273c).f49385i0 && ch.f0.f5068b && ch.f0.f5071f) {
                    for (int i7 = 0; i7 < ((n11) this.f1273c).f49385i0.getChildCount(); i7++) {
                        View childAt = ((n11) this.f1273c).f49385i0.getChildAt(i7);
                        if (childAt instanceof x01) {
                            x01 x01Var = (x01) childAt;
                            if (x01Var.getAnimatedScale() == 1.0f) {
                                ((Rect) this.f1272b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                canvas.save();
                                canvas.clipRect((Rect) this.f1272b);
                                super.drawChild(canvas, view, j3);
                                canvas.restore();
                            } else if (x01Var.getAnimatedScale() > 0.0f) {
                                ((Rect) this.f1272b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                ((Rect) this.f1272b).set((int) (rect.centerX() - (x01Var.getAnimatedScale() * (((Rect) this.f1272b).width() / 2.0f))), (int) (((Rect) this.f1272b).centerY() - (x01Var.getAnimatedScale() * (((Rect) this.f1272b).height() / 2.0f))), (int) ((x01Var.getAnimatedScale() * (((Rect) this.f1272b).width() / 2.0f)) + ((Rect) this.f1272b).centerX()), (int) ((x01Var.getAnimatedScale() * (((Rect) this.f1272b).height() / 2.0f)) + ((Rect) this.f1272b).centerY()));
                                canvas.save();
                                canvas.clipRect((Rect) this.f1272b);
                                canvas.scale(x01Var.getAnimatedScale(), x01Var.getAnimatedScale(), ((Rect) this.f1272b).centerX(), ((Rect) this.f1272b).centerY());
                                super.drawChild(canvas, view, j3);
                                canvas.restore();
                            }
                        } else if ((childAt instanceof TextView) || (childAt instanceof s01) || (childAt instanceof r01) || (childAt instanceof t01)) {
                            ((Rect) this.f1272b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.f1272b);
                            super.drawChild(canvas, view, j3);
                            canvas.restore();
                        }
                    }
                    return false;
                }
                return super.drawChild(canvas, view, j3);
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    public void e(int i7, CharSequence charSequence, boolean z10) {
        ImageView imageView = (ImageView) this.f1272b;
        if (z10) {
            org.telegram.messenger.g0.Q3(imageView, i7);
        } else {
            imageView.setImageResource(i7);
        }
        ((TextView) this.f1273c).setText(charSequence);
        requestLayout();
    }

    public void f(float f10) {
        h6 h6Var = (h6) this.f1272b;
        h6Var.a();
        h6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(i9.a(f10, 0.0f, 1.0f) * 100.0f))), !hd.f24104a0, true);
        r6 r6Var = (r6) this.f1273c;
        r6Var.f50853c = f10;
        r6Var.invalidate();
    }

    @Override
    public boolean fitSystemWindows(Rect rect) {
        switch (this.f1271a) {
            case 3:
                ch.b0 b0Var = (ch.b0) this.f1273c;
                float f10 = b0Var.f5029u;
                float f11 = rect.bottom;
                if (f10 != f11 && b0Var.v) {
                    b0Var.f5029u = f11;
                    k0 k0Var = b0Var.f5013c;
                    ch.a0 a0Var = b0Var.f5011a;
                    if (!b0Var.f5025q) {
                        float f12 = b0Var.f5028t;
                        int L = org.telegram.messenger.g0.L(32.0f);
                        int i7 = b0Var.f5032y;
                        if (i7 == 1 || i7 == 2) {
                            L = org.telegram.messenger.g0.L(24.0f);
                        }
                        float f13 = L;
                        if (a0Var.getMeasuredHeight() + f12 > (k0Var.getMeasuredHeight() - b0Var.f5029u) - f13) {
                            f12 = ((k0Var.getMeasuredHeight() - b0Var.f5029u) - a0Var.getMeasuredHeight()) - f13;
                        }
                        if (f12 < 0.0f) {
                            f12 = 0.0f;
                        }
                        a0Var.animate().translationY(f12).setDuration(250L).setUpdateListener(new ch.t(b0Var, 1)).setInterpolator(er.f34419f).start();
                    }
                }
                return super.fitSystemWindows(rect);
            default:
                return super.fitSystemWindows(rect);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f1271a) {
            case 2:
                super.onAttachedToWindow();
                ((ch.k) this.f1272b).c();
                return;
            case 3:
                super.onAttachedToWindow();
                setTag(2131296351, (bi.e1) this.f1272b);
                return;
            case 22:
                super.onAttachedToWindow();
                ns nsVar = (ns) this.f1273c;
                nsVar.A.P();
                nsVar.B.P();
                return;
            case 25:
                super.onAttachedToWindow();
                ((ProfileActivity) this.f1273c).f43214v5.P();
                return;
            case 26:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.f1272b).h.P();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f1271a) {
            case 2:
                super.onDetachedFromWindow();
                ((ch.k) this.f1272b).d();
                return;
            case 3:
                super.onDetachedFromWindow();
                setTag(2131296351, null);
                return;
            case 22:
                super.onDetachedFromWindow();
                ns nsVar = (ns) this.f1273c;
                nsVar.A.R();
                nsVar.B.R();
                return;
            case 25:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.f1273c).f43214v5.R();
                return;
            case 26:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.f1272b).h.R();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: ai.k0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        kc kcVar;
        switch (this.f1271a) {
            case 8:
                ab abVar = (ab) ((r7) this.f1273c).d;
                if (abVar != null) {
                    return abVar.c(motionEvent, new ha(this, 1));
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 25:
                if ((((ProfileActivity) this.f1273c).f43187r5 == 0.0f && (kcVar = (kc) this.f1272b) != null && kcVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f1271a) {
            case 8:
                super.onLayout(z10, i7, i10, i11, i12);
                y90 y90Var = (y90) ((r7) this.f1273c).f619e;
                if (y90Var != null) {
                    y90Var.run();
                    return;
                }
                return;
            case 23:
                super.onLayout(z10, i7, i10, i11, i12);
                int i13 = (i12 - i10) / 4;
                int i14 = i13 * 3;
                int y10 = i20.y(275.0f, i14, 2);
                t50 t50Var = (t50) this.f1273c;
                FrameLayout frameLayout = t50Var.f51380r;
                int i15 = 0;
                frameLayout.layout(0, y10, frameLayout.getMeasuredWidth(), t50Var.f51380r.getMeasuredHeight() + y10);
                int L = org.telegram.messenger.g0.L(139.0f) + org.telegram.messenger.g0.L(150.0f) + y10;
                int measuredWidth = (getMeasuredWidth() - t50Var.f51377e.getMeasuredWidth()) / 2;
                aa aaVar = t50Var.f51377e;
                aaVar.layout(measuredWidth, L, aaVar.getMeasuredWidth() + measuredWidth, t50Var.f51377e.getMeasuredHeight() + L);
                c5.l lVar = t50Var.d;
                lVar.layout(0, 0, lVar.getMeasuredWidth(), t50Var.d.getMeasuredHeight());
                int measuredHeight = ((i13 - t50Var.f51379n.getMeasuredHeight()) / 2) + i14;
                int measuredWidth2 = (getMeasuredWidth() - t50Var.f51379n.getMeasuredWidth()) / 2;
                gi.j jVar = t50Var.f51379n;
                jVar.layout(measuredWidth2, measuredHeight, jVar.getMeasuredWidth() + measuredWidth2, t50Var.f51379n.getMeasuredHeight() + measuredHeight);
                int L2 = measuredHeight - org.telegram.messenger.g0.L(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - t50Var.f51378f.getMeasuredWidth()) / 2;
                TextView textView = t50Var.f51378f;
                textView.layout(measuredWidth3, L2 - textView.getMeasuredHeight(), t50Var.f51378f.getMeasuredWidth() + measuredWidth3, L2);
                FrameLayout frameLayout2 = (FrameLayout) this.f1272b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
                int L3 = org.telegram.messenger.g0.L(4);
                if (!org.telegram.messenger.g0.Q1()) {
                    i15 = org.telegram.messenger.g0.f23605m;
                }
                int i16 = L3 + i15;
                if (marginLayoutParams.topMargin != i16) {
                    marginLayoutParams.topMargin = i16;
                    frameLayout2.requestLayout();
                    return;
                }
                return;
            case 24:
                int L4 = org.telegram.messenger.g0.L(25.0f) + org.telegram.messenger.g0.L(150.0f) + i20.y(275.0f, ((i12 - i10) / 4) * 3, 2);
                int L5 = org.telegram.messenger.g0.L(18.0f);
                TextView textView2 = (TextView) this.f1272b;
                textView2.layout(L5, L4, textView2.getMeasuredWidth() + L5, textView2.getMeasuredHeight() + L4);
                int L6 = org.telegram.messenger.g0.L(18.0f) + L4 + ((int) textView2.getTextSize());
                int L7 = org.telegram.messenger.g0.L(16.0f);
                TextView textView3 = (TextView) this.f1273c;
                textView3.layout(L7, L6, textView3.getMeasuredWidth() + L7, textView3.getMeasuredHeight() + L6);
                return;
            case 25:
                super.onLayout(z10, i7, i10, i11, i12);
                ((ProfileActivity) this.f1273c).s5();
                return;
            case 26:
                super.onLayout(z10, i7, i10, i11, i12);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f1273c;
                if (secretMediaViewer.f43297n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f43297n.getMeasuredHeight()) / 2) + org.telegram.messenger.g0.f23605m;
                    iz0 iz0Var = secretMediaViewer.f43297n;
                    iz0Var.layout(iz0Var.getLeft(), currentActionBarHeight, secretMediaViewer.f43297n.getRight(), secretMediaViewer.f43297n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.f43305r != null && secretMediaViewer.f43297n != null) {
                    int measuredHeight2 = (secretMediaViewer.f43297n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f43297n.getMeasuredHeight()) / 2) + org.telegram.messenger.g0.f23605m)) - org.telegram.messenger.g0.L(10.0f);
                    l3 l3Var = secretMediaViewer.f43305r;
                    l3Var.layout(l3Var.getLeft(), measuredHeight2, secretMediaViewer.f43305r.getRight(), secretMediaViewer.f43305r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.Z != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f23605m;
                    up0 up0Var = secretMediaViewer.Z;
                    up0Var.layout(up0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.Z.getRight(), secretMediaViewer.Z.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f43282f;
                if (view != null) {
                    int i17 = i12 - i10;
                    view.layout(0, i17, i11 - i7, org.telegram.messenger.g0.f23606n + i17);
                    return;
                }
                return;
            default:
                super.onLayout(z10, i7, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i7, int i10) {
        int i11;
        boolean z10;
        int i12;
        float f10;
        boolean z11;
        float f11;
        float f12;
        float f13;
        float f14;
        StaticLayout staticLayout;
        int L;
        int measuredHeight;
        switch (this.f1271a) {
            case 5:
                float f15 = 8.0f;
                int size = View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(8.0f);
                TextView textView = (TextView) this.f1273c;
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
                                    z10 = true;
                                } else {
                                    i13++;
                                }
                            } else {
                                f13 = f16;
                                f14 = 12.0f;
                                i11 = 2;
                                z10 = true;
                                staticLayout = new StaticLayout(text, textPaint, size, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                            }
                        }
                        if (staticLayout != null && staticLayout.getLineCount() <= i11) {
                            i12 = i11;
                            f10 = 11.0f;
                        } else {
                            f10 = Math.max(8.0f, (f13 * f14) / measureText);
                            i12 = z10 ? 1 : 0;
                        }
                    } else {
                        i11 = 2;
                        z10 = true;
                        i12 = 1;
                        f10 = 12.0f;
                    }
                    textView.setTextSize(z10 ? 1 : 0, f10);
                    textView.setMaxLines(i12);
                    if (i12 == z10) {
                        z11 = z10 ? 1 : 0;
                    } else {
                        z11 = false;
                    }
                    textView.setSingleLine(z11);
                    if (i12 == i11) {
                        f11 = 0.85f;
                    } else {
                        f11 = 1.0f;
                    }
                    textView.setLineSpacing(0.0f, f11);
                    if (i12 == i11) {
                        z10 = false;
                    }
                    textView.setIncludeFontPadding(z10);
                    if (i12 == i11) {
                        f12 = 29.0f;
                    } else {
                        f12 = 35.0f;
                    }
                    layoutParams.topMargin = org.telegram.messenger.g0.L(f12);
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((ImageView) this.f1272b).getLayoutParams();
                    if (i12 == i11) {
                        f15 = 4.0f;
                    }
                    layoutParams2.topMargin = org.telegram.messenger.g0.L(f15);
                }
                super.onMeasure(i7, i10);
                return;
            case 7:
                ViewGroup viewGroup = (ViewGroup) this.f1272b;
                jg.e eVar = (jg.e) this.f1273c;
                if (eVar.L && eVar.K) {
                    super.onMeasure(i7, i10);
                    return;
                }
                int size2 = View.MeasureSpec.getSize(i10);
                if (size2 == 0) {
                    size2 = viewGroup.getMeasuredHeight();
                }
                if (size2 == 0) {
                    size2 = (org.telegram.messenger.g0.f23611q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f23605m;
                }
                int L2 = org.telegram.messenger.g0.L(50.0f);
                int i14 = 0;
                if (eVar.f17059w != 0) {
                    L = 0;
                } else {
                    L = org.telegram.messenger.g0.L(30.0f) + L2;
                }
                if (!eVar.F && !eVar.f17060x) {
                    L += L2;
                }
                int paddingTop = (size2 - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
                if (L < paddingTop) {
                    i14 = paddingTop - L;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(i14, 1073741824));
                return;
            case 9:
                super.onMeasure(i7, i10);
                super.onMeasure(i7, i20.B(8.0f, ((LinearLayout) this.f1272b).getMeasuredHeight(), 1073741824));
                return;
            case 11:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(350.0f), 1073741824));
                return;
            case 15:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                return;
            case 26:
                super.onMeasure(i7, i10);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f1273c;
                up0 up0Var = secretMediaViewer.Z;
                if (up0Var != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                    int currentActionBarHeight = (measuredHeight2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f23605m;
                    if (secretMediaViewer.T.getVisibility() != 0) {
                        measuredHeight = 0;
                    } else {
                        measuredHeight = secretMediaViewer.T.getMeasuredHeight();
                    }
                    up0Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(currentActionBarHeight - measuredHeight, 1073741824));
                }
                View view = secretMediaViewer.f43282f;
                if (view != null) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f23606n, 1073741824));
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
        switch (this.f1271a) {
            case 17:
                fc0 fc0Var = (fc0) this.f1273c;
                ui.b bVar = fc0Var.I;
                super.onSizeChanged(i7, i10, i11, i12);
                if (i7 > 0 && i10 > 0) {
                    fc0Var.K = Bitmap.createBitmap(54, Math.max(1, Math.round((i10 * 54) / i7)), Bitmap.Config.ARGB_8888);
                    fc0Var.L = new Canvas(fc0Var.K);
                    bVar.a(fc0Var.K);
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
        throw new UnsupportedOperationException("Method not decompiled: ai.k0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setBackgroundColor(int i7) {
        switch (this.f1271a) {
            case 17:
                ((Paint) this.f1272b).setColor(i7);
                return;
            default:
                super.setBackgroundColor(i7);
                return;
        }
    }

    public k0(int i7, Context context, boolean z10) {
        super(context);
        this.f1271a = i7;
    }

    public k0(Object obj, Context context, Object obj2, int i7) {
        super(context);
        this.f1271a = i7;
        this.f1273c = obj;
        this.f1272b = obj2;
    }

    public k0(org.telegram.ui.Cells.w0 w0Var, Context context) {
        super(context);
        this.f1271a = 12;
        this.f1273c = w0Var;
        this.f1272b = new RectF();
    }

    public k0(ch.b0 b0Var, Context context) {
        super(context);
        this.f1271a = 3;
        this.f1273c = b0Var;
        this.f1272b = new bi.e1(this, 1);
    }

    public k0(qb qbVar, Context context) {
        super(context);
        this.f1271a = 13;
        this.f1273c = qbVar;
        this.f1272b = new Paint(1);
    }

    public k0(pz0 pz0Var, Context context) {
        super(context);
        this.f1271a = 27;
        this.f1273c = pz0Var;
        this.f1272b = new Path();
    }

    public k0(n5 n5Var, Activity activity) {
        super(activity);
        this.f1271a = 10;
        this.f1273c = n5Var;
        this.f1272b = new Paint(1);
    }

    public k0(ch.o oVar, Context context) {
        super(context);
        this.f1271a = 2;
        this.f1273c = oVar;
        this.f1272b = new ch.k(this, this);
    }

    public k0(Context context, org.telegram.ui.Components.voip.m1 m1Var) {
        super(context);
        this.f1271a = 20;
        this.f1273c = new RectF();
        this.f1272b = m1Var;
        m1Var.a(this);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        textView.setText(hd.M0(2131743254, null));
        textView.setTextSize(1, 15.0f);
        textView.setGravity(1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(-1);
        textView2.setGravity(1);
        textView2.setText(hd.M0(2131743255, null));
        addView(textView, ja.d(-1, -2.0f, 3, 0.0f, 24.0f, 0.0f, 0.0f));
        addView(textView2, ja.d(-1, -2.0f, 3, 0.0f, 50.0f, 0.0f, 0.0f));
    }

    private final void c(boolean z10) {
    }

    public k0(r7 r7Var, Context context) {
        super(context);
        this.f1271a = 8;
        this.f1273c = r7Var;
        ?? obj = new Object();
        obj.d = new cb.c((Object) obj, 1);
        obj.f19799g = new ArrayList();
        obj.f19797e = this;
        obj.f19794a = context;
        this.f1272b = obj;
        setClickable(true);
    }

    public k0(fc0 fc0Var, Context context) {
        super(context);
        this.f1271a = 17;
        this.f1273c = fc0Var;
        this.f1272b = new Paint();
    }

    public k0(Context context, TextView textView, TextView textView2) {
        super(context);
        this.f1271a = 24;
        this.f1272b = textView;
        this.f1273c = textView2;
    }

    public k0(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f1271a = 26;
        this.f1273c = secretMediaViewer;
        this.f1272b = secretMediaViewer;
        setWillNotDraw(false);
    }

    public k0(n11 n11Var, Context context) {
        super(context);
        this.f1271a = 28;
        this.f1273c = n11Var;
        this.f1272b = new Rect();
    }

    public k0(Context context, e6 e6Var) {
        super(context);
        this.f1271a = 1;
        LinearLayout f10 = k5.f(context, 1);
        h6 h6Var = new h6(context, false, false, false);
        this.f1272b = h6Var;
        int i7 = j6.G6;
        q6.Y(h6Var, i7, e6Var);
        h6Var.setTextSize(org.telegram.messenger.g0.L(17.0f));
        h6Var.setTypeface(org.telegram.messenger.g0.o());
        f10.addView(h6Var, ja.r(-2, 23, 1));
        TextView textView = new TextView(context);
        this.f1273c = textView;
        textView.setTextSize(1, 11.0f);
        q6.U(textView, i7, e6Var);
        textView.setSingleLine();
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        f10.addView(textView, ja.r(-2, -2, 1));
        addView(f10, ja.e(-2, -2, 17));
    }

    public k0(Context context, int i7, int i10) {
        super(context);
        this.f1271a = 0;
        Paint paint = new Paint(1);
        this.f1272b = paint;
        Paint paint2 = new Paint(1);
        this.f1273c = paint2;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        textView.setText("All Styles");
        textView.setTextSize(1, 16.0f);
        textView.setTextColor(i7);
        textView.setSingleLine(true);
        textView.setGravity(16);
        addView(textView, ja.d(-2, -1.0f, 3, 54.0f, 0.0f, 40.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
        paint.setColor(i10);
        paint2.setColor(i10);
    }

    public k0(ep epVar, Context context) {
        super(context);
        this.f1271a = 15;
        this.f1273c = epVar;
        this.f1272b = new Paint();
    }

    public k0(ns nsVar, Activity activity) {
        super(activity);
        this.f1271a = 22;
        this.f1273c = nsVar;
        this.f1272b = nsVar;
        setWillNotDraw(false);
    }

    public k0(Context context, t71 t71Var) {
        super(context);
        this.f1271a = 29;
        this.f1273c = t71Var;
        this.f1272b = new Paint();
    }

    public k0(Context context, int i7) {
        super(context);
        this.f1271a = i7;
        switch (i7) {
            case 14:
                super(context);
                this.f1272b = new Path();
                this.f1273c = new h6.m(29);
                return;
            default:
                ImageView imageView = new ImageView(context);
                this.f1272b = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                addView(imageView, ja.d(24, 24.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                this.f1273c = textView;
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                textView.setGravity(17);
                addView(textView, ja.d(-1, -2.0f, 49, 4.0f, 35.0f, 4.0f, 0.0f));
                return;
        }
    }

    public k0(mi0 mi0Var, Context context) {
        super(context);
        this.f1271a = 18;
        this.f1273c = mi0Var;
        this.f1272b = new Paint(1);
    }

    public k0(j5 j5Var, Context context) {
        super(context);
        this.f1271a = 6;
        this.f1273c = j5Var;
        this.f1272b = new Path();
    }
}
