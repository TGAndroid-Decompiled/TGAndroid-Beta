package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class px implements Runnable {
    public final int f26404a = 0;
    public final zy f26405b;
    public final TLObject f26406c;
    public final fj d;
    public final String f26407e;
    public final ly f26408f;
    public final boolean h;
    public final ly f26409n;
    public final Object f26410r;
    public final HashMap f26411s;
    public final boolean f26412w;
    public final Object f26413x;
    public final TLObject f26414y;

    public px(zy zyVar, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, fj fjVar, String str, ly lyVar, boolean z10, ly lyVar2, Object obj, HashMap hashMap, boolean z11) {
        this.f26405b = zyVar;
        this.f26406c = tLObject;
        this.f26414y = tL_messages_addPollAnswer;
        this.f26413x = tLObject2;
        this.d = fjVar;
        this.f26407e = str;
        this.f26408f = lyVar;
        this.h = z10;
        this.f26409n = lyVar2;
        this.f26410r = obj;
        this.f26411s = hashMap;
        this.f26412w = z11;
    }

    @Override
    public final void run() {
        switch (this.f26404a) {
            case 0:
                TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer = (TLRPC.TL_messages_addPollAnswer) this.f26414y;
                TLObject tLObject = (TLObject) this.f26413x;
                zy zyVar = this.f26405b;
                zyVar.getClass();
                TLObject tLObject2 = this.f26406c;
                boolean z10 = tLObject2 instanceof TLRPC.TL_messageMediaDocument;
                fj fjVar = this.d;
                String str = this.f26407e;
                ly lyVar = this.f26408f;
                boolean z11 = this.h;
                ly lyVar2 = this.f26409n;
                Object obj = this.f26410r;
                HashMap hashMap = this.f26411s;
                boolean z12 = this.f26412w;
                if (z10) {
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject2).document;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputDocument.f28504id = document.f28498id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    tL_inputMediaDocument.f28553id = tL_inputDocument;
                    tL_messages_addPollAnswer.answer.input_media = tL_inputMediaDocument;
                    zyVar.O(tLObject, fjVar, str, lyVar, z11, lyVar2, obj, hashMap, z12);
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_messageMediaPhoto) {
                    TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) tLObject2).photo;
                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                    tL_inputPhoto.f28511id = photo.f28516id;
                    tL_inputPhoto.access_hash = photo.access_hash;
                    tL_inputPhoto.file_reference = photo.file_reference;
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
                    tL_inputMediaPhoto.f28555id = tL_inputPhoto;
                    tL_messages_addPollAnswer.answer.input_media = tL_inputMediaPhoto;
                    zyVar.O(tLObject, fjVar, str, lyVar, z11, lyVar2, obj, hashMap, z12);
                    return;
                } else if (lyVar2 != null) {
                    lyVar2.c();
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f26413x;
                Context context = g2Var.getContext();
                org.telegram.ui.ActionBar.i6 resourceProvider = g2Var.getResourceProvider();
                cg.a j3 = cg.a.j(((TLRPC.TL_inputMediaStakeDice) this.f26414y).ton_amount, cg.b.f5269b);
                zy zyVar2 = this.f26405b;
                TLObject tLObject3 = this.f26406c;
                fj fjVar2 = this.d;
                new ii.s(context, resourceProvider, j3, false, new hw(zyVar2, tLObject3, fjVar2, this.f26407e, this.f26408f, this.h, this.f26409n, this.f26410r, this.f26411s, this.f26412w, 0)).show();
                ArrayList arrayList = new ArrayList();
                arrayList.add(fjVar2);
                zyVar2.f(arrayList);
                return;
        }
    }

    public px(zy zyVar, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLObject tLObject, fj fjVar, String str, ly lyVar, boolean z10, ly lyVar2, Object obj, HashMap hashMap, boolean z11) {
        this.f26405b = zyVar;
        this.f26413x = g2Var;
        this.f26414y = tL_inputMediaStakeDice;
        this.f26406c = tLObject;
        this.d = fjVar;
        this.f26407e = str;
        this.f26408f = lyVar;
        this.h = z10;
        this.f26409n = lyVar2;
        this.f26410r = obj;
        this.f26411s = hashMap;
        this.f26412w = z11;
    }
}
