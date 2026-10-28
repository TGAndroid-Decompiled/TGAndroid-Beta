package ei;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.x7;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.vz;
import s4.b1;
public final class h extends vz {
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
    public rw0 E1(int i10) {
        switch (this.X) {
            case 0:
                rw0 rw0Var = (rw0) this.Y;
                rw0Var.f32393b = 100.0f;
                rw0Var.f32392a = 100.0f;
                return rw0Var;
            default:
                return super.E1(i10);
        }
    }

    @Override
    public void U(rf.e eVar, b1 b1Var, View view, s0.d dVar) {
        ke.c cVar;
        switch (this.X) {
            case 0:
                super.U(eVar, b1Var, view, dVar);
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.f47688a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                if (collectionItemInfo != null) {
                    cVar = new ke.c(collectionItemInfo);
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    Object obj = cVar.f16536a;
                    if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
                        return;
                    }
                    return;
                }
                return;
            default:
                super.U(eVar, b1Var, view, dVar);
                return;
        }
    }

    @Override
    public int W0(b1 b1Var) {
        switch (this.X) {
            case 1:
                if (((s71) this.Y).f32506i3) {
                    return AndroidUtilities.displaySize.y;
                }
                return super.W0(b1Var);
            default:
                return super.W0(b1Var);
        }
    }

    @Override
    public void z0(b1 b1Var, int[] iArr) {
        switch (this.X) {
            case 0:
                super.z0(b1Var, iArr);
                iArr[1] = Math.max(iArr[1], x7.a(1) * 2);
                return;
            default:
                super.z0(b1Var, iArr);
                return;
        }
    }

    public h(s71 s71Var, int i10) {
        super(i10, false);
        this.Y = s71Var;
    }
}
