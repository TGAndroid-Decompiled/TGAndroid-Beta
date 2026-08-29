package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
public final class j0 implements p0, DialogInterface.OnClickListener {
    public g.f f16575a;
    public k0 f16576b;
    public CharSequence f16577c;
    public final q0 d;

    public j0(q0 q0Var) {
        this.d = q0Var;
    }

    @Override
    public final boolean a() {
        g.f fVar = this.f16575a;
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
    public final CharSequence d() {
        return this.f16577c;
    }

    @Override
    public final void dismiss() {
        g.f fVar = this.f16575a;
        if (fVar != null) {
            fVar.dismiss();
            this.f16575a = null;
        }
    }

    @Override
    public final Drawable e() {
        return null;
    }

    @Override
    public final void i(CharSequence charSequence) {
        this.f16577c = charSequence;
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
        if (this.f16576b == null) {
            return;
        }
        q0 q0Var = this.d;
        p2.u uVar = new p2.u(q0Var.getPopupContext());
        g.c cVar = (g.c) uVar.f45495c;
        CharSequence charSequence = this.f16577c;
        if (charSequence != null) {
            cVar.d = charSequence;
        }
        k0 k0Var = this.f16576b;
        int selectedItemPosition = q0Var.getSelectedItemPosition();
        cVar.f6862i = k0Var;
        cVar.f6863j = this;
        cVar.f6866m = selectedItemPosition;
        cVar.f6865l = true;
        g.f d = uVar.d();
        this.f16575a = d;
        AlertController$RecycleListView alertController$RecycleListView = d.f6890f.f6870e;
        h0.d(alertController$RecycleListView, i10);
        h0.c(alertController$RecycleListView, i11);
        this.f16575a.show();
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        q0 q0Var = this.d;
        q0Var.setSelection(i10);
        if (q0Var.getOnItemClickListener() != null) {
            q0Var.performItemClick(null, i10, this.f16576b.getItemId(i10));
        }
        dismiss();
    }

    @Override
    public final void p(ListAdapter listAdapter) {
        this.f16576b = (k0) listAdapter;
    }
}
