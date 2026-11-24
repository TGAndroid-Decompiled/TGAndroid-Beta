package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import java.util.ArrayList;
import org.telegram.messenger.FilesMigrationService;
import org.telegram.messenger.a;
import org.telegram.ui.ActionBar.d;
public final class yb0 extends my0 {
    public final byte l1 = 1;
    public d m1;

    public yb0(mc0 mc0Var, Activity activity) {
        super(activity, true);
        this.m1 = mc0Var;
    }

    @Override
    public final boolean C() {
        switch (this.l1) {
            case 1:
                return false;
            default:
                return super.C();
        }
    }

    public final void D0() {
        boolean z;
        Activity parentActivity = ((nk3) this.m1).getParentActivity();
        boolean z2 = false;
        if (parentActivity.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            z = true;
        } else {
            z = false;
        }
        int i = Build.VERSION.SDK_INT;
        if ((i >= 33 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0 && parentActivity.checkSelfPermission("android.permission.READ_MEDIA_AUDIO") == 0) || (i < 33 && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0)) {
            z2 = true;
        }
        if (z2 && z) {
            boolean z3 = FilesMigrationService.c;
            a.b.startService(new Intent(a.b, FilesMigrationService.class));
            dismiss();
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!z2) {
            if (i >= 33) {
                arrayList.add("android.permission.READ_MEDIA_IMAGES");
                arrayList.add("android.permission.READ_MEDIA_VIDEO");
                arrayList.add("android.permission.READ_MEDIA_AUDIO");
            } else {
                arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
            }
        }
        if (!z) {
            arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
        }
        parentActivity.requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), 4);
    }

    @Override
    public final boolean E() {
        switch (this.l1) {
            case 1:
                return false;
            default:
                return super.E();
        }
    }

    @Override
    public final void H() {
        switch (this.l1) {
            case 0:
                super.H();
                mc0 mc0Var = (mc0) this.m1;
                gm.V2(mc0Var.getParentActivity(), mc0Var.getClassGuid());
                mc0Var.T = null;
                return;
            default:
                super.H();
                return;
        }
    }

    @Override
    public final void dismiss() {
        switch (this.l1) {
            case 0:
                super.dismiss();
                mc0 mc0Var = (mc0) this.m1;
                mc0Var.K.z1(mc0Var.Z);
                mc0Var.f = true;
                mc0Var.fragmentView.invalidate();
                mc0Var.e.animate().setListener(new g0(this, (byte) 17)).alpha(0.0f).setDuration(200L).start();
                return;
            default:
                super.dismiss();
                FilesMigrationService.e = null;
                return;
        }
    }

    public yb0(Context context, boolean z) {
        super(context, z);
    }
}
