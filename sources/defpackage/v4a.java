package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Editable;
import org.telegram.tgnet.TLRPC;
public final class v4a extends ot3 {
    public final jl0 F;
    public final int G;
    public final a5a H;

    public v4a(a5a a5aVar, Context context, wma wmaVar, String str, int i, vnb vnbVar, jl0 jl0Var, int i2) {
        super(context, wmaVar, str, true, i, vnbVar);
        this.H = a5aVar;
        this.F = jl0Var;
        this.G = i2;
    }

    @Override
    public final void b(Editable editable) {
        TLRPC.TL_textWithEntities tL_textWithEntities;
        a5a a5aVar = this.H;
        r47 r47Var = a5aVar.h2;
        TLRPC.MessageAction messageAction = a5aVar.g2;
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
        CharSequence[] charSequenceArr = {a5aVar.o2.getText()};
        tL_textWithEntities.entities = ls6.d0(this.G).Y(charSequenceArr, true, true);
        tL_textWithEntities.text = charSequenceArr[0].toString();
        r47Var.K5();
        a5aVar.f2.i0(r47Var, true);
        a5aVar.p2.O(true);
        a5aVar.c1(true);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        int L = hl.L(10.0f);
        int measuredWidth = getMeasuredWidth() - hl.L(10.0f);
        int measuredHeight = getMeasuredHeight();
        jl0 jl0Var = this.F;
        jl0Var.setBounds(L, 0, measuredWidth, measuredHeight);
        jl0Var.draw(canvas);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setPadding(hl.L(16.0f), 0, hl.L(12.0f), 0);
        super.onMeasure(i, i2);
    }
}
