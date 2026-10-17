package ei;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.wz;
public final class u1 extends wz {
    public final dw0 X;
    public final v1 Y;

    public u1(v1 v1Var) {
        super(100, true);
        this.Y = v1Var;
        this.X = new Object();
        this.O = new ai.q1(this, 1);
    }

    @Override
    public final int A() {
        return B();
    }

    @Override
    public final dw0 D1(int i10) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i11;
        int i12;
        dw0 dw0Var = this.X;
        dw0Var.f25722c = false;
        Object F = this.Y.f9929c.F(i10);
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
            dw0Var.f25722c = true;
            return dw0Var;
        }
        dw0Var.f25721b = 100.0f;
        dw0Var.f25720a = 100.0f;
        dw0Var.f25722c = false;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i11 = closestPhotoSizeWithSize.f20297w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
            dw0Var.f25720a = i11;
            dw0Var.f25721b = i12;
        }
        if (arrayList != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    dw0Var.f25720a = documentAttribute.f20279w;
                    dw0Var.f25721b = documentAttribute.h;
                    break;
                }
            }
        }
        return dw0Var;
    }
}
