package defpackage;

import androidx.car.app.g;
import androidx.car.app.media.OpenMicrophoneResponse;
public abstract class oc1 {
    public static final int AUDIO_CONTENT_BUFFER_SIZE = 512;
    public static final String AUDIO_CONTENT_MIME = "audio/l16";
    public static final int AUDIO_CONTENT_SAMPLING_RATE = 16000;
    private static final int RECORDSTATE_RECORDING = 1;
    private static final int RECORDSTATE_REMOTE_CLOSED = 2;
    private static final int RECORDSTATE_STOPPED = 0;
    private final g mCarContext;
    private OpenMicrophoneResponse mOpenMicrophoneResponse;
    private int mRecordingState = 0;
    private final Object mRecordingStateLock = new Object();

    public static oc1 create(g gVar) {
        throw null;
    }

    public int read(byte[] bArr, int i, int i2) {
        synchronized (this.mRecordingStateLock) {
            int i3 = this.mRecordingState;
            if (i3 != 0) {
                if (i3 != 2) {
                    return readInternal(bArr, i, i2);
                }
                return -1;
            }
            throw new IllegalStateException("Called read before calling startRecording or after calling stopRecording");
        }
    }

    public abstract int readInternal(byte[] bArr, int i, int i2);

    public void startRecording() {
        synchronized (this.mRecordingStateLock) {
            if (this.mRecordingState != 0) {
                throw new IllegalStateException("Cannot start recording if it has started and not been stopped");
            }
            throw null;
        }
    }

    public void stopRecording() {
        synchronized (this.mRecordingStateLock) {
            OpenMicrophoneResponse openMicrophoneResponse = this.mOpenMicrophoneResponse;
            if (openMicrophoneResponse != null) {
                if (this.mRecordingState != 2) {
                    openMicrophoneResponse.getCarAudioCallback().onStopRecording();
                }
                this.mOpenMicrophoneResponse = null;
            }
            stopRecordingInternal();
            this.mRecordingState = 0;
        }
    }

    public abstract void stopRecordingInternal();
}
