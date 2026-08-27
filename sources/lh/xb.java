package lh;

import android.graphics.RectF;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;

public final class xb {

    public int f17056a;

    public boolean f17057b;

    public ac f17058c;
    public String d;

    public long f17059e;

    public long f17060f;

    public float f17061g;
    public float h;

    public float f17062i;

    public final RectF f17063j = new RectF();

    public final org.telegram.ui.Components.y5 f17064k;

    public final cc f17065l;

    public xb(cc ccVar) {
        this.f17065l = ccVar;
        this.f17064k = new org.telegram.ui.Components.y5(ccVar, 360L, er.h);
    }

    public static void a(xb xbVar, boolean z10) {
        cc ccVar = xbVar.f17065l;
        if (ccVar.getMeasuredWidth() > 0) {
            ac acVar = xbVar.f17058c;
            if (acVar == null || z10) {
                if (acVar != null) {
                    acVar.b();
                    xbVar.f17058c = null;
                }
                cc ccVar2 = xbVar.f17065l;
                boolean z11 = xbVar.f17057b;
                String str = xbVar.d;
                int i10 = ccVar2.f15804r1;
                int i11 = ccVar2.f15811u1;
                int i12 = (i10 - i11) - i11;
                int iDp = AndroidUtilities.dp(38.0f);
                long j10 = xbVar.f17059e;
                xbVar.f17058c = new ac(ccVar2, z11, str, i12, iDp, j10 > 2 ? Long.valueOf(j10) : null, ccVar.getMaxScrollDuration(), ccVar.V0, ccVar.W0, new kh.c(xbVar, 26));
            }
        }
    }

    public static void b(xb xbVar) {
        cc ccVar = xbVar.f17065l;
        int i10 = xbVar.f17056a;
        if (i10 >= 0) {
            ArrayList arrayList = ccVar.f15802r;
            if (i10 >= arrayList.size()) {
                return;
            }
            vb vbVar = (vb) arrayList.get(xbVar.f17056a);
            if (ccVar.getMeasuredWidth() <= 0 || vbVar != null) {
                return;
            }
            if (vbVar != null) {
                vbVar.a();
            }
            arrayList.set(xbVar.f17056a, new vb(ccVar, xbVar.d, (ccVar.getMeasuredWidth() - ccVar.getPaddingLeft()) - ccVar.getPaddingRight()));
        }
    }
}
