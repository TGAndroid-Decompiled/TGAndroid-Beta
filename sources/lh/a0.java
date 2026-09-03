package lh;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
public final class a0 implements Utilities.Callback2 {
    public final int f12580a;
    public final Object f12581b;
    public final Object f12582c;
    public final Object d;

    public a0(Object obj, Object obj2, Object obj3, int i10) {
        this.f12580a = i10;
        this.f12581b = obj;
        this.f12582c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        tc tcVar;
        tc tcVar2;
        switch (this.f12580a) {
            case 0:
                f0 f0Var = (f0) this.f12581b;
                qh.e3[] e3VarArr = (qh.e3[]) this.f12582c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                View view = (View) obj;
                CharSequence charSequence = (CharSequence) obj2;
                qh.e3 e3Var = e3VarArr[0];
                if (e3Var != null) {
                    e3Var.e(true);
                }
                CharSequence replaceTags = AndroidUtilities.replaceTags(charSequence);
                float x10 = ((View) ((View) view.getParent()).getParent()).getX() + ((View) view.getParent()).getX() + view.getX();
                float y10 = ((View) ((View) view.getParent()).getParent()).getY() + ((View) view.getParent()).getY() + view.getY();
                if (view instanceof sc) {
                    Layout layout = ((sc) view).getLayout();
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        tc[] tcVarArr = (tc[]) spanned.getSpans(0, text.length(), tc.class);
                        if (tcVarArr.length > 0 && (tcVar = tcVarArr[0]) != null) {
                            int spanStart = spanned.getSpanStart(tcVar);
                            x10 += layout.getPrimaryHorizontal(spanStart) + (tcVarArr[0].a() / 2);
                            y10 += layout.getLineTop(layout.getLineForOffset(spanStart));
                        }
                    }
                }
                qh.e3 e3Var2 = new qh.e3(f0Var.getContext(), 3);
                e3VarArr[0] = e3Var2;
                e3Var2.p(true);
                e3Var2.k(11.0f, 8.0f, 11.0f, 7.0f);
                e3Var2.q(10.0f);
                e3Var2.s(replaceTags);
                e3Var2.f45272i0 = new w(e3Var2, 0);
                e3Var2.setTranslationY((-AndroidUtilities.dp(100.0f)) + y10);
                e3Var2.h = AndroidUtilities.dp(300.0f);
                e3Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                e3Var2.m(0.0f, x10 - AndroidUtilities.dp(4.0f));
                frameLayout.addView(e3Var2, k7.c6.e(-1, 100, 55));
                e3Var2.u();
                return;
            case 1:
                q5 q5Var = (q5) this.f12581b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                String str = (String) obj2;
                ((af.f) this.f12582c).b();
                if (((Boolean) obj).booleanValue()) {
                    mh.m1 m1Var = q5Var.f12911c0;
                    if (m1Var != null) {
                        m1Var.run(tL_starGiftUnique);
                    }
                    q5Var.dismiss();
                    return;
                }
                return;
            case 2:
                mh.m0.R((mh.m0) this.f12581b, (af.f) this.f12582c, (org.telegram.ui.ActionBar.d2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                mh.g5 g5Var = (mh.g5) this.f12581b;
                qh.e3[] e3VarArr2 = (qh.e3[]) this.f12582c;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                View view2 = (View) obj;
                CharSequence charSequence2 = (CharSequence) obj2;
                qh.e3 e3Var3 = e3VarArr2[0];
                if (e3Var3 != null) {
                    e3Var3.e(true);
                }
                CharSequence replaceTags2 = AndroidUtilities.replaceTags(charSequence2);
                float x11 = ((View) ((View) view2.getParent()).getParent()).getX() + ((View) view2.getParent()).getX() + view2.getX();
                float y11 = ((View) ((View) view2.getParent()).getParent()).getY() + ((View) view2.getParent()).getY() + view2.getY();
                if (view2 instanceof sc) {
                    Layout layout2 = ((sc) view2).getLayout();
                    CharSequence text2 = layout2.getText();
                    if (text2 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text2;
                        tc[] tcVarArr2 = (tc[]) spanned2.getSpans(0, text2.length(), tc.class);
                        if (tcVarArr2.length > 0 && (tcVar2 = tcVarArr2[0]) != null) {
                            int spanStart2 = spanned2.getSpanStart(tcVar2);
                            x11 += layout2.getPrimaryHorizontal(spanStart2) + (tcVarArr2[0].a() / 2);
                            y11 += layout2.getLineTop(layout2.getLineForOffset(spanStart2));
                        }
                    }
                }
                qh.e3 e3Var4 = new qh.e3(g5Var.getContext(), 3);
                e3VarArr2[0] = e3Var4;
                e3Var4.p(true);
                e3Var4.k(11.0f, 8.0f, 11.0f, 7.0f);
                e3Var4.q(10.0f);
                e3Var4.s(replaceTags2);
                e3Var4.f45272i0 = new w(e3Var4, 2);
                e3Var4.setTranslationY((-AndroidUtilities.dp(100.0f)) + y11);
                e3Var4.h = AndroidUtilities.dp(300.0f);
                e3Var4.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                e3Var4.m(0.0f, x11 - AndroidUtilities.dp(4.0f));
                frameLayout2.addView(e3Var4, k7.c6.e(-1, 100, 55));
                e3Var4.u();
                return;
            case 4:
                ((ConnectionsManager) this.f12581b).lambda$sendRequestTypedAndProcessUpdates$5((Executor) this.f12582c, (Utilities.Callback2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 5:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                org.telegram.ui.Components.f0.W((org.telegram.ui.Components.f0) this.f12581b, (af.f) this.f12582c, (TL_aicompose.TL_aiComposeTone) this.d);
                return;
            case 6:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                org.telegram.ui.Components.r.S((org.telegram.ui.Components.r) this.f12581b, (g6) this.f12582c, (TL_aicompose.AiComposeTone) this.d, (TLRPC.TL_error) obj2);
                return;
            case 7:
                TLRPC.Bool bool3 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.ui.Components.z.P((org.telegram.ui.Components.z) this.f12581b, (af.f) this.f12582c, (org.telegram.ui.ActionBar.d2) this.d);
                return;
            default:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) this.f12581b;
                String str2 = (String) this.f12582c;
                TLRPC.User user = (TLRPC.User) this.d;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                g6 g6Var = a1Var.f42436e;
                if (updates != null) {
                    MessagesController.getInstance(a1Var.J).processUpdates(updates, false);
                    a1Var.v("requested_chat_sent", org.telegram.ui.web.a1.x(str2, "req_id"));
                    long j10 = a1Var.R.f20992id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f20992id);
                    org.telegram.ui.web.c0 c0Var = new org.telegram.ui.web.c0(a1Var, bundle, user, j10);
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != null) {
                        U.presentFragment(c0Var);
                    }
                    org.telegram.ui.web.f0 f0Var2 = a1Var.f42433c;
                    if (f0Var2 != null) {
                        f0Var2.b();
                        return;
                    }
                    return;
                } else if (tL_error3 != null) {
                    new qc(a1Var, g6Var).d0(tL_error3, false);
                    a1Var.v("requested_chat_failed", org.telegram.ui.web.a1.x(str2, "req_id"));
                    return;
                } else {
                    new qc(a1Var, g6Var).c0("UNKNOWN_BUTTON", false);
                    a1Var.v("requested_chat_failed", org.telegram.ui.web.a1.x(str2, "req_id"));
                    return;
                }
        }
    }
}
