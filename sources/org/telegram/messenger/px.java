package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class px implements Runnable {
    public final int f26312a = 0;
    public final zy f26313b;
    public final TLObject f26314c;
    public final fj d;
    public final String f26315e;
    public final ly f26316f;
    public final boolean h;
    public final ly f26317n;
    public final Object f26318r;
    public final HashMap f26319s;
    public final boolean f26320w;
    public final Object f26321x;
    public final TLObject f26322y;

    public px(zy zyVar, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, fj fjVar, String str, ly lyVar, boolean z10, ly lyVar2, Object obj, HashMap hashMap, boolean z11) {
        this.f26313b = zyVar;
        this.f26314c = tLObject;
        this.f26322y = tL_messages_addPollAnswer;
        this.f26321x = tLObject2;
        this.d = fjVar;
        this.f26315e = str;
        this.f26316f = lyVar;
        this.h = z10;
        this.f26317n = lyVar2;
        this.f26318r = obj;
        this.f26319s = hashMap;
        this.f26320w = z11;
    }

    @Override
    public final void run() {
        switch (this.f26312a) {
            case 0:
                TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer = (TLRPC.TL_messages_addPollAnswer) this.f26322y;
                TLObject tLObject = (TLObject) this.f26321x;
                zy zyVar = this.f26313b;
                zyVar.getClass();
                TLObject tLObject2 = this.f26314c;
                boolean z10 = tLObject2 instanceof TLRPC.TL_messageMediaDocument;
                fj fjVar = this.d;
                String str = this.f26315e;
                ly lyVar = this.f26316f;
                boolean z11 = this.h;
                ly lyVar2 = this.f26317n;
                Object obj = this.f26318r;
                HashMap hashMap = this.f26319s;
                boolean z12 = this.f26320w;
                if (z10) {
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject2).document;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputDocument.f28417id = document.f28411id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    tL_inputMediaDocument.f28466id = tL_inputDocument;
                    tL_messages_addPollAnswer.answer.input_media = tL_inputMediaDocument;
                    zyVar.O(tLObject, fjVar, str, lyVar, z11, lyVar2, obj, hashMap, z12);
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_messageMediaPhoto) {
                    TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) tLObject2).photo;
                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                    tL_inputPhoto.f28424id = photo.f28429id;
                    tL_inputPhoto.access_hash = photo.access_hash;
                    tL_inputPhoto.file_reference = photo.file_reference;
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
                    tL_inputMediaPhoto.f28468id = tL_inputPhoto;
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
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) this.f26321x;
                Context context = h2Var.getContext();
                org.telegram.ui.ActionBar.i6 resourceProvider = h2Var.getResourceProvider();
                cg.a j3 = cg.a.j(((TLRPC.TL_inputMediaStakeDice) this.f26322y).ton_amount, cg.b.f5277b);
                zy zyVar2 = this.f26313b;
                TLObject tLObject3 = this.f26314c;
                fj fjVar2 = this.d;
                new ii.s(context, resourceProvider, j3, false, new hw(zyVar2, tLObject3, fjVar2, this.f26315e, this.f26316f, this.h, this.f26317n, this.f26318r, this.f26319s, this.f26320w, 0)).show();
                ArrayList arrayList = new ArrayList();
                arrayList.add(fjVar2);
                zyVar2.f(arrayList);
                return;
        }
    }

    public px(zy zyVar, org.telegram.ui.ActionBar.h2 h2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLObject tLObject, fj fjVar, String str, ly lyVar, boolean z10, ly lyVar2, Object obj, HashMap hashMap, boolean z11) {
        this.f26313b = zyVar;
        this.f26321x = h2Var;
        this.f26322y = tL_inputMediaStakeDice;
        this.f26314c = tLObject;
        this.d = fjVar;
        this.f26315e = str;
        this.f26316f = lyVar;
        this.h = z10;
        this.f26317n = lyVar2;
        this.f26318r = obj;
        this.f26319s = hashMap;
        this.f26320w = z11;
    }
}
