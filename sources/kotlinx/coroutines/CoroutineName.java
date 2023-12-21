package kotlinx.coroutines;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
public final class CoroutineName extends AbstractCoroutineContextElement {
    public static final Key Key = new Key(null);
    private final String name;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CoroutineName) && Intrinsics.areEqual(this.name, ((CoroutineName) obj).name);
    }

    public int hashCode() {
        return this.name.hashCode();
    }

    public final String getName() {
        return this.name;
    }

    public static final class Key implements CoroutineContext.Key<CoroutineName> {
        public Key(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Key() {
        }
    }

    public String toString() {
        return "CoroutineName(" + this.name + ')';
    }
}
