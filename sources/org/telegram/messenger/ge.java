package org.telegram.messenger;

import android.net.Uri;
public final class ge implements Runnable {
    public final int f24095a;
    public final y10 f24096b;
    public final Uri f24097c;

    public ge(y10 y10Var, Uri uri, int i7) {
        this.f24095a = i7;
        this.f24096b = y10Var;
        this.f24097c = uri;
    }

    @Override
    public final void run() {
        int i7 = this.f24095a;
        Uri uri = this.f24097c;
        y10 y10Var = this.f24096b;
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
