package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
public final class i0 implements o0, DialogInterface.OnClickListener {
    public g.f f13214a;
    public j0 f13215b;
    public CharSequence f13216c;
    public final p0 d;

    public i0(p0 p0Var) {
        this.d = p0Var;
    }

    @Override
    public final boolean a() {
        g.f fVar = this.f13214a;
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
        return this.f13216c;
    }

    @Override
    public final void dismiss() {
        g.f fVar = this.f13214a;
        if (fVar != null) {
            fVar.dismiss();
            this.f13214a = null;
        }
    }

    @Override
    public final Drawable e() {
        return null;
    }

    @Override
    public final void i(CharSequence charSequence) {
        this.f13216c = charSequence;
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
        if (this.f13215b == null) {
            return;
        }
        p0 p0Var = this.d;
        p2.v vVar = new p2.v(p0Var.getPopupContext());
        g.c cVar = (g.c) vVar.f44183c;
        CharSequence charSequence = this.f13216c;
        if (charSequence != null) {
            cVar.d = charSequence;
        }
        j0 j0Var = this.f13215b;
        int selectedItemPosition = p0Var.getSelectedItemPosition();
        cVar.f6705i = j0Var;
        cVar.f6706j = this;
        cVar.f6709m = selectedItemPosition;
        cVar.f6708l = true;
        g.f d = vVar.d();
        this.f13214a = d;
        AlertController$RecycleListView alertController$RecycleListView = d.f6733f.f6713e;
        g0.d(alertController$RecycleListView, i10);
        g0.c(alertController$RecycleListView, i11);
        this.f13214a.show();
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final void o(ListAdapter listAdapter) {
        this.f13215b = (j0) listAdapter;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        p0 p0Var = this.d;
        p0Var.setSelection(i10);
        if (p0Var.getOnItemClickListener() != null) {
            p0Var.performItemClick(null, i10, this.f13215b.getItemId(i10));
        }
        dismiss();
    }
}
