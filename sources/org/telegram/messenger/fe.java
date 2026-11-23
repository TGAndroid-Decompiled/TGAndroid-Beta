package org.telegram.messenger;

import android.net.Uri;
public final class fe implements Runnable {
    public final int f23991a;
    public final w10 f23992b;
    public final Uri f23993c;

    public fe(w10 w10Var, Uri uri, int i7) {
        this.f23991a = i7;
        this.f23992b = w10Var;
        this.f23993c = uri;
    }

    @Override
    public final void run() {
        int i7 = this.f23991a;
        Uri uri = this.f23993c;
        w10 w10Var = this.f23992b;
        switch (i7) {
            case 0:
                String[] strArr = MediaController.W1;
                w10Var.a(uri);
                return;
            default:
                String[] strArr2 = MediaController.W1;
                w10Var.a(uri);
                return;
        }
    }
}
