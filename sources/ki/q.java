package ki;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import c8.ma;
import hi.d7;
import hi.e9;
import hi.s6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.gd;
import org.telegram.messenger.o10;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.o41;
import org.telegram.ui.f5;
public final class q extends org.telegram.ui.ActionBar.g2 {
    public h51 f18860a;
    public final ArrayList f18861b;
    public final HashMap f18862c;

    public q() {
        super(null);
        this.f18861b = new ArrayList();
        this.f18862c = new HashMap();
    }

    public static void Z(q qVar, ArrayList arrayList) {
        HashMap hashMap = qVar.f18862c;
        ArrayList arrayList2 = qVar.f18861b;
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            o oVar = (o) arrayList2.get(i7);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(oVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                f5 f5Var = new f5(24.0f, qVar.currentAccount, null);
                f5Var.e(oVar.f18831a);
                spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) o10.q(oVar.f18831a));
                hashMap.put(oVar, spannableStringBuilder);
            }
            o41 i10 = o41.i(i7, spannableStringBuilder);
            i10.L(!oVar.f18832b);
            arrayList.add(i10);
        }
        arrayList.add(o41.C(gd.N0(2131746667, null)));
    }

    public static void a0(q qVar, o41 o41Var) {
        int i7;
        c51 c51Var;
        ArrayList arrayList = qVar.f18861b;
        if (o41Var.f56630a == 4 && (i7 = o41Var.d) >= 0 && i7 < arrayList.size()) {
            o oVar = (o) arrayList.get(o41Var.d);
            oVar.f18832b = !oVar.f18832b;
            Activity parentActivity = qVar.getParentActivity();
            int i10 = qVar.currentAccount;
            long j3 = oVar.f18831a.f28580id;
            boolean z10 = oVar.f18832b;
            WeakHashMap weakHashMap = p.f18841k;
            SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i10, 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(j3 + "_disabled", z10);
            if (!z10 && sharedPreferences.getString(String.valueOf(j3), null) == null) {
                edit.putString(String.valueOf(j3), "");
            }
            edit.apply();
            h51 h51Var = qVar.f18860a;
            if (h51Var != null && (c51Var = h51Var.f35796g3) != null) {
                c51Var.O(true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(gd.N0(2131746669, null));
        this.actionBar.setActionBarMenuOnItemClick(new bi.v1(this, 15));
        FrameLayout frameLayout = new FrameLayout(context);
        t6.h(m6.f29321a7, frameLayout, this.resourceProvider);
        h51 h51Var = new h51(this, new d7(this, 17), new kg.x1(this, 3), new e9(this, 15));
        this.f18860a = h51Var;
        frameLayout.addView(h51Var, ma.e(-1, -1, 119));
        p.d(getParentActivity(), this.currentAccount, new s6(this, 13));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
