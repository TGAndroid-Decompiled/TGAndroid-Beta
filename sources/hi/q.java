package hi;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import di.r4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.id;
import org.telegram.messenger.t10;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.r41;
import org.telegram.ui.Components.x31;
import org.telegram.ui.f5;
public final class q extends org.telegram.ui.ActionBar.f2 {
    public r41 f14876a;
    public final ArrayList f14877b;
    public final HashMap f14878c;

    public q() {
        super(null);
        this.f14877b = new ArrayList();
        this.f14878c = new HashMap();
    }

    public static void Z(q qVar, ArrayList arrayList) {
        HashMap hashMap = qVar.f14878c;
        ArrayList arrayList2 = qVar.f14877b;
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            o oVar = (o) arrayList2.get(i7);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(oVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                f5 f5Var = new f5(24.0f, qVar.currentAccount, null);
                f5Var.e(oVar.f14836a);
                spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) t10.p(oVar.f14836a));
                hashMap.put(oVar, spannableStringBuilder);
            }
            x31 i10 = x31.i(i7, spannableStringBuilder);
            i10.L(!oVar.f14837b);
            arrayList.add(i10);
        }
        arrayList.add(x31.C(id.M0(2131746861, null)));
    }

    public static void a0(q qVar, x31 x31Var) {
        int i7;
        m41 m41Var;
        ArrayList arrayList = qVar.f14877b;
        if (x31Var.f54543a == 4 && (i7 = x31Var.d) >= 0 && i7 < arrayList.size()) {
            o oVar = (o) arrayList.get(x31Var.d);
            oVar.f14837b = !oVar.f14837b;
            Activity parentActivity = qVar.getParentActivity();
            int i10 = qVar.currentAccount;
            long j3 = oVar.f14836a.f27109id;
            boolean z9 = oVar.f14837b;
            WeakHashMap weakHashMap = p.f14848k;
            SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i10, 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(j3 + "_disabled", z9);
            if (!z9 && sharedPreferences.getString(String.valueOf(j3), null) == null) {
                edit.putString(String.valueOf(j3), "");
            }
            edit.apply();
            r41 r41Var = qVar.f14876a;
            if (r41Var != null && (m41Var = r41Var.f37496f3) != null) {
                m41Var.O(true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.y1(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(id.M0(2131746863, null));
        this.actionBar.setActionBarMenuOnItemClick(new bi.s(this, 3));
        FrameLayout frameLayout = new FrameLayout(context);
        t6.h(m6.f27834a7, frameLayout, this.resourceProvider);
        r41 r41Var = new r41(this, new ai.e(this, 27), new r4(this, 21), new g2.c(this, 24));
        this.f14876a = r41Var;
        frameLayout.addView(r41Var, ha.e(-1, -1, 119));
        p.d(getParentActivity(), this.currentAccount, new ai.i(this, 29));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
