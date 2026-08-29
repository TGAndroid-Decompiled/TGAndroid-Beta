package bg;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import java.util.ArrayList;
import jh.h5;
import jh.ia;
import nh.gb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.aa;
import org.telegram.ui.Components.az;
import org.telegram.ui.Components.bg0;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.ey;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.hv0;
import org.telegram.ui.Components.ig;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.ko;
import org.telegram.ui.Components.mu;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.s81;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.w20;
import org.telegram.ui.Components.ye;
import org.telegram.ui.Components.yk;
import org.telegram.ui.Components.yl0;
public final class x2 extends FrameLayout {
    public final int f2607a;
    public Object f2608b;

    public x2(Context context, int i10) {
        super(context);
        this.f2607a = i10;
    }

    public ko a() {
        return ((ko[]) this.f2608b)[0];
    }

    public void b() {
        ko[] koVarArr = (ko[]) this.f2608b;
        ko koVar = koVarArr[0];
        ko koVar2 = koVarArr[1];
        koVarArr[0] = koVar2;
        koVarArr[1] = koVar;
        koVar2.f30117n = true;
        koVar2.setVisibility(0);
        koVarArr[0].setScaleX(0.8f);
        koVarArr[0].setScaleY(0.8f);
        koVarArr[0].setAlpha(0.0f);
        koVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = koVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        jr jrVar = jr.h;
        org.telegram.ui.b.q(translationY, jrVar, 320L);
        ko koVar3 = koVarArr[1];
        koVar3.f30117n = false;
        koVar3.setVisibility(0);
        koVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(jrVar).setDuration(320L).withEndAction(new ig(koVar3, 28)).start();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f9;
        float f10;
        int size;
        boolean z11;
        float f11;
        int dp;
        int i10;
        float f12;
        float f13;
        float f14;
        float dp2;
        ArrayList arrayList;
        switch (this.f2607a) {
            case 2:
                c4 c4Var = (c4) this.f2608b;
                if (c4Var.f2136y > 0.0f && c4Var.f2133s != null) {
                    c4Var.v.reset();
                    float width = getWidth() / c4Var.f2131n.getWidth();
                    c4Var.v.postScale(width, width);
                    c4Var.f2132r.setLocalMatrix(c4Var.v);
                    c4Var.f2133s.setAlpha((int) (c4Var.f2136y * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), c4Var.f2133s);
                }
                super.dispatchDraw(canvas);
                return;
            case 25:
                yl0 yl0Var = (yl0) this.f2608b;
                if (yl0Var.f35096r > 0.0f && yl0Var.f35093e != null) {
                    yl0Var.f35094f.reset();
                    float width2 = getWidth() / yl0Var.f35092c.getWidth();
                    yl0Var.f35094f.postScale(width2, width2);
                    yl0Var.d.setLocalMatrix(yl0Var.f35094f);
                    yl0Var.f35093e.setAlpha((int) (yl0Var.f35096r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), yl0Var.f35093e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = yl0Var.A;
                if (drawable != null) {
                    drawable.setAlpha((int) (yl0Var.f35096r * 255.0f));
                    canvas.save();
                    float f15 = yl0Var.D;
                    float f16 = yl0Var.C;
                    float f17 = yl0Var.f35096r;
                    canvas.translate((f16 * f17) + f15, (0.0f * f17) + yl0Var.E);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(yl0Var.F, yl0Var.G), Math.max(yl0Var.F, yl0Var.G), 0.75f), 1.0f, yl0Var.f35096r);
                    canvas.scale(lerp, lerp, ((yl0Var.A.getBounds().width() / 2.0f) * yl0Var.F) + (-yl0Var.D) + yl0Var.A.getBounds().left, ((yl0Var.A.getBounds().height() / 2.0f) * yl0Var.G) + (-yl0Var.E) + yl0Var.A.getBounds().top);
                    ng.d dVar = yl0Var.B;
                    if (dVar != null) {
                        dVar.setAlpha((int) (yl0Var.f35096r * 255.0f));
                        yl0Var.B.draw(canvas);
                    }
                    yl0Var.A.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 29:
                fy0 fy0Var = (fy0) this.f2608b;
                dy0 dy0Var = fy0Var.f28565c;
                if (dy0Var != null && dy0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = fy0Var.P;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x4 = fy0Var.f28565c.getEditField().getX() + fy0Var.f28565c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = fy0Var.P;
                        fy0Var.T = x4 + emojiSpan2.lastDrawX;
                        fy0Var.Q = emojiSpan2.lastDrawY;
                    } else if (fy0Var.R != null && fy0Var.S != null) {
                        fy0Var.T = fy0Var.f28565c.getEditField().getX() + fy0Var.f28565c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                if (fy0Var.f28570s && !fy0Var.v && (arrayList = fy0Var.f28571w) != null && !arrayList.isEmpty() && !fy0Var.f28572x) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                d6 d6Var = fy0Var.L;
                if (z10) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                float d = d6Var.d(f9, false);
                d6 d6Var2 = fy0Var.M;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float d10 = d6Var2.d(f10, false);
                float d11 = fy0Var.U.d(fy0Var.T, false);
                if (d <= 0.0f && d10 <= 0.0f && !z10) {
                    fy0Var.d.setVisibility(8);
                }
                fy0Var.I.rewind();
                float left = fy0Var.f28566e.getLeft();
                int left2 = fy0Var.f28566e.getLeft();
                ArrayList arrayList2 = fy0Var.f28571w;
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                float D = org.telegram.messenger.x3.D(44.0f, size, left2);
                d6 d6Var3 = fy0Var.W;
                float f18 = d6Var3.f27666c;
                if (f18 <= 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                float f19 = D - left;
                if (f19 > 0.0f) {
                    f18 = d6Var3.d(f19, z11);
                }
                float d12 = fy0Var.V.d((left + D) / 2.0f, z11);
                dy0 dy0Var2 = fy0Var.f28565c;
                if (dy0Var2 != null && dy0Var2.getEditField() != null) {
                    int i11 = fy0Var.h;
                    if (i11 == 0) {
                        fy0Var.d.setTranslationY(((-fy0Var.f28565c.getEditField().getHeight()) - fy0Var.f28565c.getEditField().getScrollY()) + fy0Var.Q + AndroidUtilities.dp(5.0f));
                    } else if (i11 == 1) {
                        fy0Var.d.setTranslationY(((-fy0Var.getMeasuredHeight()) - fy0Var.f28565c.getEditField().getScrollY()) + fy0Var.Q + AndroidUtilities.dp(20.0f) + fy0Var.d.getHeight());
                    }
                }
                float f20 = f18 / 4.0f;
                float f21 = f18 / 2.0f;
                int max = (int) Math.max((fy0Var.T - Math.max(f20, Math.min(f21, AndroidUtilities.dp(66.0f)))) - fy0Var.f28566e.getLeft(), 0.0f);
                if (fy0Var.f28566e.getPaddingLeft() != max) {
                    f11 = 1.0f;
                    fy0Var.f28566e.setPadding(max, 0, 0, 0);
                    fy0Var.f28566e.scrollBy(fy0Var.f28566e.getPaddingLeft() - max, 0);
                } else {
                    f11 = 1.0f;
                }
                fy0Var.f28566e.setTranslationX(((int) Math.max((d11 - Math.max(f20, Math.min(f21, AndroidUtilities.dp(66.0f)))) - fy0Var.f28566e.getLeft(), 0.0f)) - max);
                float translationX = fy0Var.f28566e.getTranslationX() + (d12 - f21) + fy0Var.f28566e.getPaddingLeft();
                float translationY = fy0Var.f28566e.getTranslationY() + fy0Var.f28566e.getTop() + fy0Var.f28566e.getPaddingTop();
                if (fy0Var.h == 0) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(6.66f);
                }
                float f22 = translationY + dp;
                float min = Math.min(fy0Var.f28566e.getTranslationX() + d12 + f21 + fy0Var.f28566e.getPaddingLeft(), fy0Var.getWidth() - fy0Var.d.getPaddingRight());
                float translationY2 = fy0Var.f28566e.getTranslationY() + fy0Var.f28566e.getBottom();
                if (fy0Var.h == 0) {
                    i10 = AndroidUtilities.dp(6.66f);
                } else {
                    i10 = 0;
                }
                float f23 = translationY2 - i10;
                float min2 = Math.min(AndroidUtilities.dp(9.0f), f21) * 2.0f;
                int i12 = fy0Var.h;
                if (i12 == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f24 = f23 - min2;
                    float f25 = translationX + min2;
                    rectF.set(translationX, f24, f25, f23);
                    fy0Var.I.arcTo(rectF, 90.0f, 90.0f);
                    float f26 = f22 + min2;
                    rectF.set(translationX, f22, f25, f26);
                    fy0Var.I.arcTo(rectF, -180.0f, 90.0f);
                    float f27 = min - min2;
                    rectF.set(f27, f22, min, f26);
                    fy0Var.I.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f27, f24, min, f23);
                    fy0Var.I.arcTo(rectF, 0.0f, 90.0f);
                    fy0Var.I.lineTo(AndroidUtilities.dp(8.66f) + d11, f23);
                    fy0Var.I.lineTo(d11, AndroidUtilities.dp(6.66f) + f23);
                    fy0Var.I.lineTo(d11 - AndroidUtilities.dp(8.66f), f23);
                } else if (i12 == 1) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f28 = min - min2;
                    float f29 = f22 + min2;
                    rectF2.set(f28, f22, min, f29);
                    fy0Var.I.arcTo(rectF2, -90.0f, 90.0f);
                    float f30 = f23 - min2;
                    rectF2.set(f28, f30, min, f23);
                    fy0Var.I.arcTo(rectF2, 0.0f, 90.0f);
                    float f31 = min2 + translationX;
                    rectF2.set(translationX, f30, f31, f23);
                    fy0Var.I.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, f22, f31, f29);
                    fy0Var.I.arcTo(rectF2, -180.0f, 90.0f);
                    fy0Var.I.lineTo(d11 - AndroidUtilities.dp(8.66f), f22);
                    fy0Var.I.lineTo(d11, f22 - AndroidUtilities.dp(6.66f));
                    fy0Var.I.lineTo(AndroidUtilities.dp(8.66f) + d11, f22);
                }
                fy0Var.I.close();
                if (fy0Var.K == null) {
                    Paint paint = new Paint(1);
                    fy0Var.K = paint;
                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.0f)));
                    fy0Var.K.setShadowLayer(AndroidUtilities.dp(4.33f), 0.0f, AndroidUtilities.dp(0.33333334f), 855638016);
                    fy0Var.K.setColor(g6.v0(g6.Be, fy0Var.f28564b));
                }
                if (d < f11) {
                    fy0Var.J.rewind();
                    if (fy0Var.h == 0) {
                        dp2 = AndroidUtilities.dp(6.66f) + f23;
                    } else {
                        dp2 = f22 - AndroidUtilities.dp(6.66f);
                    }
                    double d13 = d11 - translationX;
                    double d14 = dp2 - f22;
                    f12 = 255.0f;
                    double d15 = d11 - min;
                    double d16 = dp2 - f23;
                    fy0Var.J.addCircle(d11, dp2, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d14, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d14, 2.0d) + Math.pow(d15, 2.0d)), Math.max(Math.pow(d16, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d16, 2.0d) + Math.pow(d15, 2.0d))))) * d, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(fy0Var.J);
                    canvas.saveLayerAlpha(0.0f, 0.0f, fy0Var.getWidth(), fy0Var.getHeight(), (int) (d * 255.0f), 31);
                } else {
                    f12 = 255.0f;
                }
                canvas.drawPath(fy0Var.I, fy0Var.K);
                canvas.save();
                canvas.clipPath(fy0Var.I);
                super.dispatchDraw(canvas);
                float f32 = fy0Var.W.f27666c;
                float f33 = fy0Var.V.f27666c;
                float f34 = f32 / 2.0f;
                float translationX2 = fy0Var.f28566e.getTranslationX() + (f33 - f34) + fy0Var.f28566e.getPaddingLeft();
                float paddingTop = fy0Var.f28566e.getPaddingTop() + fy0Var.f28566e.getTop();
                float min3 = Math.min(fy0Var.f28566e.getTranslationX() + f33 + f34 + fy0Var.f28566e.getPaddingLeft(), fy0Var.getWidth() - fy0Var.d.getPaddingRight());
                float bottom = fy0Var.f28566e.getBottom();
                d6 d6Var4 = fy0Var.N;
                if (fy0Var.f28566e.canScrollHorizontally(-1)) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                float d17 = d6Var4.d(f13, false);
                if (d17 > 0.0f) {
                    int i13 = (int) translationX2;
                    g6.F4.setBounds(i13, (int) paddingTop, AndroidUtilities.dp(32.0f) + i13, (int) bottom);
                    g6.F4.setAlpha((int) (d17 * f12));
                    g6.F4.draw(canvas);
                }
                d6 d6Var5 = fy0Var.O;
                if (fy0Var.f28566e.canScrollHorizontally(1)) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                float d18 = d6Var5.d(f14, false);
                if (d18 > 0.0f) {
                    int i14 = (int) min3;
                    g6.E4.setBounds(i14 - AndroidUtilities.dp(32.0f), (int) paddingTop, i14, (int) bottom);
                    g6.E4.setAlpha((int) (d18 * f12));
                    g6.E4.draw(canvas);
                }
                canvas.restore();
                if (fy0Var.L.f27666c < f11) {
                    canvas.restore();
                    canvas.restore();
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
        switch (this.f2607a) {
            case 26:
                ye yeVar = (ye) this.f2608b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && yeVar.isShowing()) {
                    yeVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f2607a) {
            case 2:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((c4) this.f2608b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            case 25:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((yl0) this.f2608b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        int dp;
        switch (this.f2607a) {
            case 8:
                if (((ia) this.f2608b).f12276b0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 11:
                int action = motionEvent.getAction();
                lh.i1 i1Var = lh.i1.V;
                if (i1Var.C != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(i1Var.C.getX(), i1Var.C.getY());
                    boolean dispatchTouchEvent = i1Var.C.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (action == 1 || action == 3) {
                        i1Var.C = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = i1Var.f15707x.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!i1Var.f15707x.isInProgress() && ((GestureDetector) i1Var.f15708y.f19159b).onTouchEvent(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (action == 1 || action == 3) {
                    i1Var.A = false;
                    i1Var.B = false;
                    o1.k kVar = i1Var.L;
                    if (!kVar.f19039f) {
                        float f9 = i1Var.J;
                        kVar.f19036b = f9;
                        kVar.f19037c = true;
                        o1.l lVar = kVar.f19045u;
                        int i10 = i1Var.F;
                        float f10 = (i10 / 2.0f) + f9;
                        int i11 = AndroidUtilities.displaySize.x;
                        if (f10 >= i11 / 2.0f) {
                            dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        lVar.f19052i = dp;
                        i1Var.L.f();
                    }
                    o1.k kVar2 = i1Var.M;
                    if (!kVar2.f19039f) {
                        float f11 = i1Var.K;
                        kVar2.f19036b = f11;
                        kVar2.f19037c = true;
                        kVar2.f19045u.f19052i = i7.w.a(f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - i1Var.G) - AndroidUtilities.dp(16.0f));
                        i1Var.M.f();
                    }
                }
                if (onTouchEvent || z10) {
                    return true;
                }
                return false;
            case 13:
                if (((oh.g) this.f2608b).f19574a0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 17:
                if (motionEvent.getY() > getMeasuredHeight() - ((bl) this.f2608b).f27179x0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f2607a) {
            case 17:
                canvas.save();
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                bl blVar = (bl) this.f2608b;
                boolean z10 = false;
                canvas.clipRect(0, 0, measuredWidth, measuredHeight - blVar.f27179x0);
                if (!blVar.C) {
                    z10 = super.drawChild(canvas, view, j10);
                }
                canvas.restore();
                return z10;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.f2607a) {
            case 11:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                lh.i1 i1Var = lh.i1.V;
                AndroidUtilities.setPreferredMaxRefreshRate(i1Var.f15699b, i1Var.d, i1Var.f15700c);
                i1Var.i();
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f2607a) {
            case 20:
                mu muVar = (mu) this.f2608b;
                s81 s81Var = muVar.f30765c;
                gu guVar = muVar.f30764b;
                super.onDetachedFromWindow();
                try {
                    bg0 bg0Var = bg0.f27076l0;
                    if (bg0Var.L) {
                        if (guVar.getVisibility() != 0) {
                        }
                        if (s81Var.f() && !bg0Var.L) {
                            if (mu.O == muVar) {
                                mu.O = null;
                            }
                            s81Var.b();
                            return;
                        }
                        return;
                    }
                    if (guVar.getParent() != null) {
                        removeView(guVar);
                        guVar.stopLoading();
                        guVar.loadUrl("about:blank");
                        guVar.destroy();
                    }
                    if (s81Var.f()) {
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        x2 x2Var;
        MediaController.CropState cropState;
        switch (this.f2607a) {
            case 0:
                y2 y2Var = (y2) this.f2608b;
                Rect rect = y2Var.A0;
                Rect rect2 = y2Var.f2629z0;
                Paint paint = y2Var.B0;
                bv0 bv0Var = y2Var.f2621r0;
                Bitmap bitmap = y2Var.f2626w0;
                if (y2Var.f2625v0 != null) {
                    canvas.save();
                    float e10 = y2Var.f2620q0.e(y2Var.f2619p0);
                    canvas.scale(1.0f - (e10 * 2.0f), 1.0f, bv0Var.f27238a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.x3.y(1.0f, e10, 4.0f * e10, 0.25f));
                    float e11 = y2Var.f2624u0.e(y2Var.f2623t0);
                    if (!y2Var.f2623t0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e11) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(x2Var.getWidth() / 2.0f, x2Var.getHeight() / 2.0f);
                            canvas.rotate(y2Var.f2622s0);
                            float max = Math.max(bv0Var.f27238a / bitmap.getWidth(), bv0Var.f27239b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (y2Var.C0 != null) {
                                canvas.rotate(-y2Var.getOrientation());
                                int contentWidth = y2Var.getContentWidth();
                                int contentHeight = y2Var.getContentHeight();
                                if (((y2Var.getOrientation() + y2Var.C0.transformRotation) / 90) % 2 == 1) {
                                    contentWidth = y2Var.getContentHeight();
                                    contentHeight = y2Var.getContentWidth();
                                }
                                MediaController.CropState cropState2 = y2Var.C0;
                                float f9 = cropState2.cropPw;
                                float f10 = cropState2.cropPh;
                                float f11 = contentWidth;
                                float f12 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f9) / 2.0f, ((-contentHeight) * f10) / 2.0f, (f9 * f11) / 2.0f, (f10 * f12) / 2.0f);
                                float f13 = y2Var.C0.cropScale;
                                canvas.scale(f13, f13);
                                MediaController.CropState cropState3 = y2Var.C0;
                                canvas.translate(cropState3.cropPx * f11, cropState3.cropPy * f12);
                                canvas.rotate(y2Var.C0.cropRotate + cropState.transformRotation);
                                if (y2Var.C0.mirrored) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(y2Var.getOrientation());
                            }
                            canvas.translate((-bitmap.getWidth()) / 2.0f, (-bitmap.getHeight()) / 2.0f);
                            rect2.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
                            canvas.drawBitmap(bitmap, rect2, rect, paint);
                        }
                        canvas.restore();
                    }
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                v3 v3Var = (v3) this.f2608b;
                ImageReceiver imageReceiver = v3Var.f2583t0;
                bv0 bv0Var2 = v3Var.f2581r0;
                if (v3Var.f2582s0 != null) {
                    canvas.save();
                    float e12 = v3Var.f2580q0.e(v3Var.f2579p0);
                    canvas.scale(1.0f - (e12 * 2.0f), 1.0f, bv0Var2.f27238a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.x3.y(1.0f, e12, 4.0f * e12, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) bv0Var2.f27238a, (int) bv0Var2.f27239b);
                    imageReceiver.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 15:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.h) this.f2608b) == null) {
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                    this.f2608b = hVar;
                    hVar.f33724k = false;
                    hVar.f33726m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.f2608b).f33720f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f2608b).a(AndroidUtilities.dp(4.0f), canvas, rectF, null);
                invalidate();
                return;
            case 16:
                ((aa) this.f2608b).f26725e.a(canvas);
                return;
            case 17:
                bl blVar = (bl) this.f2608b;
                blVar.W.setColor(g6.v0(g6.f23133h5, blVar.f28402a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - blVar.f27179x0, blVar.W);
                return;
            case 27:
                uu0 uu0Var = (uu0) this.f2608b;
                Drawable drawable = uu0Var.d;
                drawable.setBounds(0, uu0Var.f33321f - uu0.n(uu0Var), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        cg.b1 b1Var;
        cg.b1 b1Var2;
        switch (this.f2607a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                cg.d1 d1Var = (cg.d1) this.f2608b;
                if (d1Var.h && (b1Var2 = d1Var.f3092e) != null) {
                    charSequence = b1Var2.getText();
                } else {
                    charSequence = null;
                }
                if (charSequence == null && (b1Var = d1Var.d) != null) {
                    charSequence = b1Var.getText();
                }
                if (charSequence != null) {
                    accessibilityNodeInfo.setText(charSequence);
                    if (getContentDescription() == null) {
                        accessibilityNodeInfo.setContentDescription(charSequence);
                        return;
                    }
                    return;
                }
                return;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f2607a) {
            case 17:
                if (motionEvent.getY() > getMeasuredHeight() - ((bl) this.f2608b).f27179x0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 27:
                uu0 uu0Var = (uu0) this.f2608b;
                if (motionEvent.getAction() == 0 && uu0Var.f33321f != 0 && motionEvent.getY() < uu0Var.f33321f) {
                    uu0Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth;
        int measuredHeight;
        int dp;
        int measuredHeight2;
        int i14;
        int i15;
        float f9;
        boolean z11;
        int i16;
        float x4;
        switch (this.f2607a) {
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                kg.s sVar = (kg.s) this.f2608b;
                if (sVar.G && z10) {
                    sVar.f13862w.setTranslationY(-sVar.f13856c.getMeasuredHeight());
                    int measuredHeight3 = sVar.f13856c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.f13864y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight3;
                    sVar.f13864y.setLayoutParams(marginLayoutParams);
                    return;
                }
                return;
            case 14:
                super.onLayout(z10, i10, i11, i12, i13);
                c30 c30Var = (c30) this.f2608b;
                c30Var.setTranslationY((getMeasuredHeight() * 0.28f) - (c30Var.getMeasuredWidth() / 2.0f));
                c30Var.setTranslationX((getMeasuredWidth() * 0.82f) - (c30Var.getMeasuredWidth() / 2.0f));
                return;
            case 16:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(36.0f);
                int i17 = ((i12 - i10) - dp2) / 2;
                int i18 = ((i13 - i11) - dp2) / 2;
                ((aa) this.f2608b).f26725e.f(i17, i18, i17 + dp2, dp2 + i18);
                return;
            case 18:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f2608b;
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    measuredWidth = getMeasuredWidth() / 2;
                    measuredHeight = getMeasuredHeight() / 2;
                    i14 = getMeasuredWidth() / 2;
                    int i19 = measuredHeight / 2;
                    measuredHeight2 = AndroidUtilities.dp(17.0f) + measuredHeight + i19;
                    i15 = i19 - AndroidUtilities.dp(17.0f);
                    dp = i14;
                } else {
                    measuredWidth = getMeasuredWidth() / 2;
                    measuredHeight = (getMeasuredHeight() / 2) - AndroidUtilities.dp(13.0f);
                    int i20 = measuredWidth / 2;
                    int dp3 = measuredWidth + i20 + AndroidUtilities.dp(17.0f);
                    dp = i20 - AndroidUtilities.dp(17.0f);
                    measuredHeight2 = (getMeasuredHeight() / 2) - AndroidUtilities.dp(13.0f);
                    i14 = dp3;
                    i15 = measuredHeight2;
                }
                int measuredHeight4 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.m0.getMeasuredHeight()) - AndroidUtilities.dp(12.0f);
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.m0;
                    textView.layout(measuredWidth - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.m0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.m0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.m0;
                    textView2.layout(measuredWidth - (textView2.getMeasuredWidth() / 2), measuredHeight4, (chatAttachAlertPhotoLayout.m0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.m0.getMeasuredHeight() + measuredHeight4);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.f26269g0;
                shutterButton.layout(measuredWidth - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.f26269g0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f26269g0.getMeasuredWidth() / 2) + measuredWidth, (chatAttachAlertPhotoLayout.f26269g0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.f26281n0;
                imageView.layout(i14 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.f26281n0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f26281n0.getMeasuredWidth() / 2) + i14, (chatAttachAlertPhotoLayout.f26281n0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i21 = 0; i21 < 2; i21++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.O[i21];
                    imageView2.layout(dp - (imageView2.getMeasuredWidth() / 2), i15 - (chatAttachAlertPhotoLayout.O[i21].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.O[i21].getMeasuredWidth() / 2) + dp, (chatAttachAlertPhotoLayout.O[i21].getMeasuredHeight() / 2) + i15);
                }
                return;
            case 23:
                super.onLayout(z10, i10, i11, i12, i13);
                w20 w20Var = (w20) this.f2608b;
                x2 x2Var = w20Var.f34276b;
                int[] iArr = w20Var.C;
                x2Var.getLocationOnScreen(iArr);
                w20Var.J = iArr[0];
                w20Var.I = iArr[1] - AndroidUtilities.dp(25.0f);
                return;
            case 25:
                super.onLayout(z10, i10, i11, i12, i13);
                yl0 yl0Var = (yl0) this.f2608b;
                x2 x2Var2 = yl0Var.f35097s;
                hv0 hv0Var = yl0Var.v;
                Drawable drawable = yl0Var.A;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    FrameLayout frameLayout = yl0Var.f35099x;
                    if (frameLayout != null) {
                        float f10 = yl0Var.D;
                        float f11 = bounds.left + f10;
                        float f12 = bounds.right + f10;
                        float f13 = yl0Var.E;
                        float f14 = bounds.top + f13;
                        float f15 = bounds.bottom + f13;
                        boolean z12 = false;
                        if (!yl0Var.H) {
                            if (f12 - frameLayout.getMeasuredWidth() < AndroidUtilities.dp(8.0f)) {
                                yl0Var.f35100y.setPivotX(AndroidUtilities.dp(6.0f));
                                yl0Var.f35099x.setX(Math.min(hv0Var.getWidth() - yl0Var.f35099x.getWidth(), f11 - AndroidUtilities.dp(10.0f)) - hv0Var.getX());
                                f9 = 4.0f;
                                z11 = false;
                            } else {
                                ViewGroup viewGroup = yl0Var.f35100y;
                                viewGroup.setPivotX(viewGroup.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f9 = 4.0f;
                                yl0Var.f35099x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f12) - yl0Var.f35099x.getMeasuredWidth()) - hv0Var.getX());
                                z11 = true;
                            }
                            if (z11) {
                                x4 = ((yl0Var.f35099x.getX() + yl0Var.f35099x.getWidth()) - AndroidUtilities.dp(6.0f)) - f12;
                            } else {
                                x4 = (yl0Var.f35099x.getX() + AndroidUtilities.dp(10.0f)) - f11;
                            }
                            yl0Var.C = x4;
                        } else {
                            f9 = 4.0f;
                            z11 = false;
                        }
                        if (yl0Var.B != null) {
                            i16 = AndroidUtilities.dp(21.0f);
                        } else {
                            i16 = 0;
                        }
                        float f16 = f15 + i16;
                        if (yl0Var.f35099x.getMeasuredHeight() + f16 > x2Var2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            ViewGroup viewGroup2 = yl0Var.f35100y;
                            viewGroup2.setPivotY(viewGroup2.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            yl0Var.f35099x.setY(((f14 - AndroidUtilities.dp(f9)) - yl0Var.f35099x.getMeasuredHeight()) - hv0Var.getY());
                            z12 = true;
                        } else {
                            yl0Var.f35100y.setPivotY(AndroidUtilities.dp(6.0f));
                            yl0Var.f35099x.setY(Math.min((x2Var2.getHeight() - yl0Var.f35099x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), f16) - hv0Var.getY());
                        }
                        j70 j70Var = yl0Var.f35098w;
                        j70Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = j70Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.f22705c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                        return;
                    }
                    return;
                }
                return;
            case 27:
                super.onLayout(z10, i10, i11, i12, i13);
                uu0.m((uu0) this.f2608b);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        boolean z10;
        float f9;
        float top;
        int measuredHeight;
        cg.h hVar;
        int i12;
        View view;
        int dp;
        int i13;
        int dp2;
        int dp3;
        switch (this.f2607a) {
            case 4:
                cg.p1 p1Var = (cg.p1) this.f2608b;
                z10 = ((org.telegram.ui.ActionBar.f3) p1Var).isPortrait;
                if (z10) {
                    p1Var.f3269s = View.MeasureSpec.getSize(i10);
                } else {
                    p1Var.f3269s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
                }
                super.onMeasure(i10, i11);
                return;
            case 5:
                super.onMeasure(i10, i11);
                cg.f2 f2Var = ((cg.e2) this.f2608b).f3111c;
                cg.i iVar = f2Var.f3134n0;
                if (iVar != null) {
                    top = iVar.getTop();
                    measuredHeight = f2Var.f3134n0.getMeasuredHeight();
                } else {
                    View view2 = f2Var.f3144x0;
                    if (view2 != null) {
                        top = view2.getTop();
                        measuredHeight = f2Var.f3144x0.getMeasuredHeight();
                    } else {
                        f9 = 0.0f;
                        f2Var.m0.setTranslationY(f9 - (hVar.getMeasuredHeight() / 2.0f));
                        return;
                    }
                }
                f9 = (measuredHeight / 2.0f) + top;
                f2Var.m0.setTranslationY(f9 - (hVar.getMeasuredHeight() / 2.0f));
                return;
            case 6:
                super.onMeasure(i10, i11);
                ((ih.y1) this.f2608b).G.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                return;
            case 15:
                if (View.MeasureSpec.getSize(i10) > AndroidUtilities.dp(260.0f)) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(320.0f), 1073741824), i11);
                    return;
                } else {
                    super.onMeasure(i10, i11);
                    return;
                }
            case 17:
                super.onMeasure(i10, i11);
                yk ykVar = ((bl) this.f2608b).B;
                if (ykVar != null) {
                    ykVar.a();
                    return;
                }
                return;
            case 20:
                int size = View.MeasureSpec.getSize(i10);
                mu muVar = (mu) this.f2608b;
                int min = (int) Math.min(muVar.D / (muVar.C / size), AndroidUtilities.displaySize.y / 2);
                if (muVar.F) {
                    i12 = 22;
                } else {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 84) + min + 1, 1073741824));
                return;
            case 21:
                ey eyVar = (ey) this.f2608b;
                if (((View) eyVar.B.getParent()) != null) {
                    dp = (int) (view.getMeasuredHeight() - eyVar.B.getY());
                } else {
                    dp = AndroidUtilities.dp(120.0f);
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp - eyVar.B.X0, 1073741824));
                return;
            case 22:
                fz fzVar = ((az) this.f2608b).M;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (org.telegram.ui.b.x(8.0f, fzVar.f28657z0.getMeasuredHeight() - fzVar.X0, 3) * 1.7f), 1073741824));
                return;
            case 27:
                uu0 uu0Var = (uu0) this.f2608b;
                jh.e1 e1Var = uu0Var.f33318b;
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
                getMeasuredWidth();
                int D = org.telegram.messenger.x3.D(54.0f, LocationController.getLocationsCount(), org.telegram.messenger.x3.C(56.0f, AndroidUtilities.dp(56.0f), 1));
                int i14 = size2 / 5;
                if (D < i14 * 3) {
                    i13 = AndroidUtilities.dp(8.0f);
                } else {
                    i13 = i14 * 2;
                    if (D < size2) {
                        i13 -= size2 - D;
                    }
                }
                if (e1Var.getPaddingTop() != i13) {
                    uu0Var.h = true;
                    e1Var.setPadding(0, i13, 0, AndroidUtilities.dp(8.0f));
                    uu0Var.h = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), 1073741824));
                return;
            case 29:
                fy0 fy0Var = (fy0) this.f2608b;
                int i15 = fy0Var.f28568n;
                if (fy0Var.h == 0) {
                    dp2 = AndroidUtilities.dp(8.0f);
                } else {
                    dp2 = AndroidUtilities.dp(6.66f);
                }
                int i16 = fy0Var.f28568n;
                if (fy0Var.h == 0) {
                    dp3 = AndroidUtilities.dp(6.66f);
                } else {
                    dp3 = AndroidUtilities.dp(8.0f);
                }
                setPadding(i15, dp2, i16, dp3);
                super.onMeasure(i10, i11);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f2607a) {
            case 11:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.f2608b;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i10, i11);
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                return;
            case 25:
                super.onSizeChanged(i10, i11, i12, i13);
                yl0 yl0Var = (yl0) this.f2608b;
                rg.c.c(yl0Var.h, yl0Var.f35097s);
                ViewGroup viewGroup = yl0Var.f35100y;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f2607a) {
            case 27:
                if (!((uu0) this.f2608b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f2607a) {
            case 24:
                jl0 jl0Var = (jl0) this.f2608b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(jl0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(jl0Var.getMeasuredHeight(), 1073741824));
                    layout(0, 0, jl0Var.Z0.getMeasuredWidth(), jl0Var.Z0.getMeasuredHeight());
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 25:
            case 26:
            default:
                super.requestLayout();
                return;
            case 27:
                if (!((uu0) this.f2608b).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 28:
                if (!((nx0) this.f2608b).f31172c0) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void setTranslationY(float f9) {
        switch (this.f2607a) {
            case 7:
                super.setTranslationY(f9);
                h5 h5Var = (h5) this.f2608b;
                jh.r3 r3Var = h5Var.Z;
                if (r3Var != null && r3Var.getVisibility() == 0) {
                    h5Var.Z.invalidate();
                    return;
                }
                return;
            case 12:
                gb gbVar = (gb) this.f2608b;
                if (getTranslationY() != f9 && gbVar.Y0 != null) {
                    super.setTranslationY(f9);
                    gbVar.Y0.y();
                    return;
                }
                return;
            default:
                super.setTranslationY(f9);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.f2607a) {
            case 23:
                super.setVisibility(i10);
                ((w20) this.f2608b).d.setVisibility(i10);
                return;
            case 29:
                fy0 fy0Var = (fy0) this.f2608b;
                if (getVisibility() == i10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                super.setVisibility(i10);
                if (!z10) {
                    if (i10 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (fy0Var.f28566e != null) {
                        for (int i11 = 0; i11 < fy0Var.f28566e.getChildCount(); i11++) {
                            if (z11) {
                                ey0 ey0Var = (ey0) fy0Var.f28566e.getChildAt(i11);
                                Drawable drawable = ey0Var.f28205b;
                                if (drawable instanceof p5) {
                                    ((p5) drawable).a(ey0Var);
                                }
                                ey0Var.f28206c = true;
                            } else {
                                ey0 ey0Var2 = (ey0) fy0Var.f28566e.getChildAt(i11);
                                Drawable drawable2 = ey0Var2.f28205b;
                                if (drawable2 instanceof p5) {
                                    ((p5) drawable2).o(ey0Var2);
                                }
                                ey0Var2.f28206c = false;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public x2(Object obj, Context context, int i10) {
        super(context);
        this.f2607a = i10;
        this.f2608b = obj;
    }

    public x2(v3 v3Var, Context context) {
        super(context);
        this.f2607a = 1;
        this.f2608b = v3Var;
        setWillNotDraw(false);
    }

    public x2(Context context, c6 c6Var) {
        super(context);
        this.f2607a = 19;
        this.f2608b = new ko[2];
        int i10 = 0;
        while (true) {
            ko[] koVarArr = (ko[]) this.f2608b;
            if (i10 < koVarArr.length) {
                koVarArr[i10] = new ko(context, c6Var);
                addView(((ko[]) this.f2608b)[i10], f6.e(-1, -1, 119));
                i10++;
            } else {
                koVarArr[0].setVisibility(0);
                ((ko[]) this.f2608b)[1].setVisibility(8);
                return;
            }
        }
    }

    public x2(y2 y2Var, Context context) {
        super(context);
        this.f2607a = 0;
        this.f2608b = y2Var;
        setWillNotDraw(false);
    }

    public x2(Context context, String str, lh.b bVar) {
        super(context);
        this.f2607a = 10;
        int dp = AndroidUtilities.dp(12.0f);
        int i10 = g6.f23169j5;
        setBackground(g6.b0(dp, g6.l1(0.06f, bVar.C0(i10))));
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        addView(g10, f6.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        o6 o6Var = new o6(context, false, true, true);
        this.f2608b = o6Var;
        o6Var.b(0.6f, 450L, jr.h);
        o6Var.setTextSize(AndroidUtilities.dp(17.0f));
        o6Var.setTextColor(bVar.C0(i10));
        o6Var.setScaleProperty(0.7f);
        o6Var.setGravity(17);
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setAllowCancel(true);
        g10.addView(o6Var, f6.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(bVar.C0(i10));
        textView.setGravity(17);
        g10.addView(textView, f6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    public x2(Context context, c30 c30Var) {
        super(context);
        this.f2607a = 14;
        this.f2608b = c30Var;
    }
}
