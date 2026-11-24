package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class o5c extends w64 {
    public final byte X;
    public final Object Y;

    public o5c() {
        super(100, false);
        this.X = (byte) 2;
        this.Y = new Object();
    }

    @Override
    public final via B1(int i) {
        switch (this.X) {
            case 2:
                via viaVar = (via) this.Y;
                viaVar.b = 100.0f;
                viaVar.a = 100.0f;
                return viaVar;
            default:
                return super.B1(i);
        }
    }

    @Override
    public final void S(wg2 wg2Var, p49 p49Var, View view, u4 u4Var) {
        qx4 qx4Var;
        switch (this.X) {
            case 2:
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
                        return;
                    }
                    return;
                }
                return;
            default:
                super.S(wg2Var, p49Var, view, u4Var);
                return;
        }
    }

    @Override
    public final int V0(p49 p49Var) {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                if (((q5c) obj).i3) {
                    return gl.q.y;
                }
                return super.V0(p49Var);
            case 1:
                if (((q5c) obj).i3) {
                    return gl.q.y;
                }
                return super.V0(p49Var);
            default:
                return super.V0(p49Var);
        }
    }

    @Override
    public final void y0(p49 p49Var, int[] iArr) {
        switch (this.X) {
            case 2:
                super.y0(p49Var, iArr);
                iArr[1] = Math.max(iArr[1], rfa.a(1) << 1);
                return;
            default:
                super.y0(p49Var, iArr);
                return;
        }
    }

    @Override
    public final int z() {
        switch (this.X) {
            case 2:
                return 0;
            default:
                return super.z();
        }
    }

    public o5c(q5c q5cVar, int i, byte b) {
        super(i, false);
        this.X = b;
        this.Y = q5cVar;
    }
}
