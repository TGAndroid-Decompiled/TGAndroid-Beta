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
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.g5;
import w7.y5;
public final class u extends org.telegram.ui.ActionBar.n2 {
    public s61 f8637a;
    public final ArrayList f8638b;
    public final HashMap f8639c;

    public u() {
        super(null);
        this.f8638b = new ArrayList();
        this.f8639c = new HashMap();
    }

    public static void U(u uVar, ArrayList arrayList) {
        HashMap hashMap = uVar.f8639c;
        ArrayList arrayList2 = uVar.f8638b;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            q qVar = (q) arrayList2.get(i10);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(qVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                g5 g5Var = new g5(null, 24.0f, uVar.currentAccount);
                g5Var.e(qVar.f8558a);
                spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) UserObject.getUserName(qVar.f8558a));
                hashMap.put(qVar, spannableStringBuilder);
            }
            w51 i11 = w51.i(i10, spannableStringBuilder);
            i11.K(!qVar.f8559b);
            arrayList.add(i11);
        }
        com.google.android.gms.internal.vision.e2.w(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void V(u uVar, w51 w51Var) {
        int i10;
        k61 k61Var;
        ArrayList arrayList = uVar.f8638b;
        if (w51Var.f15704a == 4 && (i10 = w51Var.d) >= 0 && i10 < arrayList.size()) {
            q qVar = (q) arrayList.get(w51Var.d);
            qVar.f8559b = !qVar.f8559b;
            Activity parentActivity = uVar.getParentActivity();
            int i11 = uVar.currentAccount;
            long j3 = qVar.f8558a.f18475id;
            boolean z10 = qVar.f8559b;
            WeakHashMap weakHashMap = r.f8576k;
            SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i11, 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(j3 + "_disabled", z10);
            if (!z10 && sharedPreferences.getString(String.valueOf(j3), null) == null) {
                edit.putString(String.valueOf(j3), "");
            }
            edit.apply();
            s61 s61Var = uVar.f8637a;
            if (s61Var != null && (k61Var = s61Var.Y2) != null) {
                k61Var.N(true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        hg.k0.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new t(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.v0(j6.f19038a7, this.resourceProvider));
        s61 s61Var = new s61(this, new bi.v(this, 13), new s(this), new s(this));
        this.f8637a = s61Var;
        frameLayout.addView(s61Var, y5.e(-1, -1, 119));
        r.d(getParentActivity(), this.currentAccount, new ai.y1(this, 15));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
