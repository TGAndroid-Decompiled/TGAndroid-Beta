package ci;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.mw0;
public final class x1 extends d00 {
    public final mw0 X;
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
    public final mw0 D1(int i10) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i11;
        int i12;
        mw0 mw0Var = this.X;
        mw0Var.f28965c = false;
        Object F = this.Y.f6342c.F(i10);
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
            mw0Var.f28965c = true;
            return mw0Var;
        }
        mw0Var.f28964b = 100.0f;
        mw0Var.f28963a = 100.0f;
        mw0Var.f28965c = false;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i11 = closestPhotoSizeWithSize.f20063w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
            mw0Var.f28963a = i11;
            mw0Var.f28964b = i12;
        }
        if (arrayList != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    mw0Var.f28963a = documentAttribute.f20045w;
                    mw0Var.f28964b = documentAttribute.h;
                    break;
                }
            }
        }
        return mw0Var;
    }
}
