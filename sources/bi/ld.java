package bi;

import android.content.Context;
import android.graphics.Bitmap;
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
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.em;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.Components.il;
import org.telegram.ui.Components.j30;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.o91;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.p30;
import org.telegram.ui.Components.rg;
import org.telegram.ui.Components.ry;
import org.telegram.ui.Components.rz;
import org.telegram.ui.Components.tu;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.vo;
import org.telegram.ui.Components.w70;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.Components.zu;
import org.telegram.ui.Components.zy0;
import org.telegram.ui.eg0;
import org.telegram.ui.si1;
public final class ld extends FrameLayout {
    public final int f3057a;
    public Object f3058b;

    public ld(Context context, int i10) {
        super(context);
        this.f3057a = i10;
    }

    public vo a() {
        return ((vo[]) this.f3058b)[0];
    }

    @Override
    public void addView(View view, int i10, int i11) {
        switch (this.f3057a) {
            case 3:
                super.addView(view, i10, i11);
                ((gh.g) this.f3058b).e();
                return;
            default:
                super.addView(view, i10, i11);
                return;
        }
    }

    public void b() {
        vo[] voVarArr = (vo[]) this.f3058b;
        vo voVar = voVarArr[0];
        vo voVar2 = voVarArr[1];
        voVarArr[0] = voVar2;
        voVarArr[1] = voVar;
        voVar2.f28037n = true;
        voVar2.setVisibility(0);
        voVarArr[0].setScaleX(0.8f);
        voVarArr[0].setScaleY(0.8f);
        voVarArr[0].setAlpha(0.0f);
        voVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = voVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        wr wrVar = wr.h;
        em.q(translationY, wrVar, 320L);
        vo voVar3 = voVarArr[1];
        voVar3.f28037n = false;
        voVar3.setVisibility(0);
        voVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(wrVar).setDuration(320L).withEndAction(new rg(voVar3, 28)).start();
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
        switch (this.f3057a) {
            case 15:
                km0 km0Var = (km0) this.f3058b;
                if (km0Var.f24756r > 0.0f && km0Var.e != null) {
                    km0Var.f24754f.reset();
                    float width = getWidth() / km0Var.f24753c.getWidth();
                    km0Var.f24754f.postScale(width, width);
                    km0Var.d.setLocalMatrix(km0Var.f24754f);
                    km0Var.e.setAlpha((int) (km0Var.f24756r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), km0Var.e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = km0Var.E;
                if (drawable != null) {
                    drawable.setAlpha((int) (km0Var.f24756r * 255.0f));
                    canvas.save();
                    float f15 = km0Var.H;
                    float f16 = km0Var.G;
                    float f17 = km0Var.f24756r;
                    canvas.translate((f16 * f17) + f15, (0.0f * f17) + km0Var.I);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(km0Var.J, km0Var.K), Math.max(km0Var.J, km0Var.K), 0.75f), 1.0f, km0Var.f24756r);
                    canvas.scale(lerp, lerp, ((km0Var.E.getBounds().width() / 2.0f) * km0Var.J) + (-km0Var.H) + km0Var.E.getBounds().left, ((km0Var.E.getBounds().height() / 2.0f) * km0Var.K) + (-km0Var.I) + km0Var.E.getBounds().top);
                    bh.d dVar = km0Var.F;
                    if (dVar != null) {
                        dVar.setAlpha((int) (km0Var.f24756r * 255.0f));
                        km0Var.F.draw(canvas);
                    }
                    km0Var.E.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 19:
                zy0 zy0Var = (zy0) this.f3058b;
                xy0 xy0Var = zy0Var.f29832c;
                if (xy0Var != null && xy0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = zy0Var.T;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x10 = zy0Var.f29832c.getEditField().getX() + zy0Var.f29832c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = zy0Var.T;
                        zy0Var.f29829a0 = x10 + emojiSpan2.lastDrawX;
                        zy0Var.U = emojiSpan2.lastDrawY;
                    } else if (zy0Var.V != null && zy0Var.W != null) {
                        zy0Var.f29829a0 = zy0Var.f29832c.getEditField().getX() + zy0Var.f29832c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                if (zy0Var.f29838s && !zy0Var.v && (arrayList = zy0Var.f29839w) != null && !arrayList.isEmpty() && !zy0Var.f29840x) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.d6 d6Var = zy0Var.P;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float d = d6Var.d(f7, false);
                org.telegram.ui.Components.d6 d6Var2 = zy0Var.Q;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float d10 = d6Var2.d(f10, false);
                float d11 = zy0Var.f29831b0.d(zy0Var.f29829a0, false);
                if (d <= 0.0f && d10 <= 0.0f && !z10) {
                    zy0Var.d.setVisibility(8);
                }
                zy0Var.M.rewind();
                float left = zy0Var.e.getLeft();
                int left2 = zy0Var.e.getLeft();
                ArrayList arrayList2 = zy0Var.f29839w;
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                float D = org.telegram.messenger.a2.D(44.0f, size, left2);
                org.telegram.ui.Components.d6 d6Var3 = zy0Var.f29834d0;
                float f18 = d6Var3.f22295c;
                if (f18 <= 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                float f19 = D - left;
                if (f19 > 0.0f) {
                    f18 = d6Var3.d(f19, z11);
                }
                float d12 = zy0Var.f29833c0.d((left + D) / 2.0f, z11);
                xy0 xy0Var2 = zy0Var.f29832c;
                if (xy0Var2 != null && xy0Var2.getEditField() != null) {
                    int i11 = zy0Var.h;
                    if (i11 == 0) {
                        zy0Var.d.setTranslationY(((-zy0Var.f29832c.getEditField().getHeight()) - zy0Var.f29832c.getEditField().getScrollY()) + zy0Var.U + AndroidUtilities.dp(5.0f));
                    } else if (i11 == 1) {
                        zy0Var.d.setTranslationY(((-zy0Var.getMeasuredHeight()) - zy0Var.f29832c.getEditField().getScrollY()) + zy0Var.U + AndroidUtilities.dp(20.0f) + zy0Var.d.getHeight());
                    }
                }
                float f20 = f18 / 4.0f;
                float f21 = f18 / 2.0f;
                int max = (int) Math.max((zy0Var.f29829a0 - Math.max(f20, Math.min(f21, AndroidUtilities.dp(66.0f)))) - zy0Var.e.getLeft(), 0.0f);
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
                    zy0Var.O.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Be, zy0Var.f29830b));
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
                float f32 = zy0Var.f29834d0.f22295c;
                float f33 = zy0Var.f29833c0.f22295c;
                float f34 = f32 / 2.0f;
                float translationX2 = zy0Var.e.getTranslationX() + (f33 - f34) + zy0Var.e.getPaddingLeft();
                float paddingTop = zy0Var.e.getPaddingTop() + zy0Var.e.getTop();
                float min3 = Math.min(zy0Var.e.getTranslationX() + f33 + f34 + zy0Var.e.getPaddingLeft(), zy0Var.getWidth() - zy0Var.d.getPaddingRight());
                float bottom = zy0Var.e.getBottom();
                org.telegram.ui.Components.d6 d6Var4 = zy0Var.R;
                if (zy0Var.e.canScrollHorizontally(-1)) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                float d17 = d6Var4.d(f13, false);
                if (d17 > 0.0f) {
                    int i13 = (int) translationX2;
                    org.telegram.ui.ActionBar.j6.F4.setBounds(i13, (int) paddingTop, AndroidUtilities.dp(32.0f) + i13, (int) bottom);
                    org.telegram.ui.ActionBar.j6.F4.setAlpha((int) (d17 * f12));
                    org.telegram.ui.ActionBar.j6.F4.draw(canvas);
                }
                org.telegram.ui.Components.d6 d6Var5 = zy0Var.S;
                if (zy0Var.e.canScrollHorizontally(1)) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                float d18 = d6Var5.d(f14, false);
                if (d18 > 0.0f) {
                    int i14 = (int) min3;
                    org.telegram.ui.ActionBar.j6.E4.setBounds(i14 - AndroidUtilities.dp(32.0f), (int) paddingTop, i14, (int) bottom);
                    org.telegram.ui.ActionBar.j6.E4.setAlpha((int) (d18 * f12));
                    org.telegram.ui.ActionBar.j6.E4.draw(canvas);
                }
                canvas.restore();
                if (zy0Var.P.f22295c < f11) {
                    canvas.restore();
                    canvas.restore();
                    return;
                }
                return;
            case 24:
                pg.t2 t2Var = (pg.t2) this.f3058b;
                if (t2Var.f40311y > 0.0f && t2Var.f40308s != null) {
                    t2Var.v.reset();
                    float width2 = getWidth() / t2Var.f40306n.getWidth();
                    t2Var.v.postScale(width2, width2);
                    t2Var.f40307r.setLocalMatrix(t2Var.v);
                    t2Var.f40308s.setAlpha((int) (t2Var.f40311y * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), t2Var.f40308s);
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
        switch (this.f3057a) {
            case 16:
                ff ffVar = (ff) this.f3058b;
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
        switch (this.f3057a) {
            case 15:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((km0) this.f3058b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            case 24:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((pg.t2) this.f3058b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            default:
                return super.dispatchKeyEventPreIme(keyEvent);
        }
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f3057a) {
            case 1:
                if (((ci.j) this.f3058b).f4715e0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 7:
                if (motionEvent.getY() > getMeasuredHeight() - ((ll) this.f3058b).B0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f3057a) {
            case 7:
                canvas.save();
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                ll llVar = (ll) this.f3058b;
                boolean z10 = false;
                canvas.clipRect(0, 0, measuredWidth, measuredHeight - llVar.B0);
                if (!llVar.G) {
                    z10 = super.drawChild(canvas, view, j3);
                }
                canvas.restore();
                return z10;
            default:
                return super.drawChild(canvas, view, j3);
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f3057a) {
            case 10:
                zu zuVar = (zu) this.f3058b;
                o91 o91Var = zuVar.f29811c;
                tu tuVar = zuVar.f29810b;
                super.onDetachedFromWindow();
                try {
                    og0 og0Var = og0.f25781p0;
                    if (og0Var.P) {
                        if (tuVar.getVisibility() != 0) {
                        }
                        if (o91Var.f() && !og0Var.P) {
                            if (zu.S == zuVar) {
                                zu.S = null;
                            }
                            o91Var.b();
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
                    if (o91Var.f()) {
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
        x61 x61Var;
        ld ldVar;
        MediaController.CropState cropState;
        switch (this.f3057a) {
            case 5:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.h) this.f3058b) == null) {
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                    this.f3058b = hVar;
                    hVar.f28151k = false;
                    hVar.f28153m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.f3058b).f28147f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f3058b).a(AndroidUtilities.dp(4.0f), canvas, rectF, null);
                invalidate();
                return;
            case 6:
                ((org.telegram.ui.Components.ca) this.f3058b).e.a(canvas);
                return;
            case 7:
                ll llVar = (ll) this.f3058b;
                llVar.f25027d0.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17998h5, llVar.f26421a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - llVar.B0, llVar.f25027d0);
                return;
            case 17:
                mv0 mv0Var = (mv0) this.f3058b;
                Drawable drawable = mv0Var.d;
                drawable.setBounds(0, mv0Var.f25301f - mv0.n(mv0Var), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 20:
                Drawable drawable2 = ((x61) this.f3058b).f28959b;
                drawable2.setBounds(0, (int) ((x61Var.h - x61.n(x61Var)) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                drawable2.draw(canvas);
                return;
            case 22:
                pg.x1 x1Var = (pg.x1) this.f3058b;
                Rect rect = x1Var.E0;
                Rect rect2 = x1Var.D0;
                Paint paint = x1Var.F0;
                tv0 tv0Var = x1Var.f40365v0;
                Bitmap bitmap = x1Var.A0;
                if (x1Var.f40369z0 != null) {
                    canvas.save();
                    float e = x1Var.f40364u0.e(x1Var.f40363t0);
                    canvas.scale(1.0f - (e * 2.0f), 1.0f, tv0Var.f27499a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.a2.A(1.0f, e, 4.0f * e, 0.25f));
                    float e7 = x1Var.f40368y0.e(x1Var.f40367x0);
                    if (!x1Var.f40367x0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e7) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(ldVar.getWidth() / 2.0f, ldVar.getHeight() / 2.0f);
                            canvas.rotate(x1Var.f40366w0);
                            float max = Math.max(tv0Var.f27499a / bitmap.getWidth(), tv0Var.f27500b / bitmap.getHeight());
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
            case 23:
                pg.o2 o2Var = (pg.o2) this.f3058b;
                ImageReceiver imageReceiver = o2Var.f40246x0;
                tv0 tv0Var2 = o2Var.f40244v0;
                if (o2Var.f40245w0 != null) {
                    canvas.save();
                    float e10 = o2Var.f40243u0.e(o2Var.f40242t0);
                    canvas.scale(1.0f - (e10 * 2.0f), 1.0f, tv0Var2.f27499a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.a2.A(1.0f, e10, 4.0f * e10, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) tv0Var2.f27499a, (int) tv0Var2.f27500b);
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
        qg.r0 r0Var;
        qg.r0 r0Var2;
        switch (this.f3057a) {
            case 25:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                qg.s0 s0Var = (qg.s0) this.f3058b;
                if (s0Var.h && (r0Var2 = s0Var.e) != null) {
                    charSequence = r0Var2.getText();
                } else {
                    charSequence = null;
                }
                if (charSequence == null && (r0Var = s0Var.d) != null) {
                    charSequence = r0Var.getText();
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
        switch (this.f3057a) {
            case 7:
                if (motionEvent.getY() > getMeasuredHeight() - ((ll) this.f3058b).B0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 17:
                mv0 mv0Var = (mv0) this.f3058b;
                if (motionEvent.getAction() == 0 && mv0Var.f25301f != 0 && motionEvent.getY() < mv0Var.f25301f) {
                    mv0Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 20:
                x61 x61Var = (x61) this.f3058b;
                if (motionEvent.getAction() == 0 && x61Var.h != 0 && motionEvent.getY() < x61Var.h) {
                    x61Var.dismiss();
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
        switch (this.f3057a) {
            case 4:
                super.onLayout(z10, i10, i11, i12, i13);
                p30 p30Var = (p30) this.f3058b;
                p30Var.setTranslationY((getMeasuredHeight() * 0.28f) - (p30Var.getMeasuredWidth() / 2.0f));
                p30Var.setTranslationX((getMeasuredWidth() * 0.82f) - (p30Var.getMeasuredWidth() / 2.0f));
                return;
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(36.0f);
                int i17 = ((i12 - i10) - dp2) / 2;
                int i18 = ((i13 - i11) - dp2) / 2;
                ((org.telegram.ui.Components.ca) this.f3058b).e.f(i17, i18, i17 + dp2, dp2 + i18);
                return;
            case 8:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f3058b;
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
                int measuredHeight3 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.f21019q0.getMeasuredHeight()) - AndroidUtilities.dp(12.0f);
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.f21019q0;
                    textView.layout(measuredWidth - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.f21019q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f21019q0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.f21019q0;
                    textView2.layout(measuredWidth - (textView2.getMeasuredWidth() / 2), measuredHeight3, (chatAttachAlertPhotoLayout.f21019q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f21019q0.getMeasuredHeight() + measuredHeight3);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.f21008k0;
                shutterButton.layout(measuredWidth - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.f21008k0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f21008k0.getMeasuredWidth() / 2) + measuredWidth, (chatAttachAlertPhotoLayout.f21008k0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.f21021r0;
                imageView.layout(i14 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.f21021r0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f21021r0.getMeasuredWidth() / 2) + i14, (chatAttachAlertPhotoLayout.f21021r0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i21 = 0; i21 < 2; i21++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.S[i21];
                    imageView2.layout(dp - (imageView2.getMeasuredWidth() / 2), i15 - (chatAttachAlertPhotoLayout.S[i21].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.S[i21].getMeasuredWidth() / 2) + dp, (chatAttachAlertPhotoLayout.S[i21].getMeasuredHeight() / 2) + i15);
                }
                return;
            case 13:
                super.onLayout(z10, i10, i11, i12, i13);
                j30 j30Var = (j30) this.f3058b;
                ld ldVar = j30Var.f24211b;
                int[] iArr = j30Var.G;
                ldVar.getLocationOnScreen(iArr);
                j30Var.N = iArr[0];
                j30Var.M = iArr[1] - AndroidUtilities.dp(25.0f);
                return;
            case 15:
                super.onLayout(z10, i10, i11, i12, i13);
                km0 km0Var = (km0) this.f3058b;
                ld ldVar2 = km0Var.f24757s;
                aw0 aw0Var = km0Var.v;
                Drawable drawable = km0Var.E;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    FrameLayout frameLayout = km0Var.f24759x;
                    if (frameLayout != null) {
                        float f10 = km0Var.H;
                        float f11 = bounds.left + f10;
                        float f12 = bounds.right + f10;
                        float f13 = km0Var.I;
                        float f14 = bounds.top + f13;
                        float f15 = bounds.bottom + f13;
                        boolean z12 = false;
                        if (!km0Var.L) {
                            if (f12 - frameLayout.getMeasuredWidth() < AndroidUtilities.dp(8.0f)) {
                                km0Var.f24760y.setPivotX(AndroidUtilities.dp(6.0f));
                                km0Var.f24759x.setX(Math.min(aw0Var.getWidth() - km0Var.f24759x.getWidth(), f11 - AndroidUtilities.dp(10.0f)) - aw0Var.getX());
                                f7 = 4.0f;
                                z11 = false;
                            } else {
                                ViewGroup viewGroup = km0Var.f24760y;
                                viewGroup.setPivotX(viewGroup.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f7 = 4.0f;
                                km0Var.f24759x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f12) - km0Var.f24759x.getMeasuredWidth()) - aw0Var.getX());
                                z11 = true;
                            }
                            if (z11) {
                                x10 = ((km0Var.f24759x.getX() + km0Var.f24759x.getWidth()) - AndroidUtilities.dp(6.0f)) - f12;
                            } else {
                                x10 = (km0Var.f24759x.getX() + AndroidUtilities.dp(10.0f)) - f11;
                            }
                            km0Var.G = x10;
                        } else {
                            f7 = 4.0f;
                            z11 = false;
                        }
                        if (km0Var.F != null) {
                            i16 = AndroidUtilities.dp(21.0f);
                        } else {
                            i16 = 0;
                        }
                        float f16 = f15 + i16;
                        if (km0Var.f24759x.getMeasuredHeight() + f16 > ldVar2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            ViewGroup viewGroup2 = km0Var.f24760y;
                            viewGroup2.setPivotY(viewGroup2.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            km0Var.f24759x.setY(((f14 - AndroidUtilities.dp(f7)) - km0Var.f24759x.getMeasuredHeight()) - aw0Var.getY());
                            z12 = true;
                        } else {
                            km0Var.f24760y.setPivotY(AndroidUtilities.dp(6.0f));
                            km0Var.f24759x.setY(Math.min((ldVar2.getHeight() - km0Var.f24759x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), f16) - aw0Var.getY());
                        }
                        w70 w70Var = km0Var.f24758w;
                        w70Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = w70Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.f17520c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                        return;
                    }
                    return;
                }
                return;
            case 17:
                super.onLayout(z10, i10, i11, i12, i13);
                mv0.m((mv0) this.f3058b);
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
        di.f fVar;
        switch (this.f3057a) {
            case 5:
                if (View.MeasureSpec.getSize(i10) > AndroidUtilities.dp(260.0f)) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(320.0f), 1073741824), i11);
                    return;
                } else {
                    super.onMeasure(i10, i11);
                    return;
                }
            case 7:
                super.onMeasure(i10, i11);
                il ilVar = ((ll) this.f3058b).F;
                if (ilVar != null) {
                    ilVar.a();
                    return;
                }
                return;
            case 10:
                int size = View.MeasureSpec.getSize(i10);
                zu zuVar = (zu) this.f3058b;
                int min = (int) Math.min(zuVar.H / (zuVar.G / size), AndroidUtilities.displaySize.y / 2);
                if (zuVar.J) {
                    i12 = 22;
                } else {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 84) + min + 1, 1073741824));
                return;
            case 11:
                ry ryVar = (ry) this.f3058b;
                if (((View) ryVar.F.getParent()) != null) {
                    dp = (int) (view.getMeasuredHeight() - ryVar.F.getY());
                } else {
                    dp = AndroidUtilities.dp(120.0f);
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp - ryVar.F.f26801b1, 1073741824));
                return;
            case 12:
                rz rzVar = ((mz) this.f3058b).Q;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (em.y(8.0f, rzVar.D0.getMeasuredHeight() - rzVar.f26801b1, 3) * 1.7f), 1073741824));
                return;
            case 17:
                mv0 mv0Var = (mv0) this.f3058b;
                y1 y1Var = mv0Var.f25299b;
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
                getMeasuredWidth();
                int D = org.telegram.messenger.a2.D(54.0f, LocationController.getLocationsCount(), org.telegram.messenger.a2.C(56.0f, AndroidUtilities.dp(56.0f), 1));
                int i14 = size2 / 5;
                if (D < i14 * 3) {
                    i13 = AndroidUtilities.dp(8.0f);
                } else {
                    i13 = i14 * 2;
                    if (D < size2) {
                        i13 -= size2 - D;
                    }
                }
                if (y1Var.getPaddingTop() != i13) {
                    mv0Var.h = true;
                    y1Var.setPadding(0, i13, 0, AndroidUtilities.dp(8.0f));
                    mv0Var.h = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), 1073741824));
                return;
            case 19:
                zy0 zy0Var = (zy0) this.f3058b;
                int i15 = zy0Var.f29836n;
                if (zy0Var.h == 0) {
                    dp2 = AndroidUtilities.dp(8.0f);
                } else {
                    dp2 = AndroidUtilities.dp(6.66f);
                }
                int i16 = zy0Var.f29836n;
                if (zy0Var.h == 0) {
                    dp3 = AndroidUtilities.dp(6.66f);
                } else {
                    dp3 = AndroidUtilities.dp(8.0f);
                }
                setPadding(i15, dp2, i16, dp3);
                super.onMeasure(i10, i11);
                return;
            case 26:
                qg.a1 a1Var = (qg.a1) this.f3058b;
                z10 = ((org.telegram.ui.ActionBar.h3) a1Var).isPortrait;
                if (z10) {
                    a1Var.f40665s = View.MeasureSpec.getSize(i10);
                } else {
                    a1Var.f40665s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
                }
                super.onMeasure(i10, i11);
                return;
            case 27:
                super.onMeasure(i10, i11);
                qg.m1 m1Var = ((qg.l1) this.f3058b).f40804c;
                eg0 eg0Var = m1Var.f40828r0;
                if (eg0Var != null) {
                    top = eg0Var.getTop();
                    measuredHeight = m1Var.f40828r0.getMeasuredHeight();
                } else {
                    View view2 = m1Var.B0;
                    if (view2 != null) {
                        top = view2.getTop();
                        measuredHeight = m1Var.B0.getMeasuredHeight();
                    } else {
                        f7 = 0.0f;
                        m1Var.f40827q0.setTranslationY(f7 - (fVar.getMeasuredHeight() / 2.0f));
                        return;
                    }
                }
                f7 = (measuredHeight / 2.0f) + top;
                m1Var.f40827q0.setTranslationY(f7 - (fVar.getMeasuredHeight() / 2.0f));
                return;
            case 28:
                super.onMeasure(i10, i11);
                ((wh.h1) this.f3058b).K.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f3057a) {
            case 15:
                super.onSizeChanged(i10, i11, i12, i13);
                km0 km0Var = (km0) this.f3058b;
                fh.d.c(km0Var.h, km0Var.f24757s);
                ViewGroup viewGroup = km0Var.f24760y;
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
        switch (this.f3057a) {
            case 17:
                if (!((mv0) this.f3058b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 18:
            case 19:
            default:
                return super.onTouchEvent(motionEvent);
            case 20:
                if (!((x61) this.f3058b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 21:
                ((si1) this.f3058b).T.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f3057a) {
            case 14:
                vl0 vl0Var = (vl0) this.f3058b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(vl0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(vl0Var.getMeasuredHeight(), 1073741824));
                    layout(0, 0, vl0Var.f27963d1.getMeasuredWidth(), vl0Var.f27963d1.getMeasuredHeight());
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 15:
            case 16:
            default:
                super.requestLayout();
                return;
            case 17:
                if (!((mv0) this.f3058b).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 18:
                if (!((hy0) this.f3058b).f23812g0) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f3057a) {
            case 0:
                ce ceVar = (ce) this.f3058b;
                if (getTranslationY() != f7 && ceVar.f2439c1 != null) {
                    super.setTranslationY(f7);
                    ceVar.f2439c1.y();
                    return;
                }
                return;
            case 20:
                super.setTranslationY(f7);
                x61.m((x61) this.f3058b);
                return;
            case 29:
                super.setTranslationY(f7);
                xh.x3 x3Var = (xh.x3) this.f3058b;
                xh.j2 j2Var = x3Var.f46273d0;
                if (j2Var != null && j2Var.getVisibility() == 0) {
                    x3Var.f46273d0.invalidate();
                    return;
                }
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
        switch (this.f3057a) {
            case 13:
                super.setVisibility(i10);
                ((j30) this.f3058b).d.setVisibility(i10);
                return;
            case 19:
                zy0 zy0Var = (zy0) this.f3058b;
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
                                Drawable drawable = yy0Var.f29529b;
                                if (drawable instanceof org.telegram.ui.Components.p5) {
                                    ((org.telegram.ui.Components.p5) drawable).a(yy0Var);
                                }
                                yy0Var.f29530c = true;
                            } else {
                                yy0 yy0Var2 = (yy0) zy0Var.e.getChildAt(i11);
                                Drawable drawable2 = yy0Var2.f29529b;
                                if (drawable2 instanceof org.telegram.ui.Components.p5) {
                                    ((org.telegram.ui.Components.p5) drawable2).o(yy0Var2);
                                }
                                yy0Var2.f29530c = false;
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

    public ld(Object obj, Context context, int i10) {
        super(context);
        this.f3057a = i10;
        this.f3058b = obj;
    }

    public ld(pg.o2 o2Var, Context context) {
        super(context);
        this.f3057a = 23;
        this.f3058b = o2Var;
        setWillNotDraw(false);
    }

    public ld(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f3057a = 9;
        this.f3058b = new vo[2];
        int i10 = 0;
        while (true) {
            vo[] voVarArr = (vo[]) this.f3058b;
            if (i10 < voVarArr.length) {
                voVarArr[i10] = new vo(context, f6Var);
                addView(((vo[]) this.f3058b)[i10], w7.a6.e(-1, -1, 119));
                i10++;
            } else {
                voVarArr[0].setVisibility(0);
                ((vo[]) this.f3058b)[1].setVisibility(8);
                return;
            }
        }
    }

    public ld(pg.x1 x1Var, Context context) {
        super(context);
        this.f3057a = 22;
        this.f3058b = x1Var;
        setWillNotDraw(false);
    }

    public ld(Context context, p30 p30Var) {
        super(context);
        this.f3057a = 4;
        this.f3058b = p30Var;
    }
}
