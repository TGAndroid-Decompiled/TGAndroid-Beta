package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
public final class i0 implements o0, DialogInterface.OnClickListener {
    public g.f f19718a;
    public j0 f19719b;
    public CharSequence f19720c;
    public final p0 d;

    public i0(p0 p0Var) {
        this.d = p0Var;
    }

    @Override
    public final boolean a() {
        g.f fVar = this.f19718a;
        if (fVar != null) {
            return fVar.isShowing();
        }
        return false;
    }

    @Override
    public final int b() {
        return 0;
    }

    @Override
    public final void c(int i7) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final CharSequence d() {
        return this.f19720c;
    }

    @Override
    public final void dismiss() {
        g.f fVar = this.f19718a;
        if (fVar != null) {
            fVar.dismiss();
            this.f19718a = null;
        }
    }

    @Override
    public final Drawable e() {
        return null;
    }

    @Override
    public final void h(CharSequence charSequence) {
        this.f19720c = charSequence;
    }

    @Override
    public final void i(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override
    public final void k(int i7) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final void l(int i7) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final void m(int i7, int i10) {
        if (this.f19719b == null) {
            return;
        }
        p0 p0Var = this.d;
        f5.v vVar = new f5.v(p0Var.getPopupContext());
        g.b bVar = (g.b) vVar.f11019c;
        CharSequence charSequence = this.f19720c;
        if (charSequence != null) {
            bVar.f12617f = charSequence;
        }
        j0 j0Var = this.f19719b;
        int selectedItemPosition = p0Var.getSelectedItemPosition();
        bVar.f12622l = j0Var;
        bVar.f12623m = this;
        bVar.f12614b = selectedItemPosition;
        bVar.f12613a = true;
        g.f g10 = vVar.g();
        this.f19718a = g10;
        AlertController$RecycleListView alertController$RecycleListView = g10.f12671f.f12651e;
        g0.d(alertController$RecycleListView, i7);
        g0.c(alertController$RecycleListView, i10);
        this.f19718a.show();
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final void o(ListAdapter listAdapter) {
        this.f19719b = (j0) listAdapter;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        p0 p0Var = this.d;
        p0Var.setSelection(i7);
        if (p0Var.getOnItemClickListener() != null) {
            p0Var.performItemClick(null, i7, this.f19719b.getItemId(i7));
        }
        dismiss();
    }
}
