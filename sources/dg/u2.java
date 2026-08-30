package dg;

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
import k7.b6;
import lh.g5;
import lh.ja;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.al;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.g30;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.ju;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.jy;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.lg0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mo;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.py0;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.ve;
import org.telegram.ui.Components.xk;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.Components.z5;
import org.telegram.ui.th1;
public final class u2 extends FrameLayout {
    public final int f4810a;
    public Object f4811b;

    public u2(Context context, int i10) {
        super(context);
        this.f4810a = i10;
    }

    public mo a() {
        return ((mo[]) this.f4811b)[0];
    }

    public void b() {
        mo[] moVarArr = (mo[]) this.f4811b;
        mo moVar = moVarArr[0];
        mo moVar2 = moVarArr[1];
        moVarArr[0] = moVar2;
        moVarArr[1] = moVar;
        moVar2.f27082n = true;
        moVar2.setVisibility(0);
        moVarArr[0].setScaleX(0.8f);
        moVarArr[0].setScaleY(0.8f);
        moVarArr[0].setAlpha(0.0f);
        moVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = moVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        nr nrVar = nr.h;
        org.telegram.ui.b.p(translationY, nrVar, 320L);
        mo moVar3 = moVarArr[1];
        moVar3.f27082n = false;
        moVar3.setVisibility(0);
        moVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(nrVar).setDuration(320L).withEndAction(new fg(moVar3, 28)).start();
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        boolean z4;
        float f10;
        float f11;
        int size;
        boolean z10;
        float f12;
        int dp;
        int i10;
        float f13;
        float f14;
        float f15;
        float dp2;
        ArrayList arrayList;
        switch (this.f4810a) {
            case 2:
                y3 y3Var = (y3) this.f4811b;
                if (y3Var.f4871y > 0.0f && y3Var.f4868s != null) {
                    y3Var.v.reset();
                    float width = getWidth() / y3Var.f4866n.getWidth();
                    y3Var.v.postScale(width, width);
                    y3Var.f4867r.setLocalMatrix(y3Var.v);
                    y3Var.f4868s.setAlpha((int) (y3Var.f4871y * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), y3Var.f4868s);
                }
                super.dispatchDraw(canvas);
                return;
            case 23:
                im0 im0Var = (im0) this.f4811b;
                if (im0Var.f25751r > 0.0f && im0Var.e != null) {
                    im0Var.f25749f.reset();
                    float width2 = getWidth() / im0Var.f25748c.getWidth();
                    im0Var.f25749f.postScale(width2, width2);
                    im0Var.d.setLocalMatrix(im0Var.f25749f);
                    im0Var.e.setAlpha((int) (im0Var.f25751r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), im0Var.e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = im0Var.B;
                if (drawable != null) {
                    drawable.setAlpha((int) (im0Var.f25751r * 255.0f));
                    canvas.save();
                    float f16 = im0Var.E;
                    float f17 = im0Var.D;
                    float f18 = im0Var.f25751r;
                    canvas.translate((f17 * f18) + f16, (0.0f * f18) + im0Var.F);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(im0Var.G, im0Var.H), Math.max(im0Var.G, im0Var.H), 0.75f), 1.0f, im0Var.f25751r);
                    canvas.scale(lerp, lerp, ((im0Var.B.getBounds().width() / 2.0f) * im0Var.G) + (-im0Var.E) + im0Var.B.getBounds().left, ((im0Var.B.getBounds().height() / 2.0f) * im0Var.H) + (-im0Var.F) + im0Var.B.getBounds().top);
                    pg.b bVar = im0Var.C;
                    if (bVar != null) {
                        bVar.setAlpha((int) (im0Var.f25751r * 255.0f));
                        im0Var.C.draw(canvas);
                    }
                    im0Var.B.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 27:
                qy0 qy0Var = (qy0) this.f4811b;
                oy0 oy0Var = qy0Var.f28306c;
                if (oy0Var != null && oy0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = qy0Var.Q;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x10 = qy0Var.f28306c.getEditField().getX() + qy0Var.f28306c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = qy0Var.Q;
                        qy0Var.U = x10 + emojiSpan2.lastDrawX;
                        qy0Var.R = emojiSpan2.lastDrawY;
                    } else if (qy0Var.S != null && qy0Var.T != null) {
                        qy0Var.U = qy0Var.f28306c.getEditField().getX() + qy0Var.f28306c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                if (qy0Var.f28310s && !qy0Var.v && (arrayList = qy0Var.f28311w) != null && !arrayList.isEmpty() && !qy0Var.f28312x) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 z5Var = qy0Var.M;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float d = z5Var.d(f10, false);
                z5 z5Var2 = qy0Var.N;
                if (z4) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                float d10 = z5Var2.d(f11, false);
                float d11 = qy0Var.V.d(qy0Var.U, false);
                if (d <= 0.0f && d10 <= 0.0f && !z4) {
                    qy0Var.d.setVisibility(8);
                }
                qy0Var.J.rewind();
                float left = qy0Var.e.getLeft();
                int left2 = qy0Var.e.getLeft();
                ArrayList arrayList2 = qy0Var.f28311w;
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                float D = org.telegram.messenger.y3.D(44.0f, size, left2);
                z5 z5Var3 = qy0Var.f28304a0;
                float f19 = z5Var3.f31241c;
                if (f19 <= 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                float f20 = D - left;
                if (f20 > 0.0f) {
                    f19 = z5Var3.d(f20, z10);
                }
                float d12 = qy0Var.W.d((left + D) / 2.0f, z10);
                oy0 oy0Var2 = qy0Var.f28306c;
                if (oy0Var2 != null && oy0Var2.getEditField() != null) {
                    int i11 = qy0Var.h;
                    if (i11 == 0) {
                        qy0Var.d.setTranslationY(((-qy0Var.f28306c.getEditField().getHeight()) - qy0Var.f28306c.getEditField().getScrollY()) + qy0Var.R + AndroidUtilities.dp(5.0f));
                    } else if (i11 == 1) {
                        qy0Var.d.setTranslationY(((-qy0Var.getMeasuredHeight()) - qy0Var.f28306c.getEditField().getScrollY()) + qy0Var.R + AndroidUtilities.dp(20.0f) + qy0Var.d.getHeight());
                    }
                }
                float f21 = f19 / 4.0f;
                float f22 = f19 / 2.0f;
                int max = (int) Math.max((qy0Var.U - Math.max(f21, Math.min(f22, AndroidUtilities.dp(66.0f)))) - qy0Var.e.getLeft(), 0.0f);
                if (qy0Var.e.getPaddingLeft() != max) {
                    f12 = 1.0f;
                    qy0Var.e.setPadding(max, 0, 0, 0);
                    qy0Var.e.scrollBy(qy0Var.e.getPaddingLeft() - max, 0);
                } else {
                    f12 = 1.0f;
                }
                qy0Var.e.setTranslationX(((int) Math.max((d11 - Math.max(f21, Math.min(f22, AndroidUtilities.dp(66.0f)))) - qy0Var.e.getLeft(), 0.0f)) - max);
                float translationX = qy0Var.e.getTranslationX() + (d12 - f22) + qy0Var.e.getPaddingLeft();
                float translationY = qy0Var.e.getTranslationY() + qy0Var.e.getTop() + qy0Var.e.getPaddingTop();
                if (qy0Var.h == 0) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(6.66f);
                }
                float f23 = translationY + dp;
                float min = Math.min(qy0Var.e.getTranslationX() + d12 + f22 + qy0Var.e.getPaddingLeft(), qy0Var.getWidth() - qy0Var.d.getPaddingRight());
                float translationY2 = qy0Var.e.getTranslationY() + qy0Var.e.getBottom();
                if (qy0Var.h == 0) {
                    i10 = AndroidUtilities.dp(6.66f);
                } else {
                    i10 = 0;
                }
                float f24 = translationY2 - i10;
                float min2 = Math.min(AndroidUtilities.dp(9.0f), f22) * 2.0f;
                int i12 = qy0Var.h;
                if (i12 == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f25 = f24 - min2;
                    float f26 = translationX + min2;
                    rectF.set(translationX, f25, f26, f24);
                    qy0Var.J.arcTo(rectF, 90.0f, 90.0f);
                    float f27 = f23 + min2;
                    rectF.set(translationX, f23, f26, f27);
                    qy0Var.J.arcTo(rectF, -180.0f, 90.0f);
                    float f28 = min - min2;
                    rectF.set(f28, f23, min, f27);
                    qy0Var.J.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f28, f25, min, f24);
                    qy0Var.J.arcTo(rectF, 0.0f, 90.0f);
                    qy0Var.J.lineTo(AndroidUtilities.dp(8.66f) + d11, f24);
                    qy0Var.J.lineTo(d11, AndroidUtilities.dp(6.66f) + f24);
                    qy0Var.J.lineTo(d11 - AndroidUtilities.dp(8.66f), f24);
                } else if (i12 == 1) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f29 = min - min2;
                    float f30 = f23 + min2;
                    rectF2.set(f29, f23, min, f30);
                    qy0Var.J.arcTo(rectF2, -90.0f, 90.0f);
                    float f31 = f24 - min2;
                    rectF2.set(f29, f31, min, f24);
                    qy0Var.J.arcTo(rectF2, 0.0f, 90.0f);
                    float f32 = min2 + translationX;
                    rectF2.set(translationX, f31, f32, f24);
                    qy0Var.J.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, f23, f32, f30);
                    qy0Var.J.arcTo(rectF2, -180.0f, 90.0f);
                    qy0Var.J.lineTo(d11 - AndroidUtilities.dp(8.66f), f23);
                    qy0Var.J.lineTo(d11, f23 - AndroidUtilities.dp(6.66f));
                    qy0Var.J.lineTo(AndroidUtilities.dp(8.66f) + d11, f23);
                }
                qy0Var.J.close();
                if (qy0Var.L == null) {
                    Paint paint = new Paint(1);
                    qy0Var.L = paint;
                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.0f)));
                    qy0Var.L.setShadowLayer(AndroidUtilities.dp(4.33f), 0.0f, AndroidUtilities.dp(0.33333334f), 855638016);
                    qy0Var.L.setColor(j6.v0(j6.Be, qy0Var.f28305b));
                }
                if (d < f12) {
                    qy0Var.K.rewind();
                    if (qy0Var.h == 0) {
                        dp2 = AndroidUtilities.dp(6.66f) + f24;
                    } else {
                        dp2 = f23 - AndroidUtilities.dp(6.66f);
                    }
                    double d13 = d11 - translationX;
                    double d14 = dp2 - f23;
                    f13 = 255.0f;
                    double d15 = d11 - min;
                    double d16 = dp2 - f24;
                    qy0Var.K.addCircle(d11, dp2, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d14, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d14, 2.0d) + Math.pow(d15, 2.0d)), Math.max(Math.pow(d16, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d16, 2.0d) + Math.pow(d15, 2.0d))))) * d, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(qy0Var.K);
                    canvas.saveLayerAlpha(0.0f, 0.0f, qy0Var.getWidth(), qy0Var.getHeight(), (int) (d * 255.0f), 31);
                } else {
                    f13 = 255.0f;
                }
                canvas.drawPath(qy0Var.J, qy0Var.L);
                canvas.save();
                canvas.clipPath(qy0Var.J);
                super.dispatchDraw(canvas);
                float f33 = qy0Var.f28304a0.f31241c;
                float f34 = qy0Var.W.f31241c;
                float f35 = f33 / 2.0f;
                float translationX2 = qy0Var.e.getTranslationX() + (f34 - f35) + qy0Var.e.getPaddingLeft();
                float paddingTop = qy0Var.e.getPaddingTop() + qy0Var.e.getTop();
                float min3 = Math.min(qy0Var.e.getTranslationX() + f34 + f35 + qy0Var.e.getPaddingLeft(), qy0Var.getWidth() - qy0Var.d.getPaddingRight());
                float bottom = qy0Var.e.getBottom();
                z5 z5Var4 = qy0Var.O;
                if (qy0Var.e.canScrollHorizontally(-1)) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                float d17 = z5Var4.d(f14, false);
                if (d17 > 0.0f) {
                    int i13 = (int) translationX2;
                    j6.F4.setBounds(i13, (int) paddingTop, AndroidUtilities.dp(32.0f) + i13, (int) bottom);
                    j6.F4.setAlpha((int) (d17 * f13));
                    j6.F4.draw(canvas);
                }
                z5 z5Var5 = qy0Var.P;
                if (qy0Var.e.canScrollHorizontally(1)) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                float d18 = z5Var5.d(f15, false);
                if (d18 > 0.0f) {
                    int i14 = (int) min3;
                    j6.E4.setBounds(i14 - AndroidUtilities.dp(32.0f), (int) paddingTop, i14, (int) bottom);
                    j6.E4.setAlpha((int) (d18 * f13));
                    j6.E4.draw(canvas);
                }
                canvas.restore();
                if (qy0Var.M.f31241c < f12) {
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
        switch (this.f4810a) {
            case 24:
                ve veVar = (ve) this.f4811b;
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
        switch (this.f4810a) {
            case 2:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((y3) this.f4811b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            case 23:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((im0) this.f4811b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        int dp;
        switch (this.f4810a) {
            case 8:
                if (((ja) this.f4811b).f12687c0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 11:
                int action = motionEvent.getAction();
                nh.j1 j1Var = nh.j1.W;
                if (j1Var.D != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(j1Var.D.getX(), j1Var.D.getY());
                    boolean dispatchTouchEvent = j1Var.D.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (action == 1 || action == 3) {
                        j1Var.D = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = j1Var.f15510x.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!j1Var.f15510x.isInProgress() && ((GestureDetector) j1Var.f15511y.f21045b).onTouchEvent(motionEvent)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (action == 1 || action == 3) {
                    j1Var.B = false;
                    j1Var.C = false;
                    o1.j jVar = j1Var.M;
                    if (!jVar.f16192f) {
                        float f10 = j1Var.K;
                        jVar.f16190b = f10;
                        jVar.f16191c = true;
                        o1.k kVar = jVar.f16198u;
                        int i10 = j1Var.G;
                        float f11 = (i10 / 2.0f) + f10;
                        int i11 = AndroidUtilities.displaySize.x;
                        if (f11 >= i11 / 2.0f) {
                            dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        kVar.f16204i = dp;
                        j1Var.M.f();
                    }
                    o1.j jVar2 = j1Var.N;
                    if (!jVar2.f16192f) {
                        float f12 = j1Var.L;
                        jVar2.f16190b = f12;
                        jVar2.f16191c = true;
                        jVar2.f16198u.f16204i = k7.n.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - j1Var.H) - AndroidUtilities.dp(16.0f));
                        j1Var.N.f();
                    }
                }
                if (onTouchEvent || z4) {
                    return true;
                }
                return false;
            case 15:
                if (motionEvent.getY() > getMeasuredHeight() - ((al) this.f4811b).f23447y0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f4810a) {
            case 15:
                canvas.save();
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                al alVar = (al) this.f4811b;
                boolean z4 = false;
                canvas.clipRect(0, 0, measuredWidth, measuredHeight - alVar.f23447y0);
                if (!alVar.D) {
                    z4 = super.drawChild(canvas, view, j10);
                }
                canvas.restore();
                return z4;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.f4810a) {
            case 11:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                nh.j1 j1Var = nh.j1.W;
                AndroidUtilities.setPreferredMaxRefreshRate(j1Var.f15503b, j1Var.d, j1Var.f15504c);
                j1Var.i();
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f4810a) {
            case 18:
                pu puVar = (pu) this.f4811b;
                e91 e91Var = puVar.f27985c;
                ju juVar = puVar.f27984b;
                super.onDetachedFromWindow();
                try {
                    lg0 lg0Var = lg0.m0;
                    if (lg0Var.M) {
                        if (juVar.getVisibility() != 0) {
                        }
                        if (e91Var.f() && !lg0Var.M) {
                            if (pu.P == puVar) {
                                pu.P = null;
                            }
                            e91Var.b();
                            return;
                        }
                        return;
                    }
                    if (juVar.getParent() != null) {
                        removeView(juVar);
                        juVar.stopLoading();
                        juVar.loadUrl("about:blank");
                        juVar.destroy();
                    }
                    if (e91Var.f()) {
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
        u2 u2Var;
        MediaController.CropState cropState;
        m61 m61Var;
        switch (this.f4810a) {
            case 0:
                v2 v2Var = (v2) this.f4811b;
                Rect rect = v2Var.B0;
                Rect rect2 = v2Var.A0;
                Paint paint = v2Var.C0;
                jv0 jv0Var = v2Var.f4822s0;
                Bitmap bitmap = v2Var.f4827x0;
                if (v2Var.f4826w0 != null) {
                    canvas.save();
                    float e = v2Var.f4821r0.e(v2Var.f4820q0);
                    canvas.scale(1.0f - (e * 2.0f), 1.0f, jv0Var.f26052a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.y3.y(1.0f, e, 4.0f * e, 0.25f));
                    float e6 = v2Var.f4825v0.e(v2Var.f4824u0);
                    if (!v2Var.f4824u0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e6) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(u2Var.getWidth() / 2.0f, u2Var.getHeight() / 2.0f);
                            canvas.rotate(v2Var.f4823t0);
                            float max = Math.max(jv0Var.f26052a / bitmap.getWidth(), jv0Var.f26053b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (v2Var.D0 != null) {
                                canvas.rotate(-v2Var.getOrientation());
                                int contentWidth = v2Var.getContentWidth();
                                int contentHeight = v2Var.getContentHeight();
                                if (((v2Var.getOrientation() + v2Var.D0.transformRotation) / 90) % 2 == 1) {
                                    contentWidth = v2Var.getContentHeight();
                                    contentHeight = v2Var.getContentWidth();
                                }
                                MediaController.CropState cropState2 = v2Var.D0;
                                float f10 = cropState2.cropPw;
                                float f11 = cropState2.cropPh;
                                float f12 = contentWidth;
                                float f13 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f10) / 2.0f, ((-contentHeight) * f11) / 2.0f, (f10 * f12) / 2.0f, (f11 * f13) / 2.0f);
                                float f14 = v2Var.D0.cropScale;
                                canvas.scale(f14, f14);
                                MediaController.CropState cropState3 = v2Var.D0;
                                canvas.translate(cropState3.cropPx * f12, cropState3.cropPy * f13);
                                canvas.rotate(v2Var.D0.cropRotate + cropState.transformRotation);
                                if (v2Var.D0.mirrored) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(v2Var.getOrientation());
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
                r3 r3Var = (r3) this.f4811b;
                ImageReceiver imageReceiver = r3Var.f4777u0;
                jv0 jv0Var2 = r3Var.f4775s0;
                if (r3Var.f4776t0 != null) {
                    canvas.save();
                    float e10 = r3Var.f4774r0.e(r3Var.f4773q0);
                    canvas.scale(1.0f - (e10 * 2.0f), 1.0f, jv0Var2.f26052a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.y3.y(1.0f, e10, 4.0f * e10, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) jv0Var2.f26052a, (int) jv0Var2.f26053b);
                    imageReceiver.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 13:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.h) this.f4811b) == null) {
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                    this.f4811b = hVar;
                    hVar.f29660k = false;
                    hVar.f29662m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.f4811b).f29656f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f4811b).a(AndroidUtilities.dp(4.0f), canvas, rectF, null);
                invalidate();
                return;
            case 14:
                ((v9) this.f4811b).e.a(canvas);
                return;
            case 15:
                al alVar = (al) this.f4811b;
                alVar.f23418a0.setColor(j6.v0(j6.f19977h5, alVar.f24277a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - alVar.f23447y0, alVar.f23418a0);
                return;
            case 25:
                cv0 cv0Var = (cv0) this.f4811b;
                Drawable drawable = cv0Var.d;
                drawable.setBounds(0, cv0Var.f24064f - cv0.n(cv0Var), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 28:
                Drawable drawable2 = ((m61) this.f4811b).f26952b;
                drawable2.setBounds(0, (int) ((m61Var.h - m61.n(m61Var)) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                drawable2.draw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        CharSequence charSequence;
        eg.a1 a1Var;
        eg.a1 a1Var2;
        switch (this.f4810a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                eg.c1 c1Var = (eg.c1) this.f4811b;
                if (c1Var.h && (a1Var2 = c1Var.e) != null) {
                    charSequence = a1Var2.getText();
                } else {
                    charSequence = null;
                }
                if (charSequence == null && (a1Var = c1Var.d) != null) {
                    charSequence = a1Var.getText();
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
        switch (this.f4810a) {
            case 15:
                if (motionEvent.getY() > getMeasuredHeight() - ((al) this.f4811b).f23447y0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 25:
                cv0 cv0Var = (cv0) this.f4811b;
                if (motionEvent.getAction() == 0 && cv0Var.f24064f != 0 && motionEvent.getY() < cv0Var.f24064f) {
                    cv0Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 28:
                m61 m61Var = (m61) this.f4811b;
                if (motionEvent.getAction() == 0 && m61Var.h != 0 && motionEvent.getY() < m61Var.h) {
                    m61Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        int measuredWidth;
        int measuredHeight;
        int dp;
        int measuredHeight2;
        int i14;
        int i15;
        float f10;
        boolean z10;
        int i16;
        float x10;
        switch (this.f4810a) {
            case 9:
                super.onLayout(z4, i10, i11, i12, i13);
                mg.s sVar = (mg.s) this.f4811b;
                if (sVar.H && z4) {
                    sVar.f14142w.setTranslationY(-sVar.f14137c.getMeasuredHeight());
                    int measuredHeight3 = sVar.f14137c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.f14144y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight3;
                    sVar.f14144y.setLayoutParams(marginLayoutParams);
                    return;
                }
                return;
            case 12:
                super.onLayout(z4, i10, i11, i12, i13);
                g30 g30Var = (g30) this.f4811b;
                g30Var.setTranslationY((getMeasuredHeight() * 0.28f) - (g30Var.getMeasuredWidth() / 2.0f));
                g30Var.setTranslationX((getMeasuredWidth() * 0.82f) - (g30Var.getMeasuredWidth() / 2.0f));
                return;
            case 14:
                super.onLayout(z4, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(36.0f);
                int i17 = ((i12 - i10) - dp2) / 2;
                int i18 = ((i13 - i11) - dp2) / 2;
                ((v9) this.f4811b).e.f(i17, i18, i17 + dp2, dp2 + i18);
                return;
            case 16:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f4811b;
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
                int measuredHeight4 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.f22924n0.getMeasuredHeight()) - AndroidUtilities.dp(12.0f);
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.f22924n0;
                    textView.layout(measuredWidth - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.f22924n0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f22924n0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.f22924n0;
                    textView2.layout(measuredWidth - (textView2.getMeasuredWidth() / 2), measuredHeight4, (chatAttachAlertPhotoLayout.f22924n0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f22924n0.getMeasuredHeight() + measuredHeight4);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.f22913h0;
                shutterButton.layout(measuredWidth - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.f22913h0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f22913h0.getMeasuredWidth() / 2) + measuredWidth, (chatAttachAlertPhotoLayout.f22913h0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.f22925o0;
                imageView.layout(i14 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.f22925o0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f22925o0.getMeasuredWidth() / 2) + i14, (chatAttachAlertPhotoLayout.f22925o0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i21 = 0; i21 < 2; i21++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.P[i21];
                    imageView2.layout(dp - (imageView2.getMeasuredWidth() / 2), i15 - (chatAttachAlertPhotoLayout.P[i21].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.P[i21].getMeasuredWidth() / 2) + dp, (chatAttachAlertPhotoLayout.P[i21].getMeasuredHeight() / 2) + i15);
                }
                return;
            case 21:
                super.onLayout(z4, i10, i11, i12, i13);
                a30 a30Var = (a30) this.f4811b;
                u2 u2Var = a30Var.f23280b;
                int[] iArr = a30Var.D;
                u2Var.getLocationOnScreen(iArr);
                a30Var.K = iArr[0];
                a30Var.J = iArr[1] - AndroidUtilities.dp(25.0f);
                return;
            case 23:
                super.onLayout(z4, i10, i11, i12, i13);
                im0 im0Var = (im0) this.f4811b;
                u2 u2Var2 = im0Var.f25752s;
                qv0 qv0Var = im0Var.v;
                Drawable drawable = im0Var.B;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    FrameLayout frameLayout = im0Var.f25754x;
                    if (frameLayout != null) {
                        float f11 = im0Var.E;
                        float f12 = bounds.left + f11;
                        float f13 = bounds.right + f11;
                        float f14 = im0Var.F;
                        float f15 = bounds.top + f14;
                        float f16 = bounds.bottom + f14;
                        boolean z11 = false;
                        if (!im0Var.I) {
                            if (f13 - frameLayout.getMeasuredWidth() < AndroidUtilities.dp(8.0f)) {
                                im0Var.f25755y.setPivotX(AndroidUtilities.dp(6.0f));
                                im0Var.f25754x.setX(Math.min(qv0Var.getWidth() - im0Var.f25754x.getWidth(), f12 - AndroidUtilities.dp(10.0f)) - qv0Var.getX());
                                f10 = 4.0f;
                                z10 = false;
                            } else {
                                ViewGroup viewGroup = im0Var.f25755y;
                                viewGroup.setPivotX(viewGroup.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f10 = 4.0f;
                                im0Var.f25754x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f13) - im0Var.f25754x.getMeasuredWidth()) - qv0Var.getX());
                                z10 = true;
                            }
                            if (z10) {
                                x10 = ((im0Var.f25754x.getX() + im0Var.f25754x.getWidth()) - AndroidUtilities.dp(6.0f)) - f13;
                            } else {
                                x10 = (im0Var.f25754x.getX() + AndroidUtilities.dp(10.0f)) - f12;
                            }
                            im0Var.D = x10;
                        } else {
                            f10 = 4.0f;
                            z10 = false;
                        }
                        if (im0Var.C != null) {
                            i16 = AndroidUtilities.dp(21.0f);
                        } else {
                            i16 = 0;
                        }
                        float f17 = f16 + i16;
                        if (im0Var.f25754x.getMeasuredHeight() + f17 > u2Var2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            ViewGroup viewGroup2 = im0Var.f25755y;
                            viewGroup2.setPivotY(viewGroup2.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            im0Var.f25754x.setY(((f15 - AndroidUtilities.dp(f10)) - im0Var.f25754x.getMeasuredHeight()) - qv0Var.getY());
                            z11 = true;
                        } else {
                            im0Var.f25755y.setPivotY(AndroidUtilities.dp(6.0f));
                            im0Var.f25754x.setY(Math.min((u2Var2.getHeight() - im0Var.f25754x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), f17) - qv0Var.getY());
                        }
                        o70 o70Var = im0Var.f25753w;
                        o70Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = o70Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.f19495c = z10;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z11;
                        return;
                    }
                    return;
                }
                return;
            case 25:
                super.onLayout(z4, i10, i11, i12, i13);
                cv0.m((cv0) this.f4811b);
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        boolean z4;
        float f10;
        float top;
        int measuredHeight;
        eg.h hVar;
        int i12;
        View view;
        int dp;
        int i13;
        int dp2;
        int dp3;
        switch (this.f4810a) {
            case 4:
                eg.o1 o1Var = (eg.o1) this.f4811b;
                z4 = ((org.telegram.ui.ActionBar.g3) o1Var).isPortrait;
                if (z4) {
                    o1Var.f5396s = View.MeasureSpec.getSize(i10);
                } else {
                    o1Var.f5396s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
                }
                super.onMeasure(i10, i11);
                return;
            case 5:
                super.onMeasure(i10, i11);
                eg.e2 e2Var = ((eg.d2) this.f4811b).f5248c;
                eg.i iVar = e2Var.f5271o0;
                if (iVar != null) {
                    top = iVar.getTop();
                    measuredHeight = e2Var.f5271o0.getMeasuredHeight();
                } else {
                    View view2 = e2Var.f5281y0;
                    if (view2 != null) {
                        top = view2.getTop();
                        measuredHeight = e2Var.f5281y0.getMeasuredHeight();
                    } else {
                        f10 = 0.0f;
                        e2Var.f5270n0.setTranslationY(f10 - (hVar.getMeasuredHeight() / 2.0f));
                        return;
                    }
                }
                f10 = (measuredHeight / 2.0f) + top;
                e2Var.f5270n0.setTranslationY(f10 - (hVar.getMeasuredHeight() / 2.0f));
                return;
            case 6:
                super.onMeasure(i10, i11);
                ((kh.x1) this.f4811b).H.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                return;
            case 13:
                if (View.MeasureSpec.getSize(i10) > AndroidUtilities.dp(260.0f)) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(320.0f), 1073741824), i11);
                    return;
                } else {
                    super.onMeasure(i10, i11);
                    return;
                }
            case 15:
                super.onMeasure(i10, i11);
                xk xkVar = ((al) this.f4811b).C;
                if (xkVar != null) {
                    xkVar.a();
                    return;
                }
                return;
            case 18:
                int size = View.MeasureSpec.getSize(i10);
                pu puVar = (pu) this.f4811b;
                int min = (int) Math.min(puVar.E / (puVar.D / size), AndroidUtilities.displaySize.y / 2);
                if (puVar.G) {
                    i12 = 22;
                } else {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 84) + min + 1, 1073741824));
                return;
            case 19:
                jy jyVar = (jy) this.f4811b;
                if (((View) jyVar.C.getParent()) != null) {
                    dp = (int) (view.getMeasuredHeight() - jyVar.C.getY());
                } else {
                    dp = AndroidUtilities.dp(120.0f);
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp - jyVar.C.Y0, 1073741824));
                return;
            case 20:
                kz kzVar = ((fz) this.f4811b).N;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (org.telegram.ui.b.x(8.0f, kzVar.A0.getMeasuredHeight() - kzVar.Y0, 3) * 1.7f), 1073741824));
                return;
            case 25:
                cv0 cv0Var = (cv0) this.f4811b;
                lh.e1 e1Var = cv0Var.f24062b;
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
                getMeasuredWidth();
                int D = org.telegram.messenger.y3.D(54.0f, LocationController.getLocationsCount(), org.telegram.messenger.y3.C(56.0f, AndroidUtilities.dp(56.0f), 1));
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
                    cv0Var.h = true;
                    e1Var.setPadding(0, i13, 0, AndroidUtilities.dp(8.0f));
                    cv0Var.h = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), 1073741824));
                return;
            case 27:
                qy0 qy0Var = (qy0) this.f4811b;
                int i15 = qy0Var.f28308n;
                if (qy0Var.h == 0) {
                    dp2 = AndroidUtilities.dp(8.0f);
                } else {
                    dp2 = AndroidUtilities.dp(6.66f);
                }
                int i16 = qy0Var.f28308n;
                if (qy0Var.h == 0) {
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
        switch (this.f4810a) {
            case 11:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.f4811b;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i10, i11);
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                return;
            case 23:
                super.onSizeChanged(i10, i11, i12, i13);
                im0 im0Var = (im0) this.f4811b;
                tg.c.c(im0Var.h, im0Var.f25752s);
                ViewGroup viewGroup = im0Var.f25755y;
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
        switch (this.f4810a) {
            case 25:
                if (!((cv0) this.f4811b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 26:
            case 27:
            default:
                return super.onTouchEvent(motionEvent);
            case 28:
                if (!((m61) this.f4811b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 29:
                ((th1) this.f4811b).Q.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f4810a) {
            case 22:
                sl0 sl0Var = (sl0) this.f4811b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(sl0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(sl0Var.getMeasuredHeight(), 1073741824));
                    layout(0, 0, sl0Var.f28727a1.getMeasuredWidth(), sl0Var.f28727a1.getMeasuredHeight());
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 23:
            case 24:
            default:
                super.requestLayout();
                return;
            case 25:
                if (!((cv0) this.f4811b).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 26:
                if (!((xx0) this.f4811b).f30772d0) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f4810a) {
            case 7:
                super.setTranslationY(f10);
                g5 g5Var = (g5) this.f4811b;
                lh.q3 q3Var = g5Var.f12466a0;
                if (q3Var != null && q3Var.getVisibility() == 0) {
                    g5Var.f12466a0.invalidate();
                    return;
                }
                return;
            case 28:
                super.setTranslationY(f10);
                m61.m((m61) this.f4811b);
                return;
            default:
                super.setTranslationY(f10);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        boolean z4;
        boolean z10;
        switch (this.f4810a) {
            case 21:
                super.setVisibility(i10);
                ((a30) this.f4811b).d.setVisibility(i10);
                return;
            case 27:
                qy0 qy0Var = (qy0) this.f4811b;
                if (getVisibility() == i10) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                super.setVisibility(i10);
                if (!z4) {
                    if (i10 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (qy0Var.e != null) {
                        for (int i11 = 0; i11 < qy0Var.e.getChildCount(); i11++) {
                            if (z10) {
                                py0 py0Var = (py0) qy0Var.e.getChildAt(i11);
                                Drawable drawable = py0Var.f28014b;
                                if (drawable instanceof l5) {
                                    ((l5) drawable).a(py0Var);
                                }
                                py0Var.f28015c = true;
                            } else {
                                py0 py0Var2 = (py0) qy0Var.e.getChildAt(i11);
                                Drawable drawable2 = py0Var2.f28014b;
                                if (drawable2 instanceof l5) {
                                    ((l5) drawable2).o(py0Var2);
                                }
                                py0Var2.f28015c = false;
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

    public u2(Object obj, Context context, int i10) {
        super(context);
        this.f4810a = i10;
        this.f4811b = obj;
    }

    public u2(r3 r3Var, Context context) {
        super(context);
        this.f4810a = 1;
        this.f4811b = r3Var;
        setWillNotDraw(false);
    }

    public u2(Context context, f6 f6Var) {
        super(context);
        this.f4810a = 17;
        this.f4811b = new mo[2];
        int i10 = 0;
        while (true) {
            mo[] moVarArr = (mo[]) this.f4811b;
            if (i10 < moVarArr.length) {
                moVarArr[i10] = new mo(context, f6Var);
                addView(((mo[]) this.f4811b)[i10], b6.e(-1, -1, 119));
                i10++;
            } else {
                moVarArr[0].setVisibility(0);
                ((mo[]) this.f4811b)[1].setVisibility(8);
                return;
            }
        }
    }

    public u2(v2 v2Var, Context context) {
        super(context);
        this.f4810a = 0;
        this.f4811b = v2Var;
        setWillNotDraw(false);
    }

    public u2(Context context, String str, nh.b bVar) {
        super(context);
        this.f4810a = 10;
        int dp = AndroidUtilities.dp(12.0f);
        int i10 = j6.f20012j5;
        setBackground(j6.b0(dp, j6.l1(0.06f, bVar.x0(i10))));
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        addView(f10, b6.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        k6 k6Var = new k6(context, false, true, true);
        this.f4811b = k6Var;
        k6Var.b(0.6f, 450L, nr.h);
        k6Var.setTextSize(AndroidUtilities.dp(17.0f));
        k6Var.setTextColor(bVar.x0(i10));
        k6Var.setScaleProperty(0.7f);
        k6Var.setGravity(17);
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setAllowCancel(true);
        f10.addView(k6Var, b6.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(bVar.x0(i10));
        textView.setGravity(17);
        f10.addView(textView, b6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    public u2(Context context, g30 g30Var) {
        super(context);
        this.f4810a = 12;
        this.f4811b = g30Var;
    }
}
