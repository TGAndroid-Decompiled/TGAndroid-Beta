package ii;

import ai.g5;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import ei.y8;
import gi.i8;
import gi.j8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.bd;
import org.telegram.messenger.l10;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.h5;
public final class s extends org.telegram.ui.ActionBar.d2 {
    public l41 f15207a;
    public final ArrayList f15208b;
    public final HashMap f15209c;

    public s() {
        super(null);
        this.f15208b = new ArrayList();
        this.f15209c = new HashMap();
    }

    public static void Z(s sVar, ArrayList arrayList) {
        HashMap hashMap = sVar.f15209c;
        ArrayList arrayList2 = sVar.f15208b;
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            q qVar = (q) arrayList2.get(i3);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(qVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                h5 h5Var = new h5(24.0f, sVar.currentAccount, null);
                h5Var.e(qVar.f15148a);
                spannableStringBuilder.setSpan(h5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) l10.p(qVar.f15148a));
                hashMap.put(qVar, spannableStringBuilder);
            }
            r31 i10 = r31.i(i3, spannableStringBuilder);
            i10.L(!qVar.f15149b);
            arrayList.add(i10);
        }
        arrayList.add(r31.C(bd.M0(2131746869, null)));
    }

    public static void a0(s sVar, r31 r31Var) {
        int i3;
        f41 f41Var;
        ArrayList arrayList = sVar.f15208b;
        if (r31Var.f54715a == 4 && (i3 = r31Var.d) >= 0 && i3 < arrayList.size()) {
            q qVar = (q) arrayList.get(r31Var.d);
            qVar.f15149b = !qVar.f15149b;
            Activity parentActivity = sVar.getParentActivity();
            int i10 = sVar.currentAccount;
            long j10 = qVar.f15148a.f27150id;
            boolean z10 = qVar.f15149b;
            WeakHashMap weakHashMap = r.f15180k;
            SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i10, 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(j10 + "_disabled", z10);
            if (!z10 && sharedPreferences.getString(String.valueOf(j10), null) == null) {
                edit.putString(String.valueOf(j10), "");
            }
            edit.apply();
            l41 l41Var = sVar.f15207a;
            if (l41Var != null && (f41Var = l41Var.f35594g3) != null) {
                f41Var.O(true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(bd.M0(2131746871, null));
        this.actionBar.setActionBarMenuOnItemClick(new g5(this, 4));
        FrameLayout frameLayout = new FrameLayout(context);
        r6.i(k6.f27824a7, frameLayout, this.resourceProvider);
        l41 l41Var = new l41(this, new gi.q4(this, 7), new y8(this, 15), new i8(this));
        this.f15207a = l41Var;
        frameLayout.addView(l41Var, mf.e(-1, -1, 119));
        r.d(getParentActivity(), this.currentAccount, new j8(this, 2));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
