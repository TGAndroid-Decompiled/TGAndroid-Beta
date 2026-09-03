package c9;
public final class e implements ra.m {
    public final Class f2178a;

    public e(Class cls) {
        this.f2178a = cls;
    }

    @Override
    public Object u2() {
        Class cls = this.f2178a;
        try {
            return ra.r.f43458a.a(cls);
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }
}
