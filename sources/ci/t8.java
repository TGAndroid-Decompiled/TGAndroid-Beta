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
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.sr;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.yl0;
public final class t8 extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public p8 X;
    public final org.telegram.ui.Cells.j3 Y;
    public final org.telegram.ui.Cells.j3 Z;
    public final FrameLayout f5573a0;
    public final d f5574b0;
    public boolean f5575c0;
    public boolean f5576d0;
    public ai.g3 f5577e0;
    public long f5578f0;
    public TLRPC.WebPage f5579g0;
    public boolean f5580h0;
    public int f5581i0;
    public String f5582j0;
    public final m8 f5583k0;
    public Pattern f5584l0;
    public boolean m0;
    public boolean f5585n0;
    public boolean f5586o0;

    public t8(Context context, d6 d6Var, b7 b7Var, ai.g3 g3Var) {
        super(context, null, true, true, 2, d6Var);
        this.f5583k0 = new m8(this, 0);
        this.f5577e0 = g3Var;
        fixNavigationBar();
        K();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-15.0f);
        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.StoryLinkURLPlaceholder), true, false, -1, d6Var);
        this.Y = j3Var;
        m8 m8Var = new m8(this, 1);
        org.telegram.ui.Cells.h3 h3Var = j3Var.f20493b;
        h3Var.setImeOptions(6);
        h3Var.setOnEditorActionListener(new m.s2(m8Var, 2));
        h3Var.setHandlesColor(-12476440);
        h3Var.setCursorColor(-11230757);
        h3Var.setText("https://");
        h3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.vision.e2.l(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.Cells.c1.c(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.f19259o6);
        textView.setTextColor(themedColor);
        int dp = AndroidUtilities.dp(6.0f);
        int l1 = org.telegram.ui.ActionBar.i6.l1(0.12f, themedColor);
        int l12 = org.telegram.ui.ActionBar.i6.l1(0.15f, themedColor);
        textView.setBackground(org.telegram.ui.ActionBar.i6.i0(dp, dp, dp, dp, l1, l12, l12));
        w7.a6.b(textView, 0.1f, 1.5f);
        j3Var.addView(textView, w7.y5.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        ai.ba baVar = new ai.ba(29, this, textView);
        textView.setOnClickListener(new ai.f2(5, this, baVar));
        baVar.run();
        h3Var.addTextChangedListener(new n8(this, baVar));
        org.telegram.ui.Cells.j3 j3Var2 = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.StoryLinkNamePlaceholder), true, false, -1, d6Var);
        this.Z = j3Var2;
        m8 m8Var2 = new m8(this, 1);
        org.telegram.ui.Cells.h3 h3Var2 = j3Var2.f20493b;
        h3Var2.setImeOptions(6);
        h3Var2.setOnEditorActionListener(new m.s2(m8Var2, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f5573a0 = frameLayout;
        d dVar = new d(context, d6Var, true);
        this.f5574b0 = dVar;
        dVar.g(LocaleController.getString(R.string.StoryLinkAdd), false, true);
        dVar.setOnClickListener(new l8(this, 1));
        dVar.setEnabled(V(j3Var.getText().toString()));
        frameLayout.addView(dVar, w7.y5.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.v = 0.2f;
        this.O = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        o8 o8Var = new o8(this);
        o8Var.f43040m = false;
        o8Var.C = false;
        o8Var.o(sr.h);
        o8Var.n(350L);
        this.d.setItemAnimator(o8Var);
        yl0 yl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        yl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.u0(this, context, b7Var, 2));
        p8 p8Var = this.X;
        if (p8Var != null) {
            p8Var.N(false);
        }
    }

    public static void P(t8 t8Var, Context context, b7 b7Var, View view, int i10) {
        TLRPC.WebPage webPage;
        String str;
        int i11;
        org.telegram.ui.Cells.j3 j3Var = t8Var.Z;
        org.telegram.ui.Cells.j3 j3Var2 = t8Var.Y;
        x51 G = t8Var.X.G(i10 - 1);
        if (G != null) {
            if (G.G(r8.class) && (webPage = t8Var.f5579g0) != null && !W(webPage)) {
                qg.t2 t2Var = new qg.t2(context, t8Var.currentAccount);
                qg.n0 n0Var = new qg.n0();
                n0Var.f41841c = j3Var2.f20493b.getText().toString();
                if (t8Var.m0) {
                    str = j3Var.f20493b.getText().toString();
                } else {
                    str = null;
                }
                n0Var.f41840b = str;
                TLRPC.WebPage webPage2 = t8Var.f5579g0;
                n0Var.d = webPage2;
                n0Var.e = t8Var.f5586o0;
                n0Var.f41842f = t8Var.f5585n0;
                ai.y1 y1Var = new ai.y1(t8Var, 15);
                t2Var.G = n0Var;
                if (webPage2 != null && (webPage2.photo != null || MessageObject.isVideoDocument(webPage2.document))) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                fc0 fc0Var = t2Var.f41982x;
                fc0Var.setVisibility(i11);
                t2Var.f41977f.b(t2Var.f41974a, n0Var, false);
                t2Var.f41981w.a(!n0Var.f41842f, false);
                fc0Var.a(!n0Var.e, false);
                t2Var.H = y1Var;
                t2Var.e.setImageDrawable(new d4(b7Var, 8));
                t2Var.show();
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

    public static void Q(t8 t8Var) {
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        getwebpagepreview.message = t8Var.Y.f20493b.getText().toString();
        t8Var.f5581i0 = ConnectionsManager.getInstance(t8Var.currentAccount).sendRequest(getwebpagepreview, new ai.n8(t8Var, 6));
    }

    public static void R(ci.t8 r7, org.telegram.tgnet.TLObject r8) {
        throw new UnsupportedOperationException("Method not decompiled: ci.t8.R(ci.t8, org.telegram.tgnet.TLObject):void");
    }

    public static void S(t8 t8Var, String str) {
        m8 m8Var = t8Var.f5583k0;
        if (str == null || TextUtils.equals(str, t8Var.f5582j0)) {
            return;
        }
        t8Var.f5582j0 = str;
        boolean V = t8Var.V(str);
        AndroidUtilities.cancelRunOnUIThread(m8Var);
        if (V) {
            if (!t8Var.f5580h0 || t8Var.f5579g0 != null) {
                t8Var.f5580h0 = true;
                t8Var.f5579g0 = null;
                p8 p8Var = t8Var.X;
                if (p8Var != null) {
                    p8Var.N(true);
                }
            }
            AndroidUtilities.runOnUIThread(m8Var, 700L);
        } else if (t8Var.f5580h0 || t8Var.f5579g0 != null) {
            t8Var.f5580h0 = false;
            t8Var.f5579g0 = null;
            if (t8Var.f5581i0 != 0) {
                ConnectionsManager.getInstance(t8Var.currentAccount).cancelRequest(t8Var.f5581i0, true);
                t8Var.f5581i0 = 0;
            }
            p8 p8Var2 = t8Var.X;
            if (p8Var2 != null) {
                p8Var2.N(true);
            }
        }
        t8Var.f5574b0.setEnabled(V);
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
        this.f5580h0 = false;
        this.f5579g0 = null;
        if (this.f5581i0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f5581i0, true);
            this.f5581i0 = 0;
        }
        p8 p8Var = this.X;
        if (p8Var != null) {
            p8Var.N(true);
        }
    }

    public final boolean V(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f5584l0 == null) {
            this.f5584l0 = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.f5584l0.matcher(str).find();
    }

    public final void X() {
        String str;
        if (!this.f5574b0.W) {
            return;
        }
        if (this.f5577e0 != null) {
            qg.n0 n0Var = new qg.n0();
            n0Var.f41841c = this.Y.f20493b.getText().toString();
            if (this.m0) {
                str = this.Z.f20493b.getText().toString();
            } else {
                str = null;
            }
            n0Var.f41840b = str;
            n0Var.d = this.f5579g0;
            n0Var.e = this.f5586o0;
            n0Var.f41842f = this.f5585n0;
            this.f5577e0.run(n0Var);
            this.f5577e0 = null;
        }
        dismiss();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f5578f0 != 0) {
            a0.i iVar = (a0.i) objArr[0];
            for (int i12 = 0; i12 < iVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) iVar.n(i12);
                if (webPage != null && this.f5578f0 == webPage.f18482id) {
                    if (W(webPage)) {
                        webPage = null;
                    }
                    this.f5579g0 = webPage;
                    this.f5580h0 = false;
                    this.f5578f0 = 0L;
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
        AndroidUtilities.hideKeyboard(this.Y.f20493b);
        AndroidUtilities.hideKeyboard(this.Z.f20493b);
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
    public final xl0 v(yl0 yl0Var) {
        ?? l61Var = new l61(this.d, getContext(), this.currentAccount, 0, true, new bi.v(this, 7), this.resourcesProvider);
        this.X = l61Var;
        return l61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoryLinkCreate);
    }
}
