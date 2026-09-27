package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
public final class i0 implements o0, DialogInterface.OnClickListener {
    public g.g f14467a;
    public j0 f14468b;
    public CharSequence f14469c;
    public final p0 d;

    public i0(p0 p0Var) {
        this.d = p0Var;
    }

    @Override
    public final boolean a() {
        g.g gVar = this.f14467a;
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
    public final CharSequence d() {
        return this.f14469c;
    }

    @Override
    public final void dismiss() {
        g.g gVar = this.f14467a;
        if (gVar != null) {
            gVar.dismiss();
            this.f14467a = null;
        }
    }

    @Override
    public final Drawable e() {
        return null;
    }

    @Override
    public final void g(CharSequence charSequence) {
        this.f14469c = charSequence;
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
        if (this.f14468b == null) {
            return;
        }
        p0 p0Var = this.d;
        c5.b0 b0Var = new c5.b0(p0Var.getPopupContext());
        g.c cVar = (g.c) b0Var.f3841c;
        CharSequence charSequence = this.f14469c;
        if (charSequence != null) {
            cVar.d = charSequence;
        }
        j0 j0Var = this.f14468b;
        int selectedItemPosition = p0Var.getSelectedItemPosition();
        cVar.f9220i = j0Var;
        cVar.f9221j = this;
        cVar.f9224m = selectedItemPosition;
        cVar.f9223l = true;
        g.g e = b0Var.e();
        this.f14467a = e;
        AlertController$RecycleListView alertController$RecycleListView = e.f9249f.e;
        g0.d(alertController$RecycleListView, i10);
        g0.c(alertController$RecycleListView, i11);
        this.f14467a.show();
    }

    @Override
    public final int m() {
        return 0;
    }

    @Override
    public final void o(ListAdapter listAdapter) {
        this.f14468b = (j0) listAdapter;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        p0 p0Var = this.d;
        p0Var.setSelection(i10);
        if (p0Var.getOnItemClickListener() != null) {
            p0Var.performItemClick(null, i10, this.f14468b.getItemId(i10));
        }
        dismiss();
    }
}
