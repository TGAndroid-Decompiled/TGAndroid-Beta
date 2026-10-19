package ei;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.wz;
public final class u1 extends wz {
    public final ew0 X;
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
    public final ew0 D1(int i10) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i11;
        int i12;
        ew0 ew0Var = this.X;
        ew0Var.f26040c = false;
        Object F = this.Y.f9928c.F(i10);
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
            ew0Var.f26040c = true;
            return ew0Var;
        }
        ew0Var.f26039b = 100.0f;
        ew0Var.f26038a = 100.0f;
        ew0Var.f26040c = false;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i11 = closestPhotoSizeWithSize.f20298w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
            ew0Var.f26038a = i11;
            ew0Var.f26039b = i12;
        }
        if (arrayList != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    ew0Var.f26038a = documentAttribute.f20280w;
                    ew0Var.f26039b = documentAttribute.h;
                    break;
                }
            }
        }
        return ew0Var;
    }
}
