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
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.l5;
import w7.z5;
public final class t extends org.telegram.ui.ActionBar.n2 {
    public c71 f11451a;
    public final ArrayList f11452b;
    public final HashMap f11453c;

    public t() {
        super(null);
        this.f11452b = new ArrayList();
        this.f11453c = new HashMap();
    }

    public static void U(t tVar, ArrayList arrayList) {
        HashMap hashMap = tVar.f11453c;
        ArrayList arrayList2 = tVar.f11452b;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            q qVar = (q) arrayList2.get(i10);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(qVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                l5 l5Var = new l5(null, 24.0f, tVar.currentAccount);
                l5Var.e(qVar.f11386a);
                spannableStringBuilder.setSpan(l5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) UserObject.getUserName(qVar.f11386a));
                hashMap.put(qVar, spannableStringBuilder);
            }
            h61 i11 = h61.i(i10, spannableStringBuilder);
            i11.K(!qVar.f11387b);
            arrayList.add(i11);
        }
        i2.e.B(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void V(t tVar, h61 h61Var) {
        int i10;
        u61 u61Var;
        ArrayList arrayList = tVar.f11452b;
        if (h61Var.f44299a == 4 && (i10 = h61Var.d) >= 0 && i10 < arrayList.size()) {
            q qVar = (q) arrayList.get(h61Var.d);
            qVar.f11387b = !qVar.f11387b;
            Activity parentActivity = tVar.getParentActivity();
            int i11 = tVar.currentAccount;
            long j10 = qVar.f11386a.f20426id;
            boolean z10 = qVar.f11387b;
            WeakHashMap weakHashMap = r.f11408k;
            SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i11, 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(j10 + "_disabled", z10);
            if (!z10 && sharedPreferences.getString(String.valueOf(j10), null) == null) {
                edit.putString(String.valueOf(j10), "");
            }
            edit.apply();
            c71 c71Var = tVar.f11451a;
            if (c71Var != null && (u61Var = c71Var.W2) != null) {
                u61Var.N(true);
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
        frameLayout.setBackgroundColor(h6.w0(h6.f20935a7, this.resourceProvider));
        c71 c71Var = new c71(this, new ai.q(this, 24), new s(this), new s(this));
        this.f11451a = c71Var;
        frameLayout.addView(c71Var, z5.e(-1, -1, 119));
        r.d(getParentActivity(), this.currentAccount, new ai.r0(this, 24));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
