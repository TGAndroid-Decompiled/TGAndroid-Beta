package defpackage;

import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.ui.p;
public final class v28 implements TextWatcher {
    public int a = -1;
    public boolean b;
    public int c;
    public final p d;

    public v28(p pVar) {
        this.d = pVar;
    }

    @Override
    public final void afterTextChanged(android.text.Editable r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v28.afterTextChanged(android.text.Editable):void");
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z = false;
        if (i2 == 0 && i3 == 1) {
            if (TextUtils.indexOf((CharSequence) this.d.f[1].getText(), '/') != -1) {
                z = true;
            }
            this.b = z;
            this.a = 1;
        } else if (i2 == 1 && i3 == 0) {
            if (charSequence.charAt(i) == '/' && i > 0) {
                this.b = false;
                this.a = 3;
                this.c = i - 1;
                return;
            }
            this.a = 2;
        } else {
            this.a = -1;
        }
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
