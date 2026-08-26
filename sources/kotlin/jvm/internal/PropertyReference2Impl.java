package kotlin.jvm.internal;

import kotlin.reflect.KCallable;
import kotlin.reflect.KProperty2;

public final class PropertyReference2Impl extends PropertyReference implements KProperty2 {
    public PropertyReference2Impl(Class cls) {
        super(CallableReference.NO_RECEIVER, cls, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0);
    }

    @Override
    public final KCallable computeReflected() {
        Reflection.factory.getClass();
        return this;
    }

    public final void getGetter() {
        ((PropertyReference2Impl) ((KProperty2) getReflected())).getGetter();
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        getGetter();
        throw null;
    }
}
