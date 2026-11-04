package cg;

import android.os.Build;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import org.telegram.messenger.a8;
import org.telegram.messenger.li;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.x31;
import org.telegram.ui.Components.xg0;
public abstract class n {
    public static SpannableStringBuilder a(String str) {
        Spanned fromHtml;
        boolean z10;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                fromHtml = Html.fromHtml("<inject>" + str + "</inject>", 63, null, new l(new kb.a(5)));
            } else {
                fromHtml = Html.fromHtml("<inject>" + str + "</inject>", null, new l(new kb.a(5)));
            }
            if (fromHtml == null) {
                return null;
            }
            Object[] spans = fromHtml.getSpans(0, fromHtml.length(), Object.class);
            ArrayList arrayList = new ArrayList(spans.length);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : spans) {
                int spanStart = fromHtml.getSpanStart(obj);
                int spanEnd = fromHtml.getSpanEnd(obj);
                if (obj instanceof StyleSpan) {
                    int style = ((StyleSpan) obj).getStyle();
                    if ((style & 1) > 0) {
                        TLRPC.TL_messageEntityBold tL_messageEntityBold = new TLRPC.TL_messageEntityBold();
                        tL_messageEntityBold.offset = spanStart;
                        tL_messageEntityBold.length = spanEnd - spanStart;
                        arrayList.add(tL_messageEntityBold);
                    }
                    if ((style & 2) > 0) {
                        TLRPC.TL_messageEntityItalic tL_messageEntityItalic = new TLRPC.TL_messageEntityItalic();
                        tL_messageEntityItalic.offset = spanStart;
                        tL_messageEntityItalic.length = spanEnd - spanStart;
                        arrayList.add(tL_messageEntityItalic);
                    }
                } else if (obj instanceof UnderlineSpan) {
                    TLRPC.TL_messageEntityUnderline tL_messageEntityUnderline = new TLRPC.TL_messageEntityUnderline();
                    tL_messageEntityUnderline.offset = spanStart;
                    tL_messageEntityUnderline.length = spanEnd - spanStart;
                    arrayList.add(tL_messageEntityUnderline);
                } else if (obj instanceof StrikethroughSpan) {
                    TLRPC.TL_messageEntityStrike tL_messageEntityStrike = new TLRPC.TL_messageEntityStrike();
                    tL_messageEntityStrike.offset = spanStart;
                    tL_messageEntityStrike.length = spanEnd - spanStart;
                    arrayList.add(tL_messageEntityStrike);
                } else if (obj instanceof m) {
                    m mVar = (m) obj;
                    int i3 = mVar.f4722a;
                    if (i3 == 0) {
                        TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = new TLRPC.TL_messageEntitySpoiler();
                        tL_messageEntitySpoiler.offset = spanStart;
                        tL_messageEntitySpoiler.length = spanEnd - spanStart;
                        arrayList.add(tL_messageEntitySpoiler);
                    } else if (i3 == 1) {
                        if (!TextUtils.isEmpty(mVar.f4723b)) {
                            arrayList2.add(mVar);
                        } else {
                            TLRPC.TL_messageEntityPre tL_messageEntityPre = new TLRPC.TL_messageEntityPre();
                            tL_messageEntityPre.offset = spanStart;
                            tL_messageEntityPre.length = spanEnd - spanStart;
                            arrayList.add(tL_messageEntityPre);
                        }
                    } else if (i3 == 2 || i3 == 3) {
                        arrayList3.add(mVar);
                    }
                } else if (obj instanceof p5) {
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    p5 p5Var = (p5) obj;
                    tL_messageEntityCustomEmoji.document_id = p5Var.documentId;
                    tL_messageEntityCustomEmoji.document = p5Var.document;
                    tL_messageEntityCustomEmoji.offset = spanStart;
                    tL_messageEntityCustomEmoji.length = spanEnd - spanStart;
                    arrayList.add(tL_messageEntityCustomEmoji);
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml.toString());
            li.g(arrayList, spannableStringBuilder, spannableStringBuilder, -1);
            for (Object obj2 : spans) {
                if (obj2 instanceof URLSpan) {
                    int spanStart2 = fromHtml.getSpanStart(obj2);
                    int spanEnd2 = fromHtml.getSpanEnd(obj2);
                    String charSequence = fromHtml.subSequence(spanStart2, spanEnd2).toString();
                    String url = ((URLSpan) obj2).getURL();
                    if (charSequence.equals(url)) {
                        spannableStringBuilder.setSpan(new URLSpan(url), spanStart2, spanEnd2, 33);
                    } else {
                        spannableStringBuilder.setSpan(new x31(url, null), spanStart2, spanEnd2, 33);
                    }
                }
            }
            li.a(null, spannableStringBuilder, arrayList);
            for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                m mVar2 = (m) arrayList2.get(i10);
                int spanStart3 = fromHtml.getSpanStart(mVar2);
                int spanEnd3 = fromHtml.getSpanEnd(mVar2);
                spannableStringBuilder.setSpan(new oi.h(mVar2.f4723b, spannableStringBuilder.subSequence(spanStart3, spanEnd3).toString(), true), spanStart3, spanEnd3, 33);
            }
            for (int i11 = 0; i11 < arrayList3.size(); i11++) {
                m mVar3 = (m) arrayList3.get(i11);
                int spanStart4 = fromHtml.getSpanStart(mVar3);
                int spanEnd4 = fromHtml.getSpanEnd(mVar3);
                if (mVar3.f4722a == 3) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xg0.c(spannableStringBuilder, spanStart4, spanEnd4, z10);
            }
            return spannableStringBuilder;
        } catch (Exception e10) {
            a8.e("Html.fromHtml", e10);
            return null;
        }
    }
}
