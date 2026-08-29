package nh;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.iz;
public final class s1 extends iz {
    public final bv0 X;
    public final t1 Y;

    public s1(t1 t1Var) {
        super(100, true);
        this.Y = t1Var;
        this.X = new Object();
        this.O = new ih.n5(this, 2);
    }

    @Override
    public final int A() {
        return B();
    }

    @Override
    public final bv0 D1(int i10) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i11;
        int i12;
        bv0 bv0Var = this.X;
        bv0Var.f27240c = false;
        Object F = this.Y.f18580c.F(i10);
        if (F instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) F;
            document = botInlineResult.document;
            if (document != null) {
                arrayList = document.attributes;
            } else {
                TLRPC.WebDocument webDocument = botInlineResult.content;
                if (webDocument != null) {
                    arrayList = webDocument.attributes;
                } else {
                    TLRPC.WebDocument webDocument2 = botInlineResult.thumb;
                    if (webDocument2 != null) {
                        arrayList = webDocument2.attributes;
                    } else {
                        arrayList = null;
                    }
                }
            }
        } else if (F instanceof TLRPC.Document) {
            document = (TLRPC.Document) F;
            arrayList = document.attributes;
        } else {
            bv0Var.f27240c = true;
            return bv0Var;
        }
        bv0Var.f27239b = 100.0f;
        bv0Var.f27238a = 100.0f;
        bv0Var.f27240c = false;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i11 = closestPhotoSizeWithSize.f22417w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
            bv0Var.f27238a = i11;
            bv0Var.f27239b = i12;
        }
        if (arrayList != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    bv0Var.f27238a = documentAttribute.f22399w;
                    bv0Var.f27239b = documentAttribute.h;
                    break;
                }
            }
        }
        return bv0Var;
    }
}
