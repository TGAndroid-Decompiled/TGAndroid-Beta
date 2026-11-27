package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.SaveToGallerySettingsActivity;
public final class et9 implements s69, u69, oj3 {
    public final SaveToGallerySettingsActivity a;

    public et9(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.a = saveToGallerySettingsActivity;
    }

    @Override
    public final boolean C(View view) {
        return false;
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
            jt9 b0 = saveToGallerySettingsActivity.b0();
            b0.a = !b0.a;
            saveToGallerySettingsActivity.c0();
            saveToGallerySettingsActivity.d0();
        } else if (i == saveToGallerySettingsActivity.f) {
            jt9 b02 = saveToGallerySettingsActivity.b0();
            b02.b = !b02.b;
            saveToGallerySettingsActivity.c0();
            saveToGallerySettingsActivity.d0();
        } else if (((gt9) arrayList.get(i)).a == 1) {
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
            uj3 uj3Var = new uj3(bundle);
            uj3Var.E2 = new et9(saveToGallerySettingsActivity);
            saveToGallerySettingsActivity.presentFragment(uj3Var);
        } else if (((gt9) arrayList.get(i)).a == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ((gt9) arrayList.get(i)).c.d);
            bundle2.putInt("type", saveToGallerySettingsActivity.a);
            saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle2));
        } else if (((gt9) arrayList.get(i)).a == 4) {
            id idVar = jj.L(saveToGallerySettingsActivity.getParentActivity(), ob6.M0(2131747640, null), ob6.M0(2131747641, null), ob6.M0(2131751563, null), new v59(saveToGallerySettingsActivity, (byte) 23), null).a;
            idVar.show();
            idVar.h();
        }
    }

    @Override
    public final boolean q(uj3 uj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, tzb tzbVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((jf7) arrayList.get(0)).a);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        bundle.putInt("type", saveToGallerySettingsActivity.a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override
    public final boolean s(uj3 uj3Var) {
        return false;
    }

    @Override
    public final void f() {
    }

    @Override
    public final void h(float f) {
    }

    @Override
    public final void u(View view, float f, float f2) {
    }

    @Override
    public final boolean mo8d(float f, float f2, int i, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (((gt9) arrayList.get(i)).a == 2) {
            it9 it9Var = ((gt9) arrayList.get(i)).c;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
            b8 c = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232111, ob6.M0(2131751245, null), false, null);
            b8 c2 = s7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232113, ob6.M0(2131751507, null), false, null);
            int i2 = aob.p7;
            c2.d(aob.w0(null, i2, false), aob.w0(null, i2, false));
            n8 N = jj.N(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f, f2);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(N);
            c.setOnClickListener(new ae(saveToGallerySettingsActivity, N, i, (byte) 14));
            c2.setOnClickListener(new lw4(saveToGallerySettingsActivity, N, it9Var, (byte) 19));
            return true;
        }
        return false;
    }
}
