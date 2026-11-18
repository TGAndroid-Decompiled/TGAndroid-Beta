package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class px implements Runnable {
    public final int f26310a = 0;
    public final zy f26311b;
    public final TLObject f26312c;
    public final fj d;
    public final String f26313e;
    public final ly f26314f;
    public final boolean h;
    public final ly f26315n;
    public final Object f26316r;
    public final HashMap f26317s;
    public final boolean f26318w;
    public final Object f26319x;
    public final TLObject f26320y;

    public px(zy zyVar, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, fj fjVar, String str, ly lyVar, boolean z10, ly lyVar2, Object obj, HashMap hashMap, boolean z11) {
        this.f26311b = zyVar;
        this.f26312c = tLObject;
        this.f26320y = tL_messages_addPollAnswer;
        this.f26319x = tLObject2;
        this.d = fjVar;
        this.f26313e = str;
        this.f26314f = lyVar;
        this.h = z10;
        this.f26315n = lyVar2;
        this.f26316r = obj;
        this.f26317s = hashMap;
        this.f26318w = z11;
    }

    @Override
    public final void run() {
        switch (this.f26310a) {
            case 0:
                TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer = (TLRPC.TL_messages_addPollAnswer) this.f26320y;
                TLObject tLObject = (TLObject) this.f26319x;
                zy zyVar = this.f26311b;
                zyVar.getClass();
                TLObject tLObject2 = this.f26312c;
                boolean z10 = tLObject2 instanceof TLRPC.TL_messageMediaDocument;
                fj fjVar = this.d;
                String str = this.f26313e;
                ly lyVar = this.f26314f;
                boolean z11 = this.h;
                ly lyVar2 = this.f26315n;
                Object obj = this.f26316r;
                HashMap hashMap = this.f26317s;
                boolean z12 = this.f26318w;
                if (z10) {
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject2).document;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputDocument.f28415id = document.f28409id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    tL_inputMediaDocument.f28464id = tL_inputDocument;
                    tL_messages_addPollAnswer.answer.input_media = tL_inputMediaDocument;
                    zyVar.O(tLObject, fjVar, str, lyVar, z11, lyVar2, obj, hashMap, z12);
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_messageMediaPhoto) {
                    TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) tLObject2).photo;
                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                    tL_inputPhoto.f28422id = photo.f28427id;
                    tL_inputPhoto.access_hash = photo.access_hash;
                    tL_inputPhoto.file_reference = photo.file_reference;
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
                    tL_inputMediaPhoto.f28466id = tL_inputPhoto;
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
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.f26319x;
                Context context = h2Var.getContext();
                org.telegram.ui.ActionBar.i6 resourceProvider = h2Var.getResourceProvider();
                cg.a j3 = cg.a.j(((TLRPC.TL_inputMediaStakeDice) this.f26320y).ton_amount, cg.b.f5274b);
                zy zyVar2 = this.f26311b;
                TLObject tLObject3 = this.f26312c;
                fj fjVar2 = this.d;
                new ii.s(context, resourceProvider, j3, false, new hw(zyVar2, tLObject3, fjVar2, this.f26313e, this.f26314f, this.h, this.f26315n, this.f26316r, this.f26317s, this.f26318w, 0)).show();
                ArrayList arrayList = new ArrayList();
                arrayList.add(fjVar2);
                zyVar2.f(arrayList);
                return;
        }
    }

    public px(zy zyVar, org.telegram.ui.ActionBar.h2 h2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLObject tLObject, fj fjVar, String str, ly lyVar, boolean z10, ly lyVar2, Object obj, HashMap hashMap, boolean z11) {
        this.f26311b = zyVar;
        this.f26319x = h2Var;
        this.f26320y = tL_inputMediaStakeDice;
        this.f26312c = tLObject;
        this.d = fjVar;
        this.f26313e = str;
        this.f26314f = lyVar;
        this.h = z10;
        this.f26315n = lyVar2;
        this.f26316r = obj;
        this.f26317s = hashMap;
        this.f26318w = z11;
    }
}
