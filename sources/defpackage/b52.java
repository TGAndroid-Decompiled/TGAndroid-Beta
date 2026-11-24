package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.TextView;
public final class b52 implements TextWatcher {
    public final byte a = 0;
    public boolean b;
    public final TextView c;

    public b52(a52 a52Var, TextView textView) {
        this.c = textView;
        this.b = TextUtils.isEmpty(a52Var.getText());
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        byte b = this.a;
        int i = 2131754483;
        TextView textView = this.c;
        switch (b) {
            case 0:
                boolean isEmpty = TextUtils.isEmpty(editable);
                if (isEmpty != this.b) {
                    this.b = isEmpty;
                    if (isEmpty) {
                        i = 2131746054;
                    }
                    textView.setText(jb6.M0(i, null));
                    return;
                }
                return;
            default:
                boolean isEmpty2 = TextUtils.isEmpty(editable);
                if (isEmpty2 != this.b) {
                    this.b = isEmpty2;
                    if (isEmpty2) {
                        i = 2131746054;
                    }
                    textView.setText(jb6.M0(i, null));
                    return;
                }
                return;
        }
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        byte b = this.a;
    }

    public b52(a52 a52Var, TextView textView, byte b) {
        this.c = textView;
        this.b = TextUtils.isEmpty(a52Var.getText());
    }

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }
}
