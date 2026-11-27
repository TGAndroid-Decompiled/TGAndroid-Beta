package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class t6a implements Runnable {
    public final byte a = 0;
    public final r7a b;
    public final TLObject c;
    public final r47 d;
    public final String e;
    public final d7a f;
    public final boolean h;
    public final d7a n;
    public final Object r;
    public final HashMap s;
    public final boolean w;
    public final Object x;
    public final TLObject y;

    public t6a(r7a r7aVar, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, r47 r47Var, String str, d7a d7aVar, boolean z, d7a d7aVar2, Object obj, HashMap hashMap, boolean z2) {
        this.b = r7aVar;
        this.c = tLObject;
        this.y = tL_messages_addPollAnswer;
        this.x = tLObject2;
        this.d = r47Var;
        this.e = str;
        this.f = d7aVar;
        this.h = z;
        this.n = d7aVar2;
        this.r = obj;
        this.s = hashMap;
        this.w = z2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        TLObject tLObject = this.y;
        Object obj = this.x;
        switch (b) {
            case 0:
                TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer = (TLRPC.TL_messages_addPollAnswer) tLObject;
                TLObject tLObject2 = (TLObject) obj;
                TLObject tLObject3 = this.c;
                boolean z = tLObject3 instanceof TLRPC.TL_messageMediaDocument;
                r7a r7aVar = this.b;
                r47 r47Var = this.d;
                String str = this.e;
                d7a d7aVar = this.f;
                boolean z2 = this.h;
                d7a d7aVar2 = this.n;
                Object obj2 = this.r;
                HashMap hashMap = this.s;
                boolean z3 = this.w;
                if (z) {
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject3).document;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputDocument.id = document.id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    tL_inputMediaDocument.id = tL_inputDocument;
                    tL_messages_addPollAnswer.answer.input_media = tL_inputMediaDocument;
                    r7aVar.N(tLObject2, r47Var, str, d7aVar, z2, d7aVar2, obj2, hashMap, z3);
                    return;
                } else if (tLObject3 instanceof TLRPC.TL_messageMediaPhoto) {
                    TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) tLObject3).photo;
                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                    tL_inputPhoto.id = photo.id;
                    tL_inputPhoto.access_hash = photo.access_hash;
                    tL_inputPhoto.file_reference = photo.file_reference;
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
                    tL_inputMediaPhoto.id = tL_inputPhoto;
                    tL_messages_addPollAnswer.answer.input_media = tL_inputMediaPhoto;
                    r7aVar.N(tLObject2, r47Var, str, d7aVar, z2, d7aVar2, obj2, hashMap, z3);
                    return;
                } else if (d7aVar2 != null) {
                    d7aVar2.c();
                    return;
                } else {
                    return;
                }
            default:
                e eVar = (e) obj;
                Context context = eVar.getContext();
                vnb resourceProvider = eVar.getResourceProvider();
                oj j = oj.j(((TLRPC.TL_inputMediaStakeDice) tLObject).ton_amount, pj.b);
                r7a r7aVar2 = this.b;
                TLObject tLObject4 = this.c;
                r47 r47Var2 = this.d;
                new shb(context, resourceProvider, j, new n5a(r7aVar2, tLObject4, r47Var2, this.e, this.f, this.h, this.n, this.r, this.s, this.w, (byte) 0)).show();
                ArrayList arrayList = new ArrayList();
                arrayList.add(r47Var2);
                r7aVar2.g(arrayList);
                return;
        }
    }

    public t6a(r7a r7aVar, e eVar, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLObject tLObject, r47 r47Var, String str, d7a d7aVar, boolean z, d7a d7aVar2, Object obj, HashMap hashMap, boolean z2) {
        this.b = r7aVar;
        this.x = eVar;
        this.y = tL_inputMediaStakeDice;
        this.c = tLObject;
        this.d = r47Var;
        this.e = str;
        this.f = d7aVar;
        this.h = z;
        this.n = d7aVar2;
        this.r = obj;
        this.s = hashMap;
        this.w = z2;
    }
}
