package defpackage;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vwb extends o7 {
    public boolean a = false;
    public final axb b;

    public vwb(axb axbVar) {
        this.b = axbVar;
    }

    @Override
    public final void h() {
        axb axbVar = this.b;
        if (axbVar.a.getVisibility() != 0) {
            axbVar.a.setVisibility(0);
            axbVar.a.setAlpha(0.0f);
        }
        axbVar.r.setVisibility(8);
        axbVar.d.f();
        axbVar.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        axbVar.s.animate().alpha(0.0f).setDuration(150L).setListener(new uwb(this, (byte) 0)).start();
        this.a = false;
    }

    @Override
    public final void l(EditTextBoldCursor editTextBoldCursor) {
        String obj = editTextBoldCursor.getText().toString();
        zwb zwbVar = this.b.e;
        if (zwbVar.e != null) {
            Utilities.g.a(zwbVar.e);
            zwbVar.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            zwbVar.c.clear();
            zwbVar.d.clear();
            zwbVar.f();
            zwbVar.h.r.setVisibility(8);
        } else {
            int i = zwbVar.f + 1;
            zwbVar.f = i;
            to3 to3Var = Utilities.g;
            ywb ywbVar = new ywb(zwbVar, obj, i, (byte) 0);
            zwbVar.e = ywbVar;
            to3Var.d(ywbVar, 300L);
        }
        if (!this.a && !TextUtils.isEmpty(obj)) {
            if (this.b.s.getVisibility() != 0) {
                this.b.s.setVisibility(0);
                this.b.s.setAlpha(0.0f);
            }
            this.b.a.animate().alpha(0.0f).setDuration(150L).setListener(new uwb(this, (byte) 1)).start();
            this.b.e.d.clear();
            this.b.e.c.clear();
            this.b.e.f();
            this.b.s.animate().setListener(null).alpha(1.0f).setDuration(150L).start();
            this.a = true;
        } else if (this.a && TextUtils.isEmpty(obj)) {
            h();
        }
    }
}
