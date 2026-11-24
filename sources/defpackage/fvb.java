package defpackage;

import android.view.ViewGroup;
public final class fvb extends ViewGroup.MarginLayoutParams {
    public int a;
    public byte b;

    public fvb(fvb fvbVar) {
        super((ViewGroup.MarginLayoutParams) fvbVar);
        this.a = 0;
        this.a = fvbVar.a;
    }

    public fvb(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
