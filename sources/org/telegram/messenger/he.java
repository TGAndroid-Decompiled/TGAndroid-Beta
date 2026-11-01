package org.telegram.messenger;

import android.net.Uri;
public final class he implements Runnable {
    public final int f16047a;
    public final r20 f16048b;
    public final Uri f16049c;

    public he(r20 r20Var, Uri uri, int i10) {
        this.f16047a = i10;
        this.f16048b = r20Var;
        this.f16049c = uri;
    }

    @Override
    public final void run() {
        int i10 = this.f16047a;
        Uri uri = this.f16049c;
        r20 r20Var = this.f16048b;
        switch (i10) {
            case 0:
                String[] strArr = MediaController.U1;
                r20Var.a(uri);
                return;
            default:
                String[] strArr2 = MediaController.U1;
                r20Var.a(uri);
                return;
        }
    }
}
