package defpackage;

import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kuc implements rl3, fd {
    public final muc a;

    public kuc(muc mucVar) {
        this.a = mucVar;
    }

    @Override
    public final void a(zh6 zh6Var, ArrayList arrayList) {
        muc mucVar = this.a;
        ArrayList arrayList2 = mucVar.s;
        if (!mucVar.r) {
            arrayList2.clear();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                sl3 sl3Var = (sl3) obj;
                TLObject tLObject = sl3Var.a;
                if ((tLObject instanceof TLRPC.User) && muc.d0((TLRPC.User) tLObject)) {
                    arrayList2.add((TLRPC.User) sl3Var.a);
                }
            }
            wa waVar = mucVar.a;
            if (waVar != null) {
                waVar.g3.O(true);
            }
        }
    }

    @Override
    public final void w(id idVar, int i) {
        muc mucVar = this.a;
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + a.b.getPackageName()));
            mucVar.getParentActivity().startActivity(intent);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }
}
