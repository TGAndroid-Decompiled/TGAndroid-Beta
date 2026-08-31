package eg;

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
import k7.c6;
import mh.g5;
import mh.ja;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.c30;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.dv0;
import org.telegram.ui.Components.f91;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.py0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.ry0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.ve;
import org.telegram.ui.Components.yx0;
import org.telegram.ui.Components.z5;
import org.telegram.ui.Components.zk;
import org.telegram.ui.vh1;
public final class s2 extends FrameLayout {
    public final int f5474a;
    public Object f5475b;

    public s2(Context context, int i10) {
        super(context);
        this.f5474a = i10;
    }

    public oo a() {
        return ((oo[]) this.f5475b)[0];
    }

    public void b() {
        oo[] ooVarArr = (oo[]) this.f5475b;
        oo ooVar = ooVarArr[0];
        oo ooVar2 = ooVarArr[1];
        ooVarArr[0] = ooVar2;
        ooVarArr[1] = ooVar;
        ooVar2.f29834n = true;
        ooVar2.setVisibility(0);
        ooVarArr[0].setScaleX(0.8f);
        ooVarArr[0].setScaleY(0.8f);
        ooVarArr[0].setAlpha(0.0f);
        ooVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = ooVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        pr prVar = pr.h;
        org.telegram.ui.b.p(translationY, prVar, 320L);
        oo ooVar3 = ooVarArr[1];
        ooVar3.f29834n = false;
        ooVar3.setVisibility(0);
        ooVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(prVar).setDuration(320L).withEndAction(new fg(ooVar3, 28)).start();
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
        switch (this.f5474a) {
            case 2:
                w3 w3Var = (w3) this.f5475b;
                if (w3Var.f5539y > 0.0f && w3Var.f5536s != null) {
                    w3Var.v.reset();
                    float width = getWidth() / w3Var.f5534n.getWidth();
                    w3Var.v.postScale(width, width);
                    w3Var.f5535r.setLocalMatrix(w3Var.v);
                    w3Var.f5536s.setAlpha((int) (w3Var.f5539y * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), w3Var.f5536s);
                }
                super.dispatchDraw(canvas);
                return;
            case 23:
                jm0 jm0Var = (jm0) this.f5475b;
                if (jm0Var.f28162r > 0.0f && jm0Var.f28159e != null) {
                    jm0Var.f28160f.reset();
                    float width2 = getWidth() / jm0Var.f28158c.getWidth();
                    jm0Var.f28160f.postScale(width2, width2);
                    jm0Var.d.setLocalMatrix(jm0Var.f28160f);
                    jm0Var.f28159e.setAlpha((int) (jm0Var.f28162r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), jm0Var.f28159e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = jm0Var.B;
                if (drawable != null) {
                    drawable.setAlpha((int) (jm0Var.f28162r * 255.0f));
                    canvas.save();
                    float f16 = jm0Var.E;
                    float f17 = jm0Var.D;
                    float f18 = jm0Var.f28162r;
                    canvas.translate((f17 * f18) + f16, (0.0f * f18) + jm0Var.F);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(jm0Var.G, jm0Var.H), Math.max(jm0Var.G, jm0Var.H), 0.75f), 1.0f, jm0Var.f28162r);
                    canvas.scale(lerp, lerp, ((jm0Var.B.getBounds().width() / 2.0f) * jm0Var.G) + (-jm0Var.E) + jm0Var.B.getBounds().left, ((jm0Var.B.getBounds().height() / 2.0f) * jm0Var.H) + (-jm0Var.F) + jm0Var.B.getBounds().top);
                    qg.b bVar = jm0Var.C;
                    if (bVar != null) {
                        bVar.setAlpha((int) (jm0Var.f28162r * 255.0f));
                        jm0Var.C.draw(canvas);
                    }
                    jm0Var.B.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 27:
                ry0 ry0Var = (ry0) this.f5475b;
                py0 py0Var = ry0Var.f30900c;
                if (py0Var != null && py0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = ry0Var.Q;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x10 = ry0Var.f30900c.getEditField().getX() + ry0Var.f30900c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = ry0Var.Q;
                        ry0Var.U = x10 + emojiSpan2.lastDrawX;
                        ry0Var.R = emojiSpan2.lastDrawY;
                    } else if (ry0Var.S != null && ry0Var.T != null) {
                        ry0Var.U = ry0Var.f30900c.getEditField().getX() + ry0Var.f30900c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                if (ry0Var.f30905s && !ry0Var.v && (arrayList = ry0Var.f30906w) != null && !arrayList.isEmpty() && !ry0Var.f30907x) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                z5 z5Var = ry0Var.M;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float d = z5Var.d(f10, false);
                z5 z5Var2 = ry0Var.N;
                if (z4) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.0f;
                }
                float d10 = z5Var2.d(f11, false);
                float d11 = ry0Var.V.d(ry0Var.U, false);
                if (d <= 0.0f && d10 <= 0.0f && !z4) {
                    ry0Var.d.setVisibility(8);
                }
                ry0Var.J.rewind();
                float left = ry0Var.f30901e.getLeft();
                int left2 = ry0Var.f30901e.getLeft();
                ArrayList arrayList2 = ry0Var.f30906w;
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                float D = org.telegram.messenger.y3.D(44.0f, size, left2);
                z5 z5Var3 = ry0Var.f30898a0;
                float f19 = z5Var3.f33725c;
                if (f19 <= 0.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                float f20 = D - left;
                if (f20 > 0.0f) {
                    f19 = z5Var3.d(f20, z10);
                }
                float d12 = ry0Var.W.d((left + D) / 2.0f, z10);
                py0 py0Var2 = ry0Var.f30900c;
                if (py0Var2 != null && py0Var2.getEditField() != null) {
                    int i11 = ry0Var.h;
                    if (i11 == 0) {
                        ry0Var.d.setTranslationY(((-ry0Var.f30900c.getEditField().getHeight()) - ry0Var.f30900c.getEditField().getScrollY()) + ry0Var.R + AndroidUtilities.dp(5.0f));
                    } else if (i11 == 1) {
                        ry0Var.d.setTranslationY(((-ry0Var.getMeasuredHeight()) - ry0Var.f30900c.getEditField().getScrollY()) + ry0Var.R + AndroidUtilities.dp(20.0f) + ry0Var.d.getHeight());
                    }
                }
                float f21 = f19 / 4.0f;
                float f22 = f19 / 2.0f;
                int max = (int) Math.max((ry0Var.U - Math.max(f21, Math.min(f22, AndroidUtilities.dp(66.0f)))) - ry0Var.f30901e.getLeft(), 0.0f);
                if (ry0Var.f30901e.getPaddingLeft() != max) {
                    f12 = 1.0f;
                    ry0Var.f30901e.setPadding(max, 0, 0, 0);
                    ry0Var.f30901e.scrollBy(ry0Var.f30901e.getPaddingLeft() - max, 0);
                } else {
                    f12 = 1.0f;
                }
                ry0Var.f30901e.setTranslationX(((int) Math.max((d11 - Math.max(f21, Math.min(f22, AndroidUtilities.dp(66.0f)))) - ry0Var.f30901e.getLeft(), 0.0f)) - max);
                float translationX = ry0Var.f30901e.getTranslationX() + (d12 - f22) + ry0Var.f30901e.getPaddingLeft();
                float translationY = ry0Var.f30901e.getTranslationY() + ry0Var.f30901e.getTop() + ry0Var.f30901e.getPaddingTop();
                if (ry0Var.h == 0) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(6.66f);
                }
                float f23 = translationY + dp;
                float min = Math.min(ry0Var.f30901e.getTranslationX() + d12 + f22 + ry0Var.f30901e.getPaddingLeft(), ry0Var.getWidth() - ry0Var.d.getPaddingRight());
                float translationY2 = ry0Var.f30901e.getTranslationY() + ry0Var.f30901e.getBottom();
                if (ry0Var.h == 0) {
                    i10 = AndroidUtilities.dp(6.66f);
                } else {
                    i10 = 0;
                }
                float f24 = translationY2 - i10;
                float min2 = Math.min(AndroidUtilities.dp(9.0f), f22) * 2.0f;
                int i12 = ry0Var.h;
                if (i12 == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f25 = f24 - min2;
                    float f26 = translationX + min2;
                    rectF.set(translationX, f25, f26, f24);
                    ry0Var.J.arcTo(rectF, 90.0f, 90.0f);
                    float f27 = f23 + min2;
                    rectF.set(translationX, f23, f26, f27);
                    ry0Var.J.arcTo(rectF, -180.0f, 90.0f);
                    float f28 = min - min2;
                    rectF.set(f28, f23, min, f27);
                    ry0Var.J.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f28, f25, min, f24);
                    ry0Var.J.arcTo(rectF, 0.0f, 90.0f);
                    ry0Var.J.lineTo(AndroidUtilities.dp(8.66f) + d11, f24);
                    ry0Var.J.lineTo(d11, AndroidUtilities.dp(6.66f) + f24);
                    ry0Var.J.lineTo(d11 - AndroidUtilities.dp(8.66f), f24);
                } else if (i12 == 1) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f29 = min - min2;
                    float f30 = f23 + min2;
                    rectF2.set(f29, f23, min, f30);
                    ry0Var.J.arcTo(rectF2, -90.0f, 90.0f);
                    float f31 = f24 - min2;
                    rectF2.set(f29, f31, min, f24);
                    ry0Var.J.arcTo(rectF2, 0.0f, 90.0f);
                    float f32 = min2 + translationX;
                    rectF2.set(translationX, f31, f32, f24);
                    ry0Var.J.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, f23, f32, f30);
                    ry0Var.J.arcTo(rectF2, -180.0f, 90.0f);
                    ry0Var.J.lineTo(d11 - AndroidUtilities.dp(8.66f), f23);
                    ry0Var.J.lineTo(d11, f23 - AndroidUtilities.dp(6.66f));
                    ry0Var.J.lineTo(AndroidUtilities.dp(8.66f) + d11, f23);
                }
                ry0Var.J.close();
                if (ry0Var.L == null) {
                    Paint paint = new Paint(1);
                    ry0Var.L = paint;
                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.0f)));
                    ry0Var.L.setShadowLayer(AndroidUtilities.dp(4.33f), 0.0f, AndroidUtilities.dp(0.33333334f), 855638016);
                    ry0Var.L.setColor(k6.v0(k6.Be, ry0Var.f30899b));
                }
                if (d < f12) {
                    ry0Var.K.rewind();
                    if (ry0Var.h == 0) {
                        dp2 = AndroidUtilities.dp(6.66f) + f24;
                    } else {
                        dp2 = f23 - AndroidUtilities.dp(6.66f);
                    }
                    double d13 = d11 - translationX;
                    double d14 = dp2 - f23;
                    f13 = 255.0f;
                    double d15 = d11 - min;
                    double d16 = dp2 - f24;
                    ry0Var.K.addCircle(d11, dp2, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d14, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d14, 2.0d) + Math.pow(d15, 2.0d)), Math.max(Math.pow(d16, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d16, 2.0d) + Math.pow(d15, 2.0d))))) * d, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(ry0Var.K);
                    canvas.saveLayerAlpha(0.0f, 0.0f, ry0Var.getWidth(), ry0Var.getHeight(), (int) (d * 255.0f), 31);
                } else {
                    f13 = 255.0f;
                }
                canvas.drawPath(ry0Var.J, ry0Var.L);
                canvas.save();
                canvas.clipPath(ry0Var.J);
                super.dispatchDraw(canvas);
                float f33 = ry0Var.f30898a0.f33725c;
                float f34 = ry0Var.W.f33725c;
                float f35 = f33 / 2.0f;
                float translationX2 = ry0Var.f30901e.getTranslationX() + (f34 - f35) + ry0Var.f30901e.getPaddingLeft();
                float paddingTop = ry0Var.f30901e.getPaddingTop() + ry0Var.f30901e.getTop();
                float min3 = Math.min(ry0Var.f30901e.getTranslationX() + f34 + f35 + ry0Var.f30901e.getPaddingLeft(), ry0Var.getWidth() - ry0Var.d.getPaddingRight());
                float bottom = ry0Var.f30901e.getBottom();
                z5 z5Var4 = ry0Var.O;
                if (ry0Var.f30901e.canScrollHorizontally(-1)) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                float d17 = z5Var4.d(f14, false);
                if (d17 > 0.0f) {
                    int i13 = (int) translationX2;
                    k6.F4.setBounds(i13, (int) paddingTop, AndroidUtilities.dp(32.0f) + i13, (int) bottom);
                    k6.F4.setAlpha((int) (d17 * f13));
                    k6.F4.draw(canvas);
                }
                z5 z5Var5 = ry0Var.P;
                if (ry0Var.f30901e.canScrollHorizontally(1)) {
                    f15 = 1.0f;
                } else {
                    f15 = 0.0f;
                }
                float d18 = z5Var5.d(f15, false);
                if (d18 > 0.0f) {
                    int i14 = (int) min3;
                    k6.E4.setBounds(i14 - AndroidUtilities.dp(32.0f), (int) paddingTop, i14, (int) bottom);
                    k6.E4.setAlpha((int) (d18 * f13));
                    k6.E4.draw(canvas);
                }
                canvas.restore();
                if (ry0Var.M.f33725c < f12) {
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
        switch (this.f5474a) {
            case 24:
                ve veVar = (ve) this.f5475b;
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
        switch (this.f5474a) {
            case 2:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((w3) this.f5475b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            case 23:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((jm0) this.f5475b).onBackPressed();
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
        switch (this.f5474a) {
            case 8:
                if (((ja) this.f5475b).f14318c0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 11:
                int action = motionEvent.getAction();
                oh.j1 j1Var = oh.j1.W;
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
                boolean onTouchEvent = j1Var.f17320x.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!j1Var.f17320x.isInProgress() && ((GestureDetector) j1Var.f17321y.f22788b).onTouchEvent(motionEvent)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (action == 1 || action == 3) {
                    j1Var.B = false;
                    j1Var.C = false;
                    o1.j jVar = j1Var.M;
                    if (!jVar.f16330f) {
                        float f10 = j1Var.K;
                        jVar.f16327b = f10;
                        jVar.f16328c = true;
                        o1.k kVar = jVar.f16336u;
                        int i10 = j1Var.G;
                        float f11 = (i10 / 2.0f) + f10;
                        int i11 = AndroidUtilities.displaySize.x;
                        if (f11 >= i11 / 2.0f) {
                            dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        kVar.f16343i = dp;
                        j1Var.M.f();
                    }
                    o1.j jVar2 = j1Var.N;
                    if (!jVar2.f16330f) {
                        float f12 = j1Var.L;
                        jVar2.f16327b = f12;
                        jVar2.f16328c = true;
                        jVar2.f16336u.f16343i = k7.o.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - j1Var.H) - AndroidUtilities.dp(16.0f));
                        j1Var.N.f();
                    }
                }
                if (onTouchEvent || z4) {
                    return true;
                }
                return false;
            case 15:
                if (motionEvent.getY() > getMeasuredHeight() - ((cl) this.f5475b).f26025y0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f5474a) {
            case 15:
                canvas.save();
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                cl clVar = (cl) this.f5475b;
                boolean z4 = false;
                canvas.clipRect(0, 0, measuredWidth, measuredHeight - clVar.f26025y0);
                if (!clVar.D) {
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
        switch (this.f5474a) {
            case 11:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                oh.j1 j1Var = oh.j1.W;
                AndroidUtilities.setPreferredMaxRefreshRate(j1Var.f17312b, j1Var.d, j1Var.f17313c);
                j1Var.i();
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f5474a) {
            case 18:
                ru ruVar = (ru) this.f5475b;
                f91 f91Var = ruVar.f30856c;
                lu luVar = ruVar.f30855b;
                super.onDetachedFromWindow();
                try {
                    ng0 ng0Var = ng0.m0;
                    if (ng0Var.M) {
                        if (luVar.getVisibility() != 0) {
                        }
                        if (f91Var.f() && !ng0Var.M) {
                            if (ru.P == ruVar) {
                                ru.P = null;
                            }
                            f91Var.b();
                            return;
                        }
                        return;
                    }
                    if (luVar.getParent() != null) {
                        removeView(luVar);
                        luVar.stopLoading();
                        luVar.loadUrl("about:blank");
                        luVar.destroy();
                    }
                    if (f91Var.f()) {
                        return;
                    }
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            default:
                super.onDetachedFromWindow();
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        s2 s2Var;
        MediaController.CropState cropState;
        o61 o61Var;
        switch (this.f5474a) {
            case 0:
                t2 t2Var = (t2) this.f5475b;
                Rect rect = t2Var.B0;
                Rect rect2 = t2Var.A0;
                Paint paint = t2Var.C0;
                kv0 kv0Var = t2Var.f5487s0;
                Bitmap bitmap = t2Var.f5492x0;
                if (t2Var.f5491w0 != null) {
                    canvas.save();
                    float e6 = t2Var.f5486r0.e(t2Var.f5485q0);
                    canvas.scale(1.0f - (e6 * 2.0f), 1.0f, kv0Var.f28463a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.y3.y(1.0f, e6, 4.0f * e6, 0.25f));
                    float e10 = t2Var.f5490v0.e(t2Var.f5489u0);
                    if (!t2Var.f5489u0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e10) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(s2Var.getWidth() / 2.0f, s2Var.getHeight() / 2.0f);
                            canvas.rotate(t2Var.f5488t0);
                            float max = Math.max(kv0Var.f28463a / bitmap.getWidth(), kv0Var.f28464b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (t2Var.D0 != null) {
                                canvas.rotate(-t2Var.getOrientation());
                                int contentWidth = t2Var.getContentWidth();
                                int contentHeight = t2Var.getContentHeight();
                                if (((t2Var.getOrientation() + t2Var.D0.transformRotation) / 90) % 2 == 1) {
                                    contentWidth = t2Var.getContentHeight();
                                    contentHeight = t2Var.getContentWidth();
                                }
                                MediaController.CropState cropState2 = t2Var.D0;
                                float f10 = cropState2.cropPw;
                                float f11 = cropState2.cropPh;
                                float f12 = contentWidth;
                                float f13 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f10) / 2.0f, ((-contentHeight) * f11) / 2.0f, (f10 * f12) / 2.0f, (f11 * f13) / 2.0f);
                                float f14 = t2Var.D0.cropScale;
                                canvas.scale(f14, f14);
                                MediaController.CropState cropState3 = t2Var.D0;
                                canvas.translate(cropState3.cropPx * f12, cropState3.cropPy * f13);
                                canvas.rotate(t2Var.D0.cropRotate + cropState.transformRotation);
                                if (t2Var.D0.mirrored) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(t2Var.getOrientation());
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
                p3 p3Var = (p3) this.f5475b;
                ImageReceiver imageReceiver = p3Var.f5439u0;
                kv0 kv0Var2 = p3Var.f5437s0;
                if (p3Var.f5438t0 != null) {
                    canvas.save();
                    float e11 = p3Var.f5436r0.e(p3Var.f5435q0);
                    canvas.scale(1.0f - (e11 * 2.0f), 1.0f, kv0Var2.f28463a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.y3.y(1.0f, e11, 4.0f * e11, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) kv0Var2.f28463a, (int) kv0Var2.f28464b);
                    imageReceiver.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 13:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.h) this.f5475b) == null) {
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                    this.f5475b = hVar;
                    hVar.f32059k = false;
                    hVar.f32061m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.f5475b).f32055f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f5475b).a(AndroidUtilities.dp(4.0f), canvas, rectF, null);
                invalidate();
                return;
            case 14:
                ((v9) this.f5475b).f31857e.a(canvas);
                return;
            case 15:
                cl clVar = (cl) this.f5475b;
                clVar.f25996a0.setColor(k6.v0(k6.f21731h5, clVar.f26545a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - clVar.f26025y0, clVar.f25996a0);
                return;
            case 25:
                dv0 dv0Var = (dv0) this.f5475b;
                Drawable drawable = dv0Var.d;
                drawable.setBounds(0, dv0Var.f26327f - dv0.n(dv0Var), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 28:
                Drawable drawable2 = ((o61) this.f5475b).f29678b;
                drawable2.setBounds(0, (int) ((o61Var.h - o61.n(o61Var)) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
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
        fg.a1 a1Var;
        fg.a1 a1Var2;
        switch (this.f5474a) {
            case 3:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                fg.b1 b1Var = (fg.b1) this.f5475b;
                if (b1Var.h && (a1Var2 = b1Var.f6247e) != null) {
                    charSequence = a1Var2.getText();
                } else {
                    charSequence = null;
                }
                if (charSequence == null && (a1Var = b1Var.d) != null) {
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
        switch (this.f5474a) {
            case 15:
                if (motionEvent.getY() > getMeasuredHeight() - ((cl) this.f5475b).f26025y0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 25:
                dv0 dv0Var = (dv0) this.f5475b;
                if (motionEvent.getAction() == 0 && dv0Var.f26327f != 0 && motionEvent.getY() < dv0Var.f26327f) {
                    dv0Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 28:
                o61 o61Var = (o61) this.f5475b;
                if (motionEvent.getAction() == 0 && o61Var.h != 0 && motionEvent.getY() < o61Var.h) {
                    o61Var.dismiss();
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
        switch (this.f5474a) {
            case 9:
                super.onLayout(z4, i10, i11, i12, i13);
                ng.s sVar = (ng.s) this.f5475b;
                if (sVar.H && z4) {
                    sVar.f16215w.setTranslationY(-sVar.f16209c.getMeasuredHeight());
                    int measuredHeight3 = sVar.f16209c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.f16217y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight3;
                    sVar.f16217y.setLayoutParams(marginLayoutParams);
                    return;
                }
                return;
            case 12:
                super.onLayout(z4, i10, i11, i12, i13);
                i30 i30Var = (i30) this.f5475b;
                i30Var.setTranslationY((getMeasuredHeight() * 0.28f) - (i30Var.getMeasuredWidth() / 2.0f));
                i30Var.setTranslationX((getMeasuredWidth() * 0.82f) - (i30Var.getMeasuredWidth() / 2.0f));
                return;
            case 14:
                super.onLayout(z4, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(36.0f);
                int i17 = ((i12 - i10) - dp2) / 2;
                int i18 = ((i13 - i11) - dp2) / 2;
                ((v9) this.f5475b).f31857e.f(i17, i18, i17 + dp2, dp2 + i18);
                return;
            case 16:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f5475b;
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
                int measuredHeight4 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.f24766n0.getMeasuredHeight()) - AndroidUtilities.dp(12.0f);
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.f24766n0;
                    textView.layout(measuredWidth - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.f24766n0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f24766n0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.f24766n0;
                    textView2.layout(measuredWidth - (textView2.getMeasuredWidth() / 2), measuredHeight4, (chatAttachAlertPhotoLayout.f24766n0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f24766n0.getMeasuredHeight() + measuredHeight4);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.f24755h0;
                shutterButton.layout(measuredWidth - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.f24755h0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f24755h0.getMeasuredWidth() / 2) + measuredWidth, (chatAttachAlertPhotoLayout.f24755h0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.f24767o0;
                imageView.layout(i14 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.f24767o0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f24767o0.getMeasuredWidth() / 2) + i14, (chatAttachAlertPhotoLayout.f24767o0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i21 = 0; i21 < 2; i21++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.P[i21];
                    imageView2.layout(dp - (imageView2.getMeasuredWidth() / 2), i15 - (chatAttachAlertPhotoLayout.P[i21].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.P[i21].getMeasuredWidth() / 2) + dp, (chatAttachAlertPhotoLayout.P[i21].getMeasuredHeight() / 2) + i15);
                }
                return;
            case 21:
                super.onLayout(z4, i10, i11, i12, i13);
                c30 c30Var = (c30) this.f5475b;
                s2 s2Var = c30Var.f25772b;
                int[] iArr = c30Var.D;
                s2Var.getLocationOnScreen(iArr);
                c30Var.K = iArr[0];
                c30Var.J = iArr[1] - AndroidUtilities.dp(25.0f);
                return;
            case 23:
                super.onLayout(z4, i10, i11, i12, i13);
                jm0 jm0Var = (jm0) this.f5475b;
                s2 s2Var2 = jm0Var.f28163s;
                qv0 qv0Var = jm0Var.v;
                Drawable drawable = jm0Var.B;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    FrameLayout frameLayout = jm0Var.f28165x;
                    if (frameLayout != null) {
                        float f11 = jm0Var.E;
                        float f12 = bounds.left + f11;
                        float f13 = bounds.right + f11;
                        float f14 = jm0Var.F;
                        float f15 = bounds.top + f14;
                        float f16 = bounds.bottom + f14;
                        boolean z11 = false;
                        if (!jm0Var.I) {
                            if (f13 - frameLayout.getMeasuredWidth() < AndroidUtilities.dp(8.0f)) {
                                jm0Var.f28166y.setPivotX(AndroidUtilities.dp(6.0f));
                                jm0Var.f28165x.setX(Math.min(qv0Var.getWidth() - jm0Var.f28165x.getWidth(), f12 - AndroidUtilities.dp(10.0f)) - qv0Var.getX());
                                f10 = 4.0f;
                                z10 = false;
                            } else {
                                ViewGroup viewGroup = jm0Var.f28166y;
                                viewGroup.setPivotX(viewGroup.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f10 = 4.0f;
                                jm0Var.f28165x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f13) - jm0Var.f28165x.getMeasuredWidth()) - qv0Var.getX());
                                z10 = true;
                            }
                            if (z10) {
                                x10 = ((jm0Var.f28165x.getX() + jm0Var.f28165x.getWidth()) - AndroidUtilities.dp(6.0f)) - f13;
                            } else {
                                x10 = (jm0Var.f28165x.getX() + AndroidUtilities.dp(10.0f)) - f12;
                            }
                            jm0Var.D = x10;
                        } else {
                            f10 = 4.0f;
                            z10 = false;
                        }
                        if (jm0Var.C != null) {
                            i16 = AndroidUtilities.dp(21.0f);
                        } else {
                            i16 = 0;
                        }
                        float f17 = f16 + i16;
                        if (jm0Var.f28165x.getMeasuredHeight() + f17 > s2Var2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            ViewGroup viewGroup2 = jm0Var.f28166y;
                            viewGroup2.setPivotY(viewGroup2.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            jm0Var.f28165x.setY(((f15 - AndroidUtilities.dp(f10)) - jm0Var.f28165x.getMeasuredHeight()) - qv0Var.getY());
                            z11 = true;
                        } else {
                            jm0Var.f28166y.setPivotY(AndroidUtilities.dp(6.0f));
                            jm0Var.f28165x.setY(Math.min((s2Var2.getHeight() - jm0Var.f28165x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), f17) - qv0Var.getY());
                        }
                        q70 q70Var = jm0Var.f28164w;
                        q70Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = q70Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.f21157c = z10;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z11;
                        return;
                    }
                    return;
                }
                return;
            case 25:
                super.onLayout(z4, i10, i11, i12, i13);
                dv0.m((dv0) this.f5475b);
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
        fg.h hVar;
        int i12;
        View view;
        int dp;
        int i13;
        int dp2;
        int dp3;
        switch (this.f5474a) {
            case 4:
                fg.n1 n1Var = (fg.n1) this.f5475b;
                z4 = ((org.telegram.ui.ActionBar.h3) n1Var).isPortrait;
                if (z4) {
                    n1Var.f6417s = View.MeasureSpec.getSize(i10);
                } else {
                    n1Var.f6417s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
                }
                super.onMeasure(i10, i11);
                return;
            case 5:
                super.onMeasure(i10, i11);
                fg.d2 d2Var = ((fg.c2) this.f5475b).f6261c;
                fg.i iVar = d2Var.f6287o0;
                if (iVar != null) {
                    top = iVar.getTop();
                    measuredHeight = d2Var.f6287o0.getMeasuredHeight();
                } else {
                    View view2 = d2Var.f6297y0;
                    if (view2 != null) {
                        top = view2.getTop();
                        measuredHeight = d2Var.f6297y0.getMeasuredHeight();
                    } else {
                        f10 = 0.0f;
                        d2Var.f6286n0.setTranslationY(f10 - (hVar.getMeasuredHeight() / 2.0f));
                        return;
                    }
                }
                f10 = (measuredHeight / 2.0f) + top;
                d2Var.f6286n0.setTranslationY(f10 - (hVar.getMeasuredHeight() / 2.0f));
                return;
            case 6:
                super.onMeasure(i10, i11);
                ((lh.x1) this.f5475b).H.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
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
                zk zkVar = ((cl) this.f5475b).C;
                if (zkVar != null) {
                    zkVar.a();
                    return;
                }
                return;
            case 18:
                int size = View.MeasureSpec.getSize(i10);
                ru ruVar = (ru) this.f5475b;
                int min = (int) Math.min(ruVar.E / (ruVar.D / size), AndroidUtilities.displaySize.y / 2);
                if (ruVar.G) {
                    i12 = 22;
                } else {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 84) + min + 1, 1073741824));
                return;
            case 19:
                ly lyVar = (ly) this.f5475b;
                if (((View) lyVar.C.getParent()) != null) {
                    dp = (int) (view.getMeasuredHeight() - lyVar.C.getY());
                } else {
                    dp = AndroidUtilities.dp(120.0f);
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp - lyVar.C.Y0, 1073741824));
                return;
            case 20:
                mz mzVar = ((hz) this.f5475b).N;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (org.telegram.ui.b.x(8.0f, mzVar.A0.getMeasuredHeight() - mzVar.Y0, 3) * 1.7f), 1073741824));
                return;
            case 25:
                dv0 dv0Var = (dv0) this.f5475b;
                mh.d1 d1Var = dv0Var.f26324b;
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
                if (d1Var.getPaddingTop() != i13) {
                    dv0Var.h = true;
                    d1Var.setPadding(0, i13, 0, AndroidUtilities.dp(8.0f));
                    dv0Var.h = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), 1073741824));
                return;
            case 27:
                ry0 ry0Var = (ry0) this.f5475b;
                int i15 = ry0Var.f30903n;
                if (ry0Var.h == 0) {
                    dp2 = AndroidUtilities.dp(8.0f);
                } else {
                    dp2 = AndroidUtilities.dp(6.66f);
                }
                int i16 = ry0Var.f30903n;
                if (ry0Var.h == 0) {
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
        switch (this.f5474a) {
            case 11:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.f5475b;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i10, i11);
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                return;
            case 23:
                super.onSizeChanged(i10, i11, i12, i13);
                jm0 jm0Var = (jm0) this.f5475b;
                ug.c.c(jm0Var.h, jm0Var.f28163s);
                ViewGroup viewGroup = jm0Var.f28166y;
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
        switch (this.f5474a) {
            case 25:
                if (!((dv0) this.f5475b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 26:
            case 27:
            default:
                return super.onTouchEvent(motionEvent);
            case 28:
                if (!((o61) this.f5475b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 29:
                ((vh1) this.f5475b).Q.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f5474a) {
            case 22:
                tl0 tl0Var = (tl0) this.f5475b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(tl0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(tl0Var.getMeasuredHeight(), 1073741824));
                    layout(0, 0, tl0Var.f31360a1.getMeasuredWidth(), tl0Var.f31360a1.getMeasuredHeight());
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
                if (!((dv0) this.f5475b).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 26:
                if (!((yx0) this.f5475b).f33619d0) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void setTranslationY(float f10) {
        switch (this.f5474a) {
            case 7:
                super.setTranslationY(f10);
                g5 g5Var = (g5) this.f5475b;
                mh.q3 q3Var = g5Var.f14083a0;
                if (q3Var != null && q3Var.getVisibility() == 0) {
                    g5Var.f14083a0.invalidate();
                    return;
                }
                return;
            case 28:
                super.setTranslationY(f10);
                o61.m((o61) this.f5475b);
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
        switch (this.f5474a) {
            case 21:
                super.setVisibility(i10);
                ((c30) this.f5475b).d.setVisibility(i10);
                return;
            case 27:
                ry0 ry0Var = (ry0) this.f5475b;
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
                    if (ry0Var.f30901e != null) {
                        for (int i11 = 0; i11 < ry0Var.f30901e.getChildCount(); i11++) {
                            if (z10) {
                                qy0 qy0Var = (qy0) ry0Var.f30901e.getChildAt(i11);
                                Drawable drawable = qy0Var.f30530b;
                                if (drawable instanceof l5) {
                                    ((l5) drawable).a(qy0Var);
                                }
                                qy0Var.f30531c = true;
                            } else {
                                qy0 qy0Var2 = (qy0) ry0Var.f30901e.getChildAt(i11);
                                Drawable drawable2 = qy0Var2.f30530b;
                                if (drawable2 instanceof l5) {
                                    ((l5) drawable2).o(qy0Var2);
                                }
                                qy0Var2.f30531c = false;
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

    public s2(Object obj, Context context, int i10) {
        super(context);
        this.f5474a = i10;
        this.f5475b = obj;
    }

    public s2(p3 p3Var, Context context) {
        super(context);
        this.f5474a = 1;
        this.f5475b = p3Var;
        setWillNotDraw(false);
    }

    public s2(Context context, g6 g6Var) {
        super(context);
        this.f5474a = 17;
        this.f5475b = new oo[2];
        int i10 = 0;
        while (true) {
            oo[] ooVarArr = (oo[]) this.f5475b;
            if (i10 < ooVarArr.length) {
                ooVarArr[i10] = new oo(context, g6Var);
                addView(((oo[]) this.f5475b)[i10], c6.e(-1, -1, 119));
                i10++;
            } else {
                ooVarArr[0].setVisibility(0);
                ((oo[]) this.f5475b)[1].setVisibility(8);
                return;
            }
        }
    }

    public s2(t2 t2Var, Context context) {
        super(context);
        this.f5474a = 0;
        this.f5475b = t2Var;
        setWillNotDraw(false);
    }

    public s2(Context context, String str, oh.b bVar) {
        super(context);
        this.f5474a = 10;
        int dp = AndroidUtilities.dp(12.0f);
        int i10 = k6.f21766j5;
        setBackground(k6.b0(dp, k6.l1(0.06f, bVar.B0(i10))));
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        addView(f10, c6.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(context, false, true, true);
        this.f5475b = k6Var;
        k6Var.b(0.6f, 450L, pr.h);
        k6Var.setTextSize(AndroidUtilities.dp(17.0f));
        k6Var.setTextColor(bVar.B0(i10));
        k6Var.setScaleProperty(0.7f);
        k6Var.setGravity(17);
        k6Var.setTypeface(AndroidUtilities.bold());
        k6Var.setAllowCancel(true);
        f10.addView(k6Var, c6.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(bVar.B0(i10));
        textView.setGravity(17);
        f10.addView(textView, c6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    public s2(Context context, i30 i30Var) {
        super(context);
        this.f5474a = 12;
        this.f5475b = i30Var;
    }
}
