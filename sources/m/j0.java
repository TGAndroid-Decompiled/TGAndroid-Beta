package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
public final class j0 implements p0, DialogInterface.OnClickListener {
    public g.f f16228a;
    public k0 f16229b;
    public CharSequence f16230c;
    public final q0 d;

    public j0(q0 q0Var) {
        this.d = q0Var;
    }

    @Override
    public final boolean a() {
        g.f fVar = this.f16228a;
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
        return this.f16230c;
    }

    @Override
    public final void dismiss() {
        g.f fVar = this.f16228a;
        if (fVar != null) {
            fVar.dismiss();
            this.f16228a = null;
        }
    }

    @Override
    public final Drawable h() {
        return null;
    }

    @Override
    public final void i(CharSequence charSequence) {
        this.f16230c = charSequence;
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
        if (this.f16229b == null) {
            return;
        }
        q0 q0Var = this.d;
        c5.b0 b0Var = new c5.b0(q0Var.getPopupContext());
        g.b bVar = (g.b) b0Var.f4704c;
        CharSequence charSequence = this.f16230c;
        if (charSequence != null) {
            bVar.d = charSequence;
        }
        k0 k0Var = this.f16229b;
        int selectedItemPosition = q0Var.getSelectedItemPosition();
        bVar.f10644i = k0Var;
        bVar.f10645j = this;
        bVar.f10648m = selectedItemPosition;
        bVar.f10647l = true;
        g.f i12 = b0Var.i();
        this.f16228a = i12;
        AlertController$RecycleListView alertController$RecycleListView = i12.f10673f.e;
        h0.d(alertController$RecycleListView, i10);
        h0.c(alertController$RecycleListView, i11);
        this.f16228a.show();
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final void o(ListAdapter listAdapter) {
        this.f16229b = (k0) listAdapter;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        q0 q0Var = this.d;
        q0Var.setSelection(i10);
        if (q0Var.getOnItemClickListener() != null) {
            q0Var.performItemClick(null, i10, this.f16229b.getItemId(i10));
        }
        dismiss();
    }
}
