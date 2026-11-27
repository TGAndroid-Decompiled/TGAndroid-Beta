package defpackage;

import org.webrtc.DataChannel;
import org.webrtc.NativeLifecycleLock;
public final class o63 implements NativeLifecycleLock.NativeRunnable, NativeLifecycleLock.NativeCallable {
    public final byte a;
    public final DataChannel b;

    public o63(DataChannel dataChannel, byte b) {
        this.a = b;
        this.b = dataChannel;
    }

    @Override
    public final Object call() {
        byte b = this.a;
        DataChannel dataChannel = this.b;
        switch (b) {
            case 1:
                return DataChannel.a(dataChannel);
            case 2:
            default:
                return DataChannel.b(dataChannel);
            case 3:
                return DataChannel.i(dataChannel);
            case 4:
                return DataChannel.e(dataChannel);
        }
    }

    @Override
    public final void run() {
        byte b = this.a;
        DataChannel dataChannel = this.b;
        switch (b) {
            case 0:
                DataChannel.d(dataChannel);
                return;
            default:
                DataChannel.g(dataChannel);
                return;
        }
    }
}
