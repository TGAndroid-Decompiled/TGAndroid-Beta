package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
public final class hx8 implements TextView.OnEditorActionListener {
    public final p32 a;
    public final int b;
    public final nx8 c;
    public final TextView d;
    public final au0 e;
    public final p8c f;
    public final hd[] g;
    public final View h;

    public hx8(p32 p32Var, int i, nx8 nx8Var, TextView textView, au0 au0Var, p8c p8cVar, hd[] hdVarArr, View view) {
        this.a = p32Var;
        this.b = i;
        this.c = nx8Var;
        this.d = textView;
        this.e = au0Var;
        this.f = p8cVar;
        this.g = hdVarArr;
        this.h = view;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int i2;
        if (i != 6) {
            return false;
        }
        p32 p32Var = this.a;
        String obj = p32Var.getText().toString();
        if (obj.length() > 0 && obj.length() <= 32) {
            ox8 f = ox8.f(this.b);
            nx8 nx8Var = this.c;
            if (nx8Var == null) {
                i2 = -1;
            } else {
                i2 = nx8Var.a;
            }
            nx8 d = f.d(obj);
            if (d != null && d.a != i2) {
                gl.A3(p32Var);
                this.d.setText(k96.M0(2131752650, null));
                this.e.a(Boolean.TRUE);
                return true;
            }
            this.f.a(obj);
            hd[] hdVarArr = this.g;
            hd hdVar = hdVarArr[0];
            if (hdVar != null) {
                hdVar.dismiss();
            }
            if (hdVarArr[0] == kx8.f) {
                kx8.f = null;
            }
            View view = this.h;
            if (view != null) {
                view.requestFocus();
            }
            return true;
        }
        gl.A3(p32Var);
        return true;
    }
}
