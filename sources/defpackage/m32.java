package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public final class m32 extends c79 {
    public final byte c;
    public final Context d;
    public ArrayList e;
    public final ArrayList f;
    public Object h;
    public final Object n;

    public m32(ky2 ky2Var, Context context, HashMap hashMap) {
        this.c = (byte) 1;
        this.n = ky2Var;
        this.f = new ArrayList();
        this.d = context;
        for (List<gy2> list : hashMap.values()) {
            for (gy2 gy2Var : list) {
                this.f.add(gy2Var);
            }
        }
    }

    @Override
    public final boolean D(f89 f89Var) {
        switch (this.c) {
            case 0:
                if (f89Var.f == 1) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    public final n32 E(int i) {
        int k;
        ArrayList arrayList = (ArrayList) this.h;
        ArrayList arrayList2 = this.e;
        int size = arrayList2.size();
        if (i < size) {
            return (n32) arrayList2.get(i);
        }
        if (this.f.isEmpty() && !arrayList.isEmpty() && i != size && i != size + 1 && (k = bs2.k(2, i, arrayList2)) < arrayList.size()) {
            return (n32) arrayList.get(k);
        }
        return null;
    }

    @Override
    public final int b() {
        switch (this.c) {
            case 0:
                ArrayList arrayList = (ArrayList) this.h;
                int size = this.e.size();
                if (this.f.isEmpty() && !arrayList.isEmpty()) {
                    size += arrayList.size() + 2;
                }
                return size + 1;
            default:
                ArrayList arrayList2 = this.e;
                if (arrayList2 == null) {
                    return 0;
                }
                return arrayList2.size();
        }
    }

    @Override
    public final int d(int i) {
        switch (this.c) {
            case 0:
                if (i == b() - 1) {
                    return 3;
                }
                int size = this.e.size();
                if (i == size) {
                    return 2;
                }
                if (i == size + 1) {
                    return 0;
                }
                return 1;
            default:
                return 0;
        }
    }

    @Override
    public final void f() {
        switch (this.c) {
            case 0:
                super.f();
                ((u32) this.n).X();
                return;
            default:
                super.f();
                return;
        }
    }

    @Override
    public final void t(f89 f89Var, int i) {
        boolean z;
        byte b = this.c;
        Object obj = this.n;
        String str = null;
        switch (b) {
            case 0:
                u32 u32Var = (u32) obj;
                int i2 = f89Var.f;
                View view = f89Var.a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        n32 E = E(i);
                        zea zeaVar = (zea) view;
                        int i3 = E.a;
                        if (i3 != 0) {
                            String str2 = E.b;
                            String str3 = E.c;
                            if (i != this.e.size() - 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            zeaVar.d(str2, str3, null, null, i3, z);
                        } else {
                            zeaVar.d(E.b, E.c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.e, 0, false);
                        }
                        File file = E.f;
                        if (file != null) {
                            zeaVar.b(u32Var.S.containsKey(file.toString()), !u32Var.V);
                            return;
                        } else {
                            zeaVar.b(false, !u32Var.V);
                            return;
                        }
                    }
                    return;
                }
                mf5 mf5Var = (mf5) view;
                if (u32Var.d0) {
                    mf5Var.setText(ob6.M0(2131746094, null));
                    return;
                } else {
                    mf5Var.setText(ob6.M0(2131746095, null));
                    return;
                }
            default:
                gy2 gy2Var = (gy2) this.e.get(i);
                qmb qmbVar = (qmb) f89Var.a;
                CharSequence m = pv3.m(ky2.Z(gy2Var), qmbVar.getTextView().getPaint().getFontMetricsInt(), false, null, 0);
                if (((ky2) obj).h) {
                    str = "+" + gy2Var.c;
                }
                qmbVar.c(m, str, false, false);
                return;
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View mf5Var;
        byte b = this.c;
        Context context = this.d;
        switch (b) {
            case 0:
                vnb vnbVar = ((u32) this.n).a;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            mf5Var = new View(context);
                            mf5Var.setTag(-33024);
                        } else {
                            mf5Var = new rca(context, (uh9) null);
                        }
                    } else {
                        mf5Var = new zea(1, vnbVar, context);
                    }
                } else {
                    mf5Var = new mf5(context, vnbVar);
                }
                return new f89(mf5Var);
            default:
                return new f89(ky2.Y(context));
        }
    }

    public m32(u32 u32Var, Context context) {
        this.c = (byte) 0;
        this.n = u32Var;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.d = context;
    }
}
