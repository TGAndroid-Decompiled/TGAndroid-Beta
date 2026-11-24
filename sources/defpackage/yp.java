package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
public final class yp implements eq, DialogInterface.OnClickListener {
    public id a;
    public zp b;
    public CharSequence c;
    public final fq d;

    public yp(fq fqVar) {
        this.d = fqVar;
    }

    @Override
    public final boolean a() {
        id idVar = this.a;
        if (idVar != null) {
            return idVar.isShowing();
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
    public final CharSequence d() {
        return this.c;
    }

    @Override
    public final void dismiss() {
        id idVar = this.a;
        if (idVar != null) {
            idVar.dismiss();
            this.a = null;
        }
    }

    @Override
    public final Drawable g() {
        return null;
    }

    @Override
    public final void h(CharSequence charSequence) {
        this.c = charSequence;
    }

    @Override
    public final void j(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override
    public final void k(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final void l(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final void m(int i, int i2) {
        if (this.b == null) {
            return;
        }
        fq fqVar = this.d;
        dd ddVar = new dd(fqVar.getPopupContext(), (byte) 0);
        pc pcVar = (pc) ddVar.c;
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            pcVar.f = charSequence;
        }
        zp zpVar = this.b;
        int selectedItemPosition = fqVar.getSelectedItemPosition();
        pcVar.l = zpVar;
        pcVar.m = this;
        pcVar.b = selectedItemPosition;
        pcVar.a = true;
        id Z = ddVar.Z();
        this.a = Z;
        AlertController$RecycleListView alertController$RecycleListView = Z.f.e;
        wp.d(alertController$RecycleListView, i);
        wp.c(alertController$RecycleListView, i2);
        this.a.show();
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final void o(ListAdapter listAdapter) {
        this.b = (zp) listAdapter;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i) {
        fq fqVar = this.d;
        fqVar.setSelection(i);
        if (fqVar.getOnItemClickListener() != null) {
            fqVar.performItemClick(null, i, this.b.getItemId(i));
        }
        dismiss();
    }
}
