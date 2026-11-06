package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
public final class j0 implements p0, DialogInterface.OnClickListener {
    public g.f f19135a;
    public k0 f19136b;
    public CharSequence f19137c;
    public final q0 d;

    public j0(q0 q0Var) {
        this.d = q0Var;
    }

    @Override
    public final boolean a() {
        g.f fVar = this.f19135a;
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
        return this.f19137c;
    }

    @Override
    public final void dismiss() {
        g.f fVar = this.f19135a;
        if (fVar != null) {
            fVar.dismiss();
            this.f19135a = null;
        }
    }

    @Override
    public final Drawable e() {
        return null;
    }

    @Override
    public final void h(CharSequence charSequence) {
        this.f19137c = charSequence;
    }

    @Override
    public final void i(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override
    public final void j(int i7) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final void k(int i7) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final void l(int i7, int i10) {
        if (this.f19136b == null) {
            return;
        }
        q0 q0Var = this.d;
        f5.u uVar = new f5.u(q0Var.getPopupContext());
        g.b bVar = (g.b) uVar.f11191c;
        CharSequence charSequence = this.f19137c;
        if (charSequence != null) {
            bVar.f13267f = charSequence;
        }
        k0 k0Var = this.f19136b;
        int selectedItemPosition = q0Var.getSelectedItemPosition();
        bVar.f13272l = k0Var;
        bVar.f13273m = this;
        bVar.f13264b = selectedItemPosition;
        bVar.f13263a = true;
        g.f e10 = uVar.e();
        this.f19135a = e10;
        AlertController$RecycleListView alertController$RecycleListView = e10.f13321f.f13301e;
        h0.d(alertController$RecycleListView, i7);
        h0.c(alertController$RecycleListView, i10);
        this.f19135a.show();
    }

    @Override
    public final int m() {
        return 0;
    }

    @Override
    public final void n(ListAdapter listAdapter) {
        this.f19136b = (k0) listAdapter;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        q0 q0Var = this.d;
        q0Var.setSelection(i7);
        if (q0Var.getOnItemClickListener() != null) {
            q0Var.performItemClick(null, i7, this.f19136b.getItemId(i7));
        }
        dismiss();
    }
}
