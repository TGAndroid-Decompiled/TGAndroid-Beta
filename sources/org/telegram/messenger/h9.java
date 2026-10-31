package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.ArrayList;
public final class h9 extends org.telegram.ui.ActionBar.z2 {
    public final int f15850i1 = 0;
    public org.telegram.ui.ActionBar.k2 f15851j1;

    public h9(Context context, boolean z10) {
        super(context, z10);
    }

    @Override
    public boolean H() {
        switch (this.f15850i1) {
            case 0:
                return false;
            default:
                return super.H();
        }
    }

    @Override
    public boolean I() {
        switch (this.f15850i1) {
            case 0:
                return false;
            default:
                return super.I();
        }
    }

    public void I0() {
        boolean z10;
        Activity parentActivity = ((org.telegram.ui.ay) this.f15851j1).getParentActivity();
        boolean z11 = false;
        if (parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i10 = Build.VERSION.SDK_INT;
        if ((i10 >= 33 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) || (i10 < 33 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0)) {
            z11 = true;
        }
        if (z11 && z10) {
            boolean z12 = FilesMigrationService.f14360c;
            w0.f19025b.startService(new Intent(w0.f19025b, FilesMigrationService.class));
            dismiss();
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!z11) {
            if (i10 >= 33) {
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
        switch (this.f15850i1) {
            case 1:
                super.L();
                org.telegram.ui.Components.o8 o8Var = (org.telegram.ui.Components.o8) this.f15851j1;
                i0.Z2(o8Var.getParentActivity(), o8Var.getClassGuid());
                o8Var.S = null;
                return;
            default:
                super.L();
                return;
        }
    }

    @Override
    public final void dismiss() {
        switch (this.f15850i1) {
            case 0:
                super.dismiss();
                FilesMigrationService.e = null;
                return;
            default:
                super.dismiss();
                org.telegram.ui.Components.o8 o8Var = (org.telegram.ui.Components.o8) this.f15851j1;
                o8Var.J.z1(o8Var.Y);
                o8Var.f28992f = true;
                o8Var.fragmentView.invalidate();
                o8Var.e.animate().setListener(new org.telegram.ui.Components.w5(this, 4)).alpha(0.0f).setDuration(200L).start();
                return;
        }
    }

    public h9(org.telegram.ui.Components.o8 o8Var, Activity activity) {
        super(activity, true);
        this.f15851j1 = o8Var;
    }
}
