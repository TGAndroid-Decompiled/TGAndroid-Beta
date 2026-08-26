package kotlinx.coroutines.flow;

import com.google.zxing.BinaryBitmap;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

public final class FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 extends ContinuationImpl {
    public BinaryBitmap L$0;
    public FlowCollector L$1;
    public int label;
    public Object result;
    public final BinaryBitmap this$0;

    public FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1(BinaryBitmap binaryBitmap, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = binaryBitmap;
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect(null, this);
    }
}
