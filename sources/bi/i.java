package bi;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.qz;
import s4.z0;
public final class i extends qz {
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
    public gw0 D1(int i10) {
        switch (this.X) {
            case 0:
                gw0 gw0Var = (gw0) this.Y;
                gw0Var.f27003b = 100.0f;
                gw0Var.f27002a = 100.0f;
                return gw0Var;
            default:
                return super.D1(i10);
        }
    }

    @Override
    public void U(of.e eVar, z0 z0Var, View view, s0.d dVar) {
        e.a aVar;
        switch (this.X) {
            case 0:
                super.U(eVar, z0Var, view, dVar);
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.f46485a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                if (collectionItemInfo != null) {
                    aVar = new e.a(collectionItemInfo);
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    Object obj = aVar.f8396a;
                    if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
                        return;
                    }
                    return;
                }
                return;
            default:
                super.U(eVar, z0Var, view, dVar);
                return;
        }
    }

    @Override
    public int W0(z0 z0Var) {
        switch (this.X) {
            case 1:
                if (((e71) this.Y).f26036h3) {
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

    public i(e71 e71Var, int i10) {
        super(i10, false);
        this.Y = e71Var;
    }
}
