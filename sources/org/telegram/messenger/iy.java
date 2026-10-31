package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class iy implements Runnable {
    public final int f16187a = 0;
    public final qz f16188b;
    public final TLObject f16189c;
    public final jj d;
    public final String e;
    public final cz f16190f;
    public final boolean h;
    public final cz f16191n;
    public final Object f16192r;
    public final HashMap f16193s;
    public final boolean f16194w;
    public final Object f16195x;
    public final TLObject f16196y;

    public iy(qz qzVar, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, jj jjVar, String str, cz czVar, boolean z10, cz czVar2, Object obj, HashMap hashMap, boolean z11) {
        this.f16188b = qzVar;
        this.f16189c = tLObject;
        this.f16196y = tL_messages_addPollAnswer;
        this.f16195x = tLObject2;
        this.d = jjVar;
        this.e = str;
        this.f16190f = czVar;
        this.h = z10;
        this.f16191n = czVar2;
        this.f16192r = obj;
        this.f16193s = hashMap;
        this.f16194w = z11;
    }

    @Override
    public final void run() {
        switch (this.f16187a) {
            case 0:
                TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer = (TLRPC.TL_messages_addPollAnswer) this.f16196y;
                TLObject tLObject = (TLObject) this.f16195x;
                qz qzVar = this.f16188b;
                qzVar.getClass();
                TLObject tLObject2 = this.f16189c;
                boolean z10 = tLObject2 instanceof TLRPC.TL_messageMediaDocument;
                jj jjVar = this.d;
                String str = this.e;
                cz czVar = this.f16190f;
                boolean z11 = this.h;
                cz czVar2 = this.f16191n;
                Object obj = this.f16192r;
                HashMap hashMap = this.f16193s;
                boolean z12 = this.f16194w;
                if (z10) {
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject2).document;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputDocument.f19805id = document.f19799id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    tL_inputMediaDocument.f19854id = tL_inputDocument;
                    tL_messages_addPollAnswer.answer.input_media = tL_inputMediaDocument;
                    qzVar.O(tLObject, jjVar, str, czVar, z11, czVar2, obj, hashMap, z12);
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_messageMediaPhoto) {
                    TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) tLObject2).photo;
                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                    tL_inputPhoto.f19812id = photo.f19817id;
                    tL_inputPhoto.access_hash = photo.access_hash;
                    tL_inputPhoto.file_reference = photo.file_reference;
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
                    tL_inputMediaPhoto.f19856id = tL_inputPhoto;
                    tL_messages_addPollAnswer.answer.input_media = tL_inputMediaPhoto;
                    qzVar.O(tLObject, jjVar, str, czVar, z11, czVar2, obj, hashMap, z12);
                    return;
                } else if (czVar2 != null) {
                    czVar2.c();
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.f16195x;
                Context context = k2Var.getContext();
                org.telegram.ui.ActionBar.p6 resourceProvider = k2Var.getResourceProvider();
                sf.a i10 = sf.a.i(((TLRPC.TL_inputMediaStakeDice) this.f16196y).ton_amount, sf.b.f48257b);
                qz qzVar2 = this.f16188b;
                TLObject tLObject3 = this.f16189c;
                jj jjVar2 = this.d;
                new wh.f(context, resourceProvider, i10, false, new zw(qzVar2, tLObject3, jjVar2, this.e, this.f16190f, this.h, this.f16191n, this.f16192r, this.f16193s, this.f16194w, 0)).show();
                ArrayList arrayList = new ArrayList();
                arrayList.add(jjVar2);
                qzVar2.f(arrayList);
                return;
        }
    }

    public iy(qz qzVar, org.telegram.ui.ActionBar.k2 k2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLObject tLObject, jj jjVar, String str, cz czVar, boolean z10, cz czVar2, Object obj, HashMap hashMap, boolean z11) {
        this.f16188b = qzVar;
        this.f16195x = k2Var;
        this.f16196y = tL_inputMediaStakeDice;
        this.f16189c = tLObject;
        this.d = jjVar;
        this.e = str;
        this.f16190f = czVar;
        this.h = z10;
        this.f16191n = czVar2;
        this.f16192r = obj;
        this.f16193s = hashMap;
        this.f16194w = z11;
    }
}
