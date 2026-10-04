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
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.h5;
import w7.z5;
public final class v extends org.telegram.ui.ActionBar.n2 {
    public c71 f9380a;
    public final ArrayList f9381b;
    public final HashMap f9382c;

    public v() {
        super(null);
        this.f9381b = new ArrayList();
        this.f9382c = new HashMap();
    }

    public static void S(v vVar, ArrayList arrayList) {
        HashMap hashMap = vVar.f9382c;
        ArrayList arrayList2 = vVar.f9381b;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            r rVar = (r) arrayList2.get(i10);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(rVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                h5 h5Var = new h5(null, 24.0f, vVar.currentAccount);
                h5Var.e(rVar.f9294a);
                spannableStringBuilder.setSpan(h5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) UserObject.getUserName(rVar.f9294a));
                hashMap.put(rVar, spannableStringBuilder);
            }
            g61 i11 = g61.i(i10, spannableStringBuilder);
            i11.K(!rVar.f9295b);
            arrayList.add(i11);
        }
        hg.c.n(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void T(v vVar, g61 g61Var) {
        int i10;
        u61 u61Var;
        ArrayList arrayList = vVar.f9381b;
        if (g61Var.f17187a == 4 && (i10 = g61Var.d) >= 0 && i10 < arrayList.size()) {
            r rVar = (r) arrayList.get(g61Var.d);
            rVar.f9295b = !rVar.f9295b;
            Activity parentActivity = vVar.getParentActivity();
            int i11 = vVar.currentAccount;
            long j3 = rVar.f9294a.f20189id;
            boolean z10 = rVar.f9295b;
            WeakHashMap weakHashMap = s.f9313k;
            SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i11, 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(j3 + "_disabled", z10);
            if (!z10 && sharedPreferences.getString(String.valueOf(j3), null) == null) {
                edit.putString(String.valueOf(j3), "");
            }
            edit.apply();
            c71 c71Var = vVar.f9380a;
            if (c71Var != null && (u61Var = c71Var.f25250f3) != null) {
                u61Var.N(true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        hg.c.u(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new u(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i6.v0(i6.f20766a7, this.resourceProvider));
        c71 c71Var = new c71(this, new bi.v(this, 13), new t(this), new t(this));
        this.f9380a = c71Var;
        frameLayout.addView(c71Var, z5.e(-1, -1, 119));
        s.d(getParentActivity(), this.currentAccount, new ai.y1(this, 18));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
