package ki;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import c8.na;
import hi.e7;
import hi.f9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.hd;
import org.telegram.messenger.p10;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.o41;
import org.telegram.ui.f5;
public final class q extends org.telegram.ui.ActionBar.g2 {
    public h51 f18829a;
    public final ArrayList f18830b;
    public final HashMap f18831c;

    public q() {
        super(null);
        this.f18830b = new ArrayList();
        this.f18831c = new HashMap();
    }

    public static void Z(q qVar, ArrayList arrayList) {
        HashMap hashMap = qVar.f18831c;
        ArrayList arrayList2 = qVar.f18830b;
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            o oVar = (o) arrayList2.get(i7);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(oVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                f5 f5Var = new f5(24.0f, qVar.currentAccount, null);
                f5Var.e(oVar.f18800a);
                spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) p10.q(oVar.f18800a));
                hashMap.put(oVar, spannableStringBuilder);
            }
            o41 i10 = o41.i(i7, spannableStringBuilder);
            i10.L(!oVar.f18801b);
            arrayList.add(i10);
        }
        arrayList.add(o41.C(hd.N0(2131746667, null)));
    }

    public static void a0(q qVar, o41 o41Var) {
        int i7;
        c51 c51Var;
        ArrayList arrayList = qVar.f18830b;
        if (o41Var.f56599a == 4 && (i7 = o41Var.d) >= 0 && i7 < arrayList.size()) {
            o oVar = (o) arrayList.get(o41Var.d);
            oVar.f18801b = !oVar.f18801b;
            Activity parentActivity = qVar.getParentActivity();
            int i10 = qVar.currentAccount;
            long j3 = oVar.f18800a.f28547id;
            boolean z10 = oVar.f18801b;
            WeakHashMap weakHashMap = p.f18810k;
            SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i10, 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(j3 + "_disabled", z10);
            if (!z10 && sharedPreferences.getString(String.valueOf(j3), null) == null) {
                edit.putString(String.valueOf(j3), "");
            }
            edit.apply();
            h51 h51Var = qVar.f18829a;
            if (h51Var != null && (c51Var = h51Var.f35742g3) != null) {
                c51Var.O(true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(hd.N0(2131746669, null));
        this.actionBar.setActionBarMenuOnItemClick(new bi.w1(this, 15));
        FrameLayout frameLayout = new FrameLayout(context);
        t6.h(m6.f29290a7, frameLayout, this.resourceProvider);
        h51 h51Var = new h51(this, new e7(this, 17), new kg.y1(this, 3), new f9(this, 15));
        this.f18829a = h51Var;
        frameLayout.addView(h51Var, na.e(-1, -1, 119));
        p.d(getParentActivity(), this.currentAccount, new hi.t6(this, 13));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
