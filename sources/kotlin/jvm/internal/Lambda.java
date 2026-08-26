package kotlin.jvm.internal;

import java.io.Serializable;

public abstract class Lambda implements FunctionBase, Serializable {
    public final int arity;

    public Lambda(int i) {
        this.arity = i;
    }

    @Override
    public final int getArity() {
        return this.arity;
    }

    public final String toString() {
        Reflection.factory.getClass();
        String strRenderLambdaToString = ReflectionFactory.renderLambdaToString(this);
        Intrinsics.checkNotNullExpressionValue(strRenderLambdaToString, "renderLambdaToString(...)");
        return strRenderLambdaToString;
    }
}
