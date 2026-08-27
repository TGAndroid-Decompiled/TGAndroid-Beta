package gf;

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
import org.telegram.messenger.CodeHighlighting;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hi0;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.t5;

public abstract class o {
    public static SpannableStringBuilder a(String str) {
        try {
            Spanned spannedFromHtml = Build.VERSION.SDK_INT >= 24 ? Html.fromHtml("<inject>" + str + "</inject>", 63, null, new m(new ab.a(8))) : Html.fromHtml("<inject>" + str + "</inject>", null, new m(new ab.a(8)));
            if (spannedFromHtml == null) {
                return null;
            }
            Object[] spans = spannedFromHtml.getSpans(0, spannedFromHtml.length(), Object.class);
            ArrayList arrayList = new ArrayList(spans.length);
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : spans) {
                int spanStart = spannedFromHtml.getSpanStart(obj);
                int spanEnd = spannedFromHtml.getSpanEnd(obj);
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
                } else if (obj instanceof n) {
                    n nVar = (n) obj;
                    int i10 = nVar.f7040a;
                    if (i10 == 0) {
                        TLRPC.TL_messageEntitySpoiler tL_messageEntitySpoiler = new TLRPC.TL_messageEntitySpoiler();
                        tL_messageEntitySpoiler.offset = spanStart;
                        tL_messageEntitySpoiler.length = spanEnd - spanStart;
                        arrayList.add(tL_messageEntitySpoiler);
                    } else if (i10 == 1) {
                        if (TextUtils.isEmpty(nVar.f7041b)) {
                            TLRPC.TL_messageEntityPre tL_messageEntityPre = new TLRPC.TL_messageEntityPre();
                            tL_messageEntityPre.offset = spanStart;
                            tL_messageEntityPre.length = spanEnd - spanStart;
                            arrayList.add(tL_messageEntityPre);
                        } else {
                            arrayList2.add(nVar);
                        }
                    } else if (i10 == 2 || i10 == 3) {
                        arrayList3.add(nVar);
                    }
                } else if (obj instanceof t5) {
                    TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
                    t5 t5Var = (t5) obj;
                    tL_messageEntityCustomEmoji.document_id = t5Var.documentId;
                    tL_messageEntityCustomEmoji.document = t5Var.document;
                    tL_messageEntityCustomEmoji.offset = spanStart;
                    tL_messageEntityCustomEmoji.length = spanEnd - spanStart;
                    arrayList.add(tL_messageEntityCustomEmoji);
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannedFromHtml.toString());
            MediaDataController.addTextStyleRuns((ArrayList<TLRPC.MessageEntity>) arrayList, spannableStringBuilder, spannableStringBuilder);
            for (Object obj2 : spans) {
                if (obj2 instanceof URLSpan) {
                    int spanStart2 = spannedFromHtml.getSpanStart(obj2);
                    int spanEnd2 = spannedFromHtml.getSpanEnd(obj2);
                    String string = spannedFromHtml.subSequence(spanStart2, spanEnd2).toString();
                    String url = ((URLSpan) obj2).getURL();
                    if (string.equals(url)) {
                        spannableStringBuilder.setSpan(new URLSpan(url), spanStart2, spanEnd2, 33);
                    } else {
                        spannableStringBuilder.setSpan(new t41(url, null), spanStart2, spanEnd2, 33);
                    }
                }
            }
            MediaDataController.addAnimatedEmojiSpans(arrayList, spannableStringBuilder, null);
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                n nVar2 = (n) arrayList2.get(i11);
                int spanStart3 = spannedFromHtml.getSpanStart(nVar2);
                int spanEnd3 = spannedFromHtml.getSpanEnd(nVar2);
                spannableStringBuilder.setSpan(new CodeHighlighting.Span(true, 0, null, nVar2.f7041b, spannableStringBuilder.subSequence(spanStart3, spanEnd3).toString()), spanStart3, spanEnd3, 33);
            }
            for (int i12 = 0; i12 < arrayList3.size(); i12++) {
                n nVar3 = (n) arrayList3.get(i12);
                hi0.c(spannableStringBuilder, spannedFromHtml.getSpanStart(nVar3), spannedFromHtml.getSpanEnd(nVar3), nVar3.f7040a == 3);
            }
            return spannableStringBuilder;
        } catch (Exception e9) {
            FileLog.e("Html.fromHtml", e9);
            return null;
        }
    }
}
