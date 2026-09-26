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
import org.telegram.messenger.ok;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.b30;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.fl;
import org.telegram.ui.Components.gy0;
import org.telegram.ui.Components.h30;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.my;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.p91;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.pg0;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.so;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.vv0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.xu;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.y61;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.Components.z70;
import org.telegram.ui.fi1;
import org.telegram.ui.yf0;
public final class f0 extends FrameLayout {
    public final int f865a;
    public Object f866b;

    public f0(Context context, int i10) {
        super(context);
        this.f865a = i10;
    }

    public so a() {
        return ((so[]) this.f866b)[0];
    }

    @Override
    public void addView(View view, int i10, int i11) {
        switch (this.f865a) {
            case 5:
                super.addView(view, i10, i11);
                ((hh.g) this.f866b).e();
                return;
            default:
                super.addView(view, i10, i11);
                return;
        }
    }

    public void b() {
        so[] soVarArr = (so[]) this.f866b;
        so soVar = soVarArr[0];
        so soVar2 = soVarArr[1];
        soVarArr[0] = soVar2;
        soVarArr[1] = soVar;
        soVar2.f28327n = true;
        soVar2.setVisibility(0);
        soVarArr[0].setScaleX(0.8f);
        soVarArr[0].setScaleY(0.8f);
        soVarArr[0].setAlpha(0.0f);
        soVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = soVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        sr srVar = sr.h;
        ok.s(translationY, srVar, 320L);
        so soVar3 = soVarArr[1];
        soVar3.f28327n = false;
        soVar3.setVisibility(0);
        soVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(srVar).setDuration(320L).withEndAction(new pg(soVar3, 28)).start();
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
        switch (this.f865a) {
            case 17:
                nm0 nm0Var = (nm0) this.f866b;
                if (nm0Var.f26842r > 0.0f && nm0Var.e != null) {
                    nm0Var.f26840f.reset();
                    float width = getWidth() / nm0Var.f26839c.getWidth();
                    nm0Var.f26840f.postScale(width, width);
                    nm0Var.d.setLocalMatrix(nm0Var.f26840f);
                    nm0Var.e.setAlpha((int) (nm0Var.f26842r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), nm0Var.e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = nm0Var.E;
                if (drawable != null) {
                    drawable.setAlpha((int) (nm0Var.f26842r * 255.0f));
                    canvas.save();
                    float f15 = nm0Var.H;
                    float f16 = nm0Var.G;
                    float f17 = nm0Var.f26842r;
                    canvas.translate((f16 * f17) + f15, (0.0f * f17) + nm0Var.I);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(nm0Var.J, nm0Var.K), Math.max(nm0Var.J, nm0Var.K), 0.75f), 1.0f, nm0Var.f26842r);
                    canvas.scale(lerp, lerp, ((nm0Var.E.getBounds().width() / 2.0f) * nm0Var.J) + (-nm0Var.H) + nm0Var.E.getBounds().left, ((nm0Var.E.getBounds().height() / 2.0f) * nm0Var.K) + (-nm0Var.I) + nm0Var.E.getBounds().top);
                    ch.d dVar = nm0Var.F;
                    if (dVar != null) {
                        dVar.setAlpha((int) (nm0Var.f26842r * 255.0f));
                        nm0Var.F.draw(canvas);
                    }
                    nm0Var.E.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 21:
                yy0 yy0Var = (yy0) this.f866b;
                wy0 wy0Var = yy0Var.f30731c;
                if (wy0Var != null && wy0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = yy0Var.T;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x10 = yy0Var.f30731c.getEditField().getX() + yy0Var.f30731c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = yy0Var.T;
                        yy0Var.f30728a0 = x10 + emojiSpan2.lastDrawX;
                        yy0Var.U = emojiSpan2.lastDrawY;
                    } else if (yy0Var.V != null && yy0Var.W != null) {
                        yy0Var.f30728a0 = yy0Var.f30731c.getEditField().getX() + yy0Var.f30731c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                if (yy0Var.f30737s && !yy0Var.v && (arrayList = yy0Var.f30738w) != null && !arrayList.isEmpty() && !yy0Var.f30739x) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.e6 e6Var = yy0Var.P;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float d = e6Var.d(f7, false);
                org.telegram.ui.Components.e6 e6Var2 = yy0Var.Q;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float d10 = e6Var2.d(f10, false);
                float d11 = yy0Var.f30730b0.d(yy0Var.f30728a0, false);
                if (d <= 0.0f && d10 <= 0.0f && !z10) {
                    yy0Var.d.setVisibility(8);
                }
                yy0Var.M.rewind();
                float left = yy0Var.e.getLeft();
                int left2 = yy0Var.e.getLeft();
                ArrayList arrayList2 = yy0Var.f30738w;
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                float D = org.telegram.messenger.f0.D(44.0f, size, left2);
                org.telegram.ui.Components.e6 e6Var3 = yy0Var.f30733d0;
                float f18 = e6Var3.f23850c;
                if (f18 <= 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                float f19 = D - left;
                if (f19 > 0.0f) {
                    f18 = e6Var3.d(f19, z11);
                }
                float d12 = yy0Var.f30732c0.d((left + D) / 2.0f, z11);
                wy0 wy0Var2 = yy0Var.f30731c;
                if (wy0Var2 != null && wy0Var2.getEditField() != null) {
                    int i11 = yy0Var.h;
                    if (i11 == 0) {
                        yy0Var.d.setTranslationY(((-yy0Var.f30731c.getEditField().getHeight()) - yy0Var.f30731c.getEditField().getScrollY()) + yy0Var.U + AndroidUtilities.dp(5.0f));
                    } else if (i11 == 1) {
                        yy0Var.d.setTranslationY(((-yy0Var.getMeasuredHeight()) - yy0Var.f30731c.getEditField().getScrollY()) + yy0Var.U + AndroidUtilities.dp(20.0f) + yy0Var.d.getHeight());
                    }
                }
                float f20 = f18 / 4.0f;
                float f21 = f18 / 2.0f;
                int max = (int) Math.max((yy0Var.f30728a0 - Math.max(f20, Math.min(f21, AndroidUtilities.dp(66.0f)))) - yy0Var.e.getLeft(), 0.0f);
                if (yy0Var.e.getPaddingLeft() != max) {
                    f11 = 1.0f;
                    yy0Var.e.setPadding(max, 0, 0, 0);
                    yy0Var.e.scrollBy(yy0Var.e.getPaddingLeft() - max, 0);
                } else {
                    f11 = 1.0f;
                }
                yy0Var.e.setTranslationX(((int) Math.max((d11 - Math.max(f20, Math.min(f21, AndroidUtilities.dp(66.0f)))) - yy0Var.e.getLeft(), 0.0f)) - max);
                float translationX = yy0Var.e.getTranslationX() + (d12 - f21) + yy0Var.e.getPaddingLeft();
                float translationY = yy0Var.e.getTranslationY() + yy0Var.e.getTop() + yy0Var.e.getPaddingTop();
                if (yy0Var.h == 0) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(6.66f);
                }
                float f22 = translationY + dp;
                float min = Math.min(yy0Var.e.getTranslationX() + d12 + f21 + yy0Var.e.getPaddingLeft(), yy0Var.getWidth() - yy0Var.d.getPaddingRight());
                float translationY2 = yy0Var.e.getTranslationY() + yy0Var.e.getBottom();
                if (yy0Var.h == 0) {
                    i10 = AndroidUtilities.dp(6.66f);
                } else {
                    i10 = 0;
                }
                float f23 = translationY2 - i10;
                float min2 = Math.min(AndroidUtilities.dp(9.0f), f21) * 2.0f;
                int i12 = yy0Var.h;
                if (i12 == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f24 = f23 - min2;
                    float f25 = translationX + min2;
                    rectF.set(translationX, f24, f25, f23);
                    yy0Var.M.arcTo(rectF, 90.0f, 90.0f);
                    float f26 = f22 + min2;
                    rectF.set(translationX, f22, f25, f26);
                    yy0Var.M.arcTo(rectF, -180.0f, 90.0f);
                    float f27 = min - min2;
                    rectF.set(f27, f22, min, f26);
                    yy0Var.M.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f27, f24, min, f23);
                    yy0Var.M.arcTo(rectF, 0.0f, 90.0f);
                    yy0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, f23);
                    yy0Var.M.lineTo(d11, AndroidUtilities.dp(6.66f) + f23);
                    yy0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), f23);
                } else if (i12 == 1) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f28 = min - min2;
                    float f29 = f22 + min2;
                    rectF2.set(f28, f22, min, f29);
                    yy0Var.M.arcTo(rectF2, -90.0f, 90.0f);
                    float f30 = f23 - min2;
                    rectF2.set(f28, f30, min, f23);
                    yy0Var.M.arcTo(rectF2, 0.0f, 90.0f);
                    float f31 = min2 + translationX;
                    rectF2.set(translationX, f30, f31, f23);
                    yy0Var.M.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, f22, f31, f29);
                    yy0Var.M.arcTo(rectF2, -180.0f, 90.0f);
                    yy0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), f22);
                    yy0Var.M.lineTo(d11, f22 - AndroidUtilities.dp(6.66f));
                    yy0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, f22);
                }
                yy0Var.M.close();
                if (yy0Var.O == null) {
                    Paint paint = new Paint(1);
                    yy0Var.O = paint;
                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.0f)));
                    yy0Var.O.setShadowLayer(AndroidUtilities.dp(4.33f), 0.0f, AndroidUtilities.dp(0.33333334f), 855638016);
                    yy0Var.O.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Be, yy0Var.f30729b));
                }
                if (d < f11) {
                    yy0Var.N.rewind();
                    if (yy0Var.h == 0) {
                        dp2 = AndroidUtilities.dp(6.66f) + f23;
                    } else {
                        dp2 = f22 - AndroidUtilities.dp(6.66f);
                    }
                    double d13 = d11 - translationX;
                    double d14 = dp2 - f22;
                    f12 = 255.0f;
                    double d15 = d11 - min;
                    double d16 = dp2 - f23;
                    yy0Var.N.addCircle(d11, dp2, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d14, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d14, 2.0d) + Math.pow(d15, 2.0d)), Math.max(Math.pow(d16, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d16, 2.0d) + Math.pow(d15, 2.0d))))) * d, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(yy0Var.N);
                    canvas.saveLayerAlpha(0.0f, 0.0f, yy0Var.getWidth(), yy0Var.getHeight(), (int) (d * 255.0f), 31);
                } else {
                    f12 = 255.0f;
                }
                canvas.drawPath(yy0Var.M, yy0Var.O);
                canvas.save();
                canvas.clipPath(yy0Var.M);
                super.dispatchDraw(canvas);
                float f32 = yy0Var.f30733d0.f23850c;
                float f33 = yy0Var.f30732c0.f23850c;
                float f34 = f32 / 2.0f;
                float translationX2 = yy0Var.e.getTranslationX() + (f33 - f34) + yy0Var.e.getPaddingLeft();
                float paddingTop = yy0Var.e.getPaddingTop() + yy0Var.e.getTop();
                float min3 = Math.min(yy0Var.e.getTranslationX() + f33 + f34 + yy0Var.e.getPaddingLeft(), yy0Var.getWidth() - yy0Var.d.getPaddingRight());
                float bottom = yy0Var.e.getBottom();
                org.telegram.ui.Components.e6 e6Var4 = yy0Var.R;
                if (yy0Var.e.canScrollHorizontally(-1)) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                float d17 = e6Var4.d(f13, false);
                if (d17 > 0.0f) {
                    int i13 = (int) translationX2;
                    org.telegram.ui.ActionBar.h6.F4.setBounds(i13, (int) paddingTop, AndroidUtilities.dp(32.0f) + i13, (int) bottom);
                    org.telegram.ui.ActionBar.h6.F4.setAlpha((int) (d17 * f12));
                    org.telegram.ui.ActionBar.h6.F4.draw(canvas);
                }
                org.telegram.ui.Components.e6 e6Var5 = yy0Var.S;
                if (yy0Var.e.canScrollHorizontally(1)) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                float d18 = e6Var5.d(f14, false);
                if (d18 > 0.0f) {
                    int i14 = (int) min3;
                    org.telegram.ui.ActionBar.h6.E4.setBounds(i14 - AndroidUtilities.dp(32.0f), (int) paddingTop, i14, (int) bottom);
                    org.telegram.ui.ActionBar.h6.E4.setAlpha((int) (d18 * f12));
                    org.telegram.ui.ActionBar.h6.E4.draw(canvas);
                }
                canvas.restore();
                if (yy0Var.P.f23850c < f11) {
                    canvas.restore();
                    canvas.restore();
                    return;
                }
                return;
            case 26:
                qg.t2 t2Var = (qg.t2) this.f866b;
                if (t2Var.f41946y > 0.0f && t2Var.f41943s != null) {
                    t2Var.v.reset();
                    float width2 = getWidth() / t2Var.f41941n.getWidth();
                    t2Var.v.postScale(width2, width2);
                    t2Var.f41942r.setLocalMatrix(t2Var.v);
                    t2Var.f41943s.setAlpha((int) (t2Var.f41946y * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), t2Var.f41943s);
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
        switch (this.f865a) {
            case 18:
                ff ffVar = (ff) this.f866b;
                if (keyEvent.getKeyCode() == 4 && keyEvent.getRepeatCount() == 0 && ffVar.isShowing()) {
                    ffVar.dismiss();
                }
                return super.dispatchKeyEvent(keyEvent);
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        switch (this.f865a) {
            case 17:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((nm0) this.f866b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            case 26:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((qg.t2) this.f866b).onBackPressed();
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
        switch (this.f865a) {
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
                boolean onTouchEvent = m2Var.f1239x.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!m2Var.f1239x.isInProgress() && ((GestureDetector) m2Var.f1240y.f15116b).onTouchEvent(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (action == 1 || action == 3) {
                    m2Var.E = false;
                    m2Var.F = false;
                    o1.k kVar = m2Var.P;
                    if (!kVar.f15526f) {
                        float f7 = m2Var.N;
                        kVar.f15524b = f7;
                        kVar.f15525c = true;
                        o1.l lVar = kVar.f15533u;
                        int i10 = m2Var.J;
                        float f10 = (i10 / 2.0f) + f7;
                        int i11 = AndroidUtilities.displaySize.x;
                        if (f10 >= i11 / 2.0f) {
                            dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        lVar.f15539i = dp;
                        m2Var.P.f();
                    }
                    o1.k kVar2 = m2Var.Q;
                    if (!kVar2.f15526f) {
                        float f11 = m2Var.O;
                        kVar2.f15524b = f11;
                        kVar2.f15525c = true;
                        kVar2.f15533u.f15539i = w7.q.a(f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - m2Var.K) - AndroidUtilities.dp(16.0f));
                        m2Var.Q.f();
                    }
                }
                if (onTouchEvent || z10) {
                    return true;
                }
                return false;
            case 3:
                if (((di.i) this.f866b).f7745e0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 9:
                if (motionEvent.getY() > getMeasuredHeight() - ((il) this.f866b).B0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f865a) {
            case 9:
                canvas.save();
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                il ilVar = (il) this.f866b;
                boolean z10 = false;
                canvas.clipRect(0, 0, measuredWidth, measuredHeight - ilVar.B0);
                if (!ilVar.G) {
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
        switch (this.f865a) {
            case 1:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                m2 m2Var = m2.Z;
                AndroidUtilities.setPreferredMaxRefreshRate(m2Var.f1232b, m2Var.d, m2Var.f1233c);
                m2Var.i();
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f865a) {
            case 12:
                xu xuVar = (xu) this.f866b;
                p91 p91Var = xuVar.f30469c;
                ru ruVar = xuVar.f30468b;
                super.onDetachedFromWindow();
                try {
                    pg0 pg0Var = pg0.f27353p0;
                    if (pg0Var.P) {
                        if (ruVar.getVisibility() != 0) {
                        }
                        if (p91Var.f() && !pg0Var.P) {
                            if (xu.S == xuVar) {
                                xu.S = null;
                            }
                            p91Var.b();
                            return;
                        }
                        return;
                    }
                    if (ruVar.getParent() != null) {
                        removeView(ruVar);
                        ruVar.stopLoading();
                        ruVar.loadUrl("about:blank");
                        ruVar.destroy();
                    }
                    if (p91Var.f()) {
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
        y61 y61Var;
        f0 f0Var;
        MediaController.CropState cropState;
        switch (this.f865a) {
            case 7:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.h) this.f866b) == null) {
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                    this.f866b = hVar;
                    hVar.f29288k = false;
                    hVar.f29290m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.f866b).f29284f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f866b).a(AndroidUtilities.dp(4.0f), canvas, rectF, null);
                invalidate();
                return;
            case 8:
                ((org.telegram.ui.Components.da) this.f866b).e.a(canvas);
                return;
            case 9:
                il ilVar = (il) this.f866b;
                ilVar.f25123d0.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19129h5, ilVar.f27042a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - ilVar.B0, ilVar.f25123d0);
                return;
            case 19:
                ov0 ov0Var = (ov0) this.f866b;
                Drawable drawable = ov0Var.d;
                drawable.setBounds(0, ov0Var.f27124f - ov0.n(ov0Var), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 22:
                Drawable drawable2 = ((y61) this.f866b).f30575b;
                drawable2.setBounds(0, (int) ((y61Var.h - y61.n(y61Var)) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                drawable2.draw(canvas);
                return;
            case 24:
                qg.y1 y1Var = (qg.y1) this.f866b;
                Rect rect = y1Var.E0;
                Rect rect2 = y1Var.D0;
                Paint paint = y1Var.F0;
                vv0 vv0Var = y1Var.f42009v0;
                Bitmap bitmap = y1Var.A0;
                if (y1Var.f42013z0 != null) {
                    canvas.save();
                    float e = y1Var.f42008u0.e(y1Var.f42007t0);
                    canvas.scale(1.0f - (e * 2.0f), 1.0f, vv0Var.f29774a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.f0.z(1.0f, e, 4.0f * e, 0.25f));
                    float e7 = y1Var.f42012y0.e(y1Var.f42011x0);
                    if (!y1Var.f42011x0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e7) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(f0Var.getWidth() / 2.0f, f0Var.getHeight() / 2.0f);
                            canvas.rotate(y1Var.f42010w0);
                            float max = Math.max(vv0Var.f29774a / bitmap.getWidth(), vv0Var.f29775b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (y1Var.G0 != null) {
                                canvas.rotate(-y1Var.getOrientation());
                                int contentWidth = y1Var.getContentWidth();
                                int contentHeight = y1Var.getContentHeight();
                                if (((y1Var.getOrientation() + y1Var.G0.transformRotation) / 90) % 2 == 1) {
                                    contentWidth = y1Var.getContentHeight();
                                    contentHeight = y1Var.getContentWidth();
                                }
                                MediaController.CropState cropState2 = y1Var.G0;
                                float f7 = cropState2.cropPw;
                                float f10 = cropState2.cropPh;
                                float f11 = contentWidth;
                                float f12 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f7) / 2.0f, ((-contentHeight) * f10) / 2.0f, (f7 * f11) / 2.0f, (f10 * f12) / 2.0f);
                                float f13 = y1Var.G0.cropScale;
                                canvas.scale(f13, f13);
                                MediaController.CropState cropState3 = y1Var.G0;
                                canvas.translate(cropState3.cropPx * f11, cropState3.cropPy * f12);
                                canvas.rotate(y1Var.G0.cropRotate + cropState.transformRotation);
                                if (y1Var.G0.mirrored) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(y1Var.getOrientation());
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
                qg.o2 o2Var = (qg.o2) this.f866b;
                ImageReceiver imageReceiver = o2Var.f41851x0;
                vv0 vv0Var2 = o2Var.f41849v0;
                if (o2Var.f41850w0 != null) {
                    canvas.save();
                    float e10 = o2Var.f41848u0.e(o2Var.f41847t0);
                    canvas.scale(1.0f - (e10 * 2.0f), 1.0f, vv0Var2.f29774a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.f0.z(1.0f, e10, 4.0f * e10, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) vv0Var2.f29774a, (int) vv0Var2.f29775b);
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
        switch (this.f865a) {
            case 27:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                rg.p0 p0Var = (rg.p0) this.f866b;
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
        switch (this.f865a) {
            case 9:
                if (motionEvent.getY() > getMeasuredHeight() - ((il) this.f866b).B0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 19:
                ov0 ov0Var = (ov0) this.f866b;
                if (motionEvent.getAction() == 0 && ov0Var.f27124f != 0 && motionEvent.getY() < ov0Var.f27124f) {
                    ov0Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 22:
                y61 y61Var = (y61) this.f866b;
                if (motionEvent.getAction() == 0 && y61Var.h != 0 && motionEvent.getY() < y61Var.h) {
                    y61Var.dismiss();
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
        switch (this.f865a) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                h30 h30Var = (h30) this.f866b;
                h30Var.setTranslationY((getMeasuredHeight() * 0.28f) - (h30Var.getMeasuredWidth() / 2.0f));
                h30Var.setTranslationX((getMeasuredWidth() * 0.82f) - (h30Var.getMeasuredWidth() / 2.0f));
                return;
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(36.0f);
                int i17 = ((i12 - i10) - dp2) / 2;
                int i18 = ((i13 - i11) - dp2) / 2;
                ((org.telegram.ui.Components.da) this.f866b).e.f(i17, i18, i17 + dp2, dp2 + i18);
                return;
            case 10:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f866b;
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
                int measuredHeight3 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.f22156q0.getMeasuredHeight()) - AndroidUtilities.dp(12.0f);
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.f22156q0;
                    textView.layout(measuredWidth - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.f22156q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f22156q0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.f22156q0;
                    textView2.layout(measuredWidth - (textView2.getMeasuredWidth() / 2), measuredHeight3, (chatAttachAlertPhotoLayout.f22156q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f22156q0.getMeasuredHeight() + measuredHeight3);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.f22145k0;
                shutterButton.layout(measuredWidth - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.f22145k0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f22145k0.getMeasuredWidth() / 2) + measuredWidth, (chatAttachAlertPhotoLayout.f22145k0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.f22158r0;
                imageView.layout(i14 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.f22158r0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f22158r0.getMeasuredWidth() / 2) + i14, (chatAttachAlertPhotoLayout.f22158r0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i21 = 0; i21 < 2; i21++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.S[i21];
                    imageView2.layout(dp - (imageView2.getMeasuredWidth() / 2), i15 - (chatAttachAlertPhotoLayout.S[i21].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.S[i21].getMeasuredWidth() / 2) + dp, (chatAttachAlertPhotoLayout.S[i21].getMeasuredHeight() / 2) + i15);
                }
                return;
            case 15:
                super.onLayout(z10, i10, i11, i12, i13);
                b30 b30Var = (b30) this.f866b;
                f0 f0Var = b30Var.f22878b;
                int[] iArr = b30Var.G;
                f0Var.getLocationOnScreen(iArr);
                b30Var.N = iArr[0];
                b30Var.M = iArr[1] - AndroidUtilities.dp(25.0f);
                return;
            case 17:
                super.onLayout(z10, i10, i11, i12, i13);
                nm0 nm0Var = (nm0) this.f866b;
                f0 f0Var2 = nm0Var.f26843s;
                bw0 bw0Var = nm0Var.v;
                Drawable drawable = nm0Var.E;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    FrameLayout frameLayout = nm0Var.f26845x;
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
                                nm0Var.f26846y.setPivotX(AndroidUtilities.dp(6.0f));
                                nm0Var.f26845x.setX(Math.min(bw0Var.getWidth() - nm0Var.f26845x.getWidth(), f11 - AndroidUtilities.dp(10.0f)) - bw0Var.getX());
                                f7 = 4.0f;
                                z11 = false;
                            } else {
                                ViewGroup viewGroup = nm0Var.f26846y;
                                viewGroup.setPivotX(viewGroup.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f7 = 4.0f;
                                nm0Var.f26845x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f12) - nm0Var.f26845x.getMeasuredWidth()) - bw0Var.getX());
                                z11 = true;
                            }
                            if (z11) {
                                x10 = ((nm0Var.f26845x.getX() + nm0Var.f26845x.getWidth()) - AndroidUtilities.dp(6.0f)) - f12;
                            } else {
                                x10 = (nm0Var.f26845x.getX() + AndroidUtilities.dp(10.0f)) - f11;
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
                        if (nm0Var.f26845x.getMeasuredHeight() + f16 > f0Var2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            ViewGroup viewGroup2 = nm0Var.f26846y;
                            viewGroup2.setPivotY(viewGroup2.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            nm0Var.f26845x.setY(((f14 - AndroidUtilities.dp(f7)) - nm0Var.f26845x.getMeasuredHeight()) - bw0Var.getY());
                            z12 = true;
                        } else {
                            nm0Var.f26846y.setPivotY(AndroidUtilities.dp(6.0f));
                            nm0Var.f26845x.setY(Math.min((f0Var2.getHeight() - nm0Var.f26845x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), f16) - bw0Var.getY());
                        }
                        z70 z70Var = nm0Var.f26844w;
                        z70Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = z70Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.f18653c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                        return;
                    }
                    return;
                }
                return;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                ov0.m((ov0) this.f866b);
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
        switch (this.f865a) {
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
                fl flVar = ((il) this.f866b).F;
                if (flVar != null) {
                    flVar.a();
                    return;
                }
                return;
            case 12:
                int size = View.MeasureSpec.getSize(i10);
                xu xuVar = (xu) this.f866b;
                int min = (int) Math.min(xuVar.H / (xuVar.G / size), AndroidUtilities.displaySize.y / 2);
                if (xuVar.J) {
                    i12 = 22;
                } else {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 84) + min + 1, 1073741824));
                return;
            case 13:
                my myVar = (my) this.f866b;
                if (((View) myVar.F.getParent()) != null) {
                    dp = (int) (view.getMeasuredHeight() - myVar.F.getY());
                } else {
                    dp = AndroidUtilities.dp(120.0f);
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp - myVar.F.f26544b1, 1073741824));
                return;
            case 14:
                mz mzVar = ((hz) this.f866b).Q;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (ok.A(8.0f, mzVar.D0.getMeasuredHeight() - mzVar.f26544b1, 3) * 1.7f), 1073741824));
                return;
            case 19:
                ov0 ov0Var = (ov0) this.f866b;
                w0 w0Var = ov0Var.f27122b;
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
                getMeasuredWidth();
                int D = org.telegram.messenger.f0.D(54.0f, LocationController.getLocationsCount(), org.telegram.messenger.f0.C(56.0f, AndroidUtilities.dp(56.0f), 1));
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
                    ov0Var.h = true;
                    w0Var.setPadding(0, i13, 0, AndroidUtilities.dp(8.0f));
                    ov0Var.h = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), 1073741824));
                return;
            case 21:
                yy0 yy0Var = (yy0) this.f866b;
                int i15 = yy0Var.f30735n;
                if (yy0Var.h == 0) {
                    dp2 = AndroidUtilities.dp(8.0f);
                } else {
                    dp2 = AndroidUtilities.dp(6.66f);
                }
                int i16 = yy0Var.f30735n;
                if (yy0Var.h == 0) {
                    dp3 = AndroidUtilities.dp(6.66f);
                } else {
                    dp3 = AndroidUtilities.dp(8.0f);
                }
                setPadding(i15, dp2, i16, dp3);
                super.onMeasure(i10, i11);
                return;
            case 28:
                rg.x0 x0Var = (rg.x0) this.f866b;
                z10 = ((org.telegram.ui.ActionBar.e3) x0Var).isPortrait;
                if (z10) {
                    x0Var.f42825s = View.MeasureSpec.getSize(i10);
                } else {
                    x0Var.f42825s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
                }
                super.onMeasure(i10, i11);
                return;
            case 29:
                super.onMeasure(i10, i11);
                rg.k1 k1Var = ((rg.j1) this.f866b).f42618c;
                yf0 yf0Var = k1Var.f42643r0;
                if (yf0Var != null) {
                    top = yf0Var.getTop();
                    measuredHeight = k1Var.f42643r0.getMeasuredHeight();
                } else {
                    View view2 = k1Var.B0;
                    if (view2 != null) {
                        top = view2.getTop();
                        measuredHeight = k1Var.B0.getMeasuredHeight();
                    } else {
                        f7 = 0.0f;
                        k1Var.f42642q0.setTranslationY(f7 - (fVar.getMeasuredHeight() / 2.0f));
                        return;
                    }
                }
                f7 = (measuredHeight / 2.0f) + top;
                k1Var.f42642q0.setTranslationY(f7 - (fVar.getMeasuredHeight() / 2.0f));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f865a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.f866b;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i10, i11);
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                return;
            case 17:
                super.onSizeChanged(i10, i11, i12, i13);
                nm0 nm0Var = (nm0) this.f866b;
                gh.d.c(nm0Var.h, nm0Var.f26843s);
                ViewGroup viewGroup = nm0Var.f26846y;
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
        switch (this.f865a) {
            case 19:
                if (!((ov0) this.f866b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 20:
            case 21:
            default:
                return super.onTouchEvent(motionEvent);
            case 22:
                if (!((y61) this.f866b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 23:
                ((fi1) this.f866b).T.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f865a) {
            case 16:
                xl0 xl0Var = (xl0) this.f866b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(xl0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(xl0Var.getMeasuredHeight(), 1073741824));
                    layout(0, 0, xl0Var.f30375d1.getMeasuredWidth(), xl0Var.f30375d1.getMeasuredHeight());
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
                if (!((ov0) this.f866b).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 20:
                if (!((gy0) this.f866b).f24607g0) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f865a) {
            case 2:
                ci.lc lcVar = (ci.lc) this.f866b;
                if (getTranslationY() != f7 && lcVar.f5035c1 != null) {
                    super.setTranslationY(f7);
                    lcVar.f5035c1.y();
                    return;
                }
                return;
            case 22:
                super.setTranslationY(f7);
                y61.m((y61) this.f866b);
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
        switch (this.f865a) {
            case 15:
                super.setVisibility(i10);
                ((b30) this.f866b).d.setVisibility(i10);
                return;
            case 21:
                yy0 yy0Var = (yy0) this.f866b;
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
                    if (yy0Var.e != null) {
                        for (int i11 = 0; i11 < yy0Var.e.getChildCount(); i11++) {
                            if (z11) {
                                xy0 xy0Var = (xy0) yy0Var.e.getChildAt(i11);
                                Drawable drawable = xy0Var.f30489b;
                                if (drawable instanceof org.telegram.ui.Components.q5) {
                                    ((org.telegram.ui.Components.q5) drawable).a(xy0Var);
                                }
                                xy0Var.f30490c = true;
                            } else {
                                xy0 xy0Var2 = (xy0) yy0Var.e.getChildAt(i11);
                                Drawable drawable2 = xy0Var2.f30489b;
                                if (drawable2 instanceof org.telegram.ui.Components.q5) {
                                    ((org.telegram.ui.Components.q5) drawable2).o(xy0Var2);
                                }
                                xy0Var2.f30490c = false;
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
        this.f865a = i10;
        this.f866b = obj;
    }

    public f0(qg.o2 o2Var, Context context) {
        super(context);
        this.f865a = 25;
        this.f866b = o2Var;
        setWillNotDraw(false);
    }

    public f0(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f865a = 11;
        this.f866b = new so[2];
        int i10 = 0;
        while (true) {
            so[] soVarArr = (so[]) this.f866b;
            if (i10 < soVarArr.length) {
                soVarArr[i10] = new so(context, d6Var);
                addView(((so[]) this.f866b)[i10], w7.y5.e(-1, -1, 119));
                i10++;
            } else {
                soVarArr[0].setVisibility(0);
                ((so[]) this.f866b)[1].setVisibility(8);
                return;
            }
        }
    }

    public f0(qg.y1 y1Var, Context context) {
        super(context);
        this.f865a = 24;
        this.f866b = y1Var;
        setWillNotDraw(false);
    }

    public f0(Context context, String str, d dVar) {
        super(context);
        this.f865a = 0;
        int dp = AndroidUtilities.dp(12.0f);
        int i10 = org.telegram.ui.ActionBar.h6.f19165j5;
        setBackground(org.telegram.ui.ActionBar.h6.b0(dp, org.telegram.ui.ActionBar.h6.l1(0.06f, dVar.G0(i10))));
        LinearLayout f7 = ok.f(context, 1);
        addView(f7, w7.y5.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, false, true, true);
        this.f866b = p6Var;
        p6Var.b(0.6f, 450L, sr.h);
        p6Var.setTextSize(AndroidUtilities.dp(17.0f));
        p6Var.setTextColor(dVar.G0(i10));
        p6Var.setScaleProperty(0.7f);
        p6Var.setGravity(17);
        p6Var.setTypeface(AndroidUtilities.bold());
        p6Var.setAllowCancel(true);
        f7.addView(p6Var, w7.y5.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(dVar.G0(i10));
        textView.setGravity(17);
        f7.addView(textView, w7.y5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    public f0(Context context, h30 h30Var) {
        super(context);
        this.f865a = 6;
        this.f866b = h30Var;
    }
}
