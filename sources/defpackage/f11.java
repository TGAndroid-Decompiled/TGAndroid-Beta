package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.WeakHashMap;
public final class f11 extends Dialog {
    public final e11 a;
    public final WindowManager.LayoutParams b;

    public f11(Context context, oy oyVar) {
        super(context);
        gl.S(getWindow());
        e11 e11Var = new e11(this, context);
        this.a = e11Var;
        setContentView(e11Var, new ViewGroup.LayoutParams(-1, -1));
        sg0 sg0Var = new sg0(this, (byte) 16);
        WeakHashMap weakHashMap = jdc.a;
        bdc.i(e11Var, sg0Var);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            e11Var.setSystemUiVisibility(1792);
        } else {
            e11Var.setSystemUiVisibility(1280);
        }
        e11Var.setTag(2131296353, new s10(oyVar, (byte) 2));
        try {
            Window window = getWindow();
            window.setWindowAnimations(2131755178);
            window.setBackgroundDrawable(null);
            WindowManager.LayoutParams attributes = window.getAttributes();
            this.b = attributes;
            attributes.width = -1;
            attributes.height = -1;
            attributes.gravity = 51;
            attributes.dimAmount = 0.0f;
            attributes.format = -3;
            attributes.flags = ((attributes.flags & (-3)) | (-1946091240)) & (-1025);
            if (i >= 28) {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
            gl.i3(this, gl.B(bkb.w0(null, bkb.Z6, false)) > 0.721f);
        } catch (Exception unused) {
        }
    }

    public static e11 a(Context context) {
        return new f11(context, null).a;
    }

    @Override
    public final void show() {
        if (!gl.K1(getContext())) {
            return;
        }
        super.show();
    }
}
