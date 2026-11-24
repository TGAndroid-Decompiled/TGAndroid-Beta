package defpackage;

import android.text.InputFilter;
import android.widget.TextView;
public final class oz3 extends fhe {
    public final nz3 a;

    public oz3(TextView textView) {
        this.a = new nz3(textView);
    }

    @Override
    public final InputFilter[] a(InputFilter[] inputFilterArr) {
        boolean z;
        if (wx3.j != null) {
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
        if (wx3.j != null) {
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
        if (wx3.j != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        nz3 nz3Var = this.a;
        if (!z2) {
            nz3Var.c = z;
        } else {
            nz3Var.c(z);
        }
    }
}
