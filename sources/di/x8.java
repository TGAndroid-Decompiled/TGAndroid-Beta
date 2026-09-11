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
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vb0;
public final class x8 extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public t8 X;
    public final org.telegram.ui.Cells.i3 Y;
    public final org.telegram.ui.Cells.i3 Z;
    public final FrameLayout f8395a0;
    public final d f8396b0;
    public boolean f8397c0;
    public boolean f8398d0;
    public m2 f8399e0;
    public long f8400f0;
    public TLRPC.WebPage f8401g0;
    public boolean f8402h0;
    public int f8403i0;
    public String f8404j0;
    public final q8 f8405k0;
    public Pattern f8406l0;
    public boolean m0;
    public boolean f8407n0;
    public boolean f8408o0;

    public x8(Context context, e6 e6Var, d7 d7Var, m2 m2Var) {
        super(context, null, true, true, 2, e6Var);
        this.f8405k0 = new q8(this, 0);
        this.f8399e0 = m2Var;
        fixNavigationBar();
        K();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-15.0f);
        org.telegram.ui.Cells.i3 i3Var = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.StoryLinkURLPlaceholder), true, false, -1, e6Var);
        this.Y = i3Var;
        q8 q8Var = new q8(this, 1);
        org.telegram.ui.Cells.g3 g3Var = i3Var.f22074b;
        g3Var.setImeOptions(6);
        g3Var.setOnEditorActionListener(new m.s2(q8Var, 2));
        g3Var.setHandlesColor(-12476440);
        g3Var.setCursorColor(-11230757);
        g3Var.setText("https://");
        g3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        com.google.android.gms.internal.vision.e2.m(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.Cells.p6.b(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.j6.f20862o6);
        textView.setTextColor(themedColor);
        int dp = AndroidUtilities.dp(6.0f);
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.12f, themedColor);
        int l12 = org.telegram.ui.ActionBar.j6.l1(0.15f, themedColor);
        textView.setBackground(org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, l1, l12, l12));
        w7.z5.b(textView, 0.1f, 1.5f);
        i3Var.addView(textView, w7.x5.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        b7 b7Var = new b7(8, this, textView);
        textView.setOnClickListener(new bi.u1(5, this, b7Var));
        b7Var.run();
        g3Var.addTextChangedListener(new r8(this, b7Var));
        org.telegram.ui.Cells.i3 i3Var2 = new org.telegram.ui.Cells.i3(context, LocaleController.getString(R.string.StoryLinkNamePlaceholder), true, false, -1, e6Var);
        this.Z = i3Var2;
        q8 q8Var2 = new q8(this, 1);
        org.telegram.ui.Cells.g3 g3Var2 = i3Var2.f22074b;
        g3Var2.setImeOptions(6);
        g3Var2.setOnEditorActionListener(new m.s2(q8Var2, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f8395a0 = frameLayout;
        d dVar = new d(context, e6Var, true);
        this.f8396b0 = dVar;
        dVar.g(LocaleController.getString(R.string.StoryLinkAdd), false, true);
        dVar.setOnClickListener(new p8(this, 1));
        dVar.setEnabled(V(i3Var.getText().toString()));
        frameLayout.addView(dVar, w7.x5.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.v = 0.2f;
        this.O = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        s8 s8Var = new s8(this);
        s8Var.f45777m = false;
        s8Var.C = false;
        s8Var.o(pr.h);
        s8Var.n(350L);
        this.d.setItemAnimator(s8Var);
        ll0 ll0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new bi.n0(this, context, d7Var, 2));
        t8 t8Var = this.X;
        if (t8Var != null) {
            t8Var.N(false);
        }
    }

    public static void P(x8 x8Var, Context context, d7 d7Var, View view, int i10) {
        TLRPC.WebPage webPage;
        String str;
        int i11;
        org.telegram.ui.Cells.i3 i3Var = x8Var.Z;
        org.telegram.ui.Cells.i3 i3Var2 = x8Var.Y;
        h51 G = x8Var.X.G(i10 - 1);
        if (G != null) {
            if (G.G(v8.class) && (webPage = x8Var.f8401g0) != null && !W(webPage)) {
                rg.v2 v2Var = new rg.v2(context, x8Var.currentAccount);
                rg.p0 p0Var = new rg.p0();
                p0Var.f45409c = i3Var2.f22074b.getText().toString();
                if (x8Var.m0) {
                    str = i3Var.f22074b.getText().toString();
                } else {
                    str = null;
                }
                p0Var.f45408b = str;
                TLRPC.WebPage webPage2 = x8Var.f8401g0;
                p0Var.d = webPage2;
                p0Var.f45410e = x8Var.f8408o0;
                p0Var.f45411f = x8Var.f8407n0;
                bi.o1 o1Var = new bi.o1(x8Var, 12);
                v2Var.G = p0Var;
                if (webPage2 != null && (webPage2.photo != null || MessageObject.isVideoDocument(webPage2.document))) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                vb0 vb0Var = v2Var.f45533x;
                vb0Var.setVisibility(i11);
                v2Var.f45528f.b(v2Var.f45524a, p0Var, false);
                v2Var.f45532w.a(!p0Var.f45411f, false);
                vb0Var.a(!p0Var.f45410e, false);
                v2Var.H = o1Var;
                v2Var.f45527e.setImageDrawable(new e4(d7Var, 8));
                v2Var.show();
            } else if (G.d == 2 && (view instanceof org.telegram.ui.Cells.w8)) {
                boolean z10 = !x8Var.m0;
                x8Var.m0 = z10;
                ((org.telegram.ui.Cells.w8) view).setChecked(z10);
                x8Var.X.N(true);
                if (x8Var.m0) {
                    i3Var.requestFocus();
                } else {
                    i3Var2.requestFocus();
                }
            }
        }
    }

    public static void Q(x8 x8Var) {
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        getwebpagepreview.message = x8Var.Y.f22074b.getText().toString();
        x8Var.f8403i0 = ConnectionsManager.getInstance(x8Var.currentAccount).sendRequest(getwebpagepreview, new bi.v7(x8Var, 6));
    }

    public static void R(di.x8 r7, org.telegram.tgnet.TLObject r8) {
        throw new UnsupportedOperationException("Method not decompiled: di.x8.R(di.x8, org.telegram.tgnet.TLObject):void");
    }

    public static void S(x8 x8Var, String str) {
        q8 q8Var = x8Var.f8405k0;
        if (str == null || TextUtils.equals(str, x8Var.f8404j0)) {
            return;
        }
        x8Var.f8404j0 = str;
        boolean V = x8Var.V(str);
        AndroidUtilities.cancelRunOnUIThread(q8Var);
        if (V) {
            if (!x8Var.f8402h0 || x8Var.f8401g0 != null) {
                x8Var.f8402h0 = true;
                x8Var.f8401g0 = null;
                t8 t8Var = x8Var.X;
                if (t8Var != null) {
                    t8Var.N(true);
                }
            }
            AndroidUtilities.runOnUIThread(q8Var, 700L);
        } else if (x8Var.f8402h0 || x8Var.f8401g0 != null) {
            x8Var.f8402h0 = false;
            x8Var.f8401g0 = null;
            if (x8Var.f8403i0 != 0) {
                ConnectionsManager.getInstance(x8Var.currentAccount).cancelRequest(x8Var.f8403i0, true);
                x8Var.f8403i0 = 0;
            }
            t8 t8Var2 = x8Var.X;
            if (t8Var2 != null) {
                t8Var2.N(true);
            }
        }
        x8Var.f8396b0.setEnabled(V);
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
        this.f8402h0 = false;
        this.f8401g0 = null;
        if (this.f8403i0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f8403i0, true);
            this.f8403i0 = 0;
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
        if (this.f8406l0 == null) {
            this.f8406l0 = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.f8406l0.matcher(str).find();
    }

    public final void X() {
        String str;
        if (!this.f8396b0.W) {
            return;
        }
        if (this.f8399e0 != null) {
            rg.p0 p0Var = new rg.p0();
            p0Var.f45409c = this.Y.f22074b.getText().toString();
            if (this.m0) {
                str = this.Z.f22074b.getText().toString();
            } else {
                str = null;
            }
            p0Var.f45408b = str;
            p0Var.d = this.f8401g0;
            p0Var.f45410e = this.f8408o0;
            p0Var.f45411f = this.f8407n0;
            this.f8399e0.run(p0Var);
            this.f8399e0 = null;
        }
        dismiss();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f8400f0 != 0) {
            a0.i iVar = (a0.i) objArr[0];
            for (int i12 = 0; i12 < iVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) iVar.n(i12);
                if (webPage != null && this.f8400f0 == webPage.f20022id) {
                    if (W(webPage)) {
                        webPage = null;
                    }
                    this.f8401g0 = webPage;
                    this.f8402h0 = false;
                    this.f8400f0 = 0L;
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
        AndroidUtilities.hideKeyboard(this.Y.f22074b);
        AndroidUtilities.hideKeyboard(this.Z.f22074b);
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
    public final kl0 v(ll0 ll0Var) {
        ?? v51Var = new v51(this.d, getContext(), this.currentAccount, 0, true, new ci.u(this, 7), this.resourcesProvider);
        this.X = v51Var;
        return v51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoryLinkCreate);
    }
}
