package m;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
public final class j0 implements p0, DialogInterface.OnClickListener {
    public g.f f16978a;
    public k0 f16979b;
    public CharSequence f16980c;
    public final q0 d;

    public j0(q0 q0Var) {
        this.d = q0Var;
    }

    @Override
    public final boolean a() {
        g.f fVar = this.f16978a;
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
    public final void c(int i9) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final CharSequence d() {
        return this.f16980c;
    }

    @Override
    public final void dismiss() {
        g.f fVar = this.f16978a;
        if (fVar != null) {
            fVar.dismiss();
            this.f16978a = null;
        }
    }

    @Override
    public final Drawable e() {
        return null;
    }

    @Override
    public final void h(CharSequence charSequence) {
        this.f16980c = charSequence;
    }

    @Override
    public final void i(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override
    public final void j(int i9) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final void l(int i9) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override
    public final void m(int i9, int i10) {
        if (this.f16979b == null) {
            return;
        }
        q0 q0Var = this.d;
        n2.w wVar = new n2.w(q0Var.getPopupContext());
        g.c cVar = (g.c) wVar.f18361c;
        CharSequence charSequence = this.f16980c;
        if (charSequence != null) {
            cVar.d = charSequence;
        }
        k0 k0Var = this.f16979b;
        int selectedItemPosition = q0Var.getSelectedItemPosition();
        cVar.f6952i = k0Var;
        cVar.f6953j = this;
        cVar.f6956m = selectedItemPosition;
        cVar.f6955l = true;
        g.f d = wVar.d();
        this.f16978a = d;
        AlertController$RecycleListView alertController$RecycleListView = d.f6980f.f6960e;
        h0.d(alertController$RecycleListView, i9);
        h0.c(alertController$RecycleListView, i10);
        this.f16978a.show();
    }

    @Override
    public final int n() {
        return 0;
    }

    @Override
    public final void o(ListAdapter listAdapter) {
        this.f16979b = (k0) listAdapter;
    }

    @Override
    public final void onClick(DialogInterface dialogInterface, int i9) {
        q0 q0Var = this.d;
        q0Var.setSelection(i9);
        if (q0Var.getOnItemClickListener() != null) {
            q0Var.performItemClick(null, i9, this.f16979b.getItemId(i9));
        }
        dismiss();
    }
}
