package defpackage;

import android.text.Editable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
public final class m02 implements s58 {
    public boolean a;
    public final HashMap b;
    public final ArrayList c;
    public final x02 d;

    public m02(x02 x02Var, HashMap hashMap, ArrayList arrayList) {
        this.d = x02Var;
        this.b = hashMap;
        this.c = arrayList;
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final void l(int i, boolean z, boolean z2) {
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
                        nm6 nm6Var = (nm6) obj;
                        String str2 = nm6Var.h;
                        if (str2 != null) {
                            obj2.c = str2;
                        } else {
                            obj2.l = nm6Var;
                        }
                        obj2.e = nm6Var.c;
                        obj2.k = nm6Var.s;
                        CharSequence charSequence = nm6Var.I;
                        if (charSequence != null) {
                            str = charSequence.toString();
                        } else {
                            str = null;
                        }
                        obj2.d = str;
                        obj2.i = nm6Var.n;
                        obj2.j = nm6Var.r;
                        obj2.h = nm6Var.x;
                        TLRPC.BotInlineResult botInlineResult = nm6Var.N;
                        if (botInlineResult != null && nm6Var.H) {
                            obj2.m = botInlineResult;
                            obj2.n = nm6Var.O;
                        }
                        System.currentTimeMillis();
                        i2++;
                    } else {
                        ((mu1) this.d.Z1).o6(i, arrayList, z2);
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
    public final void k() {
    }

    @Override
    public final void j(Editable editable) {
    }
}
