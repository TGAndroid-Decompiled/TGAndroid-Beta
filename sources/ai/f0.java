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
import org.telegram.messenger.bi;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.d30;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.hz0;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.ny;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.to;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.tu;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.z91;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.Components.zu;
import org.telegram.ui.fi1;
public final class f0 extends FrameLayout {
    public final int f934a;
    public Object f935b;

    public f0(Context context, int i10) {
        super(context);
        this.f934a = i10;
    }

    public to a() {
        return ((to[]) this.f935b)[0];
    }

    @Override
    public void addView(View view, int i10, int i11) {
        switch (this.f934a) {
            case 5:
                super.addView(view, i10, i11);
                ((hh.g) this.f935b).e();
                return;
            default:
                super.addView(view, i10, i11);
                return;
        }
    }

    public void b() {
        to[] toVarArr = (to[]) this.f935b;
        to toVar = toVarArr[0];
        to toVar2 = toVarArr[1];
        toVarArr[0] = toVar2;
        toVarArr[1] = toVar;
        toVar2.f31113n = true;
        toVar2.setVisibility(0);
        toVarArr[0].setScaleX(0.8f);
        toVarArr[0].setScaleY(0.8f);
        toVarArr[0].setAlpha(0.0f);
        toVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = toVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        tr trVar = tr.h;
        bi.r(translationY, trVar, 320L);
        to toVar3 = toVarArr[1];
        toVar3.f31113n = false;
        toVar3.setVisibility(0);
        toVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(trVar).setDuration(320L).withEndAction(new qg(toVar3, 28)).start();
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
        switch (this.f934a) {
            case 17:
                sm0 sm0Var = (sm0) this.f935b;
                if (sm0Var.f30829r > 0.0f && sm0Var.f30826e != null) {
                    sm0Var.f30827f.reset();
                    float width = getWidth() / sm0Var.f30825c.getWidth();
                    sm0Var.f30827f.postScale(width, width);
                    sm0Var.d.setLocalMatrix(sm0Var.f30827f);
                    sm0Var.f30826e.setAlpha((int) (sm0Var.f30829r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), sm0Var.f30826e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = sm0Var.E;
                if (drawable != null) {
                    drawable.setAlpha((int) (sm0Var.f30829r * 255.0f));
                    canvas.save();
                    float f15 = sm0Var.H;
                    float f16 = sm0Var.G;
                    float f17 = sm0Var.f30829r;
                    canvas.translate((f16 * f17) + f15, (0.0f * f17) + sm0Var.I);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(sm0Var.J, sm0Var.K), Math.max(sm0Var.J, sm0Var.K), 0.75f), 1.0f, sm0Var.f30829r);
                    canvas.scale(lerp, lerp, ((sm0Var.E.getBounds().width() / 2.0f) * sm0Var.J) + (-sm0Var.H) + sm0Var.E.getBounds().left, ((sm0Var.E.getBounds().height() / 2.0f) * sm0Var.K) + (-sm0Var.I) + sm0Var.E.getBounds().top);
                    ch.d dVar = sm0Var.F;
                    if (dVar != null) {
                        dVar.setAlpha((int) (sm0Var.f30829r * 255.0f));
                        sm0Var.F.draw(canvas);
                    }
                    sm0Var.E.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 22:
                iz0 iz0Var = (iz0) this.f935b;
                gz0 gz0Var = iz0Var.f27534c;
                if (gz0Var != null && gz0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = iz0Var.T;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x10 = iz0Var.f27534c.getEditField().getX() + iz0Var.f27534c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = iz0Var.T;
                        iz0Var.f27531a0 = x10 + emojiSpan2.lastDrawX;
                        iz0Var.U = emojiSpan2.lastDrawY;
                    } else if (iz0Var.V != null && iz0Var.W != null) {
                        iz0Var.f27531a0 = iz0Var.f27534c.getEditField().getX() + iz0Var.f27534c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                if (iz0Var.f27541s && !iz0Var.v && (arrayList = iz0Var.f27542w) != null && !arrayList.isEmpty() && !iz0Var.f27543x) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.e6 e6Var = iz0Var.P;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float d = e6Var.d(f7, false);
                org.telegram.ui.Components.e6 e6Var2 = iz0Var.Q;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float d10 = e6Var2.d(f10, false);
                float d11 = iz0Var.f27533b0.d(iz0Var.f27531a0, false);
                if (d <= 0.0f && d10 <= 0.0f && !z10) {
                    iz0Var.d.setVisibility(8);
                }
                iz0Var.M.rewind();
                float left = iz0Var.f27537e.getLeft();
                int left2 = iz0Var.f27537e.getLeft();
                ArrayList arrayList2 = iz0Var.f27542w;
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                float D = org.telegram.messenger.q.D(44.0f, size, left2);
                org.telegram.ui.Components.e6 e6Var3 = iz0Var.f27536d0;
                float f18 = e6Var3.f25939c;
                if (f18 <= 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                float f19 = D - left;
                if (f19 > 0.0f) {
                    f18 = e6Var3.d(f19, z11);
                }
                float d12 = iz0Var.f27535c0.d((left + D) / 2.0f, z11);
                gz0 gz0Var2 = iz0Var.f27534c;
                if (gz0Var2 != null && gz0Var2.getEditField() != null) {
                    int i11 = iz0Var.h;
                    if (i11 == 0) {
                        iz0Var.d.setTranslationY(((-iz0Var.f27534c.getEditField().getHeight()) - iz0Var.f27534c.getEditField().getScrollY()) + iz0Var.U + AndroidUtilities.dp(5.0f));
                    } else if (i11 == 1) {
                        iz0Var.d.setTranslationY(((-iz0Var.getMeasuredHeight()) - iz0Var.f27534c.getEditField().getScrollY()) + iz0Var.U + AndroidUtilities.dp(20.0f) + iz0Var.d.getHeight());
                    }
                }
                float f20 = f18 / 4.0f;
                float f21 = f18 / 2.0f;
                int max = (int) Math.max((iz0Var.f27531a0 - Math.max(f20, Math.min(f21, AndroidUtilities.dp(66.0f)))) - iz0Var.f27537e.getLeft(), 0.0f);
                if (iz0Var.f27537e.getPaddingLeft() != max) {
                    f11 = 1.0f;
                    iz0Var.f27537e.setPadding(max, 0, 0, 0);
                    iz0Var.f27537e.scrollBy(iz0Var.f27537e.getPaddingLeft() - max, 0);
                } else {
                    f11 = 1.0f;
                }
                iz0Var.f27537e.setTranslationX(((int) Math.max((d11 - Math.max(f20, Math.min(f21, AndroidUtilities.dp(66.0f)))) - iz0Var.f27537e.getLeft(), 0.0f)) - max);
                float translationX = iz0Var.f27537e.getTranslationX() + (d12 - f21) + iz0Var.f27537e.getPaddingLeft();
                float translationY = iz0Var.f27537e.getTranslationY() + iz0Var.f27537e.getTop() + iz0Var.f27537e.getPaddingTop();
                if (iz0Var.h == 0) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(6.66f);
                }
                float f22 = translationY + dp;
                float min = Math.min(iz0Var.f27537e.getTranslationX() + d12 + f21 + iz0Var.f27537e.getPaddingLeft(), iz0Var.getWidth() - iz0Var.d.getPaddingRight());
                float translationY2 = iz0Var.f27537e.getTranslationY() + iz0Var.f27537e.getBottom();
                if (iz0Var.h == 0) {
                    i10 = AndroidUtilities.dp(6.66f);
                } else {
                    i10 = 0;
                }
                float f23 = translationY2 - i10;
                float min2 = Math.min(AndroidUtilities.dp(9.0f), f21) * 2.0f;
                int i12 = iz0Var.h;
                if (i12 == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f24 = f23 - min2;
                    float f25 = translationX + min2;
                    rectF.set(translationX, f24, f25, f23);
                    iz0Var.M.arcTo(rectF, 90.0f, 90.0f);
                    float f26 = f22 + min2;
                    rectF.set(translationX, f22, f25, f26);
                    iz0Var.M.arcTo(rectF, -180.0f, 90.0f);
                    float f27 = min - min2;
                    rectF.set(f27, f22, min, f26);
                    iz0Var.M.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f27, f24, min, f23);
                    iz0Var.M.arcTo(rectF, 0.0f, 90.0f);
                    iz0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, f23);
                    iz0Var.M.lineTo(d11, AndroidUtilities.dp(6.66f) + f23);
                    iz0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), f23);
                } else if (i12 == 1) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f28 = min - min2;
                    float f29 = f22 + min2;
                    rectF2.set(f28, f22, min, f29);
                    iz0Var.M.arcTo(rectF2, -90.0f, 90.0f);
                    float f30 = f23 - min2;
                    rectF2.set(f28, f30, min, f23);
                    iz0Var.M.arcTo(rectF2, 0.0f, 90.0f);
                    float f31 = min2 + translationX;
                    rectF2.set(translationX, f30, f31, f23);
                    iz0Var.M.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, f22, f31, f29);
                    iz0Var.M.arcTo(rectF2, -180.0f, 90.0f);
                    iz0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), f22);
                    iz0Var.M.lineTo(d11, f22 - AndroidUtilities.dp(6.66f));
                    iz0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, f22);
                }
                iz0Var.M.close();
                if (iz0Var.O == null) {
                    Paint paint = new Paint(1);
                    iz0Var.O = paint;
                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.0f)));
                    iz0Var.O.setShadowLayer(AndroidUtilities.dp(4.33f), 0.0f, AndroidUtilities.dp(0.33333334f), 855638016);
                    iz0Var.O.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Be, iz0Var.f27532b));
                }
                if (d < f11) {
                    iz0Var.N.rewind();
                    if (iz0Var.h == 0) {
                        dp2 = AndroidUtilities.dp(6.66f) + f23;
                    } else {
                        dp2 = f22 - AndroidUtilities.dp(6.66f);
                    }
                    double d13 = d11 - translationX;
                    double d14 = dp2 - f22;
                    f12 = 255.0f;
                    double d15 = d11 - min;
                    double d16 = dp2 - f23;
                    iz0Var.N.addCircle(d11, dp2, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d14, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d14, 2.0d) + Math.pow(d15, 2.0d)), Math.max(Math.pow(d16, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d16, 2.0d) + Math.pow(d15, 2.0d))))) * d, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(iz0Var.N);
                    canvas.saveLayerAlpha(0.0f, 0.0f, iz0Var.getWidth(), iz0Var.getHeight(), (int) (d * 255.0f), 31);
                } else {
                    f12 = 255.0f;
                }
                canvas.drawPath(iz0Var.M, iz0Var.O);
                canvas.save();
                canvas.clipPath(iz0Var.M);
                super.dispatchDraw(canvas);
                float f32 = iz0Var.f27536d0.f25939c;
                float f33 = iz0Var.f27535c0.f25939c;
                float f34 = f32 / 2.0f;
                float translationX2 = iz0Var.f27537e.getTranslationX() + (f33 - f34) + iz0Var.f27537e.getPaddingLeft();
                float paddingTop = iz0Var.f27537e.getPaddingTop() + iz0Var.f27537e.getTop();
                float min3 = Math.min(iz0Var.f27537e.getTranslationX() + f33 + f34 + iz0Var.f27537e.getPaddingLeft(), iz0Var.getWidth() - iz0Var.d.getPaddingRight());
                float bottom = iz0Var.f27537e.getBottom();
                org.telegram.ui.Components.e6 e6Var4 = iz0Var.R;
                if (iz0Var.f27537e.canScrollHorizontally(-1)) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                float d17 = e6Var4.d(f13, false);
                if (d17 > 0.0f) {
                    int i13 = (int) translationX2;
                    org.telegram.ui.ActionBar.i6.F4.setBounds(i13, (int) paddingTop, AndroidUtilities.dp(32.0f) + i13, (int) bottom);
                    org.telegram.ui.ActionBar.i6.F4.setAlpha((int) (d17 * f12));
                    org.telegram.ui.ActionBar.i6.F4.draw(canvas);
                }
                org.telegram.ui.Components.e6 e6Var5 = iz0Var.S;
                if (iz0Var.f27537e.canScrollHorizontally(1)) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                float d18 = e6Var5.d(f14, false);
                if (d18 > 0.0f) {
                    int i14 = (int) min3;
                    org.telegram.ui.ActionBar.i6.E4.setBounds(i14 - AndroidUtilities.dp(32.0f), (int) paddingTop, i14, (int) bottom);
                    org.telegram.ui.ActionBar.i6.E4.setAlpha((int) (d18 * f12));
                    org.telegram.ui.ActionBar.i6.E4.draw(canvas);
                }
                canvas.restore();
                if (iz0Var.P.f25939c < f11) {
                    canvas.restore();
                    canvas.restore();
                    return;
                }
                return;
            case 27:
                qg.t2 t2Var = (qg.t2) this.f935b;
                if (t2Var.f45361y > 0.0f && t2Var.f45358s != null) {
                    t2Var.v.reset();
                    float width2 = getWidth() / t2Var.f45356n.getWidth();
                    t2Var.v.postScale(width2, width2);
                    t2Var.f45357r.setLocalMatrix(t2Var.v);
                    t2Var.f45358s.setAlpha((int) (t2Var.f45361y * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), t2Var.f45358s);
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
        switch (this.f934a) {
            case 18:
                gf gfVar = (gf) this.f935b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && gfVar.isShowing()) {
                    gfVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f934a) {
            case 17:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((sm0) this.f935b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            case 27:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((qg.t2) this.f935b).onBackPressed();
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
        switch (this.f934a) {
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
                boolean onTouchEvent = m2Var.f1340x.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!m2Var.f1340x.isInProgress() && ((GestureDetector) m2Var.f1341y.f14389b).onTouchEvent(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (action == 1 || action == 3) {
                    m2Var.E = false;
                    m2Var.F = false;
                    o1.k kVar = m2Var.P;
                    if (!kVar.f16981f) {
                        float f7 = m2Var.N;
                        kVar.f16978b = f7;
                        kVar.f16979c = true;
                        o1.l lVar = kVar.f16988u;
                        int i10 = m2Var.J;
                        float f10 = (i10 / 2.0f) + f7;
                        int i11 = AndroidUtilities.displaySize.x;
                        if (f10 >= i11 / 2.0f) {
                            dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        lVar.f16995i = dp;
                        m2Var.P.f();
                    }
                    o1.k kVar2 = m2Var.Q;
                    if (!kVar2.f16981f) {
                        float f11 = m2Var.O;
                        kVar2.f16978b = f11;
                        kVar2.f16979c = true;
                        kVar2.f16988u.f16995i = w7.q.a(f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - m2Var.K) - AndroidUtilities.dp(16.0f));
                        m2Var.Q.f();
                    }
                }
                if (onTouchEvent || z10) {
                    return true;
                }
                return false;
            case 3:
                if (((di.k) this.f935b).f8394q0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 9:
                if (motionEvent.getY() > getMeasuredHeight() - ((jl) this.f935b).B0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 20:
                aw0 aw0Var = (aw0) this.f935b;
                if (motionEvent.getActionMasked() == 0 && (aw0Var.f24696g1 || motionEvent.getY() >= aw0Var.f24693d1)) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(android.graphics.Canvas r10, android.view.View r11, long r12) {
        throw new UnsupportedOperationException("Method not decompiled: ai.f0.drawChild(android.graphics.Canvas, android.view.View, long):boolean");
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.f934a) {
            case 1:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                m2 m2Var = m2.Z;
                AndroidUtilities.setPreferredMaxRefreshRate(m2Var.f1332b, m2Var.d, m2Var.f1333c);
                m2Var.i();
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f934a) {
            case 12:
                zu zuVar = (zu) this.f935b;
                z91 z91Var = zuVar.f33652c;
                tu tuVar = zuVar.f33651b;
                super.onDetachedFromWindow();
                try {
                    rg0 rg0Var = rg0.f30384p0;
                    if (rg0Var.P) {
                        if (tuVar.getVisibility() != 0) {
                        }
                        if (z91Var.f() && !rg0Var.P) {
                            if (zu.S == zuVar) {
                                zu.S = null;
                            }
                            z91Var.b();
                            return;
                        }
                        return;
                    }
                    if (tuVar.getParent() != null) {
                        removeView(tuVar);
                        tuVar.stopLoading();
                        tuVar.loadUrl("about:blank");
                        tuVar.destroy();
                    }
                    if (z91Var.f()) {
                        return;
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        j71 j71Var;
        f0 f0Var;
        MediaController.CropState cropState;
        switch (this.f934a) {
            case 7:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.h) this.f935b) == null) {
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                    this.f935b = hVar;
                    hVar.f31885k = false;
                    hVar.f31887m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.f935b).f31881f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f935b).a(AndroidUtilities.dp(4.0f), canvas, rectF, null);
                invalidate();
                return;
            case 8:
                ((org.telegram.ui.Components.ea) this.f935b).f26024e.a(canvas);
                return;
            case 9:
                jl jlVar = (jl) this.f935b;
                jlVar.f27812d0.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20894h5, jlVar.f29647a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - jlVar.B0, jlVar.f27812d0);
                return;
            case 19:
                tv0 tv0Var = (tv0) this.f935b;
                Drawable drawable = tv0Var.d;
                drawable.setBounds(0, tv0Var.f31184f - tv0.n(tv0Var), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 23:
                Drawable drawable2 = ((j71) this.f935b).f27622b;
                drawable2.setBounds(0, (int) ((j71Var.h - j71.n(j71Var)) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                drawable2.draw(canvas);
                return;
            case 25:
                qg.x1 x1Var = (qg.x1) this.f935b;
                Rect rect = x1Var.E0;
                Rect rect2 = x1Var.D0;
                Paint paint = x1Var.F0;
                fw0 fw0Var = x1Var.f45420v0;
                Bitmap bitmap = x1Var.A0;
                if (x1Var.f45424z0 != null) {
                    canvas.save();
                    float e7 = x1Var.f45419u0.e(x1Var.f45418t0);
                    canvas.scale(1.0f - (e7 * 2.0f), 1.0f, fw0Var.f26590a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.q.z(1.0f, e7, 4.0f * e7, 0.25f));
                    float e10 = x1Var.f45423y0.e(x1Var.f45422x0);
                    if (!x1Var.f45422x0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e10) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(f0Var.getWidth() / 2.0f, f0Var.getHeight() / 2.0f);
                            canvas.rotate(x1Var.f45421w0);
                            float max = Math.max(fw0Var.f26590a / bitmap.getWidth(), fw0Var.f26591b / bitmap.getHeight());
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
            case 26:
                qg.o2 o2Var = (qg.o2) this.f935b;
                ImageReceiver imageReceiver = o2Var.f45291x0;
                fw0 fw0Var2 = o2Var.f45289v0;
                if (o2Var.f45290w0 != null) {
                    canvas.save();
                    float e11 = o2Var.f45288u0.e(o2Var.f45287t0);
                    canvas.scale(1.0f - (e11 * 2.0f), 1.0f, fw0Var2.f26590a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.q.z(1.0f, e11, 4.0f * e11, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) fw0Var2.f26590a, (int) fw0Var2.f26591b);
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
        rg.p0 p0Var;
        rg.p0 p0Var2;
        switch (this.f934a) {
            case 28:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                rg.q0 q0Var = (rg.q0) this.f935b;
                if (q0Var.h && (p0Var2 = q0Var.f46256e) != null) {
                    charSequence = p0Var2.getText();
                } else {
                    charSequence = null;
                }
                if (charSequence == null && (p0Var = q0Var.d) != null) {
                    charSequence = p0Var.getText();
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
        switch (this.f934a) {
            case 9:
                if (motionEvent.getY() > getMeasuredHeight() - ((jl) this.f935b).B0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 19:
                tv0 tv0Var = (tv0) this.f935b;
                if (motionEvent.getAction() == 0 && tv0Var.f31184f != 0 && motionEvent.getY() < tv0Var.f31184f) {
                    tv0Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 23:
                j71 j71Var = (j71) this.f935b;
                if (motionEvent.getAction() == 0 && j71Var.h != 0 && motionEvent.getY() < j71Var.h) {
                    j71Var.dismiss();
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
        switch (this.f934a) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                j30 j30Var = (j30) this.f935b;
                j30Var.setTranslationY((getMeasuredHeight() * 0.28f) - (j30Var.getMeasuredWidth() / 2.0f));
                j30Var.setTranslationX((getMeasuredWidth() * 0.82f) - (j30Var.getMeasuredWidth() / 2.0f));
                return;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(36.0f);
                int i17 = ((i12 - i10) - dp2) / 2;
                int i18 = ((i13 - i11) - dp2) / 2;
                ((org.telegram.ui.Components.ea) this.f935b).f26024e.f(i17, i18, i17 + dp2, dp2 + i18);
                return;
            case 10:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f935b;
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
                int measuredHeight3 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.f24058q0.getMeasuredHeight()) - AndroidUtilities.dp(12.0f);
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.f24058q0;
                    textView.layout(measuredWidth - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.f24058q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f24058q0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.f24058q0;
                    textView2.layout(measuredWidth - (textView2.getMeasuredWidth() / 2), measuredHeight3, (chatAttachAlertPhotoLayout.f24058q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f24058q0.getMeasuredHeight() + measuredHeight3);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.f24047k0;
                shutterButton.layout(measuredWidth - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.f24047k0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f24047k0.getMeasuredWidth() / 2) + measuredWidth, (chatAttachAlertPhotoLayout.f24047k0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.f24060r0;
                imageView.layout(i14 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.f24060r0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f24060r0.getMeasuredWidth() / 2) + i14, (chatAttachAlertPhotoLayout.f24060r0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i21 = 0; i21 < 2; i21++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.S[i21];
                    imageView2.layout(dp - (imageView2.getMeasuredWidth() / 2), i15 - (chatAttachAlertPhotoLayout.S[i21].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.S[i21].getMeasuredWidth() / 2) + dp, (chatAttachAlertPhotoLayout.S[i21].getMeasuredHeight() / 2) + i15);
                }
                return;
            case 15:
                super.onLayout(z10, i10, i11, i12, i13);
                d30 d30Var = (d30) this.f935b;
                f0 f0Var = d30Var.f25541b;
                int[] iArr = d30Var.G;
                f0Var.getLocationOnScreen(iArr);
                d30Var.N = iArr[0];
                d30Var.M = iArr[1] - AndroidUtilities.dp(25.0f);
                return;
            case 17:
                super.onLayout(z10, i10, i11, i12, i13);
                sm0 sm0Var = (sm0) this.f935b;
                f0 f0Var2 = sm0Var.f30830s;
                lw0 lw0Var = sm0Var.v;
                Drawable drawable = sm0Var.E;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    FrameLayout frameLayout = sm0Var.f30832x;
                    if (frameLayout != null) {
                        float f10 = sm0Var.H;
                        float f11 = bounds.left + f10;
                        float f12 = bounds.right + f10;
                        float f13 = sm0Var.I;
                        float f14 = bounds.top + f13;
                        float f15 = bounds.bottom + f13;
                        boolean z12 = false;
                        if (!sm0Var.L) {
                            if (f12 - frameLayout.getMeasuredWidth() < AndroidUtilities.dp(8.0f)) {
                                sm0Var.f30833y.setPivotX(AndroidUtilities.dp(6.0f));
                                sm0Var.f30832x.setX(Math.min(lw0Var.getWidth() - sm0Var.f30832x.getWidth(), f11 - AndroidUtilities.dp(10.0f)) - lw0Var.getX());
                                f7 = 4.0f;
                                z11 = false;
                            } else {
                                ViewGroup viewGroup = sm0Var.f30833y;
                                viewGroup.setPivotX(viewGroup.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f7 = 4.0f;
                                sm0Var.f30832x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f12) - sm0Var.f30832x.getMeasuredWidth()) - lw0Var.getX());
                                z11 = true;
                            }
                            if (z11) {
                                x10 = ((sm0Var.f30832x.getX() + sm0Var.f30832x.getWidth()) - AndroidUtilities.dp(6.0f)) - f12;
                            } else {
                                x10 = (sm0Var.f30832x.getX() + AndroidUtilities.dp(10.0f)) - f11;
                            }
                            sm0Var.G = x10;
                        } else {
                            f7 = 4.0f;
                            z11 = false;
                        }
                        if (sm0Var.F != null) {
                            i16 = AndroidUtilities.dp(21.0f);
                        } else {
                            i16 = 0;
                        }
                        float f16 = f15 + i16;
                        if (sm0Var.f30832x.getMeasuredHeight() + f16 > f0Var2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            ViewGroup viewGroup2 = sm0Var.f30833y;
                            viewGroup2.setPivotY(viewGroup2.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            sm0Var.f30832x.setY(((f14 - AndroidUtilities.dp(f7)) - sm0Var.f30832x.getMeasuredHeight()) - lw0Var.getY());
                            z12 = true;
                        } else {
                            sm0Var.f30833y.setPivotY(AndroidUtilities.dp(6.0f));
                            sm0Var.f30832x.setY(Math.min((f0Var2.getHeight() - sm0Var.f30832x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), f16) - lw0Var.getY());
                        }
                        b80 b80Var = sm0Var.f30831w;
                        b80Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = b80Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.f20363c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                        return;
                    }
                    return;
                }
                return;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                tv0.m((tv0) this.f935b);
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int i12;
        int dp;
        int i13;
        int dp2;
        int dp3;
        boolean z10;
        switch (this.f934a) {
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
                gl glVar = ((jl) this.f935b).F;
                if (glVar != null) {
                    glVar.a();
                    return;
                }
                return;
            case 12:
                int size = View.MeasureSpec.getSize(i10);
                zu zuVar = (zu) this.f935b;
                int min = (int) Math.min(zuVar.H / (zuVar.G / size), AndroidUtilities.displaySize.y / 2);
                if (zuVar.J) {
                    i12 = 22;
                } else {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 84) + min + 1, 1073741824));
                return;
            case 13:
                ny nyVar = (ny) this.f935b;
                View view = (View) nyVar.F.getParent();
                if (view != null) {
                    dp = (int) (view.getMeasuredHeight() - nyVar.F.getY());
                } else {
                    dp = AndroidUtilities.dp(120.0f);
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp - nyVar.F.f29093b1, 1073741824));
                return;
            case 14:
                nz nzVar = ((iz) this.f935b).Q;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (bi.z(8.0f, nzVar.D0.getMeasuredHeight() - nzVar.f29093b1, 3) * 1.7f), 1073741824));
                return;
            case 19:
                tv0 tv0Var = (tv0) this.f935b;
                w0 w0Var = tv0Var.f31181b;
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
                getMeasuredWidth();
                int D = org.telegram.messenger.q.D(54.0f, LocationController.getLocationsCount(), org.telegram.messenger.q.C(56.0f, AndroidUtilities.dp(56.0f), 1));
                int i14 = size2 / 5;
                if (D < i14 * 3) {
                    i13 = AndroidUtilities.dp(8.0f);
                } else {
                    i13 = i14 * 2;
                    if (D < size2) {
                        i13 -= size2 - D;
                    }
                }
                if (w0Var.getPaddingTop() != i13) {
                    tv0Var.h = true;
                    w0Var.setPadding(0, i13, 0, AndroidUtilities.dp(8.0f));
                    tv0Var.h = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), 1073741824));
                return;
            case 22:
                iz0 iz0Var = (iz0) this.f935b;
                int i15 = iz0Var.f27539n;
                if (iz0Var.h == 0) {
                    dp2 = AndroidUtilities.dp(8.0f);
                } else {
                    dp2 = AndroidUtilities.dp(6.66f);
                }
                int i16 = iz0Var.f27539n;
                if (iz0Var.h == 0) {
                    dp3 = AndroidUtilities.dp(6.66f);
                } else {
                    dp3 = AndroidUtilities.dp(8.0f);
                }
                setPadding(i15, dp2, i16, dp3);
                super.onMeasure(i10, i11);
                return;
            case 29:
                rg.y0 y0Var = (rg.y0) this.f935b;
                z10 = ((org.telegram.ui.ActionBar.f3) y0Var).isPortrait;
                if (z10) {
                    y0Var.f46396s = View.MeasureSpec.getSize(i10);
                } else {
                    y0Var.f46396s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
                }
                super.onMeasure(i10, i11);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f934a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.f935b;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i10, i11);
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                return;
            case 17:
                super.onSizeChanged(i10, i11, i12, i13);
                sm0 sm0Var = (sm0) this.f935b;
                gh.d.c(sm0Var.h, sm0Var.f30830s);
                ViewGroup viewGroup = sm0Var.f30833y;
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
        switch (this.f934a) {
            case 19:
                if (!((tv0) this.f935b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 23:
                if (!((j71) this.f935b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 24:
                ((fi1) this.f935b).T.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f934a) {
            case 16:
                zl0 zl0Var = (zl0) this.f935b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(zl0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(zl0Var.getMeasuredHeight(), 1073741824));
                    layout(0, 0, zl0Var.f33528d1.getMeasuredWidth(), zl0Var.f33528d1.getMeasuredHeight());
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 19:
                if (!((tv0) this.f935b).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 21:
                if (!((qy0) this.f935b).f30202g0) {
                    super.requestLayout();
                    return;
                }
                return;
            default:
                super.requestLayout();
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f934a) {
            case 2:
                ci.kc kcVar = (ci.kc) this.f935b;
                if (getTranslationY() != f7 && kcVar.f5383c1 != null) {
                    super.setTranslationY(f7);
                    kcVar.f5383c1.y();
                    return;
                }
                return;
            case 23:
                super.setTranslationY(f7);
                j71.m((j71) this.f935b);
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
        switch (this.f934a) {
            case 15:
                super.setVisibility(i10);
                ((d30) this.f935b).d.setVisibility(i10);
                return;
            case 22:
                iz0 iz0Var = (iz0) this.f935b;
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
                    if (iz0Var.f27537e != null) {
                        for (int i11 = 0; i11 < iz0Var.f27537e.getChildCount(); i11++) {
                            if (z11) {
                                hz0 hz0Var = (hz0) iz0Var.f27537e.getChildAt(i11);
                                Drawable drawable = hz0Var.f27264b;
                                if (drawable instanceof org.telegram.ui.Components.q5) {
                                    ((org.telegram.ui.Components.q5) drawable).a(hz0Var);
                                }
                                hz0Var.f27265c = true;
                            } else {
                                hz0 hz0Var2 = (hz0) iz0Var.f27537e.getChildAt(i11);
                                Drawable drawable2 = hz0Var2.f27264b;
                                if (drawable2 instanceof org.telegram.ui.Components.q5) {
                                    ((org.telegram.ui.Components.q5) drawable2).o(hz0Var2);
                                }
                                hz0Var2.f27265c = false;
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
        this.f934a = i10;
        this.f935b = obj;
    }

    public f0(qg.o2 o2Var, Context context) {
        super(context);
        this.f934a = 26;
        this.f935b = o2Var;
        setWillNotDraw(false);
    }

    public f0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f934a = 11;
        this.f935b = new to[2];
        int i10 = 0;
        while (true) {
            to[] toVarArr = (to[]) this.f935b;
            if (i10 < toVarArr.length) {
                toVarArr[i10] = new to(context, d6Var);
                addView(((to[]) this.f935b)[i10], w7.z5.e(-1, -1, 119));
                i10++;
            } else {
                toVarArr[0].setVisibility(0);
                ((to[]) this.f935b)[1].setVisibility(8);
                return;
            }
        }
    }

    public f0(qg.x1 x1Var, Context context) {
        super(context);
        this.f934a = 25;
        this.f935b = x1Var;
        setWillNotDraw(false);
    }

    public f0(Context context, String str, d dVar) {
        super(context);
        this.f934a = 0;
        int dp = AndroidUtilities.dp(12.0f);
        int i10 = org.telegram.ui.ActionBar.i6.f20930j5;
        setBackground(org.telegram.ui.ActionBar.i6.b0(dp, org.telegram.ui.ActionBar.i6.l1(0.06f, dVar.H0(i10))));
        LinearLayout e7 = bi.e(context, 1);
        addView(e7, w7.z5.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, false, true, true);
        this.f935b = p6Var;
        p6Var.b(0.6f, 450L, tr.h);
        p6Var.setTextSize(AndroidUtilities.dp(17.0f));
        p6Var.setTextColor(dVar.H0(i10));
        p6Var.setScaleProperty(0.7f);
        p6Var.setGravity(17);
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setAllowCancel(true);
        e7.addView(p6Var, w7.z5.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(dVar.H0(i10));
        textView.setGravity(17);
        e7.addView(textView, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    public f0(aw0 aw0Var, Context context) {
        super(context);
        this.f934a = 20;
        this.f935b = aw0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }

    public f0(Context context, j30 j30Var) {
        super(context);
        this.f934a = 6;
        this.f935b = j30Var;
    }
}
