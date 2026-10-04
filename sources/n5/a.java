package n5;
public final class a implements fd.a {
    public static final Object f16649c = new Object();
    public volatile b f16650a;
    public volatile Object f16651b;

    public static fd.a a(b bVar) {
        if (bVar instanceof a) {
            return bVar;
        }
        ?? obj = new Object();
        obj.f16651b = f16649c;
        obj.f16650a = bVar;
        return obj;
    }

    @Override
    public final Object mo28get() {
        Object obj;
        Object obj2 = this.f16651b;
        Object obj3 = f16649c;
        if (obj2 == obj3) {
            synchronized (this) {
                try {
                    obj = this.f16651b;
                    if (obj == obj3) {
                        obj = this.f16650a.mo28get();
                        Object obj4 = this.f16651b;
                        if (obj4 != obj3 && obj4 != obj) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj4 + " & " + obj + ". This is likely due to a circular dependency.");
                        }
                        this.f16651b = obj;
                        this.f16650a = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return obj;
        }
        return obj2;
    }
}
