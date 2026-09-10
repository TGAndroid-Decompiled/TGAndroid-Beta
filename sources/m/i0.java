package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
public final class i0 implements o0, DialogInterface.OnClickListener {
    public g.g f13032a;
    public j0 f13033b;
    public CharSequence f13034c;
    public final p0 d;

    public i0(p0 p0Var) {
        this.d = p0Var;
    }

    @Override
    public final boolean a() {
        g.g gVar = this.f13032a;
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
        return this.f13034c;
    }

    @Override
    public final void dismiss() {
        g.g gVar = this.f13032a;
        if (gVar != null) {
            gVar.dismiss();
            this.f13032a = null;
        }
    }

    @Override
    public final Drawable e() {
        return null;
    }

    @Override
    public final void i(CharSequence charSequence) {
        this.f13034c = charSequence;
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
        if (this.f13033b == null) {
            return;
        }
        p0 p0Var = this.d;
        c5.b0 b0Var = new c5.b0(p0Var.getPopupContext());
        g.c cVar = (g.c) b0Var.f4261c;
        CharSequence charSequence = this.f13034c;
        if (charSequence != null) {
            cVar.d = charSequence;
        }
        j0 j0Var = this.f13033b;
        int selectedItemPosition = p0Var.getSelectedItemPosition();
        cVar.f8340i = j0Var;
        cVar.f8341j = this;
        cVar.f8344m = selectedItemPosition;
        cVar.f8343l = true;
        g.g e = b0Var.e();
        this.f13032a = e;
        AlertController$RecycleListView alertController$RecycleListView = e.f8390f.e;
        g0.d(alertController$RecycleListView, i10);
        g0.c(alertController$RecycleListView, i11);
        this.f13032a.show();
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        p0 p0Var = this.d;
        p0Var.setSelection(i10);
        if (p0Var.getOnItemClickListener() != null) {
            p0Var.performItemClick(null, i10, this.f13033b.getItemId(i10));
        }
        dismiss();
    }

    @Override
    public final void p(ListAdapter listAdapter) {
        this.f13033b = (j0) listAdapter;
    }
}
