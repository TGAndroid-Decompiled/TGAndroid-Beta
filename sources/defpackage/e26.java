package defpackage;

import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import org.telegram.ui.LaunchActivity;
public final class e26 {
    public final byte a = 1;
    public boolean b;
    public boolean c;
    public final Object d;

    public e26(LaunchActivity launchActivity, boolean z) {
        this.d = new WeakReference(launchActivity);
    }

    public final void a() {
        switch (this.a) {
            case 0:
                b(false);
                this.c = true;
                return;
            default:
                b(false);
                this.c = true;
                return;
        }
    }

    public final void b(boolean z) {
        int i;
        byte b = this.a;
        int i2 = 8;
        Object obj = this.d;
        int i3 = 1;
        boolean z2 = true;
        switch (b) {
            case 0:
                if (this.b != z && !this.c) {
                    this.b = z;
                    LaunchActivity launchActivity = (LaunchActivity) ((WeakReference) obj).get();
                    if (launchActivity != null) {
                        String str = LaunchActivity.C1;
                        int i4 = launchActivity.B1;
                        if (!z) {
                            i3 = -1;
                        }
                        int i5 = i4 + i3;
                        launchActivity.B1 = i5;
                        d26 d26Var = launchActivity.v0;
                        if (d26Var != null) {
                            if (i5 <= 0) {
                                i2 = 0;
                            }
                            d26Var.setVisibility(i2);
                        }
                        launchActivity.getWindow();
                        return;
                    }
                    return;
                }
                return;
            default:
                if (this.b != z && !this.c) {
                    this.b = z;
                    cdc cdcVar = (cdc) obj;
                    if (z) {
                        i = cdcVar.b + 1;
                        cdcVar.b = i;
                    } else {
                        i = cdcVar.b - 1;
                        cdcVar.b = i;
                    }
                    if (i <= 0) {
                        z2 = false;
                    }
                    if (cdcVar.a != z2) {
                        cdcVar.a = z2;
                        Window window = (Window) ((WeakReference) ((ftb) cdcVar.c).b).get();
                        if (window != null) {
                            View decorView = window.getDecorView();
                            if (!z2) {
                                i2 = 0;
                            }
                            decorView.setVisibility(i2);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public e26(cdc cdcVar) {
        this.d = cdcVar;
    }
}
