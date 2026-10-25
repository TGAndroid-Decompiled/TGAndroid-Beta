package fi;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.vz;
public final class t1 extends vz {
    public final qw0 X;
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
    public final qw0 E1(int i10) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i11;
        int i12;
        qw0 qw0Var = this.X;
        qw0Var.f32054c = false;
        Object F = this.Y.f11743c.F(i10);
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
            qw0Var.f32054c = true;
            return qw0Var;
        }
        qw0Var.f32053b = 100.0f;
        qw0Var.f32052a = 100.0f;
        qw0Var.f32054c = false;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i11 = closestPhotoSizeWithSize.f22052w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
            qw0Var.f32052a = i11;
            qw0Var.f32053b = i12;
        }
        if (arrayList != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    qw0Var.f32052a = documentAttribute.f22034w;
                    qw0Var.f32053b = documentAttribute.h;
                    break;
                }
            }
        }
        return qw0Var;
    }
}
