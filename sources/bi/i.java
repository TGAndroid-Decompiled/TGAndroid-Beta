package bi;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.v7;
import org.telegram.ui.Components.nz;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wv0;
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
    public wv0 D1(int i10) {
        switch (this.X) {
            case 0:
                wv0 wv0Var = (wv0) this.Y;
                wv0Var.f30162b = 100.0f;
                wv0Var.f30161a = 100.0f;
                return wv0Var;
            default:
                return super.D1(i10);
        }
    }

    @Override
    public void U(of.e eVar, z0 z0Var, View view, s0.d dVar) {
        he.b bVar;
        switch (this.X) {
            case 0:
                super.U(eVar, z0Var, view, dVar);
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.f42944a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                if (collectionItemInfo != null) {
                    bVar = new he.b(collectionItemInfo);
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    Object obj = bVar.f10207a;
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
                if (((u61) this.Y).f28682a3) {
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
                iArr[1] = Math.max(iArr[1], v7.a(1) * 2);
                return;
            default:
                super.z0(z0Var, iArr);
                return;
        }
    }

    public i(u61 u61Var, int i10) {
        super(i10, false);
        this.Y = u61Var;
    }
}
