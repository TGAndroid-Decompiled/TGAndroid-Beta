package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xx implements Runnable {
    public final int f26518a = 0;
    public final gz f26519b;
    public final TLObject f26520c;
    public final ij d;
    public final String f26521e;
    public final sy f26522f;
    public final boolean h;
    public final sy f26523n;
    public final Object f26524r;
    public final HashMap f26525s;
    public final boolean f26526w;
    public final Object f26527x;
    public final TLObject f26528y;

    public xx(gz gzVar, TLObject tLObject, TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer, TLObject tLObject2, ij ijVar, String str, sy syVar, boolean z9, sy syVar2, Object obj, HashMap hashMap, boolean z10) {
        this.f26519b = gzVar;
        this.f26520c = tLObject;
        this.f26528y = tL_messages_addPollAnswer;
        this.f26527x = tLObject2;
        this.d = ijVar;
        this.f26521e = str;
        this.f26522f = syVar;
        this.h = z9;
        this.f26523n = syVar2;
        this.f26524r = obj;
        this.f26525s = hashMap;
        this.f26526w = z10;
    }

    @Override
    public final void run() {
        switch (this.f26518a) {
            case 0:
                TLRPC.TL_messages_addPollAnswer tL_messages_addPollAnswer = (TLRPC.TL_messages_addPollAnswer) this.f26528y;
                TLObject tLObject = (TLObject) this.f26527x;
                gz gzVar = this.f26519b;
                gzVar.getClass();
                TLObject tLObject2 = this.f26520c;
                boolean z9 = tLObject2 instanceof TLRPC.TL_messageMediaDocument;
                ij ijVar = this.d;
                String str = this.f26521e;
                sy syVar = this.f26522f;
                boolean z10 = this.h;
                sy syVar2 = this.f26523n;
                Object obj = this.f26524r;
                HashMap hashMap = this.f26525s;
                boolean z11 = this.f26526w;
                if (z9) {
                    TLRPC.Document document = ((TLRPC.TL_messageMediaDocument) tLObject2).document;
                    TLRPC.TL_inputDocument tL_inputDocument = new TLRPC.TL_inputDocument();
                    tL_inputDocument.f26964id = document.f26958id;
                    tL_inputDocument.access_hash = document.access_hash;
                    tL_inputDocument.file_reference = document.file_reference;
                    TLRPC.TL_inputMediaDocument tL_inputMediaDocument = new TLRPC.TL_inputMediaDocument();
                    tL_inputMediaDocument.f27013id = tL_inputDocument;
                    tL_messages_addPollAnswer.answer.input_media = tL_inputMediaDocument;
                    gzVar.O(tLObject, ijVar, str, syVar, z10, syVar2, obj, hashMap, z11);
                    return;
                } else if (tLObject2 instanceof TLRPC.TL_messageMediaPhoto) {
                    TLRPC.Photo photo = ((TLRPC.TL_messageMediaPhoto) tLObject2).photo;
                    TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
                    tL_inputPhoto.f26971id = photo.f26976id;
                    tL_inputPhoto.access_hash = photo.access_hash;
                    tL_inputPhoto.file_reference = photo.file_reference;
                    TLRPC.TL_inputMediaPhoto tL_inputMediaPhoto = new TLRPC.TL_inputMediaPhoto();
                    tL_inputMediaPhoto.f27015id = tL_inputPhoto;
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
                org.telegram.ui.ActionBar.f2 f2Var = (org.telegram.ui.ActionBar.f2) this.f26527x;
                Context context = f2Var.getContext();
                org.telegram.ui.ActionBar.f6 resourceProvider = f2Var.getResourceProvider();
                cg.a i7 = cg.a.i(((TLRPC.TL_inputMediaStakeDice) this.f26528y).ton_amount, cg.b.f6163b);
                gz gzVar2 = this.f26519b;
                TLObject tLObject3 = this.f26520c;
                ij ijVar2 = this.d;
                new gi.e(context, resourceProvider, i7, false, new ow(gzVar2, tLObject3, ijVar2, this.f26521e, this.f26522f, this.h, this.f26523n, this.f26524r, this.f26525s, this.f26526w, 0)).show();
                ArrayList arrayList = new ArrayList();
                arrayList.add(ijVar2);
                gzVar2.f(arrayList);
                return;
        }
    }

    public xx(gz gzVar, org.telegram.ui.ActionBar.f2 f2Var, TLRPC.TL_inputMediaStakeDice tL_inputMediaStakeDice, TLObject tLObject, ij ijVar, String str, sy syVar, boolean z9, sy syVar2, Object obj, HashMap hashMap, boolean z10) {
        this.f26519b = gzVar;
        this.f26527x = f2Var;
        this.f26528y = tL_inputMediaStakeDice;
        this.f26520c = tLObject;
        this.d = ijVar;
        this.f26521e = str;
        this.f26522f = syVar;
        this.h = z9;
        this.f26523n = syVar2;
        this.f26524r = obj;
        this.f26525s = hashMap;
        this.f26526w = z10;
    }
}
