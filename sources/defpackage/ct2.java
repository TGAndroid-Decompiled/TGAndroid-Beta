package defpackage;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class ct2 implements Runnable {
    public final byte a = 1;
    public final byte b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public ct2(it2 it2Var, TLRPC.FileLocation fileLocation, TLRPC.InputFile inputFile, TLObject tLObject, TLRPC.FileLocation fileLocation2, int i) {
        this.c = it2Var;
        this.d = fileLocation;
        this.f = inputFile;
        this.h = tLObject;
        this.e = fileLocation2;
        this.b = i;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (b) {
            case 0:
                ((it2) obj5).f0((TLRPC.FileLocation) obj4, (TLRPC.InputFile) obj2, (TLObject) obj, (TLRPC.FileLocation) obj3, this.b);
                return;
            default:
                hq6 hq6Var = (hq6) obj5;
                boolean[] zArr = (boolean[]) obj4;
                ArrayList arrayList = (ArrayList) obj3;
                Context context = (Context) obj2;
                d dVar = (d) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    for (int i = 0; i < arrayList.size(); i++) {
                        hq6Var.j2(context, 0, dVar, null, true, (TLObject) arrayList.get(i), ((TLRPC.TL_messages_stickerSet) arrayList.get(i)).set, null, this.b, false);
                    }
                    return;
                }
                return;
        }
    }

    public ct2(hq6 hq6Var, boolean[] zArr, ArrayList arrayList, Context context, d dVar, int i) {
        this.c = hq6Var;
        this.d = zArr;
        this.e = arrayList;
        this.f = context;
        this.h = dVar;
        this.b = i;
    }
}
