package hi;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
public final class o implements TextWatcher {
    public final q f13165a;

    public o(q qVar) {
        this.f13165a = qVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        int i10;
        q qVar = this.f13165a;
        TextView textView = qVar.m0;
        if (editable != null && editable.length() != 0) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        textView.setVisibility(i10);
        qVar.U(false);
        qVar.V();
    }

    @Override
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
