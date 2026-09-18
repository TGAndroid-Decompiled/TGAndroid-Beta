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
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.g5;
import w7.x5;
public final class u extends org.telegram.ui.ActionBar.o2 {
    public f61 f8637a;
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
            j51 i11 = j51.i(i10, spannableStringBuilder);
            i11.K(!qVar.f8559b);
            arrayList.add(i11);
        }
        com.google.android.gms.internal.vision.e2.w(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void V(u uVar, j51 j51Var) {
        int i10;
        x51 x51Var;
        ArrayList arrayList = uVar.f8638b;
        if (j51Var.f15543a == 4 && (i10 = j51Var.d) >= 0 && i10 < arrayList.size()) {
            q qVar = (q) arrayList.get(j51Var.d);
            qVar.f8559b = !qVar.f8559b;
            Activity parentActivity = uVar.getParentActivity();
            int i11 = uVar.currentAccount;
            long j3 = qVar.f8558a.f18268id;
            boolean z10 = qVar.f8559b;
            WeakHashMap weakHashMap = r.f8576k;
            SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i11, 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(j3 + "_disabled", z10);
            if (!z10 && sharedPreferences.getString(String.valueOf(j3), null) == null) {
                edit.putString(String.valueOf(j3), "");
            }
            edit.apply();
            f61 f61Var = uVar.f8637a;
            if (f61Var != null && (x51Var = f61Var.Y2) != null) {
                x51Var.N(true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        hg.k0.x(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new t(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.v0(j6.f18807a7, this.resourceProvider));
        f61 f61Var = new f61(this, new bi.v(this, 13), new s(this), new s(this));
        this.f8637a = f61Var;
        frameLayout.addView(f61Var, x5.e(-1, -1, 119));
        r.d(getParentActivity(), this.currentAccount, new ai.y1(this, 15));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
