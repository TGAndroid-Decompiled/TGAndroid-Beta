package ah;

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
import bi.a2;
import di.pc;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.w1;
import org.telegram.messenger.wl;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ShutterButton;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.b91;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.dl;
import org.telegram.ui.Components.e6;
import org.telegram.ui.Components.eg0;
import org.telegram.ui.Components.f30;
import org.telegram.ui.Components.ff;
import org.telegram.ui.Components.fz;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.ky;
import org.telegram.ui.Components.ky0;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ly0;
import org.telegram.ui.Components.my0;
import org.telegram.ui.Components.n70;
import org.telegram.ui.Components.nu;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.pg;
import org.telegram.ui.Components.po;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q5;
import org.telegram.ui.Components.q6;
import org.telegram.ui.Components.tu;
import org.telegram.ui.Components.ux0;
import org.telegram.ui.Components.z20;
import org.telegram.ui.ni1;
import rg.q2;
import rg.v2;
import rg.z1;
import w7.x5;
public final class y extends FrameLayout {
    public final int f717a;
    public Object f718b;

    public y(Context context, int i10) {
        super(context);
        this.f717a = i10;
    }

    public po a() {
        return ((po[]) this.f718b)[0];
    }

    @Override
    public void addView(View view, int i10, int i11) {
        switch (this.f717a) {
            case 6:
                super.addView(view, i10, i11);
                ((ih.g) this.f718b).e();
                return;
            default:
                super.addView(view, i10, i11);
                return;
        }
    }

    public void b() {
        po[] poVarArr = (po[]) this.f718b;
        po poVar = poVarArr[0];
        po poVar2 = poVarArr[1];
        poVarArr[0] = poVar2;
        poVarArr[1] = poVar;
        poVar2.f29449n = true;
        poVar2.setVisibility(0);
        poVarArr[0].setScaleX(0.8f);
        poVarArr[0].setScaleY(0.8f);
        poVarArr[0].setAlpha(0.0f);
        poVarArr[0].setTranslationY(AndroidUtilities.dp(20.0f));
        ViewPropertyAnimator translationY = poVarArr[0].animate().scaleX(1.0f).scaleY(1.0f).alpha(1.0f).translationY(0.0f);
        pr prVar = pr.h;
        wl.q(translationY, prVar, 320L);
        po poVar3 = poVarArr[1];
        poVar3.f29449n = false;
        poVar3.setVisibility(0);
        poVarArr[1].animate().scaleX(0.8f).scaleY(0.8f).alpha(0.0f).translationY(-AndroidUtilities.dp(20.0f)).setInterpolator(prVar).setDuration(320L).withEndAction(new pg(poVar3, 28)).start();
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
        switch (this.f717a) {
            case 18:
                am0 am0Var = (am0) this.f718b;
                if (am0Var.f24423r > 0.0f && am0Var.f24420e != null) {
                    am0Var.f24421f.reset();
                    float width = getWidth() / am0Var.f24419c.getWidth();
                    am0Var.f24421f.postScale(width, width);
                    am0Var.d.setLocalMatrix(am0Var.f24421f);
                    am0Var.f24420e.setAlpha((int) (am0Var.f24423r * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), am0Var.f24420e);
                }
                super.dispatchDraw(canvas);
                Drawable drawable = am0Var.E;
                if (drawable != null) {
                    drawable.setAlpha((int) (am0Var.f24423r * 255.0f));
                    canvas.save();
                    float f15 = am0Var.H;
                    float f16 = am0Var.G;
                    float f17 = am0Var.f24423r;
                    canvas.translate((f16 * f17) + f15, (0.0f * f17) + am0Var.I);
                    float lerp = AndroidUtilities.lerp(AndroidUtilities.lerp(Math.min(am0Var.J, am0Var.K), Math.max(am0Var.J, am0Var.K), 0.75f), 1.0f, am0Var.f24423r);
                    canvas.scale(lerp, lerp, ((am0Var.E.getBounds().width() / 2.0f) * am0Var.J) + (-am0Var.H) + am0Var.E.getBounds().left, ((am0Var.E.getBounds().height() / 2.0f) * am0Var.K) + (-am0Var.I) + am0Var.E.getBounds().top);
                    dh.d dVar = am0Var.F;
                    if (dVar != null) {
                        dVar.setAlpha((int) (am0Var.f24423r * 255.0f));
                        am0Var.F.draw(canvas);
                    }
                    am0Var.E.draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 22:
                my0 my0Var = (my0) this.f718b;
                ky0 ky0Var = my0Var.f28559c;
                if (ky0Var != null && ky0Var.getEditField() != null) {
                    Emoji.EmojiSpan emojiSpan = my0Var.T;
                    if (emojiSpan != null && emojiSpan.drawn) {
                        float x10 = my0Var.f28559c.getEditField().getX() + my0Var.f28559c.getEditField().getPaddingLeft();
                        Emoji.EmojiSpan emojiSpan2 = my0Var.T;
                        my0Var.f28556a0 = x10 + emojiSpan2.lastDrawX;
                        my0Var.U = emojiSpan2.lastDrawY;
                    } else if (my0Var.V != null && my0Var.W != null) {
                        my0Var.f28556a0 = my0Var.f28559c.getEditField().getX() + my0Var.f28559c.getEditField().getPaddingLeft() + AndroidUtilities.dp(12.0f);
                    }
                }
                if (my0Var.f28566s && !my0Var.v && (arrayList = my0Var.f28567w) != null && !arrayList.isEmpty() && !my0Var.f28568x) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e6 e6Var = my0Var.P;
                if (z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                float d = e6Var.d(f7, false);
                e6 e6Var2 = my0Var.Q;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                float d10 = e6Var2.d(f10, false);
                float d11 = my0Var.f28558b0.d(my0Var.f28556a0, false);
                if (d <= 0.0f && d10 <= 0.0f && !z10) {
                    my0Var.d.setVisibility(8);
                }
                my0Var.M.rewind();
                float left = my0Var.f28562e.getLeft();
                int left2 = my0Var.f28562e.getLeft();
                ArrayList arrayList2 = my0Var.f28567w;
                if (arrayList2 == null) {
                    size = 0;
                } else {
                    size = arrayList2.size();
                }
                float D = w1.D(44.0f, size, left2);
                e6 e6Var3 = my0Var.f28561d0;
                float f18 = e6Var3.f25565c;
                if (f18 <= 0.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                float f19 = D - left;
                if (f19 > 0.0f) {
                    f18 = e6Var3.d(f19, z11);
                }
                float d12 = my0Var.f28560c0.d((left + D) / 2.0f, z11);
                ky0 ky0Var2 = my0Var.f28559c;
                if (ky0Var2 != null && ky0Var2.getEditField() != null) {
                    int i11 = my0Var.h;
                    if (i11 == 0) {
                        my0Var.d.setTranslationY(((-my0Var.f28559c.getEditField().getHeight()) - my0Var.f28559c.getEditField().getScrollY()) + my0Var.U + AndroidUtilities.dp(5.0f));
                    } else if (i11 == 1) {
                        my0Var.d.setTranslationY(((-my0Var.getMeasuredHeight()) - my0Var.f28559c.getEditField().getScrollY()) + my0Var.U + AndroidUtilities.dp(20.0f) + my0Var.d.getHeight());
                    }
                }
                float f20 = f18 / 4.0f;
                float f21 = f18 / 2.0f;
                int max = (int) Math.max((my0Var.f28556a0 - Math.max(f20, Math.min(f21, AndroidUtilities.dp(66.0f)))) - my0Var.f28562e.getLeft(), 0.0f);
                if (my0Var.f28562e.getPaddingLeft() != max) {
                    f11 = 1.0f;
                    my0Var.f28562e.setPadding(max, 0, 0, 0);
                    my0Var.f28562e.scrollBy(my0Var.f28562e.getPaddingLeft() - max, 0);
                } else {
                    f11 = 1.0f;
                }
                my0Var.f28562e.setTranslationX(((int) Math.max((d11 - Math.max(f20, Math.min(f21, AndroidUtilities.dp(66.0f)))) - my0Var.f28562e.getLeft(), 0.0f)) - max);
                float translationX = my0Var.f28562e.getTranslationX() + (d12 - f21) + my0Var.f28562e.getPaddingLeft();
                float translationY = my0Var.f28562e.getTranslationY() + my0Var.f28562e.getTop() + my0Var.f28562e.getPaddingTop();
                if (my0Var.h == 0) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(6.66f);
                }
                float f22 = translationY + dp;
                float min = Math.min(my0Var.f28562e.getTranslationX() + d12 + f21 + my0Var.f28562e.getPaddingLeft(), my0Var.getWidth() - my0Var.d.getPaddingRight());
                float translationY2 = my0Var.f28562e.getTranslationY() + my0Var.f28562e.getBottom();
                if (my0Var.h == 0) {
                    i10 = AndroidUtilities.dp(6.66f);
                } else {
                    i10 = 0;
                }
                float f23 = translationY2 - i10;
                float min2 = Math.min(AndroidUtilities.dp(9.0f), f21) * 2.0f;
                int i12 = my0Var.h;
                if (i12 == 0) {
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f24 = f23 - min2;
                    float f25 = translationX + min2;
                    rectF.set(translationX, f24, f25, f23);
                    my0Var.M.arcTo(rectF, 90.0f, 90.0f);
                    float f26 = f22 + min2;
                    rectF.set(translationX, f22, f25, f26);
                    my0Var.M.arcTo(rectF, -180.0f, 90.0f);
                    float f27 = min - min2;
                    rectF.set(f27, f22, min, f26);
                    my0Var.M.arcTo(rectF, -90.0f, 90.0f);
                    rectF.set(f27, f24, min, f23);
                    my0Var.M.arcTo(rectF, 0.0f, 90.0f);
                    my0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, f23);
                    my0Var.M.lineTo(d11, AndroidUtilities.dp(6.66f) + f23);
                    my0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), f23);
                } else if (i12 == 1) {
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f28 = min - min2;
                    float f29 = f22 + min2;
                    rectF2.set(f28, f22, min, f29);
                    my0Var.M.arcTo(rectF2, -90.0f, 90.0f);
                    float f30 = f23 - min2;
                    rectF2.set(f28, f30, min, f23);
                    my0Var.M.arcTo(rectF2, 0.0f, 90.0f);
                    float f31 = min2 + translationX;
                    rectF2.set(translationX, f30, f31, f23);
                    my0Var.M.arcTo(rectF2, 90.0f, 90.0f);
                    rectF2.set(translationX, f22, f31, f29);
                    my0Var.M.arcTo(rectF2, -180.0f, 90.0f);
                    my0Var.M.lineTo(d11 - AndroidUtilities.dp(8.66f), f22);
                    my0Var.M.lineTo(d11, f22 - AndroidUtilities.dp(6.66f));
                    my0Var.M.lineTo(AndroidUtilities.dp(8.66f) + d11, f22);
                }
                my0Var.M.close();
                if (my0Var.O == null) {
                    Paint paint = new Paint(1);
                    my0Var.O = paint;
                    paint.setPathEffect(new CornerPathEffect(AndroidUtilities.dp(2.0f)));
                    my0Var.O.setShadowLayer(AndroidUtilities.dp(4.33f), 0.0f, AndroidUtilities.dp(0.33333334f), 855638016);
                    my0Var.O.setColor(j6.v0(j6.Be, my0Var.f28557b));
                }
                if (d < f11) {
                    my0Var.N.rewind();
                    if (my0Var.h == 0) {
                        dp2 = AndroidUtilities.dp(6.66f) + f23;
                    } else {
                        dp2 = f22 - AndroidUtilities.dp(6.66f);
                    }
                    double d13 = d11 - translationX;
                    double d14 = dp2 - f22;
                    f12 = 255.0f;
                    double d15 = d11 - min;
                    double d16 = dp2 - f23;
                    my0Var.N.addCircle(d11, dp2, ((float) Math.sqrt(Math.max(Math.max(Math.pow(d14, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d14, 2.0d) + Math.pow(d15, 2.0d)), Math.max(Math.pow(d16, 2.0d) + Math.pow(d13, 2.0d), Math.pow(d16, 2.0d) + Math.pow(d15, 2.0d))))) * d, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(my0Var.N);
                    canvas.saveLayerAlpha(0.0f, 0.0f, my0Var.getWidth(), my0Var.getHeight(), (int) (d * 255.0f), 31);
                } else {
                    f12 = 255.0f;
                }
                canvas.drawPath(my0Var.M, my0Var.O);
                canvas.save();
                canvas.clipPath(my0Var.M);
                super.dispatchDraw(canvas);
                float f32 = my0Var.f28561d0.f25565c;
                float f33 = my0Var.f28560c0.f25565c;
                float f34 = f32 / 2.0f;
                float translationX2 = my0Var.f28562e.getTranslationX() + (f33 - f34) + my0Var.f28562e.getPaddingLeft();
                float paddingTop = my0Var.f28562e.getPaddingTop() + my0Var.f28562e.getTop();
                float min3 = Math.min(my0Var.f28562e.getTranslationX() + f33 + f34 + my0Var.f28562e.getPaddingLeft(), my0Var.getWidth() - my0Var.d.getPaddingRight());
                float bottom = my0Var.f28562e.getBottom();
                e6 e6Var4 = my0Var.R;
                if (my0Var.f28562e.canScrollHorizontally(-1)) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.0f;
                }
                float d17 = e6Var4.d(f13, false);
                if (d17 > 0.0f) {
                    int i13 = (int) translationX2;
                    j6.F4.setBounds(i13, (int) paddingTop, AndroidUtilities.dp(32.0f) + i13, (int) bottom);
                    j6.F4.setAlpha((int) (d17 * f12));
                    j6.F4.draw(canvas);
                }
                e6 e6Var5 = my0Var.S;
                if (my0Var.f28562e.canScrollHorizontally(1)) {
                    f14 = 1.0f;
                } else {
                    f14 = 0.0f;
                }
                float d18 = e6Var5.d(f14, false);
                if (d18 > 0.0f) {
                    int i14 = (int) min3;
                    j6.E4.setBounds(i14 - AndroidUtilities.dp(32.0f), (int) paddingTop, i14, (int) bottom);
                    j6.E4.setAlpha((int) (d18 * f12));
                    j6.E4.draw(canvas);
                }
                canvas.restore();
                if (my0Var.P.f25565c < f11) {
                    canvas.restore();
                    canvas.restore();
                    return;
                }
                return;
            case 27:
                v2 v2Var = (v2) this.f718b;
                if (v2Var.f45534y > 0.0f && v2Var.f45531s != null) {
                    v2Var.v.reset();
                    float width2 = getWidth() / v2Var.f45529n.getWidth();
                    v2Var.v.postScale(width2, width2);
                    v2Var.f45530r.setLocalMatrix(v2Var.v);
                    v2Var.f45531s.setAlpha((int) (v2Var.f45534y * 255.0f));
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), v2Var.f45531s);
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
        switch (this.f717a) {
            case 19:
                ff ffVar = (ff) this.f718b;
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
        switch (this.f717a) {
            case 18:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((am0) this.f718b).onBackPressed();
                    return true;
                }
                return super.dispatchKeyEventPreIme(keyEvent);
            case 27:
                if (keyEvent != null && keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
                    ((v2) this.f718b).onBackPressed();
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
        switch (this.f717a) {
            case 2:
                int action = motionEvent.getAction();
                a2 a2Var = a2.Z;
                if (a2Var.G != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(a2Var.G.getX(), a2Var.G.getY());
                    boolean dispatchTouchEvent = a2Var.G.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (action == 1 || action == 3) {
                        a2Var.G = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = a2Var.f2746x.onTouchEvent(obtain2);
                obtain2.recycle();
                if (!a2Var.f2746x.isInProgress() && ((GestureDetector) a2Var.f2747y.f15072b).onTouchEvent(motionEvent)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (action == 1 || action == 3) {
                    a2Var.E = false;
                    a2Var.F = false;
                    o1.k kVar = a2Var.P;
                    if (!kVar.f16818f) {
                        float f7 = a2Var.N;
                        kVar.f16815b = f7;
                        kVar.f16816c = true;
                        o1.l lVar = kVar.f16825u;
                        int i10 = a2Var.J;
                        float f10 = (i10 / 2.0f) + f7;
                        int i11 = AndroidUtilities.displaySize.x;
                        if (f10 >= i11 / 2.0f) {
                            dp = (i11 - i10) - AndroidUtilities.dp(16.0f);
                        } else {
                            dp = AndroidUtilities.dp(16.0f);
                        }
                        lVar.f16832i = dp;
                        a2Var.P.f();
                    }
                    o1.k kVar2 = a2Var.Q;
                    if (!kVar2.f16818f) {
                        float f11 = a2Var.O;
                        kVar2.f16815b = f11;
                        kVar2.f16816c = true;
                        kVar2.f16825u.f16832i = w7.p.a(f11, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - a2Var.K) - AndroidUtilities.dp(16.0f));
                        a2Var.Q.f();
                    }
                }
                if (onTouchEvent || z10) {
                    return true;
                }
                return false;
            case 4:
                if (((ei.i) this.f718b).f9135e0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 10:
                if (motionEvent.getY() > getMeasuredHeight() - ((gl) this.f718b).B0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.f717a) {
            case 10:
                canvas.save();
                int measuredWidth = getMeasuredWidth();
                int measuredHeight = getMeasuredHeight();
                gl glVar = (gl) this.f718b;
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
        switch (this.f717a) {
            case 2:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                a2 a2Var = a2.Z;
                AndroidUtilities.setPreferredMaxRefreshRate(a2Var.f2738b, a2Var.d, a2Var.f2739c);
                a2Var.i();
                return;
            default:
                super.onConfigurationChanged(configuration);
                return;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f717a) {
            case 13:
                tu tuVar = (tu) this.f718b;
                b91 b91Var = tuVar.f30708c;
                nu nuVar = tuVar.f30707b;
                super.onDetachedFromWindow();
                try {
                    eg0 eg0Var = eg0.f25675p0;
                    if (eg0Var.P) {
                        if (nuVar.getVisibility() != 0) {
                        }
                        if (b91Var.f() && !eg0Var.P) {
                            if (tu.S == tuVar) {
                                tu.S = null;
                            }
                            b91Var.b();
                            return;
                        }
                        return;
                    }
                    if (nuVar.getParent() != null) {
                        removeView(nuVar);
                        nuVar.stopLoading();
                        nuVar.loadUrl("about:blank");
                        nuVar.destroy();
                    }
                    if (b91Var.f()) {
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
        j61 j61Var;
        y yVar;
        MediaController.CropState cropState;
        switch (this.f717a) {
            case 8:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.h) this.f718b) == null) {
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                    this.f718b = hVar;
                    hVar.f31507k = false;
                    hVar.f31509m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.f718b).f31503f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f718b).a(AndroidUtilities.dp(4.0f), canvas, rectF, null);
                invalidate();
                return;
            case 9:
                ((da) this.f718b).f25328e.a(canvas);
                return;
            case 10:
                gl glVar = (gl) this.f718b;
                glVar.f26431d0.setColor(j6.v0(j6.f20734h5, glVar.f28752a));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - glVar.B0, glVar.f26431d0);
                return;
            case 20:
                bv0 bv0Var = (bv0) this.f718b;
                Drawable drawable = bv0Var.d;
                drawable.setBounds(0, bv0Var.f24802f - bv0.n(bv0Var), getMeasuredWidth(), getMeasuredHeight());
                drawable.draw(canvas);
                return;
            case 23:
                Drawable drawable2 = ((j61) this.f718b).f27361b;
                drawable2.setBounds(0, (int) ((j61Var.h - j61.n(j61Var)) - getTranslationY()), getMeasuredWidth(), getMeasuredHeight());
                drawable2.draw(canvas);
                return;
            case 25:
                z1 z1Var = (z1) this.f718b;
                Rect rect = z1Var.E0;
                Rect rect2 = z1Var.D0;
                Paint paint = z1Var.F0;
                iv0 iv0Var = z1Var.f45589v0;
                Bitmap bitmap = z1Var.A0;
                if (z1Var.f45593z0 != null) {
                    canvas.save();
                    float e7 = z1Var.f45588u0.e(z1Var.f45587t0);
                    canvas.scale(1.0f - (e7 * 2.0f), 1.0f, iv0Var.f27271a / 2.0f, 0.0f);
                    canvas.skew(0.0f, w1.A(1.0f, e7, 4.0f * e7, 0.25f));
                    float e10 = z1Var.f45592y0.e(z1Var.f45591x0);
                    if (!z1Var.f45591x0) {
                        canvas.save();
                        paint.setAlpha((int) ((1.0f - e10) * 255.0f));
                        if (bitmap != null) {
                            canvas.translate(yVar.getWidth() / 2.0f, yVar.getHeight() / 2.0f);
                            canvas.rotate(z1Var.f45590w0);
                            float max = Math.max(iv0Var.f27271a / bitmap.getWidth(), iv0Var.f27272b / bitmap.getHeight());
                            canvas.scale(max, max);
                            if (z1Var.G0 != null) {
                                canvas.rotate(-z1Var.getOrientation());
                                int contentWidth = z1Var.getContentWidth();
                                int contentHeight = z1Var.getContentHeight();
                                if (((z1Var.getOrientation() + z1Var.G0.transformRotation) / 90) % 2 == 1) {
                                    contentWidth = z1Var.getContentHeight();
                                    contentHeight = z1Var.getContentWidth();
                                }
                                MediaController.CropState cropState2 = z1Var.G0;
                                float f7 = cropState2.cropPw;
                                float f10 = cropState2.cropPh;
                                float f11 = contentWidth;
                                float f12 = contentHeight;
                                canvas.clipRect(((-contentWidth) * f7) / 2.0f, ((-contentHeight) * f10) / 2.0f, (f7 * f11) / 2.0f, (f10 * f12) / 2.0f);
                                float f13 = z1Var.G0.cropScale;
                                canvas.scale(f13, f13);
                                MediaController.CropState cropState3 = z1Var.G0;
                                canvas.translate(cropState3.cropPx * f11, cropState3.cropPy * f12);
                                canvas.rotate(z1Var.G0.cropRotate + cropState.transformRotation);
                                if (z1Var.G0.mirrored) {
                                    canvas.scale(-1.0f, 1.0f);
                                }
                                canvas.rotate(z1Var.getOrientation());
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
                q2 q2Var = (q2) this.f718b;
                ImageReceiver imageReceiver = q2Var.f45465x0;
                iv0 iv0Var2 = q2Var.f45463v0;
                if (q2Var.f45464w0 != null) {
                    canvas.save();
                    float e11 = q2Var.f45462u0.e(q2Var.f45461t0);
                    canvas.scale(1.0f - (e11 * 2.0f), 1.0f, iv0Var2.f27271a / 2.0f, 0.0f);
                    canvas.skew(0.0f, w1.A(1.0f, e11, 4.0f * e11, 0.25f));
                    imageReceiver.setImageCoords(0.0f, 0.0f, (int) iv0Var2.f27271a, (int) iv0Var2.f27272b);
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
        sg.q0 q0Var;
        sg.q0 q0Var2;
        switch (this.f717a) {
            case 28:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setClassName("android.widget.Button");
                sg.r0 r0Var = (sg.r0) this.f718b;
                if (r0Var.h && (q0Var2 = r0Var.f46238e) != null) {
                    charSequence = q0Var2.getText();
                } else {
                    charSequence = null;
                }
                if (charSequence == null && (q0Var = r0Var.d) != null) {
                    charSequence = q0Var.getText();
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
        switch (this.f717a) {
            case 10:
                if (motionEvent.getY() > getMeasuredHeight() - ((gl) this.f718b).B0) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 20:
                bv0 bv0Var = (bv0) this.f718b;
                if (motionEvent.getAction() == 0 && bv0Var.f24802f != 0 && motionEvent.getY() < bv0Var.f24802f) {
                    bv0Var.dismiss();
                    return true;
                }
                return super.onInterceptTouchEvent(motionEvent);
            case 23:
                j61 j61Var = (j61) this.f718b;
                if (motionEvent.getAction() == 0 && j61Var.h != 0 && motionEvent.getY() < j61Var.h) {
                    j61Var.dismiss();
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
        switch (this.f717a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                b0 b0Var = (b0) this.f718b;
                if (b0Var.K && z10) {
                    b0Var.f451w.setTranslationY(-b0Var.f445c.getMeasuredHeight());
                    int measuredHeight3 = b0Var.f445c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) b0Var.f453y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight3;
                    b0Var.f453y.setLayoutParams(marginLayoutParams);
                    return;
                }
                return;
            case 7:
                super.onLayout(z10, i10, i11, i12, i13);
                f30 f30Var = (f30) this.f718b;
                f30Var.setTranslationY((getMeasuredHeight() * 0.28f) - (f30Var.getMeasuredWidth() / 2.0f));
                f30Var.setTranslationX((getMeasuredWidth() * 0.82f) - (f30Var.getMeasuredWidth() / 2.0f));
                return;
            case 9:
                super.onLayout(z10, i10, i11, i12, i13);
                int dp2 = AndroidUtilities.dp(36.0f);
                int i17 = ((i12 - i10) - dp2) / 2;
                int i18 = ((i13 - i11) - dp2) / 2;
                ((da) this.f718b).f25328e.f(i17, i18, i17 + dp2, dp2 + i18);
                return;
            case 11:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.f718b;
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
                int measuredHeight4 = (getMeasuredHeight() - chatAttachAlertPhotoLayout.f23867q0.getMeasuredHeight()) - AndroidUtilities.dp(12.0f);
                if (getMeasuredWidth() == AndroidUtilities.dp(126.0f)) {
                    TextView textView = chatAttachAlertPhotoLayout.f23867q0;
                    textView.layout(measuredWidth - (textView.getMeasuredWidth() / 2), getMeasuredHeight(), (chatAttachAlertPhotoLayout.f23867q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f23867q0.getMeasuredHeight() + getMeasuredHeight());
                } else {
                    TextView textView2 = chatAttachAlertPhotoLayout.f23867q0;
                    textView2.layout(measuredWidth - (textView2.getMeasuredWidth() / 2), measuredHeight4, (chatAttachAlertPhotoLayout.f23867q0.getMeasuredWidth() / 2) + measuredWidth, chatAttachAlertPhotoLayout.f23867q0.getMeasuredHeight() + measuredHeight4);
                }
                ShutterButton shutterButton = chatAttachAlertPhotoLayout.f23856k0;
                shutterButton.layout(measuredWidth - (shutterButton.getMeasuredWidth() / 2), measuredHeight - (chatAttachAlertPhotoLayout.f23856k0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f23856k0.getMeasuredWidth() / 2) + measuredWidth, (chatAttachAlertPhotoLayout.f23856k0.getMeasuredHeight() / 2) + measuredHeight);
                ImageView imageView = chatAttachAlertPhotoLayout.f23869r0;
                imageView.layout(i14 - (imageView.getMeasuredWidth() / 2), measuredHeight2 - (chatAttachAlertPhotoLayout.f23869r0.getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.f23869r0.getMeasuredWidth() / 2) + i14, (chatAttachAlertPhotoLayout.f23869r0.getMeasuredHeight() / 2) + measuredHeight2);
                for (int i21 = 0; i21 < 2; i21++) {
                    ImageView imageView2 = chatAttachAlertPhotoLayout.S[i21];
                    imageView2.layout(dp - (imageView2.getMeasuredWidth() / 2), i15 - (chatAttachAlertPhotoLayout.S[i21].getMeasuredHeight() / 2), (chatAttachAlertPhotoLayout.S[i21].getMeasuredWidth() / 2) + dp, (chatAttachAlertPhotoLayout.S[i21].getMeasuredHeight() / 2) + i15);
                }
                return;
            case 16:
                super.onLayout(z10, i10, i11, i12, i13);
                z20 z20Var = (z20) this.f718b;
                y yVar = z20Var.f33058b;
                int[] iArr = z20Var.G;
                yVar.getLocationOnScreen(iArr);
                z20Var.N = iArr[0];
                z20Var.M = iArr[1] - AndroidUtilities.dp(25.0f);
                return;
            case 18:
                super.onLayout(z10, i10, i11, i12, i13);
                am0 am0Var = (am0) this.f718b;
                y yVar2 = am0Var.f24424s;
                ov0 ov0Var = am0Var.v;
                Drawable drawable = am0Var.E;
                if (drawable != null) {
                    Rect bounds = drawable.getBounds();
                    FrameLayout frameLayout = am0Var.f24426x;
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
                                am0Var.f24427y.setPivotX(AndroidUtilities.dp(6.0f));
                                am0Var.f24426x.setX(Math.min(ov0Var.getWidth() - am0Var.f24426x.getWidth(), f11 - AndroidUtilities.dp(10.0f)) - ov0Var.getX());
                                f7 = 4.0f;
                                z11 = false;
                            } else {
                                ViewGroup viewGroup = am0Var.f24427y;
                                viewGroup.setPivotX(viewGroup.getMeasuredWidth() - AndroidUtilities.dp(6.0f));
                                f7 = 4.0f;
                                am0Var.f24426x.setX(Math.max(AndroidUtilities.dp(8.0f), (AndroidUtilities.dp(4.0f) + f12) - am0Var.f24426x.getMeasuredWidth()) - ov0Var.getX());
                                z11 = true;
                            }
                            if (z11) {
                                x10 = ((am0Var.f24426x.getX() + am0Var.f24426x.getWidth()) - AndroidUtilities.dp(6.0f)) - f12;
                            } else {
                                x10 = (am0Var.f24426x.getX() + AndroidUtilities.dp(10.0f)) - f11;
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
                        if (am0Var.f24426x.getMeasuredHeight() + f16 > yVar2.getMeasuredHeight() - AndroidUtilities.dp(16.0f)) {
                            ViewGroup viewGroup2 = am0Var.f24427y;
                            viewGroup2.setPivotY(viewGroup2.getMeasuredHeight() - AndroidUtilities.dp(6.0f));
                            am0Var.f24426x.setY(((f14 - AndroidUtilities.dp(f7)) - am0Var.f24426x.getMeasuredHeight()) - ov0Var.getY());
                            z12 = true;
                        } else {
                            am0Var.f24427y.setPivotY(AndroidUtilities.dp(6.0f));
                            am0Var.f24426x.setY(Math.min((yVar2.getHeight() - am0Var.f24426x.getMeasuredHeight()) - AndroidUtilities.dp(16.0f), f16) - ov0Var.getY());
                        }
                        n70 n70Var = am0Var.f24425w;
                        n70Var.H = true;
                        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = n70Var.D;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.f20189c = z11;
                        actionBarPopupWindow$ActionBarPopupWindowLayout.d = z12;
                        return;
                    }
                    return;
                }
                return;
            case 20:
                super.onLayout(z10, i10, i11, i12, i13);
                bv0.m((bv0) this.f718b);
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
        switch (this.f717a) {
            case 8:
                if (View.MeasureSpec.getSize(i10) > AndroidUtilities.dp(260.0f)) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(320.0f), 1073741824), i11);
                    return;
                } else {
                    super.onMeasure(i10, i11);
                    return;
                }
            case 10:
                super.onMeasure(i10, i11);
                dl dlVar = ((gl) this.f718b).F;
                if (dlVar != null) {
                    dlVar.a();
                    return;
                }
                return;
            case 13:
                int size = View.MeasureSpec.getSize(i10);
                tu tuVar = (tu) this.f718b;
                int min = (int) Math.min(tuVar.H / (tuVar.G / size), AndroidUtilities.displaySize.y / 2);
                if (tuVar.J) {
                    i12 = 22;
                } else {
                    i12 = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(i12 + 84) + min + 1, 1073741824));
                return;
            case 14:
                ky kyVar = (ky) this.f718b;
                View view = (View) kyVar.F.getParent();
                if (view != null) {
                    dp = (int) (view.getMeasuredHeight() - kyVar.F.getY());
                } else {
                    dp = AndroidUtilities.dp(120.0f);
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(dp - kyVar.F.f27928b1, 1073741824));
                return;
            case 15:
                kz kzVar = ((fz) this.f718b).Q;
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec((int) (wl.y(8.0f, kzVar.D0.getMeasuredHeight() - kzVar.f27928b1, 3) * 1.7f), 1073741824));
                return;
            case 20:
                bv0 bv0Var = (bv0) this.f718b;
                bi.o0 o0Var = bv0Var.f24799b;
                int size2 = View.MeasureSpec.getSize(i11) - AndroidUtilities.statusBarHeight;
                getMeasuredWidth();
                int D = w1.D(54.0f, LocationController.getLocationsCount(), w1.C(56.0f, AndroidUtilities.dp(56.0f), 1));
                int i14 = size2 / 5;
                if (D < i14 * 3) {
                    i13 = AndroidUtilities.dp(8.0f);
                } else {
                    i13 = i14 * 2;
                    if (D < size2) {
                        i13 -= size2 - D;
                    }
                }
                if (o0Var.getPaddingTop() != i13) {
                    bv0Var.h = true;
                    o0Var.setPadding(0, i13, 0, AndroidUtilities.dp(8.0f));
                    bv0Var.h = false;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(Math.min(D, size2), 1073741824));
                return;
            case 22:
                my0 my0Var = (my0) this.f718b;
                int i15 = my0Var.f28564n;
                if (my0Var.h == 0) {
                    dp2 = AndroidUtilities.dp(8.0f);
                } else {
                    dp2 = AndroidUtilities.dp(6.66f);
                }
                int i16 = my0Var.f28564n;
                if (my0Var.h == 0) {
                    dp3 = AndroidUtilities.dp(6.66f);
                } else {
                    dp3 = AndroidUtilities.dp(8.0f);
                }
                setPadding(i15, dp2, i16, dp3);
                super.onMeasure(i10, i11);
                return;
            case 29:
                sg.a1 a1Var = (sg.a1) this.f718b;
                z10 = ((f3) a1Var).isPortrait;
                if (z10) {
                    a1Var.f46017s = View.MeasureSpec.getSize(i10);
                } else {
                    a1Var.f46017s = (int) (Math.min(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11)) * 0.8f);
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
        switch (this.f717a) {
            case 2:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.f718b;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i10, i11);
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                return;
            case 18:
                super.onSizeChanged(i10, i11, i12, i13);
                am0 am0Var = (am0) this.f718b;
                hh.d.c(am0Var.h, am0Var.f24424s);
                ViewGroup viewGroup = am0Var.f24427y;
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
        switch (this.f717a) {
            case 20:
                if (!((bv0) this.f718b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 21:
            case 22:
            default:
                return super.onTouchEvent(motionEvent);
            case 23:
                if (!((j61) this.f718b).isDismissed() && super.onTouchEvent(motionEvent)) {
                    return true;
                }
                return false;
            case 24:
                ((ni1) this.f718b).T.onTouchEvent(motionEvent);
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override
    public void requestLayout() {
        switch (this.f717a) {
            case 17:
                ll0 ll0Var = (ll0) this.f718b;
                super.requestLayout();
                try {
                    measure(View.MeasureSpec.makeMeasureSpec(ll0Var.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(ll0Var.getMeasuredHeight(), 1073741824));
                    layout(0, 0, ll0Var.f28200d1.getMeasuredWidth(), ll0Var.f28200d1.getMeasuredHeight());
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 18:
            case 19:
            default:
                super.requestLayout();
                return;
            case 20:
                if (!((bv0) this.f718b).h) {
                    super.requestLayout();
                    return;
                }
                return;
            case 21:
                if (!((ux0) this.f718b).f31001g0) {
                    super.requestLayout();
                    return;
                }
                return;
        }
    }

    @Override
    public void setTranslationY(float f7) {
        switch (this.f717a) {
            case 3:
                pc pcVar = (pc) this.f718b;
                if (getTranslationY() != f7 && pcVar.f7850c1 != null) {
                    super.setTranslationY(f7);
                    pcVar.f7850c1.y();
                    return;
                }
                return;
            case 23:
                super.setTranslationY(f7);
                j61.m((j61) this.f718b);
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
        switch (this.f717a) {
            case 16:
                super.setVisibility(i10);
                ((z20) this.f718b).d.setVisibility(i10);
                return;
            case 22:
                my0 my0Var = (my0) this.f718b;
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
                    if (my0Var.f28562e != null) {
                        for (int i11 = 0; i11 < my0Var.f28562e.getChildCount(); i11++) {
                            if (z11) {
                                ly0 ly0Var = (ly0) my0Var.f28562e.getChildAt(i11);
                                Drawable drawable = ly0Var.f28315b;
                                if (drawable instanceof q5) {
                                    ((q5) drawable).a(ly0Var);
                                }
                                ly0Var.f28316c = true;
                            } else {
                                ly0 ly0Var2 = (ly0) my0Var.f28562e.getChildAt(i11);
                                Drawable drawable2 = ly0Var2.f28315b;
                                if (drawable2 instanceof q5) {
                                    ((q5) drawable2).o(ly0Var2);
                                }
                                ly0Var2.f28316c = false;
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

    public y(Object obj, Context context, int i10) {
        super(context);
        this.f717a = i10;
        this.f718b = obj;
    }

    public y(q2 q2Var, Context context) {
        super(context);
        this.f717a = 26;
        this.f718b = q2Var;
        setWillNotDraw(false);
    }

    public y(Context context, f6 f6Var) {
        super(context);
        this.f717a = 12;
        this.f718b = new po[2];
        int i10 = 0;
        while (true) {
            po[] poVarArr = (po[]) this.f718b;
            if (i10 < poVarArr.length) {
                poVarArr[i10] = new po(context, f6Var);
                addView(((po[]) this.f718b)[i10], x5.e(-1, -1, 119));
                i10++;
            } else {
                poVarArr[0].setVisibility(0);
                ((po[]) this.f718b)[1].setVisibility(8);
                return;
            }
        }
    }

    public y(z1 z1Var, Context context) {
        super(context);
        this.f717a = 25;
        this.f718b = z1Var;
        setWillNotDraw(false);
    }

    public y(Context context, String str, bi.b bVar) {
        super(context);
        this.f717a = 1;
        int dp = AndroidUtilities.dp(12.0f);
        int i10 = j6.f20770j5;
        setBackground(j6.b0(dp, j6.l1(0.06f, bVar.G0(i10))));
        LinearLayout f7 = wl.f(context, 1);
        addView(f7, x5.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        q6 q6Var = new q6(context, false, true, true);
        this.f718b = q6Var;
        q6Var.b(0.6f, 450L, pr.h);
        q6Var.setTextSize(AndroidUtilities.dp(17.0f));
        q6Var.setTextColor(bVar.G0(i10));
        q6Var.setScaleProperty(0.7f);
        q6Var.setGravity(17);
        q6Var.setTypeface(AndroidUtilities.bold());
        q6Var.setAllowCancel(true);
        f7.addView(q6Var, x5.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(bVar.G0(i10));
        textView.setGravity(17);
        f7.addView(textView, x5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }

    public y(Context context, f30 f30Var) {
        super(context);
        this.f717a = 7;
        this.f718b = f30Var;
    }
}
