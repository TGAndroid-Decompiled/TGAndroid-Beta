package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class dz8 extends FrameLayout {
    public final ry8 a;
    public final ry8 b;
    public final ff0 c;
    public kq8 d;
    public cz8 e;
    public int f;

    public dz8(Activity activity) {
        super(activity);
        this.f = 0;
        setWillNotDraw(false);
        ?? imageView = new ImageView(activity);
        this.a = imageView;
        ?? imageView2 = new ImageView(activity);
        this.b = imageView2;
        imageView.f(2131624220, 37, 37, null);
        imageView2.f(2131624210, 37, 37, null);
        imageView2.setAlpha(0.0f);
        addView((View) imageView, nme.c(37.0f, 37));
        addView((View) imageView2, nme.c(37.0f, 37));
        ff0 h0 = bkb.h0(gl.L(37.0f), 0, bm2.o(-1, 76));
        this.c = h0;
        h0.setCallback(this);
        setClickable(true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        cz8 cz8Var;
        int action = motionEvent.getAction();
        int i2 = 0;
        if (action != 0) {
            if (action != 1) {
                if (action == 3 && (cz8Var = this.e) != null) {
                    dz8[] dz8VarArr = (dz8[]) ((jo0) ((k88) cz8Var).b).d;
                    int length = dz8VarArr.length;
                    while (i2 < length) {
                        dz8 dz8Var = dz8VarArr[i2];
                        ry8 ry8Var = dz8Var.a;
                        ry8 ry8Var2 = dz8Var.b;
                        ry8Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        ry8Var2.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        i2++;
                    }
                }
            } else {
                cz8 cz8Var2 = this.e;
                if (cz8Var2 != null) {
                    dz8[] dz8VarArr2 = (dz8[]) ((jo0) ((k88) cz8Var2).b).d;
                    for (int i3 = 0; i3 <= this.f; i3++) {
                        dz8 dz8Var2 = dz8VarArr2[i3];
                        ry8 ry8Var3 = dz8Var2.a;
                        ry8 ry8Var4 = dz8Var2.b;
                        ry8Var3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        ry8Var4.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    }
                }
                if (this.d != null) {
                    int[] iArr = new int[2];
                    getLocationOnScreen(iArr);
                    int i4 = iArr[0];
                    int i5 = iArr[1];
                    kq8 kq8Var = this.d;
                    float width = (getWidth() / 2.0f) + i4;
                    float height = (getHeight() / 2.0f) + i5;
                    int i6 = this.f + 1;
                    jo0 jo0Var = (jo0) kq8Var.b;
                    Activity activity = (Activity) kq8Var.c;
                    if (i6 >= 4) {
                        ?? imageView = new ImageView(activity);
                        int L = gl.L(133.0f);
                        imageView.f(2131624175, 133, 133, null);
                        int[] iArr2 = new int[2];
                        jo0Var.getLocationOnScreen(iArr2);
                        int i7 = iArr2[0];
                        int i8 = iArr2[1];
                        jo0Var.addView((View) imageView, nme.c(133.0f, 133));
                        float f = L / 2.0f;
                        imageView.setTranslationX((width - i7) - f);
                        imageView.setTranslationY((height - i8) - f);
                        imageView.setOnAnimationEndListener(new bz8(jo0Var, imageView, (byte) 0));
                        imageView.d();
                    }
                    rfc rfcVar = (rfc) jo0Var.e;
                    if (rfcVar != null) {
                        rfcVar.b.M = i6;
                    }
                }
            }
        } else {
            cz8 cz8Var3 = this.e;
            if (cz8Var3 != null) {
                dz8[] dz8VarArr3 = (dz8[]) ((jo0) ((k88) cz8Var3).b).d;
                while (true) {
                    i = this.f;
                    if (i2 > i) {
                        break;
                    }
                    dz8 dz8Var3 = dz8VarArr3[i2];
                    ry8 ry8Var5 = dz8Var3.a;
                    ry8 ry8Var6 = dz8Var3.b;
                    ry8Var5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    ry8Var6.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i2++;
                }
                for (int i9 = i + 1; i9 < dz8VarArr3.length; i9++) {
                    dz8 dz8Var4 = dz8VarArr3[i9];
                    ry8 ry8Var7 = dz8Var4.a;
                    ry8 ry8Var8 = dz8Var4.b;
                    ry8Var7.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    ry8Var8.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        ff0 ff0Var = this.c;
        if (ff0Var != null) {
            ff0Var.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        ff0 ff0Var = this.c;
        if (ff0Var != null) {
            ff0Var.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        ff0 ff0Var = this.c;
        ff0Var.setBounds(0, 0, width, height);
        ff0Var.draw(canvas);
    }

    public void setAllStarsProvider(cz8 cz8Var) {
        this.e = cz8Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
