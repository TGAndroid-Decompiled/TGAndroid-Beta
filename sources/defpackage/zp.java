package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
public final class zp implements fq, DialogInterface.OnClickListener {
    public jd a;
    public aq b;
    public CharSequence c;
    public final gq d;

    public zp(gq gqVar) {
        this.d = gqVar;
    }

    @Override
    public final boolean a() {
        jd jdVar = this.a;
        if (jdVar != null) {
            return jdVar.isShowing();
        }
        return false;
    }

    @Override
    public final int b() {
        return 0;
    }

    @Override
    public final void c(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final void dismiss() {
        jd jdVar = this.a;
        if (jdVar != null) {
            jdVar.dismiss();
            this.a = null;
        }
    }

    @Override
    public final CharSequence e() {
        return this.c;
    }

    @Override
    public final Drawable f() {
        return null;
    }

    @Override
    public final void h(CharSequence charSequence) {
        this.c = charSequence;
    }

    @Override
    public final void i(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override
    public final void j(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final void k(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final void l(int i, int i2) {
        if (this.b == null) {
            return;
        }
        gq gqVar = this.d;
        ed edVar = new ed(gqVar.getPopupContext(), (byte) 0);
        qc qcVar = (qc) edVar.c;
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            qcVar.f = charSequence;
        }
        aq aqVar = this.b;
        int selectedItemPosition = gqVar.getSelectedItemPosition();
        qcVar.l = aqVar;
        qcVar.m = this;
        qcVar.b = selectedItemPosition;
        qcVar.a = true;
        jd a0 = edVar.a0();
        this.a = a0;
        AlertController$RecycleListView alertController$RecycleListView = a0.f.e;
        xp.d(alertController$RecycleListView, i);
        xp.c(alertController$RecycleListView, i2);
        this.a.show();
    }

    @Override
    public final int m() {
        return 0;
    }

    @Override
    public final void n(ListAdapter listAdapter) {
        this.b = (aq) listAdapter;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
        gq gqVar = this.d;
        gqVar.setSelection(i);
        if (gqVar.getOnItemClickListener() != null) {
            gqVar.performItemClick(null, i, this.b.getItemId(i));
        }
        dismiss();
    }
}
