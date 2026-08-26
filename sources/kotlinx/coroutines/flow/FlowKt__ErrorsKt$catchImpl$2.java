package kotlinx.coroutines.flow;

import androidx.datastore.preferences.core.MutablePreferences;
import com.google.firebase.sessions.FirebaseSessionsData;
import com.google.firebase.sessions.ProcessDetailsProvider;
import com.google.firebase.sessions.SessionDatastoreImpl;
import com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2$1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;

public final class FlowKt__ErrorsKt$catchImpl$2 implements FlowCollector {
    public final FlowCollector $collector;
    public final Object $fromDownstream;
    public final int $r8$classId;

    public FlowKt__ErrorsKt$catchImpl$2(FlowCollector flowCollector, Object obj, int i) {
        this.$r8$classId = i;
        this.$collector = flowCollector;
        this.$fromDownstream = obj;
    }

    @Override
    public final Object emit(Object obj, Continuation continuation) throws Throwable {
        FlowKt__ErrorsKt$catchImpl$2$emit$1 flowKt__ErrorsKt$catchImpl$2$emit$1;
        FlowKt__ErrorsKt$catchImpl$2 flowKt__ErrorsKt$catchImpl$2;
        SessionDatastoreImpl$special$$inlined$map$1$2$1 sessionDatastoreImpl$special$$inlined$map$1$2$1;
        Unit unit = Unit.INSTANCE;
        FlowCollector flowCollector = this.$collector;
        switch (this.$r8$classId) {
            case 0:
                if (continuation instanceof FlowKt__ErrorsKt$catchImpl$2$emit$1) {
                    flowKt__ErrorsKt$catchImpl$2$emit$1 = (FlowKt__ErrorsKt$catchImpl$2$emit$1) continuation;
                    int i = flowKt__ErrorsKt$catchImpl$2$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        flowKt__ErrorsKt$catchImpl$2$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        flowKt__ErrorsKt$catchImpl$2$emit$1 = new FlowKt__ErrorsKt$catchImpl$2$emit$1(this, continuation);
                    }
                } else {
                    flowKt__ErrorsKt$catchImpl$2$emit$1 = new FlowKt__ErrorsKt$catchImpl$2$emit$1(this, continuation);
                }
                Object obj2 = flowKt__ErrorsKt$catchImpl$2$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = flowKt__ErrorsKt$catchImpl$2$emit$1.label;
                if (i2 == 0) {
                    ResultKt.throwOnFailure(obj2);
                    try {
                        flowKt__ErrorsKt$catchImpl$2$emit$1.L$0 = this;
                        flowKt__ErrorsKt$catchImpl$2$emit$1.label = 1;
                        return flowCollector.emit(obj, flowKt__ErrorsKt$catchImpl$2$emit$1) == coroutineSingletons ? coroutineSingletons : unit;
                    } catch (Throwable th) {
                        th = th;
                        flowKt__ErrorsKt$catchImpl$2 = this;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    flowKt__ErrorsKt$catchImpl$2 = flowKt__ErrorsKt$catchImpl$2$emit$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj2);
                        return unit;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                ((Ref$ObjectRef) flowKt__ErrorsKt$catchImpl$2.$fromDownstream).element = th;
                throw th;
            default:
                if (continuation instanceof SessionDatastoreImpl$special$$inlined$map$1$2$1) {
                    sessionDatastoreImpl$special$$inlined$map$1$2$1 = (SessionDatastoreImpl$special$$inlined$map$1$2$1) continuation;
                    int i3 = sessionDatastoreImpl$special$$inlined$map$1$2$1.label;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        sessionDatastoreImpl$special$$inlined$map$1$2$1.label = i3 - Integer.MIN_VALUE;
                    } else {
                        sessionDatastoreImpl$special$$inlined$map$1$2$1 = new SessionDatastoreImpl$special$$inlined$map$1$2$1(this, continuation);
                    }
                } else {
                    sessionDatastoreImpl$special$$inlined$map$1$2$1 = new SessionDatastoreImpl$special$$inlined$map$1$2$1(this, continuation);
                }
                Object obj3 = sessionDatastoreImpl$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = sessionDatastoreImpl$special$$inlined$map$1$2$1.label;
                if (i4 != 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj3);
                    return unit;
                }
                ResultKt.throwOnFailure(obj3);
                SessionDatastoreImpl.Companion companion = SessionDatastoreImpl.Companion;
                ((SessionDatastoreImpl) this.$fromDownstream).getClass();
                FirebaseSessionsData firebaseSessionsData = new FirebaseSessionsData((String) ((MutablePreferences) obj).get(ProcessDetailsProvider.SESSION_ID));
                sessionDatastoreImpl$special$$inlined$map$1$2$1.label = 1;
                return flowCollector.emit(firebaseSessionsData, sessionDatastoreImpl$special$$inlined$map$1$2$1) == coroutineSingletons2 ? coroutineSingletons2 : unit;
        }
    }
}
