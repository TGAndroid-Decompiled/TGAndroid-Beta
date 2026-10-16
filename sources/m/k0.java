package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
public final class k0 implements q0, DialogInterface.OnClickListener {
    public g.f f14881a;
    public l0 f14882b;
    public CharSequence f14883c;
    public final r0 d;

    public k0(r0 r0Var) {
        this.d = r0Var;
    }

    @Override
    public final boolean a() {
        g.f fVar = this.f14881a;
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
        return this.f14883c;
    }

    @Override
    public final void dismiss() {
        g.f fVar = this.f14881a;
        if (fVar != null) {
            fVar.dismiss();
            this.f14881a = null;
        }
    }

    @Override
    public final Drawable e() {
        return null;
    }

    @Override
    public final void h(CharSequence charSequence) {
        this.f14883c = charSequence;
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
        if (this.f14882b == null) {
            return;
        }
        r0 r0Var = this.d;
        c5.c0 c0Var = new c5.c0(r0Var.getPopupContext());
        g.b bVar = (g.b) c0Var.f4356c;
        CharSequence charSequence = this.f14883c;
        if (charSequence != null) {
            bVar.d = charSequence;
        }
        l0 l0Var = this.f14882b;
        int selectedItemPosition = r0Var.getSelectedItemPosition();
        bVar.f9738i = l0Var;
        bVar.f9739j = this;
        bVar.f9742m = selectedItemPosition;
        bVar.f9741l = true;
        g.f d = c0Var.d();
        this.f14881a = d;
        AlertController$RecycleListView alertController$RecycleListView = d.f9767f.e;
        i0.d(alertController$RecycleListView, i10);
        i0.c(alertController$RecycleListView, i11);
        this.f14881a.show();
    }

    @Override
    public final int m() {
        return 0;
    }

    @Override
    public final void n(ListAdapter listAdapter) {
        this.f14882b = (l0) listAdapter;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        r0 r0Var = this.d;
        r0Var.setSelection(i10);
        if (r0Var.getOnItemClickListener() != null) {
            r0Var.performItemClick(null, i10, this.f14882b.getItemId(i10));
        }
        dismiss();
    }
}
