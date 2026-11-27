package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.WeakHashMap;
public final class o11 extends Dialog {
    public final n11 a;
    public final WindowManager.LayoutParams b;

    public o11(Context context, py pyVar) {
        super(context);
        hl.S(getWindow());
        n11 n11Var = new n11(this, context);
        this.a = n11Var;
        setContentView(n11Var, new ViewGroup.LayoutParams(-1, -1));
        tg0 tg0Var = new tg0(this, (byte) 17);
        WeakHashMap weakHashMap = ihc.a;
        ahc.i(n11Var, tg0Var);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            n11Var.setSystemUiVisibility(1792);
        } else {
            n11Var.setSystemUiVisibility(1280);
        }
        n11Var.setTag(2131296353, new t10(pyVar, (byte) 2));
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
            hl.i3(this, hl.B(aob.w0(null, aob.a7, false)) > 0.721f);
        } catch (Exception unused) {
        }
    }

    public static n11 a(Context context) {
        return new o11(context, null).a;
    }

    @Override
    public final void show() {
        if (!hl.K1(getContext())) {
            return;
        }
        super.show();
    }
}
