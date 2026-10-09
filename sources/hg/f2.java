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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.y9;
import w7.x5;
import yh.l7;
public final class f2 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public k71 f11230a;
    public LinearLayout f11231b;
    public h3 f11232c;
    public boolean d;
    public String f11233e;
    public String f11234f;
    public boolean h;
    public String f11235n;

    public static void U(f2 f2Var, p61 p61Var, View view) {
        if (p61Var.d == -1) {
            boolean z10 = f2Var.h;
            f2Var.h = !z10;
            if (!z10) {
                String str = f2Var.f11234f;
                f2Var.f11235n = str;
                h3 h3Var = f2Var.f11232c;
                if (h3Var != null) {
                    h3Var.run(str);
                }
            }
            ((w8) view).setChecked(f2Var.h);
            f2Var.f11230a.W2.N(true);
        } else if (view.isEnabled()) {
            g2 b10 = g2.b(f2Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = p61Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 < arrayList.size()) {
                    b10.g();
                    f2Var.h = false;
                    String str2 = ((TLRPC.TL_timezone) arrayList.get(p61Var.d)).f20176id;
                    f2Var.f11235n = str2;
                    h3 h3Var2 = f2Var.f11232c;
                    if (h3Var2 != null) {
                        h3Var2.run(str2);
                    }
                    if (f2Var.d) {
                        f2Var.actionBar.h(true);
                    }
                    f2Var.f11230a.W2.N(true);
                }
            }
        }
    }

    public static void V(f2 f2Var, ArrayList arrayList, c71 c71Var) {
        boolean z10;
        boolean z11;
        if (f2Var.d && !TextUtils.isEmpty(f2Var.f11233e)) {
            z10 = true;
        } else {
            z10 = false;
        }
        g2 b10 = g2.b(f2Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z10) {
            c71Var.U();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            p61 p61Var = new p61(9);
            p61Var.d = -1;
            p61Var.f29734l = string;
            p61Var.K(f2Var.h);
            arrayList.add(p61Var);
            c71Var.T();
            arrayList.add(p61.B(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, b10.d(f2Var.f11235n, true))));
        }
        c71Var.U();
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
                String lowerCase = AndroidUtilities.translitSafe(f2Var.f11233e).toLowerCase();
                if (bi.w(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e7 = AndroidUtilities.highlightText(e7, f2Var.f11233e, f2Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f7 = g2.f(tL_timezone);
            p61 p61Var2 = new p61(10);
            p61Var2.d = i10;
            p61Var2.f29734l = e7;
            p61Var2.f29736n = f7;
            p61Var2.K(TextUtils.equals(tL_timezone.f20176id, f2Var.f11235n));
            if (f2Var.h && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            p61Var2.f29730g = z11;
            arrayList.add(p61Var2);
            z12 = false;
            i10++;
        }
        c71Var.T();
        if (z12) {
            arrayList.add(p61.l(f2Var.f11231b));
        } else {
            arrayList.add(p61.B(null));
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.TimezoneTitle));
        this.actionBar.setActionBarMenuOnItemClick(new ei.t(this, 16));
        org.telegram.ui.ActionBar.v0 a2 = this.actionBar.o().a(1, R.drawable.outline_header_search);
        a2.F();
        a2.H = new e2(this, 0);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(i6.x0(null, i6.f20741a7, false));
        k71 k71Var = new k71(this, new l7(this, 1), new c5(this, 6), null);
        this.f11230a = k71Var;
        k71Var.p1();
        this.actionBar.setAdaptiveBackground(this.f11230a);
        frameLayout.addView(this.f11230a, x5.d(-1.0f, -1));
        this.f11230a.setOnScrollListener(new ai.r(this, 10));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f11231b = linearLayout;
        linearLayout.setOrientation(1);
        this.f11231b.setMinimumHeight(AndroidUtilities.dp(500.0f));
        y9 y9Var = new y9(context);
        y9Var.getImageReceiver().setAllowLoadingOnAttachedOnly(false);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(y9Var, "RestrictedEmoji", "🌖", "130_130");
        this.f11231b.addView(y9Var, x5.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.TimezoneNotFound));
        bi.o(i6.f21181y6, this.resourceProvider, textView, 1, 15.0f);
        this.f11231b.addView(textView, x5.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k71 k71Var;
        c71 c71Var;
        if (i10 == NotificationCenter.timezonesUpdated && (k71Var = this.f11230a) != null && (c71Var = k71Var.W2) != null) {
            c71Var.N(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        String c10 = g2.b(this.currentAccount).c();
        this.f11234f = c10;
        this.h = TextUtils.equals(c10, this.f11235n);
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
        this.f11230a.setPadding(0, 0, 0, i13);
        this.f11230a.setClipToPadding(false);
    }
}
