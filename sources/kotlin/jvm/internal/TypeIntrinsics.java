package kotlin.jvm.internal;

import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import kotlin.Function;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

public abstract class TypeIntrinsics {
    public static void beforeCheckcastToFunctionOfArity(int i, Object obj) {
        int arity;
        if (obj != null) {
            if (obj instanceof Function) {
                if (obj instanceof FunctionBase) {
                    arity = ((FunctionBase) obj).getArity();
                } else if (obj instanceof Function0) {
                    arity = 0;
                } else if (obj instanceof Function1) {
                    arity = 1;
                } else if (obj instanceof Function2) {
                    arity = 2;
                } else {
                    arity = obj instanceof Function3 ? 3 : -1;
                }
                if (arity == i) {
                    return;
                }
            }
            ClassCastException classCastException = new ClassCastException(SurfaceContainer$$ExternalSyntheticOutline0.m$1(obj.getClass().getName(), " cannot be cast to ", SurfaceContainer$$ExternalSyntheticOutline0.m(i, "kotlin.jvm.functions.Function")));
            Intrinsics.sanitizeStackTrace(classCastException, TypeIntrinsics.class.getName());
            throw classCastException;
        }
    }
}
