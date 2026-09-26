package hg;

import ai.g3;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import ei.d5;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.ok;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.w9;
import w7.y5;
import yh.s7;
public final class f2 extends m2 implements NotificationCenter.NotificationCenterDelegate {
    public s61 f10267a;
    public LinearLayout f10268b;
    public g3 f10269c;
    public boolean d;
    public String e;
    public String f10270f;
    public boolean h;
    public String f10271n;

    public static void U(f2 f2Var, w51 w51Var, View view) {
        if (w51Var.d == -1) {
            boolean z10 = f2Var.h;
            f2Var.h = !z10;
            if (!z10) {
                String str = f2Var.f10270f;
                f2Var.f10271n = str;
                g3 g3Var = f2Var.f10269c;
                if (g3Var != null) {
                    g3Var.run(str);
                }
            }
            ((w8) view).setChecked(f2Var.h);
            f2Var.f10267a.Y2.N(true);
        } else if (view.isEnabled()) {
            g2 b10 = g2.b(f2Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = w51Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 < arrayList.size()) {
                    b10.g();
                    f2Var.h = false;
                    String str2 = ((TLRPC.TL_timezone) arrayList.get(w51Var.d)).f18473id;
                    f2Var.f10271n = str2;
                    g3 g3Var2 = f2Var.f10269c;
                    if (g3Var2 != null) {
                        g3Var2.run(str2);
                    }
                    if (f2Var.d) {
                        f2Var.actionBar.h(true);
                    }
                    f2Var.f10267a.Y2.N(true);
                }
            }
        }
    }

    public static void V(f2 f2Var, ArrayList arrayList, k61 k61Var) {
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
            k61Var.U();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            w51 w51Var = new w51(9);
            w51Var.d = -1;
            w51Var.f29895l = string;
            w51Var.K(f2Var.h);
            arrayList.add(w51Var);
            k61Var.T();
            arrayList.add(w51.B(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, b10.d(f2Var.f10271n, true))));
        }
        k61Var.U();
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
            CharSequence e = g2.e(tL_timezone, false);
            if (z10) {
                String replace = AndroidUtilities.translitSafe(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = AndroidUtilities.translitSafe(f2Var.e).toLowerCase();
                if (org.telegram.messenger.f0.w(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e = AndroidUtilities.highlightText(e, f2Var.e, f2Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f7 = g2.f(tL_timezone);
            w51 w51Var2 = new w51(10);
            w51Var2.d = i10;
            w51Var2.f29895l = e;
            w51Var2.f29897n = f7;
            w51Var2.K(TextUtils.equals(tL_timezone.f18473id, f2Var.f10271n));
            if (f2Var.h && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            w51Var2.f29891g = z11;
            arrayList.add(w51Var2);
            z12 = false;
            i10++;
        }
        k61Var.T();
        if (z12) {
            arrayList.add(w51.l(f2Var.f10268b));
        } else {
            arrayList.add(w51.B(null));
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.TimezoneTitle));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 16));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(1, R.drawable.outline_header_search);
        a2.F();
        a2.H = new e2(this, 0);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(h6.w0(null, h6.f19003a7, false));
        s61 s61Var = new s61(this, new s7(this, 1), new d5(this, 6), null);
        this.f10267a = s61Var;
        s61Var.p1();
        this.actionBar.setAdaptiveBackground(this.f10267a);
        frameLayout.addView(this.f10267a, y5.c(-1.0f, -1));
        this.f10267a.setOnScrollListener(new ai.r(this, 10));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f10268b = linearLayout;
        linearLayout.setOrientation(1);
        this.f10268b.setMinimumHeight(AndroidUtilities.dp(500.0f));
        w9 w9Var = new w9(context);
        w9Var.getImageReceiver().setAllowLoadingOnAttachedOnly(false);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(w9Var, "RestrictedEmoji", "🌖", "130_130");
        this.f10268b.addView(w9Var, y5.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.TimezoneNotFound));
        ok.n(h6.f19442y6, this.resourceProvider, textView, 1, 15.0f);
        this.f10268b.addView(textView, y5.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        s61 s61Var;
        k61 k61Var;
        if (i10 == NotificationCenter.timezonesUpdated && (s61Var = this.f10267a) != null && (k61Var = s61Var.Y2) != null) {
            k61Var.N(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        String c10 = g2.b(this.currentAccount).c();
        this.f10270f = c10;
        this.h = TextUtils.equals(c10, this.f10271n);
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
        this.f10267a.setPadding(0, 0, 0, i13);
        this.f10267a.setClipToPadding(false);
    }
}
