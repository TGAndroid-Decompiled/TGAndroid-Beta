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
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.g5;
import w7.x5;
public final class u extends org.telegram.ui.ActionBar.n2 {
    public k71 f9383a;
    public final ArrayList f9384b;
    public final HashMap f9385c;

    public u() {
        super(null);
        this.f9384b = new ArrayList();
        this.f9385c = new HashMap();
    }

    public static void U(u uVar, ArrayList arrayList) {
        HashMap hashMap = uVar.f9385c;
        ArrayList arrayList2 = uVar.f9384b;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            q qVar = (q) arrayList2.get(i10);
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(qVar);
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "a   ");
                g5 g5Var = new g5(null, 24.0f, uVar.currentAccount);
                g5Var.e(qVar.f9298a);
                spannableStringBuilder.setSpan(g5Var, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) UserObject.getUserName(qVar.f9298a));
                hashMap.put(qVar, spannableStringBuilder);
            }
            p61 i11 = p61.i(i10, spannableStringBuilder);
            i11.K(!qVar.f9299b);
            arrayList.add(i11);
        }
        hg.c.n(R.string.PrivacyBiometryBotsInfo, arrayList);
    }

    public static void V(u uVar, p61 p61Var) {
        int i10;
        c71 c71Var;
        ArrayList arrayList = uVar.f9384b;
        if (p61Var.f17125a == 4 && (i10 = p61Var.d) >= 0 && i10 < arrayList.size()) {
            q qVar = (q) arrayList.get(p61Var.d);
            qVar.f9299b = !qVar.f9299b;
            Activity parentActivity = uVar.getParentActivity();
            int i11 = uVar.currentAccount;
            long j3 = qVar.f9298a.f20185id;
            boolean z10 = qVar.f9299b;
            WeakHashMap weakHashMap = r.f9314k;
            SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i11, 0);
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putBoolean(j3 + "_disabled", z10);
            if (!z10 && sharedPreferences.getString(String.valueOf(j3), null) == null) {
                edit.putString(String.valueOf(j3), "");
            }
            edit.apply();
            k71 k71Var = uVar.f9383a;
            if (k71Var != null && (c71Var = k71Var.W2) != null) {
                c71Var.N(true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        hg.c.v(false, this.actionBar);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.PrivacyBiometryBots));
        this.actionBar.setActionBarMenuOnItemClick(new t(this, 0));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i6.w0(i6.f20741a7, this.resourceProvider));
        k71 k71Var = new k71(this, new bi.v(this, 13), new s(this), new s(this));
        this.f9383a = k71Var;
        frameLayout.addView(k71Var, x5.e(-1, -1, 119));
        r.d(getParentActivity(), this.currentAccount, new ai.y1(this, 18));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
