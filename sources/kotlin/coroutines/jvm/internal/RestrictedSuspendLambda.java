package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;

public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements FunctionBase {
    public final int arity;

    public RestrictedSuspendLambda(Continuation continuation) {
        super(continuation);
        this.arity = 2;
    }

    @Override
    public final int getArity() {
        return this.arity;
    }

    @Override
    public final String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        Reflection.factory.getClass();
        String strRenderLambdaToString = ReflectionFactory.renderLambdaToString(this);
        Intrinsics.checkNotNullExpressionValue(strRenderLambdaToString, "renderLambdaToString(...)");
        return strRenderLambdaToString;
    }
}
