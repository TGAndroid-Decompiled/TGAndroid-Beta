package defpackage;

import android.text.InputFilter;
import android.widget.TextView;
public final class ey3 extends efe {
    public final dy3 a;

    public ey3(TextView textView) {
        this.a = new dy3(textView);
    }

    @Override
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        boolean z;
        if (lw3.j != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return inputFilterArr;
        }
        return this.a.a(inputFilterArr);
    }

    @Override
    public final void b(boolean z) {
        boolean z2;
        if (lw3.j != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return;
        }
        this.a.b(z);
    }

    @Override
    public final void c(boolean z) {
        boolean z2;
        if (lw3.j != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        dy3 dy3Var = this.a;
        if (!z2) {
            dy3Var.c = z;
        } else {
            dy3Var.c(z);
        }
    }
}
