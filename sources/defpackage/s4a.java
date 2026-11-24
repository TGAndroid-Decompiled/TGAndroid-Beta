package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class s4a implements Runnable {
    public final byte a = 0;
    public final a6a b;
    public final TLObject c;
    public final k47 d;
    public final String e;
    public final m5a f;
    public final boolean h;
    public final m5a n;
    public final Object r;
    public final HashMap s;
    public final boolean w;
    public final Object x;
    public final TLObject y;

    public s4a(a6a a6aVar, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, k47 k47Var, String str, m5a m5aVar, boolean z, m5a m5aVar2, Object obj, HashMap hashMap, boolean z2) {
        this.b = a6aVar;
        this.c = tLObject;
        this.y = tL_messages_addPollAnswer;
        this.x = tLObject2;
        this.d = k47Var;
        this.e = str;
        this.f = m5aVar;
        this.h = z;
        this.n = m5aVar2;
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
                a6a a6aVar = this.b;
                k47 k47Var = this.d;
                String str = this.e;
                m5a m5aVar = this.f;
                boolean z2 = this.h;
                m5a m5aVar2 = this.n;
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
                    a6aVar.N(tLObject2, k47Var, str, m5aVar, z2, m5aVar2, obj2, hashMap, z3);
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
                    a6aVar.N(tLObject2, k47Var, str, m5aVar, z2, m5aVar2, obj2, hashMap, z3);
                    return;
                } else if (m5aVar2 != null) {
                    m5aVar2.c();
                    return;
                } else {
                    return;
                }
            default:
                d dVar = (d) obj;
                Context context = dVar.getContext();
                ylb resourceProvider = dVar.getResourceProvider();
                nk j = nk.j(((TLRPC.TL_inputMediaStakeDice) tLObject).ton_amount, ok.b);
                a6a a6aVar2 = this.b;
                TLObject tLObject4 = this.c;
                k47 k47Var2 = this.d;
                new xfb(context, resourceProvider, j, new q3a(a6aVar2, tLObject4, k47Var2, this.e, this.f, this.h, this.n, this.r, this.s, this.w, (byte) 0)).show();
                ArrayList arrayList = new ArrayList();
                arrayList.add(k47Var2);
                a6aVar2.g(arrayList);
                return;
        }
    }

    public s4a(a6a a6aVar, d dVar, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLObject tLObject, k47 k47Var, String str, m5a m5aVar, boolean z, m5a m5aVar2, Object obj, HashMap hashMap, boolean z2) {
        this.b = a6aVar;
        this.x = dVar;
        this.y = tL_inputMediaStakeDice;
        this.c = tLObject;
        this.d = k47Var;
        this.e = str;
        this.f = m5aVar;
        this.h = z;
        this.n = m5aVar2;
        this.r = obj;
        this.s = hashMap;
        this.w = z2;
    }
}
