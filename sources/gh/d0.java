package gh;

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
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.pc;
import org.telegram.ui.LaunchActivity;

public final class d0 implements Utilities.Callback2 {

    public final int f7188a;

    public final Object f7189b;

    public final Object f7190c;
    public final Object d;

    public d0(Object obj, Object obj2, Object obj3, int i10) {
        this.f7188a = i10;
        this.f7189b = obj;
        this.f7190c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        pc pcVar;
        pc pcVar2;
        switch (this.f7188a) {
            case 0:
                i0 i0Var = (i0) this.f7189b;
                lh.w3[] w3VarArr = (lh.w3[]) this.f7190c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                View view = (View) obj;
                CharSequence charSequence = (CharSequence) obj2;
                lh.w3 w3Var = w3VarArr[0];
                if (w3Var != null) {
                    w3Var.e(true);
                }
                CharSequence charSequenceReplaceTags = AndroidUtilities.replaceTags(charSequence);
                float x8 = ((View) ((View) view.getParent()).getParent()).getX() + ((View) view.getParent()).getX() + view.getX();
                float y10 = ((View) ((View) view.getParent()).getParent()).getY() + ((View) view.getParent()).getY() + view.getY();
                if (view instanceof oc) {
                    Layout layout = ((oc) view).getLayout();
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        pc[] pcVarArr = (pc[]) spanned.getSpans(0, text.length(), pc.class);
                        if (pcVarArr.length > 0 && (pcVar = pcVarArr[0]) != null) {
                            int spanStart = spanned.getSpanStart(pcVar);
                            x8 += layout.getPrimaryHorizontal(spanStart) + (pcVarArr[0].a() / 2);
                            y10 += layout.getLineTop(layout.getLineForOffset(spanStart));
                        }
                    }
                }
                lh.w3 w3Var2 = new lh.w3(i0Var.getContext(), 3);
                w3VarArr[0] = w3Var2;
                w3Var2.q(true);
                w3Var2.l(11.0f, 8.0f, 11.0f, 7.0f);
                w3Var2.r(10.0f);
                w3Var2.t(charSequenceReplaceTags);
                w3Var2.f16984h0 = new z(w3Var2, 0);
                w3Var2.setTranslationY((-AndroidUtilities.dp(100.0f)) + y10);
                w3Var2.h = AndroidUtilities.dp(300.0f);
                w3Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                w3Var2.n(0.0f, x8 - AndroidUtilities.dp(4.0f));
                frameLayout.addView(w3Var2, h7.z5.e(-1, 100, 55));
                w3Var2.v();
                break;
            case 1:
                x5 x5Var = (x5) this.f7189b;
                we.d dVar = (we.d) this.f7190c;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                dVar.b();
                if (((Boolean) obj).booleanValue()) {
                    hh.p1 p1Var = x5Var.f7627b0;
                    if (p1Var != null) {
                        p1Var.run(tL_starGiftUnique);
                    }
                    x5Var.dismiss();
                }
                break;
            case 2:
                hh.o0.R((hh.o0) this.f7189b, (we.d) this.f7190c, (org.telegram.ui.ActionBar.b2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 3:
                hh.i5 i5Var = (hh.i5) this.f7189b;
                lh.w3[] w3VarArr2 = (lh.w3[]) this.f7190c;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                View view2 = (View) obj;
                CharSequence charSequence2 = (CharSequence) obj2;
                lh.w3 w3Var3 = w3VarArr2[0];
                if (w3Var3 != null) {
                    w3Var3.e(true);
                }
                CharSequence charSequenceReplaceTags2 = AndroidUtilities.replaceTags(charSequence2);
                float x10 = ((View) ((View) view2.getParent()).getParent()).getX() + ((View) view2.getParent()).getX() + view2.getX();
                float y11 = ((View) ((View) view2.getParent()).getParent()).getY() + ((View) view2.getParent()).getY() + view2.getY();
                if (view2 instanceof oc) {
                    Layout layout2 = ((oc) view2).getLayout();
                    CharSequence text2 = layout2.getText();
                    if (text2 instanceof Spanned) {
                        Spanned spanned2 = (Spanned) text2;
                        pc[] pcVarArr2 = (pc[]) spanned2.getSpans(0, text2.length(), pc.class);
                        if (pcVarArr2.length > 0 && (pcVar2 = pcVarArr2[0]) != null) {
                            int spanStart2 = spanned2.getSpanStart(pcVar2);
                            x10 += layout2.getPrimaryHorizontal(spanStart2) + (pcVarArr2[0].a() / 2);
                            y11 += layout2.getLineTop(layout2.getLineForOffset(spanStart2));
                        }
                    }
                }
                lh.w3 w3Var4 = new lh.w3(i5Var.getContext(), 3);
                w3VarArr2[0] = w3Var4;
                w3Var4.q(true);
                w3Var4.l(11.0f, 8.0f, 11.0f, 7.0f);
                w3Var4.r(10.0f);
                w3Var4.t(charSequenceReplaceTags2);
                w3Var4.f16984h0 = new z(w3Var4, 2);
                w3Var4.setTranslationY((-AndroidUtilities.dp(100.0f)) + y11);
                w3Var4.h = AndroidUtilities.dp(300.0f);
                w3Var4.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                w3Var4.n(0.0f, x10 - AndroidUtilities.dp(4.0f));
                frameLayout2.addView(w3Var4, h7.z5.e(-1, 100, 55));
                w3Var4.v();
                break;
            case 4:
                ((ConnectionsManager) this.f7189b).lambda$sendRequestTypedAndProcessUpdates$5((Executor) this.f7190c, (Utilities.Callback2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                break;
            case 5:
                org.telegram.ui.Components.e0.W((org.telegram.ui.Components.e0) this.f7189b, (we.d) this.f7190c, (TL_aicompose.TL_aiComposeTone) this.d);
                break;
            case 6:
                org.telegram.ui.Components.q.S((org.telegram.ui.Components.q) this.f7189b, (org.telegram.ui.ActionBar.c6) this.f7190c, (TL_aicompose.AiComposeTone) this.d, (TLRPC.TL_error) obj2);
                break;
            case 7:
                org.telegram.ui.Components.y.P((org.telegram.ui.Components.y) this.f7189b, (we.d) this.f7190c, (org.telegram.ui.ActionBar.b2) this.d);
                break;
            default:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.f7189b;
                String str = (String) this.f7190c;
                TLRPC.User user = (TLRPC.User) this.d;
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                org.telegram.ui.ActionBar.c6 c6Var = z0Var.f44064e;
                if (updates != null) {
                    MessagesController.getInstance(z0Var.I).processUpdates(updates, false);
                    z0Var.v("requested_chat_sent", org.telegram.ui.web.z0.x(str, "req_id"));
                    long j10 = z0Var.Q.f22527id;
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f22527id);
                    org.telegram.ui.web.d0 d0Var = new org.telegram.ui.web.d0(z0Var, bundle, user, j10);
                    org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                    if (n2VarU != null) {
                        n2VarU.presentFragment(d0Var);
                    }
                    org.telegram.ui.web.f0 f0Var = z0Var.f44061c;
                    if (f0Var != null) {
                        f0Var.b();
                    }
                } else if (tL_error == null) {
                    new mc(z0Var, c6Var).c0("UNKNOWN_BUTTON", false);
                    z0Var.v("requested_chat_failed", org.telegram.ui.web.z0.x(str, "req_id"));
                } else {
                    new mc(z0Var, c6Var).d0(tL_error, false);
                    z0Var.v("requested_chat_failed", org.telegram.ui.web.z0.x(str, "req_id"));
                }
                break;
        }
    }
}
