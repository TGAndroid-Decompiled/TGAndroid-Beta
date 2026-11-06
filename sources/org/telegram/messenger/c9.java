package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.ArrayList;
public final class c9 extends org.telegram.ui.ActionBar.v2 {
    public final int f21748i1 = 0;
    public org.telegram.ui.ActionBar.f2 f21749j1;

    public c9(Context context, boolean z9) {
        super(context, z9);
    }

    @Override
    public boolean G() {
        switch (this.f21748i1) {
            case 0:
                return false;
            default:
                return super.G();
        }
    }

    @Override
    public boolean H() {
        switch (this.f21748i1) {
            case 0:
                return false;
            default:
                return super.H();
        }
    }

    public void I0() {
        boolean z9;
        Activity parentActivity = ((org.telegram.ui.ww) this.f21749j1).getParentActivity();
        boolean z10 = false;
        if (parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        int i7 = Build.VERSION.SDK_INT;
        if ((i7 >= 33 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) || (i7 < 33 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0)) {
            z10 = true;
        }
        if (z10 && z9) {
            boolean z11 = FilesMigrationService.f21168c;
            t0.f25555b.startService(new Intent(t0.f25555b, FilesMigrationService.class));
            dismiss();
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!z10) {
            if (i7 >= 33) {
                arrayList.add("android.permission.READ_MEDIA_IMAGES");
                arrayList.add("android.permission.READ_MEDIA_VIDEO");
                arrayList.add("android.permission.READ_MEDIA_AUDIO");
            } else {
                arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
            }
        }
        if (!z9) {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        parentActivity.requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), 4);
    }

    @Override
    public void K() {
        switch (this.f21748i1) {
            case 1:
                super.K();
                org.telegram.ui.Components.t8 t8Var = (org.telegram.ui.Components.t8) this.f21749j1;
                g0.a3(t8Var.getParentActivity(), t8Var.getClassGuid());
                t8Var.S = null;
                return;
            default:
                super.K();
                return;
        }
    }

    @Override
    public final void dismiss() {
        switch (this.f21748i1) {
            case 0:
                super.dismiss();
                FilesMigrationService.f21169e = null;
                return;
            default:
                super.dismiss();
                org.telegram.ui.Components.t8 t8Var = (org.telegram.ui.Components.t8) this.f21749j1;
                t8Var.J.z1(t8Var.Y);
                t8Var.f38290f = true;
                t8Var.fragmentView.invalidate();
                t8Var.f38289e.animate().setListener(new org.telegram.ui.Components.z5(this, 4)).alpha(0.0f).setDuration(200L).start();
                return;
        }
    }

    public c9(org.telegram.ui.Components.t8 t8Var, Activity activity) {
        super(activity, true);
        this.f21749j1 = t8Var;
    }
}
