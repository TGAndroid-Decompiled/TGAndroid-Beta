package kotlin.coroutines.jvm.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionBase;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements FunctionBase {
    private final int arity;

    @Override
    public int getArity() {
        return this.arity;
    }

    public RestrictedSuspendLambda(int i, Continuation continuation) {
        super(continuation);
        this.arity = i;
    }

    @Override
    public String toString() {
        if (getCompletion() == null) {
            String renderLambdaToString = Reflection.renderLambdaToString(this);
            Intrinsics.checkNotNullExpressionValue(renderLambdaToString, "renderLambdaToString(...)");
            return renderLambdaToString;
        }
        return super.toString();
    }
}
