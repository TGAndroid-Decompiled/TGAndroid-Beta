package fi;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.vz;
public final class t1 extends vz {
    public final rw0 X;
    public final u1 Y;

    public t1(u1 u1Var) {
        super(100, true);
        this.Y = u1Var;
        this.X = new Object();
        this.O = new ai.l(this, 2);
    }

    @Override
    public final int A() {
        return B();
    }

    @Override
    public final rw0 E1(int i10) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i11;
        int i12;
        rw0 rw0Var = this.X;
        rw0Var.f32394c = false;
        Object F = this.Y.f11742c.F(i10);
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
            rw0Var.f32394c = true;
            return rw0Var;
        }
        rw0Var.f32393b = 100.0f;
        rw0Var.f32392a = 100.0f;
        rw0Var.f32394c = false;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i11 = closestPhotoSizeWithSize.f22053w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
            rw0Var.f32392a = i11;
            rw0Var.f32393b = i12;
        }
        if (arrayList != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    rw0Var.f32392a = documentAttribute.f22035w;
                    rw0Var.f32393b = documentAttribute.h;
                    break;
                }
            }
        }
        return rw0Var;
    }
}
