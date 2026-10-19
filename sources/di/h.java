package di;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.wz;
import s4.y0;
public final class h extends wz {
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
    public ew0 D1(int i10) {
        switch (this.X) {
            case 0:
                ew0 ew0Var = (ew0) this.Y;
                ew0Var.f26041b = 100.0f;
                ew0Var.f26040a = 100.0f;
                return ew0Var;
            default:
                return super.D1(i10);
        }
    }

    @Override
    public void U(qf.e eVar, y0 y0Var, View view, s0.c cVar) {
        n5.c cVar2;
        switch (this.X) {
            case 0:
                super.U(eVar, y0Var, view, cVar);
                AccessibilityNodeInfo accessibilityNodeInfo = cVar.f45867a;
                AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = accessibilityNodeInfo.getCollectionItemInfo();
                if (collectionItemInfo != null) {
                    cVar2 = new n5.c(collectionItemInfo);
                } else {
                    cVar2 = null;
                }
                if (cVar2 != null) {
                    Object obj = cVar2.f17153a;
                    if (((AccessibilityNodeInfo.CollectionItemInfo) obj).isHeading()) {
                        accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) obj).getColumnSpan(), false));
                        return;
                    }
                    return;
                }
                return;
            default:
                super.U(eVar, y0Var, view, cVar);
                return;
        }
    }

    @Override
    public int W0(y0 y0Var) {
        switch (this.X) {
            case 1:
                if (((b71) this.Y).Y2) {
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

    public h(b71 b71Var, int i10) {
        super(i10, false);
        this.Y = b71Var;
    }
}
