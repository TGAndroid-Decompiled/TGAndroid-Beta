package ki;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import bi.x4;
import c8.ja;
import hi.g7;
import hi.q4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.hd;
import org.telegram.messenger.q10;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.f5;
public final class s extends org.telegram.ui.ActionBar.e2 {
    public u41 f18534a;
    public final ArrayList f18535b;
    public final HashMap f18536c;

    public s() {
        super(null);
        this.f18535b = new ArrayList();
        this.f18536c = new HashMap();
    }

    public static void Z(s sVar, ArrayList arrayList) {
        HashMap hashMap = sVar.f18536c;
        ArrayList arrayList2 = sVar.f18535b;
        for (int i7 = 0; i7 < arrayList2.size(); i7++) {
            q qVar = (q) arrayList2.get(i7);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(qVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                f5 f5Var = new f5(24.0f, sVar.currentAccount, null);
                f5Var.e(qVar.f18495a);
                spannableStringBuilder.setSpan(f5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) q10.p(qVar.f18495a));
                hashMap.put(qVar, spannableStringBuilder);
            }
            b41 i10 = b41.i(i7, spannableStringBuilder);
            i10.L(!qVar.f18496b);
            arrayList.add(i10);
        }
        arrayList.add(b41.C(hd.M0(2131746861, null)));
    }

    public static void a0(s sVar, b41 b41Var) {
        int i7;
        p41 p41Var;
        ArrayList arrayList = sVar.f18535b;
        if (b41Var.f56015a == 4 && (i7 = b41Var.d) >= 0 && i7 < arrayList.size()) {
            q qVar = (q) arrayList.get(b41Var.d);
            qVar.f18496b = !qVar.f18496b;
            Activity parentActivity = sVar.getParentActivity();
            int i10 = sVar.currentAccount;
            long j3 = qVar.f18495a.f28200id;
            boolean z10 = qVar.f18496b;
            WeakHashMap weakHashMap = r.f18512k;
            SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i10, 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(j3 + "_disabled", z10);
            if (!z10 && sharedPreferences.getString(String.valueOf(j3), null) == null) {
                edit.putString(String.valueOf(j3), "");
            }
            edit.apply();
            u41 u41Var = sVar.f18534a;
            if (u41Var != null && (p41Var = u41Var.f39895g3) != null) {
                p41Var.O(true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.x1(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(hd.M0(2131746863, null));
        this.actionBar.setActionBarMenuOnItemClick(new x4(this, 13));
        FrameLayout frameLayout = new FrameLayout(context);
        q6.h(j6.f28792a7, frameLayout, this.resourceProvider);
        u41 u41Var = new u41(this, new q4(this, 17), new e(this, 1), new i0.b(this, 14));
        this.f18534a = u41Var;
        frameLayout.addView(u41Var, ja.e(-1, -1, 119));
        r.d(getParentActivity(), this.currentAccount, new g7(this, 12));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
