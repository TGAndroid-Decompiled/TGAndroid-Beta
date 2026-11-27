package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
public final class q29 extends FrameLayout {
    public final e29 a;
    public final e29 b;
    public final hf0 c;
    public m88 d;
    public p29 e;
    public int f;

    public q29(Activity activity) {
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
        addView((View) imageView, tre.c(37.0f, 37));
        addView((View) imageView2, tre.c(37.0f, 37));
        hf0 h0 = aob.h0(hl.L(37.0f), 0, vm2.o(-1, 76));
        this.c = h0;
        h0.setCallback(this);
        setClickable(true);
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int i;
        p29 p29Var;
        int action = motionEvent.getAction();
        int i2 = 0;
        if (action != 0) {
            if (action != 1) {
                if (action == 3 && (p29Var = this.e) != null) {
                    q29[] q29VarArr = (q29[]) ((jo0) ((jz7) p29Var).b).d;
                    int length = q29VarArr.length;
                    while (i2 < length) {
                        q29 q29Var = q29VarArr[i2];
                        e29 e29Var = q29Var.a;
                        e29 e29Var2 = q29Var.b;
                        e29Var.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        e29Var2.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        i2++;
                    }
                }
            } else {
                p29 p29Var2 = this.e;
                if (p29Var2 != null) {
                    q29[] q29VarArr2 = (q29[]) ((jo0) ((jz7) p29Var2).b).d;
                    for (int i3 = 0; i3 <= this.f; i3++) {
                        q29 q29Var2 = q29VarArr2[i3];
                        e29 e29Var3 = q29Var2.a;
                        e29 e29Var4 = q29Var2.b;
                        e29Var3.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                        e29Var4.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    }
                }
                if (this.d != null) {
                    int[] iArr = new int[2];
                    getLocationOnScreen(iArr);
                    int i4 = iArr[0];
                    int i5 = iArr[1];
                    m88 m88Var = this.d;
                    float width = (getWidth() / 2.0f) + i4;
                    float height = (getHeight() / 2.0f) + i5;
                    int i6 = this.f + 1;
                    jo0 jo0Var = (jo0) m88Var.b;
                    Activity activity = (Activity) m88Var.c;
                    if (i6 >= 4) {
                        ?? imageView = new ImageView(activity);
                        int L = hl.L(133.0f);
                        imageView.f(2131624174, 133, 133, null);
                        int[] iArr2 = new int[2];
                        jo0Var.getLocationOnScreen(iArr2);
                        int i7 = iArr2[0];
                        int i8 = iArr2[1];
                        jo0Var.addView((View) imageView, tre.c(133.0f, 133));
                        float f = L / 2.0f;
                        imageView.setTranslationX((width - i7) - f);
                        imageView.setTranslationY((height - i8) - f);
                        imageView.setOnAnimationEndListener(new o29(jo0Var, imageView, (byte) 0));
                        imageView.d();
                    }
                    wjc wjcVar = (wjc) jo0Var.e;
                    if (wjcVar != null) {
                        wjcVar.b.M = i6;
                    }
                }
            }
        } else {
            p29 p29Var3 = this.e;
            if (p29Var3 != null) {
                q29[] q29VarArr3 = (q29[]) ((jo0) ((jz7) p29Var3).b).d;
                while (true) {
                    i = this.f;
                    if (i2 > i) {
                        break;
                    }
                    q29 q29Var3 = q29VarArr3[i2];
                    e29 e29Var5 = q29Var3.a;
                    e29 e29Var6 = q29Var3.b;
                    e29Var5.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    e29Var6.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    i2++;
                }
                for (int i9 = i + 1; i9 < q29VarArr3.length; i9++) {
                    q29 q29Var4 = q29VarArr3[i9];
                    e29 e29Var7 = q29Var4.a;
                    e29 e29Var8 = q29Var4.b;
                    e29Var7.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    e29Var8.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        hf0 hf0Var = this.c;
        if (hf0Var != null) {
            hf0Var.setState(getDrawableState());
        }
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        hf0 hf0Var = this.c;
        if (hf0Var != null) {
            hf0Var.jumpToCurrentState();
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        hf0 hf0Var = this.c;
        hf0Var.setBounds(0, 0, width, height);
        hf0Var.draw(canvas);
    }

    public void setAllStarsProvider(p29 p29Var) {
        this.e = p29Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
