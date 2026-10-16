package fi;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.k5;
import w7.z5;
public final class t extends org.telegram.ui.ActionBar.m2 {
    public i71 f9543a;
    public final ArrayList f9544b;
    public final HashMap f9545c;

    public t() {
        super(null);
        this.f9544b = new ArrayList();
        this.f9545c = new HashMap();
    }

    public static void U(t tVar, ArrayList arrayList) {
        HashMap hashMap = tVar.f9545c;
        ArrayList arrayList2 = tVar.f9544b;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            q qVar = (q) arrayList2.get(i10);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(qVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                k5 k5Var = new k5(null, 24.0f, tVar.currentAccount);
                k5Var.e(qVar.f9485a);
                spannableStringBuilder.setSpan(k5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) UserObject.getUserName(qVar.f9485a));
                hashMap.put(qVar, spannableStringBuilder);
            }
            m61 i11 = m61.i(i10, spannableStringBuilder);
            i11.K(!qVar.f9486b);
            arrayList.add(i11);
        }
        i2.d.B(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void V(t tVar, m61 m61Var) {
        int i10;
        a71 a71Var;
        ArrayList arrayList = tVar.f9544b;
        if (m61Var.f42904a == 4 && (i10 = m61Var.d) >= 0 && i10 < arrayList.size()) {
            q qVar = (q) arrayList.get(m61Var.d);
            qVar.f9486b = !qVar.f9486b;
            Activity parentActivity = tVar.getParentActivity();
            int i11 = tVar.currentAccount;
            long j10 = qVar.f9485a.f19063id;
            boolean z10 = qVar.f9486b;
            WeakHashMap weakHashMap = r.f9504k;
            SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i11, 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(j10 + "_disabled", z10);
            if (!z10 && sharedPreferences.getString(String.valueOf(j10), null) == null) {
                edit.putString(String.valueOf(j10), "");
            }
            edit.apply();
            i71 i71Var = tVar.f9543a;
            if (i71Var != null && (a71Var = i71Var.W2) != null) {
                a71Var.N(true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        i2.d.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 1));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.w0(g6.f19543a7, this.resourceProvider));
        i71 i71Var = new i71(this, new ci.u(this, 13), new s(this), new s(this));
        this.f9543a = i71Var;
        frameLayout.addView(i71Var, z5.e(-1, -1, 119));
        r.d(getParentActivity(), this.currentAccount, new bi.o1(this, 18));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
