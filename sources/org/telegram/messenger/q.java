package org.telegram.messenger;

import java.io.File;
import org.telegram.messenger.AudioRecorderV2Controller;
public final class q implements Runnable {
    public final int f19305a;
    public final AudioRecorderV2Controller.AnonymousClass2 f19306b;
    public final long f19307c;
    public final AudioRecorderV2Controller.Listener d;
    public final File e;

    public q(AudioRecorderV2Controller.AnonymousClass2 anonymousClass2, long j10, AudioRecorderV2Controller.Listener listener, File file, int i10) {
        this.f19305a = i10;
        this.f19306b = anonymousClass2;
        this.f19307c = j10;
        this.d = listener;
        this.e = file;
    }

    @Override
    public final void run() {
        switch (this.f19305a) {
            case 0:
                AudioRecorderV2Controller.AnonymousClass2.a(this.f19306b, this.f19307c, this.d, this.e);
                return;
            default:
                AudioRecorderV2Controller.AnonymousClass2.b(this.f19306b, this.f19307c, this.d, this.e);
                return;
        }
    }
}
