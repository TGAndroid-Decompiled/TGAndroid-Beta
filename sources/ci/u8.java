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
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.uc0;
public final class u8 extends org.telegram.ui.Components.db implements NotificationCenter.NotificationCenterDelegate {
    public q8 X;
    public final org.telegram.ui.Cells.j3 Y;
    public final org.telegram.ui.Cells.j3 Z;
    public final FrameLayout f6078a0;
    public final d f6079b0;
    public boolean f6080c0;
    public boolean f6081d0;
    public ai.h3 f6082e0;
    public long f6083f0;
    public TLRPC.WebPage f6084g0;
    public boolean f6085h0;
    public int f6086i0;
    public String f6087j0;
    public final n8 f6088k0;
    public Pattern f6089l0;
    public boolean m0;
    public boolean f6090n0;
    public boolean f6091o0;

    public u8(Context context, d6 d6Var, b7 b7Var, ai.h3 h3Var) {
        super(context, null, true, true, 2, d6Var);
        this.f6088k0 = new n8(this, 0);
        this.f6082e0 = h3Var;
        fixNavigationBar();
        L();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-15.0f);
        org.telegram.ui.Cells.j3 j3Var = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.StoryLinkURLPlaceholder), true, false, -1, d6Var);
        this.Y = j3Var;
        n8 n8Var = new n8(this, 1);
        org.telegram.ui.Cells.h3 h3Var2 = j3Var.f22325b;
        h3Var2.setImeOptions(6);
        h3Var2.setOnEditorActionListener(new m.s2(n8Var, 2));
        h3Var2.setHandlesColor(-12476440);
        h3Var2.setCursorColor(-11230757);
        h3Var2.setText("https://");
        h3Var2.setSelection(8);
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.vision.e2.l(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.Cells.c1.b(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.f21025o6);
        textView.setTextColor(themedColor);
        int dp = AndroidUtilities.dp(6.0f);
        int m12 = org.telegram.ui.ActionBar.h6.m1(0.12f, themedColor);
        int m13 = org.telegram.ui.ActionBar.h6.m1(0.15f, themedColor);
        textView.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, m12, m13, m13));
        w7.z5.b(textView, 0.1f, 1.5f);
        j3Var.addView(textView, w7.x5.a(26.0f, 0.0f, 4.0f, 24.0f, 3.0f, -2, 21));
        ai.ca caVar = new ai.ca(29, this, textView);
        textView.setOnClickListener(new ai.f2(5, this, caVar));
        caVar.run();
        h3Var2.addTextChangedListener(new o8(this, caVar));
        org.telegram.ui.Cells.j3 j3Var2 = new org.telegram.ui.Cells.j3(context, LocaleController.getString(R.string.StoryLinkNamePlaceholder), true, false, -1, d6Var);
        this.Z = j3Var2;
        n8 n8Var2 = new n8(this, 1);
        org.telegram.ui.Cells.h3 h3Var3 = j3Var2.f22325b;
        h3Var3.setImeOptions(6);
        h3Var3.setOnEditorActionListener(new m.s2(n8Var2, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f6078a0 = frameLayout;
        d dVar = new d(context, d6Var, true);
        this.f6079b0 = dVar;
        dVar.g(LocaleController.getString(R.string.StoryLinkAdd), false, true);
        dVar.setOnClickListener(new m8(this, 1));
        dVar.setEnabled(W(j3Var.getText().toString()));
        frameLayout.addView(dVar, w7.x5.a(48.0f, 10.0f, 10.0f, 10.0f, 10.0f, -1, 119));
        this.v = 0.2f;
        this.O = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        p8 p8Var = new p8(this);
        p8Var.f47822m = false;
        p8Var.C = false;
        p8Var.o(is.h);
        p8Var.n(350L);
        this.d.setItemAnimator(p8Var);
        rm0 rm0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        rm0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.u0(this, context, b7Var, 2));
        q8 q8Var = this.X;
        if (q8Var != null) {
            q8Var.N(false);
        }
    }

    public static void Q(u8 u8Var, Context context, b7 b7Var, View view, int i10) {
        TLRPC.WebPage webPage;
        String str;
        int i11;
        org.telegram.ui.Cells.j3 j3Var = u8Var.Z;
        org.telegram.ui.Cells.j3 j3Var2 = u8Var.Y;
        q61 G = u8Var.X.G(i10 - 1);
        if (G != null) {
            if (G.G(s8.class) && (webPage = u8Var.f6084g0) != null && !X(webPage)) {
                qg.t2 t2Var = new qg.t2(context, u8Var.currentAccount);
                qg.n0 n0Var = new qg.n0();
                n0Var.f46536c = j3Var2.f22325b.getText().toString();
                if (u8Var.m0) {
                    str = j3Var.f22325b.getText().toString();
                } else {
                    str = null;
                }
                n0Var.f46535b = str;
                TLRPC.WebPage webPage2 = u8Var.f6084g0;
                n0Var.d = webPage2;
                n0Var.f46537e = u8Var.f6091o0;
                n0Var.f46538f = u8Var.f6090n0;
                ai.y1 y1Var = new ai.y1(u8Var, 15);
                t2Var.G = n0Var;
                if (webPage2 != null && (webPage2.photo != null || MessageObject.isVideoDocument(webPage2.document))) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                uc0 uc0Var = t2Var.f46684x;
                uc0Var.setVisibility(i11);
                t2Var.f46679f.b(t2Var.f46675a, n0Var, false);
                t2Var.f46683w.a(!n0Var.f46538f, false);
                uc0Var.a(!n0Var.f46537e, false);
                t2Var.H = y1Var;
                t2Var.f46678e.setImageDrawable(new c4(b7Var, 7));
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

    public static void R(u8 u8Var) {
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        getwebpagepreview.message = u8Var.Y.f22325b.getText().toString();
        u8Var.f6086i0 = ConnectionsManager.getInstance(u8Var.currentAccount).sendRequest(getwebpagepreview, new ai.o8(u8Var, 6));
    }

    public static void S(ci.u8 r7, org.telegram.tgnet.TLObject r8) {
        throw new UnsupportedOperationException("Method not decompiled: ci.u8.S(ci.u8, org.telegram.tgnet.TLObject):void");
    }

    public static void T(u8 u8Var, String str) {
        n8 n8Var = u8Var.f6088k0;
        if (str == null || TextUtils.equals(str, u8Var.f6087j0)) {
            return;
        }
        u8Var.f6087j0 = str;
        boolean W = u8Var.W(str);
        AndroidUtilities.cancelRunOnUIThread(n8Var);
        if (W) {
            if (!u8Var.f6085h0 || u8Var.f6084g0 != null) {
                u8Var.f6085h0 = true;
                u8Var.f6084g0 = null;
                q8 q8Var = u8Var.X;
                if (q8Var != null) {
                    q8Var.N(true);
                }
            }
            AndroidUtilities.runOnUIThread(n8Var, 700L);
        } else if (u8Var.f6085h0 || u8Var.f6084g0 != null) {
            u8Var.f6085h0 = false;
            u8Var.f6084g0 = null;
            if (u8Var.f6086i0 != 0) {
                ConnectionsManager.getInstance(u8Var.currentAccount).cancelRequest(u8Var.f6086i0, true);
                u8Var.f6086i0 = 0;
            }
            q8 q8Var2 = u8Var.X;
            if (q8Var2 != null) {
                q8Var2.N(true);
            }
        }
        u8Var.f6079b0.setEnabled(W);
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
        this.f6085h0 = false;
        this.f6084g0 = null;
        if (this.f6086i0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f6086i0, true);
            this.f6086i0 = 0;
        }
        q8 q8Var = this.X;
        if (q8Var != null) {
            q8Var.N(true);
        }
    }

    public final boolean W(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f6089l0 == null) {
            this.f6089l0 = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.f6089l0.matcher(str).find();
    }

    public final void Y() {
        String str;
        if (!this.f6079b0.W) {
            return;
        }
        if (this.f6082e0 != null) {
            qg.n0 n0Var = new qg.n0();
            n0Var.f46536c = this.Y.f22325b.getText().toString();
            if (this.m0) {
                str = this.Z.f22325b.getText().toString();
            } else {
                str = null;
            }
            n0Var.f46535b = str;
            n0Var.d = this.f6084g0;
            n0Var.f46537e = this.f6091o0;
            n0Var.f46538f = this.f6090n0;
            this.f6082e0.run(n0Var);
            this.f6082e0 = null;
        }
        dismiss();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f6083f0 != 0) {
            a0.i iVar = (a0.i) objArr[0];
            for (int i12 = 0; i12 < iVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) iVar.n(i12);
                if (webPage != null && this.f6083f0 == webPage.f20221id) {
                    if (X(webPage)) {
                        webPage = null;
                    }
                    this.f6084g0 = webPage;
                    this.f6085h0 = false;
                    this.f6083f0 = 0L;
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
        AndroidUtilities.hideKeyboard(this.Y.f22325b);
        AndroidUtilities.hideKeyboard(this.Z.f22325b);
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
    public final qm0 x(rm0 rm0Var) {
        ?? d71Var = new d71(this.d, getContext(), this.currentAccount, 0, true, new bi.v(this, 7), this.resourcesProvider);
        this.X = d71Var;
        return d71Var;
    }
}
