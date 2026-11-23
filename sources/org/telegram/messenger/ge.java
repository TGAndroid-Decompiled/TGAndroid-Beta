package org.telegram.messenger;

import android.net.Uri;
public final class ge implements Runnable {
    public final int f24131a;
    public final y10 f24132b;
    public final Uri f24133c;

    public ge(y10 y10Var, Uri uri, int i7) {
        this.f24131a = i7;
        this.f24132b = y10Var;
        this.f24133c = uri;
    }

    @Override
    public final void run() {
        int i7 = this.f24131a;
        Uri uri = this.f24133c;
        y10 y10Var = this.f24132b;
        switch (i7) {
            case 0:
                String[] strArr = MediaController.W1;
                y10Var.a(uri);
                return;
            default:
                String[] strArr2 = MediaController.W1;
                y10Var.a(uri);
                return;
        }
    }
}
