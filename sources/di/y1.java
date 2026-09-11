package di;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.nz;
public final class y1 extends nz {
    public final iv0 X;
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
    public final iv0 D1(int i10) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i11;
        int i12;
        iv0 iv0Var = this.X;
        iv0Var.f27273c = false;
        Object F = this.Y.f8507c.F(i10);
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
            iv0Var.f27273c = true;
            return iv0Var;
        }
        iv0Var.f27272b = 100.0f;
        iv0Var.f27271a = 100.0f;
        iv0Var.f27273c = false;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i11 = closestPhotoSizeWithSize.f19894w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
            iv0Var.f27271a = i11;
            iv0Var.f27272b = i12;
        }
        if (arrayList != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    iv0Var.f27271a = documentAttribute.f19876w;
                    iv0Var.f27272b = documentAttribute.h;
                    break;
                }
            }
        }
        return iv0Var;
    }
}
