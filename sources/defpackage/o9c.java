package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class o9c extends q74 {
    public final byte X;
    public final Object Y;

    public o9c() {
        super(100, false);
        this.X = (byte) 2;
        this.Y = new Object();
    }

    @Override
    public final qma B1(int i) {
        switch (this.X) {
            case 2:
                qma qmaVar = (qma) this.Y;
                qmaVar.b = 100.0f;
                qmaVar.a = 100.0f;
                return qmaVar;
            default:
                return super.B1(i);
        }
    }

    @Override
    public final void S(oh2 oh2Var, c89 c89Var, View view, v4 v4Var) {
        wz4 wz4Var;
        switch (this.X) {
            case 2:
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
                        return;
                    }
                    return;
                }
                return;
            default:
                super.S(oh2Var, c89Var, view, v4Var);
                return;
        }
    }

    @Override
    public final int V0(c89 c89Var) {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                if (((q9c) obj).i3) {
                    return hl.q.y;
                }
                return super.V0(c89Var);
            case 1:
                if (((q9c) obj).i3) {
                    return hl.q.y;
                }
                return super.V0(c89Var);
            default:
                return super.V0(c89Var);
        }
    }

    @Override
    public final void y0(c89 c89Var, int[] iArr) {
        switch (this.X) {
            case 2:
                super.y0(c89Var, iArr);
                iArr[1] = Math.max(iArr[1], kja.a(1) << 1);
                return;
            default:
                super.y0(c89Var, iArr);
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

    public o9c(q9c q9cVar, int i, byte b) {
        super(i, false);
        this.X = b;
        this.Y = q9cVar;
    }
}
