package ei;

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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.h5;
import w7.x5;
public final class u extends org.telegram.ui.ActionBar.n2 {
    public d61 f8620a;
    public final ArrayList f8621b;
    public final HashMap f8622c;

    public u() {
        super(null);
        this.f8621b = new ArrayList();
        this.f8622c = new HashMap();
    }

    public static void U(u uVar, ArrayList arrayList) {
        HashMap hashMap = uVar.f8622c;
        ArrayList arrayList2 = uVar.f8621b;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            q qVar = (q) arrayList2.get(i10);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(qVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                h5 h5Var = new h5(null, 24.0f, uVar.currentAccount);
                h5Var.e(qVar.f8541a);
                spannableStringBuilder.setSpan(h5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) UserObject.getUserName(qVar.f8541a));
                hashMap.put(qVar, spannableStringBuilder);
            }
            h51 i11 = h51.i(i10, spannableStringBuilder);
            i11.K(!qVar.f8542b);
            arrayList.add(i11);
        }
        hg.c.p(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void V(u uVar, h51 h51Var) {
        int i10;
        v51 v51Var;
        ArrayList arrayList = uVar.f8621b;
        if (h51Var.f15508a == 4 && (i10 = h51Var.d) >= 0 && i10 < arrayList.size()) {
            q qVar = (q) arrayList.get(h51Var.d);
            qVar.f8542b = !qVar.f8542b;
            Activity parentActivity = uVar.getParentActivity();
            int i11 = uVar.currentAccount;
            long j3 = qVar.f8541a.f18230id;
            boolean z10 = qVar.f8542b;
            WeakHashMap weakHashMap = r.f8559k;
            SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i11, 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(j3 + "_disabled", z10);
            if (!z10 && sharedPreferences.getString(String.valueOf(j3), null) == null) {
                edit.putString(String.valueOf(j3), "");
            }
            edit.apply();
            d61 d61Var = uVar.f8620a;
            if (d61Var != null && (v51Var = d61Var.Y2) != null) {
                v51Var.N(true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        hg.c.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new t(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(h6.v0(h6.f18733a7, this.resourceProvider));
        d61 d61Var = new d61(this, new bi.v(this, 13), new s(this), new s(this));
        this.f8620a = d61Var;
        frameLayout.addView(d61Var, x5.e(-1, -1, 119));
        r.d(getParentActivity(), this.currentAccount, new ai.y1(this, 18));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
