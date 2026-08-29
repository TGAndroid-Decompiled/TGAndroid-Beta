package kg;

import android.graphics.Paint;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import cg.v0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import jh.h2;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.y5;
import org.telegram.ui.LaunchActivity;
public abstract class s0 {
    public static void a(TLRPC.TL_availableReaction tL_availableReaction, LinkedHashMap linkedHashMap, ArrayList arrayList, SpannableStringBuilder spannableStringBuilder, q qVar, Paint.FontMetricsInt fontMetricsInt) {
        TLRPC.Document document = tL_availableReaction.activate_animation;
        long j10 = document.f22398id;
        y5 e10 = e(document, Long.valueOf(j10), fontMetricsInt);
        linkedHashMap.put(Long.valueOf(j10), e10);
        arrayList.add(Long.valueOf(j10));
        SpannableString spannableString = new SpannableString(tL_availableReaction.reaction);
        spannableString.setSpan(e10, 0, spannableString.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        if (qVar != null) {
            qVar.x(Long.valueOf(j10), false);
        }
    }

    public static void b(TLRPC.Reaction reaction, TLRPC.Reaction reaction2, TL_stories.StoryViews storyViews) {
        if (storyViews != null) {
            int i10 = 0;
            boolean z10 = false;
            while (i10 < storyViews.reactions.size()) {
                TLRPC.ReactionCount reactionCount = storyViews.reactions.get(i10);
                if (reaction != null && d(reactionCount.reaction, reaction)) {
                    int i11 = reactionCount.count - 1;
                    reactionCount.count = i11;
                    if (i11 <= 0) {
                        storyViews.reactions.remove(i10);
                        i10--;
                        i10++;
                    }
                }
                if (reaction2 != null && d(reactionCount.reaction, reaction2)) {
                    reactionCount.count++;
                    z10 = true;
                }
                i10++;
            }
            if (!z10) {
                TLRPC.TL_reactionCount tL_reactionCount = new TLRPC.TL_reactionCount();
                tL_reactionCount.count = 1;
                tL_reactionCount.reaction = reaction2;
                storyViews.reactions.add(tL_reactionCount);
            }
        }
    }

    public static boolean c(TLRPC.Reaction reaction, q0 q0Var) {
        if ((reaction instanceof TLRPC.TL_reactionEmoji) && q0Var.f13826g == 0 && TextUtils.equals(((TLRPC.TL_reactionEmoji) reaction).emoticon, q0Var.f13825f)) {
            return true;
        }
        if (reaction instanceof TLRPC.TL_reactionCustomEmoji) {
            long j10 = q0Var.f13826g;
            if (j10 != 0 && ((TLRPC.TL_reactionCustomEmoji) reaction).document_id == j10) {
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

    public static y5 e(TLRPC.Document document, Long l10, Paint.FontMetricsInt fontMetricsInt) {
        y5 y5Var;
        if (document != null) {
            y5Var = new y5(document.f22398id, 1.0f, fontMetricsInt);
            y5Var.document = document;
        } else {
            y5Var = new y5(l10.longValue(), 1.0f, fontMetricsInt);
        }
        y5Var.cacheType = p5.g();
        return y5Var;
    }

    public static void f(long j10, int i10, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus) {
        o2 R = LaunchActivity.R();
        if (R != null && tL_premium_boostsStatus != null) {
            v0 v0Var = new v0(21, UserConfig.selectedAccount, R.getContext(), R, R.getResourceProvider());
            v0Var.N0 = i10;
            v0Var.F1(tL_premium_boostsStatus, true);
            v0Var.H1(j10);
            v0Var.M0 = new h2(R, j10);
            v0Var.show();
        }
    }
}
