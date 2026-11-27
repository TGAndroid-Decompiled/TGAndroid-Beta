package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
public final class mi3 extends n1a {
    public final d1a[] f2;
    public final uj3 g2;

    public mi3(uj3 uj3Var, uj3 uj3Var2, Activity activity, Integer num, vnb vnbVar, d1a[] d1aVarArr) {
        super(uj3Var2, activity, true, num, 0, vnbVar);
        this.g2 = uj3Var;
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
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i;
        int i2;
        int i3;
        vnb vnbVar;
        TLRPC.TL_emojiStatusEmpty tL_emojiStatusEmpty;
        d1a[] d1aVarArr = this.f2;
        uj3 uj3Var = this.g2;
        if (l == null) {
            tL_emojiStatusEmpty = new TLRPC.TL_emojiStatusEmpty();
        } else if (tL_starGiftUnique != null) {
            i = ((e) uj3Var).currentAccount;
            TL_stars.SavedStarGift k = jxa.v(i, false).k(tL_starGiftUnique.id);
            if (k != null && uc7.e1().getInt("statusgiftpage", 0) < 2) {
                uc7.e1().edit().putInt("statusgiftpage", uc7.e1().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i2 = ((e) uj3Var).currentAccount;
                i3 = ((e) uj3Var).currentAccount;
                long e = yac.h(i3).e();
                vnbVar = ((e) uj3Var).resourceProvider;
                wua wuaVar = new wua(context, i2, e, vnbVar, null);
                wuaVar.o2(k, null);
                wuaVar.t2();
                wuaVar.show();
                d1a d1aVar = d1aVarArr[0];
                if (d1aVar != null) {
                    uj3Var.N0 = null;
                    d1aVar.dismiss();
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
        uj3Var.getMessagesController().v5(tL_emojiStatusEmpty, tL_starGiftUnique);
        if (l != null) {
            zm zmVar = uj3Var.G3;
            ?? obj = new Object();
            long longValue = l.longValue();
            obj.g = longValue;
            obj.h = longValue;
            zmVar.a(obj);
        }
        d1a d1aVar2 = d1aVarArr[0];
        if (d1aVar2 != null) {
            uj3Var.N0 = null;
            d1aVar2.dismiss();
        }
    }
}
