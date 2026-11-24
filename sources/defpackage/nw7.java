package defpackage;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class nw7 implements ed, px2 {
    public final byte a;
    public final vx7 b;

    public nw7(vx7 vx7Var, byte b) {
        this.a = b;
        this.b = vx7Var;
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        vx7 vx7Var = this.b;
        switch (b) {
            case 0:
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    vx7Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 1:
                vx7Var.finishFragment();
                return;
            case 2:
            case 3:
            default:
                vx7Var.p1();
                return;
            case 4:
                vx7Var.q1();
                return;
        }
    }

    @Override
    public final void y(mx2 mx2Var) {
        String str;
        byte b = this.a;
        vx7 vx7Var = this.b;
        switch (b) {
            case 2:
                vx7Var.Z[5].setText(mx2Var.a);
                vx7Var.s = mx2Var.d;
                return;
            default:
                vx7Var.Z[0].setText(mx2Var.a);
                if (vx7Var.V0.indexOf(mx2Var.a) != -1) {
                    vx7Var.a1 = true;
                    String str2 = (String) vx7Var.W0.get(mx2Var.a);
                    vx7Var.Z[1].setText(str2);
                    String str3 = (String) vx7Var.Y0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = vx7Var.Z[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    vx7Var.a1 = false;
                }
                gl.e3(new kw7(vx7Var, (byte) 3), 300L);
                vx7Var.Z[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = vx7Var.Z[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }
}
