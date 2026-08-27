package lh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fb0;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zk0;

public final class j8 extends org.telegram.ui.Components.qa implements NotificationCenter.NotificationCenterDelegate {
    public f8 T;
    public final org.telegram.ui.Cells.g3 U;
    public final org.telegram.ui.Cells.g3 V;
    public final FrameLayout W;
    public final d X;
    public boolean Y;
    public boolean Z;

    public gh.d1 f16195a0;

    public long f16196b0;

    public TLRPC.WebPage f16197c0;

    public boolean f16198d0;

    public int f16199e0;

    public String f16200f0;

    public final c8 f16201g0;

    public Pattern f16202h0;

    public boolean f16203i0;

    public boolean f16204j0;

    public boolean f16205k0;

    public j8(Context context, t5 t5Var, q6 q6Var, gh.d1 d1Var) {
        super(context, null, true, false, false, false, true, 2, t5Var);
        this.f16201g0 = new c8(this, 0);
        this.f16195a0 = d1Var;
        fixNavigationBar();
        K();
        this.E = AndroidUtilities.dp(4.0f);
        this.F = AndroidUtilities.dp(-15.0f);
        org.telegram.ui.Cells.g3 g3Var = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.StoryLinkURLPlaceholder), true, false, -1, t5Var);
        this.U = g3Var;
        c8 c8Var = new c8(this, 1);
        org.telegram.ui.Cells.e3 e3Var = g3Var.f24370b;
        e3Var.setImeOptions(6);
        e3Var.setOnEditorActionListener(new m.u2(c8Var, 2));
        e3Var.setHandlesColor(-12476440);
        e3Var.setCursorColor(-11230757);
        e3Var.setText("https://");
        e3Var.setSelection(8);
        TextView textView = new TextView(getContext());
        org.telegram.ui.Cells.pa.m(12.0f, 1, textView);
        textView.setPadding(org.telegram.ui.Cells.pa.c(10.0f, R.string.Paste, textView), 0, AndroidUtilities.dp(10.0f), 0);
        textView.setGravity(17);
        int themedColor = getThemedColor(org.telegram.ui.ActionBar.g6.f23251o6);
        textView.setTextColor(themedColor);
        int iDp = AndroidUtilities.dp(6.0f);
        int iL1 = org.telegram.ui.ActionBar.g6.l1(0.12f, themedColor);
        int iL2 = org.telegram.ui.ActionBar.g6.l1(0.15f, themedColor);
        textView.setBackground(org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, iL1, iL2, iL2));
        h7.b6.b(textView, 0.1f, 1.5f);
        g3Var.addView(textView, h7.z5.d(-2, 26.0f, 21, 0.0f, 4.0f, 24.0f, 3.0f));
        k7 k7Var = new k7(3, this, textView);
        textView.setOnClickListener(new ag.q0(27, this, k7Var));
        k7Var.run();
        e3Var.addTextChangedListener(new d8(this, k7Var));
        org.telegram.ui.Cells.g3 g3Var2 = new org.telegram.ui.Cells.g3(context, LocaleController.getString(R.string.StoryLinkNamePlaceholder), true, false, -1, t5Var);
        this.V = g3Var2;
        c8 c8Var2 = new c8(this, 1);
        org.telegram.ui.Cells.e3 e3Var2 = g3Var2.f24370b;
        e3Var2.setImeOptions(6);
        e3Var2.setOnEditorActionListener(new m.u2(c8Var2, 2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        d dVar = new d(context, t5Var, true);
        this.X = dVar;
        dVar.g(LocaleController.getString(R.string.StoryLinkAdd), false, true);
        dVar.setOnClickListener(new b8(this, 1));
        dVar.setEnabled(V(g3Var.getText().toString()));
        frameLayout.addView(dVar, h7.z5.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        this.v = 0.2f;
        this.K = true;
        this.smoothKeyboardAnimationEnabled = true;
        this.smoothKeyboardByBottom = true;
        e8 e8Var = new e8(this);
        e8Var.f5819m = false;
        e8Var.C = false;
        e8Var.o(er.h);
        e8Var.n(350L);
        this.d.setItemAnimator(e8Var);
        zk0 zk0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new jh.d0(this, context, q6Var, 2));
        f8 f8Var = this.T;
        if (f8Var != null) {
            f8Var.N(false);
        }
    }

    public static void P(j8 j8Var, Context context, q6 q6Var, View view, int i10) {
        TLRPC.WebPage webPage;
        org.telegram.ui.Cells.g3 g3Var = j8Var.V;
        org.telegram.ui.Cells.g3 g3Var2 = j8Var.U;
        n41 n41VarG = j8Var.T.G(i10 - 1);
        if (n41VarG == null) {
            return;
        }
        if (!n41VarG.G(h8.class) || (webPage = j8Var.f16197c0) == null || W(webPage)) {
            if (n41VarG.d == 2 && (view instanceof org.telegram.ui.Cells.p8)) {
                boolean z10 = !j8Var.f16203i0;
                j8Var.f16203i0 = z10;
                ((org.telegram.ui.Cells.p8) view).setChecked(z10);
                j8Var.T.N(true);
                if (j8Var.f16203i0) {
                    g3Var.requestFocus();
                    return;
                } else {
                    g3Var2.requestFocus();
                    return;
                }
            }
            return;
        }
        zf.t2 t2Var = new zf.t2(context, j8Var.currentAccount);
        zf.m0 m0Var = new zf.m0();
        m0Var.f50570c = g3Var2.f24370b.getText().toString();
        m0Var.f50569b = j8Var.f16203i0 ? g3Var.f24370b.getText().toString() : null;
        TLRPC.WebPage webPage2 = j8Var.f16197c0;
        m0Var.d = webPage2;
        m0Var.f50571e = j8Var.f16205k0;
        m0Var.f50572f = j8Var.f16204j0;
        n6 n6Var = new n6(j8Var, 1);
        t2Var.C = m0Var;
        int i11 = (webPage2 == null || (webPage2.photo == null && !MessageObject.isVideoDocument(webPage2.document))) ? 8 : 0;
        fb0 fb0Var = t2Var.f50714x;
        fb0Var.setVisibility(i11);
        t2Var.f50709f.b(t2Var.f50705a, m0Var, false);
        t2Var.f50713w.a(!m0Var.f50572f, false);
        fb0Var.a(!m0Var.f50571e, false);
        t2Var.D = n6Var;
        t2Var.f50708e.setImageDrawable(new v3(q6Var, 8));
        t2Var.show();
    }

    public static void Q(j8 j8Var) {
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        getwebpagepreview.message = j8Var.U.f24370b.getText().toString();
        j8Var.f16199e0 = ConnectionsManager.getInstance(j8Var.currentAccount).sendRequest(getwebpagepreview, new cf.a(j8Var, 17));
    }

    public static void R(j8 j8Var, TLObject tLObject) {
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        if (tLObject instanceof TL_account.webPagePreview) {
            TL_account.webPagePreview webpagepreview = (TL_account.webPagePreview) tLObject;
            MessagesController.getInstance(j8Var.currentAccount).putUsers(webpagepreview.users, false);
            MessagesController.getInstance(j8Var.currentAccount).putChats(webpagepreview.chats, false);
            TLRPC.MessageMedia messageMedia = webpagepreview.media;
            if (messageMedia instanceof TLRPC.TL_messageMediaWebPage) {
                tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) messageMedia;
            } else {
                tL_messageMediaWebPage = null;
            }
        } else {
            tL_messageMediaWebPage = null;
        }
        if (tL_messageMediaWebPage != null) {
            TLRPC.WebPage webPage = tL_messageMediaWebPage.webpage;
            j8Var.f16197c0 = webPage;
            if (W(webPage)) {
                TLRPC.WebPage webPage2 = j8Var.f16197c0;
                j8Var.f16196b0 = webPage2 == null ? 0L : webPage2.f22533id;
                j8Var.f16197c0 = null;
            } else {
                j8Var.f16196b0 = 0L;
            }
        } else {
            j8Var.f16197c0 = null;
            j8Var.f16196b0 = 0L;
        }
        j8Var.f16198d0 = j8Var.f16196b0 != 0;
        f8 f8Var = j8Var.T;
        if (f8Var != null) {
            f8Var.N(true);
        }
    }

    public static void S(j8 j8Var, String str) {
        c8 c8Var = j8Var.f16201g0;
        if (str == null || TextUtils.equals(str, j8Var.f16200f0)) {
            return;
        }
        j8Var.f16200f0 = str;
        boolean zV = j8Var.V(str);
        AndroidUtilities.cancelRunOnUIThread(c8Var);
        if (zV) {
            if (!j8Var.f16198d0 || j8Var.f16197c0 != null) {
                j8Var.f16198d0 = true;
                j8Var.f16197c0 = null;
                f8 f8Var = j8Var.T;
                if (f8Var != null) {
                    f8Var.N(true);
                }
            }
            AndroidUtilities.runOnUIThread(c8Var, 700L);
        } else if (j8Var.f16198d0 || j8Var.f16197c0 != null) {
            j8Var.f16198d0 = false;
            j8Var.f16197c0 = null;
            if (j8Var.f16199e0 != 0) {
                ConnectionsManager.getInstance(j8Var.currentAccount).cancelRequest(j8Var.f16199e0, true);
                j8Var.f16199e0 = 0;
            }
            f8 f8Var2 = j8Var.T;
            if (f8Var2 != null) {
                f8Var2.N(true);
            }
        }
        j8Var.X.setEnabled(zV);
    }

    public static boolean W(TLRPC.WebPage webPage) {
        if (webPage instanceof TLRPC.TL_webPagePending) {
            return true;
        }
        return TextUtils.isEmpty(webPage.title) && TextUtils.isEmpty(webPage.description);
    }

    public final void U() {
        this.f16198d0 = false;
        this.f16197c0 = null;
        if (this.f16199e0 != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.f16199e0, true);
            this.f16199e0 = 0;
        }
        f8 f8Var = this.T;
        if (f8Var != null) {
            f8Var.N(true);
        }
    }

    public final boolean V(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f16202h0 == null) {
            this.f16202h0 = Pattern.compile("((https?)://|(www|ftp)\\.)?[a-z0-9-]+(\\.[a-z0-9-]+)+([/?]?.+)");
        }
        return this.f16202h0.matcher(str).find();
    }

    public final void X() {
        if (this.X.S) {
            if (this.f16195a0 != null) {
                zf.m0 m0Var = new zf.m0();
                m0Var.f50570c = this.U.f24370b.getText().toString();
                m0Var.f50569b = this.f16203i0 ? this.V.f24370b.getText().toString() : null;
                m0Var.d = this.f16197c0;
                m0Var.f50571e = this.f16205k0;
                m0Var.f50572f = this.f16204j0;
                this.f16195a0.run(m0Var);
                this.f16195a0 = null;
            }
            dismiss();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 != NotificationCenter.didReceivedWebpagesInUpdates || this.f16196b0 == 0) {
            return;
        }
        a0.h hVar = (a0.h) objArr[0];
        for (int i12 = 0; i12 < hVar.m(); i12++) {
            TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.n(i12);
            if (webPage != null && this.f16196b0 == webPage.f22533id) {
                if (W(webPage)) {
                    webPage = null;
                }
                this.f16197c0 = webPage;
                this.f16198d0 = false;
                this.f16196b0 = 0L;
                f8 f8Var = this.T;
                if (f8Var != null) {
                    f8Var.N(true);
                    return;
                }
                return;
            }
        }
    }

    @Override
    public final void dismiss() {
        AndroidUtilities.hideKeyboard(this.U.f24370b);
        AndroidUtilities.hideKeyboard(this.V.f24370b);
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
    public final yk0 w(zk0 zk0Var) {
        f8 f8Var = new f8(this.d, getContext(), this.currentAccount, 0, true, new a8(this, 0), this.resourcesProvider);
        this.T = f8Var;
        return f8Var;
    }

    @Override
    public final CharSequence z() {
        return LocaleController.getString(R.string.StoryLinkCreate);
    }
}
