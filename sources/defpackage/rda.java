package defpackage;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
public final class rda implements TextWatcher {
    public final byte a;
    public final kea b;

    public rda(kea keaVar, byte b) {
        this.a = b;
        this.b = keaVar;
    }

    @Override
    public final void afterTextChanged(Editable editable) {
        switch (this.a) {
            case 0:
                hl.c3(new ux9(this, (byte) 18));
                return;
            default:
                kea keaVar = this.b;
                dea deaVar = keaVar.F1;
                z2b z2bVar = keaVar.L1;
                rq4 rq4Var = keaVar.t2;
                if (!TextUtils.isEmpty(rq4Var.r.getText())) {
                    keaVar.E0(false);
                }
                if (keaVar.v2) {
                    String obj = rq4Var.r.getText().toString();
                    if (obj.length() != 0) {
                        if (z2bVar != null) {
                            z2bVar.d.setText(ob6.M0(2131747898, null));
                        }
                    } else if (keaVar.A1.getAdapter() != deaVar) {
                        int I0 = keaVar.I0();
                        z2bVar.d.setText(ob6.M0(2131747898, null));
                        z2bVar.e(false, true);
                        keaVar.E0(false);
                        deaVar.f();
                        if (I0 > 0) {
                            keaVar.C1.g1(0, -I0);
                        }
                    }
                    hea heaVar = keaVar.H1;
                    if (heaVar != null) {
                        heaVar.E(obj);
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
