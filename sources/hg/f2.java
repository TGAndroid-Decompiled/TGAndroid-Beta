package hg;

import ai.h3;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ei.c5;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.am;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.y9;
import w7.w5;
import yh.l7;
public final class f2 extends m2 implements NotificationCenter.NotificationCenterDelegate {
    public p71 f11228a;
    public LinearLayout f11229b;
    public h3 f11230c;
    public boolean d;
    public String f11231e;
    public String f11232f;
    public boolean h;
    public String f11233n;

    public static void U(f2 f2Var, u61 u61Var, View view) {
        if (u61Var.d == -1) {
            boolean z10 = f2Var.h;
            f2Var.h = !z10;
            if (!z10) {
                String str = f2Var.f11232f;
                f2Var.f11233n = str;
                h3 h3Var = f2Var.f11230c;
                if (h3Var != null) {
                    h3Var.run(str);
                }
            }
            ((w8) view).setChecked(f2Var.h);
            f2Var.f11228a.W2.N(true);
        } else if (view.isEnabled()) {
            g2 b10 = g2.b(f2Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = u61Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 < arrayList.size()) {
                    b10.g();
                    f2Var.h = false;
                    String str2 = ((TLRPC.TL_timezone) arrayList.get(u61Var.d)).f19940id;
                    f2Var.f11233n = str2;
                    h3 h3Var2 = f2Var.f11230c;
                    if (h3Var2 != null) {
                        h3Var2.run(str2);
                    }
                    if (f2Var.d) {
                        f2Var.actionBar.i(true);
                    }
                    f2Var.f11228a.W2.N(true);
                }
            }
        }
    }

    public static void V(f2 f2Var, ArrayList arrayList, h71 h71Var) {
        boolean z10;
        boolean z11;
        if (f2Var.d && !TextUtils.isEmpty(f2Var.f11231e)) {
            z10 = true;
        } else {
            z10 = false;
        }
        g2 b10 = g2.b(f2Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z10) {
            h71Var.U();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            u61 u61Var = new u61(9);
            u61Var.d = -1;
            u61Var.f31076l = string;
            u61Var.K(f2Var.h);
            arrayList.add(u61Var);
            h71Var.T();
            arrayList.add(u61.B(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, b10.d(f2Var.f11233n, true))));
        }
        h71Var.U();
        if (!z10) {
            com.google.android.gms.internal.vision.e2.n(R.string.TimezoneHeader, arrayList);
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
            CharSequence e7 = g2.e(tL_timezone, false);
            if (z10) {
                String replace = AndroidUtilities.translitSafe(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = AndroidUtilities.translitSafe(f2Var.f11231e).toLowerCase();
                if (org.telegram.messenger.v0.w(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e7 = AndroidUtilities.highlightText(e7, f2Var.f11231e, f2Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f7 = g2.f(tL_timezone);
            u61 u61Var2 = new u61(10);
            u61Var2.d = i10;
            u61Var2.f31076l = e7;
            u61Var2.f31078n = f7;
            u61Var2.K(TextUtils.equals(tL_timezone.f19940id, f2Var.f11233n));
            if (f2Var.h && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            u61Var2.f31072g = z11;
            arrayList.add(u61Var2);
            z12 = false;
            i10++;
        }
        h71Var.T();
        if (z12) {
            arrayList.add(u61.l(f2Var.f11229b));
        } else {
            arrayList.add(u61.B(null));
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.TimezoneTitle));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 16));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.p().a(1, R.drawable.outline_header_search);
        a2.F();
        a2.H = new e2(this, 0);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(h6.x0(null, h6.f20503a7, false));
        p71 p71Var = new p71(this, new l7(this, 1), new c5(this, 6), null);
        this.f11228a = p71Var;
        p71Var.p1();
        this.actionBar.setAdaptiveBackground(this.f11228a);
        frameLayout.addView(this.f11228a, w5.d(-1.0f, -1));
        this.f11228a.setOnScrollListener(new ai.r(this, 10));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f11229b = linearLayout;
        linearLayout.setOrientation(1);
        this.f11229b.setMinimumHeight(AndroidUtilities.dp(500.0f));
        y9 y9Var = new y9(context);
        y9Var.getImageReceiver().setAllowLoadingOnAttachedOnly(false);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(y9Var, "RestrictedEmoji", "🌖", "130_130");
        this.f11229b.addView(y9Var, w5.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.TimezoneNotFound));
        am.o(h6.f20945y6, this.resourceProvider, textView, 1, 15.0f);
        this.f11229b.addView(textView, w5.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        p71 p71Var;
        h71 h71Var;
        if (i10 == NotificationCenter.timezonesUpdated && (p71Var = this.f11228a) != null && (h71Var = p71Var.W2) != null) {
            h71Var.N(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        String c10 = g2.b(this.currentAccount).c();
        this.f11232f = c10;
        this.h = TextUtils.equals(c10, this.f11233n);
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
        this.f11228a.setPadding(0, 0, 0, i13);
        this.f11228a.setClipToPadding(false);
    }
}
