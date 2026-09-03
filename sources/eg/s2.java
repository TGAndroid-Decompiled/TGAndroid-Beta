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
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.e91;
import org.telegram.ui.Components.fg;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.l5;
import org.telegram.ui.Components.lu;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.n61;
import org.telegram.ui.Components.ng0;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.oy0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.py0;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.ve;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.Components.z5;
import org.telegram.ui.Components.zk;
import org.telegram.ui.bi1;
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
        ooVar2.f29840n = true;
        ooVar2.setVisibility(0);
        ooVarArr[0].setScaleX(0.8f);
        ooVarArr[0].setScaleY(0.8f);
        ooVarArr[0].setAlpha(0.0f);
        ooVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = ooVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        pr prVar = pr.h;
        org.telegram.ui.b.p(translationY, prVar, 320L);
        oo ooVar3 = ooVarArr[1];
        ooVar3.f29840n = false;
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
                im0 im0Var = (im0) this.f5475b;
                if (im0Var.f27863r > 0.0f && im0Var.f27860e != null) {
                    im0Var.f27861f.reset();
                    float width2 = getWidth() / im0Var.f27859c.getWidth();
                    im0Var.f27861f.postScale(width2, width2);
                    im0Var.d.setLocalMatrix(im0Var.f27861f);
                    im0Var.f27860e.setAlpha((int) (im0Var.f27863r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), im0Var.f27860e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = im0Var.B;
                if (drawable != null) {
                    drawable.setAlpha((int) (im0Var.f27863r * 255.0f));
                    canvas.save();
                    float f16 = im0Var.E;
                    float f17 = im0Var.D;
                    float f18 = im0Var.f27863r;
                    canvas.translate((f17 * f18) + f16, (0.0f * f18) + im0Var.F);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(im0Var.G, im0Var.H), Math.max(im0Var.G, im0Var.H), 0.75f), 1.0f, im0Var.f27863r);
                    canvas.scale(lerp, lerp, ((im0Var.B.getBounds().width() / 2.0f) * im0Var.G) + (-im0Var.E) + im0Var.B.getBounds().left, ((im0Var.B.getBounds().height() / 2.0f) * im0Var.H) + (-im0Var.F) + im0Var.B.getBounds().top);
                    qg.b bVar = im0Var.C;
                    if (bVar != null) {
                        bVar.setAlpha((int) (im0Var.f27863r * 255.0f));
                        im0Var.C.draw(canvas);
                    }
                    im0Var.B.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 27:
                qy0 qy0Var = (qy0) this.f5475b;
                oy0 oy0Var = qy0Var.f30561c;
                if (oy0Var != null && oy0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = qy0Var.Q;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x10 = qy0Var.f30561c.getEditField().getX() + qy0Var.f30561c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = qy0Var.Q;
                        qy0Var.U = x10 + emojiSpan2.lastDrawX;
                        qy0Var.R = emojiSpan2.lastDrawY;
                    } else if (qy0Var.S != null && qy0Var.T != null) {
                        qy0Var.U = qy0Var.f30561c.getEditField().getX() + qy0Var.f30561c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                if (qy0Var.f30566s && !qy0Var.v && (arrayList = qy0Var.f30567w) != null && !arrayList.isEmpty() && !qy0Var.f30568x) {
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
                float left = qy0Var.f30562e.getLeft();
                int left2 = qy0Var.f30562e.getLeft();
                ArrayList arrayList2 = qy0Var.f30567w;
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                float D = org.telegram.messenger.y3.D(44.0f, size, left2);
                z5 z5Var3 = qy0Var.f30559a0;
                float f19 = z5Var3.f33763c;
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
                oy0 oy0Var2 = qy0Var.f30561c;
                if (oy0Var2 != null && oy0Var2.getEditField() != null) {
                    int i11 = qy0Var.h;
                    if (i11 == 0) {
                        qy0Var.d.setTranslationY(((-qy0Var.f30561c.getEditField().getHeight()) - qy0Var.f30561c.getEditField().getScrollY()) + qy0Var.R + AndroidUtilities.dp(5.0f));
                    } else if (i11 == 1) {
                        qy0Var.d.setTranslationY(((-qy0Var.getMeasuredHeight()) - qy0Var.f30561c.getEditField().getScrollY()) + qy0Var.R + AndroidUtilities.dp(20.0f) + qy0Var.d.getHeight());
                    }
                }
                float f21 = f19 / 4.0f;
                float f22 = f19 / 2.0f;
                int max = (int) Math.max((qy0Var.U - Math.max(f21, Math.min(f22, AndroidUtilities.dp(66.0f)))) - qy0Var.f30562e.getLeft(), 0.0f);
                if (qy0Var.f30562e.getPaddingLeft() != max) {
                    f12 = 1.0f;
                    qy0Var.f30562e.setPadding(max, 0, 0, 0);
                    qy0Var.f30562e.scrollBy(qy0Var.f30562e.getPaddingLeft() - max, 0);
                } else {
                    f12 = 1.0f;
                }
                qy0Var.f30562e.setTranslationX(((int) Math.max((d11 - Math.max(f21, Math.min(f22, AndroidUtilities.dp(66.0f)))) - qy0Var.f30562e.getLeft(), 0.0f)) - max);
                float translationX = qy0Var.f30562e.getTranslationX() + (d12 - f22) + qy0Var.f30562e.getPaddingLeft();
                float translationY = qy0Var.f30562e.getTranslationY() + qy0Var.f30562e.getTop() + qy0Var.f30562e.getPaddingTop();
                if (qy0Var.h == 0) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(6.66f);
                }
                float f23 = translationY + dp;
                float min = Math.min(qy0Var.f30562e.getTranslationX() + d12 + f22 + qy0Var.f30562e.getPaddingLeft(), qy0Var.getWidth() - qy0Var.d.getPaddingRight());
                float translationY2 = qy0Var.f30562e.getTranslationY() + qy0Var.f30562e.getBottom();
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
                    qy0Var.L.setColor(k6.v0(k6.Be, qy0Var.f30560b));
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
                float f33 = qy0Var.f30559a0.f33763c;
                float f34 = qy0Var.W.f33763c;
                float f35 = f33 / 2.0f;
                float translationX2 = qy0Var.f30562e.getTranslationX() + (f34 - f35) + qy0Var.f30562e.getPaddingLeft();
                float paddingTop = qy0Var.f30562e.getPaddingTop() + qy0Var.f30562e.getTop();
                float min3 = Math.min(qy0Var.f30562e.getTranslationX() + f34 + f35 + qy0Var.f30562e.getPaddingLeft(), qy0Var.getWidth() - qy0Var.d.getPaddingRight());
                float bottom = qy0Var.f30562e.getBottom();
                z5 z5Var4 = qy0Var.O;
                if (qy0Var.f30562e.canScrollHorizontally(-1)) {
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
                z5 z5Var5 = qy0Var.P;
                if (qy0Var.f30562e.canScrollHorizontally(1)) {
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
                if (qy0Var.M.f33763c < f12) {
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
                    ((im0) this.f5475b).onBackPressed();
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
                if (((ja) this.f5475b).f14320c0) {
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
                boolean onTouchEvent = j1Var.f17322x.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!j1Var.f17322x.isInProgress() && ((GestureDetector) j1Var.f17323y.f22790b).onTouchEvent(motionEvent)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (action == 1 || action == 3) {
                    j1Var.B = false;
                    j1Var.C = false;
                    o1.j jVar = j1Var.M;
                    if (!jVar.f16332f) {
                        float f10 = j1Var.K;
                        jVar.f16329b = f10;
                        jVar.f16330c = true;
                        o1.k kVar = jVar.f16338u;
                        int i10 = j1Var.G;
                        float f11 = (i10 / 2.0f) + f10;
                        int i11 = AndroidUtilities.displaySize.x;
                        if (f11 >= i11 / 2.0f) {
                            dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        kVar.f16345i = dp;
                        j1Var.M.f();
                    }
                    o1.j jVar2 = j1Var.N;
                    if (!jVar2.f16332f) {
                        float f12 = j1Var.L;
                        jVar2.f16329b = f12;
                        jVar2.f16330c = true;
                        jVar2.f16338u.f16345i = k7.o.a(f12, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - j1Var.H) - AndroidUtilities.dp(16.0f));
                        j1Var.N.f();
                    }
                }
                if (onTouchEvent || z4) {
                    return true;
                }
                return false;
            case 15:
                if (motionEvent.getY() > getMeasuredHeight() - ((cl) this.f5475b).f26002y0) {
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
                canvas.clipRect(0, 0, measuredWidth, measuredHeight - clVar.f26002y0);
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
                AndroidUtilities.setPreferredMaxRefreshRate(j1Var.f17314b, j1Var.d, j1Var.f17315c);
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
                e91 e91Var = ruVar.f30895c;
                lu luVar = ruVar.f30894b;
                super.onDetachedFromWindow();
                try {
                    ng0 ng0Var = ng0.m0;
                    if (ng0Var.M) {
                        if (luVar.getVisibility() != 0) {
                        }
                        if (e91Var.f() && !ng0Var.M) {
                            if (ru.P == ruVar) {
                                ru.P = null;
                            }
                            e91Var.b();
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
                    if (e91Var.f()) {
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
        n61 n61Var;
        switch (this.f5474a) {
            case 0:
                t2 t2Var = (t2) this.f5475b;
                Rect rect = t2Var.B0;
                Rect rect2 = t2Var.A0;
                Paint paint = t2Var.C0;
                jv0 jv0Var = t2Var.f5487s0;
                Bitmap bitmap = t2Var.f5492x0;
                if (t2Var.f5491w0 != null) {
                    canvas.save();
                    float e6 = t2Var.f5486r0.e(t2Var.f5485q0);
                    canvas.scale(1.0f - (e6 * 2.0f), 1.0f, jv0Var.f28201a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.y3.y(1.0f, e6, 4.0f * e6, 0.25f));
                    float e10 = t2Var.f5490v0.e(t2Var.f5489u0);
                    if (!t2Var.f5489u0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e10) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(s2Var.getWidth() / 2.0f, s2Var.getHeight() / 2.0f);
                            canvas.rotate(t2Var.f5488t0);
                            float max = Math.max(jv0Var.f28201a / bitmap.getWidth(), jv0Var.f28202b / bitmap.getHeight());
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
                jv0 jv0Var2 = p3Var.f5437s0;
                if (p3Var.f5438t0 != null) {
                    canvas.save();
                    float e11 = p3Var.f5436r0.e(p3Var.f5435q0);
                    canvas.scale(1.0f - (e11 * 2.0f), 1.0f, jv0Var2.f28201a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.y3.y(1.0f, e11, 4.0f * e11, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) jv0Var2.f28201a, (int) jv0Var2.f28202b);
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
                    hVar.f32064k = false;
                    hVar.f32066m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.f5475b).f32060f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f5475b).a(AndroidUtilities.dp(4.0f), canvas, rectF, null);
                invalidate();
                return;
            case 14:
                ((v9) this.f5475b).f31835e.a(canvas);
                return;
            case 15:
                cl clVar = (cl) this.f5475b;
                clVar.f25973a0.setColor(k6.v0(k6.f21733h5, clVar.f26589a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - clVar.f26002y0, clVar.f25973a0);
                return;
            case 25:
                cv0 cv0Var = (cv0) this.f5475b;
                Drawable drawable = cv0Var.d;
                drawable.setBounds(0, cv0Var.f26048f - cv0.n(cv0Var), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 28:
                Drawable drawable2 = ((n61) this.f5475b).f29401b;
                drawable2.setBounds(0, (int) ((n61Var.h - n61.n(n61Var)) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
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
                if (motionEvent.getY() > getMeasuredHeight() - ((cl) this.f5475b).f26002y0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 25:
                cv0 cv0Var = (cv0) this.f5475b;
                if (motionEvent.getAction() == 0 && cv0Var.f26048f != 0 && motionEvent.getY() < cv0Var.f26048f) {
                    cv0Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 28:
                n61 n61Var = (n61) this.f5475b;
                if (motionEvent.getAction() == 0 && n61Var.h != 0 && motionEvent.getY() < n61Var.h) {
                    n61Var.dismiss();
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
                    sVar.f16217w.setTranslationY(-sVar.f16211c.getMeasuredHeight());
                    int measuredHeight3 = sVar.f16211c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.f16219y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight3;
                    sVar.f16219y.setLayoutParams(marginLayoutParams);
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
                ((v9) this.f5475b).f31835e.f(i17, i18, i17 + dp2, dp2 + i18);
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
                int measuredHeight4 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.f24768n0.getMeasuredHeight()) - AndroidUtilities.dp(12.0f);
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.f24768n0;
                    textView.layout(measuredWidth - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.f24768n0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f24768n0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.f24768n0;
                    textView2.layout(measuredWidth - (textView2.getMeasuredWidth() / 2), measuredHeight4, (chatAttachAlertPhotoLayout.f24768n0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f24768n0.getMeasuredHeight() + measuredHeight4);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.f24757h0;
                shutterButton.layout(measuredWidth - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.f24757h0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f24757h0.getMeasuredWidth() / 2) + measuredWidth, (chatAttachAlertPhotoLayout.f24757h0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.f24769o0;
                imageView.layout(i14 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.f24769o0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f24769o0.getMeasuredWidth() / 2) + i14, (chatAttachAlertPhotoLayout.f24769o0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i21 = 0; i21 < 2; i21++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.P[i21];
                    imageView2.layout(dp - (imageView2.getMeasuredWidth() / 2), i15 - (chatAttachAlertPhotoLayout.P[i21].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.P[i21].getMeasuredWidth() / 2) + dp, (chatAttachAlertPhotoLayout.P[i21].getMeasuredHeight() / 2) + i15);
                }
                return;
            case 21:
                super.onLayout(z4, i10, i11, i12, i13);
                c30 c30Var = (c30) this.f5475b;
                s2 s2Var = c30Var.f25750b;
                int[] iArr = c30Var.D;
                s2Var.getLocationOnScreen(iArr);
                c30Var.K = iArr[0];
                c30Var.J = iArr[1] - AndroidUtilities.dp(25.0f);
                return;
            case 23:
                super.onLayout(z4, i10, i11, i12, i13);
                im0 im0Var = (im0) this.f5475b;
                s2 s2Var2 = im0Var.f27864s;
                pv0 pv0Var = im0Var.v;
                Drawable drawable = im0Var.B;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    FrameLayout frameLayout = im0Var.f27866x;
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
                                im0Var.f27867y.setPivotX(AndroidUtilities.dp(6.0f));
                                im0Var.f27866x.setX(Math.min(pv0Var.getWidth() - im0Var.f27866x.getWidth(), f12 - AndroidUtilities.dp(10.0f)) - pv0Var.getX());
                                f10 = 4.0f;
                                z10 = false;
                            } else {
                                ViewGroup viewGroup = im0Var.f27867y;
                                viewGroup.setPivotX(viewGroup.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f10 = 4.0f;
                                im0Var.f27866x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f13) - im0Var.f27866x.getMeasuredWidth()) - pv0Var.getX());
                                z10 = true;
                            }
                            if (z10) {
                                x10 = ((im0Var.f27866x.getX() + im0Var.f27866x.getWidth()) - AndroidUtilities.dp(6.0f)) - f13;
                            } else {
                                x10 = (im0Var.f27866x.getX() + AndroidUtilities.dp(10.0f)) - f12;
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
                        if (im0Var.f27866x.getMeasuredHeight() + f17 > s2Var2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            ViewGroup viewGroup2 = im0Var.f27867y;
                            viewGroup2.setPivotY(viewGroup2.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            im0Var.f27866x.setY(((f15 - AndroidUtilities.dp(f10)) - im0Var.f27866x.getMeasuredHeight()) - pv0Var.getY());
                            z11 = true;
                        } else {
                            im0Var.f27867y.setPivotY(AndroidUtilities.dp(6.0f));
                            im0Var.f27866x.setY(Math.min((s2Var2.getHeight() - im0Var.f27866x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), f17) - pv0Var.getY());
                        }
                        q70 q70Var = im0Var.f27865w;
                        q70Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = q70Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.f21159c = z10;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z11;
                        return;
                    }
                    return;
                }
                return;
            case 25:
                super.onLayout(z4, i10, i11, i12, i13);
                cv0.m((cv0) this.f5475b);
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
                cv0 cv0Var = (cv0) this.f5475b;
                mh.d1 d1Var = cv0Var.f26045b;
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
                    cv0Var.h = true;
                    d1Var.setPadding(0, i13, 0, AndroidUtilities.dp(8.0f));
                    cv0Var.h = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), 1073741824));
                return;
            case 27:
                qy0 qy0Var = (qy0) this.f5475b;
                int i15 = qy0Var.f30564n;
                if (qy0Var.h == 0) {
                    dp2 = AndroidUtilities.dp(8.0f);
                } else {
                    dp2 = AndroidUtilities.dp(6.66f);
                }
                int i16 = qy0Var.f30564n;
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
                im0 im0Var = (im0) this.f5475b;
                ug.c.c(im0Var.h, im0Var.f27864s);
                ViewGroup viewGroup = im0Var.f27867y;
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
                if (!((cv0) this.f5475b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 26:
            case 27:
            default:
                return super.onTouchEvent(motionEvent);
            case 28:
                if (!((n61) this.f5475b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 29:
                ((bi1) this.f5475b).Q.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f5474a) {
            case 22:
                sl0 sl0Var = (sl0) this.f5475b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(sl0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(sl0Var.getMeasuredHeight(), 1073741824));
                    layout(0, 0, sl0Var.f31083a1.getMeasuredWidth(), sl0Var.f31083a1.getMeasuredHeight());
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
                if (!((cv0) this.f5475b).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 26:
                if (!((xx0) this.f5475b).f33225d0) {
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
                mh.q3 q3Var = g5Var.f14085a0;
                if (q3Var != null && q3Var.getVisibility() == 0) {
                    g5Var.f14085a0.invalidate();
                    return;
                }
                return;
            case 28:
                super.setTranslationY(f10);
                n61.m((n61) this.f5475b);
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
                qy0 qy0Var = (qy0) this.f5475b;
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
                    if (qy0Var.f30562e != null) {
                        for (int i11 = 0; i11 < qy0Var.f30562e.getChildCount(); i11++) {
                            if (z10) {
                                py0 py0Var = (py0) qy0Var.f30562e.getChildAt(i11);
                                Drawable drawable = py0Var.f30238b;
                                if (drawable instanceof l5) {
                                    ((l5) drawable).a(py0Var);
                                }
                                py0Var.f30239c = true;
                            } else {
                                py0 py0Var2 = (py0) qy0Var.f30562e.getChildAt(i11);
                                Drawable drawable2 = py0Var2.f30238b;
                                if (drawable2 instanceof l5) {
                                    ((l5) drawable2).o(py0Var2);
                                }
                                py0Var2.f30239c = false;
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
        int i10 = k6.f21768j5;
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
