package di;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.zz;
public final class x1 extends zz {
    public final iw0 X;
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
    public final iw0 D1(int i10) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i11;
        int i12;
        iw0 iw0Var = this.X;
        iw0Var.f25811c = false;
        Object F = this.Y.f8122c.F(i10);
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
            iw0Var.f25811c = true;
            return iw0Var;
        }
        iw0Var.f25810b = 100.0f;
        iw0Var.f25809a = 100.0f;
        iw0Var.f25811c = false;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i11 = closestPhotoSizeWithSize.f18941w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
            iw0Var.f25809a = i11;
            iw0Var.f25810b = i12;
        }
        if (arrayList != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    iw0Var.f25809a = documentAttribute.f18923w;
                    iw0Var.f25810b = documentAttribute.h;
                    break;
                }
            }
        }
        return iw0Var;
    }
}
