package jg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.y5;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.y9;
public final class f2 extends r2 implements NotificationCenter.NotificationCenterDelegate {
    public s71 f15703a;
    public LinearLayout f15704b;
    public ai.n1 f15705c;
    public boolean d;
    public String e;
    public String f15706f;
    public boolean h;
    public String f15707n;

    public static void V(f2 f2Var, u61 u61Var, View view) {
        if (u61Var.d == -1) {
            boolean z10 = f2Var.h;
            f2Var.h = !z10;
            if (!z10) {
                String str = f2Var.f15706f;
                f2Var.f15707n = str;
                ai.n1 n1Var = f2Var.f15705c;
                if (n1Var != null) {
                    n1Var.run(str);
                }
            }
            ((a9) view).setChecked(f2Var.h);
            f2Var.f15703a.f32504g3.O(true);
        } else if (view.isEnabled()) {
            g2 b10 = g2.b(f2Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = u61Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 < arrayList.size()) {
                    b10.g();
                    f2Var.h = false;
                    String str2 = ((TLRPC.TL_timezone) arrayList.get(u61Var.d)).f22168id;
                    f2Var.f15707n = str2;
                    ai.n1 n1Var2 = f2Var.f15705c;
                    if (n1Var2 != null) {
                        n1Var2.run(str2);
                    }
                    if (f2Var.d) {
                        f2Var.simpleActionBar.f(true);
                    }
                    f2Var.f15703a.f32504g3.O(true);
                }
            }
        }
    }

    public static void W(f2 f2Var, ArrayList arrayList, k71 k71Var) {
        boolean z10;
        boolean z11;
        if (f2Var.d && !TextUtils.isEmpty(f2Var.e)) {
            z10 = true;
        } else {
            z10 = false;
        }
        g2 b10 = g2.b(f2Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z10) {
            k71Var.V();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            u61 u61Var = new u61(9);
            u61Var.d = -1;
            u61Var.f33249l = string;
            u61Var.L(f2Var.h);
            arrayList.add(u61Var);
            k71Var.U();
            arrayList.add(u61.C(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, b10.d(f2Var.f15707n, true))));
        }
        k71Var.V();
        if (!z10) {
            ic.a.p(R.string.TimezoneHeader, arrayList);
        }
        boolean z12 = true;
        int i10 = 0;
        while (true) {
            b10.g();
            if (i10 >= arrayList2.size()) {
                break;
            }
            b10.g();
            TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList2.get(i10);
            CharSequence e = g2.e(tL_timezone, false);
            if (z10) {
                String replace = AndroidUtilities.translitSafe(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = AndroidUtilities.translitSafe(f2Var.e).toLowerCase();
                if (wh.u(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e = AndroidUtilities.highlightText(e, f2Var.e, f2Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f7 = g2.f(tL_timezone);
            u61 u61Var2 = new u61(10);
            u61Var2.d = i10;
            u61Var2.f33249l = e;
            u61Var2.f33251n = f7;
            u61Var2.L(TextUtils.equals(tL_timezone.f22168id, f2Var.f15707n));
            if (f2Var.h && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            u61Var2.f33245g = z11;
            arrayList.add(u61Var2);
            z12 = false;
            i10++;
        }
        k71Var.U();
        if (z12) {
            arrayList.add(u61.m(f2Var.f15704b));
        } else {
            arrayList.add(u61.C(null));
        }
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.simpleActionBar.setTitle(LocaleController.getString(R.string.TimezoneTitle));
        this.simpleActionBar.setActionBarMenuOnItemClick(new bh.m(this, 18));
        y5 a2 = this.simpleActionBar.j().a(1, R.drawable.outline_header_search);
        a2.N();
        a2.f23292z0 = new e2(this, 0);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        s71 s71Var = new s71(this, new hi.e2(this, 13), new e1(this, 3), null);
        this.f15703a = s71Var;
        s71Var.u1();
        this.f15703a.setSectionsDrawBackground(true);
        frameLayout.addView(this.f15703a, kb1.g(-1.0f, -1));
        this.f15703a.setOnScrollListener(new ai.b(this, 19));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f15704b = linearLayout;
        linearLayout.setOrientation(1);
        this.f15704b.setMinimumHeight(AndroidUtilities.dp(500.0f));
        y9 y9Var = new y9(context);
        y9Var.getImageReceiver().setAllowLoadingOnAttachedOnly(false);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(y9Var, "RestrictedEmoji", "🌖", "130_130");
        this.f15704b.addView(y9Var, kb1.x(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.TimezoneNotFound));
        f7.V(textView, y6.f23749y6, this.resourceProvider);
        textView.setTextSize(1, 15.0f);
        this.f15704b.addView(textView, kb1.x(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        s71 s71Var;
        k71 k71Var;
        if (i10 == NotificationCenter.timezonesUpdated && (s71Var = this.f15703a) != null && (k71Var = s71Var.f32504g3) != null) {
            k71Var.O(true);
        }
    }

    @Override
    public final nm0 getListViewForSimpleGlass() {
        return this.f15703a;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        String c10 = g2.b(this.currentAccount).c();
        this.f15706f = c10;
        this.h = TextUtils.equals(c10, this.f15707n);
        getNotificationCenter().addWeakObserver(this, NotificationCenter.timezonesUpdated);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.timezonesUpdated);
        super.onFragmentDestroy();
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
