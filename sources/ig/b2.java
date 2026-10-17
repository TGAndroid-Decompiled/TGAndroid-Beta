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
import org.telegram.messenger.wh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.v8;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.w9;
import w7.z5;
public final class b2 extends n2 implements NotificationCenter.NotificationCenterDelegate {
    public a71 f12843a;
    public LinearLayout f12844b;
    public ai.n2 f12845c;
    public boolean d;
    public String e;
    public String f12846f;
    public boolean h;
    public String f12847n;

    public static void U(b2 b2Var, f61 f61Var, View view) {
        if (f61Var.d == -1) {
            boolean z10 = b2Var.h;
            b2Var.h = !z10;
            if (!z10) {
                String str = b2Var.f12846f;
                b2Var.f12847n = str;
                ai.n2 n2Var = b2Var.f12845c;
                if (n2Var != null) {
                    n2Var.run(str);
                }
            }
            ((v8) view).setChecked(b2Var.h);
            b2Var.f12843a.W2.N(true);
        } else if (view.isEnabled()) {
            d2 b10 = d2.b(b2Var.currentAccount);
            ArrayList arrayList = b10.d;
            int i10 = f61Var.d;
            if (i10 >= 0) {
                b10.g();
                if (i10 < arrayList.size()) {
                    b10.g();
                    b2Var.h = false;
                    String str2 = ((TLRPC.TL_timezone) arrayList.get(f61Var.d)).f20410id;
                    b2Var.f12847n = str2;
                    ai.n2 n2Var2 = b2Var.f12845c;
                    if (n2Var2 != null) {
                        n2Var2.run(str2);
                    }
                    if (b2Var.d) {
                        b2Var.actionBar.h(true);
                    }
                    b2Var.f12843a.W2.N(true);
                }
            }
        }
    }

    public static void V(b2 b2Var, ArrayList arrayList, s61 s61Var) {
        boolean z10;
        boolean z11;
        if (b2Var.d && !TextUtils.isEmpty(b2Var.e)) {
            z10 = true;
        } else {
            z10 = false;
        }
        d2 b10 = d2.b(b2Var.currentAccount);
        ArrayList arrayList2 = b10.d;
        if (!z10) {
            s61Var.U();
            String string = LocaleController.getString(R.string.TimezoneDetectAutomatically);
            f61 f61Var = new f61(9);
            f61Var.d = -1;
            f61Var.f26140l = string;
            f61Var.K(b2Var.h);
            arrayList.add(f61Var);
            s61Var.T();
            arrayList.add(f61.B(LocaleController.formatString(R.string.TimezoneDetectAutomaticallyInfo, b10.d(b2Var.f12847n, true))));
        }
        s61Var.U();
        if (!z10) {
            i0.a.p(R.string.TimezoneHeader, arrayList);
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
            CharSequence e = d2.e(tL_timezone, false);
            if (z10) {
                String replace = AndroidUtilities.translitSafe(tL_timezone.name).toLowerCase().replace("/", " ");
                String lowerCase = AndroidUtilities.translitSafe(b2Var.e).toLowerCase();
                if (wh.w(" ", lowerCase, replace) || replace.startsWith(lowerCase)) {
                    e = AndroidUtilities.highlightText(e, b2Var.e, b2Var.resourceProvider);
                } else {
                    i10++;
                }
            }
            String f7 = d2.f(tL_timezone);
            f61 f61Var2 = new f61(10);
            f61Var2.d = i10;
            f61Var2.f26140l = e;
            f61Var2.f26142n = f7;
            f61Var2.K(TextUtils.equals(tL_timezone.f20410id, b2Var.f12847n));
            if (b2Var.h && !z10) {
                z11 = false;
            } else {
                z11 = true;
            }
            f61Var2.f26136g = z11;
            arrayList.add(f61Var2);
            z12 = false;
            i10++;
        }
        s61Var.T();
        if (z12) {
            arrayList.add(f61.l(b2Var.f12844b));
        } else {
            arrayList.add(f61.B(null));
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
        a2.H = new a2(this, 0);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(h6.x0(null, h6.f20928a7, false));
        a71 a71Var = new a71(this, new hg.o(this, 10), new e1.c(this, 23), null);
        this.f12843a = a71Var;
        a71Var.p1();
        this.actionBar.setAdaptiveBackground(this.f12843a);
        frameLayout.addView(this.f12843a, z5.d(-1.0f, -1));
        this.f12843a.setOnScrollListener(new ah.d0(this, 15));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f12844b = linearLayout;
        linearLayout.setOrientation(1);
        this.f12844b.setMinimumHeight(AndroidUtilities.dp(500.0f));
        w9 w9Var = new w9(context);
        w9Var.getImageReceiver().setAllowLoadingOnAttachedOnly(false);
        MediaDataController.getInstance(this.currentAccount).setPlaceholderImage(w9Var, "RestrictedEmoji", "🌖", "130_130");
        this.f12844b.addView(w9Var, z5.t(130, 130, 49, 0, 42, 0, 12));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString(R.string.TimezoneNotFound));
        wh.o(h6.f21374y6, this.resourceProvider, textView, 1, 15.0f);
        this.f12844b.addView(textView, z5.t(-2, -2, 49, 0, 0, 0, 0));
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a71 a71Var;
        s61 s61Var;
        if (i10 == NotificationCenter.timezonesUpdated && (a71Var = this.f12843a) != null && (s61Var = a71Var.W2) != null) {
            s61Var.N(true);
        }
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
        String c10 = d2.b(this.currentAccount).c();
        this.f12846f = c10;
        this.h = TextUtils.equals(c10, this.f12847n);
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
        this.f12843a.setPadding(0, 0, 0, i13);
        this.f12843a.setClipToPadding(false);
    }
}
