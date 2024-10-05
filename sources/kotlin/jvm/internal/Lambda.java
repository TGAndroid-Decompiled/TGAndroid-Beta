package kotlin.jvm.internal;

import java.io.Serializable;

public abstract class Lambda implements FunctionBase, Serializable {
    private final int arity;

    public Lambda(int i) {
        this.arity = i;
    }

    public String toString() {
        String renderLambdaToString = Reflection.renderLambdaToString(this);
        Intrinsics.checkNotNullExpressionValue(renderLambdaToString, "renderLambdaToString(this)");
        return renderLambdaToString;
    }
}
