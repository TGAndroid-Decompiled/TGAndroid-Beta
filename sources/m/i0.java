package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
public final class i0 implements o0, DialogInterface.OnClickListener {
    public g.f f20110a;
    public j0 f20111b;
    public CharSequence f20112c;
    public final p0 d;

    public i0(p0 p0Var) {
        this.d = p0Var;
    }

    @Override
    public final boolean a() {
        g.f fVar = this.f20110a;
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
        return this.f20112c;
    }

    @Override
    public final void dismiss() {
        g.f fVar = this.f20110a;
        if (fVar != null) {
            fVar.dismiss();
            this.f20110a = null;
        }
    }

    @Override
    public final Drawable e() {
        return null;
    }

    @Override
    public final void i(CharSequence charSequence) {
        this.f20112c = charSequence;
    }

    @Override
    public final void j(Drawable drawable) {
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
        if (this.f20111b == null) {
            return;
        }
        p0 p0Var = this.d;
        b3.j jVar = new b3.j(p0Var.getPopupContext());
        g.b bVar = (g.b) jVar.f2915c;
        CharSequence charSequence = this.f20112c;
        if (charSequence != null) {
            bVar.f12960f = charSequence;
        }
        j0 j0Var = this.f20111b;
        int selectedItemPosition = p0Var.getSelectedItemPosition();
        bVar.f12965l = j0Var;
        bVar.f12966m = this;
        bVar.f12957b = selectedItemPosition;
        bVar.f12956a = true;
        g.f g10 = jVar.g();
        this.f20110a = g10;
        AlertController$RecycleListView alertController$RecycleListView = g10.f13014f.f12994e;
        g0.d(alertController$RecycleListView, i7);
        g0.c(alertController$RecycleListView, i10);
        this.f20110a.show();
    }

    @Override
    public final int o() {
        return 0;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i7) {
        p0 p0Var = this.d;
        p0Var.setSelection(i7);
        if (p0Var.getOnItemClickListener() != null) {
            p0Var.performItemClick(null, i7, this.f20111b.getItemId(i7));
        }
        dismiss();
    }

    @Override
    public final void p(ListAdapter listAdapter) {
        this.f20111b = (j0) listAdapter;
    }
}
