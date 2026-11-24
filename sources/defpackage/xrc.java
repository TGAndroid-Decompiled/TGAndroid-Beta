package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xrc implements km3, ee {
    public final asc a;

    public xrc(asc ascVar) {
        this.a = ascVar;
    }

    @Override
    public final void a(vh6 vh6Var, ArrayList arrayList) {
        asc ascVar = this.a;
        ArrayList arrayList2 = ascVar.s;
        if (!ascVar.r) {
            arrayList2.clear();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                lm3 lm3Var = (lm3) obj;
                TLObject tLObject = lm3Var.a;
                if ((tLObject instanceof TLRPC.User) && asc.e0((TLRPC.User) tLObject)) {
                    arrayList2.add((TLRPC.User) lm3Var.a);
                }
            }
            va vaVar = ascVar.a;
            if (vaVar != null) {
                vaVar.g3.O(true);
            }
        }
    }

    @Override
    public final void r(he heVar, int i) {
        asc ascVar = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + a.b.getPackageName()));
            ascVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
