package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
public final class h42 extends q59 {
    public final byte c;
    public final Context d;
    public ArrayList e;
    public final ArrayList f;
    public Object h;
    public final Object n;

    public h42(az2 az2Var, Context context, HashMap hashMap) {
        this.c = (byte) 1;
        this.n = az2Var;
        this.f = new ArrayList();
        this.d = context;
        for (List<wy2> list : hashMap.values()) {
            for (wy2 wy2Var : list) {
                this.f.add(wy2Var);
            }
        }
    }

    @Override
    public final boolean D(u69 u69Var) {
        switch (this.c) {
            case 0:
                if (u69Var.f == 1) {
                    return true;
                }
                return false;
            default:
                return true;
        }
    }

    public final i42 E(int i) {
        int k;
        ArrayList arrayList = (ArrayList) this.h;
        ArrayList arrayList2 = this.e;
        int size = arrayList2.size();
        if (i < size) {
            return (i42) arrayList2.get(i);
        }
        if (this.f.isEmpty() && !arrayList.isEmpty() && i != size && i != size + 1 && (k = ts2.k(2, i, arrayList2)) < arrayList.size()) {
            return (i42) arrayList.get(k);
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
                ((p42) this.n).Y();
                return;
            default:
                super.f();
                return;
        }
    }

    @Override
    public final void t(u69 u69Var, int i) {
        boolean z;
        byte b = this.c;
        Object obj = this.n;
        String str = null;
        switch (b) {
            case 0:
                p42 p42Var = (p42) obj;
                int i2 = u69Var.f;
                View view = u69Var.a;
                if (i2 != 0) {
                    if (i2 == 1) {
                        i42 E = E(i);
                        ida idaVar = (ida) view;
                        int i3 = E.a;
                        if (i3 != 0) {
                            String str2 = E.b;
                            String str3 = E.c;
                            if (i != this.e.size() - 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            idaVar.d(str2, str3, null, null, i3, z);
                        } else {
                            idaVar.d(E.b, E.c, E.d.toUpperCase().substring(0, Math.min(E.d.length(), 4)), E.e, 0, false);
                        }
                        File file = E.f;
                        if (file != null) {
                            idaVar.b(p42Var.S.containsKey(file.toString()), !p42Var.V);
                            return;
                        } else {
                            idaVar.b(false, !p42Var.V);
                            return;
                        }
                    }
                    return;
                }
                jf5 jf5Var = (jf5) view;
                if (p42Var.d0) {
                    jf5Var.setText(jb6.M0(2131746100, null));
                    return;
                } else {
                    jf5Var.setText(jb6.M0(2131746101, null));
                    return;
                }
            default:
                wy2 wy2Var = (wy2) this.e.get(i);
                vkb vkbVar = (vkb) u69Var.a;
                CharSequence m = gw3.m(az2.a0(wy2Var), vkbVar.getTextView().getPaint().getFontMetricsInt(), false, null, 0);
                if (((az2) obj).h) {
                    str = "+" + wy2Var.c;
                }
                vkbVar.c(m, str, false, false);
                return;
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View jf5Var;
        byte b = this.c;
        Context context = this.d;
        switch (b) {
            case 0:
                ylb ylbVar = ((p42) this.n).a;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            jf5Var = new View(context);
                            jf5Var.setTag(-33024);
                        } else {
                            jf5Var = new bba(context, (hg9) null);
                        }
                    } else {
                        jf5Var = new ida(1, ylbVar, context);
                    }
                } else {
                    jf5Var = new jf5(context, ylbVar);
                }
                return new u69(jf5Var);
            default:
                return new u69(az2.Z(context));
        }
    }

    public h42(p42 p42Var, Context context) {
        this.c = (byte) 0;
        this.n = p42Var;
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.h = new ArrayList();
        this.d = context;
    }
}
