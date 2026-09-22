package ci;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.wv0;
public final class y1 extends nz {
    public final wv0 X;
    public final z1 Y;

    public y1(z1 z1Var) {
        super(100, true);
        this.Y = z1Var;
        this.X = new Object();
        this.O = new x1(this, 0);
    }

    @Override
    public final int A() {
        return B();
    }

    @Override
    public final wv0 D1(int i10) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i11;
        int i12;
        wv0 wv0Var = this.X;
        wv0Var.f30163c = false;
        Object F = this.Y.f5856c.F(i10);
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
            wv0Var.f30163c = true;
            return wv0Var;
        }
        wv0Var.f30162b = 100.0f;
        wv0Var.f30161a = 100.0f;
        wv0Var.f30163c = false;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i11 = closestPhotoSizeWithSize.f18368w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
            wv0Var.f30161a = i11;
            wv0Var.f30162b = i12;
        }
        if (arrayList != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    wv0Var.f30161a = documentAttribute.f18350w;
                    wv0Var.f30162b = documentAttribute.h;
                    break;
                }
            }
        }
        return wv0Var;
    }
}
