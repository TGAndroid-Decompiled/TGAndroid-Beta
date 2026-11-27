package defpackage;

import android.text.InputFilter;
import android.widget.TextView;
public final class zy3 extends vje {
    public final yy3 a;

    public zy3(TextView textView) {
        this.a = new yy3(textView);
    }

    @Override
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        boolean z;
        if (gx3.j != null) {
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
        if (gx3.j != null) {
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
        if (gx3.j != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        yy3 yy3Var = this.a;
        if (!z2) {
            yy3Var.c = z;
        } else {
            yy3Var.c(z);
        }
    }
}
