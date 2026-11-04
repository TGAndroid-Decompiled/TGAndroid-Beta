package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.ArrayList;
public final class b9 extends org.telegram.ui.ActionBar.t2 {
    public final int f21755j1 = 0;
    public org.telegram.ui.ActionBar.d2 k1;

    public b9(Context context, boolean z10) {
        super(context, z10);
    }

    @Override
    public boolean G() {
        switch (this.f21755j1) {
            case 0:
                return false;
            default:
                return super.G();
        }
    }

    @Override
    public boolean H() {
        switch (this.f21755j1) {
            case 0:
                return false;
            default:
                return super.H();
        }
    }

    public void I0() {
        boolean z10;
        Activity parentActivity = ((org.telegram.ui.uw) this.k1).getParentActivity();
        boolean z11 = false;
        if (parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i3 = Build.VERSION.SDK_INT;
        if ((i3 >= 33 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) || (i3 < 33 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0)) {
            z11 = true;
        }
        if (z11 && z10) {
            boolean z12 = FilesMigrationService.f21221c;
            t0.f25457b.startService(new Intent(t0.f25457b, FilesMigrationService.class));
            dismiss();
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!z11) {
            if (i3 >= 33) {
                arrayList.add("android.permission.READ_MEDIA_IMAGES");
                arrayList.add("android.permission.READ_MEDIA_VIDEO");
                arrayList.add("android.permission.READ_MEDIA_AUDIO");
            } else {
                arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
            }
        }
        if (!z10) {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        parentActivity.requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), 4);
    }

    @Override
    public void K() {
        switch (this.f21755j1) {
            case 1:
                super.K();
                org.telegram.ui.Components.r8 r8Var = (org.telegram.ui.Components.r8) this.k1;
                g0.a3(r8Var.getParentActivity(), r8Var.getClassGuid());
                r8Var.T = null;
                return;
            default:
                super.K();
                return;
        }
    }

    @Override
    public final void dismiss() {
        switch (this.f21755j1) {
            case 0:
                super.dismiss();
                FilesMigrationService.f21222e = null;
                return;
            default:
                super.dismiss();
                org.telegram.ui.Components.r8 r8Var = (org.telegram.ui.Components.r8) this.k1;
                r8Var.K.z1(r8Var.Z);
                r8Var.f37674f = true;
                r8Var.fragmentView.invalidate();
                r8Var.f37673e.animate().setListener(new org.telegram.ui.Components.x5(this, 4)).alpha(0.0f).setDuration(200L).start();
                return;
        }
    }

    public b9(org.telegram.ui.Components.r8 r8Var, Activity activity) {
        super(activity, true);
        this.k1 = r8Var;
    }
}
