package org.telegram.messenger;

import android.net.Uri;
public final class ge implements Runnable {
    public final int f22639a;
    public final c20 f22640b;
    public final Uri f22641c;

    public ge(c20 c20Var, Uri uri, int i7) {
        this.f22639a = i7;
        this.f22640b = c20Var;
        this.f22641c = uri;
    }

    @Override
    public final void run() {
        int i7 = this.f22639a;
        Uri uri = this.f22641c;
        c20 c20Var = this.f22640b;
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
