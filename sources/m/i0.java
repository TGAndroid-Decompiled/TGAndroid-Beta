package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
public final class i0 implements o0, DialogInterface.OnClickListener {
    public g.f f18606a;
    public j0 f18607b;
    public CharSequence f18608c;
    public final p0 d;

    public i0(p0 p0Var) {
        this.d = p0Var;
    }

    @Override
    public final boolean a() {
        g.f fVar = this.f18606a;
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
    public final void c(int i3) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final void dismiss() {
        g.f fVar = this.f18606a;
        if (fVar != null) {
            fVar.dismiss();
            this.f18606a = null;
        }
    }

    @Override
    public final CharSequence e() {
        return this.f18608c;
    }

    @Override
    public final Drawable h() {
        return null;
    }

    @Override
    public final void i(CharSequence charSequence) {
        this.f18608c = charSequence;
    }

    @Override
    public final void j(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override
    public final void k(int i3) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final void l(int i3) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final void m(int i3, int i10) {
        if (this.f18607b == null) {
            return;
        }
        p0 p0Var = this.d;
        e5.u uVar = new e5.u(p0Var.getPopupContext());
        g.b bVar = (g.b) uVar.f9634c;
        CharSequence charSequence = this.f18608c;
        if (charSequence != null) {
            bVar.f11651f = charSequence;
        }
        j0 j0Var = this.f18607b;
        int selectedItemPosition = p0Var.getSelectedItemPosition();
        bVar.f11656l = j0Var;
        bVar.f11657m = this;
        bVar.f11648b = selectedItemPosition;
        bVar.f11647a = true;
        g.f e10 = uVar.e();
        this.f18606a = e10;
        AlertController$RecycleListView alertController$RecycleListView = e10.f11705f.f11685e;
        g0.d(alertController$RecycleListView, i3);
        g0.c(alertController$RecycleListView, i10);
        this.f18606a.show();
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final void o(ListAdapter listAdapter) {
        this.f18607b = (j0) listAdapter;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i3) {
        p0 p0Var = this.d;
        p0Var.setSelection(i3);
        if (p0Var.getOnItemClickListener() != null) {
            p0Var.performItemClick(null, i3, this.f18607b.getItemId(i3));
        }
        dismiss();
    }
}
