package fh;

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
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import gh.oa;
import java.util.ArrayList;
import kh.wb;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.ll;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.au;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.go;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.iu0;
import org.telegram.ui.Components.j20;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.p20;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.sx0;
import org.telegram.ui.Components.tx0;
import org.telegram.ui.Components.uk;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.ve;
import org.telegram.ui.Components.vx;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.wy;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.xk;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.fh1;
public final class d2 extends FrameLayout {
    public final int f6411a;
    public Object f6412b;

    public d2(Context context, int i9) {
        super(context);
        this.f6411a = i9;
    }

    public go a() {
        return ((go[]) this.f6412b)[0];
    }

    @Override
    public void addView(View view, int i9, int i10) {
        switch (this.f6411a) {
            case 27:
                super.addView(view, i9, i10);
                ((pg.f) this.f6412b).e();
                return;
            default:
                super.addView(view, i9, i10);
                return;
        }
    }

    public void b() {
        go[] goVarArr = (go[]) this.f6412b;
        go goVar = goVarArr[0];
        go goVar2 = goVarArr[1];
        goVarArr[0] = goVar2;
        goVarArr[1] = goVar;
        goVar2.f28826n = true;
        goVar2.setVisibility(0);
        goVarArr[0].setScaleX(0.8f);
        goVarArr[0].setScaleY(0.8f);
        goVarArr[0].setAlpha(0.0f);
        goVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = goVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        gr grVar = gr.h;
        ll.r(translationY, grVar, 320L);
        go goVar3 = goVarArr[1];
        goVar3.f28826n = false;
        goVar3.setVisibility(0);
        goVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(grVar).setDuration(320L).withEndAction(new fg(goVar3, 28)).start();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f10;
        float f11;
        int size;
        boolean z11;
        float f12;
        int dp;
        int i9;
        float f13;
        float f14;
        float f15;
        float dp2;
        ArrayList arrayList;
        switch (this.f6411a) {
            case 20:
                ll0 ll0Var = (ll0) this.f6412b;
                if (ll0Var.f30476r > 0.0f && ll0Var.f30473e != null) {
                    ll0Var.f30474f.reset();
                    float width = getWidth() / ll0Var.f30472c.getWidth();
                    ll0Var.f30474f.postScale(width, width);
                    ll0Var.d.setLocalMatrix(ll0Var.f30474f);
                    ll0Var.f30473e.setAlpha((int) (ll0Var.f30476r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), ll0Var.f30473e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = ll0Var.A;
                if (drawable != null) {
                    drawable.setAlpha((int) (ll0Var.f30476r * 255.0f));
                    canvas.save();
                    float f16 = ll0Var.D;
                    float f17 = ll0Var.C;
                    float f18 = ll0Var.f30476r;
                    canvas.translate((f17 * f18) + f16, (0.0f * f18) + ll0Var.E);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(ll0Var.F, ll0Var.G), Math.max(ll0Var.F, ll0Var.G), 0.75f), 1.0f, ll0Var.f30476r);
                    canvas.scale(lerp, lerp, ((ll0Var.A.getBounds().width() / 2.0f) * ll0Var.F) + (-ll0Var.D) + ll0Var.A.getBounds().left, ((ll0Var.A.getBounds().height() / 2.0f) * ll0Var.G) + (-ll0Var.E) + ll0Var.A.getBounds().top);
                    kg.d dVar = ll0Var.B;
                    if (dVar != null) {
                        dVar.setAlpha((int) (ll0Var.f30476r * 255.0f));
                        ll0Var.B.draw(canvas);
                    }
                    ll0Var.A.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 24:
                ux0 ux0Var = (ux0) this.f6412b;
                sx0 sx0Var = ux0Var.f33160c;
                if (sx0Var != null && sx0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = ux0Var.P;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x10 = ux0Var.f33160c.getEditField().getX() + ux0Var.f33160c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = ux0Var.P;
                        ux0Var.T = x10 + emojiSpan2.lastDrawX;
                        ux0Var.Q = emojiSpan2.lastDrawY;
                    } else if (ux0Var.R != null && ux0Var.S != null) {
                        ux0Var.T = ux0Var.f33160c.getEditField().getX() + ux0Var.f33160c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                if (ux0Var.f33165s && !ux0Var.v && (arrayList = ux0Var.f33166w) != null && !arrayList.isEmpty() && !ux0Var.f33167x) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.y5 y5Var = ux0Var.L;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float d = y5Var.d(f10, false);
                org.telegram.ui.Components.y5 y5Var2 = ux0Var.M;
                if (z10) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                float d9 = y5Var2.d(f11, false);
                float d10 = ux0Var.U.d(ux0Var.T, false);
                if (d <= 0.0f && d9 <= 0.0f && !z10) {
                    ux0Var.d.setVisibility(8);
                }
                ux0Var.I.rewind();
                float left = ux0Var.f33161e.getLeft();
                int left2 = ux0Var.f33161e.getLeft();
                ArrayList arrayList2 = ux0Var.f33166w;
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                float D = org.telegram.messenger.l0.D(44.0f, size, left2);
                org.telegram.ui.Components.y5 y5Var3 = ux0Var.W;
                float f19 = y5Var3.f34854c;
                if (f19 <= 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                float f20 = D - left;
                if (f20 > 0.0f) {
                    f19 = y5Var3.d(f20, z11);
                }
                float d11 = ux0Var.V.d((left + D) / 2.0f, z11);
                sx0 sx0Var2 = ux0Var.f33160c;
                if (sx0Var2 != null && sx0Var2.getEditField() != null) {
                    int i10 = ux0Var.h;
                    if (i10 == 0) {
                        ux0Var.d.setTranslationY(((-ux0Var.f33160c.getEditField().getHeight()) - ux0Var.f33160c.getEditField().getScrollY()) + ux0Var.Q + AndroidUtilities.dp(5.0f));
                    } else if (i10 == 1) {
                        ux0Var.d.setTranslationY(((-ux0Var.getMeasuredHeight()) - ux0Var.f33160c.getEditField().getScrollY()) + ux0Var.Q + AndroidUtilities.dp(20.0f) + ux0Var.d.getHeight());
                    }
                }
                float f21 = f19 / 4.0f;
                float f22 = f19 / 2.0f;
                int max = (int) Math.max((ux0Var.T - Math.max(f21, Math.min(f22, AndroidUtilities.dp(66.0f)))) - ux0Var.f33161e.getLeft(), 0.0f);
                if (ux0Var.f33161e.getPaddingLeft() != max) {
                    f12 = 1.0f;
                    ux0Var.f33161e.setPadding(max, 0, 0, 0);
                    ux0Var.f33161e.scrollBy(ux0Var.f33161e.getPaddingLeft() - max, 0);
                } else {
                    f12 = 1.0f;
                }
                ux0Var.f33161e.setTranslationX(((int) Math.max((d10 - Math.max(f21, Math.min(f22, AndroidUtilities.dp(66.0f)))) - ux0Var.f33161e.getLeft(), 0.0f)) - max);
                float translationX = ux0Var.f33161e.getTranslationX() + (d11 - f22) + ux0Var.f33161e.getPaddingLeft();
                float translationY = ux0Var.f33161e.getTranslationY() + ux0Var.f33161e.getTop() + ux0Var.f33161e.getPaddingTop();
                if (ux0Var.h == 0) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(6.66f);
                }
                float f23 = translationY + dp;
                float min = Math.min(ux0Var.f33161e.getTranslationX() + d11 + f22 + ux0Var.f33161e.getPaddingLeft(), ux0Var.getWidth() - ux0Var.d.getPaddingRight());
                float translationY2 = ux0Var.f33161e.getTranslationY() + ux0Var.f33161e.getBottom();
                if (ux0Var.h == 0) {
                    i9 = AndroidUtilities.dp(6.66f);
                } else {
                    i9 = 0;
                }
                float f24 = translationY2 - i9;
                float min2 = Math.min(AndroidUtilities.dp(9.0f), f22) * 2.0f;
                int i11 = ux0Var.h;
                if (i11 == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f25 = f24 - min2;
                    float f26 = translationX + min2;
                    rectF.set(translationX, f25, f26, f24);
                    ux0Var.I.arcTo(rectF, 90.0f, 90.0f);
                    float f27 = f23 + min2;
                    rectF.set(translationX, f23, f26, f27);
                    ux0Var.I.arcTo(rectF, -180.0f, 90.0f);
                    float f28 = min - min2;
                    rectF.set(f28, f23, min, f27);
                    ux0Var.I.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f28, f25, min, f24);
                    ux0Var.I.arcTo(rectF, 0.0f, 90.0f);
                    ux0Var.I.lineTo(AndroidUtilities.dp(8.66f) + d10, f24);
                    ux0Var.I.lineTo(d10, AndroidUtilities.dp(6.66f) + f24);
                    ux0Var.I.lineTo(d10 - AndroidUtilities.dp(8.66f), f24);
                } else if (i11 == 1) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f29 = min - min2;
                    float f30 = f23 + min2;
                    rectF2.set(f29, f23, min, f30);
                    ux0Var.I.arcTo(rectF2, -90.0f, 90.0f);
                    float f31 = f24 - min2;
                    rectF2.set(f29, f31, min, f24);
                    ux0Var.I.arcTo(rectF2, 0.0f, 90.0f);
                    float f32 = min2 + translationX;
                    rectF2.set(translationX, f31, f32, f24);
                    ux0Var.I.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, f23, f32, f30);
                    ux0Var.I.arcTo(rectF2, -180.0f, 90.0f);
                    ux0Var.I.lineTo(d10 - AndroidUtilities.dp(8.66f), f23);
                    ux0Var.I.lineTo(d10, f23 - AndroidUtilities.dp(6.66f));
                    ux0Var.I.lineTo(AndroidUtilities.dp(8.66f) + d10, f23);
                }
                ux0Var.I.close();
                if (ux0Var.K == null) {
                    Paint paint = new Paint(1);
                    ux0Var.K = paint;
                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.0f)));
                    ux0Var.K.setShadowLayer(AndroidUtilities.dp(4.33f), 0.0f, AndroidUtilities.dp(0.33333334f), 855638016);
                    ux0Var.K.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Be, ux0Var.f33159b));
                }
                if (d < f12) {
                    ux0Var.J.rewind();
                    if (ux0Var.h == 0) {
                        dp2 = AndroidUtilities.dp(6.66f) + f24;
                    } else {
                        dp2 = f23 - AndroidUtilities.dp(6.66f);
                    }
                    double d12 = d10 - translationX;
                    double d13 = dp2 - f23;
                    f13 = 255.0f;
                    double d14 = d10 - min;
                    double d15 = dp2 - f24;
                    ux0Var.J.addCircle(d10, dp2, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d13, 2.0d) + Math.pow(d12, 2.0d), Math.pow(d13, 2.0d) + Math.pow(d14, 2.0d)), Math.max(Math.pow(d15, 2.0d) + Math.pow(d12, 2.0d), Math.pow(d15, 2.0d) + Math.pow(d14, 2.0d))))) * d, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(ux0Var.J);
                    canvas.saveLayerAlpha(0.0f, 0.0f, ux0Var.getWidth(), ux0Var.getHeight(), (int) (d * 255.0f), 31);
                } else {
                    f13 = 255.0f;
                }
                canvas.drawPath(ux0Var.I, ux0Var.K);
                canvas.save();
                canvas.clipPath(ux0Var.I);
                super.dispatchDraw(canvas);
                float f33 = ux0Var.W.f34854c;
                float f34 = ux0Var.V.f34854c;
                float f35 = f33 / 2.0f;
                float translationX2 = ux0Var.f33161e.getTranslationX() + (f34 - f35) + ux0Var.f33161e.getPaddingLeft();
                float paddingTop = ux0Var.f33161e.getPaddingTop() + ux0Var.f33161e.getTop();
                float min3 = Math.min(ux0Var.f33161e.getTranslationX() + f34 + f35 + ux0Var.f33161e.getPaddingLeft(), ux0Var.getWidth() - ux0Var.d.getPaddingRight());
                float bottom = ux0Var.f33161e.getBottom();
                org.telegram.ui.Components.y5 y5Var4 = ux0Var.N;
                if (ux0Var.f33161e.canScrollHorizontally(-1)) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                float d16 = y5Var4.d(f14, false);
                if (d16 > 0.0f) {
                    int i12 = (int) translationX2;
                    org.telegram.ui.ActionBar.f6.F4.setBounds(i12, (int) paddingTop, AndroidUtilities.dp(32.0f) + i12, (int) bottom);
                    org.telegram.ui.ActionBar.f6.F4.setAlpha((int) (d16 * f13));
                    org.telegram.ui.ActionBar.f6.F4.draw(canvas);
                }
                org.telegram.ui.Components.y5 y5Var5 = ux0Var.O;
                if (ux0Var.f33161e.canScrollHorizontally(1)) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                float d17 = y5Var5.d(f15, false);
                if (d17 > 0.0f) {
                    int i13 = (int) min3;
                    org.telegram.ui.ActionBar.f6.E4.setBounds(i13 - AndroidUtilities.dp(32.0f), (int) paddingTop, i13, (int) bottom);
                    org.telegram.ui.ActionBar.f6.E4.setAlpha((int) (d17 * f13));
                    org.telegram.ui.ActionBar.f6.E4.draw(canvas);
                }
                canvas.restore();
                if (ux0Var.L.f34854c < f12) {
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
        switch (this.f6411a) {
            case 21:
                ve veVar = (ve) this.f6412b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && veVar.isShowing()) {
                    veVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f6411a) {
            case 20:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((ll0) this.f6412b).onBackPressed();
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
        switch (this.f6411a) {
            case 2:
                if (((oa) this.f6412b).f8696b0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 5:
                int action = motionEvent.getAction();
                ih.k1 k1Var = ih.k1.V;
                if (k1Var.C != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(k1Var.C.getX(), k1Var.C.getY());
                    boolean dispatchTouchEvent = k1Var.C.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (action == 1 || action == 3) {
                        k1Var.C = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = k1Var.f11665x.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!k1Var.f11665x.isInProgress() && ((GestureDetector) k1Var.f11666y.f17378b).onTouchEvent(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (action == 1 || action == 3) {
                    k1Var.A = false;
                    k1Var.B = false;
                    o1.j jVar = k1Var.L;
                    if (!jVar.f18794f) {
                        float f10 = k1Var.J;
                        jVar.f18791b = f10;
                        jVar.f18792c = true;
                        o1.k kVar = jVar.f18800u;
                        int i9 = k1Var.F;
                        float f11 = (i9 / 2.0f) + f10;
                        int i10 = AndroidUtilities.displaySize.x;
                        if (f11 >= i10 / 2.0f) {
                            dp = (i10 - i9) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        kVar.f18807i = dp;
                        k1Var.L.f();
                    }
                    o1.j jVar2 = k1Var.M;
                    if (!jVar2.f18794f) {
                        float f12 = k1Var.K;
                        jVar2.f18791b = f12;
                        jVar2.f18792c = true;
                        jVar2.f18800u.f18807i = g7.n.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - k1Var.G) - AndroidUtilities.dp(16.0f));
                        k1Var.M.f();
                    }
                }
                if (onTouchEvent || z10) {
                    return true;
                }
                return false;
            case 7:
                if (((lh.g) this.f6412b).f16880a0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 12:
                if (motionEvent.getY() > getMeasuredHeight() - ((xk) this.f6412b).f34715x0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f6411a) {
            case 12:
                canvas.save();
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                xk xkVar = (xk) this.f6412b;
                boolean z10 = false;
                canvas.clipRect(0, 0, measuredWidth, measuredHeight - xkVar.f34715x0);
                if (!xkVar.C) {
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
        switch (this.f6411a) {
            case 5:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                ih.k1 k1Var = ih.k1.V;
                AndroidUtilities.setPreferredMaxRefreshRate(k1Var.f11657b, k1Var.d, k1Var.f11658c);
                k1Var.i();
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f6411a) {
            case 15:
                gu guVar = (gu) this.f6412b;
                g81 g81Var = guVar.f28869c;
                au auVar = guVar.f28868b;
                super.onDetachedFromWindow();
                try {
                    pf0 pf0Var = pf0.f31622l0;
                    if (pf0Var.L) {
                        if (auVar.getVisibility() != 0) {
                        }
                        if (g81Var.f() && !pf0Var.L) {
                            if (gu.O == guVar) {
                                gu.O = null;
                            }
                            g81Var.b();
                            return;
                        }
                        return;
                    }
                    if (auVar.getParent() != null) {
                        removeView(auVar);
                        auVar.stopLoading();
                        auVar.loadUrl("about:blank");
                        auVar.destroy();
                    }
                    if (g81Var.f()) {
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
        o51 o51Var;
        d2 d2Var;
        MediaController.CropState cropState;
        switch (this.f6411a) {
            case 10:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.h) this.f6412b) == null) {
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                    this.f6412b = hVar;
                    hVar.f33545k = false;
                    hVar.f33547m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.f6412b).f33541f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f6412b).a(AndroidUtilities.dp(4.0f), canvas, rectF, null);
                invalidate();
                return;
            case 11:
                ((v9) this.f6412b).f33330e.a(canvas);
                return;
            case 12:
                xk xkVar = (xk) this.f6412b;
                xkVar.W.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, xkVar.f27492a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - xkVar.f34715x0, xkVar.W);
                return;
            case 22:
                iu0 iu0Var = (iu0) this.f6412b;
                Drawable drawable = iu0Var.d;
                drawable.setBounds(0, iu0Var.f29527f - iu0.n(iu0Var), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 25:
                Drawable drawable2 = ((o51) this.f6412b).f31297b;
                drawable2.setBounds(0, (int) ((o51Var.h - o51.n(o51Var)) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                drawable2.draw(canvas);
                return;
            case 28:
                yf.x1 x1Var = (yf.x1) this.f6412b;
                Rect rect = x1Var.A0;
                Rect rect2 = x1Var.f50180z0;
                Paint paint = x1Var.B0;
                qu0 qu0Var = x1Var.f50172r0;
                Bitmap bitmap = x1Var.f50177w0;
                if (x1Var.f50176v0 != null) {
                    canvas.save();
                    float e10 = x1Var.f50171q0.e(x1Var.f50170p0);
                    canvas.scale(1.0f - (e10 * 2.0f), 1.0f, qu0Var.f32026a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.l0.y(1.0f, e10, 4.0f * e10, 0.25f));
                    float e11 = x1Var.f50175u0.e(x1Var.f50174t0);
                    if (!x1Var.f50174t0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e11) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(d2Var.getWidth() / 2.0f, d2Var.getHeight() / 2.0f);
                            canvas.rotate(x1Var.f50173s0);
                            float max = Math.max(qu0Var.f32026a / bitmap.getWidth(), qu0Var.f32027b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (x1Var.C0 != null) {
                                canvas.rotate(-x1Var.getOrientation());
                                int contentWidth = x1Var.getContentWidth();
                                int contentHeight = x1Var.getContentHeight();
                                if (((x1Var.getOrientation() + x1Var.C0.transformRotation) / 90) % 2 == 1) {
                                    contentWidth = x1Var.getContentHeight();
                                    contentHeight = x1Var.getContentWidth();
                                }
                                MediaController.CropState cropState2 = x1Var.C0;
                                float f10 = cropState2.cropPw;
                                float f11 = cropState2.cropPh;
                                float f12 = contentWidth;
                                float f13 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f10) / 2.0f, ((-contentHeight) * f11) / 2.0f, (f10 * f12) / 2.0f, (f11 * f13) / 2.0f);
                                float f14 = x1Var.C0.cropScale;
                                canvas.scale(f14, f14);
                                MediaController.CropState cropState3 = x1Var.C0;
                                canvas.translate(cropState3.cropPx * f12, cropState3.cropPy * f13);
                                canvas.rotate(x1Var.C0.cropRotate + cropState.transformRotation);
                                if (x1Var.C0.mirrored) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(x1Var.getOrientation());
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
            case 29:
                yf.n2 n2Var = (yf.n2) this.f6412b;
                ImageReceiver imageReceiver = n2Var.f50040t0;
                qu0 qu0Var2 = n2Var.f50038r0;
                if (n2Var.f50039s0 != null) {
                    canvas.save();
                    float e12 = n2Var.f50037q0.e(n2Var.f50036p0);
                    canvas.scale(1.0f - (e12 * 2.0f), 1.0f, qu0Var2.f32026a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.l0.y(1.0f, e12, 4.0f * e12, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) qu0Var2.f32026a, (int) qu0Var2.f32027b);
                    imageReceiver.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f6411a) {
            case 12:
                if (motionEvent.getY() > getMeasuredHeight() - ((xk) this.f6412b).f34715x0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 22:
                iu0 iu0Var = (iu0) this.f6412b;
                if (motionEvent.getAction() == 0 && iu0Var.f29527f != 0 && motionEvent.getY() < iu0Var.f29527f) {
                    iu0Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 25:
                o51 o51Var = (o51) this.f6412b;
                if (motionEvent.getAction() == 0 && o51Var.h != 0 && motionEvent.getY() < o51Var.h) {
                    o51Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        int measuredWidth;
        int measuredHeight;
        int dp;
        int measuredHeight2;
        int i13;
        int i14;
        float f10;
        boolean z11;
        int i15;
        float x10;
        switch (this.f6411a) {
            case 3:
                super.onLayout(z10, i9, i10, i11, i12);
                hg.s sVar = (hg.s) this.f6412b;
                if (sVar.G && z10) {
                    sVar.f10727w.setTranslationY(-sVar.f10721c.getMeasuredHeight());
                    int measuredHeight3 = sVar.f10721c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.f10729y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight3;
                    sVar.f10729y.setLayoutParams(marginLayoutParams);
                    return;
                }
                return;
            case 9:
                super.onLayout(z10, i9, i10, i11, i12);
                p20 p20Var = (p20) this.f6412b;
                p20Var.setTranslationY((getMeasuredHeight() * 0.28f) - (p20Var.getMeasuredWidth() / 2.0f));
                p20Var.setTranslationX((getMeasuredWidth() * 0.82f) - (p20Var.getMeasuredWidth() / 2.0f));
                return;
            case 11:
                super.onLayout(z10, i9, i10, i11, i12);
                int dp2 = AndroidUtilities.dp(36.0f);
                int i16 = ((i11 - i9) - dp2) / 2;
                int i17 = ((i12 - i10) - dp2) / 2;
                ((v9) this.f6412b).f33330e.f(i16, i17, i16 + dp2, dp2 + i17);
                return;
            case 13:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f6412b;
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    measuredWidth = getMeasuredWidth() / 2;
                    measuredHeight = getMeasuredHeight() / 2;
                    i13 = getMeasuredWidth() / 2;
                    int i18 = measuredHeight / 2;
                    measuredHeight2 = AndroidUtilities.dp(17.0f) + measuredHeight + i18;
                    i14 = i18 - AndroidUtilities.dp(17.0f);
                    dp = i13;
                } else {
                    measuredWidth = getMeasuredWidth() / 2;
                    measuredHeight = (getMeasuredHeight() / 2) - AndroidUtilities.dp(13.0f);
                    int i19 = measuredWidth / 2;
                    int dp3 = measuredWidth + i19 + AndroidUtilities.dp(17.0f);
                    dp = i19 - AndroidUtilities.dp(17.0f);
                    measuredHeight2 = (getMeasuredHeight() / 2) - AndroidUtilities.dp(13.0f);
                    i13 = dp3;
                    i14 = measuredHeight2;
                }
                int measuredHeight4 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.m0.getMeasuredHeight()) - AndroidUtilities.dp(12.0f);
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.m0;
                    textView.layout(measuredWidth - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.m0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.m0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.m0;
                    textView2.layout(measuredWidth - (textView2.getMeasuredWidth() / 2), measuredHeight4, (chatAttachAlertPhotoLayout.m0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.m0.getMeasuredHeight() + measuredHeight4);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.f26258g0;
                shutterButton.layout(measuredWidth - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.f26258g0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f26258g0.getMeasuredWidth() / 2) + measuredWidth, (chatAttachAlertPhotoLayout.f26258g0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.f26270n0;
                imageView.layout(i13 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.f26270n0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f26270n0.getMeasuredWidth() / 2) + i13, (chatAttachAlertPhotoLayout.f26270n0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i20 = 0; i20 < 2; i20++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.O[i20];
                    imageView2.layout(dp - (imageView2.getMeasuredWidth() / 2), i14 - (chatAttachAlertPhotoLayout.O[i20].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.O[i20].getMeasuredWidth() / 2) + dp, (chatAttachAlertPhotoLayout.O[i20].getMeasuredHeight() / 2) + i14);
                }
                return;
            case 18:
                super.onLayout(z10, i9, i10, i11, i12);
                j20 j20Var = (j20) this.f6412b;
                d2 d2Var = j20Var.f29599b;
                int[] iArr = j20Var.C;
                d2Var.getLocationOnScreen(iArr);
                j20Var.J = iArr[0];
                j20Var.I = iArr[1] - AndroidUtilities.dp(25.0f);
                return;
            case 20:
                super.onLayout(z10, i9, i10, i11, i12);
                ll0 ll0Var = (ll0) this.f6412b;
                d2 d2Var2 = ll0Var.f30477s;
                xu0 xu0Var = ll0Var.v;
                Drawable drawable = ll0Var.A;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    FrameLayout frameLayout = ll0Var.f30479x;
                    if (frameLayout != null) {
                        float f11 = ll0Var.D;
                        float f12 = bounds.left + f11;
                        float f13 = bounds.right + f11;
                        float f14 = ll0Var.E;
                        float f15 = bounds.top + f14;
                        float f16 = bounds.bottom + f14;
                        boolean z12 = false;
                        if (!ll0Var.H) {
                            if (f13 - frameLayout.getMeasuredWidth() < AndroidUtilities.dp(8.0f)) {
                                ll0Var.f30480y.setPivotX(AndroidUtilities.dp(6.0f));
                                ll0Var.f30479x.setX(Math.min(xu0Var.getWidth() - ll0Var.f30479x.getWidth(), f12 - AndroidUtilities.dp(10.0f)) - xu0Var.getX());
                                f10 = 4.0f;
                                z11 = false;
                            } else {
                                ViewGroup viewGroup = ll0Var.f30480y;
                                viewGroup.setPivotX(viewGroup.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f10 = 4.0f;
                                ll0Var.f30479x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f13) - ll0Var.f30479x.getMeasuredWidth()) - xu0Var.getX());
                                z11 = true;
                            }
                            if (z11) {
                                x10 = ((ll0Var.f30479x.getX() + ll0Var.f30479x.getWidth()) - AndroidUtilities.dp(6.0f)) - f13;
                            } else {
                                x10 = (ll0Var.f30479x.getX() + AndroidUtilities.dp(10.0f)) - f12;
                            }
                            ll0Var.C = x10;
                        } else {
                            f10 = 4.0f;
                            z11 = false;
                        }
                        if (ll0Var.B != null) {
                            i15 = AndroidUtilities.dp(21.0f);
                        } else {
                            i15 = 0;
                        }
                        float f17 = f16 + i15;
                        if (ll0Var.f30479x.getMeasuredHeight() + f17 > d2Var2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            ViewGroup viewGroup2 = ll0Var.f30480y;
                            viewGroup2.setPivotY(viewGroup2.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            ll0Var.f30479x.setY(((f15 - AndroidUtilities.dp(f10)) - ll0Var.f30479x.getMeasuredHeight()) - xu0Var.getY());
                            z12 = true;
                        } else {
                            ll0Var.f30480y.setPivotY(AndroidUtilities.dp(6.0f));
                            ll0Var.f30479x.setY(Math.min((d2Var2.getHeight() - ll0Var.f30479x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), f17) - xu0Var.getY());
                        }
                        x60 x60Var = ll0Var.f30478w;
                        x60Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = x60Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.f22693c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                        return;
                    }
                    return;
                }
                return;
            case 22:
                super.onLayout(z10, i9, i10, i11, i12);
                iu0.m((iu0) this.f6412b);
                return;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        int i11;
        int dp;
        int i12;
        int dp2;
        int dp3;
        switch (this.f6411a) {
            case 0:
                super.onMeasure(i9, i10);
                ((f2) this.f6412b).G.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                return;
            case 10:
                if (View.MeasureSpec.getSize(i9) > AndroidUtilities.dp(260.0f)) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(320.0f), 1073741824), i10);
                    return;
                } else {
                    super.onMeasure(i9, i10);
                    return;
                }
            case 12:
                super.onMeasure(i9, i10);
                uk ukVar = ((xk) this.f6412b).B;
                if (ukVar != null) {
                    ukVar.a();
                    return;
                }
                return;
            case 15:
                int size = View.MeasureSpec.getSize(i9);
                gu guVar = (gu) this.f6412b;
                int min = (int) Math.min(guVar.D / (guVar.C / size), AndroidUtilities.displaySize.y / 2);
                if (guVar.F) {
                    i11 = 22;
                } else {
                    i11 = 0;
                }
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i11 + 84) + min + 1, 1073741824));
                return;
            case 16:
                vx vxVar = (vx) this.f6412b;
                View view = (View) vxVar.B.getParent();
                if (view != null) {
                    dp = (int) (view.getMeasuredHeight() - vxVar.B.getY());
                } else {
                    dp = AndroidUtilities.dp(120.0f);
                }
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(dp - vxVar.B.X0, 1073741824));
                return;
            case 17:
                wy wyVar = ((ry) this.f6412b).M;
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec((int) (ll.y(8.0f, wyVar.f34466z0.getMeasuredHeight() - wyVar.X0, 3) * 1.7f), 1073741824));
                return;
            case 22:
                iu0 iu0Var = (iu0) this.f6412b;
                gh.f1 f1Var = iu0Var.f29524b;
                int size2 = View.MeasureSpec.getSize(i10) - AndroidUtilities.statusBarHeight;
                getMeasuredWidth();
                int D = org.telegram.messenger.l0.D(54.0f, LocationController.getLocationsCount(), org.telegram.messenger.l0.C(56.0f, AndroidUtilities.dp(56.0f), 1));
                int i13 = size2 / 5;
                if (D < i13 * 3) {
                    i12 = AndroidUtilities.dp(8.0f);
                } else {
                    i12 = i13 * 2;
                    if (D < size2) {
                        i12 -= size2 - D;
                    }
                }
                if (f1Var.getPaddingTop() != i12) {
                    iu0Var.h = true;
                    f1Var.setPadding(0, i12, 0, AndroidUtilities.dp(8.0f));
                    iu0Var.h = false;
                }
                super.onMeasure(i9, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), 1073741824));
                return;
            case 24:
                ux0 ux0Var = (ux0) this.f6412b;
                int i14 = ux0Var.f33163n;
                if (ux0Var.h == 0) {
                    dp2 = AndroidUtilities.dp(8.0f);
                } else {
                    dp2 = AndroidUtilities.dp(6.66f);
                }
                int i15 = ux0Var.f33163n;
                if (ux0Var.h == 0) {
                    dp3 = AndroidUtilities.dp(6.66f);
                } else {
                    dp3 = AndroidUtilities.dp(8.0f);
                }
                setPadding(i14, dp2, i15, dp3);
                super.onMeasure(i9, i10);
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.f6411a) {
            case 5:
                super.onSizeChanged(i9, i10, i11, i12);
                Path path = (Path) this.f6412b;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i9, i10);
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                return;
            case 20:
                super.onSizeChanged(i9, i10, i11, i12);
                ll0 ll0Var = (ll0) this.f6412b;
                og.d.c(ll0Var.h, ll0Var.f30477s);
                ViewGroup viewGroup = ll0Var.f30480y;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                    return;
                }
                return;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f6411a) {
            case 22:
                if (!((iu0) this.f6412b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 23:
            case 24:
            default:
                return super.onTouchEvent(motionEvent);
            case 25:
                if (!((o51) this.f6412b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 26:
                ((fh1) this.f6412b).P.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f6411a) {
            case 19:
                wk0 wk0Var = (wk0) this.f6412b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(wk0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(wk0Var.getMeasuredHeight(), 1073741824));
                    layout(0, 0, wk0Var.Z0.getMeasuredWidth(), wk0Var.Z0.getMeasuredHeight());
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 20:
            case 21:
            default:
                super.requestLayout();
                return;
            case 22:
                if (!((iu0) this.f6412b).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 23:
                if (!((cx0) this.f6412b).f27574c0) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f6411a) {
            case 1:
                super.setTranslationY(f10);
                gh.k5 k5Var = (gh.k5) this.f6412b;
                gh.s3 s3Var = k5Var.Z;
                if (s3Var != null && s3Var.getVisibility() == 0) {
                    k5Var.Z.invalidate();
                    return;
                }
                return;
            case 6:
                wb wbVar = (wb) this.f6412b;
                if (getTranslationY() != f10 && wbVar.Y0 != null) {
                    super.setTranslationY(f10);
                    wbVar.Y0.y();
                    return;
                }
                return;
            case 25:
                super.setTranslationY(f10);
                o51.m((o51) this.f6412b);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i9) {
        boolean z10;
        boolean z11;
        switch (this.f6411a) {
            case 18:
                super.setVisibility(i9);
                ((j20) this.f6412b).d.setVisibility(i9);
                return;
            case 24:
                ux0 ux0Var = (ux0) this.f6412b;
                if (getVisibility() == i9) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                super.setVisibility(i9);
                if (!z10) {
                    if (i9 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (ux0Var.f33161e != null) {
                        for (int i10 = 0; i10 < ux0Var.f33161e.getChildCount(); i10++) {
                            if (z11) {
                                tx0 tx0Var = (tx0) ux0Var.f33161e.getChildAt(i10);
                                Drawable drawable = tx0Var.f32831b;
                                if (drawable instanceof org.telegram.ui.Components.k5) {
                                    ((org.telegram.ui.Components.k5) drawable).a(tx0Var);
                                }
                                tx0Var.f32832c = true;
                            } else {
                                tx0 tx0Var2 = (tx0) ux0Var.f33161e.getChildAt(i10);
                                Drawable drawable2 = tx0Var2.f32831b;
                                if (drawable2 instanceof org.telegram.ui.Components.k5) {
                                    ((org.telegram.ui.Components.k5) drawable2).o(tx0Var2);
                                }
                                tx0Var2.f32832c = false;
                            }
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                super.setVisibility(i9);
                return;
        }
    }

    public d2(Object obj, Context context, int i9) {
        super(context);
        this.f6411a = i9;
        this.f6412b = obj;
    }

    public d2(yf.n2 n2Var, Context context) {
        super(context);
        this.f6411a = 29;
        this.f6412b = n2Var;
        setWillNotDraw(false);
    }

    public d2(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f6411a = 14;
        this.f6412b = new go[2];
        int i9 = 0;
        while (true) {
            go[] goVarArr = (go[]) this.f6412b;
            if (i9 < goVarArr.length) {
                goVarArr[i9] = new go(context, b6Var);
                addView(((go[]) this.f6412b)[i9], g7.e6.e(-1, -1, 119));
                i9++;
            } else {
                goVarArr[0].setVisibility(0);
                ((go[]) this.f6412b)[1].setVisibility(8);
                return;
            }
        }
    }

    public d2(yf.x1 x1Var, Context context) {
        super(context);
        this.f6411a = 28;
        this.f6412b = x1Var;
        setWillNotDraw(false);
    }

    public d2(Context context, String str, ih.b bVar) {
        super(context);
        this.f6411a = 4;
        int dp = AndroidUtilities.dp(12.0f);
        int i9 = org.telegram.ui.ActionBar.f6.f23108j5;
        setBackground(org.telegram.ui.ActionBar.f6.b0(dp, org.telegram.ui.ActionBar.f6.l1(0.06f, bVar.N0(i9))));
        LinearLayout f10 = ll.f(context, 1);
        addView(f10, g7.e6.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, true, true);
        this.f6412b = j6Var;
        j6Var.b(0.6f, 450L, gr.h);
        j6Var.setTextSize(AndroidUtilities.dp(17.0f));
        j6Var.setTextColor(bVar.N0(i9));
        j6Var.setScaleProperty(0.7f);
        j6Var.setGravity(17);
        j6Var.setTypeface(AndroidUtilities.bold());
        j6Var.setAllowCancel(true);
        f10.addView(j6Var, g7.e6.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(bVar.N0(i9));
        textView.setGravity(17);
        f10.addView(textView, g7.e6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    public d2(Context context, p20 p20Var) {
        super(context);
        this.f6411a = 9;
        this.f6412b = p20Var;
    }
}
