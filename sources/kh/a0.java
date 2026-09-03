package kh;

import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import nh.j7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.tc;
import org.telegram.ui.sg1;
import org.telegram.ui.web.BotWebViewContainer$BotWebViewProxy;
public final class a0 implements Utilities.Callback2 {
    public final int f10564a;
    public final Object f10565b;
    public final Object f10566c;
    public final Object d;

    public a0(Object obj, Object obj2, Object obj3, int i10) {
        this.f10564a = i10;
        this.f10565b = obj;
        this.f10566c = obj2;
        this.d = obj3;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        tc tcVar;
        tc tcVar2;
        switch (this.f10564a) {
            case 0:
                f0 f0Var = (f0) this.f10565b;
                ph.f3[] f3VarArr = (ph.f3[]) this.f10566c;
                FrameLayout frameLayout = (FrameLayout) this.d;
                View view = (View) obj;
                CharSequence charSequence = (CharSequence) obj2;
                ph.f3 f3Var = f3VarArr[0];
                if (f3Var != null) {
                    f3Var.e(true);
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
                ph.f3 f3Var2 = new ph.f3(f0Var.getContext(), 3);
                f3VarArr[0] = f3Var2;
                f3Var2.p(true);
                f3Var2.k(11.0f, 8.0f, 11.0f, 7.0f);
                f3Var2.q(10.0f);
                f3Var2.s(replaceTags);
                f3Var2.f41662i0 = new w(f3Var2, 0);
                f3Var2.setTranslationY((-AndroidUtilities.dp(100.0f)) + y10);
                f3Var2.h = AndroidUtilities.dp(300.0f);
                f3Var2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                f3Var2.m(0.0f, x10 - AndroidUtilities.dp(4.0f));
                frameLayout.addView(f3Var2, k7.b6.e(-1, 100, 55));
                f3Var2.u();
                return;
            case 1:
                p5 p5Var = (p5) this.f10565b;
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) this.d;
                String str = (String) obj2;
                ((ze.c) this.f10566c).b();
                if (((Boolean) obj).booleanValue()) {
                    lh.n1 n1Var = p5Var.f10862c0;
                    if (n1Var != null) {
                        n1Var.run(tL_starGiftUnique);
                    }
                    p5Var.dismiss();
                    return;
                }
                return;
            case 2:
                lh.n0.R((lh.n0) this.f10565b, (ze.c) this.f10566c, (org.telegram.ui.ActionBar.d2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 3:
                lh.g5 g5Var = (lh.g5) this.f10565b;
                ph.f3[] f3VarArr2 = (ph.f3[]) this.f10566c;
                FrameLayout frameLayout2 = (FrameLayout) this.d;
                View view2 = (View) obj;
                CharSequence charSequence2 = (CharSequence) obj2;
                ph.f3 f3Var3 = f3VarArr2[0];
                if (f3Var3 != null) {
                    f3Var3.e(true);
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
                ph.f3 f3Var4 = new ph.f3(g5Var.getContext(), 3);
                f3VarArr2[0] = f3Var4;
                f3Var4.p(true);
                f3Var4.k(11.0f, 8.0f, 11.0f, 7.0f);
                f3Var4.q(10.0f);
                f3Var4.s(replaceTags2);
                f3Var4.f41662i0 = new w(f3Var4, 2);
                f3Var4.setTranslationY((-AndroidUtilities.dp(100.0f)) + y11);
                f3Var4.h = AndroidUtilities.dp(300.0f);
                f3Var4.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
                f3Var4.m(0.0f, x11 - AndroidUtilities.dp(4.0f));
                frameLayout2.addView(f3Var4, k7.b6.e(-1, 100, 55));
                f3Var4.u();
                return;
            case 4:
                ((ConnectionsManager) this.f10565b).lambda$sendRequestTypedAndProcessUpdates$5((Executor) this.f10566c, (Utilities.Callback2) this.d, (TLRPC.Updates) obj, (TLRPC.TL_error) obj2);
                return;
            case 5:
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                org.telegram.ui.Components.f0.W((org.telegram.ui.Components.f0) this.f10565b, (ze.c) this.f10566c, (TL_aicompose.TL_aiComposeTone) this.d);
                return;
            case 6:
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                org.telegram.ui.Components.r.S((org.telegram.ui.Components.r) this.f10565b, (f6) this.f10566c, (TL_aicompose.AiComposeTone) this.d, (TLRPC.TL_error) obj2);
                return;
            case 7:
                TLRPC.Bool bool3 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                org.telegram.ui.Components.z.P((org.telegram.ui.Components.z) this.f10565b, (ze.c) this.f10566c, (org.telegram.ui.ActionBar.d2) this.d);
                return;
            default:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) this.f10565b;
                j7 j7Var = (j7) this.f10566c;
                BotWebViewContainer$BotWebViewProxy botWebViewContainer$BotWebViewProxy = (BotWebViewContainer$BotWebViewProxy) this.d;
                String str2 = (String) obj;
                ArrayList arrayList = (ArrayList) obj2;
                if (TextUtils.isEmpty(str2)) {
                    c1Var.z(j7Var, "prepared_message_sent", null);
                    org.telegram.ui.web.g0 g0Var = c1Var.f39385c;
                    if (g0Var != null) {
                        g0Var.c();
                    }
                    AndroidUtilities.runOnUIThread(new sg1(9, botWebViewContainer$BotWebViewProxy, arrayList), 500L);
                    return;
                }
                c1Var.z(j7Var, "prepared_message_failed", org.telegram.ui.web.c1.B(str2, "error"));
                return;
        }
    }
}
