package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ux implements Runnable {
    public final int f26886a = 0;
    public final ez f26887b;
    public final TLObject f26888c;
    public final gj d;
    public final String f26889e;
    public final qy f26890f;
    public final boolean h;
    public final qy f26891n;
    public final Object f26892r;
    public final HashMap f26893s;
    public final boolean f26894w;
    public final Object f26895x;
    public final TLObject f26896y;

    public ux(ez ezVar, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, gj gjVar, String str, qy qyVar, boolean z10, qy qyVar2, Object obj, HashMap hashMap, boolean z11) {
        this.f26887b = ezVar;
        this.f26888c = tLObject;
        this.f26896y = tL_messages_addPollAnswer;
        this.f26895x = tLObject2;
        this.d = gjVar;
        this.f26889e = str;
        this.f26890f = qyVar;
        this.h = z10;
        this.f26891n = qyVar2;
        this.f26892r = obj;
        this.f26893s = hashMap;
        this.f26894w = z11;
    }

    @Override
    public final void run() {
        switch (this.f26886a) {
            case 0:
                TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer = (TLRPC.TL_messages_addPollAnswer) this.f26896y;
                TLObject tLObject = (TLObject) this.f26895x;
                ez ezVar = this.f26887b;
                ezVar.getClass();
                TLObject tLObject2 = this.f26888c;
                boolean z10 = tLObject2 instanceof TLRPC.TL_messageMediaDocument;
                gj gjVar = this.d;
                String str = this.f26889e;
                qy qyVar = this.f26890f;
                boolean z11 = this.h;
                qy qyVar2 = this.f26891n;
                Object obj = this.f26892r;
                HashMap hashMap = this.f26893s;
                boolean z12 = this.f26894w;
                if (z10) {
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject2).document;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputDocument.f28063id = document.f28057id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    tL_inputMediaDocument.f28112id = tL_inputDocument;
                    tL_messages_addPollAnswer.answer.input_media = tL_inputMediaDocument;
                    ezVar.O(tLObject, gjVar, str, qyVar, z11, qyVar2, obj, hashMap, z12);
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_messageMediaPhoto) {
                    TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) tLObject2).photo;
                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                    tL_inputPhoto.f28070id = photo.f28075id;
                    tL_inputPhoto.access_hash = photo.access_hash;
                    tL_inputPhoto.file_reference = photo.file_reference;
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
                    tL_inputMediaPhoto.f28114id = tL_inputPhoto;
                    tL_messages_addPollAnswer.answer.input_media = tL_inputMediaPhoto;
                    ezVar.O(tLObject, gjVar, str, qyVar, z11, qyVar2, obj, hashMap, z12);
                    return;
                } else if (qyVar2 != null) {
                    qyVar2.c();
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) this.f26895x;
                Context context = e2Var.getContext();
                org.telegram.ui.ActionBar.e6 resourceProvider = e2Var.getResourceProvider();
                cg.a i7 = cg.a.i(((TLRPC.TL_inputMediaStakeDice) this.f26896y).ton_amount, cg.b.f4988b);
                ez ezVar2 = this.f26887b;
                TLObject tLObject3 = this.f26888c;
                gj gjVar2 = this.d;
                new ii.e(context, resourceProvider, i7, false, new lw(ezVar2, tLObject3, gjVar2, this.f26889e, this.f26890f, this.h, this.f26891n, this.f26892r, this.f26893s, this.f26894w, 0)).show();
                ArrayList arrayList = new ArrayList();
                arrayList.add(gjVar2);
                ezVar2.f(arrayList);
                return;
        }
    }

    public ux(ez ezVar, org.telegram.ui.ActionBar.e2 e2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLObject tLObject, gj gjVar, String str, qy qyVar, boolean z10, qy qyVar2, Object obj, HashMap hashMap, boolean z11) {
        this.f26887b = ezVar;
        this.f26895x = e2Var;
        this.f26896y = tL_inputMediaStakeDice;
        this.f26888c = tLObject;
        this.d = gjVar;
        this.f26889e = str;
        this.f26890f = qyVar;
        this.h = z10;
        this.f26891n = qyVar2;
        this.f26892r = obj;
        this.f26893s = hashMap;
        this.f26894w = z11;
    }
}
