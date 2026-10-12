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
import org.telegram.messenger.yh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.z61;
import org.telegram.ui.Components.z9;
import w7.a6;
import zh.l7;
public final class e2 extends m2 implements NotificationCenter.NotificationCenterDelegate {
    public h71 f11489a;
    public LinearLayout f11490b;
    public v2 f11491c;
    public boolean d;
    public String e;
    public String f11492f;
    public boolean h;
    public String f11493n;

    public static void U(e2 e2Var, l61 l61Var, View view) {
        if (l61Var.d == -1) {
            boolean z10 = e2Var.h;
            e2Var.h = !z10;
            if (!z10) {
                String str = e2Var.f11492f;
                e2Var.f11493n = str;
                v2 v2Var = e2Var.f11491c;
                if (v2Var != null) {
                    v2Var.run(str);
                }
            }
            ((w8) view).setChecked(e2Var.h);
            e2Var.f11489a.W2.N(true);
        } else if (view.isEnabled()) {
            f2 b10 = f2.b(e2Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = l61Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 < arrayList.size()) {
                    b10.g();
                    e2Var.h = false;
                    String str2 = ((TLRPC.TL_timezone) arrayList.get(l61Var.d)).f19354id;
                    e2Var.f11493n = str2;
                    v2 v2Var2 = e2Var.f11491c;
                    if (v2Var2 != null) {
                        v2Var2.run(str2);
                    }
                    if (e2Var.d) {
                        e2Var.actionBar.h(true);
                    }
                    e2Var.f11489a.W2.N(true);
                }
            }
        }
    }

    public static void V(e2 e2Var, ArrayList arrayList, z61 z61Var) {
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
            z61Var.U();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            l61 l61Var = new l61(9);
            l61Var.d = -1;
            l61Var.f26954l = string;
            l61Var.K(e2Var.h);
            arrayList.add(l61Var);
            z61Var.T();
            arrayList.add(l61.B(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, b10.d(e2Var.f11493n, true))));
        }
        z61Var.U();
        if (!z10) {
            i2.d.o(R.string.TimezoneHeader, arrayList);
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
                if (yh.v(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e = AndroidUtilities.highlightText(e, e2Var.e, e2Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f7 = f2.f(tL_timezone);
            l61 l61Var2 = new l61(10);
            l61Var2.d = i10;
            l61Var2.f26954l = e;
            l61Var2.f26956n = f7;
            l61Var2.K(TextUtils.equals(tL_timezone.f19354id, e2Var.f11493n));
            if (e2Var.h && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            l61Var2.f26950g = z11;
            arrayList.add(l61Var2);
            z12 = false;
            i10++;
        }
        z61Var.T();
        if (z12) {
            arrayList.add(l61.l(e2Var.f11490b));
        } else {
            arrayList.add(l61.B(null));
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
        frameLayout.setBackgroundColor(g6.x0(null, g6.f19843a7, false));
        h71 h71Var = new h71(this, new l7(this, 1), new f1.a(this, 14), null);
        this.f11489a = h71Var;
        h71Var.p1();
        this.actionBar.setAdaptiveBackground(this.f11489a);
        frameLayout.addView(this.f11489a, a6.d(-1.0f, -1));
        this.f11489a.setOnScrollListener(new ah.d0(this, 11));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f11490b = linearLayout;
        linearLayout.setOrientation(1);
        this.f11490b.setMinimumHeight(AndroidUtilities.dp(500.0f));
        z9 z9Var = new z9(context);
        z9Var.getImageReceiver().setAllowLoadingOnAttachedOnly(false);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(z9Var, "RestrictedEmoji", "🌖", "130_130");
        this.f11490b.addView(z9Var, a6.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.TimezoneNotFound));
        yh.n(g6.f20288y6, this.resourceProvider, textView, 1, 15.0f);
        this.f11490b.addView(textView, a6.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        h71 h71Var;
        z61 z61Var;
        if (i10 == NotificationCenter.timezonesUpdated && (h71Var = this.f11489a) != null && (z61Var = h71Var.W2) != null) {
            z61Var.N(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        String c10 = f2.b(this.currentAccount).c();
        this.f11492f = c10;
        this.h = TextUtils.equals(c10, this.f11493n);
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
        this.f11489a.setPadding(0, 0, 0, i13);
        this.f11489a.setClipToPadding(false);
    }
}
