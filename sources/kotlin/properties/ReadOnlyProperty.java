package kotlin.properties;

import kotlin.reflect.KProperty;

public interface ReadOnlyProperty {
    Object getValue(Object obj, KProperty kProperty);
}
