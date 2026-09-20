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
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
public final class x8 extends org.telegram.ui.Components.ab implements NotificationCenter.NotificationCenterDelegate {
    public t8 X;
    public final org.telegram.ui.Cells.k3 Y;
    public final org.telegram.ui.Cells.k3 Z;
    public final FrameLayout f5764a0;
    public final d f5765b0;
    public boolean f5766c0;
    public boolean f5767d0;
    public m2 f5768e0;
    public long f5769f0;
    public TLRPC.WebPage f5770g0;
    public boolean f5771h0;
    public int f5772i0;
    public String f5773j0;
    public final q8 f5774k0;
    public Pattern f5775l0;
    public boolean m0;
    public boolean f5776n0;
    public boolean f5777o0;

    public x8(Context context, e6 e6Var, d7 d7Var, m2 m2Var) {
        super(context, null, true, true, 2, e6Var);
        this.f5774k0 = new q8(this, 0);
        this.f5768e0 = m2Var;
        fixNavigationBar();
        K();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-15.0f);
        org.telegram.ui.Cells.k3 k3Var = new org.telegram.ui.Cells.k3(context, LocaleController.getString(R.string.StoryLinkURLPlaceholder), true, false, -1, e6Var);
        this.Y = k3Var;
        q8 q8Var = new q8(this, 1);
        org.telegram.ui.Cells.i3 i3Var = k3Var.f20527b;
        i3Var.setImeOptions(6);
        i3Var.setOnEditorActionListener(new m.s2(q8Var, 2));
        i3Var.setHandlesColor(-12476440);
        i3Var.setCursorColor(-11230757);
        i3Var.setText("https://");
        i3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.vision.e2.l(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.Cells.c1.c(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f19296o6);
        textView.setTextColor(themedColor);
        int dp = AndroidUtilities.dp(6.0f);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, themedColor);
        int l12 = org.telegram.ui.ActionBar.j6.l1(0.15f, themedColor);
        textView.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, l1, l12, l12));
        w7.b6.b(textView, 0.1f, 1.5f);
        k3Var.addView(textView, w7.y5.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        ai.ba baVar = new ai.ba(29, this, textView);
        textView.setOnClickListener(new ai.f2(5, this, baVar));
        baVar.run();
        i3Var.addTextChangedListener(new r8(this, baVar));
        org.telegram.ui.Cells.k3 k3Var2 = new org.telegram.ui.Cells.k3(context, LocaleController.getString(R.string.StoryLinkNamePlaceholder), true, false, -1, e6Var);
        this.Z = k3Var2;
        q8 q8Var2 = new q8(this, 1);
        org.telegram.ui.Cells.i3 i3Var2 = k3Var2.f20527b;
        i3Var2.setImeOptions(6);
        i3Var2.setOnEditorActionListener(new m.s2(q8Var2, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f5764a0 = frameLayout;
        d dVar = new d(context, e6Var, true);
        this.f5765b0 = dVar;
        dVar.g(LocaleController.getString(R.string.StoryLinkAdd), false, true);
        dVar.setOnClickListener(new p8(this, 1));
        dVar.setEnabled(V(k3Var.getText().toString()));
        frameLayout.addView(dVar, w7.y5.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.v = 0.2f;
        this.O = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        s8 s8Var = new s8(this);
        s8Var.f43009m = false;
        s8Var.C = false;
        s8Var.o(qr.h);
        s8Var.n(350L);
        this.d.setItemAnimator(s8Var);
        vl0 vl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        vl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.u0(this, context, d7Var, 2));
        t8 t8Var = this.X;
        if (t8Var != null) {
            t8Var.N(false);
        }
    }

    public static void P(x8 x8Var, Context context, d7 d7Var, View view, int i10) {
        TLRPC.WebPage webPage;
        String str;
        int i11;
        org.telegram.ui.Cells.k3 k3Var = x8Var.Z;
        org.telegram.ui.Cells.k3 k3Var2 = x8Var.Y;
        w51 G = x8Var.X.G(i10 - 1);
        if (G != null) {
            if (G.G(v8.class) && (webPage = x8Var.f5770g0) != null && !W(webPage)) {
                qg.t2 t2Var = new qg.t2(context, x8Var.currentAccount);
                qg.o0 o0Var = new qg.o0();
                o0Var.f41854c = k3Var2.f20527b.getText().toString();
                if (x8Var.m0) {
                    str = k3Var.f20527b.getText().toString();
                } else {
                    str = null;
                }
                o0Var.f41853b = str;
                TLRPC.WebPage webPage2 = x8Var.f5770g0;
                o0Var.d = webPage2;
                o0Var.e = x8Var.f5777o0;
                o0Var.f41855f = x8Var.f5776n0;
                ai.y1 y1Var = new ai.y1(x8Var, 12);
                t2Var.G = o0Var;
                if (webPage2 != null && (webPage2.photo != null || MessageObject.isVideoDocument(webPage2.document))) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                cc0 cc0Var = t2Var.f41960x;
                cc0Var.setVisibility(i11);
                t2Var.f41955f.b(t2Var.f41952a, o0Var, false);
                t2Var.f41959w.a(!o0Var.f41855f, false);
                cc0Var.a(!o0Var.e, false);
                t2Var.H = y1Var;
                t2Var.e.setImageDrawable(new e4(d7Var, 8));
                t2Var.show();
            } else if (G.d == 2 && (view instanceof org.telegram.ui.Cells.x8)) {
                boolean z10 = !x8Var.m0;
                x8Var.m0 = z10;
                ((org.telegram.ui.Cells.x8) view).setChecked(z10);
                x8Var.X.N(true);
                if (x8Var.m0) {
                    k3Var.requestFocus();
                } else {
                    k3Var2.requestFocus();
                }
            }
        }
    }

    public static void Q(x8 x8Var) {
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        getwebpagepreview.message = x8Var.Y.f20527b.getText().toString();
        x8Var.f5772i0 = ConnectionsManager.getInstance(x8Var.currentAccount).sendRequest(getwebpagepreview, new ai.m8(x8Var, 6));
    }

    public static void R(ci.x8 r7, org.telegram.tgnet.TLObject r8) {
        throw new UnsupportedOperationException("Method not decompiled: ci.x8.R(ci.x8, org.telegram.tgnet.TLObject):void");
    }

    public static void S(x8 x8Var, String str) {
        q8 q8Var = x8Var.f5774k0;
        if (str == null || TextUtils.equals(str, x8Var.f5773j0)) {
            return;
        }
        x8Var.f5773j0 = str;
        boolean V = x8Var.V(str);
        AndroidUtilities.cancelRunOnUIThread(q8Var);
        if (V) {
            if (!x8Var.f5771h0 || x8Var.f5770g0 != null) {
                x8Var.f5771h0 = true;
                x8Var.f5770g0 = null;
                t8 t8Var = x8Var.X;
                if (t8Var != null) {
                    t8Var.N(true);
                }
            }
            AndroidUtilities.runOnUIThread(q8Var, 700L);
        } else if (x8Var.f5771h0 || x8Var.f5770g0 != null) {
            x8Var.f5771h0 = false;
            x8Var.f5770g0 = null;
            if (x8Var.f5772i0 != 0) {
                ConnectionsManager.getInstance(x8Var.currentAccount).cancelRequest(x8Var.f5772i0, true);
                x8Var.f5772i0 = 0;
            }
            t8 t8Var2 = x8Var.X;
            if (t8Var2 != null) {
                t8Var2.N(true);
            }
        }
        x8Var.f5765b0.setEnabled(V);
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
        this.f5771h0 = false;
        this.f5770g0 = null;
        if (this.f5772i0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f5772i0, true);
            this.f5772i0 = 0;
        }
        t8 t8Var = this.X;
        if (t8Var != null) {
            t8Var.N(true);
        }
    }

    public final boolean V(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f5775l0 == null) {
            this.f5775l0 = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.f5775l0.matcher(str).find();
    }

    public final void X() {
        String str;
        if (!this.f5765b0.W) {
            return;
        }
        if (this.f5768e0 != null) {
            qg.o0 o0Var = new qg.o0();
            o0Var.f41854c = this.Y.f20527b.getText().toString();
            if (this.m0) {
                str = this.Z.f20527b.getText().toString();
            } else {
                str = null;
            }
            o0Var.f41853b = str;
            o0Var.d = this.f5770g0;
            o0Var.e = this.f5777o0;
            o0Var.f41855f = this.f5776n0;
            this.f5768e0.run(o0Var);
            this.f5768e0 = null;
        }
        dismiss();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f5769f0 != 0) {
            a0.i iVar = (a0.i) objArr[0];
            for (int i12 = 0; i12 < iVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) iVar.n(i12);
                if (webPage != null && this.f5769f0 == webPage.f18481id) {
                    if (W(webPage)) {
                        webPage = null;
                    }
                    this.f5770g0 = webPage;
                    this.f5771h0 = false;
                    this.f5769f0 = 0L;
                    t8 t8Var = this.X;
                    if (t8Var != null) {
                        t8Var.N(true);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.Y.f20527b);
        AndroidUtilities.hideKeyboard(this.Z.f20527b);
        super.dismiss();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
    }

    @Override
    public final void show() {
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.didReceivedWebpagesInUpdates);
        AndroidUtilities.runOnUIThread(new q8(this, 2), 150L);
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        ?? k61Var = new k61(this.d, getContext(), this.currentAccount, 0, true, new bi.v(this, 7), this.resourcesProvider);
        this.X = k61Var;
        return k61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoryLinkCreate);
    }
}
