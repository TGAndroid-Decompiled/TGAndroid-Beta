package defpackage;

import android.graphics.Paint;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public abstract class n39 {
    public static void a(TLRPC.TL_availableReaction tL_availableReaction, LinkedHashMap linkedHashMap, ArrayList arrayList, SpannableStringBuilder spannableStringBuilder, l92 l92Var, Paint.FontMetricsInt fontMetricsInt) {
        TLRPC.Document document = tL_availableReaction.activate_animation;
        long j = document.id;
        gn e = e(document, Long.valueOf(j), fontMetricsInt);
        linkedHashMap.put(Long.valueOf(j), e);
        arrayList.add(Long.valueOf(j));
        SpannableString spannableString = new SpannableString(tL_availableReaction.reaction);
        spannableString.setSpan(e, 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        if (l92Var != null) {
            l92Var.x(Long.valueOf(j), false);
        }
    }

    public static void b(TLRPC.Reaction reaction, TLRPC.Reaction reaction2, TL_stories.StoryViews storyViews) {
        if (storyViews != null) {
            int i = 0;
            boolean z = false;
            while (i < storyViews.reactions.size()) {
                TLRPC.ReactionCount reactionCount = storyViews.reactions.get(i);
                if (reaction != null && d(reactionCount.reaction, reaction)) {
                    int i2 = reactionCount.count - 1;
                    reactionCount.count = i2;
                    if (i2 <= 0) {
                        storyViews.reactions.remove(i);
                        i--;
                        i++;
                    }
                }
                if (reaction2 != null && d(reactionCount.reaction, reaction2)) {
                    reactionCount.count++;
                    z = true;
                }
                i++;
            }
            if (!z) {
                TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                tL_reactionCount.count = 1;
                tL_reactionCount.reaction = reaction2;
                storyViews.reactions.add(tL_reactionCount);
            }
        }
    }

    public static boolean c(TLRPC.Reaction reaction, k39 k39Var) {
        if ((reaction instanceof TLRPC.TL_reactionEmoji) && k39Var.g == 0 && TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, k39Var.f)) {
            return true;
        }
        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            long j = k39Var.g;
            if (j != 0 && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == j) {
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

    public static gn e(TLRPC.Document document, Long l, Paint.FontMetricsInt fontMetricsInt) {
        gn gnVar;
        if (document != null) {
            gnVar = new gn(document.id, 1.0f, fontMetricsInt);
            gnVar.document = document;
        } else {
            gnVar = new gn(l.longValue(), 1.0f, fontMetricsInt);
        }
        gnVar.cacheType = vm.f();
        return gnVar;
    }

    public static void f(long j, int i, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        d Q = LaunchActivity.Q();
        if (Q != null && tL_premium_boostsStatus != null) {
            i46 i46Var = new i46(21, z8c.t0, Q.getResourceProvider(), Q.getContext(), Q);
            i46Var.M2 = i;
            i46Var.q1(tL_premium_boostsStatus, true);
            i46Var.s1(j);
            i46Var.L2 = new m39(Q, j);
            i46Var.show();
        }
    }
}
