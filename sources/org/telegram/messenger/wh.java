package org.telegram.messenger;
public final class wh implements Runnable {
    public final int f19487a;
    public final RecordedAudioTranscriptionController f19488b;

    public wh(RecordedAudioTranscriptionController recordedAudioTranscriptionController, int i10) {
        this.f19487a = i10;
        this.f19488b = recordedAudioTranscriptionController;
    }

    @Override
    public final void run() {
        switch (this.f19487a) {
            case 0:
                RecordedAudioTranscriptionController.b(this.f19488b);
                return;
            default:
                RecordedAudioTranscriptionController.c(this.f19488b);
                return;
        }
    }
}
