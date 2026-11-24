package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
public final class sh3 extends tx9 {
    public final kx9[] f2;
    public final cj3 g2;

    public sh3(cj3 cj3Var, cj3 cj3Var2, Activity activity, Integer num, wjb wjbVar, kx9[] kx9VarArr) {
        super(cj3Var2, activity, true, num, 0, wjbVar);
        this.g2 = cj3Var;
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
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i;
        int i2;
        int i3;
        wjb wjbVar;
        TLRPC.TL_emojiStatusEmpty tL_emojiStatusEmpty;
        kx9[] kx9VarArr = this.f2;
        cj3 cj3Var = this.g2;
        if (l == null) {
            tL_emojiStatusEmpty = new TLRPC.TL_emojiStatusEmpty();
        } else if (tL_starGiftUnique != null) {
            i = ((d) cj3Var).currentAccount;
            TL_stars.SavedStarGift k = gta.v(i, false).k(tL_starGiftUnique.id);
            if (k != null && na7.c1().getInt("statusgiftpage", 0) < 2) {
                na7.c1().edit().putInt("statusgiftpage", na7.c1().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i2 = ((d) cj3Var).currentAccount;
                i3 = ((d) cj3Var).currentAccount;
                long e = y6c.h(i3).e();
                wjbVar = ((d) cj3Var).resourceProvider;
                vqa vqaVar = new vqa(context, i2, e, wjbVar, null);
                vqaVar.n2(k, null);
                vqaVar.s2();
                vqaVar.show();
                kx9 kx9Var = kx9VarArr[0];
                if (kx9Var != null) {
                    cj3Var.N0 = null;
                    kx9Var.dismiss();
                    return;
                }
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUnique.id;
            tL_emojiStatusEmpty = tL_inputEmojiStatusCollectible;
            if (num != null) {
                tL_inputEmojiStatusCollectible.flags |= 1;
                tL_inputEmojiStatusCollectible.until = num.intValue();
                tL_emojiStatusEmpty = tL_inputEmojiStatusCollectible;
            }
        } else {
            TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
            tL_emojiStatus.document_id = l.longValue();
            tL_emojiStatusEmpty = tL_emojiStatus;
            if (num != null) {
                tL_emojiStatus.flags |= 1;
                tL_emojiStatus.until = num.intValue();
                tL_emojiStatusEmpty = tL_emojiStatus;
            }
        }
        cj3Var.getMessagesController().m5(tL_emojiStatusEmpty, tL_starGiftUnique);
        if (l != null) {
            ym ymVar = cj3Var.G3;
            ?? obj = new Object();
            long longValue = l.longValue();
            obj.g = longValue;
            obj.h = longValue;
            ymVar.a(obj);
        }
        kx9 kx9Var2 = kx9VarArr[0];
        if (kx9Var2 != null) {
            cj3Var.N0 = null;
            kx9Var2.dismiss();
        }
    }
}
