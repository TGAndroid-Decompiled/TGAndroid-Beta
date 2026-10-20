package ei;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.fw0;
import org.telegram.ui.Components.wz;
public final class u1 extends wz {
    public final fw0 X;
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
    public final fw0 D1(int i10) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i11;
        int i12;
        fw0 fw0Var = this.X;
        fw0Var.f26430c = false;
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
            fw0Var.f26430c = true;
            return fw0Var;
        }
        fw0Var.f26429b = 100.0f;
        fw0Var.f26428a = 100.0f;
        fw0Var.f26430c = false;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i11 = closestPhotoSizeWithSize.f20301w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
            fw0Var.f26428a = i11;
            fw0Var.f26429b = i12;
        }
        if (arrayList != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    fw0Var.f26428a = documentAttribute.f20283w;
                    fw0Var.f26429b = documentAttribute.h;
                    break;
                }
            }
        }
        return fw0Var;
    }
}
