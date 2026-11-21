package org.telegram.messenger;

import android.net.Uri;
public final class fe implements Runnable {
    public final int f23911a;
    public final x10 f23912b;
    public final Uri f23913c;

    public fe(x10 x10Var, Uri uri, int i7) {
        this.f23911a = i7;
        this.f23912b = x10Var;
        this.f23913c = uri;
    }

    @Override
    public final void run() {
        int i7 = this.f23911a;
        Uri uri = this.f23913c;
        x10 x10Var = this.f23912b;
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
