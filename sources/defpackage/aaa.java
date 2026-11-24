package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class aaa implements TextWatcher {
    public final byte a;
    public final taa b;

    public aaa(taa taaVar, byte b) {
        this.a = b;
        this.b = taaVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                gl.c3(new z6a(this, (byte) 1));
                return;
            default:
                taa taaVar = this.b;
                maa maaVar = taaVar.F1;
                zya zyaVar = taaVar.L1;
                no4 no4Var = taaVar.t2;
                if (!TextUtils.isEmpty(no4Var.r.getText())) {
                    taaVar.D0(false);
                }
                if (taaVar.v2) {
                    String obj = no4Var.r.getText().toString();
                    if (obj.length() != 0) {
                        if (zyaVar != null) {
                            zyaVar.d.setText(k96.M0(2131747975, null));
                        }
                    } else if (taaVar.A1.getAdapter() != maaVar) {
                        int H0 = taaVar.H0();
                        zyaVar.d.setText(k96.M0(2131747975, null));
                        zyaVar.e(false, true);
                        taaVar.D0(false);
                        maaVar.f();
                        if (H0 > 0) {
                            taaVar.C1.g1(0, -H0);
                        }
                    }
                    qaa qaaVar = taaVar.H1;
                    if (qaaVar != null) {
                        qaaVar.E(obj);
                        return;
                    }
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

    private final void a(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void b(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void c(int i, int i2, int i3, CharSequence charSequence) {
    }

    private final void d(int i, int i2, int i3, CharSequence charSequence) {
    }
}
