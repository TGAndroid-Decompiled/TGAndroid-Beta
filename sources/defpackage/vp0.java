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
public final class vp0 extends d {
    public q7c a;
    public final ArrayList b;
    public final HashMap c;

    public vp0() {
        super(null);
        this.b = new ArrayList();
        this.c = new HashMap();
    }

    public final void Z(ArrayList arrayList) {
        int i = 0;
        while (true) {
            ArrayList arrayList2 = this.b;
            if (i < arrayList2.size()) {
                tp0 tp0Var = (tp0) arrayList2.get(i);
                HashMap hashMap = this.c;
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) hashMap.get(tp0Var);
                if (spannableStringBuilder == null) {
                    spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) "a   ");
                    ed0 ed0Var = new ed0(24.0f, this.currentAccount, null);
                    ed0Var.e(tp0Var.a);
                    spannableStringBuilder.setSpan(ed0Var, 0, 1, 33);
                    spannableStringBuilder.append((CharSequence) m9c.r(tp0Var.a));
                    hashMap.put(tp0Var, spannableStringBuilder);
                }
                c6c i2 = c6c.i(i, spannableStringBuilder);
                i2.L(!tp0Var.b);
                arrayList.add(i2);
                i++;
            } else {
                arrayList.add(c6c.C(jb6.M0(2131746596, null)));
                return;
            }
        }
    }

    public final void a0(c6c c6cVar) {
        int i;
        l7c l7cVar;
        if (c6cVar.a == 4 && (i = c6cVar.d) >= 0) {
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                tp0 tp0Var = (tp0) arrayList.get(c6cVar.d);
                tp0Var.b = !tp0Var.b;
                Activity parentActivity = getParentActivity();
                int i2 = this.currentAccount;
                long j = tp0Var.a.id;
                boolean z = tp0Var.b;
                WeakHashMap weakHashMap = up0.k;
                SharedPreferences sharedPreferences = parentActivity.getSharedPreferences("2botbiometry_" + i2, 0);
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putBoolean(j + "_disabled", z);
                if (!z && sharedPreferences.getString(String.valueOf(j), null) == null) {
                    edit.putString(String.valueOf(j), "");
                }
                edit.apply();
                q7c q7cVar = this.a;
                if (q7cVar != null && (l7cVar = q7cVar.g3) != null) {
                    l7cVar.O(true);
                }
            }
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonDrawable(new ee0(false));
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(jb6.M0(2131746598, null));
        this.actionBar.setActionBarMenuOnItemClick(new r8(this, (byte) 8));
        FrameLayout frameLayout = new FrameLayout(context);
        anb.h(cmb.Z6, this.resourceProvider, frameLayout);
        q7c q7cVar = new q7c(this, new f(this, (byte) 15), new xg0(this, (byte) 10), new qn0(this, (byte) 2));
        this.a = q7cVar;
        frameLayout.addView(q7cVar, qoe.e(-1, -1, 119));
        up0.c(getParentActivity(), this.currentAccount, new mf2(this, (byte) 7));
        this.fragmentView = frameLayout;
        return frameLayout;
    }
}
