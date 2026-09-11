package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
public final class i0 implements o0, DialogInterface.OnClickListener {
    public g.g f15544a;
    public j0 f15545b;
    public CharSequence f15546c;
    public final p0 d;

    public i0(p0 p0Var) {
        this.d = p0Var;
    }

    @Override
    public final boolean a() {
        g.g gVar = this.f15544a;
        if (gVar != null) {
            return gVar.isShowing();
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
    public final void dismiss() {
        g.g gVar = this.f15544a;
        if (gVar != null) {
            gVar.dismiss();
            this.f15544a = null;
        }
    }

    @Override
    public final CharSequence e() {
        return this.f15546c;
    }

    @Override
    public final Drawable h() {
        return null;
    }

    @Override
    public final void i(CharSequence charSequence) {
        this.f15546c = charSequence;
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
        if (this.f15545b == null) {
            return;
        }
        p0 p0Var = this.d;
        c5.b0 b0Var = new c5.b0(p0Var.getPopupContext());
        g.c cVar = (g.c) b0Var.f4347c;
        CharSequence charSequence = this.f15546c;
        if (charSequence != null) {
            cVar.d = charSequence;
        }
        j0 j0Var = this.f15545b;
        int selectedItemPosition = p0Var.getSelectedItemPosition();
        cVar.f10169i = j0Var;
        cVar.f10170j = this;
        cVar.f10173m = selectedItemPosition;
        cVar.f10172l = true;
        g.g e7 = b0Var.e();
        this.f15544a = e7;
        AlertController$RecycleListView alertController$RecycleListView = e7.f10199f.f10179e;
        g0.d(alertController$RecycleListView, i10);
        g0.c(alertController$RecycleListView, i11);
        this.f15544a.show();
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        p0 p0Var = this.d;
        p0Var.setSelection(i10);
        if (p0Var.getOnItemClickListener() != null) {
            p0Var.performItemClick(null, i10, this.f15545b.getItemId(i10));
        }
        dismiss();
    }

    @Override
    public final void p(ListAdapter listAdapter) {
        this.f15545b = (j0) listAdapter;
    }
}
