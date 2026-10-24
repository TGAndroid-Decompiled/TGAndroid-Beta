package ei;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.uz;
public final class u1 extends uz {
    public final hw0 X;
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
    public final hw0 D1(int i10) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i11;
        int i12;
        hw0 hw0Var = this.X;
        hw0Var.f27190c = false;
        Object F = this.Y.f9945c.F(i10);
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
            hw0Var.f27190c = true;
            return hw0Var;
        }
        hw0Var.f27189b = 100.0f;
        hw0Var.f27188a = 100.0f;
        hw0Var.f27190c = false;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i11 = closestPhotoSizeWithSize.f20369w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
            hw0Var.f27188a = i11;
            hw0Var.f27189b = i12;
        }
        if (arrayList != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    hw0Var.f27188a = documentAttribute.f20351w;
                    hw0Var.f27189b = documentAttribute.h;
                    break;
                }
            }
        }
        return hw0Var;
    }
}
