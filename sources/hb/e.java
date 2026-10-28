package hb;
public final class e implements n {
    public final Class f12730a;

    @Override
    public Object U1() {
        Class cls = this.f12730a;
        try {
            return s.f12762a.a(cls);
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }
}
