package lh;

import java.util.ArrayList;
import org.telegram.messenger.FileLoader;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.tu0;

public final class t1 extends bz {
    public final tu0 X;
    public final u1 Y;

    public t1(u1 u1Var) {
        super(100, true);
        this.Y = u1Var;
        this.X = new tu0();
        this.O = new gh.u5(this, 2);
    }

    @Override
    public final int A() {
        return B();
    }

    @Override
    public final tu0 D1(int i10) {
        TLRPC.Document document;
        ArrayList<TLRPC.DocumentAttribute> arrayList;
        TLRPC.PhotoSize closestPhotoSizeWithSize;
        int i11;
        int i12;
        tu0 tu0Var = this.X;
        tu0Var.f32895c = false;
        Object objF = this.Y.f16897c.F(i10);
        if (objF instanceof TLRPC.BotInlineResult) {
            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) objF;
            document = botInlineResult.document;
            if (document != null) {
                arrayList = document.attributes;
            } else {
                TLRPC.WebDocument webDocument = botInlineResult.content;
                if (webDocument != null) {
                    arrayList = webDocument.attributes;
                } else {
                    TLRPC.WebDocument webDocument2 = botInlineResult.thumb;
                    arrayList = webDocument2 != null ? webDocument2.attributes : null;
                }
            }
        } else {
            if (!(objF instanceof TLRPC.Document)) {
                tu0Var.f32895c = true;
                return tu0Var;
            }
            document = (TLRPC.Document) objF;
            arrayList = document.attributes;
        }
        tu0Var.f32894b = 100.0f;
        tu0Var.f32893a = 100.0f;
        tu0Var.f32895c = false;
        if (document != null && (closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90)) != null && (i11 = closestPhotoSizeWithSize.f22405w) != 0 && (i12 = closestPhotoSizeWithSize.h) != 0) {
            tu0Var.f32893a = i11;
            tu0Var.f32894b = i12;
        }
        if (arrayList != null) {
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i13);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    tu0Var.f32893a = documentAttribute.f22387w;
                    tu0Var.f32894b = documentAttribute.h;
                    break;
                }
            }
        }
        return tu0Var;
    }
}
