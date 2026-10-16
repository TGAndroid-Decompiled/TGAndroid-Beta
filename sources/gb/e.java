package gb;
public final class e implements p {
    public final Class f10047a;

    @Override
    public Object i2() {
        Class cls = this.f10047a;
        try {
            return u.f10081a.a(cls);
        } catch (Exception e) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e);
        }
    }
}
