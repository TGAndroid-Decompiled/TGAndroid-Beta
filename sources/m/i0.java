package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
public final class i0 implements o0, DialogInterface.OnClickListener {
    public g.f f15701a;
    public j0 f15702b;
    public CharSequence f15703c;
    public final p0 d;

    public i0(p0 p0Var) {
        this.d = p0Var;
    }

    @Override
    public final boolean a() {
        g.f fVar = this.f15701a;
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
        return this.f15703c;
    }

    @Override
    public final void dismiss() {
        g.f fVar = this.f15701a;
        if (fVar != null) {
            fVar.dismiss();
            this.f15701a = null;
        }
    }

    @Override
    public final Drawable e() {
        return null;
    }

    @Override
    public final void h(CharSequence charSequence) {
        this.f15703c = charSequence;
    }

    @Override
    public final void i(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override
    public final void j(int i10) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final void k(int i10) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final void l(int i10, int i11) {
        if (this.f15702b == null) {
            return;
        }
        p0 p0Var = this.d;
        c5.b0 b0Var = new c5.b0(p0Var.getPopupContext());
        g.b bVar = (g.b) b0Var.f4204c;
        CharSequence charSequence = this.f15703c;
        if (charSequence != null) {
            bVar.d = charSequence;
        }
        j0 j0Var = this.f15702b;
        int selectedItemPosition = p0Var.getSelectedItemPosition();
        bVar.f10103i = j0Var;
        bVar.f10104j = this;
        bVar.f10107m = selectedItemPosition;
        bVar.f10106l = true;
        g.f e7 = b0Var.e();
        this.f15701a = e7;
        AlertController$RecycleListView alertController$RecycleListView = e7.f10133f.f10113e;
        g0.d(alertController$RecycleListView, i10);
        g0.c(alertController$RecycleListView, i11);
        this.f15701a.show();
    }

    @Override
    public final int m() {
        return 0;
    }

    @Override
    public final void n(ListAdapter listAdapter) {
        this.f15702b = (j0) listAdapter;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        p0 p0Var = this.d;
        p0Var.setSelection(i10);
        if (p0Var.getOnItemClickListener() != null) {
            p0Var.performItemClick(null, i10, this.f15702b.getItemId(i10));
        }
        dismiss();
    }
}
