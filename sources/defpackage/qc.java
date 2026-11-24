package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
public final class qc extends Handler {
    public final byte a = 0;
    public WeakReference b;

    public qc(m59 m59Var) {
        this.b = new WeakReference(m59Var);
    }

    @Override
    public final void handleMessage(Message message) {
        zs6 zs6Var;
        zs6 zs6Var2;
        tt6 tt6Var;
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
                m59 m59Var = (m59) this.b.get();
                if (m59Var != null) {
                    SparseArray sparseArray = m59Var.n;
                    s59 s59Var = m59Var.r;
                    ArrayList arrayList = s59Var.w;
                    int i2 = message.what;
                    int i3 = message.arg1;
                    int i4 = message.arg2;
                    Object obj = message.obj;
                    Bundle peekData = message.peekData();
                    int i5 = 0;
                    String str = null;
                    n59 n59Var = null;
                    n59 n59Var2 = null;
                    switch (i2) {
                        case 0:
                            if (i3 == m59Var.h) {
                                m59Var.h = 0;
                                if (s59Var.E == m59Var) {
                                    s59Var.q();
                                }
                            }
                            if (((p59) sparseArray.get(i3)) != null) {
                                sparseArray.remove(i3);
                                p59.a(null, null);
                                return;
                            }
                            return;
                        case 1:
                            return;
                        case 2:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle = (Bundle) obj;
                                if (m59Var.f == 0 && i3 == m59Var.h && i4 >= 1) {
                                    m59Var.h = 0;
                                    m59Var.f = i4;
                                    am4 a = am4.a(bundle);
                                    if (s59Var.E == m59Var) {
                                        s59Var.g(a);
                                    }
                                    if (s59Var.E == m59Var) {
                                        s59Var.F = true;
                                        int size = arrayList.size();
                                        while (i5 < size) {
                                            ((n59) arrayList.get(i5)).b(s59Var.E);
                                            i5++;
                                        }
                                        bt6 bt6Var = (bt6) s59Var.h;
                                        if (bt6Var != null) {
                                            m59 m59Var2 = s59Var.E;
                                            int i6 = m59Var2.d;
                                            m59Var2.d = i6 + 1;
                                            m59Var2.b(10, i6, 0, bt6Var.a, null);
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
                                p59 p59Var = (p59) sparseArray.get(i3);
                                if (p59Var != null) {
                                    sparseArray.remove(i3);
                                    p59Var.b(bundle2);
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
                                if (((p59) sparseArray.get(i3)) != null) {
                                    sparseArray.remove(i3);
                                    p59.a(str, bundle3);
                                    return;
                                }
                            }
                            break;
                        case 5:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle4 = (Bundle) obj;
                                if (m59Var.f != 0) {
                                    am4 a2 = am4.a(bundle4);
                                    if (s59Var.E == m59Var) {
                                        s59Var.g(a2);
                                        return;
                                    }
                                    return;
                                }
                            }
                            break;
                        case 6:
                            if (obj instanceof Bundle) {
                                Bundle bundle5 = (Bundle) obj;
                                p59 p59Var2 = (p59) sparseArray.get(i3);
                                if (bundle5.containsKey("routeId")) {
                                    sparseArray.remove(i3);
                                    p59Var2.b(bundle5);
                                    break;
                                } else {
                                    p59Var2.getClass();
                                    p59.a("DynamicGroupRouteController is created without valid route id.", bundle5);
                                    break;
                                }
                            } else {
                                Log.w("MediaRouteProviderProxy", "No further information on the dynamic group controller");
                                break;
                            }
                        case 7:
                            if (obj == null || (obj instanceof Bundle)) {
                                Bundle bundle6 = (Bundle) obj;
                                if (m59Var.f != 0) {
                                    Bundle bundle7 = (Bundle) bundle6.getParcelable("groupRoute");
                                    if (bundle7 != null) {
                                        zs6Var = new zs6(bundle7);
                                    } else {
                                        zs6Var = null;
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
                                            tt6Var = null;
                                        } else {
                                            Bundle bundle9 = bundle8.getBundle("mrDescriptor");
                                            if (bundle9 != null) {
                                                zs6Var2 = new zs6(bundle9);
                                            } else {
                                                zs6Var2 = null;
                                            }
                                            tt6Var = new tt6(zs6Var2, bundle8.getInt("selectionState", 1), bundle8.getBoolean("isUnselectable", false), bundle8.getBoolean("isGroupable", false), bundle8.getBoolean("isTransferable", false));
                                        }
                                        arrayList2.add(tt6Var);
                                    }
                                    if (s59Var.E == m59Var) {
                                        int size3 = arrayList.size();
                                        while (true) {
                                            if (i5 < size3) {
                                                Object obj3 = arrayList.get(i5);
                                                i5++;
                                                n59 n59Var3 = (n59) obj3;
                                                if (n59Var3.a() == i4) {
                                                    n59Var2 = n59Var3;
                                                }
                                            }
                                        }
                                        if (n59Var2 instanceof q59) {
                                            ((q59) n59Var2).l(zs6Var, arrayList2);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                            break;
                        case 8:
                            if (s59Var.E == m59Var) {
                                int size4 = arrayList.size();
                                while (true) {
                                    if (i5 < size4) {
                                        Object obj4 = arrayList.get(i5);
                                        i5++;
                                        n59 n59Var4 = (n59) obj4;
                                        if (n59Var4.a() == i4) {
                                            n59Var = n59Var4;
                                        }
                                    }
                                }
                                k88 k88Var = s59Var.G;
                                if (k88Var != null && (n59Var instanceof vt6)) {
                                    vt6 vt6Var = (vt6) n59Var;
                                    ux4 ux4Var = (ux4) ((ee3) k88Var.b).c;
                                    if (ux4Var.e == vt6Var) {
                                        ux4Var.i(ux4Var.c(), 2);
                                    }
                                }
                                arrayList.remove(n59Var);
                                n59Var.c();
                                s59Var.r();
                                break;
                            }
                            break;
                    }
                    int i8 = s59.H;
                    return;
                }
                return;
        }
    }

    public qc() {
    }
}
