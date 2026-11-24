package defpackage;
public final class vse implements due {
    public due[] a;

    @Override
    public final boolean zza(Class cls) {
        for (due dueVar : this.a) {
            if (dueVar.zza(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final swe zzb(Class cls) {
        due[] dueVarArr;
        String str;
        for (due dueVar : this.a) {
            if (dueVar.zza(cls)) {
                return dueVar.zzb(cls);
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
