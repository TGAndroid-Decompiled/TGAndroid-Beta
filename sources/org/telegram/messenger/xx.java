package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xx implements Runnable {
    public final int f26526a = 0;
    public final gz f26527b;
    public final TLObject f26528c;
    public final ij d;
    public final String f26529e;
    public final sy f26530f;
    public final boolean h;
    public final sy f26531n;
    public final Object f26532r;
    public final HashMap f26533s;
    public final boolean f26534w;
    public final Object f26535x;
    public final TLObject f26536y;

    public xx(gz gzVar, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, ij ijVar, String str, sy syVar, boolean z9, sy syVar2, Object obj, HashMap hashMap, boolean z10) {
        this.f26527b = gzVar;
        this.f26528c = tLObject;
        this.f26536y = tL_messages_addPollAnswer;
        this.f26535x = tLObject2;
        this.d = ijVar;
        this.f26529e = str;
        this.f26530f = syVar;
        this.h = z9;
        this.f26531n = syVar2;
        this.f26532r = obj;
        this.f26533s = hashMap;
        this.f26534w = z10;
    }

    @Override
    public final void run() {
        switch (this.f26526a) {
            case 0:
                TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer = (TLRPC.TL_messages_addPollAnswer) this.f26536y;
                TLObject tLObject = (TLObject) this.f26535x;
                gz gzVar = this.f26527b;
                gzVar.getClass();
                TLObject tLObject2 = this.f26528c;
                boolean z9 = tLObject2 instanceof TLRPC.TL_messageMediaDocument;
                ij ijVar = this.d;
                String str = this.f26529e;
                sy syVar = this.f26530f;
                boolean z10 = this.h;
                sy syVar2 = this.f26531n;
                Object obj = this.f26532r;
                HashMap hashMap = this.f26533s;
                boolean z11 = this.f26534w;
                if (z9) {
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject2).document;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputDocument.f26965id = document.f26959id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    tL_inputMediaDocument.f27014id = tL_inputDocument;
                    tL_messages_addPollAnswer.answer.input_media = tL_inputMediaDocument;
                    gzVar.O(tLObject, ijVar, str, syVar, z10, syVar2, obj, hashMap, z11);
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_messageMediaPhoto) {
                    TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) tLObject2).photo;
                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                    tL_inputPhoto.f26972id = photo.f26977id;
                    tL_inputPhoto.access_hash = photo.access_hash;
                    tL_inputPhoto.file_reference = photo.file_reference;
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
                    tL_inputMediaPhoto.f27016id = tL_inputPhoto;
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
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f26535x;
                Context context = f2Var.getContext();
                org.telegram.ui.ActionBar.f6 resourceProvider = f2Var.getResourceProvider();
                cg.a i7 = cg.a.i(((TLRPC.TL_inputMediaStakeDice) this.f26536y).ton_amount, cg.b.f6163b);
                gz gzVar2 = this.f26527b;
                TLObject tLObject3 = this.f26528c;
                ij ijVar2 = this.d;
                new gi.e(context, resourceProvider, i7, false, new ow(gzVar2, tLObject3, ijVar2, this.f26529e, this.f26530f, this.h, this.f26531n, this.f26532r, this.f26533s, this.f26534w, 0)).show();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ijVar2);
                gzVar2.f(arrayList);
                return;
        }
    }

    public xx(gz gzVar, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLObject tLObject, ij ijVar, String str, sy syVar, boolean z9, sy syVar2, Object obj, HashMap hashMap, boolean z10) {
        this.f26527b = gzVar;
        this.f26535x = f2Var;
        this.f26536y = tL_inputMediaStakeDice;
        this.f26528c = tLObject;
        this.d = ijVar;
        this.f26529e = str;
        this.f26530f = syVar;
        this.h = z9;
        this.f26531n = syVar2;
        this.f26532r = obj;
        this.f26533s = hashMap;
        this.f26534w = z10;
    }
}
