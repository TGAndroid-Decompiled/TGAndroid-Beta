package hg;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ci.m2;
import ei.d5;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.rk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.y51;
import w7.y5;
import yh.s7;
public final class e2 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public u61 f10277a;
    public LinearLayout f10278b;
    public m2 f10279c;
    public boolean d;
    public String e;
    public String f10280f;
    public boolean h;
    public String f10281n;

    public static void U(e2 e2Var, y51 y51Var, View view) {
        if (y51Var.d == -1) {
            boolean z10 = e2Var.h;
            e2Var.h = !z10;
            if (!z10) {
                String str = e2Var.f10280f;
                e2Var.f10281n = str;
                m2 m2Var = e2Var.f10279c;
                if (m2Var != null) {
                    m2Var.run(str);
                }
            }
            ((x8) view).setChecked(e2Var.h);
            e2Var.f10277a.Y2.N(true);
        } else if (view.isEnabled()) {
            f2 b10 = f2.b(e2Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = y51Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 < arrayList.size()) {
                    b10.g();
                    e2Var.h = false;
                    String str2 = ((TLRPC.TL_timezone) arrayList.get(y51Var.d)).f18481id;
                    e2Var.f10281n = str2;
                    m2 m2Var2 = e2Var.f10279c;
                    if (m2Var2 != null) {
                        m2Var2.run(str2);
                    }
                    if (e2Var.d) {
                        e2Var.actionBar.h(true);
                    }
                    e2Var.f10277a.Y2.N(true);
                }
            }
        }
    }

    public static void V(e2 e2Var, ArrayList arrayList, m61 m61Var) {
        boolean z10;
        boolean z11;
        if (e2Var.d && !TextUtils.isEmpty(e2Var.e)) {
            z10 = true;
        } else {
            z10 = false;
        }
        f2 b10 = f2.b(e2Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z10) {
            m61Var.U();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            y51 y51Var = new y51(9);
            y51Var.d = -1;
            y51Var.f30518l = string;
            y51Var.K(e2Var.h);
            arrayList.add(y51Var);
            m61Var.T();
            arrayList.add(y51.B(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, b10.d(e2Var.f10281n, true))));
        }
        m61Var.U();
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
            CharSequence e = f2.e(tL_timezone, false);
            if (z10) {
                String replace = AndroidUtilities.translitSafe(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = AndroidUtilities.translitSafe(e2Var.e).toLowerCase();
                if (org.telegram.messenger.l0.v(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e = AndroidUtilities.highlightText(e, e2Var.e, e2Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f7 = f2.f(tL_timezone);
            y51 y51Var2 = new y51(10);
            y51Var2.d = i10;
            y51Var2.f30518l = e;
            y51Var2.f30520n = f7;
            y51Var2.K(TextUtils.equals(tL_timezone.f18481id, e2Var.f10281n));
            if (e2Var.h && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            y51Var2.f30514g = z11;
            arrayList.add(y51Var2);
            z12 = false;
            i10++;
        }
        m61Var.T();
        if (z12) {
            arrayList.add(y51.l(e2Var.f10278b));
        } else {
            arrayList.add(y51.B(null));
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.TimezoneTitle));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 16));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(1, R.drawable.outline_header_search);
        a2.F();
        a2.H = new d2(this, 0);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.w0(null, j6.f19053a7, false));
        u61 u61Var = new u61(this, new s7(this, 1), new d5(this, 6), null);
        this.f10277a = u61Var;
        u61Var.q1();
        this.actionBar.setAdaptiveBackground(this.f10277a);
        frameLayout.addView(this.f10277a, y5.c(-1.0f, -1));
        this.f10277a.setOnScrollListener(new ai.r(this, 11));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f10278b = linearLayout;
        linearLayout.setOrientation(1);
        this.f10278b.setMinimumHeight(AndroidUtilities.dp(500.0f));
        v9 v9Var = new v9(context);
        v9Var.getImageReceiver().setAllowLoadingOnAttachedOnly(false);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(v9Var, "RestrictedEmoji", "🌖", "130_130");
        this.f10278b.addView(v9Var, y5.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.TimezoneNotFound));
        rk.n(j6.f19492y6, this.resourceProvider, textView, 1, 15.0f);
        this.f10278b.addView(textView, y5.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        u61 u61Var;
        m61 m61Var;
        if (i10 == NotificationCenter.timezonesUpdated && (u61Var = this.f10277a) != null && (m61Var = u61Var.Y2) != null) {
            m61Var.N(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        String c10 = f2.b(this.currentAccount).c();
        this.f10280f = c10;
        this.h = TextUtils.equals(c10, this.f10281n);
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
        this.f10277a.setPadding(0, 0, 0, i13);
        this.f10277a.setClipToPadding(false);
    }
}
