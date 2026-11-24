package defpackage;

import android.view.ViewGroup;
public final class etb extends ViewGroup.MarginLayoutParams {
    public int a;
    public byte b;

    public etb(etb etbVar) {
        super((ViewGroup.MarginLayoutParams) etbVar);
        this.a = 0;
        this.a = etbVar.a;
    }

    public etb(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
