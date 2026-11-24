package defpackage;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class qy7 implements ee, zy2 {
    public final byte a;
    public final xz7 b;

    public qy7(xz7 xz7Var, byte b) {
        this.a = b;
        this.b = xz7Var;
    }

    @Override
    public final void g(wy2 wy2Var) {
        String str;
        byte b = this.a;
        xz7 xz7Var = this.b;
        switch (b) {
            case 2:
                xz7Var.Z[5].setText(wy2Var.a);
                xz7Var.s = wy2Var.d;
                return;
            default:
                xz7Var.Z[0].setText(wy2Var.a);
                if (xz7Var.V0.indexOf(wy2Var.a) != -1) {
                    xz7Var.a1 = true;
                    String str2 = (String) xz7Var.W0.get(wy2Var.a);
                    xz7Var.Z[1].setText(str2);
                    String str3 = (String) xz7Var.Y0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = xz7Var.Z[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    xz7Var.a1 = false;
                }
                gm.d3(new ny7(xz7Var, (byte) 3), 300L);
                xz7Var.Z[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = xz7Var.Z[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public final void r(he heVar, int i) {
        byte b = this.a;
        xz7 xz7Var = this.b;
        switch (b) {
            case 0:
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    xz7Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 1:
                xz7Var.finishFragment();
                return;
            case 2:
            case 3:
            default:
                xz7Var.q1();
                return;
            case 4:
                xz7Var.r1();
                return;
        }
    }
}
