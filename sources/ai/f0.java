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
import org.telegram.ui.Components.aa1;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.d30;
import org.telegram.ui.Components.gf;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.hz0;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.ny;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.qg;
import org.telegram.ui.Components.rg0;
import org.telegram.ui.Components.ry0;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.Components.to;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.tu;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.Components.zu;
import org.telegram.ui.di1;
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
        toVar2.f31200n = true;
        toVar2.setVisibility(0);
        toVarArr[0].setScaleX(0.8f);
        toVarArr[0].setScaleY(0.8f);
        toVarArr[0].setAlpha(0.0f);
        toVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = toVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        tr trVar = tr.h;
        bi.r(translationY, trVar, 320L);
        to toVar3 = toVarArr[1];
        toVar3.f31200n = false;
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
                if (sm0Var.f30885r > 0.0f && sm0Var.f30882e != null) {
                    sm0Var.f30883f.reset();
                    float width = getWidth() / sm0Var.f30881c.getWidth();
                    sm0Var.f30883f.postScale(width, width);
                    sm0Var.d.setLocalMatrix(sm0Var.f30883f);
                    sm0Var.f30882e.setAlpha((int) (sm0Var.f30885r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), sm0Var.f30882e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = sm0Var.E;
                if (drawable != null) {
                    drawable.setAlpha((int) (sm0Var.f30885r * 255.0f));
                    canvas.save();
                    float f15 = sm0Var.H;
                    float f16 = sm0Var.G;
                    float f17 = sm0Var.f30885r;
                    canvas.translate((f16 * f17) + f15, (0.0f * f17) + sm0Var.I);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(sm0Var.J, sm0Var.K), Math.max(sm0Var.J, sm0Var.K), 0.75f), 1.0f, sm0Var.f30885r);
                    canvas.scale(lerp, lerp, ((sm0Var.E.getBounds().width() / 2.0f) * sm0Var.J) + (-sm0Var.H) + sm0Var.E.getBounds().left, ((sm0Var.E.getBounds().height() / 2.0f) * sm0Var.K) + (-sm0Var.I) + sm0Var.E.getBounds().top);
                    ch.d dVar = sm0Var.F;
                    if (dVar != null) {
                        dVar.setAlpha((int) (sm0Var.f30885r * 255.0f));
                        sm0Var.F.draw(canvas);
                    }
                    sm0Var.E.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 22:
                jz0 jz0Var = (jz0) this.f935b;
                hz0 hz0Var = jz0Var.f28002c;
                if (hz0Var != null && hz0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = jz0Var.T;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x10 = jz0Var.f28002c.getEditField().getX() + jz0Var.f28002c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = jz0Var.T;
                        jz0Var.f27999a0 = x10 + emojiSpan2.lastDrawX;
                        jz0Var.U = emojiSpan2.lastDrawY;
                    } else if (jz0Var.V != null && jz0Var.W != null) {
                        jz0Var.f27999a0 = jz0Var.f28002c.getEditField().getX() + jz0Var.f28002c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                if (jz0Var.f28009s && !jz0Var.v && (arrayList = jz0Var.f28010w) != null && !arrayList.isEmpty() && !jz0Var.f28011x) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.e6 e6Var = jz0Var.P;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float d = e6Var.d(f7, false);
                org.telegram.ui.Components.e6 e6Var2 = jz0Var.Q;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float d10 = e6Var2.d(f10, false);
                float d11 = jz0Var.f28001b0.d(jz0Var.f27999a0, false);
                if (d <= 0.0f && d10 <= 0.0f && !z10) {
                    jz0Var.d.setVisibility(8);
                }
                jz0Var.M.rewind();
                float left = jz0Var.f28005e.getLeft();
                int left2 = jz0Var.f28005e.getLeft();
                ArrayList arrayList2 = jz0Var.f28010w;
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                float D = org.telegram.messenger.q.D(44.0f, size, left2);
                org.telegram.ui.Components.e6 e6Var3 = jz0Var.f28004d0;
                float f18 = e6Var3.f25987c;
                if (f18 <= 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                float f19 = D - left;
                if (f19 > 0.0f) {
                    f18 = e6Var3.d(f19, z11);
                }
                float d12 = jz0Var.f28003c0.d((left + D) / 2.0f, z11);
                hz0 hz0Var2 = jz0Var.f28002c;
                if (hz0Var2 != null && hz0Var2.getEditField() != null) {
                    int i11 = jz0Var.h;
                    if (i11 == 0) {
                        jz0Var.d.setTranslationY(((-jz0Var.f28002c.getEditField().getHeight()) - jz0Var.f28002c.getEditField().getScrollY()) + jz0Var.U + AndroidUtilities.dp(5.0f));
                    } else if (i11 == 1) {
                        jz0Var.d.setTranslationY(((-jz0Var.getMeasuredHeight()) - jz0Var.f28002c.getEditField().getScrollY()) + jz0Var.U + AndroidUtilities.dp(20.0f) + jz0Var.d.getHeight());
                    }
                }
                float f20 = f18 / 4.0f;
                float f21 = f18 / 2.0f;
                int max = (int) Math.max((jz0Var.f27999a0 - Math.max(f20, Math.min(f21, AndroidUtilities.dp(66.0f)))) - jz0Var.f28005e.getLeft(), 0.0f);
                if (jz0Var.f28005e.getPaddingLeft() != max) {
                    f11 = 1.0f;
                    jz0Var.f28005e.setPadding(max, 0, 0, 0);
                    jz0Var.f28005e.scrollBy(jz0Var.f28005e.getPaddingLeft() - max, 0);
                } else {
                    f11 = 1.0f;
                }
                jz0Var.f28005e.setTranslationX(((int) Math.max((d11 - Math.max(f20, Math.min(f21, AndroidUtilities.dp(66.0f)))) - jz0Var.f28005e.getLeft(), 0.0f)) - max);
                float translationX = jz0Var.f28005e.getTranslationX() + (d12 - f21) + jz0Var.f28005e.getPaddingLeft();
                float translationY = jz0Var.f28005e.getTranslationY() + jz0Var.f28005e.getTop() + jz0Var.f28005e.getPaddingTop();
                if (jz0Var.h == 0) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(6.66f);
                }
                float f22 = translationY + dp;
                float min = Math.min(jz0Var.f28005e.getTranslationX() + d12 + f21 + jz0Var.f28005e.getPaddingLeft(), jz0Var.getWidth() - jz0Var.d.getPaddingRight());
                float translationY2 = jz0Var.f28005e.getTranslationY() + jz0Var.f28005e.getBottom();
                if (jz0Var.h == 0) {
                    i10 = AndroidUtilities.dp(6.66f);
                } else {
                    i10 = 0;
                }
                float f23 = translationY2 - i10;
                float min2 = Math.min(AndroidUtilities.dp(9.0f), f21) * 2.0f;
                int i12 = jz0Var.h;
                if (i12 == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f24 = f23 - min2;
                    float f25 = translationX + min2;
                    rectF.set(translationX, f24, f25, f23);
                    jz0Var.M.arcTo(rectF, 90.0f, 90.0f);
                    float f26 = f22 + min2;
                    rectF.set(translationX, f22, f25, f26);
                    jz0Var.M.arcTo(rectF, -180.0f, 90.0f);
                    float f27 = min - min2;
                    rectF.set(f27, f22, min, f26);
                    jz0Var.M.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f27, f24, min, f23);
                    jz0Var.M.arcTo(rectF, 0.0f, 90.0f);
                    jz0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, f23);
                    jz0Var.M.lineTo(d11, AndroidUtilities.dp(6.66f) + f23);
                    jz0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), f23);
                } else if (i12 == 1) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f28 = min - min2;
                    float f29 = f22 + min2;
                    rectF2.set(f28, f22, min, f29);
                    jz0Var.M.arcTo(rectF2, -90.0f, 90.0f);
                    float f30 = f23 - min2;
                    rectF2.set(f28, f30, min, f23);
                    jz0Var.M.arcTo(rectF2, 0.0f, 90.0f);
                    float f31 = min2 + translationX;
                    rectF2.set(translationX, f30, f31, f23);
                    jz0Var.M.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, f22, f31, f29);
                    jz0Var.M.arcTo(rectF2, -180.0f, 90.0f);
                    jz0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), f22);
                    jz0Var.M.lineTo(d11, f22 - AndroidUtilities.dp(6.66f));
                    jz0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, f22);
                }
                jz0Var.M.close();
                if (jz0Var.O == null) {
                    Paint paint = new Paint(1);
                    jz0Var.O = paint;
                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.0f)));
                    jz0Var.O.setShadowLayer(AndroidUtilities.dp(4.33f), 0.0f, AndroidUtilities.dp(0.33333334f), 855638016);
                    jz0Var.O.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Be, jz0Var.f28000b));
                }
                if (d < f11) {
                    jz0Var.N.rewind();
                    if (jz0Var.h == 0) {
                        dp2 = AndroidUtilities.dp(6.66f) + f23;
                    } else {
                        dp2 = f22 - AndroidUtilities.dp(6.66f);
                    }
                    double d13 = d11 - translationX;
                    double d14 = dp2 - f22;
                    f12 = 255.0f;
                    double d15 = d11 - min;
                    double d16 = dp2 - f23;
                    jz0Var.N.addCircle(d11, dp2, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d14, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d14, 2.0d) + Math.pow(d15, 2.0d)), Math.max(Math.pow(d16, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d16, 2.0d) + Math.pow(d15, 2.0d))))) * d, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(jz0Var.N);
                    canvas.saveLayerAlpha(0.0f, 0.0f, jz0Var.getWidth(), jz0Var.getHeight(), (int) (d * 255.0f), 31);
                } else {
                    f12 = 255.0f;
                }
                canvas.drawPath(jz0Var.M, jz0Var.O);
                canvas.save();
                canvas.clipPath(jz0Var.M);
                super.dispatchDraw(canvas);
                float f32 = jz0Var.f28004d0.f25987c;
                float f33 = jz0Var.f28003c0.f25987c;
                float f34 = f32 / 2.0f;
                float translationX2 = jz0Var.f28005e.getTranslationX() + (f33 - f34) + jz0Var.f28005e.getPaddingLeft();
                float paddingTop = jz0Var.f28005e.getPaddingTop() + jz0Var.f28005e.getTop();
                float min3 = Math.min(jz0Var.f28005e.getTranslationX() + f33 + f34 + jz0Var.f28005e.getPaddingLeft(), jz0Var.getWidth() - jz0Var.d.getPaddingRight());
                float bottom = jz0Var.f28005e.getBottom();
                org.telegram.ui.Components.e6 e6Var4 = jz0Var.R;
                if (jz0Var.f28005e.canScrollHorizontally(-1)) {
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
                org.telegram.ui.Components.e6 e6Var5 = jz0Var.S;
                if (jz0Var.f28005e.canScrollHorizontally(1)) {
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
                if (jz0Var.P.f25987c < f11) {
                    canvas.restore();
                    canvas.restore();
                    return;
                }
                return;
            case 27:
                qg.t2 t2Var = (qg.t2) this.f935b;
                if (t2Var.f45368y > 0.0f && t2Var.f45365s != null) {
                    t2Var.v.reset();
                    float width2 = getWidth() / t2Var.f45363n.getWidth();
                    t2Var.v.postScale(width2, width2);
                    t2Var.f45364r.setLocalMatrix(t2Var.v);
                    t2Var.f45365s.setAlpha((int) (t2Var.f45368y * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), t2Var.f45365s);
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
                    if (!kVar.f16986f) {
                        float f7 = m2Var.N;
                        kVar.f16983b = f7;
                        kVar.f16984c = true;
                        o1.l lVar = kVar.f16993u;
                        int i10 = m2Var.J;
                        float f10 = (i10 / 2.0f) + f7;
                        int i11 = AndroidUtilities.displaySize.x;
                        if (f10 >= i11 / 2.0f) {
                            dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        lVar.f17000i = dp;
                        m2Var.P.f();
                    }
                    o1.k kVar2 = m2Var.Q;
                    if (!kVar2.f16986f) {
                        float f11 = m2Var.O;
                        kVar2.f16983b = f11;
                        kVar2.f16984c = true;
                        kVar2.f16993u.f17000i = w7.q.a(f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - m2Var.K) - AndroidUtilities.dp(16.0f));
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
                bw0 bw0Var = (bw0) this.f935b;
                if (motionEvent.getActionMasked() == 0 && (bw0Var.f25123d0 || motionEvent.getY() >= bw0Var.f25118a0)) {
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
                aa1 aa1Var = zuVar.f33643c;
                tu tuVar = zuVar.f33642b;
                super.onDetachedFromWindow();
                try {
                    rg0 rg0Var = rg0.f30466p0;
                    if (rg0Var.P) {
                        if (tuVar.getVisibility() != 0) {
                        }
                        if (aa1Var.f() && !rg0Var.P) {
                            if (zu.S == zuVar) {
                                zu.S = null;
                            }
                            aa1Var.b();
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
                    if (aa1Var.f()) {
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
        k71 k71Var;
        f0 f0Var;
        MediaController.CropState cropState;
        switch (this.f934a) {
            case 7:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.h) this.f935b) == null) {
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                    this.f935b = hVar;
                    hVar.f31952k = false;
                    hVar.f31954m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.f935b).f31948f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f935b).a(AndroidUtilities.dp(4.0f), canvas, rectF, null);
                invalidate();
                return;
            case 8:
                ((org.telegram.ui.Components.ea) this.f935b).f26093e.a(canvas);
                return;
            case 9:
                jl jlVar = (jl) this.f935b;
                jlVar.f27879d0.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20899h5, jlVar.f29740a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - jlVar.B0, jlVar.f27879d0);
                return;
            case 19:
                uv0 uv0Var = (uv0) this.f935b;
                Drawable drawable = uv0Var.d;
                drawable.setBounds(0, uv0Var.f31528f - uv0.n(uv0Var), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 23:
                Drawable drawable2 = ((k71) this.f935b).f28078b;
                drawable2.setBounds(0, (int) ((k71Var.h - k71.n(k71Var)) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                drawable2.draw(canvas);
                return;
            case 25:
                qg.x1 x1Var = (qg.x1) this.f935b;
                Rect rect = x1Var.E0;
                Rect rect2 = x1Var.D0;
                Paint paint = x1Var.F0;
                gw0 gw0Var = x1Var.f45427v0;
                Bitmap bitmap = x1Var.A0;
                if (x1Var.f45431z0 != null) {
                    canvas.save();
                    float e7 = x1Var.f45426u0.e(x1Var.f45425t0);
                    canvas.scale(1.0f - (e7 * 2.0f), 1.0f, gw0Var.f27002a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.q.z(1.0f, e7, 4.0f * e7, 0.25f));
                    float e10 = x1Var.f45430y0.e(x1Var.f45429x0);
                    if (!x1Var.f45429x0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e10) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(f0Var.getWidth() / 2.0f, f0Var.getHeight() / 2.0f);
                            canvas.rotate(x1Var.f45428w0);
                            float max = Math.max(gw0Var.f27002a / bitmap.getWidth(), gw0Var.f27003b / bitmap.getHeight());
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
                ImageReceiver imageReceiver = o2Var.f45298x0;
                gw0 gw0Var2 = o2Var.f45296v0;
                if (o2Var.f45297w0 != null) {
                    canvas.save();
                    float e11 = o2Var.f45295u0.e(o2Var.f45294t0);
                    canvas.scale(1.0f - (e11 * 2.0f), 1.0f, gw0Var2.f27002a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.q.z(1.0f, e11, 4.0f * e11, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) gw0Var2.f27002a, (int) gw0Var2.f27003b);
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
                if (q0Var.h && (p0Var2 = q0Var.f46263e) != null) {
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
                uv0 uv0Var = (uv0) this.f935b;
                if (motionEvent.getAction() == 0 && uv0Var.f31528f != 0 && motionEvent.getY() < uv0Var.f31528f) {
                    uv0Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 23:
                k71 k71Var = (k71) this.f935b;
                if (motionEvent.getAction() == 0 && k71Var.h != 0 && motionEvent.getY() < k71Var.h) {
                    k71Var.dismiss();
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
                ((org.telegram.ui.Components.ea) this.f935b).f26093e.f(i17, i18, i17 + dp2, dp2 + i18);
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
                int measuredHeight3 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.f24061q0.getMeasuredHeight()) - AndroidUtilities.dp(12.0f);
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.f24061q0;
                    textView.layout(measuredWidth - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.f24061q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f24061q0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.f24061q0;
                    textView2.layout(measuredWidth - (textView2.getMeasuredWidth() / 2), measuredHeight3, (chatAttachAlertPhotoLayout.f24061q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f24061q0.getMeasuredHeight() + measuredHeight3);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.f24050k0;
                shutterButton.layout(measuredWidth - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.f24050k0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f24050k0.getMeasuredWidth() / 2) + measuredWidth, (chatAttachAlertPhotoLayout.f24050k0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.f24063r0;
                imageView.layout(i14 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.f24063r0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f24063r0.getMeasuredWidth() / 2) + i14, (chatAttachAlertPhotoLayout.f24063r0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i21 = 0; i21 < 2; i21++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.S[i21];
                    imageView2.layout(dp - (imageView2.getMeasuredWidth() / 2), i15 - (chatAttachAlertPhotoLayout.S[i21].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.S[i21].getMeasuredWidth() / 2) + dp, (chatAttachAlertPhotoLayout.S[i21].getMeasuredHeight() / 2) + i15);
                }
                return;
            case 15:
                super.onLayout(z10, i10, i11, i12, i13);
                d30 d30Var = (d30) this.f935b;
                f0 f0Var = d30Var.f25603b;
                int[] iArr = d30Var.G;
                f0Var.getLocationOnScreen(iArr);
                d30Var.N = iArr[0];
                d30Var.M = iArr[1] - AndroidUtilities.dp(25.0f);
                return;
            case 17:
                super.onLayout(z10, i10, i11, i12, i13);
                sm0 sm0Var = (sm0) this.f935b;
                f0 f0Var2 = sm0Var.f30886s;
                mw0 mw0Var = sm0Var.v;
                Drawable drawable = sm0Var.E;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    FrameLayout frameLayout = sm0Var.f30888x;
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
                                sm0Var.f30889y.setPivotX(AndroidUtilities.dp(6.0f));
                                sm0Var.f30888x.setX(Math.min(mw0Var.getWidth() - sm0Var.f30888x.getWidth(), f11 - AndroidUtilities.dp(10.0f)) - mw0Var.getX());
                                f7 = 4.0f;
                                z11 = false;
                            } else {
                                ViewGroup viewGroup = sm0Var.f30889y;
                                viewGroup.setPivotX(viewGroup.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f7 = 4.0f;
                                sm0Var.f30888x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f12) - sm0Var.f30888x.getMeasuredWidth()) - mw0Var.getX());
                                z11 = true;
                            }
                            if (z11) {
                                x10 = ((sm0Var.f30888x.getX() + sm0Var.f30888x.getWidth()) - AndroidUtilities.dp(6.0f)) - f12;
                            } else {
                                x10 = (sm0Var.f30888x.getX() + AndroidUtilities.dp(10.0f)) - f11;
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
                        if (sm0Var.f30888x.getMeasuredHeight() + f16 > f0Var2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            ViewGroup viewGroup2 = sm0Var.f30889y;
                            viewGroup2.setPivotY(viewGroup2.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            sm0Var.f30888x.setY(((f14 - AndroidUtilities.dp(f7)) - sm0Var.f30888x.getMeasuredHeight()) - mw0Var.getY());
                            z12 = true;
                        } else {
                            sm0Var.f30889y.setPivotY(AndroidUtilities.dp(6.0f));
                            sm0Var.f30888x.setY(Math.min((f0Var2.getHeight() - sm0Var.f30888x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), f16) - mw0Var.getY());
                        }
                        b80 b80Var = sm0Var.f30887w;
                        b80Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = b80Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.f20368c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                        return;
                    }
                    return;
                }
                return;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                uv0.m((uv0) this.f935b);
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
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp - nyVar.F.f29190b1, 1073741824));
                return;
            case 14:
                nz nzVar = ((iz) this.f935b).Q;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (bi.z(8.0f, nzVar.D0.getMeasuredHeight() - nzVar.f29190b1, 3) * 1.7f), 1073741824));
                return;
            case 19:
                uv0 uv0Var = (uv0) this.f935b;
                w0 w0Var = uv0Var.f31525b;
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
                    uv0Var.h = true;
                    w0Var.setPadding(0, i13, 0, AndroidUtilities.dp(8.0f));
                    uv0Var.h = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), 1073741824));
                return;
            case 22:
                jz0 jz0Var = (jz0) this.f935b;
                int i15 = jz0Var.f28007n;
                if (jz0Var.h == 0) {
                    dp2 = AndroidUtilities.dp(8.0f);
                } else {
                    dp2 = AndroidUtilities.dp(6.66f);
                }
                int i16 = jz0Var.f28007n;
                if (jz0Var.h == 0) {
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
                    y0Var.f46403s = View.MeasureSpec.getSize(i10);
                } else {
                    y0Var.f46403s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
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
                gh.d.c(sm0Var.h, sm0Var.f30886s);
                ViewGroup viewGroup = sm0Var.f30889y;
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
                if (!((uv0) this.f935b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 23:
                if (!((k71) this.f935b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 24:
                ((di1) this.f935b).T.onTouchEvent(motionEvent);
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
                    layout(0, 0, zl0Var.f33536d1.getMeasuredWidth(), zl0Var.f33536d1.getMeasuredHeight());
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 19:
                if (!((uv0) this.f935b).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 21:
                if (!((ry0) this.f935b).f30617g0) {
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
                k71.m((k71) this.f935b);
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
                jz0 jz0Var = (jz0) this.f935b;
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
                    if (jz0Var.f28005e != null) {
                        for (int i11 = 0; i11 < jz0Var.f28005e.getChildCount(); i11++) {
                            if (z11) {
                                iz0 iz0Var = (iz0) jz0Var.f28005e.getChildAt(i11);
                                Drawable drawable = iz0Var.f27629b;
                                if (drawable instanceof org.telegram.ui.Components.q5) {
                                    ((org.telegram.ui.Components.q5) drawable).a(iz0Var);
                                }
                                iz0Var.f27630c = true;
                            } else {
                                iz0 iz0Var2 = (iz0) jz0Var.f28005e.getChildAt(i11);
                                Drawable drawable2 = iz0Var2.f27629b;
                                if (drawable2 instanceof org.telegram.ui.Components.q5) {
                                    ((org.telegram.ui.Components.q5) drawable2).o(iz0Var2);
                                }
                                iz0Var2.f27630c = false;
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
        int i10 = org.telegram.ui.ActionBar.i6.f20935j5;
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

    public f0(bw0 bw0Var, Context context) {
        super(context);
        this.f934a = 20;
        this.f935b = bw0Var;
        setClipChildren(false);
        setClipToPadding(false);
    }

    public f0(Context context, j30 j30Var) {
        super(context);
        this.f934a = 6;
        this.f935b = j30Var;
    }
}
