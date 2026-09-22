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
import org.telegram.messenger.vl;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.eg0;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.ny0;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qo;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.vu;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.z20;
import org.telegram.ui.ni1;
public final class f0 extends FrameLayout {
    public final int f781a;
    public Object f782b;

    public f0(Context context, int i10) {
        super(context);
        this.f781a = i10;
    }

    public qo a() {
        return ((qo[]) this.f782b)[0];
    }

    @Override
    public void addView(View view, int i10, int i11) {
        switch (this.f781a) {
            case 5:
                super.addView(view, i10, i11);
                ((hh.g) this.f782b).e();
                return;
            default:
                super.addView(view, i10, i11);
                return;
        }
    }

    public void b() {
        qo[] qoVarArr = (qo[]) this.f782b;
        qo qoVar = qoVarArr[0];
        qo qoVar2 = qoVarArr[1];
        qoVarArr[0] = qoVar2;
        qoVarArr[1] = qoVar;
        qoVar2.f27405n = true;
        qoVar2.setVisibility(0);
        qoVarArr[0].setScaleX(0.8f);
        qoVarArr[0].setScaleY(0.8f);
        qoVarArr[0].setAlpha(0.0f);
        qoVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = qoVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        qr qrVar = qr.h;
        vl.r(translationY, qrVar, 320L);
        qo qoVar3 = qoVarArr[1];
        qoVar3.f27405n = false;
        qoVar3.setVisibility(0);
        qoVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(qrVar).setDuration(320L).withEndAction(new ng(qoVar3, 28)).start();
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
        switch (this.f781a) {
            case 17:
                am0 am0Var = (am0) this.f782b;
                if (am0Var.f22438r > 0.0f && am0Var.e != null) {
                    am0Var.f22436f.reset();
                    float width = getWidth() / am0Var.f22435c.getWidth();
                    am0Var.f22436f.postScale(width, width);
                    am0Var.d.setLocalMatrix(am0Var.f22436f);
                    am0Var.e.setAlpha((int) (am0Var.f22438r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), am0Var.e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = am0Var.E;
                if (drawable != null) {
                    drawable.setAlpha((int) (am0Var.f22438r * 255.0f));
                    canvas.save();
                    float f15 = am0Var.H;
                    float f16 = am0Var.G;
                    float f17 = am0Var.f22438r;
                    canvas.translate((f16 * f17) + f15, (0.0f * f17) + am0Var.I);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(am0Var.J, am0Var.K), Math.max(am0Var.J, am0Var.K), 0.75f), 1.0f, am0Var.f22438r);
                    canvas.scale(lerp, lerp, ((am0Var.E.getBounds().width() / 2.0f) * am0Var.J) + (-am0Var.H) + am0Var.E.getBounds().left, ((am0Var.E.getBounds().height() / 2.0f) * am0Var.K) + (-am0Var.I) + am0Var.E.getBounds().top);
                    ch.d dVar = am0Var.F;
                    if (dVar != null) {
                        dVar.setAlpha((int) (am0Var.f22438r * 255.0f));
                        am0Var.F.draw(canvas);
                    }
                    am0Var.E.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 21:
                ny0 ny0Var = (ny0) this.f782b;
                ly0 ly0Var = ny0Var.f26617c;
                if (ly0Var != null && ly0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = ny0Var.T;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x10 = ny0Var.f26617c.getEditField().getX() + ny0Var.f26617c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = ny0Var.T;
                        ny0Var.f26614a0 = x10 + emojiSpan2.lastDrawX;
                        ny0Var.U = emojiSpan2.lastDrawY;
                    } else if (ny0Var.V != null && ny0Var.W != null) {
                        ny0Var.f26614a0 = ny0Var.f26617c.getEditField().getX() + ny0Var.f26617c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                if (ny0Var.f26623s && !ny0Var.v && (arrayList = ny0Var.f26624w) != null && !arrayList.isEmpty() && !ny0Var.f26625x) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.c6 c6Var = ny0Var.P;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float d = c6Var.d(f7, false);
                org.telegram.ui.Components.c6 c6Var2 = ny0Var.Q;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float d10 = c6Var2.d(f10, false);
                float d11 = ny0Var.f26616b0.d(ny0Var.f26614a0, false);
                if (d <= 0.0f && d10 <= 0.0f && !z10) {
                    ny0Var.d.setVisibility(8);
                }
                ny0Var.M.rewind();
                float left = ny0Var.e.getLeft();
                int left2 = ny0Var.e.getLeft();
                ArrayList arrayList2 = ny0Var.f26624w;
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                float D = org.telegram.messenger.y0.D(44.0f, size, left2);
                org.telegram.ui.Components.c6 c6Var3 = ny0Var.f26619d0;
                float f18 = c6Var3.f22951c;
                if (f18 <= 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                float f19 = D - left;
                if (f19 > 0.0f) {
                    f18 = c6Var3.d(f19, z11);
                }
                float d12 = ny0Var.f26618c0.d((left + D) / 2.0f, z11);
                ly0 ly0Var2 = ny0Var.f26617c;
                if (ly0Var2 != null && ly0Var2.getEditField() != null) {
                    int i11 = ny0Var.h;
                    if (i11 == 0) {
                        ny0Var.d.setTranslationY(((-ny0Var.f26617c.getEditField().getHeight()) - ny0Var.f26617c.getEditField().getScrollY()) + ny0Var.U + AndroidUtilities.dp(5.0f));
                    } else if (i11 == 1) {
                        ny0Var.d.setTranslationY(((-ny0Var.getMeasuredHeight()) - ny0Var.f26617c.getEditField().getScrollY()) + ny0Var.U + AndroidUtilities.dp(20.0f) + ny0Var.d.getHeight());
                    }
                }
                float f20 = f18 / 4.0f;
                float f21 = f18 / 2.0f;
                int max = (int) Math.max((ny0Var.f26614a0 - Math.max(f20, Math.min(f21, AndroidUtilities.dp(66.0f)))) - ny0Var.e.getLeft(), 0.0f);
                if (ny0Var.e.getPaddingLeft() != max) {
                    f11 = 1.0f;
                    ny0Var.e.setPadding(max, 0, 0, 0);
                    ny0Var.e.scrollBy(ny0Var.e.getPaddingLeft() - max, 0);
                } else {
                    f11 = 1.0f;
                }
                ny0Var.e.setTranslationX(((int) Math.max((d11 - Math.max(f20, Math.min(f21, AndroidUtilities.dp(66.0f)))) - ny0Var.e.getLeft(), 0.0f)) - max);
                float translationX = ny0Var.e.getTranslationX() + (d12 - f21) + ny0Var.e.getPaddingLeft();
                float translationY = ny0Var.e.getTranslationY() + ny0Var.e.getTop() + ny0Var.e.getPaddingTop();
                if (ny0Var.h == 0) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(6.66f);
                }
                float f22 = translationY + dp;
                float min = Math.min(ny0Var.e.getTranslationX() + d12 + f21 + ny0Var.e.getPaddingLeft(), ny0Var.getWidth() - ny0Var.d.getPaddingRight());
                float translationY2 = ny0Var.e.getTranslationY() + ny0Var.e.getBottom();
                if (ny0Var.h == 0) {
                    i10 = AndroidUtilities.dp(6.66f);
                } else {
                    i10 = 0;
                }
                float f23 = translationY2 - i10;
                float min2 = Math.min(AndroidUtilities.dp(9.0f), f21) * 2.0f;
                int i12 = ny0Var.h;
                if (i12 == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f24 = f23 - min2;
                    float f25 = translationX + min2;
                    rectF.set(translationX, f24, f25, f23);
                    ny0Var.M.arcTo(rectF, 90.0f, 90.0f);
                    float f26 = f22 + min2;
                    rectF.set(translationX, f22, f25, f26);
                    ny0Var.M.arcTo(rectF, -180.0f, 90.0f);
                    float f27 = min - min2;
                    rectF.set(f27, f22, min, f26);
                    ny0Var.M.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f27, f24, min, f23);
                    ny0Var.M.arcTo(rectF, 0.0f, 90.0f);
                    ny0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, f23);
                    ny0Var.M.lineTo(d11, AndroidUtilities.dp(6.66f) + f23);
                    ny0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), f23);
                } else if (i12 == 1) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f28 = min - min2;
                    float f29 = f22 + min2;
                    rectF2.set(f28, f22, min, f29);
                    ny0Var.M.arcTo(rectF2, -90.0f, 90.0f);
                    float f30 = f23 - min2;
                    rectF2.set(f28, f30, min, f23);
                    ny0Var.M.arcTo(rectF2, 0.0f, 90.0f);
                    float f31 = min2 + translationX;
                    rectF2.set(translationX, f30, f31, f23);
                    ny0Var.M.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, f22, f31, f29);
                    ny0Var.M.arcTo(rectF2, -180.0f, 90.0f);
                    ny0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), f22);
                    ny0Var.M.lineTo(d11, f22 - AndroidUtilities.dp(6.66f));
                    ny0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, f22);
                }
                ny0Var.M.close();
                if (ny0Var.O == null) {
                    Paint paint = new Paint(1);
                    ny0Var.O = paint;
                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.0f)));
                    ny0Var.O.setShadowLayer(AndroidUtilities.dp(4.33f), 0.0f, AndroidUtilities.dp(0.33333334f), 855638016);
                    ny0Var.O.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Be, ny0Var.f26615b));
                }
                if (d < f11) {
                    ny0Var.N.rewind();
                    if (ny0Var.h == 0) {
                        dp2 = AndroidUtilities.dp(6.66f) + f23;
                    } else {
                        dp2 = f22 - AndroidUtilities.dp(6.66f);
                    }
                    double d13 = d11 - translationX;
                    double d14 = dp2 - f22;
                    f12 = 255.0f;
                    double d15 = d11 - min;
                    double d16 = dp2 - f23;
                    ny0Var.N.addCircle(d11, dp2, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d14, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d14, 2.0d) + Math.pow(d15, 2.0d)), Math.max(Math.pow(d16, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d16, 2.0d) + Math.pow(d15, 2.0d))))) * d, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(ny0Var.N);
                    canvas.saveLayerAlpha(0.0f, 0.0f, ny0Var.getWidth(), ny0Var.getHeight(), (int) (d * 255.0f), 31);
                } else {
                    f12 = 255.0f;
                }
                canvas.drawPath(ny0Var.M, ny0Var.O);
                canvas.save();
                canvas.clipPath(ny0Var.M);
                super.dispatchDraw(canvas);
                float f32 = ny0Var.f26619d0.f22951c;
                float f33 = ny0Var.f26618c0.f22951c;
                float f34 = f32 / 2.0f;
                float translationX2 = ny0Var.e.getTranslationX() + (f33 - f34) + ny0Var.e.getPaddingLeft();
                float paddingTop = ny0Var.e.getPaddingTop() + ny0Var.e.getTop();
                float min3 = Math.min(ny0Var.e.getTranslationX() + f33 + f34 + ny0Var.e.getPaddingLeft(), ny0Var.getWidth() - ny0Var.d.getPaddingRight());
                float bottom = ny0Var.e.getBottom();
                org.telegram.ui.Components.c6 c6Var4 = ny0Var.R;
                if (ny0Var.e.canScrollHorizontally(-1)) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                float d17 = c6Var4.d(f13, false);
                if (d17 > 0.0f) {
                    int i13 = (int) translationX2;
                    org.telegram.ui.ActionBar.i6.F4.setBounds(i13, (int) paddingTop, AndroidUtilities.dp(32.0f) + i13, (int) bottom);
                    org.telegram.ui.ActionBar.i6.F4.setAlpha((int) (d17 * f12));
                    org.telegram.ui.ActionBar.i6.F4.draw(canvas);
                }
                org.telegram.ui.Components.c6 c6Var5 = ny0Var.S;
                if (ny0Var.e.canScrollHorizontally(1)) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                float d18 = c6Var5.d(f14, false);
                if (d18 > 0.0f) {
                    int i14 = (int) min3;
                    org.telegram.ui.ActionBar.i6.E4.setBounds(i14 - AndroidUtilities.dp(32.0f), (int) paddingTop, i14, (int) bottom);
                    org.telegram.ui.ActionBar.i6.E4.setAlpha((int) (d18 * f12));
                    org.telegram.ui.ActionBar.i6.E4.draw(canvas);
                }
                canvas.restore();
                if (ny0Var.P.f22951c < f11) {
                    canvas.restore();
                    canvas.restore();
                    return;
                }
                return;
            case 26:
                qg.v2 v2Var = (qg.v2) this.f782b;
                if (v2Var.f41689y > 0.0f && v2Var.f41686s != null) {
                    v2Var.v.reset();
                    float width2 = getWidth() / v2Var.f41684n.getWidth();
                    v2Var.v.postScale(width2, width2);
                    v2Var.f41685r.setLocalMatrix(v2Var.v);
                    v2Var.f41686s.setAlpha((int) (v2Var.f41689y * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), v2Var.f41686s);
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
        switch (this.f781a) {
            case 18:
                cf cfVar = (cf) this.f782b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && cfVar.isShowing()) {
                    cfVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f781a) {
            case 17:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((am0) this.f782b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            case 26:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((qg.v2) this.f782b).onBackPressed();
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
        switch (this.f781a) {
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
                boolean onTouchEvent = m2Var.f1237x.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!m2Var.f1237x.isInProgress() && ((GestureDetector) m2Var.f1238y.f13384b).onTouchEvent(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (action == 1 || action == 3) {
                    m2Var.E = false;
                    m2Var.F = false;
                    o1.k kVar = m2Var.P;
                    if (!kVar.f15342f) {
                        float f7 = m2Var.N;
                        kVar.f15340b = f7;
                        kVar.f15341c = true;
                        o1.l lVar = kVar.f15349u;
                        int i10 = m2Var.J;
                        float f10 = (i10 / 2.0f) + f7;
                        int i11 = AndroidUtilities.displaySize.x;
                        if (f10 >= i11 / 2.0f) {
                            dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        lVar.f15355i = dp;
                        m2Var.P.f();
                    }
                    o1.k kVar2 = m2Var.Q;
                    if (!kVar2.f15342f) {
                        float f11 = m2Var.O;
                        kVar2.f15340b = f11;
                        kVar2.f15341c = true;
                        kVar2.f15349u.f15355i = w7.p.a(f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - m2Var.K) - AndroidUtilities.dp(16.0f));
                        m2Var.Q.f();
                    }
                }
                if (onTouchEvent || z10) {
                    return true;
                }
                return false;
            case 3:
                if (((di.i) this.f782b).f7760e0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 9:
                if (motionEvent.getY() > getMeasuredHeight() - ((gl) this.f782b).B0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f781a) {
            case 9:
                canvas.save();
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                gl glVar = (gl) this.f782b;
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
        switch (this.f781a) {
            case 1:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                m2 m2Var = m2.Z;
                AndroidUtilities.setPreferredMaxRefreshRate(m2Var.f1230b, m2Var.d, m2Var.f1231c);
                m2Var.i();
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f781a) {
            case 12:
                vu vuVar = (vu) this.f782b;
                c91 c91Var = vuVar.f29428c;
                pu puVar = vuVar.f29427b;
                super.onDetachedFromWindow();
                try {
                    eg0 eg0Var = eg0.f23635p0;
                    if (eg0Var.P) {
                        if (puVar.getVisibility() != 0) {
                        }
                        if (c91Var.f() && !eg0Var.P) {
                            if (vu.S == vuVar) {
                                vu.S = null;
                            }
                            c91Var.b();
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
                    if (c91Var.f()) {
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
        k61 k61Var;
        f0 f0Var;
        MediaController.CropState cropState;
        switch (this.f781a) {
            case 7:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.h) this.f782b) == null) {
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                    this.f782b = hVar;
                    hVar.f28966k = false;
                    hVar.f28968m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.f782b).f28962f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f782b).a(AndroidUtilities.dp(4.0f), canvas, rectF, null);
                invalidate();
                return;
            case 8:
                ((org.telegram.ui.Components.ba) this.f782b).e.a(canvas);
                return;
            case 9:
                gl glVar = (gl) this.f782b;
                glVar.f24388d0.setColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f18904h5, glVar.f26460a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - glVar.B0, glVar.f24388d0);
                return;
            case 19:
                cv0 cv0Var = (cv0) this.f782b;
                Drawable drawable = cv0Var.d;
                drawable.setBounds(0, cv0Var.f23141f - cv0.n(cv0Var), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 22:
                Drawable drawable2 = ((k61) this.f782b).f25551b;
                drawable2.setBounds(0, (int) ((k61Var.h - k61.n(k61Var)) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                drawable2.draw(canvas);
                return;
            case 24:
                qg.a2 a2Var = (qg.a2) this.f782b;
                Rect rect = a2Var.E0;
                Rect rect2 = a2Var.D0;
                Paint paint = a2Var.F0;
                jv0 jv0Var = a2Var.f41288v0;
                Bitmap bitmap = a2Var.A0;
                if (a2Var.f41292z0 != null) {
                    canvas.save();
                    float e = a2Var.f41287u0.e(a2Var.f41286t0);
                    canvas.scale(1.0f - (e * 2.0f), 1.0f, jv0Var.f25440a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.y0.A(1.0f, e, 4.0f * e, 0.25f));
                    float e7 = a2Var.f41291y0.e(a2Var.f41290x0);
                    if (!a2Var.f41290x0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e7) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(f0Var.getWidth() / 2.0f, f0Var.getHeight() / 2.0f);
                            canvas.rotate(a2Var.f41289w0);
                            float max = Math.max(jv0Var.f25440a / bitmap.getWidth(), jv0Var.f25441b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (a2Var.G0 != null) {
                                canvas.rotate(-a2Var.getOrientation());
                                int contentWidth = a2Var.getContentWidth();
                                int contentHeight = a2Var.getContentHeight();
                                if (((a2Var.getOrientation() + a2Var.G0.transformRotation) / 90) % 2 == 1) {
                                    contentWidth = a2Var.getContentHeight();
                                    contentHeight = a2Var.getContentWidth();
                                }
                                MediaController.CropState cropState2 = a2Var.G0;
                                float f7 = cropState2.cropPw;
                                float f10 = cropState2.cropPh;
                                float f11 = contentWidth;
                                float f12 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f7) / 2.0f, ((-contentHeight) * f10) / 2.0f, (f7 * f11) / 2.0f, (f10 * f12) / 2.0f);
                                float f13 = a2Var.G0.cropScale;
                                canvas.scale(f13, f13);
                                MediaController.CropState cropState3 = a2Var.G0;
                                canvas.translate(cropState3.cropPx * f11, cropState3.cropPy * f12);
                                canvas.rotate(a2Var.G0.cropRotate + cropState.transformRotation);
                                if (a2Var.G0.mirrored) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(a2Var.getOrientation());
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
                qg.q2 q2Var = (qg.q2) this.f782b;
                ImageReceiver imageReceiver = q2Var.f41592x0;
                jv0 jv0Var2 = q2Var.f41590v0;
                if (q2Var.f41591w0 != null) {
                    canvas.save();
                    float e10 = q2Var.f41589u0.e(q2Var.f41588t0);
                    canvas.scale(1.0f - (e10 * 2.0f), 1.0f, jv0Var2.f25440a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.y0.A(1.0f, e10, 4.0f * e10, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) jv0Var2.f25440a, (int) jv0Var2.f25441b);
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
        switch (this.f781a) {
            case 27:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                rg.p0 p0Var = (rg.p0) this.f782b;
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
        switch (this.f781a) {
            case 9:
                if (motionEvent.getY() > getMeasuredHeight() - ((gl) this.f782b).B0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 19:
                cv0 cv0Var = (cv0) this.f782b;
                if (motionEvent.getAction() == 0 && cv0Var.f23141f != 0 && motionEvent.getY() < cv0Var.f23141f) {
                    cv0Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 22:
                k61 k61Var = (k61) this.f782b;
                if (motionEvent.getAction() == 0 && k61Var.h != 0 && motionEvent.getY() < k61Var.h) {
                    k61Var.dismiss();
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
        switch (this.f781a) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                f30 f30Var = (f30) this.f782b;
                f30Var.setTranslationY((getMeasuredHeight() * 0.28f) - (f30Var.getMeasuredWidth() / 2.0f));
                f30Var.setTranslationX((getMeasuredWidth() * 0.82f) - (f30Var.getMeasuredWidth() / 2.0f));
                return;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(36.0f);
                int i17 = ((i12 - i10) - dp2) / 2;
                int i18 = ((i13 - i11) - dp2) / 2;
                ((org.telegram.ui.Components.ba) this.f782b).e.f(i17, i18, i17 + dp2, dp2 + i18);
                return;
            case 10:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f782b;
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
                int measuredHeight3 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.f21931q0.getMeasuredHeight()) - AndroidUtilities.dp(12.0f);
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.f21931q0;
                    textView.layout(measuredWidth - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.f21931q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f21931q0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.f21931q0;
                    textView2.layout(measuredWidth - (textView2.getMeasuredWidth() / 2), measuredHeight3, (chatAttachAlertPhotoLayout.f21931q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f21931q0.getMeasuredHeight() + measuredHeight3);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.f21920k0;
                shutterButton.layout(measuredWidth - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.f21920k0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f21920k0.getMeasuredWidth() / 2) + measuredWidth, (chatAttachAlertPhotoLayout.f21920k0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.f21933r0;
                imageView.layout(i14 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.f21933r0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f21933r0.getMeasuredWidth() / 2) + i14, (chatAttachAlertPhotoLayout.f21933r0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i21 = 0; i21 < 2; i21++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.S[i21];
                    imageView2.layout(dp - (imageView2.getMeasuredWidth() / 2), i15 - (chatAttachAlertPhotoLayout.S[i21].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.S[i21].getMeasuredWidth() / 2) + dp, (chatAttachAlertPhotoLayout.S[i21].getMeasuredHeight() / 2) + i15);
                }
                return;
            case 15:
                super.onLayout(z10, i10, i11, i12, i13);
                z20 z20Var = (z20) this.f782b;
                f0 f0Var = z20Var.f30455b;
                int[] iArr = z20Var.G;
                f0Var.getLocationOnScreen(iArr);
                z20Var.N = iArr[0];
                z20Var.M = iArr[1] - AndroidUtilities.dp(25.0f);
                return;
            case 17:
                super.onLayout(z10, i10, i11, i12, i13);
                am0 am0Var = (am0) this.f782b;
                f0 f0Var2 = am0Var.f22439s;
                pv0 pv0Var = am0Var.v;
                Drawable drawable = am0Var.E;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    FrameLayout frameLayout = am0Var.f22441x;
                    if (frameLayout != null) {
                        float f10 = am0Var.H;
                        float f11 = bounds.left + f10;
                        float f12 = bounds.right + f10;
                        float f13 = am0Var.I;
                        float f14 = bounds.top + f13;
                        float f15 = bounds.bottom + f13;
                        boolean z12 = false;
                        if (!am0Var.L) {
                            if (f12 - frameLayout.getMeasuredWidth() < AndroidUtilities.dp(8.0f)) {
                                am0Var.f22442y.setPivotX(AndroidUtilities.dp(6.0f));
                                am0Var.f22441x.setX(Math.min(pv0Var.getWidth() - am0Var.f22441x.getWidth(), f11 - AndroidUtilities.dp(10.0f)) - pv0Var.getX());
                                f7 = 4.0f;
                                z11 = false;
                            } else {
                                ViewGroup viewGroup = am0Var.f22442y;
                                viewGroup.setPivotX(viewGroup.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f7 = 4.0f;
                                am0Var.f22441x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f12) - am0Var.f22441x.getMeasuredWidth()) - pv0Var.getX());
                                z11 = true;
                            }
                            if (z11) {
                                x10 = ((am0Var.f22441x.getX() + am0Var.f22441x.getWidth()) - AndroidUtilities.dp(6.0f)) - f12;
                            } else {
                                x10 = (am0Var.f22441x.getX() + AndroidUtilities.dp(10.0f)) - f11;
                            }
                            am0Var.G = x10;
                        } else {
                            f7 = 4.0f;
                            z11 = false;
                        }
                        if (am0Var.F != null) {
                            i16 = AndroidUtilities.dp(21.0f);
                        } else {
                            i16 = 0;
                        }
                        float f16 = f15 + i16;
                        if (am0Var.f22441x.getMeasuredHeight() + f16 > f0Var2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            ViewGroup viewGroup2 = am0Var.f22442y;
                            viewGroup2.setPivotY(viewGroup2.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            am0Var.f22441x.setY(((f14 - AndroidUtilities.dp(f7)) - am0Var.f22441x.getMeasuredHeight()) - pv0Var.getY());
                            z12 = true;
                        } else {
                            am0Var.f22442y.setPivotY(AndroidUtilities.dp(6.0f));
                            am0Var.f22441x.setY(Math.min((f0Var2.getHeight() - am0Var.f22441x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), f16) - pv0Var.getY());
                        }
                        n70 n70Var = am0Var.f22440w;
                        n70Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = n70Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.f18427c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                        return;
                    }
                    return;
                }
                return;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                cv0.m((cv0) this.f782b);
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
        switch (this.f781a) {
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
                dl dlVar = ((gl) this.f782b).F;
                if (dlVar != null) {
                    dlVar.a();
                    return;
                }
                return;
            case 12:
                int size = View.MeasureSpec.getSize(i10);
                vu vuVar = (vu) this.f782b;
                int min = (int) Math.min(vuVar.H / (vuVar.G / size), AndroidUtilities.displaySize.y / 2);
                if (vuVar.J) {
                    i12 = 22;
                } else {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 84) + min + 1, 1073741824));
                return;
            case 13:
                jy jyVar = (jy) this.f782b;
                if (((View) jyVar.F.getParent()) != null) {
                    dp = (int) (view.getMeasuredHeight() - jyVar.F.getY());
                } else {
                    dp = AndroidUtilities.dp(120.0f);
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp - jyVar.F.f25696b1, 1073741824));
                return;
            case 14:
                kz kzVar = ((fz) this.f782b).Q;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (vl.y(8.0f, kzVar.D0.getMeasuredHeight() - kzVar.f25696b1, 3) * 1.7f), 1073741824));
                return;
            case 19:
                cv0 cv0Var = (cv0) this.f782b;
                w0 w0Var = cv0Var.f23139b;
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
                getMeasuredWidth();
                int D = org.telegram.messenger.y0.D(54.0f, LocationController.getLocationsCount(), org.telegram.messenger.y0.C(56.0f, AndroidUtilities.dp(56.0f), 1));
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
                    cv0Var.h = true;
                    w0Var.setPadding(0, i13, 0, AndroidUtilities.dp(8.0f));
                    cv0Var.h = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), 1073741824));
                return;
            case 21:
                ny0 ny0Var = (ny0) this.f782b;
                int i15 = ny0Var.f26621n;
                if (ny0Var.h == 0) {
                    dp2 = AndroidUtilities.dp(8.0f);
                } else {
                    dp2 = AndroidUtilities.dp(6.66f);
                }
                int i16 = ny0Var.f26621n;
                if (ny0Var.h == 0) {
                    dp3 = AndroidUtilities.dp(6.66f);
                } else {
                    dp3 = AndroidUtilities.dp(8.0f);
                }
                setPadding(i15, dp2, i16, dp3);
                super.onMeasure(i10, i11);
                return;
            case 28:
                rg.x0 x0Var = (rg.x0) this.f782b;
                z10 = ((org.telegram.ui.ActionBar.f3) x0Var).isPortrait;
                if (z10) {
                    x0Var.f42538s = View.MeasureSpec.getSize(i10);
                } else {
                    x0Var.f42538s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
                }
                super.onMeasure(i10, i11);
                return;
            case 29:
                super.onMeasure(i10, i11);
                rg.k1 k1Var = ((rg.j1) this.f782b).f42331c;
                org.telegram.ui.eg0 eg0Var = k1Var.f42356r0;
                if (eg0Var != null) {
                    top = eg0Var.getTop();
                    measuredHeight = k1Var.f42356r0.getMeasuredHeight();
                } else {
                    View view2 = k1Var.B0;
                    if (view2 != null) {
                        top = view2.getTop();
                        measuredHeight = k1Var.B0.getMeasuredHeight();
                    } else {
                        f7 = 0.0f;
                        k1Var.f42355q0.setTranslationY(f7 - (fVar.getMeasuredHeight() / 2.0f));
                        return;
                    }
                }
                f7 = (measuredHeight / 2.0f) + top;
                k1Var.f42355q0.setTranslationY(f7 - (fVar.getMeasuredHeight() / 2.0f));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f781a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.f782b;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i10, i11);
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                return;
            case 17:
                super.onSizeChanged(i10, i11, i12, i13);
                am0 am0Var = (am0) this.f782b;
                gh.d.c(am0Var.h, am0Var.f22439s);
                ViewGroup viewGroup = am0Var.f22442y;
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
        switch (this.f781a) {
            case 19:
                if (!((cv0) this.f782b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 20:
            case 21:
            default:
                return super.onTouchEvent(motionEvent);
            case 22:
                if (!((k61) this.f782b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 23:
                ((ni1) this.f782b).T.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f781a) {
            case 16:
                ll0 ll0Var = (ll0) this.f782b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(ll0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ll0Var.getMeasuredHeight(), 1073741824));
                    layout(0, 0, ll0Var.f25945d1.getMeasuredWidth(), ll0Var.f25945d1.getMeasuredHeight());
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
                if (!((cv0) this.f782b).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 20:
                if (!((vx0) this.f782b).f29460g0) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f781a) {
            case 2:
                ci.oc ocVar = (ci.oc) this.f782b;
                if (getTranslationY() != f7 && ocVar.f5210c1 != null) {
                    super.setTranslationY(f7);
                    ocVar.f5210c1.y();
                    return;
                }
                return;
            case 22:
                super.setTranslationY(f7);
                k61.m((k61) this.f782b);
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
        switch (this.f781a) {
            case 15:
                super.setVisibility(i10);
                ((z20) this.f782b).d.setVisibility(i10);
                return;
            case 21:
                ny0 ny0Var = (ny0) this.f782b;
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
                    if (ny0Var.e != null) {
                        for (int i11 = 0; i11 < ny0Var.e.getChildCount(); i11++) {
                            if (z11) {
                                my0 my0Var = (my0) ny0Var.e.getChildAt(i11);
                                Drawable drawable = my0Var.f26259b;
                                if (drawable instanceof org.telegram.ui.Components.o5) {
                                    ((org.telegram.ui.Components.o5) drawable).a(my0Var);
                                }
                                my0Var.f26260c = true;
                            } else {
                                my0 my0Var2 = (my0) ny0Var.e.getChildAt(i11);
                                Drawable drawable2 = my0Var2.f26259b;
                                if (drawable2 instanceof org.telegram.ui.Components.o5) {
                                    ((org.telegram.ui.Components.o5) drawable2).o(my0Var2);
                                }
                                my0Var2.f26260c = false;
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
        this.f781a = i10;
        this.f782b = obj;
    }

    public f0(qg.q2 q2Var, Context context) {
        super(context);
        this.f781a = 25;
        this.f782b = q2Var;
        setWillNotDraw(false);
    }

    public f0(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f781a = 11;
        this.f782b = new qo[2];
        int i10 = 0;
        while (true) {
            qo[] qoVarArr = (qo[]) this.f782b;
            if (i10 < qoVarArr.length) {
                qoVarArr[i10] = new qo(context, e6Var);
                addView(((qo[]) this.f782b)[i10], w7.x5.e(-1, -1, 119));
                i10++;
            } else {
                qoVarArr[0].setVisibility(0);
                ((qo[]) this.f782b)[1].setVisibility(8);
                return;
            }
        }
    }

    public f0(qg.a2 a2Var, Context context) {
        super(context);
        this.f781a = 24;
        this.f782b = a2Var;
        setWillNotDraw(false);
    }

    public f0(Context context, String str, d dVar) {
        super(context);
        this.f781a = 0;
        int dp = AndroidUtilities.dp(12.0f);
        int i10 = org.telegram.ui.ActionBar.i6.f18940j5;
        setBackground(org.telegram.ui.ActionBar.i6.b0(dp, org.telegram.ui.ActionBar.i6.l1(0.06f, dVar.G0(i10))));
        LinearLayout f7 = vl.f(context, 1);
        addView(f7, w7.x5.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        org.telegram.ui.Components.n6 n6Var = new org.telegram.ui.Components.n6(context, false, true, true);
        this.f782b = n6Var;
        n6Var.b(0.6f, 450L, qr.h);
        n6Var.setTextSize(AndroidUtilities.dp(17.0f));
        n6Var.setTextColor(dVar.G0(i10));
        n6Var.setScaleProperty(0.7f);
        n6Var.setGravity(17);
        n6Var.setTypeface(AndroidUtilities.bold());
        n6Var.setAllowCancel(true);
        f7.addView(n6Var, w7.x5.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(dVar.G0(i10));
        textView.setGravity(17);
        f7.addView(textView, w7.x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    public f0(Context context, f30 f30Var) {
        super(context);
        this.f781a = 6;
        this.f782b = f30Var;
    }
}
