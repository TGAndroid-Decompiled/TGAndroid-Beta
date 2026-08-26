package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequenceBuilderIterator;

public final class SlidingWindowKt$windowedIterator$1 extends RestrictedSuspendLambda implements Function2 {
    public final Iterator $iterator;
    public int I$0;
    public Object L$0;
    public Object L$1;
    public Iterator L$2;
    public int label;

    public SlidingWindowKt$windowedIterator$1(Iterator it, Continuation continuation) {
        super(continuation);
        this.$iterator = it;
    }

    @Override
    public final Continuation create(Object obj, Continuation continuation) {
        SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$1 = new SlidingWindowKt$windowedIterator$1(this.$iterator, continuation);
        slidingWindowKt$windowedIterator$1.L$0 = obj;
        return slidingWindowKt$windowedIterator$1;
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        return ((SlidingWindowKt$windowedIterator$1) create((SequenceBuilderIterator) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        int i;
        SequenceBuilderIterator sequenceBuilderIterator;
        Iterator it;
        int i2;
        RingBuffer ringBuffer;
        SequenceBuilderIterator sequenceBuilderIterator2;
        Object[] array;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 != 0) {
            if (i3 == 1) {
                i = this.I$0;
                Iterator it2 = this.L$2;
                SequenceBuilderIterator sequenceBuilderIterator3 = (SequenceBuilderIterator) this.L$0;
                ResultKt.throwOnFailure(obj);
                arrayList = new ArrayList(20);
                sequenceBuilderIterator = sequenceBuilderIterator3;
                it = it2;
                i2 = i;
            } else if (i3 == 2) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i3 == 3) {
                    Iterator it3 = this.L$2;
                    RingBuffer ringBuffer2 = (RingBuffer) this.L$1;
                    SequenceBuilderIterator sequenceBuilderIterator4 = (SequenceBuilderIterator) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    ringBuffer2.removeFirst();
                    while (it3.hasNext()) {
                        Object next = it3.next();
                        int size = ringBuffer2.getSize();
                        int i4 = ringBuffer2.capacity;
                        if (size == i4) {
                            throw new IllegalStateException("ring buffer is full");
                        }
                        int i5 = ringBuffer2.startIndex;
                        int i6 = ringBuffer2.size;
                        Object[] objArr = ringBuffer2.buffer;
                        objArr[(i5 + i6) % i4] = next;
                        ringBuffer2.size = i6 + 1;
                        if (ringBuffer2.getSize() == i4) {
                            if (ringBuffer2.size >= 20) {
                                ArrayList arrayList2 = new ArrayList(ringBuffer2);
                                this.L$0 = sequenceBuilderIterator4;
                                this.L$1 = ringBuffer2;
                                this.L$2 = it3;
                                this.label = 3;
                                sequenceBuilderIterator4.yield(arrayList2, this);
                                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                return coroutineSingletons;
                            }
                            int i7 = i4 + (i4 >> 1) + 1;
                            if (i7 > 20) {
                                i7 = 20;
                            }
                            if (ringBuffer2.startIndex == 0) {
                                array = Arrays.copyOf(objArr, i7);
                                Intrinsics.checkNotNullExpressionValue(array, "copyOf(...)");
                            } else {
                                array = ringBuffer2.toArray(new Object[i7]);
                            }
                            ringBuffer2 = new RingBuffer(ringBuffer2.size, array);
                        }
                    }
                    ringBuffer = ringBuffer2;
                    sequenceBuilderIterator2 = sequenceBuilderIterator4;
                } else if (i3 != 4) {
                    if (i3 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                } else {
                    ringBuffer = (RingBuffer) this.L$1;
                    sequenceBuilderIterator2 = (SequenceBuilderIterator) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    ringBuffer.removeFirst();
                }
                if (ringBuffer.size > 20) {
                    ArrayList arrayList3 = new ArrayList(ringBuffer);
                    this.L$0 = sequenceBuilderIterator2;
                    this.L$1 = ringBuffer;
                    this.L$2 = null;
                    this.label = 4;
                    sequenceBuilderIterator2.yield(arrayList3, this);
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    return coroutineSingletons;
                }
                if (!ringBuffer.isEmpty()) {
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 5;
                    sequenceBuilderIterator2.yield(ringBuffer, this);
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    return coroutineSingletons;
                }
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        SequenceBuilderIterator sequenceBuilderIterator5 = (SequenceBuilderIterator) this.L$0;
        Iterator it4 = this.$iterator;
        arrayList = new ArrayList(20);
        i = 0;
        sequenceBuilderIterator = sequenceBuilderIterator5;
        it = it4;
        i2 = 0;
        while (it.hasNext()) {
            Object next2 = it.next();
            if (i > 0) {
                i--;
            } else {
                arrayList.add(next2);
                if (arrayList.size() == 20) {
                    this.L$0 = sequenceBuilderIterator;
                    this.L$1 = arrayList;
                    this.L$2 = it;
                    this.I$0 = i2;
                    this.label = 1;
                    sequenceBuilderIterator.yield(arrayList, this);
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    return coroutineSingletons;
                }
            }
        }
        if (!arrayList.isEmpty()) {
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            sequenceBuilderIterator.yield(arrayList, this);
            CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
            return coroutineSingletons;
        }
        return Unit.INSTANCE;
    }
}
