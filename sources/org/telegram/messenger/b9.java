package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.ArrayList;
public final class b9 extends org.telegram.ui.ActionBar.u2 {
    public final int f22675m1 = 0;
    public org.telegram.ui.ActionBar.e2 n1;

    public b9(Context context, boolean z10) {
        super(context, z10);
    }

    @Override
    public boolean H() {
        switch (this.f22675m1) {
            case 0:
                return false;
            default:
                return super.H();
        }
    }

    @Override
    public boolean I() {
        switch (this.f22675m1) {
            case 0:
                return false;
            default:
                return super.I();
        }
    }

    public void I0() {
        boolean z10;
        Activity parentActivity = ((org.telegram.ui.yw) this.n1).getParentActivity();
        boolean z11 = false;
        if (parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i7 = Build.VERSION.SDK_INT;
        if ((i7 >= 33 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) || (i7 < 33 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0)) {
            z11 = true;
        }
        if (z11 && z10) {
            boolean z12 = FilesMigrationService.f22250c;
            t0.f26609b.startService(new Intent(t0.f26609b, FilesMigrationService.class));
            dismiss();
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!z11) {
            if (i7 >= 33) {
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
    public void L() {
        switch (this.f22675m1) {
            case 1:
                super.L();
                org.telegram.ui.Components.q8 q8Var = (org.telegram.ui.Components.q8) this.n1;
                g0.a3(q8Var.getParentActivity(), q8Var.getClassGuid());
                q8Var.T = null;
                return;
            default:
                super.L();
                return;
        }
    }

    @Override
    public final void dismiss() {
        switch (this.f22675m1) {
            case 0:
                super.dismiss();
                FilesMigrationService.f22251e = null;
                return;
            default:
                super.dismiss();
                org.telegram.ui.Components.q8 q8Var = (org.telegram.ui.Components.q8) this.n1;
                q8Var.K.z1(q8Var.Z);
                q8Var.f38569f = true;
                q8Var.fragmentView.invalidate();
                q8Var.f38568e.animate().setListener(new org.telegram.ui.Components.x5(this, 4)).alpha(0.0f).setDuration(200L).start();
                return;
        }
    }

    public b9(org.telegram.ui.Components.q8 q8Var, Activity activity) {
        super(activity, true);
        this.n1 = q8Var;
    }
}
