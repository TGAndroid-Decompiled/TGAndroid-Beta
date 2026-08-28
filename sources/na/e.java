package na;
public final class e implements n {
    public final Class f18529a;

    @Override
    public Object Y1() {
        Class cls = this.f18529a;
        try {
            return s.f18565a.a(cls);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
        }
    }
}
