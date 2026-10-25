package fi;

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
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mc0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.t61;
public final class f8 extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public b8 X;
    public final org.telegram.ui.Cells.g3 Y;
    public final org.telegram.ui.Cells.g3 Z;
    public final FrameLayout f10867a0;
    public final d f10868b0;
    public boolean f10869c0;
    public boolean f10870d0;
    public ai.n1 f10871e0;
    public long f10872f0;
    public TLRPC.WebPage f10873g0;
    public boolean f10874h0;
    public int f10875i0;
    public String f10876j0;
    public final y7 f10877k0;
    public Pattern f10878l0;
    public boolean m0;
    public boolean f10879n0;
    public boolean f10880o0;

    public f8(Context context, s5 s5Var, o6 o6Var, ai.n1 n1Var) {
        super(context, null, true, true, 2, s5Var);
        this.f10877k0 = new y7(this, 0);
        this.f10871e0 = n1Var;
        fixNavigationBar();
        K();
        this.I = AndroidUtilities.dp(4.0f);
        this.J = AndroidUtilities.dp(-15.0f);
        org.telegram.ui.Cells.g3 g3Var = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.StoryLinkURLPlaceholder), true, false, -1, s5Var);
        this.Y = g3Var;
        g3Var.d(new y7(this, 1));
        org.telegram.ui.Cells.e3 e3Var = g3Var.d;
        e3Var.setHandlesColor(-12476440);
        e3Var.setCursorColor(-11230757);
        e3Var.setText("https://");
        e3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        ic.a.o(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.d3.h(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int i10 = org.telegram.ui.ActionBar.y6.f23558o6;
        int themedColor = getThemedColor(i10);
        org.telegram.ui.ActionBar.f7.V(textView, i10, s5Var);
        int dp = AndroidUtilities.dp(6.0f);
        int o12 = org.telegram.ui.ActionBar.y6.o1(0.12f, themedColor);
        int o13 = org.telegram.ui.ActionBar.y6.o1(0.15f, themedColor);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, o12, o13, o13);
        org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.12f, i10);
        org.telegram.ui.ActionBar.b7 L2 = org.telegram.ui.ActionBar.f7.L(0.15f, i10);
        textView.setBackground(j02);
        org.telegram.ui.ActionBar.f7.k(textView, j02, L, L2, s5Var);
        gb1.c(textView, 0.1f, 1.5f);
        g3Var.addView(textView, gb1.h(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        e2.q0 q0Var = new e2.q0(19, this, textView);
        textView.setOnClickListener(new bi.q(15, this, q0Var));
        q0Var.run();
        e3Var.addTextChangedListener(new z7(this, q0Var));
        org.telegram.ui.Cells.g3 g3Var2 = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.StoryLinkNamePlaceholder), true, false, -1, s5Var);
        this.Z = g3Var2;
        g3Var2.d(new y7(this, 1));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f10867a0 = frameLayout;
        d dVar = new d(context, s5Var, true);
        this.f10868b0 = dVar;
        dVar.i(LocaleController.getString(R.string.StoryLinkAdd), false, true);
        dVar.setOnClickListener(new x7(this, 1));
        dVar.setEnabled(V(g3Var.getText().toString()));
        frameLayout.addView(dVar, gb1.h(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.v = 0.2f;
        this.O = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        a8 a8Var = new a8(this);
        a8Var.f47760m = false;
        a8Var.C = false;
        a8Var.o(ds.h);
        a8Var.n(350L);
        this.d.setItemAnimator(a8Var);
        mm0 mm0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i11, 0, i11, 0);
        this.d.setOnItemClickListener(new di.g0(this, context, o6Var, 2));
        b8 b8Var = this.X;
        if (b8Var != null) {
            b8Var.O(false);
        }
    }

    public static void P(f8 f8Var, Context context, o6 o6Var, View view, int i10) {
        TLRPC.WebPage webPage;
        String str;
        int i11;
        org.telegram.ui.Cells.g3 g3Var = f8Var.Z;
        org.telegram.ui.Cells.g3 g3Var2 = f8Var.Y;
        t61 G = f8Var.X.G(i10 - 1);
        if (G != null) {
            if (G.H(d8.class) && (webPage = f8Var.f10873g0) != null && !W(webPage)) {
                sg.v2 v2Var = new sg.v2(context, f8Var.currentAccount);
                sg.o0 o0Var = new sg.o0();
                o0Var.f48393c = g3Var2.d.getText().toString();
                if (f8Var.m0) {
                    str = g3Var.d.getText().toString();
                } else {
                    str = null;
                }
                o0Var.f48392b = str;
                TLRPC.WebPage webPage2 = f8Var.f10873g0;
                o0Var.d = webPage2;
                o0Var.e = f8Var.f10880o0;
                o0Var.f48394f = f8Var.f10879n0;
                ai.i iVar = new ai.i(f8Var, 25);
                v2Var.G = o0Var;
                if (webPage2 != null && (webPage2.photo != null || MessageObject.isVideoDocument(webPage2.document))) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                mc0 mc0Var = v2Var.f48541x;
                mc0Var.setVisibility(i11);
                v2Var.f48536f.b(v2Var.f48533a, o0Var, false);
                v2Var.f48540w.a(!o0Var.f48394f, false);
                mc0Var.a(!o0Var.e, false);
                v2Var.H = iVar;
                v2Var.e.setImageDrawable(new u3(o6Var, 8));
                v2Var.show();
            } else if (G.d == 2 && (view instanceof org.telegram.ui.Cells.a9)) {
                boolean z10 = !f8Var.m0;
                f8Var.m0 = z10;
                ((org.telegram.ui.Cells.a9) view).setChecked(z10);
                f8Var.X.O(true);
                if (f8Var.m0) {
                    g3Var.requestFocus();
                } else {
                    g3Var2.requestFocus();
                }
            }
        }
    }

    public static void Q(f8 f8Var) {
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        getwebpagepreview.message = f8Var.Y.d.getText().toString();
        f8Var.f10875i0 = ConnectionsManager.getInstance(f8Var.currentAccount).sendRequest(getwebpagepreview, new bi.i0(f8Var, 11));
    }

    public static void R(fi.f8 r7, org.telegram.tgnet.TLObject r8) {
        throw new UnsupportedOperationException("Method not decompiled: fi.f8.R(fi.f8, org.telegram.tgnet.TLObject):void");
    }

    public static void S(f8 f8Var, String str) {
        y7 y7Var = f8Var.f10877k0;
        if (str == null || TextUtils.equals(str, f8Var.f10876j0)) {
            return;
        }
        f8Var.f10876j0 = str;
        boolean V = f8Var.V(str);
        AndroidUtilities.cancelRunOnUIThread(y7Var);
        if (V) {
            if (!f8Var.f10874h0 || f8Var.f10873g0 != null) {
                f8Var.f10874h0 = true;
                f8Var.f10873g0 = null;
                b8 b8Var = f8Var.X;
                if (b8Var != null) {
                    b8Var.O(true);
                }
            }
            AndroidUtilities.runOnUIThread(y7Var, 700L);
        } else if (f8Var.f10874h0 || f8Var.f10873g0 != null) {
            f8Var.f10874h0 = false;
            f8Var.f10873g0 = null;
            if (f8Var.f10875i0 != 0) {
                ConnectionsManager.getInstance(f8Var.currentAccount).cancelRequest(f8Var.f10875i0, true);
                f8Var.f10875i0 = 0;
            }
            b8 b8Var2 = f8Var.X;
            if (b8Var2 != null) {
                b8Var2.O(true);
            }
        }
        f8Var.f10868b0.setEnabled(V);
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
        this.f10874h0 = false;
        this.f10873g0 = null;
        if (this.f10875i0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f10875i0, true);
            this.f10875i0 = 0;
        }
        b8 b8Var = this.X;
        if (b8Var != null) {
            b8Var.O(true);
        }
    }

    public final boolean V(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f10878l0 == null) {
            this.f10878l0 = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.f10878l0.matcher(str).find();
    }

    public final void X() {
        String str;
        if (!this.f10868b0.f10687c0) {
            return;
        }
        if (this.f10871e0 != null) {
            sg.o0 o0Var = new sg.o0();
            o0Var.f48393c = this.Y.d.getText().toString();
            if (this.m0) {
                str = this.Z.d.getText().toString();
            } else {
                str = null;
            }
            o0Var.f48392b = str;
            o0Var.d = this.f10873g0;
            o0Var.e = this.f10880o0;
            o0Var.f48394f = this.f10879n0;
            this.f10871e0.run(o0Var);
            this.f10871e0 = null;
        }
        dismiss();
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.didReceivedWebpagesInUpdates && this.f10872f0 != 0) {
            a0.h hVar = (a0.h) objArr[0];
            for (int i12 = 0; i12 < hVar.m(); i12++) {
                TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i12);
                if (webPage != null && this.f10872f0 == webPage.f22180id) {
                    if (W(webPage)) {
                        webPage = null;
                    }
                    this.f10873g0 = webPage;
                    this.f10874h0 = false;
                    this.f10872f0 = 0L;
                    b8 b8Var = this.X;
                    if (b8Var != null) {
                        b8Var.O(true);
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
        AndroidUtilities.runOnUIThread(new y7(this, 2), 150L);
    }

    @Override
    public final lm0 v(mm0 mm0Var) {
        ?? j71Var = new j71(this.d, getContext(), this.currentAccount, 0, true, new ai.e(this, 21), this.resourcesProvider);
        this.X = j71Var;
        return j71Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.StoryLinkCreate);
    }
}
