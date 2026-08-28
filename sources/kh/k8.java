package kh;

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
import org.telegram.ui.Components.bb0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class k8 extends org.telegram.ui.Components.sa implements NotificationCenter.NotificationCenterDelegate {
    public g8 T;
    public final org.telegram.ui.Cells.j3 U;
    public final org.telegram.ui.Cells.j3 V;
    public final FrameLayout W;
    public final d X;
    public boolean Y;
    public boolean Z;
    public fh.f1 f15539a0;
    public long f15540b0;
    public TLRPC.WebPage f15541c0;
    public boolean f15542d0;
    public int f15543e0;
    public String f15544f0;
    public final d8 f15545g0;
    public Pattern f15546h0;
    public boolean f15547i0;
    public boolean f15548j0;
    public boolean f15549k0;

    public k8(Context context, u5 u5Var, r6 r6Var, fh.f1 f1Var) {
        super(context, null, true, false, false, false, true, 2, u5Var);
        this.f15545g0 = new d8(this, 0);
        this.f15539a0 = f1Var;
        fixNavigationBar();
        J();
        this.E = AndroidUtilities.dp(4.0f);
        this.F = AndroidUtilities.dp(-15.0f);
        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.StoryLinkURLPlaceholder), true, false, -1, u5Var);
        this.U = j3Var;
        d8 d8Var = new d8(this, 1);
        org.telegram.ui.Cells.h3 h3Var = j3Var.f24544b;
        h3Var.setImeOptions(6);
        h3Var.setOnEditorActionListener(new m.u2(d8Var, 2));
        h3Var.setHandlesColor(-12476440);
        h3Var.setCursorColor(-11230757);
        h3Var.setText("https://");
        h3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        j3.r0.u(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.Cells.j2.c(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.f6.o6);
        textView.setTextColor(themedColor);
        int dp = AndroidUtilities.dp(6.0f);
        int l1 = org.telegram.ui.ActionBar.f6.l1(0.12f, themedColor);
        int l12 = org.telegram.ui.ActionBar.f6.l1(0.15f, themedColor);
        textView.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, l1, l12, l12));
        g7.g6.b(textView, 0.1f, 1.5f);
        j3Var.addView(textView, g7.e6.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        ih.j7 j7Var = new ih.j7(27, this, textView);
        textView.setOnClickListener(new bg.u1(26, this, j7Var));
        j7Var.run();
        h3Var.addTextChangedListener(new e8(this, j7Var));
        org.telegram.ui.Cells.j3 j3Var2 = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.StoryLinkNamePlaceholder), true, false, -1, u5Var);
        this.V = j3Var2;
        d8 d8Var2 = new d8(this, 1);
        org.telegram.ui.Cells.h3 h3Var2 = j3Var2.f24544b;
        h3Var2.setImeOptions(6);
        h3Var2.setOnEditorActionListener(new m.u2(d8Var2, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        d dVar = new d(context, u5Var, true);
        this.X = dVar;
        dVar.g(LocaleController.getString(R.string.StoryLinkAdd), false, true);
        dVar.setOnClickListener(new c8(this, 1));
        dVar.setEnabled(U(j3Var.getText().toString()));
        frameLayout.addView(dVar, g7.e6.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.v = 0.2f;
        this.K = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        f8 f8Var = new f8(this);
        f8Var.f5532m = false;
        f8Var.C = false;
        f8Var.o(gr.h);
        f8Var.n(350L);
        this.d.setItemAnimator(f8Var);
        wk0 wk0Var = this.d;
        int i9 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i9, 0, i9, 0);
        this.d.setOnItemClickListener(new ih.f0(this, context, r6Var, 2));
        g8 g8Var = this.T;
        if (g8Var != null) {
            g8Var.N(false);
        }
    }

    public static void O(k8 k8Var, Context context, r6 r6Var, View view, int i9) {
        TLRPC.WebPage webPage;
        String str;
        int i10;
        org.telegram.ui.Cells.j3 j3Var = k8Var.V;
        org.telegram.ui.Cells.j3 j3Var2 = k8Var.U;
        l41 G = k8Var.T.G(i9 - 1);
        if (G != null) {
            if (G.G(i8.class) && (webPage = k8Var.f15541c0) != null && !V(webPage)) {
                yf.t2 t2Var = new yf.t2(context, k8Var.currentAccount);
                yf.m0 m0Var = new yf.m0();
                m0Var.f49977c = j3Var2.f24544b.getText().toString();
                if (k8Var.f15547i0) {
                    str = j3Var.f24544b.getText().toString();
                } else {
                    str = null;
                }
                m0Var.f49976b = str;
                TLRPC.WebPage webPage2 = k8Var.f15541c0;
                m0Var.d = webPage2;
                m0Var.f49978e = k8Var.f15549k0;
                m0Var.f49979f = k8Var.f15548j0;
                bg.i iVar = new bg.i(k8Var, 29);
                t2Var.C = m0Var;
                if (webPage2 != null && (webPage2.photo != null || MessageObject.isVideoDocument(webPage2.document))) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                bb0 bb0Var = t2Var.f50119x;
                bb0Var.setVisibility(i10);
                t2Var.f50114f.b(t2Var.f50110a, m0Var, false);
                t2Var.f50118w.a(!m0Var.f49979f, false);
                bb0Var.a(!m0Var.f49978e, false);
                t2Var.D = iVar;
                t2Var.f50113e.setImageDrawable(new w3(r6Var, 8));
                t2Var.show();
            } else if (G.d == 2 && (view instanceof org.telegram.ui.Cells.t8)) {
                boolean z10 = !k8Var.f15547i0;
                k8Var.f15547i0 = z10;
                ((org.telegram.ui.Cells.t8) view).setChecked(z10);
                k8Var.T.N(true);
                if (k8Var.f15547i0) {
                    j3Var.requestFocus();
                } else {
                    j3Var2.requestFocus();
                }
            }
        }
    }

    public static void P(k8 k8Var) {
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        getwebpagepreview.message = k8Var.U.f24544b.getText().toString();
        k8Var.f15543e0 = ConnectionsManager.getInstance(k8Var.currentAccount).sendRequest(getwebpagepreview, new bf.a(k8Var, 17));
    }

    public static void Q(kh.k8 r7, org.telegram.tgnet.TLObject r8) {
        throw new UnsupportedOperationException("Method not decompiled: kh.k8.Q(kh.k8, org.telegram.tgnet.TLObject):void");
    }

    public static void R(k8 k8Var, String str) {
        d8 d8Var = k8Var.f15545g0;
        if (str == null || TextUtils.equals(str, k8Var.f15544f0)) {
            return;
        }
        k8Var.f15544f0 = str;
        boolean U = k8Var.U(str);
        AndroidUtilities.cancelRunOnUIThread(d8Var);
        if (U) {
            if (!k8Var.f15542d0 || k8Var.f15541c0 != null) {
                k8Var.f15542d0 = true;
                k8Var.f15541c0 = null;
                g8 g8Var = k8Var.T;
                if (g8Var != null) {
                    g8Var.N(true);
                }
            }
            AndroidUtilities.runOnUIThread(d8Var, 700L);
        } else if (k8Var.f15542d0 || k8Var.f15541c0 != null) {
            k8Var.f15542d0 = false;
            k8Var.f15541c0 = null;
            if (k8Var.f15543e0 != 0) {
                ConnectionsManager.getInstance(k8Var.currentAccount).cancelRequest(k8Var.f15543e0, true);
                k8Var.f15543e0 = 0;
            }
            g8 g8Var2 = k8Var.T;
            if (g8Var2 != null) {
                g8Var2.N(true);
            }
        }
        k8Var.X.setEnabled(U);
    }

    public static boolean V(TLRPC.WebPage webPage) {
        if (!(webPage instanceof TLRPC.TL_webPagePending)) {
            if (!TextUtils.isEmpty(webPage.title) || !TextUtils.isEmpty(webPage.description)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void T() {
        this.f15542d0 = false;
        this.f15541c0 = null;
        if (this.f15543e0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f15543e0, true);
            this.f15543e0 = 0;
        }
        g8 g8Var = this.T;
        if (g8Var != null) {
            g8Var.N(true);
        }
    }

    public final boolean U(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f15546h0 == null) {
            this.f15546h0 = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.f15546h0.matcher(str).find();
    }

    public final void W() {
        String str;
        if (!this.X.S) {
            return;
        }
        if (this.f15539a0 != null) {
            yf.m0 m0Var = new yf.m0();
            m0Var.f49977c = this.U.f24544b.getText().toString();
            if (this.f15547i0) {
                str = this.V.f24544b.getText().toString();
            } else {
                str = null;
            }
            m0Var.f49976b = str;
            m0Var.d = this.f15541c0;
            m0Var.f49978e = this.f15549k0;
            m0Var.f49979f = this.f15548j0;
            this.f15539a0.run(m0Var);
            this.f15539a0 = null;
        }
        dismiss();
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.didReceivedWebpagesInUpdates && this.f15540b0 != 0) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i11 = 0; i11 < hVar.m(); i11++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i11);
                if (webPage != null && this.f15540b0 == webPage.f22533id) {
                    if (V(webPage)) {
                        webPage = null;
                    }
                    this.f15541c0 = webPage;
                    this.f15542d0 = false;
                    this.f15540b0 = 0L;
                    g8 g8Var = this.T;
                    if (g8Var != null) {
                        g8Var.N(true);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.U.f24544b);
        AndroidUtilities.hideKeyboard(this.V.f24544b);
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        AndroidUtilities.runOnUIThread(new d8(this, 2), 150L);
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        ?? z41Var = new z41(this.d, getContext(), this.currentAccount, 0, true, new b8(this, 0), this.resourcesProvider);
        this.T = z41Var;
        return z41Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoryLinkCreate);
    }
}
