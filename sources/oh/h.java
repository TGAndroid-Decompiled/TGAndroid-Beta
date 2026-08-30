package oh;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import f2.i1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.nz;
public final class h extends nz {
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
    public jv0 D1(int i10) {
        switch (this.X) {
            case 0:
                jv0 jv0Var = (jv0) this.Y;
                jv0Var.f26053b = 100.0f;
                jv0Var.f26052a = 100.0f;
                return jv0Var;
            default:
                return super.D1(i10);
        }
    }

    @Override
    public void U(bf.f fVar, i1 i1Var, View view, s0.e eVar) {
        s0.d dVar;
        switch (this.X) {
            case 0:
                super.U(fVar, i1Var, view, eVar);
                AccessibilityNodeInfo accessibilityNodeInfo = eVar.f43904a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                if (collectionItemInfo != null) {
                    dVar = new s0.d(collectionItemInfo);
                } else {
                    dVar = null;
                }
                if (dVar != null) {
                    Object obj = dVar.f43902a;
                    if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
                        return;
                    }
                    return;
                }
                return;
            default:
                super.U(fVar, i1Var, view, eVar);
                return;
        }
    }

    @Override
    public int W0(i1 i1Var) {
        switch (this.X) {
            case 1:
                if (((g61) this.Y).X2) {
                    return AndroidUtilities.displaySize.y;
                }
                return super.W0(i1Var);
            default:
                return super.W0(i1Var);
        }
    }

    @Override
    public void z0(i1 i1Var, int[] iArr) {
        switch (this.X) {
            case 0:
                super.z0(i1Var, iArr);
                iArr[1] = Math.max(iArr[1], s7.a(1) * 2);
                return;
            default:
                super.z0(i1Var, iArr);
                return;
        }
    }

    public h(g61 g61Var, int i10) {
        super(i10, false);
        this.Y = g61Var;
    }
}
