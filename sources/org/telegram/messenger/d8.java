package org.telegram.messenger;

import java.io.OutputStreamWriter;
public final class d8 implements Runnable {
    public final int f15308a;
    public final Throwable f15309b;

    public d8(int i10, Throwable th2) {
        this.f15308a = i10;
        this.f15309b = th2;
    }

    @Override
    public final void run() {
        int i10 = this.f15308a;
        int i11 = 0;
        Throwable th2 = this.f15309b;
        switch (i10) {
            case 0:
                try {
                    OutputStreamWriter outputStreamWriter = f8.j().f15709a;
                    outputStreamWriter.write(f8.j().f15710b.format(System.currentTimeMillis()) + " E/tmessages: " + th2 + "\n");
                    StackTraceElement[] stackTrace = th2.getStackTrace();
                    for (int i12 = 0; i12 < stackTrace.length; i12++) {
                        OutputStreamWriter outputStreamWriter2 = f8.j().f15709a;
                        outputStreamWriter2.write(f8.j().f15710b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace[i12] + "\n");
                    }
                    Throwable cause = th2.getCause();
                    if (cause != null) {
                        OutputStreamWriter outputStreamWriter3 = f8.j().f15709a;
                        outputStreamWriter3.write(f8.j().f15710b.format(System.currentTimeMillis()) + " E/tmessages: Caused by " + cause + "\n");
                        StackTraceElement[] stackTrace2 = cause.getStackTrace();
                        while (i11 < stackTrace2.length) {
                            OutputStreamWriter outputStreamWriter4 = f8.j().f15709a;
                            outputStreamWriter4.write(f8.j().f15710b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace2[i11] + "\n");
                            i11++;
                        }
                    }
                    f8.j().f15709a.flush();
                    return;
                } catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
            default:
                try {
                    OutputStreamWriter outputStreamWriter5 = f8.j().f15709a;
                    outputStreamWriter5.write(f8.j().f15710b.format(System.currentTimeMillis()) + " FATAL/tmessages: " + th2 + "\n");
                    StackTraceElement[] stackTrace3 = th2.getStackTrace();
                    for (int i13 = 0; i13 < stackTrace3.length; i13++) {
                        OutputStreamWriter outputStreamWriter6 = f8.j().f15709a;
                        outputStreamWriter6.write(f8.j().f15710b.format(System.currentTimeMillis()) + " FATAL/tmessages: \tat " + stackTrace3[i13] + "\n");
                    }
                    Throwable cause2 = th2.getCause();
                    if (cause2 != null) {
                        OutputStreamWriter outputStreamWriter7 = f8.j().f15709a;
                        outputStreamWriter7.write(f8.j().f15710b.format(System.currentTimeMillis()) + " E/tmessages: Caused by " + cause2 + "\n");
                        StackTraceElement[] stackTrace4 = cause2.getStackTrace();
                        while (i11 < stackTrace4.length) {
                            OutputStreamWriter outputStreamWriter8 = f8.j().f15709a;
                            outputStreamWriter8.write(f8.j().f15710b.format(System.currentTimeMillis()) + " E/tmessages: \tat " + stackTrace4[i11] + "\n");
                            i11++;
                        }
                    }
                    f8.j().f15709a.flush();
                } catch (Exception e7) {
                    e7.printStackTrace();
                }
                boolean z10 = v2.f18578a;
                return;
        }
    }
}
