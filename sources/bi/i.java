package bi;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Components.d00;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.mw0;
import s4.a1;
public final class i extends d00 {
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
    public mw0 D1(int i10) {
        switch (this.X) {
            case 0:
                mw0 mw0Var = (mw0) this.Y;
                mw0Var.f28964b = 100.0f;
                mw0Var.f28963a = 100.0f;
                return mw0Var;
            default:
                return super.D1(i10);
        }
    }

    @Override
    public void U(pf.e eVar, a1 a1Var, View view, s0.d dVar) {
        e.a aVar;
        switch (this.X) {
            case 0:
                super.U(eVar, a1Var, view, dVar);
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.f47585a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                if (collectionItemInfo != null) {
                    aVar = new e.a(collectionItemInfo);
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    Object obj = aVar.f8390a;
                    if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
                        return;
                    }
                    return;
                }
                return;
            default:
                super.U(eVar, a1Var, view, dVar);
                return;
        }
    }

    @Override
    public int W0(a1 a1Var) {
        switch (this.X) {
            case 1:
                if (((k71) this.Y).Y2) {
                    return AndroidUtilities.displaySize.y;
                }
                return super.W0(a1Var);
            default:
                return super.W0(a1Var);
        }
    }

    @Override
    public void z0(a1 a1Var, int[] iArr) {
        switch (this.X) {
            case 0:
                super.z0(a1Var, iArr);
                iArr[1] = Math.max(iArr[1], u7.a(1) * 2);
                return;
            default:
                super.z0(a1Var, iArr);
                return;
        }
    }

    public i(k71 k71Var, int i10) {
        super(i10, false);
        this.Y = k71Var;
    }
}
