package ch;

import android.graphics.Paint;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import bi.k3;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.p10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.i5;
import org.telegram.ui.Components.r5;
import org.telegram.ui.LaunchActivity;
public abstract class q0 {
    public static void a(TLRPC.TL_availableReaction tL_availableReaction, LinkedHashMap linkedHashMap, ArrayList arrayList, SpannableStringBuilder spannableStringBuilder, m mVar, Paint.FontMetricsInt fontMetricsInt) {
        TLRPC.Document document = tL_availableReaction.activate_animation;
        long j3 = document.f26962id;
        r5 e10 = e(document, Long.valueOf(j3), fontMetricsInt);
        linkedHashMap.put(Long.valueOf(j3), e10);
        arrayList.add(Long.valueOf(j3));
        SpannableString spannableString = new SpannableString(tL_availableReaction.reaction);
        spannableString.setSpan(e10, 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        if (mVar != null) {
            mVar.x(Long.valueOf(j3), false);
        }
    }

    public static void b(TLRPC.Reaction reaction, TLRPC.Reaction reaction2, TL_stories.StoryViews storyViews) {
        if (storyViews != null) {
            int i7 = 0;
            boolean z9 = false;
            while (i7 < storyViews.reactions.size()) {
                TLRPC.ReactionCount reactionCount = storyViews.reactions.get(i7);
                if (reaction != null && d(reactionCount.reaction, reaction)) {
                    int i10 = reactionCount.count - 1;
                    reactionCount.count = i10;
                    if (i10 <= 0) {
                        storyViews.reactions.remove(i7);
                        i7--;
                        i7++;
                    }
                }
                if (reaction2 != null && d(reactionCount.reaction, reaction2)) {
                    reactionCount.count++;
                    z9 = true;
                }
                i7++;
            }
            if (!z9) {
                TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                tL_reactionCount.count = 1;
                tL_reactionCount.reaction = reaction2;
                storyViews.reactions.add(tL_reactionCount);
            }
        }
    }

    public static boolean c(TLRPC.Reaction reaction, o0 o0Var) {
        if ((reaction instanceof TLRPC.TL_reactionEmoji) && o0Var.f6355g == 0 && TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, o0Var.f6354f)) {
            return true;
        }
        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            long j3 = o0Var.f6355g;
            if (j3 != 0 && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == j3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean d(TLRPC.Reaction reaction, TLRPC.Reaction reaction2) {
        if ((reaction instanceof TLRPC.TL_reactionEmoji) && (reaction2 instanceof TLRPC.TL_reactionEmoji) && TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, ((TLRPC.TL_reactionEmoji) reaction2).emoticon)) {
            return true;
        }
        if ((reaction instanceof TLRPC.TL_reactionCustomEmoji) && (reaction2 instanceof TLRPC.TL_reactionCustomEmoji) && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == ((TLRPC.TL_reactionCustomEmoji) reaction2).document_id) {
            return true;
        }
        return false;
    }

    public static r5 e(TLRPC.Document document, Long l10, Paint.FontMetricsInt fontMetricsInt) {
        r5 r5Var;
        if (document != null) {
            r5Var = new r5(document.f26962id, 1.0f, fontMetricsInt);
            r5Var.document = document;
        } else {
            r5Var = new r5(l10.longValue(), 1.0f, fontMetricsInt);
        }
        r5Var.cacheType = i5.f();
        return r5Var;
    }

    public static void f(long j3, int i7, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        f2 Q = LaunchActivity.Q();
        if (Q != null && tL_premium_boostsStatus != null) {
            ug.i0 i0Var = new ug.i0(21, p10.f24470s0, Q.getContext(), Q, Q.getResourceProvider());
            i0Var.J2 = i7;
            i0Var.z1(tL_premium_boostsStatus, true);
            i0Var.B1(j3);
            i0Var.I2 = new k3(Q, j3);
            i0Var.show();
        }
    }
}
