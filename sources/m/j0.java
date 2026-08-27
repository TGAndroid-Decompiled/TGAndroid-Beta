package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;

public final class j0 implements p0, DialogInterface.OnClickListener {

    public g.g f17353a;

    public k0 f17354b;

    public CharSequence f17355c;
    public final q0 d;

    public j0(q0 q0Var) {
        this.d = q0Var;
    }

    @Override
    public final boolean a() {
        g.g gVar = this.f17353a;
        if (gVar != null) {
            return gVar.isShowing();
        }
        return false;
    }

    @Override
    public final int b() {
        return 0;
    }

    @Override
    public final void c(int i10) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final CharSequence d() {
        return this.f17355c;
    }

    @Override
    public final void dismiss() {
        g.g gVar = this.f17353a;
        if (gVar != null) {
            gVar.dismiss();
            this.f17353a = null;
        }
    }

    @Override
    public final Drawable e() {
        return null;
    }

    @Override
    public final void h(CharSequence charSequence) {
        this.f17355c = charSequence;
    }

    @Override
    public final void i(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override
    public final void k(int i10) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final void l(int i10) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final void m(int i10, int i11) {
        if (this.f17354b == null) {
            return;
        }
        q0 q0Var = this.d;
        n2.v vVar = new n2.v(q0Var.getPopupContext());
        g.d dVar = (g.d) vVar.f18187c;
        CharSequence charSequence = this.f17355c;
        if (charSequence != null) {
            dVar.d = charSequence;
        }
        k0 k0Var = this.f17354b;
        int selectedItemPosition = q0Var.getSelectedItemPosition();
        dVar.f6233i = k0Var;
        dVar.f6234j = this;
        dVar.f6237m = selectedItemPosition;
        dVar.f6236l = true;
        g.g gVarD = vVar.d();
        this.f17353a = gVarD;
        AlertController$RecycleListView alertController$RecycleListView = gVarD.f6261f.f6241e;
        h0.d(alertController$RecycleListView, i10);
        h0.c(alertController$RecycleListView, i11);
        this.f17353a.show();
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final void o(ListAdapter listAdapter) {
        this.f17354b = (k0) listAdapter;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        q0 q0Var = this.d;
        q0Var.setSelection(i10);
        if (q0Var.getOnItemClickListener() != null) {
            q0Var.performItemClick(null, i10, this.f17354b.getItemId(i10));
        }
        dismiss();
    }
}
