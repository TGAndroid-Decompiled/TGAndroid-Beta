package org.telegram.messenger;

import android.net.Uri;
public final class ge implements Runnable {
    public final int f22663a;
    public final c20 f22664b;
    public final Uri f22665c;

    public ge(c20 c20Var, Uri uri, int i7) {
        this.f22663a = i7;
        this.f22664b = c20Var;
        this.f22665c = uri;
    }

    @Override
    public final void run() {
        int i7 = this.f22663a;
        Uri uri = this.f22665c;
        c20 c20Var = this.f22664b;
        switch (i7) {
            case 0:
                String[] strArr = MediaController.V1;
                c20Var.a(uri);
                return;
            default:
                String[] strArr2 = MediaController.V1;
                c20Var.a(uri);
                return;
        }
    }
}
