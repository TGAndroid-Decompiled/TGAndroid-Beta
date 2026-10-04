package hg;

import ai.g3;
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
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.w9;
import w7.z5;
import yh.t7;
public final class e2 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public c71 f11175a;
    public LinearLayout f11176b;
    public g3 f11177c;
    public boolean d;
    public String f11178e;
    public String f11179f;
    public boolean h;
    public String f11180n;

    public static void S(e2 e2Var, g61 g61Var, View view) {
        if (g61Var.d == -1) {
            boolean z10 = e2Var.h;
            e2Var.h = !z10;
            if (!z10) {
                String str = e2Var.f11179f;
                e2Var.f11180n = str;
                g3 g3Var = e2Var.f11177c;
                if (g3Var != null) {
                    g3Var.run(str);
                }
            }
            ((w8) view).setChecked(e2Var.h);
            e2Var.f11175a.f25245f3.N(true);
        } else if (view.isEnabled()) {
            f2 b10 = f2.b(e2Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = g61Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 < arrayList.size()) {
                    b10.g();
                    e2Var.h = false;
                    String str2 = ((TLRPC.TL_timezone) arrayList.get(g61Var.d)).f20176id;
                    e2Var.f11180n = str2;
                    g3 g3Var2 = e2Var.f11177c;
                    if (g3Var2 != null) {
                        g3Var2.run(str2);
                    }
                    if (e2Var.d) {
                        e2Var.actionBar.h(true);
                    }
                    e2Var.f11175a.f25245f3.N(true);
                }
            }
        }
    }

    public static void T(e2 e2Var, ArrayList arrayList, u61 u61Var) {
        boolean z10;
        boolean z11;
        if (e2Var.d && !TextUtils.isEmpty(e2Var.f11178e)) {
            z10 = true;
        } else {
            z10 = false;
        }
        f2 b10 = f2.b(e2Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z10) {
            u61Var.U();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            g61 g61Var = new g61(9);
            g61Var.d = -1;
            g61Var.f26669l = string;
            g61Var.K(e2Var.h);
            arrayList.add(g61Var);
            u61Var.T();
            arrayList.add(g61.B(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, b10.d(e2Var.f11180n, true))));
        }
        u61Var.U();
        if (!z10) {
            com.google.android.gms.internal.vision.e2.n(R.string.TimezoneHeader, arrayList);
        }
        int i10 = 0;
        boolean z12 = true;
        while (true) {
            b10.g();
            if (i10 >= arrayList2.size()) {
                break;
            }
            b10.g();
            TLRPC.TL_timezone tL_timezone = (TLRPC.TL_timezone) arrayList2.get(i10);
            CharSequence e7 = f2.e(tL_timezone, false);
            if (z10) {
                String replace = AndroidUtilities.translitSafe(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = AndroidUtilities.translitSafe(e2Var.f11178e).toLowerCase();
                if (org.telegram.messenger.f0.w(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e7 = AndroidUtilities.highlightText(e7, e2Var.f11178e, e2Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f7 = f2.f(tL_timezone);
            g61 g61Var2 = new g61(10);
            g61Var2.d = i10;
            g61Var2.f26669l = e7;
            g61Var2.f26671n = f7;
            g61Var2.K(TextUtils.equals(tL_timezone.f20176id, e2Var.f11180n));
            if (e2Var.h && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            g61Var2.f26665g = z11;
            arrayList.add(g61Var2);
            z12 = false;
            i10++;
        }
        u61Var.T();
        if (z12) {
            arrayList.add(g61.m(e2Var.f11176b));
        } else {
            arrayList.add(g61.B(null));
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.TimezoneTitle));
        this.actionBar.setActionBarMenuOnItemClick(new ei.u(this, 16));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(1, R.drawable.outline_header_search);
        a2.F();
        a2.H = new d2(this, 0);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i6.w0(null, i6.f20762a7, false));
        c71 c71Var = new c71(this, new t7(this, 1), new ei.f(this, 7), null);
        this.f11175a = c71Var;
        c71Var.s1();
        this.actionBar.setAdaptiveBackground(this.f11175a);
        frameLayout.addView(this.f11175a, z5.c(-1.0f, -1));
        this.f11175a.setOnScrollListener(new ai.r(this, 11));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f11176b = linearLayout;
        linearLayout.setOrientation(1);
        this.f11176b.setMinimumHeight(AndroidUtilities.dp(500.0f));
        w9 w9Var = new w9(context);
        w9Var.getImageReceiver().setAllowLoadingOnAttachedOnly(false);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(w9Var, "RestrictedEmoji", "🌖", "130_130");
        this.f11176b.addView(w9Var, z5.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.TimezoneNotFound));
        ok.n(i6.f21205y6, this.resourceProvider, textView, 1, 15.0f);
        this.f11176b.addView(textView, z5.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        c71 c71Var;
        u61 u61Var;
        if (i10 == NotificationCenter.timezonesUpdated && (c71Var = this.f11175a) != null && (u61Var = c71Var.f25245f3) != null) {
            u61Var.N(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        String c10 = f2.b(this.currentAccount).c();
        this.f11179f = c10;
        this.h = TextUtils.equals(c10, this.f11180n);
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
        this.f11175a.setPadding(0, 0, 0, i13);
        this.f11175a.setClipToPadding(false);
    }
}
