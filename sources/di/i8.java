package di;

import java.util.ArrayList;
import org.telegram.messenger.ns;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
public final class i8 implements RequestDelegate {
    public final int f8809a;
    public final k8 f8810b;

    public i8(k8 k8Var, int i7) {
        this.f8809a = i7;
        this.f8810b = k8Var;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8809a) {
            case 0:
                final k8 k8Var = this.f8810b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        k8 k8Var2 = k8Var;
                        switch (i7) {
                            case 0:
                                long j3 = k8Var2.f8921b;
                                int i10 = k8Var2.f8920a;
                                ArrayList arrayList = k8Var2.f8923e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    k8Var2.j();
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList.get(i11);
                                        i11++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (k8Var2.e(tL_starGiftCollection.collection_id) == null) {
                                            m8 m8Var = new m8(i10, j3, false);
                                            int i12 = tL_starGiftCollection.collection_id;
                                            m8Var.f9044c = true;
                                            m8Var.d = i12;
                                            k8Var2.h.put(Integer.valueOf(i12), m8Var);
                                        }
                                    }
                                    k8Var2.d = true;
                                    k8Var2.f8922c = false;
                                    ns.f(i10).k(231, Long.valueOf(j3), k8Var2);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    k8Var2.j();
                                    k8Var2.d = true;
                                    k8Var2.f8922c = false;
                                    ns.f(i10).k(231, Long.valueOf(j3), k8Var2);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                k8Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = k8Var2.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        k8Var2.f8923e.set(f10, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                k8Var2.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = k8Var2.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        k8Var2.f8923e.set(f11, tL_starGiftCollection3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                final k8 k8Var2 = this.f8810b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        k8 k8Var22 = k8Var2;
                        switch (i7) {
                            case 0:
                                long j3 = k8Var22.f8921b;
                                int i10 = k8Var22.f8920a;
                                ArrayList arrayList = k8Var22.f8923e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    k8Var22.j();
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList.get(i11);
                                        i11++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (k8Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            m8 m8Var = new m8(i10, j3, false);
                                            int i12 = tL_starGiftCollection.collection_id;
                                            m8Var.f9044c = true;
                                            m8Var.d = i12;
                                            k8Var22.h.put(Integer.valueOf(i12), m8Var);
                                        }
                                    }
                                    k8Var22.d = true;
                                    k8Var22.f8922c = false;
                                    ns.f(i10).k(231, Long.valueOf(j3), k8Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    k8Var22.j();
                                    k8Var22.d = true;
                                    k8Var22.f8922c = false;
                                    ns.f(i10).k(231, Long.valueOf(j3), k8Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                k8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = k8Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        k8Var22.f8923e.set(f10, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                k8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = k8Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        k8Var22.f8923e.set(f11, tL_starGiftCollection3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            default:
                final k8 k8Var3 = this.f8810b;
                k8Var3.getClass();
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7 = r3;
                        TLObject tLObject2 = tLObject;
                        k8 k8Var22 = k8Var3;
                        switch (i7) {
                            case 0:
                                long j3 = k8Var22.f8921b;
                                int i10 = k8Var22.f8920a;
                                ArrayList arrayList = k8Var22.f8923e;
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollections) {
                                    arrayList.clear();
                                    arrayList.addAll(((TL_stars.TL_starGiftCollections) tLObject2).collections);
                                    k8Var22.j();
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    while (i11 < size) {
                                        Object obj = arrayList.get(i11);
                                        i11++;
                                        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                                        if (k8Var22.e(tL_starGiftCollection.collection_id) == null) {
                                            m8 m8Var = new m8(i10, j3, false);
                                            int i12 = tL_starGiftCollection.collection_id;
                                            m8Var.f9044c = true;
                                            m8Var.d = i12;
                                            k8Var22.h.put(Integer.valueOf(i12), m8Var);
                                        }
                                    }
                                    k8Var22.d = true;
                                    k8Var22.f8922c = false;
                                    ns.f(i10).k(231, Long.valueOf(j3), k8Var22);
                                    return;
                                } else if (tLObject2 instanceof TL_stars.TL_starGiftCollectionsNotModified) {
                                    k8Var22.j();
                                    k8Var22.d = true;
                                    k8Var22.f8922c = false;
                                    ns.f(i10).k(231, Long.valueOf(j3), k8Var22);
                                    return;
                                } else {
                                    return;
                                }
                            case 1:
                                k8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f10 = k8Var22.f(tL_starGiftCollection2.collection_id);
                                    if (f10 >= 0) {
                                        k8Var22.f8923e.set(f10, tL_starGiftCollection2);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                k8Var22.getClass();
                                if (tLObject2 instanceof TL_stars.TL_starGiftCollection) {
                                    TL_stars.TL_starGiftCollection tL_starGiftCollection3 = (TL_stars.TL_starGiftCollection) tLObject2;
                                    int f11 = k8Var22.f(tL_starGiftCollection3.collection_id);
                                    if (f11 >= 0) {
                                        k8Var22.f8923e.set(f11, tL_starGiftCollection3);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
        }
    }
}
