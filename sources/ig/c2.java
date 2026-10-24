package ig;

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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.u9;
import w7.z5;
public final class c2 extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public i71 f12885a;
    public LinearLayout f12886b;
    public ai.o2 f12887c;
    public boolean d;
    public String e;
    public String f12888f;
    public boolean h;
    public String f12889n;

    public static void U(c2 c2Var, l61 l61Var, View view) {
        if (l61Var.d == -1) {
            boolean z10 = c2Var.h;
            c2Var.h = !z10;
            if (!z10) {
                String str = c2Var.f12888f;
                c2Var.f12889n = str;
                ai.o2 o2Var = c2Var.f12887c;
                if (o2Var != null) {
                    o2Var.run(str);
                }
            }
            ((w8) view).setChecked(c2Var.h);
            c2Var.f12885a.Z2.N(true);
        } else if (view.isEnabled()) {
            e2 b10 = e2.b(c2Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = l61Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 < arrayList.size()) {
                    b10.g();
                    c2Var.h = false;
                    String str2 = ((TLRPC.TL_timezone) arrayList.get(l61Var.d)).f20482id;
                    c2Var.f12889n = str2;
                    ai.o2 o2Var2 = c2Var.f12887c;
                    if (o2Var2 != null) {
                        o2Var2.run(str2);
                    }
                    if (c2Var.d) {
                        c2Var.actionBar.g(true);
                    }
                    c2Var.f12885a.Z2.N(true);
                }
            }
        }
    }

    public static void V(c2 c2Var, ArrayList arrayList, a71 a71Var) {
        boolean z10;
        boolean z11;
        if (c2Var.d && !TextUtils.isEmpty(c2Var.e)) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2 b10 = e2.b(c2Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z10) {
            a71Var.U();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            l61 l61Var = new l61(9);
            l61Var.d = -1;
            l61Var.f28227l = string;
            l61Var.K(c2Var.h);
            arrayList.add(l61Var);
            a71Var.T();
            arrayList.add(l61.B(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, b10.d(c2Var.f12889n, true))));
        }
        a71Var.U();
        if (!z10) {
            i2.o1.q(R.string.TimezoneHeader, arrayList);
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
            CharSequence e = e2.e(tL_timezone, false);
            if (z10) {
                String replace = AndroidUtilities.translitSafe(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = AndroidUtilities.translitSafe(c2Var.e).toLowerCase();
                if (org.telegram.messenger.v0.w(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e = AndroidUtilities.highlightText(e, c2Var.e, c2Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f7 = e2.f(tL_timezone);
            l61 l61Var2 = new l61(10);
            l61Var2.d = i10;
            l61Var2.f28227l = e;
            l61Var2.f28229n = f7;
            l61Var2.K(TextUtils.equals(tL_timezone.f20482id, c2Var.f12889n));
            if (c2Var.h && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            l61Var2.f28223g = z11;
            arrayList.add(l61Var2);
            z12 = false;
            i10++;
        }
        a71Var.T();
        if (z12) {
            arrayList.add(l61.l(c2Var.f12886b));
        } else {
            arrayList.add(l61.B(null));
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.TimezoneTitle));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 18));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.m().a(1, R.drawable.outline_header_search);
        a2.F();
        a2.H = new b2(this, 0);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        r6.i(k6.f21126a7, frameLayout, null);
        i71 i71Var = new i71(this, new hg.o(this, 10), new e1.c(this, 23), null);
        this.f12885a = i71Var;
        i71Var.t1();
        this.actionBar.setAdaptiveBackground(this.f12885a);
        frameLayout.addView(this.f12885a, z5.c(-1.0f, -1));
        this.f12885a.setOnScrollListener(new ah.d0(this, 15));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f12886b = linearLayout;
        linearLayout.setOrientation(1);
        this.f12886b.setMinimumHeight(AndroidUtilities.dp(500.0f));
        u9 u9Var = new u9(context);
        u9Var.getImageReceiver().setAllowLoadingOnAttachedOnly(false);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(u9Var, "RestrictedEmoji", "🌖", "130_130");
        this.f12886b.addView(u9Var, z5.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.TimezoneNotFound));
        r6.W(textView, k6.f21572y6, this.resourceProvider);
        textView.setTextSize(1, 15.0f);
        this.f12886b.addView(textView, z5.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        i71 i71Var;
        a71 a71Var;
        if (i10 == NotificationCenter.timezonesUpdated && (i71Var = this.f12885a) != null && (a71Var = i71Var.Z2) != null) {
            a71Var.N(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        String c10 = e2.b(this.currentAccount).c();
        this.f12888f = c10;
        this.h = TextUtils.equals(c10, this.f12889n);
        getNotificationCenter().addObserver(this, NotificationCenter.timezonesUpdated);
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.timezonesUpdated);
        super.onFragmentDestroy();
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f12885a.setPadding(0, 0, 0, i13);
        this.f12885a.setClipToPadding(false);
    }
}
