package defpackage;

import android.text.TextUtils;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class vub extends n7 {
    public boolean a = false;
    public final avb b;

    public vub(avb avbVar) {
        this.b = avbVar;
    }

    @Override
    public final void h() {
        avb avbVar = this.b;
        if (avbVar.a.getVisibility() != 0) {
            avbVar.a.setVisibility(0);
            avbVar.a.setAlpha(0.0f);
        }
        avbVar.r.setVisibility(8);
        avbVar.d.f();
        avbVar.a.animate().alpha(1.0f).setDuration(150L).setListener(null).start();
        avbVar.s.animate().alpha(0.0f).setDuration(150L).setListener(new uub(this, (byte) 0)).start();
        this.a = false;
    }

    @Override
    public final void l(EditTextBoldCursor editTextBoldCursor) {
        String obj = editTextBoldCursor.getText().toString();
        zub zubVar = this.b.e;
        if (zubVar.e != null) {
            Utilities.g.a(zubVar.e);
            zubVar.e = null;
        }
        if (TextUtils.isEmpty(obj)) {
            zubVar.c.clear();
            zubVar.d.clear();
            zubVar.f();
            zubVar.h.r.setVisibility(8);
        } else {
            int i = zubVar.f + 1;
            zubVar.f = i;
            mp3 mp3Var = Utilities.g;
            yub yubVar = new yub(zubVar, obj, i, (byte) 0);
            zubVar.e = yubVar;
            mp3Var.d(yubVar, 300L);
        }
        if (!this.a && !TextUtils.isEmpty(obj)) {
            if (this.b.s.getVisibility() != 0) {
                this.b.s.setVisibility(0);
                this.b.s.setAlpha(0.0f);
            }
            this.b.a.animate().alpha(0.0f).setDuration(150L).setListener(new uub(this, (byte) 1)).start();
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
