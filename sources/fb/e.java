package fb;
public final class e implements o {
    public final Class f9807a;

    public e(Class cls) {
        this.f9807a = cls;
    }

    @Override
    public Object w2() {
        Class cls = this.f9807a;
        try {
            return t.f9844a.a(cls);
        } catch (Exception e7) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e7);
        }
    }
}
