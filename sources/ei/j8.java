package ei;

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
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.qc0;
public final class j8 extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public f8 X;
    public final org.telegram.ui.Cells.h3 Y;
    public final org.telegram.ui.Cells.h3 Z;
    public final FrameLayout f9278a0;
    public final d f9279b0;
    public boolean f9280c0;
    public boolean f9281d0;
    public ai.o2 f9282e0;
    public long f9283f0;
    public TLRPC.WebPage f9284g0;
    public boolean f9285h0;
    public int f9286i0;
    public String f9287j0;
    public final c8 f9288k0;
    public Pattern f9289l0;
    public boolean m0;
    public boolean f9290n0;
    public boolean f9291o0;

    public j8(Context context, t5 t5Var, r6 r6Var, ai.o2 o2Var) {
        super(context, null, true, true, 2, t5Var);
        this.f9288k0 = new c8(this, 0);
        this.f9282e0 = o2Var;
        fixNavigationBar();
        K();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-15.0f);
        org.telegram.ui.Cells.h3 h3Var = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.StoryLinkURLPlaceholder), true, false, -1, t5Var);
        this.Y = h3Var;
        c8 c8Var = new c8(this, 1);
        org.telegram.ui.Cells.f3 f3Var = h3Var.d;
        f3Var.setImeOptions(6);
        f3Var.setOnEditorActionListener(new m.t2(c8Var, 2));
        f3Var.setHandlesColor(-12476440);
        f3Var.setCursorColor(-11230757);
        f3Var.setText("https://");
        f3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.play_billing.k3.m(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.Cells.b1.e(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int i10 = org.telegram.ui.ActionBar.k6.f21386o6;
        int themedColor = getThemedColor(i10);
        org.telegram.ui.ActionBar.r6.W(textView, i10, t5Var);
        int dp = AndroidUtilities.dp(6.0f);
        int o12 = org.telegram.ui.ActionBar.k6.o1(0.12f, themedColor);
        int o13 = org.telegram.ui.ActionBar.k6.o1(0.15f, themedColor);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, o12, o13, o13);
        org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.12f, i10);
        org.telegram.ui.ActionBar.n6 M2 = org.telegram.ui.ActionBar.r6.M(0.15f, i10);
        textView.setBackground(j02);
        org.telegram.ui.ActionBar.r6.k(textView, j02, M, M2, t5Var);
        w7.b6.b(textView, 0.1f, 1.5f);
        h3Var.addView(textView, w7.z5.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        p6 p6Var = new p6(8, this, textView);
        textView.setOnClickListener(new ai.p(15, this, p6Var));
        p6Var.run();
        f3Var.addTextChangedListener(new d8(this, p6Var));
        org.telegram.ui.Cells.h3 h3Var2 = new org.telegram.ui.Cells.h3(context, LocaleController.getString(R.string.StoryLinkNamePlaceholder), true, false, -1, t5Var);
        this.Z = h3Var2;
        c8 c8Var2 = new c8(this, 1);
        org.telegram.ui.Cells.f3 f3Var2 = h3Var2.d;
        f3Var2.setImeOptions(6);
        f3Var2.setOnEditorActionListener(new m.t2(c8Var2, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9278a0 = frameLayout;
        d dVar = new d(context, t5Var, true);
        this.f9279b0 = dVar;
        dVar.i(LocaleController.getString(R.string.StoryLinkAdd), false, true);
        dVar.setOnClickListener(new b8(this, 1));
        dVar.setEnabled(V(h3Var.getText().toString()));
        frameLayout.addView(dVar, w7.z5.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.v = 0.2f;
        this.O = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        e8 e8Var = new e8(this);
        e8Var.f46377m = false;
        e8Var.C = false;
        e8Var.o(bs.h);
        e8Var.n(350L);
        this.d.setItemAnimator(e8Var);
        mm0 mm0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i11, 0, i11, 0);
        this.d.setOnItemClickListener(new ci.g0(this, context, r6Var, 2));
        f8 f8Var = this.X;
        if (f8Var != null) {
            f8Var.N(false);
        }
    }

    public static void P(j8 j8Var, Context context, r6 r6Var, View view, int i10) {
        TLRPC.WebPage webPage;
        String str;
        int i11;
        org.telegram.ui.Cells.h3 h3Var = j8Var.Z;
        org.telegram.ui.Cells.h3 h3Var2 = j8Var.Y;
        m61 G = j8Var.X.G(i10 - 1);
        if (G != null) {
            if (G.G(h8.class) && (webPage = j8Var.f9284g0) != null && !W(webPage)) {
                rg.u2 u2Var = new rg.u2(context, j8Var.currentAccount);
                rg.n0 n0Var = new rg.n0();
                n0Var.f45947c = h3Var2.d.getText().toString();
                if (j8Var.m0) {
                    str = h3Var.d.getText().toString();
                } else {
                    str = null;
                }
                n0Var.f45946b = str;
                TLRPC.WebPage webPage2 = j8Var.f9284g0;
                n0Var.d = webPage2;
                n0Var.e = j8Var.f9291o0;
                n0Var.f45948f = j8Var.f9290n0;
                ai.r0 r0Var = new ai.r0(j8Var, 21);
                u2Var.G = n0Var;
                if (webPage2 != null && (webPage2.photo != null || MessageObject.isVideoDocument(webPage2.document))) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                qc0 qc0Var = u2Var.f46092x;
                qc0Var.setVisibility(i11);
                u2Var.f46087f.b(u2Var.f46084a, n0Var, false);
                u2Var.f46091w.a(!n0Var.f45948f, false);
                qc0Var.a(!n0Var.e, false);
                u2Var.H = r0Var;
                u2Var.e.setImageDrawable(new w3(r6Var, 7));
                u2Var.show();
            } else if (G.d == 2 && (view instanceof org.telegram.ui.Cells.w8)) {
                boolean z10 = !j8Var.m0;
                j8Var.m0 = z10;
                ((org.telegram.ui.Cells.w8) view).setChecked(z10);
                j8Var.X.N(true);
                if (j8Var.m0) {
                    h3Var.requestFocus();
                } else {
                    h3Var2.requestFocus();
                }
            }
        }
    }

    public static void Q(j8 j8Var) {
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        getwebpagepreview.message = j8Var.Y.d.getText().toString();
        j8Var.f9286i0 = ConnectionsManager.getInstance(j8Var.currentAccount).sendRequest(getwebpagepreview, new ai.h(j8Var, 12));
    }

    public static void R(ei.j8 r7, org.telegram.tgnet.TLObject r8) {
        throw new UnsupportedOperationException("Method not decompiled: ei.j8.R(ei.j8, org.telegram.tgnet.TLObject):void");
    }

    public static void S(j8 j8Var, String str) {
        c8 c8Var = j8Var.f9288k0;
        if (str == null || TextUtils.equals(str, j8Var.f9287j0)) {
            return;
        }
        j8Var.f9287j0 = str;
        boolean V = j8Var.V(str);
        AndroidUtilities.cancelRunOnUIThread(c8Var);
        if (V) {
            if (!j8Var.f9285h0 || j8Var.f9284g0 != null) {
                j8Var.f9285h0 = true;
                j8Var.f9284g0 = null;
                f8 f8Var = j8Var.X;
                if (f8Var != null) {
                    f8Var.N(true);
                }
            }
            AndroidUtilities.runOnUIThread(c8Var, 700L);
        } else if (j8Var.f9285h0 || j8Var.f9284g0 != null) {
            j8Var.f9285h0 = false;
            j8Var.f9284g0 = null;
            if (j8Var.f9286i0 != 0) {
                ConnectionsManager.getInstance(j8Var.currentAccount).cancelRequest(j8Var.f9286i0, true);
                j8Var.f9286i0 = 0;
            }
            f8 f8Var2 = j8Var.X;
            if (f8Var2 != null) {
                f8Var2.N(true);
            }
        }
        j8Var.f9279b0.setEnabled(V);
    }

    public static boolean W(TLRPC.WebPage webPage) {
        if (!(webPage instanceof TLRPC.TL_webPagePending)) {
            if (!TextUtils.isEmpty(webPage.title) || !TextUtils.isEmpty(webPage.description)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void U() {
        this.f9285h0 = false;
        this.f9284g0 = null;
        if (this.f9286i0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f9286i0, true);
            this.f9286i0 = 0;
        }
        f8 f8Var = this.X;
        if (f8Var != null) {
            f8Var.N(true);
        }
    }

    public final boolean V(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f9289l0 == null) {
            this.f9289l0 = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.f9289l0.matcher(str).find();
    }

    public final void X() {
        String str;
        if (!this.f9279b0.f8862c0) {
            return;
        }
        if (this.f9282e0 != null) {
            rg.n0 n0Var = new rg.n0();
            n0Var.f45947c = this.Y.d.getText().toString();
            if (this.m0) {
                str = this.Z.d.getText().toString();
            } else {
                str = null;
            }
            n0Var.f45946b = str;
            n0Var.d = this.f9284g0;
            n0Var.e = this.f9291o0;
            n0Var.f45948f = this.f9290n0;
            this.f9282e0.run(n0Var);
            this.f9282e0 = null;
        }
        dismiss();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f9283f0 != 0) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i12 = 0; i12 < hVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i12);
                if (webPage != null && this.f9283f0 == webPage.f20496id) {
                    if (W(webPage)) {
                        webPage = null;
                    }
                    this.f9284g0 = webPage;
                    this.f9285h0 = false;
                    this.f9283f0 = 0L;
                    f8 f8Var = this.X;
                    if (f8Var != null) {
                        f8Var.N(true);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.Y.d);
        AndroidUtilities.hideKeyboard(this.Z.d);
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        AndroidUtilities.runOnUIThread(new c8(this, 2), 150L);
    }

    @Override
    public final lm0 w(mm0 mm0Var) {
        ?? b71Var = new b71(this.d, getContext(), this.currentAccount, 0, true, new ai.q(this, 18), this.resourcesProvider);
        this.X = b71Var;
        return b71Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.StoryLinkCreate);
    }
}
