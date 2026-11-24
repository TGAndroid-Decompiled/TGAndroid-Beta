package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import java.util.WeakHashMap;
public final class n21 extends Dialog {
    public final m21 a;
    public final WindowManager.LayoutParams b;

    public n21(Context context, oz ozVar) {
        super(context);
        gm.S(getWindow());
        m21 m21Var = new m21(this, context);
        this.a = m21Var;
        setContentView(m21Var, new ViewGroup.LayoutParams(-1, -1));
        xg0 xg0Var = new xg0(this, (byte) 19);
        WeakHashMap weakHashMap = kfc.a;
        cfc.i(m21Var, xg0Var);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            m21Var.setSystemUiVisibility(1792);
        } else {
            m21Var.setSystemUiVisibility(1280);
        }
        m21Var.setTag(2131296353, new s20(ozVar, (byte) 2));
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
            gm.i3(this, gm.B(cmb.w0(null, cmb.Z6, false)) > 0.721f);
        } catch (Exception unused) {
        }
    }

    public static m21 a(Context context) {
        return new n21(context, null).a;
    }

    @Override
    public final void show() {
        if (!gm.K1(getContext())) {
            return;
        }
        super.show();
    }
}
