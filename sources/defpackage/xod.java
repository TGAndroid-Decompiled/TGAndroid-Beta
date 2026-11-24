package defpackage;
public final class xod implements pqd {
    public pqd[] a;

    @Override
    public final boolean zza(Class cls) {
        for (pqd pqdVar : this.a) {
            if (pqdVar.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final fud zzb(Class cls) {
        pqd[] pqdVarArr;
        String str;
        for (pqd pqdVar : this.a) {
            if (pqdVar.zza(cls)) {
                return pqdVar.zzb(cls);
            }
        }
        String name = cls.getName();
        if (name.length() != 0) {
            str = "No factory is available for message type: ".concat(name);
        } else {
            str = new String("No factory is available for message type: ");
        }
        throw new UnsupportedOperationException(str);
    }
}
