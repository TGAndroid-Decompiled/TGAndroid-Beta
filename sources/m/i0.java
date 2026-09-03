package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
public final class i0 implements p0, DialogInterface.OnClickListener {
    public g.f f13512a;
    public k0 f13513b;
    public CharSequence f13514c;
    public final q0 d;

    public i0(q0 q0Var) {
        this.d = q0Var;
    }

    @Override
    public final boolean a() {
        g.f fVar = this.f13512a;
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
    public final void dismiss() {
        g.f fVar = this.f13512a;
        if (fVar != null) {
            fVar.dismiss();
            this.f13512a = null;
        }
    }

    @Override
    public final CharSequence e() {
        return this.f13514c;
    }

    @Override
    public final Drawable h() {
        return null;
    }

    @Override
    public final void i(CharSequence charSequence) {
        this.f13514c = charSequence;
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
        if (this.f13513b == null) {
            return;
        }
        q0 q0Var = this.d;
        p2.w wVar = new p2.w(q0Var.getPopupContext());
        g.c cVar = (g.c) wVar.f41052c;
        CharSequence charSequence = this.f13514c;
        if (charSequence != null) {
            cVar.d = charSequence;
        }
        k0 k0Var = this.f13513b;
        int selectedItemPosition = q0Var.getSelectedItemPosition();
        cVar.f6239i = k0Var;
        cVar.f6240j = this;
        cVar.f6243m = selectedItemPosition;
        cVar.f6242l = true;
        g.f f10 = wVar.f();
        this.f13512a = f10;
        AlertController$RecycleListView alertController$RecycleListView = f10.f6266f.e;
        g0.d(alertController$RecycleListView, i10);
        g0.c(alertController$RecycleListView, i11);
        this.f13512a.show();
    }

    @Override
    public final int o() {
        return 0;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i10) {
        q0 q0Var = this.d;
        q0Var.setSelection(i10);
        if (q0Var.getOnItemClickListener() != null) {
            q0Var.performItemClick(null, i10, this.f13513b.getItemId(i10));
        }
        dismiss();
    }

    @Override
    public final void p(ListAdapter listAdapter) {
        this.f13513b = (k0) listAdapter;
    }
}
