package ki;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import c8.na;
import hi.c7;
import hi.y7;
import hi.z9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.gd;
import org.telegram.messenger.n10;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.n41;
import org.telegram.ui.f5;
public final class q extends org.telegram.ui.ActionBar.g2 {
    public g51 f18934a;
    public final ArrayList f18935b;
    public final HashMap f18936c;

    public q() {
        super(null);
        this.f18935b = new ArrayList();
        this.f18936c = new HashMap();
    }

    public static void Z(q qVar, ArrayList arrayList) {
        HashMap hashMap = qVar.f18936c;
        ArrayList arrayList2 = qVar.f18935b;
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            o oVar = (o) arrayList2.get(i7);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(oVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                f5 f5Var = new f5(24.0f, qVar.currentAccount, null);
                f5Var.e(oVar.f18901a);
                spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) n10.q(oVar.f18901a));
                hashMap.put(oVar, spannableStringBuilder);
            }
            n41 i10 = n41.i(i7, spannableStringBuilder);
            i10.L(!oVar.f18902b);
            arrayList.add(i10);
        }
        arrayList.add(n41.C(gd.N0(2131746667, null)));
    }

    public static void a0(q qVar, n41 n41Var) {
        int i7;
        b51 b51Var;
        ArrayList arrayList = qVar.f18935b;
        if (n41Var.f56712a == 4 && (i7 = n41Var.d) >= 0 && i7 < arrayList.size()) {
            o oVar = (o) arrayList.get(n41Var.d);
            oVar.f18902b = !oVar.f18902b;
            Activity parentActivity = qVar.getParentActivity();
            int i10 = qVar.currentAccount;
            long j3 = oVar.f18901a.f28641id;
            boolean z10 = oVar.f18902b;
            WeakHashMap weakHashMap = p.f18913k;
            SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i10, 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(j3 + "_disabled", z10);
            if (!z10 && sharedPreferences.getString(String.valueOf(j3), null) == null) {
                edit.putString(String.valueOf(j3), "");
            }
            edit.apply();
            g51 g51Var = qVar.f18934a;
            if (g51Var != null && (b51Var = g51Var.f35323g3) != null) {
                b51Var.O(true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(gd.N0(2131746669, null));
        this.actionBar.setActionBarMenuOnItemClick(new bi.w1(this, 15));
        FrameLayout frameLayout = new FrameLayout(context);
        u6.h(n6.f29394a7, frameLayout, this.resourceProvider);
        g51 g51Var = new g51(this, new y7(this, 17), new kg.f1(this, 5), new z9(this, 15));
        this.f18934a = g51Var;
        frameLayout.addView(g51Var, na.e(-1, -1, 119));
        p.d(getParentActivity(), this.currentAccount, new c7(this, 13));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
