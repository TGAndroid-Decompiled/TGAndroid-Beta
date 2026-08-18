package kotlinx.coroutines.selects;

import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SelectClause1Impl implements SelectClause1 {
    private final Object clauseObject;
    private final Function3 onCancellationConstructor;
    private final Function3 processResFunc;
    private final Function3 regFunc;

    public SelectClause1Impl(Object obj, Function3 function3, Function3 function4, Function3 function5) {
        this.clauseObject = obj;
        this.regFunc = function3;
        this.processResFunc = function4;
        this.onCancellationConstructor = function5;
    }

    public SelectClause1Impl(Object obj, Function3 function3, Function3 function4, Function3 function5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, function3, function4, (i & 8) != 0 ? null : function5);
    }
}
