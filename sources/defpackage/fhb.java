package defpackage;

import android.content.Context;
public final class fhb extends l46 {
    public final byte M;
    public final ghb N;

    public fhb(ghb ghbVar, Context context, wjb wjbVar, byte b) {
        super(context, wjbVar);
        this.M = b;
        this.N = ghbVar;
    }

    @Override
    public final int c() {
        byte b = this.M;
        ghb ghbVar = this.N;
        switch (b) {
            case 0:
                return ghbVar.a(super.c());
            default:
                return ghbVar.a(super.c());
        }
    }

    @Override
    public final int d(int i) {
        byte b = this.M;
        ghb ghbVar = this.N;
        switch (b) {
            case 0:
                return ghbVar.a(i);
            default:
                return ghbVar.a(i);
        }
    }
}
