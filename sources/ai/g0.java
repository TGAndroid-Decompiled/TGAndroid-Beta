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
import bi.p3;
import c8.m9;
import c8.na;
import hi.i5;
import hi.l3;
import java.util.ArrayList;
import org.telegram.messenger.ab;
import org.telegram.messenger.f3;
import org.telegram.messenger.ha;
import org.telegram.messenger.hd;
import org.telegram.messenger.o10;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.v9;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.gy;
import org.telegram.ui.Components.ia;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.xi0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.aa0;
import org.telegram.ui.b11;
import org.telegram.ui.b20;
import org.telegram.ui.g4;
import org.telegram.ui.mz0;
import org.telegram.ui.n5;
import org.telegram.ui.ns;
import org.telegram.ui.q6;
import org.telegram.ui.qb;
import org.telegram.ui.r11;
import org.telegram.ui.su0;
import org.telegram.ui.tz0;
import org.telegram.ui.v01;
import org.telegram.ui.v50;
import org.telegram.ui.w01;
import org.telegram.ui.x01;
import org.telegram.ui.xp0;
public final class g0 extends FrameLayout {
    public final int f1198a;
    public Object f1199b;
    public Object f1200c;

    public g0(int i7, Context context, Object obj) {
        super(context);
        this.f1198a = i7;
        this.f1200c = obj;
    }

    public void d(Canvas canvas) {
        qc0 qc0Var = (qc0) this.f1200c;
        Drawable drawable = qc0Var.f38825a;
        if (drawable != null) {
            if (!(drawable instanceof cb0) && !(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable)) {
                int max = Math.max(0, qc0Var.H);
                float max2 = Math.max(getMeasuredWidth() / qc0Var.f38825a.getIntrinsicWidth(), (getMeasuredHeight() + max) / qc0Var.f38825a.getIntrinsicHeight());
                int ceil = (int) Math.ceil(qc0Var.f38825a.getIntrinsicWidth() * max2);
                int ceil2 = (int) Math.ceil(qc0Var.f38825a.getIntrinsicHeight() * max2);
                int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                int measuredHeight = ((getMeasuredHeight() - ceil2) + max) / 2;
                qc0Var.f38825a.setBounds(measuredWidth, measuredHeight, ceil + measuredWidth, ceil2 + measuredHeight);
                qc0Var.f38825a.draw(canvas);
            } else {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                qc0Var.f38825a.draw(canvas);
            }
        } else {
            super.onDraw(canvas);
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), (Paint) this.f1199b);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        h6 h6Var;
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
        switch (this.f1198a) {
            case 0:
                super.dispatchDraw(canvas);
                float L = org.telegram.messenger.g0.L(28.0f);
                float height = getHeight() / 2.0f;
                canvas.drawCircle(L, height, org.telegram.messenger.g0.N(9.2f), (Paint) this.f1199b);
                for (int i7 = -1; i7 <= 1; i7++) {
                    canvas.drawCircle(org.telegram.ui.Cells.c0.e(4.0f, i7, L), height, org.telegram.messenger.g0.N(1.35f), (Paint) this.f1200c);
                }
                return;
            case 11:
                super.dispatchDraw(canvas);
                Paint paint3 = (Paint) this.f1199b;
                int i10 = m6.f29290a7;
                h6Var = ((org.telegram.ui.ActionBar.g2) ((n5) this.f1200c).d).resourceProvider;
                paint3.setColor(m6.w0(i10, h6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint3);
                return;
            case 13:
                RectF rectF = (RectF) this.f1199b;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Cells.y0 y0Var = (org.telegram.ui.Cells.y0) this.f1200c;
                int measuredWidth = y0Var.getMeasuredWidth();
                int i11 = y0Var.f32340e;
                float x10 = y0Var.getX();
                float f14 = y0Var.d;
                h6 h6Var2 = y0Var.f32339c;
                if (h6Var2 != null) {
                    h6Var2.e(x10, f14, measuredWidth, i11);
                } else {
                    m6.r(x10, f14, measuredWidth, i11);
                }
                float L2 = org.telegram.messenger.g0.L(18.0f);
                float L3 = org.telegram.messenger.g0.L(18.0f);
                if (h6Var2 != null) {
                    paint = h6Var2.g("paintChatActionBackground");
                } else {
                    paint = null;
                }
                if (paint == null) {
                    paint = m6.V0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, L2, L3, paint);
                if (h6Var2 != null) {
                    d12 = h6Var2.j();
                } else {
                    d12 = m6.d1();
                }
                if (d12) {
                    float L4 = org.telegram.messenger.g0.L(18.0f);
                    float L5 = org.telegram.messenger.g0.L(18.0f);
                    if (h6Var2 != null) {
                        paint2 = h6Var2.g("paintChatActionBackgroundDarken");
                    }
                    if (paint2 == null) {
                        paint2 = m6.V0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF, L4, L5, paint2);
                }
                super.dispatchDraw(canvas);
                return;
            case 14:
                super.dispatchDraw(canvas);
                Paint paint4 = (Paint) this.f1199b;
                paint4.setColor(m6.w0(m6.f29290a7, ((qb) this.f1200c).f51126f.f51964e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint4);
                return;
            case 15:
                float L6 = org.telegram.messenger.g0.L(20.0f);
                RectF rectF2 = org.telegram.messenger.g0.P;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.f1199b;
                path.rewind();
                path.addRoundRect(rectF2, L6, L6, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF2, 255, 31);
                super.dispatchDraw(canvas);
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), org.telegram.messenger.g0.L(6.0f) + getPaddingTop());
                h6.m mVar = (h6.m) this.f1200c;
                mVar.n(canvas, rectF2, 1, 1.0f);
                rectF2.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - org.telegram.messenger.g0.L(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                mVar.n(canvas, rectF2, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                return;
            case 16:
                super.dispatchDraw(canvas);
                Paint paint5 = (Paint) this.f1199b;
                paint5.setColor(m6.w0(m6.f29348d7, ((np) this.f1200c).J0));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint5);
                return;
            case 17:
                gy gyVar = (gy) this.f1200c;
                if (!gyVar.H.f40128v0 && gyVar.f35674x > 0.0f) {
                    if (((Paint) this.f1199b) == null) {
                        Paint paint6 = new Paint();
                        this.f1199b = paint6;
                        paint6.setShader(new LinearGradient(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f1199b).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f1199b).setAlpha((int) (gyVar.f35674x * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, org.telegram.messenger.g0.L(18.0f), getMeasuredHeight(), (Paint) this.f1199b);
                    canvas.restore();
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 19:
                Paint paint7 = (Paint) this.f1199b;
                xi0 xi0Var = (xi0) this.f1200c;
                int i12 = xi0Var.N0;
                if (i12 != 1 && i12 != 2 && i12 != 4) {
                    o4 = i0.a.f(0.7f, m6.w0(m6.F8, xi0Var.f42083l0), m6.w0(m6.f29420h5, xi0Var.f42083l0));
                } else {
                    o4 = i0.a.o(-1, 30);
                }
                paint7.setColor(o4);
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - org.telegram.messenger.g0.N(6.0f)) / 2.0f;
                float g10 = xi0Var.g();
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
            case 20:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.f1199b;
                b20 b20Var = (b20) this.f1200c;
                e9 e9Var = b20Var.K;
                TextView textView = b20Var.L;
                float f15 = b20Var.P;
                if (f15 == 1.0f) {
                    shapeDrawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    e9Var.setTranslationX(0.0f);
                    textView.setTranslationX(0.0f);
                } else {
                    float interpolation = 1.0f - nr.f37917f.getInterpolation(f15);
                    float left = (b20Var.Q - getLeft()) * interpolation;
                    shapeDrawable.setBounds((int) left, 0, getMeasuredWidth() + ((int) ((b20Var.S - getRight()) * interpolation)), getMeasuredHeight());
                    e9Var.setTranslationX(left);
                    textView.setTranslationX(-((b20Var.R - textView.getLeft()) * interpolation));
                }
                shapeDrawable.draw(canvas);
                super.dispatchDraw(canvas);
                return;
            case 21:
                RectF rectF4 = (RectF) this.f1200c;
                rectF4.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Components.voip.l1 l1Var = (org.telegram.ui.Components.voip.l1) this.f1199b;
                l1Var.d(((View) getParent()).getX() + getX(), ((View) getParent()).getY() + getY());
                canvas.drawRoundRect(rectF4, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), l1Var.b());
                super.dispatchDraw(canvas);
                return;
            case 26:
                super.dispatchDraw(canvas);
                ProfileActivity profileActivity = (ProfileActivity) this.f1200c;
                if (profileActivity.f43524a5 != null) {
                    canvas.save();
                    canvas.translate(profileActivity.f43637r.getX() + profileActivity.f43532b5, profileActivity.f43637r.getY());
                    f10 = 0.0f;
                    r12 = 0;
                    r13 = 1;
                    f11 = 2.0f;
                    f12 = 28.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.f43524a5.getMeasuredWidth(), profileActivity.f43524a5.getMeasuredHeight(), (int) ((1.0f - profileActivity.T1) * 255.0f), 31);
                    profileActivity.f43524a5.draw(canvas);
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
                if (profileActivity.f43670v5 && profileActivity.f43687x6 != f10 && profileActivity.f43657t5 != 1.0f) {
                    float measuredHeight2 = (profileActivity.f43637r.getMeasuredHeight() / f11) + profileActivity.f43637r.getY();
                    float L7 = org.telegram.messenger.g0.L(22.0f);
                    float x11 = ((profileActivity.f43637r.getX() + (org.telegram.messenger.g0.L(f12) - profileActivity.f43663u5)) - L7) - profileActivity.r4();
                    profileActivity.f43686x5.y0(x11, measuredHeight2 - (L7 / f11), L7, L7);
                    profileActivity.f43686x5.setAlpha(profileActivity.f43687x6);
                    canvas.save();
                    float f16 = profileActivity.f43687x6;
                    canvas.scale(f16, f16, profileActivity.f43686x5.r(), profileActivity.f43686x5.s());
                    profileActivity.f43686x5.h(canvas, null);
                    canvas.restore();
                    if (profileActivity.f43657t5 == f10) {
                        if (((tc) this.f1199b) == null) {
                            tc tcVar = new tc(this);
                            this.f1199b = tcVar;
                            tcVar.h = new su0(this, r13);
                        }
                        float L8 = (1.0f - profileActivity.f43657t5) * org.telegram.messenger.g0.L(f12);
                        float textWidth = profileActivity.f43637r.getTextWidth();
                        if (profileActivity.T != null) {
                            f13 = profileActivity.T.getVisibilityFactor() * (org.telegram.messenger.g0.L(24.0f) + textWidth + org.telegram.messenger.g0.L(4.0f));
                        } else {
                            f13 = f10;
                        }
                        RectF rectF5 = org.telegram.messenger.g0.P;
                        rectF5.set(x11 - org.telegram.messenger.g0.L(4.0f), measuredHeight2 - org.telegram.messenger.g0.L(14.0f), x11 + Math.max(textWidth, f13) + L8 + org.telegram.messenger.g0.L(4.0f), measuredHeight2 + org.telegram.messenger.g0.L(14.0f));
                        tc tcVar2 = (tc) this.f1199b;
                        tcVar2.f39810i = r12;
                        tcVar2.f39806c = r12;
                        tcVar2.a(rectF5);
                        tc tcVar3 = (tc) this.f1199b;
                        tcVar3.f39815n = r13;
                        int o10 = i0.a.o(-1, 50);
                        tcVar3.f39809g.setColor((int) r12);
                        org.telegram.ui.Cells.y yVar2 = tcVar3.f39807e;
                        if (yVar2 != null) {
                            m6.H1(yVar2, o10, r13);
                        }
                        tc tcVar4 = (tc) this.f1199b;
                        tcVar4.c(canvas, tcVar4.f39809g);
                        org.telegram.ui.Cells.y yVar3 = tcVar4.f39807e;
                        if (yVar3 != null) {
                            yVar3.draw(canvas);
                            return;
                        }
                        return;
                    }
                    tc tcVar5 = (tc) this.f1199b;
                    if (tcVar5 != null && (yVar = tcVar5.f39807e) != null) {
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
        switch (this.f1198a) {
            case 4:
                if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
                    ch.b0 b0Var = (ch.b0) this.f1200c;
                    if (!b0Var.f5297k) {
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
        switch (this.f1198a) {
            case 4:
                return;
            default:
                super.dispatchSetPressed(z10);
                return;
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f1198a) {
            case 9:
                ab abVar = (ab) ((r7) this.f1200c).f617c;
                if (abVar != null) {
                    return abVar.b(motionEvent, new ha(this, 0));
                }
                return super.dispatchTouchEvent(motionEvent);
            case 10:
                g4 g4Var = (g4) this.f1200c;
                v9 n10 = g4Var.R0.n(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.f1199b;
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
        switch (this.f1198a) {
            case 7:
                Path path = (Path) this.f1199b;
                i5 i5Var = (i5) this.f1200c;
                if (i5Var.h != null && (((z10 = i5Var.f14724f) && view == i5Var.d) || (!z10 && view == i5Var.f14722c))) {
                    if (z10) {
                        f10 = i5Var.f14723e;
                    } else {
                        f10 = 1.0f - i5Var.f14723e;
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
            case 23:
                if (view instanceof ec0) {
                    return false;
                }
                return super.drawChild(canvas, view, j3);
            case 26:
                ProfileActivity profileActivity = (ProfileActivity) this.f1200c;
                float f11 = profileActivity.R1;
                if (f11 < 1.0f && view != profileActivity.f43519a0 && view != profileActivity.f43535c0 && view != profileActivity.f43542d0) {
                    if (f11 <= 0.0f) {
                        return false;
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (profileActivity.R1 * 255.0f), 31);
                    boolean drawChild2 = super.drawChild(canvas, view, j3);
                    canvas.restore();
                    return drawChild2;
                }
                return super.drawChild(canvas, view, j3);
            case 27:
                if (view != ((SecretMediaViewer) this.f1199b).f43775x && super.drawChild(canvas, view, j3)) {
                    return true;
                }
                return false;
            case 28:
                Path path2 = (Path) this.f1199b;
                tz0 tz0Var = (tz0) this.f1200c;
                RectF rectF = tz0Var.S;
                if (view != tz0Var.O && view != tz0Var.f52399y) {
                    if (view == tz0Var.Q) {
                        canvas.save();
                        path2.rewind();
                        path2.addCircle(rectF.centerX() + tz0Var.O.getX(), rectF.centerY() + tz0Var.O.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                        canvas.clipPath(path2);
                        canvas.clipRect(0.0f, org.telegram.messenger.g0.T1(tz0Var.U, 0.0f, tz0Var.f52396s), getWidth(), org.telegram.messenger.g0.T1(tz0Var.V, getHeight(), tz0Var.f52396s));
                        canvas.translate(-tz0Var.Q.getX(), -tz0Var.Q.getY());
                        canvas.translate(tz0Var.O.getX() + rectF.left, tz0Var.O.getY() + rectF.top);
                        canvas.scale(rectF.width() / tz0Var.Q.getMeasuredWidth(), rectF.height() / tz0Var.Q.getMeasuredHeight(), tz0Var.Q.getX(), tz0Var.Q.getY());
                        boolean drawChild3 = super.drawChild(canvas, view, j3);
                        canvas.restore();
                        return drawChild3;
                    }
                    return super.drawChild(canvas, view, j3);
                }
                canvas.save();
                canvas.clipRect(0.0f, org.telegram.messenger.g0.T1(tz0Var.U, 0.0f, tz0Var.f52396s), getWidth(), org.telegram.messenger.g0.T1(tz0Var.V, getHeight(), tz0Var.f52396s));
                boolean drawChild4 = super.drawChild(canvas, view, j3);
                canvas.restore();
                return drawChild4;
            case 29:
                if (view == ((r11) this.f1200c).f51422i0 && ch.f0.f5346b && ch.f0.f5349f) {
                    for (int i7 = 0; i7 < ((r11) this.f1200c).f51422i0.getChildCount(); i7++) {
                        View childAt = ((r11) this.f1200c).f51422i0.getChildAt(i7);
                        if (childAt instanceof b11) {
                            b11 b11Var = (b11) childAt;
                            if (b11Var.getAnimatedScale() == 1.0f) {
                                ((Rect) this.f1199b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                canvas.save();
                                canvas.clipRect((Rect) this.f1199b);
                                super.drawChild(canvas, view, j3);
                                canvas.restore();
                            } else if (b11Var.getAnimatedScale() > 0.0f) {
                                ((Rect) this.f1199b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                ((Rect) this.f1199b).set((int) (rect.centerX() - (b11Var.getAnimatedScale() * (((Rect) this.f1199b).width() / 2.0f))), (int) (((Rect) this.f1199b).centerY() - (b11Var.getAnimatedScale() * (((Rect) this.f1199b).height() / 2.0f))), (int) ((b11Var.getAnimatedScale() * (((Rect) this.f1199b).width() / 2.0f)) + ((Rect) this.f1199b).centerX()), (int) ((b11Var.getAnimatedScale() * (((Rect) this.f1199b).height() / 2.0f)) + ((Rect) this.f1199b).centerY()));
                                canvas.save();
                                canvas.clipRect((Rect) this.f1199b);
                                canvas.scale(b11Var.getAnimatedScale(), b11Var.getAnimatedScale(), ((Rect) this.f1199b).centerX(), ((Rect) this.f1199b).centerY());
                                super.drawChild(canvas, view, j3);
                                canvas.restore();
                            }
                        } else if ((childAt instanceof TextView) || (childAt instanceof w01) || (childAt instanceof v01) || (childAt instanceof x01)) {
                            ((Rect) this.f1199b).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.f1199b);
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
        ImageView imageView = (ImageView) this.f1199b;
        if (z10) {
            org.telegram.messenger.g0.P3(imageView, i7);
        } else {
            imageView.setImageResource(i7);
        }
        ((TextView) this.f1200c).setText(charSequence);
        requestLayout();
    }

    public void f(float f10) {
        o6 o6Var = (o6) this.f1199b;
        o6Var.a();
        o6Var.c(String.format("%d%%", Integer.valueOf((int) Math.ceil(m9.a(f10, 0.0f, 1.0f) * 100.0f))), !hd.f24408a0, true);
        q6 q6Var = (q6) this.f1200c;
        q6Var.f51020c = f10;
        q6Var.invalidate();
    }

    @Override
    public boolean fitSystemWindows(Rect rect) {
        switch (this.f1198a) {
            case 4:
                ch.b0 b0Var = (ch.b0) this.f1200c;
                float f10 = b0Var.f5307u;
                float f11 = rect.bottom;
                if (f10 != f11 && b0Var.v) {
                    b0Var.f5307u = f11;
                    g0 g0Var = b0Var.f5291c;
                    ch.a0 a0Var = b0Var.f5289a;
                    if (!b0Var.f5303q) {
                        float f12 = b0Var.f5306t;
                        int L = org.telegram.messenger.g0.L(32.0f);
                        int i7 = b0Var.f5310y;
                        if (i7 == 1 || i7 == 2) {
                            L = org.telegram.messenger.g0.L(24.0f);
                        }
                        float f13 = L;
                        if (a0Var.getMeasuredHeight() + f12 > (g0Var.getMeasuredHeight() - b0Var.f5307u) - f13) {
                            f12 = ((g0Var.getMeasuredHeight() - b0Var.f5307u) - a0Var.getMeasuredHeight()) - f13;
                        }
                        if (f12 < 0.0f) {
                            f12 = 0.0f;
                        }
                        a0Var.animate().translationY(f12).setDuration(250L).setUpdateListener(new ch.u(b0Var, 1)).setInterpolator(nr.f37917f).start();
                    }
                }
                return super.fitSystemWindows(rect);
            default:
                return super.fitSystemWindows(rect);
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f1198a) {
            case 3:
                super.onAttachedToWindow();
                ((ch.l) this.f1199b).c();
                return;
            case 4:
                super.onAttachedToWindow();
                setTag(2131296353, (bi.i1) this.f1199b);
                return;
            case 23:
                super.onAttachedToWindow();
                ns nsVar = (ns) this.f1200c;
                nsVar.A.P();
                nsVar.B.P();
                return;
            case 26:
                super.onAttachedToWindow();
                ((ProfileActivity) this.f1200c).f43686x5.P();
                return;
            case 27:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.f1199b).h.P();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f1198a) {
            case 3:
                super.onDetachedFromWindow();
                ((ch.l) this.f1199b).d();
                return;
            case 4:
                super.onDetachedFromWindow();
                setTag(2131296353, null);
                return;
            case 23:
                super.onDetachedFromWindow();
                ns nsVar = (ns) this.f1200c;
                nsVar.A.R();
                nsVar.B.R();
                return;
            case 26:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.f1200c).f43686x5.R();
                return;
            case 27:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.f1199b).h.R();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r20) {
        throw new UnsupportedOperationException("Method not decompiled: ai.g0.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        tc tcVar;
        switch (this.f1198a) {
            case 9:
                ab abVar = (ab) ((r7) this.f1200c).d;
                if (abVar != null) {
                    return abVar.b(motionEvent, new ha(this, 1));
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 26:
                if ((((ProfileActivity) this.f1200c).f43657t5 == 0.0f && (tcVar = (tc) this.f1199b) != null && tcVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i7, int i10, int i11, int i12) {
        switch (this.f1198a) {
            case 9:
                super.onLayout(z10, i7, i10, i11, i12);
                aa0 aa0Var = (aa0) ((r7) this.f1200c).f618e;
                if (aa0Var != null) {
                    aa0Var.run();
                    return;
                }
                return;
            case 24:
                super.onLayout(z10, i7, i10, i11, i12);
                int i13 = (i12 - i10) / 4;
                int i14 = i13 * 3;
                int z11 = o10.z(275.0f, i14, 2);
                v50 v50Var = (v50) this.f1200c;
                FrameLayout frameLayout = v50Var.f52706r;
                int i15 = 0;
                frameLayout.layout(0, z11, frameLayout.getMeasuredWidth(), v50Var.f52706r.getMeasuredHeight() + z11);
                int L = org.telegram.messenger.g0.L(139.0f) + org.telegram.messenger.g0.L(150.0f) + z11;
                int measuredWidth = (getMeasuredWidth() - v50Var.f52703e.getMeasuredWidth()) / 2;
                ia iaVar = v50Var.f52703e;
                iaVar.layout(measuredWidth, L, iaVar.getMeasuredWidth() + measuredWidth, v50Var.f52703e.getMeasuredHeight() + L);
                c5.l lVar = v50Var.d;
                lVar.layout(0, 0, lVar.getMeasuredWidth(), v50Var.d.getMeasuredHeight());
                int measuredHeight = ((i13 - v50Var.f52705n.getMeasuredHeight()) / 2) + i14;
                int measuredWidth2 = (getMeasuredWidth() - v50Var.f52705n.getMeasuredWidth()) / 2;
                gi.j jVar = v50Var.f52705n;
                jVar.layout(measuredWidth2, measuredHeight, jVar.getMeasuredWidth() + measuredWidth2, v50Var.f52705n.getMeasuredHeight() + measuredHeight);
                int L2 = measuredHeight - org.telegram.messenger.g0.L(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - v50Var.f52704f.getMeasuredWidth()) / 2;
                TextView textView = v50Var.f52704f;
                textView.layout(measuredWidth3, L2 - textView.getMeasuredHeight(), v50Var.f52704f.getMeasuredWidth() + measuredWidth3, L2);
                FrameLayout frameLayout2 = (FrameLayout) this.f1199b;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
                int L3 = org.telegram.messenger.g0.L(4);
                if (!org.telegram.messenger.g0.Q1()) {
                    i15 = org.telegram.messenger.g0.f24004m;
                }
                int i16 = L3 + i15;
                if (marginLayoutParams.topMargin != i16) {
                    marginLayoutParams.topMargin = i16;
                    frameLayout2.requestLayout();
                    return;
                }
                return;
            case 25:
                int L4 = org.telegram.messenger.g0.L(25.0f) + org.telegram.messenger.g0.L(150.0f) + o10.z(275.0f, ((i12 - i10) / 4) * 3, 2);
                int L5 = org.telegram.messenger.g0.L(18.0f);
                TextView textView2 = (TextView) this.f1199b;
                textView2.layout(L5, L4, textView2.getMeasuredWidth() + L5, textView2.getMeasuredHeight() + L4);
                int L6 = org.telegram.messenger.g0.L(18.0f) + L4 + ((int) textView2.getTextSize());
                int L7 = org.telegram.messenger.g0.L(16.0f);
                TextView textView3 = (TextView) this.f1200c;
                textView3.layout(L7, L6, textView3.getMeasuredWidth() + L7, textView3.getMeasuredHeight() + L6);
                return;
            case 26:
                super.onLayout(z10, i7, i10, i11, i12);
                ((ProfileActivity) this.f1200c).t5();
                return;
            case 27:
                super.onLayout(z10, i7, i10, i11, i12);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f1200c;
                if (secretMediaViewer.f43753n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f43753n.getMeasuredHeight()) / 2) + org.telegram.messenger.g0.f24004m;
                    mz0 mz0Var = secretMediaViewer.f43753n;
                    mz0Var.layout(mz0Var.getLeft(), currentActionBarHeight, secretMediaViewer.f43753n.getRight(), secretMediaViewer.f43753n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.f43761r != null && secretMediaViewer.f43753n != null) {
                    int measuredHeight2 = (secretMediaViewer.f43753n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f43753n.getMeasuredHeight()) / 2) + org.telegram.messenger.g0.f24004m)) - org.telegram.messenger.g0.L(10.0f);
                    l3 l3Var = secretMediaViewer.f43761r;
                    l3Var.layout(l3Var.getLeft(), measuredHeight2, secretMediaViewer.f43761r.getRight(), secretMediaViewer.f43761r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.Z != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f24004m;
                    xp0 xp0Var = secretMediaViewer.Z;
                    xp0Var.layout(xp0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.Z.getRight(), secretMediaViewer.Z.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f43738f;
                if (view != null) {
                    int i17 = i12 - i10;
                    view.layout(0, i17, i11 - i7, org.telegram.messenger.g0.f24005n + i17);
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
        switch (this.f1198a) {
            case 2:
                p3 p3Var = (p3) this.f1200c;
                TextPaint textPaint = (TextPaint) this.f1199b;
                textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                textPaint.setTypeface(org.telegram.messenger.g0.o());
                int L2 = org.telegram.messenger.g0.L(14.0f);
                for (int i13 = 0; i13 < p3Var.B2.size(); i13++) {
                    L2 = f3.C(24.0f, (int) Math.ceil(textPaint.measureText(((CharSequence) p3Var.B2.get(i13)).toString())), L2);
                }
                int size = View.MeasureSpec.getSize(i7);
                int min = Math.min(L2, Math.max(0, size - org.telegram.messenger.g0.L(32.0f)));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) p3Var.A2.getLayoutParams();
                layoutParams.width = min;
                layoutParams.leftMargin = (size - min) / 2;
                super.onMeasure(i7, i10);
                return;
            case 6:
                float f15 = 8.0f;
                int size2 = View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(8.0f);
                TextView textView = (TextView) this.f1200c;
                CharSequence text = textView.getText();
                if (size2 > 0 && !TextUtils.isEmpty(text)) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView.getLayoutParams();
                    TextPaint textPaint2 = new TextPaint(textView.getPaint());
                    textPaint2.setTextSize(org.telegram.messenger.g0.L(12.0f));
                    float measureText = textPaint2.measureText(text, 0, text.length());
                    float f16 = size2;
                    if (measureText > f16) {
                        textPaint2.setTextSize(org.telegram.messenger.g0.L(11.0f));
                        String[] split = text.toString().split("\\s+");
                        int length = split.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 < length) {
                                if (textPaint2.measureText(split[i14]) > f16) {
                                    staticLayout = null;
                                    f13 = f16;
                                    f14 = 12.0f;
                                    i11 = 2;
                                    z10 = true;
                                } else {
                                    i14++;
                                }
                            } else {
                                f13 = f16;
                                f14 = 12.0f;
                                i11 = 2;
                                z10 = true;
                                staticLayout = new StaticLayout(text, textPaint2, size2, Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
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
                    layoutParams2.topMargin = org.telegram.messenger.g0.L(f12);
                    FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ((ImageView) this.f1199b).getLayoutParams();
                    if (i12 == i11) {
                        f15 = 4.0f;
                    }
                    layoutParams3.topMargin = org.telegram.messenger.g0.L(f15);
                }
                super.onMeasure(i7, i10);
                return;
            case 8:
                ViewGroup viewGroup = (ViewGroup) this.f1199b;
                jg.e eVar = (jg.e) this.f1200c;
                if (eVar.L && eVar.K) {
                    super.onMeasure(i7, i10);
                    return;
                }
                int size3 = View.MeasureSpec.getSize(i10);
                if (size3 == 0) {
                    size3 = viewGroup.getMeasuredHeight();
                }
                if (size3 == 0) {
                    size3 = (org.telegram.messenger.g0.f24010q.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f24004m;
                }
                int L3 = org.telegram.messenger.g0.L(50.0f);
                int i15 = 0;
                if (eVar.f17436w != 0) {
                    L = 0;
                } else {
                    L = org.telegram.messenger.g0.L(30.0f) + L3;
                }
                if (!eVar.F && !eVar.f17437x) {
                    L += L3;
                }
                int paddingTop = (size3 - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
                if (L < paddingTop) {
                    i15 = paddingTop - L;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(i15, 1073741824));
                return;
            case 10:
                super.onMeasure(i7, i10);
                super.onMeasure(i7, o10.C(8.0f, ((LinearLayout) this.f1199b).getMeasuredHeight(), 1073741824));
                return;
            case 12:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(350.0f), 1073741824));
                return;
            case 16:
                super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(48.0f), 1073741824));
                return;
            case 27:
                super.onMeasure(i7, i10);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f1200c;
                xp0 xp0Var = secretMediaViewer.Z;
                if (xp0Var != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                    int currentActionBarHeight = (measuredHeight2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.f24004m;
                    if (secretMediaViewer.T.getVisibility() != 0) {
                        measuredHeight = 0;
                    } else {
                        measuredHeight = secretMediaViewer.T.getMeasuredHeight();
                    }
                    xp0Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(currentActionBarHeight - measuredHeight, 1073741824));
                }
                View view = secretMediaViewer.f43738f;
                if (view != null) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f24005n, 1073741824));
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
        switch (this.f1198a) {
            case 18:
                qc0 qc0Var = (qc0) this.f1200c;
                ui.b bVar = qc0Var.I;
                super.onSizeChanged(i7, i10, i11, i12);
                if (i7 > 0 && i10 > 0) {
                    qc0Var.K = Bitmap.createBitmap(54, Math.max(1, Math.round((i10 * 54) / i7)), Bitmap.Config.ARGB_8888);
                    qc0Var.L = new Canvas(qc0Var.K);
                    bVar.a(qc0Var.K);
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
        throw new UnsupportedOperationException("Method not decompiled: ai.g0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setBackgroundColor(int i7) {
        switch (this.f1198a) {
            case 18:
                ((Paint) this.f1199b).setColor(i7);
                return;
            default:
                super.setBackgroundColor(i7);
                return;
        }
    }

    public g0(int i7, Context context, boolean z10) {
        super(context);
        this.f1198a = i7;
    }

    public g0(Object obj, Context context, Object obj2, int i7) {
        super(context);
        this.f1198a = i7;
        this.f1200c = obj;
        this.f1199b = obj2;
    }

    public g0(org.telegram.ui.Cells.y0 y0Var, Context context) {
        super(context);
        this.f1198a = 13;
        this.f1200c = y0Var;
        this.f1199b = new RectF();
    }

    public g0(ch.b0 b0Var, Context context) {
        super(context);
        this.f1198a = 4;
        this.f1200c = b0Var;
        this.f1199b = new bi.i1(this, 1);
    }

    public g0(qb qbVar, Context context) {
        super(context);
        this.f1198a = 14;
        this.f1200c = qbVar;
        this.f1199b = new Paint(1);
    }

    public g0(tz0 tz0Var, Context context) {
        super(context);
        this.f1198a = 28;
        this.f1200c = tz0Var;
        this.f1199b = new Path();
    }

    public g0(n5 n5Var, Activity activity) {
        super(activity);
        this.f1198a = 11;
        this.f1200c = n5Var;
        this.f1199b = new Paint(1);
    }

    public g0(ch.p pVar, Context context) {
        super(context);
        this.f1198a = 3;
        this.f1200c = pVar;
        this.f1199b = new ch.l(this, this);
    }

    public g0(Context context, org.telegram.ui.Components.voip.l1 l1Var) {
        super(context);
        this.f1198a = 21;
        this.f1200c = new RectF();
        this.f1199b = l1Var;
        l1Var.a(this);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        textView.setTextColor(-1);
        o10.l(15.0f, 2131743011, 1, textView, null);
        textView.setGravity(1);
        textView.setTypeface(org.telegram.messenger.g0.o());
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 15.0f);
        textView2.setTextColor(-1);
        textView2.setGravity(1);
        textView2.setText(hd.N0(2131743012, null));
        addView(textView, na.d(-1, -2.0f, 3, 0.0f, 24.0f, 0.0f, 0.0f));
        addView(textView2, na.d(-1, -2.0f, 3, 0.0f, 50.0f, 0.0f, 0.0f));
    }

    private final void c(boolean z10) {
    }

    public g0(r7 r7Var, Context context) {
        super(context);
        this.f1198a = 9;
        this.f1200c = r7Var;
        ?? obj = new Object();
        obj.d = new cb.c((Object) obj, 1);
        obj.f20160g = new ArrayList();
        obj.f20158e = this;
        obj.f20155a = context;
        this.f1199b = obj;
        setClickable(true);
    }

    public g0(qc0 qc0Var, Context context) {
        super(context);
        this.f1198a = 18;
        this.f1200c = qc0Var;
        this.f1199b = new Paint();
    }

    public g0(Context context, TextView textView, TextView textView2) {
        super(context);
        this.f1198a = 25;
        this.f1199b = textView;
        this.f1200c = textView2;
    }

    public g0(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f1198a = 27;
        this.f1200c = secretMediaViewer;
        this.f1199b = secretMediaViewer;
        setWillNotDraw(false);
    }

    public g0(r11 r11Var, Context context) {
        super(context);
        this.f1198a = 29;
        this.f1200c = r11Var;
        this.f1199b = new Rect();
    }

    public g0(Context context, h6 h6Var) {
        super(context);
        this.f1198a = 1;
        LinearLayout g10 = f3.g(context, 1);
        o6 o6Var = new o6(context, false, false, false);
        this.f1199b = o6Var;
        int i7 = m6.G6;
        t6.Y(o6Var, i7, h6Var);
        o6Var.setTextSize(org.telegram.messenger.g0.L(17.0f));
        o6Var.setTypeface(org.telegram.messenger.g0.o());
        g10.addView(o6Var, na.r(-2, 23, 1));
        TextView textView = new TextView(context);
        this.f1200c = textView;
        textView.setTextSize(1, 11.0f);
        t6.U(textView, i7, h6Var);
        textView.setSingleLine();
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        g10.addView(textView, na.r(-2, -2, 1));
        addView(g10, na.e(-2, -2, 17));
    }

    public g0(Context context, int i7, int i10) {
        super(context);
        this.f1198a = 0;
        Paint paint = new Paint(1);
        this.f1199b = paint;
        Paint paint2 = new Paint(1);
        this.f1200c = paint2;
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        o10.l(16.0f, 2131745070, 1, textView, null);
        textView.setTextColor(i7);
        textView.setSingleLine(true);
        textView.setGravity(16);
        addView(textView, na.d(-2, -1.0f, 3, 54.0f, 0.0f, 40.0f, 0.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.N(1.66f));
        paint.setColor(i10);
        paint2.setColor(i10);
    }

    public g0(np npVar, Context context) {
        super(context);
        this.f1198a = 16;
        this.f1200c = npVar;
        this.f1199b = new Paint();
    }

    public g0(ns nsVar, Activity activity) {
        super(activity);
        this.f1198a = 23;
        this.f1200c = nsVar;
        this.f1199b = nsVar;
        setWillNotDraw(false);
    }

    public g0(Context context, int i7) {
        super(context);
        this.f1198a = i7;
        switch (i7) {
            case 15:
                super(context);
                this.f1199b = new Path();
                this.f1200c = new h6.m(29);
                return;
            default:
                ImageView imageView = new ImageView(context);
                this.f1199b = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                addView(imageView, na.d(24, 24.0f, 49, 0.0f, 8.0f, 0.0f, 0.0f));
                TextView textView = new TextView(context);
                this.f1200c = textView;
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setTextSize(1, 12.0f);
                textView.setTextColor(-1);
                textView.setGravity(17);
                addView(textView, na.d(-1, -2.0f, 49, 4.0f, 35.0f, 4.0f, 0.0f));
                return;
        }
    }

    public g0(xi0 xi0Var, Context context) {
        super(context);
        this.f1198a = 19;
        this.f1200c = xi0Var;
        this.f1199b = new Paint(1);
    }

    public g0(i5 i5Var, Context context) {
        super(context);
        this.f1198a = 7;
        this.f1200c = i5Var;
        this.f1199b = new Path();
    }
}
