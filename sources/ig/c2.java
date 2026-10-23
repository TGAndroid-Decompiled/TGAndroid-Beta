package ig;

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
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.w9;
import w7.z5;
public final class c2 extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public j71 f12885a;
    public LinearLayout f12886b;
    public ai.o2 f12887c;
    public boolean d;
    public String e;
    public String f12888f;
    public boolean h;
    public String f12889n;

    public static void U(c2 c2Var, m61 m61Var, View view) {
        if (m61Var.d == -1) {
            boolean z10 = c2Var.h;
            c2Var.h = !z10;
            if (!z10) {
                String str = c2Var.f12888f;
                c2Var.f12889n = str;
                ai.o2 o2Var = c2Var.f12887c;
                if (o2Var != null) {
                    o2Var.run(str);
                }
            }
            ((w8) view).setChecked(c2Var.h);
            c2Var.f12885a.Z2.N(true);
        } else if (view.isEnabled()) {
            e2 b10 = e2.b(c2Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = m61Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 < arrayList.size()) {
                    b10.g();
                    c2Var.h = false;
                    String str2 = ((TLRPC.TL_timezone) arrayList.get(m61Var.d)).f20481id;
                    c2Var.f12889n = str2;
                    ai.o2 o2Var2 = c2Var.f12887c;
                    if (o2Var2 != null) {
                        o2Var2.run(str2);
                    }
                    if (c2Var.d) {
                        c2Var.actionBar.g(true);
                    }
                    c2Var.f12885a.Z2.N(true);
                }
            }
        }
    }

    public static void V(c2 c2Var, ArrayList arrayList, b71 b71Var) {
        boolean z10;
        boolean z11;
        if (c2Var.d && !TextUtils.isEmpty(c2Var.e)) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2 b10 = e2.b(c2Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z10) {
            b71Var.U();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            m61 m61Var = new m61(9);
            m61Var.d = -1;
            m61Var.f28559l = string;
            m61Var.K(c2Var.h);
            arrayList.add(m61Var);
            b71Var.T();
            arrayList.add(m61.B(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, b10.d(c2Var.f12889n, true))));
        }
        b71Var.U();
        if (!z10) {
            i2.o1.q(R.string.TimezoneHeader, arrayList);
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
            CharSequence e = e2.e(tL_timezone, false);
            if (z10) {
                String replace = AndroidUtilities.translitSafe(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = AndroidUtilities.translitSafe(c2Var.e).toLowerCase();
                if (org.telegram.messenger.v0.w(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e = AndroidUtilities.highlightText(e, c2Var.e, c2Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f7 = e2.f(tL_timezone);
            m61 m61Var2 = new m61(10);
            m61Var2.d = i10;
            m61Var2.f28559l = e;
            m61Var2.f28561n = f7;
            m61Var2.K(TextUtils.equals(tL_timezone.f20481id, c2Var.f12889n));
            if (c2Var.h && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            m61Var2.f28555g = z11;
            arrayList.add(m61Var2);
            z12 = false;
            i10++;
        }
        b71Var.T();
        if (z12) {
            arrayList.add(m61.l(c2Var.f12886b));
        } else {
            arrayList.add(m61.B(null));
        }
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.TimezoneTitle));
        this.actionBar.setActionBarMenuOnItemClick(new ah.s(this, 18));
        org.telegram.ui.ActionBar.u0 a2 = this.actionBar.m().a(1, R.drawable.outline_header_search);
        a2.F();
        a2.H = new b2(this, 0);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        r6.i(k6.f21125a7, frameLayout, null);
        j71 j71Var = new j71(this, new hg.o(this, 10), new e1.c(this, 23), null);
        this.f12885a = j71Var;
        j71Var.t1();
        this.actionBar.setAdaptiveBackground(this.f12885a);
        frameLayout.addView(this.f12885a, z5.c(-1.0f, -1));
        this.f12885a.setOnScrollListener(new ah.d0(this, 15));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f12886b = linearLayout;
        linearLayout.setOrientation(1);
        this.f12886b.setMinimumHeight(AndroidUtilities.dp(500.0f));
        w9 w9Var = new w9(context);
        w9Var.getImageReceiver().setAllowLoadingOnAttachedOnly(false);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(w9Var, "RestrictedEmoji", "🌖", "130_130");
        this.f12886b.addView(w9Var, z5.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.TimezoneNotFound));
        r6.W(textView, k6.f21571y6, this.resourceProvider);
        textView.setTextSize(1, 15.0f);
        this.f12886b.addView(textView, z5.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        j71 j71Var;
        b71 b71Var;
        if (i10 == NotificationCenter.timezonesUpdated && (j71Var = this.f12885a) != null && (b71Var = j71Var.Z2) != null) {
            b71Var.N(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        String c10 = e2.b(this.currentAccount).c();
        this.f12888f = c10;
        this.h = TextUtils.equals(c10, this.f12889n);
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
        this.f12885a.setPadding(0, 0, 0, i13);
        this.f12885a.setClipToPadding(false);
    }
}
