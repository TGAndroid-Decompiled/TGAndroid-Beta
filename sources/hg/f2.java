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
import org.telegram.messenger.ul;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.w9;
import w7.x5;
import yh.s7;
public final class f2 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public d61 f10267a;
    public LinearLayout f10268b;
    public g3 f10269c;
    public boolean d;
    public String e;
    public String f10270f;
    public boolean h;
    public String f10271n;

    public static void U(f2 f2Var, h51 h51Var, View view) {
        if (h51Var.d == -1) {
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
            ((x8) view).setChecked(f2Var.h);
            f2Var.f10267a.Y2.N(true);
        } else if (view.isEnabled()) {
            g2 b10 = g2.b(f2Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = h51Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 < arrayList.size()) {
                    b10.g();
                    f2Var.h = false;
                    String str2 = ((TLRPC.TL_timezone) arrayList.get(h51Var.d)).f18221id;
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

    public static void V(f2 f2Var, ArrayList arrayList, v51 v51Var) {
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
            v51Var.U();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            h51 h51Var = new h51(9);
            h51Var.d = -1;
            h51Var.f24507l = string;
            h51Var.K(f2Var.h);
            arrayList.add(h51Var);
            v51Var.T();
            arrayList.add(h51.B(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, b10.d(f2Var.f10271n, true))));
        }
        v51Var.U();
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
                if (org.telegram.messenger.z0.w(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e = AndroidUtilities.highlightText(e, f2Var.e, f2Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f7 = g2.f(tL_timezone);
            h51 h51Var2 = new h51(10);
            h51Var2.d = i10;
            h51Var2.f24507l = e;
            h51Var2.f24509n = f7;
            h51Var2.K(TextUtils.equals(tL_timezone.f18221id, f2Var.f10271n));
            if (f2Var.h && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            h51Var2.f24503g = z11;
            arrayList.add(h51Var2);
            z12 = false;
            i10++;
        }
        v51Var.T();
        if (z12) {
            arrayList.add(h51.l(f2Var.f10268b));
        } else {
            arrayList.add(h51.B(null));
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
        a2.H = new e2(this, 0);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(h6.w0(null, h6.f18733a7, false));
        d61 d61Var = new d61(this, new s7(this, 1), new d5(this, 6), null);
        this.f10267a = d61Var;
        d61Var.p1();
        this.actionBar.setAdaptiveBackground(this.f10267a);
        frameLayout.addView(this.f10267a, x5.c(-1.0f, -1));
        this.f10267a.setOnScrollListener(new ai.r(this, 10));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f10268b = linearLayout;
        linearLayout.setOrientation(1);
        this.f10268b.setMinimumHeight(AndroidUtilities.dp(500.0f));
        w9 w9Var = new w9(context);
        w9Var.getImageReceiver().setAllowLoadingOnAttachedOnly(false);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(w9Var, "RestrictedEmoji", "🌖", "130_130");
        this.f10268b.addView(w9Var, x5.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.TimezoneNotFound));
        ul.o(h6.f19170y6, this.resourceProvider, textView, 1, 15.0f);
        this.f10268b.addView(textView, x5.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        d61 d61Var;
        v51 v51Var;
        if (i10 == NotificationCenter.timezonesUpdated && (d61Var = this.f10267a) != null && (v51Var = d61Var.Y2) != null) {
            v51Var.N(true);
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
