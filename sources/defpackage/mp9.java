package defpackage;

import android.os.Bundle;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.SaveToGallerySettingsActivity;
public final class mp9 implements d39, f39, wi3 {
    public final SaveToGallerySettingsActivity a;

    public mp9(SaveToGallerySettingsActivity saveToGallerySettingsActivity) {
        this.a = saveToGallerySettingsActivity;
    }

    @Override
    public final boolean G() {
        return false;
    }

    @Override
    public final void e(float f, float f2, int i, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (i == saveToGallerySettingsActivity.e) {
            rp9 b0 = saveToGallerySettingsActivity.b0();
            b0.a = !b0.a;
            saveToGallerySettingsActivity.c0();
            saveToGallerySettingsActivity.d0();
        } else if (i == saveToGallerySettingsActivity.f) {
            rp9 b02 = saveToGallerySettingsActivity.b0();
            b02.b = !b02.b;
            saveToGallerySettingsActivity.c0();
            saveToGallerySettingsActivity.d0();
        } else if (((op9) arrayList.get(i)).a == 1) {
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
            cj3 cj3Var = new cj3(bundle);
            cj3Var.E2 = new mp9(saveToGallerySettingsActivity);
            saveToGallerySettingsActivity.presentFragment(cj3Var);
        } else if (((op9) arrayList.get(i)).a == 2) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("dialog_id", ((op9) arrayList.get(i)).c.d);
            bundle2.putInt("type", saveToGallerySettingsActivity.a);
            saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle2));
        } else if (((op9) arrayList.get(i)).a == 4) {
            hd hdVar = ij.L(saveToGallerySettingsActivity.getParentActivity(), k96.M0(2131747720, null), k96.M0(2131747721, null), k96.M0(2131751586, null), new zk9(saveToGallerySettingsActivity, (byte) 7), null).a;
            hdVar.show();
            hdVar.h();
        }
    }

    @Override
    public final boolean q(View view) {
        return false;
    }

    @Override
    public final boolean r(cj3 cj3Var, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, qvb qvbVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("dialog_id", ((zc7) arrayList.get(0)).a);
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        bundle.putInt("type", saveToGallerySettingsActivity.a);
        saveToGallerySettingsActivity.presentFragment(new SaveToGallerySettingsActivity(bundle), true);
        return true;
    }

    @Override
    public final boolean t(cj3 cj3Var) {
        return false;
    }

    @Override
    public final void f() {
    }

    @Override
    public final void g(float f) {
    }

    @Override
    public final void l(View view, float f, float f2) {
    }

    @Override
    public final boolean mo8e(float f, float f2, int i, View view) {
        SaveToGallerySettingsActivity saveToGallerySettingsActivity = this.a;
        ArrayList arrayList = saveToGallerySettingsActivity.s;
        if (((op9) arrayList.get(i)).a == 2) {
            qp9 qp9Var = ((op9) arrayList.get(i)).c;
            ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = new ActionBarPopupWindow$ActionBarPopupWindowLayout(saveToGallerySettingsActivity.getParentActivity(), null);
            a8 c = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232111, k96.M0(2131751268, null), false, null);
            a8 c2 = r7.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout, 2131232113, k96.M0(2131751530, null), false, null);
            int i2 = bkb.o7;
            c2.d(bkb.w0(null, i2, false), bkb.w0(null, i2, false));
            m8 N = ij.N(saveToGallerySettingsActivity, actionBarPopupWindow$ActionBarPopupWindowLayout, view, f, f2);
            actionBarPopupWindow$ActionBarPopupWindowLayout.setParentWindow(N);
            c.setOnClickListener(new wg(saveToGallerySettingsActivity, N, i, (byte) 14));
            c2.setOnClickListener(new hu4(saveToGallerySettingsActivity, N, qp9Var, (byte) 18));
            return true;
        }
        return false;
    }
}
