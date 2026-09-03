package oh;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import f2.i1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.r7;
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
                jv0Var.f26063b = 100.0f;
                jv0Var.f26062a = 100.0f;
                return jv0Var;
            default:
                return super.D1(i10);
        }
    }

    @Override
    public void T(af.h hVar, i1 i1Var, View view, s0.d dVar) {
        a3.c cVar;
        switch (this.X) {
            case 0:
                super.T(hVar, i1Var, view, dVar);
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.f43969a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                if (collectionItemInfo != null) {
                    cVar = new a3.c(collectionItemInfo);
                } else {
                    cVar = null;
                }
                if (cVar != null) {
                    Object obj = cVar.f45a;
                    if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
                        return;
                    }
                    return;
                }
                return;
            default:
                super.T(hVar, i1Var, view, dVar);
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
                iArr[1] = Math.max(iArr[1], r7.a(1) * 2);
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
