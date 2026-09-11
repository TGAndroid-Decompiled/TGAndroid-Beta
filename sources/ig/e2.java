package ig;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import di.m2;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.vl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.x9;
import w7.x5;
import zh.r7;
public final class e2 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public d61 f12052a;
    public LinearLayout f12053b;
    public m2 f12054c;
    public boolean d;
    public String f12055e;
    public String f12056f;
    public boolean h;
    public String f12057n;

    public static void U(e2 e2Var, h51 h51Var, View view) {
        if (h51Var.d == -1) {
            boolean z10 = e2Var.h;
            e2Var.h = !z10;
            if (!z10) {
                String str = e2Var.f12056f;
                e2Var.f12057n = str;
                m2 m2Var = e2Var.f12054c;
                if (m2Var != null) {
                    m2Var.run(str);
                }
            }
            ((w8) view).setChecked(e2Var.h);
            e2Var.f12052a.Y2.N(true);
        } else if (view.isEnabled()) {
            f2 b10 = f2.b(e2Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = h51Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 < arrayList.size()) {
                    b10.g();
                    e2Var.h = false;
                    String str2 = ((TLRPC.TL_timezone) arrayList.get(h51Var.d)).f20007id;
                    e2Var.f12057n = str2;
                    m2 m2Var2 = e2Var.f12054c;
                    if (m2Var2 != null) {
                        m2Var2.run(str2);
                    }
                    if (e2Var.d) {
                        e2Var.actionBar.h(true);
                    }
                    e2Var.f12052a.Y2.N(true);
                }
            }
        }
    }

    public static void V(e2 e2Var, ArrayList arrayList, v51 v51Var) {
        boolean z10;
        boolean z11;
        if (e2Var.d && !TextUtils.isEmpty(e2Var.f12055e)) {
            z10 = true;
        } else {
            z10 = false;
        }
        f2 b10 = f2.b(e2Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z10) {
            v51Var.U();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            h51 h51Var = new h51(9);
            h51Var.d = -1;
            h51Var.f26594l = string;
            h51Var.K(e2Var.h);
            arrayList.add(h51Var);
            v51Var.T();
            arrayList.add(h51.B(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, b10.d(e2Var.f12057n, true))));
        }
        v51Var.U();
        if (!z10) {
            i2.g.p(R.string.TimezoneHeader, arrayList);
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
                String lowerCase = AndroidUtilities.translitSafe(e2Var.f12055e).toLowerCase();
                if (org.telegram.messenger.w1.w(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e7 = AndroidUtilities.highlightText(e7, e2Var.f12055e, e2Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f7 = f2.f(tL_timezone);
            h51 h51Var2 = new h51(10);
            h51Var2.d = i10;
            h51Var2.f26594l = e7;
            h51Var2.f26596n = f7;
            h51Var2.K(TextUtils.equals(tL_timezone.f20007id, e2Var.f12057n));
            if (e2Var.h && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            h51Var2.f26590g = z11;
            arrayList.add(h51Var2);
            z12 = false;
            i10++;
        }
        v51Var.T();
        if (z12) {
            arrayList.add(h51.l(e2Var.f12053b));
        } else {
            arrayList.add(h51.B(null));
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.TimezoneTitle));
        this.actionBar.setActionBarMenuOnItemClick(new ah.t(this, 17));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.n().a(1, R.drawable.outline_header_search);
        a2.F();
        a2.H = new d2(this, 0);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(j6.w0(null, j6.f20607a7, false));
        d61 d61Var = new d61(this, new r7(this, 1), new fi.f(this, 14), null);
        this.f12052a = d61Var;
        d61Var.o1();
        this.actionBar.setAdaptiveBackground(this.f12052a);
        frameLayout.addView(this.f12052a, x5.c(-1.0f, -1));
        this.f12052a.setOnScrollListener(new ah.e0(this, 12));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f12053b = linearLayout;
        linearLayout.setOrientation(1);
        this.f12053b.setMinimumHeight(AndroidUtilities.dp(500.0f));
        x9 x9Var = new x9(context);
        x9Var.getImageReceiver().setAllowLoadingOnAttachedOnly(false);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(x9Var, "RestrictedEmoji", "🌖", "130_130");
        this.f12053b.addView(x9Var, x5.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.TimezoneNotFound));
        vl.n(j6.f21042y6, this.resourceProvider, textView, 1, 15.0f);
        this.f12053b.addView(textView, x5.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        d61 d61Var;
        v51 v51Var;
        if (i10 == NotificationCenter.timezonesUpdated && (d61Var = this.f12052a) != null && (v51Var = d61Var.Y2) != null) {
            v51Var.N(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        String c10 = f2.b(this.currentAccount).c();
        this.f12056f = c10;
        this.h = TextUtils.equals(c10, this.f12057n);
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
        this.f12052a.setPadding(0, 0, 0, i13);
        this.f12052a.setClipToPadding(false);
    }
}
