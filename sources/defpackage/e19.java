package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class e19 extends FrameLayout {
    public final s09 a;
    public final s09 b;
    public final fg0 c;
    public xr8 d;
    public d19 e;
    public int f;

    public e19(Activity activity) {
        super(activity);
        this.f = 0;
        setWillNotDraw(false);
        ?? imageView = new ImageView(activity);
        this.a = imageView;
        ?? imageView2 = new ImageView(activity);
        this.b = imageView2;
        imageView.f(2131624219, 37, 37, null);
        imageView2.f(2131624209, 37, 37, null);
        imageView2.setAlpha(0.0f);
        addView((View) imageView, qoe.c(37.0f, 37));
        addView((View) imageView2, qoe.c(37.0f, 37));
        fg0 h0 = cmb.h0(gm.L(37.0f), 0, on2.p(-1, 76));
        this.c = h0;
        h0.setCallback(this);
        setClickable(true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        d19 d19Var;
        int action = motionEvent.getAction();
        int i2 = 0;
        if (action != 0) {
            if (action != 1) {
                if (action == 3 && (d19Var = this.e) != null) {
                    e19[] e19VarArr = (e19[]) ((jp0) ((h68) d19Var).b).d;
                    int length = e19VarArr.length;
                    while (i2 < length) {
                        e19 e19Var = e19VarArr[i2];
                        s09 s09Var = e19Var.a;
                        s09 s09Var2 = e19Var.b;
                        s09Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        s09Var2.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        i2++;
                    }
                }
            } else {
                d19 d19Var2 = this.e;
                if (d19Var2 != null) {
                    e19[] e19VarArr2 = (e19[]) ((jp0) ((h68) d19Var2).b).d;
                    for (int i3 = 0; i3 <= this.f; i3++) {
                        e19 e19Var2 = e19VarArr2[i3];
                        s09 s09Var3 = e19Var2.a;
                        s09 s09Var4 = e19Var2.b;
                        s09Var3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        s09Var4.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    }
                }
                if (this.d != null) {
                    int[] iArr = new int[2];
                    getLocationOnScreen(iArr);
                    int i4 = iArr[0];
                    int i5 = iArr[1];
                    xr8 xr8Var = this.d;
                    float width = (getWidth() / 2.0f) + i4;
                    float height = (getHeight() / 2.0f) + i5;
                    int i6 = this.f + 1;
                    jp0 jp0Var = (jp0) xr8Var.b;
                    Activity activity = (Activity) xr8Var.c;
                    if (i6 >= 4) {
                        ?? imageView = new ImageView(activity);
                        int L = gm.L(133.0f);
                        imageView.f(2131624174, 133, 133, null);
                        int[] iArr2 = new int[2];
                        jp0Var.getLocationOnScreen(iArr2);
                        int i7 = iArr2[0];
                        int i8 = iArr2[1];
                        jp0Var.addView((View) imageView, qoe.c(133.0f, 133));
                        float f = L / 2.0f;
                        imageView.setTranslationX((width - i7) - f);
                        imageView.setTranslationY((height - i8) - f);
                        imageView.setOnAnimationEndListener(new c19(jp0Var, imageView, (byte) 0));
                        imageView.d();
                    }
                    shc shcVar = (shc) jp0Var.e;
                    if (shcVar != null) {
                        shcVar.b.M = i6;
                    }
                }
            }
        } else {
            d19 d19Var3 = this.e;
            if (d19Var3 != null) {
                e19[] e19VarArr3 = (e19[]) ((jp0) ((h68) d19Var3).b).d;
                while (true) {
                    i = this.f;
                    if (i2 > i) {
                        break;
                    }
                    e19 e19Var3 = e19VarArr3[i2];
                    s09 s09Var5 = e19Var3.a;
                    s09 s09Var6 = e19Var3.b;
                    s09Var5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    s09Var6.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i2++;
                }
                for (int i9 = i + 1; i9 < e19VarArr3.length; i9++) {
                    e19 e19Var4 = e19VarArr3[i9];
                    s09 s09Var7 = e19Var4.a;
                    s09 s09Var8 = e19Var4.b;
                    s09Var7.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    s09Var8.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        fg0 fg0Var = this.c;
        if (fg0Var != null) {
            fg0Var.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        fg0 fg0Var = this.c;
        if (fg0Var != null) {
            fg0Var.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        fg0 fg0Var = this.c;
        fg0Var.setBounds(0, 0, width, height);
        fg0Var.draw(canvas);
    }

    public void setAllStarsProvider(d19 d19Var) {
        this.e = d19Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
