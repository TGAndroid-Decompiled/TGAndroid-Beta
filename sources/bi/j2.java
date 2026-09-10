package bi;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.uz;
public final class j2 extends uz {
    public final tv0 X;
    public final k2 Y;

    public j2(k2 k2Var) {
        super(100, true);
        this.Y = k2Var;
        this.X = new Object();
        this.O = new i2(this, 0);
    }

    @Override
    public final int A() {
        return B();
    }

    @Override
    public final tv0 D1(int i10) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i11;
        int i12;
        tv0 tv0Var = this.X;
        tv0Var.f27501c = false;
        Object F = this.Y.f2981c.F(i10);
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
            tv0Var.f27501c = true;
            return tv0Var;
        }
        tv0Var.f27500b = 100.0f;
        tv0Var.f27499a = 100.0f;
        tv0Var.f27501c = false;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i11 = closestPhotoSizeWithSize.f17220w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
            tv0Var.f27499a = i11;
            tv0Var.f27500b = i12;
        }
        if (arrayList != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    tv0Var.f27499a = documentAttribute.f17202w;
                    tv0Var.f27500b = documentAttribute.h;
                    break;
                }
            }
        }
        return tv0Var;
    }
}
