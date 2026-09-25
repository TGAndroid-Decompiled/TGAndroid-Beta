package ci;

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
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wl0;
public final class u8 extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public q8 X;
    public final org.telegram.ui.Cells.j3 Y;
    public final org.telegram.ui.Cells.j3 Z;
    public final FrameLayout f5617a0;
    public final d f5618b0;
    public boolean f5619c0;
    public boolean f5620d0;
    public ai.g3 f5621e0;
    public long f5622f0;
    public TLRPC.WebPage f5623g0;
    public boolean f5624h0;
    public int f5625i0;
    public String f5626j0;
    public final n8 f5627k0;
    public Pattern f5628l0;
    public boolean m0;
    public boolean f5629n0;
    public boolean f5630o0;

    public u8(Context context, d6 d6Var, b7 b7Var, ai.g3 g3Var) {
        super(context, null, true, true, 2, d6Var);
        this.f5627k0 = new n8(this, 0);
        this.f5621e0 = g3Var;
        fixNavigationBar();
        K();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-15.0f);
        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.StoryLinkURLPlaceholder), true, false, -1, d6Var);
        this.Y = j3Var;
        n8 n8Var = new n8(this, 1);
        org.telegram.ui.Cells.h3 h3Var = j3Var.f20492b;
        h3Var.setImeOptions(6);
        h3Var.setOnEditorActionListener(new m.s2(n8Var, 2));
        h3Var.setHandlesColor(-12476440);
        h3Var.setCursorColor(-11230757);
        h3Var.setText("https://");
        h3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.vision.e2.l(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.Cells.c1.c(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.f19261o6);
        textView.setTextColor(themedColor);
        int dp = AndroidUtilities.dp(6.0f);
        int l1 = org.telegram.ui.ActionBar.h6.l1(0.12f, themedColor);
        int l12 = org.telegram.ui.ActionBar.h6.l1(0.15f, themedColor);
        textView.setBackground(org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, l1, l12, l12));
        w7.a6.b(textView, 0.1f, 1.5f);
        j3Var.addView(textView, w7.y5.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        ai.ba baVar = new ai.ba(29, this, textView);
        textView.setOnClickListener(new ai.f2(5, this, baVar));
        baVar.run();
        h3Var.addTextChangedListener(new o8(this, baVar));
        org.telegram.ui.Cells.j3 j3Var2 = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.StoryLinkNamePlaceholder), true, false, -1, d6Var);
        this.Z = j3Var2;
        n8 n8Var2 = new n8(this, 1);
        org.telegram.ui.Cells.h3 h3Var2 = j3Var2.f20492b;
        h3Var2.setImeOptions(6);
        h3Var2.setOnEditorActionListener(new m.s2(n8Var2, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f5617a0 = frameLayout;
        d dVar = new d(context, d6Var, true);
        this.f5618b0 = dVar;
        dVar.g(LocaleController.getString(R.string.StoryLinkAdd), false, true);
        dVar.setOnClickListener(new m8(this, 1));
        dVar.setEnabled(V(j3Var.getText().toString()));
        frameLayout.addView(dVar, w7.y5.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.v = 0.2f;
        this.O = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        p8 p8Var = new p8(this);
        p8Var.f42996m = false;
        p8Var.C = false;
        p8Var.o(rr.h);
        p8Var.n(350L);
        this.d.setItemAnimator(p8Var);
        wl0 wl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        wl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.u0(this, context, b7Var, 2));
        q8 q8Var = this.X;
        if (q8Var != null) {
            q8Var.N(false);
        }
    }

    public static void P(u8 u8Var, Context context, b7 b7Var, View view, int i10) {
        TLRPC.WebPage webPage;
        String str;
        int i11;
        org.telegram.ui.Cells.j3 j3Var = u8Var.Z;
        org.telegram.ui.Cells.j3 j3Var2 = u8Var.Y;
        v51 G = u8Var.X.G(i10 - 1);
        if (G != null) {
            if (G.G(s8.class) && (webPage = u8Var.f5623g0) != null && !W(webPage)) {
                qg.t2 t2Var = new qg.t2(context, u8Var.currentAccount);
                qg.o0 o0Var = new qg.o0();
                o0Var.f41841c = j3Var2.f20492b.getText().toString();
                if (u8Var.m0) {
                    str = j3Var.f20492b.getText().toString();
                } else {
                    str = null;
                }
                o0Var.f41840b = str;
                TLRPC.WebPage webPage2 = u8Var.f5623g0;
                o0Var.d = webPage2;
                o0Var.e = u8Var.f5630o0;
                o0Var.f41842f = u8Var.f5629n0;
                ai.y1 y1Var = new ai.y1(u8Var, 15);
                t2Var.G = o0Var;
                if (webPage2 != null && (webPage2.photo != null || MessageObject.isVideoDocument(webPage2.document))) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                ec0 ec0Var = t2Var.f41947x;
                ec0Var.setVisibility(i11);
                t2Var.f41942f.b(t2Var.f41939a, o0Var, false);
                t2Var.f41946w.a(!o0Var.f41842f, false);
                ec0Var.a(!o0Var.e, false);
                t2Var.H = y1Var;
                t2Var.e.setImageDrawable(new d4(b7Var, 8));
                t2Var.show();
            } else if (G.d == 2 && (view instanceof org.telegram.ui.Cells.w8)) {
                boolean z10 = !u8Var.m0;
                u8Var.m0 = z10;
                ((org.telegram.ui.Cells.w8) view).setChecked(z10);
                u8Var.X.N(true);
                if (u8Var.m0) {
                    j3Var.requestFocus();
                } else {
                    j3Var2.requestFocus();
                }
            }
        }
    }

    public static void Q(u8 u8Var) {
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        getwebpagepreview.message = u8Var.Y.f20492b.getText().toString();
        u8Var.f5625i0 = ConnectionsManager.getInstance(u8Var.currentAccount).sendRequest(getwebpagepreview, new ai.n8(u8Var, 6));
    }

    public static void R(ci.u8 r7, org.telegram.tgnet.TLObject r8) {
        throw new UnsupportedOperationException("Method not decompiled: ci.u8.R(ci.u8, org.telegram.tgnet.TLObject):void");
    }

    public static void S(u8 u8Var, String str) {
        n8 n8Var = u8Var.f5627k0;
        if (str == null || TextUtils.equals(str, u8Var.f5626j0)) {
            return;
        }
        u8Var.f5626j0 = str;
        boolean V = u8Var.V(str);
        AndroidUtilities.cancelRunOnUIThread(n8Var);
        if (V) {
            if (!u8Var.f5624h0 || u8Var.f5623g0 != null) {
                u8Var.f5624h0 = true;
                u8Var.f5623g0 = null;
                q8 q8Var = u8Var.X;
                if (q8Var != null) {
                    q8Var.N(true);
                }
            }
            AndroidUtilities.runOnUIThread(n8Var, 700L);
        } else if (u8Var.f5624h0 || u8Var.f5623g0 != null) {
            u8Var.f5624h0 = false;
            u8Var.f5623g0 = null;
            if (u8Var.f5625i0 != 0) {
                ConnectionsManager.getInstance(u8Var.currentAccount).cancelRequest(u8Var.f5625i0, true);
                u8Var.f5625i0 = 0;
            }
            q8 q8Var2 = u8Var.X;
            if (q8Var2 != null) {
                q8Var2.N(true);
            }
        }
        u8Var.f5618b0.setEnabled(V);
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
        this.f5624h0 = false;
        this.f5623g0 = null;
        if (this.f5625i0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f5625i0, true);
            this.f5625i0 = 0;
        }
        q8 q8Var = this.X;
        if (q8Var != null) {
            q8Var.N(true);
        }
    }

    public final boolean V(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f5628l0 == null) {
            this.f5628l0 = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.f5628l0.matcher(str).find();
    }

    public final void X() {
        String str;
        if (!this.f5618b0.W) {
            return;
        }
        if (this.f5621e0 != null) {
            qg.o0 o0Var = new qg.o0();
            o0Var.f41841c = this.Y.f20492b.getText().toString();
            if (this.m0) {
                str = this.Z.f20492b.getText().toString();
            } else {
                str = null;
            }
            o0Var.f41840b = str;
            o0Var.d = this.f5623g0;
            o0Var.e = this.f5630o0;
            o0Var.f41842f = this.f5629n0;
            this.f5621e0.run(o0Var);
            this.f5621e0 = null;
        }
        dismiss();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f5622f0 != 0) {
            a0.i iVar = (a0.i) objArr[0];
            for (int i12 = 0; i12 < iVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) iVar.n(i12);
                if (webPage != null && this.f5622f0 == webPage.f18489id) {
                    if (W(webPage)) {
                        webPage = null;
                    }
                    this.f5623g0 = webPage;
                    this.f5624h0 = false;
                    this.f5622f0 = 0L;
                    q8 q8Var = this.X;
                    if (q8Var != null) {
                        q8Var.N(true);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.Y.f20492b);
        AndroidUtilities.hideKeyboard(this.Z.f20492b);
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        AndroidUtilities.runOnUIThread(new n8(this, 2), 150L);
    }

    @Override
    public final vl0 v(wl0 wl0Var) {
        ?? j61Var = new j61(this.d, getContext(), this.currentAccount, 0, true, new bi.v(this, 7), this.resourcesProvider);
        this.X = j61Var;
        return j61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoryLinkCreate);
    }
}
