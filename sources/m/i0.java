package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
public final class i0 implements o0, DialogInterface.OnClickListener {
    public g.f f15450a;
    public j0 f15451b;
    public CharSequence f15452c;
    public final p0 d;

    public i0(p0 p0Var) {
        this.d = p0Var;
    }

    @Override
    public final boolean a() {
        g.f fVar = this.f15450a;
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
        return this.f15452c;
    }

    @Override
    public final void dismiss() {
        g.f fVar = this.f15450a;
        if (fVar != null) {
            fVar.dismiss();
            this.f15450a = null;
        }
    }

    @Override
    public final Drawable h() {
        return null;
    }

    @Override
    public final void i(CharSequence charSequence) {
        this.f15452c = charSequence;
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
        if (this.f15451b == null) {
            return;
        }
        p0 p0Var = this.d;
        c5.b0 b0Var = new c5.b0(p0Var.getPopupContext());
        g.b bVar = (g.b) b0Var.f4202c;
        CharSequence charSequence = this.f15452c;
        if (charSequence != null) {
            bVar.d = charSequence;
        }
        j0 j0Var = this.f15451b;
        int selectedItemPosition = p0Var.getSelectedItemPosition();
        bVar.f10101i = j0Var;
        bVar.f10102j = this;
        bVar.f10105m = selectedItemPosition;
        bVar.f10104l = true;
        g.f f7 = b0Var.f();
        this.f15450a = f7;
        AlertController$RecycleListView alertController$RecycleListView = f7.f10131f.f10111e;
        g0.d(alertController$RecycleListView, i10);
        g0.c(alertController$RecycleListView, i11);
        this.f15450a.show();
    }

    @Override
    public final int o() {
        return 0;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        p0 p0Var = this.d;
        p0Var.setSelection(i10);
        if (p0Var.getOnItemClickListener() != null) {
            p0Var.performItemClick(null, i10, this.f15451b.getItemId(i10));
        }
        dismiss();
    }

    @Override
    public final void p(ListAdapter listAdapter) {
        this.f15451b = (j0) listAdapter;
    }
}
