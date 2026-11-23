package org.telegram.messenger;
public final class nt implements Runnable {
    public final int f26035a;
    public final String f26036b;
    public final String f26037c;
    public final long d;

    public nt(long j3, String str, String str2, int i7) {
        this.f26035a = i7;
        this.f26036b = str;
        this.f26037c = str2;
        this.d = j3;
    }

    @Override
    public final void run() {
        switch (this.f26035a) {
            case 0:
                PushListenerController.c(this.d, this.f26036b, this.f26037c);
                return;
            default:
                PushListenerController.h(this.d, this.f26036b, this.f26037c);
                return;
        }
    }
}
