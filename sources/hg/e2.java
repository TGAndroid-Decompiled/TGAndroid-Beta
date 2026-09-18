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
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.x51;
import w7.y5;
import yh.r7;
public final class e2 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public t61 f10276a;
    public LinearLayout f10277b;
    public m2 f10278c;
    public boolean d;
    public String e;
    public String f10279f;
    public boolean h;
    public String f10280n;

    public static void U(e2 e2Var, x51 x51Var, View view) {
        if (x51Var.d == -1) {
            boolean z10 = e2Var.h;
            e2Var.h = !z10;
            if (!z10) {
                String str = e2Var.f10279f;
                e2Var.f10280n = str;
                m2 m2Var = e2Var.f10278c;
                if (m2Var != null) {
                    m2Var.run(str);
                }
            }
            ((w8) view).setChecked(e2Var.h);
            e2Var.f10276a.Y2.N(true);
        } else if (view.isEnabled()) {
            f2 b10 = f2.b(e2Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = x51Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 < arrayList.size()) {
                    b10.g();
                    e2Var.h = false;
                    String str2 = ((TLRPC.TL_timezone) arrayList.get(x51Var.d)).f18434id;
                    e2Var.f10280n = str2;
                    m2 m2Var2 = e2Var.f10278c;
                    if (m2Var2 != null) {
                        m2Var2.run(str2);
                    }
                    if (e2Var.d) {
                        e2Var.actionBar.h(true);
                    }
                    e2Var.f10276a.Y2.N(true);
                }
            }
        }
    }

    public static void V(e2 e2Var, ArrayList arrayList, l61 l61Var) {
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
            l61Var.U();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            x51 x51Var = new x51(9);
            x51Var.d = -1;
            x51Var.f30248l = string;
            x51Var.K(e2Var.h);
            arrayList.add(x51Var);
            l61Var.T();
            arrayList.add(x51.B(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, b10.d(e2Var.f10280n, true))));
        }
        l61Var.U();
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
                if (wh.u(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e = AndroidUtilities.highlightText(e, e2Var.e, e2Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f7 = f2.f(tL_timezone);
            x51 x51Var2 = new x51(10);
            x51Var2.d = i10;
            x51Var2.f30248l = e;
            x51Var2.f30250n = f7;
            x51Var2.K(TextUtils.equals(tL_timezone.f18434id, e2Var.f10280n));
            if (e2Var.h && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            x51Var2.f30244g = z11;
            arrayList.add(x51Var2);
            z12 = false;
            i10++;
        }
        l61Var.T();
        if (z12) {
            arrayList.add(x51.l(e2Var.f10277b));
        } else {
            arrayList.add(x51.B(null));
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
        frameLayout.setBackgroundColor(j6.w0(null, j6.f19006a7, false));
        t61 t61Var = new t61(this, new r7(this, 1), new d5(this, 6), null);
        this.f10276a = t61Var;
        t61Var.q1();
        this.actionBar.setAdaptiveBackground(this.f10276a);
        frameLayout.addView(this.f10276a, y5.c(-1.0f, -1));
        this.f10276a.setOnScrollListener(new ai.r(this, 11));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f10277b = linearLayout;
        linearLayout.setOrientation(1);
        this.f10277b.setMinimumHeight(AndroidUtilities.dp(500.0f));
        w9 w9Var = new w9(context);
        w9Var.getImageReceiver().setAllowLoadingOnAttachedOnly(false);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(w9Var, "RestrictedEmoji", "🌖", "130_130");
        this.f10277b.addView(w9Var, y5.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.TimezoneNotFound));
        wh.m(j6.f19445y6, this.resourceProvider, textView, 1, 15.0f);
        this.f10277b.addView(textView, y5.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        t61 t61Var;
        l61 l61Var;
        if (i10 == NotificationCenter.timezonesUpdated && (t61Var = this.f10276a) != null && (l61Var = t61Var.Y2) != null) {
            l61Var.N(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        String c10 = f2.b(this.currentAccount).c();
        this.f10279f = c10;
        this.h = TextUtils.equals(c10, this.f10280n);
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
        this.f10276a.setPadding(0, 0, 0, i13);
        this.f10276a.setClipToPadding(false);
    }
}
