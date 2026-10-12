package ci;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g00;
import org.telegram.ui.Components.sw0;
public final class x1 extends g00 {
    public final sw0 X;
    public final y1 Y;

    public x1(y1 y1Var) {
        super(100, true);
        this.Y = y1Var;
        this.X = new Object();
        this.O = new w1(this, 0);
    }

    @Override
    public final int A() {
        return B();
    }

    @Override
    public final sw0 D1(int i10) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i11;
        int i12;
        sw0 sw0Var = this.X;
        sw0Var.f30698c = false;
        Object F = this.Y.f6340c.F(i10);
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
            sw0Var.f30698c = true;
            return sw0Var;
        }
        sw0Var.f30697b = 100.0f;
        sw0Var.f30696a = 100.0f;
        sw0Var.f30698c = false;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i11 = closestPhotoSizeWithSize.f19827w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
            sw0Var.f30696a = i11;
            sw0Var.f30697b = i12;
        }
        if (arrayList != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    sw0Var.f30696a = documentAttribute.f19809w;
                    sw0Var.f30697b = documentAttribute.h;
                    break;
                }
            }
        }
        return sw0Var;
    }
}
