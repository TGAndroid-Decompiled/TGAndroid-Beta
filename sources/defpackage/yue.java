package defpackage;
public final class yue implements gwe {
    public gwe[] a;

    @Override
    public final boolean zza(Class cls) {
        for (gwe gweVar : this.a) {
            if (gweVar.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final uye zzb(Class cls) {
        gwe[] gweVarArr;
        String str;
        for (gwe gweVar : this.a) {
            if (gweVar.zza(cls)) {
                return gweVar.zzb(cls);
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
