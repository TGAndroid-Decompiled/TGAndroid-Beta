package defpackage;
public final class mxe implements uye {
    public uye[] a;

    @Override
    public final boolean zza(Class cls) {
        for (uye uyeVar : this.a) {
            if (uyeVar.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final j1f zzb(Class cls) {
        uye[] uyeVarArr;
        String str;
        for (uye uyeVar : this.a) {
            if (uyeVar.zza(cls)) {
                return uyeVar.zzb(cls);
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
