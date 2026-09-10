package ai;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.v7;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.tv0;
import org.telegram.ui.Components.uz;
import s4.z0;
public final class n extends uz {
    public final int X = 0;
    public final Object Y;

    public n() {
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
    public tv0 D1(int i10) {
        switch (this.X) {
            case 0:
                tv0 tv0Var = (tv0) this.Y;
                tv0Var.f27500b = 100.0f;
                tv0Var.f27499a = 100.0f;
                return tv0Var;
            default:
                return super.D1(i10);
        }
    }

    @Override
    public void U(of.e eVar, z0 z0Var, View view, s0.d dVar) {
        n7.b bVar;
        switch (this.X) {
            case 0:
                super.U(eVar, z0Var, view, dVar);
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.f41559a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                if (collectionItemInfo != null) {
                    bVar = new n7.b(collectionItemInfo);
                } else {
                    bVar = null;
                }
                if (bVar != null) {
                    Object obj = bVar.f13940a;
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
                if (((r61) this.Y).f26604a3) {
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

    public n(r61 r61Var, int i10) {
        super(i10, false);
        this.Y = r61Var;
    }
}
