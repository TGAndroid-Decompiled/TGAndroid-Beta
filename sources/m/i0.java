package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
public final class i0 implements o0, DialogInterface.OnClickListener {
    public g.f f12435a;
    public j0 f12436b;
    public CharSequence f12437c;
    public final p0 d;

    public i0(p0 p0Var) {
        this.d = p0Var;
    }

    @Override
    public final boolean a() {
        g.f fVar = this.f12435a;
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
    public final void c(int i10) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final void dismiss() {
        g.f fVar = this.f12435a;
        if (fVar != null) {
            fVar.dismiss();
            this.f12435a = null;
        }
    }

    @Override
    public final CharSequence e() {
        return this.f12437c;
    }

    @Override
    public final Drawable g() {
        return null;
    }

    @Override
    public final void i(CharSequence charSequence) {
        this.f12437c = charSequence;
    }

    @Override
    public final void j(Drawable drawable) {
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
        if (this.f12436b == null) {
            return;
        }
        p0 p0Var = this.d;
        c5.x xVar = new c5.x(p0Var.getPopupContext());
        g.b bVar = (g.b) xVar.f3828c;
        CharSequence charSequence = this.f12437c;
        if (charSequence != null) {
            bVar.f7140f = charSequence;
        }
        j0 j0Var = this.f12436b;
        int selectedItemPosition = p0Var.getSelectedItemPosition();
        bVar.f7145l = j0Var;
        bVar.f7146m = this;
        bVar.f7138b = selectedItemPosition;
        bVar.f7137a = true;
        g.f g10 = xVar.g();
        this.f12435a = g10;
        AlertController$RecycleListView alertController$RecycleListView = g10.f7192f.e;
        g0.d(alertController$RecycleListView, i10);
        g0.c(alertController$RecycleListView, i11);
        this.f12435a.show();
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final void o(ListAdapter listAdapter) {
        this.f12436b = (j0) listAdapter;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        p0 p0Var = this.d;
        p0Var.setSelection(i10);
        if (p0Var.getOnItemClickListener() != null) {
            p0Var.performItemClick(null, i10, this.f12436b.getItemId(i10));
        }
        dismiss();
    }
}
