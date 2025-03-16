package kotlinx.coroutines.channels;

import kotlin.jvm.functions.Function1;

public abstract class ChannelKt {
    public static final Channel Channel(int i, BufferOverflow bufferOverflow, Function1 function1) {
        Channel bufferedChannel;
        if (i == -2) {
            bufferedChannel = bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel(Channel.Factory.getCHANNEL_DEFAULT_CAPACITY$kotlinx_coroutines_core(), function1) : new ConflatedBufferedChannel(1, bufferOverflow, function1);
        } else {
            if (i == -1) {
                if (bufferOverflow == BufferOverflow.SUSPEND) {
                    return new ConflatedBufferedChannel(1, BufferOverflow.DROP_OLDEST, function1);
                }
                throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
            }
            if (i != 0) {
                return i != Integer.MAX_VALUE ? bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel(i, function1) : new ConflatedBufferedChannel(i, bufferOverflow, function1) : new BufferedChannel(Integer.MAX_VALUE, function1);
            }
            bufferedChannel = bufferOverflow == BufferOverflow.SUSPEND ? new BufferedChannel(0, function1) : new ConflatedBufferedChannel(1, bufferOverflow, function1);
        }
        return bufferedChannel;
    }

    public static Channel Channel$default(int i, BufferOverflow bufferOverflow, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            bufferOverflow = BufferOverflow.SUSPEND;
        }
        if ((i2 & 4) != 0) {
            function1 = null;
        }
        return Channel(i, bufferOverflow, function1);
    }
}
