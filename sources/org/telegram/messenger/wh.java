package org.telegram.messenger;
public final class wh implements Runnable {
    public final int f19486a;
    public final RecordedAudioTranscriptionController f19487b;

    public wh(RecordedAudioTranscriptionController recordedAudioTranscriptionController, int i10) {
        this.f19486a = i10;
        this.f19487b = recordedAudioTranscriptionController;
    }

    @Override
    public final void run() {
        switch (this.f19486a) {
            case 0:
                RecordedAudioTranscriptionController.b(this.f19487b);
                return;
            default:
                RecordedAudioTranscriptionController.c(this.f19487b);
                return;
        }
    }
}
