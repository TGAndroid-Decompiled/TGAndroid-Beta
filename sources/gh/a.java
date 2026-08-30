package gh;

import android.view.View;
import androidx.biometric.f0;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.qn;
public final class a implements View.OnClickListener {
    public final int f6828a;
    public final f f6829b;

    public a(f fVar, int i10) {
        this.f6828a = i10;
        this.f6829b = fVar;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f6828a;
        f fVar = this.f6829b;
        switch (i10) {
            case 0:
                f0 f0Var = fVar.f6846h0;
                if (f0Var != null) {
                    ArrayList arrayList = new ArrayList(fVar.f6845g0.keySet());
                    qn qnVar = (qn) f0Var.f483b;
                    ArrayList arrayList2 = qnVar.M0;
                    arrayList2.clear();
                    arrayList2.addAll(arrayList);
                    int i11 = qnVar.I0;
                    if (i11 >= 0) {
                        qnVar.f28186r.m(i11);
                    }
                }
                fVar.dismiss();
                return;
            case 1:
                f0 f0Var2 = fVar.f6846h0;
                if (f0Var2 != null) {
                    ArrayList arrayList3 = new ArrayList(fVar.f6845g0.keySet());
                    qn qnVar2 = (qn) f0Var2.f483b;
                    ArrayList arrayList4 = qnVar2.M0;
                    arrayList4.clear();
                    arrayList4.addAll(arrayList3);
                    int i12 = qnVar2.I0;
                    if (i12 >= 0) {
                        qnVar2.f28186r.m(i12);
                    }
                }
                fVar.dismiss();
                return;
            case 2:
                HashMap hashMap = fVar.f6845g0;
                hashMap.clear();
                fVar.f6843e0.b();
                fVar.f6839a0.N(true);
                fVar.f6840b0.c(hashMap.size(), true);
                return;
            case 3:
                fVar.S(view);
                return;
            default:
                int i13 = f.f6838o0;
                fVar.S(view);
                return;
        }
    }
}
