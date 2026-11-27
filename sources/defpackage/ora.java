package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
public final class ora implements kcc {
    public final byte a;
    public final wua b;

    public ora(wua wuaVar, byte b) {
        this.a = b;
        this.b = wuaVar;
    }

    @Override
    public final void a(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                this.b.v2((View) obj2, (CharSequence) obj, booleanValue);
                return;
            default:
                ArrayList arrayList = (ArrayList) obj;
                icc iccVar = (icc) obj2;
                Runnable runnable = (Runnable) obj3;
                wua wuaVar = this.b;
                ld9 ld9Var = wuaVar.R2;
                if (ld9Var != null) {
                    ld9Var.b();
                    wuaVar.R2 = null;
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
                ConnectionsManager.getInstance(wuaVar.a).sendRequestTyped(craftstargift, new ic((byte) 0), new nu0(wuaVar, iccVar, arrayList, runnable, (byte) 14));
                return;
        }
    }
}
