package jh;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import f2.g1;
import f2.n1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.Components.zy;
public final class h extends zy {
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
    public qu0 D1(int i9) {
        switch (this.X) {
            case 0:
                qu0 qu0Var = (qu0) this.Y;
                qu0Var.f32027b = 100.0f;
                qu0Var.f32026a = 100.0f;
                return qu0Var;
            default:
                return super.D1(i9);
        }
    }

    @Override
    public void U(g1 g1Var, n1 n1Var, View view, s0.d dVar) {
        k8.o oVar;
        switch (this.X) {
            case 0:
                super.U(g1Var, n1Var, view, dVar);
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.f47292a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                if (collectionItemInfo != null) {
                    oVar = new k8.o(collectionItemInfo);
                } else {
                    oVar = null;
                }
                if (oVar != null) {
                    Object obj = oVar.f14703a;
                    if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
                        return;
                    }
                    return;
                }
                return;
            default:
                super.U(g1Var, n1Var, view, dVar);
                return;
        }
    }

    @Override
    public int W0(n1 n1Var) {
        switch (this.X) {
            case 1:
                if (((i51) this.Y).W2) {
                    return AndroidUtilities.displaySize.y;
                }
                return super.W0(n1Var);
            default:
                return super.W0(n1Var);
        }
    }

    @Override
    public void z0(n1 n1Var, int[] iArr) {
        switch (this.X) {
            case 0:
                super.z0(n1Var, iArr);
                iArr[1] = Math.max(iArr[1], s7.a(1) * 2);
                return;
            default:
                super.z0(n1Var, iArr);
                return;
        }
    }

    public h(i51 i51Var, int i9) {
        super(i9, false);
        this.Y = i51Var;
    }
}
