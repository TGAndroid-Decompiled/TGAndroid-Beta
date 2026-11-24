package defpackage;

import java.io.OutputStreamWriter;
public final class da4 implements Runnable {
    public final byte a;
    public final Throwable b;

    public da4(Throwable th, byte b) {
        this.a = b;
        this.b = th;
    }

    @Override
    public final void run() {
        byte b = this.a;
        int i = 0;
        Throwable th = this.b;
        switch (b) {
            case 0:
                try {
                    OutputStreamWriter outputStreamWriter = fa4.j().a;
                    outputStreamWriter.write(fa4.j().b.format(System.currentTimeMillis()) + " E/tmessages: " + th + "\n");
                    StackTraceElement[] stackTrace = th.getStackTrace();
                    for (int i2 = 0; i2 < stackTrace.length; i2++) {
                        OutputStreamWriter outputStreamWriter2 = fa4.j().a;
                        outputStreamWriter2.write(fa4.j().b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace[i2] + "\n");
                    }
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        OutputStreamWriter outputStreamWriter3 = fa4.j().a;
                        outputStreamWriter3.write(fa4.j().b.format(System.currentTimeMillis()) + " E/tmessages: Caused by " + cause + "\n");
                        StackTraceElement[] stackTrace2 = cause.getStackTrace();
                        while (i < stackTrace2.length) {
                            OutputStreamWriter outputStreamWriter4 = fa4.j().a;
                            outputStreamWriter4.write(fa4.j().b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace2[i] + "\n");
                            i++;
                        }
                    }
                    fa4.j().a.flush();
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            default:
                try {
                    OutputStreamWriter outputStreamWriter5 = fa4.j().a;
                    outputStreamWriter5.write(fa4.j().b.format(System.currentTimeMillis()) + " FATAL/tmessages: " + th + "\n");
                    StackTraceElement[] stackTrace3 = th.getStackTrace();
                    for (int i3 = 0; i3 < stackTrace3.length; i3++) {
                        OutputStreamWriter outputStreamWriter6 = fa4.j().a;
                        outputStreamWriter6.write(fa4.j().b.format(System.currentTimeMillis()) + " FATAL/tmessages: \tat " + stackTrace3[i3] + "\n");
                    }
                    Throwable cause2 = th.getCause();
                    if (cause2 != null) {
                        OutputStreamWriter outputStreamWriter7 = fa4.j().a;
                        outputStreamWriter7.write(fa4.j().b.format(System.currentTimeMillis()) + " E/tmessages: Caused by " + cause2 + "\n");
                        StackTraceElement[] stackTrace4 = cause2.getStackTrace();
                        while (i < stackTrace4.length) {
                            OutputStreamWriter outputStreamWriter8 = fa4.j().a;
                            outputStreamWriter8.write(fa4.j().b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace4[i] + "\n");
                            i++;
                        }
                    }
                    fa4.j().a.flush();
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
                boolean z = w01.a;
                return;
        }
    }
}
