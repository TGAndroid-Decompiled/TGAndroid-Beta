package kotlinx.coroutines.flow.internal;

import kotlin.jvm.internal.TypeIntrinsics;

public abstract class SafeCollectorKt {
    public static final SafeCollectorKt$emitFun$1 emitFun;

    static {
        SafeCollectorKt$emitFun$1 safeCollectorKt$emitFun$1 = SafeCollectorKt$emitFun$1.INSTANCE;
        TypeIntrinsics.beforeCheckcastToFunctionOfArity(3, safeCollectorKt$emitFun$1);
        emitFun = safeCollectorKt$emitFun$1;
    }
}
