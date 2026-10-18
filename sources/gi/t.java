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
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.l5;
import w7.z5;
public final class t extends org.telegram.ui.ActionBar.n2 {
    public a71 f11454a;
    public final ArrayList f11455b;
    public final HashMap f11456c;

    public t() {
        super(null);
        this.f11455b = new ArrayList();
        this.f11456c = new HashMap();
    }

    public static void U(t tVar, ArrayList arrayList) {
        HashMap hashMap = tVar.f11456c;
        ArrayList arrayList2 = tVar.f11455b;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            q qVar = (q) arrayList2.get(i10);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(qVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                l5 l5Var = new l5(null, 24.0f, tVar.currentAccount);
                l5Var.e(qVar.f11389a);
                spannableStringBuilder.setSpan(l5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) UserObject.getUserName(qVar.f11389a));
                hashMap.put(qVar, spannableStringBuilder);
            }
            f61 i11 = f61.i(i10, spannableStringBuilder);
            i11.K(!qVar.f11390b);
            arrayList.add(i11);
        }
        i2.d.B(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void V(t tVar, f61 f61Var) {
        int i10;
        s61 s61Var;
        ArrayList arrayList = tVar.f11455b;
        if (f61Var.f44334a == 4 && (i10 = f61Var.d) >= 0 && i10 < arrayList.size()) {
            q qVar = (q) arrayList.get(f61Var.d);
            qVar.f11390b = !qVar.f11390b;
            Activity parentActivity = tVar.getParentActivity();
            int i11 = tVar.currentAccount;
            long j10 = qVar.f11389a.f20426id;
            boolean z10 = qVar.f11390b;
            WeakHashMap weakHashMap = r.f11411k;
            SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i11, 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(j10 + "_disabled", z10);
            if (!z10 && sharedPreferences.getString(String.valueOf(j10), null) == null) {
                edit.putString(String.valueOf(j10), "");
            }
            edit.apply();
            a71 a71Var = tVar.f11454a;
            if (a71Var != null && (s61Var = a71Var.W2) != null) {
                s61Var.N(true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        i2.d.y(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(h6.w0(h6.f20935a7, this.resourceProvider));
        a71 a71Var = new a71(this, new ai.q(this, 24), new s(this), new s(this));
        this.f11454a = a71Var;
        frameLayout.addView(a71Var, z5.e(-1, -1, 119));
        r.d(getParentActivity(), this.currentAccount, new ai.r0(this, 24));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
