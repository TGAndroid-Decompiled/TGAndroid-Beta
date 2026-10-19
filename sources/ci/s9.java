package ci;

import android.content.Context;
public final class s9 extends y {
    public final aa f5998a;

    public s9(Context context, aa aaVar) {
        super(context);
        this.f5998a = aaVar;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        p4 p4Var = this.f5998a.G0;
        if (p4Var != null) {
            p4Var.b();
        }
    }
}
