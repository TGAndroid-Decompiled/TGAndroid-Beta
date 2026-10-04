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
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.hc0;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
public final class t8 extends org.telegram.ui.Components.cb implements NotificationCenter.NotificationCenterDelegate {
    public p8 X;
    public final org.telegram.ui.Cells.j3 Y;
    public final org.telegram.ui.Cells.j3 Z;
    public final FrameLayout f5998a0;
    public final d f5999b0;
    public boolean f6000c0;
    public boolean f6001d0;
    public ai.g3 f6002e0;
    public long f6003f0;
    public TLRPC.WebPage f6004g0;
    public boolean f6005h0;
    public int f6006i0;
    public String f6007j0;
    public final m8 f6008k0;
    public Pattern f6009l0;
    public boolean m0;
    public boolean f6010n0;
    public boolean f6011o0;

    public t8(Context context, d6 d6Var, b7 b7Var, ai.g3 g3Var) {
        super(context, null, true, true, 2, d6Var);
        this.f6008k0 = new m8(this, 0);
        this.f6002e0 = g3Var;
        fixNavigationBar();
        I();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-15.0f);
        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.StoryLinkURLPlaceholder), true, false, -1, d6Var);
        this.Y = j3Var;
        m8 m8Var = new m8(this, 1);
        org.telegram.ui.Cells.h3 h3Var = j3Var.f22311b;
        h3Var.setImeOptions(6);
        h3Var.setOnEditorActionListener(new m.s2(m8Var, 2));
        h3Var.setHandlesColor(-12476440);
        h3Var.setCursorColor(-11230757);
        h3Var.setText("https://");
        h3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.vision.e2.l(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.Cells.c1.d(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.i6.f21025o6);
        textView.setTextColor(themedColor);
        int dp = AndroidUtilities.dp(6.0f);
        int l1 = org.telegram.ui.ActionBar.i6.l1(0.12f, themedColor);
        int l12 = org.telegram.ui.ActionBar.i6.l1(0.15f, themedColor);
        textView.setBackground(org.telegram.ui.ActionBar.i6.i0(dp, dp, dp, dp, l1, l12, l12));
        w7.b6.b(textView, 0.1f, 1.5f);
        j3Var.addView(textView, w7.z5.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        ai.ba baVar = new ai.ba(29, this, textView);
        textView.setOnClickListener(new ai.f2(5, this, baVar));
        baVar.run();
        h3Var.addTextChangedListener(new n8(this, baVar));
        org.telegram.ui.Cells.j3 j3Var2 = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.StoryLinkNamePlaceholder), true, false, -1, d6Var);
        this.Z = j3Var2;
        m8 m8Var2 = new m8(this, 1);
        org.telegram.ui.Cells.h3 h3Var2 = j3Var2.f22311b;
        h3Var2.setImeOptions(6);
        h3Var2.setOnEditorActionListener(new m.s2(m8Var2, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f5998a0 = frameLayout;
        d dVar = new d(context, d6Var, true);
        this.f5999b0 = dVar;
        dVar.g(LocaleController.getString(R.string.StoryLinkAdd), false, true);
        dVar.setOnClickListener(new l8(this, 1));
        dVar.setEnabled(T(j3Var.getText().toString()));
        frameLayout.addView(dVar, w7.z5.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.v = 0.2f;
        this.O = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        o8 o8Var = new o8(this);
        o8Var.f46570m = false;
        o8Var.C = false;
        o8Var.o(tr.h);
        o8Var.n(350L);
        this.d.setItemAnimator(o8Var);
        zl0 zl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        zl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.u0(this, context, b7Var, 2));
        p8 p8Var = this.X;
        if (p8Var != null) {
            p8Var.N(false);
        }
    }

    public static void N(t8 t8Var, Context context, b7 b7Var, View view, int i10) {
        TLRPC.WebPage webPage;
        String str;
        int i11;
        org.telegram.ui.Cells.j3 j3Var = t8Var.Z;
        org.telegram.ui.Cells.j3 j3Var2 = t8Var.Y;
        g61 G = t8Var.X.G(i10 - 1);
        if (G != null) {
            if (G.G(r8.class) && (webPage = t8Var.f6004g0) != null && !U(webPage)) {
                qg.t2 t2Var = new qg.t2(context, t8Var.currentAccount);
                qg.n0 n0Var = new qg.n0();
                n0Var.f45210c = j3Var2.f22311b.getText().toString();
                if (t8Var.m0) {
                    str = j3Var.f22311b.getText().toString();
                } else {
                    str = null;
                }
                n0Var.f45209b = str;
                TLRPC.WebPage webPage2 = t8Var.f6004g0;
                n0Var.d = webPage2;
                n0Var.f45211e = t8Var.f6011o0;
                n0Var.f45212f = t8Var.f6010n0;
                ai.y1 y1Var = new ai.y1(t8Var, 15);
                t2Var.G = n0Var;
                if (webPage2 != null && (webPage2.photo != null || MessageObject.isVideoDocument(webPage2.document))) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                hc0 hc0Var = t2Var.f45360x;
                hc0Var.setVisibility(i11);
                t2Var.f45355f.b(t2Var.f45351a, n0Var, false);
                t2Var.f45359w.a(!n0Var.f45212f, false);
                hc0Var.a(!n0Var.f45211e, false);
                t2Var.H = y1Var;
                t2Var.f45354e.setImageDrawable(new d4(b7Var, 8));
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

    public static void O(t8 t8Var) {
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        getwebpagepreview.message = t8Var.Y.f22311b.getText().toString();
        t8Var.f6006i0 = ConnectionsManager.getInstance(t8Var.currentAccount).sendRequest(getwebpagepreview, new ai.n8(t8Var, 6));
    }

    public static void P(ci.t8 r7, org.telegram.tgnet.TLObject r8) {
        throw new UnsupportedOperationException("Method not decompiled: ci.t8.P(ci.t8, org.telegram.tgnet.TLObject):void");
    }

    public static void Q(t8 t8Var, String str) {
        m8 m8Var = t8Var.f6008k0;
        if (str == null || TextUtils.equals(str, t8Var.f6007j0)) {
            return;
        }
        t8Var.f6007j0 = str;
        boolean T = t8Var.T(str);
        AndroidUtilities.cancelRunOnUIThread(m8Var);
        if (T) {
            if (!t8Var.f6005h0 || t8Var.f6004g0 != null) {
                t8Var.f6005h0 = true;
                t8Var.f6004g0 = null;
                p8 p8Var = t8Var.X;
                if (p8Var != null) {
                    p8Var.N(true);
                }
            }
            AndroidUtilities.runOnUIThread(m8Var, 700L);
        } else if (t8Var.f6005h0 || t8Var.f6004g0 != null) {
            t8Var.f6005h0 = false;
            t8Var.f6004g0 = null;
            if (t8Var.f6006i0 != 0) {
                ConnectionsManager.getInstance(t8Var.currentAccount).cancelRequest(t8Var.f6006i0, true);
                t8Var.f6006i0 = 0;
            }
            p8 p8Var2 = t8Var.X;
            if (p8Var2 != null) {
                p8Var2.N(true);
            }
        }
        t8Var.f5999b0.setEnabled(T);
    }

    public static boolean U(TLRPC.WebPage webPage) {
        if (!(webPage instanceof TLRPC.TL_webPagePending)) {
            if (!TextUtils.isEmpty(webPage.title) || !TextUtils.isEmpty(webPage.description)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void S() {
        this.f6005h0 = false;
        this.f6004g0 = null;
        if (this.f6006i0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f6006i0, true);
            this.f6006i0 = 0;
        }
        p8 p8Var = this.X;
        if (p8Var != null) {
            p8Var.N(true);
        }
    }

    public final boolean T(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f6009l0 == null) {
            this.f6009l0 = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.f6009l0.matcher(str).find();
    }

    public final void W() {
        String str;
        if (!this.f5999b0.W) {
            return;
        }
        if (this.f6002e0 != null) {
            qg.n0 n0Var = new qg.n0();
            n0Var.f45210c = this.Y.f22311b.getText().toString();
            if (this.m0) {
                str = this.Z.f22311b.getText().toString();
            } else {
                str = null;
            }
            n0Var.f45209b = str;
            n0Var.d = this.f6004g0;
            n0Var.f45211e = this.f6011o0;
            n0Var.f45212f = this.f6010n0;
            this.f6002e0.run(n0Var);
            this.f6002e0 = null;
        }
        dismiss();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f6003f0 != 0) {
            a0.i iVar = (a0.i) objArr[0];
            for (int i12 = 0; i12 < iVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) iVar.n(i12);
                if (webPage != null && this.f6003f0 == webPage.f20195id) {
                    if (U(webPage)) {
                        webPage = null;
                    }
                    this.f6004g0 = webPage;
                    this.f6005h0 = false;
                    this.f6003f0 = 0L;
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
        AndroidUtilities.hideKeyboard(this.Y.f22311b);
        AndroidUtilities.hideKeyboard(this.Z.f22311b);
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
    public final yl0 v(zl0 zl0Var) {
        ?? u61Var = new u61(this.d, getContext(), this.currentAccount, 0, true, new bi.v(this, 7), this.resourcesProvider);
        this.X = u61Var;
        return u61Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoryLinkCreate);
    }
}
