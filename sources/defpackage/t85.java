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
public final class t85 extends Dialog {
    public final yc a;
    public final sb b;
    public Bitmap c;
    public Paint d;
    public BitmapShader e;
    public final Matrix f;
    public float h;
    public ValueAnimator n;
    public boolean r;

    public t85(LaunchActivity launchActivity, sb sbVar) {
        super(launchActivity, 2131755352);
        this.f = new Matrix();
        this.b = sbVar;
        sbVar.setVisibility(4);
        gm.j2(new u35(this, sbVar, (byte) 5), 14.0f);
        yc ycVar = new yc(this, launchActivity, sbVar);
        this.a = ycVar;
        ycVar.setOnClickListener(new sf3(this, (byte) 29));
    }

    public final void a(float f, s85 s85Var) {
        ValueAnimator valueAnimator = this.n;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.n = null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f);
        this.n = ofFloat;
        ofFloat.addUpdateListener(new fh4(this, (byte) 6));
        this.n.addListener(new ok4(this, f, s85Var, (byte) 1));
        this.n.setDuration(420L);
        this.n.setInterpolator(d53.h);
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
        a(0.0f, new s85(this, (byte) 0));
        try {
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.flags |= 16;
            getWindow().setAttributes(attributes);
        } catch (Exception e) {
            fc4.g(e, true);
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
        boolean z = e21.a;
        attributes.flags = i | (-2013060864);
        gm.f2();
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
        gm.d3(new s85(this, (byte) 1), 16L);
    }
}
