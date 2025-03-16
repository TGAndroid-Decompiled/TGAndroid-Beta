package kotlin.jvm.internal;

public class PropertyReference2Impl extends PropertyReference2 {
    public PropertyReference2Impl(Class cls, String str, String str2, int i) {
        super(cls, str, str2, i);
    }

    @Override
    public Object get(Object obj, Object obj2) {
        getGetter();
        throw null;
    }
}
