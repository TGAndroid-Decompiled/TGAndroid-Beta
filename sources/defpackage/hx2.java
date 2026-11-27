package defpackage;

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
import org.telegram.tgnet.TLRPC;
public abstract class hx2 {
    public static SpannableStringBuilder a(String str) {
        Spanned fromHtml;
        boolean z;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                fromHtml = Html.fromHtml("<inject>" + str + "</inject>", 63, null, new fx2(new rj2((byte) 16)));
            } else {
                fromHtml = Html.fromHtml("<inject>" + str + "</inject>", null, new fx2(new rj2((byte) 16)));
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
                } else if (obj instanceof gx2) {
                    gx2 gx2Var = (gx2) obj;
                    byte b = gx2Var.a;
                    if (b == 0) {
                        TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = new TLRPC.TL_messageEntitySpoiler();
                        tL_messageEntitySpoiler.offset = spanStart;
                        tL_messageEntitySpoiler.length = spanEnd - spanStart;
                        arrayList.add(tL_messageEntitySpoiler);
                    } else if (b == 1) {
                        if (!TextUtils.isEmpty(gx2Var.b)) {
                            arrayList2.add(gx2Var);
                        } else {
                            TLRPC.TL_messageEntityPre tL_messageEntityPre = new TLRPC.TL_messageEntityPre();
                            tL_messageEntityPre.offset = spanStart;
                            tL_messageEntityPre.length = spanEnd - spanStart;
                            arrayList.add(tL_messageEntityPre);
                        }
                    } else if (b == 2 || b == 3) {
                        arrayList3.add(gx2Var);
                    }
                } else if (obj instanceof hm) {
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    hm hmVar = (hm) obj;
                    tL_messageEntityCustomEmoji.document_id = hmVar.documentId;
                    tL_messageEntityCustomEmoji.document = hmVar.document;
                    tL_messageEntityCustomEmoji.offset = spanStart;
                    tL_messageEntityCustomEmoji.length = spanEnd - spanStart;
                    arrayList.add(tL_messageEntityCustomEmoji);
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml.toString());
            ls6.h(arrayList, spannableStringBuilder, spannableStringBuilder, -1);
            for (Object obj2 : spans) {
                if (obj2 instanceof URLSpan) {
                    int spanStart2 = fromHtml.getSpanStart(obj2);
                    int spanEnd2 = fromHtml.getSpanEnd(obj2);
                    String charSequence = fromHtml.subSequence(spanStart2, spanEnd2).toString();
                    String url = ((URLSpan) obj2).getURL();
                    if (charSequence.equals(url)) {
                        spannableStringBuilder.setSpan(new URLSpan(url), spanStart2, spanEnd2, 33);
                    } else {
                        spannableStringBuilder.setSpan(new h8c(url, null), spanStart2, spanEnd2, 33);
                    }
                }
            }
            ls6.a(null, spannableStringBuilder, arrayList);
            for (int i = 0; i < arrayList2.size(); i++) {
                gx2 gx2Var2 = (gx2) arrayList2.get(i);
                int spanStart3 = fromHtml.getSpanStart(gx2Var2);
                int spanEnd3 = fromHtml.getSpanEnd(gx2Var2);
                spannableStringBuilder.setSpan(new jk2(gx2Var2.b, spannableStringBuilder.subSequence(spanStart3, spanEnd3).toString(), true), spanStart3, spanEnd3, 33);
            }
            for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                gx2 gx2Var3 = (gx2) arrayList3.get(i2);
                int spanStart4 = fromHtml.getSpanStart(gx2Var3);
                int spanEnd4 = fromHtml.getSpanEnd(gx2Var3);
                if (gx2Var3.a == 3) {
                    z = true;
                } else {
                    z = false;
                }
                r19.c(spannableStringBuilder, spanStart4, spanEnd4, z);
            }
            return spannableStringBuilder;
        } catch (Exception e) {
            cc4.e("Html.fromHtml", e);
            return null;
        }
    }
}
