package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qx implements Runnable {
    public final int f26519a = 0;
    public final az f26520b;
    public final TLObject f26521c;
    public final gj d;
    public final String f26522e;
    public final my f26523f;
    public final boolean h;
    public final my f26524n;
    public final Object f26525r;
    public final HashMap f26526s;
    public final boolean f26527w;
    public final Object f26528x;
    public final TLObject f26529y;

    public qx(az azVar, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, gj gjVar, String str, my myVar, boolean z10, my myVar2, Object obj, HashMap hashMap, boolean z11) {
        this.f26520b = azVar;
        this.f26521c = tLObject;
        this.f26529y = tL_messages_addPollAnswer;
        this.f26528x = tLObject2;
        this.d = gjVar;
        this.f26522e = str;
        this.f26523f = myVar;
        this.h = z10;
        this.f26524n = myVar2;
        this.f26525r = obj;
        this.f26526s = hashMap;
        this.f26527w = z11;
    }

    @Override
    public final void run() {
        switch (this.f26519a) {
            case 0:
                TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer = (TLRPC.TL_messages_addPollAnswer) this.f26529y;
                TLObject tLObject = (TLObject) this.f26528x;
                az azVar = this.f26520b;
                azVar.getClass();
                TLObject tLObject2 = this.f26521c;
                boolean z10 = tLObject2 instanceof TLRPC.TL_messageMediaDocument;
                gj gjVar = this.d;
                String str = this.f26522e;
                my myVar = this.f26523f;
                boolean z11 = this.h;
                my myVar2 = this.f26524n;
                Object obj = this.f26525r;
                HashMap hashMap = this.f26526s;
                boolean z12 = this.f26527w;
                if (z10) {
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject2).document;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputDocument.f28446id = document.f28440id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    tL_inputMediaDocument.f28495id = tL_inputDocument;
                    tL_messages_addPollAnswer.answer.input_media = tL_inputMediaDocument;
                    azVar.O(tLObject, gjVar, str, myVar, z11, myVar2, obj, hashMap, z12);
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_messageMediaPhoto) {
                    TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) tLObject2).photo;
                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                    tL_inputPhoto.f28453id = photo.f28458id;
                    tL_inputPhoto.access_hash = photo.access_hash;
                    tL_inputPhoto.file_reference = photo.file_reference;
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
                    tL_inputMediaPhoto.f28497id = tL_inputPhoto;
                    tL_messages_addPollAnswer.answer.input_media = tL_inputMediaPhoto;
                    azVar.O(tLObject, gjVar, str, myVar, z11, myVar2, obj, hashMap, z12);
                    return;
                } else if (myVar2 != null) {
                    myVar2.c();
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f26528x;
                Context context = g2Var.getContext();
                org.telegram.ui.ActionBar.h6 resourceProvider = g2Var.getResourceProvider();
                cg.a j3 = cg.a.j(((TLRPC.TL_inputMediaStakeDice) this.f26529y).ton_amount, cg.b.f5306b);
                az azVar2 = this.f26520b;
                TLObject tLObject3 = this.f26521c;
                gj gjVar2 = this.d;
                new ii.s(context, resourceProvider, j3, false, new iw(azVar2, tLObject3, gjVar2, this.f26522e, this.f26523f, this.h, this.f26524n, this.f26525r, this.f26526s, this.f26527w, 0)).show();
                ArrayList arrayList = new ArrayList();
                arrayList.add(gjVar2);
                azVar2.f(arrayList);
                return;
        }
    }

    public qx(az azVar, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLObject tLObject, gj gjVar, String str, my myVar, boolean z10, my myVar2, Object obj, HashMap hashMap, boolean z11) {
        this.f26520b = azVar;
        this.f26528x = g2Var;
        this.f26529y = tL_inputMediaStakeDice;
        this.f26521c = tLObject;
        this.d = gjVar;
        this.f26522e = str;
        this.f26523f = myVar;
        this.h = z10;
        this.f26524n = myVar2;
        this.f26525r = obj;
        this.f26526s = hashMap;
        this.f26527w = z11;
    }
}
