package fh;

import android.os.Bundle;
import android.text.Layout;
import android.text.Spanned;
import android.view.View;
import android.widget.FrameLayout;
import java.util.concurrent.Executor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rc;
import org.telegram.ui.LaunchActivity;
public final class f0 implements Utilities.Callback2 {
    public final int f6432a;
    public final Object f6433b;
    public final Object f6434c;
    public final Object d;

    public f0(Object obj, Object obj2, Object obj3, int i9) {
        this.f6432a = i9;
        this.f6433b = obj;
        this.f6434c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        rc rcVar;
        rc rcVar2;
        switch (this.f6432a) {
            case 0:
                k0 k0Var = (k0) this.f6433b;
                kh.x3[] x3VarArr = (kh.x3[]) this.f6434c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                View view = (View) obj;
                CharSequence charSequence = (CharSequence) obj2;
                kh.x3 x3Var = x3VarArr[0];
                if (x3Var != null) {
                    x3Var.e(true);
                }
                CharSequence replaceTags = AndroidUtilities.replaceTags(charSequence);
                float x10 = ((View) ((View) view.getParent()).getParent()).getX() + ((View) view.getParent()).getX() + view.getX();
                float y10 = ((View) ((View) view.getParent()).getParent()).getY() + ((View) view.getParent()).getY() + view.getY();
                if (view instanceof qc) {
                    Layout layout = ((qc) view).getLayout();
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        rc[] rcVarArr = (rc[]) spanned.getSpans(0, text.length(), rc.class);
                        if (rcVarArr.length > 0 && (rcVar = rcVarArr[0]) != null) {
                            int spanStart = spanned.getSpanStart(rcVar);
                            x10 += layout.getPrimaryHorizontal(spanStart) + (rcVarArr[0].a() / 2);
                            y10 += layout.getLineTop(layout.getLineForOffset(spanStart));
                        }
                    }
                }
                kh.x3 x3Var2 = new kh.x3(k0Var.getContext(), 3);
                x3VarArr[0] = x3Var2;
                x3Var2.q(true);
                x3Var2.l(11.0f, 8.0f, 11.0f, 7.0f);
                x3Var2.r(10.0f);
                x3Var2.t(replaceTags);
                x3Var2.f16352h0 = new b0(x3Var2, 0);
                x3Var2.setTranslationY((-AndroidUtilities.dp(100.0f)) + y10);
                x3Var2.h = AndroidUtilities.dp(300.0f);
                x3Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                x3Var2.n(0.0f, x10 - AndroidUtilities.dp(4.0f));
                frameLayout.addView(x3Var2, g7.e6.e(-1, 100, 55));
                x3Var2.v();
                return;
            case 1:
                f6 f6Var = (f6) this.f6433b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                String str = (String) obj2;
                ((ve.d) this.f6434c).b();
                if (((Boolean) obj).booleanValue()) {
                    gh.p1 p1Var = f6Var.f6461b0;
                    if (p1Var != null) {
                        p1Var.run(tL_starGiftUnique);
                    }
                    f6Var.dismiss();
                    return;
                }
                return;
            case 2:
                gh.o0.Q((gh.o0) this.f6433b, (ve.d) this.f6434c, (org.telegram.ui.ActionBar.c2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                gh.k5 k5Var = (gh.k5) this.f6433b;
                kh.x3[] x3VarArr2 = (kh.x3[]) this.f6434c;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                View view2 = (View) obj;
                CharSequence charSequence2 = (CharSequence) obj2;
                kh.x3 x3Var3 = x3VarArr2[0];
                if (x3Var3 != null) {
                    x3Var3.e(true);
                }
                CharSequence replaceTags2 = AndroidUtilities.replaceTags(charSequence2);
                float x11 = ((View) ((View) view2.getParent()).getParent()).getX() + ((View) view2.getParent()).getX() + view2.getX();
                float y11 = ((View) ((View) view2.getParent()).getParent()).getY() + ((View) view2.getParent()).getY() + view2.getY();
                if (view2 instanceof qc) {
                    Layout layout2 = ((qc) view2).getLayout();
                    CharSequence text2 = layout2.getText();
                    if (text2 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text2;
                        rc[] rcVarArr2 = (rc[]) spanned2.getSpans(0, text2.length(), rc.class);
                        if (rcVarArr2.length > 0 && (rcVar2 = rcVarArr2[0]) != null) {
                            int spanStart2 = spanned2.getSpanStart(rcVar2);
                            x11 += layout2.getPrimaryHorizontal(spanStart2) + (rcVarArr2[0].a() / 2);
                            y11 += layout2.getLineTop(layout2.getLineForOffset(spanStart2));
                        }
                    }
                }
                kh.x3 x3Var4 = new kh.x3(k5Var.getContext(), 3);
                x3VarArr2[0] = x3Var4;
                x3Var4.q(true);
                x3Var4.l(11.0f, 8.0f, 11.0f, 7.0f);
                x3Var4.r(10.0f);
                x3Var4.t(replaceTags2);
                x3Var4.f16352h0 = new b0(x3Var4, 2);
                x3Var4.setTranslationY((-AndroidUtilities.dp(100.0f)) + y11);
                x3Var4.h = AndroidUtilities.dp(300.0f);
                x3Var4.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                x3Var4.n(0.0f, x11 - AndroidUtilities.dp(4.0f));
                frameLayout2.addView(x3Var4, g7.e6.e(-1, 100, 55));
                x3Var4.v();
                return;
            case 4:
                ((ConnectionsManager) this.f6433b).lambda$sendRequestTypedAndProcessUpdates$5((Executor) this.f6434c, (Utilities.Callback2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 5:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                org.telegram.ui.Components.e0.V((org.telegram.ui.Components.e0) this.f6433b, (ve.d) this.f6434c, (TL_aicompose.TL_aiComposeTone) this.d);
                return;
            case 6:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                org.telegram.ui.Components.q.R((org.telegram.ui.Components.q) this.f6433b, (org.telegram.ui.ActionBar.b6) this.f6434c, (TL_aicompose.AiComposeTone) this.d, (TLRPC.TL_error) obj2);
                return;
            case 7:
                TLRPC.Bool bool3 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.ui.Components.y.O((org.telegram.ui.Components.y) this.f6433b, (ve.d) this.f6434c, (org.telegram.ui.ActionBar.c2) this.d);
                return;
            default:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.f6433b;
                String str2 = (String) this.f6434c;
                TLRPC.User user = (TLRPC.User) this.d;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.b6 b6Var = y0Var.f44077e;
                if (updates != null) {
                    MessagesController.getInstance(y0Var.I).processUpdates(updates, false);
                    y0Var.v("requested_chat_sent", org.telegram.ui.web.y0.x(str2, "req_id"));
                    long j10 = y0Var.Q.f22527id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f22527id);
                    org.telegram.ui.web.c0 c0Var = new org.telegram.ui.web.c0(y0Var, bundle, user, j10);
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(c0Var);
                    }
                    org.telegram.ui.web.e0 e0Var = y0Var.f44074c;
                    if (e0Var != null) {
                        e0Var.b();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    new oc(y0Var, b6Var).d0(tL_error3, false);
                    y0Var.v("requested_chat_failed", org.telegram.ui.web.y0.x(str2, "req_id"));
                    return;
                } else {
                    new oc(y0Var, b6Var).c0("UNKNOWN_BUTTON", false);
                    y0Var.v("requested_chat_failed", org.telegram.ui.web.y0.x(str2, "req_id"));
                    return;
                }
        }
    }
}
