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
import org.telegram.messenger.wl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.w51;
import w7.x5;
import yh.u7;
public final class e2 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public e61 f10271a;
    public LinearLayout f10272b;
    public m2 f10273c;
    public boolean d;
    public String e;
    public String f10274f;
    public boolean h;
    public String f10275n;

    public static void U(e2 e2Var, i51 i51Var, View view) {
        if (i51Var.d == -1) {
            boolean z10 = e2Var.h;
            e2Var.h = !z10;
            if (!z10) {
                String str = e2Var.f10274f;
                e2Var.f10275n = str;
                m2 m2Var = e2Var.f10273c;
                if (m2Var != null) {
                    m2Var.run(str);
                }
            }
            ((w8) view).setChecked(e2Var.h);
            e2Var.f10271a.Y2.N(true);
        } else if (view.isEnabled()) {
            f2 b10 = f2.b(e2Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = i51Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 < arrayList.size()) {
                    b10.g();
                    e2Var.h = false;
                    String str2 = ((TLRPC.TL_timezone) arrayList.get(i51Var.d)).f18250id;
                    e2Var.f10275n = str2;
                    m2 m2Var2 = e2Var.f10273c;
                    if (m2Var2 != null) {
                        m2Var2.run(str2);
                    }
                    if (e2Var.d) {
                        e2Var.actionBar.h(true);
                    }
                    e2Var.f10271a.Y2.N(true);
                }
            }
        }
    }

    public static void V(e2 e2Var, ArrayList arrayList, w51 w51Var) {
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
            w51Var.U();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            i51 i51Var = new i51(9);
            i51Var.d = -1;
            i51Var.f24894l = string;
            i51Var.K(e2Var.h);
            arrayList.add(i51Var);
            w51Var.T();
            arrayList.add(i51.B(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, b10.d(e2Var.f10275n, true))));
        }
        w51Var.U();
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
                if (org.telegram.messenger.w1.w(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e = AndroidUtilities.highlightText(e, e2Var.e, e2Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f7 = f2.f(tL_timezone);
            i51 i51Var2 = new i51(10);
            i51Var2.d = i10;
            i51Var2.f24894l = e;
            i51Var2.f24896n = f7;
            i51Var2.K(TextUtils.equals(tL_timezone.f18250id, e2Var.f10275n));
            if (e2Var.h && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            i51Var2.f24890g = z11;
            arrayList.add(i51Var2);
            z12 = false;
            i10++;
        }
        w51Var.T();
        if (z12) {
            arrayList.add(i51.l(e2Var.f10272b));
        } else {
            arrayList.add(i51.B(null));
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
        frameLayout.setBackgroundColor(i6.w0(null, i6.f18780a7, false));
        e61 e61Var = new e61(this, new u7(this, 1), new d5(this, 6), null);
        this.f10271a = e61Var;
        e61Var.p1();
        this.actionBar.setAdaptiveBackground(this.f10271a);
        frameLayout.addView(this.f10271a, x5.c(-1.0f, -1));
        this.f10271a.setOnScrollListener(new ai.r(this, 11));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f10272b = linearLayout;
        linearLayout.setOrientation(1);
        this.f10272b.setMinimumHeight(AndroidUtilities.dp(500.0f));
        u9 u9Var = new u9(context);
        u9Var.getImageReceiver().setAllowLoadingOnAttachedOnly(false);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(u9Var, "RestrictedEmoji", "🌖", "130_130");
        this.f10272b.addView(u9Var, x5.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.TimezoneNotFound));
        wl.n(i6.f19218y6, this.resourceProvider, textView, 1, 15.0f);
        this.f10272b.addView(textView, x5.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        e61 e61Var;
        w51 w51Var;
        if (i10 == NotificationCenter.timezonesUpdated && (e61Var = this.f10271a) != null && (w51Var = e61Var.Y2) != null) {
            w51Var.N(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        String c10 = f2.b(this.currentAccount).c();
        this.f10274f = c10;
        this.h = TextUtils.equals(c10, this.f10275n);
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
        this.f10271a.setPadding(0, 0, 0, i13);
        this.f10271a.setClipToPadding(false);
    }
}
