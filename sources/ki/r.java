package ki;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import hi.e7;
import hi.f9;
import hi.t6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.gd;
import org.telegram.messenger.o10;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
import org.telegram.ui.f5;
public final class r extends org.telegram.ui.ActionBar.h2 {
    public e51 f18850a;
    public final ArrayList f18851b;
    public final HashMap f18852c;

    public r() {
        super(null);
        this.f18851b = new ArrayList();
        this.f18852c = new HashMap();
    }

    public static void Z(r rVar, ArrayList arrayList) {
        HashMap hashMap = rVar.f18852c;
        ArrayList arrayList2 = rVar.f18851b;
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            p pVar = (p) arrayList2.get(i7);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(pVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                f5 f5Var = new f5(24.0f, rVar.currentAccount, null);
                f5Var.e(pVar.f18821a);
                spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) o10.q(pVar.f18821a));
                hashMap.put(pVar, spannableStringBuilder);
            }
            l41 i10 = l41.i(i7, spannableStringBuilder);
            i10.L(!pVar.f18822b);
            arrayList.add(i10);
        }
        arrayList.add(l41.C(gd.M0(2131746668, null)));
    }

    public static void a0(r rVar, l41 l41Var) {
        int i7;
        z41 z41Var;
        ArrayList arrayList = rVar.f18851b;
        if (l41Var.f56589a == 4 && (i7 = l41Var.d) >= 0 && i7 < arrayList.size()) {
            p pVar = (p) arrayList.get(l41Var.d);
            pVar.f18822b = !pVar.f18822b;
            Activity parentActivity = rVar.getParentActivity();
            int i10 = rVar.currentAccount;
            long j3 = pVar.f18821a.f28552id;
            boolean z10 = pVar.f18822b;
            WeakHashMap weakHashMap = q.f18831k;
            SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i10, 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(j3 + "_disabled", z10);
            if (!z10 && sharedPreferences.getString(String.valueOf(j3), null) == null) {
                edit.putString(String.valueOf(j3), "");
            }
            edit.apply();
            e51 e51Var = rVar.f18850a;
            if (e51Var != null && (z41Var = e51Var.f34607g3) != null) {
                z41Var.O(true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(gd.M0(2131746670, null));
        this.actionBar.setActionBarMenuOnItemClick(new bi.r1(this, 15));
        FrameLayout frameLayout = new FrameLayout(context);
        u6.h(n6.f29337a7, frameLayout, this.resourceProvider);
        e51 e51Var = new e51(this, new e7(this, 17), new e(this, 2), new f9(this, 15));
        this.f18850a = e51Var;
        frameLayout.addView(e51Var, ma.e(-1, -1, 119));
        q.d(getParentActivity(), this.currentAccount, new t6(this, 13));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
