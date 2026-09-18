package ai;

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
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.wh;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.ef;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.og;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.q91;
import org.telegram.ui.Components.qo;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.Components.z20;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.zy0;
import org.telegram.ui.fg0;
import org.telegram.ui.li1;
public final class f0 extends FrameLayout {
    public final int f784a;
    public Object f785b;

    public f0(Context context, int i10) {
        super(context);
        this.f784a = i10;
    }

    public qo a() {
        return ((qo[]) this.f785b)[0];
    }

    @Override
    public void addView(View view, int i10, int i11) {
        switch (this.f784a) {
            case 5:
                super.addView(view, i10, i11);
                ((hh.g) this.f785b).e();
                return;
            default:
                super.addView(view, i10, i11);
                return;
        }
    }

    public void b() {
        qo[] qoVarArr = (qo[]) this.f785b;
        qo qoVar = qoVarArr[0];
        qo qoVar2 = qoVarArr[1];
        qoVarArr[0] = qoVar2;
        qoVarArr[1] = qoVar;
        qoVar2.f27701n = true;
        qoVar2.setVisibility(0);
        qoVarArr[0].setScaleX(0.8f);
        qoVarArr[0].setScaleY(0.8f);
        qoVarArr[0].setAlpha(0.0f);
        qoVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = qoVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        qr qrVar = qr.h;
        wh.r(translationY, qrVar, 320L);
        qo qoVar3 = qoVarArr[1];
        qoVar3.f27701n = false;
        qoVar3.setVisibility(0);
        qoVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(qrVar).setDuration(320L).withEndAction(new og(qoVar3, 28)).start();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z10;
        float f7;
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
        switch (this.f784a) {
            case 17:
                nm0 nm0Var = (nm0) this.f785b;
                if (nm0Var.f26731r > 0.0f && nm0Var.e != null) {
                    nm0Var.f26729f.reset();
                    float width = getWidth() / nm0Var.f26728c.getWidth();
                    nm0Var.f26729f.postScale(width, width);
                    nm0Var.d.setLocalMatrix(nm0Var.f26729f);
                    nm0Var.e.setAlpha((int) (nm0Var.f26731r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), nm0Var.e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = nm0Var.E;
                if (drawable != null) {
                    drawable.setAlpha((int) (nm0Var.f26731r * 255.0f));
                    canvas.save();
                    float f15 = nm0Var.H;
                    float f16 = nm0Var.G;
                    float f17 = nm0Var.f26731r;
                    canvas.translate((f16 * f17) + f15, (0.0f * f17) + nm0Var.I);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(nm0Var.J, nm0Var.K), Math.max(nm0Var.J, nm0Var.K), 0.75f), 1.0f, nm0Var.f26731r);
                    canvas.scale(lerp, lerp, ((nm0Var.E.getBounds().width() / 2.0f) * nm0Var.J) + (-nm0Var.H) + nm0Var.E.getBounds().left, ((nm0Var.E.getBounds().height() / 2.0f) * nm0Var.K) + (-nm0Var.I) + nm0Var.E.getBounds().top);
                    ch.d dVar = nm0Var.F;
                    if (dVar != null) {
                        dVar.setAlpha((int) (nm0Var.f26731r * 255.0f));
                        nm0Var.F.draw(canvas);
                    }
                    nm0Var.E.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 21:
                zy0 zy0Var = (zy0) this.f785b;
                xy0 xy0Var = zy0Var.f30909c;
                if (xy0Var != null && xy0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = zy0Var.T;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x10 = zy0Var.f30909c.getEditField().getX() + zy0Var.f30909c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = zy0Var.T;
                        zy0Var.f30906a0 = x10 + emojiSpan2.lastDrawX;
                        zy0Var.U = emojiSpan2.lastDrawY;
                    } else if (zy0Var.V != null && zy0Var.W != null) {
                        zy0Var.f30906a0 = zy0Var.f30909c.getEditField().getX() + zy0Var.f30909c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                if (zy0Var.f30915s && !zy0Var.v && (arrayList = zy0Var.f30916w) != null && !arrayList.isEmpty() && !zy0Var.f30917x) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.e6 e6Var = zy0Var.P;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float d = e6Var.d(f7, false);
                org.telegram.ui.Components.e6 e6Var2 = zy0Var.Q;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float d10 = e6Var2.d(f10, false);
                float d11 = zy0Var.f30908b0.d(zy0Var.f30906a0, false);
                if (d <= 0.0f && d10 <= 0.0f && !z10) {
                    zy0Var.d.setVisibility(8);
                }
                zy0Var.M.rewind();
                float left = zy0Var.e.getLeft();
                int left2 = zy0Var.e.getLeft();
                ArrayList arrayList2 = zy0Var.f30916w;
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                float c10 = wh.c(44.0f, size, left2);
                org.telegram.ui.Components.e6 e6Var3 = zy0Var.f30911d0;
                float f18 = e6Var3.f23794c;
                if (f18 <= 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                float f19 = c10 - left;
                if (f19 > 0.0f) {
                    f18 = e6Var3.d(f19, z11);
                }
                float d12 = zy0Var.f30910c0.d((left + c10) / 2.0f, z11);
                xy0 xy0Var2 = zy0Var.f30909c;
                if (xy0Var2 != null && xy0Var2.getEditField() != null) {
                    int i11 = zy0Var.h;
                    if (i11 == 0) {
                        zy0Var.d.setTranslationY(((-zy0Var.f30909c.getEditField().getHeight()) - zy0Var.f30909c.getEditField().getScrollY()) + zy0Var.U + AndroidUtilities.dp(5.0f));
                    } else if (i11 == 1) {
                        zy0Var.d.setTranslationY(((-zy0Var.getMeasuredHeight()) - zy0Var.f30909c.getEditField().getScrollY()) + zy0Var.U + AndroidUtilities.dp(20.0f) + zy0Var.d.getHeight());
                    }
                }
                float f20 = f18 / 4.0f;
                float f21 = f18 / 2.0f;
                int max = (int) Math.max((zy0Var.f30906a0 - Math.max(f20, Math.min(f21, AndroidUtilities.dp(66.0f)))) - zy0Var.e.getLeft(), 0.0f);
                if (zy0Var.e.getPaddingLeft() != max) {
                    f11 = 1.0f;
                    zy0Var.e.setPadding(max, 0, 0, 0);
                    zy0Var.e.scrollBy(zy0Var.e.getPaddingLeft() - max, 0);
                } else {
                    f11 = 1.0f;
                }
                zy0Var.e.setTranslationX(((int) Math.max((d11 - Math.max(f20, Math.min(f21, AndroidUtilities.dp(66.0f)))) - zy0Var.e.getLeft(), 0.0f)) - max);
                float translationX = zy0Var.e.getTranslationX() + (d12 - f21) + zy0Var.e.getPaddingLeft();
                float translationY = zy0Var.e.getTranslationY() + zy0Var.e.getTop() + zy0Var.e.getPaddingTop();
                if (zy0Var.h == 0) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(6.66f);
                }
                float f22 = translationY + dp;
                float min = Math.min(zy0Var.e.getTranslationX() + d12 + f21 + zy0Var.e.getPaddingLeft(), zy0Var.getWidth() - zy0Var.d.getPaddingRight());
                float translationY2 = zy0Var.e.getTranslationY() + zy0Var.e.getBottom();
                if (zy0Var.h == 0) {
                    i10 = AndroidUtilities.dp(6.66f);
                } else {
                    i10 = 0;
                }
                float f23 = translationY2 - i10;
                float min2 = Math.min(AndroidUtilities.dp(9.0f), f21) * 2.0f;
                int i12 = zy0Var.h;
                if (i12 == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f24 = f23 - min2;
                    float f25 = translationX + min2;
                    rectF.set(translationX, f24, f25, f23);
                    zy0Var.M.arcTo(rectF, 90.0f, 90.0f);
                    float f26 = f22 + min2;
                    rectF.set(translationX, f22, f25, f26);
                    zy0Var.M.arcTo(rectF, -180.0f, 90.0f);
                    float f27 = min - min2;
                    rectF.set(f27, f22, min, f26);
                    zy0Var.M.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f27, f24, min, f23);
                    zy0Var.M.arcTo(rectF, 0.0f, 90.0f);
                    zy0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, f23);
                    zy0Var.M.lineTo(d11, AndroidUtilities.dp(6.66f) + f23);
                    zy0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), f23);
                } else if (i12 == 1) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f28 = min - min2;
                    float f29 = f22 + min2;
                    rectF2.set(f28, f22, min, f29);
                    zy0Var.M.arcTo(rectF2, -90.0f, 90.0f);
                    float f30 = f23 - min2;
                    rectF2.set(f28, f30, min, f23);
                    zy0Var.M.arcTo(rectF2, 0.0f, 90.0f);
                    float f31 = min2 + translationX;
                    rectF2.set(translationX, f30, f31, f23);
                    zy0Var.M.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, f22, f31, f29);
                    zy0Var.M.arcTo(rectF2, -180.0f, 90.0f);
                    zy0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), f22);
                    zy0Var.M.lineTo(d11, f22 - AndroidUtilities.dp(6.66f));
                    zy0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, f22);
                }
                zy0Var.M.close();
                if (zy0Var.O == null) {
                    Paint paint = new Paint(1);
                    zy0Var.O = paint;
                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.0f)));
                    zy0Var.O.setShadowLayer(AndroidUtilities.dp(4.33f), 0.0f, AndroidUtilities.dp(0.33333334f), 855638016);
                    zy0Var.O.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Be, zy0Var.f30907b));
                }
                if (d < f11) {
                    zy0Var.N.rewind();
                    if (zy0Var.h == 0) {
                        dp2 = AndroidUtilities.dp(6.66f) + f23;
                    } else {
                        dp2 = f22 - AndroidUtilities.dp(6.66f);
                    }
                    double d13 = d11 - translationX;
                    double d14 = dp2 - f22;
                    f12 = 255.0f;
                    double d15 = d11 - min;
                    double d16 = dp2 - f23;
                    zy0Var.N.addCircle(d11, dp2, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d14, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d14, 2.0d) + Math.pow(d15, 2.0d)), Math.max(Math.pow(d16, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d16, 2.0d) + Math.pow(d15, 2.0d))))) * d, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(zy0Var.N);
                    canvas.saveLayerAlpha(0.0f, 0.0f, zy0Var.getWidth(), zy0Var.getHeight(), (int) (d * 255.0f), 31);
                } else {
                    f12 = 255.0f;
                }
                canvas.drawPath(zy0Var.M, zy0Var.O);
                canvas.save();
                canvas.clipPath(zy0Var.M);
                super.dispatchDraw(canvas);
                float f32 = zy0Var.f30911d0.f23794c;
                float f33 = zy0Var.f30910c0.f23794c;
                float f34 = f32 / 2.0f;
                float translationX2 = zy0Var.e.getTranslationX() + (f33 - f34) + zy0Var.e.getPaddingLeft();
                float paddingTop = zy0Var.e.getPaddingTop() + zy0Var.e.getTop();
                float min3 = Math.min(zy0Var.e.getTranslationX() + f33 + f34 + zy0Var.e.getPaddingLeft(), zy0Var.getWidth() - zy0Var.d.getPaddingRight());
                float bottom = zy0Var.e.getBottom();
                org.telegram.ui.Components.e6 e6Var4 = zy0Var.R;
                if (zy0Var.e.canScrollHorizontally(-1)) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                float d17 = e6Var4.d(f13, false);
                if (d17 > 0.0f) {
                    int i13 = (int) translationX2;
                    org.telegram.ui.ActionBar.j6.F4.setBounds(i13, (int) paddingTop, AndroidUtilities.dp(32.0f) + i13, (int) bottom);
                    org.telegram.ui.ActionBar.j6.F4.setAlpha((int) (d17 * f12));
                    org.telegram.ui.ActionBar.j6.F4.draw(canvas);
                }
                org.telegram.ui.Components.e6 e6Var5 = zy0Var.S;
                if (zy0Var.e.canScrollHorizontally(1)) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                float d18 = e6Var5.d(f14, false);
                if (d18 > 0.0f) {
                    int i14 = (int) min3;
                    org.telegram.ui.ActionBar.j6.E4.setBounds(i14 - AndroidUtilities.dp(32.0f), (int) paddingTop, i14, (int) bottom);
                    org.telegram.ui.ActionBar.j6.E4.setAlpha((int) (d18 * f12));
                    org.telegram.ui.ActionBar.j6.E4.draw(canvas);
                }
                canvas.restore();
                if (zy0Var.P.f23794c < f11) {
                    canvas.restore();
                    canvas.restore();
                    return;
                }
                return;
            case 26:
                qg.s2 s2Var = (qg.s2) this.f785b;
                if (s2Var.f41913y > 0.0f && s2Var.f41910s != null) {
                    s2Var.v.reset();
                    float width2 = getWidth() / s2Var.f41908n.getWidth();
                    s2Var.v.postScale(width2, width2);
                    s2Var.f41909r.setLocalMatrix(s2Var.v);
                    s2Var.f41910s.setAlpha((int) (s2Var.f41913y * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), s2Var.f41910s);
                }
                super.dispatchDraw(canvas);
                return;
            default:
                super.dispatchDraw(canvas);
                return;
        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.f784a) {
            case 18:
                ef efVar = (ef) this.f785b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && efVar.isShowing()) {
                    efVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f784a) {
            case 17:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((nm0) this.f785b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            case 26:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((qg.s2) this.f785b).onBackPressed();
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
        switch (this.f784a) {
            case 1:
                int action = motionEvent.getAction();
                m2 m2Var = m2.Z;
                if (m2Var.G != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(m2Var.G.getX(), m2Var.G.getY());
                    boolean dispatchTouchEvent = m2Var.G.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (action == 1 || action == 3) {
                        m2Var.G = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = m2Var.f1240x.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!m2Var.f1240x.isInProgress() && ((GestureDetector) m2Var.f1241y.f15073b).onTouchEvent(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (action == 1 || action == 3) {
                    m2Var.E = false;
                    m2Var.F = false;
                    o1.k kVar = m2Var.P;
                    if (!kVar.f15483f) {
                        float f7 = m2Var.N;
                        kVar.f15481b = f7;
                        kVar.f15482c = true;
                        o1.l lVar = kVar.f15490u;
                        int i10 = m2Var.J;
                        float f10 = (i10 / 2.0f) + f7;
                        int i11 = AndroidUtilities.displaySize.x;
                        if (f10 >= i11 / 2.0f) {
                            dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        lVar.f15496i = dp;
                        m2Var.P.f();
                    }
                    o1.k kVar2 = m2Var.Q;
                    if (!kVar2.f15483f) {
                        float f11 = m2Var.O;
                        kVar2.f15481b = f11;
                        kVar2.f15482c = true;
                        kVar2.f15490u.f15496i = w7.q.a(f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - m2Var.K) - AndroidUtilities.dp(16.0f));
                        m2Var.Q.f();
                    }
                }
                if (onTouchEvent || z10) {
                    return true;
                }
                return false;
            case 3:
                if (((di.i) this.f785b).f7762e0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 9:
                if (motionEvent.getY() > getMeasuredHeight() - ((gl) this.f785b).B0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f784a) {
            case 9:
                canvas.save();
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                gl glVar = (gl) this.f785b;
                boolean z10 = false;
                canvas.clipRect(0, 0, measuredWidth, measuredHeight - glVar.B0);
                if (!glVar.G) {
                    z10 = super.drawChild(canvas, view, j3);
                }
                canvas.restore();
                return z10;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.f784a) {
            case 1:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                m2 m2Var = m2.Z;
                AndroidUtilities.setPreferredMaxRefreshRate(m2Var.f1233b, m2Var.d, m2Var.f1234c);
                m2Var.i();
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f784a) {
            case 12:
                vu vuVar = (vu) this.f785b;
                q91 q91Var = vuVar.f29760c;
                pu puVar = vuVar.f29759b;
                super.onDetachedFromWindow();
                try {
                    pg0 pg0Var = pg0.f27209p0;
                    if (pg0Var.P) {
                        if (puVar.getVisibility() != 0) {
                        }
                        if (q91Var.f() && !pg0Var.P) {
                            if (vu.S == vuVar) {
                                vu.S = null;
                            }
                            q91Var.b();
                            return;
                        }
                        return;
                    }
                    if (puVar.getParent() != null) {
                        removeView(puVar);
                        puVar.stopLoading();
                        puVar.loadUrl("about:blank");
                        puVar.destroy();
                    }
                    if (q91Var.f()) {
                        return;
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        z61 z61Var;
        f0 f0Var;
        MediaController.CropState cropState;
        switch (this.f784a) {
            case 7:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.h) this.f785b) == null) {
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                    this.f785b = hVar;
                    hVar.f29265k = false;
                    hVar.f29267m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.f785b).f29261f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f785b).a(AndroidUtilities.dp(4.0f), canvas, rectF, null);
                invalidate();
                return;
            case 8:
                ((org.telegram.ui.Components.da) this.f785b).e.a(canvas);
                return;
            case 9:
                gl glVar = (gl) this.f785b;
                glVar.f24428d0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19133h5, glVar.f26687a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - glVar.B0, glVar.f24428d0);
                return;
            case 19:
                ov0 ov0Var = (ov0) this.f785b;
                Drawable drawable = ov0Var.d;
                drawable.setBounds(0, ov0Var.f27060f - ov0.n(ov0Var), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 22:
                Drawable drawable2 = ((z61) this.f785b).f30745b;
                drawable2.setBounds(0, (int) ((z61Var.h - z61.n(z61Var)) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                drawable2.draw(canvas);
                return;
            case 24:
                qg.x1 x1Var = (qg.x1) this.f785b;
                Rect rect = x1Var.E0;
                Rect rect2 = x1Var.D0;
                Paint paint = x1Var.F0;
                vv0 vv0Var = x1Var.f41976v0;
                Bitmap bitmap = x1Var.A0;
                if (x1Var.f41980z0 != null) {
                    canvas.save();
                    float e = x1Var.f41975u0.e(x1Var.f41974t0);
                    canvas.scale(1.0f - (e * 2.0f), 1.0f, vv0Var.f29776a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.q.A(1.0f, e, 4.0f * e, 0.25f));
                    float e7 = x1Var.f41979y0.e(x1Var.f41978x0);
                    if (!x1Var.f41978x0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e7) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(f0Var.getWidth() / 2.0f, f0Var.getHeight() / 2.0f);
                            canvas.rotate(x1Var.f41977w0);
                            float max = Math.max(vv0Var.f29776a / bitmap.getWidth(), vv0Var.f29777b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (x1Var.G0 != null) {
                                canvas.rotate(-x1Var.getOrientation());
                                int contentWidth = x1Var.getContentWidth();
                                int contentHeight = x1Var.getContentHeight();
                                if (((x1Var.getOrientation() + x1Var.G0.transformRotation) / 90) % 2 == 1) {
                                    contentWidth = x1Var.getContentHeight();
                                    contentHeight = x1Var.getContentWidth();
                                }
                                MediaController.CropState cropState2 = x1Var.G0;
                                float f7 = cropState2.cropPw;
                                float f10 = cropState2.cropPh;
                                float f11 = contentWidth;
                                float f12 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f7) / 2.0f, ((-contentHeight) * f10) / 2.0f, (f7 * f11) / 2.0f, (f10 * f12) / 2.0f);
                                float f13 = x1Var.G0.cropScale;
                                canvas.scale(f13, f13);
                                MediaController.CropState cropState3 = x1Var.G0;
                                canvas.translate(cropState3.cropPx * f11, cropState3.cropPy * f12);
                                canvas.rotate(x1Var.G0.cropRotate + cropState.transformRotation);
                                if (x1Var.G0.mirrored) {
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
            case 25:
                qg.n2 n2Var = (qg.n2) this.f785b;
                ImageReceiver imageReceiver = n2Var.f41819x0;
                vv0 vv0Var2 = n2Var.f41817v0;
                if (n2Var.f41818w0 != null) {
                    canvas.save();
                    float e10 = n2Var.f41816u0.e(n2Var.f41815t0);
                    canvas.scale(1.0f - (e10 * 2.0f), 1.0f, vv0Var2.f29776a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.q.A(1.0f, e10, 4.0f * e10, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) vv0Var2.f29776a, (int) vv0Var2.f29777b);
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
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        rg.o0 o0Var;
        rg.o0 o0Var2;
        switch (this.f784a) {
            case 27:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                rg.p0 p0Var = (rg.p0) this.f785b;
                if (p0Var.h && (o0Var2 = p0Var.e) != null) {
                    charSequence = o0Var2.getText();
                } else {
                    charSequence = null;
                }
                if (charSequence == null && (o0Var = p0Var.d) != null) {
                    charSequence = o0Var.getText();
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
        switch (this.f784a) {
            case 9:
                if (motionEvent.getY() > getMeasuredHeight() - ((gl) this.f785b).B0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 19:
                ov0 ov0Var = (ov0) this.f785b;
                if (motionEvent.getAction() == 0 && ov0Var.f27060f != 0 && motionEvent.getY() < ov0Var.f27060f) {
                    ov0Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 22:
                z61 z61Var = (z61) this.f785b;
                if (motionEvent.getAction() == 0 && z61Var.h != 0 && motionEvent.getY() < z61Var.h) {
                    z61Var.dismiss();
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
        float f7;
        boolean z11;
        int i16;
        float x10;
        switch (this.f784a) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                f30 f30Var = (f30) this.f785b;
                f30Var.setTranslationY((getMeasuredHeight() * 0.28f) - (f30Var.getMeasuredWidth() / 2.0f));
                f30Var.setTranslationX((getMeasuredWidth() * 0.82f) - (f30Var.getMeasuredWidth() / 2.0f));
                return;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(36.0f);
                int i17 = ((i12 - i10) - dp2) / 2;
                int i18 = ((i13 - i11) - dp2) / 2;
                ((org.telegram.ui.Components.da) this.f785b).e.f(i17, i18, i17 + dp2, dp2 + i18);
                return;
            case 10:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f785b;
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
                int measuredHeight3 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.f22120q0.getMeasuredHeight()) - AndroidUtilities.dp(12.0f);
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.f22120q0;
                    textView.layout(measuredWidth - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.f22120q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f22120q0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.f22120q0;
                    textView2.layout(measuredWidth - (textView2.getMeasuredWidth() / 2), measuredHeight3, (chatAttachAlertPhotoLayout.f22120q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f22120q0.getMeasuredHeight() + measuredHeight3);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.f22109k0;
                shutterButton.layout(measuredWidth - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.f22109k0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f22109k0.getMeasuredWidth() / 2) + measuredWidth, (chatAttachAlertPhotoLayout.f22109k0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.f22122r0;
                imageView.layout(i14 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.f22122r0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f22122r0.getMeasuredWidth() / 2) + i14, (chatAttachAlertPhotoLayout.f22122r0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i21 = 0; i21 < 2; i21++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.S[i21];
                    imageView2.layout(dp - (imageView2.getMeasuredWidth() / 2), i15 - (chatAttachAlertPhotoLayout.S[i21].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.S[i21].getMeasuredWidth() / 2) + dp, (chatAttachAlertPhotoLayout.S[i21].getMeasuredHeight() / 2) + i15);
                }
                return;
            case 15:
                super.onLayout(z10, i10, i11, i12, i13);
                z20 z20Var = (z20) this.f785b;
                f0 f0Var = z20Var.f30714b;
                int[] iArr = z20Var.G;
                f0Var.getLocationOnScreen(iArr);
                z20Var.N = iArr[0];
                z20Var.M = iArr[1] - AndroidUtilities.dp(25.0f);
                return;
            case 17:
                super.onLayout(z10, i10, i11, i12, i13);
                nm0 nm0Var = (nm0) this.f785b;
                f0 f0Var2 = nm0Var.f26732s;
                bw0 bw0Var = nm0Var.v;
                Drawable drawable = nm0Var.E;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    FrameLayout frameLayout = nm0Var.f26734x;
                    if (frameLayout != null) {
                        float f10 = nm0Var.H;
                        float f11 = bounds.left + f10;
                        float f12 = bounds.right + f10;
                        float f13 = nm0Var.I;
                        float f14 = bounds.top + f13;
                        float f15 = bounds.bottom + f13;
                        boolean z12 = false;
                        if (!nm0Var.L) {
                            if (f12 - frameLayout.getMeasuredWidth() < AndroidUtilities.dp(8.0f)) {
                                nm0Var.f26735y.setPivotX(AndroidUtilities.dp(6.0f));
                                nm0Var.f26734x.setX(Math.min(bw0Var.getWidth() - nm0Var.f26734x.getWidth(), f11 - AndroidUtilities.dp(10.0f)) - bw0Var.getX());
                                f7 = 4.0f;
                                z11 = false;
                            } else {
                                ViewGroup viewGroup = nm0Var.f26735y;
                                viewGroup.setPivotX(viewGroup.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f7 = 4.0f;
                                nm0Var.f26734x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f12) - nm0Var.f26734x.getMeasuredWidth()) - bw0Var.getX());
                                z11 = true;
                            }
                            if (z11) {
                                x10 = ((nm0Var.f26734x.getX() + nm0Var.f26734x.getWidth()) - AndroidUtilities.dp(6.0f)) - f12;
                            } else {
                                x10 = (nm0Var.f26734x.getX() + AndroidUtilities.dp(10.0f)) - f11;
                            }
                            nm0Var.G = x10;
                        } else {
                            f7 = 4.0f;
                            z11 = false;
                        }
                        if (nm0Var.F != null) {
                            i16 = AndroidUtilities.dp(21.0f);
                        } else {
                            i16 = 0;
                        }
                        float f16 = f15 + i16;
                        if (nm0Var.f26734x.getMeasuredHeight() + f16 > f0Var2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            ViewGroup viewGroup2 = nm0Var.f26735y;
                            viewGroup2.setPivotY(viewGroup2.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            nm0Var.f26734x.setY(((f14 - AndroidUtilities.dp(f7)) - nm0Var.f26734x.getMeasuredHeight()) - bw0Var.getY());
                            z12 = true;
                        } else {
                            nm0Var.f26735y.setPivotY(AndroidUtilities.dp(6.0f));
                            nm0Var.f26734x.setY(Math.min((f0Var2.getHeight() - nm0Var.f26734x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), f16) - bw0Var.getY());
                        }
                        w70 w70Var = nm0Var.f26733w;
                        w70Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w70Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.f18614c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                        return;
                    }
                    return;
                }
                return;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                ov0.m((ov0) this.f785b);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        View view;
        int dp;
        int i13;
        int dp2;
        int dp3;
        boolean z10;
        float f7;
        float top;
        int measuredHeight;
        ei.f fVar;
        switch (this.f784a) {
            case 7:
                if (View.MeasureSpec.getSize(i10) > AndroidUtilities.dp(260.0f)) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(320.0f), 1073741824), i11);
                    return;
                } else {
                    super.onMeasure(i10, i11);
                    return;
                }
            case 9:
                super.onMeasure(i10, i11);
                dl dlVar = ((gl) this.f785b).F;
                if (dlVar != null) {
                    dlVar.a();
                    return;
                }
                return;
            case 12:
                int size = View.MeasureSpec.getSize(i10);
                vu vuVar = (vu) this.f785b;
                int min = (int) Math.min(vuVar.H / (vuVar.G / size), AndroidUtilities.displaySize.y / 2);
                if (vuVar.J) {
                    i12 = 22;
                } else {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 84) + min + 1, 1073741824));
                return;
            case 13:
                ky kyVar = (ky) this.f785b;
                if (((View) kyVar.F.getParent()) != null) {
                    dp = (int) (view.getMeasuredHeight() - kyVar.F.getY());
                } else {
                    dp = AndroidUtilities.dp(120.0f);
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp - kyVar.F.f25888b1, 1073741824));
                return;
            case 14:
                kz kzVar = ((fz) this.f785b).Q;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (wh.A(8.0f, kzVar.D0.getMeasuredHeight() - kzVar.f25888b1, 3) * 1.7f), 1073741824));
                return;
            case 19:
                ov0 ov0Var = (ov0) this.f785b;
                w0 w0Var = ov0Var.f27058b;
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
                getMeasuredWidth();
                int c10 = wh.c(54.0f, LocationController.getLocationsCount(), org.telegram.messenger.q.D(56.0f, AndroidUtilities.dp(56.0f), 1));
                int i14 = size2 / 5;
                if (c10 < i14 * 3) {
                    i13 = AndroidUtilities.dp(8.0f);
                } else {
                    i13 = i14 * 2;
                    if (c10 < size2) {
                        i13 -= size2 - c10;
                    }
                }
                if (w0Var.getPaddingTop() != i13) {
                    ov0Var.h = true;
                    w0Var.setPadding(0, i13, 0, AndroidUtilities.dp(8.0f));
                    ov0Var.h = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(c10, size2), 1073741824));
                return;
            case 21:
                zy0 zy0Var = (zy0) this.f785b;
                int i15 = zy0Var.f30913n;
                if (zy0Var.h == 0) {
                    dp2 = AndroidUtilities.dp(8.0f);
                } else {
                    dp2 = AndroidUtilities.dp(6.66f);
                }
                int i16 = zy0Var.f30913n;
                if (zy0Var.h == 0) {
                    dp3 = AndroidUtilities.dp(6.66f);
                } else {
                    dp3 = AndroidUtilities.dp(8.0f);
                }
                setPadding(i15, dp2, i16, dp3);
                super.onMeasure(i10, i11);
                return;
            case 28:
                rg.x0 x0Var = (rg.x0) this.f785b;
                z10 = ((org.telegram.ui.ActionBar.f3) x0Var).isPortrait;
                if (z10) {
                    x0Var.f42796s = View.MeasureSpec.getSize(i10);
                } else {
                    x0Var.f42796s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
                }
                super.onMeasure(i10, i11);
                return;
            case 29:
                super.onMeasure(i10, i11);
                rg.k1 k1Var = ((rg.j1) this.f785b).f42589c;
                fg0 fg0Var = k1Var.f42614r0;
                if (fg0Var != null) {
                    top = fg0Var.getTop();
                    measuredHeight = k1Var.f42614r0.getMeasuredHeight();
                } else {
                    View view2 = k1Var.B0;
                    if (view2 != null) {
                        top = view2.getTop();
                        measuredHeight = k1Var.B0.getMeasuredHeight();
                    } else {
                        f7 = 0.0f;
                        k1Var.f42613q0.setTranslationY(f7 - (fVar.getMeasuredHeight() / 2.0f));
                        return;
                    }
                }
                f7 = (measuredHeight / 2.0f) + top;
                k1Var.f42613q0.setTranslationY(f7 - (fVar.getMeasuredHeight() / 2.0f));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f784a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.f785b;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i10, i11);
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                return;
            case 17:
                super.onSizeChanged(i10, i11, i12, i13);
                nm0 nm0Var = (nm0) this.f785b;
                gh.d.c(nm0Var.h, nm0Var.f26732s);
                ViewGroup viewGroup = nm0Var.f26735y;
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
        switch (this.f784a) {
            case 19:
                if (!((ov0) this.f785b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 20:
            case 21:
            default:
                return super.onTouchEvent(motionEvent);
            case 22:
                if (!((z61) this.f785b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 23:
                ((li1) this.f785b).T.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f784a) {
            case 16:
                wl0 wl0Var = (wl0) this.f785b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(wl0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(wl0Var.getMeasuredHeight(), 1073741824));
                    layout(0, 0, wl0Var.f30066d1.getMeasuredWidth(), wl0Var.f30066d1.getMeasuredHeight());
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 17:
            case 18:
            default:
                super.requestLayout();
                return;
            case 19:
                if (!((ov0) this.f785b).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 20:
                if (!((hy0) this.f785b).f24761g0) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f784a) {
            case 2:
                ci.oc ocVar = (ci.oc) this.f785b;
                if (getTranslationY() != f7 && ocVar.f5213c1 != null) {
                    super.setTranslationY(f7);
                    ocVar.f5213c1.y();
                    return;
                }
                return;
            case 22:
                super.setTranslationY(f7);
                z61.m((z61) this.f785b);
                return;
            default:
                super.setTranslationY(f7);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        boolean z10;
        boolean z11;
        switch (this.f784a) {
            case 15:
                super.setVisibility(i10);
                ((z20) this.f785b).d.setVisibility(i10);
                return;
            case 21:
                zy0 zy0Var = (zy0) this.f785b;
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
                    if (zy0Var.e != null) {
                        for (int i11 = 0; i11 < zy0Var.e.getChildCount(); i11++) {
                            if (z11) {
                                yy0 yy0Var = (yy0) zy0Var.e.getChildAt(i11);
                                Drawable drawable = yy0Var.f30686b;
                                if (drawable instanceof org.telegram.ui.Components.q5) {
                                    ((org.telegram.ui.Components.q5) drawable).a(yy0Var);
                                }
                                yy0Var.f30687c = true;
                            } else {
                                yy0 yy0Var2 = (yy0) zy0Var.e.getChildAt(i11);
                                Drawable drawable2 = yy0Var2.f30686b;
                                if (drawable2 instanceof org.telegram.ui.Components.q5) {
                                    ((org.telegram.ui.Components.q5) drawable2).o(yy0Var2);
                                }
                                yy0Var2.f30687c = false;
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

    public f0(Object obj, Context context, int i10) {
        super(context);
        this.f784a = i10;
        this.f785b = obj;
    }

    public f0(qg.n2 n2Var, Context context) {
        super(context);
        this.f784a = 25;
        this.f785b = n2Var;
        setWillNotDraw(false);
    }

    public f0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f784a = 11;
        this.f785b = new qo[2];
        int i10 = 0;
        while (true) {
            qo[] qoVarArr = (qo[]) this.f785b;
            if (i10 < qoVarArr.length) {
                qoVarArr[i10] = new qo(context, e6Var);
                addView(((qo[]) this.f785b)[i10], w7.y5.e(-1, -1, 119));
                i10++;
            } else {
                qoVarArr[0].setVisibility(0);
                ((qo[]) this.f785b)[1].setVisibility(8);
                return;
            }
        }
    }

    public f0(qg.x1 x1Var, Context context) {
        super(context);
        this.f784a = 24;
        this.f785b = x1Var;
        setWillNotDraw(false);
    }

    public f0(Context context, String str, d dVar) {
        super(context);
        this.f784a = 0;
        int dp = AndroidUtilities.dp(12.0f);
        int i10 = org.telegram.ui.ActionBar.j6.f19169j5;
        setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.l1(0.06f, dVar.G0(i10))));
        LinearLayout e = wh.e(context, 1);
        addView(e, w7.y5.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, false, true, true);
        this.f785b = p6Var;
        p6Var.b(0.6f, 450L, qr.h);
        p6Var.setTextSize(AndroidUtilities.dp(17.0f));
        p6Var.setTextColor(dVar.G0(i10));
        p6Var.setScaleProperty(0.7f);
        p6Var.setGravity(17);
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setAllowCancel(true);
        e.addView(p6Var, w7.y5.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(dVar.G0(i10));
        textView.setGravity(17);
        e.addView(textView, w7.y5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    public f0(Context context, f30 f30Var) {
        super(context);
        this.f784a = 6;
        this.f785b = f30Var;
    }
}
