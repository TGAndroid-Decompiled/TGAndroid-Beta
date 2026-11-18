package org.telegram.messenger;

import android.net.Uri;
public final class fe implements Runnable {
    public final int f23886a;
    public final x10 f23887b;
    public final Uri f23888c;

    public fe(x10 x10Var, Uri uri, int i7) {
        this.f23886a = i7;
        this.f23887b = x10Var;
        this.f23888c = uri;
    }

    @Override
    public final void run() {
        int i7 = this.f23886a;
        Uri uri = this.f23888c;
        x10 x10Var = this.f23887b;
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
