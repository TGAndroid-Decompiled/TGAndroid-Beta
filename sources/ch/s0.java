package ch;

import android.graphics.Paint;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.telegram.messenger.j10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.Components.o5;
import org.telegram.ui.Components.x5;
import org.telegram.ui.LaunchActivity;
public abstract class s0 {
    public static void a(TLRPC.TL_availableReaction tL_availableReaction, LinkedHashMap linkedHashMap, ArrayList arrayList, SpannableStringBuilder spannableStringBuilder, n nVar, Paint.FontMetricsInt fontMetricsInt) {
        TLRPC.Document document = tL_availableReaction.activate_animation;
        long j3 = document.f28409id;
        x5 e10 = e(document, Long.valueOf(j3), fontMetricsInt);
        linkedHashMap.put(Long.valueOf(j3), e10);
        arrayList.add(Long.valueOf(j3));
        SpannableString spannableString = new SpannableString(tL_availableReaction.reaction);
        spannableString.setSpan(e10, 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        if (nVar != null) {
            nVar.x(Long.valueOf(j3), false);
        }
    }

    public static void b(TLRPC.Reaction reaction, TLRPC.Reaction reaction2, TL_stories.StoryViews storyViews) {
        if (storyViews != null) {
            int i7 = 0;
            boolean z10 = false;
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
                    z10 = true;
                }
                i7++;
            }
            if (!z10) {
                TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                tL_reactionCount.count = 1;
                tL_reactionCount.reaction = reaction2;
                storyViews.reactions.add(tL_reactionCount);
            }
        }
    }

    public static boolean c(TLRPC.Reaction reaction, p0 p0Var) {
        if ((reaction instanceof TLRPC.TL_reactionEmoji) && p0Var.f5476g == 0 && TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, p0Var.f5475f)) {
            return true;
        }
        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            long j3 = p0Var.f5476g;
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

    public static x5 e(TLRPC.Document document, Long l10, Paint.FontMetricsInt fontMetricsInt) {
        x5 x5Var;
        if (document != null) {
            x5Var = new x5(document.f28409id, 1.0f, fontMetricsInt);
            x5Var.document = document;
        } else {
            x5Var = new x5(l10.longValue(), 1.0f, fontMetricsInt);
        }
        x5Var.cacheType = o5.f();
        return x5Var;
    }

    public static void f(long j3, int i7, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        h2 Q = LaunchActivity.Q();
        if (Q != null && tL_premium_boostsStatus != null) {
            ug.l0 l0Var = new ug.l0(21, j10.f24770t0, Q.getContext(), Q, Q.getResourceProvider());
            l0Var.N2 = i7;
            l0Var.A1(tL_premium_boostsStatus, true);
            l0Var.C1(j3);
            l0Var.M2 = new r0(Q, j3);
            l0Var.show();
        }
    }
}
