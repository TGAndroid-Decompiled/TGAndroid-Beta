package org.telegram.messenger;

import android.net.Uri;
public final class ge implements Runnable {
    public final int f15698a;
    public final q20 f15699b;
    public final Uri f15700c;

    public ge(q20 q20Var, Uri uri, int i10) {
        this.f15698a = i10;
        this.f15699b = q20Var;
        this.f15700c = uri;
    }

    @Override
    public final void run() {
        int i10 = this.f15698a;
        Uri uri = this.f15700c;
        q20 q20Var = this.f15699b;
        switch (i10) {
            case 0:
                String[] strArr = MediaController.U1;
                q20Var.a(uri);
                return;
            default:
                String[] strArr2 = MediaController.U1;
                q20Var.a(uri);
                return;
        }
    }
}
