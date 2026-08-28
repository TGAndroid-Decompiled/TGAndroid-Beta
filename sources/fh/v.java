package fh;

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
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.ll;
import org.telegram.ui.Cells.z9;
import org.telegram.ui.Components.cp;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.ka;
import org.telegram.ui.Components.mc0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.b61;
import org.telegram.ui.d41;
import org.telegram.ui.e51;
import org.telegram.ui.f51;
import org.telegram.ui.g51;
import org.telegram.ui.ht;
import org.telegram.ui.i70;
import org.telegram.ui.k51;
import org.telegram.ui.ky0;
import org.telegram.ui.oc1;
import org.telegram.ui.s10;
import org.telegram.ui.vb;
import org.telegram.ui.w31;
import org.telegram.ui.y11;
import org.telegram.ui.z11;
import org.telegram.ui.zs0;
public final class v extends FrameLayout {
    public final int f6808a;
    public Object f6809b;
    public Object f6810c;

    public v(Context context, int i9) {
        super(context);
        this.f6808a = i9;
    }

    public void b(int i9, CharSequence charSequence, boolean z10) {
        ImageView imageView = (ImageView) this.f6810c;
        if (z10) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i9);
        } else {
            imageView.setImageResource(i9);
        }
        ((TextView) this.f6809b).setText(charSequence);
    }

    public void c(String str, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) this.f6809b;
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        i6Var.q(str, z11, true);
    }

    public void d(String str, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) this.f6810c;
        if (z10 && !LocaleController.isRTL) {
            z11 = true;
        } else {
            z11 = false;
        }
        i6Var.q(str, z11, true);
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.b6 b6Var;
        Paint paint;
        boolean a12;
        int k10;
        org.telegram.ui.ActionBar.h5[] h5VarArr;
        float f10;
        char c10;
        float f11;
        org.telegram.ui.Cells.z zVar;
        float f12;
        switch (this.f6808a) {
            case 7:
                super.dispatchDraw(canvas);
                Paint paint2 = (Paint) this.f6810c;
                int i9 = org.telegram.ui.ActionBar.f6.f22947a7;
                b6Var = ((org.telegram.ui.ActionBar.o2) ((org.telegram.ui.o5) this.f6809b).d).resourceProvider;
                paint2.setColor(org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint2);
                return;
            case 8:
                RectF rectF = (RectF) this.f6810c;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                org.telegram.ui.Cells.z0 z0Var = (org.telegram.ui.Cells.z0) this.f6809b;
                int measuredWidth = z0Var.getMeasuredWidth();
                int i10 = z0Var.d;
                float x10 = z0Var.getX();
                float f13 = z0Var.f26008c;
                org.telegram.ui.ActionBar.b6 b6Var2 = z0Var.f26007b;
                if (b6Var2 != null) {
                    b6Var2.o(x10, f13, measuredWidth, i10);
                } else {
                    org.telegram.ui.ActionBar.f6.q(x10, f13, measuredWidth, i10);
                }
                float dp = AndroidUtilities.dp(18.0f);
                float dp2 = AndroidUtilities.dp(18.0f);
                Paint paint3 = null;
                if (b6Var2 != null) {
                    paint = b6Var2.O("paintChatActionBackground");
                } else {
                    paint = null;
                }
                if (paint == null) {
                    paint = org.telegram.ui.ActionBar.f6.S0("paintChatActionBackground");
                }
                canvas.drawRoundRect(rectF, dp, dp2, paint);
                if (b6Var2 != null) {
                    a12 = b6Var2.t0();
                } else {
                    a12 = org.telegram.ui.ActionBar.f6.a1();
                }
                if (a12) {
                    float dp3 = AndroidUtilities.dp(18.0f);
                    float dp4 = AndroidUtilities.dp(18.0f);
                    if (b6Var2 != null) {
                        paint3 = b6Var2.O("paintChatActionBackgroundDarken");
                    }
                    if (paint3 == null) {
                        paint3 = org.telegram.ui.ActionBar.f6.S0("paintChatActionBackgroundDarken");
                    }
                    canvas.drawRoundRect(rectF, dp3, dp4, paint3);
                }
                super.dispatchDraw(canvas);
                return;
            case 9:
                super.dispatchDraw(canvas);
                Paint paint4 = (Paint) this.f6810c;
                paint4.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f22947a7, ((vb) this.f6809b).f43421f.f44448e));
                canvas.drawRect(0.0f, getHeight() - 2, getWidth(), getHeight(), paint4);
                return;
            case 10:
                float dp5 = AndroidUtilities.dp(20.0f);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                Path path = (Path) this.f6810c;
                path.rewind();
                path.addRoundRect(rectF2, dp5, dp5, Path.Direction.CW);
                canvas.save();
                canvas.clipRect(0.0f, 0.0f, getWidth(), getAlpha() * getHeight());
                canvas.clipPath(path);
                canvas.saveLayerAlpha(rectF2, 255, 31);
                super.dispatchDraw(canvas);
                rectF2.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), AndroidUtilities.dp(6.0f) + getPaddingTop());
                s10 s10Var = (s10) this.f6809b;
                s10Var.b(canvas, rectF2, 1, 1.0f);
                rectF2.set(getPaddingLeft(), (getHeight() - getPaddingBottom()) - AndroidUtilities.dp(6.0f), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                s10Var.b(canvas, rectF2, 3, 1.0f);
                canvas.restore();
                canvas.restore();
                return;
            case 11:
                super.dispatchDraw(canvas);
                Paint paint5 = (Paint) this.f6810c;
                paint5.setColor(((cp) this.f6809b).getThemedColor(org.telegram.ui.ActionBar.f6.f23002d7));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), 1.0f, paint5);
                return;
            case 12:
                jy jyVar = (jy) this.f6809b;
                if (!jyVar.C.f34434q0 && jyVar.f29884w > 0.0f) {
                    if (((Paint) this.f6810c) == null) {
                        Paint paint6 = new Paint();
                        this.f6810c = paint6;
                        paint6.setShader(new LinearGradient(0.0f, 0.0f, AndroidUtilities.dp(18.0f), 0.0f, new int[]{-1, 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                        ((Paint) this.f6810c).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
                    }
                    canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
                    super.dispatchDraw(canvas);
                    ((Paint) this.f6810c).setAlpha((int) (jyVar.f29884w * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, AndroidUtilities.dp(18.0f), getMeasuredHeight(), (Paint) this.f6810c);
                    canvas.restore();
                    return;
                }
                super.dispatchDraw(canvas);
                return;
            case 13:
                org.telegram.ui.Components.i6 i6Var = (org.telegram.ui.Components.i6) this.f6810c;
                int dp6 = AndroidUtilities.dp(29.0f);
                int dp7 = AndroidUtilities.dp(18.83f);
                org.telegram.ui.Components.i6 i6Var2 = (org.telegram.ui.Components.i6) this.f6809b;
                i6Var.setBounds(getPaddingLeft(), r3 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r3);
                i6Var.draw(canvas);
                i6Var2.setBounds(getPaddingLeft(), r2 - AndroidUtilities.dp(32.0f), getMeasuredWidth() - getPaddingRight(), AndroidUtilities.dp(32.0f) + r2);
                i6Var2.draw(canvas);
                return;
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
            case 15:
                Paint paint7 = (Paint) this.f6810c;
                uj0 uj0Var = (uj0) this.f6809b;
                int i11 = uj0Var.I0;
                if (i11 != 1 && i11 != 2 && i11 != 4) {
                    k10 = i0.a.d(0.7f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.F8, uj0Var.f33059g0), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, uj0Var.f33059g0));
                } else {
                    k10 = i0.a.k(-1, 30);
                }
                paint7.setColor(k10);
                float measuredHeight = getMeasuredHeight() / 2.0f;
                float measuredWidth2 = getMeasuredWidth() / 2.0f;
                View childAt = getChildAt(0);
                float measuredWidth3 = (getMeasuredWidth() - AndroidUtilities.dpf2(6.0f)) / 2.0f;
                float g10 = uj0Var.g();
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
                ProfileActivity profileActivity = (ProfileActivity) this.f6809b;
                org.telegram.ui.ActionBar.h5[] h5VarArr2 = profileActivity.f36037r;
                if (profileActivity.S4 != null) {
                    canvas.save();
                    canvas.translate(h5VarArr2[0].getX(), h5VarArr2[0].getY());
                    f10 = 0.0f;
                    h5VarArr = h5VarArr2;
                    c10 = 2;
                    f11 = 2.0f;
                    canvas.saveLayerAlpha(0.0f, 0.0f, profileActivity.S4.getMeasuredWidth(), profileActivity.S4.getMeasuredHeight(), (int) ((1.0f - profileActivity.O1) * 255.0f), 31);
                    profileActivity.S4.draw(canvas);
                    canvas.restore();
                    canvas.restore();
                    invalidate();
                } else {
                    h5VarArr = h5VarArr2;
                    f10 = 0.0f;
                    c10 = 2;
                    f11 = 2.0f;
                }
                if (profileActivity.f36002l5 && profileActivity.U5 != f10 && profileActivity.f35989j5 != 1.0f) {
                    float measuredHeight2 = (h5VarArr[1].getMeasuredHeight() / f11) + h5VarArr[1].getY();
                    float dp8 = AndroidUtilities.dp(22.0f);
                    float x11 = ((h5VarArr[1].getX() + (AndroidUtilities.dp(28.0f) - profileActivity.f35996k5)) - dp8) - profileActivity.Z3();
                    profileActivity.f36016n5.setImageCoords(x11, measuredHeight2 - (dp8 / f11), dp8, dp8);
                    profileActivity.f36016n5.setAlpha(profileActivity.U5);
                    canvas.save();
                    float f14 = profileActivity.U5;
                    canvas.scale(f14, f14, profileActivity.f36016n5.getCenterX(), profileActivity.f36016n5.getCenterY());
                    profileActivity.f36016n5.draw(canvas);
                    canvas.restore();
                    if (profileActivity.f35989j5 == f10) {
                        if (((wc) this.f6810c) == null) {
                            wc wcVar = new wc(this);
                            this.f6810c = wcVar;
                            wcVar.h = new ky0(this, 0);
                        }
                        float dp9 = (1.0f - profileActivity.f35989j5) * AndroidUtilities.dp(28.0f);
                        float textWidth = h5VarArr[c10].getTextWidth();
                        if (profileActivity.P != null) {
                            f12 = (AndroidUtilities.dp(24.0f) + textWidth + AndroidUtilities.dp(4.0f)) * profileActivity.P.getVisibilityFactor();
                        } else {
                            f12 = 0.0f;
                        }
                        RectF rectF4 = AndroidUtilities.rectTmp;
                        rectF4.set(x11 - AndroidUtilities.dp(4.0f), measuredHeight2 - AndroidUtilities.dp(14.0f), x11 + Math.max(textWidth, f12) + dp9 + AndroidUtilities.dp(4.0f), measuredHeight2 + AndroidUtilities.dp(14.0f));
                        wc wcVar2 = (wc) this.f6810c;
                        wcVar2.f34193i = false;
                        wcVar2.f34189c = 0;
                        wcVar2.a(rectF4);
                        wc wcVar3 = (wc) this.f6810c;
                        wcVar3.f34198n = true;
                        int k11 = i0.a.k(-1, 50);
                        wcVar3.f34192g.setColor(0);
                        org.telegram.ui.Cells.z zVar2 = wcVar3.f34190e;
                        if (zVar2 != null) {
                            org.telegram.ui.ActionBar.f6.B1(zVar2, k11, true);
                        }
                        wc wcVar4 = (wc) this.f6810c;
                        wcVar4.c(canvas, wcVar4.f34192g);
                        org.telegram.ui.Cells.z zVar3 = wcVar4.f34190e;
                        if (zVar3 != null) {
                            zVar3.draw(canvas);
                            return;
                        }
                        return;
                    }
                    wc wcVar5 = (wc) this.f6810c;
                    if (wcVar5 != null && (zVar = wcVar5.f34190e) != null) {
                        zVar.setState(StateSet.NOTHING);
                        zVar.jumpToCurrentState();
                        return;
                    }
                    return;
                }
                return;
            case 22:
                Rect rect = (Rect) this.f6810c;
                y11 y11Var = (y11) this.f6809b;
                if (y11Var.N) {
                    y11Var.f44678f.setBounds(-rect.left, -rect.top, getWidth() + rect.right, getHeight() + rect.bottom);
                    y11Var.f44678f.draw(canvas);
                } else {
                    RectF rectF5 = AndroidUtilities.rectTmp;
                    rectF5.set(0.0f, 0.0f, AndroidUtilities.dp(14.0f) + getWidth(), getHeight());
                    canvas.drawRoundRect(rectF5, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), y11Var.f44674a);
                }
                super.dispatchDraw(canvas);
                return;
            case 26:
                ImageReceiver imageReceiver = (ImageReceiver) this.f6810c;
                imageReceiver.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                imageReceiver.draw(canvas);
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.f6808a) {
            case 3:
                if (keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 4) {
                    hg.e0 e0Var = (hg.e0) this.f6809b;
                    if (!e0Var.f10582k) {
                        return true;
                    }
                    e0Var.d();
                    return true;
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public void dispatchSetPressed(boolean z10) {
        switch (this.f6808a) {
            case 3:
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
        switch (this.f6808a) {
            case 6:
                org.telegram.ui.l4 l4Var = (org.telegram.ui.l4) this.f6809b;
                z9 o6 = l4Var.L0.o(getContext());
                MotionEvent obtain = MotionEvent.obtain(motionEvent);
                LinearLayout linearLayout = (LinearLayout) this.f6810c;
                obtain.offsetLocation(-linearLayout.getX(), -linearLayout.getY());
                if (l4Var.L0.y() && l4Var.L0.o(getContext()).onTouchEvent(obtain)) {
                    return true;
                }
                if (o6.b(motionEvent)) {
                    motionEvent.setAction(3);
                }
                if (motionEvent.getAction() == 0 && l4Var.L0.y() && (motionEvent.getY() < linearLayout.getTop() || motionEvent.getY() > linearLayout.getBottom())) {
                    if (!l4Var.L0.o(getContext()).onTouchEvent(obtain)) {
                        return true;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }
                return super.dispatchTouchEvent(motionEvent);
            case 16:
                int action = motionEvent.getAction();
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f6809b;
                if (g1Var.F != null) {
                    MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                    obtain2.offsetLocation(g1Var.F.getX(), g1Var.F.getY());
                    boolean dispatchTouchEvent = g1Var.F.dispatchTouchEvent(motionEvent);
                    obtain2.recycle();
                    if (action == 1 || action == 3) {
                        g1Var.F = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain3 = MotionEvent.obtain(motionEvent);
                obtain3.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = g1Var.B.onTouchEvent(obtain3);
                obtain3.recycle();
                if (!g1Var.B.isInProgress() && ((GestureDetector) g1Var.C.f17378b).onTouchEvent(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (action == 1 || action == 3) {
                    g1Var.D = false;
                    g1Var.E = false;
                    o1.j jVar = g1Var.O;
                    if (!jVar.f18794f) {
                        float f10 = g1Var.M;
                        jVar.f18791b = f10;
                        jVar.f18792c = true;
                        o1.k kVar = jVar.f18800u;
                        int i9 = g1Var.I;
                        float f11 = (i9 / 2.0f) + f10;
                        int i10 = AndroidUtilities.displaySize.x;
                        if (f11 >= i10 / 2.0f) {
                            dp = (i10 - i9) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        kVar.f18807i = dp;
                        g1Var.O.f();
                    }
                    o1.j jVar2 = g1Var.P;
                    if (!jVar2.f18794f) {
                        float f12 = g1Var.N;
                        jVar2.f18791b = f12;
                        jVar2.f18792c = true;
                        jVar2.f18800u.f18807i = g7.n.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - g1Var.J) - AndroidUtilities.dp(16.0f));
                        g1Var.P.f();
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
        float f10;
        switch (this.f6808a) {
            case 4:
                Path path = (Path) this.f6810c;
                kh.d6 d6Var = (kh.d6) this.f6809b;
                if (d6Var.h != null && (((z10 = d6Var.f15110f) && view == d6Var.d) || (!z10 && view == d6Var.f15108c))) {
                    if (z10) {
                        f10 = d6Var.f15109e;
                    } else {
                        f10 = 1.0f - d6Var.f15109e;
                    }
                    canvas.save();
                    path.rewind();
                    path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (f10 * getMeasuredWidth()) / 2.0f, Path.Direction.CW);
                    canvas.clipPath(path);
                    boolean drawChild = super.drawChild(canvas, view, j10);
                    canvas.restore();
                    return drawChild;
                }
                return super.drawChild(canvas, view, j10);
            case 18:
                if (view instanceof mc0) {
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            case 23:
                if (view != ((SecretMediaViewer) this.f6810c).f36163w && super.drawChild(canvas, view, j10)) {
                    return true;
                }
                return false;
            case 24:
                Path path2 = (Path) this.f6810c;
                d41 d41Var = (d41) this.f6809b;
                RectF rectF = d41Var.N;
                if (view != d41Var.J && view != d41Var.f37413x) {
                    if (view == d41Var.L) {
                        canvas.save();
                        path2.rewind();
                        path2.addCircle(rectF.centerX() + d41Var.J.getX(), rectF.centerY() + d41Var.J.getY(), rectF.width() / 2.0f, Path.Direction.CW);
                        canvas.clipPath(path2);
                        canvas.clipRect(0.0f, AndroidUtilities.lerp(d41Var.P, 0.0f, d41Var.f37411s), getWidth(), AndroidUtilities.lerp(d41Var.Q, getHeight(), d41Var.f37411s));
                        canvas.translate(-d41Var.L.getX(), -d41Var.L.getY());
                        canvas.translate(d41Var.J.getX() + rectF.left, d41Var.J.getY() + rectF.top);
                        canvas.scale(rectF.width() / d41Var.L.getMeasuredWidth(), rectF.height() / d41Var.L.getMeasuredHeight(), d41Var.L.getX(), d41Var.L.getY());
                        boolean drawChild2 = super.drawChild(canvas, view, j10);
                        canvas.restore();
                        return drawChild2;
                    }
                    return super.drawChild(canvas, view, j10);
                }
                canvas.save();
                canvas.clipRect(0.0f, AndroidUtilities.lerp(d41Var.P, 0.0f, d41Var.f37411s), getWidth(), AndroidUtilities.lerp(d41Var.Q, getHeight(), d41Var.f37411s));
                boolean drawChild3 = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild3;
            case 25:
                if (view == ((b61) this.f6809b).f36669d0 && hg.h0.f10609b && hg.h0.f10612f) {
                    for (int i9 = 0; i9 < ((b61) this.f6809b).f36669d0.getChildCount(); i9++) {
                        View childAt = ((b61) this.f6809b).f36669d0.getChildAt(i9);
                        if (childAt instanceof k51) {
                            k51 k51Var = (k51) childAt;
                            if (k51Var.getAnimatedScale() == 1.0f) {
                                ((Rect) this.f6810c).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                canvas.save();
                                canvas.clipRect((Rect) this.f6810c);
                                super.drawChild(canvas, view, j10);
                                canvas.restore();
                            } else if (k51Var.getAnimatedScale() > 0.0f) {
                                ((Rect) this.f6810c).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                                Rect rect = (Rect) this.f6810c;
                                rect.set((int) (rect.centerX() - (k51Var.getAnimatedScale() * (((Rect) this.f6810c).width() / 2.0f))), (int) (((Rect) this.f6810c).centerY() - (k51Var.getAnimatedScale() * (((Rect) this.f6810c).height() / 2.0f))), (int) ((k51Var.getAnimatedScale() * (((Rect) this.f6810c).width() / 2.0f)) + ((Rect) this.f6810c).centerX()), (int) ((k51Var.getAnimatedScale() * (((Rect) this.f6810c).height() / 2.0f)) + ((Rect) this.f6810c).centerY()));
                                canvas.save();
                                canvas.clipRect((Rect) this.f6810c);
                                canvas.scale(k51Var.getAnimatedScale(), k51Var.getAnimatedScale(), ((Rect) this.f6810c).centerX(), ((Rect) this.f6810c).centerY());
                                super.drawChild(canvas, view, j10);
                                canvas.restore();
                            }
                        } else if ((childAt instanceof TextView) || (childAt instanceof f51) || (childAt instanceof e51) || (childAt instanceof g51)) {
                            ((Rect) this.f6810c).set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                            canvas.save();
                            canvas.clipRect((Rect) this.f6810c);
                            super.drawChild(canvas, view, j10);
                            canvas.restore();
                        }
                    }
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public boolean fitSystemWindows(Rect rect) {
        switch (this.f6808a) {
            case 3:
                hg.e0 e0Var = (hg.e0) this.f6809b;
                float f10 = e0Var.f10592u;
                float f11 = rect.bottom;
                if (f10 != f11 && e0Var.v) {
                    e0Var.f10592u = f11;
                    v vVar = e0Var.f10576c;
                    hg.d0 d0Var = e0Var.f10574a;
                    if (!e0Var.f10588q) {
                        float f12 = e0Var.f10591t;
                        int dp = AndroidUtilities.dp(32.0f);
                        int i9 = e0Var.f10595y;
                        if (i9 == 1 || i9 == 2) {
                            dp = AndroidUtilities.dp(24.0f);
                        }
                        float f13 = dp;
                        if (d0Var.getMeasuredHeight() + f12 > (vVar.getMeasuredHeight() - e0Var.f10592u) - f13) {
                            f12 = ((vVar.getMeasuredHeight() - e0Var.f10592u) - d0Var.getMeasuredHeight()) - f13;
                        }
                        if (f12 < 0.0f) {
                            f12 = 0.0f;
                        }
                        d0Var.animate().translationY(f12).setDuration(250L).setUpdateListener(new hg.x(e0Var, 1)).setInterpolator(gr.f28844f).start();
                    }
                }
                return super.fitSystemWindows(rect);
            default:
                return super.fitSystemWindows(rect);
        }
    }

    @Override
    public void invalidate() {
        switch (this.f6808a) {
            case 28:
                super.invalidate();
                org.telegram.ui.ActionBar.r0 r0Var = ((oc1) this.f6809b).f41095p0;
                if (r0Var != null) {
                    r0Var.invalidate();
                    return;
                }
                return;
            case 29:
                super.invalidate();
                ((uf.h) this.f6809b).invalidate();
                return;
            default:
                super.invalidate();
                return;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f6808a) {
            case 2:
                super.onAttachedToWindow();
                ((hg.o) this.f6810c).c();
                return;
            case 3:
                super.onAttachedToWindow();
                gc.a(this, (y0) this.f6810c);
                return;
            case 18:
                super.onAttachedToWindow();
                ht htVar = (ht) this.f6809b;
                htVar.A.onAttachedToWindow();
                htVar.B.onAttachedToWindow();
                return;
            case 21:
                super.onAttachedToWindow();
                ((ProfileActivity) this.f6809b).f36016n5.onAttachedToWindow();
                return;
            case 23:
                super.onAttachedToWindow();
                ((SecretMediaViewer) this.f6810c).h.onAttachedToWindow();
                return;
            case 26:
                super.onAttachedToWindow();
                ((ImageReceiver) this.f6810c).onAttachedToWindow();
                return;
            default:
                super.onAttachedToWindow();
                return;
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.f6808a) {
            case 16:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                org.telegram.ui.Components.voip.g1 g1Var = (org.telegram.ui.Components.voip.g1) this.f6809b;
                AndroidUtilities.setPreferredMaxRefreshRate(g1Var.f33518b, g1Var.d, g1Var.f33519c);
                g1Var.i(false);
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f6808a) {
            case 2:
                super.onDetachedFromWindow();
                ((hg.o) this.f6810c).d();
                return;
            case 3:
                super.onDetachedFromWindow();
                gc.h(this);
                return;
            case 18:
                super.onDetachedFromWindow();
                ht htVar = (ht) this.f6809b;
                htVar.A.onDetachedFromWindow();
                htVar.B.onDetachedFromWindow();
                return;
            case 21:
                super.onDetachedFromWindow();
                ((ProfileActivity) this.f6809b).f36016n5.onDetachedFromWindow();
                return;
            case 23:
                super.onDetachedFromWindow();
                ((SecretMediaViewer) this.f6810c).h.onDetachedFromWindow();
                return;
            case 26:
                super.onDetachedFromWindow();
                ((ImageReceiver) this.f6810c).onDetachedFromWindow();
                return;
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(android.graphics.Canvas r19) {
        throw new UnsupportedOperationException("Method not decompiled: fh.v.onDraw(android.graphics.Canvas):void");
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        wc wcVar;
        switch (this.f6808a) {
            case 21:
                if ((((ProfileActivity) this.f6809b).f35989j5 == 0.0f && (wcVar = (wc) this.f6810c) != null && wcVar.b(motionEvent)) || super.onInterceptTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.f6808a) {
            case 19:
                super.onLayout(z10, i9, i10, i11, i12);
                int i13 = (i12 - i10) / 4;
                int i14 = i13 * 3;
                int y10 = ll.y(275.0f, i14, 2);
                i70 i70Var = (i70) this.f6809b;
                FrameLayout frameLayout = i70Var.f39049r;
                int i15 = 0;
                frameLayout.layout(0, y10, frameLayout.getMeasuredWidth(), i70Var.f39049r.getMeasuredHeight() + y10);
                int dp = AndroidUtilities.dp(139.0f) + AndroidUtilities.dp(150.0f) + y10;
                int measuredWidth = (getMeasuredWidth() - i70Var.f39046e.getMeasuredWidth()) / 2;
                ka kaVar = i70Var.f39046e;
                kaVar.layout(measuredWidth, dp, kaVar.getMeasuredWidth() + measuredWidth, i70Var.f39046e.getMeasuredHeight() + dp);
                m2.g gVar = i70Var.d;
                gVar.layout(0, 0, gVar.getMeasuredWidth(), i70Var.d.getMeasuredHeight());
                int measuredHeight = ((i13 - i70Var.f39048n.getMeasuredHeight()) / 2) + i14;
                int measuredWidth2 = (getMeasuredWidth() - i70Var.f39048n.getMeasuredWidth()) / 2;
                bh.e eVar = i70Var.f39048n;
                eVar.layout(measuredWidth2, measuredHeight, eVar.getMeasuredWidth() + measuredWidth2, i70Var.f39048n.getMeasuredHeight() + measuredHeight);
                int dp2 = measuredHeight - AndroidUtilities.dp(30.0f);
                int measuredWidth3 = (getMeasuredWidth() - i70Var.f39047f.getMeasuredWidth()) / 2;
                TextView textView = i70Var.f39047f;
                textView.layout(measuredWidth3, dp2 - textView.getMeasuredHeight(), i70Var.f39047f.getMeasuredWidth() + measuredWidth3, dp2);
                FrameLayout frameLayout2 = (FrameLayout) this.f6810c;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) frameLayout2.getLayoutParams();
                int dp3 = AndroidUtilities.dp(4);
                if (!AndroidUtilities.isTablet()) {
                    i15 = AndroidUtilities.statusBarHeight;
                }
                int i16 = dp3 + i15;
                if (marginLayoutParams.topMargin != i16) {
                    marginLayoutParams.topMargin = i16;
                    frameLayout2.requestLayout();
                    return;
                }
                return;
            case 20:
                int dp4 = AndroidUtilities.dp(25.0f) + AndroidUtilities.dp(150.0f) + ll.y(275.0f, ((i12 - i10) / 4) * 3, 2);
                int dp5 = AndroidUtilities.dp(18.0f);
                TextView textView2 = (TextView) this.f6809b;
                textView2.layout(dp5, dp4, textView2.getMeasuredWidth() + dp5, textView2.getMeasuredHeight() + dp4);
                int dp6 = AndroidUtilities.dp(18.0f) + dp4 + ((int) textView2.getTextSize());
                int dp7 = AndroidUtilities.dp(16.0f);
                TextView textView3 = (TextView) this.f6810c;
                textView3.layout(dp7, dp6, textView3.getMeasuredWidth() + dp7, textView3.getMeasuredHeight() + dp6);
                return;
            case 21:
                super.onLayout(z10, i9, i10, i11, i12);
                ((ProfileActivity) this.f6809b).V4();
                return;
            case 22:
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                return;
            case 23:
                super.onLayout(z10, i9, i10, i11, i12);
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f6809b;
                if (secretMediaViewer.f36145n != null) {
                    int currentActionBarHeight = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f36145n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight;
                    w31 w31Var = secretMediaViewer.f36145n;
                    w31Var.layout(w31Var.getLeft(), currentActionBarHeight, secretMediaViewer.f36145n.getRight(), secretMediaViewer.f36145n.getMeasuredHeight() + currentActionBarHeight);
                }
                if (secretMediaViewer.f36154r != null && secretMediaViewer.f36145n != null) {
                    int measuredHeight2 = (secretMediaViewer.f36145n.getMeasuredHeight() + (((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() - secretMediaViewer.f36145n.getMeasuredHeight()) / 2) + AndroidUtilities.statusBarHeight)) - AndroidUtilities.dp(10.0f);
                    kh.x3 x3Var = secretMediaViewer.f36154r;
                    x3Var.layout(x3Var.getLeft(), measuredHeight2, secretMediaViewer.f36154r.getRight(), secretMediaViewer.f36154r.getMeasuredHeight() + measuredHeight2);
                }
                if (secretMediaViewer.W != null) {
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
                    zs0 zs0Var = secretMediaViewer.W;
                    zs0Var.layout(zs0Var.getLeft(), currentActionBarHeight2, secretMediaViewer.W.getRight(), secretMediaViewer.W.getMeasuredHeight() + currentActionBarHeight2);
                }
                View view = secretMediaViewer.f36130f;
                if (view != null) {
                    int i17 = i12 - i10;
                    view.layout(0, i17, i11 - i9, AndroidUtilities.navigationBarHeight + i17);
                    return;
                }
                return;
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        int dp;
        int i11;
        f2.m0 yVar;
        int measuredHeight;
        switch (this.f6808a) {
            case 5:
                ViewGroup viewGroup = (ViewGroup) this.f6810c;
                of.e eVar = (of.e) this.f6809b;
                if (eVar.G && eVar.F) {
                    super.onMeasure(i9, i10);
                    return;
                }
                int size = View.MeasureSpec.getSize(i10);
                if (size == 0) {
                    size = viewGroup.getMeasuredHeight();
                }
                if (size == 0) {
                    size = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                }
                int dp2 = AndroidUtilities.dp(50.0f);
                int i12 = 0;
                if (eVar.v != 0) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(30.0f) + dp2;
                }
                if (!eVar.A && !eVar.f19276w) {
                    dp += dp2;
                }
                int paddingTop = (size - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
                if (dp < paddingTop) {
                    i12 = paddingTop - dp;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                return;
            case 6:
                super.onMeasure(i9, i10);
                super.onMeasure(i9, ll.C(8.0f, ((LinearLayout) this.f6810c).getMeasuredHeight(), 1073741824));
                return;
            case 11:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(48.0f), 1073741824));
                return;
            case 13:
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(56.0f), 1073741824));
                setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                return;
            case 22:
                y11 y11Var = (y11) this.f6809b;
                View view = y11Var.D;
                View view2 = y11Var.E;
                LinearLayout linearLayout = y11Var.v;
                TextView textView = y11Var.f44681s;
                wk0 wk0Var = y11Var.f44684y;
                boolean z10 = y11Var.O.L;
                int dp3 = AndroidUtilities.dp(12.0f);
                if (z10) {
                    wk0Var.setLayoutParams(g7.e6.d(-1, 104.0f, 8388611, 0.0f, 44.0f, 0.0f, 0.0f));
                    wk0Var.setPadding(dp3, 0, dp3, 0);
                    if (linearLayout != null) {
                        textView.setLayoutParams(g7.e6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(g7.e6.d(-1, 48.0f, 8388691, 16.0f, 162.0f, 16.0f, 16.0f));
                    } else {
                        textView.setLayoutParams(g7.e6.d(-1, 48.0f, 8388611, 16.0f, 162.0f, 16.0f, 16.0f));
                    }
                } else {
                    wk0Var.setPadding(dp3, dp3 / 2, dp3, dp3);
                    if (linearLayout != null) {
                        wk0Var.setLayoutParams(g7.e6.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 136.0f));
                        textView.setLayoutParams(g7.e6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 72.0f));
                        linearLayout.setLayoutParams(g7.e6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                    } else {
                        wk0Var.setLayoutParams(g7.e6.d(-1, -1.0f, 8388611, 0.0f, 44.0f, 0.0f, 80.0f));
                        textView.setLayoutParams(g7.e6.d(-1, 48.0f, 80, 16.0f, 0.0f, 16.0f, 16.0f));
                    }
                }
                if (z10) {
                    view2.setVisibility(8);
                    view.setVisibility(8);
                } else {
                    if (textView != null) {
                        i11 = 136;
                    } else {
                        i11 = 80;
                    }
                    view2.setVisibility(0);
                    view2.setLayoutParams(g7.e6.d(-1, AndroidUtilities.dp(2.0f), 80, 0.0f, 0.0f, 0.0f, i11));
                    view.setVisibility(0);
                    view.setLayoutParams(g7.e6.d(-1, AndroidUtilities.dp(2.0f), 48, 0.0f, 44.0f, 0.0f, 0.0f));
                }
                if (y11Var.N != z10) {
                    z11 z11Var = y11Var.d;
                    if (z10) {
                        z11Var.getParentActivity();
                        yVar = new f2.m0(0, false);
                    } else {
                        z11Var.getParentActivity();
                        yVar = new f2.y(3, false);
                    }
                    y11Var.C = yVar;
                    wk0Var.setLayoutManager(yVar);
                    wk0Var.requestLayout();
                    int i13 = y11Var.H;
                    if (i13 != -1) {
                        y11Var.b(i13);
                    }
                    y11Var.N = z10;
                }
                super.onMeasure(i9, i10);
                return;
            case 23:
                super.onMeasure(i9, i10);
                int measuredWidth = getMeasuredWidth();
                int measuredHeight2 = getMeasuredHeight();
                SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.f6809b;
                zs0 zs0Var = secretMediaViewer.W;
                if (zs0Var != null) {
                    int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                    int currentActionBarHeight = (measuredHeight2 - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                    if (secretMediaViewer.Q.getVisibility() != 0) {
                        measuredHeight = 0;
                    } else {
                        measuredHeight = secretMediaViewer.Q.getMeasuredHeight();
                    }
                    zs0Var.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(currentActionBarHeight - measuredHeight, 1073741824));
                }
                View view3 = secretMediaViewer.f36130f;
                if (view3 != null) {
                    view3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.navigationBarHeight, 1073741824));
                    return;
                }
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.f6808a) {
            case 16:
                super.onSizeChanged(i9, i10, i11, i12);
                Path path = (Path) this.f6810c;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i9, i10);
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                return;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r14) {
        throw new UnsupportedOperationException("Method not decompiled: fh.v.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setBackgroundColor(int i9) {
        switch (this.f6808a) {
            case 14:
                ((Paint) this.f6810c).setColor(i9);
                return;
            default:
                super.setBackgroundColor(i9);
                return;
        }
    }

    @Override
    public void setTranslationX(float f10) {
        switch (this.f6808a) {
            case 29:
                super.setTranslationX(f10);
                ((uf.h) this.f6809b).invalidate();
                return;
            default:
                super.setTranslationX(f10);
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f6808a) {
            case 29:
                super.setTranslationY(f10);
                ((uf.h) this.f6809b).invalidate();
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public boolean verifyDrawable(Drawable drawable) {
        switch (this.f6808a) {
            case 13:
                if (((org.telegram.ui.Components.i6) this.f6810c) != drawable && ((org.telegram.ui.Components.i6) this.f6809b) != drawable && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            case 22:
                if (drawable != ((y11) this.f6809b).f44678f && !super.verifyDrawable(drawable)) {
                    return false;
                }
                return true;
            default:
                return super.verifyDrawable(drawable);
        }
    }

    public v(Object obj, Context context, int i9) {
        super(context);
        this.f6808a = i9;
        this.f6809b = obj;
    }

    public v(Object obj, Context context, Object obj2, int i9) {
        super(context);
        this.f6808a = i9;
        this.f6809b = obj;
        this.f6810c = obj2;
    }

    public v(org.telegram.ui.Cells.z0 z0Var, Context context) {
        super(context);
        this.f6808a = 8;
        this.f6809b = z0Var;
        this.f6810c = new RectF();
    }

    public v(hg.e0 e0Var, Context context) {
        super(context);
        this.f6808a = 3;
        this.f6809b = e0Var;
        this.f6810c = new y0(this, 1);
    }

    public v(d41 d41Var, Context context) {
        super(context);
        this.f6808a = 24;
        this.f6809b = d41Var;
        this.f6810c = new Path();
    }

    public v(vb vbVar, Context context) {
        super(context);
        this.f6808a = 9;
        this.f6809b = vbVar;
        this.f6810c = new Paint(1);
    }

    public v(hg.s sVar, Context context) {
        super(context);
        this.f6808a = 2;
        this.f6809b = sVar;
        this.f6810c = new hg.o(this, this);
    }

    public v(org.telegram.ui.o5 o5Var, Activity activity) {
        super(activity);
        this.f6808a = 7;
        this.f6809b = o5Var;
        this.f6810c = new Paint(1);
    }

    public v(org.telegram.ui.Components.voip.g1 g1Var, Context context) {
        super(context);
        this.f6808a = 16;
        this.f6809b = g1Var;
        this.f6810c = new Path();
    }

    public v(yc0 yc0Var, Context context) {
        super(context);
        this.f6808a = 14;
        this.f6809b = yc0Var;
        this.f6810c = new Paint();
    }

    public v(Context context, TextView textView, TextView textView2) {
        super(context);
        this.f6808a = 20;
        this.f6809b = textView;
        this.f6810c = textView2;
    }

    public v(SecretMediaViewer secretMediaViewer, Activity activity) {
        super(activity);
        this.f6808a = 23;
        this.f6809b = secretMediaViewer;
        this.f6810c = secretMediaViewer;
        setWillNotDraw(false);
    }

    public v(b61 b61Var, Context context) {
        super(context);
        this.f6808a = 25;
        this.f6809b = b61Var;
        this.f6810c = new Rect();
    }

    public v(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f6808a = i9;
        switch (i9) {
            case 13:
                super(context);
                org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(true, true, true, false);
                this.f6810c = i6Var;
                gr grVar = gr.h;
                i6Var.k(0.3f, 430L, grVar);
                i6Var.u(AndroidUtilities.bold());
                i6Var.r(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.A8, b6Var));
                i6Var.t(AndroidUtilities.dp(18.0f));
                i6Var.n(!LocaleController.isRTL);
                i6Var.setCallback(this);
                i6Var.G = AndroidUtilities.displaySize.x;
                org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(true, true, true, false);
                this.f6809b = i6Var2;
                i6Var2.k(0.3f, 430L, grVar);
                i6Var2.r(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.B8, b6Var));
                i6Var2.t(AndroidUtilities.dp(14.0f));
                i6Var2.n(true ^ LocaleController.isRTL);
                i6Var2.setCallback(this);
                i6Var2.G = AndroidUtilities.displaySize.x;
                return;
            default:
                LinearLayout f10 = ll.f(context, 1);
                org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
                this.f6810c = j6Var;
                int i10 = org.telegram.ui.ActionBar.f6.G6;
                j6Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
                j6Var.setTextSize(AndroidUtilities.dp(17.0f));
                j6Var.setTypeface(AndroidUtilities.bold());
                f10.addView(j6Var, g7.e6.q(-2, 23, 1));
                TextView textView = new TextView(context);
                this.f6809b = textView;
                textView.setTextSize(1, 11.0f);
                textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, b6Var));
                textView.setSingleLine();
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                f10.addView(textView, g7.e6.q(-2, -2, 1));
                addView(f10, g7.e6.e(-2, -2, 17));
                return;
        }
    }

    private final void a(boolean z10) {
    }

    public v(y11 y11Var, Activity activity, z11 z11Var) {
        super(activity);
        this.f6808a = 22;
        this.f6809b = y11Var;
        Rect rect = new Rect();
        this.f6810c = rect;
        y11Var.f44674a.setColor(z11Var.getThemedColor(org.telegram.ui.ActionBar.f6.f23001d6));
        Drawable drawable = y11Var.f44678f;
        drawable.setCallback(this);
        drawable.getPadding(rect);
    }

    public v(cp cpVar, Context context) {
        super(context);
        this.f6808a = 11;
        this.f6809b = cpVar;
        this.f6810c = new Paint();
    }

    public v(ht htVar, Activity activity) {
        super(activity);
        this.f6808a = 18;
        this.f6809b = htVar;
        this.f6810c = htVar;
        setWillNotDraw(false);
    }

    public v(oc1 oc1Var, Context context, int i9) {
        super(context);
        this.f6808a = i9;
        switch (i9) {
            case 28:
                this.f6809b = oc1Var;
                super(context);
                this.f6810c = new int[2];
                return;
            default:
                this.f6809b = oc1Var;
                this.f6810c = new Paint();
                return;
        }
    }

    public v(uj0 uj0Var, Context context) {
        super(context);
        this.f6808a = 15;
        this.f6809b = uj0Var;
        this.f6810c = new Paint(1);
    }

    public v(Context context) {
        super(context);
        this.f6808a = 10;
        this.f6810c = new Path();
        this.f6809b = new s10();
    }

    public v(kh.d6 d6Var, Context context) {
        super(context);
        this.f6808a = 4;
        this.f6809b = d6Var;
        this.f6810c = new Path();
    }
}
