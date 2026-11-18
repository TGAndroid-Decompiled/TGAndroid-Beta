package org.telegram.messenger;

import android.net.Uri;
public final class fe implements Runnable {
    public final int f23883a;
    public final x10 f23884b;
    public final Uri f23885c;

    public fe(x10 x10Var, Uri uri, int i7) {
        this.f23883a = i7;
        this.f23884b = x10Var;
        this.f23885c = uri;
    }

    @Override
    public final void run() {
        int i7 = this.f23883a;
        Uri uri = this.f23885c;
        x10 x10Var = this.f23884b;
        switch (i7) {
            case 0:
                String[] strArr = MediaController.W1;
                x10Var.a(uri);
                return;
            default:
                String[] strArr2 = MediaController.W1;
                x10Var.a(uri);
                return;
        }
    }
}
