package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
public final class i0 implements o0, DialogInterface.OnClickListener {
    public g.f f15128a;
    public j0 f15129b;
    public CharSequence f15130c;
    public final p0 d;

    public i0(p0 p0Var) {
        this.d = p0Var;
    }

    @Override
    public final boolean a() {
        g.f fVar = this.f15128a;
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
        g.f fVar = this.f15128a;
        if (fVar != null) {
            fVar.dismiss();
            this.f15128a = null;
        }
    }

    @Override
    public final CharSequence e() {
        return this.f15130c;
    }

    @Override
    public final Drawable h() {
        return null;
    }

    @Override
    public final void i(CharSequence charSequence) {
        this.f15130c = charSequence;
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
        if (this.f15129b == null) {
            return;
        }
        p0 p0Var = this.d;
        c5.c0 c0Var = new c5.c0(p0Var.getPopupContext());
        g.b bVar = (g.b) c0Var.f4353c;
        CharSequence charSequence = this.f15130c;
        if (charSequence != null) {
            bVar.d = charSequence;
        }
        j0 j0Var = this.f15129b;
        int selectedItemPosition = p0Var.getSelectedItemPosition();
        bVar.f9735i = j0Var;
        bVar.f9736j = this;
        bVar.f9739m = selectedItemPosition;
        bVar.f9738l = true;
        g.f g10 = c0Var.g();
        this.f15128a = g10;
        AlertController$RecycleListView alertController$RecycleListView = g10.f9764f.e;
        g0.d(alertController$RecycleListView, i10);
        g0.c(alertController$RecycleListView, i11);
        this.f15128a.show();
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final void o(ListAdapter listAdapter) {
        this.f15129b = (j0) listAdapter;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        p0 p0Var = this.d;
        p0Var.setSelection(i10);
        if (p0Var.getOnItemClickListener() != null) {
            p0Var.performItemClick(null, i10, this.f15129b.getItemId(i10));
        }
        dismiss();
    }
}
