package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class en8 extends tx9 {
    public final kx9[] f2;
    public final ProfileActivity g2;

    public en8(ProfileActivity profileActivity, ProfileActivity profileActivity2, Activity activity, Integer num, int i, wjb wjbVar, int i2, kx9[] kx9VarArr) {
        super(profileActivity2, activity, true, num, i, true, wjbVar, i2);
        this.g2 = profileActivity;
        this.f2 = kx9VarArr;
    }

    @Override
    public final boolean F(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        int i;
        if (tL_starGiftUnique != null) {
            i = ((d) this.g2).currentAccount;
            if (gta.v(i, false).k(tL_starGiftUnique.id) != null && na7.c1().getInt("statusgiftpage", 0) < 2) {
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
        kx9[] kx9VarArr = this.f2;
        ProfileActivity profileActivity = this.g2;
        if (tL_starGiftUnique != null) {
            i = ((d) profileActivity).currentAccount;
            TL_stars.SavedStarGift k = gta.v(i, false).k(tL_starGiftUnique.id);
            if (k != null && na7.c1().getInt("statusgiftpage", 0) < 2) {
                na7.c1().edit().putInt("statusgiftpage", na7.c1().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i2 = ((d) profileActivity).currentAccount;
                i3 = ((d) profileActivity).currentAccount;
                vqa vqaVar = new vqa(context, i2, y6c.h(i3).e(), profileActivity.A0, null);
                vqaVar.n2(k, null);
                vqaVar.s2();
                vqaVar.show();
                kx9 kx9Var = kx9VarArr[0];
                if (kx9Var != null) {
                    profileActivity.T5 = null;
                    kx9Var.dismiss();
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
        na7 messagesController = profileActivity.getMessagesController();
        TLRPC.Chat chat = profileActivity.F2;
        if (chat == null) {
            j = 0;
        } else {
            j = -chat.id;
        }
        messagesController.m5(j, tL_inputEmojiStatusCollectible, tL_starGiftUnique);
        tl tlVar = profileActivity.G;
        if (tlVar != null) {
            if (l == null) {
                if (profileActivity.F2 == null) {
                    tlVar.g(profileActivity.h2(), true);
                } else {
                    tlVar.g(null, true);
                }
            } else {
                tlVar.j(l.longValue(), true);
            }
            tl tlVar2 = profileActivity.G;
            if (tL_starGiftUnique != null) {
                z = true;
            } else {
                z = false;
            }
            tlVar2.m(z, true);
        }
        if (l != null) {
            ym ymVar = profileActivity.e0;
            ?? obj = new Object();
            long longValue = l.longValue();
            obj.g = longValue;
            obj.h = longValue;
            ymVar.a(obj);
        }
        profileActivity.L3();
        profileActivity.N3();
        kx9 kx9Var2 = kx9VarArr[0];
        if (kx9Var2 != null) {
            profileActivity.T5 = null;
            kx9Var2.dismiss();
        }
    }
}
