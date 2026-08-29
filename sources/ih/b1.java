package ih;

import android.app.Activity;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import java.net.URLEncoder;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stats;
import org.telegram.ui.Components.tc;
import org.telegram.ui.tn;
import org.telegram.ui.z6;
public final class b1 implements Utilities.Callback {
    public final int f9029a;
    public final Object f9030b;
    public final Object f9031c;

    public b1(int i10, Object obj, Object obj2) {
        this.f9029a = i10;
        this.f9030b = obj;
        this.f9031c = obj2;
    }

    private final void a(Object obj) {
        org.telegram.ui.q3 q3Var = (org.telegram.ui.q3) this.f9030b;
        Activity activity = (Activity) this.f9031c;
        String str = (String) obj;
        if (!TextUtils.isEmpty(str) && q3Var.getWebView() != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str.trim());
            AndroidUtilities.addLinksSafe(spannableStringBuilder, 1, false, true);
            URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), URLSpan.class);
            int length = spannableStringBuilder.length();
            int i10 = 0;
            for (int i11 = 0; i11 < uRLSpanArr.length; i11++) {
                length = Math.min(spannableStringBuilder.getSpanStart(uRLSpanArr[i11]), length);
                i10 = Math.max(spannableStringBuilder.getSpanEnd(uRLSpanArr[i11]), i10);
            }
            Uri uriParseSafe = Utilities.uriParseSafe(str);
            if (uriParseSafe != null && TextUtils.equals(uriParseSafe.getScheme(), "javascript")) {
                return;
            }
            String str2 = null;
            if ((uRLSpanArr.length > 0 && length == 0 && i10 > 0) || (uriParseSafe != null && uriParseSafe.getScheme() != null)) {
                if (uriParseSafe != null && uriParseSafe.getScheme() == null && uriParseSafe.getHost() == null && uriParseSafe.getPath() != null) {
                    str = ye.d.v(uriParseSafe, "https", null, uriParseSafe.getPath(), "/");
                }
                q3Var.getWebView().loadUrl(str);
                return;
            }
            org.telegram.ui.web.l.b(activity, str);
            org.telegram.ui.web.w0 webView = q3Var.getWebView();
            String str3 = org.telegram.ui.web.k1.a().f44089b;
            if (str3 != null) {
                StringBuilder n10 = com.google.android.recaptcha.internal.a.n(str3);
                n10.append(URLEncoder.encode(str));
                str2 = n10.toString();
            }
            webView.loadUrl(str2);
        }
    }

    private final void b(Object obj) {
        tn tnVar = (tn) this.f9030b;
        TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) this.f9031c;
        Long l10 = (Long) obj;
        if (tnVar.N3 == 1) {
            org.telegram.ui.Components.c5.M(tnVar.getParentActivity(), tnVar.P5, new z6(tnVar, botInlineResult, l10, 2), tnVar.f42746aa);
        } else {
            tnVar.cb(botInlineResult, true, 0, l10.longValue());
        }
    }

    private final void c(Object obj) {
        tn tnVar = (tn) this.f9030b;
        org.telegram.ui.ActionBar.c2[] c2VarArr = (org.telegram.ui.ActionBar.c2[]) this.f9031c;
        TL_stats.TL_statsPollStats tL_statsPollStats = (TL_stats.TL_statsPollStats) obj;
        try {
            c2VarArr[0].dismiss();
        } catch (Throwable unused) {
        }
        c2VarArr[0] = null;
        if (tL_statsPollStats != null) {
            if (tL_statsPollStats.votes_graph instanceof TL_stats.TL_statsGraphError) {
                j7.l1.v(R.string.PollStatsWillLater, tc.a0(tnVar), R.raw.timer_toast, 24);
                return;
            }
            new eh.g(tnVar.getParentActivity(), tnVar.f42746aa, tL_statsPollStats).show();
        }
    }

    private final void d(Object obj) {
        tn tnVar = (tn) this.f9030b;
        MessageObject messageObject = (MessageObject) this.f9031c;
        tnVar.getClass();
        TLRPC.SuggestedPost tl = ((MessageSuggestionParams) obj).toTl();
        if (messageObject != null && messageObject.messageOwner != null && tl != null) {
            tnVar.getMessagesController().addOfferToSuggestedMessage(messageObject, tl);
        }
    }

    @Override
    public final void run(java.lang.Object r32) {
        throw new UnsupportedOperationException("Method not decompiled: ih.b1.run(java.lang.Object):void");
    }
}
