package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class px implements Runnable {
    public final int f26338a = 0;
    public final zy f26339b;
    public final TLObject f26340c;
    public final fj d;
    public final String f26341e;
    public final ly f26342f;
    public final boolean h;
    public final ly f26343n;
    public final Object f26344r;
    public final HashMap f26345s;
    public final boolean f26346w;
    public final Object f26347x;
    public final TLObject f26348y;

    public px(zy zyVar, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, fj fjVar, String str, ly lyVar, boolean z10, ly lyVar2, Object obj, HashMap hashMap, boolean z11) {
        this.f26339b = zyVar;
        this.f26340c = tLObject;
        this.f26348y = tL_messages_addPollAnswer;
        this.f26347x = tLObject2;
        this.d = fjVar;
        this.f26341e = str;
        this.f26342f = lyVar;
        this.h = z10;
        this.f26343n = lyVar2;
        this.f26344r = obj;
        this.f26345s = hashMap;
        this.f26346w = z11;
    }

    @Override
    public final void run() {
        switch (this.f26338a) {
            case 0:
                TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer = (TLRPC.TL_messages_addPollAnswer) this.f26348y;
                TLObject tLObject = (TLObject) this.f26347x;
                zy zyVar = this.f26339b;
                zyVar.getClass();
                TLObject tLObject2 = this.f26340c;
                boolean z10 = tLObject2 instanceof TLRPC.TL_messageMediaDocument;
                fj fjVar = this.d;
                String str = this.f26341e;
                ly lyVar = this.f26342f;
                boolean z11 = this.h;
                ly lyVar2 = this.f26343n;
                Object obj = this.f26344r;
                HashMap hashMap = this.f26345s;
                boolean z12 = this.f26346w;
                if (z10) {
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject2).document;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputDocument.f28443id = document.f28437id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    tL_inputMediaDocument.f28492id = tL_inputDocument;
                    tL_messages_addPollAnswer.answer.input_media = tL_inputMediaDocument;
                    zyVar.O(tLObject, fjVar, str, lyVar, z11, lyVar2, obj, hashMap, z12);
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_messageMediaPhoto) {
                    TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) tLObject2).photo;
                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                    tL_inputPhoto.f28450id = photo.f28455id;
                    tL_inputPhoto.access_hash = photo.access_hash;
                    tL_inputPhoto.file_reference = photo.file_reference;
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
                    tL_inputMediaPhoto.f28494id = tL_inputPhoto;
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
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f26347x;
                Context context = g2Var.getContext();
                org.telegram.ui.ActionBar.h6 resourceProvider = g2Var.getResourceProvider();
                cg.a j3 = cg.a.j(((TLRPC.TL_inputMediaStakeDice) this.f26348y).ton_amount, cg.b.f5303b);
                zy zyVar2 = this.f26339b;
                TLObject tLObject3 = this.f26340c;
                fj fjVar2 = this.d;
                new ii.s(context, resourceProvider, j3, false, new hw(zyVar2, tLObject3, fjVar2, this.f26341e, this.f26342f, this.h, this.f26343n, this.f26344r, this.f26345s, this.f26346w, 0)).show();
                ArrayList arrayList = new ArrayList();
                arrayList.add(fjVar2);
                zyVar2.f(arrayList);
                return;
        }
    }

    public px(zy zyVar, org.telegram.ui.ActionBar.g2 g2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLObject tLObject, fj fjVar, String str, ly lyVar, boolean z10, ly lyVar2, Object obj, HashMap hashMap, boolean z11) {
        this.f26339b = zyVar;
        this.f26347x = g2Var;
        this.f26348y = tL_inputMediaStakeDice;
        this.f26340c = tLObject;
        this.d = fjVar;
        this.f26341e = str;
        this.f26342f = lyVar;
        this.h = z10;
        this.f26343n = lyVar2;
        this.f26344r = obj;
        this.f26345s = hashMap;
        this.f26346w = z11;
    }
}
