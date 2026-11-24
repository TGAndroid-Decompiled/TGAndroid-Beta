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
import org.telegram.ui.ActionBar.d;
public final class vo0 extends d {
    public q5c a;
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
                    ec0 ec0Var = new ec0(24.0f, this.currentAccount, null);
                    ec0Var.e(to0Var.a);
                    spannableStringBuilder.setSpan(ec0Var, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) l7c.r(to0Var.a));
                    hashMap.put(to0Var, spannableStringBuilder);
                }
                c4c i2 = c4c.i(i, spannableStringBuilder);
                i2.L(!to0Var.b);
                arrayList.add(i2);
                i++;
            } else {
                arrayList.add(c4c.C(k96.M0(2131746670, null)));
                return;
            }
        }
    }

    public final void Z(c4c c4cVar) {
        int i;
        l5c l5cVar;
        if (c4cVar.a == 4 && (i = c4cVar.d) >= 0) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                to0 to0Var = (to0) arrayList.get(c4cVar.d);
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
                q5c q5cVar = this.a;
                if (q5cVar != null && (l5cVar = q5cVar.g3) != null) {
                    l5cVar.O(true);
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonDrawable(new ed0(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(k96.M0(2131746672, null));
        this.actionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 8));
        FrameLayout frameLayout = new FrameLayout(context);
        zkb.h(bkb.Z6, this.resourceProvider, frameLayout);
        q5c q5cVar = new q5c(this, new f(this, (byte) 15), new sg0(this, (byte) 8), new qm0(this, (byte) 2));
        this.a = q5cVar;
        frameLayout.addView(q5cVar, nme.e(-1, -1, 119));
        uo0.c(getParentActivity(), this.currentAccount, new be2(this, (byte) 7));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
