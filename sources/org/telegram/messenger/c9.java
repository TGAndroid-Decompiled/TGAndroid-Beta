package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.ArrayList;
public final class c9 extends org.telegram.ui.ActionBar.w2 {
    public final int f23247m1 = 0;
    public org.telegram.ui.ActionBar.g2 n1;

    public c9(Context context, boolean z10) {
        super(context, z10);
    }

    @Override
    public boolean G() {
        switch (this.f23247m1) {
            case 0:
                return false;
            default:
                return super.G();
        }
    }

    @Override
    public boolean I() {
        switch (this.f23247m1) {
            case 0:
                return false;
            default:
                return super.I();
        }
    }

    public void J0() {
        boolean z10;
        Activity parentActivity = ((org.telegram.ui.cx) this.n1).getParentActivity();
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
            boolean z12 = FilesMigrationService.f22644c;
            t0.f26931b.startService(new Intent(t0.f26931b, FilesMigrationService.class));
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
        switch (this.f23247m1) {
            case 1:
                super.L();
                org.telegram.ui.Components.y8 y8Var = (org.telegram.ui.Components.y8) this.n1;
                g0.Z2(y8Var.getParentActivity(), y8Var.getClassGuid());
                y8Var.T = null;
                return;
            default:
                super.L();
                return;
        }
    }

    @Override
    public final void dismiss() {
        switch (this.f23247m1) {
            case 0:
                super.dismiss();
                FilesMigrationService.f22645e = null;
                return;
            default:
                super.dismiss();
                org.telegram.ui.Components.y8 y8Var = (org.telegram.ui.Components.y8) this.n1;
                y8Var.K.z1(y8Var.Z);
                y8Var.f42349f = true;
                y8Var.fragmentView.invalidate();
                y8Var.f42348e.animate().setListener(new org.telegram.ui.Components.y(this, 5)).alpha(0.0f).setDuration(200L).start();
                return;
        }
    }

    public c9(org.telegram.ui.Components.y8 y8Var, Activity activity) {
        super(activity, true);
        this.n1 = y8Var;
    }
}
