package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
public final class j0 implements p0, DialogInterface.OnClickListener {
    public g.f f16230a;
    public k0 f16231b;
    public CharSequence f16232c;
    public final q0 d;

    public j0(q0 q0Var) {
        this.d = q0Var;
    }

    @Override
    public final boolean a() {
        g.f fVar = this.f16230a;
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
        return this.f16232c;
    }

    @Override
    public final void dismiss() {
        g.f fVar = this.f16230a;
        if (fVar != null) {
            fVar.dismiss();
            this.f16230a = null;
        }
    }

    @Override
    public final Drawable h() {
        return null;
    }

    @Override
    public final void i(CharSequence charSequence) {
        this.f16232c = charSequence;
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
        if (this.f16231b == null) {
            return;
        }
        q0 q0Var = this.d;
        c5.b0 b0Var = new c5.b0(q0Var.getPopupContext());
        g.b bVar = (g.b) b0Var.f4704c;
        CharSequence charSequence = this.f16232c;
        if (charSequence != null) {
            bVar.d = charSequence;
        }
        k0 k0Var = this.f16231b;
        int selectedItemPosition = q0Var.getSelectedItemPosition();
        bVar.f10646i = k0Var;
        bVar.f10647j = this;
        bVar.f10650m = selectedItemPosition;
        bVar.f10649l = true;
        g.f g10 = b0Var.g();
        this.f16230a = g10;
        AlertController$RecycleListView alertController$RecycleListView = g10.f10675f.e;
        h0.d(alertController$RecycleListView, i10);
        h0.c(alertController$RecycleListView, i11);
        this.f16230a.show();
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final void o(ListAdapter listAdapter) {
        this.f16231b = (k0) listAdapter;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        q0 q0Var = this.d;
        q0Var.setSelection(i10);
        if (q0Var.getOnItemClickListener() != null) {
            q0Var.performItemClick(null, i10, this.f16231b.getItemId(i10));
        }
        dismiss();
    }
}
