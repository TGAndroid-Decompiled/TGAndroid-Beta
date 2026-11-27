package defpackage;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class c12 implements j98 {
    public boolean a;
    public final HashMap b;
    public final ArrayList c;
    public final n12 d;

    public c12(n12 n12Var, HashMap hashMap, ArrayList arrayList) {
        this.d = n12Var;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override
    public final void C(int i, boolean z, boolean z2) {
        String str;
        if (!z) {
            HashMap hashMap = this.b;
            if (!hashMap.isEmpty() && !this.a) {
                this.a = true;
                ArrayList arrayList = new ArrayList();
                int i2 = 0;
                while (true) {
                    ArrayList arrayList2 = this.c;
                    if (i2 < arrayList2.size()) {
                        Object obj = hashMap.get(arrayList2.get(i2));
                        ?? obj2 = new Object();
                        arrayList.add(obj2);
                        ro6 ro6Var = (ro6) obj;
                        String str2 = ro6Var.h;
                        if (str2 != null) {
                            obj2.c = str2;
                        } else {
                            obj2.l = ro6Var;
                        }
                        obj2.e = ro6Var.c;
                        obj2.k = ro6Var.s;
                        CharSequence charSequence = ro6Var.I;
                        if (charSequence != null) {
                            str = charSequence.toString();
                        } else {
                            str = null;
                        }
                        obj2.d = str;
                        obj2.i = ro6Var.n;
                        obj2.j = ro6Var.r;
                        obj2.h = ro6Var.x;
                        TLRPC.BotInlineResult botInlineResult = ro6Var.N;
                        if (botInlineResult != null && ro6Var.H) {
                            obj2.m = botInlineResult;
                            obj2.n = ro6Var.O;
                        }
                        System.currentTimeMillis();
                        i2++;
                    } else {
                        ((zu1) this.d.Z1).v6(i, arrayList, z2);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final void h() {
    }

    @Override
    public final void y() {
    }

    @Override
    public final void l(Editable editable) {
    }
}
