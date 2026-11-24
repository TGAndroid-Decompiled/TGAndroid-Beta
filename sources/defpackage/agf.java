package defpackage;
public final class agf implements dgf {
    public final dgf[] a;

    public agf(dgf... dgfVarArr) {
        this.a = dgfVarArr;
    }

    @Override
    public final sgf zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            dgf dgfVar = this.a[i];
            if (dgfVar.zzc(cls)) {
                return dgfVar.zzb(cls);
            }
        }
        fyb.i("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override
    public final boolean zzc(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (this.a[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
