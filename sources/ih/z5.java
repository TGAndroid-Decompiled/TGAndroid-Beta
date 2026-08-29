package ih;

import android.content.Context;
import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hv0;
public final class z5 extends org.telegram.ui.Cells.d3 {
    public final e6 A;
    public final ng.f f9564x;
    public final int f9565y;

    public z5(e6 e6Var, Context context, hv0 hv0Var, String str, int i10, org.telegram.ui.ActionBar.c6 c6Var, ng.f fVar, int i11) {
        super(context, hv0Var, str, true, i10, c6Var);
        this.A = e6Var;
        this.f9564x = fVar;
        this.f9565y = i11;
    }

    @Override
    public final void b() {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        e6 e6Var = this.A;
        MessageObject messageObject = e6Var.f9135i0;
        TLRPC.MessageAction messageAction = e6Var.f9134h0;
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
        CharSequence[] charSequenceArr = {e6Var.f9140o0.getText()};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.f9565y).getEntities(charSequenceArr, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        messageObject.setType();
        e6Var.f9133g0.U(messageObject, true);
        e6Var.f9141p0.N(true);
        e6Var.Z(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int dp = AndroidUtilities.dp(10.0f);
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(10.0f);
        int measuredHeight = getMeasuredHeight();
        ng.f fVar = this.f9564x;
        fVar.setBounds(dp, 0, measuredWidth, measuredHeight);
        fVar.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(12.0f), 0);
        super.onMeasure(i10, i11);
    }
}
