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
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.nc0;
import org.telegram.ui.Components.s61;
public final class j8 extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public f8 X;
    public final org.telegram.ui.Cells.i3 Y;
    public final org.telegram.ui.Cells.i3 Z;
    public final FrameLayout f9269a0;
    public final d f9270b0;
    public boolean f9271c0;
    public boolean f9272d0;
    public ai.n2 f9273e0;
    public long f9274f0;
    public TLRPC.WebPage f9275g0;
    public boolean f9276h0;
    public int f9277i0;
    public String f9278j0;
    public final c8 f9279k0;
    public Pattern f9280l0;
    public boolean m0;
    public boolean f9281n0;
    public boolean f9282o0;

    public j8(Context context, t5 t5Var, r6 r6Var, ai.n2 n2Var) {
        super(context, null, true, true, 2, t5Var);
        this.f9279k0 = new c8(this, 0);
        this.f9273e0 = n2Var;
        fixNavigationBar();
        L();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-15.0f);
        org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.StoryLinkURLPlaceholder), true, false, -1, t5Var);
        this.Y = i3Var;
        c8 c8Var = new c8(this, 1);
        org.telegram.ui.Cells.g3 g3Var = i3Var.f22401b;
        g3Var.setImeOptions(6);
        g3Var.setOnEditorActionListener(new m.t2(c8Var, 2));
        g3Var.setHandlesColor(-12476440);
        g3Var.setCursorColor(-11230757);
        g3Var.setText("https://");
        g3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.cast.a6.m(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.Cells.t0.f(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.h6.f21189o6);
        textView.setTextColor(themedColor);
        int dp = AndroidUtilities.dp(6.0f);
        int m12 = org.telegram.ui.ActionBar.h6.m1(0.12f, themedColor);
        int m13 = org.telegram.ui.ActionBar.h6.m1(0.15f, themedColor);
        textView.setBackground(org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, m12, m13, m13));
        w7.b6.b(textView, 0.1f, 1.5f);
        i3Var.addView(textView, w7.z5.a(26.0f, 0.0f, 4.0f, 24.0f, 3.0f, -2, 21));
        p6 p6Var = new p6(8, this, textView);
        textView.setOnClickListener(new ai.p(15, this, p6Var));
        p6Var.run();
        g3Var.addTextChangedListener(new d8(this, p6Var));
        org.telegram.ui.Cells.i3 i3Var2 = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.StoryLinkNamePlaceholder), true, false, -1, t5Var);
        this.Z = i3Var2;
        c8 c8Var2 = new c8(this, 1);
        org.telegram.ui.Cells.g3 g3Var2 = i3Var2.f22401b;
        g3Var2.setImeOptions(6);
        g3Var2.setOnEditorActionListener(new m.t2(c8Var2, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9269a0 = frameLayout;
        d dVar = new d(context, t5Var, true);
        this.f9270b0 = dVar;
        dVar.g(LocaleController.getString(R.string.StoryLinkAdd), false, true);
        dVar.setOnClickListener(new b8(this, 1));
        dVar.setEnabled(W(i3Var.getText().toString()));
        frameLayout.addView(dVar, w7.z5.a(48.0f, 10.0f, 10.0f, 10.0f, 10.0f, -1, 119));
        this.v = 0.2f;
        this.O = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        e8 e8Var = new e8(this);
        e8Var.f45972m = false;
        e8Var.C = false;
        e8Var.o(bs.h);
        e8Var.n(350L);
        this.d.setItemAnimator(e8Var);
        im0 im0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        im0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ci.g0(this, context, r6Var, 2));
        f8 f8Var = this.X;
        if (f8Var != null) {
            f8Var.N(false);
        }
    }

    public static void Q(j8 j8Var, Context context, r6 r6Var, View view, int i10) {
        TLRPC.WebPage webPage;
        String str;
        int i11;
        org.telegram.ui.Cells.i3 i3Var = j8Var.Z;
        org.telegram.ui.Cells.i3 i3Var2 = j8Var.Y;
        f61 G = j8Var.X.G(i10 - 1);
        if (G != null) {
            if (G.G(h8.class) && (webPage = j8Var.f9275g0) != null && !X(webPage)) {
                rg.t2 t2Var = new rg.t2(context, j8Var.currentAccount);
                rg.n0 n0Var = new rg.n0();
                n0Var.f45562c = i3Var2.f22401b.getText().toString();
                if (j8Var.m0) {
                    str = i3Var.f22401b.getText().toString();
                } else {
                    str = null;
                }
                n0Var.f45561b = str;
                TLRPC.WebPage webPage2 = j8Var.f9275g0;
                n0Var.d = webPage2;
                n0Var.e = j8Var.f9282o0;
                n0Var.f45563f = j8Var.f9281n0;
                ai.r0 r0Var = new ai.r0(j8Var, 21);
                t2Var.G = n0Var;
                if (webPage2 != null && (webPage2.photo != null || MessageObject.isVideoDocument(webPage2.document))) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                nc0 nc0Var = t2Var.f45678x;
                nc0Var.setVisibility(i11);
                t2Var.f45673f.b(t2Var.f45670a, n0Var, false);
                t2Var.f45677w.a(!n0Var.f45563f, false);
                nc0Var.a(!n0Var.e, false);
                t2Var.H = r0Var;
                t2Var.e.setImageDrawable(new w3(r6Var, 7));
                t2Var.show();
            } else if (G.d == 2 && (view instanceof org.telegram.ui.Cells.v8)) {
                boolean z10 = !j8Var.m0;
                j8Var.m0 = z10;
                ((org.telegram.ui.Cells.v8) view).setChecked(z10);
                j8Var.X.N(true);
                if (j8Var.m0) {
                    i3Var.requestFocus();
                } else {
                    i3Var2.requestFocus();
                }
            }
        }
    }

    public static void R(j8 j8Var) {
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        getwebpagepreview.message = j8Var.Y.f22401b.getText().toString();
        j8Var.f9277i0 = ConnectionsManager.getInstance(j8Var.currentAccount).sendRequest(getwebpagepreview, new ai.h(j8Var, 12));
    }

    public static void S(ei.j8 r7, org.telegram.tgnet.TLObject r8) {
        throw new UnsupportedOperationException("Method not decompiled: ei.j8.S(ei.j8, org.telegram.tgnet.TLObject):void");
    }

    public static void T(j8 j8Var, String str) {
        c8 c8Var = j8Var.f9279k0;
        if (str == null || TextUtils.equals(str, j8Var.f9278j0)) {
            return;
        }
        j8Var.f9278j0 = str;
        boolean W = j8Var.W(str);
        AndroidUtilities.cancelRunOnUIThread(c8Var);
        if (W) {
            if (!j8Var.f9276h0 || j8Var.f9275g0 != null) {
                j8Var.f9276h0 = true;
                j8Var.f9275g0 = null;
                f8 f8Var = j8Var.X;
                if (f8Var != null) {
                    f8Var.N(true);
                }
            }
            AndroidUtilities.runOnUIThread(c8Var, 700L);
        } else if (j8Var.f9276h0 || j8Var.f9275g0 != null) {
            j8Var.f9276h0 = false;
            j8Var.f9275g0 = null;
            if (j8Var.f9277i0 != 0) {
                ConnectionsManager.getInstance(j8Var.currentAccount).cancelRequest(j8Var.f9277i0, true);
                j8Var.f9277i0 = 0;
            }
            f8 f8Var2 = j8Var.X;
            if (f8Var2 != null) {
                f8Var2.N(true);
            }
        }
        j8Var.f9270b0.setEnabled(W);
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
    public final CharSequence A() {
        return LocaleController.getString(R.string.StoryLinkCreate);
    }

    public final void V() {
        this.f9276h0 = false;
        this.f9275g0 = null;
        if (this.f9277i0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f9277i0, true);
            this.f9277i0 = 0;
        }
        f8 f8Var = this.X;
        if (f8Var != null) {
            f8Var.N(true);
        }
    }

    public final boolean W(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f9280l0 == null) {
            this.f9280l0 = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.f9280l0.matcher(str).find();
    }

    public final void Y() {
        String str;
        if (!this.f9270b0.W) {
            return;
        }
        if (this.f9273e0 != null) {
            rg.n0 n0Var = new rg.n0();
            n0Var.f45562c = this.Y.f22401b.getText().toString();
            if (this.m0) {
                str = this.Z.f22401b.getText().toString();
            } else {
                str = null;
            }
            n0Var.f45561b = str;
            n0Var.d = this.f9275g0;
            n0Var.e = this.f9282o0;
            n0Var.f45563f = this.f9281n0;
            this.f9273e0.run(n0Var);
            this.f9273e0 = null;
        }
        dismiss();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f9274f0 != 0) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i12 = 0; i12 < hVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i12);
                if (webPage != null && this.f9274f0 == webPage.f20425id) {
                    if (X(webPage)) {
                        webPage = null;
                    }
                    this.f9275g0 = webPage;
                    this.f9276h0 = false;
                    this.f9274f0 = 0L;
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
        AndroidUtilities.hideKeyboard(this.Y.f22401b);
        AndroidUtilities.hideKeyboard(this.Z.f22401b);
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
    public final hm0 x(im0 im0Var) {
        ?? s61Var = new s61(this.d, getContext(), this.currentAccount, 0, true, new ai.q(this, 18), this.resourcesProvider);
        this.X = s61Var;
        return s61Var;
    }
}
