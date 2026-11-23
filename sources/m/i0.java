package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
public final class i0 implements o0, DialogInterface.OnClickListener {
    public g.f f20176a;
    public j0 f20177b;
    public CharSequence f20178c;
    public final p0 d;

    public i0(p0 p0Var) {
        this.d = p0Var;
    }

    @Override
    public final boolean a() {
        g.f fVar = this.f20176a;
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
        return this.f20178c;
    }

    @Override
    public final void dismiss() {
        g.f fVar = this.f20176a;
        if (fVar != null) {
            fVar.dismiss();
            this.f20176a = null;
        }
    }

    @Override
    public final Drawable f() {
        return null;
    }

    @Override
    public final void h(CharSequence charSequence) {
        this.f20178c = charSequence;
    }

    @Override
    public final void i(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override
    public final void k(int i7) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final void l(int i7) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final void m(int i7, int i10) {
        if (this.f20177b == null) {
            return;
        }
        p0 p0Var = this.d;
        b3.j jVar = new b3.j(p0Var.getPopupContext());
        g.b bVar = (g.b) jVar.f2874c;
        CharSequence charSequence = this.f20178c;
        if (charSequence != null) {
            bVar.f12925f = charSequence;
        }
        j0 j0Var = this.f20177b;
        int selectedItemPosition = p0Var.getSelectedItemPosition();
        bVar.f12930l = j0Var;
        bVar.f12931m = this;
        bVar.f12922b = selectedItemPosition;
        bVar.f12921a = true;
        g.f f10 = jVar.f();
        this.f20176a = f10;
        AlertController$RecycleListView alertController$RecycleListView = f10.f12979f.f12959e;
        g0.d(alertController$RecycleListView, i7);
        g0.c(alertController$RecycleListView, i10);
        this.f20176a.show();
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final void o(ListAdapter listAdapter) {
        this.f20177b = (j0) listAdapter;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        p0 p0Var = this.d;
        p0Var.setSelection(i7);
        if (p0Var.getOnItemClickListener() != null) {
            p0Var.performItemClick(null, i7, this.f20177b.getItemId(i7));
        }
        dismiss();
    }
}
