package kotlin.coroutines;

import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public interface CoroutineContext {

    public interface Key<E extends Element> {
    }

    <R> R fold(R r, Function2<? super R, ? super Element, ? extends R> function2);

    <E extends Element> E get(Key<E> key);

    CoroutineContext minusKey(Key<?> key);

    public static final class DefaultImpls {
        public static CoroutineContext plus(CoroutineContext coroutineContext, CoroutineContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return context == EmptyCoroutineContext.INSTANCE ? coroutineContext : (CoroutineContext) context.fold(coroutineContext, new Function2<CoroutineContext, Element, CoroutineContext>() {
                @Override
                public final CoroutineContext invoke(CoroutineContext acc, CoroutineContext.Element element) {
                    CombinedContext combinedContext;
                    Intrinsics.checkNotNullParameter(acc, "acc");
                    Intrinsics.checkNotNullParameter(element, "element");
                    CoroutineContext minusKey = acc.minusKey(element.getKey());
                    EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
                    if (minusKey == emptyCoroutineContext) {
                        return element;
                    }
                    ContinuationInterceptor.Key key = ContinuationInterceptor.Key;
                    ContinuationInterceptor continuationInterceptor = (ContinuationInterceptor) minusKey.get(key);
                    if (continuationInterceptor == null) {
                        combinedContext = new CombinedContext(minusKey, element);
                    } else {
                        CoroutineContext minusKey2 = minusKey.minusKey(key);
                        if (minusKey2 == emptyCoroutineContext) {
                            return new CombinedContext(element, continuationInterceptor);
                        }
                        combinedContext = new CombinedContext(new CombinedContext(minusKey2, element), continuationInterceptor);
                    }
                    return combinedContext;
                }
            });
        }
    }

    public interface Element extends CoroutineContext {
        @Override
        <E extends Element> E get(Key<E> key);

        Key<?> getKey();

        public static final class DefaultImpls {
            public static CoroutineContext plus(Element element, CoroutineContext context) {
                Intrinsics.checkNotNullParameter(context, "context");
                return DefaultImpls.plus(element, context);
            }

            public static <E extends Element> E get(Element element, Key<E> key) {
                Intrinsics.checkNotNullParameter(key, "key");
                if (!Intrinsics.areEqual(element.getKey(), key)) {
                    return null;
                }
                Intrinsics.checkNotNull(element, "null cannot be cast to non-null type E of kotlin.coroutines.CoroutineContext.Element.get");
                return element;
            }

            public static <R> R fold(Element element, R r, Function2<? super R, ? super Element, ? extends R> operation) {
                Intrinsics.checkNotNullParameter(operation, "operation");
                return operation.invoke(r, element);
            }

            public static CoroutineContext minusKey(Element element, Key<?> key) {
                Intrinsics.checkNotNullParameter(key, "key");
                return Intrinsics.areEqual(element.getKey(), key) ? EmptyCoroutineContext.INSTANCE : element;
            }
        }
    }
}
