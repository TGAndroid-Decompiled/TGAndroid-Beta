package ig;

import ai.o2;
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
import org.telegram.messenger.kk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w9;
import w7.z5;
public final class d2 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public b71 f12862a;
    public LinearLayout f12863b;
    public o2 f12864c;
    public boolean d;
    public String e;
    public String f12865f;
    public boolean h;
    public String f12866n;

    public static void U(d2 d2Var, g61 g61Var, View view) {
        if (g61Var.d == -1) {
            boolean z10 = d2Var.h;
            d2Var.h = !z10;
            if (!z10) {
                String str = d2Var.f12865f;
                d2Var.f12866n = str;
                o2 o2Var = d2Var.f12864c;
                if (o2Var != null) {
                    o2Var.run(str);
                }
            }
            ((v8) view).setChecked(d2Var.h);
            d2Var.f12862a.W2.N(true);
        } else if (view.isEnabled()) {
            f2 b10 = f2.b(d2Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = g61Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 < arrayList.size()) {
                    b10.g();
                    d2Var.h = false;
                    String str2 = ((TLRPC.TL_timezone) arrayList.get(g61Var.d)).f20411id;
                    d2Var.f12866n = str2;
                    o2 o2Var2 = d2Var.f12864c;
                    if (o2Var2 != null) {
                        o2Var2.run(str2);
                    }
                    if (d2Var.d) {
                        d2Var.actionBar.h(true);
                    }
                    d2Var.f12862a.W2.N(true);
                }
            }
        }
    }

    public static void V(d2 d2Var, ArrayList arrayList, t61 t61Var) {
        boolean z10;
        boolean z11;
        if (d2Var.d && !TextUtils.isEmpty(d2Var.e)) {
            z10 = true;
        } else {
            z10 = false;
        }
        f2 b10 = f2.b(d2Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z10) {
            t61Var.U();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            g61 g61Var = new g61(9);
            g61Var.d = -1;
            g61Var.f26497l = string;
            g61Var.K(d2Var.h);
            arrayList.add(g61Var);
            t61Var.T();
            arrayList.add(g61.B(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, b10.d(d2Var.f12866n, true))));
        }
        t61Var.U();
        if (!z10) {
            i2.e.p(R.string.TimezoneHeader, arrayList);
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
                String lowerCase = AndroidUtilities.translitSafe(d2Var.e).toLowerCase();
                if (org.telegram.messenger.g0.w(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e = AndroidUtilities.highlightText(e, d2Var.e, d2Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f7 = f2.f(tL_timezone);
            g61 g61Var2 = new g61(10);
            g61Var2.d = i10;
            g61Var2.f26497l = e;
            g61Var2.f26499n = f7;
            g61Var2.K(TextUtils.equals(tL_timezone.f20411id, d2Var.f12866n));
            if (d2Var.h && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            g61Var2.f26493g = z11;
            arrayList.add(g61Var2);
            z12 = false;
            i10++;
        }
        t61Var.T();
        if (z12) {
            arrayList.add(g61.l(d2Var.f12863b));
        } else {
            arrayList.add(g61.B(null));
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.TimezoneTitle));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 18));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.n().a(1, R.drawable.outline_header_search);
        a2.F();
        a2.H = new c2(this, 0);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(h6.x0(null, h6.f20929a7, false));
        b71 b71Var = new b71(this, new hg.o(this, 10), new e1.c(this, 23), null);
        this.f12862a = b71Var;
        b71Var.p1();
        this.actionBar.setAdaptiveBackground(this.f12862a);
        frameLayout.addView(this.f12862a, z5.c(-1.0f, -1));
        this.f12862a.setOnScrollListener(new ah.d0(this, 15));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f12863b = linearLayout;
        linearLayout.setOrientation(1);
        this.f12863b.setMinimumHeight(AndroidUtilities.dp(500.0f));
        w9 w9Var = new w9(context);
        w9Var.getImageReceiver().setAllowLoadingOnAttachedOnly(false);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(w9Var, "RestrictedEmoji", "🌖", "130_130");
        this.f12863b.addView(w9Var, z5.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.TimezoneNotFound));
        kk.o(h6.f21375y6, this.resourceProvider, textView, 1, 15.0f);
        this.f12863b.addView(textView, z5.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        b71 b71Var;
        t61 t61Var;
        if (i10 == NotificationCenter.timezonesUpdated && (b71Var = this.f12862a) != null && (t61Var = b71Var.W2) != null) {
            t61Var.N(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        String c10 = f2.b(this.currentAccount).c();
        this.f12865f = c10;
        this.h = TextUtils.equals(c10, this.f12866n);
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
        this.f12862a.setPadding(0, 0, 0, i13);
        this.f12862a.setClipToPadding(false);
    }
}
