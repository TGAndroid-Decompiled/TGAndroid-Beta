package org.telegram.messenger;

import java.io.OutputStreamWriter;
public final class y7 implements Runnable {
    public final int f26597a;
    public final Throwable f26598b;

    public y7(int i7, Throwable th2) {
        this.f26597a = i7;
        this.f26598b = th2;
    }

    @Override
    public final void run() {
        int i7 = this.f26597a;
        int i10 = 0;
        Throwable th2 = this.f26598b;
        switch (i7) {
            case 0:
                try {
                    OutputStreamWriter outputStreamWriter = a8.j().f21398a;
                    outputStreamWriter.write(a8.j().f21399b.format(System.currentTimeMillis()) + " E/tmessages: " + th2 + "\n");
                    StackTraceElement[] stackTrace = th2.getStackTrace();
                    for (int i11 = 0; i11 < stackTrace.length; i11++) {
                        OutputStreamWriter outputStreamWriter2 = a8.j().f21398a;
                        outputStreamWriter2.write(a8.j().f21399b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace[i11] + "\n");
                    }
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        OutputStreamWriter outputStreamWriter3 = a8.j().f21398a;
                        outputStreamWriter3.write(a8.j().f21399b.format(System.currentTimeMillis()) + " E/tmessages: Caused by " + cause + "\n");
                        StackTraceElement[] stackTrace2 = cause.getStackTrace();
                        while (i10 < stackTrace2.length) {
                            OutputStreamWriter outputStreamWriter4 = a8.j().f21398a;
                            outputStreamWriter4.write(a8.j().f21399b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace2[i10] + "\n");
                            i10++;
                        }
                    }
                    a8.j().f21398a.flush();
                    return;
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return;
                }
            default:
                try {
                    OutputStreamWriter outputStreamWriter5 = a8.j().f21398a;
                    outputStreamWriter5.write(a8.j().f21399b.format(System.currentTimeMillis()) + " FATAL/tmessages: " + th2 + "\n");
                    StackTraceElement[] stackTrace3 = th2.getStackTrace();
                    for (int i12 = 0; i12 < stackTrace3.length; i12++) {
                        OutputStreamWriter outputStreamWriter6 = a8.j().f21398a;
                        outputStreamWriter6.write(a8.j().f21399b.format(System.currentTimeMillis()) + " FATAL/tmessages: \tat " + stackTrace3[i12] + "\n");
                    }
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        OutputStreamWriter outputStreamWriter7 = a8.j().f21398a;
                        outputStreamWriter7.write(a8.j().f21399b.format(System.currentTimeMillis()) + " E/tmessages: Caused by " + cause2 + "\n");
                        StackTraceElement[] stackTrace4 = cause2.getStackTrace();
                        while (i10 < stackTrace4.length) {
                            OutputStreamWriter outputStreamWriter8 = a8.j().f21398a;
                            outputStreamWriter8.write(a8.j().f21399b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace4[i10] + "\n");
                            i10++;
                        }
                    }
                    a8.j().f21398a.flush();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                boolean z9 = r2.f25212a;
                return;
        }
    }
}
