package org.telegram.messenger;

import android.net.Uri;
public final class ge implements Runnable {
    public final int f23732a;
    public final z10 f23733b;
    public final Uri f23734c;

    public ge(z10 z10Var, Uri uri, int i7) {
        this.f23732a = i7;
        this.f23733b = z10Var;
        this.f23734c = uri;
    }

    @Override
    public final void run() {
        int i7 = this.f23732a;
        Uri uri = this.f23734c;
        z10 z10Var = this.f23733b;
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
