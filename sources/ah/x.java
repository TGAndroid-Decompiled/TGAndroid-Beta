package ah;

import ai.l5;
import ai.l7;
import ai.md;
import ai.u1;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ei.vb;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.ok;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.ap;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.ef;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.hz0;
import org.telegram.ui.Components.i30;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.o30;
import org.telegram.ui.Components.ol;
import org.telegram.ui.Components.oz;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.qy0;
import org.telegram.ui.Components.r5;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.ty;
import org.telegram.ui.Components.tz;
import org.telegram.ui.Components.w91;
import org.telegram.ui.Components.wu;
import org.telegram.ui.Components.yv0;
import org.telegram.ui.Components.zm0;
import org.telegram.ui.Wallet.o5;
import org.telegram.ui.Wallet.r9;
import org.telegram.ui.Wallet.s5;
import org.telegram.ui.ah1;
import w7.z5;
public final class x extends FrameLayout {
    public final int f898a;
    public Object f899b;

    public x(Context context, int i10) {
        super(context);
        this.f898a = i10;
    }

    public ap a() {
        return ((ap[]) this.f899b)[0];
    }

    @Override
    public void addView(View view, int i10, int i11) {
        switch (this.f898a) {
            case 8:
                super.addView(view, i10, i11);
                ((ih.f) this.f899b).e();
                return;
            default:
                super.addView(view, i10, i11);
                return;
        }
    }

    public void b(bh.b bVar, eh.e eVar) {
        kh.f fVar = (kh.f) this.f899b;
        fVar.b(bVar, eVar);
        fVar.setIgnoreFastWay(true);
        fVar.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        fVar.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
    }

    public void c() {
        ap[] apVarArr = (ap[]) this.f899b;
        ap apVar = apVarArr[0];
        ap apVar2 = apVarArr[1];
        apVarArr[0] = apVar2;
        apVarArr[1] = apVar;
        apVar2.f24694n = true;
        apVar2.setVisibility(0);
        apVarArr[0].setScaleX(0.8f);
        apVarArr[0].setScaleY(0.8f);
        apVarArr[0].setAlpha(0.0f);
        apVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = apVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        bs bsVar = bs.h;
        ok.t(translationY, bsVar, 320L);
        ap apVar3 = apVarArr[1];
        apVar3.f24694n = false;
        apVar3.setVisibility(0);
        apVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(bsVar).setDuration(320L).withEndAction(new pg(apVar3, 28)).start();
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
        switch (this.f898a) {
            case 20:
                zm0 zm0Var = (zm0) this.f899b;
                if (zm0Var.f32977r > 0.0f && zm0Var.e != null) {
                    zm0Var.f32975f.reset();
                    float width = getWidth() / zm0Var.f32974c.getWidth();
                    zm0Var.f32975f.postScale(width, width);
                    zm0Var.d.setLocalMatrix(zm0Var.f32975f);
                    zm0Var.e.setAlpha((int) (zm0Var.f32977r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), zm0Var.e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = zm0Var.E;
                if (drawable != null) {
                    drawable.setAlpha((int) (zm0Var.f32977r * 255.0f));
                    canvas.save();
                    float f15 = zm0Var.H;
                    float f16 = zm0Var.G;
                    float f17 = zm0Var.f32977r;
                    canvas.translate((f16 * f17) + f15, (0.0f * f17) + zm0Var.I);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(zm0Var.J, zm0Var.K), Math.max(zm0Var.J, zm0Var.K), 0.75f), 1.0f, zm0Var.f32977r);
                    canvas.scale(lerp, lerp, ((zm0Var.E.getBounds().width() / 2.0f) * zm0Var.J) + (-zm0Var.H) + zm0Var.E.getBounds().left, ((zm0Var.E.getBounds().height() / 2.0f) * zm0Var.K) + (-zm0Var.I) + zm0Var.E.getBounds().top);
                    dh.d dVar = zm0Var.F;
                    if (dVar != null) {
                        dVar.setAlpha((int) (zm0Var.f32977r * 255.0f));
                        zm0Var.F.draw(canvas);
                    }
                    zm0Var.E.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 24:
                iz0 iz0Var = (iz0) this.f899b;
                gz0 gz0Var = iz0Var.f27360c;
                if (gz0Var != null && gz0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = iz0Var.T;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x10 = iz0Var.f27360c.getEditField().getX() + iz0Var.f27360c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = iz0Var.T;
                        iz0Var.f27357a0 = x10 + emojiSpan2.lastDrawX;
                        iz0Var.U = emojiSpan2.lastDrawY;
                    } else if (iz0Var.V != null && iz0Var.W != null) {
                        iz0Var.f27357a0 = iz0Var.f27360c.getEditField().getX() + iz0Var.f27360c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                if (iz0Var.f27366s && !iz0Var.v && (arrayList = iz0Var.f27367w) != null && !arrayList.isEmpty() && !iz0Var.f27368x) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                f6 f6Var = iz0Var.P;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float d = f6Var.d(f7, false);
                f6 f6Var2 = iz0Var.Q;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float d10 = f6Var2.d(f10, false);
                float d11 = iz0Var.f27359b0.d(iz0Var.f27357a0, false);
                if (d <= 0.0f && d10 <= 0.0f && !z10) {
                    iz0Var.d.setVisibility(8);
                }
                iz0Var.M.rewind();
                float left = iz0Var.e.getLeft();
                int left2 = iz0Var.e.getLeft();
                ArrayList arrayList2 = iz0Var.f27367w;
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                float D = org.telegram.messenger.g0.D(44.0f, size, left2);
                f6 f6Var3 = iz0Var.f27362d0;
                float f18 = f6Var3.f26089c;
                if (f18 <= 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                float f19 = D - left;
                if (f19 > 0.0f) {
                    f18 = f6Var3.d(f19, z11);
                }
                float d12 = iz0Var.f27361c0.d((left + D) / 2.0f, z11);
                gz0 gz0Var2 = iz0Var.f27360c;
                if (gz0Var2 != null && gz0Var2.getEditField() != null) {
                    int i11 = iz0Var.h;
                    if (i11 == 0) {
                        iz0Var.d.setTranslationY(((-iz0Var.f27360c.getEditField().getHeight()) - iz0Var.f27360c.getEditField().getScrollY()) + iz0Var.U + AndroidUtilities.dp(5.0f));
                    } else if (i11 == 1) {
                        iz0Var.d.setTranslationY(((-iz0Var.getMeasuredHeight()) - iz0Var.f27360c.getEditField().getScrollY()) + iz0Var.U + AndroidUtilities.dp(20.0f) + iz0Var.d.getHeight());
                    }
                }
                float f20 = f18 / 4.0f;
                float f21 = f18 / 2.0f;
                int max = (int) Math.max((iz0Var.f27357a0 - Math.max(f20, Math.min(f21, AndroidUtilities.dp(66.0f)))) - iz0Var.e.getLeft(), 0.0f);
                if (iz0Var.e.getPaddingLeft() != max) {
                    f11 = 1.0f;
                    iz0Var.e.setPadding(max, 0, 0, 0);
                    iz0Var.e.scrollBy(iz0Var.e.getPaddingLeft() - max, 0);
                } else {
                    f11 = 1.0f;
                }
                iz0Var.e.setTranslationX(((int) Math.max((d11 - Math.max(f20, Math.min(f21, AndroidUtilities.dp(66.0f)))) - iz0Var.e.getLeft(), 0.0f)) - max);
                float translationX = iz0Var.e.getTranslationX() + (d12 - f21) + iz0Var.e.getPaddingLeft();
                float translationY = iz0Var.e.getTranslationY() + iz0Var.e.getTop() + iz0Var.e.getPaddingTop();
                if (iz0Var.h == 0) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(6.66f);
                }
                float f22 = translationY + dp;
                float min = Math.min(iz0Var.e.getTranslationX() + d12 + f21 + iz0Var.e.getPaddingLeft(), iz0Var.getWidth() - iz0Var.d.getPaddingRight());
                float translationY2 = iz0Var.e.getTranslationY() + iz0Var.e.getBottom();
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
                    iz0Var.O.setColor(h6.w0(h6.Be, iz0Var.f27358b));
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
                float f32 = iz0Var.f27362d0.f26089c;
                float f33 = iz0Var.f27361c0.f26089c;
                float f34 = f32 / 2.0f;
                float translationX2 = iz0Var.e.getTranslationX() + (f33 - f34) + iz0Var.e.getPaddingLeft();
                float paddingTop = iz0Var.e.getPaddingTop() + iz0Var.e.getTop();
                float min3 = Math.min(iz0Var.e.getTranslationX() + f33 + f34 + iz0Var.e.getPaddingLeft(), iz0Var.getWidth() - iz0Var.d.getPaddingRight());
                float bottom = iz0Var.e.getBottom();
                f6 f6Var4 = iz0Var.R;
                if (iz0Var.e.canScrollHorizontally(-1)) {
                    f13 = f11;
                } else {
                    f13 = 0.0f;
                }
                float d17 = f6Var4.d(f13, false);
                if (d17 > 0.0f) {
                    int i13 = (int) translationX2;
                    h6.F4.setBounds(i13, (int) paddingTop, AndroidUtilities.dp(32.0f) + i13, (int) bottom);
                    h6.F4.setAlpha((int) (d17 * f12));
                    h6.F4.draw(canvas);
                }
                f6 f6Var5 = iz0Var.S;
                if (iz0Var.e.canScrollHorizontally(1)) {
                    f14 = f11;
                } else {
                    f14 = 0.0f;
                }
                float d18 = f6Var5.d(f14, false);
                if (d18 > 0.0f) {
                    int i14 = (int) min3;
                    h6.E4.setBounds(i14 - AndroidUtilities.dp(32.0f), (int) paddingTop, i14, (int) bottom);
                    h6.E4.setAlpha((int) (d18 * f12));
                    h6.E4.draw(canvas);
                }
                canvas.restore();
                if (iz0Var.P.f26089c < f11) {
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
        switch (this.f898a) {
            case 21:
                ef efVar = (ef) this.f899b;
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
        switch (this.f898a) {
            case 20:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((zm0) this.f899b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f898a) {
            case 2:
                if (((md) this.f899b).f1854f0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 5:
                if (((fi.g) this.f899b).f10613e0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 12:
                if (motionEvent.getY() > getMeasuredHeight() - ((rl) this.f899b).B0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f898a) {
            case 12:
                canvas.save();
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                rl rlVar = (rl) this.f899b;
                boolean z10 = false;
                canvas.clipRect(0, 0, measuredWidth, measuredHeight - rlVar.B0);
                if (!rlVar.G) {
                    z10 = super.drawChild(canvas, view, j10);
                }
                canvas.restore();
                return z10;
            case 28:
                if (((s5) this.f899b).f34844a && view.getTag() != s5.f34843n0) {
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f898a) {
            case 15:
                cv cvVar = (cv) this.f899b;
                w91 w91Var = cvVar.f25264c;
                wu wuVar = cvVar.f25263b;
                super.onDetachedFromWindow();
                try {
                    ah0 ah0Var = ah0.f24601p0;
                    if (ah0Var.P) {
                        if (wuVar.getVisibility() != 0) {
                        }
                        if (w91Var.f() && !ah0Var.P) {
                            if (cv.S == cvVar) {
                                cv.S = null;
                            }
                            w91Var.b();
                            return;
                        }
                        return;
                    }
                    if (wuVar.getParent() != null) {
                        removeView(wuVar);
                        wuVar.stopLoading();
                        wuVar.loadUrl("about:blank");
                        wuVar.destroy();
                    }
                    if (w91Var.f()) {
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
        switch (this.f898a) {
            case 10:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.h) this.f899b) == null) {
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                    this.f899b = hVar;
                    hVar.f31435k = false;
                    hVar.f31437m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.f899b).f31431f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f899b).a(AndroidUtilities.dp(4.0f), canvas, rectF, null);
                invalidate();
                return;
            case 11:
                ((da) this.f899b).e.a(canvas);
                return;
            case 12:
                rl rlVar = (rl) this.f899b;
                rlVar.f29953d0.setColor(h6.w0(h6.f21064h5, rlVar.f28175a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - rlVar.B0, rlVar.f29953d0);
                return;
            case 22:
                yv0 yv0Var = (yv0) this.f899b;
                Drawable drawable = yv0Var.d;
                drawable.setBounds(0, yv0Var.f32741f - yv0.o(yv0Var), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 25:
                h71 h71Var = (h71) this.f899b;
                Drawable drawable2 = h71Var.f26803b;
                drawable2.setBounds(0, (int) ((h71Var.h - h71.o(h71Var)) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                drawable2.draw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f898a) {
            case 12:
                if (motionEvent.getY() > getMeasuredHeight() - ((rl) this.f899b).B0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 22:
                yv0 yv0Var = (yv0) this.f899b;
                if (motionEvent.getAction() == 0 && yv0Var.f32741f != 0 && motionEvent.getY() < yv0Var.f32741f) {
                    yv0Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 25:
                h71 h71Var = (h71) this.f899b;
                if (motionEvent.getAction() == 0 && h71Var.h != 0 && motionEvent.getY() < h71Var.h) {
                    h71Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 28:
                if (!((s5) this.f899b).f34844a && !super.onInterceptTouchEvent(motionEvent)) {
                    return false;
                }
                return true;
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
        FrameLayout frameLayout;
        float f7;
        boolean z11;
        int i16;
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        float x10;
        switch (this.f898a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                a0 a0Var = (a0) this.f899b;
                if (a0Var.K && z10) {
                    a0Var.f646w.setTranslationY(-a0Var.f641c.getMeasuredHeight());
                    int measuredHeight3 = a0Var.f641c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a0Var.f648y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight3;
                    a0Var.f648y.setLayoutParams(marginLayoutParams);
                    return;
                }
                return;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                o30 o30Var = (o30) this.f899b;
                o30Var.setTranslationY((getMeasuredHeight() * 0.28f) - (o30Var.getMeasuredWidth() / 2.0f));
                o30Var.setTranslationX((getMeasuredWidth() * 0.82f) - (o30Var.getMeasuredWidth() / 2.0f));
                return;
            case 11:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(36.0f);
                int i17 = ((i12 - i10) - dp2) / 2;
                int i18 = ((i13 - i11) - dp2) / 2;
                ((da) this.f899b).e.f(i17, i18, i17 + dp2, dp2 + i18);
                return;
            case 13:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f899b;
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
                int measuredHeight4 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.f24116q0.getMeasuredHeight()) - AndroidUtilities.dp(12.0f);
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.f24116q0;
                    textView.layout(measuredWidth - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.f24116q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f24116q0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.f24116q0;
                    textView2.layout(measuredWidth - (textView2.getMeasuredWidth() / 2), measuredHeight4, (chatAttachAlertPhotoLayout.f24116q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f24116q0.getMeasuredHeight() + measuredHeight4);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.f24105k0;
                shutterButton.layout(measuredWidth - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.f24105k0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f24105k0.getMeasuredWidth() / 2) + measuredWidth, (chatAttachAlertPhotoLayout.f24105k0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.f24118r0;
                imageView.layout(i14 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.f24118r0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f24118r0.getMeasuredWidth() / 2) + i14, (chatAttachAlertPhotoLayout.f24118r0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i21 = 0; i21 < 2; i21++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.S[i21];
                    imageView2.layout(dp - (imageView2.getMeasuredWidth() / 2), i15 - (chatAttachAlertPhotoLayout.S[i21].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.S[i21].getMeasuredWidth() / 2) + dp, (chatAttachAlertPhotoLayout.S[i21].getMeasuredHeight() / 2) + i15);
                }
                return;
            case 18:
                super.onLayout(z10, i10, i11, i12, i13);
                i30 i30Var = (i30) this.f899b;
                x xVar = i30Var.f27106b;
                int[] iArr = i30Var.G;
                xVar.getLocationOnScreen(iArr);
                i30Var.N = iArr[0];
                i30Var.M = iArr[1] - AndroidUtilities.dp(25.0f);
                return;
            case 20:
                super.onLayout(z10, i10, i11, i12, i13);
                zm0 zm0Var = (zm0) this.f899b;
                x xVar2 = zm0Var.f32978s;
                lw0 lw0Var = zm0Var.v;
                Drawable drawable = zm0Var.E;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (zm0Var.f32980x != null) {
                        float f10 = zm0Var.H;
                        float f11 = bounds.left + f10;
                        float f12 = bounds.right + f10;
                        float f13 = zm0Var.I;
                        float f14 = bounds.top + f13;
                        float f15 = bounds.bottom + f13;
                        boolean z12 = false;
                        if (!zm0Var.L) {
                            if (f12 - frameLayout.getMeasuredWidth() < AndroidUtilities.dp(8.0f)) {
                                zm0Var.f32981y.setPivotX(AndroidUtilities.dp(6.0f));
                                zm0Var.f32980x.setX(Math.min(lw0Var.getWidth() - zm0Var.f32980x.getWidth(), f11 - AndroidUtilities.dp(10.0f)) - lw0Var.getX());
                                f7 = 4.0f;
                                z11 = false;
                            } else {
                                zm0Var.f32981y.setPivotX(viewGroup2.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f7 = 4.0f;
                                zm0Var.f32980x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f12) - zm0Var.f32980x.getMeasuredWidth()) - lw0Var.getX());
                                z11 = true;
                            }
                            if (z11) {
                                x10 = ((zm0Var.f32980x.getX() + zm0Var.f32980x.getWidth()) - AndroidUtilities.dp(6.0f)) - f12;
                            } else {
                                x10 = (zm0Var.f32980x.getX() + AndroidUtilities.dp(10.0f)) - f11;
                            }
                            zm0Var.G = x10;
                        } else {
                            f7 = 4.0f;
                            z11 = false;
                        }
                        if (zm0Var.F != null) {
                            i16 = AndroidUtilities.dp(21.0f);
                        } else {
                            i16 = 0;
                        }
                        float f16 = f15 + i16;
                        if (zm0Var.f32980x.getMeasuredHeight() + f16 > xVar2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            zm0Var.f32981y.setPivotY(viewGroup.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            zm0Var.f32980x.setY(((f14 - AndroidUtilities.dp(f7)) - zm0Var.f32980x.getMeasuredHeight()) - lw0Var.getY());
                            z12 = true;
                        } else {
                            zm0Var.f32981y.setPivotY(AndroidUtilities.dp(6.0f));
                            zm0Var.f32980x.setY(Math.min((xVar2.getHeight() - zm0Var.f32980x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), f16) - lw0Var.getY());
                        }
                        i80 i80Var = zm0Var.f32979w;
                        i80Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = i80Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.f20600c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                        return;
                    }
                    return;
                }
                return;
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                yv0.n((yv0) this.f899b);
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
        switch (this.f898a) {
            case 10:
                if (View.MeasureSpec.getSize(i10) > AndroidUtilities.dp(260.0f)) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(320.0f), 1073741824), i11);
                    return;
                } else {
                    super.onMeasure(i10, i11);
                    return;
                }
            case 12:
                super.onMeasure(i10, i11);
                ol olVar = ((rl) this.f899b).F;
                if (olVar != null) {
                    olVar.a();
                    return;
                }
                return;
            case 15:
                int size = View.MeasureSpec.getSize(i10);
                cv cvVar = (cv) this.f899b;
                int min = (int) Math.min(cvVar.H / (cvVar.G / size), AndroidUtilities.displaySize.y / 2);
                if (cvVar.J) {
                    i12 = 22;
                } else {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 84) + min + 1, 1073741824));
                return;
            case 16:
                ty tyVar = (ty) this.f899b;
                View view = (View) tyVar.F.getParent();
                if (view != null) {
                    dp = (int) (view.getMeasuredHeight() - tyVar.F.getY());
                } else {
                    dp = AndroidUtilities.dp(120.0f);
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp - tyVar.F.f30722b1, 1073741824));
                return;
            case 17:
                tz tzVar = ((oz) this.f899b).Q;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (ok.A(8.0f, tzVar.D0.getMeasuredHeight() - tzVar.f30722b1, 3) * 1.7f), 1073741824));
                return;
            case 22:
                yv0 yv0Var = (yv0) this.f899b;
                u1 u1Var = yv0Var.f32739b;
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
                getMeasuredWidth();
                int D = org.telegram.messenger.g0.D(54.0f, LocationController.getLocationsCount(), org.telegram.messenger.g0.C(56.0f, AndroidUtilities.dp(56.0f), 1));
                int i14 = size2 / 5;
                if (D < i14 * 3) {
                    i13 = AndroidUtilities.dp(8.0f);
                } else {
                    i13 = i14 * 2;
                    if (D < size2) {
                        i13 -= size2 - D;
                    }
                }
                if (u1Var.getPaddingTop() != i13) {
                    yv0Var.h = true;
                    u1Var.setPadding(0, i13, 0, AndroidUtilities.dp(8.0f));
                    yv0Var.h = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), 1073741824));
                return;
            case 24:
                iz0 iz0Var = (iz0) this.f899b;
                int i15 = iz0Var.f27364n;
                if (iz0Var.h == 0) {
                    dp2 = AndroidUtilities.dp(8.0f);
                } else {
                    dp2 = AndroidUtilities.dp(6.66f);
                }
                int i16 = iz0Var.f27364n;
                if (iz0Var.h == 0) {
                    dp3 = AndroidUtilities.dp(6.66f);
                } else {
                    dp3 = AndroidUtilities.dp(8.0f);
                }
                setPadding(i15, dp2, i16, dp3);
                super.onMeasure(i10, i11);
                return;
            case 27:
                super.onMeasure(i10, i11);
                setMeasuredDimension(getMeasuredWidth(), (int) Math.ceil(((o5) this.f899b).R.c(AndroidUtilities.dp(4.0f))));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f898a) {
            case 20:
                super.onSizeChanged(i10, i11, i12, i13);
                zm0 zm0Var = (zm0) this.f899b;
                hh.d.c(zm0Var.h, zm0Var.f32978s);
                ViewGroup viewGroup = zm0Var.f32981y;
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
        switch (this.f898a) {
            case 22:
                if (!((yv0) this.f899b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 23:
            case 24:
            default:
                return super.onTouchEvent(motionEvent);
            case 25:
                if (!((h71) this.f899b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 26:
                ((ah1) this.f899b).T.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void onViewAdded(View view) {
        switch (this.f898a) {
            case 7:
                super.onViewAdded(view);
                bringChildToFront((kh.f) this.f899b);
                return;
            default:
                super.onViewAdded(view);
                return;
        }
    }

    @Override
    public void onWindowFocusChanged(boolean z10) {
        switch (this.f898a) {
            case 29:
                super.onWindowFocusChanged(z10);
                if (z10) {
                    ((r9) this.f899b).f0(true);
                    return;
                }
                return;
            default:
                super.onWindowFocusChanged(z10);
                return;
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f898a) {
            case 19:
                jm0 jm0Var = (jm0) this.f899b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(jm0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(jm0Var.getMeasuredHeight(), 1073741824));
                    layout(0, 0, jm0Var.f27558b1.getMeasuredWidth(), jm0Var.f27558b1.getMeasuredHeight());
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
                if (!((yv0) this.f899b).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 23:
                if (!((qy0) this.f899b).f29756g0) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f898a) {
            case 1:
                super.setTranslationY(f7);
                l7 l7Var = (l7) this.f899b;
                l5 l5Var = l7Var.f1726e0;
                if (l5Var != null && l5Var.getVisibility() == 0) {
                    l7Var.f1726e0.invalidate();
                    return;
                }
                return;
            case 4:
                vb vbVar = (vb) this.f899b;
                if (getTranslationY() != f7 && vbVar.f9956c1 != null) {
                    super.setTranslationY(f7);
                    vbVar.f9956c1.y();
                    return;
                }
                return;
            case 25:
                super.setTranslationY(f7);
                h71.n((h71) this.f899b);
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
        switch (this.f898a) {
            case 18:
                super.setVisibility(i10);
                ((i30) this.f899b).d.setVisibility(i10);
                return;
            case 24:
                iz0 iz0Var = (iz0) this.f899b;
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
                    if (iz0Var.e != null) {
                        for (int i11 = 0; i11 < iz0Var.e.getChildCount(); i11++) {
                            if (z11) {
                                hz0 hz0Var = (hz0) iz0Var.e.getChildAt(i11);
                                Drawable drawable = hz0Var.f27017b;
                                if (drawable instanceof r5) {
                                    ((r5) drawable).a(hz0Var);
                                }
                                hz0Var.f27018c = true;
                            } else {
                                hz0 hz0Var2 = (hz0) iz0Var.e.getChildAt(i11);
                                Drawable drawable2 = hz0Var2.f27017b;
                                if (drawable2 instanceof r5) {
                                    ((r5) drawable2).o(hz0Var2);
                                }
                                hz0Var2.f27018c = false;
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

    public x(Object obj, Context context, int i10) {
        super(context);
        this.f898a = i10;
        this.f899b = obj;
    }

    public x(Context context) {
        super(context);
        this.f898a = 7;
        View view = new View(context);
        this.f899b = view;
        addView(view, z5.g());
    }

    public x(Context context, d6 d6Var) {
        super(context);
        this.f898a = 14;
        this.f899b = new ap[2];
        int i10 = 0;
        while (true) {
            ap[] apVarArr = (ap[]) this.f899b;
            if (i10 < apVarArr.length) {
                apVarArr[i10] = new ap(context, d6Var);
                addView(((ap[]) this.f899b)[i10], z5.e(-1, -1, 119));
                i10++;
            } else {
                apVarArr[0].setVisibility(0);
                ((ap[]) this.f899b)[1].setVisibility(8);
                return;
            }
        }
    }

    public x(Context context, String str, ci.b bVar) {
        super(context);
        this.f898a = 3;
        int dp = AndroidUtilities.dp(12.0f);
        int i10 = h6.f21099j5;
        setBackground(h6.c0(dp, h6.m1(0.06f, bVar.w(i10))));
        LinearLayout e = ok.e(context, 1);
        addView(e, z5.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        q6 q6Var = new q6(context, false, true, true);
        this.f899b = q6Var;
        q6Var.b(0.6f, 450L, bs.h);
        q6Var.setTextSize(AndroidUtilities.dp(17.0f));
        q6Var.setTextColor(bVar.w(i10));
        q6Var.setScaleProperty(0.7f);
        q6Var.setGravity(17);
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setAllowCancel(true);
        e.addView(q6Var, z5.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(bVar.w(i10));
        textView.setGravity(17);
        e.addView(textView, z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    public x(Context context, o30 o30Var) {
        super(context);
        this.f898a = 9;
        this.f899b = o30Var;
    }
}
