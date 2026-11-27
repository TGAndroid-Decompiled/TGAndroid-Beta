package defpackage;
public final class ntd implements fvd {
    public fvd[] a;

    @Override
    public final boolean zza(Class cls) {
        for (fvd fvdVar : this.a) {
            if (fvdVar.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final vyd zzb(Class cls) {
        fvd[] fvdVarArr;
        String str;
        for (fvd fvdVar : this.a) {
            if (fvdVar.zza(cls)) {
                return fvdVar.zzb(cls);
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
