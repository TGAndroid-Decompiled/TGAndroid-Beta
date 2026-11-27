package defpackage;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.a;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vz7 implements fd, jy2 {
    public final byte a;
    public final b18 b;

    public vz7(b18 b18Var, byte b) {
        this.a = b;
        this.b = b18Var;
    }

    @Override
    public final void B(gy2 gy2Var) {
        String str;
        byte b = this.a;
        b18 b18Var = this.b;
        switch (b) {
            case 2:
                b18Var.Z[5].setText(gy2Var.a);
                b18Var.s = gy2Var.d;
                return;
            default:
                b18Var.Z[0].setText(gy2Var.a);
                if (b18Var.V0.indexOf(gy2Var.a) != -1) {
                    b18Var.a1 = true;
                    String str2 = (String) b18Var.W0.get(gy2Var.a);
                    b18Var.Z[1].setText(str2);
                    String str3 = (String) b18Var.Y0.get(str2);
                    EditTextBoldCursor editTextBoldCursor = b18Var.Z[2];
                    if (str3 != null) {
                        str = str3.replace('X', (char) 8211);
                    } else {
                        str = null;
                    }
                    editTextBoldCursor.setHintText(str);
                    b18Var.a1 = false;
                }
                hl.d3(new sz7(b18Var, (byte) 3), 300L);
                b18Var.Z[2].requestFocus();
                EditTextBoldCursor editTextBoldCursor2 = b18Var.Z[2];
                editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                return;
        }
    }

    @Override
    public final void w(id idVar, int i) {
        byte b = this.a;
        b18 b18Var = this.b;
        switch (b) {
            case 0:
                try {
                    Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                    intent.setData(Uri.parse("package:" + a.b.getPackageName()));
                    b18Var.getParentActivity().startActivity(intent);
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 1:
                b18Var.finishFragment();
                return;
            case 2:
            case 3:
            default:
                b18Var.q1();
                return;
            case 4:
                b18Var.r1();
                return;
        }
    }
}
