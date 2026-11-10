package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wx implements Runnable {
    public final int f26399a = 0;
    public final gz f26400b;
    public final TLObject f26401c;
    public final ij d;
    public final String f26402e;
    public final sy f26403f;
    public final boolean h;
    public final sy f26404n;
    public final Object f26405r;
    public final HashMap f26406s;
    public final boolean f26407w;
    public final Object f26408x;
    public final TLObject f26409y;

    public wx(gz gzVar, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, ij ijVar, String str, sy syVar, boolean z9, sy syVar2, Object obj, HashMap hashMap, boolean z10) {
        this.f26400b = gzVar;
        this.f26401c = tLObject;
        this.f26409y = tL_messages_addPollAnswer;
        this.f26408x = tLObject2;
        this.d = ijVar;
        this.f26402e = str;
        this.f26403f = syVar;
        this.h = z9;
        this.f26404n = syVar2;
        this.f26405r = obj;
        this.f26406s = hashMap;
        this.f26407w = z10;
    }

    @Override
    public final void run() {
        switch (this.f26399a) {
            case 0:
                TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer = (TLRPC.TL_messages_addPollAnswer) this.f26409y;
                TLObject tLObject = (TLObject) this.f26408x;
                gz gzVar = this.f26400b;
                gzVar.getClass();
                TLObject tLObject2 = this.f26401c;
                boolean z9 = tLObject2 instanceof TLRPC.TL_messageMediaDocument;
                ij ijVar = this.d;
                String str = this.f26402e;
                sy syVar = this.f26403f;
                boolean z10 = this.h;
                sy syVar2 = this.f26404n;
                Object obj = this.f26405r;
                HashMap hashMap = this.f26406s;
                boolean z11 = this.f26407w;
                if (z9) {
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject2).document;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputDocument.f26972id = document.f26966id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    tL_inputMediaDocument.f27021id = tL_inputDocument;
                    tL_messages_addPollAnswer.answer.input_media = tL_inputMediaDocument;
                    gzVar.O(tLObject, ijVar, str, syVar, z10, syVar2, obj, hashMap, z11);
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_messageMediaPhoto) {
                    TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) tLObject2).photo;
                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                    tL_inputPhoto.f26979id = photo.f26984id;
                    tL_inputPhoto.access_hash = photo.access_hash;
                    tL_inputPhoto.file_reference = photo.file_reference;
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
                    tL_inputMediaPhoto.f27023id = tL_inputPhoto;
                    tL_messages_addPollAnswer.answer.input_media = tL_inputMediaPhoto;
                    gzVar.O(tLObject, ijVar, str, syVar, z10, syVar2, obj, hashMap, z11);
                    return;
                } else if (syVar2 != null) {
                    syVar2.c();
                    return;
                } else {
                    return;
                }
            default:
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f26408x;
                Context context = f2Var.getContext();
                org.telegram.ui.ActionBar.h6 resourceProvider = f2Var.getResourceProvider();
                cg.a i7 = cg.a.i(((TLRPC.TL_inputMediaStakeDice) this.f26409y).ton_amount, cg.b.f6166b);
                gz gzVar2 = this.f26400b;
                TLObject tLObject3 = this.f26401c;
                ij ijVar2 = this.d;
                new gi.e(context, resourceProvider, i7, false, new nw(gzVar2, tLObject3, ijVar2, this.f26402e, this.f26403f, this.h, this.f26404n, this.f26405r, this.f26406s, this.f26407w, 0)).show();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ijVar2);
                gzVar2.f(arrayList);
                return;
        }
    }

    public wx(gz gzVar, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLObject tLObject, ij ijVar, String str, sy syVar, boolean z9, sy syVar2, Object obj, HashMap hashMap, boolean z10) {
        this.f26400b = gzVar;
        this.f26408x = f2Var;
        this.f26409y = tL_inputMediaStakeDice;
        this.f26401c = tLObject;
        this.d = ijVar;
        this.f26402e = str;
        this.f26403f = syVar;
        this.h = z9;
        this.f26404n = syVar2;
        this.f26405r = obj;
        this.f26406s = hashMap;
        this.f26407w = z10;
    }
}
