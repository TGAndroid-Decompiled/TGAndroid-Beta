package bi;

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
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wr;
public final class aa extends org.telegram.ui.Components.ab implements NotificationCenter.NotificationCenterDelegate {
    public w9 X;
    public final org.telegram.ui.Cells.i3 Y;
    public final org.telegram.ui.Cells.i3 Z;
    public final FrameLayout f2322a0;
    public final d f2323b0;
    public boolean f2324c0;
    public boolean f2325d0;
    public y2 f2326e0;
    public long f2327f0;
    public TLRPC.WebPage f2328g0;
    public boolean f2329h0;
    public int f2330i0;
    public String f2331j0;
    public final t9 f2332k0;
    public Pattern f2333l0;
    public boolean m0;
    public boolean f2334n0;
    public boolean f2335o0;

    public aa(Context context, d7 d7Var, e8 e8Var, y2 y2Var) {
        super(context, null, true, true, 2, d7Var);
        this.f2332k0 = new t9(this, 0);
        this.f2326e0 = y2Var;
        fixNavigationBar();
        K();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-15.0f);
        org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.StoryLinkURLPlaceholder), true, false, -1, d7Var);
        this.Y = i3Var;
        t9 t9Var = new t9(this, 1);
        org.telegram.ui.Cells.g3 g3Var = i3Var.f19293b;
        g3Var.setImeOptions(6);
        g3Var.setOnEditorActionListener(new m.s2(t9Var, 2));
        g3Var.setHandlesColor(-12476440);
        g3Var.setCursorColor(-11230757);
        g3Var.setText("https://");
        g3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.vision.e2.k(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.Cells.r6.b(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f18126o6);
        textView.setTextColor(themedColor);
        int dp = AndroidUtilities.dp(6.0f);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, themedColor);
        int l12 = org.telegram.ui.ActionBar.j6.l1(0.15f, themedColor);
        textView.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, l1, l12, l12));
        w7.c6.b(textView, 0.1f, 1.5f);
        i3Var.addView(textView, w7.a6.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        a1.e eVar = new a1.e(25, this, textView);
        textView.setOnClickListener(new n3(1, this, eVar));
        eVar.run();
        g3Var.addTextChangedListener(new u9(this, eVar));
        org.telegram.ui.Cells.i3 i3Var2 = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.StoryLinkNamePlaceholder), true, false, -1, d7Var);
        this.Z = i3Var2;
        t9 t9Var2 = new t9(this, 1);
        org.telegram.ui.Cells.g3 g3Var2 = i3Var2.f19293b;
        g3Var2.setImeOptions(6);
        g3Var2.setOnEditorActionListener(new m.s2(t9Var2, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f2322a0 = frameLayout;
        d dVar = new d(context, d7Var, true);
        this.f2323b0 = dVar;
        dVar.g(LocaleController.getString(R.string.StoryLinkAdd), false, true);
        dVar.setOnClickListener(new s9(this, 1));
        dVar.setEnabled(V(i3Var.getText().toString()));
        frameLayout.addView(dVar, w7.a6.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.v = 0.2f;
        this.O = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        v9 v9Var = new v9(this);
        v9Var.f41645m = false;
        v9Var.C = false;
        v9Var.o(wr.h);
        v9Var.n(350L);
        this.d.setItemAnimator(v9Var);
        vl0 vl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new b9(this, context, e8Var, 1));
        w9 w9Var = this.X;
        if (w9Var != null) {
            w9Var.N(false);
        }
    }

    public static void P(aa aaVar, Context context, e8 e8Var, View view, int i10) {
        TLRPC.WebPage webPage;
        String str;
        int i11;
        org.telegram.ui.Cells.i3 i3Var = aaVar.Z;
        org.telegram.ui.Cells.i3 i3Var2 = aaVar.Y;
        v51 G = aaVar.X.G(i10 - 1);
        if (G != null) {
            if (G.G(y9.class) && (webPage = aaVar.f2328g0) != null && !W(webPage)) {
                pg.t2 t2Var = new pg.t2(context, aaVar.currentAccount);
                pg.n0 n0Var = new pg.n0();
                n0Var.f40169c = i3Var2.f19293b.getText().toString();
                if (aaVar.m0) {
                    str = i3Var.f19293b.getText().toString();
                } else {
                    str = null;
                }
                n0Var.f40168b = str;
                TLRPC.WebPage webPage2 = aaVar.f2328g0;
                n0Var.d = webPage2;
                n0Var.e = aaVar.f2335o0;
                n0Var.f40170f = aaVar.f2334n0;
                ai.b bVar = new ai.b(aaVar, 8);
                t2Var.G = n0Var;
                if (webPage2 != null && (webPage2.photo != null || MessageObject.isVideoDocument(webPage2.document))) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                dc0 dc0Var = t2Var.f40310x;
                dc0Var.setVisibility(i11);
                t2Var.f40305f.b(t2Var.f40302a, n0Var, false);
                t2Var.f40309w.a(!n0Var.f40170f, false);
                dc0Var.a(!n0Var.e, false);
                t2Var.H = bVar;
                t2Var.e.setImageDrawable(new w4(e8Var, 8));
                t2Var.show();
            } else if (G.d == 2 && (view instanceof org.telegram.ui.Cells.x8)) {
                boolean z10 = !aaVar.m0;
                aaVar.m0 = z10;
                ((org.telegram.ui.Cells.x8) view).setChecked(z10);
                aaVar.X.N(true);
                if (aaVar.m0) {
                    i3Var.requestFocus();
                } else {
                    i3Var2.requestFocus();
                }
            }
        }
    }

    public static void Q(aa aaVar) {
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        getwebpagepreview.message = aaVar.Y.f19293b.getText().toString();
        aaVar.f2330i0 = ConnectionsManager.getInstance(aaVar.currentAccount).sendRequest(getwebpagepreview, new c2(aaVar, 3));
    }

    public static void R(bi.aa r7, org.telegram.tgnet.TLObject r8) {
        throw new UnsupportedOperationException("Method not decompiled: bi.aa.R(bi.aa, org.telegram.tgnet.TLObject):void");
    }

    public static void S(aa aaVar, String str) {
        t9 t9Var = aaVar.f2332k0;
        if (str == null || TextUtils.equals(str, aaVar.f2331j0)) {
            return;
        }
        aaVar.f2331j0 = str;
        boolean V = aaVar.V(str);
        AndroidUtilities.cancelRunOnUIThread(t9Var);
        if (V) {
            if (!aaVar.f2329h0 || aaVar.f2328g0 != null) {
                aaVar.f2329h0 = true;
                aaVar.f2328g0 = null;
                w9 w9Var = aaVar.X;
                if (w9Var != null) {
                    w9Var.N(true);
                }
            }
            AndroidUtilities.runOnUIThread(t9Var, 700L);
        } else if (aaVar.f2329h0 || aaVar.f2328g0 != null) {
            aaVar.f2329h0 = false;
            aaVar.f2328g0 = null;
            if (aaVar.f2330i0 != 0) {
                ConnectionsManager.getInstance(aaVar.currentAccount).cancelRequest(aaVar.f2330i0, true);
                aaVar.f2330i0 = 0;
            }
            w9 w9Var2 = aaVar.X;
            if (w9Var2 != null) {
                w9Var2.N(true);
            }
        }
        aaVar.f2323b0.setEnabled(V);
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
        this.f2329h0 = false;
        this.f2328g0 = null;
        if (this.f2330i0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f2330i0, true);
            this.f2330i0 = 0;
        }
        w9 w9Var = this.X;
        if (w9Var != null) {
            w9Var.N(true);
        }
    }

    public final boolean V(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f2333l0 == null) {
            this.f2333l0 = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.f2333l0.matcher(str).find();
    }

    public final void X() {
        String str;
        if (!this.f2323b0.W) {
            return;
        }
        if (this.f2326e0 != null) {
            pg.n0 n0Var = new pg.n0();
            n0Var.f40169c = this.Y.f19293b.getText().toString();
            if (this.m0) {
                str = this.Z.f19293b.getText().toString();
            } else {
                str = null;
            }
            n0Var.f40168b = str;
            n0Var.d = this.f2328g0;
            n0Var.e = this.f2335o0;
            n0Var.f40170f = this.f2334n0;
            this.f2326e0.run(n0Var);
            this.f2326e0 = null;
        }
        dismiss();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f2327f0 != 0) {
            a0.i iVar = (a0.i) objArr[0];
            for (int i12 = 0; i12 < iVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) iVar.n(i12);
                if (webPage != null && this.f2327f0 == webPage.f17348id) {
                    if (W(webPage)) {
                        webPage = null;
                    }
                    this.f2328g0 = webPage;
                    this.f2329h0 = false;
                    this.f2327f0 = 0L;
                    w9 w9Var = this.X;
                    if (w9Var != null) {
                        w9Var.N(true);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.Y.f19293b);
        AndroidUtilities.hideKeyboard(this.Z.f19293b);
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        AndroidUtilities.runOnUIThread(new t9(this, 2), 150L);
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        ?? j61Var = new j61(this.d, getContext(), this.currentAccount, 0, true, new ai.c0(this, 7), this.resourcesProvider);
        this.X = j61Var;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoryLinkCreate);
    }
}
