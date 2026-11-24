package defpackage;
public final class ard implements ssd {
    public ssd[] a;

    @Override
    public final boolean zza(Class cls) {
        for (ssd ssdVar : this.a) {
            if (ssdVar.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final iwd zzb(Class cls) {
        ssd[] ssdVarArr;
        String str;
        for (ssd ssdVar : this.a) {
            if (ssdVar.zza(cls)) {
                return ssdVar.zzb(cls);
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
