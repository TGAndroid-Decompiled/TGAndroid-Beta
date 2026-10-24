package gi;

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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.k5;
import w7.z5;
public final class t extends org.telegram.ui.ActionBar.o2 {
    public i71 f11477a;
    public final ArrayList f11478b;
    public final HashMap f11479c;

    public t() {
        super(null);
        this.f11478b = new ArrayList();
        this.f11479c = new HashMap();
    }

    public static void U(t tVar, ArrayList arrayList) {
        HashMap hashMap = tVar.f11479c;
        ArrayList arrayList2 = tVar.f11478b;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            q qVar = (q) arrayList2.get(i10);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(qVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                k5 k5Var = new k5(null, 24.0f, tVar.currentAccount);
                k5Var.e(qVar.f11412a);
                spannableStringBuilder.setSpan(k5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) UserObject.getUserName(qVar.f11412a));
                hashMap.put(qVar, spannableStringBuilder);
            }
            l61 i11 = l61.i(i10, spannableStringBuilder);
            i11.K(!qVar.f11413b);
            arrayList.add(i11);
        }
        i2.o1.B(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void V(t tVar, l61 l61Var) {
        int i10;
        a71 a71Var;
        ArrayList arrayList = tVar.f11478b;
        if (l61Var.f44712a == 4 && (i10 = l61Var.d) >= 0 && i10 < arrayList.size()) {
            q qVar = (q) arrayList.get(l61Var.d);
            qVar.f11413b = !qVar.f11413b;
            Activity parentActivity = tVar.getParentActivity();
            int i11 = tVar.currentAccount;
            long j10 = qVar.f11412a.f20491id;
            boolean z10 = qVar.f11413b;
            WeakHashMap weakHashMap = r.f11434k;
            SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i11, 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(j10 + "_disabled", z10);
            if (!z10 && sharedPreferences.getString(String.valueOf(j10), null) == null) {
                edit.putString(String.valueOf(j10), "");
            }
            edit.apply();
            i71 i71Var = tVar.f11477a;
            if (i71Var != null && (a71Var = i71Var.Z2) != null) {
                a71Var.N(true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        i2.o1.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        r6.i(k6.f21126a7, frameLayout, this.resourceProvider);
        i71 i71Var = new i71(this, new ai.q(this, 24), new s(this), new s(this));
        this.f11477a = i71Var;
        frameLayout.addView(i71Var, z5.e(-1, -1, 119));
        r.d(getParentActivity(), this.currentAccount, new ai.r0(this, 24));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
