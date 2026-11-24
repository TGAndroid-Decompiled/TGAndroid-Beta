package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class spa implements lac {
    public final byte a;
    public final wsa b;

    public spa(wsa wsaVar, byte b) {
        this.a = b;
        this.b = wsaVar;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                this.b.u2((View) obj2, (CharSequence) obj, booleanValue);
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                jac jacVar = (jac) obj2;
                Runnable runnable = (Runnable) obj3;
                wsa wsaVar = this.b;
                xb9 xb9Var = wsaVar.R2;
                if (xb9Var != null) {
                    xb9Var.b();
                    wsaVar.R2 = null;
                }
                TL_stars.craftStarGift craftstargift = new TL_stars.craftStarGift();
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj4 = arrayList.get(i);
                    i++;
                    TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                    tL_inputSavedStarGiftSlug.slug = ((TL_stars.StarGift) obj4).slug;
                    craftstargift.stargift.add(tL_inputSavedStarGiftSlug);
                }
                ConnectionsManager.getInstance(wsaVar.a).sendRequestTyped(craftstargift, new kc((byte) 0), new nv0(wsaVar, jacVar, arrayList, runnable, (byte) 14));
                return;
        }
    }
}
