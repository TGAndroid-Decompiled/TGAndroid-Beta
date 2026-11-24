package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class sna implements k8c {
    public final byte a;
    public final vqa b;

    public sna(vqa vqaVar, byte b) {
        this.a = b;
        this.b = vqaVar;
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
                i8c i8cVar = (i8c) obj2;
                Runnable runnable = (Runnable) obj3;
                vqa vqaVar = this.b;
                x99 x99Var = vqaVar.R2;
                if (x99Var != null) {
                    x99Var.b();
                    vqaVar.R2 = null;
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
                ConnectionsManager.getInstance(vqaVar.a).sendRequestTyped(craftstargift, new hc((byte) 0), new eu0(vqaVar, i8cVar, arrayList, runnable, (byte) 14));
                return;
        }
    }
}
