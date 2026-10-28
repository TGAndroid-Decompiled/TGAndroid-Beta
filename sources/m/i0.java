package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
public final class i0 implements o0, DialogInterface.OnClickListener {
    public g.f f17738a;
    public j0 f17739b;
    public CharSequence f17740c;
    public final p0 d;

    public i0(p0 p0Var) {
        this.d = p0Var;
    }

    @Override
    public final boolean a() {
        g.f fVar = this.f17738a;
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
        return this.f17740c;
    }

    @Override
    public final void dismiss() {
        g.f fVar = this.f17738a;
        if (fVar != null) {
            fVar.dismiss();
            this.f17738a = null;
        }
    }

    @Override
    public final Drawable e() {
        return null;
    }

    @Override
    public final void g(CharSequence charSequence) {
        this.f17740c = charSequence;
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
        if (this.f17739b == null) {
            return;
        }
        p0 p0Var = this.d;
        d5.z zVar = new d5.z(p0Var.getPopupContext());
        g.b bVar = (g.b) zVar.f8027c;
        CharSequence charSequence = this.f17740c;
        if (charSequence != null) {
            bVar.d = charSequence;
        }
        j0 j0Var = this.f17739b;
        int selectedItemPosition = p0Var.getSelectedItemPosition();
        bVar.f12109i = j0Var;
        bVar.f12110j = this;
        bVar.f12113m = selectedItemPosition;
        bVar.f12112l = true;
        g.f f7 = zVar.f();
        this.f17738a = f7;
        AlertController$RecycleListView alertController$RecycleListView = f7.f12138f.e;
        g0.d(alertController$RecycleListView, i10);
        g0.c(alertController$RecycleListView, i11);
        this.f17738a.show();
    }

    @Override
    public final int m() {
        return 0;
    }

    @Override
    public final void n(ListAdapter listAdapter) {
        this.f17739b = (j0) listAdapter;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        p0 p0Var = this.d;
        p0Var.setSelection(i10);
        if (p0Var.getOnItemClickListener() != null) {
            p0Var.performItemClick(null, i10, this.f17739b.getItemId(i10));
        }
        dismiss();
    }
}
