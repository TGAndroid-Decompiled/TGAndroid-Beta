package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
public final class o7c extends f84 {
    public final byte X;
    public final Object Y;

    public o7c() {
        super(100, false);
        this.X = (byte) 2;
        this.Y = new Object();
    }

    @Override
    public final xka B1(int i) {
        switch (this.X) {
            case 2:
                xka xkaVar = (xka) this.Y;
                xkaVar.b = 100.0f;
                xkaVar.a = 100.0f;
                return xkaVar;
            default:
                return super.B1(i);
        }
    }

    @Override
    public final void S(ki2 ki2Var, r69 r69Var, View view, u4 u4Var) {
        sz4 sz4Var;
        switch (this.X) {
            case 2:
                super.S(ki2Var, r69Var, view, u4Var);
                AccessibilityNodeInfo accessibilityNodeInfo = u4Var.a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                if (collectionItemInfo != null) {
                    sz4Var = new sz4(collectionItemInfo);
                } else {
                    sz4Var = null;
                }
                if (sz4Var != null) {
                    AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo2 = (AccessibilityNodeInfo.CollectionItemInfo) sz4Var.a;
                    if (collectionItemInfo2.isHeading()) {
                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(collectionItemInfo2.getRowIndex(), collectionItemInfo2.getRowSpan(), collectionItemInfo2.getColumnIndex(), collectionItemInfo2.getColumnSpan(), false));
                        return;
                    }
                    return;
                }
                return;
            default:
                super.S(ki2Var, r69Var, view, u4Var);
                return;
        }
    }

    @Override
    public final int V0(r69 r69Var) {
        byte b = this.X;
        Object obj = this.Y;
        switch (b) {
            case 0:
                if (((q7c) obj).i3) {
                    return gm.q.y;
                }
                return super.V0(r69Var);
            case 1:
                if (((q7c) obj).i3) {
                    return gm.q.y;
                }
                return super.V0(r69Var);
            default:
                return super.V0(r69Var);
        }
    }

    @Override
    public final void y0(r69 r69Var, int[] iArr) {
        switch (this.X) {
            case 2:
                super.y0(r69Var, iArr);
                iArr[1] = Math.max(iArr[1], tha.a(1) << 1);
                return;
            default:
                super.y0(r69Var, iArr);
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

    public o7c(q7c q7cVar, int i, byte b) {
        super(i, false);
        this.X = b;
        this.Y = q7cVar;
    }
}
