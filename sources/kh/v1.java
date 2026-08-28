package kh;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.zy;
public final class v1 extends zy {
    public final qu0 X;
    public final w1 Y;

    public v1(w1 w1Var) {
        super(100, true);
        this.Y = w1Var;
        this.X = new Object();
        this.O = new fh.c6(this, 2);
    }

    @Override
    public final int A() {
        return B();
    }

    @Override
    public final qu0 D1(int i9) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i10;
        int i11;
        qu0 qu0Var = this.X;
        qu0Var.f32028c = false;
        Object F = this.Y.f16229c.F(i9);
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
            qu0Var.f32028c = true;
            return qu0Var;
        }
        qu0Var.f32027b = 100.0f;
        qu0Var.f32026a = 100.0f;
        qu0Var.f32028c = false;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i10 = closestPhotoSizeWithSize.f22405w) != 0 && (i11 = closestPhotoSizeWithSize.h) != 0) {
            qu0Var.f32026a = i10;
            qu0Var.f32027b = i11;
        }
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i12);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    qu0Var.f32026a = documentAttribute.f22387w;
                    qu0Var.f32027b = documentAttribute.h;
                    break;
                }
            }
        }
        return qu0Var;
    }
}
