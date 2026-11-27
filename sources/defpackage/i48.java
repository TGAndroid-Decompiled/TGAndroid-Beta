package defpackage;

import java.util.List;
import org.webrtc.NativeLifecycleLock;
import org.webrtc.PeerConnection;
import org.webrtc.RtcCertificatePem;
import org.webrtc.SessionDescription;
public final class i48 implements NativeLifecycleLock.NativeCallable, NativeLifecycleLock.NativeRunnable, NativeLifecycleLock.NativePointerCallable, NativeLifecycleLock.NativePointerRunnable {
    public final byte a;
    public final PeerConnection b;

    public i48(PeerConnection peerConnection, byte b) {
        this.a = b;
        this.b = peerConnection;
    }

    @Override
    public final Object call() {
        PeerConnection.PeerConnectionState lambda$connectionState$43;
        PeerConnection.IceConnectionState lambda$iceConnectionState$42;
        SessionDescription lambda$getRemoteDescription$1;
        Long lambda$getNativePeerConnection$49;
        List lambda$getSenders$21;
        PeerConnection.SignalingState lambda$signalingState$41;
        List lambda$getTransceivers$23;
        PeerConnection.IceGatheringState lambda$iceGatheringState$44;
        List lambda$getReceivers$22;
        SessionDescription lambda$getLocalDescription$0;
        RtcCertificatePem lambda$getCertificate$2;
        byte b = this.a;
        PeerConnection peerConnection = this.b;
        switch (b) {
            case 0:
                lambda$connectionState$43 = peerConnection.lambda$connectionState$43();
                return lambda$connectionState$43;
            case 1:
            case 2:
            case 6:
            case 7:
            default:
                lambda$getCertificate$2 = peerConnection.lambda$getCertificate$2();
                return lambda$getCertificate$2;
            case 3:
                lambda$iceConnectionState$42 = peerConnection.lambda$iceConnectionState$42();
                return lambda$iceConnectionState$42;
            case 4:
                lambda$getRemoteDescription$1 = peerConnection.lambda$getRemoteDescription$1();
                return lambda$getRemoteDescription$1;
            case 5:
                lambda$getNativePeerConnection$49 = peerConnection.lambda$getNativePeerConnection$49();
                return lambda$getNativePeerConnection$49;
            case 8:
                lambda$getSenders$21 = peerConnection.lambda$getSenders$21();
                return lambda$getSenders$21;
            case 9:
                lambda$signalingState$41 = peerConnection.lambda$signalingState$41();
                return lambda$signalingState$41;
            case 10:
                lambda$getTransceivers$23 = peerConnection.lambda$getTransceivers$23();
                return lambda$getTransceivers$23;
            case 11:
                lambda$iceGatheringState$44 = peerConnection.lambda$iceGatheringState$44();
                return lambda$iceGatheringState$44;
            case 12:
                lambda$getReceivers$22 = peerConnection.lambda$getReceivers$22();
                return lambda$getReceivers$22;
            case 13:
                lambda$getLocalDescription$0 = peerConnection.lambda$getLocalDescription$0();
                return lambda$getLocalDescription$0;
        }
    }

    @Override
    public final void run() {
        byte b = this.a;
        PeerConnection peerConnection = this.b;
        switch (b) {
            case 1:
                peerConnection.lambda$stopRtcEventLog$40();
                return;
            case 6:
                peerConnection.lambda$close$45();
                return;
            default:
                peerConnection.lambda$restartIce$9();
                return;
        }
    }

    @Override
    public final void run(long j) {
        byte b = this.a;
        PeerConnection peerConnection = this.b;
        switch (b) {
            case 14:
                peerConnection.lambda$dispose$46(j);
                return;
            default:
                peerConnection.lambda$removeStream$18(j);
                return;
        }
    }

    @Override
    public final Object call(long j) {
        Boolean lambda$removeTrack$26;
        lambda$removeTrack$26 = this.b.lambda$removeTrack$26(j);
        return lambda$removeTrack$26;
    }
}
