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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.g5;
import w7.x5;
public final class u extends org.telegram.ui.ActionBar.n2 {
    public d61 f9985a;
    public final ArrayList f9986b;
    public final HashMap f9987c;

    public u() {
        super(null);
        this.f9986b = new ArrayList();
        this.f9987c = new HashMap();
    }

    public static void U(u uVar, ArrayList arrayList) {
        HashMap hashMap = uVar.f9987c;
        ArrayList arrayList2 = uVar.f9986b;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            r rVar = (r) arrayList2.get(i10);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(rVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                g5 g5Var = new g5(null, 24.0f, uVar.currentAccount);
                g5Var.e(rVar.f9915a);
                spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) UserObject.getUserName(rVar.f9915a));
                hashMap.put(rVar, spannableStringBuilder);
            }
            h51 i11 = h51.i(i10, spannableStringBuilder);
            i11.K(!rVar.f9916b);
            arrayList.add(i11);
        }
        i2.g.A(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void V(u uVar, h51 h51Var) {
        int i10;
        v51 v51Var;
        ArrayList arrayList = uVar.f9986b;
        if (h51Var.f44071a == 4 && (i10 = h51Var.d) >= 0 && i10 < arrayList.size()) {
            r rVar = (r) arrayList.get(h51Var.d);
            rVar.f9916b = !rVar.f9916b;
            Activity parentActivity = uVar.getParentActivity();
            int i11 = uVar.currentAccount;
            long j3 = rVar.f9915a.f20016id;
            boolean z10 = rVar.f9916b;
            WeakHashMap weakHashMap = s.f9936k;
            SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i11, 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(j3 + "_disabled", z10);
            if (!z10 && sharedPreferences.getString(String.valueOf(j3), null) == null) {
                edit.putString(String.valueOf(j3), "");
            }
            edit.apply();
            d61 d61Var = uVar.f9985a;
            if (d61Var != null && (v51Var = d61Var.Y2) != null) {
                v51Var.N(true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        i2.g.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new ah.t(this, 1));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.v0(j6.f20607a7, this.resourceProvider));
        d61 d61Var = new d61(this, new ci.u(this, 13), new t(this), new t(this));
        this.f9985a = d61Var;
        frameLayout.addView(d61Var, x5.e(-1, -1, 119));
        s.d(getParentActivity(), this.currentAccount, new bi.o1(this, 15));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
