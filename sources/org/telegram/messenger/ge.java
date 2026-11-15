package org.telegram.messenger;

import android.net.Uri;
public final class ge implements Runnable {
    public final int f23730a;
    public final z10 f23731b;
    public final Uri f23732c;

    public ge(z10 z10Var, Uri uri, int i7) {
        this.f23730a = i7;
        this.f23731b = z10Var;
        this.f23732c = uri;
    }

    @Override
    public final void run() {
        int i7 = this.f23730a;
        Uri uri = this.f23732c;
        z10 z10Var = this.f23731b;
        switch (i7) {
            case 0:
                String[] strArr = MediaController.W1;
                z10Var.a(uri);
                return;
            default:
                String[] strArr2 = MediaController.W1;
                z10Var.a(uri);
                return;
        }
    }
}
