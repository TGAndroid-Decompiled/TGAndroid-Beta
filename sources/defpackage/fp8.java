package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class fp8 extends vz9 {
    public final mz9[] f2;
    public final ProfileActivity g2;

    public fp8(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i, ylb ylbVar, int i2, mz9[] mz9VarArr) {
        super(profileActivity2, activity, true, num, i, true, ylbVar, i2);
        this.g2 = profileActivity;
        this.f2 = mz9VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i;
        if (tL_starGiftUnique != null) {
            i = ((d) this.g2).currentAccount;
            if (jva.v(i, false).k(tL_starGiftUnique.id) != null && oc7.d1().getInt("statusgiftpage", 0) < 2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override
    public final long getDialogId() {
        return this.g2.a();
    }

    @Override
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible;
        Long l2;
        long j;
        boolean z;
        int i;
        int i2;
        int i3;
        mz9[] mz9VarArr = this.f2;
        ProfileActivity profileActivity = this.g2;
        if (tL_starGiftUnique != null) {
            i = ((d) profileActivity).currentAccount;
            TL_stars.SavedStarGift k = jva.v(i, false).k(tL_starGiftUnique.id);
            if (k != null && oc7.d1().getInt("statusgiftpage", 0) < 2) {
                oc7.d1().edit().putInt("statusgiftpage", oc7.d1().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i2 = ((d) profileActivity).currentAccount;
                i3 = ((d) profileActivity).currentAccount;
                wsa wsaVar = new wsa(context, i2, z8c.h(i3).e(), profileActivity.A0, null);
                wsaVar.n2(k, null);
                wsaVar.s2();
                wsaVar.show();
                mz9 mz9Var = mz9VarArr[0];
                if (mz9Var != null) {
                    profileActivity.Y5 = null;
                    mz9Var.dismiss();
                    return;
                }
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible2 = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible2.collectible_id = tL_starGiftUnique.id;
            tL_inputEmojiStatusCollectible = tL_inputEmojiStatusCollectible2;
            if (num != null) {
                tL_inputEmojiStatusCollectible2.flags |= 1;
                tL_inputEmojiStatusCollectible2.until = num.intValue();
                tL_inputEmojiStatusCollectible = tL_inputEmojiStatusCollectible2;
            }
        } else if (l == null) {
            tL_inputEmojiStatusCollectible = new TLRPC.TL_emojiStatusEmpty();
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = l.longValue();
            tL_inputEmojiStatusCollectible = tL_emojiStatus;
            if (num != null) {
                tL_emojiStatus.flags |= 1;
                tL_emojiStatus.until = num.intValue();
                tL_inputEmojiStatusCollectible = tL_emojiStatus;
            }
        }
        if (tL_starGiftUnique != null) {
            l2 = Long.valueOf(tL_starGiftUnique.id);
        } else {
            l2 = null;
        }
        profileActivity.F = l2;
        oc7 messagesController = profileActivity.getMessagesController();
        TLRPC.Chat chat = profileActivity.F2;
        if (chat == null) {
            j = 0;
        } else {
            j = -chat.id;
        }
        messagesController.o5(j, tL_inputEmojiStatusCollectible, tL_starGiftUnique);
        tm tmVar = profileActivity.G;
        if (tmVar != null) {
            if (l == null) {
                if (profileActivity.F2 == null) {
                    tmVar.g(profileActivity.j2(), true);
                } else {
                    tmVar.g(null, true);
                }
            } else {
                tmVar.j(l.longValue(), true);
            }
            tm tmVar2 = profileActivity.G;
            if (tL_starGiftUnique != null) {
                z = true;
            } else {
                z = false;
            }
            tmVar2.m(z, true);
        }
        if (l != null) {
            yn ynVar = profileActivity.e0;
            ?? obj = new Object();
            long longValue = l.longValue();
            obj.g = longValue;
            obj.h = longValue;
            ynVar.a(obj);
        }
        profileActivity.P3();
        profileActivity.R3();
        mz9 mz9Var2 = mz9VarArr[0];
        if (mz9Var2 != null) {
            profileActivity.Y5 = null;
            mz9Var2.dismiss();
        }
    }
}
