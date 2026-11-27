package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hga extends q74 {
    public final qma X;
    public final gga Y;
    public final eja Z;

    public hga(eja ejaVar, gga ggaVar) {
        super(100, false);
        this.Z = ejaVar;
        this.Y = ggaVar;
        this.X = new Object();
    }

    @Override
    public final qma B1(int i) {
        TLRPC.Document document;
        int i2;
        int i3;
        j79 adapter = this.Y.h.getAdapter();
        eja ejaVar = this.Z;
        tia[] tiaVarArr = ejaVar.w1;
        if (adapter == ejaVar.R && !tiaVarArr[5].a.isEmpty()) {
            document = ((r47) tiaVarArr[5].a.get(i)).F0();
        } else {
            document = null;
        }
        qma qmaVar = this.X;
        qmaVar.b = 100.0f;
        qmaVar.a = 100.0f;
        if (document != null) {
            TLRPC.PhotoSize w = xb4.w(document.thumbs, 90, false, null, false);
            if (w != null && (i2 = w.w) != 0 && (i3 = w.h) != 0) {
                qmaVar.a = i2;
                qmaVar.b = i3;
            }
            ArrayList<TLRPC.DocumentAttribute> arrayList = document.attributes;
            for (int i4 = 0; i4 < arrayList.size(); i4++) {
                TLRPC.DocumentAttribute documentAttribute = arrayList.get(i4);
                if ((documentAttribute instanceof TLRPC.TL_documentAttributeImageSize) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                    qmaVar.a = documentAttribute.w;
                    qmaVar.b = documentAttribute.h;
                    break;
                }
            }
        }
        return qmaVar;
    }

    @Override
    public final void S(oh2 oh2Var, c89 c89Var, View view, v4 v4Var) {
        wz4 wz4Var;
        super.S(oh2Var, c89Var, view, v4Var);
        AccessibilityNodeInfo accessibilityNodeInfo = v4Var.a;
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
        if (collectionItemInfo != null) {
            wz4Var = new wz4(collectionItemInfo);
        } else {
            wz4Var = null;
        }
        if (wz4Var != null) {
            AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo2 = (AccessibilityNodeInfo.CollectionItemInfo) wz4Var.a;
            if (collectionItemInfo2.isHeading()) {
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo2.getRowIndex(), collectionItemInfo2.getRowSpan(), collectionItemInfo2.getColumnIndex(), collectionItemInfo2.getColumnSpan(), false));
            }
        }
    }

    @Override
    public final void y0(c89 c89Var, int[] iArr) {
        super.y0(c89Var, iArr);
        gga ggaVar = this.Y;
        int i = ggaVar.F;
        if (i != 0 && !eja.j0(i)) {
            if (ggaVar.F == 1) {
                iArr[1] = Math.max(iArr[1], hl.L(56.0f) << 1);
                return;
            }
            return;
        }
        iArr[1] = Math.max(iArr[1], kja.a(1) << 1);
    }

    @Override
    public final int z() {
        if (this.Y.h.getAdapter() != this.Z.R) {
            return 0;
        }
        return A();
    }
}
