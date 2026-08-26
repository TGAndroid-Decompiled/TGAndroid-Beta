package kotlin.coroutines;

import java.io.Serializable;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class CombinedContext implements CoroutineContext, Serializable {
    public final CoroutineContext.Element element;
    public final CoroutineContext left;

    public CombinedContext(CoroutineContext.Element element, CoroutineContext left) {
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(element, "element");
        this.left = left;
        this.element = element;
    }

    public final boolean equals(Object obj) {
        boolean zAreEqual;
        if (this == obj) {
            return true;
        }
        if (obj instanceof CombinedContext) {
            CombinedContext combinedContext = (CombinedContext) obj;
            combinedContext.getClass();
            int i = 2;
            CombinedContext combinedContext2 = combinedContext;
            int i2 = 2;
            while (true) {
                CoroutineContext coroutineContext = combinedContext2.left;
                combinedContext2 = coroutineContext instanceof CombinedContext ? (CombinedContext) coroutineContext : null;
                if (combinedContext2 == null) {
                    break;
                }
                i2++;
            }
            CombinedContext combinedContext3 = this;
            while (true) {
                CoroutineContext coroutineContext2 = combinedContext3.left;
                combinedContext3 = coroutineContext2 instanceof CombinedContext ? (CombinedContext) coroutineContext2 : null;
                if (combinedContext3 == null) {
                    break;
                }
                i++;
            }
            if (i2 == i) {
                CombinedContext combinedContext4 = this;
                while (true) {
                    CoroutineContext.Element element = combinedContext4.element;
                    if (!Intrinsics.areEqual(combinedContext.get(element.getKey()), element)) {
                        zAreEqual = false;
                        break;
                    }
                    CoroutineContext coroutineContext3 = combinedContext4.left;
                    if (!(coroutineContext3 instanceof CombinedContext)) {
                        Intrinsics.checkNotNull(coroutineContext3, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                        CoroutineContext.Element element2 = (CoroutineContext.Element) coroutineContext3;
                        zAreEqual = Intrinsics.areEqual(combinedContext.get(element2.getKey()), element2);
                        break;
                    }
                    combinedContext4 = (CombinedContext) coroutineContext3;
                }
                if (zAreEqual) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final Object fold(Object obj, Function2 function2) {
        return function2.invoke(this.left.fold(obj, function2), this.element);
    }

    @Override
    public final CoroutineContext.Element get(CoroutineContext.Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CombinedContext combinedContext = this;
        while (true) {
            CoroutineContext.Element element = combinedContext.element.get(key);
            if (element != null) {
                return element;
            }
            CoroutineContext coroutineContext = combinedContext.left;
            if (!(coroutineContext instanceof CombinedContext)) {
                return coroutineContext.get(key);
            }
            combinedContext = (CombinedContext) coroutineContext;
        }
    }

    public final int hashCode() {
        return this.element.hashCode() + this.left.hashCode();
    }

    @Override
    public final CoroutineContext minusKey(CoroutineContext.Key key) {
        Intrinsics.checkNotNullParameter(key, "key");
        CoroutineContext.Element element = this.element;
        CoroutineContext.Element element2 = element.get(key);
        CoroutineContext coroutineContext = this.left;
        if (element2 != null) {
            return coroutineContext;
        }
        CoroutineContext coroutineContextMinusKey = coroutineContext.minusKey(key);
        if (coroutineContextMinusKey == coroutineContext) {
            return this;
        }
        return coroutineContextMinusKey == EmptyCoroutineContext.INSTANCE ? element : new CombinedContext(element, coroutineContextMinusKey);
    }

    @Override
    public final CoroutineContext plus(CoroutineContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context == EmptyCoroutineContext.INSTANCE ? this : (CoroutineContext) context.fold(this, new CombinedContext$$ExternalSyntheticLambda0(5));
    }

    public final String toString() {
        return "[" + ((String) fold("", new CombinedContext$$ExternalSyntheticLambda0(0))) + ']';
    }
}
