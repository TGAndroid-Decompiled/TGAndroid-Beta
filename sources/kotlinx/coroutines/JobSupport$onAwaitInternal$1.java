package kotlinx.coroutines;

import androidx.appcompat.app.WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.selects.SelectInstance;

class JobSupport$onAwaitInternal$1 extends FunctionReferenceImpl implements Function3 {
    public static final JobSupport$onAwaitInternal$1 INSTANCE = new JobSupport$onAwaitInternal$1();

    JobSupport$onAwaitInternal$1() {
        super(3, JobSupport.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
    }

    @Override
    public Object invoke(Object obj, Object obj2, Object obj3) {
        WindowDecorActionBar$$ExternalSyntheticThrowCCEIfNotNull0.m(obj2);
        invoke((JobSupport) obj, (SelectInstance) null, obj3);
        return Unit.INSTANCE;
    }

    public final void invoke(JobSupport jobSupport, SelectInstance selectInstance, Object obj) {
        jobSupport.onAwaitInternalRegFunc(selectInstance, obj);
    }
}
