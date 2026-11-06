package hi;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.hd;
import org.telegram.messenger.t10;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.r31;
import org.telegram.ui.f5;
public final class q extends org.telegram.ui.ActionBar.f2 {
    public k41 f14871a;
    public final ArrayList f14872b;
    public final HashMap f14873c;

    public q() {
        super(null);
        this.f14872b = new ArrayList();
        this.f14873c = new HashMap();
    }

    public static void Z(q qVar, ArrayList arrayList) {
        HashMap hashMap = qVar.f14873c;
        ArrayList arrayList2 = qVar.f14872b;
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            o oVar = (o) arrayList2.get(i7);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(oVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                f5 f5Var = new f5(24.0f, qVar.currentAccount, null);
                f5Var.e(oVar.f14831a);
                spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) t10.p(oVar.f14831a));
                hashMap.put(oVar, spannableStringBuilder);
            }
            r31 i10 = r31.i(i7, spannableStringBuilder);
            i10.L(!oVar.f14832b);
            arrayList.add(i10);
        }
        arrayList.add(r31.C(hd.M0(2131746860, null)));
    }

    public static void a0(q qVar, r31 r31Var) {
        int i7;
        f41 f41Var;
        ArrayList arrayList = qVar.f14872b;
        if (r31Var.f54415a == 4 && (i7 = r31Var.d) >= 0 && i7 < arrayList.size()) {
            o oVar = (o) arrayList.get(r31Var.d);
            oVar.f14832b = !oVar.f14832b;
            Activity parentActivity = qVar.getParentActivity();
            int i10 = qVar.currentAccount;
            long j3 = oVar.f14831a.f27101id;
            boolean z9 = oVar.f14832b;
            WeakHashMap weakHashMap = p.f14843k;
            SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i10, 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(j3 + "_disabled", z9);
            if (!z9 && sharedPreferences.getString(String.valueOf(j3), null) == null) {
                edit.putString(String.valueOf(j3), "");
            }
            edit.apply();
            k41 k41Var = qVar.f14871a;
            if (k41Var != null && (f41Var = k41Var.f35167f3) != null) {
                f41Var.O(true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(hd.M0(2131746862, null));
        this.actionBar.setActionBarMenuOnItemClick(new bi.s(this, 3));
        FrameLayout frameLayout = new FrameLayout(context);
        r6.i(k6.f27792a7, frameLayout, this.resourceProvider);
        k41 k41Var = new k41(this, new ai.e(this, 27), new di.q4(this, 21), new g2.c(this, 24));
        this.f14871a = k41Var;
        frameLayout.addView(k41Var, ha.e(-1, -1, 119));
        p.d(getParentActivity(), this.currentAccount, new ai.i(this, 29));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
