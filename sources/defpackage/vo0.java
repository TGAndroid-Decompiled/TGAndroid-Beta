package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.ui.ActionBar.e;
public final class vo0 extends e {
    public q9c a;
    public final ArrayList b;
    public final HashMap c;

    public vo0() {
        super(null);
        this.b = new ArrayList();
        this.c = new HashMap();
    }

    public final void Y(ArrayList arrayList) {
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.b;
            if (i < arrayList2.size()) {
                to0 to0Var = (to0) arrayList2.get(i);
                HashMap hashMap = this.c;
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(to0Var);
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) "a   ");
                    gc0 gc0Var = new gc0(24.0f, this.currentAccount, null);
                    gc0Var.e(to0Var.a);
                    spannableStringBuilder.setSpan(gc0Var, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) lbc.r(to0Var.a));
                    hashMap.put(to0Var, spannableStringBuilder);
                }
                b8c i2 = b8c.i(i, spannableStringBuilder);
                i2.L(!to0Var.b);
                arrayList.add(i2);
                i++;
            } else {
                arrayList.add(b8c.C(ob6.M0(2131746590, null)));
                return;
            }
        }
    }

    public final void Z(b8c b8cVar) {
        int i;
        l9c l9cVar;
        if (b8cVar.a == 4 && (i = b8cVar.d) >= 0) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                to0 to0Var = (to0) arrayList.get(b8cVar.d);
                to0Var.b = !to0Var.b;
                Activity parentActivity = getParentActivity();
                int i2 = this.currentAccount;
                long j = to0Var.a.id;
                boolean z = to0Var.b;
                WeakHashMap weakHashMap = uo0.k;
                SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i2, 0);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putBoolean(j + "_disabled", z);
                if (!z && sharedPreferences.getString(String.valueOf(j), null) == null) {
                    edit.putString(String.valueOf(j), "");
                }
                edit.apply();
                q9c q9cVar = this.a;
                if (q9cVar != null && (l9cVar = q9cVar.g3) != null) {
                    l9cVar.O(true);
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonDrawable(new gd0(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(ob6.M0(2131746592, null));
        this.actionBar.setActionBarMenuOnItemClick(new s8(this, (byte) 8));
        FrameLayout frameLayout = new FrameLayout(context);
        yob.h(aob.a7, this.resourceProvider, frameLayout);
        q9c q9cVar = new q9c(this, new c(this, (byte) 15), new tg0(this, (byte) 8), new rm0(this, (byte) 3));
        this.a = q9cVar;
        frameLayout.addView(q9cVar, tre.e(-1, -1, 119));
        uo0.c(getParentActivity(), this.currentAccount, new te2(this, (byte) 7));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
