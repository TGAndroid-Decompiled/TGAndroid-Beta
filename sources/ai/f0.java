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
import org.telegram.ui.Components.a30;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.el;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.fy0;
import org.telegram.ui.Components.g30;
import org.telegram.ui.Components.gz;
import org.telegram.ui.Components.hl;
import org.telegram.ui.Components.ly;
import org.telegram.ui.Components.lz;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nv0;
import org.telegram.ui.Components.o91;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.ro;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.uv0;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.wu;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.y70;
import org.telegram.ui.fi1;
import org.telegram.ui.yf0;
public final class f0 extends FrameLayout {
    public final int f865a;
    public Object f866b;

    public f0(Context context, int i10) {
        super(context);
        this.f865a = i10;
    }

    public ro a() {
        return ((ro[]) this.f866b)[0];
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
        ro[] roVarArr = (ro[]) this.f866b;
        ro roVar = roVarArr[0];
        ro roVar2 = roVarArr[1];
        roVarArr[0] = roVar2;
        roVarArr[1] = roVar;
        roVar2.f28019n = true;
        roVar2.setVisibility(0);
        roVarArr[0].setScaleX(0.8f);
        roVarArr[0].setScaleY(0.8f);
        roVarArr[0].setAlpha(0.0f);
        roVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = roVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        rr rrVar = rr.h;
        ok.s(translationY, rrVar, 320L);
        ro roVar3 = roVarArr[1];
        roVar3.f28019n = false;
        roVar3.setVisibility(0);
        roVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(rrVar).setDuration(320L).withEndAction(new pg(roVar3, 28)).start();
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
                mm0 mm0Var = (mm0) this.f866b;
                if (mm0Var.f26547r > 0.0f && mm0Var.e != null) {
                    mm0Var.f26545f.reset();
                    float width = getWidth() / mm0Var.f26544c.getWidth();
                    mm0Var.f26545f.postScale(width, width);
                    mm0Var.d.setLocalMatrix(mm0Var.f26545f);
                    mm0Var.e.setAlpha((int) (mm0Var.f26547r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), mm0Var.e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = mm0Var.E;
                if (drawable != null) {
                    drawable.setAlpha((int) (mm0Var.f26547r * 255.0f));
                    canvas.save();
                    float f15 = mm0Var.H;
                    float f16 = mm0Var.G;
                    float f17 = mm0Var.f26547r;
                    canvas.translate((f16 * f17) + f15, (0.0f * f17) + mm0Var.I);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(mm0Var.J, mm0Var.K), Math.max(mm0Var.J, mm0Var.K), 0.75f), 1.0f, mm0Var.f26547r);
                    canvas.scale(lerp, lerp, ((mm0Var.E.getBounds().width() / 2.0f) * mm0Var.J) + (-mm0Var.H) + mm0Var.E.getBounds().left, ((mm0Var.E.getBounds().height() / 2.0f) * mm0Var.K) + (-mm0Var.I) + mm0Var.E.getBounds().top);
                    ch.d dVar = mm0Var.F;
                    if (dVar != null) {
                        dVar.setAlpha((int) (mm0Var.f26547r * 255.0f));
                        mm0Var.F.draw(canvas);
                    }
                    mm0Var.E.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 21:
                xy0 xy0Var = (xy0) this.f866b;
                vy0 vy0Var = xy0Var.f30430c;
                if (vy0Var != null && vy0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = xy0Var.T;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x10 = xy0Var.f30430c.getEditField().getX() + xy0Var.f30430c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = xy0Var.T;
                        xy0Var.f30427a0 = x10 + emojiSpan2.lastDrawX;
                        xy0Var.U = emojiSpan2.lastDrawY;
                    } else if (xy0Var.V != null && xy0Var.W != null) {
                        xy0Var.f30427a0 = xy0Var.f30430c.getEditField().getX() + xy0Var.f30430c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                if (xy0Var.f30436s && !xy0Var.v && (arrayList = xy0Var.f30437w) != null && !arrayList.isEmpty() && !xy0Var.f30438x) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                org.telegram.ui.Components.e6 e6Var = xy0Var.P;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float d = e6Var.d(f7, false);
                org.telegram.ui.Components.e6 e6Var2 = xy0Var.Q;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float d10 = e6Var2.d(f10, false);
                float d11 = xy0Var.f30429b0.d(xy0Var.f30427a0, false);
                if (d <= 0.0f && d10 <= 0.0f && !z10) {
                    xy0Var.d.setVisibility(8);
                }
                xy0Var.M.rewind();
                float left = xy0Var.e.getLeft();
                int left2 = xy0Var.e.getLeft();
                ArrayList arrayList2 = xy0Var.f30437w;
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                float D = org.telegram.messenger.f0.D(44.0f, size, left2);
                org.telegram.ui.Components.e6 e6Var3 = xy0Var.f30432d0;
                float f18 = e6Var3.f23845c;
                if (f18 <= 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                float f19 = D - left;
                if (f19 > 0.0f) {
                    f18 = e6Var3.d(f19, z11);
                }
                float d12 = xy0Var.f30431c0.d((left + D) / 2.0f, z11);
                vy0 vy0Var2 = xy0Var.f30430c;
                if (vy0Var2 != null && vy0Var2.getEditField() != null) {
                    int i11 = xy0Var.h;
                    if (i11 == 0) {
                        xy0Var.d.setTranslationY(((-xy0Var.f30430c.getEditField().getHeight()) - xy0Var.f30430c.getEditField().getScrollY()) + xy0Var.U + AndroidUtilities.dp(5.0f));
                    } else if (i11 == 1) {
                        xy0Var.d.setTranslationY(((-xy0Var.getMeasuredHeight()) - xy0Var.f30430c.getEditField().getScrollY()) + xy0Var.U + AndroidUtilities.dp(20.0f) + xy0Var.d.getHeight());
                    }
                }
                float f20 = f18 / 4.0f;
                float f21 = f18 / 2.0f;
                int max = (int) Math.max((xy0Var.f30427a0 - Math.max(f20, Math.min(f21, AndroidUtilities.dp(66.0f)))) - xy0Var.e.getLeft(), 0.0f);
                if (xy0Var.e.getPaddingLeft() != max) {
                    f11 = 1.0f;
                    xy0Var.e.setPadding(max, 0, 0, 0);
                    xy0Var.e.scrollBy(xy0Var.e.getPaddingLeft() - max, 0);
                } else {
                    f11 = 1.0f;
                }
                xy0Var.e.setTranslationX(((int) Math.max((d11 - Math.max(f20, Math.min(f21, AndroidUtilities.dp(66.0f)))) - xy0Var.e.getLeft(), 0.0f)) - max);
                float translationX = xy0Var.e.getTranslationX() + (d12 - f21) + xy0Var.e.getPaddingLeft();
                float translationY = xy0Var.e.getTranslationY() + xy0Var.e.getTop() + xy0Var.e.getPaddingTop();
                if (xy0Var.h == 0) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(6.66f);
                }
                float f22 = translationY + dp;
                float min = Math.min(xy0Var.e.getTranslationX() + d12 + f21 + xy0Var.e.getPaddingLeft(), xy0Var.getWidth() - xy0Var.d.getPaddingRight());
                float translationY2 = xy0Var.e.getTranslationY() + xy0Var.e.getBottom();
                if (xy0Var.h == 0) {
                    i10 = AndroidUtilities.dp(6.66f);
                } else {
                    i10 = 0;
                }
                float f23 = translationY2 - i10;
                float min2 = Math.min(AndroidUtilities.dp(9.0f), f21) * 2.0f;
                int i12 = xy0Var.h;
                if (i12 == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f24 = f23 - min2;
                    float f25 = translationX + min2;
                    rectF.set(translationX, f24, f25, f23);
                    xy0Var.M.arcTo(rectF, 90.0f, 90.0f);
                    float f26 = f22 + min2;
                    rectF.set(translationX, f22, f25, f26);
                    xy0Var.M.arcTo(rectF, -180.0f, 90.0f);
                    float f27 = min - min2;
                    rectF.set(f27, f22, min, f26);
                    xy0Var.M.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f27, f24, min, f23);
                    xy0Var.M.arcTo(rectF, 0.0f, 90.0f);
                    xy0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, f23);
                    xy0Var.M.lineTo(d11, AndroidUtilities.dp(6.66f) + f23);
                    xy0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), f23);
                } else if (i12 == 1) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f28 = min - min2;
                    float f29 = f22 + min2;
                    rectF2.set(f28, f22, min, f29);
                    xy0Var.M.arcTo(rectF2, -90.0f, 90.0f);
                    float f30 = f23 - min2;
                    rectF2.set(f28, f30, min, f23);
                    xy0Var.M.arcTo(rectF2, 0.0f, 90.0f);
                    float f31 = min2 + translationX;
                    rectF2.set(translationX, f30, f31, f23);
                    xy0Var.M.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, f22, f31, f29);
                    xy0Var.M.arcTo(rectF2, -180.0f, 90.0f);
                    xy0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), f22);
                    xy0Var.M.lineTo(d11, f22 - AndroidUtilities.dp(6.66f));
                    xy0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, f22);
                }
                xy0Var.M.close();
                if (xy0Var.O == null) {
                    Paint paint = new Paint(1);
                    xy0Var.O = paint;
                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.0f)));
                    xy0Var.O.setShadowLayer(AndroidUtilities.dp(4.33f), 0.0f, AndroidUtilities.dp(0.33333334f), 855638016);
                    xy0Var.O.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Be, xy0Var.f30428b));
                }
                if (d < f11) {
                    xy0Var.N.rewind();
                    if (xy0Var.h == 0) {
                        dp2 = AndroidUtilities.dp(6.66f) + f23;
                    } else {
                        dp2 = f22 - AndroidUtilities.dp(6.66f);
                    }
                    double d13 = d11 - translationX;
                    double d14 = dp2 - f22;
                    f12 = 255.0f;
                    double d15 = d11 - min;
                    double d16 = dp2 - f23;
                    xy0Var.N.addCircle(d11, dp2, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d14, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d14, 2.0d) + Math.pow(d15, 2.0d)), Math.max(Math.pow(d16, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d16, 2.0d) + Math.pow(d15, 2.0d))))) * d, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(xy0Var.N);
                    canvas.saveLayerAlpha(0.0f, 0.0f, xy0Var.getWidth(), xy0Var.getHeight(), (int) (d * 255.0f), 31);
                } else {
                    f12 = 255.0f;
                }
                canvas.drawPath(xy0Var.M, xy0Var.O);
                canvas.save();
                canvas.clipPath(xy0Var.M);
                super.dispatchDraw(canvas);
                float f32 = xy0Var.f30432d0.f23845c;
                float f33 = xy0Var.f30431c0.f23845c;
                float f34 = f32 / 2.0f;
                float translationX2 = xy0Var.e.getTranslationX() + (f33 - f34) + xy0Var.e.getPaddingLeft();
                float paddingTop = xy0Var.e.getPaddingTop() + xy0Var.e.getTop();
                float min3 = Math.min(xy0Var.e.getTranslationX() + f33 + f34 + xy0Var.e.getPaddingLeft(), xy0Var.getWidth() - xy0Var.d.getPaddingRight());
                float bottom = xy0Var.e.getBottom();
                org.telegram.ui.Components.e6 e6Var4 = xy0Var.R;
                if (xy0Var.e.canScrollHorizontally(-1)) {
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
                org.telegram.ui.Components.e6 e6Var5 = xy0Var.S;
                if (xy0Var.e.canScrollHorizontally(1)) {
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
                if (xy0Var.P.f23845c < f11) {
                    canvas.restore();
                    canvas.restore();
                    return;
                }
                return;
            case 26:
                qg.t2 t2Var = (qg.t2) this.f866b;
                if (t2Var.f41948y > 0.0f && t2Var.f41945s != null) {
                    t2Var.v.reset();
                    float width2 = getWidth() / t2Var.f41943n.getWidth();
                    t2Var.v.postScale(width2, width2);
                    t2Var.f41944r.setLocalMatrix(t2Var.v);
                    t2Var.f41945s.setAlpha((int) (t2Var.f41948y * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), t2Var.f41945s);
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
                    ((mm0) this.f866b).onBackPressed();
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
                if (motionEvent.getY() > getMeasuredHeight() - ((hl) this.f866b).B0) {
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
                hl hlVar = (hl) this.f866b;
                boolean z10 = false;
                canvas.clipRect(0, 0, measuredWidth, measuredHeight - hlVar.B0);
                if (!hlVar.G) {
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
                wu wuVar = (wu) this.f866b;
                o91 o91Var = wuVar.f30185c;
                qu quVar = wuVar.f30184b;
                super.onDetachedFromWindow();
                try {
                    og0 og0Var = og0.f27047p0;
                    if (og0Var.P) {
                        if (quVar.getVisibility() != 0) {
                        }
                        if (o91Var.f() && !og0Var.P) {
                            if (wu.S == wuVar) {
                                wu.S = null;
                            }
                            o91Var.b();
                            return;
                        }
                        return;
                    }
                    if (quVar.getParent() != null) {
                        removeView(quVar);
                        quVar.stopLoading();
                        quVar.loadUrl("about:blank");
                        quVar.destroy();
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
        f0 f0Var;
        MediaController.CropState cropState;
        switch (this.f865a) {
            case 7:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.h) this.f866b) == null) {
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                    this.f866b = hVar;
                    hVar.f29372k = false;
                    hVar.f29374m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.f866b).f29368f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f866b).a(AndroidUtilities.dp(4.0f), canvas, rectF, null);
                invalidate();
                return;
            case 8:
                ((org.telegram.ui.Components.da) this.f866b).e.a(canvas);
                return;
            case 9:
                hl hlVar = (hl) this.f866b;
                hlVar.f24801d0.setColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19130h5, hlVar.f27087a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - hlVar.B0, hlVar.f24801d0);
                return;
            case 19:
                nv0 nv0Var = (nv0) this.f866b;
                Drawable drawable = nv0Var.d;
                drawable.setBounds(0, nv0Var.f26810f - nv0.n(nv0Var), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 22:
                Drawable drawable2 = ((x61) this.f866b).f30273b;
                drawable2.setBounds(0, (int) ((x61Var.h - x61.n(x61Var)) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                drawable2.draw(canvas);
                return;
            case 24:
                qg.y1 y1Var = (qg.y1) this.f866b;
                Rect rect = y1Var.E0;
                Rect rect2 = y1Var.D0;
                Paint paint = y1Var.F0;
                uv0 uv0Var = y1Var.f42011v0;
                Bitmap bitmap = y1Var.A0;
                if (y1Var.f42015z0 != null) {
                    canvas.save();
                    float e = y1Var.f42010u0.e(y1Var.f42009t0);
                    canvas.scale(1.0f - (e * 2.0f), 1.0f, uv0Var.f28933a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.f0.z(1.0f, e, 4.0f * e, 0.25f));
                    float e7 = y1Var.f42014y0.e(y1Var.f42013x0);
                    if (!y1Var.f42013x0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e7) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(f0Var.getWidth() / 2.0f, f0Var.getHeight() / 2.0f);
                            canvas.rotate(y1Var.f42012w0);
                            float max = Math.max(uv0Var.f28933a / bitmap.getWidth(), uv0Var.f28934b / bitmap.getHeight());
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
                ImageReceiver imageReceiver = o2Var.f41853x0;
                uv0 uv0Var2 = o2Var.f41851v0;
                if (o2Var.f41852w0 != null) {
                    canvas.save();
                    float e10 = o2Var.f41850u0.e(o2Var.f41849t0);
                    canvas.scale(1.0f - (e10 * 2.0f), 1.0f, uv0Var2.f28933a / 2.0f, 0.0f);
                    canvas.skew(0.0f, org.telegram.messenger.f0.z(1.0f, e10, 4.0f * e10, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) uv0Var2.f28933a, (int) uv0Var2.f28934b);
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
                if (motionEvent.getY() > getMeasuredHeight() - ((hl) this.f866b).B0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 19:
                nv0 nv0Var = (nv0) this.f866b;
                if (motionEvent.getAction() == 0 && nv0Var.f26810f != 0 && motionEvent.getY() < nv0Var.f26810f) {
                    nv0Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 22:
                x61 x61Var = (x61) this.f866b;
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
        switch (this.f865a) {
            case 6:
                super.onLayout(z10, i10, i11, i12, i13);
                g30 g30Var = (g30) this.f866b;
                g30Var.setTranslationY((getMeasuredHeight() * 0.28f) - (g30Var.getMeasuredWidth() / 2.0f));
                g30Var.setTranslationX((getMeasuredWidth() * 0.82f) - (g30Var.getMeasuredWidth() / 2.0f));
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
                int measuredHeight3 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.f22157q0.getMeasuredHeight()) - AndroidUtilities.dp(12.0f);
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.f22157q0;
                    textView.layout(measuredWidth - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.f22157q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f22157q0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.f22157q0;
                    textView2.layout(measuredWidth - (textView2.getMeasuredWidth() / 2), measuredHeight3, (chatAttachAlertPhotoLayout.f22157q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f22157q0.getMeasuredHeight() + measuredHeight3);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.f22146k0;
                shutterButton.layout(measuredWidth - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.f22146k0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f22146k0.getMeasuredWidth() / 2) + measuredWidth, (chatAttachAlertPhotoLayout.f22146k0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.f22159r0;
                imageView.layout(i14 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.f22159r0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f22159r0.getMeasuredWidth() / 2) + i14, (chatAttachAlertPhotoLayout.f22159r0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i21 = 0; i21 < 2; i21++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.S[i21];
                    imageView2.layout(dp - (imageView2.getMeasuredWidth() / 2), i15 - (chatAttachAlertPhotoLayout.S[i21].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.S[i21].getMeasuredWidth() / 2) + dp, (chatAttachAlertPhotoLayout.S[i21].getMeasuredHeight() / 2) + i15);
                }
                return;
            case 15:
                super.onLayout(z10, i10, i11, i12, i13);
                a30 a30Var = (a30) this.f866b;
                f0 f0Var = a30Var.f22575b;
                int[] iArr = a30Var.G;
                f0Var.getLocationOnScreen(iArr);
                a30Var.N = iArr[0];
                a30Var.M = iArr[1] - AndroidUtilities.dp(25.0f);
                return;
            case 17:
                super.onLayout(z10, i10, i11, i12, i13);
                mm0 mm0Var = (mm0) this.f866b;
                f0 f0Var2 = mm0Var.f26548s;
                aw0 aw0Var = mm0Var.v;
                Drawable drawable = mm0Var.E;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    FrameLayout frameLayout = mm0Var.f26550x;
                    if (frameLayout != null) {
                        float f10 = mm0Var.H;
                        float f11 = bounds.left + f10;
                        float f12 = bounds.right + f10;
                        float f13 = mm0Var.I;
                        float f14 = bounds.top + f13;
                        float f15 = bounds.bottom + f13;
                        boolean z12 = false;
                        if (!mm0Var.L) {
                            if (f12 - frameLayout.getMeasuredWidth() < AndroidUtilities.dp(8.0f)) {
                                mm0Var.f26551y.setPivotX(AndroidUtilities.dp(6.0f));
                                mm0Var.f26550x.setX(Math.min(aw0Var.getWidth() - mm0Var.f26550x.getWidth(), f11 - AndroidUtilities.dp(10.0f)) - aw0Var.getX());
                                f7 = 4.0f;
                                z11 = false;
                            } else {
                                ViewGroup viewGroup = mm0Var.f26551y;
                                viewGroup.setPivotX(viewGroup.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f7 = 4.0f;
                                mm0Var.f26550x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f12) - mm0Var.f26550x.getMeasuredWidth()) - aw0Var.getX());
                                z11 = true;
                            }
                            if (z11) {
                                x10 = ((mm0Var.f26550x.getX() + mm0Var.f26550x.getWidth()) - AndroidUtilities.dp(6.0f)) - f12;
                            } else {
                                x10 = (mm0Var.f26550x.getX() + AndroidUtilities.dp(10.0f)) - f11;
                            }
                            mm0Var.G = x10;
                        } else {
                            f7 = 4.0f;
                            z11 = false;
                        }
                        if (mm0Var.F != null) {
                            i16 = AndroidUtilities.dp(21.0f);
                        } else {
                            i16 = 0;
                        }
                        float f16 = f15 + i16;
                        if (mm0Var.f26550x.getMeasuredHeight() + f16 > f0Var2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            ViewGroup viewGroup2 = mm0Var.f26551y;
                            viewGroup2.setPivotY(viewGroup2.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            mm0Var.f26550x.setY(((f14 - AndroidUtilities.dp(f7)) - mm0Var.f26550x.getMeasuredHeight()) - aw0Var.getY());
                            z12 = true;
                        } else {
                            mm0Var.f26551y.setPivotY(AndroidUtilities.dp(6.0f));
                            mm0Var.f26550x.setY(Math.min((f0Var2.getHeight() - mm0Var.f26550x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), f16) - aw0Var.getY());
                        }
                        y70 y70Var = mm0Var.f26549w;
                        y70Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = y70Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.f18654c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                        return;
                    }
                    return;
                }
                return;
            case 19:
                super.onLayout(z10, i10, i11, i12, i13);
                nv0.m((nv0) this.f866b);
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
                el elVar = ((hl) this.f866b).F;
                if (elVar != null) {
                    elVar.a();
                    return;
                }
                return;
            case 12:
                int size = View.MeasureSpec.getSize(i10);
                wu wuVar = (wu) this.f866b;
                int min = (int) Math.min(wuVar.H / (wuVar.G / size), AndroidUtilities.displaySize.y / 2);
                if (wuVar.J) {
                    i12 = 22;
                } else {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 84) + min + 1, 1073741824));
                return;
            case 13:
                ly lyVar = (ly) this.f866b;
                if (((View) lyVar.F.getParent()) != null) {
                    dp = (int) (view.getMeasuredHeight() - lyVar.F.getY());
                } else {
                    dp = AndroidUtilities.dp(120.0f);
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp - lyVar.F.f26233b1, 1073741824));
                return;
            case 14:
                lz lzVar = ((gz) this.f866b).Q;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (ok.A(8.0f, lzVar.D0.getMeasuredHeight() - lzVar.f26233b1, 3) * 1.7f), 1073741824));
                return;
            case 19:
                nv0 nv0Var = (nv0) this.f866b;
                w0 w0Var = nv0Var.f26808b;
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
                    nv0Var.h = true;
                    w0Var.setPadding(0, i13, 0, AndroidUtilities.dp(8.0f));
                    nv0Var.h = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), 1073741824));
                return;
            case 21:
                xy0 xy0Var = (xy0) this.f866b;
                int i15 = xy0Var.f30434n;
                if (xy0Var.h == 0) {
                    dp2 = AndroidUtilities.dp(8.0f);
                } else {
                    dp2 = AndroidUtilities.dp(6.66f);
                }
                int i16 = xy0Var.f30434n;
                if (xy0Var.h == 0) {
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
                    x0Var.f42827s = View.MeasureSpec.getSize(i10);
                } else {
                    x0Var.f42827s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
                }
                super.onMeasure(i10, i11);
                return;
            case 29:
                super.onMeasure(i10, i11);
                rg.k1 k1Var = ((rg.j1) this.f866b).f42620c;
                yf0 yf0Var = k1Var.f42645r0;
                if (yf0Var != null) {
                    top = yf0Var.getTop();
                    measuredHeight = k1Var.f42645r0.getMeasuredHeight();
                } else {
                    View view2 = k1Var.B0;
                    if (view2 != null) {
                        top = view2.getTop();
                        measuredHeight = k1Var.B0.getMeasuredHeight();
                    } else {
                        f7 = 0.0f;
                        k1Var.f42644q0.setTranslationY(f7 - (fVar.getMeasuredHeight() / 2.0f));
                        return;
                    }
                }
                f7 = (measuredHeight / 2.0f) + top;
                k1Var.f42644q0.setTranslationY(f7 - (fVar.getMeasuredHeight() / 2.0f));
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
                mm0 mm0Var = (mm0) this.f866b;
                gh.d.c(mm0Var.h, mm0Var.f26548s);
                ViewGroup viewGroup = mm0Var.f26551y;
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
                if (!((nv0) this.f866b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 20:
            case 21:
            default:
                return super.onTouchEvent(motionEvent);
            case 22:
                if (!((x61) this.f866b).isDismissed() && super.onTouchEvent(motionEvent)) {
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
                wl0 wl0Var = (wl0) this.f866b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(wl0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(wl0Var.getMeasuredHeight(), 1073741824));
                    layout(0, 0, wl0Var.f30091d1.getMeasuredWidth(), wl0Var.f30091d1.getMeasuredHeight());
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
                if (!((nv0) this.f866b).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 20:
                if (!((fy0) this.f866b).f24295g0) {
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
                x61.m((x61) this.f866b);
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
                ((a30) this.f866b).d.setVisibility(i10);
                return;
            case 21:
                xy0 xy0Var = (xy0) this.f866b;
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
                    if (xy0Var.e != null) {
                        for (int i11 = 0; i11 < xy0Var.e.getChildCount(); i11++) {
                            if (z11) {
                                wy0 wy0Var = (wy0) xy0Var.e.getChildAt(i11);
                                Drawable drawable = wy0Var.f30205b;
                                if (drawable instanceof org.telegram.ui.Components.q5) {
                                    ((org.telegram.ui.Components.q5) drawable).a(wy0Var);
                                }
                                wy0Var.f30206c = true;
                            } else {
                                wy0 wy0Var2 = (wy0) xy0Var.e.getChildAt(i11);
                                Drawable drawable2 = wy0Var2.f30205b;
                                if (drawable2 instanceof org.telegram.ui.Components.q5) {
                                    ((org.telegram.ui.Components.q5) drawable2).o(wy0Var2);
                                }
                                wy0Var2.f30206c = false;
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
        this.f866b = new ro[2];
        int i10 = 0;
        while (true) {
            ro[] roVarArr = (ro[]) this.f866b;
            if (i10 < roVarArr.length) {
                roVarArr[i10] = new ro(context, d6Var);
                addView(((ro[]) this.f866b)[i10], w7.y5.e(-1, -1, 119));
                i10++;
            } else {
                roVarArr[0].setVisibility(0);
                ((ro[]) this.f866b)[1].setVisibility(8);
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
        int i10 = org.telegram.ui.ActionBar.h6.f19166j5;
        setBackground(org.telegram.ui.ActionBar.h6.b0(dp, org.telegram.ui.ActionBar.h6.l1(0.06f, dVar.G0(i10))));
        LinearLayout f7 = ok.f(context, 1);
        addView(f7, w7.y5.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(context, false, true, true);
        this.f866b = p6Var;
        p6Var.b(0.6f, 450L, rr.h);
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

    public f0(Context context, g30 g30Var) {
        super(context);
        this.f865a = 6;
        this.f866b = g30Var;
    }
}
