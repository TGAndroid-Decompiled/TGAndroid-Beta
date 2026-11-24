package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
public final class qd extends Handler {
    public final byte a = 0;
    public WeakReference b;

    public qd(o79 o79Var) {
        this.b = new WeakReference(o79Var);
    }

    @Override
    public final void handleMessage(Message message) {
        zu6 zu6Var;
        zu6 zu6Var2;
        tv6 tv6Var;
        switch (this.a) {
            case 0:
                int i = message.what;
                if (i != -3 && i != -2 && i != -1) {
                    if (i == 1) {
                        ((DialogInterface) message.obj).dismiss();
                        return;
                    }
                    return;
                }
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.b.get(), message.what);
                return;
            default:
                o79 o79Var = (o79) this.b.get();
                if (o79Var != null) {
                    SparseArray sparseArray = o79Var.n;
                    u79 u79Var = o79Var.r;
                    ArrayList arrayList = u79Var.w;
                    int i2 = message.what;
                    int i3 = message.arg1;
                    int i4 = message.arg2;
                    Object obj = message.obj;
                    Bundle peekData = message.peekData();
                    int i5 = 0;
                    String str = null;
                    p79 p79Var = null;
                    p79 p79Var2 = null;
                    switch (i2) {
                        case 0:
                            if (i3 == o79Var.h) {
                                o79Var.h = 0;
                                if (u79Var.E == o79Var) {
                                    u79Var.q();
                                }
                            }
                            if (((r79) sparseArray.get(i3)) != null) {
                                sparseArray.remove(i3);
                                r79.a(null, null);
                                return;
                            }
                            return;
                        case 1:
                            return;
                        case 2:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle = (Bundle) obj;
                                if (o79Var.f == 0 && i3 == o79Var.h && i4 >= 1) {
                                    o79Var.h = 0;
                                    o79Var.f = i4;
                                    bo4 a = bo4.a(bundle);
                                    if (u79Var.E == o79Var) {
                                        u79Var.g(a);
                                    }
                                    if (u79Var.E == o79Var) {
                                        u79Var.F = true;
                                        int size = arrayList.size();
                                        while (i5 < size) {
                                            ((p79) arrayList.get(i5)).b(u79Var.E);
                                            i5++;
                                        }
                                        bv6 bv6Var = (bv6) u79Var.h;
                                        if (bv6Var != null) {
                                            o79 o79Var2 = u79Var.E;
                                            int i6 = o79Var2.d;
                                            o79Var2.d = i6 + 1;
                                            o79Var2.b(10, i6, 0, bv6Var.a, null);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                            break;
                        case 3:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle2 = (Bundle) obj;
                                r79 r79Var = (r79) sparseArray.get(i3);
                                if (r79Var != null) {
                                    sparseArray.remove(i3);
                                    r79Var.b(bundle2);
                                    return;
                                }
                            }
                            break;
                        case 4:
                            if (obj == null || (obj instanceof Bundle)) {
                                if (peekData != null) {
                                    str = peekData.getString("error");
                                }
                                Bundle bundle3 = (Bundle) obj;
                                if (((r79) sparseArray.get(i3)) != null) {
                                    sparseArray.remove(i3);
                                    r79.a(str, bundle3);
                                    return;
                                }
                            }
                            break;
                        case 5:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle4 = (Bundle) obj;
                                if (o79Var.f != 0) {
                                    bo4 a2 = bo4.a(bundle4);
                                    if (u79Var.E == o79Var) {
                                        u79Var.g(a2);
                                        return;
                                    }
                                    return;
                                }
                            }
                            break;
                        case 6:
                            if (obj instanceof Bundle) {
                                Bundle bundle5 = (Bundle) obj;
                                r79 r79Var2 = (r79) sparseArray.get(i3);
                                if (bundle5.containsKey("routeId")) {
                                    sparseArray.remove(i3);
                                    r79Var2.b(bundle5);
                                    break;
                                } else {
                                    r79Var2.getClass();
                                    r79.a("DynamicGroupRouteController is created without valid route id.", bundle5);
                                    break;
                                }
                            } else {
                                Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                                break;
                            }
                        case 7:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle6 = (Bundle) obj;
                                if (o79Var.f != 0) {
                                    Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                                    if (bundle7 != null) {
                                        zu6Var = new zu6(bundle7);
                                    } else {
                                        zu6Var = null;
                                    }
                                    ArrayList parcelableArrayList = bundle6.getParcelableArrayList("dynamicRoutes");
                                    ArrayList arrayList2 = new ArrayList();
                                    int size2 = parcelableArrayList.size();
                                    int i7 = 0;
                                    while (i7 < size2) {
                                        Object obj2 = parcelableArrayList.get(i7);
                                        i7++;
                                        Bundle bundle8 = (Bundle) obj2;
                                        if (bundle8 == null) {
                                            tv6Var = null;
                                        } else {
                                            Bundle bundle9 = bundle8.getBundle("mrDescriptor");
                                            if (bundle9 != null) {
                                                zu6Var2 = new zu6(bundle9);
                                            } else {
                                                zu6Var2 = null;
                                            }
                                            tv6Var = new tv6(zu6Var2, bundle8.getInt("selectionState", 1), bundle8.getBoolean("isUnselectable", false), bundle8.getBoolean("isGroupable", false), bundle8.getBoolean("isTransferable", false));
                                        }
                                        arrayList2.add(tv6Var);
                                    }
                                    if (u79Var.E == o79Var) {
                                        int size3 = arrayList.size();
                                        while (true) {
                                            if (i5 < size3) {
                                                Object obj3 = arrayList.get(i5);
                                                i5++;
                                                p79 p79Var3 = (p79) obj3;
                                                if (p79Var3.a() == i4) {
                                                    p79Var2 = p79Var3;
                                                }
                                            }
                                        }
                                        if (p79Var2 instanceof s79) {
                                            ((s79) p79Var2).l(zu6Var, arrayList2);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                            break;
                        case 8:
                            if (u79Var.E == o79Var) {
                                int size4 = arrayList.size();
                                while (true) {
                                    if (i5 < size4) {
                                        Object obj4 = arrayList.get(i5);
                                        i5++;
                                        p79 p79Var4 = (p79) obj4;
                                        if (p79Var4.a() == i4) {
                                            p79Var = p79Var4;
                                        }
                                    }
                                }
                                h68 h68Var = u79Var.G;
                                if (h68Var != null && (p79Var instanceof vv6)) {
                                    vv6 vv6Var = (vv6) p79Var;
                                    wz4 wz4Var = (wz4) ((pf3) h68Var.b).c;
                                    if (wz4Var.e == vv6Var) {
                                        wz4Var.i(wz4Var.c(), 2);
                                    }
                                }
                                arrayList.remove(p79Var);
                                p79Var.c();
                                u79Var.r();
                                break;
                            }
                            break;
                    }
                    int i8 = u79.H;
                    return;
                }
                return;
        }
    }

    public qd() {
    }
}
