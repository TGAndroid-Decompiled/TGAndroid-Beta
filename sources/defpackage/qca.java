package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class qca extends w64 {
    public final via X;
    public final pca Y;
    public final nfa Z;

    public qca(nfa nfaVar, pca pcaVar) {
        super(100, false);
        this.Z = nfaVar;
        this.Y = pcaVar;
        this.X = new Object();
    }

    @Override
    public final via B1(int i) {
        TLRPC.Document document;
        int i2;
        int i3;
        w39 adapter = this.Y.h.getAdapter();
        nfa nfaVar = this.Z;
        cfa[] cfaVarArr = nfaVar.w1;
        if (adapter == nfaVar.R && !cfaVarArr[5].a.isEmpty()) {
            document = ((k27) cfaVarArr[5].a.get(i)).F0();
        } else {
            document = null;
        }
        via viaVar = this.X;
        viaVar.b = 100.0f;
        viaVar.a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize w = ba4.w(document.thumbs, 90, false, null, false);
            if (w != null && (i2 = w.w) != 0 && (i3 = w.h) != 0) {
                viaVar.a = i2;
                viaVar.b = i3;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i4);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    viaVar.a = documentAttribute.w;
                    viaVar.b = documentAttribute.h;
                    break;
                }
            }
        }
        return viaVar;
    }

    @Override
    public final void S(wg2 wg2Var, p49 p49Var, View view, u4 u4Var) {
        qx4 qx4Var;
        super.S(wg2Var, p49Var, view, u4Var);
        AccessibilityNodeInfo accessibilityNodeInfo = u4Var.a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            qx4Var = new qx4(collectionItemInfo);
        } else {
            qx4Var = null;
        }
        if (qx4Var != null) {
            AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo2 = (AccessibilityNodeInfo.CollectionItemInfo) qx4Var.a;
            if (collectionItemInfo2.isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo2.getRowIndex(), collectionItemInfo2.getRowSpan(), collectionItemInfo2.getColumnIndex(), collectionItemInfo2.getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void y0(p49 p49Var, int[] iArr) {
        super.y0(p49Var, iArr);
        pca pcaVar = this.Y;
        int i = pcaVar.F;
        if (i != 0 && !nfa.j0(i)) {
            if (pcaVar.F == 1) {
                iArr[1] = Math.max(iArr[1], gl.L(56.0f) << 1);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], rfa.a(1) << 1);
    }

    @Override
    public final int z() {
        if (this.Y.h.getAdapter() != this.Z.R) {
            return 0;
        }
        return A();
    }
}
