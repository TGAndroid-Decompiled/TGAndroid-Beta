package di;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.uc0;
public final class t8 extends org.telegram.ui.Components.db implements NotificationCenter.NotificationCenterDelegate {
    public p8 X;
    public final org.telegram.ui.Cells.j3 Y;
    public final org.telegram.ui.Cells.j3 Z;
    public final FrameLayout f7841a0;
    public final d f7842b0;
    public boolean f7843c0;
    public boolean f7844d0;
    public bi.v2 f7845e0;
    public long f7846f0;
    public TLRPC.WebPage f7847g0;
    public boolean f7848h0;
    public int f7849i0;
    public String f7850j0;
    public final m8 f7851k0;
    public Pattern f7852l0;
    public boolean m0;
    public boolean f7853n0;
    public boolean f7854o0;

    public t8(Context context, c6 c6Var, a7 a7Var, bi.v2 v2Var) {
        super(context, null, true, true, 2, c6Var);
        this.f7851k0 = new m8(this, 0);
        this.f7845e0 = v2Var;
        fixNavigationBar();
        L();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-15.0f);
        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.StoryLinkURLPlaceholder), true, false, -1, c6Var);
        this.Y = j3Var;
        m8 m8Var = new m8(this, 1);
        org.telegram.ui.Cells.h3 h3Var = j3Var.f21083b;
        h3Var.setImeOptions(6);
        h3Var.setOnEditorActionListener(new m.u2(m8Var, 2));
        h3Var.setHandlesColor(-12476440);
        h3Var.setCursorColor(-11230757);
        h3Var.setText("https://");
        h3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.play_billing.k3.m(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.Cells.c1.b(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.f19804o6);
        textView.setTextColor(themedColor);
        int dp = AndroidUtilities.dp(6.0f);
        int m12 = org.telegram.ui.ActionBar.g6.m1(0.12f, themedColor);
        int m13 = org.telegram.ui.ActionBar.g6.m1(0.15f, themedColor);
        textView.setBackground(org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, m12, m13, m13));
        w7.b6.b(textView, 0.1f, 1.5f);
        j3Var.addView(textView, w7.z5.a(26.0f, 0.0f, 4.0f, 24.0f, 3.0f, -2, 21));
        y6 y6Var = new y6(10, this, textView);
        textView.setOnClickListener(new bi.u1(5, this, y6Var));
        y6Var.run();
        h3Var.addTextChangedListener(new n8(this, y6Var));
        org.telegram.ui.Cells.j3 j3Var2 = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.StoryLinkNamePlaceholder), true, false, -1, c6Var);
        this.Z = j3Var2;
        m8 m8Var2 = new m8(this, 1);
        org.telegram.ui.Cells.h3 h3Var2 = j3Var2.f21083b;
        h3Var2.setImeOptions(6);
        h3Var2.setOnEditorActionListener(new m.u2(m8Var2, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f7841a0 = frameLayout;
        d dVar = new d(context, c6Var, true);
        this.f7842b0 = dVar;
        dVar.g(LocaleController.getString(R.string.StoryLinkAdd), false, true);
        dVar.setOnClickListener(new l8(this, 1));
        dVar.setEnabled(W(j3Var.getText().toString()));
        frameLayout.addView(dVar, w7.z5.a(48.0f, 10.0f, 10.0f, 10.0f, 10.0f, -1, 119));
        this.v = 0.2f;
        this.O = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        o8 o8Var = new o8(this);
        o8Var.f44872m = false;
        o8Var.C = false;
        o8Var.o(es.h);
        o8Var.n(350L);
        this.d.setItemAnimator(o8Var);
        mm0 mm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new bi.n0(this, context, a7Var, 2));
        p8 p8Var = this.X;
        if (p8Var != null) {
            p8Var.N(false);
        }
    }

    public static void Q(t8 t8Var, Context context, a7 a7Var, View view, int i10) {
        TLRPC.WebPage webPage;
        String str;
        int i11;
        org.telegram.ui.Cells.j3 j3Var = t8Var.Z;
        org.telegram.ui.Cells.j3 j3Var2 = t8Var.Y;
        m61 G = t8Var.X.G(i10 - 1);
        if (G != null) {
            if (G.G(r8.class) && (webPage = t8Var.f7847g0) != null && !X(webPage)) {
                rg.v2 v2Var = new rg.v2(context, t8Var.currentAccount);
                rg.p0 p0Var = new rg.p0();
                p0Var.f44206c = j3Var2.f21083b.getText().toString();
                if (t8Var.m0) {
                    str = j3Var.f21083b.getText().toString();
                } else {
                    str = null;
                }
                p0Var.f44205b = str;
                TLRPC.WebPage webPage2 = t8Var.f7847g0;
                p0Var.d = webPage2;
                p0Var.e = t8Var.f7854o0;
                p0Var.f44207f = t8Var.f7853n0;
                bi.o1 o1Var = new bi.o1(t8Var, 15);
                v2Var.G = p0Var;
                if (webPage2 != null && (webPage2.photo != null || MessageObject.isVideoDocument(webPage2.document))) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                uc0 uc0Var = v2Var.f44348x;
                uc0Var.setVisibility(i11);
                v2Var.f44343f.b(v2Var.f44340a, p0Var, false);
                v2Var.f44347w.a(!p0Var.f44207f, false);
                uc0Var.a(!p0Var.e, false);
                v2Var.H = o1Var;
                v2Var.e.setImageDrawable(new c4(a7Var, 7));
                v2Var.show();
            } else if (G.d == 2 && (view instanceof org.telegram.ui.Cells.w8)) {
                boolean z10 = !t8Var.m0;
                t8Var.m0 = z10;
                ((org.telegram.ui.Cells.w8) view).setChecked(z10);
                t8Var.X.N(true);
                if (t8Var.m0) {
                    j3Var.requestFocus();
                } else {
                    j3Var2.requestFocus();
                }
            }
        }
    }

    public static void R(t8 t8Var) {
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        getwebpagepreview.message = t8Var.Y.f21083b.getText().toString();
        t8Var.f7849i0 = ConnectionsManager.getInstance(t8Var.currentAccount).sendRequest(getwebpagepreview, new bi.z7(t8Var, 6));
    }

    public static void S(di.t8 r7, org.telegram.tgnet.TLObject r8) {
        throw new UnsupportedOperationException("Method not decompiled: di.t8.S(di.t8, org.telegram.tgnet.TLObject):void");
    }

    public static void T(t8 t8Var, String str) {
        m8 m8Var = t8Var.f7851k0;
        if (str == null || TextUtils.equals(str, t8Var.f7850j0)) {
            return;
        }
        t8Var.f7850j0 = str;
        boolean W = t8Var.W(str);
        AndroidUtilities.cancelRunOnUIThread(m8Var);
        if (W) {
            if (!t8Var.f7848h0 || t8Var.f7847g0 != null) {
                t8Var.f7848h0 = true;
                t8Var.f7847g0 = null;
                p8 p8Var = t8Var.X;
                if (p8Var != null) {
                    p8Var.N(true);
                }
            }
            AndroidUtilities.runOnUIThread(m8Var, 700L);
        } else if (t8Var.f7848h0 || t8Var.f7847g0 != null) {
            t8Var.f7848h0 = false;
            t8Var.f7847g0 = null;
            if (t8Var.f7849i0 != 0) {
                ConnectionsManager.getInstance(t8Var.currentAccount).cancelRequest(t8Var.f7849i0, true);
                t8Var.f7849i0 = 0;
            }
            p8 p8Var2 = t8Var.X;
            if (p8Var2 != null) {
                p8Var2.N(true);
            }
        }
        t8Var.f7842b0.setEnabled(W);
    }

    public static boolean X(TLRPC.WebPage webPage) {
        if (!(webPage instanceof TLRPC.TL_webPagePending)) {
            if (!TextUtils.isEmpty(webPage.title) || !TextUtils.isEmpty(webPage.description)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final CharSequence B() {
        return LocaleController.getString(R.string.StoryLinkCreate);
    }

    public final void V() {
        this.f7848h0 = false;
        this.f7847g0 = null;
        if (this.f7849i0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f7849i0, true);
            this.f7849i0 = 0;
        }
        p8 p8Var = this.X;
        if (p8Var != null) {
            p8Var.N(true);
        }
    }

    public final boolean W(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f7852l0 == null) {
            this.f7852l0 = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.f7852l0.matcher(str).find();
    }

    public final void Y() {
        String str;
        if (!this.f7842b0.W) {
            return;
        }
        if (this.f7845e0 != null) {
            rg.p0 p0Var = new rg.p0();
            p0Var.f44206c = this.Y.f21083b.getText().toString();
            if (this.m0) {
                str = this.Z.f21083b.getText().toString();
            } else {
                str = null;
            }
            p0Var.f44205b = str;
            p0Var.d = this.f7847g0;
            p0Var.e = this.f7854o0;
            p0Var.f44207f = this.f7853n0;
            this.f7845e0.run(p0Var);
            this.f7845e0 = null;
        }
        dismiss();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f7846f0 != 0) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i12 = 0; i12 < hVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i12);
                if (webPage != null && this.f7846f0 == webPage.f19069id) {
                    if (X(webPage)) {
                        webPage = null;
                    }
                    this.f7847g0 = webPage;
                    this.f7848h0 = false;
                    this.f7846f0 = 0L;
                    p8 p8Var = this.X;
                    if (p8Var != null) {
                        p8Var.N(true);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.Y.f21083b);
        AndroidUtilities.hideKeyboard(this.Z.f21083b);
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        AndroidUtilities.runOnUIThread(new m8(this, 2), 150L);
    }

    @Override
    public final lm0 x(mm0 mm0Var) {
        ?? a71Var = new a71(this.d, getContext(), this.currentAccount, 0, true, new ci.u(this, 7), this.resourcesProvider);
        this.X = a71Var;
        return a71Var;
    }
}
