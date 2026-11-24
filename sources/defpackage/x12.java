package defpackage;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class x12 implements u78 {
    public boolean a;
    public final HashMap b;
    public final ArrayList c;
    public final i22 d;

    public x12(i22 i22Var, HashMap hashMap, ArrayList arrayList) {
        this.d = i22Var;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final void k(int i, boolean z, boolean z2) {
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
                        no6 no6Var = (no6) obj;
                        String str2 = no6Var.h;
                        if (str2 != null) {
                            obj2.c = str2;
                        } else {
                            obj2.l = no6Var;
                        }
                        obj2.e = no6Var.c;
                        obj2.k = no6Var.s;
                        CharSequence charSequence = no6Var.I;
                        if (charSequence != null) {
                            str = charSequence.toString();
                        } else {
                            str = null;
                        }
                        obj2.d = str;
                        obj2.i = no6Var.n;
                        obj2.j = no6Var.r;
                        obj2.h = no6Var.x;
                        TLRPC.BotInlineResult botInlineResult = no6Var.N;
                        if (botInlineResult != null && no6Var.H) {
                            obj2.m = botInlineResult;
                            obj2.n = no6Var.O;
                        }
                        System.currentTimeMillis();
                        i2++;
                    } else {
                        ((yv1) this.d.Z1).v6(i, arrayList, z2);
                        return;
                    }
                }
            }
        }
    }

    @Override
    public final void e() {
    }

    @Override
    public final void i(Editable editable) {
    }

    @Override
    public final void j() {
    }
}
