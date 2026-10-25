package ei;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.x7;
import org.telegram.ui.Components.qw0;
import org.telegram.ui.Components.r71;
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
    public qw0 E1(int i10) {
        switch (this.X) {
            case 0:
                qw0 qw0Var = (qw0) this.Y;
                qw0Var.f32053b = 100.0f;
                qw0Var.f32052a = 100.0f;
                return qw0Var;
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
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.f47650a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                if (collectionItemInfo != null) {
                    cVar = new ke.c(collectionItemInfo);
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    Object obj = cVar.f16537a;
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
                if (((r71) this.Y).f32152i3) {
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

    public h(r71 r71Var, int i10) {
        super(i10, false);
        this.Y = r71Var;
    }
}
