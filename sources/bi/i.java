package bi;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.nz;
import s4.z0;
public final class i extends nz {
    public final int X = 0;
    public final Object Y;

    public i() {
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
    public jv0 D1(int i10) {
        switch (this.X) {
            case 0:
                jv0 jv0Var = (jv0) this.Y;
                jv0Var.f25444b = 100.0f;
                jv0Var.f25443a = 100.0f;
                return jv0Var;
            default:
                return super.D1(i10);
        }
    }

    @Override
    public void U(of.e eVar, z0 z0Var, View view, s0.c cVar) {
        n7.b bVar;
        switch (this.X) {
            case 0:
                super.U(eVar, z0Var, view, cVar);
                AccessibilityNodeInfo accessibilityNodeInfo = cVar.f42624a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                if (collectionItemInfo != null) {
                    bVar = new n7.b(collectionItemInfo);
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    Object obj = bVar.f15110a;
                    if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
                        return;
                    }
                    return;
                }
                return;
            default:
                super.U(eVar, z0Var, view, cVar);
                return;
        }
    }

    @Override
    public int W0(z0 z0Var) {
        switch (this.X) {
            case 1:
                if (((e61) this.Y).f23558a3) {
                    return AndroidUtilities.displaySize.y;
                }
                return super.W0(z0Var);
            default:
                return super.W0(z0Var);
        }
    }

    @Override
    public void z0(z0 z0Var, int[] iArr) {
        switch (this.X) {
            case 0:
                super.z0(z0Var, iArr);
                iArr[1] = Math.max(iArr[1], u7.a(1) * 2);
                return;
            default:
                super.z0(z0Var, iArr);
                return;
        }
    }

    public i(e61 e61Var, int i10) {
        super(i10, false);
        this.Y = e61Var;
    }
}
