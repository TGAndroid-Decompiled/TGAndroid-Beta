package defpackage;
public final class qkf implements tkf {
    public final tkf[] a;

    public qkf(tkf... tkfVarArr) {
        this.a = tkfVarArr;
    }

    @Override
    public final ilf zzb(Class cls) {
        for (int i = 0; i < 2; i++) {
            tkf tkfVar = this.a[i];
            if (tkfVar.zzc(cls)) {
                return tkfVar.zzb(cls);
            }
        }
        qyc.c("No factory is available for message type: ".concat(cls.getName()));
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
