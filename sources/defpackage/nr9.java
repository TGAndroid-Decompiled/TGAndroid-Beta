package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.SaveToGallerySettingsActivity;
public final class nr9 implements g59, i59, hk3 {
    public final SaveToGallerySettingsActivity a;

    public nr9(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.a = saveToGallerySettingsActivity;
    }

    @Override
    public final boolean E() {
        return false;
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (i == saveToGallerySettingsActivity.e) {
            sr9 c0 = saveToGallerySettingsActivity.c0();
            c0.a = !c0.a;
            saveToGallerySettingsActivity.d0();
            saveToGallerySettingsActivity.e0();
        } else if (i == saveToGallerySettingsActivity.f) {
            sr9 c02 = saveToGallerySettingsActivity.c0();
            c02.b = !c02.b;
            saveToGallerySettingsActivity.d0();
            saveToGallerySettingsActivity.e0();
        } else if (((pr9) arrayList.get(i)).a == 1) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i2 = saveToGallerySettingsActivity.a;
            if (i2 == 2) {
                bundle.putInt("dialogsType", 6);
            } else if (i2 == 4) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            bundle.putBoolean("allowGlobalSearch", false);
            nk3 nk3Var = new nk3(bundle);
            nk3Var.E2 = new nr9(saveToGallerySettingsActivity);
            saveToGallerySettingsActivity.presentFragment(nk3Var);
        } else if (((pr9) arrayList.get(i)).a == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ((pr9) arrayList.get(i)).c.d);
            bundle2.putInt("type", saveToGallerySettingsActivity.a);
            saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle2));
        } else if (((pr9) arrayList.get(i)).a == 4) {
            he heVar = ik.L(saveToGallerySettingsActivity.getParentActivity(), jb6.M0(2131747646, null), jb6.M0(2131747647, null), jb6.M0(2131751535, null), new kf9(saveToGallerySettingsActivity, (byte) 15), null).a;
            heVar.show();
            heVar.h();
        }
    }

    @Override
    public final boolean q(nk3 nk3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, sxb sxbVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((bf7) arrayList.get(0)).a);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        bundle.putInt("type", saveToGallerySettingsActivity.a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override
    public final boolean s(nk3 nk3Var) {
        return false;
    }

    @Override
    public final boolean u(View view) {
        return false;
    }

    @Override
    public final void i() {
    }

    @Override
    public final void k(float f) {
    }

    @Override
    public final void p(View view, float f, float f2) {
    }

    @Override
    public final boolean mo14d(float f, float f2, int i, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (((pr9) arrayList.get(i)).a == 2) {
            rr9 rr9Var = ((pr9) arrayList.get(i)).c;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
            a8 c = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232112, jb6.M0(2131751217, null), false, null);
            a8 c2 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232114, jb6.M0(2131751479, null), false, null);
            int i2 = cmb.o7;
            c2.d(cmb.w0(null, i2, false), cmb.w0(null, i2, false));
            m8 N = ik.N(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f, f2);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(N);
            c.setOnClickListener(new wh(saveToGallerySettingsActivity, N, i, (byte) 14));
            c2.setOnClickListener(new jw4(saveToGallerySettingsActivity, N, rr9Var, (byte) 18));
            return true;
        }
        return false;
    }
}
