package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.d;
public final class ej3 extends vz9 {
    public final mz9[] f2;
    public final nk3 g2;

    public ej3(nk3 nk3Var, nk3 nk3Var2, Activity activity, Integer num, ylb ylbVar, mz9[] mz9VarArr) {
        super(nk3Var2, activity, true, num, 0, ylbVar);
        this.g2 = nk3Var;
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
    public final void o(View view, Long l, TLRPC.Document document, TL_stars.TL_starGiftUnique tL_starGiftUnique, Integer num) {
        int i;
        int i2;
        int i3;
        ylb ylbVar;
        TLRPC.TL_emojiStatusEmpty tL_emojiStatusEmpty;
        mz9[] mz9VarArr = this.f2;
        nk3 nk3Var = this.g2;
        if (l == null) {
            tL_emojiStatusEmpty = new TLRPC.TL_emojiStatusEmpty();
        } else if (tL_starGiftUnique != null) {
            i = ((d) nk3Var).currentAccount;
            TL_stars.SavedStarGift k = jva.v(i, false).k(tL_starGiftUnique.id);
            if (k != null && oc7.d1().getInt("statusgiftpage", 0) < 2) {
                oc7.d1().edit().putInt("statusgiftpage", oc7.d1().getInt("statusgiftpage", 0) + 1).apply();
                Context context = getContext();
                i2 = ((d) nk3Var).currentAccount;
                i3 = ((d) nk3Var).currentAccount;
                long e = z8c.h(i3).e();
                ylbVar = ((d) nk3Var).resourceProvider;
                wsa wsaVar = new wsa(context, i2, e, ylbVar, null);
                wsaVar.n2(k, null);
                wsaVar.s2();
                wsaVar.show();
                mz9 mz9Var = mz9VarArr[0];
                if (mz9Var != null) {
                    nk3Var.N0 = null;
                    mz9Var.dismiss();
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
        nk3Var.getMessagesController().p5(tL_emojiStatusEmpty, tL_starGiftUnique);
        if (l != null) {
            yn ynVar = nk3Var.G3;
            ?? obj = new Object();
            long longValue = l.longValue();
            obj.g = longValue;
            obj.h = longValue;
            ynVar.a(obj);
        }
        mz9 mz9Var2 = mz9VarArr[0];
        if (mz9Var2 != null) {
            nk3Var.N0 = null;
            mz9Var2.dismiss();
        }
    }
}
