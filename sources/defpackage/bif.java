package defpackage;
public final class bif implements eif {
    public final eif[] a;

    public bif(eif... eifVarArr) {
        this.a = eifVarArr;
    }

    @Override
    public final tif zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            eif eifVar = this.a[i];
            if (eifVar.zzc(cls)) {
                return eifVar.zzb(cls);
            }
        }
        rjb.j("No factory is available for message type: ".concat(cls.getName()));
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
