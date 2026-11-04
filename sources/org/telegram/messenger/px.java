package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class px implements Runnable {
    public final int f24808a = 0;
    public final yy f24809b;
    public final TLObject f24810c;
    public final zi d;
    public final String f24811e;
    public final ky f24812f;
    public final boolean h;
    public final ky f24813n;
    public final Object f24814r;
    public final HashMap f24815s;
    public final boolean f24816w;
    public final Object f24817x;
    public final TLObject f24818y;

    public px(yy yyVar, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, zi ziVar, String str, ky kyVar, boolean z10, ky kyVar2, Object obj, HashMap hashMap, boolean z11) {
        this.f24809b = yyVar;
        this.f24810c = tLObject;
        this.f24818y = tL_messages_addPollAnswer;
        this.f24817x = tLObject2;
        this.d = ziVar;
        this.f24811e = str;
        this.f24812f = kyVar;
        this.h = z10;
        this.f24813n = kyVar2;
        this.f24814r = obj;
        this.f24815s = hashMap;
        this.f24816w = z11;
    }

    @Override
    public final void run() {
        switch (this.f24808a) {
            case 0:
                TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer = (TLRPC.TL_messages_addPollAnswer) this.f24818y;
                TLObject tLObject = (TLObject) this.f24817x;
                yy yyVar = this.f24809b;
                yyVar.getClass();
                TLObject tLObject2 = this.f24810c;
                boolean z10 = tLObject2 instanceof TLRPC.TL_messageMediaDocument;
                zi ziVar = this.d;
                String str = this.f24811e;
                ky kyVar = this.f24812f;
                boolean z11 = this.h;
                ky kyVar2 = this.f24813n;
                Object obj = this.f24814r;
                HashMap hashMap = this.f24815s;
                boolean z12 = this.f24816w;
                if (z10) {
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject2).document;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputDocument.f27013id = document.f27007id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    tL_inputMediaDocument.f27062id = tL_inputDocument;
                    tL_messages_addPollAnswer.answer.input_media = tL_inputMediaDocument;
                    yyVar.O(tLObject, ziVar, str, kyVar, z11, kyVar2, obj, hashMap, z12);
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_messageMediaPhoto) {
                    TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) tLObject2).photo;
                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                    tL_inputPhoto.f27020id = photo.f27025id;
                    tL_inputPhoto.access_hash = photo.access_hash;
                    tL_inputPhoto.file_reference = photo.file_reference;
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
                    tL_inputMediaPhoto.f27064id = tL_inputPhoto;
                    tL_messages_addPollAnswer.answer.input_media = tL_inputMediaPhoto;
                    yyVar.O(tLObject, ziVar, str, kyVar, z11, kyVar2, obj, hashMap, z12);
                    return;
                } else if (kyVar2 != null) {
                    kyVar2.c();
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f24817x;
                Context context = d2Var.getContext();
                org.telegram.ui.ActionBar.e6 resourceProvider = d2Var.getResourceProvider();
                dg.a i3 = dg.a.i(((TLRPC.TL_inputMediaStakeDice) this.f24818y).ton_amount, dg.b.f8926b);
                yy yyVar2 = this.f24809b;
                TLObject tLObject3 = this.f24810c;
                zi ziVar2 = this.d;
                new hi.f(context, resourceProvider, i3, false, new gw(yyVar2, tLObject3, ziVar2, this.f24811e, this.f24812f, this.h, this.f24813n, this.f24814r, this.f24815s, this.f24816w, 0)).show();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ziVar2);
                yyVar2.f(arrayList);
                return;
        }
    }

    public px(yy yyVar, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLObject tLObject, zi ziVar, String str, ky kyVar, boolean z10, ky kyVar2, Object obj, HashMap hashMap, boolean z11) {
        this.f24809b = yyVar;
        this.f24817x = d2Var;
        this.f24818y = tL_inputMediaStakeDice;
        this.f24810c = tLObject;
        this.d = ziVar;
        this.f24811e = str;
        this.f24812f = kyVar;
        this.h = z10;
        this.f24813n = kyVar2;
        this.f24814r = obj;
        this.f24815s = hashMap;
        this.f24816w = z11;
    }
}
