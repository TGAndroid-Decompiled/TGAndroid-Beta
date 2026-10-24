package ah;

import ai.l5;
import ai.l7;
import ai.nd;
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
import org.telegram.messenger.tl;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.av;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.ba;
import org.telegram.ui.Components.bn0;
import org.telegram.ui.Components.cf;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.da1;
import org.telegram.ui.Components.g30;
import org.telegram.ui.Components.h80;
import org.telegram.ui.Components.iz0;
import org.telegram.ui.Components.jz0;
import org.telegram.ui.Components.kz0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.ml;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.sy0;
import org.telegram.ui.Components.uu;
import org.telegram.ui.Components.yo;
import org.telegram.ui.Components.zr;
import org.telegram.ui.Wallet.o5;
import org.telegram.ui.Wallet.s5;
import org.telegram.ui.Wallet.s9;
import org.telegram.ui.gh1;
import w7.z5;
public final class x extends FrameLayout {
    public final int f899a;
    public Object f900b;

    public x(Context context, int i10) {
        super(context);
        this.f899a = i10;
    }

    public yo a() {
        return ((yo[]) this.f900b)[0];
    }

    @Override
    public void addView(View view, int i10, int i11) {
        switch (this.f899a) {
            case 8:
                super.addView(view, i10, i11);
                ((ih.f) this.f900b).e();
                return;
            default:
                super.addView(view, i10, i11);
                return;
        }
    }

    public void b(bh.b bVar, eh.e eVar) {
        kh.f fVar = (kh.f) this.f900b;
        fVar.b(bVar, eVar);
        fVar.setIgnoreFastWay(true);
        fVar.setFadeHeightTop(AndroidUtilities.dp(48.0f));
        fVar.setFadeHeightBottom(AndroidUtilities.dp(48.0f));
    }

    public void c() {
        yo[] yoVarArr = (yo[]) this.f900b;
        yo yoVar = yoVarArr[0];
        yo yoVar2 = yoVarArr[1];
        yoVarArr[0] = yoVar2;
        yoVarArr[1] = yoVar;
        yoVar2.f33015n = true;
        yoVar2.setVisibility(0);
        yoVarArr[0].setScaleX(0.8f);
        yoVarArr[0].setScaleY(0.8f);
        yoVarArr[0].setAlpha(0.0f);
        yoVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = yoVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        zr zrVar = zr.h;
        tl.t(translationY, zrVar, 320L);
        yo yoVar3 = yoVarArr[1];
        yoVar3.f33015n = false;
        yoVar3.setVisibility(0);
        yoVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(zrVar).setDuration(320L).withEndAction(new ng(yoVar3, 29)).start();
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
        switch (this.f899a) {
            case 20:
                bn0 bn0Var = (bn0) this.f900b;
                if (bn0Var.f25058r > 0.0f && bn0Var.e != null) {
                    bn0Var.f25056f.reset();
                    float width = getWidth() / bn0Var.f25055c.getWidth();
                    bn0Var.f25056f.postScale(width, width);
                    bn0Var.d.setLocalMatrix(bn0Var.f25056f);
                    bn0Var.e.setAlpha((int) (bn0Var.f25058r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), bn0Var.e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = bn0Var.E;
                if (drawable != null) {
                    drawable.setAlpha((int) (bn0Var.f25058r * 255.0f));
                    canvas.save();
                    float f15 = bn0Var.H;
                    float f16 = bn0Var.G;
                    float f17 = bn0Var.f25058r;
                    canvas.translate((f16 * f17) + f15, (0.0f * f17) + bn0Var.I);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(bn0Var.J, bn0Var.K), Math.max(bn0Var.J, bn0Var.K), 0.75f), 1.0f, bn0Var.f25058r);
                    canvas.scale(lerp, lerp, ((bn0Var.E.getBounds().width() / 2.0f) * bn0Var.J) + (-bn0Var.H) + bn0Var.E.getBounds().left, ((bn0Var.E.getBounds().height() / 2.0f) * bn0Var.K) + (-bn0Var.I) + bn0Var.E.getBounds().top);
                    dh.d dVar = bn0Var.F;
                    if (dVar != null) {
                        dVar.setAlpha((int) (bn0Var.f25058r * 255.0f));
                        bn0Var.F.draw(canvas);
                    }
                    bn0Var.E.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 24:
                kz0 kz0Var = (kz0) this.f900b;
                iz0 iz0Var = kz0Var.f28109c;
                if (iz0Var != null && iz0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = kz0Var.V;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x10 = kz0Var.f28109c.getEditField().getX() + kz0Var.f28109c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = kz0Var.V;
                        kz0Var.f28110c0 = x10 + emojiSpan2.lastDrawX;
                        kz0Var.W = emojiSpan2.lastDrawY;
                    } else if (kz0Var.f28106a0 != null && kz0Var.f28108b0 != null) {
                        kz0Var.f28110c0 = kz0Var.f28109c.getEditField().getX() + kz0Var.f28109c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                if (kz0Var.f28117s && !kz0Var.v && (arrayList = kz0Var.f28118w) != null && !arrayList.isEmpty() && !kz0Var.f28119x) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                d6 d6Var = kz0Var.R;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float d = d6Var.d(f7, false);
                d6 d6Var2 = kz0Var.S;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float d10 = d6Var2.d(f10, false);
                float d11 = kz0Var.f28111d0.d(kz0Var.f28110c0, false);
                if (d <= 0.0f && d10 <= 0.0f && !z10) {
                    kz0Var.d.setVisibility(8);
                }
                kz0Var.O.rewind();
                float left = kz0Var.e.getLeft();
                int left2 = kz0Var.e.getLeft();
                ArrayList arrayList2 = kz0Var.f28118w;
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                float D = org.telegram.messenger.v0.D(44.0f, size, left2);
                d6 d6Var3 = kz0Var.f28114f0;
                float f18 = d6Var3.f25568c;
                if (f18 <= 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                float f19 = D - left;
                if (f19 > 0.0f) {
                    f18 = d6Var3.d(f19, z11);
                }
                float d12 = kz0Var.f28112e0.d((left + D) / 2.0f, z11);
                iz0 iz0Var2 = kz0Var.f28109c;
                if (iz0Var2 != null && iz0Var2.getEditField() != null) {
                    int i11 = kz0Var.h;
                    if (i11 == 0) {
                        kz0Var.d.setTranslationY(((-kz0Var.f28109c.getEditField().getHeight()) - kz0Var.f28109c.getEditField().getScrollY()) + kz0Var.W + AndroidUtilities.dp(5.0f));
                    } else if (i11 == 1) {
                        kz0Var.d.setTranslationY(((-kz0Var.getMeasuredHeight()) - kz0Var.f28109c.getEditField().getScrollY()) + kz0Var.W + AndroidUtilities.dp(20.0f) + kz0Var.d.getHeight());
                    }
                }
                float f20 = f18 / 4.0f;
                float f21 = f18 / 2.0f;
                int max = (int) Math.max((kz0Var.f28110c0 - Math.max(f20, Math.min(f21, AndroidUtilities.dp(66.0f)))) - kz0Var.e.getLeft(), 0.0f);
                if (kz0Var.e.getPaddingLeft() != max) {
                    f11 = 1.0f;
                    kz0Var.e.setPadding(max, 0, 0, 0);
                    kz0Var.e.scrollBy(kz0Var.e.getPaddingLeft() - max, 0);
                } else {
                    f11 = 1.0f;
                }
                kz0Var.e.setTranslationX(((int) Math.max((d11 - Math.max(f20, Math.min(f21, AndroidUtilities.dp(66.0f)))) - kz0Var.e.getLeft(), 0.0f)) - max);
                float translationX = kz0Var.e.getTranslationX() + (d12 - f21) + kz0Var.e.getPaddingLeft();
                float translationY = kz0Var.e.getTranslationY() + kz0Var.e.getTop() + kz0Var.e.getPaddingTop();
                if (kz0Var.h == 0) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(6.66f);
                }
                float f22 = translationY + dp;
                float min = Math.min(kz0Var.e.getTranslationX() + d12 + f21 + kz0Var.e.getPaddingLeft(), kz0Var.getWidth() - kz0Var.d.getPaddingRight());
                float translationY2 = kz0Var.e.getTranslationY() + kz0Var.e.getBottom();
                if (kz0Var.h == 0) {
                    i10 = AndroidUtilities.dp(6.66f);
                } else {
                    i10 = 0;
                }
                float f23 = translationY2 - i10;
                float min2 = Math.min(AndroidUtilities.dp(9.0f), f21) * 2.0f;
                int i12 = kz0Var.h;
                if (i12 == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f24 = f23 - min2;
                    float f25 = translationX + min2;
                    rectF.set(translationX, f24, f25, f23);
                    kz0Var.O.arcTo(rectF, 90.0f, 90.0f);
                    float f26 = f22 + min2;
                    rectF.set(translationX, f22, f25, f26);
                    kz0Var.O.arcTo(rectF, -180.0f, 90.0f);
                    float f27 = min - min2;
                    rectF.set(f27, f22, min, f26);
                    kz0Var.O.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f27, f24, min, f23);
                    kz0Var.O.arcTo(rectF, 0.0f, 90.0f);
                    kz0Var.O.lineTo(AndroidUtilities.dp(8.66f) + d11, f23);
                    kz0Var.O.lineTo(d11, AndroidUtilities.dp(6.66f) + f23);
                    kz0Var.O.lineTo(d11 - AndroidUtilities.dp(8.66f), f23);
                } else if (i12 == 1) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f28 = min - min2;
                    float f29 = f22 + min2;
                    rectF2.set(f28, f22, min, f29);
                    kz0Var.O.arcTo(rectF2, -90.0f, 90.0f);
                    float f30 = f23 - min2;
                    rectF2.set(f28, f30, min, f23);
                    kz0Var.O.arcTo(rectF2, 0.0f, 90.0f);
                    float f31 = min2 + translationX;
                    rectF2.set(translationX, f30, f31, f23);
                    kz0Var.O.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, f22, f31, f29);
                    kz0Var.O.arcTo(rectF2, -180.0f, 90.0f);
                    kz0Var.O.lineTo(d11 - AndroidUtilities.dp(8.66f), f22);
                    kz0Var.O.lineTo(d11, f22 - AndroidUtilities.dp(6.66f));
                    kz0Var.O.lineTo(AndroidUtilities.dp(8.66f) + d11, f22);
                }
                kz0Var.O.close();
                if (kz0Var.Q == null) {
                    Paint paint = new Paint(1);
                    kz0Var.Q = paint;
                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.0f)));
                    kz0Var.Q.setShadowLayer(AndroidUtilities.dp(4.33f), 0.0f, AndroidUtilities.dp(0.33333334f), 855638016);
                    kz0Var.Q.setColor(k6.w0(k6.Be, kz0Var.f28107b));
                }
                if (d < f11) {
                    kz0Var.P.rewind();
                    if (kz0Var.h == 0) {
                        dp2 = AndroidUtilities.dp(6.66f) + f23;
                    } else {
                        dp2 = f22 - AndroidUtilities.dp(6.66f);
                    }
                    double d13 = d11 - translationX;
                    double d14 = dp2 - f22;
                    f12 = 255.0f;
                    double d15 = d11 - min;
                    double d16 = dp2 - f23;
                    kz0Var.P.addCircle(d11, dp2, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d14, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d14, 2.0d) + Math.pow(d15, 2.0d)), Math.max(Math.pow(d16, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d16, 2.0d) + Math.pow(d15, 2.0d))))) * d, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(kz0Var.P);
                    canvas.saveLayerAlpha(0.0f, 0.0f, kz0Var.getWidth(), kz0Var.getHeight(), (int) (d * 255.0f), 31);
                } else {
                    f12 = 255.0f;
                }
                canvas.drawPath(kz0Var.O, kz0Var.Q);
                canvas.save();
                canvas.clipPath(kz0Var.O);
                super.dispatchDraw(canvas);
                float f32 = kz0Var.f28114f0.f25568c;
                float f33 = kz0Var.f28112e0.f25568c;
                float f34 = f32 / 2.0f;
                float translationX2 = kz0Var.e.getTranslationX() + (f33 - f34) + kz0Var.e.getPaddingLeft();
                float paddingTop = kz0Var.e.getPaddingTop() + kz0Var.e.getTop();
                float min3 = Math.min(kz0Var.e.getTranslationX() + f33 + f34 + kz0Var.e.getPaddingLeft(), kz0Var.getWidth() - kz0Var.d.getPaddingRight());
                float bottom = kz0Var.e.getBottom();
                d6 d6Var4 = kz0Var.T;
                if (kz0Var.e.canScrollHorizontally(-1)) {
                    f13 = f11;
                } else {
                    f13 = 0.0f;
                }
                float d17 = d6Var4.d(f13, false);
                if (d17 > 0.0f) {
                    int i13 = (int) translationX2;
                    k6.F4.setBounds(i13, (int) paddingTop, AndroidUtilities.dp(32.0f) + i13, (int) bottom);
                    k6.F4.setAlpha((int) (d17 * f12));
                    k6.F4.draw(canvas);
                }
                d6 d6Var5 = kz0Var.U;
                if (kz0Var.e.canScrollHorizontally(1)) {
                    f14 = f11;
                } else {
                    f14 = 0.0f;
                }
                float d18 = d6Var5.d(f14, false);
                if (d18 > 0.0f) {
                    int i14 = (int) min3;
                    k6.E4.setBounds(i14 - AndroidUtilities.dp(32.0f), (int) paddingTop, i14, (int) bottom);
                    k6.E4.setAlpha((int) (d18 * f12));
                    k6.E4.draw(canvas);
                }
                canvas.restore();
                if (kz0Var.R.f25568c < f11) {
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
        switch (this.f899a) {
            case 21:
                cf cfVar = (cf) this.f900b;
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
        switch (this.f899a) {
            case 20:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((bn0) this.f900b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f899a) {
            case 2:
                if (((nd) this.f900b).f1919h0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 5:
                if (((fi.g) this.f900b).f10632g0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 12:
                if (motionEvent.getY() > getMeasuredHeight() - ((pl) this.f900b).f29617y0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f899a) {
            case 12:
                canvas.save();
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                pl plVar = (pl) this.f900b;
                boolean z10 = false;
                canvas.clipRect(0, 0, measuredWidth, measuredHeight - plVar.f29617y0);
                if (!plVar.E) {
                    z10 = super.drawChild(canvas, view, j10);
                }
                canvas.restore();
                return z10;
            case 28:
                if (((s5) this.f900b).f35131a && view.getTag() != s5.f35130n0) {
                    return false;
                }
                return super.drawChild(canvas, view, j10);
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f899a) {
            case 15:
                av avVar = (av) this.f900b;
                da1 da1Var = avVar.f24811c;
                uu uuVar = avVar.f24810b;
                super.onDetachedFromWindow();
                try {
                    ch0 ch0Var = ch0.f25313p0;
                    if (ch0Var.P) {
                        if (uuVar.getVisibility() != 0) {
                        }
                        if (da1Var.f() && !ch0Var.P) {
                            if (av.S == avVar) {
                                av.S = null;
                            }
                            da1Var.b();
                            return;
                        }
                        return;
                    }
                    if (uuVar.getParent() != null) {
                        removeView(uuVar);
                        uuVar.stopLoading();
                        uuVar.loadUrl("about:blank");
                        uuVar.destroy();
                    }
                    if (da1Var.f()) {
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
        switch (this.f899a) {
            case 10:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.h) this.f900b) == null) {
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                    this.f900b = hVar;
                    hVar.f31587k = false;
                    hVar.f31589m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.f900b).f31583f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f900b).a(AndroidUtilities.dp(4.0f), canvas, rectF, null);
                invalidate();
                return;
            case 11:
                ((ba) this.f900b).e.a(canvas);
                return;
            case 12:
                pl plVar = (pl) this.f900b;
                plVar.f29589b0.setColor(k6.w0(k6.f21255h5, plVar.f27703a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - plVar.f29617y0, plVar.f29589b0);
                return;
            case 22:
                aw0 aw0Var = (aw0) this.f900b;
                Drawable drawable = aw0Var.d;
                drawable.setBounds(0, aw0Var.f24828f - aw0.n(aw0Var), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 25:
                n71 n71Var = (n71) this.f900b;
                Drawable drawable2 = n71Var.f28821b;
                drawable2.setBounds(0, (int) ((n71Var.h - n71.n(n71Var)) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                drawable2.draw(canvas);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f899a) {
            case 12:
                if (motionEvent.getY() > getMeasuredHeight() - ((pl) this.f900b).f29617y0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 22:
                aw0 aw0Var = (aw0) this.f900b;
                if (motionEvent.getAction() == 0 && aw0Var.f24828f != 0 && motionEvent.getY() < aw0Var.f24828f) {
                    aw0Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 25:
                n71 n71Var = (n71) this.f900b;
                if (motionEvent.getAction() == 0 && n71Var.h != 0 && motionEvent.getY() < n71Var.h) {
                    n71Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 28:
                if (!((s5) this.f900b).f35131a && !super.onInterceptTouchEvent(motionEvent)) {
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
        switch (this.f899a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                a0 a0Var = (a0) this.f900b;
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
                m30 m30Var = (m30) this.f900b;
                m30Var.setTranslationY((getMeasuredHeight() * 0.28f) - (m30Var.getMeasuredWidth() / 2.0f));
                m30Var.setTranslationX((getMeasuredWidth() * 0.82f) - (m30Var.getMeasuredWidth() / 2.0f));
                return;
            case 11:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(36.0f);
                int i17 = ((i12 - i10) - dp2) / 2;
                int i18 = ((i13 - i11) - dp2) / 2;
                ((ba) this.f900b).e.f(i17, i18, i17 + dp2, dp2 + i18);
                return;
            case 13:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f900b;
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
                int measuredHeight4 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.f24259q0.getMeasuredHeight()) - AndroidUtilities.dp(12.0f);
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.f24259q0;
                    textView.layout(measuredWidth - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.f24259q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f24259q0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.f24259q0;
                    textView2.layout(measuredWidth - (textView2.getMeasuredWidth() / 2), measuredHeight4, (chatAttachAlertPhotoLayout.f24259q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f24259q0.getMeasuredHeight() + measuredHeight4);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.f24248k0;
                shutterButton.layout(measuredWidth - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.f24248k0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f24248k0.getMeasuredWidth() / 2) + measuredWidth, (chatAttachAlertPhotoLayout.f24248k0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.f24261r0;
                imageView.layout(i14 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.f24261r0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f24261r0.getMeasuredWidth() / 2) + i14, (chatAttachAlertPhotoLayout.f24261r0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i21 = 0; i21 < 2; i21++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.S[i21];
                    imageView2.layout(dp - (imageView2.getMeasuredWidth() / 2), i15 - (chatAttachAlertPhotoLayout.S[i21].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.S[i21].getMeasuredWidth() / 2) + dp, (chatAttachAlertPhotoLayout.S[i21].getMeasuredHeight() / 2) + i15);
                }
                return;
            case 18:
                super.onLayout(z10, i10, i11, i12, i13);
                g30 g30Var = (g30) this.f900b;
                x xVar = g30Var.f26539b;
                int[] iArr = g30Var.G;
                xVar.getLocationOnScreen(iArr);
                g30Var.N = iArr[0];
                g30Var.M = iArr[1] - AndroidUtilities.dp(25.0f);
                return;
            case 20:
                super.onLayout(z10, i10, i11, i12, i13);
                bn0 bn0Var = (bn0) this.f900b;
                x xVar2 = bn0Var.f25059s;
                nw0 nw0Var = bn0Var.v;
                Drawable drawable = bn0Var.E;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    if (bn0Var.f25061x != null) {
                        float f10 = bn0Var.H;
                        float f11 = bounds.left + f10;
                        float f12 = bounds.right + f10;
                        float f13 = bn0Var.I;
                        float f14 = bounds.top + f13;
                        float f15 = bounds.bottom + f13;
                        boolean z12 = false;
                        if (!bn0Var.L) {
                            if (f12 - frameLayout.getMeasuredWidth() < AndroidUtilities.dp(8.0f)) {
                                bn0Var.f25062y.setPivotX(AndroidUtilities.dp(6.0f));
                                bn0Var.f25061x.setX(Math.min(nw0Var.getWidth() - bn0Var.f25061x.getWidth(), f11 - AndroidUtilities.dp(10.0f)) - nw0Var.getX());
                                f7 = 4.0f;
                                z11 = false;
                            } else {
                                bn0Var.f25062y.setPivotX(viewGroup2.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f7 = 4.0f;
                                bn0Var.f25061x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f12) - bn0Var.f25061x.getMeasuredWidth()) - nw0Var.getX());
                                z11 = true;
                            }
                            if (z11) {
                                x10 = ((bn0Var.f25061x.getX() + bn0Var.f25061x.getWidth()) - AndroidUtilities.dp(6.0f)) - f12;
                            } else {
                                x10 = (bn0Var.f25061x.getX() + AndroidUtilities.dp(10.0f)) - f11;
                            }
                            bn0Var.G = x10;
                        } else {
                            f7 = 4.0f;
                            z11 = false;
                        }
                        if (bn0Var.F != null) {
                            i16 = AndroidUtilities.dp(21.0f);
                        } else {
                            i16 = 0;
                        }
                        float f16 = f15 + i16;
                        if (bn0Var.f25061x.getMeasuredHeight() + f16 > xVar2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            bn0Var.f25062y.setPivotY(viewGroup.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            bn0Var.f25061x.setY(((f14 - AndroidUtilities.dp(f7)) - bn0Var.f25061x.getMeasuredHeight()) - nw0Var.getY());
                            z12 = true;
                        } else {
                            bn0Var.f25062y.setPivotY(AndroidUtilities.dp(6.0f));
                            bn0Var.f25061x.setY(Math.min((xVar2.getHeight() - bn0Var.f25061x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), f16) - nw0Var.getY());
                        }
                        h80 h80Var = bn0Var.f25060w;
                        h80Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = h80Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.f20671c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                        return;
                    }
                    return;
                }
                return;
            case 22:
                super.onLayout(z10, i10, i11, i12, i13);
                aw0.m((aw0) this.f900b);
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
        switch (this.f899a) {
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
                ml mlVar = ((pl) this.f900b).f29616y;
                if (mlVar != null) {
                    mlVar.a();
                    return;
                }
                return;
            case 15:
                int size = View.MeasureSpec.getSize(i10);
                av avVar = (av) this.f900b;
                int min = (int) Math.min(avVar.H / (avVar.G / size), AndroidUtilities.displaySize.y / 2);
                if (avVar.J) {
                    i12 = 22;
                } else {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 84) + min + 1, 1073741824));
                return;
            case 16:
                ry ryVar = (ry) this.f900b;
                View view = (View) ryVar.F.getParent();
                if (view != null) {
                    dp = (int) (view.getMeasuredHeight() - ryVar.F.getY());
                } else {
                    dp = AndroidUtilities.dp(120.0f);
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp - ryVar.F.f30306b1, 1073741824));
                return;
            case 17:
                rz rzVar = ((mz) this.f900b).Q;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (tl.A(8.0f, rzVar.D0.getMeasuredHeight() - rzVar.f30306b1, 3) * 1.7f), 1073741824));
                return;
            case 22:
                aw0 aw0Var = (aw0) this.f900b;
                u1 u1Var = aw0Var.f24826b;
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
                getMeasuredWidth();
                int D = org.telegram.messenger.v0.D(54.0f, LocationController.getLocationsCount(), org.telegram.messenger.v0.C(56.0f, AndroidUtilities.dp(56.0f), 1));
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
                    aw0Var.h = true;
                    u1Var.setPadding(0, i13, 0, AndroidUtilities.dp(8.0f));
                    aw0Var.h = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), 1073741824));
                return;
            case 24:
                kz0 kz0Var = (kz0) this.f900b;
                int i15 = kz0Var.f28115n;
                if (kz0Var.h == 0) {
                    dp2 = AndroidUtilities.dp(8.0f);
                } else {
                    dp2 = AndroidUtilities.dp(6.66f);
                }
                int i16 = kz0Var.f28115n;
                if (kz0Var.h == 0) {
                    dp3 = AndroidUtilities.dp(6.66f);
                } else {
                    dp3 = AndroidUtilities.dp(8.0f);
                }
                setPadding(i15, dp2, i16, dp3);
                super.onMeasure(i10, i11);
                return;
            case 27:
                super.onMeasure(i10, i11);
                setMeasuredDimension(getMeasuredWidth(), (int) Math.ceil(((o5) this.f900b).R.c(AndroidUtilities.dp(4.0f))));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f899a) {
            case 20:
                super.onSizeChanged(i10, i11, i12, i13);
                bn0 bn0Var = (bn0) this.f900b;
                hh.d.c(bn0Var.h, bn0Var.f25059s);
                ViewGroup viewGroup = bn0Var.f25062y;
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
        switch (this.f899a) {
            case 22:
                if (!((aw0) this.f900b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 23:
            case 24:
            default:
                return super.onTouchEvent(motionEvent);
            case 25:
                if (!((n71) this.f900b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 26:
                ((gh1) this.f900b).T.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void onViewAdded(View view) {
        switch (this.f899a) {
            case 7:
                super.onViewAdded(view);
                bringChildToFront((kh.f) this.f900b);
                return;
            default:
                super.onViewAdded(view);
                return;
        }
    }

    @Override
    public void onWindowFocusChanged(boolean z10) {
        switch (this.f899a) {
            case 29:
                super.onWindowFocusChanged(z10);
                if (z10) {
                    ((s9) this.f900b).f0(true);
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
        switch (this.f899a) {
            case 19:
                lm0 lm0Var = (lm0) this.f900b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(lm0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(lm0Var.getMeasuredHeight(), 1073741824));
                    layout(0, 0, lm0Var.f28372b1.getMeasuredWidth(), lm0Var.f28372b1.getMeasuredHeight());
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
                if (!((aw0) this.f900b).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 23:
                if (!((sy0) this.f900b).f30643g0) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f899a) {
            case 1:
                super.setTranslationY(f7);
                l7 l7Var = (l7) this.f900b;
                l5 l5Var = l7Var.f1718e0;
                if (l5Var != null && l5Var.getVisibility() == 0) {
                    l7Var.f1718e0.invalidate();
                    return;
                }
                return;
            case 4:
                vb vbVar = (vb) this.f900b;
                if (getTranslationY() != f7 && vbVar.f9973c1 != null) {
                    super.setTranslationY(f7);
                    vbVar.f9973c1.y();
                    return;
                }
                return;
            case 25:
                super.setTranslationY(f7);
                n71.m((n71) this.f900b);
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
        switch (this.f899a) {
            case 18:
                super.setVisibility(i10);
                ((g30) this.f900b).d.setVisibility(i10);
                return;
            case 24:
                kz0 kz0Var = (kz0) this.f900b;
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
                    if (kz0Var.e != null) {
                        for (int i11 = 0; i11 < kz0Var.e.getChildCount(); i11++) {
                            if (z11) {
                                jz0 jz0Var = (jz0) kz0Var.e.getChildAt(i11);
                                Drawable drawable = jz0Var.f27814b;
                                if (drawable instanceof p5) {
                                    ((p5) drawable).a(jz0Var);
                                }
                                jz0Var.f27815c = true;
                            } else {
                                jz0 jz0Var2 = (jz0) kz0Var.e.getChildAt(i11);
                                Drawable drawable2 = jz0Var2.f27814b;
                                if (drawable2 instanceof p5) {
                                    ((p5) drawable2).o(jz0Var2);
                                }
                                jz0Var2.f27815c = false;
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
        this.f899a = i10;
        this.f900b = obj;
    }

    public x(Context context) {
        super(context);
        this.f899a = 7;
        View view = new View(context);
        this.f900b = view;
        addView(view, z5.g());
    }

    public x(Context context, g6 g6Var) {
        super(context);
        this.f899a = 14;
        this.f900b = new yo[2];
        int i10 = 0;
        while (true) {
            yo[] yoVarArr = (yo[]) this.f900b;
            if (i10 < yoVarArr.length) {
                yoVarArr[i10] = new yo(context, g6Var);
                addView(((yo[]) this.f900b)[i10], z5.e(-1, -1, 119));
                i10++;
            } else {
                yoVarArr[0].setVisibility(0);
                ((yo[]) this.f900b)[1].setVisibility(8);
                return;
            }
        }
    }

    public x(Context context, String str, ci.b bVar) {
        super(context);
        this.f899a = 3;
        int dp = AndroidUtilities.dp(12.0f);
        int i10 = k6.f21290j5;
        Drawable c02 = k6.c0(dp, k6.o1(0.06f, bVar.g(i10)));
        n6 M = r6.M(0.06f, i10);
        setBackground(c02);
        r6.k(this, c02, M, null, bVar);
        LinearLayout e = tl.e(context, 1);
        addView(e, z5.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        o6 o6Var = new o6(context, false, true, true);
        this.f900b = o6Var;
        o6Var.b(0.6f, 450L, zr.h);
        o6Var.setTextSize(AndroidUtilities.dp(17.0f));
        r6.a0(o6Var, i10, bVar);
        o6Var.setScaleProperty(0.7f);
        o6Var.setGravity(17);
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setAllowCancel(true);
        e.addView(o6Var, z5.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        r6.W(textView, i10, bVar);
        textView.setGravity(17);
        e.addView(textView, z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    public x(Context context, m30 m30Var) {
        super(context);
        this.f899a = 9;
        this.f900b = m30Var;
    }
}
