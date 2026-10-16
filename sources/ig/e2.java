package ig;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import bi.v2;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.sk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.z9;
import w7.z5;
import zh.l7;
public final class e2 extends m2 implements NotificationCenter.NotificationCenterDelegate {
    public i71 f11493a;
    public LinearLayout f11494b;
    public v2 f11495c;
    public boolean d;
    public String e;
    public String f11496f;
    public boolean h;
    public String f11497n;

    public static void U(e2 e2Var, m61 m61Var, View view) {
        if (m61Var.d == -1) {
            boolean z10 = e2Var.h;
            e2Var.h = !z10;
            if (!z10) {
                String str = e2Var.f11496f;
                e2Var.f11497n = str;
                v2 v2Var = e2Var.f11495c;
                if (v2Var != null) {
                    v2Var.run(str);
                }
            }
            ((w8) view).setChecked(e2Var.h);
            e2Var.f11493a.W2.N(true);
        } else if (view.isEnabled()) {
            f2 b10 = f2.b(e2Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = m61Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 < arrayList.size()) {
                    b10.g();
                    e2Var.h = false;
                    String str2 = ((TLRPC.TL_timezone) arrayList.get(m61Var.d)).f19054id;
                    e2Var.f11497n = str2;
                    v2 v2Var2 = e2Var.f11495c;
                    if (v2Var2 != null) {
                        v2Var2.run(str2);
                    }
                    if (e2Var.d) {
                        e2Var.actionBar.h(true);
                    }
                    e2Var.f11493a.W2.N(true);
                }
            }
        }
    }

    public static void V(e2 e2Var, ArrayList arrayList, a71 a71Var) {
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
            a71Var.U();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            m61 m61Var = new m61(9);
            m61Var.d = -1;
            m61Var.f26946l = string;
            m61Var.K(e2Var.h);
            arrayList.add(m61Var);
            a71Var.T();
            arrayList.add(m61.B(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, b10.d(e2Var.f11497n, true))));
        }
        a71Var.U();
        if (!z10) {
            i2.d.p(R.string.TimezoneHeader, arrayList);
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
            CharSequence e = f2.e(tL_timezone, false);
            if (z10) {
                String replace = AndroidUtilities.translitSafe(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = AndroidUtilities.translitSafe(e2Var.e).toLowerCase();
                if (org.telegram.messenger.g0.w(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e = AndroidUtilities.highlightText(e, e2Var.e, e2Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f7 = f2.f(tL_timezone);
            m61 m61Var2 = new m61(10);
            m61Var2.d = i10;
            m61Var2.f26946l = e;
            m61Var2.f26948n = f7;
            m61Var2.K(TextUtils.equals(tL_timezone.f19054id, e2Var.f11497n));
            if (e2Var.h && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            m61Var2.f26942g = z11;
            arrayList.add(m61Var2);
            z12 = false;
            i10++;
        }
        a71Var.T();
        if (z12) {
            arrayList.add(m61.l(e2Var.f11494b));
        } else {
            arrayList.add(m61.B(null));
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.TimezoneTitle));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 17));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(1, R.drawable.outline_header_search);
        a2.F();
        a2.H = new d2(this, 0);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(g6.x0(null, g6.f19543a7, false));
        i71 i71Var = new i71(this, new l7(this, 1), new f1.a(this, 14), null);
        this.f11493a = i71Var;
        i71Var.p1();
        this.actionBar.setAdaptiveBackground(this.f11493a);
        frameLayout.addView(this.f11493a, z5.d(-1.0f, -1));
        this.f11493a.setOnScrollListener(new ah.d0(this, 11));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f11494b = linearLayout;
        linearLayout.setOrientation(1);
        this.f11494b.setMinimumHeight(AndroidUtilities.dp(500.0f));
        z9 z9Var = new z9(context);
        z9Var.getImageReceiver().setAllowLoadingOnAttachedOnly(false);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(z9Var, "RestrictedEmoji", "🌖", "130_130");
        this.f11494b.addView(z9Var, z5.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.TimezoneNotFound));
        sk.o(g6.f19988y6, this.resourceProvider, textView, 1, 15.0f);
        this.f11494b.addView(textView, z5.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        i71 i71Var;
        a71 a71Var;
        if (i10 == NotificationCenter.timezonesUpdated && (i71Var = this.f11493a) != null && (a71Var = i71Var.W2) != null) {
            a71Var.N(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        String c10 = f2.b(this.currentAccount).c();
        this.f11496f = c10;
        this.h = TextUtils.equals(c10, this.f11497n);
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
        this.f11493a.setPadding(0, 0, 0, i13);
        this.f11493a.setClipToPadding(false);
    }
}
