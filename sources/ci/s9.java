package ci;

import android.content.Context;
public final class s9 extends y {
    public final aa f6000a;

    public s9(Context context, aa aaVar) {
        super(context);
        this.f6000a = aaVar;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        p4 p4Var = this.f6000a.G0;
        if (p4Var != null) {
            p4Var.b();
        }
    }
}
