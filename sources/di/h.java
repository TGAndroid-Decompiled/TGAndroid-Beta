package di;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.uz;
import s4.y0;
public final class h extends uz {
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
    public hw0 D1(int i10) {
        switch (this.X) {
            case 0:
                hw0 hw0Var = (hw0) this.Y;
                hw0Var.f27189b = 100.0f;
                hw0Var.f27188a = 100.0f;
                return hw0Var;
            default:
                return super.D1(i10);
        }
    }

    @Override
    public void U(qf.e eVar, y0 y0Var, View view, s0.d dVar) {
        n5.c cVar;
        switch (this.X) {
            case 0:
                super.U(eVar, y0Var, view, dVar);
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.f46299a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                if (collectionItemInfo != null) {
                    cVar = new n5.c(collectionItemInfo);
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    Object obj = cVar.f17214a;
                    if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
                        return;
                    }
                    return;
                }
                return;
            default:
                super.U(eVar, y0Var, view, dVar);
                return;
        }
    }

    @Override
    public int W0(y0 y0Var) {
        switch (this.X) {
            case 1:
                if (((i71) this.Y).f27320b3) {
                    return AndroidUtilities.displaySize.y;
                }
                return super.W0(y0Var);
            default:
                return super.W0(y0Var);
        }
    }

    @Override
    public void z0(y0 y0Var, int[] iArr) {
        switch (this.X) {
            case 0:
                super.z0(y0Var, iArr);
                iArr[1] = Math.max(iArr[1], t7.a(1) * 2);
                return;
            default:
                super.z0(y0Var, iArr);
                return;
        }
    }

    public h(i71 i71Var, int i10) {
        super(i10, false);
        this.Y = i71Var;
    }
}
