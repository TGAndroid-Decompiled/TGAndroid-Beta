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
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.i5;
import w7.y5;
public final class u extends org.telegram.ui.ActionBar.o2 {
    public t61 f8622a;
    public final ArrayList f8623b;
    public final HashMap f8624c;

    public u() {
        super(null);
        this.f8623b = new ArrayList();
        this.f8624c = new HashMap();
    }

    public static void U(u uVar, ArrayList arrayList) {
        HashMap hashMap = uVar.f8624c;
        ArrayList arrayList2 = uVar.f8623b;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            q qVar = (q) arrayList2.get(i10);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(qVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                i5 i5Var = new i5(null, 24.0f, uVar.currentAccount);
                i5Var.e(qVar.f8543a);
                spannableStringBuilder.setSpan(i5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) UserObject.getUserName(qVar.f8543a));
                hashMap.put(qVar, spannableStringBuilder);
            }
            x51 i11 = x51.i(i10, spannableStringBuilder);
            i11.K(!qVar.f8544b);
            arrayList.add(i11);
        }
        com.google.android.gms.internal.vision.e2.w(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void V(u uVar, x51 x51Var) {
        int i10;
        l61 l61Var;
        ArrayList arrayList = uVar.f8623b;
        if (x51Var.f15754a == 4 && (i10 = x51Var.d) >= 0 && i10 < arrayList.size()) {
            q qVar = (q) arrayList.get(x51Var.d);
            qVar.f8544b = !qVar.f8544b;
            Activity parentActivity = uVar.getParentActivity();
            int i11 = uVar.currentAccount;
            long j3 = qVar.f8543a.f18476id;
            boolean z10 = qVar.f8544b;
            WeakHashMap weakHashMap = r.f8561k;
            SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i11, 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(j3 + "_disabled", z10);
            if (!z10 && sharedPreferences.getString(String.valueOf(j3), null) == null) {
                edit.putString(String.valueOf(j3), "");
            }
            edit.apply();
            t61 t61Var = uVar.f8622a;
            if (t61Var != null && (l61Var = t61Var.Y2) != null) {
                l61Var.N(true);
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
        frameLayout.setBackgroundColor(i6.v0(i6.f19001a7, this.resourceProvider));
        t61 t61Var = new t61(this, new bi.v(this, 13), new s(this), new s(this));
        this.f8622a = t61Var;
        frameLayout.addView(t61Var, y5.e(-1, -1, 119));
        r.d(getParentActivity(), this.currentAccount, new ai.y1(this, 18));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
