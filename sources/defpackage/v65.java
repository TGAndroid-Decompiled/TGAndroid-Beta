package defpackage;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Build;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import org.telegram.ui.LaunchActivity;
public final class v65 extends Dialog {
    public final rj4 a;
    public final sb b;
    public Bitmap c;
    public Paint d;
    public BitmapShader e;
    public final Matrix f;
    public float h;
    public ValueAnimator n;
    public boolean r;

    public v65(LaunchActivity launchActivity, sb sbVar) {
        super(launchActivity, 2131755352);
        this.f = new Matrix();
        this.b = sbVar;
        sbVar.setVisibility(4);
        gl.j2(new x15(this, sbVar, (byte) 4), 14.0f);
        rj4 rj4Var = new rj4(this, launchActivity, sbVar);
        this.a = rj4Var;
        rj4Var.setOnClickListener(new yj3(this, (byte) 26));
    }

    public final void a(float f, u65 u65Var) {
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.n = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f);
        this.n = ofFloat;
        ofFloat.addUpdateListener(new ni4(this, (byte) 4));
        this.n.addListener(new ji4(this, f, u65Var, (byte) 1));
        this.n.setDuration(420L);
        this.n.setInterpolator(s33.h);
        this.n.start();
    }

    public final void b() {
        super.dismiss();
    }

    @Override
    public final void dismiss() {
        if (this.r) {
            return;
        }
        this.r = true;
        a(0.0f, new u65(this, (byte) 0));
        try {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 16;
            getWindow().setAttributes(attributes);
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        window.setWindowAnimations(2131755178);
        setContentView(this.a, new ViewGroup.LayoutParams(-1, -1));
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 119;
        attributes.dimAmount = 0.0f;
        int i = attributes.flags & (-3);
        attributes.softInputMode = 48;
        attributes.flags = (-2013069056) | i;
        boolean z = w01.a;
        attributes.flags = i | (-2013060864);
        gl.f2();
        attributes.flags |= 1152;
        if (Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        window.setAttributes(attributes);
    }

    @Override
    public final void show() {
        super.show();
        a(1.0f, null);
        gl.d3(new u65(this, (byte) 1), 16L);
    }
}
