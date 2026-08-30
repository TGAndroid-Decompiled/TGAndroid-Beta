package kh;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qv0;
public final class z5 extends org.telegram.ui.Cells.f3 {
    public final e6 B;
    public final pg.d f10975x;
    public final int f10976y;

    public z5(e6 e6Var, Context context, qv0 qv0Var, String str, int i10, org.telegram.ui.ActionBar.f6 f6Var, pg.d dVar, int i11) {
        super(context, qv0Var, str, true, i10, f6Var);
        this.B = e6Var;
        this.f10975x = dVar;
        this.f10976y = i11;
    }

    @Override
    public final void b() {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        e6 e6Var = this.B;
        MessageObject messageObject = e6Var.f10574j0;
        TLRPC.MessageAction messageAction = e6Var.f10573i0;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            tL_textWithEntities = new TLRPC.TL_textWithEntities();
            ((TLRPC.TL_messageActionStarGift) messageAction).message = tL_textWithEntities;
        } else if (messageAction instanceof TLRPC.TL_messageActionGiftCode) {
            TLRPC.TL_messageActionGiftCode tL_messageActionGiftCode = (TLRPC.TL_messageActionGiftCode) messageAction;
            tL_messageActionGiftCode.flags |= 16;
            tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_messageActionGiftCode.message = tL_textWithEntities;
        } else if (messageAction instanceof TLRPC.TL_messageActionGiftPremium) {
            TLRPC.TL_messageActionGiftPremium tL_messageActionGiftPremium = (TLRPC.TL_messageActionGiftPremium) messageAction;
            tL_messageActionGiftPremium.flags |= 16;
            tL_textWithEntities = new TLRPC.TL_textWithEntities();
            tL_messageActionGiftPremium.message = tL_textWithEntities;
        } else {
            return;
        }
        CharSequence[] charSequenceArr = {e6Var.f10579p0.getText()};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.f10976y).getEntities(charSequenceArr, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        messageObject.setType();
        e6Var.f10572h0.U(messageObject, true);
        e6Var.f10580q0.N(true);
        e6Var.Z(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(10.0f);
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(10.0f);
        int measuredHeight = getMeasuredHeight();
        pg.d dVar = this.f10975x;
        dVar.setBounds(dp, 0, measuredWidth, measuredHeight);
        dVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(12.0f), 0);
        super.onMeasure(i10, i11);
    }
}
