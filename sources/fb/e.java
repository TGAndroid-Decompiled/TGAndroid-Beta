package fb;
public final class e implements o {
    public final Class f9020a;

    @Override
    public Object p2() {
        Class cls = this.f9020a;
        try {
            return t.f9053a.a(cls);
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }
}
