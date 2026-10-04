package ci;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.qz;
public final class y1 extends qz {
    public final fw0 X;
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
    public final fw0 D1(int i10) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i11;
        int i12;
        fw0 fw0Var = this.X;
        fw0Var.f26592c = false;
        Object F = this.Y.f6362c.F(i10);
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
            fw0Var.f26592c = true;
            return fw0Var;
        }
        fw0Var.f26591b = 100.0f;
        fw0Var.f26590a = 100.0f;
        fw0Var.f26592c = false;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i11 = closestPhotoSizeWithSize.f20067w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
            fw0Var.f26590a = i11;
            fw0Var.f26591b = i12;
        }
        if (arrayList != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    fw0Var.f26590a = documentAttribute.f20049w;
                    fw0Var.f26591b = documentAttribute.h;
                    break;
                }
            }
        }
        return fw0Var;
    }
}
