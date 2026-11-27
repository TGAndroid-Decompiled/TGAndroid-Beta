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
public final class x85 extends Dialog {
    public final vl4 a;
    public final tb b;
    public Bitmap c;
    public Paint d;
    public BitmapShader e;
    public final Matrix f;
    public float h;
    public ValueAnimator n;
    public boolean r;

    public x85(LaunchActivity launchActivity, tb tbVar) {
        super(launchActivity, 2131755352);
        this.f = new Matrix();
        this.b = tbVar;
        tbVar.setVisibility(4);
        hl.j2(new v35(this, tbVar, (byte) 5), 14.0f);
        vl4 vl4Var = new vl4(this, launchActivity, tbVar);
        this.a = vl4Var;
        vl4Var.setOnClickListener(new mh3(this, (byte) 27));
    }

    public final void a(float f, w85 w85Var) {
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.n = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f);
        this.n = ofFloat;
        ofFloat.addUpdateListener(new ch4(this, (byte) 6));
        this.n.addListener(new ok4(this, f, w85Var, (byte) 1));
        this.n.setDuration(420L);
        this.n.setInterpolator(k43.h);
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
        a(0.0f, new w85(this, (byte) 0));
        try {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 16;
            getWindow().setAttributes(attributes);
        } catch (Exception e) {
            cc4.g(e, true);
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
        boolean z = f11.a;
        attributes.flags = i | (-2013060864);
        hl.f2();
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
        hl.d3(new w85(this, (byte) 1), 16L);
    }
}
