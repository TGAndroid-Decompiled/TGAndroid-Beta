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
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.l5;
import w7.z5;
public final class t extends org.telegram.ui.ActionBar.n2 {
    public b71 f11453a;
    public final ArrayList f11454b;
    public final HashMap f11455c;

    public t() {
        super(null);
        this.f11454b = new ArrayList();
        this.f11455c = new HashMap();
    }

    public static void U(t tVar, ArrayList arrayList) {
        HashMap hashMap = tVar.f11455c;
        ArrayList arrayList2 = tVar.f11454b;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            q qVar = (q) arrayList2.get(i10);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(qVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                l5 l5Var = new l5(null, 24.0f, tVar.currentAccount);
                l5Var.e(qVar.f11388a);
                spannableStringBuilder.setSpan(l5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) UserObject.getUserName(qVar.f11388a));
                hashMap.put(qVar, spannableStringBuilder);
            }
            g61 i11 = g61.i(i10, spannableStringBuilder);
            i11.K(!qVar.f11389b);
            arrayList.add(i11);
        }
        i2.e.B(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void V(t tVar, g61 g61Var) {
        int i10;
        t61 t61Var;
        ArrayList arrayList = tVar.f11454b;
        if (g61Var.f44286a == 4 && (i10 = g61Var.d) >= 0 && i10 < arrayList.size()) {
            q qVar = (q) arrayList.get(g61Var.d);
            qVar.f11389b = !qVar.f11389b;
            Activity parentActivity = tVar.getParentActivity();
            int i11 = tVar.currentAccount;
            long j10 = qVar.f11388a.f20422id;
            boolean z10 = qVar.f11389b;
            WeakHashMap weakHashMap = r.f11410k;
            SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i11, 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(j10 + "_disabled", z10);
            if (!z10 && sharedPreferences.getString(String.valueOf(j10), null) == null) {
                edit.putString(String.valueOf(j10), "");
            }
            edit.apply();
            b71 b71Var = tVar.f11453a;
            if (b71Var != null && (t61Var = b71Var.W2) != null) {
                t61Var.N(true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        i2.e.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(h6.w0(h6.f20931a7, this.resourceProvider));
        b71 b71Var = new b71(this, new ai.q(this, 24), new s(this), new s(this));
        this.f11453a = b71Var;
        frameLayout.addView(b71Var, z5.e(-1, -1, 119));
        r.d(getParentActivity(), this.currentAccount, new ai.r0(this, 24));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
