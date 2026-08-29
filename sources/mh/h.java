package mh;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import f2.d1;
import f2.k1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.q7;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.u51;
public final class h extends iz {
    public final int X = 0;
    public final Object Y;

    public h() {
        super(100, false);
        this.Y = new Object();
    }

    @Override
    public int A() {
        switch (this.X) {
            case 0:
                return 0;
            default:
                return super.A();
        }
    }

    @Override
    public bv0 D1(int i10) {
        switch (this.X) {
            case 0:
                bv0 bv0Var = (bv0) this.Y;
                bv0Var.f27239b = 100.0f;
                bv0Var.f27238a = 100.0f;
                return bv0Var;
            default:
                return super.D1(i10);
        }
    }

    @Override
    public void U(d1 d1Var, k1 k1Var, View view, s0.c cVar) {
        m8.o oVar;
        switch (this.X) {
            case 0:
                super.U(d1Var, k1Var, view, cVar);
                AccessibilityNodeInfo accessibilityNodeInfo = cVar.f47482a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                if (collectionItemInfo != null) {
                    oVar = new m8.o(collectionItemInfo);
                } else {
                    oVar = null;
                }
                if (oVar != null) {
                    Object obj = oVar.f16924a;
                    if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
                        return;
                    }
                    return;
                }
                return;
            default:
                super.U(d1Var, k1Var, view, cVar);
                return;
        }
    }

    @Override
    public int W0(k1 k1Var) {
        switch (this.X) {
            case 1:
                if (((u51) this.Y).W2) {
                    return AndroidUtilities.displaySize.y;
                }
                return super.W0(k1Var);
            default:
                return super.W0(k1Var);
        }
    }

    @Override
    public void z0(k1 k1Var, int[] iArr) {
        switch (this.X) {
            case 0:
                super.z0(k1Var, iArr);
                iArr[1] = Math.max(iArr[1], q7.a(1) * 2);
                return;
            default:
                super.z0(k1Var, iArr);
                return;
        }
    }

    public h(u51 u51Var, int i10) {
        super(i10, false);
        this.Y = u51Var;
    }
}
