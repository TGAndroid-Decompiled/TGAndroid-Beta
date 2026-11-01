package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jy implements Runnable {
    public final int f16523a = 0;
    public final rz f16524b;
    public final TLObject f16525c;
    public final kj d;
    public final String e;
    public final dz f16526f;
    public final boolean h;
    public final dz f16527n;
    public final Object f16528r;
    public final HashMap f16529s;
    public final boolean f16530w;
    public final Object f16531x;
    public final TLObject f16532y;

    public jy(rz rzVar, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, kj kjVar, String str, dz dzVar, boolean z10, dz dzVar2, Object obj, HashMap hashMap, boolean z11) {
        this.f16524b = rzVar;
        this.f16525c = tLObject;
        this.f16532y = tL_messages_addPollAnswer;
        this.f16531x = tLObject2;
        this.d = kjVar;
        this.e = str;
        this.f16526f = dzVar;
        this.h = z10;
        this.f16527n = dzVar2;
        this.f16528r = obj;
        this.f16529s = hashMap;
        this.f16530w = z11;
    }

    @Override
    public final void run() {
        switch (this.f16523a) {
            case 0:
                TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer = (TLRPC.TL_messages_addPollAnswer) this.f16532y;
                TLObject tLObject = (TLObject) this.f16531x;
                rz rzVar = this.f16524b;
                rzVar.getClass();
                TLObject tLObject2 = this.f16525c;
                boolean z10 = tLObject2 instanceof TLRPC.TL_messageMediaDocument;
                kj kjVar = this.d;
                String str = this.e;
                dz dzVar = this.f16526f;
                boolean z11 = this.h;
                dz dzVar2 = this.f16527n;
                Object obj = this.f16528r;
                HashMap hashMap = this.f16529s;
                boolean z12 = this.f16530w;
                if (z10) {
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject2).document;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputDocument.f19806id = document.f19800id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    tL_inputMediaDocument.f19855id = tL_inputDocument;
                    tL_messages_addPollAnswer.answer.input_media = tL_inputMediaDocument;
                    rzVar.O(tLObject, kjVar, str, dzVar, z11, dzVar2, obj, hashMap, z12);
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_messageMediaPhoto) {
                    TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) tLObject2).photo;
                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                    tL_inputPhoto.f19813id = photo.f19818id;
                    tL_inputPhoto.access_hash = photo.access_hash;
                    tL_inputPhoto.file_reference = photo.file_reference;
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
                    tL_inputMediaPhoto.f19857id = tL_inputPhoto;
                    tL_messages_addPollAnswer.answer.input_media = tL_inputMediaPhoto;
                    rzVar.O(tLObject, kjVar, str, dzVar, z11, dzVar2, obj, hashMap, z12);
                    return;
                } else if (dzVar2 != null) {
                    dzVar2.c();
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.f16531x;
                Context context = k2Var.getContext();
                org.telegram.ui.ActionBar.p6 resourceProvider = k2Var.getResourceProvider();
                sf.a i10 = sf.a.i(((TLRPC.TL_inputMediaStakeDice) this.f16532y).ton_amount, sf.b.f48268b);
                rz rzVar2 = this.f16524b;
                TLObject tLObject3 = this.f16525c;
                kj kjVar2 = this.d;
                new wh.f(context, resourceProvider, i10, false, new ax(rzVar2, tLObject3, kjVar2, this.e, this.f16526f, this.h, this.f16527n, this.f16528r, this.f16529s, this.f16530w, 0)).show();
                ArrayList arrayList = new ArrayList();
                arrayList.add(kjVar2);
                rzVar2.f(arrayList);
                return;
        }
    }

    public jy(rz rzVar, org.telegram.ui.ActionBar.k2 k2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLObject tLObject, kj kjVar, String str, dz dzVar, boolean z10, dz dzVar2, Object obj, HashMap hashMap, boolean z11) {
        this.f16524b = rzVar;
        this.f16531x = k2Var;
        this.f16532y = tL_inputMediaStakeDice;
        this.f16525c = tLObject;
        this.d = kjVar;
        this.e = str;
        this.f16526f = dzVar;
        this.h = z10;
        this.f16527n = dzVar2;
        this.f16528r = obj;
        this.f16529s = hashMap;
        this.f16530w = z11;
    }
}
