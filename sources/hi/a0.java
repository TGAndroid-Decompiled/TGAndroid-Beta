package hi;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.j5;
public final class a0 extends org.telegram.ui.ActionBar.r2 {
    public r71 f12848a;
    public final ArrayList f12849b;
    public final HashMap f12850c;

    public a0() {
        super(null);
        this.f12849b = new ArrayList();
        this.f12850c = new HashMap();
    }

    public static void V(a0 a0Var, ArrayList arrayList) {
        HashMap hashMap = a0Var.f12850c;
        ArrayList arrayList2 = a0Var.f12849b;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            x xVar = (x) arrayList2.get(i10);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(xVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                j5 j5Var = new j5(null, 24.0f, a0Var.currentAccount);
                j5Var.e(xVar.f13351a);
                spannableStringBuilder.setSpan(j5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) UserObject.getUserName(xVar.f13351a));
                hashMap.put(xVar, spannableStringBuilder);
            }
            t61 i11 = t61.i(i10, spannableStringBuilder);
            i11.L(!xVar.f13352b);
            arrayList.add(i11);
        }
        ic.a.z(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void W(a0 a0Var, t61 t61Var) {
        int i10;
        j71 j71Var;
        ArrayList arrayList = a0Var.f12849b;
        if (t61Var.f47040a == 4 && (i10 = t61Var.d) >= 0 && i10 < arrayList.size()) {
            x xVar = (x) arrayList.get(t61Var.d);
            xVar.f13352b = !xVar.f13352b;
            Activity parentActivity = a0Var.getParentActivity();
            int i11 = a0Var.currentAccount;
            long j10 = xVar.f13351a.f22176id;
            boolean z10 = xVar.f13352b;
            WeakHashMap weakHashMap = y.f13364k;
            SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i11, 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(j10 + "_disabled", z10);
            if (!z10 && sharedPreferences.getString(String.valueOf(j10), null) == null) {
                edit.putString(String.valueOf(j10), "");
            }
            edit.apply();
            r71 r71Var = a0Var.f12848a;
            if (r71Var != null && (j71Var = r71Var.f32152g3) != null) {
                j71Var.O(true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new bh.m(this, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        f7.i(y6.f23299a7, frameLayout, this.resourceProvider);
        r71 r71Var = new r71(this, new ai.e(this, 27), new z(this), new z(this));
        this.f12848a = r71Var;
        frameLayout.addView(r71Var, gb1.i(-1, -1, 119));
        y.d(getParentActivity(), this.currentAccount, new ai.i(this, 28));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
