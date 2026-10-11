package ci;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.ow0;
public final class x1 extends e00 {
    public final ow0 X;
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
    public final ow0 D1(int i10) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i11;
        int i12;
        ow0 ow0Var = this.X;
        ow0Var.f29543c = false;
        Object F = this.Y.f6341c.F(i10);
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
            ow0Var.f29543c = true;
            return ow0Var;
        }
        ow0Var.f29542b = 100.0f;
        ow0Var.f29541a = 100.0f;
        ow0Var.f29543c = false;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i11 = closestPhotoSizeWithSize.f20057w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
            ow0Var.f29541a = i11;
            ow0Var.f29542b = i12;
        }
        if (arrayList != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    ow0Var.f29541a = documentAttribute.f20039w;
                    ow0Var.f29542b = documentAttribute.h;
                    break;
                }
            }
        }
        return ow0Var;
    }
}
