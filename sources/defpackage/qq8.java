package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;
public final class qq8 extends n1a {
    public final d1a[] f2;
    public final ProfileActivity g2;

    public qq8(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i, vnb vnbVar, int i2, d1a[] d1aVarArr) {
        super(profileActivity2, activity, true, num, i, true, vnbVar, i2);
        this.g2 = profileActivity;
        this.f2 = d1aVarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i;
        if (tL_starGiftUnique != null) {
            i = ((e) this.g2).currentAccount;
            if (jxa.v(i, false).k(tL_starGiftUnique.id) != null && uc7.e1().getInt("statusgiftpage", 0) < 2) {
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
        d1a[] d1aVarArr = this.f2;
        ProfileActivity profileActivity = this.g2;
        if (tL_starGiftUnique != null) {
            i = ((e) profileActivity).currentAccount;
            TL_stars.SavedStarGift k = jxa.v(i, false).k(tL_starGiftUnique.id);
            if (k != null && uc7.e1().getInt("statusgiftpage", 0) < 2) {
                uc7.e1().edit().putInt("statusgiftpage", uc7.e1().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i2 = ((e) profileActivity).currentAccount;
                i3 = ((e) profileActivity).currentAccount;
                wua wuaVar = new wua(context, i2, yac.h(i3).e(), profileActivity.A0, null);
                wuaVar.o2(k, null);
                wuaVar.t2();
                wuaVar.show();
                d1a d1aVar = d1aVarArr[0];
                if (d1aVar != null) {
                    profileActivity.T5 = null;
                    d1aVar.dismiss();
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
        uc7 messagesController = profileActivity.getMessagesController();
        TLRPC.Chat chat = profileActivity.F2;
        if (chat == null) {
            j = 0;
        } else {
            j = -chat.id;
        }
        messagesController.u5(j, tL_inputEmojiStatusCollectible, tL_starGiftUnique);
        ul ulVar = profileActivity.G;
        if (ulVar != null) {
            if (l == null) {
                if (profileActivity.F2 == null) {
                    ulVar.g(profileActivity.i2(), true);
                } else {
                    ulVar.g(null, true);
                }
            } else {
                ulVar.j(l.longValue(), true);
            }
            ul ulVar2 = profileActivity.G;
            if (tL_starGiftUnique != null) {
                z = true;
            } else {
                z = false;
            }
            ulVar2.m(z, true);
        }
        if (l != null) {
            zm zmVar = profileActivity.e0;
            ?? obj = new Object();
            long longValue = l.longValue();
            obj.g = longValue;
            obj.h = longValue;
            zmVar.a(obj);
        }
        profileActivity.M3();
        profileActivity.O3();
        d1a d1aVar2 = d1aVarArr[0];
        if (d1aVar2 != null) {
            profileActivity.T5 = null;
            d1aVar2.dismiss();
        }
    }
}
