package defpackage;

import android.view.ViewGroup;
public final class fxb extends ViewGroup.MarginLayoutParams {
    public int a;
    public byte b;

    public fxb(fxb fxbVar) {
        super((ViewGroup.MarginLayoutParams) fxbVar);
        this.a = 0;
        this.a = fxbVar.a;
    }

    public fxb(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.a = 0;
    }
}
